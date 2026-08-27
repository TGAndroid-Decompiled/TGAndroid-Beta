package hg;

import android.content.Context;
import android.graphics.Canvas;
import cg.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.y8;

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
        if (this.O) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, g6.f23175k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.U = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        y8 y8Var = this.A;
        if (z10) {
            y8Var.g(26);
            String strValueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.T;
            aVar.f8928f = strValueOf;
            aVar.f8927e = aVar.f8924a.measureText(strValueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            y8Var.g(16);
            int i10 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i10 == 12) {
                y8Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                y8Var.i(-10703110, -12481584);
            } else {
                y8Var.i(-6631068, -11945404);
            }
            String strValueOf2 = String.valueOf(q0.g() * prepaidGiveaway.quantity);
            a aVar2 = this.T;
            aVar2.f8928f = strValueOf2;
            aVar2.f8927e = aVar2.f8924a.measureText(strValueOf2);
            aVar2.invalidateSelf();
        }
        this.f25644b.i(this.T);
    }
}
