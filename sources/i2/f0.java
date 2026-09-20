package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xf0;
import org.telegram.ui.f10;
import yh.u5;
public final class f0 implements Runnable {
    public final int f10695a;
    public final boolean f10696b;
    public final int f10697c;
    public final Object d;

    public f0(Object obj, int i10, boolean z10, int i11) {
        this.f10695a = i11;
        this.d = obj;
        this.f10697c = i10;
        this.f10696b = z10;
    }

    @Override
    public final void run() {
        int i10;
        String formatPluralString;
        switch (this.f10695a) {
            case 0:
                o0 o0Var = (o0) this.d;
                j2.f fVar = o0Var.M;
                n1[] n1VarArr = o0Var.f10807a;
                int i11 = this.f10697c;
                int i12 = n1VarArr[i11].f10800a.f10686b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new ga.a(p5, i11, i12, this.f10696b));
                return;
            case 1:
                ((xf0) this.d).f30258a.f30514b.x3(this.f10697c, this.f10696b);
                return;
            case 2:
                kn0 kn0Var = (kn0) this.d;
                kn0Var.f25834o = null;
                kn0Var.c(this.f10697c, this.f10696b, true);
                return;
            case 3:
                xc a02 = xc.a0((f10) this.d);
                boolean z10 = this.f10696b;
                if (z10) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i13 = this.f10697c;
                if (z10) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i13, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i13, new Object[0]);
                }
                pc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f27252j = 5000;
                M.j();
                return;
            default:
                u5 u5Var = (u5) this.d;
                if (!this.f10696b) {
                    u5Var.getClass();
                    return;
                }
                Set set = u5Var.Q;
                int i14 = this.f10697c;
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
        this.f10695a = i11;
        this.d = obj;
        this.f10696b = z10;
        this.f10697c = i10;
    }
}
