package lh;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.c10;
public final class n6 implements Runnable {
    public final int f12833a;
    public final boolean f12834b;
    public final int f12835c;
    public final Object d;

    public n6(Object obj, boolean z4, int i10, int i11) {
        this.f12833a = i11;
        this.d = obj;
        this.f12834b = z4;
        this.f12835c = i10;
    }

    @Override
    public final void run() {
        int i10;
        String formatPluralString;
        switch (this.f12833a) {
            case 0:
                t7 t7Var = (t7) this.d;
                if (!this.f12834b) {
                    t7Var.getClass();
                    return;
                }
                Set set = t7Var.Q;
                int i11 = this.f12835c;
                set.remove(Integer.valueOf(i11));
                Runnable runnable = (Runnable) t7Var.R.remove(Integer.valueOf(i11));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ((vf0) this.d).f29469a.f30238b.y3(this.f12835c, this.f12834b);
                return;
            case 2:
                en0 en0Var = (en0) this.d;
                en0Var.f24650o = null;
                en0Var.c(this.f12835c, this.f12834b, true);
                return;
            default:
                qc a02 = qc.a0((c10) this.d);
                boolean z4 = this.f12834b;
                if (z4) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i12 = this.f12835c;
                if (z4) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i12, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i12, new Object[0]);
                }
                ic M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f25671j = 5000;
                M.j();
                return;
        }
    }

    public n6(en0 en0Var, int i10, boolean z4) {
        this.f12833a = 2;
        this.d = en0Var;
        this.f12835c = i10;
        this.f12834b = z4;
    }
}
