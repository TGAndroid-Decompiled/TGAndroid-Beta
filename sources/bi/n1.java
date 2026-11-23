package bi;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PrivacyControlActivity;
public final class n1 implements Runnable {
    public final int f3866a;
    public final f2 f3867b;

    public n1(f2 f2Var, int i7) {
        this.f3866a = i7;
        this.f3867b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f3866a) {
            case 0:
                f2 f2Var = this.f3867b;
                String str = f2Var.f3538l2;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.f28538q = str;
                    tL_contacts_search.limit = 50;
                    f2Var.f3539m2 = ConnectionsManager.getInstance(f2Var.f30223a).sendRequest(tL_contacts_search, new o1(0, f2Var, str));
                    return;
                }
                return;
            case 1:
                this.f3867b.dismiss();
                return;
            case 2:
                this.f3867b.f3536j2.O(false);
                return;
            default:
                org.telegram.ui.ActionBar.g2 g2Var = this.f3867b.f39250s1;
                if (g2Var != 0) {
                    ?? obj = new Object();
                    obj.f28948a = true;
                    g2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
        }
    }
}
