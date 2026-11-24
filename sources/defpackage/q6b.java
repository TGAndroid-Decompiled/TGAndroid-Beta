package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class q6b implements Runnable {
    public final byte a;
    public final u6b b;

    public q6b(u6b u6bVar, byte b) {
        this.a = b;
        this.b = u6bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        u6b u6bVar = this.b;
        switch (b) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                getwebpagepreview.message = u6bVar.T1.d.getText().toString();
                u6bVar.d2 = ConnectionsManager.getInstance(u6bVar.a).sendRequest(getwebpagepreview, new go9(u6bVar, (byte) 13));
                return;
            case 1:
                u6bVar.c1();
                return;
            default:
                su3 su3Var = u6bVar.T1;
                if (u6bVar.isShowing()) {
                    su3Var.d.requestFocus();
                    gm.E3(su3Var.d);
                    return;
                }
                return;
        }
    }
}
