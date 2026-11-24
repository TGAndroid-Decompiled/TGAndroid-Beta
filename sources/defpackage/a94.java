package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
public final class a94 extends qu3 {
    public final km e2;
    public int f2;
    public final ho g2;
    public final int h2;
    public final ylb i2;

    public a94(Activity activity, ylb ylbVar, int i, ylb ylbVar2) {
        super(activity, ylbVar);
        this.h2 = i;
        this.i2 = ylbVar2;
        this.e2 = new km(this);
        ho hoVar = new ho(false, true, true);
        this.g2 = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.setCallback(this);
        hoVar.b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        if (this.f2 < 0) {
            i = cmb.o7;
        } else {
            i = cmb.O5;
        }
        int a = this.e2.a(cmb.v0(i, this.i2), false);
        ho hoVar = this.g2;
        hoVar.u(a);
        hoVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        hoVar.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131753636, null));
        spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jb6.M0(2131748844, null));
        spannableStringBuilder2.setSpan(new z5c(gm.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296498, 2131296499, 7, spannableStringBuilder2);
        menu.add(2131296498, 2131296500, 8, jb6.M0(2131751681, null));
        menu.add(2131296498, 2131296505, 9, jb6.M0(2131746070, null));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String valueOf;
        super.onTextChanged(charSequence, i, i2, i3);
        ho hoVar = this.g2;
        if (hoVar != null) {
            this.f2 = this.h2 - charSequence.length();
            hoVar.a();
            if (this.f2 > 4) {
                valueOf = "";
            } else {
                valueOf = String.valueOf(this.f2);
            }
            hoVar.t(valueOf, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.g2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
