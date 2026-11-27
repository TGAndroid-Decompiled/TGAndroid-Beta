package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.Looper;
import java.io.File;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.OpusDred;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class pg6 implements Runnable {
    public final byte a;

    public pg6(vn8 vn8Var, Long l) {
        this.a = (byte) 15;
    }

    @Override
    public final void run() {
        d31 b0;
        e Q;
        switch (this.a) {
            case 0:
                CallReceiver.a();
                return;
            case 1:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 2:
                MediaController.Z1 = null;
                MediaController.R(0);
                return;
            case 3:
                try {
                    mka.n(a.b);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 4:
                aob.E(false);
                return;
            case 5:
                jn7.e().k(316, new Object[0]);
                return;
            case 6:
                d31.Y().N(ob6.M0(2131745589, null), ob6.M0(2131751070, null)).j();
                return;
            case 7:
                d31.Y().N(ob6.M0(2131745589, null), ob6.M0(2131751070, null)).j();
                return;
            case 8:
                jn7.e().k(258, new Object[0]);
                return;
            case 9:
                v21 t = vs7.h().t(ob6.M0(2131749522, null), null);
                t.u = true;
                t.j();
                return;
            case 10:
                OpusDred.downloadEnded();
                return;
            case 11:
                xv7.c();
                return;
            case 12:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    return;
                }
                return;
            case 13:
                return;
            case 14:
                Drawable[] drawableArr = PhotoViewer.d9;
                return;
            case 15:
                throw null;
            case 16:
                throw null;
            case 17:
                d31.Y().N(ob6.M0(2131745589, null), ob6.M0(2131751070, null)).j();
                return;
            case 18:
                bx4.g1(false, null);
                return;
            case 19:
                e S = LaunchActivity.S();
                if (S != null && (b0 = d31.b0(S)) != null) {
                    v21 I = b0.I(2131624092, ob6.M0(2131745949, null), ob6.M0(2131745912, null));
                    I.j = 5000;
                    I.j();
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                ir9.m();
                return;
            case 22:
                jn7.e().k(176, new Object[0]);
                return;
            case 23:
                return;
            case 24:
                e Q2 = LaunchActivity.Q();
                if (Q2 != 0) {
                    ?? obj = new Object();
                    obj.a = true;
                    Q2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 25:
                xea.x();
                return;
            case 26:
                try {
                    File file = new File(Environment.getExternalStorageDirectory(), "Telegram");
                    File file2 = new File(file, "Telegram Images");
                    file2.mkdir();
                    File file3 = new File(file, "Telegram Video");
                    file3.mkdir();
                    if (!f11.b) {
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
                        hl.G(new File(file2, ".nomedia"));
                    }
                    if (file3.isDirectory()) {
                        hl.G(new File(file3, ".nomedia"));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    cc4.g(th, true);
                    return;
                }
            case 27:
                if (!xea.a && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
                    xea.e0 = null;
                    xea.x();
                    in5.z().e(new kc((byte) 10));
                    xea.a = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(Q.getParentActivity());
                    alertDialog$Builder.a.S = ob6.M0(2131745566, null);
                    alertDialog$Builder.a.T = ob6.M0(2131745565, null);
                    alertDialog$Builder.j(ob6.M0(2131751320, null), new vr9((byte) 16));
                    id idVar = alertDialog$Builder.a;
                    idVar.setCanceledOnTouchOutside(false);
                    idVar.show();
                    return;
                }
                return;
            case 28:
                return;
            default:
                e S2 = LaunchActivity.S();
                if (S2 != null) {
                    uqc uqcVar = new uqc();
                    ltc ltcVar = uqcVar.j0;
                    if (ltcVar != null) {
                        ltcVar.b(false);
                    }
                    if (!uqcVar.g0) {
                        uqcVar.I0 = true;
                    } else {
                        uqcVar.I0 = false;
                        uqcVar.f0 = 1;
                        ir1 ir1Var = uqcVar.s0;
                        if (ir1Var != null) {
                            ir1Var.setPosition(1);
                        }
                    }
                    S2.presentFragment(uqcVar);
                    return;
                }
                return;
        }
    }

    public pg6(byte b) {
        this.a = b;
    }

    public pg6(Object obj, byte b) {
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
