package bh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Components.b9;
import wg.s;
public final class c extends ra {
    public final a f3383c0;
    public TL_stories.PrepaidGiveaway f3384d0;

    public c(Context context) {
        super(context, 0, 0, false);
        this.f3383c0 = new a(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.f3384d0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.T) {
            if (gd.f24241a0) {
                L = 0.0f;
            } else {
                L = g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24241a0) {
                i7 = g0.L(70.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, m6.f29501k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f3384d0 = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        b9 b9Var = this.F;
        if (z10) {
            b9Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.f3383c0;
            aVar.f3376f = valueOf;
            aVar.f3375e = aVar.f3372a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            b9Var.g(16);
            int i7 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i7 == 12) {
                b9Var.i(-31392, -2796986);
            } else if (i7 == 6) {
                b9Var.i(-10703110, -12481584);
            } else {
                b9Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(s.g() * prepaidGiveaway.quantity);
            a aVar2 = this.f3383c0;
            aVar2.f3376f = valueOf2;
            aVar2.f3375e = aVar2.f3372a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.f31752b.i(this.f3383c0);
    }
}
