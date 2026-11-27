package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class p98 extends FrameLayout {
    public de0 a;
    public FrameLayout b;
    public og2 c;
    public TextView d;
    public jo0 e;
    public int f;
    public int h;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.b(aob.W9, aob.X9, aob.V9);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f + this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f, 1073741824));
    }

    public void setImage(no6 no6Var) {
        jo0 jo0Var = this.e;
        de0 de0Var = this.a;
        Drawable drawable = getResources().getDrawable(2131232466);
        String str = no6Var.c;
        int i = no6Var.C;
        String str2 = no6Var.I;
        if (str != null) {
            de0Var.o(str, null, drawable);
        } else if (str2 != null) {
            de0Var.r(no6Var.J, no6Var.K, true);
            if (no6Var.d()) {
                jo0Var.setVisibility(4);
                setContentDescription(ob6.M0(2131753955, null));
                de0Var.o(dze.d("thumb://", i, ":", str2), null, drawable);
            } else if (no6Var.b) {
                jo0Var.setVisibility(0);
                this.d.setText(hl.g0(no6Var.E, false, false));
                setContentDescription(ob6.M0(2131753926, null) + ", " + ob6.z(no6Var.E));
                StringBuilder sb = new StringBuilder("vthumb://");
                sb.append(i);
                de0Var.o(c00.k(sb, ":", str2), null, drawable);
            } else {
                jo0Var.setVisibility(4);
                setContentDescription(ob6.M0(2131753941, null));
                de0Var.o(dze.d("thumb://", i, ":", str2), null, drawable);
            }
        } else {
            de0Var.setImageDrawable(drawable);
        }
    }

    public void setNum(int i) {
        this.c.setNum(i);
    }

    public void setImage(ro6 ro6Var) {
        de0 de0Var = this.a;
        Drawable drawable = getResources().getDrawable(2131232466);
        TLRPC.PhotoSize photoSize = ro6Var.M;
        if (photoSize != null) {
            de0Var.m(jn5.i(photoSize, ro6Var.K), null, drawable, ro6Var);
            return;
        }
        TLRPC.PhotoSize photoSize2 = ro6Var.L;
        if (photoSize2 != null) {
            de0Var.m(jn5.i(photoSize2, ro6Var.K), "80_80", drawable, ro6Var);
            return;
        }
        String str = ro6Var.c;
        if (str != null) {
            de0Var.o(str, null, drawable);
            return;
        }
        String str2 = ro6Var.D;
        if (str2 != null && str2.length() > 0) {
            de0Var.o(ro6Var.D, null, drawable);
        } else if (r47.W2(ro6Var.J)) {
            de0Var.m(jn5.c(xb4.w(ro6Var.J.thumbs, 320, false, null, false), ro6Var.J), null, drawable, ro6Var);
        } else {
            de0Var.setImageDrawable(drawable);
        }
    }
}
