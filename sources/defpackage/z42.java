package defpackage;

import android.os.Build;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class z42 implements Runnable {
    public final byte a;
    public final ChatAttachAlertPhotoLayout b;

    public z42(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, byte b) {
        this.a = b;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (b) {
            case 0:
                boolean z = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.b.c.removeView(chatAttachAlertPhotoLayout.Q);
                chatAttachAlertPhotoLayout.Q = null;
                return;
            case 1:
                boolean z2 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.x.setVisibility(8);
                return;
            case 2:
                boolean z3 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.o0 = null;
                return;
            case 3:
                boolean z4 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.o0 = null;
                return;
            case 4:
                boolean z5 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.H.f();
                return;
            case 5:
                boolean z6 = ChatAttachAlertPhotoLayout.r1;
                n12 n12Var = chatAttachAlertPhotoLayout.b;
                if (sr.b(n12Var.Z1.getParentActivity(), "android.permission.CAMERA") != 0) {
                    try {
                        n12Var.Z1.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                chatAttachAlertPhotoLayout.k0();
                return;
            default:
                boolean z7 = ChatAttachAlertPhotoLayout.r1;
                try {
                    int i = Build.VERSION.SDK_INT;
                    n12 n12Var2 = chatAttachAlertPhotoLayout.b;
                    if (i >= 33) {
                        n12Var2.Z1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        n12Var2.Z1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
