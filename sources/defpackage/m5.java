package defpackage;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class m5 implements r69 {
    public final byte a;

    public m5(byte b) {
        this.a = b;
    }

    @Override
    public final void e(int i, View view) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                if (view instanceof k20) {
                    ((k20) view).a();
                    return;
                }
                return;
            default:
                boolean z = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof d88) {
                    d88 d88Var = (d88) view;
                    d88Var.y.c(d88Var);
                    return;
                }
                return;
        }
    }

    private final void a(int i, View view) {
    }
}
