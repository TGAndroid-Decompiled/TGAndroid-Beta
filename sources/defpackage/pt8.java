package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class pt8 extends xt3 {
    public final ll f2;
    public int g2;
    public final hn h2;
    public final eu8 i2;

    public pt8(eu8 eu8Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.i2 = eu8Var;
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
        int a = this.f2.a(aob.v0(i, this.i2.f), false);
        hn hnVar = this.h2;
        hnVar.u(a);
        hnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        hnVar.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String valueOf;
        super.onTextChanged(charSequence, i, i2, i3);
        hn hnVar = this.h2;
        if (hnVar != null) {
            this.g2 = 12 - charSequence.length();
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
