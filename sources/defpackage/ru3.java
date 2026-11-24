package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
public final class ru3 extends qu3 {
    public final int e2;
    public final ylb f2;
    public final boolean g2;
    public final su3 h2;

    public ru3(su3 su3Var, Context context, ylb ylbVar, int i, ylb ylbVar2, boolean z) {
        super(context, ylbVar);
        this.h2 = su3Var;
        this.e2 = i;
        this.f2 = ylbVar2;
        this.g2 = z;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        su3 su3Var = this.h2;
        ho hoVar = su3Var.y;
        km kmVar = su3Var.w;
        if (su3Var.x <= 0) {
            i = cmb.o7;
        } else {
            i = cmb.O5;
        }
        hoVar.u(kmVar.a(cmb.v0(i, this.f2), false));
        int min = Math.min(gm.L(52.0f), getHeight());
        hoVar.setBounds(getScrollX(), getHeight() - min, gm.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        hoVar.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (!this.g2 || menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131753636, null));
        spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jb6.M0(2131748844, null));
        spannableStringBuilder2.setSpan(new z5c(gm.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296498, 2131296499, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(jb6.M0(2131744122, null));
        ?? obj = new Object();
        obj.a |= 8;
        spannableStringBuilder3.setSpan(new xkb(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296498, 2131296511, 8, spannableStringBuilder3);
        menu.add(2131296498, 2131296505, 9, jb6.M0(2131746070, null));
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
        su3 su3Var = this.h2;
        ho hoVar = su3Var.y;
        if (hoVar != null && this.e2 > 0) {
            hoVar.a();
            su3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.h2.y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
