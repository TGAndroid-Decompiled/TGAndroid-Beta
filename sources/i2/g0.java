package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.b10;
import yh.s5;
public final class g0 implements Runnable {
    public final int f10708a;
    public final boolean f10709b;
    public final int f10710c;
    public final Object d;

    public g0(Object obj, int i10, boolean z10, int i11) {
        this.f10708a = i11;
        this.d = obj;
        this.f10710c = i10;
        this.f10709b = z10;
    }

    @Override
    public final void run() {
        int i10;
        String formatPluralString;
        switch (this.f10708a) {
            case 0:
                p0 p0Var = (p0) this.d;
                j2.f fVar = p0Var.M;
                o1[] o1VarArr = p0Var.f10830a;
                int i11 = this.f10710c;
                int i12 = o1VarArr[i11].f10806a.f10653b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new hg.r(p5, i11, i12, this.f10709b));
                return;
            case 1:
                ((cg0) this.d).f23311a.f23630b.x3(this.f10710c, this.f10709b);
                return;
            case 2:
                nn0 nn0Var = (nn0) this.d;
                nn0Var.f26752o = null;
                nn0Var.c(this.f10710c, this.f10709b, true);
                return;
            case 3:
                yc a02 = yc.a0((b10) this.d);
                boolean z10 = this.f10709b;
                if (z10) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i13 = this.f10710c;
                if (z10) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i13, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i13, new Object[0]);
                }
                rc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f27946j = 5000;
                M.j();
                return;
            default:
                s5 s5Var = (s5) this.d;
                if (!this.f10709b) {
                    s5Var.getClass();
                    return;
                }
                Set set = s5Var.Q;
                int i14 = this.f10710c;
                set.remove(Integer.valueOf(i14));
                Runnable runnable = (Runnable) s5Var.R.remove(Integer.valueOf(i14));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public g0(Object obj, boolean z10, int i10, int i11) {
        this.f10708a = i11;
        this.d = obj;
        this.f10709b = z10;
        this.f10710c = i10;
    }
}
