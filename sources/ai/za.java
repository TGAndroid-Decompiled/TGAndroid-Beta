package ai;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class za implements View.OnClickListener {
    public final int f2546a;
    public final zc f2547b;

    public za(zc zcVar, int i10) {
        this.f2546a = i10;
        this.f2547b = zcVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f2546a) {
            case 0:
                if (this.f2547b.f2554f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21552a = true;
                    R.showAsSheet(new ld(), obj);
                    return;
                }
                return;
            default:
                if (this.f2547b.f2554f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21552a = true;
                    R2.showAsSheet(new ld(), obj2);
                    return;
                }
                return;
        }
    }
}
