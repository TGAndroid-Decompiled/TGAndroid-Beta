package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class lec extends AnimatorListenerAdapter {
    public final byte a;
    public final wec b;

    public lec(wec wecVar, byte b) {
        this.a = b;
        this.b = wecVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        wec wecVar = this.b;
        switch (b) {
            case 0:
                View[] viewArr = wecVar.e;
                View[] viewArr2 = wecVar.e;
                if (viewArr[1] != null) {
                    wecVar.G();
                    wecVar.h.put(wecVar.f[1], viewArr2[1]);
                    wecVar.removeView(viewArr2[1]);
                    wecVar.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                wecVar.T = null;
                wecVar.x(true);
                mec mecVar = wecVar.N;
                if (mecVar != null) {
                    mecVar.w.invalidate();
                    wecVar.N.w.h1();
                    wecVar.N.invalidate();
                }
                wecVar.u();
                wecVar.K.e();
                return;
            case 1:
                wecVar.x = null;
                View[] viewArr3 = wecVar.e;
                if (viewArr3[1] != null) {
                    if (!wecVar.G) {
                        wecVar.G();
                    }
                    wecVar.h.put(wecVar.f[1], viewArr3[1]);
                    wecVar.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                wecVar.y = false;
                wecVar.J = false;
                mec mecVar2 = wecVar.N;
                if (mecVar2 != null) {
                    mecVar2.setEnabled(true);
                }
                wecVar.x(false);
                wecVar.u();
                wecVar.K.e();
                return;
            case 2:
                wecVar.x = null;
                View[] viewArr4 = wecVar.e;
                View view = viewArr4[1];
                if (view != null) {
                    wecVar.removeView(view);
                    viewArr4[1] = null;
                }
                wecVar.y = false;
                mec mecVar3 = wecVar.N;
                if (mecVar3 != null) {
                    mecVar3.setEnabled(true);
                    mec mecVar4 = wecVar.N;
                    mecVar4.K = false;
                    mecVar4.a = 1.0f;
                    mecVar4.w.h1();
                    wecVar.N.invalidate();
                    return;
                }
                return;
            default:
                wecVar.x = null;
                View[] viewArr5 = wecVar.e;
                if (viewArr5[1] != null) {
                    if (!wecVar.G) {
                        wecVar.G();
                    }
                    wecVar.h.put(wecVar.f[1], viewArr5[1]);
                    wecVar.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                wecVar.y = false;
                wecVar.J = false;
                mec mecVar5 = wecVar.N;
                if (mecVar5 != null) {
                    mecVar5.setEnabled(true);
                }
                wecVar.x(false);
                wecVar.u();
                wecVar.K.e();
                return;
        }
    }
}
