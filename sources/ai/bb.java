package ai;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class bb implements View.OnClickListener {
    public final int f1047a;
    public final bd f1048b;

    public bb(bd bdVar, int i10) {
        this.f1047a = i10;
        this.f1048b = bdVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.o2 R;
        org.telegram.ui.ActionBar.o2 R2;
        switch (this.f1047a) {
            case 0:
                if (this.f1048b.f1055f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21636a = true;
                    R.showAsSheet(new nd(), obj);
                    return;
                }
                return;
            default:
                if (this.f1048b.f1055f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21636a = true;
                    R2.showAsSheet(new nd(), obj2);
                    return;
                }
                return;
        }
    }
}
