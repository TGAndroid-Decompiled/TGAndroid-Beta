package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.n10;
import org.telegram.messenger.s10;
import org.telegram.messenger.t10;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
public final class i5 extends l41 {
    public final int f715n3;

    public i5(Context context, int i3, int i10, boolean z10, n10 n10Var, s10 s10Var, t10 t10Var, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(context, i3, i10, z10, n10Var, s10Var, t10Var, e6Var);
        this.f715n3 = i11;
    }

    @Override
    public Integer V0(int i3) {
        switch (this.f715n3) {
            case 0:
                return 0;
            case 7:
                r31 G = this.f35594g3.G(i3);
                if (G != null && G.d == 2) {
                    return 0;
                }
                return super.V0(i3);
            default:
                return super.V0(i3);
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f715n3) {
            case 1:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f22608q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 2:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f22608q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 3:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f22608q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 4:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f22608q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 5:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f22608q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 6:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f22608q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public boolean u1(View view) {
        switch (this.f715n3) {
            case 8:
                if (view instanceof org.telegram.ui.Wallet.u3) {
                    org.telegram.ui.Wallet.u3 u3Var = (org.telegram.ui.Wallet.u3) view;
                    if (u3Var.G > 0.0f || u3Var.J.d()) {
                        return false;
                    }
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public i5(Context context, int i3, int i10, boolean z10, n10 n10Var, s10 s10Var, t10 t10Var, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12) {
        super(context, i3, i10, z10, n10Var, s10Var, t10Var, e6Var, i11, i12);
        this.f715n3 = 8;
    }

    public i5(org.telegram.ui.ActionBar.d2 d2Var, n10 n10Var, s10 s10Var, t10 t10Var, int i3) {
        super(d2Var, n10Var, s10Var, t10Var);
        this.f715n3 = i3;
    }
}
