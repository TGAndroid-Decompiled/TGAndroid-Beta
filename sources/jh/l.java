package jh;

import a8.qd;
import android.graphics.Bitmap;
import android.media.AudioDescriptor;
import android.os.Bundle;
import android.os.SystemClock;
import e2.n0;
import e2.o;
import f9.i0;
import java.util.List;
import k2.j0;
import k2.p;
import k2.p0;
import k2.q0;
import k2.r0;
import k2.u0;
import k2.y;
import m4.e0;
import m4.f0;
import m4.g1;
import m4.h1;
import m4.n1;
import m4.p1;
import m4.r;
import m4.t1;
import m4.v;
import m4.w;
import org.telegram.messenger.Utilities;
public final class l implements ih.b, o, e9.k, e0, h1, e2.j, g1 {
    public final int f15964a;

    public l(int i10) {
        this.f15964a = i10;
    }

    public static AudioDescriptor e(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f15964a) {
            case 0:
                int i10 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i10 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i10);
            default:
                int i11 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i11 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(i11);
        }
    }

    @Override
    public void accept(Object obj) {
        n1 n1Var = (n1) obj;
        switch (this.f15964a) {
            case 15:
                n1Var.B0();
                return;
            case 16:
                n1Var.e();
                return;
            case 17:
                n1Var.f0();
                return;
            case 18:
            case 23:
            default:
                n1Var.K();
                return;
            case 19:
                n1Var.C0();
                return;
            case 20:
                n1Var.J0();
                return;
            case 21:
                n1Var.V();
                return;
            case 22:
                n1Var.E();
                return;
            case 24:
                n1Var.I0();
                return;
            case 25:
                n1Var.H0();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        return i0.y(Integer.valueOf(((v2.i) obj).f50015a));
    }

    @Override
    public void b(n1 n1Var, w wVar, List list) {
        switch (this.f15964a) {
            case 28:
                n1Var.x0(list);
                return;
            default:
                n1Var.x0(list);
                return;
        }
    }

    @Override
    public Object c(f0 f0Var, w wVar, int i10) {
        switch (this.f15964a) {
            case 13:
                f0Var.getClass();
                throw new ClassCastException();
            case 14:
                f0Var.getClass();
                throw new ClassCastException();
            case 18:
                return f0Var.n(wVar);
            case 23:
                f0Var.getClass();
                throw new ClassCastException();
            default:
                qb.a aVar = f0Var.e;
                f0Var.s(wVar);
                aVar.getClass();
                return qd.b(new t1(-6));
        }
    }

    @Override
    public void d(v vVar, int i10) {
        switch (this.f15964a) {
            case 10:
                vVar.getClass();
                return;
            case 11:
                vVar.b(i10);
                return;
            default:
                vVar.getClass();
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        long j10;
        y yVar;
        switch (this.f15964a) {
            case 3:
                q0 q0Var = (q0) obj;
                u0 u0Var = q0Var.f16259b;
                if (q0Var.equals(u0Var.f16291j) && u0Var.f16295n != null) {
                    r0 r0Var = u0Var.f16297p;
                    int i10 = r0Var.f16264b;
                    if (i10 != -1) {
                        long j11 = ((p) r0Var.e).f16252f / i10;
                        j0 j0Var = u0Var.f16301t;
                        j0Var.getClass();
                        j10 = n0.Y(j0Var.f16177a.getSampleRate(), j11);
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    u0Var.f16295n.m(((p) u0Var.f16297p.e).f16252f, n0.h0(j10), SystemClock.elapsedRealtime() - u0Var.W);
                    return;
                }
                return;
            case 4:
                q0 q0Var2 = (q0) obj;
                q0Var2.getClass();
                u0.f16282c0.getAndDecrement();
                y yVar2 = q0Var2.f16259b.f16295n;
                if (yVar2 != 0) {
                    int i11 = q0Var2.f16258a.f16249a;
                    yVar2.J(new Object());
                    return;
                }
                return;
            case 5:
                q0 q0Var3 = (q0) obj;
                u0 u0Var2 = q0Var3.f16259b;
                if (q0Var3.equals(u0Var2.f16291j) && (yVar = u0Var2.f16295n) != null && u0Var2.O) {
                    yVar.N();
                    return;
                }
                return;
            case 6:
                q0 q0Var4 = (q0) obj;
                u0 u0Var3 = q0Var4.f16259b;
                if (q0Var4.equals(u0Var3.f16291j) && u0Var3.M) {
                    u0Var3.N = true;
                    return;
                }
                return;
            default:
                y yVar3 = ((p0) obj).f16257a.f16295n;
                if (yVar3 != null) {
                    yVar3.n();
                    return;
                }
                return;
        }
    }

    public l(Object obj, int i10) {
        this.f15964a = i10;
    }

    public l(String str, int i10, int i11, r rVar) {
        this.f15964a = 14;
    }

    public l(String str, b2.h1 h1Var) {
        this.f15964a = 26;
    }

    public l(boolean z10, p1 p1Var, Bundle bundle) {
        this.f15964a = 18;
    }
}
