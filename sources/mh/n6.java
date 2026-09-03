package mh;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wf0;
import org.telegram.ui.b10;
public final class n6 implements Runnable {
    public final int f14489a;
    public final boolean f14490b;
    public final int f14491c;
    public final Object d;

    public n6(Object obj, boolean z4, int i10, int i11) {
        this.f14489a = i11;
        this.d = obj;
        this.f14490b = z4;
        this.f14491c = i10;
    }

    @Override
    public final void run() {
        int i10;
        String formatPluralString;
        switch (this.f14489a) {
            case 0:
                t7 t7Var = (t7) this.d;
                if (!this.f14490b) {
                    t7Var.getClass();
                    return;
                }
                Set set = t7Var.Q;
                int i11 = this.f14491c;
                set.remove(Integer.valueOf(i11));
                Runnable runnable = (Runnable) t7Var.R.remove(Integer.valueOf(i11));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ((wf0) this.d).f32746a.f33054b.y3(this.f14491c, this.f14490b);
                return;
            case 2:
                fn0 fn0Var = (fn0) this.d;
                fn0Var.f26965o = null;
                fn0Var.c(this.f14491c, this.f14490b, true);
                return;
            default:
                qc a02 = qc.a0((b10) this.d);
                boolean z4 = this.f14490b;
                if (z4) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i12 = this.f14491c;
                if (z4) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i12, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i12, new Object[0]);
                }
                ic M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f27778j = 5000;
                M.j();
                return;
        }
    }

    public n6(fn0 fn0Var, int i10, boolean z4) {
        this.f14489a = 2;
        this.d = fn0Var;
        this.f14491c = i10;
        this.f14490b = z4;
    }
}
