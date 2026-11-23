package bi;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.qj0;
public final class a implements qj0 {
    public final int f3343a;

    public a(int i7) {
        this.f3343a = i7;
    }

    @Override
    public final void b(int i7, View view) {
        switch (this.f3343a) {
            case 0:
                int i10 = e.W1;
                return;
            case 1:
                int i11 = y.f4222w2;
                return;
            case 2:
                if (view instanceof org.telegram.ui.Cells.w) {
                    ((org.telegram.ui.Cells.w) view).a();
                    return;
                }
                return;
            case 3:
                boolean z10 = ChatAttachAlertPhotoLayout.f32862r1;
                if (view instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                    r5Var.f31795y.d(r5Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void a(int i7, View view) {
    }
}
