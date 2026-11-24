package defpackage;

import android.view.View;
import android.view.WindowInsets;
public final class cz2 implements pq4, qq7 {
    public final hz2 a;

    public cz2(hz2 hz2Var) {
        this.a = hz2Var;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        boolean z;
        WindowInsets g = wzcVar.g();
        hz2 hz2Var = this.a;
        hz2Var.q0(g);
        fn0 fn0Var = hz2Var.T1;
        if (wzcVar.a.f(8).d > 0) {
            z = true;
        } else {
            z = false;
        }
        fn0Var.a(z, true);
        return wzc.b;
    }

    @Override
    public final void a(int i) {
        int min = Math.min(i, gm.L(144.0f));
        if (i > 0) {
            min -= gm.L(8.0f);
        }
        hz2 hz2Var = this.a;
        if (hz2Var.g2 != min) {
            hz2Var.g2 = min;
            hz2Var.S1.a(min);
            hz2Var.c2.postOnAnimation(new xf2(hz2Var, (byte) 17));
        }
    }
}
