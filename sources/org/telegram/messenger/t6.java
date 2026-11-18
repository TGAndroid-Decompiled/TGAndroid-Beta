package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.ui.Components.i41;
public final class t6 extends org.telegram.ui.Components.mt {
    public final org.telegram.ui.Components.f5 f26963e2;
    public int f26964f2;
    public final org.telegram.ui.Components.m6 f26965g2;
    public final int f26966h2;
    public final org.telegram.ui.ActionBar.i6 f26967i2;

    public t6(Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, org.telegram.ui.ActionBar.i6 i6Var2) {
        super(context, i6Var);
        this.f26966h2 = i7;
        this.f26967i2 = i6Var2;
        this.f26963e2 = new org.telegram.ui.Components.f5(this);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        this.f26965g2 = m6Var;
        m6Var.n(0.2f, 160L, org.telegram.ui.Components.lr.h);
        m6Var.w(g0.L(15.33f));
        m6Var.setCallback(this);
        m6Var.f37377b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.f26964f2 < 0) {
            i7 = org.telegram.ui.ActionBar.n6.f29615p7;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.P5;
        }
        int a10 = this.f26963e2.a(org.telegram.ui.ActionBar.n6.w0(i7, this.f26967i2), false);
        org.telegram.ui.Components.m6 m6Var = this.f26965g2;
        m6Var.u(a10);
        m6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        m6Var.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.M0(2131753669, null));
        spannableStringBuilder.setSpan(new i41(g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(gd.M0(2131748895, null));
        spannableStringBuilder2.setSpan(new i41(g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 7, spannableStringBuilder2);
        menu.add(2131296496, 2131296498, 8, gd.M0(2131751733, null));
        menu.add(2131296496, 2131296503, 9, gd.M0(2131746142, null));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        org.telegram.ui.Components.m6 m6Var = this.f26965g2;
        if (m6Var != null) {
            this.f26964f2 = this.f26966h2 - charSequence.length();
            m6Var.a();
            String str = "";
            if (this.f26964f2 <= 4) {
                str = "" + this.f26964f2;
            }
            m6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f26965g2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
