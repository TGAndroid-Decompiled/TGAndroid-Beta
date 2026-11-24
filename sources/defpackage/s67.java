package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class s67 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] a;
    public final TextView[] b;
    public final t67 c;

    public s67(t67 t67Var, Context context) {
        super(context);
        float f;
        this.c = t67Var;
        this.a = new TextView[4];
        this.b = new TextView[4];
        setOrientation(1);
        setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(16.0f));
        for (int i = 0; i < 2; i++) {
            LinearLayout i2 = hg9.i(context, 0);
            for (int i3 = 0; i3 < 2; i3++) {
                LinearLayout i4 = hg9.i(context, 1);
                LinearLayout i5 = hg9.i(context, 0);
                int i6 = (i << 1) + i3;
                this.a[i6] = new TextView(context);
                this.b[i6] = new TextView(context);
                this.a[i6].setTypeface(gm.o());
                this.a[i6].setTextSize(1, 17.0f);
                this.b[i6].setTextSize(1, 13.0f);
                this.b[i6].setGravity(3);
                i5.addView(this.a[i6]);
                i4.addView(i5);
                i4.addView(this.b[i6]);
                i2.addView(i4, qoe.l(1.0f, -1, -2));
            }
            if (i == 0) {
                f = 16.0f;
            } else {
                f = 0.0f;
            }
            addView(i2, qoe.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, f));
        }
    }

    public final void a() {
        for (int i = 0; i < 4; i++) {
            TextView textView = this.a[i];
            int i2 = cmb.F6;
            t67 t67Var = this.c;
            textView.setTextColor(cmb.v0(i2, t67Var.getResourceProvider()));
            this.b[i].setTextColor(cmb.v0(cmb.y6, t67Var.getResourceProvider()));
        }
    }
}
