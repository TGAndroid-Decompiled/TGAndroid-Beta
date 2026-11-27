package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.voip.OrientationHelper;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public final class omb extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public omb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        int i2 = 4;
        float f = 0.0f;
        switch (this.a) {
            case 0:
                ((pmb) this.b).setVisibility(4);
                return;
            case 1:
                pqb pqbVar = ((eqb) this.b).a;
                if (!pqbVar.r1.a()) {
                    pqbVar.T1.setVisibility(8);
                    return;
                }
                return;
            case 2:
                super.onAnimationEnd(animator);
                yl3 yl3Var = (yl3) ((gb) this.b).b;
                ((rqb) yl3Var.b).getTransitionParams().e();
                ((rqb) yl3Var.b).getTransitionParams().h = false;
                ((rqb) yl3Var.b).getTransitionParams().L1 = 1.0f;
                return;
            case 3:
                ((kxb) this.b).setVisibility(8);
                return;
            case 4:
                super.onAnimationEnd(animator);
                ((uxb) this.b).d = null;
                return;
            case 5:
                super.onAnimationEnd(animator);
                ((rzb) this.b).setScrollEnabled(true);
                return;
            case 6:
                vl4 vl4Var = ((g1c) this.b).f;
                vl4Var.setScaleX(1.0f);
                vl4Var.setScaleY(1.0f);
                vl4Var.invalidate();
                return;
            case 7:
                k1c k1cVar = (k1c) this.b;
                k1cVar.M = 1.0f;
                k1cVar.h.invalidate();
                return;
            case 8:
                ((l2c) this.b).L = null;
                return;
            case 9:
                ((d6c) this.b).M = null;
                return;
            case 10:
                o7c o7cVar = ((n7c) this.b).d;
                if (animator.equals(o7cVar.L)) {
                    o7cVar.L = null;
                    return;
                }
                return;
            case 11:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 12:
                kac kacVar = (kac) this.b;
                if (kacVar.a.getTag() == null) {
                    kacVar.a.setVisibility(4);
                    return;
                }
                return;
            case 13:
                super.onAnimationEnd(animator);
                vbc vbcVar = (vbc) this.b;
                vbcVar.b = 0.0f;
                vbcVar.setTranslationY(0.0f);
                vbcVar.a = null;
                return;
            case 14:
                ccc cccVar = (ccc) this.b;
                cccVar.d = null;
                cccVar.a = null;
                cccVar.b = false;
                cccVar.f.c.setAllowDrawCursor(true);
                return;
            case 15:
                yfc yfcVar = (yfc) ((il2) this.b).b;
                yfcVar.G = true;
                yfcVar.invalidate();
                return;
            case 16:
                uic uicVar = (uic) this.b;
                uicVar.K = false;
                uicVar.setEnabled(true);
                tic ticVar = uicVar.E;
                if (ticVar != null) {
                    ticVar.a(1.0f);
                }
                uicVar.invalidate();
                return;
            case 17:
                kjc kjcVar = (kjc) this.b;
                kjcVar.i = false;
                kjcVar.l.setAlpha(35);
                kjcVar.k.setAlpha(102);
                kjcVar.j.setAlpha(35);
                kjcVar.c();
                return;
            case 18:
                ujc ujcVar = ((sjc) this.b).c;
                ujcVar.P = false;
                ujcVar.requestLayout();
                return;
            case 19:
                hmc hmcVar = (hmc) this.b;
                hmcVar.O = 0.0f;
                hmcVar.P = 0.0f;
                gmc gmcVar = hmcVar.d;
                gmcVar.setScaleX(hmcVar.U);
                gmcVar.setScaleY(hmcVar.U);
                TextureView textureView = hmcVar.e;
                if (textureView != null) {
                    textureView.setScaleX(hmcVar.V);
                    textureView.setScaleY(hmcVar.V);
                }
                hmcVar.setTranslationY(0.0f);
                hmcVar.setTranslationX(0.0f);
                hmcVar.a0 = hmcVar.W;
                hmcVar.c0 = null;
                return;
            case 20:
                kmc kmcVar = (kmc) this.b;
                if (kmcVar.Q) {
                    f = 1.0f;
                }
                kmcVar.R = f;
                kmcVar.a(kmcVar.S, kmcVar.T);
                return;
            case 21:
                ((qmc) this.b).c.e();
                hl.K3(((qmc) this.b).a);
                if (((qmc) this.b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((qmc) this.b).a.getSystemService("window");
                    ((qmc) this.b).setVisibility(8);
                    try {
                        windowManager.removeView((qmc) this.b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 22:
                wmc wmcVar = (wmc) this.b;
                AnimatorSet animatorSet = wmcVar.R;
                wmcVar.K = false;
                wmcVar.U.e = false;
                if (wmcVar.V && animatorSet != null) {
                    animatorSet.cancel();
                    animatorSet.start();
                }
                wmcVar.c();
                return;
            case 23:
                ((dnc) this.b).e.setVisibility(8);
                return;
            case 24:
                ((zoc) this.b).f();
                return;
            case 25:
                uqc uqcVar = (uqc) this.b;
                if (uqcVar.N0 == animator) {
                    uqcVar.N0 = null;
                    return;
                }
                return;
            case 26:
                sqc sqcVar = (sqc) this.b;
                sqcVar.n = false;
                sqcVar.r = null;
                sqcVar.c.setLayerType(0, null);
                return;
            case 27:
                zqc zqcVar = (zqc) this.b;
                zqcVar.O = 0.0f;
                zqcVar.P = 0.0f;
                zqcVar.c0 = null;
                return;
            case 28:
                yrc yrcVar = (yrc) this.b;
                yrcVar.J = null;
                yrcVar.j0 = 1.0f;
                yrcVar.i0 = 0.0f;
                yrcVar.h0 = 0.0f;
                yrcVar.b();
                return;
            default:
                ltc ltcVar = (ltc) this.b;
                EditTextBoldCursor editTextBoldCursor = ltcVar.b;
                if (ltcVar.s == animator) {
                    ltcVar.s = null;
                    View view = ltcVar.a;
                    if (ltcVar.E) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    view.setVisibility(i);
                    if (ltcVar.E) {
                        i2 = 0;
                    }
                    editTextBoldCursor.setVisibility(i2);
                    if (ltcVar.E && !ltcVar.F) {
                        editTextBoldCursor.requestFocus();
                        hl.E3(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
