package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class zq0 extends p79 {
    public final byte a;
    public final gr0 b;

    public zq0(gr0 gr0Var, byte b) {
        this.a = b;
        this.b = gr0Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        byte b = this.a;
        boolean z5 = true;
        gr0 gr0Var = this.b;
        switch (b) {
            case 0:
                if (view instanceof jja) {
                    jja jjaVar = (jja) view;
                    gr0Var.f.getClass();
                    int S = RecyclerView.S(jjaVar);
                    int i = gr0Var.h.J;
                    if (S < i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jjaVar.b0 = z;
                    int i2 = S % i;
                    if (i2 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jjaVar.W = z2;
                    if (i2 != i - 1) {
                        z5 = false;
                    }
                    jjaVar.a0 = z5;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    return;
                }
                rect.left = 0;
                rect.top = 0;
                rect.bottom = 0;
                rect.right = 0;
                return;
            default:
                if (view instanceof jja) {
                    jja jjaVar2 = (jja) view;
                    gr0Var.r.getClass();
                    int S2 = RecyclerView.S(jjaVar2);
                    int i3 = gr0Var.s.J;
                    if (S2 < i3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    jjaVar2.b0 = z3;
                    int i4 = S2 % i3;
                    if (i4 == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    jjaVar2.W = z4;
                    if (i4 != i3 - 1) {
                        z5 = false;
                    }
                    jjaVar2.a0 = z5;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    return;
                }
                rect.left = 0;
                rect.top = 0;
                rect.bottom = 0;
                rect.right = 0;
                return;
        }
    }
}
