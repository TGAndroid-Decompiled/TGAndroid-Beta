package jh;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.lf0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.p00;
public final class n6 implements Runnable {
    public final int f12512a;
    public final boolean f12513b;
    public final int f12514c;
    public final Object d;

    public n6(Object obj, boolean z10, int i10, int i11) {
        this.f12512a = i11;
        this.d = obj;
        this.f12513b = z10;
        this.f12514c = i10;
    }

    @Override
    public final void run() {
        int i10;
        String formatPluralString;
        switch (this.f12512a) {
            case 0:
                s7 s7Var = (s7) this.d;
                if (!this.f12513b) {
                    s7Var.getClass();
                    return;
                }
                Set set = s7Var.Q;
                int i11 = this.f12514c;
                set.remove(Integer.valueOf(i11));
                Runnable runnable = (Runnable) s7Var.R.remove(Integer.valueOf(i11));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ((lf0) this.d).f30303a.f30672b.y3(this.f12514c, this.f12513b);
                return;
            case 2:
                vm0 vm0Var = (vm0) this.d;
                vm0Var.f33589o = null;
                vm0Var.c(this.f12514c, this.f12513b, true);
                return;
            default:
                tc a02 = tc.a0((p00) this.d);
                boolean z10 = this.f12513b;
                if (z10) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i12 = this.f12514c;
                if (z10) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i12, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i12, new Object[0]);
                }
                mc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f30652j = 5000;
                M.j();
                return;
        }
    }

    public n6(vm0 vm0Var, int i10, boolean z10) {
        this.f12512a = 2;
        this.d = vm0Var;
        this.f12514c = i10;
        this.f12513b = z10;
    }
}
