package defpackage;

import java.util.HashMap;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;
public final class n42 implements p8c {
    public final byte a = 1;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final a52 e;

    public n42(t42 t42Var, boolean z, boolean z2, int i) {
        this.e = t42Var;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    @Override
    public final void a(Object obj) {
        int i;
        byte b = this.a;
        a52 a52Var = this.e;
        switch (b) {
            case 0:
                Long l = (Long) obj;
                x02 x02Var = ((v42) a52Var).b.b;
                if (x02Var != null) {
                    x02Var.F3 = true;
                }
                x02Var.W3.B1(7, true, this.b, this.d, 0, 0L, x02Var.a1(), this.c, l.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.s1.clear();
                ChatAttachAlertPhotoLayout.u1.clear();
                hashMap.clear();
                PhotoViewer.r0();
                PhotoViewer.r0().B(PhotoViewer.r0().Q, false);
                PhotoViewer.r0().v2 = true;
                return;
            default:
                Long l2 = (Long) obj;
                PhotoViewer.r0();
                PhotoViewer.r0().P = false;
                PhotoViewer.r0().v2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((t42) a52Var).c;
                x02 x02Var2 = chatAttachAlertPhotoLayout.b;
                x02Var2.s4 = true;
                x02Var2.F3 = true;
                chatAttachAlertPhotoLayout.b0(false);
                v02 v02Var = x02Var2.W3;
                boolean z = this.b;
                if (z) {
                    i = 4;
                } else {
                    i = 8;
                }
                v02Var.B1(i, true, this.c, this.d, 0, 0L, x02Var2.a1(), z, l2.longValue());
                ChatAttachAlertPhotoLayout.s1.clear();
                ChatAttachAlertPhotoLayout.u1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.w.f();
                x02Var2.a(true);
                PhotoViewer.r0();
                PhotoViewer.r0().B(PhotoViewer.r0().Q, false);
                PhotoViewer.r0().v2 = true;
                return;
        }
    }

    public n42(v42 v42Var, boolean z, int i, boolean z2) {
        this.e = v42Var;
        this.b = z;
        this.d = i;
        this.c = z2;
    }
}
