package defpackage;

import android.view.View;
public final class jy implements View.OnClickListener {
    public final byte a;
    public final uy b;

    public jy(uy uyVar, byte b) {
        this.a = b;
        this.b = uyVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        uy uyVar = this.b;
        switch (b) {
            case 0:
                uyVar.dismiss();
                return;
            case 1:
                int value = uyVar.X1.getValue();
                int e = (int) uyVar.g2.e();
                if (value < e) {
                    hl.z3(uyVar.V1);
                    c00.v(ob6.G(e, "Gift2AuctionMinimumBidIncreased", new Object[0]), new d31(uyVar.c, uyVar.J0), 2131624068, 36);
                    return;
                }
                uyVar.c1(value);
                return;
            default:
                uyVar.X1.setValueAnimated((int) uyVar.g2.e());
                return;
        }
    }
}
