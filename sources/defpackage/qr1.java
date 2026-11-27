package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class qr1 extends FrameLayout {
    public final byte a;
    public final zu1 b;

    public qr1(zu1 zu1Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = zu1Var;
    }

    @Override
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int i5;
        switch (this.a) {
            case 1:
                zu1 zu1Var = this.b;
                if (view == zu1Var.j3) {
                    ImageView imageView = zu1Var.h3;
                    if (imageView != null && imageView.getVisibility() != 8) {
                        i5 = 66;
                    } else {
                        i5 = 18;
                    }
                    ImageView imageView2 = zu1Var.i3;
                    if (imageView2 != null && imageView2.getVisibility() != 8) {
                        i5 += 48;
                    }
                    ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin = hl.L(i5);
                }
                super.measureChildWithMargins(view, i, i2, i3, i4);
                return;
            default:
                super.measureChildWithMargins(view, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 2:
                super.setTranslationY(f);
                this.b.m1.invalidate();
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        boolean z;
        switch (this.a) {
            case 0:
                super.setVisibility(i);
                ykf ykfVar = this.b.xd;
                boolean z2 = false;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (getMeasuredWidth() > 0) {
                    z2 = true;
                }
                ykfVar.s(2, z, z2);
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }
}
