package bi;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.qj0;
public final class a implements qj0 {
    public final int f3392a;

    public a(int i7) {
        this.f3392a = i7;
    }

    @Override
    public final void c(int i7, View view) {
        switch (this.f3392a) {
            case 0:
                int i10 = e.W1;
                return;
            case 1:
                int i11 = y.f4277w2;
                return;
            case 2:
                if (view instanceof org.telegram.ui.Cells.w) {
                    ((org.telegram.ui.Cells.w) view).a();
                    return;
                }
                return;
            case 3:
                boolean z10 = ChatAttachAlertPhotoLayout.f32798r1;
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    s5Var.f31796y.e(s5Var);
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
