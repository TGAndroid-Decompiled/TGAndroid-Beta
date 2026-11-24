package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class dq8 extends gt3 {
    public final kl e2;
    public int f2;
    public final gn g2;
    public final tq8 h2;

    public dq8(tq8 tq8Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.h2 = tq8Var;
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
        int a = this.e2.a(bkb.v0(i, this.h2.f), false);
        gn gnVar = this.g2;
        gnVar.u(a);
        gnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        gnVar.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String valueOf;
        super.onTextChanged(charSequence, i, i2, i3);
        gn gnVar = this.g2;
        if (gnVar != null) {
            this.f2 = 12 - charSequence.length();
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
