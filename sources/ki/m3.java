package ki;

import android.content.Context;
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.z70;
public final class m3 extends n4 {
    public final z70 f18454r;

    public m3(Context context, e6 e6Var) {
        super(context, e6Var);
        int i7;
        z70 z70Var = new z70(context, e6Var);
        this.f18454r = z70Var;
        z70Var.setTextSize(1, 14.0f);
        q6.U(z70Var, j6.f29260z6, e6Var);
        q6.G(z70Var, j6.L6, e6Var);
        z70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        if (hd.f24101a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        addView(z70Var, ja.d(-2, -2.0f, i7 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
