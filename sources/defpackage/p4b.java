package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class p4b implements Runnable {
    public final byte a;
    public final t4b b;

    public p4b(t4b t4bVar, byte b) {
        this.a = b;
        this.b = t4bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        t4b t4bVar = this.b;
        switch (b) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                getwebpagepreview.message = t4bVar.T1.d.getText().toString();
                t4bVar.d2 = ConnectionsManager.getInstance(t4bVar.a).sendRequest(getwebpagepreview, new wx9(t4bVar, (byte) 12));
                return;
            case 1:
                t4bVar.c1();
                return;
            default:
                it3 it3Var = t4bVar.T1;
                if (t4bVar.isShowing()) {
                    it3Var.d.requestFocus();
                    gl.E3(it3Var.d);
                    return;
                }
                return;
        }
    }
}
