package k2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class j0 {
    public static final Object f10673t = new Object();
    public static ScheduledExecutorService f10674u;
    public static int v;
    public final AudioTrack f10675a;
    public final o f10676b;
    public final float f10677c;
    public final m0 d;
    public f0 e;
    public final o0 f10678f;
    public final boolean f10679g;
    public final int h;
    public final i0 f10680i;
    public final e2.r f10681j = new e2.r(Thread.currentThread());
    public boolean f10682k;
    public long f10683l;
    public long f10684m;
    public long f10685n;
    public ByteBuffer f10686o;
    public int f10687p;
    public int f10688q;
    public int f10689r;
    public boolean f10690s;

    public j0(AudioTrack audioTrack, o oVar, m0 m0Var, float f7, e2.g0 g0Var) {
        i0 i0Var;
        this.f10675a = audioTrack;
        this.f10676b = oVar;
        this.f10677c = f7;
        this.d = m0Var;
        boolean M = e2.l0.M(oVar.f10718a);
        this.f10679g = M;
        if (M) {
            this.h = e2.l0.u(oVar.f10718a) * Integer.bitCount(oVar.f10720c);
        } else {
            this.h = -1;
        }
        this.f10678f = new o0(new a4.l(this, 23), g0Var, audioTrack, oVar.f10718a, this.h, oVar.f10721f);
        if (Build.VERSION.SDK_INT >= 24 && m0Var != null) {
            this.e = new f0(audioTrack, m0Var);
        }
        if (c()) {
            i0Var = new i0(this);
        } else {
            i0Var = null;
        }
        this.f10680i = i0Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.j0.a():long");
    }

    public final long b() {
        if (this.f10679g) {
            long j10 = this.f10683l;
            long j11 = this.h;
            String str = e2.l0.f6165a;
            return ((j10 + j11) - 1) / j11;
        }
        return this.f10684m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f10675a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i10, int i11) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f10675a.setOffloadDelayPadding(i10, i11);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f10675a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            o0 o0Var = this.f10678f;
            o0Var.A = true;
            o0Var.h.f10630a.f10624f = true;
        }
    }

    public final void f(j2.l lVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a2 = lVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a2.equals(logSessionId)) {
                this.f10675a.setLogSessionId(a2);
            }
        }
    }

    public final boolean g(long j10, int i10, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        m0 m0Var;
        n0 n0Var;
        e eVar;
        boolean z10;
        int i11;
        boolean z11;
        long j11 = j10;
        o oVar = this.f10676b;
        boolean z12 = this.f10679g;
        if (!z12 && this.f10688q == 0) {
            this.f10688q = w0.k(oVar.f10718a, byteBuffer);
        }
        e2.r rVar = this.f10681j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f6188a;
        AudioTrack audioTrack2 = this.f10675a;
        boolean z13 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i11 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z14 = this.f10690s;
                long a2 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = e2.l0.f6165a;
                audioTrack = audioTrack2;
                if (b10 > e2.l0.a0(a2, sampleRate, 1000000L, RoundingMode.UP)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f10690s = z10;
                if (z14 && !z10 && audioTrack.getPlayState() != 1) {
                    i11 = this.f10689r + 1;
                } else {
                    i11 = this.f10689r;
                }
            }
            if (i11 > this.f10689r) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f10689r = i11;
            if (z11) {
                rVar.e(-1, new j2.e(26));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (oVar.d) {
            if (j11 == Long.MIN_VALUE) {
                j11 = this.f10685n;
            } else {
                this.f10685n = j11;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, 1000 * j11);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f10686o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f10686o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f10686o.putInt(1431633921);
                }
                if (this.f10687p == 0) {
                    this.f10686o.putInt(4, remaining2);
                    this.f10686o.putLong(8, j11 * 1000);
                    this.f10686o.position(0);
                    this.f10687p = remaining2;
                }
                int remaining3 = this.f10686o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f10686o, remaining3, 1);
                    if (write2 < 0) {
                        this.f10687p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f10687p = 0;
                } else {
                    this.f10687p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z13 = true;
            }
            if (z13 && (m0Var = this.d) != null && (eVar = (n0Var = (n0) m0Var.f10701a).f10715i) != null) {
                b bVar = b.f10602f;
                n0Var.h = bVar;
                eVar.b(bVar);
            }
            throw new h(write, z13);
        }
        if (write == remaining) {
            z13 = true;
        }
        if (z12) {
            this.f10683l += write;
            return z13;
        }
        if (z13) {
            this.f10684m = (this.f10688q * i10) + this.f10684m;
        }
        return z13;
    }
}
