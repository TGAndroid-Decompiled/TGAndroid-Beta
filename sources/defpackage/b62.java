package defpackage;

import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
public final class b62 implements zia {
    public File a;
    public boolean b;
    public final ylb c;
    public final dy0 d;
    public final ChatAttachAlertPhotoLayout e;

    public b62(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, ylb ylbVar, dy0 dy0Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = ylbVar;
        this.d = dy0Var;
    }

    public final void a() {
        m62 m62Var;
        boolean z;
        boolean z2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        i22 i22Var = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
        if (!chatAttachAlertPhotoLayout.t0 && (m62Var = chatAttachAlertPhotoLayout.Q) != null && m62Var.getCameraSession() != null) {
            if (shutterButton.getState() == aja.b) {
                chatAttachAlertPhotoLayout.o0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
                shutterButton.a(aja.a);
            } else if (!chatAttachAlertPhotoLayout.y0) {
                mlb.y(null, 2131749316, new c41(chatAttachAlertPhotoLayout.Q, this.c), null);
            } else {
                d dVar = i22Var.Z1;
                if ((dVar instanceof yv1) && ((yv1) dVar).x()) {
                    z = true;
                } else {
                    z = false;
                }
                File q0 = gm.q0(null, z);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.Q.getCameraSession();
                if (!(i22Var.Z1 instanceof yv1) && i22Var.N2 != 2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                cameraSession.setFlipFront(z2);
                chatAttachAlertPhotoLayout.t0 = CameraController.getInstance().takePicture(q0, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new z52(this, q0, isSameTakePictureOrientation, (byte) 0));
                chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
            }
        }
    }
}
