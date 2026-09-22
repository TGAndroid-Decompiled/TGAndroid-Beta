package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.f10;
import yh.u5;
public final class f0 implements Runnable {
    public final int f10693a;
    public final boolean f10694b;
    public final int f10695c;
    public final Object d;

    public f0(Object obj, int i10, boolean z10, int i11) {
        this.f10693a = i11;
        this.d = obj;
        this.f10695c = i10;
        this.f10694b = z10;
    }

    @Override
    public final void run() {
        int i10;
        String formatPluralString;
        switch (this.f10693a) {
            case 0:
                o0 o0Var = (o0) this.d;
                j2.f fVar = o0Var.M;
                n1[] n1VarArr = o0Var.f10805a;
                int i11 = this.f10695c;
                int i12 = n1VarArr[i11].f10798a.f10684b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new hg.r(p5, i11, i12, this.f10694b));
                return;
            case 1:
                ((pf0) this.d).f27030a.f27320b.x3(this.f10695c, this.f10694b);
                return;
            case 2:
                xm0 xm0Var = (xm0) this.d;
                xm0Var.f30012o = null;
                xm0Var.c(this.f10695c, this.f10694b, true);
                return;
            case 3:
                vc a02 = vc.a0((f10) this.d);
                boolean z10 = this.f10694b;
                if (z10) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i13 = this.f10695c;
                if (z10) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i13, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i13, new Object[0]);
                }
                oc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f26751j = 5000;
                M.j();
                return;
            default:
                u5 u5Var = (u5) this.d;
                if (!this.f10694b) {
                    u5Var.getClass();
                    return;
                }
                Set set = u5Var.Q;
                int i14 = this.f10695c;
                set.remove(Integer.valueOf(i14));
                Runnable runnable = (Runnable) u5Var.R.remove(Integer.valueOf(i14));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public f0(Object obj, boolean z10, int i10, int i11) {
        this.f10693a = i11;
        this.d = obj;
        this.f10694b = z10;
        this.f10695c = i10;
    }
}
