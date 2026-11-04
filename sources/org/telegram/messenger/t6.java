package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.ui.Components.o31;
public final class t6 extends org.telegram.ui.Components.xs {
    public final org.telegram.ui.Components.x4 Z1;
    public int f25482a2;
    public final org.telegram.ui.Components.g6 f25483b2;
    public final int c2;
    public final org.telegram.ui.ActionBar.e6 f25484d2;

    public t6(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3, org.telegram.ui.ActionBar.e6 e6Var2) {
        super(context, e6Var);
        this.c2 = i3;
        this.f25484d2 = e6Var2;
        this.Z1 = new org.telegram.ui.Components.x4(this);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.f25483b2 = g6Var;
        g6Var.n(0.2f, 160L, org.telegram.ui.Components.xq.h);
        g6Var.w(g0.L(15.33f));
        g6Var.setCallback(this);
        g6Var.f33983b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i3;
        super.dispatchDraw(canvas);
        if (this.f25482a2 < 0) {
            i3 = org.telegram.ui.ActionBar.k6.f28102p7;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.P5;
        }
        int a10 = this.Z1.a(org.telegram.ui.ActionBar.k6.w0(i3, this.f25484d2), false);
        org.telegram.ui.Components.g6 g6Var = this.f25483b2;
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131753671, null));
        spannableStringBuilder.setSpan(new o31(g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bd.M0(2131749095, null));
        spannableStringBuilder2.setSpan(new o31(g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 7, spannableStringBuilder2);
        menu.add(2131296496, 2131296498, 8, bd.M0(2131751745, null));
        menu.add(2131296496, 2131296503, 9, bd.M0(2131746345, null));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
        org.telegram.ui.Components.g6 g6Var = this.f25483b2;
        if (g6Var != null) {
            this.f25482a2 = this.c2 - charSequence.length();
            g6Var.a();
            String str = "";
            if (this.f25482a2 <= 4) {
                str = "" + this.f25482a2;
            }
            g6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f25483b2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
