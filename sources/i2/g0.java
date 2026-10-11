package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.e10;
import yh.n5;
public final class g0 implements Runnable {
    public final int f11703a;
    public final boolean f11704b;
    public final int f11705c;
    public final Object d;

    public g0(Object obj, int i10, boolean z10, int i11) {
        this.f11703a = i11;
        this.d = obj;
        this.f11705c = i10;
        this.f11704b = z10;
    }

    @Override
    public final void run() {
        int i10;
        String formatPluralString;
        switch (this.f11703a) {
            case 0:
                p0 p0Var = (p0) this.d;
                j2.f fVar = p0Var.M;
                o1[] o1VarArr = p0Var.f11835a;
                int i11 = this.f11705c;
                int i12 = o1VarArr[i11].f11809a.f11644b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new hg.o1(p5, i11, i12, this.f11704b));
                return;
            case 1:
                ((sg0) this.d).f30862a.f31240b.y3(this.f11705c, this.f11704b);
                return;
            case 2:
                eo0 eo0Var = (eo0) this.d;
                eo0Var.f26160o = null;
                eo0Var.c(this.f11705c, this.f11704b, true);
                return;
            case 3:
                ad a02 = ad.a0((e10) this.d);
                boolean z10 = this.f11704b;
                if (z10) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i13 = this.f11705c;
                if (z10) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i13, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i13, new Object[0]);
                }
                sc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f30833j = 5000;
                M.j();
                return;
            default:
                n5 n5Var = (n5) this.d;
                if (!this.f11704b) {
                    n5Var.getClass();
                    return;
                }
                Set set = n5Var.Q;
                int i14 = this.f11705c;
                set.remove(Integer.valueOf(i14));
                Runnable runnable = (Runnable) n5Var.R.remove(Integer.valueOf(i14));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public g0(Object obj, boolean z10, int i10, int i11) {
        this.f11703a = i11;
        this.d = obj;
        this.f11704b = z10;
        this.f11705c = i10;
    }
}
