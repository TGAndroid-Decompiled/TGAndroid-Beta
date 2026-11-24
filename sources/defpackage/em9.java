package defpackage;

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
public final class em9 implements jm9 {
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
    public final om9 a;
    public int a0;
    public final long b;
    public int b0;
    public final short c;
    public boolean c0;
    public final int d;
    public long d0;
    public final byte e;
    public final fm9 f;
    public final tl9 g;
    public final tl9 h;
    public MediaCodec n;
    public MediaCodec o;
    public AudioRecord p;
    public Surface q;
    public Thread r;
    public Thread s;
    public ul9 t;
    public ul9 u;
    public volatile boolean v;
    public volatile boolean w;
    public volatile boolean x;
    public boolean y;
    public int z;
    public final AtomicBoolean i = new AtomicBoolean();
    public final ArrayList j = new ArrayList();
    public final AudioTimestamp k = new AudioTimestamp();
    public final long[] l = new long[256];
    public final long[] m = new long[256];
    public volatile long B = Long.MAX_VALUE;

    public em9(om9 om9Var, long j, int i, int i2, int i3, fm9 fm9Var, tl9 tl9Var, tl9 tl9Var2) {
        this.a = om9Var;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = fm9Var;
        this.g = tl9Var;
        this.h = tl9Var2;
    }

    public static MediaFormat c(int i, int i2, int i3) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", i2);
        createVideoFormat.setInteger("frame-rate", i3);
        createVideoFormat.setInteger("i-frame-interval", 1);
        return createVideoFormat;
    }

    public static int f(MediaFormat mediaFormat) {
        int remaining;
        int i = 0;
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
            i = byteBuffer2.remaining();
        }
        return remaining + i;
    }

    public static String k(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return "n/a";
        }
        return j + ".." + j2;
    }

    public final void a() {
        int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
        if (minBufferSize > 0) {
            int max = Math.max(minBufferSize << 2, 16384);
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 48000, 1);
            createAudioFormat.setInteger("aac-profile", 2);
            createAudioFormat.setInteger("bitrate", 64000);
            createAudioFormat.setInteger("max-input-size", max);
            this.o = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f.b("audio encoder configure: codec=" + this.o.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
            this.o.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
            this.p = audioRecord;
            if (audioRecord.getState() == 1) {
                return;
            }
            dq9.m("Unable to initialize AudioRecord");
            return;
        }
        dq9.m("Unsupported audio recording configuration");
    }

    public final void b() {
        short s = this.c;
        int i = this.d;
        byte b = this.e;
        MediaFormat c = c(s, i, b);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.n = createEncoderByType;
        MediaCodecInfo.VideoCapabilities videoCapabilities = createEncoderByType.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
        if (videoCapabilities.isSizeSupported(s, s) && videoCapabilities.areSizeAndRateSupported(s, s, b)) {
            this.f.b("video encoder configure: codec=" + this.n.getName() + ", format=" + c);
            this.n.configure(c, (Surface) null, (MediaCrypto) null, 1);
            this.q = this.n.createInputSurface();
            return;
        }
        wa3.d(hg9.k(ts2.o("Video encoder does not support ", s, "x", s, " at "), b, " fps"));
    }

    public final boolean d(MediaCodec.BufferInfo bufferInfo, long j) {
        ByteBuffer outputBuffer;
        int dequeueOutputBuffer = this.o.dequeueOutputBuffer(bufferInfo, j);
        boolean z = false;
        while (true) {
            boolean z2 = true;
            if (dequeueOutputBuffer < 0) {
                break;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0 && (outputBuffer = this.o.getOutputBuffer(dequeueOutputBuffer)) != null && !this.x) {
                if (bufferInfo.presentationTimeUs >= this.B) {
                    this.Z++;
                    this.a0++;
                } else if (this.c0) {
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
                        this.j.add(new dm9(allocateDirect, bufferInfo2));
                        long j2 = this.O;
                        if (j2 != Long.MIN_VALUE && bufferInfo.presentationTimeUs >= j2) {
                            e(j2, false);
                        }
                    } catch (Throwable th) {
                        outputBuffer.limit(limit);
                        outputBuffer.position(position);
                        throw th;
                    }
                }
            }
            if ((bufferInfo.flags & 4) == 0) {
                z2 = false;
            }
            z |= z2;
            this.o.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.o.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            s(this.o.getOutputFormat(), false);
        }
        if (z && !this.c0 && this.O != Long.MIN_VALUE) {
            e(this.O, true);
        }
        return z;
    }

    public final void e(long j, boolean z) {
        ArrayList arrayList = this.j;
        if (!arrayList.isEmpty()) {
            int i = 0;
            while (true) {
                if (i < arrayList.size()) {
                    if (((dm9) arrayList.get(i)).b.presentationTimeUs >= j) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i < 0) {
                if (!z) {
                    return;
                }
                i = arrayList.size() - 1;
            } else if (i > 0 && j - ((dm9) arrayList.get(i - 1)).b.presentationTimeUs <= ((dm9) arrayList.get(i)).b.presentationTimeUs - j) {
                i--;
            }
            for (int i2 = 0; i2 < i; i2++) {
                this.Z++;
            }
            dm9 dm9Var = (dm9) arrayList.get(i);
            this.d0 = dm9Var.b.presentationTimeUs - j;
            while (i < arrayList.size()) {
                dm9 dm9Var2 = (dm9) arrayList.get(i);
                ByteBuffer byteBuffer = dm9Var2.a;
                MediaCodec.BufferInfo bufferInfo = dm9Var2.b;
                this.J++;
                this.H += bufferInfo.size;
                m(false, bufferInfo);
                v(false, byteBuffer, bufferInfo);
                i++;
            }
            arrayList.clear();
            this.c0 = true;
            StringBuilder o = wi8.o(j, "A/V start aligned: videoPtsUs=", ", audioPtsUs=");
            o.append(dm9Var.b.presentationTimeUs);
            o.append(", deltaUs=");
            o.append(this.d0);
            this.f.b(o.toString());
        }
    }

    public final boolean g() {
        if (this.O != Long.MIN_VALUE && this.P != Long.MIN_VALUE && this.Q != Long.MIN_VALUE && this.R != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void h(Thread thread, long j) {
        if (thread != null) {
            try {
                thread.join(j);
                if (thread.isAlive()) {
                    fm9 fm9Var = this.f;
                    fm9Var.b("encoder thread did not stop: " + thread.getName());
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void i() {
        synchronized (this) {
            if (this.t != null && !this.v) {
                ul9 ul9Var = this.t;
                this.t = null;
                this.f.b("audio capture ready; waiting for common A/V start frame");
                ul9Var.run();
            }
        }
    }

    public final void j() {
        boolean z;
        synchronized (this) {
            z = true;
            int i = this.z - 1;
            this.z = i;
            if (!this.A || i != 0) {
                z = false;
            }
            if (z) {
                this.A = false;
            }
        }
        if (z) {
            this.f.b("deferred codec release: encoder threads exited");
            n();
        }
    }

    public final void l(long j) {
        int i;
        long j2 = this.C;
        long max = Math.max(0L, j2 - 256);
        do {
            j2--;
            if (j2 >= max) {
                i = (int) (j2 % 256);
            } else {
                return;
            }
        } while (this.l[i] != j);
        long nanoTime = System.nanoTime() - this.m[i];
        this.K++;
        this.L += nanoTime;
        this.M = Math.max(this.M, nanoTime);
        if (this.K % 30 == 0) {
            this.f.b("codec latency: average=" + ((((float) this.L) / this.K) / 1000000.0f) + " ms, max=" + (((float) this.M) / 1000000.0f) + " ms");
        }
    }

    public final void m(boolean z, MediaCodec.BufferInfo bufferInfo) {
        long j = bufferInfo.presentationTimeUs;
        if (z) {
            if (this.O == Long.MIN_VALUE) {
                this.O = j;
            }
            long j2 = this.P;
            if (j2 != Long.MIN_VALUE && j < j2) {
                this.V++;
            }
            this.P = Math.max(j2, j);
            if ((bufferInfo.flags & 1) != 0) {
                this.U++;
                long j3 = this.S;
                if (j3 != Long.MIN_VALUE) {
                    this.T = Math.max(this.T, j - j3);
                }
                this.S = j;
                return;
            }
            return;
        }
        if (this.Q == Long.MIN_VALUE) {
            this.Q = j;
        }
        long j4 = this.R;
        if (j4 != Long.MIN_VALUE && j < j4) {
            this.W++;
        }
        this.R = Math.max(j4, j);
    }

    public final void n() {
        this.D = false;
        this.E = false;
        this.t = null;
        this.u = null;
        AudioRecord audioRecord = this.p;
        if (audioRecord != null) {
            audioRecord.release();
            this.p = null;
        }
        Surface surface = this.q;
        if (surface != null) {
            surface.release();
            this.q = null;
        }
        MediaCodec mediaCodec = this.n;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.o;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.o = null;
        this.n = null;
        this.s = null;
        this.r = null;
    }

    public final void o(RuntimeException runtimeException) {
        String str;
        if (runtimeException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) runtimeException;
            str = ": diagnostic=" + codecException.getDiagnosticInfo() + ", recoverable=" + codecException.isRecoverable() + ", transient=" + codecException.isTransient();
        } else {
            str = "";
        }
        this.f.a("codec error".concat(str), runtimeException);
        if (this.i.compareAndSet(false, true)) {
            this.g.a(runtimeException);
        }
    }

    public final long p() {
        synchronized (this) {
            if (this.D && this.E) {
                if (this.v) {
                    return this.B;
                }
                this.v = true;
                long max = Math.max(0L, (SystemClock.elapsedRealtimeNanos() - this.F) / 1000);
                this.B = max;
                AudioRecord audioRecord = this.p;
                if (audioRecord != null) {
                    try {
                        if (audioRecord.getRecordingState() == 3) {
                            audioRecord.stop();
                        }
                    } catch (IllegalStateException e) {
                        this.f.a("AudioRecord stop failed", e);
                    }
                }
                fm9 fm9Var = this.f;
                fm9Var.b("recording stop boundary: presentationTimeUs=" + max);
                return max;
            }
            return Long.MAX_VALUE;
        }
    }

    public final void q() {
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = 0;
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
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = false;
        this.d0 = Long.MIN_VALUE;
        this.t = null;
        this.u = null;
        this.j.clear();
    }

    public final long r(int i) {
        long max = Math.max(0L, ((SystemClock.elapsedRealtimeNanos() - this.F) / 1000) - ((i * 1000000) / 48000));
        int i2 = Build.VERSION.SDK_INT;
        fm9 fm9Var = this.f;
        if (i2 >= 24) {
            AudioRecord audioRecord = this.p;
            AudioTimestamp audioTimestamp = this.k;
            if (audioRecord.getTimestamp(audioTimestamp, 1) == 0) {
                long max2 = Math.max(0L, ((audioTimestamp.nanoTime - this.F) / 1000) - ((audioTimestamp.framePosition * 1000000) / 48000));
                fm9Var.b("audio timestamp alignment: framePosition=" + audioTimestamp.framePosition + ", timestampDeltaUs=" + ((audioTimestamp.nanoTime - this.F) / 1000) + ", timestampBaseUs=" + max2 + ", readCompletionBaseUs=" + max);
                return max2;
            }
        }
        fm9Var.b("audio timestamp unavailable: readCompletionBaseUs=" + max);
        return max;
    }

    public final void s(MediaFormat mediaFormat, boolean z) {
        String str;
        if (z) {
            try {
                this.N = f(mediaFormat);
                om9 om9Var = this.a;
                byte b = this.e;
                synchronized (om9Var) {
                    try {
                        om9Var.s = b;
                    } finally {
                    }
                }
            } catch (lm9 e) {
                if (!this.x) {
                    this.x = true;
                    this.f.a("recording segment rejected; earlier segments are kept", e);
                    this.h.a(e);
                    return;
                }
                return;
            } catch (IOException e2) {
                dq9.o(e2);
                return;
            }
        }
        fm9 fm9Var = this.f;
        StringBuilder sb = new StringBuilder();
        if (z) {
            str = "video";
        } else {
            str = "audio";
        }
        sb.append(str);
        sb.append(" output format: ");
        sb.append(mediaFormat);
        fm9Var.b(sb.toString());
        this.a.n(mediaFormat, z);
    }

    public final synchronized void t(ul9 ul9Var, ul9 ul9Var2) {
        if (this.E) {
            return;
        }
        if (this.D) {
            try {
                this.o.start();
                this.p.startRecording();
                if (this.p.getRecordingState() == 3) {
                    this.F = SystemClock.elapsedRealtimeNanos();
                    this.t = ul9Var;
                    this.u = ul9Var2;
                    this.E = true;
                    fm9 fm9Var = this.f;
                    fm9Var.b("audio and video recording started: timeOriginNs=" + this.F + ", timelineOffsetUs=" + this.b + ", audioSessionId=" + this.p.getAudioSessionId());
                    this.r = new Thread(new Runnable(this) {
                        public final em9 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            em9 em9Var;
                            boolean z;
                            long j;
                            long j2;
                            long j3;
                            String str;
                            long j4;
                            boolean z2 = false;
                            switch (r2) {
                                case 0:
                                    em9Var = this.b;
                                    em9Var.getClass();
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z3 = false;
                                    while (!z3) {
                                        try {
                                            try {
                                            } catch (RuntimeException e) {
                                                if (!em9Var.v) {
                                                    em9Var.o(e);
                                                } else {
                                                    em9Var.f.a("video drain failed while stopping", e);
                                                }
                                            }
                                            if (!em9Var.w) {
                                                int dequeueOutputBuffer = em9Var.n.dequeueOutputBuffer(bufferInfo, 10000L);
                                                if (dequeueOutputBuffer == -2) {
                                                    em9Var.s(em9Var.n.getOutputFormat(), true);
                                                } else if (dequeueOutputBuffer >= 0) {
                                                    if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (z) {
                                                        if (bufferInfo.presentationTimeUs < em9Var.B) {
                                                            em9Var.I++;
                                                            em9Var.G += bufferInfo.size;
                                                            em9Var.m(true, bufferInfo);
                                                            em9Var.l(bufferInfo.presentationTimeUs);
                                                            em9Var.v(true, em9Var.n.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                        } else {
                                                            em9Var.b0++;
                                                        }
                                                    }
                                                    if ((bufferInfo.flags & 4) != 0) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    em9Var.n.releaseOutputBuffer(dequeueOutputBuffer, false);
                                                }
                                            } else {
                                                return;
                                            }
                                        } finally {
                                        }
                                    }
                                    return;
                                default:
                                    em9Var = this.b;
                                    em9Var.getClass();
                                    Process.setThreadPriority(-16);
                                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                                    long j5 = Long.MIN_VALUE;
                                    boolean z4 = false;
                                    long j6 = Long.MIN_VALUE;
                                    long j7 = 0;
                                    while (!z2) {
                                        try {
                                            try {
                                                if (!em9Var.w) {
                                                    if (z4) {
                                                        j = 10000;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    z2 = em9Var.d(bufferInfo2, j);
                                                    if (!z2) {
                                                        int dequeueInputBuffer = em9Var.o.dequeueInputBuffer(10000L);
                                                        if (dequeueInputBuffer >= 0) {
                                                            if (em9Var.v) {
                                                                if (j6 == j5) {
                                                                    j3 = 0;
                                                                } else {
                                                                    j3 = j6 + ((1000000 * j7) / 48000);
                                                                }
                                                                em9Var.o.queueInputBuffer(dequeueInputBuffer, 0, 0, j3, 4);
                                                                z4 = true;
                                                            } else {
                                                                ByteBuffer inputBuffer = em9Var.o.getInputBuffer(dequeueInputBuffer);
                                                                if (inputBuffer == null) {
                                                                    em9Var.o.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                                } else {
                                                                    inputBuffer.clear();
                                                                    j2 = j5;
                                                                    int read = em9Var.p.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                                    if (read <= 0) {
                                                                        if (read < 0) {
                                                                            int i = em9Var.X + 1;
                                                                            em9Var.X = i;
                                                                            if (read == -6 || i >= 3) {
                                                                                throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                            }
                                                                        } else {
                                                                            em9Var.Y++;
                                                                        }
                                                                        if (j6 == j2) {
                                                                            j4 = 0;
                                                                        } else {
                                                                            j4 = j6 + ((1000000 * j7) / 48000);
                                                                        }
                                                                        em9Var.o.queueInputBuffer(dequeueInputBuffer, 0, 0, j4, 0);
                                                                    } else {
                                                                        int i2 = read / 2;
                                                                        if (j6 == j2) {
                                                                            long r = em9Var.r(i2);
                                                                            fm9 fm9Var2 = em9Var.f;
                                                                            StringBuilder sb = new StringBuilder();
                                                                            sb.append("first audio input: basePtsUs=");
                                                                            sb.append(r);
                                                                            sb.append(", frames=");
                                                                            sb.append(i2);
                                                                            sb.append(", timestampSource=");
                                                                            if (Build.VERSION.SDK_INT >= 24) {
                                                                                str = "AudioTimestamp";
                                                                            } else {
                                                                                str = "read completion";
                                                                            }
                                                                            sb.append(str);
                                                                            fm9Var2.b(sb.toString());
                                                                            j6 = r;
                                                                        }
                                                                        em9Var.o.queueInputBuffer(dequeueInputBuffer, 0, i2 << 1, j6 + ((1000000 * j7) / 48000), 0);
                                                                        j7 += i2;
                                                                        em9Var.i();
                                                                    }
                                                                    j5 = j2;
                                                                }
                                                            }
                                                        }
                                                        j2 = j5;
                                                        j5 = j2;
                                                    }
                                                }
                                            } catch (RuntimeException e2) {
                                                if (!em9Var.v) {
                                                    em9Var.o(e2);
                                                } else {
                                                    em9Var.f.a("audio capture failed while stopping", e2);
                                                }
                                            }
                                            return;
                                        } finally {
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoVideoEncoder");
                    this.s = new Thread(new Runnable(this) {
                        public final em9 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            em9 em9Var;
                            boolean z;
                            long j;
                            long j2;
                            long j3;
                            String str;
                            long j4;
                            boolean z2 = false;
                            switch (r2) {
                                case 0:
                                    em9Var = this.b;
                                    em9Var.getClass();
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z3 = false;
                                    while (!z3) {
                                        try {
                                            try {
                                            } catch (RuntimeException e) {
                                                if (!em9Var.v) {
                                                    em9Var.o(e);
                                                } else {
                                                    em9Var.f.a("video drain failed while stopping", e);
                                                }
                                            }
                                            if (!em9Var.w) {
                                                int dequeueOutputBuffer = em9Var.n.dequeueOutputBuffer(bufferInfo, 10000L);
                                                if (dequeueOutputBuffer == -2) {
                                                    em9Var.s(em9Var.n.getOutputFormat(), true);
                                                } else if (dequeueOutputBuffer >= 0) {
                                                    if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (z) {
                                                        if (bufferInfo.presentationTimeUs < em9Var.B) {
                                                            em9Var.I++;
                                                            em9Var.G += bufferInfo.size;
                                                            em9Var.m(true, bufferInfo);
                                                            em9Var.l(bufferInfo.presentationTimeUs);
                                                            em9Var.v(true, em9Var.n.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                        } else {
                                                            em9Var.b0++;
                                                        }
                                                    }
                                                    if ((bufferInfo.flags & 4) != 0) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    em9Var.n.releaseOutputBuffer(dequeueOutputBuffer, false);
                                                }
                                            } else {
                                                return;
                                            }
                                        } finally {
                                        }
                                    }
                                    return;
                                default:
                                    em9Var = this.b;
                                    em9Var.getClass();
                                    Process.setThreadPriority(-16);
                                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                                    long j5 = Long.MIN_VALUE;
                                    boolean z4 = false;
                                    long j6 = Long.MIN_VALUE;
                                    long j7 = 0;
                                    while (!z2) {
                                        try {
                                            try {
                                                if (!em9Var.w) {
                                                    if (z4) {
                                                        j = 10000;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    z2 = em9Var.d(bufferInfo2, j);
                                                    if (!z2) {
                                                        int dequeueInputBuffer = em9Var.o.dequeueInputBuffer(10000L);
                                                        if (dequeueInputBuffer >= 0) {
                                                            if (em9Var.v) {
                                                                if (j6 == j5) {
                                                                    j3 = 0;
                                                                } else {
                                                                    j3 = j6 + ((1000000 * j7) / 48000);
                                                                }
                                                                em9Var.o.queueInputBuffer(dequeueInputBuffer, 0, 0, j3, 4);
                                                                z4 = true;
                                                            } else {
                                                                ByteBuffer inputBuffer = em9Var.o.getInputBuffer(dequeueInputBuffer);
                                                                if (inputBuffer == null) {
                                                                    em9Var.o.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                                } else {
                                                                    inputBuffer.clear();
                                                                    j2 = j5;
                                                                    int read = em9Var.p.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                                    if (read <= 0) {
                                                                        if (read < 0) {
                                                                            int i = em9Var.X + 1;
                                                                            em9Var.X = i;
                                                                            if (read == -6 || i >= 3) {
                                                                                throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                            }
                                                                        } else {
                                                                            em9Var.Y++;
                                                                        }
                                                                        if (j6 == j2) {
                                                                            j4 = 0;
                                                                        } else {
                                                                            j4 = j6 + ((1000000 * j7) / 48000);
                                                                        }
                                                                        em9Var.o.queueInputBuffer(dequeueInputBuffer, 0, 0, j4, 0);
                                                                    } else {
                                                                        int i2 = read / 2;
                                                                        if (j6 == j2) {
                                                                            long r = em9Var.r(i2);
                                                                            fm9 fm9Var2 = em9Var.f;
                                                                            StringBuilder sb = new StringBuilder();
                                                                            sb.append("first audio input: basePtsUs=");
                                                                            sb.append(r);
                                                                            sb.append(", frames=");
                                                                            sb.append(i2);
                                                                            sb.append(", timestampSource=");
                                                                            if (Build.VERSION.SDK_INT >= 24) {
                                                                                str = "AudioTimestamp";
                                                                            } else {
                                                                                str = "read completion";
                                                                            }
                                                                            sb.append(str);
                                                                            fm9Var2.b(sb.toString());
                                                                            j6 = r;
                                                                        }
                                                                        em9Var.o.queueInputBuffer(dequeueInputBuffer, 0, i2 << 1, j6 + ((1000000 * j7) / 48000), 0);
                                                                        j7 += i2;
                                                                        em9Var.i();
                                                                    }
                                                                    j5 = j2;
                                                                }
                                                            }
                                                        }
                                                        j2 = j5;
                                                        j5 = j2;
                                                    }
                                                }
                                            } catch (RuntimeException e2) {
                                                if (!em9Var.v) {
                                                    em9Var.o(e2);
                                                } else {
                                                    em9Var.f.a("audio capture failed while stopping", e2);
                                                }
                                            }
                                            return;
                                        } finally {
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoAudioEncoder");
                    this.z = 2;
                    this.r.start();
                    this.s.start();
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
        long j;
        long j2;
        long j3;
        long j4;
        String valueOf;
        String valueOf2;
        String valueOf3;
        String valueOf4;
        Long valueOf5;
        String valueOf6;
        p();
        synchronized (this) {
            if (this.D && !this.y) {
                if (!this.E) {
                    n();
                    return;
                }
                this.y = true;
                try {
                    this.n.signalEndOfInputStream();
                } catch (IllegalStateException e) {
                    this.f.a("video encoder EOS failed", e);
                }
                h(this.r, 5000L);
                h(this.s, 5000L);
                Object obj = "n/a";
                if (g()) {
                    j = this.Q - this.O;
                } else {
                    j = Long.MIN_VALUE;
                }
                if (g()) {
                    j2 = this.R - this.P;
                } else {
                    j2 = Long.MIN_VALUE;
                }
                long j5 = this.O;
                long j6 = this.P;
                if (j5 != Long.MIN_VALUE && j6 > j5) {
                    j3 = j6 - j5;
                } else {
                    j3 = 0;
                }
                long j7 = this.Q;
                long j8 = this.R;
                if (j7 != Long.MIN_VALUE && j8 > j7) {
                    j4 = j8 - j7;
                } else {
                    j4 = 0;
                }
                fm9 fm9Var = this.f;
                StringBuilder sb = new StringBuilder("codec summary: videoBuffers=");
                sb.append(this.I);
                sb.append(", videoBytes=");
                sb.append(this.G);
                sb.append(", videoPts=");
                long j9 = j3;
                sb.append(k(this.O, this.P));
                sb.append(", actualVideoBitrate=");
                long j10 = this.G;
                if (j9 <= 0) {
                    valueOf = "n/a";
                } else {
                    valueOf = String.valueOf((j10 * 8000000) / j9);
                }
                sb.append(valueOf);
                sb.append(", keyframes=");
                sb.append(this.U);
                sb.append(", maxKeyframeIntervalUs=");
                sb.append(this.T);
                sb.append(", nonMonotonicVideoPts=");
                sb.append(this.V);
                sb.append(", audioBuffers=");
                sb.append(this.J);
                sb.append(", audioBytes=");
                sb.append(this.H);
                sb.append(", audioPts=");
                sb.append(k(this.Q, this.R));
                sb.append(", actualAudioBitrate=");
                long j11 = this.H;
                if (j4 <= 0) {
                    valueOf2 = "n/a";
                } else {
                    valueOf2 = String.valueOf((j11 * 8000000) / j4);
                }
                sb.append(valueOf2);
                sb.append(", nonMonotonicAudioPts=");
                sb.append(this.W);
                sb.append(", avStartDeltaUs=");
                if (j == Long.MIN_VALUE) {
                    valueOf3 = "n/a";
                } else {
                    valueOf3 = String.valueOf(j);
                }
                sb.append(valueOf3);
                sb.append(", avEndDeltaUs=");
                if (j2 == Long.MIN_VALUE) {
                    valueOf4 = "n/a";
                } else {
                    valueOf4 = String.valueOf(j2);
                }
                sb.append(valueOf4);
                sb.append(", audioReadErrors=");
                sb.append(this.X);
                sb.append(", emptyAudioReads=");
                sb.append(this.Y);
                sb.append(", droppedAudioBuffers=");
                sb.append(this.Z);
                sb.append(", droppedAudioAfterStop=");
                sb.append(this.a0);
                sb.append(", droppedVideoAfterStop=");
                sb.append(this.b0);
                sb.append(", stopPresentationTimeUs=");
                if (this.B == Long.MAX_VALUE) {
                    valueOf5 = "n/a";
                } else {
                    valueOf5 = Long.valueOf(this.B);
                }
                sb.append(valueOf5);
                sb.append(", alignedAudioStartDeltaUs=");
                long j12 = this.d0;
                if (j12 == Long.MIN_VALUE) {
                    valueOf6 = "n/a";
                } else {
                    valueOf6 = String.valueOf(j12);
                }
                sb.append(valueOf6);
                sb.append(", codecLatencyAvgMs=");
                int i = this.K;
                if (i != 0) {
                    obj = Float.valueOf((((float) this.L) / i) / 1000000.0f);
                }
                sb.append(obj);
                sb.append(", codecLatencyMaxMs=");
                sb.append(((float) this.M) / 1000000.0f);
                fm9Var.b(sb.toString());
                synchronized (this) {
                    if (this.z > 0) {
                        this.w = true;
                    }
                }
                if (this.w) {
                    h(this.r, 1000L);
                    h(this.s, 1000L);
                }
                synchronized (this) {
                    if (this.z > 0) {
                        this.A = true;
                        this.f.b("codec release deferred until encoder threads exit: running=" + this.z);
                        return;
                    }
                    n();
                }
            }
        }
    }

    public final void v(boolean z, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i;
        if (byteBuffer != null && !this.x) {
            if (z) {
                try {
                    int i2 = this.N;
                    if (i2 > 0 && (bufferInfo.flags & 1) != 0 && (i = bufferInfo.size) > i2) {
                        bufferInfo.offset += i2;
                        bufferInfo.size = i - i2;
                    }
                } catch (IOException e) {
                    dq9.o(e);
                    return;
                }
            }
            this.a.q(z, byteBuffer, bufferInfo, this.b);
        }
    }
}
