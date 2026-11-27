package defpackage;

import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
public final class g52 implements qka {
    public File a;
    public boolean b;
    public final vnb c;
    public final ex0 d;
    public final ChatAttachAlertPhotoLayout e;

    public g52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, vnb vnbVar, ex0 ex0Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = vnbVar;
        this.d = ex0Var;
    }

    public final void a() {
        r52 r52Var;
        boolean z;
        boolean z2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
        if (!chatAttachAlertPhotoLayout.t0 && (r52Var = chatAttachAlertPhotoLayout.Q) != null && r52Var.getCameraSession() != null) {
            if (shutterButton.getState() == rka.b) {
                chatAttachAlertPhotoLayout.n0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
                shutterButton.a(rka.a);
            } else if (!chatAttachAlertPhotoLayout.y0) {
                xnb.x(null, 2131749313, new d31(chatAttachAlertPhotoLayout.Q, this.c), null);
            } else {
                e eVar = n12Var.Z1;
                if ((eVar instanceof zu1) && ((zu1) eVar).y()) {
                    z = true;
                } else {
                    z = false;
                }
                File q0 = hl.q0(null, z);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.Q.getCameraSession();
                if (!(n12Var.Z1 instanceof zu1) && n12Var.N2 != 2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                cameraSession.setFlipFront(z2);
                chatAttachAlertPhotoLayout.t0 = CameraController.getInstance().takePicture(q0, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new e52(this, q0, isSameTakePictureOrientation, (byte) 0));
                chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
            }
        }
    }
}
