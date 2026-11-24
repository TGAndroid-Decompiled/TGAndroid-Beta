package defpackage;

import android.app.Activity;
import android.content.Context;
public final class va extends q5c {
    public final byte n3 = 3;
    public final Object o3;

    public va(Context context, int i, tf8 tf8Var, jq8 jq8Var, jq8 jq8Var2, wjb wjbVar, lca lcaVar) {
        super(context, i, 0, false, tf8Var, jq8Var, jq8Var2, wjbVar, 3, 1);
        this.o3 = lcaVar;
    }

    @Override
    public final boolean F0(float f) {
        int i;
        switch (this.n3) {
            case 1:
                x02 x02Var = ((h12) this.o3).b;
                int L = gl.L(30.0f) + x02Var.Y3[0];
                if (!x02Var.a2) {
                    i = gl.m;
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
                h12 h12Var = (h12) this.o3;
                h12Var.b.H1(h12Var, 0);
                return;
            default:
                return;
        }
    }

    @Override
    public final void K1() {
        switch (this.n3) {
            case 2:
                gl.d0(((p6b) this.o3).b, new zf7(this, (byte) 2));
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
                h12 h12Var = (h12) obj;
                h12Var.b.H1(h12Var, 0);
                return;
            case 2:
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
            case 3:
                super.onLayout(z, i, i2, i3, i4);
                ((lca) obj).p();
                return;
            case 4:
                super.onLayout(z, i, i2, i3, i4);
                ((n5c) obj).c = -1;
                return;
        }
    }

    public va(p6b p6bVar, Context context, int i, yg7 yg7Var, im6 im6Var, f53 f53Var) {
        super(context, i, 0, false, yg7Var, im6Var, null, f53Var, -1, 0);
        this.o3 = p6bVar;
    }

    public va(eb ebVar, Activity activity, int i, f fVar, ta taVar, si5 si5Var) {
        super(activity, i, 0, false, fVar, taVar, null, si5Var);
        this.o3 = ebVar;
    }

    public va(h12 h12Var, Context context, int i, f fVar, b12 b12Var, b12 b12Var2, wjb wjbVar) {
        super(context, i, 0, false, fVar, b12Var, b12Var2, wjbVar);
        this.o3 = h12Var;
    }

    public va(n5c n5cVar, n5c n5cVar2, n4b n4bVar, m5c m5cVar, m5c m5cVar2) {
        super(n5cVar2, n4bVar, m5cVar, m5cVar2);
        this.o3 = n5cVar;
    }
}
