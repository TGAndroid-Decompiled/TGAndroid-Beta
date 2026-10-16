package j2;

import android.media.AudioDescriptor;
import android.os.SystemClock;
import e2.m0;
import e2.o;
import k2.h0;
import k2.n0;
import k2.o0;
import k2.p0;
import k2.s0;
import k2.x;
public final class e implements o {
    public final int f12528a;

    public e(int i10) {
        this.f12528a = i10;
    }

    public static AudioDescriptor b(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override
    public void invoke(Object obj) {
        long j10;
        x xVar;
        switch (this.f12528a) {
            case 0:
                ((b) obj).getClass();
                return;
            case 1:
                ((b) obj).getClass();
                return;
            case 2:
                ((b) obj).getClass();
                return;
            case 3:
                ((b) obj).getClass();
                return;
            case 4:
                ((b) obj).getClass();
                return;
            case 5:
                ((b) obj).getClass();
                return;
            case 6:
                ((b) obj).getClass();
                return;
            case 7:
                ((b) obj).getClass();
                return;
            case 8:
                ((b) obj).getClass();
                return;
            case 9:
                ((b) obj).getClass();
                return;
            case 10:
                ((b) obj).getClass();
                return;
            case 11:
                ((b) obj).getClass();
                return;
            case 12:
                ((b) obj).getClass();
                return;
            case 13:
                ((b) obj).getClass();
                return;
            case 14:
                ((b) obj).getClass();
                return;
            case 15:
                ((b) obj).getClass();
                return;
            case 16:
                ((b) obj).getClass();
                return;
            case 17:
                ((b) obj).getClass();
                return;
            case 18:
                ((b) obj).getClass();
                return;
            case 19:
                ((b) obj).getClass();
                return;
            case 20:
                ((b) obj).getClass();
                return;
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                x xVar2 = ((n0) obj).f13965a.f14008n;
                if (xVar2 != null) {
                    xVar2.w();
                    return;
                }
                return;
            case 25:
                o0 o0Var = (o0) obj;
                s0 s0Var = o0Var.f13975b;
                if (o0Var.equals(s0Var.f14004j) && s0Var.f14008n != null) {
                    p0 p0Var = s0Var.f14010p;
                    int i10 = p0Var.f13977b;
                    if (i10 != -1) {
                        long j11 = ((k2.o) p0Var.e).f13969f / i10;
                        h0 h0Var = s0Var.f14014t;
                        h0Var.getClass();
                        j10 = m0.Y(h0Var.f13893a.getSampleRate(), j11);
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    s0Var.f14008n.t(((k2.o) s0Var.f14010p.e).f13969f, m0.h0(j10), SystemClock.elapsedRealtime() - s0Var.W);
                    return;
                }
                return;
            case 26:
                o0 o0Var2 = (o0) obj;
                o0Var2.getClass();
                s0.f13995c0.getAndDecrement();
                x xVar3 = o0Var2.f13975b.f14008n;
                if (xVar3 != 0) {
                    int i11 = o0Var2.f13974a.f13966a;
                    xVar3.F(new Object());
                    return;
                }
                return;
            case 27:
                o0 o0Var3 = (o0) obj;
                s0 s0Var2 = o0Var3.f13975b;
                if (o0Var3.equals(s0Var2.f14004j) && (xVar = s0Var2.f14008n) != null && s0Var2.O) {
                    xVar.G();
                    return;
                }
                return;
            case 28:
                o0 o0Var4 = (o0) obj;
                s0 s0Var3 = o0Var4.f13975b;
                if (o0Var4.equals(s0Var3.f14004j) && s0Var3.M) {
                    s0Var3.N = true;
                    return;
                }
                return;
        }
    }

    public e(a aVar, float f7) {
        this.f12528a = 20;
    }

    public e(a aVar, int i10) {
        this.f12528a = i10;
    }

    public e(a aVar, int i10, int i11) {
        this.f12528a = i11;
    }

    public e(a aVar, long j10) {
        this.f12528a = 11;
    }

    public e(a aVar, b2.x xVar, i2.f fVar) {
        this.f12528a = 2;
    }

    public e(a aVar, b2.p0 p0Var, int i10) {
        this.f12528a = 19;
    }

    public e(a aVar, Object obj, int i10) {
        this.f12528a = i10;
    }

    public e(a aVar, boolean z10, int i10) {
        this.f12528a = i10;
    }
}
