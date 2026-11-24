package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class z81 extends FrameLayout {
    public final byte a;
    public int b;
    public final jm7 c;

    public z81(jm7 jm7Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.c = jm7Var;
        this.b = -1;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.a;
        jm7 jm7Var = this.c;
        switch (b) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.b != measuredWidth) {
                    this.b = measuredWidth;
                    ((k91) jm7Var).M.f();
                    return;
                }
                return;
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                int i5 = i4 - i2;
                int i6 = this.b;
                if (i6 != -1 && Math.abs(i6 - i5) > gm.L(20.0f)) {
                    ke2 ke2Var = (ke2) jm7Var;
                    ke2Var.b.z0(ke2Var.W - 1);
                }
                this.b = i5;
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                Point point = gm.q;
                int i7 = point.x + point.y;
                int i8 = this.b;
                if (i8 > 0 && i8 != i7) {
                    setVisibility(8);
                    oa5 oa5Var = (oa5) jm7Var;
                    oa5Var.y = false;
                    oa5Var.a();
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

    public z81(k91 k91Var, Context context) {
        super(context);
        this.a = (byte) 0;
        this.c = k91Var;
    }
}
