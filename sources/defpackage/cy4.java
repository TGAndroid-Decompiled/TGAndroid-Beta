package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;
public final class cy4 extends vac {
    public final cy2 c0;
    public TL_stories.PrepaidGiveaway d0;

    public cy4(Context context) {
        super(context, 0, 0, false);
        this.c0 = new cy2(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.d0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.T) {
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(70.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(70.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.d0 = prepaidGiveaway;
        boolean z = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        cy2 cy2Var = this.c0;
        rb0 rb0Var = this.F;
        if (z) {
            rb0Var.f(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            cy2Var.c = valueOf;
            cy2Var.e = cy2Var.b.measureText(valueOf);
            cy2Var.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            rb0Var.f(16);
            int i = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i == 12) {
                rb0Var.h(-31392, -2796986);
            } else if (i == 6) {
                rb0Var.h(-10703110, -12481584);
            } else {
                rb0Var.h(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(on0.h() * prepaidGiveaway.quantity);
            cy2Var.c = valueOf2;
            cy2Var.e = cy2Var.b.measureText(valueOf2);
            cy2Var.invalidateSelf();
        }
        this.b.i(cy2Var);
    }
}
