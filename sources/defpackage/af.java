package defpackage;

import android.view.View;
import android.widget.LinearLayout;
public final class af implements View.OnClickListener {
    public final byte a = 1;
    public final LinearLayout b;
    public final int[] c;

    public af(LinearLayout linearLayout, int[] iArr) {
        this.b = linearLayout;
        this.c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        byte b = this.a;
        int[] iArr = this.c;
        LinearLayout linearLayout = this.b;
        switch (b) {
            case 0:
                iArr[0] = ((Integer) view.getTag()).intValue();
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = linearLayout.getChildAt(i);
                    if (childAt instanceof wy8) {
                        wy8 wy8Var = (wy8) childAt;
                        if (childAt == view) {
                            z = true;
                        } else {
                            z = false;
                        }
                        wy8Var.c.a(z, true);
                    }
                }
                return;
            default:
                int childCount2 = linearLayout.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    wy8 wy8Var2 = (wy8) linearLayout.getChildAt(i2);
                    if (wy8Var2 == view) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    wy8Var2.c.a(z2, true);
                }
                iArr[0] = chb.f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public af(int[] iArr, LinearLayout linearLayout) {
        this.c = iArr;
        this.b = linearLayout;
    }
}
