package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.r10;
import org.telegram.messenger.w10;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;
public final class i7 extends h51 {
    public final int f3732n3;

    public i7(Context context, int i7, int i10, boolean z10, r10 r10Var, w10 w10Var, x10 x10Var, org.telegram.ui.ActionBar.h6 h6Var, int i11) {
        super(context, i7, i10, z10, r10Var, w10Var, x10Var, h6Var);
        this.f3732n3 = i11;
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f3732n3) {
            case 0:
                return 0;
            case 7:
                o41 G = this.f35790g3.G(i7);
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
        switch (this.f3732n3) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24046q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 2:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24046q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 3:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24046q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24046q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 5:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24046q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 6:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f24046q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean u1(View view) {
        switch (this.f3732n3) {
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

    public i7(Context context, int i7, int i10, boolean z10, r10 r10Var, w10 w10Var, x10 x10Var, org.telegram.ui.ActionBar.h6 h6Var, int i11, int i12) {
        super(context, i7, i10, z10, r10Var, w10Var, x10Var, h6Var, i11, i12);
        this.f3732n3 = 8;
    }

    public i7(org.telegram.ui.ActionBar.g2 g2Var, r10 r10Var, w10 w10Var, x10 x10Var, int i7) {
        super(g2Var, r10Var, w10Var, x10Var);
        this.f3732n3 = i7;
    }
}
