package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
public final class ht3 extends gt3 {
    public final int e2;
    public final wjb f2;
    public final boolean g2;
    public final it3 h2;

    public ht3(it3 it3Var, Context context, wjb wjbVar, int i, wjb wjbVar2, boolean z) {
        super(context, wjbVar);
        this.h2 = it3Var;
        this.e2 = i;
        this.f2 = wjbVar2;
        this.g2 = z;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        it3 it3Var = this.h2;
        gn gnVar = it3Var.y;
        kl klVar = it3Var.w;
        if (it3Var.x <= 0) {
            i = bkb.o7;
        } else {
            i = bkb.O5;
        }
        gnVar.u(klVar.a(bkb.v0(i, this.f2), false));
        int min = Math.min(gl.L(52.0f), getHeight());
        gnVar.setBounds(getScrollX(), getHeight() - min, gl.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        gnVar.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (!this.g2 || menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131753668, null));
        spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(k96.M0(2131748895, null));
        spannableStringBuilder2.setSpan(new z3c(gl.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296498, 2131296499, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(k96.M0(2131744196, null));
        ?? obj = new Object();
        obj.a |= 8;
        spannableStringBuilder3.setSpan(new wib(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296498, 2131296511, 8, spannableStringBuilder3);
        menu.add(2131296498, 2131296505, 9, k96.M0(2131746144, null));
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
        it3 it3Var = this.h2;
        gn gnVar = it3Var.y;
        if (gnVar != null && this.e2 > 0) {
            gnVar.a();
            it3Var.c();
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
