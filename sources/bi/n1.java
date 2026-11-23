package bi;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PrivacyControlActivity;
public final class n1 implements Runnable {
    public final int f3917a;
    public final e2 f3918b;

    public n1(e2 e2Var, int i7) {
        this.f3917a = i7;
        this.f3918b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f3917a) {
            case 0:
                e2 e2Var = this.f3918b;
                String str = e2Var.f3586l2;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.f28480q = str;
                    tL_contacts_search.limit = 50;
                    e2Var.f3587m2 = ConnectionsManager.getInstance(e2Var.f30173a).sendRequest(tL_contacts_search, new o1(0, e2Var, str));
                    return;
                }
                return;
            case 1:
                this.f3918b.dismiss();
                return;
            case 2:
                this.f3918b.f3584j2.O(false);
                return;
            default:
                org.telegram.ui.ActionBar.g2 g2Var = this.f3918b.f39535s1;
                if (g2Var != 0) {
                    ?? obj = new Object();
                    obj.f28905a = true;
                    g2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
        }
    }
}
