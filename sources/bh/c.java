package bh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Components.b9;
import wg.s;
public final class c extends ra {
    public final a f3390c0;
    public TL_stories.PrepaidGiveaway f3391d0;

    public c(Context context) {
        super(context, 0, 0, false);
        this.f3390c0 = new a(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.f3391d0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.T) {
            if (hd.f24444a0) {
                L = 0.0f;
            } else {
                L = g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24444a0) {
                i7 = g0.L(70.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, m6.f29504k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f3391d0 = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        b9 b9Var = this.F;
        if (z10) {
            b9Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.f3390c0;
            aVar.f3383f = valueOf;
            aVar.f3382e = aVar.f3379a.measureText(valueOf);
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
            a aVar2 = this.f3390c0;
            aVar2.f3383f = valueOf2;
            aVar2.f3382e = aVar2.f3379a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.f31755b.i(this.f3390c0);
    }
}
