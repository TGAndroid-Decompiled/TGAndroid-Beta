package ai;

import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.fc;
public final class q implements View.OnClickListener {
    public final int f884a;
    public final e0 f885b;

    public q(e0 e0Var, int i3) {
        this.f884a = i3;
        this.f885b = e0Var;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f884a;
        e0 e0Var = this.f885b;
        switch (i3) {
            case 0:
                e0Var.dismiss();
                return;
            case 1:
                int value = e0Var.V1.getValue();
                int e10 = (int) e0Var.f599e2.e();
                if (value < e10) {
                    org.telegram.messenger.g0.F3(e0Var.T1);
                    org.telegram.messenger.camera.q.s(bd.G(e10, "Gift2AuctionMinimumBidIncreased", new Object[0]), new fc(e0Var.f28589c, e0Var.J0), 2131624067, 36);
                    return;
                }
                e0Var.g1(value);
                return;
            default:
                e0Var.V1.setValueAnimated((int) e0Var.f599e2.e());
                return;
        }
    }
}
