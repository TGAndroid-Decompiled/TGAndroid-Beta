package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.ui.Components.u31;
public final class t6 extends org.telegram.ui.Components.ys {
    public final org.telegram.ui.Components.y4 Y1;
    public int Z1;
    public final org.telegram.ui.Components.h6 f25591a2;
    public final int f25592b2;
    public final org.telegram.ui.ActionBar.h6 f25593c2;

    public t6(Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7, org.telegram.ui.ActionBar.h6 h6Var2) {
        super(context, h6Var);
        this.f25592b2 = i7;
        this.f25593c2 = h6Var2;
        this.Y1 = new org.telegram.ui.Components.y4(this);
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(false, true, true);
        this.f25591a2 = h6Var3;
        h6Var3.n(0.2f, 160L, org.telegram.ui.Components.wq.h);
        h6Var3.w(g0.L(15.33f));
        h6Var3.setCallback(this);
        h6Var3.f34187b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.Z1 < 0) {
            i7 = org.telegram.ui.ActionBar.m6.f28111p7;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.P5;
        }
        int a10 = this.Y1.a(org.telegram.ui.ActionBar.m6.w0(i7, this.f25593c2), false);
        org.telegram.ui.Components.h6 h6Var = this.f25591a2;
        h6Var.u(a10);
        h6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        h6Var.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.M0(2131753671, null));
        spannableStringBuilder.setSpan(new u31(g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(id.M0(2131749087, null));
        spannableStringBuilder2.setSpan(new u31(g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 7, spannableStringBuilder2);
        menu.add(2131296496, 2131296498, 8, id.M0(2131751744, null));
        menu.add(2131296496, 2131296503, 9, id.M0(2131746337, null));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        org.telegram.ui.Components.h6 h6Var = this.f25591a2;
        if (h6Var != null) {
            this.Z1 = this.f25592b2 - charSequence.length();
            h6Var.a();
            String str = "";
            if (this.Z1 <= 4) {
                str = "" + this.Z1;
            }
            h6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f25591a2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
