package k2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
import ji.h5;
import ji.w4;
public final class h0 {
    public static final Object f13891t = new Object();
    public static ScheduledExecutorService f13892u;
    public static int v;
    public final AudioTrack f13893a;
    public final o f13894b;
    public final float f13895c;
    public final h5 d;
    public d0 e;
    public final k0 f13896f;
    public final boolean f13897g;
    public final int h;
    public final g0 f13898i;
    public final e2.r f13899j = new e2.r(Thread.currentThread());
    public boolean f13900k;
    public long f13901l;
    public long f13902m;
    public long f13903n;
    public ByteBuffer f13904o;
    public int f13905p;
    public int f13906q;
    public int f13907r;
    public boolean f13908s;

    public h0(AudioTrack audioTrack, o oVar, h5 h5Var, float f7, e2.g0 g0Var) {
        g0 g0Var2;
        this.f13893a = audioTrack;
        this.f13894b = oVar;
        this.f13895c = f7;
        this.d = h5Var;
        boolean M = e2.m0.M(oVar.f13966a);
        this.f13897g = M;
        if (M) {
            this.h = e2.m0.u(oVar.f13966a) * Integer.bitCount(oVar.f13968c);
        } else {
            this.h = -1;
        }
        this.f13896f = new k0(new w4(this, 1), g0Var, audioTrack, oVar.f13966a, this.h, oVar.f13969f);
        if (Build.VERSION.SDK_INT >= 24 && h5Var != null) {
            this.e = new d0(audioTrack, h5Var);
        }
        if (c()) {
            g0Var2 = new g0(this);
        } else {
            g0Var2 = null;
        }
        this.f13898i = g0Var2;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.h0.a():long");
    }

    public final long b() {
        if (this.f13897g) {
            long j10 = this.f13901l;
            long j11 = this.h;
            String str = e2.m0.f8375a;
            return ((j10 + j11) - 1) / j11;
        }
        return this.f13902m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f13893a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i10, int i11) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f13893a.setOffloadDelayPadding(i10, i11);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f13893a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            k0 k0Var = this.f13896f;
            k0Var.A = true;
            k0Var.h.f13850a.f13842f = true;
        }
    }

    public final void f(j2.k kVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a2 = kVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a2.equals(logSessionId)) {
                this.f13893a.setLogSessionId(a2);
            }
        }
    }

    public final boolean g(long j10, int i10, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        h5 h5Var;
        j0 j0Var;
        e eVar;
        boolean z10;
        int i11;
        boolean z11;
        long j11 = j10;
        o oVar = this.f13894b;
        boolean z12 = this.f13897g;
        if (!z12 && this.f13906q == 0) {
            this.f13906q = s0.k(oVar.f13966a, byteBuffer);
        }
        e2.r rVar = this.f13899j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f8395a;
        AudioTrack audioTrack2 = this.f13893a;
        boolean z13 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i11 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z14 = this.f13908s;
                long a2 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = e2.m0.f8375a;
                audioTrack = audioTrack2;
                if (b10 > e2.m0.a0(a2, sampleRate, 1000000L, RoundingMode.UP)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f13908s = z10;
                if (z14 && !z10 && audioTrack.getPlayState() != 1) {
                    i11 = this.f13907r + 1;
                } else {
                    i11 = this.f13907r;
                }
            }
            if (i11 > this.f13907r) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f13907r = i11;
            if (z11) {
                rVar.e(-1, new j2.e(25));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (oVar.d) {
            if (j11 == Long.MIN_VALUE) {
                j11 = this.f13903n;
            } else {
                this.f13903n = j11;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j11 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f13904o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f13904o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f13904o.putInt(1431633921);
                }
                if (this.f13905p == 0) {
                    this.f13904o.putInt(4, remaining2);
                    this.f13904o.putLong(8, j11 * 1000);
                    this.f13904o.position(0);
                    this.f13905p = remaining2;
                }
                int remaining3 = this.f13904o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f13904o, remaining3, 1);
                    if (write2 < 0) {
                        this.f13905p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f13905p = 0;
                } else {
                    this.f13905p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z13 = true;
            }
            if (z13 && (h5Var = this.d) != null && (eVar = (j0Var = (j0) h5Var.f13315b).f13922i) != null) {
                b bVar = b.f13845f;
                j0Var.h = bVar;
                eVar.b(bVar);
            }
            throw new h(write, z13);
        }
        if (write == remaining) {
            z13 = true;
        }
        if (z12) {
            this.f13901l += write;
            return z13;
        }
        if (z13) {
            this.f13902m = (this.f13906q * i10) + this.f13902m;
        }
        return z13;
    }
}
