package k2;

import android.media.AudioDescriptor;
import android.os.Bundle;
import android.os.SystemClock;
import m4.g1;
import m4.m1;
import m4.o1;
import m4.s1;
import v7.q8;
public final class f implements e2.o, d9.k, i5.g, m4.e0, g1, e2.j {
    public final int f14726a;

    public f(int i10) {
        this.f14726a = i10;
    }

    public static AudioDescriptor b(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override
    public Object a(m4.f0 f0Var, m4.v vVar, int i10) {
        switch (this.f14726a) {
            case 16:
                f0Var.getClass();
                throw new ClassCastException();
            case 17:
                f0Var.getClass();
                throw new ClassCastException();
            case 21:
                return f0Var.n(vVar);
            case 26:
                f0Var.getClass();
                throw new ClassCastException();
            default:
                pb.a aVar = f0Var.e;
                f0Var.s(vVar);
                aVar.getClass();
                return q8.b(new s1(-6));
        }
    }

    @Override
    public void accept(Object obj) {
        m1 m1Var = (m1) obj;
        switch (this.f14726a) {
            case 18:
                m1Var.B0();
                return;
            case 19:
                m1Var.e();
                return;
            case 20:
                m1Var.f0();
                return;
            case 21:
            case 26:
            default:
                m1Var.H0();
                return;
            case 22:
                m1Var.C0();
                return;
            case 23:
                m1Var.J0();
                return;
            case 24:
                m1Var.V();
                return;
            case 25:
                m1Var.E();
                return;
            case 27:
                m1Var.I0();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        return e9.n0.y(Integer.valueOf(((v2.i) obj).f48341a));
    }

    @Override
    public void e(m4.u uVar, int i10) {
        switch (this.f14726a) {
            case 13:
                uVar.getClass();
                return;
            case 14:
                uVar.b(i10);
                return;
            default:
                uVar.getClass();
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        long j10;
        y yVar;
        switch (this.f14726a) {
            case 1:
                p0 p0Var = (p0) obj;
                t0 t0Var = p0Var.f14822b;
                if (p0Var.equals(t0Var.f14851j) && t0Var.f14855n != null) {
                    q0 q0Var = t0Var.f14857p;
                    int i10 = q0Var.f14824b;
                    if (i10 != -1) {
                        long j11 = ((p) q0Var.e).f14816f / i10;
                        i0 i0Var = t0Var.f14861t;
                        i0Var.getClass();
                        j10 = e2.m0.Y(i0Var.f14740a.getSampleRate(), j11);
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    t0Var.f14855n.t(((p) t0Var.f14857p.e).f14816f, e2.m0.h0(j10), SystemClock.elapsedRealtime() - t0Var.W);
                    return;
                }
                return;
            case 2:
                p0 p0Var2 = (p0) obj;
                p0Var2.getClass();
                t0.f14842c0.getAndDecrement();
                y yVar2 = p0Var2.f14822b.f14855n;
                if (yVar2 != 0) {
                    int i11 = p0Var2.f14821a.f14813a;
                    yVar2.T(new Object());
                    return;
                }
                return;
            case 3:
                p0 p0Var3 = (p0) obj;
                t0 t0Var2 = p0Var3.f14822b;
                if (p0Var3.equals(t0Var2.f14851j) && (yVar = t0Var2.f14855n) != null && t0Var2.O) {
                    yVar.U();
                    return;
                }
                return;
            case 4:
                p0 p0Var4 = (p0) obj;
                t0 t0Var3 = p0Var4.f14822b;
                if (p0Var4.equals(t0Var3.f14851j) && t0Var3.M) {
                    t0Var3.N = true;
                    return;
                }
                return;
            default:
                y yVar3 = ((o0) obj).f14812a.f14855n;
                if (yVar3 != null) {
                    yVar3.B();
                    return;
                }
                return;
        }
    }

    public f(Object obj, int i10) {
        this.f14726a = i10;
    }

    public f(String str, int i10, int i11, m4.q qVar) {
        this.f14726a = 17;
    }

    public f(String str, b2.g1 g1Var) {
        this.f14726a = 29;
    }

    public f(boolean z10, o1 o1Var, Bundle bundle) {
        this.f14726a = 21;
    }

    @Override
    public void c(Exception exc) {
    }
}
