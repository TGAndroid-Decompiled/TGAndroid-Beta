package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
public final class ts3 extends rt3 {
    public final wjb W;
    public final boolean a0;
    public final ws3 b0;

    public ts3(ws3 ws3Var, Context context, cja cjaVar, wjb wjbVar, boolean z) {
        super(context, cjaVar, null, 4, true, null);
        this.b0 = ws3Var;
        this.W = wjbVar;
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
        menu.add(2131296498, 2131296510, 6, k96.M0(2131745025, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131753668, null));
        spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(k96.M0(2131748895, null));
        spannableStringBuilder2.setSpan(new z3c(gl.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296498, 2131296499, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(k96.M0(2131744196, null));
        ?? obj = new Object();
        obj.a |= 8;
        spannableStringBuilder3.setSpan(new wib(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296498, 2131296511, 9, spannableStringBuilder3);
        menu.add(2131296498, 2131296505, 10, k96.M0(2131746144, null));
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
        ws3 ws3Var = this.b0;
        gn gnVar = ws3Var.y;
        kl klVar = ws3Var.w;
        if (klVar != null) {
            if (ws3Var.x <= 0) {
                i = bkb.o7;
            } else {
                i = bkb.O5;
            }
            gnVar.u(klVar.a(bkb.v0(i, this.W), false));
        }
        int min = Math.min(gl.L(48.0f), getHeight());
        boolean z = this.a0;
        if (z) {
            f = 0.0f;
        } else {
            f = -gl.L(1.0f);
        }
        float scrollX = getScrollX();
        float height = (getHeight() + f) - min;
        int width = getWidth() + getScrollX();
        if (!z) {
            i2 = 44;
        }
        gnVar.o(scrollX, height, width - gl.L(i2 + 12), f + getHeight());
        gnVar.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.b0.y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
