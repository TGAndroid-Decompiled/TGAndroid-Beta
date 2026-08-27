package gh;

import android.view.View;

public final class l implements View.OnClickListener {

    public final int f7405a;

    public final v f7406b;

    public l(v vVar, int i10) {
        this.f7405a = i10;
        this.f7406b = vVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f7405a) {
            case 0:
                this.f7406b.dismiss();
                break;
            case 1:
                v.Q(this.f7406b);
                break;
            default:
                v vVar = this.f7406b;
                vVar.Y.setValueAnimated((int) vVar.f7572h0.getMinimumBid());
                break;
        }
    }
}
