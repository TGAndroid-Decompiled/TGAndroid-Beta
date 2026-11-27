package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
public final class yt3 extends xt3 {
    public final int f2;
    public final vnb g2;
    public final boolean h2;
    public final zt3 i2;

    public yt3(zt3 zt3Var, Context context, vnb vnbVar, int i, vnb vnbVar2, boolean z) {
        super(context, vnbVar);
        this.i2 = zt3Var;
        this.f2 = i;
        this.g2 = vnbVar2;
        this.h2 = z;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        zt3 zt3Var = this.i2;
        hn hnVar = zt3Var.y;
        ll llVar = zt3Var.w;
        if (zt3Var.x <= 0) {
            i = aob.p7;
        } else {
            i = aob.P5;
        }
        hnVar.u(llVar.a(aob.v0(i, this.g2), false));
        int min = Math.min(hl.L(52.0f), getHeight());
        hnVar.setBounds(getScrollX(), getHeight() - min, hl.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        hnVar.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (!this.h2 || menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131753664, null));
        spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ob6.M0(2131748841, null));
        spannableStringBuilder2.setSpan(new y7c(hl.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296498, 2131296499, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(ob6.M0(2131744090, null));
        ?? obj = new Object();
        obj.a |= 8;
        spannableStringBuilder3.setSpan(new smb(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296498, 2131296511, 8, spannableStringBuilder3);
        menu.add(2131296498, 2131296505, 9, ob6.M0(2131746064, null));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        zt3 zt3Var = this.i2;
        hn hnVar = zt3Var.y;
        if (hnVar != null && this.f2 > 0) {
            hnVar.a();
            zt3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.i2.y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
