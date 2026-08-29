package bg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.tn;
public final class o0 extends tn {
    public final g1 Mc;

    public o0(g1 g1Var) {
        super(null);
        this.Mc = g1Var;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Mc.getContext());
    }

    @Override
    public final c6 getResourceProvider() {
        return this.Mc.M1;
    }

    @Override
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override
    public final boolean x9() {
        return false;
    }
}
