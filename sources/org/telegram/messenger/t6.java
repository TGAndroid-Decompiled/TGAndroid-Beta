package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.ui.Components.y31;
public final class t6 extends org.telegram.ui.Components.ft {
    public final org.telegram.ui.Components.x4 f26622e2;
    public int f26623f2;
    public final org.telegram.ui.Components.g6 f26624g2;
    public final int f26625h2;
    public final org.telegram.ui.ActionBar.e6 f26626i2;

    public t6(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7, org.telegram.ui.ActionBar.e6 e6Var2) {
        super(context, e6Var);
        this.f26625h2 = i7;
        this.f26626i2 = e6Var2;
        this.f26622e2 = new org.telegram.ui.Components.x4(this);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.f26624g2 = g6Var;
        g6Var.n(0.2f, 160L, org.telegram.ui.Components.er.h);
        g6Var.w(g0.L(15.33f));
        g6Var.setCallback(this);
        g6Var.f34829b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.f26623f2 < 0) {
            i7 = org.telegram.ui.ActionBar.j6.f29070p7;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.P5;
        }
        int a10 = this.f26622e2.a(org.telegram.ui.ActionBar.j6.w0(i7, this.f26626i2), false);
        org.telegram.ui.Components.g6 g6Var = this.f26624g2;
        g6Var.u(a10);
        g6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        g6Var.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131753671, null));
        spannableStringBuilder.setSpan(new y31(g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.M0(2131749087, null));
        spannableStringBuilder2.setSpan(new y31(g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 7, spannableStringBuilder2);
        menu.add(2131296496, 2131296498, 8, hd.M0(2131751744, null));
        menu.add(2131296496, 2131296503, 9, hd.M0(2131746337, null));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        org.telegram.ui.Components.g6 g6Var = this.f26624g2;
        if (g6Var != null) {
            this.f26623f2 = this.f26625h2 - charSequence.length();
            g6Var.a();
            String str = "";
            if (this.f26623f2 <= 4) {
                str = "" + this.f26623f2;
            }
            g6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f26624g2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
