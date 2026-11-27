package defpackage;

import android.content.DialogInterface;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;
public final class fv0 implements Runnable {
    public final byte a;
    public final Object b;

    public fv0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((xt3) obj).requestFocus();
                return;
            case 1:
                m01.u(((jv0) obj).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 2:
                ((ww0) obj).invalidate();
                return;
            case 3:
                ((pn) obj).e();
                return;
            case 4:
                nx0 nx0Var = (nx0) ((dn) obj).c;
                DialogInterface.OnDismissListener onDismissListener = nx0Var.I0;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(nx0Var);
                }
                try {
                    nx0Var.H();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 5:
                try {
                    ((gx0) obj).b.H();
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 6:
                dy0 dy0Var = (dy0) obj;
                if (dy0Var.mo23d() != null) {
                    dy0Var.mo23d().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 7:
                ((gy0) obj).f();
                return;
            case 8:
                g01 g01Var = (g01) obj;
                g01Var.d.C();
                g01Var.a.quitSafely();
                return;
            case 9:
                v21 v21Var = ((m11) obj).b;
                z11 z11Var = v21Var.e;
                z11Var.transitionRunningEnter = false;
                z11Var.onEnterTransitionEnd();
                if (v21Var.v) {
                    v21Var.i(true);
                    return;
                }
                return;
            case 10:
                hl.g(((TL_account.TL_businessChatLink) obj).link);
                d31.b0(LaunchActivity.Q()).k(false).j();
                return;
            case 11:
                d61 d61Var = (d61) obj;
                d61Var.d.clear();
                d61Var.getMessagesController().i4.h(d61Var.e, d61Var.d);
                d61Var.Y();
                d61Var.finishFragment();
                return;
            case 12:
                n82 n82Var = (n82) obj;
                ArrayList c1 = hl.c1();
                File file = (File) c1.get(0);
                file.getAbsolutePath();
                if (!TextUtils.isEmpty(xea.e0)) {
                    int size = c1.size();
                    for (int i = 0; i < size; i++) {
                        File file2 = (File) c1.get(i);
                        if (file2.getAbsolutePath().startsWith(xea.e0) && file2.canWrite()) {
                            file = file2;
                        }
                    }
                }
                try {
                    StatFs statFs = new StatFs(file.getPath());
                    hl.c3(new zp0(statFs.getBlockCountLong(), statFs.getBlockSizeLong(), statFs.getAvailableBlocksLong(), n82Var));
                    return;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
            case 13:
                ((q61) obj).dismiss();
                return;
            case 14:
                ((i91) ((s8) obj).b).k0(true);
                return;
            case 15:
                ((CameraController) obj).lambda$initCamera$1();
                return;
            case 16:
                la1 la1Var = (la1) ((p1) obj).b;
                try {
                    CameraView cameraView = la1Var.d;
                    cameraView.focusToPoint(cameraView.getWidth() / 2, la1Var.d.getHeight() / 2, false);
                } catch (Exception unused) {
                }
                CameraView cameraView2 = la1Var.d;
                if (cameraView2 != null) {
                    la1Var.g0(cameraView2.getTextureView().getBitmap());
                    return;
                }
                return;
            case 17:
                cb1 cb1Var = (cb1) obj;
                if (i86.e(512)) {
                    cb1Var.invalidateSelf();
                    return;
                }
                return;
            case 18:
                ((lb1) obj).c.a0 = false;
                return;
            case 19:
                ((pb1) obj).invalidateSelf();
                return;
            case 20:
                Runnable runnable = ((gc1) obj).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 21:
                gd4 gd4Var = (gd4) obj;
                gd4Var.g = null;
                gd4Var.f = null;
                ((Runnable) gd4Var.e).run();
                return;
            case 22:
                ie1 ie1Var = (ie1) obj;
                he1 he1Var = ie1Var.a;
                if (he1Var != null) {
                    he1Var.requestFocus();
                    hl.E3(ie1Var.a);
                    return;
                }
                return;
            case 23:
                ve1 ve1Var = (ve1) obj;
                String str = ve1Var.r;
                if (str == null || str.length() > 0) {
                    ve1Var.n = true;
                    if (ve1Var.w.size() > 0) {
                        z = false;
                    }
                    ve1Var.c0(z);
                    ve1Var.n = false;
                    return;
                }
                return;
            case 24:
                nf1 nf1Var = (nf1) obj;
                if (nf1Var.W != -1) {
                    nf1Var.Y.getNotificationCenter().j(nf1Var.W);
                    nf1Var.W = -1;
                }
                if (f11.a) {
                    cc4.b("admin logs chatItemAnimator enable notifications");
                    return;
                }
                return;
            case 25:
                wf1 wf1Var = ((vf1) obj).f;
                wf1Var.getNotificationCenter().j(wf1Var.K0);
                return;
            case 26:
                vz vzVar = (vz) obj;
                Runnable runnable2 = (Runnable) vzVar.w;
                vzVar.w = null;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 27:
                ((gt) obj).a(Boolean.FALSE);
                return;
            case 28:
                ((a) obj).invalidate();
                return;
            default:
                ((b8) obj).performClick();
                return;
        }
    }
}
