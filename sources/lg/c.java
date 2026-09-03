package lg;

import android.content.Context;
import android.graphics.Canvas;
import gg.p0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Components.z8;
public final class c extends ua {
    public final a U;
    public TL_stories.PrepaidGiveaway V;

    public c(Context context) {
        super(context, 0, 0, false);
        this.U = new a(context);
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.V;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.P) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, j6.f20000k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.V = prepaidGiveaway;
        boolean z4 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        z8 z8Var = this.B;
        if (z4) {
            z8Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.U;
            aVar.f12062f = valueOf;
            aVar.e = aVar.f12059a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            z8Var.g(16);
            int i10 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i10 == 12) {
                z8Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                z8Var.i(-10703110, -12481584);
            } else {
                z8Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(p0.g() * prepaidGiveaway.quantity);
            a aVar2 = this.U;
            aVar2.f12062f = valueOf2;
            aVar2.e = aVar2.f12059a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.f22384b.i(this.U);
    }
}
