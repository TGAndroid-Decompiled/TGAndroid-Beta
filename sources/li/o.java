package li;

import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
public final class o implements u {
    public boolean A;
    public volatile long C;
    public boolean D;
    public boolean E;
    public long F;
    public long G;
    public long H;
    public int I;
    public int J;
    public int K;
    public long L;
    public long M;
    public int N;
    public volatile long O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final z f12187a;
    public int f12188a0;
    public final long f12189b;
    public int f12190b0;
    public final int f12191c;
    public boolean f12192c0;
    public final int d;
    public long f12193d0;
    public final int e;
    public final p f12194f;
    public final c f12195g;
    public final c h;
    public MediaCodec f12201n;
    public MediaCodec f12202o;
    public AudioRecord f12203p;
    public Surface f12204q;
    public Thread f12205r;
    public Thread f12206s;
    public d f12207t;
    public d f12208u;
    public volatile boolean v;
    public volatile boolean f12209w;
    public volatile boolean f12210x;
    public boolean f12211y;
    public int f12212z;
    public final AtomicBoolean f12196i = new AtomicBoolean();
    public final ArrayList f12197j = new ArrayList();
    public final AudioTimestamp f12198k = new AudioTimestamp();
    public final long[] f12199l = new long[256];
    public final long[] f12200m = new long[256];
    public volatile long B = Long.MAX_VALUE;

    public o(z zVar, long j10, int i10, int i11, int i12, p pVar, c cVar, c cVar2) {
        this.f12187a = zVar;
        this.f12189b = j10;
        this.f12191c = i10;
        this.d = i11;
        this.e = i12;
        this.f12194f = pVar;
        this.f12195g = cVar;
        this.h = cVar2;
    }

    public static MediaFormat c(int i10, int i11, int i12) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i10, i10);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", i11);
        createVideoFormat.setInteger("frame-rate", i12);
        createVideoFormat.setInteger("i-frame-interval", 1);
        return createVideoFormat;
    }

    public static int f(MediaFormat mediaFormat) {
        int remaining;
        int i10 = 0;
        if (!mediaFormat.containsKey("prepend-sps-pps-to-idr-frames") || mediaFormat.getInteger("prepend-sps-pps-to-idr-frames") != 1) {
            return 0;
        }
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
        ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
        if (byteBuffer == null) {
            remaining = 0;
        } else {
            remaining = byteBuffer.remaining();
        }
        if (byteBuffer2 != null) {
            i10 = byteBuffer2.remaining();
        }
        return remaining + i10;
    }

    public static String k(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return "n/a";
        }
        return j10 + ".." + j11;
    }

    public final void a() {
        int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
        if (minBufferSize > 0) {
            int max = Math.max(minBufferSize * 4, 16384);
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 48000, 1);
            createAudioFormat.setInteger("aac-profile", 2);
            createAudioFormat.setInteger("bitrate", 64000);
            createAudioFormat.setInteger("max-input-size", max);
            this.f12202o = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f12194f.b("audio encoder configure: codec=" + this.f12202o.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
            this.f12202o.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
            this.f12203p = audioRecord;
            if (audioRecord.getState() == 1) {
                return;
            }
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
        throw new IllegalStateException("Unsupported audio recording configuration");
    }

    public final void b() {
        int i10 = this.f12191c;
        int i11 = this.d;
        int i12 = this.e;
        MediaFormat c10 = c(i10, i11, i12);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.f12201n = createEncoderByType;
        MediaCodecInfo.VideoCapabilities videoCapabilities = createEncoderByType.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
        if (videoCapabilities.isSizeSupported(i10, i10) && videoCapabilities.areSizeAndRateSupported(i10, i10, i12)) {
            this.f12194f.b("video encoder configure: codec=" + this.f12201n.getName() + ", format=" + c10);
            this.f12201n.configure(c10, (Surface) null, (MediaCrypto) null, 1);
            this.f12204q = this.f12201n.createInputSurface();
            return;
        }
        throw new IOException(a1.g.p(i0.a.m("Video encoder does not support ", i10, "x", i10, " at "), i12, " fps"));
    }

    public final boolean d(MediaCodec.BufferInfo bufferInfo, long j10) {
        ByteBuffer outputBuffer;
        int dequeueOutputBuffer = this.f12202o.dequeueOutputBuffer(bufferInfo, j10);
        boolean z10 = false;
        while (true) {
            boolean z11 = true;
            if (dequeueOutputBuffer < 0) {
                break;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0 && (outputBuffer = this.f12202o.getOutputBuffer(dequeueOutputBuffer)) != null && !this.f12210x) {
                if (bufferInfo.presentationTimeUs >= this.B) {
                    this.Z++;
                    this.f12188a0++;
                } else if (this.f12192c0) {
                    this.J++;
                    this.H += bufferInfo.size;
                    m(false, bufferInfo);
                    v(false, outputBuffer, bufferInfo);
                } else {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                    int position = outputBuffer.position();
                    int limit = outputBuffer.limit();
                    try {
                        outputBuffer.position(bufferInfo.offset);
                        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(outputBuffer).flip();
                        outputBuffer.limit(limit);
                        outputBuffer.position(position);
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                        this.f12197j.add(new n(allocateDirect, bufferInfo2));
                        long j11 = this.O;
                        if (j11 != Long.MIN_VALUE && bufferInfo.presentationTimeUs >= j11) {
                            e(j11, false);
                        }
                    } catch (Throwable th2) {
                        outputBuffer.limit(limit);
                        outputBuffer.position(position);
                        throw th2;
                    }
                }
            }
            if ((bufferInfo.flags & 4) == 0) {
                z11 = false;
            }
            z10 |= z11;
            this.f12202o.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.f12202o.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            s(this.f12202o.getOutputFormat(), false);
        }
        if (z10 && !this.f12192c0 && this.O != Long.MIN_VALUE) {
            e(this.O, true);
        }
        return z10;
    }

    public final void e(long j10, boolean z10) {
        ArrayList arrayList = this.f12197j;
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((n) arrayList.get(i10)).f12183b.presentationTimeUs >= j10) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 < 0) {
                if (!z10) {
                    return;
                }
                i10 = arrayList.size() - 1;
            } else if (i10 > 0 && j10 - ((n) arrayList.get(i10 - 1)).f12183b.presentationTimeUs <= ((n) arrayList.get(i10)).f12183b.presentationTimeUs - j10) {
                i10--;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                this.Z++;
            }
            n nVar = (n) arrayList.get(i10);
            this.f12193d0 = nVar.f12183b.presentationTimeUs - j10;
            while (i10 < arrayList.size()) {
                n nVar2 = (n) arrayList.get(i10);
                ByteBuffer byteBuffer = nVar2.f12182a;
                MediaCodec.BufferInfo bufferInfo = nVar2.f12183b;
                this.J++;
                this.H += bufferInfo.size;
                m(false, bufferInfo);
                v(false, byteBuffer, bufferInfo);
                i10++;
            }
            arrayList.clear();
            this.f12192c0 = true;
            StringBuilder s10 = a1.g.s(j10, "A/V start aligned: videoPtsUs=", ", audioPtsUs=");
            s10.append(nVar.f12183b.presentationTimeUs);
            s10.append(", deltaUs=");
            s10.append(this.f12193d0);
            this.f12194f.b(s10.toString());
        }
    }

    public final boolean g() {
        if (this.O != Long.MIN_VALUE && this.P != Long.MIN_VALUE && this.Q != Long.MIN_VALUE && this.R != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void h(Thread thread, long j10) {
        if (thread != null) {
            try {
                thread.join(j10);
                if (thread.isAlive()) {
                    p pVar = this.f12194f;
                    pVar.b("encoder thread did not stop: " + thread.getName());
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void i() {
        synchronized (this) {
            if (this.f12207t != null && !this.v) {
                d dVar = this.f12207t;
                this.f12207t = null;
                this.f12194f.b("audio capture ready; waiting for common A/V start frame");
                dVar.run();
            }
        }
    }

    public final void j() {
        boolean z10;
        synchronized (this) {
            try {
                z10 = true;
                int i10 = this.f12212z - 1;
                this.f12212z = i10;
                if (!this.A || i10 != 0) {
                    z10 = false;
                }
                if (z10) {
                    this.A = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f12194f.b("deferred codec release: encoder threads exited");
            n();
        }
    }

    public final void l(long j10) {
        int i10;
        long j11 = this.C;
        long max = Math.max(0L, j11 - 256);
        do {
            j11--;
            if (j11 >= max) {
                i10 = (int) (j11 % 256);
            } else {
                return;
            }
        } while (this.f12199l[i10] != j10);
        long nanoTime = System.nanoTime() - this.f12200m[i10];
        this.K++;
        this.L += nanoTime;
        this.M = Math.max(this.M, nanoTime);
        if (this.K % 30 == 0) {
            this.f12194f.b("codec latency: average=" + ((((float) this.L) / this.K) / 1000000.0f) + " ms, max=" + (((float) this.M) / 1000000.0f) + " ms");
        }
    }

    public final void m(boolean z10, MediaCodec.BufferInfo bufferInfo) {
        long j10 = bufferInfo.presentationTimeUs;
        if (z10) {
            if (this.O == Long.MIN_VALUE) {
                this.O = j10;
            }
            long j11 = this.P;
            if (j11 != Long.MIN_VALUE && j10 < j11) {
                this.V++;
            }
            this.P = Math.max(j11, j10);
            if ((bufferInfo.flags & 1) != 0) {
                this.U++;
                long j12 = this.S;
                if (j12 != Long.MIN_VALUE) {
                    this.T = Math.max(this.T, j10 - j12);
                }
                this.S = j10;
                return;
            }
            return;
        }
        if (this.Q == Long.MIN_VALUE) {
            this.Q = j10;
        }
        long j13 = this.R;
        if (j13 != Long.MIN_VALUE && j10 < j13) {
            this.W++;
        }
        this.R = Math.max(j13, j10);
    }

    public final void n() {
        this.D = false;
        this.E = false;
        this.f12207t = null;
        this.f12208u = null;
        AudioRecord audioRecord = this.f12203p;
        if (audioRecord != null) {
            audioRecord.release();
            this.f12203p = null;
        }
        Surface surface = this.f12204q;
        if (surface != null) {
            surface.release();
            this.f12204q = null;
        }
        MediaCodec mediaCodec = this.f12201n;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.f12202o;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.f12202o = null;
        this.f12201n = null;
        this.f12206s = null;
        this.f12205r = null;
    }

    public final void o(RuntimeException runtimeException) {
        String str;
        StringBuilder sb2 = new StringBuilder("codec error");
        if (runtimeException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) runtimeException;
            str = ": diagnostic=" + codecException.getDiagnosticInfo() + ", recoverable=" + codecException.isRecoverable() + ", transient=" + codecException.isTransient();
        } else {
            str = "";
        }
        sb2.append(str);
        this.f12194f.a(sb2.toString(), runtimeException);
        if (this.f12196i.compareAndSet(false, true)) {
            this.f12195g.a(runtimeException);
        }
    }

    public final long p() {
        synchronized (this) {
            try {
                if (this.D && this.E) {
                    if (this.v) {
                        return this.B;
                    }
                    this.v = true;
                    long max = Math.max(0L, (SystemClock.elapsedRealtimeNanos() - this.F) / 1000);
                    this.B = max;
                    AudioRecord audioRecord = this.f12203p;
                    if (audioRecord != null) {
                        try {
                            if (audioRecord.getRecordingState() == 3) {
                                audioRecord.stop();
                            }
                        } catch (IllegalStateException e) {
                            this.f12194f.a("AudioRecord stop failed", e);
                        }
                    }
                    p pVar = this.f12194f;
                    pVar.b("recording stop boundary: presentationTimeUs=" + max);
                    return max;
                }
                return Long.MAX_VALUE;
            } finally {
            }
        }
    }

    public final void q() {
        this.v = false;
        this.f12209w = false;
        this.f12210x = false;
        this.f12211y = false;
        this.f12212z = 0;
        this.A = false;
        this.B = Long.MAX_VALUE;
        this.F = 0L;
        this.H = 0L;
        this.G = 0L;
        this.J = 0;
        this.I = 0;
        this.C = 0L;
        this.K = 0;
        this.M = 0L;
        this.L = 0L;
        this.P = Long.MIN_VALUE;
        this.O = Long.MIN_VALUE;
        this.R = Long.MIN_VALUE;
        this.Q = Long.MIN_VALUE;
        this.S = Long.MIN_VALUE;
        this.T = 0L;
        this.U = 0;
        this.W = 0;
        this.V = 0;
        this.Y = 0;
        this.X = 0;
        this.Z = 0;
        this.f12188a0 = 0;
        this.f12190b0 = 0;
        this.f12192c0 = false;
        this.f12193d0 = Long.MIN_VALUE;
        this.f12207t = null;
        this.f12208u = null;
        this.f12197j.clear();
    }

    public final long r(int i10) {
        long max = Math.max(0L, ((SystemClock.elapsedRealtimeNanos() - this.F) / 1000) - ((i10 * 1000000) / 48000));
        int i11 = Build.VERSION.SDK_INT;
        p pVar = this.f12194f;
        if (i11 >= 24) {
            AudioRecord audioRecord = this.f12203p;
            AudioTimestamp audioTimestamp = this.f12198k;
            if (audioRecord.getTimestamp(audioTimestamp, 1) == 0) {
                long max2 = Math.max(0L, ((audioTimestamp.nanoTime - this.F) / 1000) - ((audioTimestamp.framePosition * 1000000) / 48000));
                pVar.b("audio timestamp alignment: framePosition=" + audioTimestamp.framePosition + ", timestampDeltaUs=" + ((audioTimestamp.nanoTime - this.F) / 1000) + ", timestampBaseUs=" + max2 + ", readCompletionBaseUs=" + max);
                return max2;
            }
        }
        pVar.b("audio timestamp unavailable: readCompletionBaseUs=" + max);
        return max;
    }

    public final void s(MediaFormat mediaFormat, boolean z10) {
        String str;
        if (z10) {
            try {
                this.N = f(mediaFormat);
                z zVar = this.f12187a;
                int i10 = this.e;
                synchronized (zVar) {
                    zVar.f12351s = i10;
                }
            } catch (w e) {
                if (!this.f12210x) {
                    this.f12210x = true;
                    this.f12194f.a("recording segment rejected; earlier segments are kept", e);
                    this.h.a(e);
                    return;
                }
                return;
            } catch (IOException e7) {
                throw new IllegalStateException(e7);
            }
        }
        p pVar = this.f12194f;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            str = "video";
        } else {
            str = "audio";
        }
        sb2.append(str);
        sb2.append(" output format: ");
        sb2.append(mediaFormat);
        pVar.b(sb2.toString());
        this.f12187a.n(mediaFormat, z10);
    }

    public final synchronized void t(d dVar, d dVar2) {
        if (this.E) {
            return;
        }
        if (this.D) {
            try {
                this.f12202o.start();
                this.f12203p.startRecording();
                if (this.f12203p.getRecordingState() == 3) {
                    this.F = SystemClock.elapsedRealtimeNanos();
                    this.f12207t = dVar;
                    this.f12208u = dVar2;
                    this.E = true;
                    p pVar = this.f12194f;
                    pVar.b("audio and video recording started: timeOriginNs=" + this.F + ", timelineOffsetUs=" + this.f12189b + ", audioSessionId=" + this.f12203p.getAudioSessionId());
                    this.f12205r = new Thread(new Runnable(this) {
                        public final o f12176b;

                        {
                            this.f12176b = this;
                        }

                        @Override
                        public final void run() {
                            boolean z10;
                            long j10;
                            long j11;
                            long j12;
                            String str;
                            long j13;
                            long j14;
                            int i10 = r2;
                            o oVar = this.f12176b;
                            oVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            try {
                                            } catch (RuntimeException e) {
                                                if (!oVar.v) {
                                                    oVar.o(e);
                                                } else {
                                                    oVar.f12194f.a("video drain failed while stopping", e);
                                                }
                                            }
                                            if (!oVar.f12209w) {
                                                int dequeueOutputBuffer = oVar.f12201n.dequeueOutputBuffer(bufferInfo, 10000L);
                                                if (dequeueOutputBuffer == -2) {
                                                    oVar.s(oVar.f12201n.getOutputFormat(), true);
                                                } else if (dequeueOutputBuffer >= 0) {
                                                    if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        if (bufferInfo.presentationTimeUs < oVar.B) {
                                                            oVar.I++;
                                                            oVar.G += bufferInfo.size;
                                                            oVar.m(true, bufferInfo);
                                                            oVar.l(bufferInfo.presentationTimeUs);
                                                            oVar.v(true, oVar.f12201n.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                        } else {
                                                            oVar.f12190b0++;
                                                        }
                                                    }
                                                    if ((bufferInfo.flags & 4) != 0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    oVar.f12201n.releaseOutputBuffer(dequeueOutputBuffer, false);
                                                }
                                            } else {
                                                oVar.j();
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            oVar.j();
                                            throw th2;
                                        }
                                    }
                                    oVar.j();
                                    return;
                                default:
                                    Process.setThreadPriority(-16);
                                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                                    long j15 = Long.MIN_VALUE;
                                    boolean z12 = false;
                                    long j16 = Long.MIN_VALUE;
                                    boolean z13 = false;
                                    long j17 = 0;
                                    while (!z12) {
                                        try {
                                            try {
                                                if (!oVar.f12209w) {
                                                    if (z13) {
                                                        j10 = 10000;
                                                    } else {
                                                        j10 = 0;
                                                    }
                                                    z12 = oVar.d(bufferInfo2, j10);
                                                    if (!z12) {
                                                        int dequeueInputBuffer = oVar.f12202o.dequeueInputBuffer(10000L);
                                                        if (dequeueInputBuffer >= 0) {
                                                            if (oVar.v) {
                                                                if (j16 == j15) {
                                                                    j14 = 0;
                                                                } else {
                                                                    j14 = j16 + ((1000000 * j17) / 48000);
                                                                }
                                                                oVar.f12202o.queueInputBuffer(dequeueInputBuffer, 0, 0, j14, 4);
                                                                z13 = true;
                                                            } else {
                                                                ByteBuffer inputBuffer = oVar.f12202o.getInputBuffer(dequeueInputBuffer);
                                                                if (inputBuffer == null) {
                                                                    oVar.f12202o.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                                } else {
                                                                    inputBuffer.clear();
                                                                    j11 = j15;
                                                                    int read = oVar.f12203p.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                                    if (read <= 0) {
                                                                        if (read < 0) {
                                                                            int i11 = oVar.X + 1;
                                                                            oVar.X = i11;
                                                                            if (read == -6 || i11 >= 3) {
                                                                                throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                            }
                                                                        } else {
                                                                            oVar.Y++;
                                                                        }
                                                                        if (j16 == j11) {
                                                                            j13 = 0;
                                                                        } else {
                                                                            j13 = j16 + ((1000000 * j17) / 48000);
                                                                        }
                                                                        oVar.f12202o.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 0);
                                                                    } else {
                                                                        int i12 = read / 2;
                                                                        if (j16 == j11) {
                                                                            long r10 = oVar.r(i12);
                                                                            p pVar2 = oVar.f12194f;
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            sb2.append("first audio input: basePtsUs=");
                                                                            sb2.append(r10);
                                                                            sb2.append(", frames=");
                                                                            sb2.append(i12);
                                                                            sb2.append(", timestampSource=");
                                                                            j12 = 48000;
                                                                            if (Build.VERSION.SDK_INT >= 24) {
                                                                                str = "AudioTimestamp";
                                                                            } else {
                                                                                str = "read completion";
                                                                            }
                                                                            sb2.append(str);
                                                                            pVar2.b(sb2.toString());
                                                                            j16 = r10;
                                                                        } else {
                                                                            j12 = 48000;
                                                                        }
                                                                        oVar.f12202o.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j16 + ((1000000 * j17) / j12), 0);
                                                                        j17 += i12;
                                                                        oVar.i();
                                                                    }
                                                                    j15 = j11;
                                                                }
                                                            }
                                                        }
                                                        j11 = j15;
                                                        j15 = j11;
                                                    }
                                                }
                                            } catch (RuntimeException e7) {
                                                if (!oVar.v) {
                                                    oVar.o(e7);
                                                } else {
                                                    oVar.f12194f.a("audio capture failed while stopping", e7);
                                                }
                                            }
                                            oVar.j();
                                            return;
                                        } catch (Throwable th3) {
                                            oVar.j();
                                            throw th3;
                                        }
                                    }
                                    oVar.j();
                                    return;
                            }
                        }
                    }, "RoundVideoVideoEncoder");
                    this.f12206s = new Thread(new Runnable(this) {
                        public final o f12176b;

                        {
                            this.f12176b = this;
                        }

                        @Override
                        public final void run() {
                            boolean z10;
                            long j10;
                            long j11;
                            long j12;
                            String str;
                            long j13;
                            long j14;
                            int i10 = r2;
                            o oVar = this.f12176b;
                            oVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            try {
                                            } catch (RuntimeException e) {
                                                if (!oVar.v) {
                                                    oVar.o(e);
                                                } else {
                                                    oVar.f12194f.a("video drain failed while stopping", e);
                                                }
                                            }
                                            if (!oVar.f12209w) {
                                                int dequeueOutputBuffer = oVar.f12201n.dequeueOutputBuffer(bufferInfo, 10000L);
                                                if (dequeueOutputBuffer == -2) {
                                                    oVar.s(oVar.f12201n.getOutputFormat(), true);
                                                } else if (dequeueOutputBuffer >= 0) {
                                                    if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        if (bufferInfo.presentationTimeUs < oVar.B) {
                                                            oVar.I++;
                                                            oVar.G += bufferInfo.size;
                                                            oVar.m(true, bufferInfo);
                                                            oVar.l(bufferInfo.presentationTimeUs);
                                                            oVar.v(true, oVar.f12201n.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                        } else {
                                                            oVar.f12190b0++;
                                                        }
                                                    }
                                                    if ((bufferInfo.flags & 4) != 0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    oVar.f12201n.releaseOutputBuffer(dequeueOutputBuffer, false);
                                                }
                                            } else {
                                                oVar.j();
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            oVar.j();
                                            throw th2;
                                        }
                                    }
                                    oVar.j();
                                    return;
                                default:
                                    Process.setThreadPriority(-16);
                                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                                    long j15 = Long.MIN_VALUE;
                                    boolean z12 = false;
                                    long j16 = Long.MIN_VALUE;
                                    boolean z13 = false;
                                    long j17 = 0;
                                    while (!z12) {
                                        try {
                                            try {
                                                if (!oVar.f12209w) {
                                                    if (z13) {
                                                        j10 = 10000;
                                                    } else {
                                                        j10 = 0;
                                                    }
                                                    z12 = oVar.d(bufferInfo2, j10);
                                                    if (!z12) {
                                                        int dequeueInputBuffer = oVar.f12202o.dequeueInputBuffer(10000L);
                                                        if (dequeueInputBuffer >= 0) {
                                                            if (oVar.v) {
                                                                if (j16 == j15) {
                                                                    j14 = 0;
                                                                } else {
                                                                    j14 = j16 + ((1000000 * j17) / 48000);
                                                                }
                                                                oVar.f12202o.queueInputBuffer(dequeueInputBuffer, 0, 0, j14, 4);
                                                                z13 = true;
                                                            } else {
                                                                ByteBuffer inputBuffer = oVar.f12202o.getInputBuffer(dequeueInputBuffer);
                                                                if (inputBuffer == null) {
                                                                    oVar.f12202o.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                                } else {
                                                                    inputBuffer.clear();
                                                                    j11 = j15;
                                                                    int read = oVar.f12203p.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                                    if (read <= 0) {
                                                                        if (read < 0) {
                                                                            int i11 = oVar.X + 1;
                                                                            oVar.X = i11;
                                                                            if (read == -6 || i11 >= 3) {
                                                                                throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                            }
                                                                        } else {
                                                                            oVar.Y++;
                                                                        }
                                                                        if (j16 == j11) {
                                                                            j13 = 0;
                                                                        } else {
                                                                            j13 = j16 + ((1000000 * j17) / 48000);
                                                                        }
                                                                        oVar.f12202o.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 0);
                                                                    } else {
                                                                        int i12 = read / 2;
                                                                        if (j16 == j11) {
                                                                            long r10 = oVar.r(i12);
                                                                            p pVar2 = oVar.f12194f;
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            sb2.append("first audio input: basePtsUs=");
                                                                            sb2.append(r10);
                                                                            sb2.append(", frames=");
                                                                            sb2.append(i12);
                                                                            sb2.append(", timestampSource=");
                                                                            j12 = 48000;
                                                                            if (Build.VERSION.SDK_INT >= 24) {
                                                                                str = "AudioTimestamp";
                                                                            } else {
                                                                                str = "read completion";
                                                                            }
                                                                            sb2.append(str);
                                                                            pVar2.b(sb2.toString());
                                                                            j16 = r10;
                                                                        } else {
                                                                            j12 = 48000;
                                                                        }
                                                                        oVar.f12202o.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j16 + ((1000000 * j17) / j12), 0);
                                                                        j17 += i12;
                                                                        oVar.i();
                                                                    }
                                                                    j15 = j11;
                                                                }
                                                            }
                                                        }
                                                        j11 = j15;
                                                        j15 = j11;
                                                    }
                                                }
                                            } catch (RuntimeException e7) {
                                                if (!oVar.v) {
                                                    oVar.o(e7);
                                                } else {
                                                    oVar.f12194f.a("audio capture failed while stopping", e7);
                                                }
                                            }
                                            oVar.j();
                                            return;
                                        } catch (Throwable th3) {
                                            oVar.j();
                                            throw th3;
                                        }
                                    }
                                    oVar.j();
                                    return;
                            }
                        }
                    }, "RoundVideoAudioEncoder");
                    this.f12212z = 2;
                    this.f12205r.start();
                    this.f12206s.start();
                    return;
                }
                throw new IllegalStateException("Unable to start AudioRecord");
            } catch (RuntimeException e) {
                n();
                throw e;
            }
        }
        throw new IllegalStateException("Recorder is not prepared");
    }

    public final void u() {
        long j10;
        long j11;
        long j12;
        long j13;
        String valueOf;
        String valueOf2;
        String valueOf3;
        String valueOf4;
        Long valueOf5;
        String valueOf6;
        p();
        synchronized (this) {
            try {
                if (this.D && !this.f12211y) {
                    if (!this.E) {
                        n();
                        return;
                    }
                    this.f12211y = true;
                    try {
                        this.f12201n.signalEndOfInputStream();
                    } catch (IllegalStateException e) {
                        this.f12194f.a("video encoder EOS failed", e);
                    }
                    h(this.f12205r, 5000L);
                    h(this.f12206s, 5000L);
                    Object obj = "n/a";
                    if (g()) {
                        j10 = this.Q - this.O;
                    } else {
                        j10 = Long.MIN_VALUE;
                    }
                    if (g()) {
                        j11 = this.R - this.P;
                    } else {
                        j11 = Long.MIN_VALUE;
                    }
                    long j14 = this.O;
                    long j15 = this.P;
                    if (j14 != Long.MIN_VALUE && j15 > j14) {
                        j12 = j15 - j14;
                    } else {
                        j12 = 0;
                    }
                    long j16 = this.Q;
                    long j17 = this.R;
                    if (j16 != Long.MIN_VALUE && j17 > j16) {
                        j13 = j17 - j16;
                    } else {
                        j13 = 0;
                    }
                    p pVar = this.f12194f;
                    StringBuilder sb2 = new StringBuilder("codec summary: videoBuffers=");
                    sb2.append(this.I);
                    sb2.append(", videoBytes=");
                    sb2.append(this.G);
                    sb2.append(", videoPts=");
                    long j18 = j12;
                    sb2.append(k(this.O, this.P));
                    sb2.append(", actualVideoBitrate=");
                    long j19 = this.G;
                    if (j18 <= 0) {
                        valueOf = "n/a";
                    } else {
                        valueOf = String.valueOf((j19 * 8000000) / j18);
                    }
                    sb2.append(valueOf);
                    sb2.append(", keyframes=");
                    sb2.append(this.U);
                    sb2.append(", maxKeyframeIntervalUs=");
                    sb2.append(this.T);
                    sb2.append(", nonMonotonicVideoPts=");
                    sb2.append(this.V);
                    sb2.append(", audioBuffers=");
                    sb2.append(this.J);
                    sb2.append(", audioBytes=");
                    sb2.append(this.H);
                    sb2.append(", audioPts=");
                    sb2.append(k(this.Q, this.R));
                    sb2.append(", actualAudioBitrate=");
                    long j20 = this.H;
                    if (j13 <= 0) {
                        valueOf2 = "n/a";
                    } else {
                        valueOf2 = String.valueOf((j20 * 8000000) / j13);
                    }
                    sb2.append(valueOf2);
                    sb2.append(", nonMonotonicAudioPts=");
                    sb2.append(this.W);
                    sb2.append(", avStartDeltaUs=");
                    if (j10 == Long.MIN_VALUE) {
                        valueOf3 = "n/a";
                    } else {
                        valueOf3 = String.valueOf(j10);
                    }
                    sb2.append(valueOf3);
                    sb2.append(", avEndDeltaUs=");
                    if (j11 == Long.MIN_VALUE) {
                        valueOf4 = "n/a";
                    } else {
                        valueOf4 = String.valueOf(j11);
                    }
                    sb2.append(valueOf4);
                    sb2.append(", audioReadErrors=");
                    sb2.append(this.X);
                    sb2.append(", emptyAudioReads=");
                    sb2.append(this.Y);
                    sb2.append(", droppedAudioBuffers=");
                    sb2.append(this.Z);
                    sb2.append(", droppedAudioAfterStop=");
                    sb2.append(this.f12188a0);
                    sb2.append(", droppedVideoAfterStop=");
                    sb2.append(this.f12190b0);
                    sb2.append(", stopPresentationTimeUs=");
                    if (this.B == Long.MAX_VALUE) {
                        valueOf5 = "n/a";
                    } else {
                        valueOf5 = Long.valueOf(this.B);
                    }
                    sb2.append(valueOf5);
                    sb2.append(", alignedAudioStartDeltaUs=");
                    long j21 = this.f12193d0;
                    if (j21 == Long.MIN_VALUE) {
                        valueOf6 = "n/a";
                    } else {
                        valueOf6 = String.valueOf(j21);
                    }
                    sb2.append(valueOf6);
                    sb2.append(", codecLatencyAvgMs=");
                    int i10 = this.K;
                    if (i10 != 0) {
                        obj = Float.valueOf((((float) this.L) / i10) / 1000000.0f);
                    }
                    sb2.append(obj);
                    sb2.append(", codecLatencyMaxMs=");
                    sb2.append(((float) this.M) / 1000000.0f);
                    pVar.b(sb2.toString());
                    synchronized (this) {
                        try {
                            if (this.f12212z > 0) {
                                this.f12209w = true;
                            }
                        } finally {
                        }
                    }
                    if (this.f12209w) {
                        h(this.f12205r, 1000L);
                        h(this.f12206s, 1000L);
                    }
                    synchronized (this) {
                        try {
                            if (this.f12212z > 0) {
                                this.A = true;
                                this.f12194f.b("codec release deferred until encoder threads exit: running=" + this.f12212z);
                                return;
                            }
                            n();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void v(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10;
        if (byteBuffer != null && !this.f12210x) {
            if (z10) {
                try {
                    int i11 = this.N;
                    if (i11 > 0 && (bufferInfo.flags & 1) != 0 && (i10 = bufferInfo.size) > i11) {
                        bufferInfo.offset += i11;
                        bufferInfo.size = i10 - i11;
                    }
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                }
            }
            this.f12187a.q(z10, byteBuffer, bufferInfo, this.f12189b);
        }
    }
}
