package bi;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gj0;
public final class a implements gj0 {
    public final int f3364a;

    public a(int i7) {
        this.f3364a = i7;
    }

    @Override
    public final void b(int i7, View view) {
        switch (this.f3364a) {
            case 0:
                int i10 = e.W1;
                return;
            case 1:
                int i11 = y.f3984w2;
                return;
            case 2:
                if (view instanceof org.telegram.ui.Cells.w) {
                    ((org.telegram.ui.Cells.w) view).a();
                    return;
                }
                return;
            case 3:
                boolean z10 = ChatAttachAlertPhotoLayout.f32365r1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    q5Var.f31292y.d(q5Var);
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
