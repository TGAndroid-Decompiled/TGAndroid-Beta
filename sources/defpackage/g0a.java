package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class g0a extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final n1a c;

    public g0a(n1a n1aVar, boolean z, byte b) {
        this.a = b;
        this.c = n1aVar;
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
        n1a n1aVar = this.c;
        switch (b) {
            case 0:
                a0a a0aVar = n1aVar.j0;
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                a0aVar.setVisibility(i);
                k0a k0aVar = n1aVar.i0;
                if (!z) {
                    i2 = 0;
                }
                k0aVar.setVisibility(i2);
                n1aVar.G1 = null;
                if (!z && (arrayList2 = n1aVar.C1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = n1aVar.F1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    n1aVar.r0.E(false);
                }
                if (!z && (arrayList = n1aVar.D1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                FrameLayout frameLayout = n1aVar.k0;
                if (z && n1aVar.j0.getVisibility() == 0) {
                    i2 = 0;
                }
                frameLayout.setVisibility(i2);
                n1aVar.J1 = null;
                return;
        }
    }
}
