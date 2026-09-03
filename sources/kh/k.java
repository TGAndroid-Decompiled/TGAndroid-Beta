package kh;

import android.view.View;
public final class k implements View.OnClickListener {
    public final int f10792a;
    public final s f10793b;

    public k(s sVar, int i10) {
        this.f10792a = i10;
        this.f10793b = sVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10792a) {
            case 0:
                this.f10793b.dismiss();
                return;
            case 1:
                s.Q(this.f10793b);
                return;
            default:
                s sVar = this.f10793b;
                sVar.Z.setValueAnimated((int) sVar.f10907i0.getMinimumBid());
                return;
        }
    }
}
