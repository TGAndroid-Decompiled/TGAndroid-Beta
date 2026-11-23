package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.ui.Components.l41;
public final class t6 extends org.telegram.ui.Components.ot {
    public final org.telegram.ui.Components.g5 f26978e2;
    public int f26979f2;
    public final org.telegram.ui.Components.n6 f26980g2;
    public final int f26981h2;
    public final org.telegram.ui.ActionBar.h6 f26982i2;

    public t6(Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7, org.telegram.ui.ActionBar.h6 h6Var2) {
        super(context, h6Var);
        this.f26981h2 = i7;
        this.f26982i2 = h6Var2;
        this.f26978e2 = new org.telegram.ui.Components.g5(this);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        this.f26980g2 = n6Var;
        n6Var.n(0.2f, 160L, org.telegram.ui.Components.nr.h);
        n6Var.w(g0.L(15.33f));
        n6Var.setCallback(this);
        n6Var.f37795b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.f26979f2 < 0) {
            i7 = org.telegram.ui.ActionBar.m6.f29602p7;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.P5;
        }
        int a10 = this.f26978e2.a(org.telegram.ui.ActionBar.m6.w0(i7, this.f26982i2), false);
        org.telegram.ui.Components.n6 n6Var = this.f26980g2;
        n6Var.u(a10);
        n6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        n6Var.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.N0(2131753668, null));
        spannableStringBuilder.setSpan(new l41(g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.N0(2131748894, null));
        spannableStringBuilder2.setSpan(new l41(g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296498, 2131296499, 7, spannableStringBuilder2);
        menu.add(2131296498, 2131296500, 8, hd.N0(2131751732, null));
        menu.add(2131296498, 2131296505, 9, hd.N0(2131746141, null));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        org.telegram.ui.Components.n6 n6Var = this.f26980g2;
        if (n6Var != null) {
            this.f26979f2 = this.f26981h2 - charSequence.length();
            n6Var.a();
            String str = "";
            if (this.f26979f2 <= 4) {
                str = "" + this.f26979f2;
            }
            n6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f26980g2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
