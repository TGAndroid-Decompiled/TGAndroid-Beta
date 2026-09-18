package ki;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
public final class i {
    public long A;
    public int B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final o f13727a;
    public final long f13728b;
    public final int f13729c;
    public final int d;
    public final j e;
    public final b f13730f;
    public final AtomicBoolean f13731g = new AtomicBoolean();
    public final long[] h = new long[256];
    public final long[] f13732i = new long[256];
    public MediaCodec f13733j;
    public MediaCodec f13734k;
    public AudioRecord f13735l;
    public Surface f13736m;
    public Thread f13737n;
    public Thread f13738o;
    public volatile boolean f13739p;
    public volatile long f13740q;
    public boolean f13741r;
    public boolean f13742s;
    public long f13743t;
    public long f13744u;
    public long v;
    public int f13745w;
    public int f13746x;
    public int f13747y;
    public long f13748z;

    public i(o oVar, long j3, int i10, int i11, j jVar, b bVar) {
        this.f13727a = oVar;
        this.f13728b = j3;
        this.f13729c = i10;
        this.d = i11;
        this.e = jVar;
        this.f13730f = bVar;
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
            this.f13734k = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.e.b("audio encoder configure: codec=" + this.f13734k.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
            this.f13734k.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
            this.f13735l = audioRecord;
            if (audioRecord.getState() == 1) {
                return;
            }
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
        throw new IllegalStateException("Unsupported audio recording configuration");
    }

    public final void b() {
        int i10 = this.f13729c;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i10, i10);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.d);
        createVideoFormat.setInteger("frame-rate", 30);
        createVideoFormat.setInteger("i-frame-interval", 1);
        this.f13733j = MediaCodec.createEncoderByType("video/avc");
        this.e.b("video encoder configure: codec=" + this.f13733j.getName() + ", format=" + createVideoFormat);
        this.f13733j.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.f13736m = this.f13733j.createInputSurface();
    }

    public final boolean c(MediaCodec.BufferInfo bufferInfo, long j3) {
        int dequeueOutputBuffer = this.f13734k.dequeueOutputBuffer(bufferInfo, j3);
        boolean z10 = false;
        while (dequeueOutputBuffer >= 0) {
            int i10 = bufferInfo.size;
            boolean z11 = true;
            if (i10 > 0 && (bufferInfo.flags & 2) == 0) {
                this.f13746x++;
                this.v += i10;
                i(false, bufferInfo);
                p(false, this.f13734k.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
            }
            if ((bufferInfo.flags & 4) == 0) {
                z11 = false;
            }
            z10 |= z11;
            this.f13734k.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.f13734k.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            m(this.f13734k.getOutputFormat(), false);
        }
        return z10;
    }

    public final boolean d() {
        if (this.C != Long.MIN_VALUE && this.D != Long.MIN_VALUE && this.E != Long.MIN_VALUE && this.F != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void e(Thread thread) {
        if (thread != null) {
            try {
                thread.join(5000L);
                if (thread.isAlive()) {
                    j jVar = this.e;
                    jVar.b("encoder thread did not stop: " + thread.getName());
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final synchronized Surface f() {
        if (this.f13741r) {
            return this.f13736m;
        }
        l();
        long nanoTime = System.nanoTime();
        try {
            b();
            a();
            this.f13733j.start();
            this.f13741r = true;
            j jVar = this.e;
            jVar.b("codecs prepared: video=" + this.f13733j.getName() + ", audio=" + this.f13734k.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
            return this.f13736m;
        } catch (IOException | RuntimeException e) {
            j();
            throw e;
        }
    }

    public final void h(long j3) {
        int i10;
        long j10 = this.f13740q;
        long max = Math.max(0L, j10 - 256);
        do {
            j10--;
            if (j10 >= max) {
                i10 = (int) (j10 % 256);
            } else {
                return;
            }
        } while (this.h[i10] != j3);
        long nanoTime = System.nanoTime() - this.f13732i[i10];
        this.f13747y++;
        this.f13748z += nanoTime;
        this.A = Math.max(this.A, nanoTime);
        if (this.f13747y % 30 == 0) {
            this.e.b("codec latency: average=" + ((((float) this.f13748z) / this.f13747y) / 1000000.0f) + " ms, max=" + (((float) this.A) / 1000000.0f) + " ms");
        }
    }

    public final void i(boolean z10, MediaCodec.BufferInfo bufferInfo) {
        long j3 = bufferInfo.presentationTimeUs;
        if (z10) {
            if (this.C == Long.MIN_VALUE) {
                this.C = j3;
            }
            long j10 = this.D;
            if (j10 != Long.MIN_VALUE && j3 < j10) {
                this.J++;
            }
            this.D = Math.max(j10, j3);
            if ((bufferInfo.flags & 1) != 0) {
                this.I++;
                long j11 = this.G;
                if (j11 != Long.MIN_VALUE) {
                    this.H = Math.max(this.H, j3 - j11);
                }
                this.G = j3;
                return;
            }
            return;
        }
        if (this.E == Long.MIN_VALUE) {
            this.E = j3;
        }
        long j12 = this.F;
        if (j12 != Long.MIN_VALUE && j3 < j12) {
            this.K++;
        }
        this.F = Math.max(j12, j3);
    }

    public final void j() {
        this.f13741r = false;
        this.f13742s = false;
        AudioRecord audioRecord = this.f13735l;
        if (audioRecord != null) {
            audioRecord.release();
            this.f13735l = null;
        }
        Surface surface = this.f13736m;
        if (surface != null) {
            surface.release();
            this.f13736m = null;
        }
        MediaCodec mediaCodec = this.f13733j;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.f13734k;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.f13734k = null;
        this.f13733j = null;
        this.f13738o = null;
        this.f13737n = null;
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
        this.e.a(sb2.toString(), runtimeException);
        if (this.f13731g.compareAndSet(false, true)) {
            k2.u uVar = this.f13730f.f13655a;
            ((h0) uVar.f13383b).h.post(new c0(0, uVar, runtimeException));
        }
    }

    public final void l() {
        this.f13739p = false;
        this.f13743t = 0L;
        this.v = 0L;
        this.f13744u = 0L;
        this.f13746x = 0;
        this.f13745w = 0;
        this.f13740q = 0L;
        this.f13747y = 0;
        this.A = 0L;
        this.f13748z = 0L;
        this.D = Long.MIN_VALUE;
        this.C = Long.MIN_VALUE;
        this.F = Long.MIN_VALUE;
        this.E = Long.MIN_VALUE;
        this.G = Long.MIN_VALUE;
        this.H = 0L;
        this.I = 0;
        this.K = 0;
        this.J = 0;
        this.M = 0;
        this.L = 0;
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
                    this.B = remaining + i10;
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.f13727a.f(mediaFormat, z10);
        j jVar = this.e;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            str = "video";
        } else {
            str = "audio";
        }
        sb2.append(str);
        sb2.append(" output format: ");
        sb2.append(mediaFormat);
        jVar.b(sb2.toString());
    }

    public final synchronized void n() {
        if (this.f13742s) {
            return;
        }
        if (this.f13741r) {
            try {
                this.f13743t = System.nanoTime();
                this.f13734k.start();
                this.f13735l.startRecording();
                if (this.f13735l.getRecordingState() == 3) {
                    this.f13742s = true;
                    j jVar = this.e;
                    jVar.b("audio and video recording started: timeOriginNs=" + this.f13743t + ", timelineOffsetUs=" + this.f13728b + ", audioSessionId=" + this.f13735l.getAudioSessionId());
                    this.f13737n = new Thread(new Runnable(this) {
                        public final i f13704b;

                        {
                            this.f13704b = this;
                        }

                        @Override
                        public final void run() {
                            boolean z10;
                            long j3;
                            long j10;
                            int i10 = r2;
                            i iVar = this.f13704b;
                            iVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = iVar.f13733j.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                iVar.m(iVar.f13733j.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                int i11 = bufferInfo.size;
                                                if (i11 > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    iVar.f13745w++;
                                                    iVar.f13744u += i11;
                                                    iVar.i(true, bufferInfo);
                                                    iVar.h(bufferInfo.presentationTimeUs);
                                                    iVar.p(true, iVar.f13733j.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                iVar.f13733j.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e) {
                                            if (!iVar.f13739p) {
                                                iVar.k(e);
                                                return;
                                            } else {
                                                iVar.e.a("video drain failed while stopping", e);
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
                                            z12 = iVar.c(bufferInfo2, j3);
                                            if (!z12) {
                                                int dequeueInputBuffer = iVar.f13734k.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (iVar.f13739p) {
                                                        if (j13 == Long.MIN_VALUE) {
                                                            j10 = j11;
                                                        } else {
                                                            j10 = j13 + ((1000000 * j12) / 48000);
                                                        }
                                                        iVar.f13734k.queueInputBuffer(dequeueInputBuffer, 0, 0, j10, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = iVar.f13734k.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            iVar.f13734k.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            int read = iVar.f13735l.read(inputBuffer, inputBuffer.remaining());
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    iVar.L++;
                                                                } else {
                                                                    iVar.M++;
                                                                }
                                                                iVar.f13734k.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j13 == Long.MIN_VALUE) {
                                                                    long nanoTime = (System.nanoTime() - iVar.f13743t) / 1000;
                                                                    long max = Math.max(j11, nanoTime - ((i12 * 1000000) / 48000));
                                                                    iVar.e.b("first audio input: basePtsUs=" + max + ", frames=" + i12 + ", bufferEndUs=" + nanoTime);
                                                                    j13 = max;
                                                                }
                                                                iVar.f13734k.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j13 + ((1000000 * j12) / 48000), 0);
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
                                            if (!iVar.f13739p) {
                                                iVar.k(e7);
                                                return;
                                            } else {
                                                iVar.e.a("audio capture failed while stopping", e7);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoVideoEncoder");
                    this.f13738o = new Thread(new Runnable(this) {
                        public final i f13704b;

                        {
                            this.f13704b = this;
                        }

                        @Override
                        public final void run() {
                            boolean z10;
                            long j3;
                            long j10;
                            int i10 = r2;
                            i iVar = this.f13704b;
                            iVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = iVar.f13733j.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                iVar.m(iVar.f13733j.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                int i11 = bufferInfo.size;
                                                if (i11 > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    iVar.f13745w++;
                                                    iVar.f13744u += i11;
                                                    iVar.i(true, bufferInfo);
                                                    iVar.h(bufferInfo.presentationTimeUs);
                                                    iVar.p(true, iVar.f13733j.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                iVar.f13733j.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e) {
                                            if (!iVar.f13739p) {
                                                iVar.k(e);
                                                return;
                                            } else {
                                                iVar.e.a("video drain failed while stopping", e);
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
                                            z12 = iVar.c(bufferInfo2, j3);
                                            if (!z12) {
                                                int dequeueInputBuffer = iVar.f13734k.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (iVar.f13739p) {
                                                        if (j13 == Long.MIN_VALUE) {
                                                            j10 = j11;
                                                        } else {
                                                            j10 = j13 + ((1000000 * j12) / 48000);
                                                        }
                                                        iVar.f13734k.queueInputBuffer(dequeueInputBuffer, 0, 0, j10, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = iVar.f13734k.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            iVar.f13734k.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            int read = iVar.f13735l.read(inputBuffer, inputBuffer.remaining());
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    iVar.L++;
                                                                } else {
                                                                    iVar.M++;
                                                                }
                                                                iVar.f13734k.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j13 == Long.MIN_VALUE) {
                                                                    long nanoTime = (System.nanoTime() - iVar.f13743t) / 1000;
                                                                    long max = Math.max(j11, nanoTime - ((i12 * 1000000) / 48000));
                                                                    iVar.e.b("first audio input: basePtsUs=" + max + ", frames=" + i12 + ", bufferEndUs=" + nanoTime);
                                                                    j13 = max;
                                                                }
                                                                iVar.f13734k.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j13 + ((1000000 * j12) / 48000), 0);
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
                                            if (!iVar.f13739p) {
                                                iVar.k(e7);
                                                return;
                                            } else {
                                                iVar.e.a("audio capture failed while stopping", e7);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoAudioEncoder");
                    this.f13737n.start();
                    this.f13738o.start();
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
                if (this.f13741r && !this.f13739p) {
                    if (!this.f13742s) {
                        j();
                        return;
                    }
                    this.f13739p = true;
                    try {
                        this.f13735l.stop();
                    } catch (IllegalStateException unused) {
                    }
                    try {
                        this.f13733j.signalEndOfInputStream();
                    } catch (IllegalStateException e) {
                        this.e.a("video encoder EOS failed", e);
                    }
                    e(this.f13737n);
                    e(this.f13738o);
                    if (d()) {
                        j3 = this.E - this.C;
                    } else {
                        j3 = Long.MIN_VALUE;
                    }
                    if (d()) {
                        j10 = this.F - this.D;
                    } else {
                        j10 = Long.MIN_VALUE;
                    }
                    long j13 = this.C;
                    long j14 = this.D;
                    if (j13 != Long.MIN_VALUE && j14 > j13) {
                        j11 = j14 - j13;
                    } else {
                        j11 = 0;
                    }
                    long j15 = this.E;
                    long j16 = this.F;
                    if (j15 != Long.MIN_VALUE && j16 > j15) {
                        j12 = j16 - j15;
                    } else {
                        j12 = 0;
                    }
                    j jVar = this.e;
                    StringBuilder sb2 = new StringBuilder("codec summary: videoBuffers=");
                    sb2.append(this.f13745w);
                    sb2.append(", videoBytes=");
                    sb2.append(this.f13744u);
                    sb2.append(", videoPts=");
                    sb2.append(g(this.C, this.D));
                    sb2.append(", actualVideoBitrate=");
                    long j17 = this.f13744u;
                    if (j11 <= 0) {
                        valueOf = "n/a";
                    } else {
                        valueOf = String.valueOf((j17 * 8000000) / j11);
                    }
                    sb2.append(valueOf);
                    sb2.append(", keyframes=");
                    sb2.append(this.I);
                    sb2.append(", maxKeyframeIntervalUs=");
                    sb2.append(this.H);
                    sb2.append(", nonMonotonicVideoPts=");
                    sb2.append(this.J);
                    sb2.append(", audioBuffers=");
                    sb2.append(this.f13746x);
                    sb2.append(", audioBytes=");
                    sb2.append(this.v);
                    sb2.append(", audioPts=");
                    sb2.append(g(this.E, this.F));
                    sb2.append(", actualAudioBitrate=");
                    long j18 = this.v;
                    if (j12 <= 0) {
                        valueOf2 = "n/a";
                    } else {
                        valueOf2 = String.valueOf((j18 * 8000000) / j12);
                    }
                    sb2.append(valueOf2);
                    sb2.append(", nonMonotonicAudioPts=");
                    sb2.append(this.K);
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
                    sb2.append(this.L);
                    sb2.append(", emptyAudioReads=");
                    sb2.append(this.M);
                    sb2.append(", codecLatencyAvgMs=");
                    int i10 = this.f13747y;
                    if (i10 == 0) {
                        valueOf5 = "n/a";
                    } else {
                        valueOf5 = Float.valueOf((((float) this.f13748z) / i10) / 1000000.0f);
                    }
                    sb2.append(valueOf5);
                    sb2.append(", codecLatencyMaxMs=");
                    sb2.append(((float) this.A) / 1000000.0f);
                    jVar.b(sb2.toString());
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
                int i11 = this.B;
                if (i11 > 0 && (bufferInfo.flags & 1) != 0 && (i10 = bufferInfo.size) > i11) {
                    bufferInfo.offset += i11;
                    bufferInfo.size = i10 - i11;
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.f13727a.g(z10, byteBuffer, bufferInfo, this.f13728b);
    }
}
