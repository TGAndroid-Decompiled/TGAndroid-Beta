package defpackage;

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;
public final class vy implements View.OnClickListener {
    public final byte a;
    public final rw0 b;

    public vy(rw0 rw0Var, byte b) {
        this.a = b;
        this.b = rw0Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        rw0 rw0Var = this.b;
        switch (b) {
            case 0:
                rw0Var.run();
                return;
            default:
                RectF rectF = ProfileActivity.Z6;
                rw0Var.run();
                return;
        }
    }
}
