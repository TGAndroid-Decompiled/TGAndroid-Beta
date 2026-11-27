package defpackage;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;
public final class j52 extends q52 {
    public final boolean b;
    public final ChatAttachAlertPhotoLayout c;

    public j52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z) {
        super(chatAttachAlertPhotoLayout);
        this.c = chatAttachAlertPhotoLayout;
        this.b = z;
    }

    @Override
    public final void C() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        chatAttachAlertPhotoLayout.o0();
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.t1.size());
    }

    @Override
    public final void F() {
        i52 i52Var = this.c.F;
        int childCount = i52Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = i52Var.getChildAt(i);
            if (childAt instanceof d88) {
                d88 d88Var = (d88) childAt;
                d88Var.a.getImageReceiver().v0(true, true);
                d88Var.g(true);
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
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        n12 n12Var = this.c.b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.s1;
        if (!arrayList.isEmpty() && !n12Var.P1) {
            if (oecVar != null && i >= 0 && i < arrayList.size()) {
                ((no6) arrayList.get(i)).s = oecVar;
            }
            e eVar = n12Var.Z1;
            if (!(eVar instanceof zu1) || !((zu1) eVar).y()) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    no6 no6Var = (no6) ChatAttachAlertPhotoLayout.s1.get(i4);
                    if (no6Var.x <= 0) {
                        hl.e(no6Var.I);
                    }
                }
            }
            n12Var.F0();
            PhotoViewer.q0();
            PhotoViewer.q0().P = false;
            PhotoViewer.q0().v2 = false;
            jj.X(n12Var.G3, n12Var.W0(), n12Var.S0() + ChatAttachAlertPhotoLayout.t1.size(), new d52(this, z2, z, i2));
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void e() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        this.c.m0();
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
    public final mn5 k(int i) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        TextView textView = chatAttachAlertPhotoLayout.q0;
        chatAttachAlertPhotoLayout.u0 = false;
        if (ChatAttachAlertPhotoLayout.r1) {
            n12 n12Var = chatAttachAlertPhotoLayout.b;
            n12Var.W3.z0(0, true, true, 0, 0, 0L, n12Var.b1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.c0) {
            chatAttachAlertPhotoLayout.j0(false);
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
            hl.d3(new go1(this, (byte) 23), 1000L);
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
                    no6 no6Var = (no6) ChatAttachAlertPhotoLayout.s1.get(i);
                    new File(no6Var.I).delete();
                    if (no6Var.h != null) {
                        new File(no6Var.h).delete();
                    }
                    if (no6Var.c != null) {
                        new File(no6Var.c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.s1.clear();
                ChatAttachAlertPhotoLayout.u1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                chatAttachAlertPhotoLayout.q0.setVisibility(4);
                chatAttachAlertPhotoLayout.r.setVisibility(8);
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.w.f();
                chatAttachAlertPhotoLayout.b.G1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean y() {
        n12 n12Var = this.c.b;
        if (!n12Var.z1 && !n12Var.B1) {
            return true;
        }
        return false;
    }
}
