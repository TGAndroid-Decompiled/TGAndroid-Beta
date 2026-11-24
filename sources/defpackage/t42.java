package defpackage;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;
public final class t42 extends a52 {
    public final boolean b;
    public final ChatAttachAlertPhotoLayout c;

    public t42(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z) {
        super(chatAttachAlertPhotoLayout);
        this.c = chatAttachAlertPhotoLayout;
        this.b = z;
    }

    @Override
    public final void C() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        chatAttachAlertPhotoLayout.p0();
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.t1.size());
    }

    @Override
    public final void F() {
        s42 s42Var = this.c.F;
        int childCount = s42Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = s42Var.getChildAt(i);
            if (childAt instanceof o48) {
                o48 o48Var = (o48) childAt;
                o48Var.a.getImageReceiver().v0(true, true);
                o48Var.g(true);
            }
        }
    }

    @Override
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (!chatAttachAlertPhotoLayout.b.P1) {
            int i = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.b || i == 1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        x02 x02Var = this.c.b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.s1;
        if (!arrayList.isEmpty() && !x02Var.P1) {
            if (oacVar != null && i >= 0 && i < arrayList.size()) {
                ((jm6) arrayList.get(i)).s = oacVar;
            }
            d dVar = x02Var.Z1;
            if (!(dVar instanceof mu1) || !((mu1) dVar).y()) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    jm6 jm6Var = (jm6) ChatAttachAlertPhotoLayout.s1.get(i4);
                    if (jm6Var.x <= 0) {
                        gl.e(jm6Var.I);
                    }
                }
            }
            x02Var.E0();
            PhotoViewer.r0();
            PhotoViewer.r0().P = false;
            PhotoViewer.r0().v2 = false;
            ij.X(x02Var.G3, x02Var.V0(), x02Var.R0() + ChatAttachAlertPhotoLayout.t1.size(), new n42(this, z2, z, i2));
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void e() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        this.c.n0();
    }

    @Override
    public final boolean h() {
        if (this.c.b.P3 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void j() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
    }

    @Override
    public final jl5 k(int i) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        TextView textView = chatAttachAlertPhotoLayout.q0;
        chatAttachAlertPhotoLayout.u0 = false;
        if (ChatAttachAlertPhotoLayout.r1) {
            x02 x02Var = chatAttachAlertPhotoLayout.b;
            x02Var.W3.B1(0, true, true, 0, 0, 0L, x02Var.a1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.c0) {
            chatAttachAlertPhotoLayout.k0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.B0(false);
    }

    @Override
    public final boolean t() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (chatAttachAlertPhotoLayout.c0 && chatAttachAlertPhotoLayout.Q != null) {
            gl.d3(new hq1(this, (byte) 17), 1000L);
            chatAttachAlertPhotoLayout.m0.b(false, 0.0f);
            chatAttachAlertPhotoLayout.C0 = 0.0f;
            chatAttachAlertPhotoLayout.Q.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.Q.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.u0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.s1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    jm6 jm6Var = (jm6) ChatAttachAlertPhotoLayout.s1.get(i);
                    new File(jm6Var.I).delete();
                    if (jm6Var.h != null) {
                        new File(jm6Var.h).delete();
                    }
                    if (jm6Var.c != null) {
                        new File(jm6Var.c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.s1.clear();
                ChatAttachAlertPhotoLayout.u1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                chatAttachAlertPhotoLayout.q0.setVisibility(4);
                chatAttachAlertPhotoLayout.r.setVisibility(8);
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.w.f();
                chatAttachAlertPhotoLayout.b.F1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean y() {
        x02 x02Var = this.c.b;
        if (!x02Var.z1 && !x02Var.B1) {
            return true;
        }
        return false;
    }
}
