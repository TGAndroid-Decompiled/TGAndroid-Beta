package kh;

import android.view.View;
public final class k implements View.OnClickListener {
    public final int f10687a;
    public final s f10688b;

    public k(s sVar, int i10) {
        this.f10687a = i10;
        this.f10688b = sVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10687a) {
            case 0:
                this.f10688b.dismiss();
                return;
            case 1:
                s.Q(this.f10688b);
                return;
            default:
                s sVar = this.f10688b;
                sVar.Z.setValueAnimated((int) sVar.f10798i0.getMinimumBid());
                return;
        }
    }
}
