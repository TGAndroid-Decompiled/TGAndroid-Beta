package hh;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.q00;

public final class p6 implements Runnable {

    public final int f9875a;

    public final boolean f9876b;

    public final int f9877c;
    public final Object d;

    public p6(Object obj, boolean z10, int i10, int i11) {
        this.f9875a = i11;
        this.d = obj;
        this.f9876b = z10;
        this.f9877c = i10;
    }

    @Override
    public final void run() {
        switch (this.f9875a) {
            case 0:
                u7 u7Var = (u7) this.d;
                if (!this.f9876b) {
                    u7Var.getClass();
                } else {
                    Set set = u7Var.Q;
                    int i10 = this.f9877c;
                    set.remove(Integer.valueOf(i10));
                    Runnable runnable = (Runnable) u7Var.R.remove(Integer.valueOf(i10));
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                break;
            case 1:
                ((cf0) this.d).f27413a.f27738b.y3(this.f9877c, this.f9876b);
                break;
            case 2:
                lm0 lm0Var = (lm0) this.d;
                lm0Var.f30425o = null;
                lm0Var.c(this.f9877c, this.f9876b, true);
                break;
            default:
                mc mcVarA0 = mc.a0((q00) this.d);
                boolean z10 = this.f9876b;
                int i11 = z10 ? R.raw.folder_in : R.raw.folder_out;
                int i12 = this.f9877c;
                ec ecVarM = mcVarA0.M(z10 ? LocaleController.formatPluralString("FolderLinkAddedChats", i12, new Object[0]) : LocaleController.formatPluralString("FolderLinkRemovedChats", i12, new Object[0]), LocaleController.getString(R.string.FolderLinkChatlistUpdate), i11);
                ecVarM.f28020j = 5000;
                ecVarM.j();
                break;
        }
    }

    public p6(lm0 lm0Var, int i10, boolean z10) {
        this.f9875a = 2;
        this.d = lm0Var;
        this.f9877c = i10;
        this.f9876b = z10;
    }
}
