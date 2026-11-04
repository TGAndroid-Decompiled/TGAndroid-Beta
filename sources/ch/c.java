package ch;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.u8;
import xg.s;
public final class c extends pa {
    public final a f4780c0;
    public TL_stories.PrepaidGiveaway f4781d0;

    public c(Context context) {
        super(context, 0, 0, false);
        this.f4780c0 = new a(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.f4781d0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        if (this.T) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = g0.L(70.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, k6.f28002k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f4781d0 = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        u8 u8Var = this.F;
        if (z10) {
            u8Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.f4780c0;
            aVar.f4773f = valueOf;
            aVar.f4772e = aVar.f4769a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            u8Var.g(16);
            int i3 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i3 == 12) {
                u8Var.i(-31392, -2796986);
            } else if (i3 == 6) {
                u8Var.i(-10703110, -12481584);
            } else {
                u8Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(s.g() * prepaidGiveaway.quantity);
            a aVar2 = this.f4780c0;
            aVar2.f4773f = valueOf2;
            aVar2.f4772e = aVar2.f4769a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.f29824b.i(this.f4780c0);
    }
}
