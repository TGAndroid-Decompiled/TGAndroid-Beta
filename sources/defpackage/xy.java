package defpackage;

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;
public final class xy implements View.OnClickListener {
    public final byte a;
    public final ax0 b;

    public xy(ax0 ax0Var, byte b) {
        this.a = b;
        this.b = ax0Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        ax0 ax0Var = this.b;
        switch (b) {
            case 0:
                ax0Var.run();
                return;
            default:
                RectF rectF = ProfileActivity.Z6;
                ax0Var.run();
                return;
        }
    }
}
