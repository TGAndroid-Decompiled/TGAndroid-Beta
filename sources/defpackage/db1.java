package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class db1 implements Runnable {
    public final byte a;
    public final lb1 b;

    public db1(lb1 lb1Var, byte b) {
        this.a = b;
        this.b = lb1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        float f = 0.0f;
        lb1 lb1Var = this.b;
        switch (b) {
            case 0:
                if (!lb1Var.isFinishing()) {
                    lb1Var.S = null;
                    lb1Var.O = false;
                    lb1Var.e0.run();
                    if (!lb1Var.O) {
                        gm.d3(new db1(lb1Var, (byte) 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                CameraView cameraView = lb1Var.d;
                if (cameraView != null) {
                    lb1Var.h0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 2:
                lb1Var.finishFragment();
                return;
            case 3:
                kb1 kb1Var = lb1Var.N;
                if (kb1Var != null) {
                    kb1Var.v(lb1Var.S);
                }
                lb1Var.finishFragment();
                return;
            case 4:
                lb1Var.d0();
                return;
            case 5:
                lb1Var.V = new ai4((byte) 24);
                Context context = a.b;
                ?? obj = new Object();
                obj.a = 256;
                lb1Var.W = new yf0(new ldd(context, (cue) obj));
                return;
            case 6:
                if (lb1Var.h.getTag() != null) {
                    lb1Var.h.setTag(null);
                    lb1Var.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(d53.f).start();
                    return;
                }
                return;
            case 7:
                CameraView cameraView2 = lb1Var.d;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(lb1Var.d.getCameraSession());
                }
                gm.c3(new db1(lb1Var, (byte) 3));
                return;
            default:
                float f2 = lb1Var.Z;
                if (lb1Var.O) {
                    f = 1.0f;
                }
                lb1Var.a0 = f;
                if (f2 != f) {
                    ValueAnimator valueAnimator = lb1Var.Y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(lb1Var.Z, lb1Var.a0);
                    lb1Var.Y = ofFloat;
                    ofFloat.addUpdateListener(new fb1(lb1Var, (byte) 0));
                    lb1Var.Y.setDuration(Math.abs(lb1Var.Z - lb1Var.a0) * 300.0f);
                    lb1Var.Y.setInterpolator(d53.f);
                    lb1Var.Y.start();
                    zna znaVar = lb1Var.b0;
                    if (znaVar != null) {
                        znaVar.d();
                    }
                    boolean z = lb1Var.O;
                    float f3 = lb1Var.c0;
                    if (!z) {
                        f3 = 1.0f - f3;
                    }
                    zna znaVar2 = new zna(new xk4(f3 * 500.0f));
                    lb1Var.b0 = znaVar2;
                    znaVar2.b(new eb1(lb1Var, (byte) 1));
                    lb1Var.b0.m = new aoa(500.0f);
                    lb1Var.b0.m.a(1.0f);
                    lb1Var.b0.m.b(500.0f);
                    lb1Var.b0.h();
                    return;
                }
                return;
        }
    }
}
