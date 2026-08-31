package mh;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wf0;
import org.telegram.ui.b10;
public final class n6 implements Runnable {
    public final int f14487a;
    public final boolean f14488b;
    public final int f14489c;
    public final Object d;

    public n6(Object obj, boolean z4, int i10, int i11) {
        this.f14487a = i11;
        this.d = obj;
        this.f14488b = z4;
        this.f14489c = i10;
    }

    @Override
    public final void run() {
        int i10;
        String formatPluralString;
        switch (this.f14487a) {
            case 0:
                t7 t7Var = (t7) this.d;
                if (!this.f14488b) {
                    t7Var.getClass();
                    return;
                }
                Set set = t7Var.Q;
                int i11 = this.f14489c;
                set.remove(Integer.valueOf(i11));
                Runnable runnable = (Runnable) t7Var.R.remove(Integer.valueOf(i11));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ((wf0) this.d).f32741a.f33060b.y3(this.f14489c, this.f14488b);
                return;
            case 2:
                gn0 gn0Var = (gn0) this.d;
                gn0Var.f27239o = null;
                gn0Var.c(this.f14489c, this.f14488b, true);
                return;
            default:
                qc a02 = qc.a0((b10) this.d);
                boolean z4 = this.f14488b;
                if (z4) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i12 = this.f14489c;
                if (z4) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i12, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i12, new Object[0]);
                }
                ic M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f27745j = 5000;
                M.j();
                return;
        }
    }

    public n6(gn0 gn0Var, int i10, boolean z4) {
        this.f14487a = 2;
        this.d = gn0Var;
        this.f14489c = i10;
        this.f14488b = z4;
    }
}
