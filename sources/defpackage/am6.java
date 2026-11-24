package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.Looper;
import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class am6 implements Runnable {
    public final byte a;

    public am6(gk8 gk8Var, Long l) {
        this.a = (byte) 12;
    }

    @Override
    public final void run() {
        u21 b0;
        d Q;
        u21 Y;
        d b02;
        switch (this.a) {
            case 0:
                MediaController.Z1 = null;
                MediaController.N(0);
                return;
            case 1:
                try {
                    tga.n(a.b);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 2:
                bkb.E(false);
                return;
            case 3:
                kk7.e().k(315, new Object[0]);
                return;
            case 4:
                u21.Y().N(k96.M0(2131745669, null), k96.M0(2131751093, null)).j();
                return;
            case 5:
                u21.Y().N(k96.M0(2131745669, null), k96.M0(2131751093, null)).j();
                return;
            case 6:
                kk7.e().k(257, new Object[0]);
                return;
            case 7:
                m21 t = vp7.h().t(k96.M0(2131749561, null), null);
                t.t = true;
                t.j();
                return;
            case 8:
                qs7.c();
                return;
            case 9:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 10:
                return;
            case 11:
                Drawable[] drawableArr = PhotoViewer.d9;
                return;
            case 12:
                throw null;
            case 13:
                throw null;
            case 14:
                u21.Y().N(k96.M0(2131745669, null), k96.M0(2131751093, null)).j();
                return;
            case 15:
                xu4.f1(false, null);
                return;
            case 16:
                d S = LaunchActivity.S();
                if (S != null && (b0 = u21.b0(S)) != null) {
                    m21 I = b0.I(2131624092, k96.M0(2131746029, null), k96.M0(2131745992, null));
                    I.j = 5000;
                    I.j();
                    return;
                }
                return;
            case 17:
                return;
            case 18:
                sn9.i();
                return;
            case 19:
                kk7.e().k(175, new Object[0]);
                return;
            case 20:
                return;
            case 21:
                d Q2 = LaunchActivity.Q();
                if (Q2 != 0) {
                    ?? obj = new Object();
                    obj.a = true;
                    Q2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 22:
                gba.x();
                return;
            case 23:
                try {
                    File file = new File(Environment.getExternalStorageDirectory(), "Telegram");
                    File file2 = new File(file, "Telegram Images");
                    file2.mkdir();
                    File file3 = new File(file, "Telegram Video");
                    file3.mkdir();
                    if (!w01.b) {
                        if (file2.isDirectory()) {
                            new File(file2, ".nomedia").delete();
                        }
                        if (file3.isDirectory()) {
                            new File(file3, ".nomedia").delete();
                            return;
                        }
                        return;
                    }
                    if (file2.isDirectory()) {
                        gl.G(new File(file2, ".nomedia"));
                    }
                    if (file3.isDirectory()) {
                        gl.G(new File(file3, ".nomedia"));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    fa4.g(th, true);
                    return;
                }
            case 24:
                if (!gba.a && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
                    gba.e0 = null;
                    gba.x();
                    fl5.z().e(new jc((byte) 10));
                    gba.a = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(Q.getParentActivity());
                    alertDialog$Builder.a.S = k96.M0(2131745646, null);
                    alertDialog$Builder.a.T = k96.M0(2131745645, null);
                    alertDialog$Builder.j(k96.M0(2131751343, null), new ho9((byte) 13));
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.setCanceledOnTouchOutside(false);
                    hdVar.show();
                    return;
                }
                return;
            case 25:
                return;
            case 26:
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    hmc hmcVar = new hmc();
                    zoc zocVar = hmcVar.j0;
                    if (zocVar != null) {
                        zocVar.b(false);
                    }
                    if (!hmcVar.g0) {
                        hmcVar.I0 = true;
                    } else {
                        hmcVar.I0 = false;
                        hmcVar.f0 = 1;
                        vq1 vq1Var = hmcVar.s0;
                        if (vq1Var != null) {
                            vq1Var.setPosition(1);
                        }
                    }
                    S2.presentFragment(hmcVar);
                    return;
                }
                return;
            case 27:
                d S3 = LaunchActivity.S();
                if ((S3 instanceof jec) && (b02 = ((jec) S3).b0()) != null) {
                    S3 = b02;
                }
                if (S3 != null) {
                    Y = u21.b0(S3);
                } else {
                    Y = u21.Y();
                }
                m21 Q3 = Y.Q(2131624052, 36, k96.M0(2131750200, null));
                Q3.t = true;
                Q3.j();
                return;
            case 28:
                pw0.APP_ERROR.a();
                return;
            default:
                d S4 = LaunchActivity.S();
                if (S4 != null) {
                    S4.presentFragment(new jva());
                    return;
                }
                return;
        }
    }

    public am6(byte b) {
        this.a = b;
    }

    public am6(Object obj, byte b) {
        this.a = b;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
