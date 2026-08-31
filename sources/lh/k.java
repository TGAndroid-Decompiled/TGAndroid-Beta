package lh;

import android.view.View;
public final class k implements View.OnClickListener {
    public final int f12827a;
    public final s f12828b;

    public k(s sVar, int i10) {
        this.f12827a = i10;
        this.f12828b = sVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12827a) {
            case 0:
                this.f12828b.dismiss();
                return;
            case 1:
                s.Q(this.f12828b);
                return;
            default:
                s sVar = this.f12828b;
                sVar.Z.setValueAnimated((int) sVar.f12945i0.getMinimumBid());
                return;
        }
    }
}
