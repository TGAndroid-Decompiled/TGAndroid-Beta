package defpackage;

import android.view.View;
public final class iy implements View.OnClickListener {
    public final byte a;
    public final ty b;

    public iy(ty tyVar, byte b) {
        this.a = b;
        this.b = tyVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        ty tyVar = this.b;
        switch (b) {
            case 0:
                tyVar.dismiss();
                return;
            case 1:
                int value = tyVar.X1.getValue();
                int e = (int) tyVar.g2.e();
                if (value < e) {
                    gl.A3(tyVar.V1);
                    b00.u(k96.G(e, "Gift2AuctionMinimumBidIncreased", new Object[0]), new u21(tyVar.c, tyVar.J0), 2131624068, 36);
                    return;
                }
                tyVar.b1(value);
                return;
            default:
                tyVar.X1.setValueAnimated((int) tyVar.g2.e());
                return;
        }
    }
}
