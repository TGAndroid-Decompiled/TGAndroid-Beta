package jh;

import android.content.Context;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.we1;

public final class x4 extends iw0 {
    public final int G = 0;
    public final Object H;

    public x4(bk bkVar, Context context, h00 h00Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, h00Var, 1, c6Var);
        this.H = bkVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.G) {
            case 2:
                we1 we1Var = (we1) this.H;
                super.e(z10, z11);
                if (!z11) {
                    we1Var.f43745n.f40465a.animate().cancel();
                    we1Var.f43745n.f40465a.setAlpha(z10 ? 0.0f : 1.0f);
                } else {
                    we1Var.f43745n.f40465a.animate().alpha(z10 ? 0.0f : 1.0f).start();
                }
                break;
            default:
                super.e(z10, z11);
                break;
        }
    }

    @Override
    public float getTranslationY() {
        switch (this.G) {
            case 1:
                return super.getTranslationY() - ((bk) this.H).I;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.G) {
            case 0:
                c5 c5Var = ((y4) this.H).d;
                super.onMeasure(i10, rl.d(c5Var.f13153e, c5Var.f13155n - c5Var.f13156r.getPaddingTop(), 1073741824));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.G) {
            case 1:
                super.setTranslationY(f10 + ((bk) this.H).I);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    public x4(int i10, Context context, b bVar, y4 y4Var) {
        super(context, null, i10, bVar);
        this.H = y4Var;
    }

    public x4(we1 we1Var, Context context, h00 h00Var) {
        super(context, h00Var, 0, null);
        this.H = we1Var;
    }
}
