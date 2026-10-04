package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.qn0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.f10;
import yh.t5;
public final class g0 implements Runnable {
    public final int f11654a;
    public final boolean f11655b;
    public final int f11656c;
    public final Object d;

    public g0(Object obj, int i10, boolean z10, int i11) {
        this.f11654a = i11;
        this.d = obj;
        this.f11656c = i10;
        this.f11655b = z10;
    }

    @Override
    public final void run() {
        int i10;
        String formatPluralString;
        switch (this.f11654a) {
            case 0:
                p0 p0Var = (p0) this.d;
                j2.f fVar = p0Var.M;
                o1[] o1VarArr = p0Var.f11786a;
                int i11 = this.f11656c;
                int i12 = o1VarArr[i11].f11760a.f11595b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new ga.a(p5, i11, i12, this.f11655b));
                return;
            case 1:
                ((cg0) this.d).f25368a.f25721b.y3(this.f11656c, this.f11655b);
                return;
            case 2:
                qn0 qn0Var = (qn0) this.d;
                qn0Var.f30117o = null;
                qn0Var.c(this.f11656c, this.f11655b, true);
                return;
            case 3:
                yc a02 = yc.a0((f10) this.d);
                boolean z10 = this.f11655b;
                if (z10) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i13 = this.f11656c;
                if (z10) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i13, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i13, new Object[0]);
                }
                rc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f30345j = 5000;
                M.j();
                return;
            default:
                t5 t5Var = (t5) this.d;
                if (!this.f11655b) {
                    t5Var.getClass();
                    return;
                }
                Set set = t5Var.Q;
                int i14 = this.f11656c;
                set.remove(Integer.valueOf(i14));
                Runnable runnable = (Runnable) t5Var.R.remove(Integer.valueOf(i14));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public g0(Object obj, boolean z10, int i10, int i11) {
        this.f11654a = i11;
        this.d = obj;
        this.f11655b = z10;
        this.f11656c = i10;
    }
}
