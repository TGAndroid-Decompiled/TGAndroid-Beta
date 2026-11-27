package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class n8b implements Runnable {
    public final byte a;
    public final r8b b;

    public n8b(r8b r8bVar, byte b) {
        this.a = b;
        this.b = r8bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        r8b r8bVar = this.b;
        switch (b) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                getwebpagepreview.message = r8bVar.T1.d.getText().toString();
                r8bVar.d2 = ConnectionsManager.getInstance(r8bVar.a).sendRequest(getwebpagepreview, new yp9(r8bVar, (byte) 13));
                return;
            case 1:
                r8bVar.d1();
                return;
            default:
                zt3 zt3Var = r8bVar.T1;
                if (r8bVar.isShowing()) {
                    zt3Var.d.requestFocus();
                    hl.E3(zt3Var.d);
                    return;
                }
                return;
        }
    }
}
