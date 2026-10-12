package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.h10;
import yh.n5;
public final class g0 implements Runnable {
    public final int f11702a;
    public final boolean f11703b;
    public final int f11704c;
    public final Object d;

    public g0(Object obj, int i10, boolean z10, int i11) {
        this.f11702a = i11;
        this.d = obj;
        this.f11704c = i10;
        this.f11703b = z10;
    }

    @Override
    public final void run() {
        int i10;
        String formatPluralString;
        switch (this.f11702a) {
            case 0:
                p0 p0Var = (p0) this.d;
                j2.f fVar = p0Var.M;
                o1[] o1VarArr = p0Var.f11834a;
                int i11 = this.f11704c;
                int i12 = o1VarArr[i11].f11808a.f11643b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new hg.o1(p5, i11, i12, this.f11703b));
                return;
            case 1:
                ((ug0) this.d).f31160a.f31505b.y3(this.f11704c, this.f11703b);
                return;
            case 2:
                jo0 jo0Var = (jo0) this.d;
                jo0Var.f27592o = null;
                jo0Var.c(this.f11704c, this.f11703b, true);
                return;
            case 3:
                zc a02 = zc.a0((h10) this.d);
                boolean z10 = this.f11703b;
                if (z10) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i13 = this.f11704c;
                if (z10) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i13, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i13, new Object[0]);
                }
                sc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f30536j = 5000;
                M.j();
                return;
            default:
                n5 n5Var = (n5) this.d;
                if (!this.f11703b) {
                    n5Var.getClass();
                    return;
                }
                Set set = n5Var.Q;
                int i14 = this.f11704c;
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
        this.f11702a = i11;
        this.d = obj;
        this.f11703b = z10;
        this.f11704c = i10;
    }
}
