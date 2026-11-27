package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
public final class m84 extends xt3 {
    public final ll f2;
    public int g2;
    public final hn h2;
    public final int i2;
    public final vnb j2;

    public m84(Activity activity, vnb vnbVar, int i, vnb vnbVar2) {
        super(activity, vnbVar);
        this.i2 = i;
        this.j2 = vnbVar2;
        this.f2 = new ll(this);
        hn hnVar = new hn(false, true, true);
        this.h2 = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.setCallback(this);
        hnVar.b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        if (this.g2 < 0) {
            i = aob.p7;
        } else {
            i = aob.P5;
        }
        int a = this.f2.a(aob.v0(i, this.j2), false);
        hn hnVar = this.h2;
        hnVar.u(a);
        hnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        hnVar.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131753664, null));
        spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ob6.M0(2131748841, null));
        spannableStringBuilder2.setSpan(new y7c(hl.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296498, 2131296499, 7, spannableStringBuilder2);
        menu.add(2131296498, 2131296500, 8, ob6.M0(2131751709, null));
        menu.add(2131296498, 2131296505, 9, ob6.M0(2131746064, null));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String valueOf;
        super.onTextChanged(charSequence, i, i2, i3);
        hn hnVar = this.h2;
        if (hnVar != null) {
            this.g2 = this.i2 - charSequence.length();
            hnVar.a();
            if (this.g2 > 4) {
                valueOf = "";
            } else {
                valueOf = String.valueOf(this.g2);
            }
            hnVar.t(valueOf, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.h2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
