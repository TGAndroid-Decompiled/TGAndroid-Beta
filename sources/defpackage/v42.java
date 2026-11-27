package defpackage;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class v42 implements hj, t69, q3d {
    public final byte a;
    public final ChatAttachAlertPhotoLayout b;

    public v42(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, byte b) {
        this.a = b;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void b(float f) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        r52 r52Var = chatAttachAlertPhotoLayout.Q;
        if (r52Var != null) {
            chatAttachAlertPhotoLayout.C0 = f;
            r52Var.setZoom(f);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }

    @Override
    public final boolean e(int i, View view) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        if (!n12Var.Q2) {
            if (i == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                l12 l12Var = n12Var.W3;
                if (l12Var != null) {
                    l12Var.z0(0, false, true, 0, 0, 0L, n12Var.b1(), false, 0L);
                }
                return true;
            } else if (view instanceof d88) {
                j89 j89Var = chatAttachAlertPhotoLayout.J;
                boolean z2 = !((d88) view).a();
                chatAttachAlertPhotoLayout.L = z2;
                j89Var.d(i, view, z2);
            }
        }
        return false;
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (b) {
            case 0:
                boolean z2 = ChatAttachAlertPhotoLayout.r1;
                n12 n12Var = chatAttachAlertPhotoLayout.b;
                n12Var.F0();
                n12Var.W3.z0(7, false, z, i, 0, 0L, n12Var.b1(), false, 0L);
                return;
            default:
                boolean z3 = ChatAttachAlertPhotoLayout.r1;
                n12 n12Var2 = chatAttachAlertPhotoLayout.b;
                n12Var2.F0();
                n12Var2.W3.z0(4, true, z, i, 0, 0L, n12Var2.b1(), false, 0L);
                return;
        }
    }
}
