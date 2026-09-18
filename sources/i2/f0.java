package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yf0;
import org.telegram.ui.f10;
import yh.t5;
public final class f0 implements Runnable {
    public final int f10694a;
    public final boolean f10695b;
    public final int f10696c;
    public final Object d;

    public f0(Object obj, int i10, boolean z10, int i11) {
        this.f10694a = i11;
        this.d = obj;
        this.f10696c = i10;
        this.f10695b = z10;
    }

    @Override
    public final void run() {
        int i10;
        String formatPluralString;
        switch (this.f10694a) {
            case 0:
                o0 o0Var = (o0) this.d;
                j2.f fVar = o0Var.M;
                n1[] n1VarArr = o0Var.f10806a;
                int i11 = this.f10696c;
                int i12 = n1VarArr[i11].f10799a.f10685b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new ga.a(p5, i11, i12, this.f10695b));
                return;
            case 1:
                ((yf0) this.d).f30569a.f30784b.x3(this.f10696c, this.f10695b);
                return;
            case 2:
                ln0 ln0Var = (ln0) this.d;
                ln0Var.f26198o = null;
                ln0Var.c(this.f10696c, this.f10695b, true);
                return;
            case 3:
                xc a02 = xc.a0((f10) this.d);
                boolean z10 = this.f10695b;
                if (z10) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i13 = this.f10696c;
                if (z10) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i13, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i13, new Object[0]);
                }
                qc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f27550j = 5000;
                M.j();
                return;
            default:
                t5 t5Var = (t5) this.d;
                if (!this.f10695b) {
                    t5Var.getClass();
                    return;
                }
                Set set = t5Var.Q;
                int i14 = this.f10696c;
                set.remove(Integer.valueOf(i14));
                Runnable runnable = (Runnable) t5Var.R.remove(Integer.valueOf(i14));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public f0(Object obj, boolean z10, int i10, int i11) {
        this.f10694a = i11;
        this.d = obj;
        this.f10695b = z10;
        this.f10696c = i10;
    }
}
