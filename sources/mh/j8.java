package mh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class j8 implements View.OnClickListener {
    public final int f14309a;
    public final y9 f14310b;

    public j8(y9 y9Var, int i10) {
        this.f14309a = i10;
        this.f14310b = y9Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.p2 R;
        org.telegram.ui.ActionBar.p2 R2;
        switch (this.f14309a) {
            case 0:
                if (this.f14310b.f15114f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f22156a = true;
                    R.showAsSheet(new ja(), obj);
                    return;
                }
                return;
            default:
                if (this.f14310b.f15114f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f22156a = true;
                    R2.showAsSheet(new ja(), obj2);
                    return;
                }
                return;
        }
    }
}
