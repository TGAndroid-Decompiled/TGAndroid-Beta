package ih;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.we1;
public final class b5 extends gw0 {
    public final int G = 0;
    public final Object H;

    public b5(fk fkVar, Context context, e00 e00Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, e00Var, 1, b6Var);
        this.H = fkVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.G) {
            case 2:
                we1 we1Var = (we1) this.H;
                super.e(z10, z11);
                float f10 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = we1Var.f43767n.f40121a.animate();
                    if (z10) {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                    return;
                }
                we1Var.f43767n.f40121a.animate().cancel();
                TextView textView = we1Var.f43767n.f40121a;
                if (z10) {
                    f10 = 0.0f;
                }
                textView.setAlpha(f10);
                return;
            default:
                super.e(z10, z11);
                return;
        }
    }

    @Override
    public float getTranslationY() {
        switch (this.G) {
            case 1:
                return super.getTranslationY() - ((fk) this.H).I;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.G) {
            case 0:
                g5 g5Var = ((c5) this.H).d;
                super.onMeasure(i9, ll.d(g5Var.f11478e, g5Var.f11480n - g5Var.f11481r.getPaddingTop(), 1073741824));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.G) {
            case 1:
                super.setTranslationY(f10 + ((fk) this.H).I);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public b5(int i9, Context context, b bVar, c5 c5Var) {
        super(context, null, i9, bVar);
        this.H = c5Var;
    }

    public b5(we1 we1Var, Context context, e00 e00Var) {
        super(context, e00Var, 0, null);
        this.H = we1Var;
    }
}
