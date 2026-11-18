package bi;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PrivacyControlActivity;
public final class j1 implements Runnable {
    public final int f3717a;
    public final a2 f3718b;

    public j1(a2 a2Var, int i7) {
        this.f3717a = i7;
        this.f3718b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f3717a) {
            case 0:
                a2 a2Var = this.f3718b;
                String str = a2Var.f3391l2;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.f28449q = str;
                    tL_contacts_search.limit = 50;
                    a2Var.f3392m2 = ConnectionsManager.getInstance(a2Var.f30187a).sendRequest(tL_contacts_search, new k1(0, a2Var, str));
                    return;
                }
                return;
            case 1:
                this.f3718b.dismiss();
                return;
            case 2:
                this.f3718b.f3389j2.O(false);
                return;
            default:
                org.telegram.ui.ActionBar.h2 h2Var = this.f3718b.f39538s1;
                if (h2Var != 0) {
                    ?? obj = new Object();
                    obj.f28921a = true;
                    h2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
        }
    }
}
