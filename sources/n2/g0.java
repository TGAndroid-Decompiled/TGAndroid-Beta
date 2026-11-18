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
    public static final Object f21098t = new Object();
    public static ScheduledExecutorService f21099u;
    public static int v;
    public final AudioTrack f21100a;
    public final n f21101b;
    public final float f21102c;
    public final u5 d;
    public c0 f21103e;
    public final j0 f21104f;
    public final boolean f21105g;
    public final int h;
    public final f0 f21106i;
    public final h2.r f21107j = new h2.r(Thread.currentThread());
    public boolean f21108k;
    public long f21109l;
    public long f21110m;
    public long f21111n;
    public ByteBuffer f21112o;
    public int f21113p;
    public int f21114q;
    public int f21115r;
    public boolean f21116s;

    public g0(AudioTrack audioTrack, n nVar, u5 u5Var, float f10, h2.g0 g0Var) {
        f0 f0Var;
        this.f21100a = audioTrack;
        this.f21101b = nVar;
        this.f21102c = f10;
        this.d = u5Var;
        boolean M = h2.l0.M(nVar.f21179a);
        this.f21105g = M;
        if (M) {
            this.h = h2.l0.u(nVar.f21179a) * Integer.bitCount(nVar.f21181c);
        } else {
            this.h = -1;
        }
        this.f21104f = new j0(new w4(this, 14), g0Var, audioTrack, nVar.f21179a, this.h, nVar.f21183f);
        if (Build.VERSION.SDK_INT >= 24 && u5Var != null) {
            this.f21103e = new c0(audioTrack, u5Var);
        }
        if (c()) {
            f0Var = new f0(this);
        } else {
            f0Var = null;
        }
        this.f21106i = f0Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: n2.g0.a():long");
    }

    public final long b() {
        if (this.f21105g) {
            long j3 = this.f21109l;
            long j10 = this.h;
            String str = h2.l0.f13783a;
            return ((j3 + j10) - 1) / j10;
        }
        return this.f21110m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f21100a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i7, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f21100a.setOffloadDelayPadding(i7, i10);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f21100a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            j0 j0Var = this.f21104f;
            j0Var.A = true;
            j0Var.h.f21284a.f21281f = true;
        }
    }

    public final void f(m2.i iVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a10 = iVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a10.equals(logSessionId)) {
                this.f21100a.setLogSessionId(a10);
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
        n nVar = this.f21101b;
        boolean z12 = this.f21105g;
        if (!z12 && this.f21114q == 0) {
            this.f21114q = r0.k(nVar.f21179a, byteBuffer);
        }
        h2.r rVar = this.f21107j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f13810a;
        AudioTrack audioTrack2 = this.f21100a;
        boolean z13 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i10 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z14 = this.f21116s;
                long a10 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = h2.l0.f13783a;
                audioTrack = audioTrack2;
                if (b10 > h2.l0.a0(a10, sampleRate, 1000000L, RoundingMode.UP)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f21116s = z10;
                if (z14 && !z10 && audioTrack.getPlayState() != 1) {
                    i10 = this.f21115r + 1;
                } else {
                    i10 = this.f21115r;
                }
            }
            if (i10 > this.f21115r) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f21115r = i10;
            if (z11) {
                rVar.e(-1, new a0(0));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (nVar.d) {
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f21111n;
            } else {
                this.f21111n = j10;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j10 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f21112o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f21112o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f21112o.putInt(1431633921);
                }
                if (this.f21113p == 0) {
                    this.f21112o.putInt(4, remaining2);
                    this.f21112o.putLong(8, j10 * 1000);
                    this.f21112o.position(0);
                    this.f21113p = remaining2;
                }
                int remaining3 = this.f21112o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f21112o, remaining3, 1);
                    if (write2 < 0) {
                        this.f21113p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f21113p = 0;
                } else {
                    this.f21113p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z13 = true;
            }
            if (z13 && (u5Var = this.d) != null && (eVar = (i0Var = (i0) u5Var.f15536b).f21133i) != null) {
                b bVar = b.f21066f;
                i0Var.h = bVar;
                eVar.b(bVar);
            }
            throw new g(write, z13);
        }
        if (write == remaining) {
            z13 = true;
        }
        if (z12) {
            this.f21109l += write;
            return z13;
        }
        if (z13) {
            this.f21110m = (this.f21114q * i7) + this.f21110m;
        }
        return z13;
    }
}
