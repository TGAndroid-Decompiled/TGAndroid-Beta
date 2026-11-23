package n2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import hi.u5;
import hi.x4;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class g0 {
    public static final Object f21095t = new Object();
    public static ScheduledExecutorService f21096u;
    public static int v;
    public final AudioTrack f21097a;
    public final n f21098b;
    public final float f21099c;
    public final u5 d;
    public c0 f21100e;
    public final j0 f21101f;
    public final boolean f21102g;
    public final int h;
    public final f0 f21103i;
    public final h2.r f21104j = new h2.r(Thread.currentThread());
    public boolean f21105k;
    public long f21106l;
    public long f21107m;
    public long f21108n;
    public ByteBuffer f21109o;
    public int f21110p;
    public int f21111q;
    public int f21112r;
    public boolean f21113s;

    public g0(AudioTrack audioTrack, n nVar, u5 u5Var, float f10, h2.g0 g0Var) {
        f0 f0Var;
        this.f21097a = audioTrack;
        this.f21098b = nVar;
        this.f21099c = f10;
        this.d = u5Var;
        boolean M = h2.l0.M(nVar.f21176a);
        this.f21102g = M;
        if (M) {
            this.h = h2.l0.u(nVar.f21176a) * Integer.bitCount(nVar.f21178c);
        } else {
            this.h = -1;
        }
        this.f21101f = new j0(new x4(this, 14), g0Var, audioTrack, nVar.f21176a, this.h, nVar.f21180f);
        if (Build.VERSION.SDK_INT >= 24 && u5Var != null) {
            this.f21100e = new c0(audioTrack, u5Var);
        }
        if (c()) {
            f0Var = new f0(this);
        } else {
            f0Var = null;
        }
        this.f21103i = f0Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: n2.g0.a():long");
    }

    public final long b() {
        if (this.f21102g) {
            long j3 = this.f21106l;
            long j10 = this.h;
            String str = h2.l0.f13778a;
            return ((j3 + j10) - 1) / j10;
        }
        return this.f21107m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f21097a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i7, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f21097a.setOffloadDelayPadding(i7, i10);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f21097a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            j0 j0Var = this.f21101f;
            j0Var.A = true;
            j0Var.h.f21281a.f21278f = true;
        }
    }

    public final void f(m2.i iVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a10 = iVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a10.equals(logSessionId)) {
                this.f21097a.setLogSessionId(a10);
            }
        }
    }

    public final boolean g(long j3, int i7, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        u5 u5Var;
        i0 i0Var;
        e eVar;
        boolean z10;
        int i10;
        boolean z11;
        long j10 = j3;
        n nVar = this.f21098b;
        boolean z12 = this.f21102g;
        if (!z12 && this.f21111q == 0) {
            this.f21111q = r0.k(nVar.f21176a, byteBuffer);
        }
        h2.r rVar = this.f21104j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f13805a;
        AudioTrack audioTrack2 = this.f21097a;
        boolean z13 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i10 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z14 = this.f21113s;
                long a10 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = h2.l0.f13778a;
                audioTrack = audioTrack2;
                if (b10 > h2.l0.a0(a10, sampleRate, 1000000L, RoundingMode.UP)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f21113s = z10;
                if (z14 && !z10 && audioTrack.getPlayState() != 1) {
                    i10 = this.f21112r + 1;
                } else {
                    i10 = this.f21112r;
                }
            }
            if (i10 > this.f21112r) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f21112r = i10;
            if (z11) {
                rVar.e(-1, new a0(0));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (nVar.d) {
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f21108n;
            } else {
                this.f21108n = j10;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j10 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f21109o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f21109o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f21109o.putInt(1431633921);
                }
                if (this.f21110p == 0) {
                    this.f21109o.putInt(4, remaining2);
                    this.f21109o.putLong(8, j10 * 1000);
                    this.f21109o.position(0);
                    this.f21110p = remaining2;
                }
                int remaining3 = this.f21109o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f21109o, remaining3, 1);
                    if (write2 < 0) {
                        this.f21110p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f21110p = 0;
                } else {
                    this.f21110p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z13 = true;
            }
            if (z13 && (u5Var = this.d) != null && (eVar = (i0Var = (i0) u5Var.f15495b).f21130i) != null) {
                b bVar = b.f21063f;
                i0Var.h = bVar;
                eVar.b(bVar);
            }
            throw new g(write, z13);
        }
        if (write == remaining) {
            z13 = true;
        }
        if (z12) {
            this.f21106l += write;
            return z13;
        }
        if (z13) {
            this.f21107m = (this.f21111q * i7) + this.f21107m;
        }
        return z13;
    }
}
