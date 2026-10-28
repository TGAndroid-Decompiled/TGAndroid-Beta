package bi;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class bb implements View.OnClickListener {
    public final int f4386a;
    public final rc f4387b;

    public bb(rc rcVar, int i10) {
        this.f4386a = i10;
        this.f4387b = rcVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.r2 R;
        org.telegram.ui.ActionBar.r2 R2;
        switch (this.f4386a) {
            case 0:
                if (this.f4387b.f5374f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f22929a = true;
                    R.showAsSheet(new dd(), obj);
                    return;
                }
                return;
            default:
                if (this.f4387b.f5374f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f22929a = true;
                    R2.showAsSheet(new dd(), obj2);
                    return;
                }
                return;
        }
    }
}
