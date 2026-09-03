package kh;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.hl0;
public final class a implements hl0 {
    public final int f10563a;

    public a(int i10) {
        this.f10563a = i10;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f10563a) {
            case 0:
                int i11 = d.X;
                return;
            case 1:
                int i12 = s.f10898x0;
                return;
            case 2:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    return;
                }
                return;
            case 3:
                boolean z4 = ChatAttachAlertPhotoLayout.f22867n1;
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    s5Var.f22291w.b(s5Var);
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
