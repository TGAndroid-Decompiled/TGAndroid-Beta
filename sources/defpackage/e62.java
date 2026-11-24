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
public final class e62 extends l62 {
    public final boolean b;
    public final ChatAttachAlertPhotoLayout c;

    public e62(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z) {
        super(chatAttachAlertPhotoLayout);
        this.c = chatAttachAlertPhotoLayout;
        this.b = z;
    }

    @Override
    public final void D() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        chatAttachAlertPhotoLayout.p0();
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.t1.size());
    }

    @Override
    public final void G() {
        d62 d62Var = this.c.F;
        int childCount = d62Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = d62Var.getChildAt(i);
            if (childAt instanceof q68) {
                q68 q68Var = (q68) childAt;
                q68Var.a.getImageReceiver().v0(true, true);
                q68Var.g(true);
            }
        }
    }

    @Override
    public final boolean K() {
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
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        i22 i22Var = this.c.b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.s1;
        if (!arrayList.isEmpty() && !i22Var.P1) {
            if (rccVar != null && i >= 0 && i < arrayList.size()) {
                ((jo6) arrayList.get(i)).s = rccVar;
            }
            d dVar = i22Var.Z1;
            if (!(dVar instanceof yv1) || !((yv1) dVar).x()) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    jo6 jo6Var = (jo6) ChatAttachAlertPhotoLayout.s1.get(i4);
                    if (jo6Var.x <= 0) {
                        gm.e(jo6Var.I);
                    }
                }
            }
            i22Var.E0();
            PhotoViewer.r0();
            PhotoViewer.r0().P = false;
            PhotoViewer.r0().v2 = false;
            ik.X(i22Var.G3, i22Var.V0(), i22Var.R0() + ChatAttachAlertPhotoLayout.t1.size(), new y52(this, z2, z, i2));
        }
    }

    @Override
    public final boolean U() {
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
    public final jn5 k(int i) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        TextView textView = chatAttachAlertPhotoLayout.q0;
        chatAttachAlertPhotoLayout.u0 = false;
        if (ChatAttachAlertPhotoLayout.r1) {
            i22 i22Var = chatAttachAlertPhotoLayout.b;
            i22Var.W3.E0(0, true, true, 0, 0, 0L, i22Var.a1(), false, 0L);
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
            gm.d3(new fo1(this, (byte) 22), 1000L);
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
                    jo6 jo6Var = (jo6) ChatAttachAlertPhotoLayout.s1.get(i);
                    new File(jo6Var.I).delete();
                    if (jo6Var.h != null) {
                        new File(jo6Var.h).delete();
                    }
                    if (jo6Var.c != null) {
                        new File(jo6Var.c).delete();
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
        i22 i22Var = this.c.b;
        if (!i22Var.z1 && !i22Var.B1) {
            return true;
        }
        return false;
    }
}
