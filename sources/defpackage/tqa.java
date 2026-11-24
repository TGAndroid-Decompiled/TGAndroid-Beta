package defpackage;

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class tqa implements Runnable {
    public final byte a;
    public final wsa b;

    public tqa(wsa wsaVar, byte b) {
        this.a = b;
        this.b = wsaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                wsaVar.dismiss();
                d S = LaunchActivity.S();
                TL_stars.TL_starGiftUnique A1 = wsaVar.A1();
                if (S != null && A1 != null) {
                    nk3 nk3Var = new nk3(td4.j(4, "onlySelect", "dialogsType", true));
                    nk3Var.E2 = new jq9(wsaVar, A1, nk3Var, (byte) 5);
                    S.presentFragment(nk3Var);
                    return;
                }
                return;
            case 1:
                wsaVar.a2();
                return;
            default:
                wsaVar.onBackPressed();
                return;
        }
    }
}
