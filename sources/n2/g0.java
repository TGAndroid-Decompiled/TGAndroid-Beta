package n2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import hi.u5;
import hi.w4;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class g0 {
    public static final Object f21101t = new Object();
    public static ScheduledExecutorService f21102u;
    public static int v;
    public final AudioTrack f21103a;
    public final n f21104b;
    public final float f21105c;
    public final u5 d;
    public c0 f21106e;
    public final j0 f21107f;
    public final boolean f21108g;
    public final int h;
    public final f0 f21109i;
    public final h2.r f21110j = new h2.r(Thread.currentThread());
    public boolean f21111k;
    public long f21112l;
    public long f21113m;
    public long f21114n;
    public ByteBuffer f21115o;
    public int f21116p;
    public int f21117q;
    public int f21118r;
    public boolean f21119s;

    public g0(AudioTrack audioTrack, n nVar, u5 u5Var, float f10, h2.g0 g0Var) {
        f0 f0Var;
        this.f21103a = audioTrack;
        this.f21104b = nVar;
        this.f21105c = f10;
        this.d = u5Var;
        boolean M = h2.l0.M(nVar.f21182a);
        this.f21108g = M;
        if (M) {
            this.h = h2.l0.u(nVar.f21182a) * Integer.bitCount(nVar.f21184c);
        } else {
            this.h = -1;
        }
        this.f21107f = new j0(new w4(this, 14), g0Var, audioTrack, nVar.f21182a, this.h, nVar.f21186f);
        if (Build.VERSION.SDK_INT >= 24 && u5Var != null) {
            this.f21106e = new c0(audioTrack, u5Var);
        }
        if (c()) {
            f0Var = new f0(this);
        } else {
            f0Var = null;
        }
        this.f21109i = f0Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: n2.g0.a():long");
    }

    public final long b() {
        if (this.f21108g) {
            long j3 = this.f21112l;
            long j10 = this.h;
            String str = h2.l0.f13786a;
            return ((j3 + j10) - 1) / j10;
        }
        return this.f21113m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f21103a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i7, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f21103a.setOffloadDelayPadding(i7, i10);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f21103a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            j0 j0Var = this.f21107f;
            j0Var.A = true;
            j0Var.h.f21287a.f21284f = true;
        }
    }

    public final void f(m2.i iVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a10 = iVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a10.equals(logSessionId)) {
                this.f21103a.setLogSessionId(a10);
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
        n nVar = this.f21104b;
        boolean z12 = this.f21108g;
        if (!z12 && this.f21117q == 0) {
            this.f21117q = r0.k(nVar.f21182a, byteBuffer);
        }
        h2.r rVar = this.f21110j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f13813a;
        AudioTrack audioTrack2 = this.f21103a;
        boolean z13 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i10 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z14 = this.f21119s;
                long a10 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = h2.l0.f13786a;
                audioTrack = audioTrack2;
                if (b10 > h2.l0.a0(a10, sampleRate, 1000000L, RoundingMode.UP)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f21119s = z10;
                if (z14 && !z10 && audioTrack.getPlayState() != 1) {
                    i10 = this.f21118r + 1;
                } else {
                    i10 = this.f21118r;
                }
            }
            if (i10 > this.f21118r) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f21118r = i10;
            if (z11) {
                rVar.e(-1, new a0(0));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (nVar.d) {
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f21114n;
            } else {
                this.f21114n = j10;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j10 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f21115o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f21115o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f21115o.putInt(1431633921);
                }
                if (this.f21116p == 0) {
                    this.f21115o.putInt(4, remaining2);
                    this.f21115o.putLong(8, j10 * 1000);
                    this.f21115o.position(0);
                    this.f21116p = remaining2;
                }
                int remaining3 = this.f21115o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f21115o, remaining3, 1);
                    if (write2 < 0) {
                        this.f21116p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f21116p = 0;
                } else {
                    this.f21116p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z13 = true;
            }
            if (z13 && (u5Var = this.d) != null && (eVar = (i0Var = (i0) u5Var.f15539b).f21136i) != null) {
                b bVar = b.f21069f;
                i0Var.h = bVar;
                eVar.b(bVar);
            }
            throw new g(write, z13);
        }
        if (write == remaining) {
            z13 = true;
        }
        if (z12) {
            this.f21112l += write;
            return z13;
        }
        if (z13) {
            this.f21113m = (this.f21117q * i7) + this.f21113m;
        }
        return z13;
    }
}
