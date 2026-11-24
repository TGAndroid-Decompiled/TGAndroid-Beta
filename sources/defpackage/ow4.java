package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PrivacyControlActivity;
public final class ow4 implements Runnable {
    public final byte a;
    public final yw4 b;

    public ow4(yw4 yw4Var, byte b) {
        this.a = b;
        this.b = yw4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yw4 yw4Var = this.b;
        switch (b) {
            case 0:
                String str = yw4Var.k2;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    tL_contacts_search.limit = 50;
                    yw4Var.l2 = ConnectionsManager.getInstance(yw4Var.a).sendRequest(tL_contacts_search, new cx3(yw4Var, str, (byte) 8));
                    return;
                }
                return;
            case 1:
                yw4Var.dismiss();
                return;
            case 2:
                yw4Var.i2.O(false);
                return;
            default:
                d dVar = yw4Var.r1;
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
