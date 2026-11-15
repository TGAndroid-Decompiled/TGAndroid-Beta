package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.s10;
import org.telegram.messenger.x10;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.u41;
public final class y4 extends u41 {
    public final int f4013n3;

    public y4(Context context, int i7, int i10, boolean z10, s10 s10Var, x10 x10Var, y10 y10Var, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(context, i7, i10, z10, s10Var, x10Var, y10Var, e6Var);
        this.f4013n3 = i11;
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f4013n3) {
            case 0:
                return 0;
            case 7:
                b41 G = this.f39895g3.G(i7);
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
        switch (this.f4013n3) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f23609q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 2:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f23609q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 3:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f23609q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f23609q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 5:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f23609q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 6:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f23609q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean u1(View view) {
        switch (this.f4013n3) {
            case 8:
                if (view instanceof org.telegram.ui.Wallet.v3) {
                    org.telegram.ui.Wallet.v3 v3Var = (org.telegram.ui.Wallet.v3) view;
                    if (v3Var.G > 0.0f || v3Var.J.d()) {
                        return false;
                    }
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public y4(Context context, int i7, int i10, boolean z10, s10 s10Var, x10 x10Var, y10 y10Var, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12) {
        super(context, i7, i10, z10, s10Var, x10Var, y10Var, e6Var, i11, i12);
        this.f4013n3 = 8;
    }

    public y4(org.telegram.ui.ActionBar.e2 e2Var, s10 s10Var, x10 x10Var, y10 y10Var, int i7) {
        super(e2Var, s10Var, x10Var, y10Var);
        this.f4013n3 = i7;
    }
}
