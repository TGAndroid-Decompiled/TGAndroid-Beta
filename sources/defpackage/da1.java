package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class da1 implements Runnable {
    public final byte a;
    public final la1 b;

    public da1(la1 la1Var, byte b) {
        this.a = b;
        this.b = la1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        float f = 0.0f;
        la1 la1Var = this.b;
        switch (b) {
            case 0:
                CameraView cameraView = la1Var.d;
                if (cameraView != null && cameraView.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(la1Var.d.getCameraSession());
                }
                hl.c3(new da1(la1Var, (byte) 5));
                return;
            case 1:
                float f2 = la1Var.Z;
                if (la1Var.O) {
                    f = 1.0f;
                }
                la1Var.a0 = f;
                if (f2 != f) {
                    ValueAnimator valueAnimator = la1Var.Y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(la1Var.Z, la1Var.a0);
                    la1Var.Y = ofFloat;
                    ofFloat.addUpdateListener(new ea1(la1Var, (byte) 0));
                    la1Var.Y.setDuration(Math.abs(la1Var.Z - la1Var.a0) * 300.0f);
                    la1Var.Y.setInterpolator(k43.f);
                    la1Var.Y.start();
                    vpa vpaVar = la1Var.b0;
                    if (vpaVar != null) {
                        vpaVar.d();
                    }
                    boolean z = la1Var.O;
                    float f3 = la1Var.c0;
                    if (!z) {
                        f3 = 1.0f - f3;
                    }
                    vpa vpaVar2 = new vpa(new xk4(f3 * 500.0f));
                    la1Var.b0 = vpaVar2;
                    vpaVar2.b(new fa1(la1Var, (byte) 0));
                    la1Var.b0.m = new wpa(500.0f);
                    la1Var.b0.m.a(1.0f);
                    la1Var.b0.m.b(500.0f);
                    la1Var.b0.h();
                    return;
                }
                return;
            case 2:
                if (!la1Var.isFinishing()) {
                    la1Var.S = null;
                    la1Var.O = false;
                    la1Var.e0.run();
                    if (!la1Var.O) {
                        hl.d3(new da1(la1Var, (byte) 1), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                CameraView cameraView2 = la1Var.d;
                if (cameraView2 != null) {
                    la1Var.g0(cameraView2.getTextureView().getBitmap());
                    return;
                }
                return;
            case 4:
                la1Var.finishFragment();
                return;
            case 5:
                ka1 ka1Var = la1Var.N;
                if (ka1Var != null) {
                    ka1Var.q(la1Var.S);
                }
                la1Var.finishFragment();
                return;
            case 6:
                la1Var.c0();
                return;
            case 7:
                la1Var.V = new aj3((byte) 29);
                Context context = a.b;
                ?? obj = new Object();
                obj.a = 256;
                la1Var.W = new af0(new cgd(context, (qwe) obj));
                return;
            default:
                if (la1Var.h.getTag() != null) {
                    la1Var.h.setTag(null);
                    la1Var.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(k43.f).start();
                    return;
                }
                return;
        }
    }
}
