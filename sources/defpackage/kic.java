package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class kic extends AnimatorListenerAdapter {
    public final byte a;
    public final vic b;

    public kic(vic vicVar, byte b) {
        this.a = b;
        this.b = vicVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        vic vicVar = this.b;
        switch (b) {
            case 0:
                View[] viewArr = vicVar.e;
                View[] viewArr2 = vicVar.e;
                if (viewArr[1] != null) {
                    vicVar.H();
                    vicVar.h.put(vicVar.f[1], viewArr2[1]);
                    vicVar.removeView(viewArr2[1]);
                    vicVar.G(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                vicVar.T = null;
                vicVar.y(true);
                lic licVar = vicVar.N;
                if (licVar != null) {
                    licVar.w.invalidate();
                    vicVar.N.w.i1();
                    vicVar.N.invalidate();
                }
                vicVar.v();
                vicVar.K.e();
                return;
            case 1:
                vicVar.x = null;
                View[] viewArr3 = vicVar.e;
                if (viewArr3[1] != null) {
                    if (!vicVar.G) {
                        vicVar.H();
                    }
                    vicVar.h.put(vicVar.f[1], viewArr3[1]);
                    vicVar.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                vicVar.y = false;
                vicVar.J = false;
                lic licVar2 = vicVar.N;
                if (licVar2 != null) {
                    licVar2.setEnabled(true);
                }
                vicVar.y(false);
                vicVar.v();
                vicVar.K.e();
                return;
            case 2:
                vicVar.x = null;
                View[] viewArr4 = vicVar.e;
                View view = viewArr4[1];
                if (view != null) {
                    vicVar.removeView(view);
                    viewArr4[1] = null;
                }
                vicVar.y = false;
                lic licVar3 = vicVar.N;
                if (licVar3 != null) {
                    licVar3.setEnabled(true);
                    lic licVar4 = vicVar.N;
                    licVar4.K = false;
                    licVar4.a = 1.0f;
                    licVar4.w.i1();
                    vicVar.N.invalidate();
                    return;
                }
                return;
            default:
                vicVar.x = null;
                View[] viewArr5 = vicVar.e;
                if (viewArr5[1] != null) {
                    if (!vicVar.G) {
                        vicVar.H();
                    }
                    vicVar.h.put(vicVar.f[1], viewArr5[1]);
                    vicVar.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                vicVar.y = false;
                vicVar.J = false;
                lic licVar5 = vicVar.N;
                if (licVar5 != null) {
                    licVar5.setEnabled(true);
                }
                vicVar.y(false);
                vicVar.v();
                vicVar.K.e();
                return;
        }
    }
}
