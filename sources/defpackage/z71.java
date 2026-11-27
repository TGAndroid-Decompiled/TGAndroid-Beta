package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class z71 extends FrameLayout {
    public final byte a;
    public int b;
    public final fn7 c;

    public z71(fn7 fn7Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.c = fn7Var;
        this.b = -1;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.a;
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.b != measuredWidth) {
                    this.b = measuredWidth;
                    ((j81) fn7Var).M.f();
                    return;
                }
                return;
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                int i5 = i4 - i2;
                int i6 = this.b;
                if (i6 != -1 && Math.abs(i6 - i5) > hl.L(20.0f)) {
                    pd2 pd2Var = (pd2) fn7Var;
                    pd2Var.b.A0(pd2Var.W - 1);
                }
                this.b = i5;
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                Point point = hl.q;
                int i7 = point.x + point.y;
                int i8 = this.b;
                if (i8 > 0 && i8 != i7) {
                    setVisibility(8);
                    ra5 ra5Var = (ra5) fn7Var;
                    ra5Var.y = false;
                    ra5Var.a();
                }
                this.b = i7;
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        switch (this.a) {
            case 2:
                super.setVisibility(i);
                if (i == 8) {
                    this.b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }

    public z71(j81 j81Var, Context context) {
        super(context);
        this.a = (byte) 0;
        this.c = j81Var;
    }
}
