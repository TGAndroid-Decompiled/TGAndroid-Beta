package defpackage;

import android.text.Editable;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;
public final class a52 implements Runnable {
    public final byte a = 0;
    public final int b;
    public final byte c;
    public final Object d;
    public final Object e;
    public final Serializable f;
    public final Object h;

    public a52(sm5 sm5Var, File file, String str, int i, Object obj, int i2) {
        this.d = sm5Var;
        this.e = file;
        this.f = str;
        this.b = i;
        this.h = obj;
        this.c = i2;
    }

    @Override
    public final void run() {
        byte b;
        zu1 zu1Var;
        boolean z;
        hc4 E;
        int i;
        byte b2 = this.a;
        r47 r47Var = null;
        Object obj = this.h;
        Serializable serializable = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b2) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                e eVar = (e) obj2;
                ArrayList arrayList = (ArrayList) serializable;
                zu1 zu1Var2 = (zu1) obj;
                boolean z2 = ChatAttachAlertPhotoLayout.r1;
                n12 n12Var = chatAttachAlertPhotoLayout.b;
                if (n12Var.z1 && !n12Var.A1) {
                    PhotoViewer.q0().T1(null, eVar, null);
                    PhotoViewer q0 = PhotoViewer.q0();
                    q0.h = 0;
                    q0.n = false;
                    b = 3;
                } else {
                    b = this.c;
                }
                if (n12Var.B1) {
                    b = 13;
                }
                byte b3 = b;
                PhotoViewer q02 = PhotoViewer.q0();
                l52 l52Var = chatAttachAlertPhotoLayout.i1;
                if (n12Var.B1) {
                    zu1Var = null;
                } else {
                    zu1Var = zu1Var2;
                }
                q02.o1(arrayList, this.b, b3, false, l52Var, zu1Var);
                PhotoViewer.q0().G1(n12Var.K1);
                if (n12Var.z1 && !n12Var.A1) {
                    PhotoViewer.q0().P = false;
                } else if (n12Var.N2 != 0) {
                    PhotoViewer.q0().P = true;
                    PhotoViewer q03 = PhotoViewer.q0();
                    if (n12Var.O2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    q03.Q = z;
                }
                if (n12Var.A1) {
                    PhotoViewer.q0().U(null, null, false, n12Var.D1);
                }
                if (ChatAttachAlertPhotoLayout.T()) {
                    PhotoViewer q04 = PhotoViewer.q0();
                    Editable text = n12Var.V0().getText();
                    q04.u7 = true;
                    q04.v7 = text;
                    q04.J1(null, text, false, false);
                    q04.E2(null);
                    return;
                }
                return;
            default:
                sm5 sm5Var = (sm5) obj3;
                File file = (File) obj2;
                String str = (String) serializable;
                sm5Var.getClass();
                int i2 = this.b;
                if (file != null && ((str.endsWith(".mp4") || str.endsWith(".jpg")) && (E = xb4.E(obj)) != null)) {
                    if (obj instanceof r47) {
                        r47Var = (r47) obj;
                    }
                    long j = E.a;
                    if (j >= 0) {
                        i = 1;
                    } else if (xc2.V(uc7.s1(i2).M0(Long.valueOf(-j)))) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    if (eye.d(i, E, r47Var, i2)) {
                        hl.e(file.toString());
                    }
                }
                jn7.f(i2).k(143, str, file);
                in5 in5Var = sm5Var.b;
                in5Var.s.c(new av2(in5Var, str, this.c, file, (byte) 1));
                return;
        }
    }

    public a52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i, e eVar, ArrayList arrayList, int i2, zu1 zu1Var) {
        this.d = chatAttachAlertPhotoLayout;
        this.c = i;
        this.e = eVar;
        this.f = arrayList;
        this.b = i2;
        this.h = zu1Var;
    }
}
