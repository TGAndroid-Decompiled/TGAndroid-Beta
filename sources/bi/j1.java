package bi;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PrivacyControlActivity;
public final class j1 implements Runnable {
    public final int f3737a;
    public final a2 f3738b;

    public j1(a2 a2Var, int i7) {
        this.f3737a = i7;
        this.f3738b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f3737a) {
            case 0:
                a2 a2Var = this.f3738b;
                String str = a2Var.f3390l2;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.f28451q = str;
                    tL_contacts_search.limit = 50;
                    a2Var.f3391m2 = ConnectionsManager.getInstance(a2Var.f30189a).sendRequest(tL_contacts_search, new k1(0, a2Var, str));
                    return;
                }
                return;
            case 1:
                this.f3738b.dismiss();
                return;
            case 2:
                this.f3738b.f3388j2.O(false);
                return;
            default:
                org.telegram.ui.ActionBar.h2 h2Var = this.f3738b.f39538s1;
                if (h2Var != 0) {
                    ?? obj = new Object();
                    obj.f28923a = true;
                    h2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
        }
    }
}
