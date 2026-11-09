package bh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.w8;
import wg.r;
public final class c extends pa {
    public final a f3410b0;
    public TL_stories.PrepaidGiveaway f3411c0;

    public c(Context context) {
        super(context, 0, 0, false);
        this.f3410b0 = new a(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.f3411c0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.S) {
            if (id.f23157a0) {
                L = 0.0f;
            } else {
                L = g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23157a0) {
                i7 = g0.L(70.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, l6.f27988k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f3411c0 = prepaidGiveaway;
        boolean z9 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        w8 w8Var = this.E;
        if (z9) {
            w8Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.f3410b0;
            aVar.f3403f = valueOf;
            aVar.f3402e = aVar.f3399a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            w8Var.g(16);
            int i7 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i7 == 12) {
                w8Var.i(-31392, -2796986);
            } else if (i7 == 6) {
                w8Var.i(-10703110, -12481584);
            } else {
                w8Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(r.g() * prepaidGiveaway.quantity);
            a aVar2 = this.f3410b0;
            aVar2.f3403f = valueOf2;
            aVar2.f3402e = aVar2.f3399a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.f29757b.i(this.f3410b0);
    }
}
