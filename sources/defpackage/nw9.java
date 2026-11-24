package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class nw9 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final tx9 c;

    public nw9(tx9 tx9Var, boolean z, byte b) {
        this.a = b;
        this.c = tx9Var;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        byte b = this.a;
        int i2 = 8;
        boolean z = this.b;
        tx9 tx9Var = this.c;
        switch (b) {
            case 0:
                hw9 hw9Var = tx9Var.j0;
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                hw9Var.setVisibility(i);
                rw9 rw9Var = tx9Var.i0;
                if (!z) {
                    i2 = 0;
                }
                rw9Var.setVisibility(i2);
                tx9Var.G1 = null;
                if (!z && (arrayList2 = tx9Var.C1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = tx9Var.F1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    tx9Var.r0.E(false);
                }
                if (!z && (arrayList = tx9Var.D1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                FrameLayout frameLayout = tx9Var.k0;
                if (z && tx9Var.j0.getVisibility() == 0) {
                    i2 = 0;
                }
                frameLayout.setVisibility(i2);
                tx9Var.J1 = null;
                return;
        }
    }
}
