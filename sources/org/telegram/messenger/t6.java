package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.ui.Components.t31;
public final class t6 extends org.telegram.ui.Components.ys {
    public final org.telegram.ui.Components.z4 Y1;
    public int Z1;
    public final org.telegram.ui.Components.i6 f25577a2;
    public final int f25578b2;
    public final org.telegram.ui.ActionBar.f6 f25579c2;

    public t6(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7, org.telegram.ui.ActionBar.f6 f6Var2) {
        super(context, f6Var);
        this.f25578b2 = i7;
        this.f25579c2 = f6Var2;
        this.Y1 = new org.telegram.ui.Components.z4(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.f25577a2 = i6Var;
        i6Var.n(0.2f, 160L, org.telegram.ui.Components.xq.h);
        i6Var.w(g0.L(15.33f));
        i6Var.setCallback(this);
        i6Var.f34477b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.Z1 < 0) {
            i7 = org.telegram.ui.ActionBar.k6.f28069p7;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.P5;
        }
        int a10 = this.Y1.a(org.telegram.ui.ActionBar.k6.w0(i7, this.f25579c2), false);
        org.telegram.ui.Components.i6 i6Var = this.f25577a2;
        i6Var.u(a10);
        i6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        i6Var.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131753671, null));
        spannableStringBuilder.setSpan(new t31(g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.M0(2131749086, null));
        spannableStringBuilder2.setSpan(new t31(g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 7, spannableStringBuilder2);
        menu.add(2131296496, 2131296498, 8, hd.M0(2131751745, null));
        menu.add(2131296496, 2131296503, 9, hd.M0(2131746336, null));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        org.telegram.ui.Components.i6 i6Var = this.f25577a2;
        if (i6Var != null) {
            this.Z1 = this.f25578b2 - charSequence.length();
            i6Var.a();
            String str = "";
            if (this.Z1 <= 4) {
                str = "" + this.Z1;
            }
            i6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f25577a2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
