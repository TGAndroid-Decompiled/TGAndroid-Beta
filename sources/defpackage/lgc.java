package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class lgc extends AnimatorListenerAdapter {
    public final byte a;
    public final wgc b;

    public lgc(wgc wgcVar, byte b) {
        this.a = b;
        this.b = wgcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        wgc wgcVar = this.b;
        switch (b) {
            case 0:
                View[] viewArr = wgcVar.e;
                View[] viewArr2 = wgcVar.e;
                if (viewArr[1] != null) {
                    wgcVar.G();
                    wgcVar.h.put(wgcVar.f[1], viewArr2[1]);
                    wgcVar.removeView(viewArr2[1]);
                    wgcVar.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                wgcVar.T = null;
                wgcVar.x(true);
                mgc mgcVar = wgcVar.N;
                if (mgcVar != null) {
                    mgcVar.w.invalidate();
                    wgcVar.N.w.h1();
                    wgcVar.N.invalidate();
                }
                wgcVar.t();
                wgcVar.K.e();
                return;
            case 1:
                wgcVar.x = null;
                View[] viewArr3 = wgcVar.e;
                if (viewArr3[1] != null) {
                    if (!wgcVar.G) {
                        wgcVar.G();
                    }
                    wgcVar.h.put(wgcVar.f[1], viewArr3[1]);
                    wgcVar.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                wgcVar.y = false;
                wgcVar.J = false;
                mgc mgcVar2 = wgcVar.N;
                if (mgcVar2 != null) {
                    mgcVar2.setEnabled(true);
                }
                wgcVar.x(false);
                wgcVar.t();
                wgcVar.K.e();
                return;
            case 2:
                wgcVar.x = null;
                View[] viewArr4 = wgcVar.e;
                View view = viewArr4[1];
                if (view != null) {
                    wgcVar.removeView(view);
                    viewArr4[1] = null;
                }
                wgcVar.y = false;
                mgc mgcVar3 = wgcVar.N;
                if (mgcVar3 != null) {
                    mgcVar3.setEnabled(true);
                    mgc mgcVar4 = wgcVar.N;
                    mgcVar4.K = false;
                    mgcVar4.a = 1.0f;
                    mgcVar4.w.h1();
                    wgcVar.N.invalidate();
                    return;
                }
                return;
            default:
                wgcVar.x = null;
                View[] viewArr5 = wgcVar.e;
                if (viewArr5[1] != null) {
                    if (!wgcVar.G) {
                        wgcVar.G();
                    }
                    wgcVar.h.put(wgcVar.f[1], viewArr5[1]);
                    wgcVar.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                wgcVar.y = false;
                wgcVar.J = false;
                mgc mgcVar5 = wgcVar.N;
                if (mgcVar5 != null) {
                    mgcVar5.setEnabled(true);
                }
                wgcVar.x(false);
                wgcVar.t();
                wgcVar.K.e();
                return;
        }
    }
}
