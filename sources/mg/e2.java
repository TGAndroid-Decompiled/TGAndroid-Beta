package mg;

import android.content.Context;
import org.telegram.ui.ActionBar.p6;
public final class e2 extends qg.c {
    public final int f13110n;

    public e2(int i10, Context context, p6 p6Var) {
        super(context, p6Var);
        this.f13110n = i10;
    }

    @Override
    public final int getHeaderHeight() {
        switch (this.f13110n) {
            case 0:
                if (getResources().getConfiguration().orientation == 2) {
                    return org.telegram.messenger.i0.L(48.0f);
                }
                return org.telegram.messenger.i0.L(54.0f);
            default:
                if (getResources().getConfiguration().orientation == 2) {
                    return org.telegram.messenger.i0.L(48.0f);
                }
                return org.telegram.messenger.i0.L(54.0f);
        }
    }
}
