package j2;

import android.media.AudioDescriptor;
import android.os.SystemClock;
import b2.o0;
import b2.w;
import e2.m0;
import e2.o;
import k2.i0;
import k2.p0;
import k2.q0;
import k2.t0;
import k2.x;
public final class e implements o {
    public final int f13940a;

    public e(int i10) {
        this.f13940a = i10;
    }

    public static AudioDescriptor b(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override
    public void invoke(Object obj) {
        long j10;
        x xVar;
        switch (this.f13940a) {
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
                ((b) obj).getClass();
                return;
            case 22:
                ((b) obj).getClass();
                return;
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                p0 p0Var = (p0) obj;
                t0 t0Var = p0Var.f14778b;
                if (p0Var.equals(t0Var.f14810j) && (xVar = t0Var.f14814n) != null && t0Var.O) {
                    xVar.U();
                    return;
                }
                return;
            case 27:
                p0 p0Var2 = (p0) obj;
                t0 t0Var2 = p0Var2.f14778b;
                if (p0Var2.equals(t0Var2.f14810j) && t0Var2.f14814n != null) {
                    q0 q0Var = t0Var2.f14816p;
                    int i10 = q0Var.f14783b;
                    if (i10 != -1) {
                        long j11 = ((k2.o) q0Var.e).f14771f / i10;
                        i0 i0Var = t0Var2.f14820t;
                        i0Var.getClass();
                        j10 = m0.Y(i0Var.f14696a.getSampleRate(), j11);
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    t0Var2.f14814n.t(((k2.o) t0Var2.f14816p.e).f14771f, m0.h0(j10), SystemClock.elapsedRealtime() - t0Var2.W);
                    return;
                }
                return;
            case 28:
                p0 p0Var3 = (p0) obj;
                p0Var3.getClass();
                t0.f14801c0.getAndDecrement();
                x xVar2 = p0Var3.f14778b.f14814n;
                if (xVar2 != 0) {
                    int i11 = p0Var3.f14777a.f14768a;
                    xVar2.T(new Object());
                    return;
                }
                return;
        }
    }

    public e(a aVar, float f7) {
        this.f13940a = 22;
    }

    public e(a aVar, int i10) {
        this.f13940a = i10;
    }

    public e(a aVar, int i10, int i11) {
        this.f13940a = i11;
    }

    public e(a aVar, long j10) {
        this.f13940a = 13;
    }

    public e(a aVar, w wVar, i2.g gVar, int i10) {
        this.f13940a = i10;
    }

    public e(a aVar, o0 o0Var, int i10) {
        this.f13940a = 21;
    }

    public e(a aVar, Object obj, int i10) {
        this.f13940a = i10;
    }

    public e(a aVar, boolean z10, int i10) {
        this.f13940a = i10;
    }
}
