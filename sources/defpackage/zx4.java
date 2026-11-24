package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;
public final class zx4 extends w8c {
    public final sy2 c0;
    public TL_stories.PrepaidGiveaway d0;

    public zx4(Context context) {
        super(context, 0, 0, false);
        this.c0 = new sy2(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.d0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.T) {
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(70.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(70.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.d0 = prepaidGiveaway;
        boolean z = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        sy2 sy2Var = this.c0;
        pc0 pc0Var = this.F;
        if (z) {
            pc0Var.f(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            sy2Var.c = valueOf;
            sy2Var.e = sy2Var.b.measureText(valueOf);
            sy2Var.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            pc0Var.f(16);
            int i = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i == 12) {
                pc0Var.h(-31392, -2796986);
            } else if (i == 6) {
                pc0Var.h(-10703110, -12481584);
            } else {
                pc0Var.h(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(oo0.h() * prepaidGiveaway.quantity);
            sy2Var.c = valueOf2;
            sy2Var.e = sy2Var.b.measureText(valueOf2);
            sy2Var.invalidateSelf();
        }
        this.b.i(sy2Var);
    }
}
