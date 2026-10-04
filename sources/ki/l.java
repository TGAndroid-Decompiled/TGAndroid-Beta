package ki;

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
import ii.n4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
public final class l implements p {
    public long A;
    public long B;
    public long C;
    public int D;
    public int E;
    public int F;
    public long G;
    public long H;
    public int I;
    public volatile long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public long Y;
    public final t f14959a;
    public final long f14960b;
    public final int f14961c;
    public final int d;
    public final int f14962e;
    public final m f14963f;
    public final b f14964g;
    public MediaCodec f14969m;
    public MediaCodec f14970n;
    public AudioRecord f14971o;
    public Surface f14972p;
    public Thread f14973q;
    public Thread f14974r;
    public c f14975s;
    public c f14976t;
    public volatile boolean f14977u;
    public boolean v;
    public volatile long f14979x;
    public boolean f14980y;
    public boolean f14981z;
    public final AtomicBoolean h = new AtomicBoolean();
    public final ArrayList f14965i = new ArrayList();
    public final AudioTimestamp f14966j = new AudioTimestamp();
    public final long[] f14967k = new long[256];
    public final long[] f14968l = new long[256];
    public volatile long f14978w = Long.MAX_VALUE;

    public l(t tVar, long j3, int i10, int i11, int i12, m mVar, b bVar) {
        this.f14959a = tVar;
        this.f14960b = j3;
        this.f14961c = i10;
        this.d = i11;
        this.f14962e = i12;
        this.f14963f = mVar;
        this.f14964g = bVar;
    }

    public static String g(long j3, long j10) {
        if (j3 == Long.MIN_VALUE) {
            return "n/a";
        }
        return j3 + ".." + j10;
    }

    public final void a() {
        int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
        if (minBufferSize > 0) {
            int max = Math.max(minBufferSize * 4, 16384);
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 48000, 1);
            createAudioFormat.setInteger("aac-profile", 2);
            createAudioFormat.setInteger("bitrate", 64000);
            createAudioFormat.setInteger("max-input-size", max);
            this.f14970n = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f14963f.b("audio encoder configure: codec=" + this.f14970n.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
            this.f14970n.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
            this.f14971o = audioRecord;
            if (audioRecord.getState() == 1) {
                return;
            }
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
        throw new IllegalStateException("Unsupported audio recording configuration");
    }

    public final void b() {
        int i10 = this.f14961c;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i10, i10);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.d);
        int i11 = this.f14962e;
        createVideoFormat.setInteger("frame-rate", i11);
        createVideoFormat.setInteger("i-frame-interval", 1);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.f14969m = createEncoderByType;
        MediaCodecInfo.VideoCapabilities videoCapabilities = createEncoderByType.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
        if (videoCapabilities.isSizeSupported(i10, i10) && videoCapabilities.areSizeAndRateSupported(i10, i10, i11)) {
            this.f14963f.b("video encoder configure: codec=" + this.f14969m.getName() + ", format=" + createVideoFormat);
            this.f14969m.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f14972p = this.f14969m.createInputSurface();
            return;
        }
        throw new IOException(a4.a.n(i11, " fps", hg.k0.k("Video encoder does not support ", i10, "x", i10, " at ")));
    }

    public final boolean c(MediaCodec.BufferInfo bufferInfo, long j3) {
        ByteBuffer outputBuffer;
        int dequeueOutputBuffer = this.f14970n.dequeueOutputBuffer(bufferInfo, j3);
        boolean z10 = false;
        while (true) {
            boolean z11 = true;
            if (dequeueOutputBuffer < 0) {
                break;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0 && (outputBuffer = this.f14970n.getOutputBuffer(dequeueOutputBuffer)) != null) {
                if (bufferInfo.presentationTimeUs >= this.f14978w) {
                    this.U++;
                    this.V++;
                } else if (this.X) {
                    this.E++;
                    this.C += bufferInfo.size;
                    i(false, bufferInfo);
                    r(false, outputBuffer, bufferInfo);
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
                        this.f14965i.add(new k(allocateDirect, bufferInfo2));
                        long j10 = this.J;
                        if (j10 != Long.MIN_VALUE && bufferInfo.presentationTimeUs >= j10) {
                            d(j10, false);
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
            this.f14970n.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.f14970n.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            o(this.f14970n.getOutputFormat(), false);
        }
        if (z10 && !this.X && this.J != Long.MIN_VALUE) {
            d(this.J, true);
        }
        return z10;
    }

    public final void d(long j3, boolean z10) {
        ArrayList arrayList = this.f14965i;
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((k) arrayList.get(i10)).f14955b.presentationTimeUs >= j3) {
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
            } else if (i10 > 0 && j3 - ((k) arrayList.get(i10 - 1)).f14955b.presentationTimeUs <= ((k) arrayList.get(i10)).f14955b.presentationTimeUs - j3) {
                i10--;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                this.U++;
            }
            k kVar = (k) arrayList.get(i10);
            this.Y = kVar.f14955b.presentationTimeUs - j3;
            while (i10 < arrayList.size()) {
                k kVar2 = (k) arrayList.get(i10);
                ByteBuffer byteBuffer = kVar2.f14954a;
                MediaCodec.BufferInfo bufferInfo = kVar2.f14955b;
                this.E++;
                this.C += bufferInfo.size;
                i(false, bufferInfo);
                r(false, byteBuffer, bufferInfo);
                i10++;
            }
            arrayList.clear();
            this.X = true;
            StringBuilder t10 = a4.a.t(j3, "A/V start aligned: videoPtsUs=", ", audioPtsUs=");
            t10.append(kVar.f14955b.presentationTimeUs);
            t10.append(", deltaUs=");
            t10.append(this.Y);
            this.f14963f.b(t10.toString());
        }
    }

    public final boolean e() {
        if (this.J != Long.MIN_VALUE && this.K != Long.MIN_VALUE && this.L != Long.MIN_VALUE && this.M != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void f(Thread thread) {
        if (thread != null) {
            try {
                thread.join(5000L);
                if (thread.isAlive()) {
                    m mVar = this.f14963f;
                    mVar.b("encoder thread did not stop: " + thread.getName());
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void h(long j3) {
        int i10;
        long j10 = this.f14979x;
        long max = Math.max(0L, j10 - 256);
        do {
            j10--;
            if (j10 >= max) {
                i10 = (int) (j10 % 256);
            } else {
                return;
            }
        } while (this.f14967k[i10] != j3);
        long nanoTime = System.nanoTime() - this.f14968l[i10];
        this.F++;
        this.G += nanoTime;
        this.H = Math.max(this.H, nanoTime);
        if (this.F % 30 == 0) {
            this.f14963f.b("codec latency: average=" + ((((float) this.G) / this.F) / 1000000.0f) + " ms, max=" + (((float) this.H) / 1000000.0f) + " ms");
        }
    }

    public final void i(boolean z10, MediaCodec.BufferInfo bufferInfo) {
        long j3 = bufferInfo.presentationTimeUs;
        if (z10) {
            if (this.J == Long.MIN_VALUE) {
                this.J = j3;
            }
            long j10 = this.K;
            if (j10 != Long.MIN_VALUE && j3 < j10) {
                this.Q++;
            }
            this.K = Math.max(j10, j3);
            if ((bufferInfo.flags & 1) != 0) {
                this.P++;
                long j11 = this.N;
                if (j11 != Long.MIN_VALUE) {
                    this.O = Math.max(this.O, j3 - j11);
                }
                this.N = j3;
                return;
            }
            return;
        }
        if (this.L == Long.MIN_VALUE) {
            this.L = j3;
        }
        long j12 = this.M;
        if (j12 != Long.MIN_VALUE && j3 < j12) {
            this.R++;
        }
        this.M = Math.max(j12, j3);
    }

    public final void j() {
        this.f14980y = false;
        this.f14981z = false;
        this.f14975s = null;
        this.f14976t = null;
        AudioRecord audioRecord = this.f14971o;
        if (audioRecord != null) {
            audioRecord.release();
            this.f14971o = null;
        }
        Surface surface = this.f14972p;
        if (surface != null) {
            surface.release();
            this.f14972p = null;
        }
        MediaCodec mediaCodec = this.f14969m;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.f14970n;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.f14970n = null;
        this.f14969m = null;
        this.f14974r = null;
        this.f14973q = null;
    }

    public final void k(RuntimeException runtimeException) {
        String str;
        StringBuilder sb2 = new StringBuilder("codec error");
        if (runtimeException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) runtimeException;
            str = ": diagnostic=" + codecException.getDiagnosticInfo() + ", recoverable=" + codecException.isRecoverable() + ", transient=" + codecException.isTransient();
        } else {
            str = "";
        }
        sb2.append(str);
        this.f14963f.a(sb2.toString(), runtimeException);
        if (this.h.compareAndSet(false, true)) {
            n4 n4Var = this.f14964g.f14852a;
            ((s0) n4Var.f12543b).f15049i.post(new h0(1, n4Var, runtimeException));
        }
    }

    public final long l() {
        synchronized (this) {
            try {
                if (this.f14980y && this.f14981z) {
                    if (this.f14977u) {
                        return this.f14978w;
                    }
                    this.f14977u = true;
                    long max = Math.max(0L, (SystemClock.elapsedRealtimeNanos() - this.A) / 1000);
                    this.f14978w = max;
                    AudioRecord audioRecord = this.f14971o;
                    if (audioRecord != null) {
                        try {
                            if (audioRecord.getRecordingState() == 3) {
                                audioRecord.stop();
                            }
                        } catch (IllegalStateException e7) {
                            this.f14963f.a("AudioRecord stop failed", e7);
                        }
                    }
                    m mVar = this.f14963f;
                    mVar.b("recording stop boundary: presentationTimeUs=" + max);
                    return max;
                }
                return Long.MAX_VALUE;
            } finally {
            }
        }
    }

    public final void m() {
        this.f14977u = false;
        this.v = false;
        this.f14978w = Long.MAX_VALUE;
        this.A = 0L;
        this.C = 0L;
        this.B = 0L;
        this.E = 0;
        this.D = 0;
        this.f14979x = 0L;
        this.F = 0;
        this.H = 0L;
        this.G = 0L;
        this.K = Long.MIN_VALUE;
        this.J = Long.MIN_VALUE;
        this.M = Long.MIN_VALUE;
        this.L = Long.MIN_VALUE;
        this.N = Long.MIN_VALUE;
        this.O = 0L;
        this.P = 0;
        this.R = 0;
        this.Q = 0;
        this.T = 0;
        this.S = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = Long.MIN_VALUE;
        this.f14975s = null;
        this.f14976t = null;
        this.f14965i.clear();
    }

    public final long n(int i10) {
        long max = Math.max(0L, ((SystemClock.elapsedRealtimeNanos() - this.A) / 1000) - ((i10 * 1000000) / 48000));
        int i11 = Build.VERSION.SDK_INT;
        m mVar = this.f14963f;
        if (i11 >= 24) {
            AudioRecord audioRecord = this.f14971o;
            AudioTimestamp audioTimestamp = this.f14966j;
            if (audioRecord.getTimestamp(audioTimestamp, 1) == 0) {
                long max2 = Math.max(0L, ((audioTimestamp.nanoTime - this.A) / 1000) - ((audioTimestamp.framePosition * 1000000) / 48000));
                mVar.b("audio timestamp alignment: framePosition=" + audioTimestamp.framePosition + ", timestampDeltaUs=" + ((audioTimestamp.nanoTime - this.A) / 1000) + ", timestampBaseUs=" + max2 + ", readCompletionBaseUs=" + max);
                return max2;
            }
        }
        mVar.b("audio timestamp unavailable: readCompletionBaseUs=" + max);
        return max;
    }

    public final void o(MediaFormat mediaFormat, boolean z10) {
        int remaining;
        String str;
        if (z10) {
            try {
                if (mediaFormat.containsKey("prepend-sps-pps-to-idr-frames") && mediaFormat.getInteger("prepend-sps-pps-to-idr-frames") == 1) {
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                    ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                    int i10 = 0;
                    if (byteBuffer == null) {
                        remaining = 0;
                    } else {
                        remaining = byteBuffer.remaining();
                    }
                    if (byteBuffer2 != null) {
                        i10 = byteBuffer2.remaining();
                    }
                    this.I = remaining + i10;
                }
            } catch (IOException e7) {
                throw new IllegalStateException(e7);
            }
        }
        this.f14959a.l(mediaFormat, z10);
        m mVar = this.f14963f;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            str = "video";
        } else {
            str = "audio";
        }
        sb2.append(str);
        sb2.append(" output format: ");
        sb2.append(mediaFormat);
        mVar.b(sb2.toString());
    }

    public final synchronized void p(c cVar, c cVar2) {
        if (this.f14981z) {
            return;
        }
        if (this.f14980y) {
            try {
                this.f14970n.start();
                this.f14971o.startRecording();
                if (this.f14971o.getRecordingState() == 3) {
                    this.A = SystemClock.elapsedRealtimeNanos();
                    this.f14975s = cVar;
                    this.f14976t = cVar2;
                    this.f14981z = true;
                    m mVar = this.f14963f;
                    mVar.b("audio and video recording started: timeOriginNs=" + this.A + ", timelineOffsetUs=" + this.f14960b + ", audioSessionId=" + this.f14971o.getAudioSessionId());
                    this.f14973q = new Thread(new Runnable(this) {
                        public final l f14943b;

                        {
                            this.f14943b = this;
                        }

                        @Override
                        public final void run() {
                            boolean z10;
                            long j3;
                            long j10;
                            long j11;
                            String str;
                            long j12;
                            long j13;
                            int i10 = r2;
                            l lVar = this.f14943b;
                            lVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = lVar.f14969m.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                lVar.o(lVar.f14969m.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    if (bufferInfo.presentationTimeUs < lVar.f14978w) {
                                                        lVar.D++;
                                                        lVar.B += bufferInfo.size;
                                                        lVar.i(true, bufferInfo);
                                                        lVar.h(bufferInfo.presentationTimeUs);
                                                        lVar.r(true, lVar.f14969m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                    } else {
                                                        lVar.W++;
                                                    }
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                lVar.f14969m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e7) {
                                            if (!lVar.f14977u) {
                                                lVar.k(e7);
                                                return;
                                            } else {
                                                lVar.f14963f.a("video drain failed while stopping", e7);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                                default:
                                    Process.setThreadPriority(-16);
                                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                                    long j14 = Long.MIN_VALUE;
                                    boolean z12 = false;
                                    long j15 = Long.MIN_VALUE;
                                    boolean z13 = false;
                                    long j16 = 0;
                                    while (!z12) {
                                        if (z13) {
                                            j3 = 10000;
                                        } else {
                                            j3 = 0;
                                        }
                                        try {
                                            z12 = lVar.c(bufferInfo2, j3);
                                            if (!z12) {
                                                int dequeueInputBuffer = lVar.f14970n.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (lVar.f14977u) {
                                                        if (j15 == j14) {
                                                            j13 = 0;
                                                        } else {
                                                            j13 = j15 + ((1000000 * j16) / 48000);
                                                        }
                                                        lVar.f14970n.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = lVar.f14970n.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            lVar.f14970n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j10 = j14;
                                                            int read = lVar.f14971o.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i11 = lVar.S + 1;
                                                                    lVar.S = i11;
                                                                    if (read == -6 || i11 >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    lVar.T++;
                                                                }
                                                                if (j15 == j10) {
                                                                    j12 = 0;
                                                                } else {
                                                                    j12 = j15 + ((1000000 * j16) / 48000);
                                                                }
                                                                lVar.f14970n.queueInputBuffer(dequeueInputBuffer, 0, 0, j12, 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j15 == j10) {
                                                                    long n10 = lVar.n(i12);
                                                                    m mVar2 = lVar.f14963f;
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    sb2.append("first audio input: basePtsUs=");
                                                                    sb2.append(n10);
                                                                    sb2.append(", frames=");
                                                                    sb2.append(i12);
                                                                    sb2.append(", timestampSource=");
                                                                    j11 = 48000;
                                                                    if (Build.VERSION.SDK_INT >= 24) {
                                                                        str = "AudioTimestamp";
                                                                    } else {
                                                                        str = "read completion";
                                                                    }
                                                                    sb2.append(str);
                                                                    mVar2.b(sb2.toString());
                                                                    j15 = n10;
                                                                } else {
                                                                    j11 = 48000;
                                                                }
                                                                lVar.f14970n.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j15 + ((1000000 * j16) / j11), 0);
                                                                j16 += i12;
                                                                synchronized (lVar) {
                                                                    if (lVar.f14975s != null && !lVar.f14977u) {
                                                                        c cVar3 = lVar.f14975s;
                                                                        lVar.f14975s = null;
                                                                        lVar.f14963f.b("audio capture ready; waiting for common A/V start frame");
                                                                        cVar3.run();
                                                                    }
                                                                }
                                                            }
                                                            j14 = j10;
                                                        }
                                                    }
                                                }
                                                j10 = j14;
                                                j14 = j10;
                                            } else {
                                                return;
                                            }
                                        } catch (RuntimeException e10) {
                                            if (!lVar.f14977u) {
                                                lVar.k(e10);
                                                return;
                                            } else {
                                                lVar.f14963f.a("audio capture failed while stopping", e10);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoVideoEncoder");
                    this.f14974r = new Thread(new Runnable(this) {
                        public final l f14943b;

                        {
                            this.f14943b = this;
                        }

                        @Override
                        public final void run() {
                            boolean z10;
                            long j3;
                            long j10;
                            long j11;
                            String str;
                            long j12;
                            long j13;
                            int i10 = r2;
                            l lVar = this.f14943b;
                            lVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = lVar.f14969m.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                lVar.o(lVar.f14969m.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    if (bufferInfo.presentationTimeUs < lVar.f14978w) {
                                                        lVar.D++;
                                                        lVar.B += bufferInfo.size;
                                                        lVar.i(true, bufferInfo);
                                                        lVar.h(bufferInfo.presentationTimeUs);
                                                        lVar.r(true, lVar.f14969m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                    } else {
                                                        lVar.W++;
                                                    }
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                lVar.f14969m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e7) {
                                            if (!lVar.f14977u) {
                                                lVar.k(e7);
                                                return;
                                            } else {
                                                lVar.f14963f.a("video drain failed while stopping", e7);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                                default:
                                    Process.setThreadPriority(-16);
                                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                                    long j14 = Long.MIN_VALUE;
                                    boolean z12 = false;
                                    long j15 = Long.MIN_VALUE;
                                    boolean z13 = false;
                                    long j16 = 0;
                                    while (!z12) {
                                        if (z13) {
                                            j3 = 10000;
                                        } else {
                                            j3 = 0;
                                        }
                                        try {
                                            z12 = lVar.c(bufferInfo2, j3);
                                            if (!z12) {
                                                int dequeueInputBuffer = lVar.f14970n.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (lVar.f14977u) {
                                                        if (j15 == j14) {
                                                            j13 = 0;
                                                        } else {
                                                            j13 = j15 + ((1000000 * j16) / 48000);
                                                        }
                                                        lVar.f14970n.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = lVar.f14970n.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            lVar.f14970n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j10 = j14;
                                                            int read = lVar.f14971o.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i11 = lVar.S + 1;
                                                                    lVar.S = i11;
                                                                    if (read == -6 || i11 >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    lVar.T++;
                                                                }
                                                                if (j15 == j10) {
                                                                    j12 = 0;
                                                                } else {
                                                                    j12 = j15 + ((1000000 * j16) / 48000);
                                                                }
                                                                lVar.f14970n.queueInputBuffer(dequeueInputBuffer, 0, 0, j12, 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j15 == j10) {
                                                                    long n10 = lVar.n(i12);
                                                                    m mVar2 = lVar.f14963f;
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    sb2.append("first audio input: basePtsUs=");
                                                                    sb2.append(n10);
                                                                    sb2.append(", frames=");
                                                                    sb2.append(i12);
                                                                    sb2.append(", timestampSource=");
                                                                    j11 = 48000;
                                                                    if (Build.VERSION.SDK_INT >= 24) {
                                                                        str = "AudioTimestamp";
                                                                    } else {
                                                                        str = "read completion";
                                                                    }
                                                                    sb2.append(str);
                                                                    mVar2.b(sb2.toString());
                                                                    j15 = n10;
                                                                } else {
                                                                    j11 = 48000;
                                                                }
                                                                lVar.f14970n.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j15 + ((1000000 * j16) / j11), 0);
                                                                j16 += i12;
                                                                synchronized (lVar) {
                                                                    if (lVar.f14975s != null && !lVar.f14977u) {
                                                                        c cVar3 = lVar.f14975s;
                                                                        lVar.f14975s = null;
                                                                        lVar.f14963f.b("audio capture ready; waiting for common A/V start frame");
                                                                        cVar3.run();
                                                                    }
                                                                }
                                                            }
                                                            j14 = j10;
                                                        }
                                                    }
                                                }
                                                j10 = j14;
                                                j14 = j10;
                                            } else {
                                                return;
                                            }
                                        } catch (RuntimeException e10) {
                                            if (!lVar.f14977u) {
                                                lVar.k(e10);
                                                return;
                                            } else {
                                                lVar.f14963f.a("audio capture failed while stopping", e10);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoAudioEncoder");
                    this.f14973q.start();
                    this.f14974r.start();
                    return;
                }
                throw new IllegalStateException("Unable to start AudioRecord");
            } catch (RuntimeException e7) {
                j();
                throw e7;
            }
        }
        throw new IllegalStateException("Recorder is not prepared");
    }

    public final void q() {
        long j3;
        long j10;
        long j11;
        long j12;
        String valueOf;
        String valueOf2;
        String valueOf3;
        String valueOf4;
        Long valueOf5;
        String valueOf6;
        l();
        synchronized (this) {
            try {
                if (this.f14980y && !this.v) {
                    if (!this.f14981z) {
                        j();
                        return;
                    }
                    this.v = true;
                    try {
                        this.f14969m.signalEndOfInputStream();
                    } catch (IllegalStateException e7) {
                        this.f14963f.a("video encoder EOS failed", e7);
                    }
                    f(this.f14973q);
                    f(this.f14974r);
                    Object obj = "n/a";
                    if (e()) {
                        j3 = this.L - this.J;
                    } else {
                        j3 = Long.MIN_VALUE;
                    }
                    if (e()) {
                        j10 = this.M - this.K;
                    } else {
                        j10 = Long.MIN_VALUE;
                    }
                    long j13 = this.J;
                    long j14 = this.K;
                    if (j13 != Long.MIN_VALUE && j14 > j13) {
                        j11 = j14 - j13;
                    } else {
                        j11 = 0;
                    }
                    long j15 = this.L;
                    long j16 = this.M;
                    if (j15 != Long.MIN_VALUE && j16 > j15) {
                        j12 = j16 - j15;
                    } else {
                        j12 = 0;
                    }
                    m mVar = this.f14963f;
                    StringBuilder sb2 = new StringBuilder("codec summary: videoBuffers=");
                    sb2.append(this.D);
                    sb2.append(", videoBytes=");
                    sb2.append(this.B);
                    sb2.append(", videoPts=");
                    long j17 = j12;
                    sb2.append(g(this.J, this.K));
                    sb2.append(", actualVideoBitrate=");
                    long j18 = this.B;
                    if (j11 <= 0) {
                        valueOf = "n/a";
                    } else {
                        valueOf = String.valueOf((j18 * 8000000) / j11);
                    }
                    sb2.append(valueOf);
                    sb2.append(", keyframes=");
                    sb2.append(this.P);
                    sb2.append(", maxKeyframeIntervalUs=");
                    sb2.append(this.O);
                    sb2.append(", nonMonotonicVideoPts=");
                    sb2.append(this.Q);
                    sb2.append(", audioBuffers=");
                    sb2.append(this.E);
                    sb2.append(", audioBytes=");
                    sb2.append(this.C);
                    sb2.append(", audioPts=");
                    sb2.append(g(this.L, this.M));
                    sb2.append(", actualAudioBitrate=");
                    long j19 = this.C;
                    if (j17 <= 0) {
                        valueOf2 = "n/a";
                    } else {
                        valueOf2 = String.valueOf((j19 * 8000000) / j17);
                    }
                    sb2.append(valueOf2);
                    sb2.append(", nonMonotonicAudioPts=");
                    sb2.append(this.R);
                    sb2.append(", avStartDeltaUs=");
                    if (j3 == Long.MIN_VALUE) {
                        valueOf3 = "n/a";
                    } else {
                        valueOf3 = String.valueOf(j3);
                    }
                    sb2.append(valueOf3);
                    sb2.append(", avEndDeltaUs=");
                    if (j10 == Long.MIN_VALUE) {
                        valueOf4 = "n/a";
                    } else {
                        valueOf4 = String.valueOf(j10);
                    }
                    sb2.append(valueOf4);
                    sb2.append(", audioReadErrors=");
                    sb2.append(this.S);
                    sb2.append(", emptyAudioReads=");
                    sb2.append(this.T);
                    sb2.append(", droppedAudioBuffers=");
                    sb2.append(this.U);
                    sb2.append(", droppedAudioAfterStop=");
                    sb2.append(this.V);
                    sb2.append(", droppedVideoAfterStop=");
                    sb2.append(this.W);
                    sb2.append(", stopPresentationTimeUs=");
                    if (this.f14978w == Long.MAX_VALUE) {
                        valueOf5 = "n/a";
                    } else {
                        valueOf5 = Long.valueOf(this.f14978w);
                    }
                    sb2.append(valueOf5);
                    sb2.append(", alignedAudioStartDeltaUs=");
                    long j20 = this.Y;
                    if (j20 == Long.MIN_VALUE) {
                        valueOf6 = "n/a";
                    } else {
                        valueOf6 = String.valueOf(j20);
                    }
                    sb2.append(valueOf6);
                    sb2.append(", codecLatencyAvgMs=");
                    int i10 = this.F;
                    if (i10 != 0) {
                        obj = Float.valueOf((((float) this.G) / i10) / 1000000.0f);
                    }
                    sb2.append(obj);
                    sb2.append(", codecLatencyMaxMs=");
                    sb2.append(((float) this.H) / 1000000.0f);
                    mVar.b(sb2.toString());
                    j();
                }
            } finally {
            }
        }
    }

    public final void r(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10;
        if (byteBuffer == null) {
            return;
        }
        if (z10) {
            try {
                int i11 = this.I;
                if (i11 > 0 && (bufferInfo.flags & 1) != 0 && (i10 = bufferInfo.size) > i11) {
                    bufferInfo.offset += i11;
                    bufferInfo.size = i10 - i11;
                }
            } catch (IOException e7) {
                throw new IllegalStateException(e7);
            }
        }
        this.f14959a.o(z10, byteBuffer, bufferInfo, this.f14960b);
    }
}
