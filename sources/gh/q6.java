package gh;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.n00;
public final class q6 implements Runnable {
    public final int f8752a;
    public final boolean f8753b;
    public final int f8754c;
    public final Object d;

    public q6(Object obj, boolean z10, int i9, int i10) {
        this.f8752a = i10;
        this.d = obj;
        this.f8753b = z10;
        this.f8754c = i9;
    }

    @Override
    public final void run() {
        int i9;
        String formatPluralString;
        switch (this.f8752a) {
            case 0:
                v7 v7Var = (v7) this.d;
                if (!this.f8753b) {
                    v7Var.getClass();
                    return;
                }
                Set set = v7Var.Q;
                int i10 = this.f8754c;
                set.remove(Integer.valueOf(i10));
                Runnable runnable = (Runnable) v7Var.R.remove(Integer.valueOf(i10));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ((ye0) this.d).f34958a.f35287b.y3(this.f8754c, this.f8753b);
                return;
            case 2:
                im0 im0Var = (im0) this.d;
                im0Var.f29476o = null;
                im0Var.c(this.f8754c, this.f8753b, true);
                return;
            default:
                oc a02 = oc.a0((n00) this.d);
                boolean z10 = this.f8753b;
                if (z10) {
                    i9 = R.raw.folder_in;
                } else {
                    i9 = R.raw.folder_out;
                }
                int i11 = this.f8754c;
                if (z10) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i11, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i11, new Object[0]);
                }
                gc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i9);
                M.f28737j = 5000;
                M.j();
                return;
        }
    }

    public q6(im0 im0Var, int i9, boolean z10) {
        this.f8752a = 2;
        this.d = im0Var;
        this.f8754c = i9;
        this.f8753b = z10;
    }
}
