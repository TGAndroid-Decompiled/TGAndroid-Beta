package fh;

import android.view.View;
public final class l implements View.OnClickListener {
    public final int f6593a;
    public final x f6594b;

    public l(x xVar, int i9) {
        this.f6593a = i9;
        this.f6594b = xVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f6593a) {
            case 0:
                this.f6594b.dismiss();
                return;
            case 1:
                x.P(this.f6594b);
                return;
            default:
                x xVar = this.f6594b;
                xVar.Y.setValueAnimated((int) xVar.f6847h0.getMinimumBid());
                return;
        }
    }
}
