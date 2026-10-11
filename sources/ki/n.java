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
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
public final class n implements s {
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
    public final w f15047a;
    public final long f15048b;
    public final int f15049c;
    public final int d;
    public final int f15050e;
    public final o f15051f;
    public final c f15052g;
    public MediaCodec f15057m;
    public MediaCodec f15058n;
    public AudioRecord f15059o;
    public Surface f15060p;
    public Thread f15061q;
    public Thread f15062r;
    public d f15063s;
    public d f15064t;
    public volatile boolean f15065u;
    public boolean v;
    public volatile long f15067x;
    public boolean f15068y;
    public boolean f15069z;
    public final AtomicBoolean h = new AtomicBoolean();
    public final ArrayList f15053i = new ArrayList();
    public final AudioTimestamp f15054j = new AudioTimestamp();
    public final long[] f15055k = new long[256];
    public final long[] f15056l = new long[256];
    public volatile long f15066w = Long.MAX_VALUE;

    public n(w wVar, long j3, int i10, int i11, int i12, o oVar, c cVar) {
        this.f15047a = wVar;
        this.f15048b = j3;
        this.f15049c = i10;
        this.d = i11;
        this.f15050e = i12;
        this.f15051f = oVar;
        this.f15052g = cVar;
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
            this.f15058n = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f15051f.b("audio encoder configure: codec=" + this.f15058n.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
            this.f15058n.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
            this.f15059o = audioRecord;
            if (audioRecord.getState() == 1) {
                return;
            }
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
        throw new IllegalStateException("Unsupported audio recording configuration");
    }

    public final void b() {
        int i10 = this.f15049c;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i10, i10);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.d);
        int i11 = this.f15050e;
        createVideoFormat.setInteger("frame-rate", i11);
        createVideoFormat.setInteger("i-frame-interval", 1);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.f15057m = createEncoderByType;
        MediaCodecInfo.VideoCapabilities videoCapabilities = createEncoderByType.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
        if (videoCapabilities.isSizeSupported(i10, i10) && videoCapabilities.areSizeAndRateSupported(i10, i10, i11)) {
            this.f15051f.b("video encoder configure: codec=" + this.f15057m.getName() + ", format=" + createVideoFormat);
            this.f15057m.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f15060p = this.f15057m.createInputSurface();
            return;
        }
        throw new IOException(a1.g.o(i11, " fps", hg.c.k("Video encoder does not support ", i10, "x", i10, " at ")));
    }

    public final boolean c(MediaCodec.BufferInfo bufferInfo, long j3) {
        ByteBuffer outputBuffer;
        int dequeueOutputBuffer = this.f15058n.dequeueOutputBuffer(bufferInfo, j3);
        boolean z10 = false;
        while (true) {
            boolean z11 = true;
            if (dequeueOutputBuffer < 0) {
                break;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0 && (outputBuffer = this.f15058n.getOutputBuffer(dequeueOutputBuffer)) != null) {
                if (bufferInfo.presentationTimeUs >= this.f15066w) {
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
                        this.f15053i.add(new m(allocateDirect, bufferInfo2));
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
            this.f15058n.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.f15058n.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            o(this.f15058n.getOutputFormat(), false);
        }
        if (z10 && !this.X && this.J != Long.MIN_VALUE) {
            d(this.J, true);
        }
        return z10;
    }

    public final void d(long j3, boolean z10) {
        ArrayList arrayList = this.f15053i;
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((m) arrayList.get(i10)).f15036b.presentationTimeUs >= j3) {
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
            } else if (i10 > 0 && j3 - ((m) arrayList.get(i10 - 1)).f15036b.presentationTimeUs <= ((m) arrayList.get(i10)).f15036b.presentationTimeUs - j3) {
                i10--;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                this.U++;
            }
            m mVar = (m) arrayList.get(i10);
            this.Y = mVar.f15036b.presentationTimeUs - j3;
            while (i10 < arrayList.size()) {
                m mVar2 = (m) arrayList.get(i10);
                ByteBuffer byteBuffer = mVar2.f15035a;
                MediaCodec.BufferInfo bufferInfo = mVar2.f15036b;
                this.E++;
                this.C += bufferInfo.size;
                i(false, bufferInfo);
                r(false, byteBuffer, bufferInfo);
                i10++;
            }
            arrayList.clear();
            this.X = true;
            StringBuilder u10 = a1.g.u(j3, "A/V start aligned: videoPtsUs=", ", audioPtsUs=");
            u10.append(mVar.f15036b.presentationTimeUs);
            u10.append(", deltaUs=");
            u10.append(this.Y);
            this.f15051f.b(u10.toString());
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
                    o oVar = this.f15051f;
                    oVar.b("encoder thread did not stop: " + thread.getName());
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void h(long j3) {
        int i10;
        long j10 = this.f15067x;
        long max = Math.max(0L, j10 - 256);
        do {
            j10--;
            if (j10 >= max) {
                i10 = (int) (j10 % 256);
            } else {
                return;
            }
        } while (this.f15055k[i10] != j3);
        long nanoTime = System.nanoTime() - this.f15056l[i10];
        this.F++;
        this.G += nanoTime;
        this.H = Math.max(this.H, nanoTime);
        if (this.F % 30 == 0) {
            this.f15051f.b("codec latency: average=" + ((((float) this.G) / this.F) / 1000000.0f) + " ms, max=" + (((float) this.H) / 1000000.0f) + " ms");
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
        this.f15068y = false;
        this.f15069z = false;
        this.f15063s = null;
        this.f15064t = null;
        AudioRecord audioRecord = this.f15059o;
        if (audioRecord != null) {
            audioRecord.release();
            this.f15059o = null;
        }
        Surface surface = this.f15060p;
        if (surface != null) {
            surface.release();
            this.f15060p = null;
        }
        MediaCodec mediaCodec = this.f15057m;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.f15058n;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.f15058n = null;
        this.f15057m = null;
        this.f15062r = null;
        this.f15061q = null;
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
        this.f15051f.a(sb2.toString(), runtimeException);
        if (this.h.compareAndSet(false, true)) {
            xa.c cVar = this.f15052g.f14885a;
            ((v0) cVar.f51228b).f15164i.post(new k0(1, cVar, runtimeException));
        }
    }

    public final long l() {
        synchronized (this) {
            try {
                if (this.f15068y && this.f15069z) {
                    if (this.f15065u) {
                        return this.f15066w;
                    }
                    this.f15065u = true;
                    long max = Math.max(0L, (SystemClock.elapsedRealtimeNanos() - this.A) / 1000);
                    this.f15066w = max;
                    AudioRecord audioRecord = this.f15059o;
                    if (audioRecord != null) {
                        try {
                            if (audioRecord.getRecordingState() == 3) {
                                audioRecord.stop();
                            }
                        } catch (IllegalStateException e7) {
                            this.f15051f.a("AudioRecord stop failed", e7);
                        }
                    }
                    o oVar = this.f15051f;
                    oVar.b("recording stop boundary: presentationTimeUs=" + max);
                    return max;
                }
                return Long.MAX_VALUE;
            } finally {
            }
        }
    }

    public final void m() {
        this.f15065u = false;
        this.v = false;
        this.f15066w = Long.MAX_VALUE;
        this.A = 0L;
        this.C = 0L;
        this.B = 0L;
        this.E = 0;
        this.D = 0;
        this.f15067x = 0L;
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
        this.f15063s = null;
        this.f15064t = null;
        this.f15053i.clear();
    }

    public final long n(int i10) {
        long max = Math.max(0L, ((SystemClock.elapsedRealtimeNanos() - this.A) / 1000) - ((i10 * 1000000) / 48000));
        int i11 = Build.VERSION.SDK_INT;
        o oVar = this.f15051f;
        if (i11 >= 24) {
            AudioRecord audioRecord = this.f15059o;
            AudioTimestamp audioTimestamp = this.f15054j;
            if (audioRecord.getTimestamp(audioTimestamp, 1) == 0) {
                long max2 = Math.max(0L, ((audioTimestamp.nanoTime - this.A) / 1000) - ((audioTimestamp.framePosition * 1000000) / 48000));
                oVar.b("audio timestamp alignment: framePosition=" + audioTimestamp.framePosition + ", timestampDeltaUs=" + ((audioTimestamp.nanoTime - this.A) / 1000) + ", timestampBaseUs=" + max2 + ", readCompletionBaseUs=" + max);
                return max2;
            }
        }
        oVar.b("audio timestamp unavailable: readCompletionBaseUs=" + max);
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
        this.f15047a.l(mediaFormat, z10);
        o oVar = this.f15051f;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            str = "video";
        } else {
            str = "audio";
        }
        sb2.append(str);
        sb2.append(" output format: ");
        sb2.append(mediaFormat);
        oVar.b(sb2.toString());
    }

    public final synchronized void p(d dVar, d dVar2) {
        if (this.f15069z) {
            return;
        }
        if (this.f15068y) {
            try {
                this.f15058n.start();
                this.f15059o.startRecording();
                if (this.f15059o.getRecordingState() == 3) {
                    this.A = SystemClock.elapsedRealtimeNanos();
                    this.f15063s = dVar;
                    this.f15064t = dVar2;
                    this.f15069z = true;
                    o oVar = this.f15051f;
                    oVar.b("audio and video recording started: timeOriginNs=" + this.A + ", timelineOffsetUs=" + this.f15048b + ", audioSessionId=" + this.f15059o.getAudioSessionId());
                    this.f15061q = new Thread(new Runnable(this) {
                        public final n f15032b;

                        {
                            this.f15032b = this;
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
                            n nVar = this.f15032b;
                            nVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = nVar.f15057m.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                nVar.o(nVar.f15057m.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    if (bufferInfo.presentationTimeUs < nVar.f15066w) {
                                                        nVar.D++;
                                                        nVar.B += bufferInfo.size;
                                                        nVar.i(true, bufferInfo);
                                                        nVar.h(bufferInfo.presentationTimeUs);
                                                        nVar.r(true, nVar.f15057m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                    } else {
                                                        nVar.W++;
                                                    }
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                nVar.f15057m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e7) {
                                            if (!nVar.f15065u) {
                                                nVar.k(e7);
                                                return;
                                            } else {
                                                nVar.f15051f.a("video drain failed while stopping", e7);
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
                                            z12 = nVar.c(bufferInfo2, j3);
                                            if (!z12) {
                                                int dequeueInputBuffer = nVar.f15058n.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (nVar.f15065u) {
                                                        if (j15 == j14) {
                                                            j13 = 0;
                                                        } else {
                                                            j13 = j15 + ((1000000 * j16) / 48000);
                                                        }
                                                        nVar.f15058n.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = nVar.f15058n.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            nVar.f15058n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j10 = j14;
                                                            int read = nVar.f15059o.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i11 = nVar.S + 1;
                                                                    nVar.S = i11;
                                                                    if (read == -6 || i11 >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    nVar.T++;
                                                                }
                                                                if (j15 == j10) {
                                                                    j12 = 0;
                                                                } else {
                                                                    j12 = j15 + ((1000000 * j16) / 48000);
                                                                }
                                                                nVar.f15058n.queueInputBuffer(dequeueInputBuffer, 0, 0, j12, 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j15 == j10) {
                                                                    long n10 = nVar.n(i12);
                                                                    o oVar2 = nVar.f15051f;
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
                                                                    oVar2.b(sb2.toString());
                                                                    j15 = n10;
                                                                } else {
                                                                    j11 = 48000;
                                                                }
                                                                nVar.f15058n.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j15 + ((1000000 * j16) / j11), 0);
                                                                j16 += i12;
                                                                synchronized (nVar) {
                                                                    if (nVar.f15063s != null && !nVar.f15065u) {
                                                                        d dVar3 = nVar.f15063s;
                                                                        nVar.f15063s = null;
                                                                        nVar.f15051f.b("audio capture ready; waiting for common A/V start frame");
                                                                        dVar3.run();
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
                                            if (!nVar.f15065u) {
                                                nVar.k(e10);
                                                return;
                                            } else {
                                                nVar.f15051f.a("audio capture failed while stopping", e10);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoVideoEncoder");
                    this.f15062r = new Thread(new Runnable(this) {
                        public final n f15032b;

                        {
                            this.f15032b = this;
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
                            n nVar = this.f15032b;
                            nVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = nVar.f15057m.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                nVar.o(nVar.f15057m.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    if (bufferInfo.presentationTimeUs < nVar.f15066w) {
                                                        nVar.D++;
                                                        nVar.B += bufferInfo.size;
                                                        nVar.i(true, bufferInfo);
                                                        nVar.h(bufferInfo.presentationTimeUs);
                                                        nVar.r(true, nVar.f15057m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                    } else {
                                                        nVar.W++;
                                                    }
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                nVar.f15057m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e7) {
                                            if (!nVar.f15065u) {
                                                nVar.k(e7);
                                                return;
                                            } else {
                                                nVar.f15051f.a("video drain failed while stopping", e7);
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
                                            z12 = nVar.c(bufferInfo2, j3);
                                            if (!z12) {
                                                int dequeueInputBuffer = nVar.f15058n.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (nVar.f15065u) {
                                                        if (j15 == j14) {
                                                            j13 = 0;
                                                        } else {
                                                            j13 = j15 + ((1000000 * j16) / 48000);
                                                        }
                                                        nVar.f15058n.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = nVar.f15058n.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            nVar.f15058n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j10 = j14;
                                                            int read = nVar.f15059o.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i11 = nVar.S + 1;
                                                                    nVar.S = i11;
                                                                    if (read == -6 || i11 >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    nVar.T++;
                                                                }
                                                                if (j15 == j10) {
                                                                    j12 = 0;
                                                                } else {
                                                                    j12 = j15 + ((1000000 * j16) / 48000);
                                                                }
                                                                nVar.f15058n.queueInputBuffer(dequeueInputBuffer, 0, 0, j12, 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j15 == j10) {
                                                                    long n10 = nVar.n(i12);
                                                                    o oVar2 = nVar.f15051f;
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
                                                                    oVar2.b(sb2.toString());
                                                                    j15 = n10;
                                                                } else {
                                                                    j11 = 48000;
                                                                }
                                                                nVar.f15058n.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j15 + ((1000000 * j16) / j11), 0);
                                                                j16 += i12;
                                                                synchronized (nVar) {
                                                                    if (nVar.f15063s != null && !nVar.f15065u) {
                                                                        d dVar3 = nVar.f15063s;
                                                                        nVar.f15063s = null;
                                                                        nVar.f15051f.b("audio capture ready; waiting for common A/V start frame");
                                                                        dVar3.run();
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
                                            if (!nVar.f15065u) {
                                                nVar.k(e10);
                                                return;
                                            } else {
                                                nVar.f15051f.a("audio capture failed while stopping", e10);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoAudioEncoder");
                    this.f15061q.start();
                    this.f15062r.start();
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
                if (this.f15068y && !this.v) {
                    if (!this.f15069z) {
                        j();
                        return;
                    }
                    this.v = true;
                    try {
                        this.f15057m.signalEndOfInputStream();
                    } catch (IllegalStateException e7) {
                        this.f15051f.a("video encoder EOS failed", e7);
                    }
                    f(this.f15061q);
                    f(this.f15062r);
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
                    o oVar = this.f15051f;
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
                    if (this.f15066w == Long.MAX_VALUE) {
                        valueOf5 = "n/a";
                    } else {
                        valueOf5 = Long.valueOf(this.f15066w);
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
                    oVar.b(sb2.toString());
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
        this.f15047a.o(z10, byteBuffer, bufferInfo, this.f15048b);
    }
}
