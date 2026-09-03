package lh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class j8 implements View.OnClickListener {
    public final int f12662a;
    public final y9 f12663b;

    public j8(y9 y9Var, int i10) {
        this.f12662a = i10;
        this.f12663b = y9Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.p2 R;
        org.telegram.ui.ActionBar.p2 R2;
        switch (this.f12662a) {
            case 0:
                if (this.f12663b.f13393f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f20453a = true;
                    R.showAsSheet(new ja(), obj);
                    return;
                }
                return;
            default:
                if (this.f12663b.f13393f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f20453a = true;
                    R2.showAsSheet(new ja(), obj2);
                    return;
                }
                return;
        }
    }
}
