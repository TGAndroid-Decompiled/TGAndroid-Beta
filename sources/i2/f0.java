package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.yf0;
import org.telegram.ui.h10;
import xh.v5;
public final class f0 implements Runnable {
    public final int f10183a;
    public final boolean f10184b;
    public final int f10185c;
    public final Object d;

    public f0(Object obj, int i10, boolean z10, int i11) {
        this.f10183a = i11;
        this.d = obj;
        this.f10185c = i10;
        this.f10184b = z10;
    }

    @Override
    public final void run() {
        int i10;
        String formatPluralString;
        switch (this.f10183a) {
            case 0:
                n0 n0Var = (n0) this.d;
                j2.e eVar = n0Var.M;
                m1[] m1VarArr = n0Var.f10282a;
                int i11 = this.f10185c;
                int i12 = m1VarArr[i11].f10273a.f10174b;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1033, new i0.b(p5, i11, i12, this.f10184b));
                return;
            case 1:
                ((yf0) this.d).f29318a.f29659b.y3(this.f10185c, this.f10184b);
                return;
            case 2:
                hn0 hn0Var = (hn0) this.d;
                hn0Var.f23707o = null;
                hn0Var.c(this.f10185c, this.f10184b, true);
                return;
            case 3:
                wc a02 = wc.a0((h10) this.d);
                boolean z10 = this.f10184b;
                if (z10) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i13 = this.f10185c;
                if (z10) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i13, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i13, new Object[0]);
                }
                pc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f26081j = 5000;
                M.j();
                return;
            default:
                v5 v5Var = (v5) this.d;
                if (!this.f10184b) {
                    v5Var.getClass();
                    return;
                }
                Set set = v5Var.Q;
                int i14 = this.f10185c;
                set.remove(Integer.valueOf(i14));
                Runnable runnable = (Runnable) v5Var.R.remove(Integer.valueOf(i14));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public f0(Object obj, boolean z10, int i10, int i11) {
        this.f10183a = i11;
        this.d = obj;
        this.f10184b = z10;
        this.f10185c = i10;
    }
}
