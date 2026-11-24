package defpackage;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class f42 implements gj, e39, zyc {
    public final byte a;
    public final ChatAttachAlertPhotoLayout b;

    public f42(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, byte b) {
        this.a = b;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void b(float f) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        b52 b52Var = chatAttachAlertPhotoLayout.Q;
        if (b52Var != null) {
            chatAttachAlertPhotoLayout.C0 = f;
            b52Var.setZoom(f);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }

    @Override
    public final boolean d(int i, View view) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        if (!x02Var.Q2) {
            if (i == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                v02 v02Var = x02Var.W3;
                if (v02Var != null) {
                    v02Var.B1(0, false, true, 0, 0, 0L, x02Var.a1(), false, 0L);
                }
                return true;
            } else if (view instanceof o48) {
                w49 w49Var = chatAttachAlertPhotoLayout.J;
                boolean z2 = !((o48) view).a();
                chatAttachAlertPhotoLayout.L = z2;
                w49Var.d(i, view, z2);
            }
        }
        return false;
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        byte b = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (b) {
            case 0:
                boolean z2 = ChatAttachAlertPhotoLayout.r1;
                x02 x02Var = chatAttachAlertPhotoLayout.b;
                x02Var.E0();
                x02Var.W3.B1(7, false, z, i, 0, 0L, x02Var.a1(), false, 0L);
                return;
            default:
                boolean z3 = ChatAttachAlertPhotoLayout.r1;
                x02 x02Var2 = chatAttachAlertPhotoLayout.b;
                x02Var2.E0();
                x02Var2.W3.B1(4, true, z, i, 0, 0L, x02Var2.a1(), false, 0L);
                return;
        }
    }
}
