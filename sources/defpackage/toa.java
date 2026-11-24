package defpackage;

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class toa implements Runnable {
    public final byte a;
    public final vqa b;

    public toa(vqa vqaVar, byte b) {
        this.a = b;
        this.b = vqaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                vqaVar.dismiss();
                d S = LaunchActivity.S();
                TL_stars.TL_starGiftUnique A1 = vqaVar.A1();
                if (S != null && A1 != null) {
                    cj3 cj3Var = new cj3(tb4.j(4, "onlySelect", "dialogsType", true));
                    cj3Var.E2 = new io9(vqaVar, A1, cj3Var, (byte) 5);
                    S.presentFragment(cj3Var);
                    return;
                }
                return;
            case 1:
                vqaVar.a2();
                return;
            default:
                vqaVar.onBackPressed();
                return;
        }
    }
}
