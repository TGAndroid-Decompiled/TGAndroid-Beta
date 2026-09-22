package ki;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
public final class j {
    public long A;
    public long B;
    public int C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final q f13744a;
    public final long f13745b;
    public final int f13746c;
    public final int d;
    public final int e;
    public final k f13747f;
    public final a f13748g;
    public final AtomicBoolean h = new AtomicBoolean();
    public final long[] f13749i = new long[256];
    public final long[] f13750j = new long[256];
    public MediaCodec f13751k;
    public MediaCodec f13752l;
    public AudioRecord f13753m;
    public Surface f13754n;
    public Thread f13755o;
    public Thread f13756p;
    public volatile boolean f13757q;
    public volatile long f13758r;
    public boolean f13759s;
    public boolean f13760t;
    public long f13761u;
    public long v;
    public long f13762w;
    public int f13763x;
    public int f13764y;
    public int f13765z;

    public j(q qVar, long j3, int i10, int i11, int i12, k kVar, a aVar) {
        this.f13744a = qVar;
        this.f13745b = j3;
        this.f13746c = i10;
        this.d = i11;
        this.e = i12;
        this.f13747f = kVar;
        this.f13748g = aVar;
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
            int max = Math.max(minBufferSize * 2, 4096);
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 48000, 1);
            createAudioFormat.setInteger("aac-profile", 2);
            createAudioFormat.setInteger("bitrate", 64000);
            createAudioFormat.setInteger("max-input-size", max);
            this.f13752l = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f13747f.b("audio encoder configure: codec=" + this.f13752l.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
            this.f13752l.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
            this.f13753m = audioRecord;
            if (audioRecord.getState() == 1) {
                return;
            }
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
        throw new IllegalStateException("Unsupported audio recording configuration");
    }

    public final void b() {
        int i10 = this.f13746c;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i10, i10);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.d);
        createVideoFormat.setInteger("frame-rate", this.e);
        createVideoFormat.setInteger("i-frame-interval", 1);
        this.f13751k = MediaCodec.createEncoderByType("video/avc");
        this.f13747f.b("video encoder configure: codec=" + this.f13751k.getName() + ", format=" + createVideoFormat);
        this.f13751k.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.f13754n = this.f13751k.createInputSurface();
    }

    public final boolean c(MediaCodec.BufferInfo bufferInfo, long j3) {
        int dequeueOutputBuffer = this.f13752l.dequeueOutputBuffer(bufferInfo, j3);
        boolean z10 = false;
        while (dequeueOutputBuffer >= 0) {
            int i10 = bufferInfo.size;
            boolean z11 = true;
            if (i10 > 0 && (bufferInfo.flags & 2) == 0) {
                this.f13764y++;
                this.f13762w += i10;
                i(false, bufferInfo);
                p(false, this.f13752l.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
            }
            if ((bufferInfo.flags & 4) == 0) {
                z11 = false;
            }
            z10 |= z11;
            this.f13752l.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.f13752l.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            m(this.f13752l.getOutputFormat(), false);
        }
        return z10;
    }

    public final boolean d() {
        if (this.D != Long.MIN_VALUE && this.E != Long.MIN_VALUE && this.F != Long.MIN_VALUE && this.G != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void e(Thread thread) {
        if (thread != null) {
            try {
                thread.join(5000L);
                if (thread.isAlive()) {
                    k kVar = this.f13747f;
                    kVar.b("encoder thread did not stop: " + thread.getName());
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final synchronized Surface f() {
        if (this.f13759s) {
            return this.f13754n;
        }
        l();
        long nanoTime = System.nanoTime();
        try {
            b();
            a();
            this.f13751k.start();
            this.f13759s = true;
            k kVar = this.f13747f;
            kVar.b("codecs prepared: video=" + this.f13751k.getName() + ", audio=" + this.f13752l.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
            return this.f13754n;
        } catch (IOException | RuntimeException e) {
            j();
            throw e;
        }
    }

    public final void h(long j3) {
        int i10;
        long j10 = this.f13758r;
        long max = Math.max(0L, j10 - 256);
        do {
            j10--;
            if (j10 >= max) {
                i10 = (int) (j10 % 256);
            } else {
                return;
            }
        } while (this.f13749i[i10] != j3);
        long nanoTime = System.nanoTime() - this.f13750j[i10];
        this.f13765z++;
        this.A += nanoTime;
        this.B = Math.max(this.B, nanoTime);
        if (this.f13765z % 30 == 0) {
            this.f13747f.b("codec latency: average=" + ((((float) this.A) / this.f13765z) / 1000000.0f) + " ms, max=" + (((float) this.B) / 1000000.0f) + " ms");
        }
    }

    public final void i(boolean z10, MediaCodec.BufferInfo bufferInfo) {
        long j3 = bufferInfo.presentationTimeUs;
        if (z10) {
            if (this.D == Long.MIN_VALUE) {
                this.D = j3;
            }
            long j10 = this.E;
            if (j10 != Long.MIN_VALUE && j3 < j10) {
                this.K++;
            }
            this.E = Math.max(j10, j3);
            if ((bufferInfo.flags & 1) != 0) {
                this.J++;
                long j11 = this.H;
                if (j11 != Long.MIN_VALUE) {
                    this.I = Math.max(this.I, j3 - j11);
                }
                this.H = j3;
                return;
            }
            return;
        }
        if (this.F == Long.MIN_VALUE) {
            this.F = j3;
        }
        long j12 = this.G;
        if (j12 != Long.MIN_VALUE && j3 < j12) {
            this.L++;
        }
        this.G = Math.max(j12, j3);
    }

    public final void j() {
        this.f13759s = false;
        this.f13760t = false;
        AudioRecord audioRecord = this.f13753m;
        if (audioRecord != null) {
            audioRecord.release();
            this.f13753m = null;
        }
        Surface surface = this.f13754n;
        if (surface != null) {
            surface.release();
            this.f13754n = null;
        }
        MediaCodec mediaCodec = this.f13751k;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.f13752l;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.f13752l = null;
        this.f13751k = null;
        this.f13756p = null;
        this.f13755o = null;
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
        this.f13747f.a(sb2.toString(), runtimeException);
        if (this.h.compareAndSet(false, true)) {
            e0 e0Var = this.f13748g.f13649a;
            ((q0) e0Var.f13672b).h.post(new l(2, e0Var, runtimeException));
        }
    }

    public final void l() {
        this.f13757q = false;
        this.f13761u = 0L;
        this.f13762w = 0L;
        this.v = 0L;
        this.f13764y = 0;
        this.f13763x = 0;
        this.f13758r = 0L;
        this.f13765z = 0;
        this.B = 0L;
        this.A = 0L;
        this.E = Long.MIN_VALUE;
        this.D = Long.MIN_VALUE;
        this.G = Long.MIN_VALUE;
        this.F = Long.MIN_VALUE;
        this.H = Long.MIN_VALUE;
        this.I = 0L;
        this.J = 0;
        this.L = 0;
        this.K = 0;
        this.N = 0;
        this.M = 0;
    }

    public final void m(MediaFormat mediaFormat, boolean z10) {
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
                    this.C = remaining + i10;
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.f13744a.f(mediaFormat, z10);
        k kVar = this.f13747f;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            str = "video";
        } else {
            str = "audio";
        }
        sb2.append(str);
        sb2.append(" output format: ");
        sb2.append(mediaFormat);
        kVar.b(sb2.toString());
    }

    public final synchronized void n() {
        if (this.f13760t) {
            return;
        }
        if (this.f13759s) {
            try {
                this.f13761u = System.nanoTime();
                this.f13752l.start();
                this.f13753m.startRecording();
                if (this.f13753m.getRecordingState() == 3) {
                    this.f13760t = true;
                    k kVar = this.f13747f;
                    kVar.b("audio and video recording started: timeOriginNs=" + this.f13761u + ", timelineOffsetUs=" + this.f13745b + ", audioSessionId=" + this.f13753m.getAudioSessionId());
                    this.f13755o = new Thread(new Runnable(this) {
                        public final j f13740b;

                        {
                            this.f13740b = this;
                        }

                        @Override
                        public final void run() {
                            boolean z10;
                            long j3;
                            long j10;
                            int i10 = r2;
                            j jVar = this.f13740b;
                            jVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = jVar.f13751k.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                jVar.m(jVar.f13751k.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                int i11 = bufferInfo.size;
                                                if (i11 > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    jVar.f13763x++;
                                                    jVar.v += i11;
                                                    jVar.i(true, bufferInfo);
                                                    jVar.h(bufferInfo.presentationTimeUs);
                                                    jVar.p(true, jVar.f13751k.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                jVar.f13751k.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e) {
                                            if (!jVar.f13757q) {
                                                jVar.k(e);
                                                return;
                                            } else {
                                                jVar.f13747f.a("video drain failed while stopping", e);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                                default:
                                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                                    long j11 = 0;
                                    boolean z12 = false;
                                    long j12 = 0;
                                    boolean z13 = false;
                                    long j13 = Long.MIN_VALUE;
                                    while (!z12) {
                                        if (z13) {
                                            j3 = 10000;
                                        } else {
                                            j3 = j11;
                                        }
                                        try {
                                            z12 = jVar.c(bufferInfo2, j3);
                                            if (!z12) {
                                                int dequeueInputBuffer = jVar.f13752l.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (jVar.f13757q) {
                                                        if (j13 == Long.MIN_VALUE) {
                                                            j10 = j11;
                                                        } else {
                                                            j10 = j13 + ((1000000 * j12) / 48000);
                                                        }
                                                        jVar.f13752l.queueInputBuffer(dequeueInputBuffer, 0, 0, j10, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = jVar.f13752l.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            jVar.f13752l.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            int read = jVar.f13753m.read(inputBuffer, inputBuffer.remaining());
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    jVar.M++;
                                                                } else {
                                                                    jVar.N++;
                                                                }
                                                                jVar.f13752l.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j13 == Long.MIN_VALUE) {
                                                                    long nanoTime = (System.nanoTime() - jVar.f13761u) / 1000;
                                                                    long max = Math.max(j11, nanoTime - ((i12 * 1000000) / 48000));
                                                                    jVar.f13747f.b("first audio input: basePtsUs=" + max + ", frames=" + i12 + ", bufferEndUs=" + nanoTime);
                                                                    j13 = max;
                                                                }
                                                                jVar.f13752l.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j13 + ((1000000 * j12) / 48000), 0);
                                                                j12 += i12;
                                                                j11 = 0;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                return;
                                            }
                                        } catch (RuntimeException e7) {
                                            if (!jVar.f13757q) {
                                                jVar.k(e7);
                                                return;
                                            } else {
                                                jVar.f13747f.a("audio capture failed while stopping", e7);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoVideoEncoder");
                    this.f13756p = new Thread(new Runnable(this) {
                        public final j f13740b;

                        {
                            this.f13740b = this;
                        }

                        @Override
                        public final void run() {
                            boolean z10;
                            long j3;
                            long j10;
                            int i10 = r2;
                            j jVar = this.f13740b;
                            jVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = jVar.f13751k.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                jVar.m(jVar.f13751k.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                int i11 = bufferInfo.size;
                                                if (i11 > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    jVar.f13763x++;
                                                    jVar.v += i11;
                                                    jVar.i(true, bufferInfo);
                                                    jVar.h(bufferInfo.presentationTimeUs);
                                                    jVar.p(true, jVar.f13751k.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                jVar.f13751k.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e) {
                                            if (!jVar.f13757q) {
                                                jVar.k(e);
                                                return;
                                            } else {
                                                jVar.f13747f.a("video drain failed while stopping", e);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                                default:
                                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                                    long j11 = 0;
                                    boolean z12 = false;
                                    long j12 = 0;
                                    boolean z13 = false;
                                    long j13 = Long.MIN_VALUE;
                                    while (!z12) {
                                        if (z13) {
                                            j3 = 10000;
                                        } else {
                                            j3 = j11;
                                        }
                                        try {
                                            z12 = jVar.c(bufferInfo2, j3);
                                            if (!z12) {
                                                int dequeueInputBuffer = jVar.f13752l.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (jVar.f13757q) {
                                                        if (j13 == Long.MIN_VALUE) {
                                                            j10 = j11;
                                                        } else {
                                                            j10 = j13 + ((1000000 * j12) / 48000);
                                                        }
                                                        jVar.f13752l.queueInputBuffer(dequeueInputBuffer, 0, 0, j10, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = jVar.f13752l.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            jVar.f13752l.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            int read = jVar.f13753m.read(inputBuffer, inputBuffer.remaining());
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    jVar.M++;
                                                                } else {
                                                                    jVar.N++;
                                                                }
                                                                jVar.f13752l.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j13 == Long.MIN_VALUE) {
                                                                    long nanoTime = (System.nanoTime() - jVar.f13761u) / 1000;
                                                                    long max = Math.max(j11, nanoTime - ((i12 * 1000000) / 48000));
                                                                    jVar.f13747f.b("first audio input: basePtsUs=" + max + ", frames=" + i12 + ", bufferEndUs=" + nanoTime);
                                                                    j13 = max;
                                                                }
                                                                jVar.f13752l.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j13 + ((1000000 * j12) / 48000), 0);
                                                                j12 += i12;
                                                                j11 = 0;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                return;
                                            }
                                        } catch (RuntimeException e7) {
                                            if (!jVar.f13757q) {
                                                jVar.k(e7);
                                                return;
                                            } else {
                                                jVar.f13747f.a("audio capture failed while stopping", e7);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoAudioEncoder");
                    this.f13755o.start();
                    this.f13756p.start();
                    return;
                }
                throw new IllegalStateException("Unable to start AudioRecord");
            } catch (RuntimeException e) {
                j();
                throw e;
            }
        }
        throw new IllegalStateException("Recorder is not prepared");
    }

    public final void o() {
        long j3;
        long j10;
        long j11;
        long j12;
        String valueOf;
        String valueOf2;
        String valueOf3;
        String valueOf4;
        Object valueOf5;
        synchronized (this) {
            try {
                if (this.f13759s && !this.f13757q) {
                    if (!this.f13760t) {
                        j();
                        return;
                    }
                    this.f13757q = true;
                    try {
                        this.f13753m.stop();
                    } catch (IllegalStateException unused) {
                    }
                    try {
                        this.f13751k.signalEndOfInputStream();
                    } catch (IllegalStateException e) {
                        this.f13747f.a("video encoder EOS failed", e);
                    }
                    e(this.f13755o);
                    e(this.f13756p);
                    if (d()) {
                        j3 = this.F - this.D;
                    } else {
                        j3 = Long.MIN_VALUE;
                    }
                    if (d()) {
                        j10 = this.G - this.E;
                    } else {
                        j10 = Long.MIN_VALUE;
                    }
                    long j13 = this.D;
                    long j14 = this.E;
                    if (j13 != Long.MIN_VALUE && j14 > j13) {
                        j11 = j14 - j13;
                    } else {
                        j11 = 0;
                    }
                    long j15 = this.F;
                    long j16 = this.G;
                    if (j15 != Long.MIN_VALUE && j16 > j15) {
                        j12 = j16 - j15;
                    } else {
                        j12 = 0;
                    }
                    k kVar = this.f13747f;
                    StringBuilder sb2 = new StringBuilder("codec summary: videoBuffers=");
                    sb2.append(this.f13763x);
                    sb2.append(", videoBytes=");
                    sb2.append(this.v);
                    sb2.append(", videoPts=");
                    sb2.append(g(this.D, this.E));
                    sb2.append(", actualVideoBitrate=");
                    long j17 = this.v;
                    if (j11 <= 0) {
                        valueOf = "n/a";
                    } else {
                        valueOf = String.valueOf((j17 * 8000000) / j11);
                    }
                    sb2.append(valueOf);
                    sb2.append(", keyframes=");
                    sb2.append(this.J);
                    sb2.append(", maxKeyframeIntervalUs=");
                    sb2.append(this.I);
                    sb2.append(", nonMonotonicVideoPts=");
                    sb2.append(this.K);
                    sb2.append(", audioBuffers=");
                    sb2.append(this.f13764y);
                    sb2.append(", audioBytes=");
                    sb2.append(this.f13762w);
                    sb2.append(", audioPts=");
                    sb2.append(g(this.F, this.G));
                    sb2.append(", actualAudioBitrate=");
                    long j18 = this.f13762w;
                    if (j12 <= 0) {
                        valueOf2 = "n/a";
                    } else {
                        valueOf2 = String.valueOf((j18 * 8000000) / j12);
                    }
                    sb2.append(valueOf2);
                    sb2.append(", nonMonotonicAudioPts=");
                    sb2.append(this.L);
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
                    sb2.append(this.M);
                    sb2.append(", emptyAudioReads=");
                    sb2.append(this.N);
                    sb2.append(", codecLatencyAvgMs=");
                    int i10 = this.f13765z;
                    if (i10 == 0) {
                        valueOf5 = "n/a";
                    } else {
                        valueOf5 = Float.valueOf((((float) this.A) / i10) / 1000000.0f);
                    }
                    sb2.append(valueOf5);
                    sb2.append(", codecLatencyMaxMs=");
                    sb2.append(((float) this.B) / 1000000.0f);
                    kVar.b(sb2.toString());
                    j();
                }
            } finally {
            }
        }
    }

    public final void p(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10;
        if (byteBuffer == null) {
            return;
        }
        if (z10) {
            try {
                int i11 = this.C;
                if (i11 > 0 && (bufferInfo.flags & 1) != 0 && (i10 = bufferInfo.size) > i11) {
                    bufferInfo.offset += i11;
                    bufferInfo.size = i10 - i11;
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.f13744a.g(z10, byteBuffer, bufferInfo, this.f13745b);
    }
}
