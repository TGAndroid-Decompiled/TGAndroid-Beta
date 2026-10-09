package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.f10;
import yh.m5;
public final class g0 implements Runnable {
    public final int f11704a;
    public final boolean f11705b;
    public final int f11706c;
    public final Object d;

    public g0(Object obj, int i10, boolean z10, int i11) {
        this.f11704a = i11;
        this.d = obj;
        this.f11706c = i10;
        this.f11705b = z10;
    }

    @Override
    public final void run() {
        int i10;
        String formatPluralString;
        switch (this.f11704a) {
            case 0:
                p0 p0Var = (p0) this.d;
                j2.f fVar = p0Var.M;
                o1[] o1VarArr = p0Var.f11836a;
                int i11 = this.f11706c;
                int i12 = o1VarArr[i11].f11810a.f11645b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new hg.o1(p5, i11, i12, this.f11705b));
                return;
            case 1:
                ((rg0) this.d).f30440a.f30783b.y3(this.f11706c, this.f11705b);
                return;
            case 2:
                do0 do0Var = (do0) this.d;
                do0Var.f25761o = null;
                do0Var.c(this.f11706c, this.f11705b, true);
                return;
            case 3:
                ad a02 = ad.a0((f10) this.d);
                boolean z10 = this.f11705b;
                if (z10) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i13 = this.f11706c;
                if (z10) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i13, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i13, new Object[0]);
                }
                tc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f31130j = 5000;
                M.j();
                return;
            default:
                m5 m5Var = (m5) this.d;
                if (!this.f11705b) {
                    m5Var.getClass();
                    return;
                }
                Set set = m5Var.Q;
                int i14 = this.f11706c;
                set.remove(Integer.valueOf(i14));
                Runnable runnable = (Runnable) m5Var.R.remove(Integer.valueOf(i14));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public g0(Object obj, boolean z10, int i10, int i11) {
        this.f11704a = i11;
        this.d = obj;
        this.f11705b = z10;
        this.f11706c = i10;
    }
}
