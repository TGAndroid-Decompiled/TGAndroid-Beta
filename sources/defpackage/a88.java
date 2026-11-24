package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class a88 extends FrameLayout {
    public bf0 a;
    public FrameLayout b;
    public jh2 c;
    public TextView d;
    public jp0 e;
    public int f;
    public int h;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.b(cmb.V9, cmb.W9, cmb.U9);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f + this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f, 1073741824));
    }

    public void setImage(jo6 jo6Var) {
        jp0 jp0Var = this.e;
        bf0 bf0Var = this.a;
        Drawable drawable = getResources().getDrawable(2131232467);
        String str = jo6Var.c;
        int i = jo6Var.C;
        String str2 = jo6Var.I;
        if (str != null) {
            bf0Var.o(str, null, drawable);
        } else if (str2 != null) {
            bf0Var.r(jo6Var.J, jo6Var.K, true);
            if (jo6Var.d()) {
                jp0Var.setVisibility(4);
                setContentDescription(jb6.M0(2131753927, null));
                bf0Var.o(mle.d("thumb://", i, ":", str2), null, drawable);
            } else if (jo6Var.b) {
                jp0Var.setVisibility(0);
                this.d.setText(gm.g0(jo6Var.E, false, false));
                setContentDescription(jb6.M0(2131753898, null) + ", " + jb6.z(jo6Var.E));
                StringBuilder sb = new StringBuilder("vthumb://");
                sb.append(i);
                bf0Var.o(b10.j(sb, ":", str2), null, drawable);
            } else {
                jp0Var.setVisibility(4);
                setContentDescription(jb6.M0(2131753913, null));
                bf0Var.o(mle.d("thumb://", i, ":", str2), null, drawable);
            }
        } else {
            bf0Var.setImageDrawable(drawable);
        }
    }

    public void setNum(int i) {
        this.c.setNum(i);
    }

    public void setImage(no6 no6Var) {
        bf0 bf0Var = this.a;
        Drawable drawable = getResources().getDrawable(2131232467);
        TLRPC.PhotoSize photoSize = no6Var.M;
        if (photoSize != null) {
            bf0Var.m(gn5.i(photoSize, no6Var.K), null, drawable, no6Var);
            return;
        }
        TLRPC.PhotoSize photoSize2 = no6Var.L;
        if (photoSize2 != null) {
            bf0Var.m(gn5.i(photoSize2, no6Var.K), "80_80", drawable, no6Var);
            return;
        }
        String str = no6Var.c;
        if (str != null) {
            bf0Var.o(str, null, drawable);
            return;
        }
        String str2 = no6Var.D;
        if (str2 != null && str2.length() > 0) {
            bf0Var.o(no6Var.D, null, drawable);
        } else if (k47.W2(no6Var.J)) {
            bf0Var.m(gn5.c(bc4.w(no6Var.J.thumbs, 320, false, null, false), no6Var.J), null, drawable, no6Var);
        } else {
            bf0Var.setImageDrawable(drawable);
        }
    }
}
