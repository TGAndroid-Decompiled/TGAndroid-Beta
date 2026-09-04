package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.f10;
import zh.s5;
public final class g0 implements Runnable {
    public final int f11550a;
    public final boolean f11551b;
    public final int f11552c;
    public final Object d;

    public g0(Object obj, int i10, boolean z10, int i11) {
        this.f11550a = i11;
        this.d = obj;
        this.f11552c = i10;
        this.f11551b = z10;
    }

    @Override
    public final void run() {
        int i10;
        String formatPluralString;
        switch (this.f11550a) {
            case 0:
                o0 o0Var = (o0) this.d;
                j2.f fVar = o0Var.M;
                n1[] n1VarArr = o0Var.f11658a;
                int i11 = this.f11552c;
                int i12 = n1VarArr[i11].f11648a.f11495b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new i0.b(p5, i11, i12, this.f11551b));
                return;
            case 1:
                ((pf0) this.d).f29367a.f29708b.y3(this.f11552c, this.f11551b);
                return;
            case 2:
                xm0 xm0Var = (xm0) this.d;
                xm0Var.f32625o = null;
                xm0Var.c(this.f11552c, this.f11551b, true);
                return;
            case 3:
                yc a02 = yc.a0((f10) this.d);
                boolean z10 = this.f11551b;
                if (z10) {
                    i10 = R.raw.folder_in;
                } else {
                    i10 = R.raw.folder_out;
                }
                int i13 = this.f11552c;
                if (z10) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i13, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i13, new Object[0]);
                }
                qc M = a02.M(formatPluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.f29679j = 5000;
                M.j();
                return;
            default:
                s5 s5Var = (s5) this.d;
                if (!this.f11551b) {
                    s5Var.getClass();
                    return;
                }
                Set set = s5Var.Q;
                int i14 = this.f11552c;
                set.remove(Integer.valueOf(i14));
                Runnable runnable = (Runnable) s5Var.R.remove(Integer.valueOf(i14));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public g0(Object obj, boolean z10, int i10, int i11) {
        this.f11550a = i11;
        this.d = obj;
        this.f11551b = z10;
        this.f11552c = i10;
    }
}
