package fh;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.mk0;
public final class a implements mk0 {
    public final int f6328a;

    public a(int i9) {
        this.f6328a = i9;
    }

    @Override
    public final void a(int i9, View view) {
        switch (this.f6328a) {
            case 0:
                int i10 = d.W;
                return;
            case 1:
                int i11 = x.f6839w0;
                return;
            case 2:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    return;
                }
                return;
            case 3:
                boolean z10 = ChatAttachAlertPhotoLayout.f26241m1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    t5Var.f25691w.d(t5Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void b(int i9, View view) {
    }
}
