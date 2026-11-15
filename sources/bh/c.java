package bh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.t8;
import wg.q;
public final class c extends pa {
    public final a f3362c0;
    public TL_stories.PrepaidGiveaway f3363d0;

    public c(Context context) {
        super(context, 0, 0, false);
        this.f3362c0 = new a(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.f3363d0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.T) {
            if (hd.f24101a0) {
                L = 0.0f;
            } else {
                L = g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24101a0) {
                i7 = g0.L(70.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, j6.f28972k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f3363d0 = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        t8 t8Var = this.F;
        if (z10) {
            t8Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.f3362c0;
            aVar.f3355f = valueOf;
            aVar.f3354e = aVar.f3351a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            t8Var.g(16);
            int i7 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i7 == 12) {
                t8Var.i(-31392, -2796986);
            } else if (i7 == 6) {
                t8Var.i(-10703110, -12481584);
            } else {
                t8Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(q.g() * prepaidGiveaway.quantity);
            a aVar2 = this.f3362c0;
            aVar2.f3355f = valueOf2;
            aVar2.f3354e = aVar2.f3351a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.f30885b.i(this.f3362c0);
    }
}
