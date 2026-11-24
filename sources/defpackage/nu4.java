package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PrivacyControlActivity;
public final class nu4 implements Runnable {
    public final byte a;
    public final xu4 b;

    public nu4(xu4 xu4Var, byte b) {
        this.a = b;
        this.b = xu4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xu4 xu4Var = this.b;
        switch (b) {
            case 0:
                String str = xu4Var.k2;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    tL_contacts_search.limit = 50;
                    xu4Var.l2 = ConnectionsManager.getInstance(xu4Var.a).sendRequest(tL_contacts_search, new rv3(xu4Var, str, (byte) 8));
                    return;
                }
                return;
            case 1:
                xu4Var.dismiss();
                return;
            case 2:
                xu4Var.i2.O(false);
                return;
            default:
                d dVar = xu4Var.r1;
                if (dVar != 0) {
                    ?? obj = new Object();
                    obj.a = true;
                    dVar.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
        }
    }
}
