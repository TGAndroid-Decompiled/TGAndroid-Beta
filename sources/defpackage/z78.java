package defpackage;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class z78 extends FrameLayout {
    public x78[] a;
    public yn6[] b;
    public int c;
    public y78 d;
    public Paint e;

    public final void a(int i, yn6 yn6Var) {
        String str;
        this.b[i] = yn6Var;
        x78[] x78VarArr = this.a;
        if (yn6Var != null) {
            jo6 jo6Var = yn6Var.d;
            x78 x78Var = x78VarArr[i];
            bf0 bf0Var = x78Var.b;
            bf0Var.q();
            if (jo6Var != null && (str = jo6Var.I) != null) {
                bf0Var.r(jo6Var.J, jo6Var.K, true);
                boolean z = jo6Var.b;
                int i2 = jo6Var.C;
                if (z) {
                    bf0Var.o(mle.d("vthumb://", i2, ":", str), null, cmb.Q4);
                } else {
                    bf0Var.o(mle.d("thumb://", i2, ":", str), null, cmb.Q4);
                }
            } else {
                bf0Var.setImageDrawable(cmb.Q4);
            }
            ((TextView) x78Var.c).setText(yn6Var.c);
            ((TextView) x78Var.d).setText(String.format("%d", Integer.valueOf(yn6Var.e.size())));
            return;
        }
        x78VarArr[i].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        View[] viewArr = this.a;
        if (gm.O1()) {
            L = ((gm.L(490.0f) - gm.L(12.0f)) - (gm.L(4.0f) * (this.c - 1))) / this.c;
        } else {
            L = ((gm.q.x - gm.L(12.0f)) - (gm.L(4.0f) * (this.c - 1))) / this.c;
        }
        for (int i3 = 0; i3 < this.c; i3++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i3].getLayoutParams();
            layoutParams.topMargin = gm.L(4.0f);
            layoutParams.leftMargin = (gm.L(4.0f) + L) * i3;
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 51;
            viewArr[i3].setLayoutParams(layoutParams);
        }
        super.onMeasure(i, wi8.E(4.0f, L, 1073741824));
    }

    public void setAlbumsCount(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            x78[] x78VarArr = this.a;
            if (i3 < x78VarArr.length) {
                x78 x78Var = x78VarArr[i3];
                if (i3 < i) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                x78Var.setVisibility(i2);
                i3++;
            } else {
                this.c = i;
                return;
            }
        }
    }

    public void setDelegate(y78 y78Var) {
        this.d = y78Var;
    }
}
