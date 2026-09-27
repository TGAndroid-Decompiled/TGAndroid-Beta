package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.e10;
import yh.s5;
public final class g0 implements Runnable {
    public final int f10697a;
    public final boolean f10698b;
    public final int f10699c;
    public final Object d;

    public g0(Object obj, int i10, boolean z10, int i11) {
        this.f10697a = i11;
        this.d = obj;
        this.f10699c = i10;
        this.f10698b = z10;
    }

    @Override
    public final void run() {
        int i10;
        String formatPluralString;
        switch (this.f10697a) {
            case 0:
                p0 p0Var = (p0) this.d;
                j2.f fVar = p0Var.M;
                o1[] o1VarArr = p0Var.f10819a;
                int i11 = this.f10699c;
                int i12 = o1VarArr[i11].f10795a.f10642b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new ga.a(p5, i11, i12, this.f10698b));
                return;
            case 1:
                ((ag0) this.d).f22675a.f23011b.x3(this.f10699c, this.f10698b);
                return;
            case 2:
                mn0 mn0Var = (mn0) this.d;
                mn0Var.f26486o = null;
                mn0Var.c(this.f10699c, this.f10698b, true);
                return;
            case 3:
                xc a02 = xc.a0((e10) this.d);
                boolean z10 = this.f10698b;
                if (z10) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i13 = this.f10699c;
                if (z10) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i13, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i13, new Object[0]);
                }
                qc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f27691j = 5000;
                M.j();
                return;
            default:
                s5 s5Var = (s5) this.d;
                if (!this.f10698b) {
                    s5Var.getClass();
                    return;
                }
                Set set = s5Var.Q;
                int i14 = this.f10699c;
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
        this.f10697a = i11;
        this.d = obj;
        this.f10698b = z10;
        this.f10699c = i10;
    }
}
