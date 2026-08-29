package jh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class i8 implements View.OnClickListener {
    public final int f12268a;
    public final x9 f12269b;

    public i8(x9 x9Var, int i10) {
        this.f12268a = i10;
        this.f12269b = x9Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.o2 R;
        org.telegram.ui.ActionBar.o2 R2;
        switch (this.f12268a) {
            case 0:
                if (this.f12269b.f13089f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f23673a = true;
                    R.showAsSheet(new ia(), obj);
                    return;
                }
                return;
            default:
                if (this.f12269b.f13089f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f23673a = true;
                    R2.showAsSheet(new ia(), obj2);
                    return;
                }
                return;
        }
    }
}
