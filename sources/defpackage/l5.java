package defpackage;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class l5 implements f59 {
    public final byte a;

    public l5(byte b) {
        this.a = b;
    }

    @Override
    public final void g(int i, View view) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                if (view instanceof j30) {
                    ((j30) view).a();
                    return;
                }
                return;
            default:
                boolean z = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof q68) {
                    q68 q68Var = (q68) view;
                    q68Var.y.c(q68Var);
                    return;
                }
                return;
        }
    }

    private final void a(int i, View view) {
    }
}
