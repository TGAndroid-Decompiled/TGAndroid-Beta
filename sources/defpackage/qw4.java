package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PrivacyControlActivity;
public final class qw4 implements Runnable {
    public final byte a;
    public final bx4 b;

    public qw4(bx4 bx4Var, byte b) {
        this.a = b;
        this.b = bx4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bx4 bx4Var = this.b;
        switch (b) {
            case 0:
                String str = bx4Var.k2;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    tL_contacts_search.limit = 50;
                    bx4Var.l2 = ConnectionsManager.getInstance(bx4Var.a).sendRequest(tL_contacts_search, new mw3(bx4Var, str, (byte) 8));
                    return;
                }
                return;
            case 1:
                bx4Var.dismiss();
                return;
            case 2:
                bx4Var.i2.O(false);
                return;
            default:
                e eVar = bx4Var.r1;
                if (eVar != 0) {
                    ?? obj = new Object();
                    obj.a = true;
                    eVar.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
        }
    }
}
