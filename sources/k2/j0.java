package k2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class j0 {
    public static final Object f16174t = new Object();
    public static ScheduledExecutorService f16175u;
    public static int v;
    public final AudioTrack f16176a;
    public final p f16177b;
    public final float f16178c;
    public final jg.s0 d;
    public f0 e;
    public final m0 f16179f;
    public final boolean f16180g;
    public final int h;
    public final i0 f16181i;
    public final e2.r f16182j = new e2.r(Thread.currentThread());
    public boolean f16183k;
    public long f16184l;
    public long f16185m;
    public long f16186n;
    public ByteBuffer f16187o;
    public int f16188p;
    public int f16189q;
    public int f16190r;
    public boolean f16191s;

    public j0(AudioTrack audioTrack, p pVar, jg.s0 s0Var, float f7, e2.g0 g0Var) {
        i0 i0Var;
        this.f16176a = audioTrack;
        this.f16177b = pVar;
        this.f16178c = f7;
        this.d = s0Var;
        boolean M = e2.n0.M(pVar.f16248a);
        this.f16180g = M;
        if (M) {
            this.h = e2.n0.u(pVar.f16248a) * Integer.bitCount(pVar.f16250c);
        } else {
            this.h = -1;
        }
        this.f16179f = new m0(new jg.i(this), g0Var, audioTrack, pVar.f16248a, this.h, pVar.f16251f);
        if (Build.VERSION.SDK_INT >= 24 && s0Var != null) {
            this.e = new f0(audioTrack, s0Var);
        }
        if (c()) {
            i0Var = new i0(this);
        } else {
            i0Var = null;
        }
        this.f16181i = i0Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.j0.a():long");
    }

    public final long b() {
        if (this.f16180g) {
            long j10 = this.f16184l;
            long j11 = this.h;
            String str = e2.n0.f9691a;
            return ((j10 + j11) - 1) / j11;
        }
        return this.f16185m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f16176a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i10, int i11) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f16176a.setOffloadDelayPadding(i10, i11);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f16176a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            m0 m0Var = this.f16179f;
            m0Var.A = true;
            m0Var.h.f16130a.f16125f = true;
        }
    }

    public final void f(j2.j jVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a2 = jVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a2.equals(logSessionId)) {
                this.f16176a.setLogSessionId(a2);
            }
        }
    }

    public final boolean g(long j10, int i10, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        jg.s0 s0Var;
        l0 l0Var;
        f fVar;
        boolean z10;
        int i11;
        boolean z11;
        long j11 = j10;
        p pVar = this.f16177b;
        boolean z12 = this.f16180g;
        if (!z12 && this.f16189q == 0) {
            this.f16189q = u0.k(pVar.f16248a, byteBuffer);
        }
        e2.r rVar = this.f16182j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f9712a;
        AudioTrack audioTrack2 = this.f16176a;
        boolean z13 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i11 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z14 = this.f16191s;
                long a2 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = e2.n0.f9691a;
                audioTrack = audioTrack2;
                if (b10 > e2.n0.a0(a2, sampleRate, 1000000L, RoundingMode.UP)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f16191s = z10;
                if (z14 && !z10 && audioTrack.getPlayState() != 1) {
                    i11 = this.f16190r + 1;
                } else {
                    i11 = this.f16190r;
                }
            }
            if (i11 > this.f16190r) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f16190r = i11;
            if (z11) {
                rVar.e(-1, new jh.l(3));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (pVar.d) {
            if (j11 == Long.MIN_VALUE) {
                j11 = this.f16186n;
            } else {
                this.f16186n = j11;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j11 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f16187o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f16187o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f16187o.putInt(1431633921);
                }
                if (this.f16188p == 0) {
                    this.f16187o.putInt(4, remaining2);
                    this.f16187o.putLong(8, j11 * 1000);
                    this.f16187o.position(0);
                    this.f16188p = remaining2;
                }
                int remaining3 = this.f16187o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f16187o, remaining3, 1);
                    if (write2 < 0) {
                        this.f16188p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f16188p = 0;
                } else {
                    this.f16188p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z13 = true;
            }
            if (z13 && (s0Var = this.d) != null && (fVar = (l0Var = (l0) s0Var.f15827b).f16208i) != null) {
                b bVar = b.f16117f;
                l0Var.h = bVar;
                fVar.b(bVar);
            }
            throw new i(write, z13);
        }
        if (write == remaining) {
            z13 = true;
        }
        if (z12) {
            this.f16184l += write;
            return z13;
        }
        if (z13) {
            this.f16185m = (this.f16189q * i10) + this.f16185m;
        }
        return z13;
    }
}
