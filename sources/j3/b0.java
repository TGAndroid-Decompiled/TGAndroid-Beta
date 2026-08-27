package j3;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer;
import h3.x1;
import hh.m5;

public abstract class b0 extends h3.e implements d5.o {
    private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "DecoderAudioRenderer";
    private boolean allowFirstBufferPositionDiscontinuity;
    private boolean allowPositionDiscontinuity;
    private final t audioSink;
    private boolean audioTrackNeedsConfigure;
    private long currentPositionUs;
    private k3.e decoder;
    private k3.f decoderCounters;
    private l3.f decoderDrmSession;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private int encoderDelay;
    private int encoderPadding;
    private final n eventDispatcher;
    private boolean experimentalKeepAudioTrackOnSeek;
    private boolean firstStreamSampleRead;
    private final k3.i flagsOnlyBuffer;
    private k3.i inputBuffer;
    private h3.t0 inputFormat;
    private boolean inputStreamEnded;
    private SimpleDecoderOutputBuffer outputBuffer;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private int pendingOutputStreamOffsetCount;
    private final long[] pendingOutputStreamOffsetsUs;
    private l3.f sourceDrmSession;

    public b0(Handler handler, o oVar, t tVar) {
        super(1);
        this.eventDispatcher = new n(handler, oVar);
        this.audioSink = tVar;
        ((j0) tVar).f12372r = new ae.b((FfmpegAudioRenderer) this, 20);
        this.flagsOnlyBuffer = new k3.i(0, 0);
        this.decoderReinitializationState = 0;
        this.audioTrackNeedsConfigure = true;
        f(-9223372036854775807L);
        this.pendingOutputStreamOffsetsUs = new long[10];
    }

    public final boolean a() throws h3.n {
        t tVar;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer;
        if (this.outputBuffer == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = (SimpleDecoderOutputBuffer) this.decoder.dequeueOutputBuffer();
            this.outputBuffer = simpleDecoderOutputBuffer2;
            if (simpleDecoderOutputBuffer2 != null) {
                int i10 = simpleDecoderOutputBuffer2.skippedOutputBufferCount;
                if (i10 > 0) {
                    this.decoderCounters.f14422f += i10;
                    ((j0) this.audioSink).G = true;
                }
                if (simpleDecoderOutputBuffer2.isFirstSample()) {
                    ((j0) this.audioSink).G = true;
                    if (this.pendingOutputStreamOffsetCount != 0) {
                        f(this.pendingOutputStreamOffsetsUs[0]);
                        int i11 = this.pendingOutputStreamOffsetCount - 1;
                        this.pendingOutputStreamOffsetCount = i11;
                        long[] jArr = this.pendingOutputStreamOffsetsUs;
                        System.arraycopy(jArr, 1, jArr, 0, i11);
                    }
                }
                if (this.outputBuffer.isEndOfStream()) {
                    if (this.decoderReinitializationState == 2) {
                        e();
                        c();
                        this.audioTrackNeedsConfigure = true;
                        return false;
                    }
                    this.outputBuffer.release();
                    this.outputBuffer = null;
                    try {
                        this.outputStreamEnded = true;
                        ((j0) this.audioSink).t();
                        return false;
                    } catch (s e9) {
                        throw createRendererException(e9, e9.f12436c, e9.f12435b, 5002);
                    }
                }
                if (this.audioTrackNeedsConfigure) {
                    h3.s0 s0VarA = getOutputFormat(this.decoder).a();
                    s0VarA.E = this.encoderDelay;
                    s0VarA.F = this.encoderPadding;
                    ((j0) this.audioSink).b(new h3.t0(s0VarA), null);
                    this.audioTrackNeedsConfigure = false;
                }
                tVar = this.audioSink;
                simpleDecoderOutputBuffer = this.outputBuffer;
                if (((j0) tVar).l(simpleDecoderOutputBuffer.timeUs, 1, simpleDecoderOutputBuffer.data)) {
                    this.decoderCounters.f14421e++;
                    this.outputBuffer.release();
                    this.outputBuffer = null;
                    return true;
                }
            }
        } else {
            if (this.outputBuffer.isEndOfStream()) {
                if (this.decoderReinitializationState == 2) {
                    e();
                    c();
                    this.audioTrackNeedsConfigure = true;
                    return false;
                }
                this.outputBuffer.release();
                this.outputBuffer = null;
                this.outputStreamEnded = true;
                ((j0) this.audioSink).t();
                return false;
            }
            if (this.audioTrackNeedsConfigure) {
                h3.s0 s0VarA2 = getOutputFormat(this.decoder).a();
                s0VarA2.E = this.encoderDelay;
                s0VarA2.F = this.encoderPadding;
                ((j0) this.audioSink).b(new h3.t0(s0VarA2), null);
                this.audioTrackNeedsConfigure = false;
            }
            tVar = this.audioSink;
            simpleDecoderOutputBuffer = this.outputBuffer;
            if (((j0) tVar).l(simpleDecoderOutputBuffer.timeUs, 1, simpleDecoderOutputBuffer.data)) {
                this.decoderCounters.f14421e++;
                this.outputBuffer.release();
                this.outputBuffer = null;
                return true;
            }
        }
        return false;
    }

    public final boolean b() throws h3.n {
        k3.e eVar = this.decoder;
        if (eVar == null || this.decoderReinitializationState == 2 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputBuffer == null) {
            k3.i iVar = (k3.i) eVar.dequeueInputBuffer();
            this.inputBuffer = iVar;
            if (iVar == null) {
                return false;
            }
        }
        if (this.decoderReinitializationState == 1) {
            this.inputBuffer.setFlags(4);
            this.decoder.queueInputBuffer(this.inputBuffer);
            this.inputBuffer = null;
            this.decoderReinitializationState = 2;
            return false;
        }
        h3.u0 formatHolder = getFormatHolder();
        int source = readSource(formatHolder, this.inputBuffer, 0);
        if (source == -5) {
            d(formatHolder);
            return true;
        }
        if (source != -4) {
            if (source == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.inputBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            this.decoder.queueInputBuffer(this.inputBuffer);
            this.inputBuffer = null;
            return false;
        }
        if (!this.firstStreamSampleRead) {
            this.firstStreamSampleRead = true;
            this.inputBuffer.addFlag(134217728);
        }
        this.inputBuffer.d();
        this.inputBuffer.getClass();
        onQueueInputBuffer(this.inputBuffer);
        this.decoder.queueInputBuffer(this.inputBuffer);
        this.decoderReceivedBuffers = true;
        this.decoderCounters.f14420c++;
        this.inputBuffer = null;
        return true;
    }

    public final void c() throws h3.n {
        k3.b bVarY;
        if (this.decoder != null) {
            return;
        }
        l3.f fVar = this.sourceDrmSession;
        i0.a.D(this.decoderDrmSession, fVar);
        this.decoderDrmSession = fVar;
        if (fVar != null) {
            bVarY = fVar.y();
            if (bVarY == null && this.decoderDrmSession.x() == null) {
                return;
            }
        } else {
            bVarY = null;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            d5.a.c("createAudioDecoder");
            this.decoder = createDecoder(this.inputFormat, bVarY);
            d5.a.q();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            n nVar = this.eventDispatcher;
            String name = this.decoder.getName();
            long j10 = jElapsedRealtime2 - jElapsedRealtime;
            Handler handler = nVar.f12391a;
            if (handler != null) {
                handler.post(new e5.w(nVar, name, jElapsedRealtime2, j10, 2));
            }
            this.decoderCounters.f14418a++;
        } catch (OutOfMemoryError e9) {
            throw createRendererException(e9, this.inputFormat, 4001);
        } catch (k3.g e10) {
            d5.a.p("DecoderAudioRenderer", "Audio codec error", e10);
            n nVar2 = this.eventDispatcher;
            Handler handler2 = nVar2.f12391a;
            if (handler2 != null) {
                handler2.post(new k(nVar2, e10, 0));
            }
            throw createRendererException(e10, this.inputFormat, 4001);
        }
    }

    public k3.l canReuseDecoder(String str, h3.t0 t0Var, h3.t0 t0Var2) {
        return new k3.l(str, t0Var, t0Var2, 0, 1);
    }

    public abstract k3.e createDecoder(h3.t0 t0Var, k3.b bVar);

    public final void d(h3.u0 u0Var) throws h3.n {
        h3.t0 t0Var = u0Var.f8207b;
        t0Var.getClass();
        l3.f fVar = u0Var.f8206a;
        i0.a.D(this.sourceDrmSession, fVar);
        this.sourceDrmSession = fVar;
        h3.t0 t0Var2 = this.inputFormat;
        this.inputFormat = t0Var;
        this.encoderDelay = t0Var.R;
        this.encoderPadding = t0Var.S;
        k3.e eVar = this.decoder;
        if (eVar == null) {
            c();
            n nVar = this.eventDispatcher;
            h3.t0 t0Var3 = this.inputFormat;
            Handler handler = nVar.f12391a;
            if (handler != null) {
                handler.post(new m(nVar, t0Var3, null, 0));
                return;
            }
            return;
        }
        k3.l lVar = fVar != this.decoderDrmSession ? new k3.l(eVar.getName(), t0Var2, t0Var, 0, 128) : canReuseDecoder(eVar.getName(), t0Var2, t0Var);
        if (lVar.d == 0) {
            if (this.decoderReceivedBuffers) {
                this.decoderReinitializationState = 1;
            } else {
                e();
                c();
                this.audioTrackNeedsConfigure = true;
            }
        }
        n nVar2 = this.eventDispatcher;
        h3.t0 t0Var4 = this.inputFormat;
        Handler handler2 = nVar2.f12391a;
        if (handler2 != null) {
            handler2.post(new m(nVar2, t0Var4, lVar, 0));
        }
    }

    public final void e() {
        this.inputBuffer = null;
        this.outputBuffer = null;
        this.decoderReinitializationState = 0;
        this.decoderReceivedBuffers = false;
        k3.e eVar = this.decoder;
        if (eVar != null) {
            this.decoderCounters.f14419b++;
            eVar.release();
            n nVar = this.eventDispatcher;
            String name = this.decoder.getName();
            Handler handler = nVar.f12391a;
            if (handler != null) {
                handler.post(new m5(13, nVar, name));
            }
            this.decoder = null;
        }
        i0.a.D(this.decoderDrmSession, null);
        this.decoderDrmSession = null;
    }

    public void experimentalSetEnableKeepAudioTrackOnSeek(boolean z10) {
        this.experimentalKeepAudioTrackOnSeek = z10;
    }

    public final void f(long j10) {
        this.outputStreamOffsetUs = j10;
        if (j10 != -9223372036854775807L) {
            this.audioSink.getClass();
        }
    }

    public final void g() {
        long jG = ((j0) this.audioSink).g(isEnded());
        if (jG != Long.MIN_VALUE) {
            if (!this.allowPositionDiscontinuity) {
                jG = Math.max(this.currentPositionUs, jG);
            }
            this.currentPositionUs = jG;
            this.allowPositionDiscontinuity = false;
        }
    }

    public abstract h3.t0 getOutputFormat(k3.e eVar);

    @Override
    public x1 getPlaybackParameters() {
        j0 j0Var = (j0) this.audioSink;
        return j0Var.f12365k ? j0Var.f12378y : j0Var.i().f12339a;
    }

    @Override
    public long getPositionUs() {
        if (getState() == 2) {
            g();
        }
        return this.currentPositionUs;
    }

    public final int getSinkFormatSupport(h3.t0 t0Var) {
        return ((j0) this.audioSink).h(t0Var);
    }

    @Override
    public void handleMessage(int i10, Object obj) {
        if (i10 == 2) {
            t tVar = this.audioSink;
            float fFloatValue = ((Float) obj).floatValue();
            j0 j0Var = (j0) tVar;
            if (j0Var.J != fFloatValue) {
                j0Var.J = fFloatValue;
                if (j0Var.o()) {
                    if (d5.g0.f4795a >= 21) {
                        j0Var.f12375u.setVolume(j0Var.J);
                        return;
                    }
                    AudioTrack audioTrack = j0Var.f12375u;
                    float f10 = j0Var.J;
                    audioTrack.setStereoVolume(f10, f10);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            e eVar = (e) obj;
            j0 j0Var2 = (j0) this.audioSink;
            if (j0Var2.v.equals(eVar)) {
                return;
            }
            j0Var2.v = eVar;
            if (j0Var2.Z) {
                return;
            }
            j0Var2.e();
            return;
        }
        if (i10 == 6) {
            ((j0) this.audioSink).z((x) obj);
            return;
        }
        if (i10 == 12) {
            if (d5.g0.f4795a >= 23) {
                a0.a(this.audioSink, obj);
                return;
            }
            return;
        }
        if (i10 == 9) {
            j0 j0Var3 = (j0) this.audioSink;
            j0Var3.x(j0Var3.i().f12339a, ((Boolean) obj).booleanValue());
        } else {
            if (i10 != 10) {
                return;
            }
            t tVar2 = this.audioSink;
            int iIntValue = ((Integer) obj).intValue();
            j0 j0Var4 = (j0) tVar2;
            if (j0Var4.W != iIntValue) {
                j0Var4.W = iIntValue;
                j0Var4.V = iIntValue != 0;
                j0Var4.e();
            }
        }
    }

    @Override
    public boolean isEnded() {
        if (!this.outputStreamEnded) {
            return false;
        }
        j0 j0Var = (j0) this.audioSink;
        if (j0Var.o()) {
            return j0Var.S && !j0Var.m();
        }
        return true;
    }

    @Override
    public boolean isReady() {
        if (((j0) this.audioSink).m()) {
            return true;
        }
        if (this.inputFormat != null) {
            return isSourceReady() || this.outputBuffer != null;
        }
        return false;
    }

    @Override
    public void onDisabled() {
        this.inputFormat = null;
        this.audioTrackNeedsConfigure = true;
        f(-9223372036854775807L);
        try {
            i0.a.D(this.sourceDrmSession, null);
            this.sourceDrmSession = null;
            e();
            ((j0) this.audioSink).v();
        } finally {
            this.eventDispatcher.a(this.decoderCounters);
        }
    }

    @Override
    public void onEnabled(boolean z10, boolean z11) {
        k3.f fVar = new k3.f();
        this.decoderCounters = fVar;
        n nVar = this.eventDispatcher;
        Handler handler = nVar.f12391a;
        if (handler != null) {
            handler.post(new l(nVar, fVar, 0));
        }
        if (getConfiguration().f7935a) {
            ((j0) this.audioSink).d();
        } else {
            j0 j0Var = (j0) this.audioSink;
            if (j0Var.Z) {
                j0Var.Z = false;
                j0Var.e();
            }
        }
        ((j0) this.audioSink).f12371q = getPlayerId();
    }

    public void onPositionDiscontinuity() {
        this.allowPositionDiscontinuity = true;
    }

    @Override
    public void onPositionReset(long j10, boolean z10) throws h3.n {
        if (this.experimentalKeepAudioTrackOnSeek) {
            j0 j0Var = (j0) this.audioSink;
            w wVar = j0Var.f12363i;
            if (d5.g0.f4795a < 25) {
                j0Var.e();
            } else {
                j0Var.f12369o.f5631c = null;
                j0Var.f12368n.f5631c = null;
                if (j0Var.o()) {
                    j0Var.w();
                    AudioTrack audioTrack = wVar.f12469c;
                    audioTrack.getClass();
                    if (audioTrack.getPlayState() == 3) {
                        j0Var.f12375u.pause();
                    }
                    j0Var.f12375u.flush();
                    wVar.f12476l = 0L;
                    wVar.f12486w = 0;
                    wVar.v = 0;
                    wVar.f12477m = 0L;
                    wVar.C = 0L;
                    wVar.F = 0L;
                    wVar.f12475k = false;
                    wVar.f12469c = null;
                    wVar.f12471f = null;
                    w wVar2 = j0Var.f12363i;
                    AudioTrack audioTrack2 = j0Var.f12375u;
                    f0 f0Var = j0Var.f12374t;
                    wVar2.c(audioTrack2, f0Var.f12330c == 2, f0Var.f12333g, f0Var.d, f0Var.h);
                    j0Var.H = true;
                }
            }
        } else {
            ((j0) this.audioSink).e();
        }
        this.currentPositionUs = j10;
        this.allowFirstBufferPositionDiscontinuity = true;
        this.allowPositionDiscontinuity = true;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        if (this.decoder != null) {
            if (this.decoderReinitializationState != 0) {
                e();
                c();
                return;
            }
            this.inputBuffer = null;
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.outputBuffer;
            if (simpleDecoderOutputBuffer != null) {
                simpleDecoderOutputBuffer.release();
                this.outputBuffer = null;
            }
            this.decoder.flush();
            this.decoderReceivedBuffers = false;
        }
    }

    public void onQueueInputBuffer(k3.i iVar) {
        if (!this.allowFirstBufferPositionDiscontinuity || iVar.isDecodeOnly()) {
            return;
        }
        if (Math.abs(iVar.d - this.currentPositionUs) > 500000) {
            this.currentPositionUs = iVar.d;
        }
        this.allowFirstBufferPositionDiscontinuity = false;
    }

    @Override
    public void onStarted() {
        ((j0) this.audioSink).r();
    }

    @Override
    public void onStopped() {
        g();
        ((j0) this.audioSink).q();
    }

    @Override
    public void onStreamChanged(h3.t0[] t0VarArr, long j10, long j11) {
        this.firstStreamSampleRead = false;
        if (this.outputStreamOffsetUs == -9223372036854775807L) {
            f(j11);
            return;
        }
        int i10 = this.pendingOutputStreamOffsetCount;
        if (i10 == this.pendingOutputStreamOffsetsUs.length) {
            d5.a.K("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1]);
        } else {
            this.pendingOutputStreamOffsetCount = i10 + 1;
        }
        this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1] = j11;
    }

    @Override
    public void render(long j10, long j11) throws h3.n {
        if (this.outputStreamEnded) {
            try {
                ((j0) this.audioSink).t();
                return;
            } catch (s e9) {
                throw createRendererException(e9, e9.f12436c, e9.f12435b, 5002);
            }
        }
        if (this.inputFormat == null) {
            h3.u0 formatHolder = getFormatHolder();
            this.flagsOnlyBuffer.clear();
            int source = readSource(formatHolder, this.flagsOnlyBuffer, 2);
            if (source != -5) {
                if (source == -4) {
                    d5.a.i(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    try {
                        this.outputStreamEnded = true;
                        ((j0) this.audioSink).t();
                        return;
                    } catch (s e10) {
                        throw createRendererException(e10, null, 5002);
                    }
                }
                return;
            }
            d(formatHolder);
        }
        c();
        if (this.decoder != null) {
            try {
                d5.a.c("drainAndFeed");
                while (a()) {
                }
                while (b()) {
                }
                d5.a.q();
                synchronized (this.decoderCounters) {
                }
            } catch (p e11) {
                throw createRendererException(e11, e11.f12399a, 5001);
            } catch (q e12) {
                throw createRendererException(e12, e12.f12402c, e12.f12401b, 5001);
            } catch (s e13) {
                throw createRendererException(e13, e13.f12436c, e13.f12435b, 5002);
            } catch (k3.g e14) {
                d5.a.p("DecoderAudioRenderer", "Audio codec error", e14);
                n nVar = this.eventDispatcher;
                Handler handler = nVar.f12391a;
                if (handler != null) {
                    handler.post(new k(nVar, e14, 0));
                }
                throw createRendererException(e14, this.inputFormat, 4003);
            }
        }
    }

    @Override
    public void setPlaybackParameters(x1 x1Var) {
        ((j0) this.audioSink).A(x1Var);
    }

    public final boolean sinkSupportsFormat(h3.t0 t0Var) {
        return ((j0) this.audioSink).h(t0Var) != 0;
    }

    @Override
    public final int supportsFormat(h3.t0 t0Var) {
        if (!d5.q.h(t0Var.B)) {
            return com.google.android.recaptcha.internal.a.b(0, 0, 0);
        }
        int iSupportsFormatInternal = supportsFormatInternal(t0Var);
        if (iSupportsFormatInternal <= 2) {
            return com.google.android.recaptcha.internal.a.b(iSupportsFormatInternal, 0, 0);
        }
        return com.google.android.recaptcha.internal.a.b(iSupportsFormatInternal, 8, d5.g0.f4795a >= 21 ? 32 : 0);
    }

    public abstract int supportsFormatInternal(h3.t0 t0Var);

    @Override
    public d5.o getMediaClock() {
        return this;
    }
}
