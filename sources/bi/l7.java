package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.p10;
import org.telegram.messenger.u10;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n41;
public final class l7 extends g51 {
    public final int f3808n3;

    public l7(Context context, int i7, int i10, boolean z10, p10 p10Var, u10 u10Var, v10 v10Var, org.telegram.ui.ActionBar.i6 i6Var, int i11) {
        super(context, i7, i10, z10, p10Var, u10Var, v10Var, i6Var);
        this.f3808n3 = i11;
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f3808n3) {
            case 0:
                return 0;
            case 7:
                n41 G = this.f35323g3.G(i7);
                if (G != null && G.d == 2) {
                    return 0;
                }
                return super.V0(i7);
            default:
                return super.V0(i7);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f3808n3) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24226q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 2:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24226q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 3:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24226q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24226q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 5:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24226q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 6:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24226q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean u1(View view) {
        switch (this.f3808n3) {
            case 8:
                if (view instanceof org.telegram.ui.Wallet.g4) {
                    org.telegram.ui.Wallet.g4 g4Var = (org.telegram.ui.Wallet.g4) view;
                    if (g4Var.G > 0.0f || g4Var.J.d()) {
                        return false;
                    }
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public l7(Context context, int i7, int i10, boolean z10, p10 p10Var, u10 u10Var, v10 v10Var, org.telegram.ui.ActionBar.i6 i6Var, int i11, int i12) {
        super(context, i7, i10, z10, p10Var, u10Var, v10Var, i6Var, i11, i12);
        this.f3808n3 = 8;
    }

    public l7(org.telegram.ui.ActionBar.g2 g2Var, p10 p10Var, u10 u10Var, v10 v10Var, int i7) {
        super(g2Var, p10Var, u10Var, v10Var);
        this.f3808n3 = i7;
    }
}
