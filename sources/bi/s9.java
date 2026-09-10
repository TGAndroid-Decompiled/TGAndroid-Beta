package bi;

import android.view.View;
public final class s9 implements View.OnClickListener {
    public final int f3655a;
    public final aa f3656b;

    public s9(aa aaVar, int i10) {
        this.f3655a = i10;
        this.f3656b = aaVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3655a) {
            case 0:
                this.f3656b.U();
                return;
            default:
                this.f3656b.X();
                return;
        }
    }
}
