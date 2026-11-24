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
public final class bo6 implements Runnable {
    public final byte a;

    public bo6(km8 km8Var, Long l) {
        this.a = (byte) 12;
    }

    @Override
    public final void run() {
        c41 b0;
        d Q;
        c41 Y;
        d b02;
        switch (this.a) {
            case 0:
                MediaController.Z1 = null;
                MediaController.N(0);
                return;
            case 1:
                try {
                    via.n(a.b);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 2:
                cmb.E(false);
                return;
            case 3:
                nm7.e().k(317, new Object[0]);
                return;
            case 4:
                c41.Y().N(jb6.M0(2131745595, null), jb6.M0(2131751042, null)).j();
                return;
            case 5:
                c41.Y().N(jb6.M0(2131745595, null), jb6.M0(2131751042, null)).j();
                return;
            case 6:
                nm7.e().k(259, new Object[0]);
                return;
            case 7:
                u31 t = yr7.h().t(jb6.M0(2131749510, null), null);
                t.u = true;
                t.j();
                return;
            case 8:
                ru7.c();
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
                c41.Y().N(jb6.M0(2131745595, null), jb6.M0(2131751042, null)).j();
                return;
            case 15:
                yw4.f1(false, null);
                return;
            case 16:
                d S = LaunchActivity.S();
                if (S != null && (b0 = c41.b0(S)) != null) {
                    u31 I = b0.I(2131624092, jb6.M0(2131745955, null), jb6.M0(2131745918, null));
                    I.j = 5000;
                    I.j();
                    return;
                }
                return;
            case 17:
                return;
            case 18:
                tp9.m();
                return;
            case 19:
                nm7.e().k(176, new Object[0]);
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
                gda.x();
                return;
            case 23:
                try {
                    File file = new File(Environment.getExternalStorageDirectory(), "Telegram");
                    File file2 = new File(file, "Telegram Images");
                    file2.mkdir();
                    File file3 = new File(file, "Telegram Video");
                    file3.mkdir();
                    if (!e21.b) {
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
                        gm.G(new File(file2, ".nomedia"));
                    }
                    if (file3.isDirectory()) {
                        gm.G(new File(file3, ".nomedia"));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    fc4.g(th, true);
                    return;
                }
            case 24:
                if (!gda.a && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
                    gda.e0 = null;
                    gda.x();
                    fn5.z().e(new jd((byte) 10));
                    gda.a = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(Q.getParentActivity());
                    alertDialog$Builder.a.S = jb6.M0(2131745572, null);
                    alertDialog$Builder.a.T = jb6.M0(2131745571, null);
                    alertDialog$Builder.j(jb6.M0(2131751292, null), new dq9((byte) 14));
                    he heVar = alertDialog$Builder.a;
                    heVar.setCanceledOnTouchOutside(false);
                    heVar.show();
                    return;
                }
                return;
            case 25:
                return;
            case 26:
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    goc gocVar = new goc();
                    brc brcVar = gocVar.j0;
                    if (brcVar != null) {
                        brcVar.b(false);
                    }
                    if (!gocVar.g0) {
                        gocVar.I0 = true;
                    } else {
                        gocVar.I0 = false;
                        gocVar.f0 = 1;
                        hs1 hs1Var = gocVar.s0;
                        if (hs1Var != null) {
                            hs1Var.setPosition(1);
                        }
                    }
                    S2.presentFragment(gocVar);
                    return;
                }
                return;
            case 27:
                d S3 = LaunchActivity.S();
                if ((S3 instanceof jgc) && (b02 = ((jgc) S3).b0()) != null) {
                    S3 = b02;
                }
                if (S3 != null) {
                    Y = c41.b0(S3);
                } else {
                    Y = c41.Y();
                }
                u31 Q3 = Y.Q(2131624052, 36, jb6.M0(2131750149, null));
                Q3.u = true;
                Q3.j();
                return;
            case 28:
                xx0.APP_ERROR.a();
                return;
            default:
                d S4 = LaunchActivity.S();
                if (S4 != null) {
                    S4.presentFragment(new nxa());
                    return;
                }
                return;
        }
    }

    public bo6(byte b) {
        this.a = b;
    }

    public bo6(Object obj, byte b) {
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
