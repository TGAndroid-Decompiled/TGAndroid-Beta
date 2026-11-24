package defpackage;

import java.util.HashMap;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;
public final class y52 implements qac {
    public final byte a = 1;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final l62 e;

    public y52(e62 e62Var, boolean z, boolean z2, int i) {
        this.e = e62Var;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    @Override
    public final void a(Object obj) {
        int i;
        byte b = this.a;
        l62 l62Var = this.e;
        switch (b) {
            case 0:
                Long l = (Long) obj;
                i22 i22Var = ((g62) l62Var).b.b;
                if (i22Var != null) {
                    i22Var.F3 = true;
                }
                i22Var.W3.E0(7, true, this.b, this.d, 0, 0L, i22Var.a1(), this.c, l.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.s1.clear();
                ChatAttachAlertPhotoLayout.u1.clear();
                hashMap.clear();
                PhotoViewer.r0();
                PhotoViewer.r0().A(PhotoViewer.r0().Q, false);
                PhotoViewer.r0().v2 = true;
                return;
            default:
                Long l2 = (Long) obj;
                PhotoViewer.r0();
                PhotoViewer.r0().P = false;
                PhotoViewer.r0().v2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((e62) l62Var).c;
                i22 i22Var2 = chatAttachAlertPhotoLayout.b;
                i22Var2.s4 = true;
                i22Var2.F3 = true;
                chatAttachAlertPhotoLayout.b0(false);
                g22 g22Var = i22Var2.W3;
                boolean z = this.b;
                if (z) {
                    i = 4;
                } else {
                    i = 8;
                }
                g22Var.E0(i, true, this.c, this.d, 0, 0L, i22Var2.a1(), z, l2.longValue());
                ChatAttachAlertPhotoLayout.s1.clear();
                ChatAttachAlertPhotoLayout.u1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.w.f();
                i22Var2.a(true);
                PhotoViewer.r0();
                PhotoViewer.r0().A(PhotoViewer.r0().Q, false);
                PhotoViewer.r0().v2 = true;
                return;
        }
    }

    public y52(g62 g62Var, boolean z, int i, boolean z2) {
        this.e = g62Var;
        this.b = z;
        this.d = i;
        this.c = z2;
    }
}
