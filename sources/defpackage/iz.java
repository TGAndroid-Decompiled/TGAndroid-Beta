package defpackage;

import android.view.View;
public final class iz implements View.OnClickListener {
    public final byte a;
    public final tz b;

    public iz(tz tzVar, byte b) {
        this.a = b;
        this.b = tzVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        tz tzVar = this.b;
        switch (b) {
            case 0:
                tzVar.dismiss();
                return;
            case 1:
                int value = tzVar.X1.getValue();
                int e = (int) tzVar.g2.e();
                if (value < e) {
                    gm.z3(tzVar.V1);
                    b10.u(jb6.G(e, "Gift2AuctionMinimumBidIncreased", new Object[0]), new c41(tzVar.c, tzVar.J0), 2131624068, 36);
                    return;
                }
                tzVar.b1(value);
                return;
            default:
                tzVar.X1.setValueAnimated((int) tzVar.g2.e());
                return;
        }
    }
}
