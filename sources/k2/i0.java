package k2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class i0 {
    public static final Object f14694t = new Object();
    public static ScheduledExecutorService f14695u;
    public static int v;
    public final AudioTrack f14696a;
    public final o f14697b;
    public final float f14698c;
    public final a6.i d;
    public d0 e;
    public final l0 f14699f;
    public final boolean f14700g;
    public final int h;
    public final h0 f14701i;
    public final e2.r f14702j = new e2.r(Thread.currentThread());
    public boolean f14703k;
    public long f14704l;
    public long f14705m;
    public long f14706n;
    public ByteBuffer f14707o;
    public int f14708p;
    public int f14709q;
    public int f14710r;
    public boolean f14711s;

    public i0(AudioTrack audioTrack, o oVar, a6.i iVar, float f7, e2.g0 g0Var) {
        h0 h0Var;
        this.f14696a = audioTrack;
        this.f14697b = oVar;
        this.f14698c = f7;
        this.d = iVar;
        boolean M = e2.m0.M(oVar.f14768a);
        this.f14700g = M;
        if (M) {
            this.h = e2.m0.u(oVar.f14768a) * Integer.bitCount(oVar.f14770c);
        } else {
            this.h = -1;
        }
        this.f14699f = new l0(new ya.d(this, 26), g0Var, audioTrack, oVar.f14768a, this.h, oVar.f14771f);
        if (Build.VERSION.SDK_INT >= 24 && iVar != null) {
            this.e = new d0(audioTrack, iVar);
        }
        if (c()) {
            h0Var = new h0(this);
        } else {
            h0Var = null;
        }
        this.f14701i = h0Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.i0.a():long");
    }

    public final long b() {
        if (this.f14700g) {
            long j10 = this.f14704l;
            long j11 = this.h;
            String str = e2.m0.f8254a;
            return ((j10 + j11) - 1) / j11;
        }
        return this.f14705m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f14696a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i10, int i11) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f14696a.setOffloadDelayPadding(i10, i11);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f14696a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            l0 l0Var = this.f14699f;
            l0Var.A = true;
            l0Var.h.f14651a.f14643f = true;
        }
    }

    public final void f(j2.k kVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a2 = kVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a2.equals(logSessionId)) {
                this.f14696a.setLogSessionId(a2);
            }
        }
    }

    public final boolean g(long j10, int i10, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        a6.i iVar;
        k0 k0Var;
        e eVar;
        boolean z10;
        int i11;
        boolean z11;
        long j11 = j10;
        o oVar = this.f14697b;
        boolean z12 = this.f14700g;
        if (!z12 && this.f14709q == 0) {
            this.f14709q = t0.k(oVar.f14768a, byteBuffer);
        }
        e2.r rVar = this.f14702j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f8274a;
        AudioTrack audioTrack2 = this.f14696a;
        boolean z13 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i11 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z14 = this.f14711s;
                long a2 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = e2.m0.f8254a;
                audioTrack = audioTrack2;
                if (b10 > e2.m0.a0(a2, sampleRate, 1000000L, RoundingMode.UP)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f14711s = z10;
                if (z14 && !z10 && audioTrack.getPlayState() != 1) {
                    i11 = this.f14710r + 1;
                } else {
                    i11 = this.f14710r;
                }
            }
            if (i11 > this.f14710r) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f14710r = i11;
            if (z11) {
                rVar.e(-1, new j2.e(27));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (oVar.d) {
            if (j11 == Long.MIN_VALUE) {
                j11 = this.f14706n;
            } else {
                this.f14706n = j11;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j11 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f14707o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f14707o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f14707o.putInt(1431633921);
                }
                if (this.f14708p == 0) {
                    this.f14707o.putInt(4, remaining2);
                    this.f14707o.putLong(8, j11 * 1000);
                    this.f14707o.position(0);
                    this.f14708p = remaining2;
                }
                int remaining3 = this.f14707o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f14707o, remaining3, 1);
                    if (write2 < 0) {
                        this.f14708p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f14708p = 0;
                } else {
                    this.f14708p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z13 = true;
            }
            if (z13 && (iVar = this.d) != null && (eVar = (k0Var = (k0) iVar.f307b).f14728i) != null) {
                b bVar = b.f14646f;
                k0Var.h = bVar;
                eVar.b(bVar);
            }
            throw new h(write, z13);
        }
        if (write == remaining) {
            z13 = true;
        }
        if (z12) {
            this.f14704l += write;
            return z13;
        }
        if (z13) {
            this.f14705m = (this.f14709q * i10) + this.f14705m;
        }
        return z13;
    }
}
