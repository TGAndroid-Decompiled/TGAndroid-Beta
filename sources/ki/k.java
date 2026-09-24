package ki;

import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
public final class k implements p {
    public int A;
    public int B;
    public long C;
    public long D;
    public int E;
    public volatile long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public long K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final t f13756a;
    public final long f13757b;
    public final int f13758c;
    public final int d;
    public final int e;
    public final l f13759f;
    public final a f13760g;
    public final AtomicBoolean h = new AtomicBoolean();
    public final ArrayList f13761i = new ArrayList();
    public final AudioTimestamp f13762j = new AudioTimestamp();
    public final long[] f13763k = new long[256];
    public final long[] f13764l = new long[256];
    public MediaCodec f13765m;
    public MediaCodec f13766n;
    public AudioRecord f13767o;
    public Surface f13768p;
    public Thread f13769q;
    public Thread f13770r;
    public volatile boolean f13771s;
    public volatile long f13772t;
    public boolean f13773u;
    public boolean v;
    public long f13774w;
    public long f13775x;
    public long f13776y;
    public int f13777z;

    public k(t tVar, long j3, int i10, int i11, int i12, l lVar, a aVar) {
        this.f13756a = tVar;
        this.f13757b = j3;
        this.f13758c = i10;
        this.d = i11;
        this.e = i12;
        this.f13759f = lVar;
        this.f13760g = aVar;
    }

    public static String f(long j3, long j10) {
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
            this.f13766n = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f13759f.b("audio encoder configure: codec=" + this.f13766n.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
            this.f13766n.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
            this.f13767o = audioRecord;
            if (audioRecord.getState() == 1) {
                return;
            }
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
        throw new IllegalStateException("Unsupported audio recording configuration");
    }

    public final void b() {
        int i10 = this.f13758c;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i10, i10);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.d);
        int i11 = this.e;
        createVideoFormat.setInteger("frame-rate", i11);
        createVideoFormat.setInteger("i-frame-interval", 1);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.f13765m = createEncoderByType;
        MediaCodecInfo.VideoCapabilities videoCapabilities = createEncoderByType.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
        if (videoCapabilities.isSizeSupported(i10, i10) && videoCapabilities.areSizeAndRateSupported(i10, i10, i11)) {
            this.f13759f.b("video encoder configure: codec=" + this.f13765m.getName() + ", format=" + createVideoFormat);
            this.f13765m.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f13768p = this.f13765m.createInputSurface();
            return;
        }
        throw new IOException(a4.a.o(i11, " fps", hg.c.k("Video encoder does not support ", i10, "x", i10, " at ")));
    }

    public final boolean c(android.media.MediaCodec.BufferInfo r18, long r19) {
        throw new UnsupportedOperationException("Method not decompiled: ki.k.c(android.media.MediaCodec$BufferInfo, long):boolean");
    }

    public final boolean d() {
        if (this.F != Long.MIN_VALUE && this.G != Long.MIN_VALUE && this.H != Long.MIN_VALUE && this.I != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void e(Thread thread) {
        if (thread != null) {
            try {
                thread.join(5000L);
                if (thread.isAlive()) {
                    l lVar = this.f13759f;
                    lVar.b("encoder thread did not stop: " + thread.getName());
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void g(long j3) {
        int i10;
        long j10 = this.f13772t;
        long max = Math.max(0L, j10 - 256);
        do {
            j10--;
            if (j10 >= max) {
                i10 = (int) (j10 % 256);
            } else {
                return;
            }
        } while (this.f13763k[i10] != j3);
        long nanoTime = System.nanoTime() - this.f13764l[i10];
        this.B++;
        this.C += nanoTime;
        this.D = Math.max(this.D, nanoTime);
        if (this.B % 30 == 0) {
            this.f13759f.b("codec latency: average=" + ((((float) this.C) / this.B) / 1000000.0f) + " ms, max=" + (((float) this.D) / 1000000.0f) + " ms");
        }
    }

    public final void h(boolean z10, MediaCodec.BufferInfo bufferInfo) {
        long j3 = bufferInfo.presentationTimeUs;
        if (z10) {
            if (this.F == Long.MIN_VALUE) {
                this.F = j3;
            }
            long j10 = this.G;
            if (j10 != Long.MIN_VALUE && j3 < j10) {
                this.M++;
            }
            this.G = Math.max(j10, j3);
            if ((bufferInfo.flags & 1) != 0) {
                this.L++;
                long j11 = this.J;
                if (j11 != Long.MIN_VALUE) {
                    this.K = Math.max(this.K, j3 - j11);
                }
                this.J = j3;
                return;
            }
            return;
        }
        if (this.H == Long.MIN_VALUE) {
            this.H = j3;
        }
        long j12 = this.I;
        if (j12 != Long.MIN_VALUE && j3 < j12) {
            this.N++;
        }
        this.I = Math.max(j12, j3);
    }

    public final void i() {
        this.f13773u = false;
        this.v = false;
        AudioRecord audioRecord = this.f13767o;
        if (audioRecord != null) {
            audioRecord.release();
            this.f13767o = null;
        }
        Surface surface = this.f13768p;
        if (surface != null) {
            surface.release();
            this.f13768p = null;
        }
        MediaCodec mediaCodec = this.f13765m;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.f13766n;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.f13766n = null;
        this.f13765m = null;
        this.f13770r = null;
        this.f13769q = null;
    }

    public final void j(RuntimeException runtimeException) {
        String str;
        StringBuilder sb2 = new StringBuilder("codec error");
        if (runtimeException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) runtimeException;
            str = ": diagnostic=" + codecException.getDiagnosticInfo() + ", recoverable=" + codecException.isRecoverable() + ", transient=" + codecException.isTransient();
        } else {
            str = "";
        }
        sb2.append(str);
        this.f13759f.a(sb2.toString(), runtimeException);
        if (this.h.compareAndSet(false, true)) {
            k2.u uVar = this.f13760g.f13637a;
            ((r0) uVar.f13369b).h.post(new n(2, uVar, runtimeException));
        }
    }

    public final void k() {
        this.f13771s = false;
        this.f13774w = 0L;
        this.f13776y = 0L;
        this.f13775x = 0L;
        this.A = 0;
        this.f13777z = 0;
        this.f13772t = 0L;
        this.B = 0;
        this.D = 0L;
        this.C = 0L;
        this.G = Long.MIN_VALUE;
        this.F = Long.MIN_VALUE;
        this.I = Long.MIN_VALUE;
        this.H = Long.MIN_VALUE;
        this.J = Long.MIN_VALUE;
        this.K = 0L;
        this.L = 0;
        this.N = 0;
        this.M = 0;
        this.P = 0;
        this.O = 0;
        this.Q = 0;
        this.f13761i.clear();
    }

    public final long l(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            AudioRecord audioRecord = this.f13767o;
            AudioTimestamp audioTimestamp = this.f13762j;
            if (audioRecord.getTimestamp(audioTimestamp, 1) == 0) {
                return Math.max(0L, ((audioTimestamp.nanoTime - this.f13774w) / 1000) - ((audioTimestamp.framePosition * 1000000) / 48000));
            }
        }
        return Math.max(0L, ((SystemClock.elapsedRealtimeNanos() - this.f13774w) / 1000) - ((i10 * 1000000) / 48000));
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
                    this.E = remaining + i10;
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.f13756a.k(mediaFormat, z10);
        l lVar = this.f13759f;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            str = "video";
        } else {
            str = "audio";
        }
        sb2.append(str);
        sb2.append(" output format: ");
        sb2.append(mediaFormat);
        lVar.b(sb2.toString());
    }

    public final synchronized void n() {
        if (this.v) {
            return;
        }
        if (this.f13773u) {
            try {
                this.f13774w = SystemClock.elapsedRealtimeNanos();
                this.f13766n.start();
                this.f13767o.startRecording();
                if (this.f13767o.getRecordingState() == 3) {
                    this.v = true;
                    l lVar = this.f13759f;
                    lVar.b("audio and video recording started: timeOriginNs=" + this.f13774w + ", timelineOffsetUs=" + this.f13757b + ", audioSessionId=" + this.f13767o.getAudioSessionId());
                    this.f13769q = new Thread(new Runnable(this) {
                        public final k f13742b;

                        {
                            this.f13742b = this;
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
                            k kVar = this.f13742b;
                            kVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = kVar.f13765m.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                kVar.m(kVar.f13765m.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                int i11 = bufferInfo.size;
                                                if (i11 > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    kVar.f13777z++;
                                                    kVar.f13775x += i11;
                                                    kVar.h(true, bufferInfo);
                                                    kVar.g(bufferInfo.presentationTimeUs);
                                                    kVar.p(true, kVar.f13765m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                kVar.f13765m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e) {
                                            if (!kVar.f13771s) {
                                                kVar.j(e);
                                                return;
                                            } else {
                                                kVar.f13759f.a("video drain failed while stopping", e);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                                default:
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
                                            z12 = kVar.c(bufferInfo2, j3);
                                            if (!z12) {
                                                int dequeueInputBuffer = kVar.f13766n.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (kVar.f13771s) {
                                                        if (j15 == j14) {
                                                            j13 = 0;
                                                        } else {
                                                            j13 = j15 + ((1000000 * j16) / 48000);
                                                        }
                                                        kVar.f13766n.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = kVar.f13766n.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            kVar.f13766n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j10 = j14;
                                                            int read = kVar.f13767o.read(inputBuffer, inputBuffer.remaining());
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i12 = kVar.O + 1;
                                                                    kVar.O = i12;
                                                                    if (read == -6 || i12 >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    kVar.P++;
                                                                }
                                                                if (j15 == j10) {
                                                                    j12 = 0;
                                                                } else {
                                                                    j12 = j15 + ((1000000 * j16) / 48000);
                                                                }
                                                                kVar.f13766n.queueInputBuffer(dequeueInputBuffer, 0, 0, j12, 0);
                                                            } else {
                                                                int i13 = read / 2;
                                                                if (j15 == j10) {
                                                                    long l4 = kVar.l(i13);
                                                                    l lVar2 = kVar.f13759f;
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    sb2.append("first audio input: basePtsUs=");
                                                                    sb2.append(l4);
                                                                    sb2.append(", frames=");
                                                                    sb2.append(i13);
                                                                    sb2.append(", timestampSource=");
                                                                    j11 = 48000;
                                                                    if (Build.VERSION.SDK_INT >= 24) {
                                                                        str = "AudioTimestamp";
                                                                    } else {
                                                                        str = "read completion";
                                                                    }
                                                                    sb2.append(str);
                                                                    lVar2.b(sb2.toString());
                                                                    j15 = l4;
                                                                } else {
                                                                    j11 = 48000;
                                                                }
                                                                kVar.f13766n.queueInputBuffer(dequeueInputBuffer, 0, i13 * 2, j15 + ((1000000 * j16) / j11), 0);
                                                                j16 += i13;
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
                                        } catch (RuntimeException e7) {
                                            if (!kVar.f13771s) {
                                                kVar.j(e7);
                                                return;
                                            } else {
                                                kVar.f13759f.a("audio capture failed while stopping", e7);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoVideoEncoder");
                    this.f13770r = new Thread(new Runnable(this) {
                        public final k f13742b;

                        {
                            this.f13742b = this;
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
                            k kVar = this.f13742b;
                            kVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = kVar.f13765m.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                kVar.m(kVar.f13765m.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                int i11 = bufferInfo.size;
                                                if (i11 > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    kVar.f13777z++;
                                                    kVar.f13775x += i11;
                                                    kVar.h(true, bufferInfo);
                                                    kVar.g(bufferInfo.presentationTimeUs);
                                                    kVar.p(true, kVar.f13765m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                kVar.f13765m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e) {
                                            if (!kVar.f13771s) {
                                                kVar.j(e);
                                                return;
                                            } else {
                                                kVar.f13759f.a("video drain failed while stopping", e);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                                default:
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
                                            z12 = kVar.c(bufferInfo2, j3);
                                            if (!z12) {
                                                int dequeueInputBuffer = kVar.f13766n.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (kVar.f13771s) {
                                                        if (j15 == j14) {
                                                            j13 = 0;
                                                        } else {
                                                            j13 = j15 + ((1000000 * j16) / 48000);
                                                        }
                                                        kVar.f13766n.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = kVar.f13766n.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            kVar.f13766n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j10 = j14;
                                                            int read = kVar.f13767o.read(inputBuffer, inputBuffer.remaining());
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i12 = kVar.O + 1;
                                                                    kVar.O = i12;
                                                                    if (read == -6 || i12 >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    kVar.P++;
                                                                }
                                                                if (j15 == j10) {
                                                                    j12 = 0;
                                                                } else {
                                                                    j12 = j15 + ((1000000 * j16) / 48000);
                                                                }
                                                                kVar.f13766n.queueInputBuffer(dequeueInputBuffer, 0, 0, j12, 0);
                                                            } else {
                                                                int i13 = read / 2;
                                                                if (j15 == j10) {
                                                                    long l4 = kVar.l(i13);
                                                                    l lVar2 = kVar.f13759f;
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    sb2.append("first audio input: basePtsUs=");
                                                                    sb2.append(l4);
                                                                    sb2.append(", frames=");
                                                                    sb2.append(i13);
                                                                    sb2.append(", timestampSource=");
                                                                    j11 = 48000;
                                                                    if (Build.VERSION.SDK_INT >= 24) {
                                                                        str = "AudioTimestamp";
                                                                    } else {
                                                                        str = "read completion";
                                                                    }
                                                                    sb2.append(str);
                                                                    lVar2.b(sb2.toString());
                                                                    j15 = l4;
                                                                } else {
                                                                    j11 = 48000;
                                                                }
                                                                kVar.f13766n.queueInputBuffer(dequeueInputBuffer, 0, i13 * 2, j15 + ((1000000 * j16) / j11), 0);
                                                                j16 += i13;
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
                                        } catch (RuntimeException e7) {
                                            if (!kVar.f13771s) {
                                                kVar.j(e7);
                                                return;
                                            } else {
                                                kVar.f13759f.a("audio capture failed while stopping", e7);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoAudioEncoder");
                    this.f13769q.start();
                    this.f13770r.start();
                    return;
                }
                throw new IllegalStateException("Unable to start AudioRecord");
            } catch (RuntimeException e) {
                i();
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
                if (this.f13773u && !this.f13771s) {
                    if (!this.v) {
                        i();
                        return;
                    }
                    this.f13771s = true;
                    try {
                        this.f13767o.stop();
                    } catch (IllegalStateException unused) {
                    }
                    try {
                        this.f13765m.signalEndOfInputStream();
                    } catch (IllegalStateException e) {
                        this.f13759f.a("video encoder EOS failed", e);
                    }
                    e(this.f13769q);
                    e(this.f13770r);
                    if (d()) {
                        j3 = this.H - this.F;
                    } else {
                        j3 = Long.MIN_VALUE;
                    }
                    if (d()) {
                        j10 = this.I - this.G;
                    } else {
                        j10 = Long.MIN_VALUE;
                    }
                    long j13 = this.F;
                    long j14 = this.G;
                    if (j13 != Long.MIN_VALUE && j14 > j13) {
                        j11 = j14 - j13;
                    } else {
                        j11 = 0;
                    }
                    long j15 = this.H;
                    long j16 = this.I;
                    if (j15 != Long.MIN_VALUE && j16 > j15) {
                        j12 = j16 - j15;
                    } else {
                        j12 = 0;
                    }
                    l lVar = this.f13759f;
                    StringBuilder sb2 = new StringBuilder("codec summary: videoBuffers=");
                    sb2.append(this.f13777z);
                    sb2.append(", videoBytes=");
                    sb2.append(this.f13775x);
                    sb2.append(", videoPts=");
                    sb2.append(f(this.F, this.G));
                    sb2.append(", actualVideoBitrate=");
                    long j17 = this.f13775x;
                    if (j11 <= 0) {
                        valueOf = "n/a";
                    } else {
                        valueOf = String.valueOf((j17 * 8000000) / j11);
                    }
                    sb2.append(valueOf);
                    sb2.append(", keyframes=");
                    sb2.append(this.L);
                    sb2.append(", maxKeyframeIntervalUs=");
                    sb2.append(this.K);
                    sb2.append(", nonMonotonicVideoPts=");
                    sb2.append(this.M);
                    sb2.append(", audioBuffers=");
                    sb2.append(this.A);
                    sb2.append(", audioBytes=");
                    sb2.append(this.f13776y);
                    sb2.append(", audioPts=");
                    sb2.append(f(this.H, this.I));
                    sb2.append(", actualAudioBitrate=");
                    long j18 = this.f13776y;
                    if (j12 <= 0) {
                        valueOf2 = "n/a";
                    } else {
                        valueOf2 = String.valueOf((j18 * 8000000) / j12);
                    }
                    sb2.append(valueOf2);
                    sb2.append(", nonMonotonicAudioPts=");
                    sb2.append(this.N);
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
                    sb2.append(this.O);
                    sb2.append(", emptyAudioReads=");
                    sb2.append(this.P);
                    sb2.append(", droppedAudioBuffers=");
                    sb2.append(this.Q);
                    sb2.append(", codecLatencyAvgMs=");
                    int i10 = this.B;
                    if (i10 == 0) {
                        valueOf5 = "n/a";
                    } else {
                        valueOf5 = Float.valueOf((((float) this.C) / i10) / 1000000.0f);
                    }
                    sb2.append(valueOf5);
                    sb2.append(", codecLatencyMaxMs=");
                    sb2.append(((float) this.D) / 1000000.0f);
                    lVar.b(sb2.toString());
                    i();
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
                int i11 = this.E;
                if (i11 > 0 && (bufferInfo.flags & 1) != 0 && (i10 = bufferInfo.size) > i11) {
                    bufferInfo.offset += i11;
                    bufferInfo.size = i10 - i11;
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.f13756a.m(z10, byteBuffer, bufferInfo, this.f13757b);
    }
}
