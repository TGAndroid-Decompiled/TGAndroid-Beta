package gg;

import android.content.Context;
import android.graphics.Canvas;
import bg.u0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.z8;
public final class c extends va {
    public final a T;
    public TL_stories.PrepaidGiveaway U;

    public c(Context context) {
        super(context, 0, 0, false);
        this.T = new a(context);
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.U;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        if (this.O) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(70.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(70.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, f6.f23121k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.U = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        z8 z8Var = this.A;
        if (z10) {
            z8Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.T;
            aVar.f7756f = valueOf;
            aVar.f7755e = aVar.f7752a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            z8Var.g(16);
            int i9 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i9 == 12) {
                z8Var.i(-31392, -2796986);
            } else if (i9 == 6) {
                z8Var.i(-10703110, -12481584);
            } else {
                z8Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(u0.g() * prepaidGiveaway.quantity);
            a aVar2 = this.T;
            aVar2.f7756f = valueOf2;
            aVar2.f7755e = aVar2.f7752a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.f25805b.i(this.T);
    }
}
