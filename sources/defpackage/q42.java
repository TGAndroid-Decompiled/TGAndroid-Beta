package defpackage;

import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
public final class q42 implements xga {
    public File a;
    public boolean b;
    public final wjb c;
    public final ww0 d;
    public final ChatAttachAlertPhotoLayout e;

    public q42(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, wjb wjbVar, ww0 ww0Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = wjbVar;
        this.d = ww0Var;
    }

    public final void a() {
        b52 b52Var;
        boolean z;
        boolean z2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
        if (!chatAttachAlertPhotoLayout.t0 && (b52Var = chatAttachAlertPhotoLayout.Q) != null && b52Var.getCameraSession() != null) {
            if (shutterButton.getState() == yga.b) {
                chatAttachAlertPhotoLayout.o0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
                shutterButton.a(yga.a);
            } else if (!chatAttachAlertPhotoLayout.y0) {
                yjb.x(null, 2131749367, new u21(chatAttachAlertPhotoLayout.Q, this.c), null);
            } else {
                d dVar = x02Var.Z1;
                if ((dVar instanceof mu1) && ((mu1) dVar).y()) {
                    z = true;
                } else {
                    z = false;
                }
                File q0 = gl.q0(null, z);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.Q.getCameraSession();
                if (!(x02Var.Z1 instanceof mu1) && x02Var.N2 != 2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                cameraSession.setFlipFront(z2);
                chatAttachAlertPhotoLayout.t0 = CameraController.getInstance().takePicture(q0, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new o42(this, q0, isSameTakePictureOrientation, (byte) 0));
                chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
            }
        }
    }
}
