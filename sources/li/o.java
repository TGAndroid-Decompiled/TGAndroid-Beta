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
import ji.d4;
import ji.v2;
public final class o implements t {
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
    public final x f14912a;
    public final long f14913b;
    public final int f14914c;
    public final int d;
    public final int e;
    public final p f14915f;
    public final c f14916g;
    public MediaCodec f14921m;
    public MediaCodec f14922n;
    public AudioRecord f14923o;
    public Surface f14924p;
    public Thread f14925q;
    public Thread f14926r;
    public d f14927s;
    public d f14928t;
    public volatile boolean f14929u;
    public boolean v;
    public volatile long f14931x;
    public boolean f14932y;
    public boolean f14933z;
    public final AtomicBoolean h = new AtomicBoolean();
    public final ArrayList f14917i = new ArrayList();
    public final AudioTimestamp f14918j = new AudioTimestamp();
    public final long[] f14919k = new long[256];
    public final long[] f14920l = new long[256];
    public volatile long f14930w = Long.MAX_VALUE;

    public o(x xVar, long j10, int i10, int i11, int i12, p pVar, c cVar) {
        this.f14912a = xVar;
        this.f14913b = j10;
        this.f14914c = i10;
        this.d = i11;
        this.e = i12;
        this.f14915f = pVar;
        this.f14916g = cVar;
    }

    public static String g(long j10, long j11) {
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
            this.f14922n = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f14915f.b("audio encoder configure: codec=" + this.f14922n.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
            this.f14922n.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
            this.f14923o = audioRecord;
            if (audioRecord.getState() == 1) {
                return;
            }
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
        throw new IllegalStateException("Unsupported audio recording configuration");
    }

    public final void b() {
        int i10 = this.f14914c;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i10, i10);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.d);
        int i11 = this.e;
        createVideoFormat.setInteger("frame-rate", i11);
        createVideoFormat.setInteger("i-frame-interval", 1);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.f14921m = createEncoderByType;
        MediaCodecInfo.VideoCapabilities videoCapabilities = createEncoderByType.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
        if (videoCapabilities.isSizeSupported(i10, i10) && videoCapabilities.areSizeAndRateSupported(i10, i10, i11)) {
            this.f14915f.b("video encoder configure: codec=" + this.f14921m.getName() + ", format=" + createVideoFormat);
            this.f14921m.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f14924p = this.f14921m.createInputSurface();
            return;
        }
        throw new IOException(a1.g.n(i11, " fps", i2.d.l("Video encoder does not support ", i10, "x", i10, " at ")));
    }

    public final boolean c(MediaCodec.BufferInfo bufferInfo, long j10) {
        ByteBuffer outputBuffer;
        int dequeueOutputBuffer = this.f14922n.dequeueOutputBuffer(bufferInfo, j10);
        boolean z10 = false;
        while (true) {
            boolean z11 = true;
            if (dequeueOutputBuffer < 0) {
                break;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0 && (outputBuffer = this.f14922n.getOutputBuffer(dequeueOutputBuffer)) != null) {
                if (bufferInfo.presentationTimeUs >= this.f14930w) {
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
                        this.f14917i.add(new n(allocateDirect, bufferInfo2));
                        long j11 = this.J;
                        if (j11 != Long.MIN_VALUE && bufferInfo.presentationTimeUs >= j11) {
                            d(j11, false);
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
            this.f14922n.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.f14922n.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            o(this.f14922n.getOutputFormat(), false);
        }
        if (z10 && !this.X && this.J != Long.MIN_VALUE) {
            d(this.J, true);
        }
        return z10;
    }

    public final void d(long j10, boolean z10) {
        ArrayList arrayList = this.f14917i;
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((n) arrayList.get(i10)).f14908b.presentationTimeUs >= j10) {
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
            } else if (i10 > 0 && j10 - ((n) arrayList.get(i10 - 1)).f14908b.presentationTimeUs <= ((n) arrayList.get(i10)).f14908b.presentationTimeUs - j10) {
                i10--;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                this.U++;
            }
            n nVar = (n) arrayList.get(i10);
            this.Y = nVar.f14908b.presentationTimeUs - j10;
            while (i10 < arrayList.size()) {
                n nVar2 = (n) arrayList.get(i10);
                ByteBuffer byteBuffer = nVar2.f14907a;
                MediaCodec.BufferInfo bufferInfo = nVar2.f14908b;
                this.E++;
                this.C += bufferInfo.size;
                i(false, bufferInfo);
                r(false, byteBuffer, bufferInfo);
                i10++;
            }
            arrayList.clear();
            this.X = true;
            StringBuilder t10 = a1.g.t(j10, "A/V start aligned: videoPtsUs=", ", audioPtsUs=");
            t10.append(nVar.f14908b.presentationTimeUs);
            t10.append(", deltaUs=");
            t10.append(this.Y);
            this.f14915f.b(t10.toString());
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
                    p pVar = this.f14915f;
                    pVar.b("encoder thread did not stop: " + thread.getName());
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void h(long j10) {
        int i10;
        long j11 = this.f14931x;
        long max = Math.max(0L, j11 - 256);
        do {
            j11--;
            if (j11 >= max) {
                i10 = (int) (j11 % 256);
            } else {
                return;
            }
        } while (this.f14919k[i10] != j10);
        long nanoTime = System.nanoTime() - this.f14920l[i10];
        this.F++;
        this.G += nanoTime;
        this.H = Math.max(this.H, nanoTime);
        if (this.F % 30 == 0) {
            this.f14915f.b("codec latency: average=" + ((((float) this.G) / this.F) / 1000000.0f) + " ms, max=" + (((float) this.H) / 1000000.0f) + " ms");
        }
    }

    public final void i(boolean z10, MediaCodec.BufferInfo bufferInfo) {
        long j10 = bufferInfo.presentationTimeUs;
        if (z10) {
            if (this.J == Long.MIN_VALUE) {
                this.J = j10;
            }
            long j11 = this.K;
            if (j11 != Long.MIN_VALUE && j10 < j11) {
                this.Q++;
            }
            this.K = Math.max(j11, j10);
            if ((bufferInfo.flags & 1) != 0) {
                this.P++;
                long j12 = this.N;
                if (j12 != Long.MIN_VALUE) {
                    this.O = Math.max(this.O, j10 - j12);
                }
                this.N = j10;
                return;
            }
            return;
        }
        if (this.L == Long.MIN_VALUE) {
            this.L = j10;
        }
        long j13 = this.M;
        if (j13 != Long.MIN_VALUE && j10 < j13) {
            this.R++;
        }
        this.M = Math.max(j13, j10);
    }

    public final void j() {
        this.f14932y = false;
        this.f14933z = false;
        this.f14927s = null;
        this.f14928t = null;
        AudioRecord audioRecord = this.f14923o;
        if (audioRecord != null) {
            audioRecord.release();
            this.f14923o = null;
        }
        Surface surface = this.f14924p;
        if (surface != null) {
            surface.release();
            this.f14924p = null;
        }
        MediaCodec mediaCodec = this.f14921m;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.f14922n;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.f14922n = null;
        this.f14921m = null;
        this.f14926r = null;
        this.f14925q = null;
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
        this.f14915f.a(sb2.toString(), runtimeException);
        if (this.h.compareAndSet(false, true)) {
            d4 d4Var = this.f14916g.f14751a;
            ((u0) d4Var.f13233b).f15011i.post(new v2(13, d4Var, runtimeException));
        }
    }

    public final long l() {
        synchronized (this) {
            try {
                if (this.f14932y && this.f14933z) {
                    if (this.f14929u) {
                        return this.f14930w;
                    }
                    this.f14929u = true;
                    long max = Math.max(0L, (SystemClock.elapsedRealtimeNanos() - this.A) / 1000);
                    this.f14930w = max;
                    AudioRecord audioRecord = this.f14923o;
                    if (audioRecord != null) {
                        try {
                            if (audioRecord.getRecordingState() == 3) {
                                audioRecord.stop();
                            }
                        } catch (IllegalStateException e) {
                            this.f14915f.a("AudioRecord stop failed", e);
                        }
                    }
                    p pVar = this.f14915f;
                    pVar.b("recording stop boundary: presentationTimeUs=" + max);
                    return max;
                }
                return Long.MAX_VALUE;
            } finally {
            }
        }
    }

    public final void m() {
        this.f14929u = false;
        this.v = false;
        this.f14930w = Long.MAX_VALUE;
        this.A = 0L;
        this.C = 0L;
        this.B = 0L;
        this.E = 0;
        this.D = 0;
        this.f14931x = 0L;
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
        this.f14927s = null;
        this.f14928t = null;
        this.f14917i.clear();
    }

    public final long n(int i10) {
        long max = Math.max(0L, ((SystemClock.elapsedRealtimeNanos() - this.A) / 1000) - ((i10 * 1000000) / 48000));
        int i11 = Build.VERSION.SDK_INT;
        p pVar = this.f14915f;
        if (i11 >= 24) {
            AudioRecord audioRecord = this.f14923o;
            AudioTimestamp audioTimestamp = this.f14918j;
            if (audioRecord.getTimestamp(audioTimestamp, 1) == 0) {
                long max2 = Math.max(0L, ((audioTimestamp.nanoTime - this.A) / 1000) - ((audioTimestamp.framePosition * 1000000) / 48000));
                pVar.b("audio timestamp alignment: framePosition=" + audioTimestamp.framePosition + ", timestampDeltaUs=" + ((audioTimestamp.nanoTime - this.A) / 1000) + ", timestampBaseUs=" + max2 + ", readCompletionBaseUs=" + max);
                return max2;
            }
        }
        pVar.b("audio timestamp unavailable: readCompletionBaseUs=" + max);
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
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.f14912a.l(mediaFormat, z10);
        p pVar = this.f14915f;
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
    }

    public final synchronized void p(d dVar, d dVar2) {
        if (this.f14933z) {
            return;
        }
        if (this.f14932y) {
            try {
                this.f14922n.start();
                this.f14923o.startRecording();
                if (this.f14923o.getRecordingState() == 3) {
                    this.A = SystemClock.elapsedRealtimeNanos();
                    this.f14927s = dVar;
                    this.f14928t = dVar2;
                    this.f14933z = true;
                    p pVar = this.f14915f;
                    pVar.b("audio and video recording started: timeOriginNs=" + this.A + ", timelineOffsetUs=" + this.f14913b + ", audioSessionId=" + this.f14923o.getAudioSessionId());
                    this.f14925q = new Thread(new Runnable(this) {
                        public final o f14903b;

                        {
                            this.f14903b = this;
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
                            o oVar = this.f14903b;
                            oVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = oVar.f14921m.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                oVar.o(oVar.f14921m.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    if (bufferInfo.presentationTimeUs < oVar.f14930w) {
                                                        oVar.D++;
                                                        oVar.B += bufferInfo.size;
                                                        oVar.i(true, bufferInfo);
                                                        oVar.h(bufferInfo.presentationTimeUs);
                                                        oVar.r(true, oVar.f14921m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                    } else {
                                                        oVar.W++;
                                                    }
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                oVar.f14921m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e) {
                                            if (!oVar.f14929u) {
                                                oVar.k(e);
                                                return;
                                            } else {
                                                oVar.f14915f.a("video drain failed while stopping", e);
                                                return;
                                            }
                                        }
                                    }
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
                                        if (z13) {
                                            j10 = 10000;
                                        } else {
                                            j10 = 0;
                                        }
                                        try {
                                            z12 = oVar.c(bufferInfo2, j10);
                                            if (!z12) {
                                                int dequeueInputBuffer = oVar.f14922n.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (oVar.f14929u) {
                                                        if (j16 == j15) {
                                                            j14 = 0;
                                                        } else {
                                                            j14 = j16 + ((1000000 * j17) / 48000);
                                                        }
                                                        oVar.f14922n.queueInputBuffer(dequeueInputBuffer, 0, 0, j14, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = oVar.f14922n.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            oVar.f14922n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j11 = j15;
                                                            int read = oVar.f14923o.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i11 = oVar.S + 1;
                                                                    oVar.S = i11;
                                                                    if (read == -6 || i11 >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    oVar.T++;
                                                                }
                                                                if (j16 == j11) {
                                                                    j13 = 0;
                                                                } else {
                                                                    j13 = j16 + ((1000000 * j17) / 48000);
                                                                }
                                                                oVar.f14922n.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j16 == j11) {
                                                                    long n10 = oVar.n(i12);
                                                                    p pVar2 = oVar.f14915f;
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    sb2.append("first audio input: basePtsUs=");
                                                                    sb2.append(n10);
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
                                                                    j16 = n10;
                                                                } else {
                                                                    j12 = 48000;
                                                                }
                                                                oVar.f14922n.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j16 + ((1000000 * j17) / j12), 0);
                                                                j17 += i12;
                                                                synchronized (oVar) {
                                                                    if (oVar.f14927s != null && !oVar.f14929u) {
                                                                        d dVar3 = oVar.f14927s;
                                                                        oVar.f14927s = null;
                                                                        oVar.f14915f.b("audio capture ready; waiting for common A/V start frame");
                                                                        dVar3.run();
                                                                    }
                                                                }
                                                            }
                                                            j15 = j11;
                                                        }
                                                    }
                                                }
                                                j11 = j15;
                                                j15 = j11;
                                            } else {
                                                return;
                                            }
                                        } catch (RuntimeException e7) {
                                            if (!oVar.f14929u) {
                                                oVar.k(e7);
                                                return;
                                            } else {
                                                oVar.f14915f.a("audio capture failed while stopping", e7);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoVideoEncoder");
                    this.f14926r = new Thread(new Runnable(this) {
                        public final o f14903b;

                        {
                            this.f14903b = this;
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
                            o oVar = this.f14903b;
                            oVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = oVar.f14921m.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                oVar.o(oVar.f14921m.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    if (bufferInfo.presentationTimeUs < oVar.f14930w) {
                                                        oVar.D++;
                                                        oVar.B += bufferInfo.size;
                                                        oVar.i(true, bufferInfo);
                                                        oVar.h(bufferInfo.presentationTimeUs);
                                                        oVar.r(true, oVar.f14921m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                    } else {
                                                        oVar.W++;
                                                    }
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                oVar.f14921m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e) {
                                            if (!oVar.f14929u) {
                                                oVar.k(e);
                                                return;
                                            } else {
                                                oVar.f14915f.a("video drain failed while stopping", e);
                                                return;
                                            }
                                        }
                                    }
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
                                        if (z13) {
                                            j10 = 10000;
                                        } else {
                                            j10 = 0;
                                        }
                                        try {
                                            z12 = oVar.c(bufferInfo2, j10);
                                            if (!z12) {
                                                int dequeueInputBuffer = oVar.f14922n.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (oVar.f14929u) {
                                                        if (j16 == j15) {
                                                            j14 = 0;
                                                        } else {
                                                            j14 = j16 + ((1000000 * j17) / 48000);
                                                        }
                                                        oVar.f14922n.queueInputBuffer(dequeueInputBuffer, 0, 0, j14, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = oVar.f14922n.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            oVar.f14922n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j11 = j15;
                                                            int read = oVar.f14923o.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i11 = oVar.S + 1;
                                                                    oVar.S = i11;
                                                                    if (read == -6 || i11 >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    oVar.T++;
                                                                }
                                                                if (j16 == j11) {
                                                                    j13 = 0;
                                                                } else {
                                                                    j13 = j16 + ((1000000 * j17) / 48000);
                                                                }
                                                                oVar.f14922n.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j16 == j11) {
                                                                    long n10 = oVar.n(i12);
                                                                    p pVar2 = oVar.f14915f;
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    sb2.append("first audio input: basePtsUs=");
                                                                    sb2.append(n10);
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
                                                                    j16 = n10;
                                                                } else {
                                                                    j12 = 48000;
                                                                }
                                                                oVar.f14922n.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j16 + ((1000000 * j17) / j12), 0);
                                                                j17 += i12;
                                                                synchronized (oVar) {
                                                                    if (oVar.f14927s != null && !oVar.f14929u) {
                                                                        d dVar3 = oVar.f14927s;
                                                                        oVar.f14927s = null;
                                                                        oVar.f14915f.b("audio capture ready; waiting for common A/V start frame");
                                                                        dVar3.run();
                                                                    }
                                                                }
                                                            }
                                                            j15 = j11;
                                                        }
                                                    }
                                                }
                                                j11 = j15;
                                                j15 = j11;
                                            } else {
                                                return;
                                            }
                                        } catch (RuntimeException e7) {
                                            if (!oVar.f14929u) {
                                                oVar.k(e7);
                                                return;
                                            } else {
                                                oVar.f14915f.a("audio capture failed while stopping", e7);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoAudioEncoder");
                    this.f14925q.start();
                    this.f14926r.start();
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

    public final void q() {
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
        l();
        synchronized (this) {
            try {
                if (this.f14932y && !this.v) {
                    if (!this.f14933z) {
                        j();
                        return;
                    }
                    this.v = true;
                    try {
                        this.f14921m.signalEndOfInputStream();
                    } catch (IllegalStateException e) {
                        this.f14915f.a("video encoder EOS failed", e);
                    }
                    f(this.f14925q);
                    f(this.f14926r);
                    Object obj = "n/a";
                    if (e()) {
                        j10 = this.L - this.J;
                    } else {
                        j10 = Long.MIN_VALUE;
                    }
                    if (e()) {
                        j11 = this.M - this.K;
                    } else {
                        j11 = Long.MIN_VALUE;
                    }
                    long j14 = this.J;
                    long j15 = this.K;
                    if (j14 != Long.MIN_VALUE && j15 > j14) {
                        j12 = j15 - j14;
                    } else {
                        j12 = 0;
                    }
                    long j16 = this.L;
                    long j17 = this.M;
                    if (j16 != Long.MIN_VALUE && j17 > j16) {
                        j13 = j17 - j16;
                    } else {
                        j13 = 0;
                    }
                    p pVar = this.f14915f;
                    StringBuilder sb2 = new StringBuilder("codec summary: videoBuffers=");
                    sb2.append(this.D);
                    sb2.append(", videoBytes=");
                    sb2.append(this.B);
                    sb2.append(", videoPts=");
                    long j18 = j13;
                    sb2.append(g(this.J, this.K));
                    sb2.append(", actualVideoBitrate=");
                    long j19 = this.B;
                    if (j12 <= 0) {
                        valueOf = "n/a";
                    } else {
                        valueOf = String.valueOf((j19 * 8000000) / j12);
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
                    long j20 = this.C;
                    if (j18 <= 0) {
                        valueOf2 = "n/a";
                    } else {
                        valueOf2 = String.valueOf((j20 * 8000000) / j18);
                    }
                    sb2.append(valueOf2);
                    sb2.append(", nonMonotonicAudioPts=");
                    sb2.append(this.R);
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
                    if (this.f14930w == Long.MAX_VALUE) {
                        valueOf5 = "n/a";
                    } else {
                        valueOf5 = Long.valueOf(this.f14930w);
                    }
                    sb2.append(valueOf5);
                    sb2.append(", alignedAudioStartDeltaUs=");
                    long j21 = this.Y;
                    if (j21 == Long.MIN_VALUE) {
                        valueOf6 = "n/a";
                    } else {
                        valueOf6 = String.valueOf(j21);
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
                    pVar.b(sb2.toString());
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
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.f14912a.o(z10, byteBuffer, bufferInfo, this.f14913b);
    }
}
