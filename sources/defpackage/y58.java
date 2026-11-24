package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class y58 extends FrameLayout {
    public be0 a;
    public FrameLayout b;
    public wf2 c;
    public TextView d;
    public jo0 e;
    public int f;
    public int h;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.b(bkb.V9, bkb.W9, bkb.U9);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f + this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f, 1073741824));
    }

    public void setImage(jm6 jm6Var) {
        jo0 jo0Var = this.e;
        be0 be0Var = this.a;
        Drawable drawable = getResources().getDrawable(2131232455);
        String str = jm6Var.c;
        int i = jm6Var.C;
        String str2 = jm6Var.I;
        if (str != null) {
            be0Var.o(str, null, drawable);
        } else if (str2 != null) {
            be0Var.r(jm6Var.J, jm6Var.K, true);
            if (jm6Var.d()) {
                jo0Var.setVisibility(4);
                setContentDescription(k96.M0(2131753959, null));
                be0Var.o(mue.d("thumb://", i, ":", str2), null, drawable);
            } else if (jm6Var.b) {
                jo0Var.setVisibility(0);
                this.d.setText(gl.g0(jm6Var.E, false, false));
                setContentDescription(k96.M0(2131753930, null) + ", " + k96.z(jm6Var.E));
                StringBuilder sb = new StringBuilder("vthumb://");
                sb.append(i);
                be0Var.o(b00.j(sb, ":", str2), null, drawable);
            } else {
                jo0Var.setVisibility(4);
                setContentDescription(k96.M0(2131753945, null));
                be0Var.o(mue.d("thumb://", i, ":", str2), null, drawable);
            }
        } else {
            be0Var.setImageDrawable(drawable);
        }
    }

    public void setNum(int i) {
        this.c.setNum(i);
    }

    public void setImage(nm6 nm6Var) {
        be0 be0Var = this.a;
        Drawable drawable = getResources().getDrawable(2131232455);
        TLRPC.PhotoSize photoSize = nm6Var.M;
        if (photoSize != null) {
            be0Var.m(gl5.i(photoSize, nm6Var.K), null, drawable, nm6Var);
            return;
        }
        TLRPC.PhotoSize photoSize2 = nm6Var.L;
        if (photoSize2 != null) {
            be0Var.m(gl5.i(photoSize2, nm6Var.K), "80_80", drawable, nm6Var);
            return;
        }
        String str = nm6Var.c;
        if (str != null) {
            be0Var.o(str, null, drawable);
            return;
        }
        String str2 = nm6Var.D;
        if (str2 != null && str2.length() > 0) {
            be0Var.o(nm6Var.D, null, drawable);
        } else if (k27.W2(nm6Var.J)) {
            be0Var.m(gl5.c(ba4.w(nm6Var.J.thumbs, 320, false, null, false), nm6Var.J), null, drawable, nm6Var);
        } else {
            be0Var.setImageDrawable(drawable);
        }
    }
}
