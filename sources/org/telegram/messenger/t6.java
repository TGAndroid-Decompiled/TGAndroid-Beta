package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.ui.Components.k41;
public final class t6 extends org.telegram.ui.Components.mt {
    public final org.telegram.ui.Components.f5 f27062e2;
    public int f27063f2;
    public final org.telegram.ui.Components.m6 f27064g2;
    public final int f27065h2;
    public final org.telegram.ui.ActionBar.i6 f27066i2;

    public t6(Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, org.telegram.ui.ActionBar.i6 i6Var2) {
        super(context, i6Var);
        this.f27065h2 = i7;
        this.f27066i2 = i6Var2;
        this.f27062e2 = new org.telegram.ui.Components.f5(this);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        this.f27064g2 = m6Var;
        m6Var.n(0.2f, 160L, org.telegram.ui.Components.kr.h);
        m6Var.w(g0.L(15.33f));
        m6Var.setCallback(this);
        m6Var.f37394b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.f27063f2 < 0) {
            i7 = org.telegram.ui.ActionBar.n6.f29672p7;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.P5;
        }
        int a10 = this.f27062e2.a(org.telegram.ui.ActionBar.n6.w0(i7, this.f27066i2), false);
        org.telegram.ui.Components.m6 m6Var = this.f27064g2;
        m6Var.u(a10);
        m6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        m6Var.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131753668, null));
        spannableStringBuilder.setSpan(new k41(g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(gd.N0(2131748894, null));
        spannableStringBuilder2.setSpan(new k41(g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296498, 2131296499, 7, spannableStringBuilder2);
        menu.add(2131296498, 2131296500, 8, gd.N0(2131751732, null));
        menu.add(2131296498, 2131296505, 9, gd.N0(2131746141, null));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        org.telegram.ui.Components.m6 m6Var = this.f27064g2;
        if (m6Var != null) {
            this.f27063f2 = this.f27065h2 - charSequence.length();
            m6Var.a();
            String str = "";
            if (this.f27063f2 <= 4) {
                str = "" + this.f27063f2;
            }
            m6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f27064g2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
