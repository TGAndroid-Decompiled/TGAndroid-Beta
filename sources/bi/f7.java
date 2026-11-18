package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.q10;
import org.telegram.messenger.v10;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
public final class f7 extends e51 {
    public final int f3581n3;

    public f7(Context context, int i7, int i10, boolean z10, q10 q10Var, v10 v10Var, w10 w10Var, org.telegram.ui.ActionBar.i6 i6Var, int i11) {
        super(context, i7, i10, z10, q10Var, v10Var, w10Var, i6Var);
        this.f3581n3 = i11;
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f3581n3) {
            case 0:
                return 0;
            case 7:
                l41 G = this.f34607g3.G(i7);
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
        switch (this.f3581n3) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24118q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 2:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24118q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 3:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24118q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24118q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 5:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24118q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 6:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24118q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean u1(View view) {
        switch (this.f3581n3) {
            case 8:
                if (view instanceof org.telegram.ui.Wallet.f4) {
                    org.telegram.ui.Wallet.f4 f4Var = (org.telegram.ui.Wallet.f4) view;
                    if (f4Var.G > 0.0f || f4Var.J.d()) {
                        return false;
                    }
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public f7(Context context, int i7, int i10, boolean z10, q10 q10Var, v10 v10Var, w10 w10Var, org.telegram.ui.ActionBar.i6 i6Var, int i11, int i12) {
        super(context, i7, i10, z10, q10Var, v10Var, w10Var, i6Var, i11, i12);
        this.f3581n3 = 8;
    }

    public f7(org.telegram.ui.ActionBar.h2 h2Var, q10 q10Var, v10 v10Var, w10 w10Var, int i7) {
        super(h2Var, q10Var, v10Var, w10Var);
        this.f3581n3 = i7;
    }
}
