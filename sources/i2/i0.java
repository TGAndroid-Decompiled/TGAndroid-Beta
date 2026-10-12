package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.l10;
import zh.n5;
public final class i0 implements Runnable {
    public final int f11039a;
    public final boolean f11040b;
    public final int f11041c;
    public final Object d;

    public i0(Object obj, int i10, boolean z10, int i11) {
        this.f11039a = i11;
        this.d = obj;
        this.f11041c = i10;
        this.f11040b = z10;
    }

    @Override
    public final void run() {
        int i10;
        String formatPluralString;
        switch (this.f11039a) {
            case 0:
                r0 r0Var = (r0) this.d;
                j2.f fVar = r0Var.M;
                r1[] r1VarArr = r0Var.f11149a;
                int i11 = this.f11041c;
                int i12 = r1VarArr[i11].f11180a.f10916b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new j2.c(p5, i11, i12, this.f11040b));
                return;
            case 1:
                ((pg0) this.d).f28309a.f28592b.y3(this.f11041c, this.f11040b);
                return;
            case 2:
                ao0 ao0Var = (ao0) this.d;
                ao0Var.f23595o = null;
                ao0Var.c(this.f11041c, this.f11040b, true);
                return;
            case 3:
                zc a02 = zc.a0((l10) this.d);
                boolean z10 = this.f11040b;
                if (z10) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i13 = this.f11041c;
                if (z10) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i13, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i13, new Object[0]);
                }
                sc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f29102j = 5000;
                M.j();
                return;
            default:
                n5 n5Var = (n5) this.d;
                if (!this.f11040b) {
                    n5Var.getClass();
                    return;
                }
                Set set = n5Var.Q;
                int i14 = this.f11041c;
                set.remove(Integer.valueOf(i14));
                Runnable runnable = (Runnable) n5Var.R.remove(Integer.valueOf(i14));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public i0(Object obj, boolean z10, int i10, int i11) {
        this.f11039a = i11;
        this.d = obj;
        this.f11040b = z10;
        this.f11041c = i10;
    }
}
