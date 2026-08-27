package gh;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.pk0;

public final class a implements pk0 {

    public final int f7125a;

    public a(int i10) {
        this.f7125a = i10;
    }

    @Override
    public final void a(int i10, View view) {
        switch (this.f7125a) {
            case 0:
                int i11 = d.W;
                break;
            case 1:
                int i12 = v.f7564w0;
                break;
            case 2:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                }
                break;
            case 3:
                boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    q5Var.f25061w.d(q5Var);
                }
                break;
        }
    }

    private final void b(int i10, View view) {
    }
}
