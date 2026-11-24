package defpackage;

import android.text.Editable;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;
public final class k42 implements Runnable {
    public final byte a = 0;
    public final int b;
    public final byte c;
    public final Object d;
    public final Object e;
    public final Serializable f;
    public final Object h;

    public k42(pk5 pk5Var, File file, String str, int i, Object obj, int i2) {
        this.d = pk5Var;
        this.e = file;
        this.f = str;
        this.b = i;
        this.h = obj;
        this.c = i2;
    }

    @Override
    public final void run() {
        byte b;
        mu1 mu1Var;
        boolean z;
        ka4 E;
        int i;
        byte b2 = this.a;
        k27 k27Var = null;
        Object obj = this.h;
        Serializable serializable = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b2) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                d dVar = (d) obj2;
                ArrayList arrayList = (ArrayList) serializable;
                mu1 mu1Var2 = (mu1) obj;
                boolean z2 = ChatAttachAlertPhotoLayout.r1;
                x02 x02Var = chatAttachAlertPhotoLayout.b;
                if (x02Var.z1 && !x02Var.A1) {
                    PhotoViewer.r0().S1(null, dVar, null);
                    PhotoViewer r0 = PhotoViewer.r0();
                    r0.h = 0;
                    r0.n = false;
                    b = 3;
                } else {
                    b = this.c;
                }
                if (x02Var.B1) {
                    b = 13;
                }
                byte b3 = b;
                PhotoViewer r02 = PhotoViewer.r0();
                v42 v42Var = chatAttachAlertPhotoLayout.i1;
                if (x02Var.B1) {
                    mu1Var = null;
                } else {
                    mu1Var = mu1Var2;
                }
                r02.n1(arrayList, this.b, b3, false, v42Var, mu1Var);
                PhotoViewer.r0().F1(x02Var.K1);
                if (x02Var.z1 && !x02Var.A1) {
                    PhotoViewer.r0().P = false;
                } else if (x02Var.N2 != 0) {
                    PhotoViewer.r0().P = true;
                    PhotoViewer r03 = PhotoViewer.r0();
                    if (x02Var.O2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    r03.Q = z;
                }
                if (x02Var.A1) {
                    PhotoViewer.r0().V(null, null, false, x02Var.D1);
                }
                if (ChatAttachAlertPhotoLayout.U()) {
                    PhotoViewer r04 = PhotoViewer.r0();
                    Editable text = x02Var.U0().getText();
                    r04.v7 = true;
                    r04.w7 = text;
                    r04.I1(null, text, false, false);
                    r04.D2(null);
                    return;
                }
                return;
            default:
                pk5 pk5Var = (pk5) obj3;
                File file = (File) obj2;
                String str = (String) serializable;
                pk5Var.getClass();
                int i2 = this.b;
                if (file != null && ((str.endsWith(".mp4") || str.endsWith(".jpg")) && (E = ba4.E(obj)) != null)) {
                    if (obj instanceof k27) {
                        k27Var = (k27) obj;
                    }
                    long j = E.a;
                    if (j >= 0) {
                        i = 1;
                    } else if (hc2.V(na7.q1(i2).K0(Long.valueOf(-j)))) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    if (mte.d(i, E, k27Var, i2)) {
                        gl.e(file.toString());
                    }
                }
                kk7.f(i2).k(142, str, file);
                fl5 fl5Var = pk5Var.b;
                fl5Var.s.c(new hu2(fl5Var, str, this.c, file, (byte) 1));
                return;
        }
    }

    public k42(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i, d dVar, ArrayList arrayList, int i2, mu1 mu1Var) {
        this.d = chatAttachAlertPhotoLayout;
        this.c = i;
        this.e = dVar;
        this.f = arrayList;
        this.b = i2;
        this.h = mu1Var;
    }
}
