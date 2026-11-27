package defpackage;

import android.view.View;
import android.widget.LinearLayout;
public final class nf implements View.OnClickListener {
    public final byte a = 0;
    public final int[] b;
    public final LinearLayout c;

    public nf(LinearLayout linearLayout, int[] iArr) {
        this.c = linearLayout;
        this.b = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        byte b = this.a;
        LinearLayout linearLayout = this.c;
        int[] iArr = this.b;
        switch (b) {
            case 0:
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    j29 j29Var = (j29) linearLayout.getChildAt(i);
                    if (j29Var == view) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j29Var.c.a(z, true);
                }
                iArr[0] = ykb.f[((Integer) view.getTag()).intValue()];
                return;
            default:
                iArr[0] = ((Integer) view.getTag()).intValue();
                int childCount2 = linearLayout.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt = linearLayout.getChildAt(i2);
                    if (childAt instanceof j29) {
                        j29 j29Var2 = (j29) childAt;
                        if (childAt == view) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        j29Var2.c.a(z2, true);
                    }
                }
                return;
        }
    }

    public nf(int[] iArr, LinearLayout linearLayout) {
        this.b = iArr;
        this.c = linearLayout;
    }
}
