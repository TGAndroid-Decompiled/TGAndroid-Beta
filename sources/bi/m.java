package bi;

import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.cc;
public final class m implements View.OnClickListener {
    public final int f3684a;
    public final y f3685b;

    public m(y yVar, int i7) {
        this.f3684a = i7;
        this.f3685b = yVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f3684a;
        y yVar = this.f3685b;
        switch (i7) {
            case 0:
                yVar.dismiss();
                return;
            case 1:
                int value = yVar.Y1.getValue();
                int e10 = (int) yVar.f3994h2.e();
                if (value < e10) {
                    org.telegram.messenger.g0.E3(yVar.W1);
                    i20.t(hd.G(e10, "Gift2AuctionMinimumBidIncreased", new Object[0]), new cc(yVar.f29685c, yVar.J0), 2131624068, 36);
                    return;
                }
                yVar.g1(value);
                return;
            default:
                yVar.Y1.setValueAnimated((int) yVar.f3994h2.e());
                return;
        }
    }
}
