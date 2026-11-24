package defpackage;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class x58 extends FrameLayout {
    public v58[] a;
    public xl6[] b;
    public int c;
    public w58 d;
    public Paint e;

    public final void a(int i, xl6 xl6Var) {
        String str;
        this.b[i] = xl6Var;
        v58[] v58VarArr = this.a;
        if (xl6Var != null) {
            jm6 jm6Var = xl6Var.d;
            v58 v58Var = v58VarArr[i];
            be0 be0Var = v58Var.b;
            be0Var.q();
            if (jm6Var != null && (str = jm6Var.I) != null) {
                be0Var.r(jm6Var.J, jm6Var.K, true);
                boolean z = jm6Var.b;
                int i2 = jm6Var.C;
                if (z) {
                    be0Var.o(mue.d("vthumb://", i2, ":", str), null, bkb.Q4);
                } else {
                    be0Var.o(mue.d("thumb://", i2, ":", str), null, bkb.Q4);
                }
            } else {
                be0Var.setImageDrawable(bkb.Q4);
            }
            ((TextView) v58Var.c).setText(xl6Var.c);
            ((TextView) v58Var.d).setText(String.format("%d", Integer.valueOf(xl6Var.e.size())));
            return;
        }
        v58VarArr[i].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        View[] viewArr = this.a;
        if (gl.O1()) {
            L = ((gl.L(490.0f) - gl.L(12.0f)) - (gl.L(4.0f) * (this.c - 1))) / this.c;
        } else {
            L = ((gl.q.x - gl.L(12.0f)) - (gl.L(4.0f) * (this.c - 1))) / this.c;
        }
        for (int i3 = 0; i3 < this.c; i3++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i3].getLayoutParams();
            layoutParams.topMargin = gl.L(4.0f);
            layoutParams.leftMargin = (gl.L(4.0f) + L) * i3;
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 51;
            viewArr[i3].setLayoutParams(layoutParams);
        }
        super.onMeasure(i, ug8.E(4.0f, L, 1073741824));
    }

    public void setAlbumsCount(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            v58[] v58VarArr = this.a;
            if (i3 < v58VarArr.length) {
                v58 v58Var = v58VarArr[i3];
                if (i3 < i) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                v58Var.setVisibility(i2);
                i3++;
            } else {
                this.c = i;
                return;
            }
        }
    }

    public void setDelegate(w58 w58Var) {
        this.d = w58Var;
    }
}
