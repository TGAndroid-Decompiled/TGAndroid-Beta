package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.ui.Components.y41;
public final class w6 extends org.telegram.ui.Components.mt {
    public final org.telegram.ui.Components.w4 Y1;
    public int Z1;
    public final org.telegram.ui.Components.e6 a2;
    public final int f18998b2;
    public final org.telegram.ui.ActionBar.p6 f18999c2;

    public w6(Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10, org.telegram.ui.ActionBar.p6 p6Var2) {
        super(context, p6Var);
        this.f18998b2 = i10;
        this.f18999c2 = p6Var2;
        this.Y1 = new org.telegram.ui.Components.w4(this);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.a2 = e6Var;
        e6Var.n(0.2f, 160L, org.telegram.ui.Components.gr.h);
        e6Var.w(i0.L(15.33f));
        e6Var.setCallback(this);
        e6Var.f25744b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.Z1 < 0) {
            i10 = org.telegram.ui.ActionBar.t6.f21154p7;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.P5;
        }
        int a2 = this.Y1.a(org.telegram.ui.ActionBar.t6.w0(i10, this.f18999c2), false);
        org.telegram.ui.Components.e6 e6Var = this.a2;
        e6Var.u(a2);
        e6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        e6Var.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dd.L0(2131753671, null));
        spannableStringBuilder.setSpan(new y41(i0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(dd.L0(2131749097, null));
        spannableStringBuilder2.setSpan(new y41(i0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 7, spannableStringBuilder2);
        menu.add(2131296496, 2131296498, 8, dd.L0(2131751745, null));
        menu.add(2131296496, 2131296503, 9, dd.L0(2131746352, null));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        org.telegram.ui.Components.e6 e6Var = this.a2;
        if (e6Var != null) {
            this.Z1 = this.f18998b2 - charSequence.length();
            e6Var.a();
            String str = "";
            if (this.Z1 <= 4) {
                str = "" + this.Z1;
            }
            e6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.a2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
