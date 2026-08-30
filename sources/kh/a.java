package kh;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.il0;
public final class a implements il0 {
    public final int f10453a;

    public a(int i10) {
        this.f10453a = i10;
    }

    @Override
    public final void f(int i10, View view) {
        switch (this.f10453a) {
            case 0:
                int i11 = d.X;
                return;
            case 1:
                int i12 = s.f10789x0;
                return;
            case 2:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    return;
                }
                return;
            case 3:
                boolean z4 = ChatAttachAlertPhotoLayout.f22894n1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    t5Var.f22354w.b(t5Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void a(int i10, View view) {
    }
}
