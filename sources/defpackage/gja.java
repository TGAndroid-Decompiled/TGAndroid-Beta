package defpackage;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class gja implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public gja(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        npa npaVar;
        boolean z;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ija ijaVar = (ija) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ijaVar.w = floatValue;
                colorMatrix.setSaturation(floatValue);
                if (bkb.I.o()) {
                    gl.h(colorMatrix, (1.0f - ijaVar.w) * (-0.3f));
                }
                ijaVar.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 1:
                vqa vqaVar = (vqa) obj;
                vqaVar.W2.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vqaVar.O1();
                return;
            case 2:
                ((upa) obj).h.invalidate();
                return;
            case 3:
                opa opaVar = (opa) obj;
                opaVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                opaVar.F = floatValue2;
                if (floatValue2 >= 0.8f && (npaVar = opaVar.I) != null && (z = npaVar.l) && z) {
                    npaVar.l = false;
                    npaVar.b();
                }
                opaVar.invalidate();
                return;
            case 4:
                ((cra) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                jra jraVar = (jra) obj;
                jraVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jraVar.invalidate();
                return;
            case 6:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yf2 yf2Var = ((yua) obj).c;
                yf2Var.setScaleX(floatValue3);
                yf2Var.setScaleY(floatValue3);
                return;
            case 7:
                yva yvaVar = (yva) obj;
                yvaVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yvaVar.invalidate();
                return;
            case 8:
                dxa dxaVar = (dxa) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dxaVar.e.setAlpha(1.0f - floatValue4);
                nf0 nf0Var = dxaVar.b;
                nf0Var.A0.f = floatValue4;
                dxaVar.c.invalidate();
                nf0Var.invalidate();
                return;
            case 9:
                ((tya) obj).D1(valueAnimator);
                return;
            case 10:
                zya zyaVar = (zya) obj;
                zyaVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zyaVar.a();
                return;
            case 11:
                mza mzaVar = (mza) obj;
                mzaVar.getClass();
                mzaVar.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                e1b e1bVar = (e1b) obj;
                e1bVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1bVar.invalidate();
                return;
            case 13:
                k2b k2bVar = (k2b) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = k2bVar.a;
                j2b j2bVar = (j2b) arrayList.get(k2bVar.d);
                j2bVar.n = floatValue5;
                j2bVar.invalidate();
                int i = k2bVar.c;
                if (i != -1) {
                    j2b j2bVar2 = (j2b) arrayList.get(i);
                    j2bVar2.n = 1.0f - floatValue5;
                    j2bVar2.invalidate();
                    return;
                }
                return;
            case 14:
                j3b j3bVar = (j3b) obj;
                j3bVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j3bVar.invalidate();
                j3bVar.requestLayout();
                j3bVar.K.requestLayout();
                return;
            case 15:
                m4b m4bVar = (m4b) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m4bVar.E = floatValue6;
                t1 t1Var = m4bVar.c;
                t1Var.setAlpha(floatValue6);
                t1Var.setScaleX(gl.R1(0.9f, 1.0f, m4bVar.E));
                t1Var.setScaleY(gl.R1(0.9f, 1.0f, m4bVar.E));
                m4bVar.b.invalidate();
                return;
            case 16:
                z4b z4bVar = (z4b) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z4bVar.r = floatValue7;
                p8c p8cVar = z4bVar.y;
                if (p8cVar != null) {
                    p8cVar.a(Float.valueOf(Utilities.i(floatValue7, 1.0f, -1.0f)));
                }
                z4bVar.a.invalidate();
                return;
            case 17:
                ((t5b) obj).y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                ((v5b) obj).setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                jab jabVar = (jab) obj;
                jabVar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jabVar.a.invalidate();
                return;
            case 20:
                rib ribVar = (rib) obj;
                ribVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ribVar.C.invalidate();
                return;
            case 21:
                qmb qmbVar = (qmb) obj;
                qmbVar.getClass();
                qmbVar.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmbVar.z0.invalidate();
                qmbVar.E0.invalidate();
                qmbVar.T1.setAlpha(qmbVar.q1);
                qmbVar.S1.invalidate();
                qmbVar.W0();
                return;
            case 22:
                qmb qmbVar2 = ((fmb) obj).a;
                qmbVar2.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmbVar2.z0.invalidate();
                qmbVar2.E0.invalidate();
                qmbVar2.T1.setAlpha(qmbVar2.q1);
                qmbVar2.S1.invalidate();
                qmbVar2.W0();
                return;
            case 23:
                smb smbVar = (smb) ((gl3) ((fb) obj).b).b;
                smbVar.getTransitionParams().L1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                smbVar.invalidate();
                return;
            case 24:
                anb anbVar = (anb) obj;
                anbVar.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anbVar.invalidate();
                return;
            case 25:
                zsb zsbVar = (zsb) obj;
                zsbVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = zsbVar.a.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    int R = RecyclerView.R(zsbVar.a.getChildAt(i2));
                    int i3 = zsbVar.d.e;
                    if (R >= i3 && i3 > 0) {
                        zsbVar.a.getChildAt(i2).setAlpha(zsbVar.F);
                    } else {
                        zsbVar.a.getChildAt(i2).setAlpha(1.0f);
                    }
                }
                return;
            case 26:
                ttb ttbVar = (ttb) obj;
                ttbVar.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ttbVar.invalidate();
                return;
            case 27:
                qvb qvbVar = (qvb) obj;
                qvbVar.getClass();
                qvbVar.V0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 28:
                nvb nvbVar = (nvb) obj;
                nvbVar.k5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nvbVar.o0();
                return;
            default:
                ((ovb) obj).setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
