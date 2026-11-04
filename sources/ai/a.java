package ai;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.fj0;
public final class a implements fj0 {
    public final int f473a;

    public a(int i3) {
        this.f473a = i3;
    }

    @Override
    public final void f(int i3, View view) {
        switch (this.f473a) {
            case 0:
                int i10 = g.T1;
                return;
            case 1:
                int i11 = e0.f595t2;
                return;
            case 2:
                if (view instanceof org.telegram.ui.Cells.w) {
                    ((org.telegram.ui.Cells.w) view).a();
                    return;
                }
                return;
            case 3:
                boolean z10 = ChatAttachAlertPhotoLayout.f31258r1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    q5Var.f30216y.c(q5Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void a(int i3, View view) {
    }
}
