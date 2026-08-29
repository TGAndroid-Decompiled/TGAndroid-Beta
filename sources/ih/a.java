package ih;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.zk0;
public final class a implements zk0 {
    public final int f9012a;

    public a(int i10) {
        this.f9012a = i10;
    }

    @Override
    public final void c(int i10, View view) {
        switch (this.f9012a) {
            case 0:
                int i11 = d.W;
                return;
            case 1:
                int i12 = t.f9377w0;
                return;
            case 2:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    return;
                }
                return;
            case 3:
                boolean z10 = ChatAttachAlertPhotoLayout.f26252m1;
                if (view instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                    r5Var.f25223w.d(r5Var);
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
