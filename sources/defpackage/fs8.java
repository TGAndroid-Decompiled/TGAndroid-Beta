package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class fs8 extends qu3 {
    public final km e2;
    public int f2;
    public final ho g2;
    public final vs8 h2;

    public fs8(vs8 vs8Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.h2 = vs8Var;
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
        int a = this.e2.a(cmb.v0(i, this.h2.f), false);
        ho hoVar = this.g2;
        hoVar.u(a);
        hoVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        hoVar.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String valueOf;
        super.onTextChanged(charSequence, i, i2, i3);
        ho hoVar = this.g2;
        if (hoVar != null) {
            this.f2 = 12 - charSequence.length();
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
