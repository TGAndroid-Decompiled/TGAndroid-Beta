package lh;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.jl0;
public final class a implements jl0 {
    public final int f12577a;

    public a(int i10) {
        this.f12577a = i10;
    }

    @Override
    public final void f(int i10, View view) {
        switch (this.f12577a) {
            case 0:
                int i11 = d.X;
                return;
            case 1:
                int i12 = s.f12936x0;
                return;
            case 2:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    return;
                }
                return;
            case 3:
                boolean z4 = ChatAttachAlertPhotoLayout.f24736n1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    t5Var.f24157w.b(t5Var);
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
