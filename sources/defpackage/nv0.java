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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class nv0 implements Runnable {
    public final byte a;
    public final Object b;

    public nv0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        int i;
        int i2;
        byte b = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((nw0) obj).invalidate();
                return;
            case 1:
                ((on) obj).e();
                return;
            case 2:
                fx0 fx0Var = (fx0) ((cn) obj).c;
                DialogInterface.OnDismissListener onDismissListener = fx0Var.I0;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(fx0Var);
                }
                try {
                    fx0Var.I();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 3:
                try {
                    ((yw0) obj).b.I();
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 4:
                vx0 vx0Var = (vx0) obj;
                if (vx0Var.mo23d() != null) {
                    vx0Var.mo23d().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 5:
                ((yx0) obj).f();
                return;
            case 6:
                yz0 yz0Var = (yz0) obj;
                yz0Var.d.C();
                yz0Var.a.quitSafely();
                return;
            case 7:
                m21 m21Var = ((d11) obj).b;
                q11 q11Var = m21Var.e;
                q11Var.transitionRunningEnter = false;
                q11Var.onEnterTransitionEnd();
                if (m21Var.u) {
                    m21Var.i(true);
                    return;
                }
                return;
            case 8:
                gl.g(((TL_account.TL_businessChatLink) obj).link);
                u21.b0(LaunchActivity.Q()).k(false).j();
                return;
            case 9:
                v51 v51Var = (v51) obj;
                v51Var.d.clear();
                v51Var.getMessagesController().h4.h(v51Var.e, v51Var.d);
                v51Var.Y();
                v51Var.finishFragment();
                return;
            case 10:
                w72 w72Var = (w72) obj;
                ArrayList c1 = gl.c1();
                File file = (File) c1.get(0);
                file.getAbsolutePath();
                if (!TextUtils.isEmpty(gba.e0)) {
                    int size = c1.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        File file2 = (File) c1.get(i3);
                        if (file2.getAbsolutePath().startsWith(gba.e0) && file2.canWrite()) {
                            file = file2;
                        }
                    }
                }
                try {
                    StatFs statFs = new StatFs(file.getPath());
                    gl.d3(new zp0(statFs.getBlockCountLong(), statFs.getBlockSizeLong(), statFs.getAvailableBlocksLong(), w72Var));
                    return;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
            case 11:
                ((i61) obj).dismiss();
                return;
            case 12:
                ((CameraController) obj).lambda$initCamera$1();
                return;
            case 13:
                da1 da1Var = (da1) ((o1) obj).b;
                try {
                    CameraView cameraView = da1Var.d;
                    cameraView.focusToPoint(cameraView.getWidth() / 2, da1Var.d.getHeight() / 2, false);
                } catch (Exception unused) {
                }
                CameraView cameraView2 = da1Var.d;
                if (cameraView2 != null) {
                    da1Var.g0(cameraView2.getTextureView().getBitmap());
                    return;
                }
                return;
            case 14:
                ua1 ua1Var = (ua1) obj;
                if (e66.e(512)) {
                    ua1Var.invalidateSelf();
                    return;
                }
                return;
            case 15:
                ((db1) obj).c.a0 = false;
                return;
            case 16:
                ((hb1) obj).invalidateSelf();
                return;
            case 17:
                Runnable runnable = ((yb1) obj).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 18:
                jb4 jb4Var = (jb4) obj;
                jb4Var.g = null;
                jb4Var.f = null;
                ((Runnable) jb4Var.e).run();
                return;
            case 19:
                zd1 zd1Var = (zd1) obj;
                yd1 yd1Var = zd1Var.a;
                if (yd1Var != null) {
                    yd1Var.requestFocus();
                    gl.F3(zd1Var.a);
                    return;
                }
                return;
            case 20:
                me1 me1Var = (me1) obj;
                String str = me1Var.r;
                if (str == null || str.length() > 0) {
                    me1Var.n = true;
                    if (me1Var.w.size() > 0) {
                        z = false;
                    }
                    me1Var.c0(z);
                    me1Var.n = false;
                    return;
                }
                return;
            case 21:
                ef1 ef1Var = (ef1) obj;
                if (ef1Var.W != -1) {
                    ef1Var.Y.getNotificationCenter().j(ef1Var.W);
                    ef1Var.W = -1;
                }
                if (w01.a) {
                    fa4.b("admin logs chatItemAnimator enable notifications");
                    return;
                }
                return;
            case 22:
                nf1 nf1Var = ((mf1) obj).f;
                nf1Var.getNotificationCenter().j(nf1Var.K0);
                return;
            case 23:
                AtomicReference atomicReference = (AtomicReference) obj;
                if (atomicReference.get() != null) {
                    ((Runnable) atomicReference.getAndSet(null)).run();
                    return;
                }
                return;
            case 24:
                ((a) obj).invalidate();
                return;
            case 25:
                ((a8) obj).performClick();
                return;
            case 26:
                ((ht) obj).a(Boolean.FALSE);
                return;
            case 27:
                ((p) obj).a(Boolean.FALSE, null);
                return;
            case 28:
                qp1 qp1Var = (qp1) obj;
                i = ((d) ((mu1) qp1Var.d)).currentAccount;
                kk7.f(i).j(qp1Var.b);
                return;
            default:
                rp1 rp1Var = (rp1) obj;
                i2 = ((d) ((mu1) rp1Var.e)).currentAccount;
                kk7.f(i2).j(rp1Var.c);
                return;
        }
    }
}
