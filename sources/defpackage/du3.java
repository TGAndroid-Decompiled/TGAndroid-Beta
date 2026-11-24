package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
public final class du3 extends cv3 {
    public final ylb W;
    public final boolean a0;
    public final gu3 b0;

    public du3(gu3 gu3Var, Context context, ela elaVar, ylb ylbVar, boolean z) {
        super(context, elaVar, null, 4, true, null);
        this.b0 = gu3Var;
        this.W = ylbVar;
        this.a0 = z;
    }

    @Override
    public final boolean a() {
        if (this.b0.r && super.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return this.b0.s;
    }

    @Override
    public final int h() {
        return this.b0.a();
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        menu.add(2131296498, 2131296510, 6, jb6.M0(2131744951, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131753636, null));
        spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jb6.M0(2131748844, null));
        spannableStringBuilder2.setSpan(new z5c(gm.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296498, 2131296499, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(jb6.M0(2131744122, null));
        ?? obj = new Object();
        obj.a |= 8;
        spannableStringBuilder3.setSpan(new xkb(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296498, 2131296511, 9, spannableStringBuilder3);
        menu.add(2131296498, 2131296505, 10, jb6.M0(2131746070, null));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        canvas.save();
        int i2 = 0;
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        gu3 gu3Var = this.b0;
        ho hoVar = gu3Var.y;
        km kmVar = gu3Var.w;
        if (kmVar != null) {
            if (gu3Var.x <= 0) {
                i = cmb.o7;
            } else {
                i = cmb.O5;
            }
            hoVar.u(kmVar.a(cmb.v0(i, this.W), false));
        }
        int min = Math.min(gm.L(48.0f), getHeight());
        boolean z = this.a0;
        if (z) {
            f = 0.0f;
        } else {
            f = -gm.L(1.0f);
        }
        float scrollX = getScrollX();
        float height = (getHeight() + f) - min;
        int width = getWidth() + getScrollX();
        if (!z) {
            i2 = 44;
        }
        hoVar.o(scrollX, height, width - gm.L(i2 + 12), f + getHeight());
        hoVar.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.b0.y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
