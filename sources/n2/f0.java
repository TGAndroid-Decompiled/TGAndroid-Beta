package n2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class f0 {
    public static final Object f20157t = new Object();
    public static ScheduledExecutorService f20158u;
    public static int v;
    public final AudioTrack f20159a;
    public final n f20160b;
    public final float f20161c;
    public final gf.g d;
    public b0 f20162e;
    public final i0 f20163f;
    public final boolean f20164g;
    public final int h;
    public final e0 f20165i;
    public final h2.r f20166j = new h2.r(Thread.currentThread());
    public boolean f20167k;
    public long f20168l;
    public long f20169m;
    public long f20170n;
    public ByteBuffer f20171o;
    public int f20172p;
    public int f20173q;
    public int f20174r;
    public boolean f20175s;

    public f0(AudioTrack audioTrack, n nVar, gf.g gVar, float f10, h2.g0 g0Var) {
        e0 e0Var;
        this.f20159a = audioTrack;
        this.f20160b = nVar;
        this.f20161c = f10;
        this.d = gVar;
        boolean M = h2.m0.M(nVar.f20242a);
        this.f20164g = M;
        if (M) {
            this.h = h2.m0.u(nVar.f20242a) * Integer.bitCount(nVar.f20244c);
        } else {
            this.h = -1;
        }
        this.f20163f = new i0(new g6.d0(this, 19), g0Var, audioTrack, nVar.f20242a, this.h, nVar.f20246f);
        if (Build.VERSION.SDK_INT >= 24 && gVar != null) {
            this.f20162e = new b0(audioTrack, gVar);
        }
        if (c()) {
            e0Var = new e0(this);
        } else {
            e0Var = null;
        }
        this.f20165i = e0Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: n2.f0.a():long");
    }

    public final long b() {
        if (this.f20164g) {
            long j3 = this.f20168l;
            long j10 = this.h;
            String str = h2.m0.f14112a;
            return ((j3 + j10) - 1) / j10;
        }
        return this.f20169m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f20159a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i7, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f20159a.setOffloadDelayPadding(i7, i10);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f20159a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            i0 i0Var = this.f20163f;
            i0Var.A = true;
            i0Var.h.f20345a.f20342f = true;
        }
    }

    public final void f(m2.j jVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a10 = jVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a10.equals(logSessionId)) {
                this.f20159a.setLogSessionId(a10);
            }
        }
    }

    public final boolean g(long j3, int i7, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        gf.g gVar;
        h0 h0Var;
        e eVar;
        boolean z9;
        int i10;
        boolean z10;
        long j10 = j3;
        n nVar = this.f20160b;
        boolean z11 = this.f20164g;
        if (!z11 && this.f20173q == 0) {
            this.f20173q = q0.k(nVar.f20242a, byteBuffer);
        }
        h2.r rVar = this.f20166j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f14139a;
        AudioTrack audioTrack2 = this.f20159a;
        boolean z12 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i10 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z13 = this.f20175s;
                long a10 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = h2.m0.f14112a;
                audioTrack = audioTrack2;
                if (b10 > h2.m0.a0(a10, sampleRate, 1000000L, RoundingMode.UP)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f20175s = z9;
                if (z13 && !z9 && audioTrack.getPlayState() != 1) {
                    i10 = this.f20174r + 1;
                } else {
                    i10 = this.f20174r;
                }
            }
            if (i10 > this.f20174r) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f20174r = i10;
            if (z10) {
                rVar.e(-1, new m2.d(23));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (nVar.d) {
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f20170n;
            } else {
                this.f20170n = j10;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j10 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f20171o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f20171o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f20171o.putInt(1431633921);
                }
                if (this.f20172p == 0) {
                    this.f20171o.putInt(4, remaining2);
                    this.f20171o.putLong(8, j10 * 1000);
                    this.f20171o.position(0);
                    this.f20172p = remaining2;
                }
                int remaining3 = this.f20171o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f20171o, remaining3, 1);
                    if (write2 < 0) {
                        this.f20172p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f20172p = 0;
                } else {
                    this.f20172p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z12 = true;
            }
            if (z12 && (gVar = this.d) != null && (eVar = (h0Var = (h0) gVar.f13889b).f20188i) != null) {
                b bVar = b.f20128f;
                h0Var.h = bVar;
                eVar.b(bVar);
            }
            throw new g(write, z12);
        }
        if (write == remaining) {
            z12 = true;
        }
        if (z11) {
            this.f20168l += write;
            return z12;
        }
        if (z12) {
            this.f20169m = (this.f20173q * i7) + this.f20169m;
        }
        return z12;
    }
}
