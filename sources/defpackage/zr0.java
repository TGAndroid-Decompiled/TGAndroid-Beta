package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class zr0 extends e69 {
    public final byte a;
    public final gs0 b;

    public zr0(gs0 gs0Var, byte b) {
        this.a = b;
        this.b = gs0Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        byte b = this.a;
        boolean z5 = true;
        gs0 gs0Var = this.b;
        switch (b) {
            case 0:
                if (view instanceof sha) {
                    sha shaVar = (sha) view;
                    gs0Var.f.getClass();
                    int R = RecyclerView.R(shaVar);
                    int i = gs0Var.h.J;
                    if (R < i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    shaVar.b0 = z;
                    int i2 = R % i;
                    if (i2 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    shaVar.W = z2;
                    if (i2 != i - 1) {
                        z5 = false;
                    }
                    shaVar.a0 = z5;
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
                if (view instanceof sha) {
                    sha shaVar2 = (sha) view;
                    gs0Var.r.getClass();
                    int R2 = RecyclerView.R(shaVar2);
                    int i3 = gs0Var.s.J;
                    if (R2 < i3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    shaVar2.b0 = z3;
                    int i4 = R2 % i3;
                    if (i4 == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    shaVar2.W = z4;
                    if (i4 != i3 - 1) {
                        z5 = false;
                    }
                    shaVar2.a0 = z5;
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
