package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class py9 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final vz9 c;

    public py9(vz9 vz9Var, boolean z, byte b) {
        this.a = b;
        this.c = vz9Var;
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
        vz9 vz9Var = this.c;
        switch (b) {
            case 0:
                jy9 jy9Var = vz9Var.j0;
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                jy9Var.setVisibility(i);
                ty9 ty9Var = vz9Var.i0;
                if (!z) {
                    i2 = 0;
                }
                ty9Var.setVisibility(i2);
                vz9Var.G1 = null;
                if (!z && (arrayList2 = vz9Var.C1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = vz9Var.F1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    vz9Var.r0.E(false);
                }
                if (!z && (arrayList = vz9Var.D1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                FrameLayout frameLayout = vz9Var.k0;
                if (z && vz9Var.j0.getVisibility() == 0) {
                    i2 = 0;
                }
                frameLayout.setVisibility(i2);
                vz9Var.J1 = null;
                return;
        }
    }
}
