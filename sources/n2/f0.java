package n2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class f0 {
    public static final Object f20165t = new Object();
    public static ScheduledExecutorService f20166u;
    public static int v;
    public final AudioTrack f20167a;
    public final n f20168b;
    public final float f20169c;
    public final gf.g d;
    public b0 f20170e;
    public final i0 f20171f;
    public final boolean f20172g;
    public final int h;
    public final e0 f20173i;
    public final h2.r f20174j = new h2.r(Thread.currentThread());
    public boolean f20175k;
    public long f20176l;
    public long f20177m;
    public long f20178n;
    public ByteBuffer f20179o;
    public int f20180p;
    public int f20181q;
    public int f20182r;
    public boolean f20183s;

    public f0(AudioTrack audioTrack, n nVar, gf.g gVar, float f10, h2.g0 g0Var) {
        e0 e0Var;
        this.f20167a = audioTrack;
        this.f20168b = nVar;
        this.f20169c = f10;
        this.d = gVar;
        boolean M = h2.m0.M(nVar.f20250a);
        this.f20172g = M;
        if (M) {
            this.h = h2.m0.u(nVar.f20250a) * Integer.bitCount(nVar.f20252c);
        } else {
            this.h = -1;
        }
        this.f20171f = new i0(new g6.d0(this, 19), g0Var, audioTrack, nVar.f20250a, this.h, nVar.f20254f);
        if (Build.VERSION.SDK_INT >= 24 && gVar != null) {
            this.f20170e = new b0(audioTrack, gVar);
        }
        if (c()) {
            e0Var = new e0(this);
        } else {
            e0Var = null;
        }
        this.f20173i = e0Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: n2.f0.a():long");
    }

    public final long b() {
        if (this.f20172g) {
            long j3 = this.f20176l;
            long j10 = this.h;
            String str = h2.m0.f14114a;
            return ((j3 + j10) - 1) / j10;
        }
        return this.f20177m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f20167a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i7, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f20167a.setOffloadDelayPadding(i7, i10);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f20167a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            i0 i0Var = this.f20171f;
            i0Var.A = true;
            i0Var.h.f20353a.f20350f = true;
        }
    }

    public final void f(m2.j jVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a10 = jVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a10.equals(logSessionId)) {
                this.f20167a.setLogSessionId(a10);
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
        n nVar = this.f20168b;
        boolean z11 = this.f20172g;
        if (!z11 && this.f20181q == 0) {
            this.f20181q = q0.k(nVar.f20250a, byteBuffer);
        }
        h2.r rVar = this.f20174j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f14141a;
        AudioTrack audioTrack2 = this.f20167a;
        boolean z12 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i10 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z13 = this.f20183s;
                long a10 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = h2.m0.f14114a;
                audioTrack = audioTrack2;
                if (b10 > h2.m0.a0(a10, sampleRate, 1000000L, RoundingMode.UP)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f20183s = z9;
                if (z13 && !z9 && audioTrack.getPlayState() != 1) {
                    i10 = this.f20182r + 1;
                } else {
                    i10 = this.f20182r;
                }
            }
            if (i10 > this.f20182r) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f20182r = i10;
            if (z10) {
                rVar.e(-1, new m2.d(23));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (nVar.d) {
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f20178n;
            } else {
                this.f20178n = j10;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j10 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f20179o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f20179o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f20179o.putInt(1431633921);
                }
                if (this.f20180p == 0) {
                    this.f20179o.putInt(4, remaining2);
                    this.f20179o.putLong(8, j10 * 1000);
                    this.f20179o.position(0);
                    this.f20180p = remaining2;
                }
                int remaining3 = this.f20179o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f20179o, remaining3, 1);
                    if (write2 < 0) {
                        this.f20180p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f20180p = 0;
                } else {
                    this.f20180p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z12 = true;
            }
            if (z12 && (gVar = this.d) != null && (eVar = (h0Var = (h0) gVar.f13891b).f20196i) != null) {
                b bVar = b.f20136f;
                h0Var.h = bVar;
                eVar.b(bVar);
            }
            throw new g(write, z12);
        }
        if (write == remaining) {
            z12 = true;
        }
        if (z11) {
            this.f20176l += write;
            return z12;
        }
        if (z12) {
            this.f20177m = (this.f20181q * i7) + this.f20177m;
        }
        return z12;
    }
}
