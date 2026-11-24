package defpackage;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class l5 implements c39 {
    public final byte a;

    public l5(byte b) {
        this.a = b;
    }

    @Override
    public final void d(int i, View view) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                if (view instanceof j20) {
                    ((j20) view).a();
                    return;
                }
                return;
            default:
                boolean z = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof o48) {
                    o48 o48Var = (o48) view;
                    o48Var.y.c(o48Var);
                    return;
                }
                return;
        }
    }

    private final void a(int i, View view) {
    }
}
