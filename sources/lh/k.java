package lh;

import android.view.View;
public final class k implements View.OnClickListener {
    public final int f12829a;
    public final s f12830b;

    public k(s sVar, int i10) {
        this.f12829a = i10;
        this.f12830b = sVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12829a) {
            case 0:
                this.f12830b.dismiss();
                return;
            case 1:
                s.Q(this.f12830b);
                return;
            default:
                s sVar = this.f12830b;
                sVar.Z.setValueAnimated((int) sVar.f12947i0.getMinimumBid());
                return;
        }
    }
}
