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
    public final int f13933a;

    public e(int i10) {
        this.f13933a = i10;
    }

    public static AudioDescriptor b(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override
    public void invoke(Object obj) {
        long j10;
        x xVar;
        switch (this.f13933a) {
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
                t0 t0Var = p0Var.f14771b;
                if (p0Var.equals(t0Var.f14803j) && (xVar = t0Var.f14807n) != null && t0Var.O) {
                    xVar.T();
                    return;
                }
                return;
            case 27:
                p0 p0Var2 = (p0) obj;
                t0 t0Var2 = p0Var2.f14771b;
                if (p0Var2.equals(t0Var2.f14803j) && t0Var2.f14807n != null) {
                    q0 q0Var = t0Var2.f14809p;
                    int i10 = q0Var.f14776b;
                    if (i10 != -1) {
                        long j11 = ((k2.o) q0Var.e).f14764f / i10;
                        i0 i0Var = t0Var2.f14813t;
                        i0Var.getClass();
                        j10 = m0.Y(i0Var.f14689a.getSampleRate(), j11);
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    t0Var2.f14807n.s(((k2.o) t0Var2.f14809p.e).f14764f, m0.h0(j10), SystemClock.elapsedRealtime() - t0Var2.W);
                    return;
                }
                return;
            case 28:
                p0 p0Var3 = (p0) obj;
                p0Var3.getClass();
                t0.f14794c0.getAndDecrement();
                x xVar2 = p0Var3.f14771b.f14807n;
                if (xVar2 != 0) {
                    int i11 = p0Var3.f14770a.f14761a;
                    xVar2.S(new Object());
                    return;
                }
                return;
        }
    }

    public e(a aVar, float f7) {
        this.f13933a = 22;
    }

    public e(a aVar, int i10) {
        this.f13933a = i10;
    }

    public e(a aVar, int i10, int i11) {
        this.f13933a = i11;
    }

    public e(a aVar, long j10) {
        this.f13933a = 13;
    }

    public e(a aVar, w wVar, i2.e eVar, int i10) {
        this.f13933a = i10;
    }

    public e(a aVar, o0 o0Var, int i10) {
        this.f13933a = 21;
    }

    public e(a aVar, Object obj, int i10) {
        this.f13933a = i10;
    }

    public e(a aVar, boolean z10, int i10) {
        this.f13933a = i10;
    }
}
