package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
public final class lt3 extends iu3 {
    public final vnb W;
    public final boolean a0;
    public final ot3 b0;

    public lt3(ot3 ot3Var, Context context, wma wmaVar, vnb vnbVar, boolean z) {
        super(context, wmaVar, null, 4, true, null);
        this.b0 = ot3Var;
        this.W = vnbVar;
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
        menu.add(2131296498, 2131296510, 6, ob6.M0(2131744919, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131753664, null));
        spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ob6.M0(2131748841, null));
        spannableStringBuilder2.setSpan(new y7c(hl.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296498, 2131296499, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(ob6.M0(2131744090, null));
        ?? obj = new Object();
        obj.a |= 8;
        spannableStringBuilder3.setSpan(new smb(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296498, 2131296511, 9, spannableStringBuilder3);
        menu.add(2131296498, 2131296505, 10, ob6.M0(2131746064, null));
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
        ot3 ot3Var = this.b0;
        hn hnVar = ot3Var.y;
        ll llVar = ot3Var.w;
        if (llVar != null) {
            if (ot3Var.x <= 0) {
                i = aob.p7;
            } else {
                i = aob.P5;
            }
            hnVar.u(llVar.a(aob.v0(i, this.W), false));
        }
        int min = Math.min(hl.L(48.0f), getHeight());
        boolean z = this.a0;
        if (z) {
            f = 0.0f;
        } else {
            f = -hl.L(1.0f);
        }
        float scrollX = getScrollX();
        float height = (getHeight() + f) - min;
        int width = getWidth() + getScrollX();
        if (!z) {
            i2 = 44;
        }
        hnVar.o(scrollX, height, width - hl.L(i2 + 12), f + getHeight());
        hnVar.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.b0.y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
