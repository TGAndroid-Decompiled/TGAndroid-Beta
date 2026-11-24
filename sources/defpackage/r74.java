package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
public final class r74 extends gt3 {
    public final kl e2;
    public int f2;
    public final gn g2;
    public final int h2;
    public final wjb i2;

    public r74(Activity activity, wjb wjbVar, int i, wjb wjbVar2) {
        super(activity, wjbVar);
        this.h2 = i;
        this.i2 = wjbVar2;
        this.e2 = new kl(this);
        gn gnVar = new gn(false, true, true);
        this.g2 = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.setCallback(this);
        gnVar.b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        if (this.f2 < 0) {
            i = bkb.o7;
        } else {
            i = bkb.O5;
        }
        int a = this.e2.a(bkb.v0(i, this.i2), false);
        gn gnVar = this.g2;
        gnVar.u(a);
        gnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        gnVar.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131753668, null));
        spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(k96.M0(2131748895, null));
        spannableStringBuilder2.setSpan(new z3c(gl.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296498, 2131296499, 7, spannableStringBuilder2);
        menu.add(2131296498, 2131296500, 8, k96.M0(2131751732, null));
        menu.add(2131296498, 2131296505, 9, k96.M0(2131746144, null));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String valueOf;
        super.onTextChanged(charSequence, i, i2, i3);
        gn gnVar = this.g2;
        if (gnVar != null) {
            this.f2 = this.h2 - charSequence.length();
            gnVar.a();
            if (this.f2 > 4) {
                valueOf = "";
            } else {
                valueOf = String.valueOf(this.f2);
            }
            gnVar.t(valueOf, true, true);
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
