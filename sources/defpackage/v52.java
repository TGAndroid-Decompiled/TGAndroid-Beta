package defpackage;

import android.text.Editable;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;
public final class v52 implements Runnable {
    public final byte a = 0;
    public final int b;
    public final byte c;
    public final Object d;
    public final Object e;
    public final Serializable f;
    public final Object h;

    public v52(pm5 pm5Var, File file, String str, int i, Object obj, int i2) {
        this.d = pm5Var;
        this.e = file;
        this.f = str;
        this.b = i;
        this.h = obj;
        this.c = i2;
    }

    @Override
    public final void run() {
        byte b;
        yv1 yv1Var;
        boolean z;
        kc4 E;
        int i;
        byte b2 = this.a;
        k47 k47Var = null;
        Object obj = this.h;
        Serializable serializable = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b2) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                d dVar = (d) obj2;
                ArrayList arrayList = (ArrayList) serializable;
                yv1 yv1Var2 = (yv1) obj;
                boolean z2 = ChatAttachAlertPhotoLayout.r1;
                i22 i22Var = chatAttachAlertPhotoLayout.b;
                if (i22Var.z1 && !i22Var.A1) {
                    PhotoViewer.r0().T1(null, dVar, null);
                    PhotoViewer r0 = PhotoViewer.r0();
                    r0.h = 0;
                    r0.n = false;
                    b = 3;
                } else {
                    b = this.c;
                }
                if (i22Var.B1) {
                    b = 13;
                }
                byte b3 = b;
                PhotoViewer r02 = PhotoViewer.r0();
                g62 g62Var = chatAttachAlertPhotoLayout.i1;
                if (i22Var.B1) {
                    yv1Var = null;
                } else {
                    yv1Var = yv1Var2;
                }
                r02.o1(arrayList, this.b, b3, false, g62Var, yv1Var);
                PhotoViewer.r0().G1(i22Var.K1);
                if (i22Var.z1 && !i22Var.A1) {
                    PhotoViewer.r0().P = false;
                } else if (i22Var.N2 != 0) {
                    PhotoViewer.r0().P = true;
                    PhotoViewer r03 = PhotoViewer.r0();
                    if (i22Var.O2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    r03.Q = z;
                }
                if (i22Var.A1) {
                    PhotoViewer.r0().U(null, null, false, i22Var.D1);
                }
                if (ChatAttachAlertPhotoLayout.T()) {
                    PhotoViewer r04 = PhotoViewer.r0();
                    Editable text = i22Var.U0().getText();
                    r04.u7 = true;
                    r04.v7 = text;
                    r04.J1(null, text, false, false);
                    r04.E2(null);
                    return;
                }
                return;
            default:
                pm5 pm5Var = (pm5) obj3;
                File file = (File) obj2;
                String str = (String) serializable;
                pm5Var.getClass();
                int i2 = this.b;
                if (file != null && ((str.endsWith(".mp4") || str.endsWith(".jpg")) && (E = bc4.E(obj)) != null)) {
                    if (obj instanceof k47) {
                        k47Var = (k47) obj;
                    }
                    long j = E.a;
                    if (j >= 0) {
                        i = 1;
                    } else if (sd2.V(oc7.r1(i2).L0(Long.valueOf(-j)))) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    if (pve.d(i, E, k47Var, i2)) {
                        gm.e(file.toString());
                    }
                }
                nm7.f(i2).k(143, str, file);
                fn5 fn5Var = pm5Var.b;
                fn5Var.s.c(new sv2(fn5Var, str, this.c, file, (byte) 1));
                return;
        }
    }

    public v52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i, d dVar, ArrayList arrayList, int i2, yv1 yv1Var) {
        this.d = chatAttachAlertPhotoLayout;
        this.c = i;
        this.e = dVar;
        this.f = arrayList;
        this.b = i2;
        this.h = yv1Var;
    }
}
