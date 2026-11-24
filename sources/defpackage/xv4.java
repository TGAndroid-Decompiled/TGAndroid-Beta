package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;
public final class xv4 extends v6c {
    public final ix2 c0;
    public TL_stories.PrepaidGiveaway d0;

    public xv4(Context context) {
        super(context, 0, 0, false);
        this.c0 = new ix2(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.d0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.T) {
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(70.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(70.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.d0 = prepaidGiveaway;
        boolean z = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        ix2 ix2Var = this.c0;
        pb0 pb0Var = this.F;
        if (z) {
            pb0Var.f(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            ix2Var.c = valueOf;
            ix2Var.e = ix2Var.b.measureText(valueOf);
            ix2Var.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            pb0Var.f(16);
            int i = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i == 12) {
                pb0Var.h(-31392, -2796986);
            } else if (i == 6) {
                pb0Var.h(-10703110, -12481584);
            } else {
                pb0Var.h(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(on0.h() * prepaidGiveaway.quantity);
            ix2Var.c = valueOf2;
            ix2Var.e = ix2Var.b.measureText(valueOf2);
            ix2Var.invalidateSelf();
        }
        this.b.i(ix2Var);
    }
}
