package defpackage;

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;
public final class vz implements View.OnClickListener {
    public final byte a;
    public final zx0 b;

    public vz(zx0 zx0Var, byte b) {
        this.a = b;
        this.b = zx0Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        zx0 zx0Var = this.b;
        switch (b) {
            case 0:
                zx0Var.run();
                return;
            default:
                RectF rectF = ProfileActivity.e7;
                zx0Var.run();
                return;
        }
    }
}
