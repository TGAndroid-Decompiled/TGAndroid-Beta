package defpackage;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ija implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public ija(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ota otaVar;
        boolean z;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                jja jjaVar = (jja) obj;
                jjaVar.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jjaVar.invalidate();
                return;
            case 1:
                wla wlaVar = (wla) obj;
                wlaVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wlaVar.invalidate();
                return;
            case 2:
                bna bnaVar = (bna) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnaVar.w = floatValue;
                colorMatrix.setSaturation(floatValue);
                if (aob.I.o()) {
                    hl.h(colorMatrix, (1.0f - bnaVar.w) * (-0.3f));
                }
                bnaVar.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 3:
                wua wuaVar = (wua) obj;
                wuaVar.W2.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wuaVar.P1();
                return;
            case 4:
                ((vta) obj).h.invalidate();
                return;
            case 5:
                pta ptaVar = (pta) obj;
                ptaVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ptaVar.F = floatValue2;
                if (floatValue2 >= 0.8f && (otaVar = ptaVar.I) != null && (z = otaVar.l) && z) {
                    otaVar.l = false;
                    otaVar.b();
                }
                ptaVar.invalidate();
                return;
            case 6:
                ((eva) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 7:
                lva lvaVar = (lva) obj;
                lvaVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lvaVar.invalidate();
                return;
            case 8:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg2 qg2Var = ((cza) obj).c;
                qg2Var.setScaleX(floatValue3);
                qg2Var.setScaleY(floatValue3);
                return;
            case 9:
                b0b b0bVar = (b0b) obj;
                b0bVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0bVar.invalidate();
                return;
            case 10:
                g1b g1bVar = (g1b) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1bVar.e.setAlpha(1.0f - floatValue4);
                pf0 pf0Var = g1bVar.b;
                pf0Var.A0.f = floatValue4;
                g1bVar.c.invalidate();
                pf0Var.invalidate();
                return;
            case 11:
                ((t2b) obj).E1(valueAnimator);
                return;
            case 12:
                z2b z2bVar = (z2b) obj;
                z2bVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2bVar.a();
                return;
            case 13:
                k3b k3bVar = (k3b) obj;
                k3bVar.getClass();
                k3bVar.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 14:
                b5b b5bVar = (b5b) obj;
                b5bVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b5bVar.invalidate();
                return;
            case 15:
                g6b g6bVar = (g6b) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = g6bVar.a;
                f6b f6bVar = (f6b) arrayList.get(g6bVar.d);
                f6bVar.n = floatValue5;
                f6bVar.invalidate();
                int i = g6bVar.c;
                if (i != -1) {
                    f6b f6bVar2 = (f6b) arrayList.get(i);
                    f6bVar2.n = 1.0f - floatValue5;
                    f6bVar2.invalidate();
                    return;
                }
                return;
            case 16:
                f7b f7bVar = (f7b) obj;
                f7bVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f7bVar.invalidate();
                f7bVar.requestLayout();
                f7bVar.K.requestLayout();
                return;
            case 17:
                k8b k8bVar = (k8b) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k8bVar.E = floatValue6;
                u1 u1Var = k8bVar.c;
                u1Var.setAlpha(floatValue6);
                u1Var.setScaleX(hl.R1(0.9f, 1.0f, k8bVar.E));
                u1Var.setScaleY(hl.R1(0.9f, 1.0f, k8bVar.E));
                k8bVar.b.invalidate();
                return;
            case 18:
                y8b y8bVar = (y8b) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y8bVar.r = floatValue7;
                pcc pccVar = y8bVar.y;
                if (pccVar != null) {
                    pccVar.a(Float.valueOf(Utilities.i(floatValue7, 1.0f, -1.0f)));
                }
                y8bVar.a.invalidate();
                return;
            case 19:
                ((r9b) obj).y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                ((t9b) obj).setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 21:
                geb gebVar = (geb) obj;
                gebVar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gebVar.a.invalidate();
                return;
            case 22:
                mmb mmbVar = (mmb) obj;
                mmbVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mmbVar.C.invalidate();
                return;
            case 23:
                pqb pqbVar = (pqb) obj;
                pqbVar.getClass();
                pqbVar.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pqbVar.z0.invalidate();
                pqbVar.E0.invalidate();
                pqbVar.T1.setAlpha(pqbVar.q1);
                pqbVar.S1.invalidate();
                pqbVar.X0();
                return;
            case 24:
                pqb pqbVar2 = ((eqb) obj).a;
                pqbVar2.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pqbVar2.z0.invalidate();
                pqbVar2.E0.invalidate();
                pqbVar2.T1.setAlpha(pqbVar2.q1);
                pqbVar2.S1.invalidate();
                pqbVar2.X0();
                return;
            case 25:
                rqb rqbVar = (rqb) ((yl3) ((gb) obj).b).b;
                rqbVar.getTransitionParams().L1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rqbVar.invalidate();
                return;
            case 26:
                zqb zqbVar = (zqb) obj;
                zqbVar.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zqbVar.invalidate();
                return;
            case 27:
                axb axbVar = (axb) obj;
                axbVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = axbVar.a.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    int S = RecyclerView.S(axbVar.a.getChildAt(i2));
                    int i3 = axbVar.d.e;
                    if (S >= i3 && i3 > 0) {
                        axbVar.a.getChildAt(i2).setAlpha(axbVar.F);
                    } else {
                        axbVar.a.getChildAt(i2).setAlpha(1.0f);
                    }
                }
                return;
            case 28:
                uxb uxbVar = (uxb) obj;
                uxbVar.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uxbVar.invalidate();
                return;
            default:
                tzb tzbVar = (tzb) obj;
                tzbVar.getClass();
                tzbVar.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
