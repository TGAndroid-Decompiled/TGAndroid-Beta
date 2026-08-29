package ih;

import android.view.View;
public final class l implements View.OnClickListener {
    public final int f9268a;
    public final t f9269b;

    public l(t tVar, int i10) {
        this.f9268a = i10;
        this.f9269b = tVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9268a) {
            case 0:
                this.f9269b.dismiss();
                return;
            case 1:
                t.Q(this.f9269b);
                return;
            default:
                t tVar = this.f9269b;
                tVar.Y.setValueAnimated((int) tVar.f9385h0.getMinimumBid());
                return;
        }
    }
}
