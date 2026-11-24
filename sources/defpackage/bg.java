package defpackage;

import android.view.View;
import android.widget.LinearLayout;
public final class bg implements View.OnClickListener {
    public final byte a = 1;
    public final LinearLayout b;
    public final int[] c;

    public bg(LinearLayout linearLayout, int[] iArr) {
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
                    if (childAt instanceof x09) {
                        x09 x09Var = (x09) childAt;
                        if (childAt == view) {
                            z = true;
                        } else {
                            z = false;
                        }
                        x09Var.c.a(z, true);
                    }
                }
                return;
            default:
                int childCount2 = linearLayout.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    x09 x09Var2 = (x09) linearLayout.getChildAt(i2);
                    if (x09Var2 == view) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    x09Var2.c.a(z2, true);
                }
                iArr[0] = djb.f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public bg(int[] iArr, LinearLayout linearLayout) {
        this.c = iArr;
        this.b = linearLayout;
    }
}
