package defpackage;

import android.app.Activity;
import android.content.Context;
public final class va extends q7c {
    public final byte n3 = 3;
    public final Object o3;

    public va(Context context, int i, vh8 vh8Var, ms8 ms8Var, ms8 ms8Var2, ylb ylbVar, lea leaVar) {
        super(context, i, 0, false, vh8Var, ms8Var, ms8Var2, ylbVar, 3, 1);
        this.o3 = leaVar;
    }

    @Override
    public final boolean F0(float f) {
        int i;
        switch (this.n3) {
            case 1:
                i22 i22Var = ((s22) this.o3).b;
                int L = gm.L(30.0f) + i22Var.Y3[0];
                if (!i22Var.a2) {
                    i = gm.m;
                } else {
                    i = 0;
                }
                if (f < L + i) {
                    return false;
                }
                return true;
            default:
                return super.F0(f);
        }
    }

    @Override
    public final void F1() {
        switch (this.n3) {
            case 1:
                s22 s22Var = (s22) this.o3;
                s22Var.b.H1(s22Var, 0);
                return;
            default:
                return;
        }
    }

    @Override
    public final void K1() {
        switch (this.n3) {
            case 2:
                gm.d0(((r8b) this.o3).b, new ci7(this, (byte) 2));
                return;
            default:
                return;
        }
    }

    @Override
    public final Integer W0(int i) {
        switch (this.n3) {
            case 2:
                return 0;
            default:
                return super.W0(i);
        }
    }

    @Override
    public final void m0(int i) {
        cb cbVar;
        switch (this.n3) {
            case 0:
                if (!canScrollVertically(1) && (cbVar = ((eb) this.o3).E) != null && cbVar.h) {
                    cbVar.d();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.n3;
        Object obj = this.o3;
        switch (b) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                s22 s22Var = (s22) obj;
                s22Var.b.H1(s22Var, 0);
                return;
            case 2:
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
            case 3:
                super.onLayout(z, i, i2, i3, i4);
                ((lea) obj).p();
                return;
            case 4:
                super.onLayout(z, i, i2, i3, i4);
                ((n7c) obj).c = -1;
                return;
        }
    }

    public va(r8b r8bVar, Activity activity, int i, bj7 bj7Var, cj6 cj6Var, r63 r63Var) {
        super(activity, i, 0, false, bj7Var, cj6Var, null, r63Var, -1, 0);
        this.o3 = r8bVar;
    }

    public va(eb ebVar, Activity activity, int i, f fVar, ta taVar, rk5 rk5Var) {
        super(activity, i, 0, false, fVar, taVar, null, rk5Var);
        this.o3 = ebVar;
    }

    public va(s22 s22Var, Context context, int i, f fVar, m22 m22Var, m22 m22Var2, ylb ylbVar) {
        super(context, i, 0, false, fVar, m22Var, m22Var2, ylbVar);
        this.o3 = s22Var;
    }

    public va(n7c n7cVar, n7c n7cVar2, o6b o6bVar, m7c m7cVar, m7c m7cVar2) {
        super(n7cVar2, o6bVar, m7cVar, m7cVar2);
        this.o3 = n7cVar;
    }
}
