package bi;

import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.lc;
public final class m implements View.OnClickListener {
    public final int f3855a;
    public final y f3856b;

    public m(y yVar, int i7) {
        this.f3855a = i7;
        this.f3856b = yVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f3855a;
        y yVar = this.f3856b;
        switch (i7) {
            case 0:
                yVar.dismiss();
                return;
            case 1:
                int value = yVar.Y1.getValue();
                int e10 = (int) yVar.f4231h2.e();
                if (value < e10) {
                    org.telegram.messenger.g0.D3(yVar.W1);
                    n10.u(gd.G(e10, "Gift2AuctionMinimumBidIncreased", new Object[0]), new lc(yVar.f30195c, yVar.J0), 2131624068, 36);
                    return;
                }
                yVar.h1(value);
                return;
            default:
                yVar.Y1.setValueAnimated((int) yVar.f4231h2.e());
                return;
        }
    }
}
