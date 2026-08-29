package jg;

import android.content.Context;
import android.graphics.Canvas;
import eg.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.e9;
public final class c extends sa {
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
        int i10;
        if (this.O) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(70.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(70.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, g6.f23183k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.U = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        e9 e9Var = this.A;
        if (z10) {
            e9Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.T;
            aVar.f11696f = valueOf;
            aVar.f11695e = aVar.f11692a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            e9Var.g(16);
            int i10 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i10 == 12) {
                e9Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                e9Var.i(-10703110, -12481584);
            } else {
                e9Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(q0.g() * prepaidGiveaway.quantity);
            a aVar2 = this.T;
            aVar2.f11696f = valueOf2;
            aVar2.f11695e = aVar2.f11692a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.f25675b.i(this.T);
    }
}
