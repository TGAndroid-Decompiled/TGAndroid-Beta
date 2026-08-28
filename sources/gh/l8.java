package gh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class l8 implements View.OnClickListener {
    public final int f8510a;
    public final da f8511b;

    public l8(da daVar, int i9) {
        this.f8510a = i9;
        this.f8511b = daVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.o2 R;
        org.telegram.ui.ActionBar.o2 R2;
        switch (this.f8510a) {
            case 0:
                if (this.f8511b.f7990f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f23653a = true;
                    R.showAsSheet(new oa(), obj);
                    return;
                }
                return;
            default:
                if (this.f8511b.f7990f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f23653a = true;
                    R2.showAsSheet(new oa(), obj2);
                    return;
                }
                return;
        }
    }
}
