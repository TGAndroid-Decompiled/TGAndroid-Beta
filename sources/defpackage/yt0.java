package defpackage;

import android.content.DialogInterface;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;
public final class yt0 implements Runnable {
    public final byte a;
    public final Object b;

    public yt0(Object obj, byte b) {
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
                zt0 zt0Var = (zt0) obj;
                if (zt0Var.isAttachedToWindow() && !zt0Var.c.canScrollVertically(1)) {
                    zt0Var.a();
                    return;
                }
                return;
            case 1:
                ((qu3) obj).requestFocus();
                return;
            case 2:
                l11.u(((iw0) obj).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 3:
                ((vx0) obj).invalidate();
                return;
            case 4:
                ((po) obj).e();
                return;
            case 5:
                my0 my0Var = (my0) ((co) obj).c;
                DialogInterface.OnDismissListener onDismissListener = my0Var.I0;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(my0Var);
                }
                try {
                    my0Var.H();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 6:
                try {
                    ((fy0) obj).b.H();
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 7:
                cz0 cz0Var = (cz0) obj;
                if (cz0Var.mo21d() != null) {
                    cz0Var.mo21d().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 8:
                ((fz0) obj).f();
                return;
            case 9:
                f11 f11Var = (f11) obj;
                f11Var.d.C();
                f11Var.a.quitSafely();
                return;
            case 10:
                u31 u31Var = ((l21) obj).b;
                y21 y21Var = u31Var.e;
                y21Var.transitionRunningEnter = false;
                y21Var.onEnterTransitionEnd();
                if (u31Var.v) {
                    u31Var.i(true);
                    return;
                }
                return;
            case 11:
                gm.g(((TL_account.TL_businessChatLink) obj).link);
                c41.b0(LaunchActivity.Q()).k(false).j();
                return;
            case 12:
                c71 c71Var = (c71) obj;
                c71Var.d.clear();
                c71Var.getMessagesController().h4.h(c71Var.e, c71Var.d);
                c71Var.Z();
                c71Var.finishFragment();
                return;
            case 13:
                h92 h92Var = (h92) obj;
                ArrayList c1 = gm.c1();
                File file = (File) c1.get(0);
                file.getAbsolutePath();
                if (!TextUtils.isEmpty(gda.e0)) {
                    int size = c1.size();
                    for (int i = 0; i < size; i++) {
                        File file2 = (File) c1.get(i);
                        if (file2.getAbsolutePath().startsWith(gda.e0) && file2.canWrite()) {
                            file = file2;
                        }
                    }
                }
                try {
                    StatFs statFs = new StatFs(file.getPath());
                    gm.c3(new zq0(statFs.getBlockCountLong(), statFs.getBlockSizeLong(), statFs.getAvailableBlocksLong(), h92Var));
                    return;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return;
                }
            case 14:
                ((p71) obj).dismiss();
                return;
            case 15:
                ((CameraController) obj).lambda$initCamera$1();
                return;
            case 16:
                lb1 lb1Var = (lb1) ((o1) obj).b;
                try {
                    CameraView cameraView = lb1Var.d;
                    cameraView.focusToPoint(cameraView.getWidth() / 2, lb1Var.d.getHeight() / 2, false);
                } catch (Exception unused) {
                }
                CameraView cameraView2 = lb1Var.d;
                if (cameraView2 != null) {
                    lb1Var.h0(cameraView2.getTextureView().getBitmap());
                    return;
                }
                return;
            case 17:
                cc1 cc1Var = (cc1) obj;
                if (e86.e(512)) {
                    cc1Var.invalidateSelf();
                    return;
                }
                return;
            case 18:
                ((kc1) obj).c.a0 = false;
                return;
            case 19:
                ((oc1) obj).invalidateSelf();
                return;
            case 20:
                Runnable runnable = ((gd1) obj).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 21:
                jd4 jd4Var = (jd4) obj;
                jd4Var.g = null;
                jd4Var.f = null;
                ((Runnable) jd4Var.e).run();
                return;
            case 22:
                hf1 hf1Var = (hf1) obj;
                gf1 gf1Var = hf1Var.a;
                if (gf1Var != null) {
                    gf1Var.requestFocus();
                    gm.E3(hf1Var.a);
                    return;
                }
                return;
            case 23:
                uf1 uf1Var = (uf1) obj;
                String str = uf1Var.r;
                if (str == null || str.length() > 0) {
                    uf1Var.n = true;
                    if (uf1Var.w.size() > 0) {
                        z = false;
                    }
                    uf1Var.d0(z);
                    uf1Var.n = false;
                    return;
                }
                return;
            case 24:
                mg1 mg1Var = (mg1) obj;
                if (mg1Var.W != -1) {
                    mg1Var.Y.getNotificationCenter().j(mg1Var.W);
                    mg1Var.W = -1;
                }
                if (e21.a) {
                    fc4.b("admin logs chatItemAnimator enable notifications");
                    return;
                }
                return;
            case 25:
                vg1 vg1Var = ((ug1) obj).f;
                vg1Var.getNotificationCenter().j(vg1Var.K0);
                return;
            case 26:
                u00 u00Var = (u00) obj;
                Runnable runnable2 = (Runnable) u00Var.w;
                u00Var.w = null;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 27:
                AtomicReference atomicReference = (AtomicReference) obj;
                if (atomicReference.get() != null) {
                    ((Runnable) atomicReference.getAndSet(null)).run();
                    return;
                }
                return;
            case 28:
                ((a) obj).invalidate();
                return;
            default:
                ((iu) obj).a(Boolean.FALSE);
                return;
        }
    }
}
