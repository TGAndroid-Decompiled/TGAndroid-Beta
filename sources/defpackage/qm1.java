package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qm1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final float b;
    public final Object c;

    public qm1(Object obj, float f, byte b) {
        this.a = b;
        this.c = obj;
        this.b = f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        byte b = this.a;
        boolean z = false;
        float f = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                zu1 zu1Var = (zu1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1Var.X8 = floatValue;
                zu1Var.b9 = floatValue / f;
                View view = zu1Var.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i2 = ChatActivityEnterView.X7;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tx1 tx1Var = chatActivityEnterView.F0;
                if (tx1Var != null) {
                    tx1Var.setAlpha(1.0f - floatValue2);
                }
                qw1 qw1Var = chatActivityEnterView.N4;
                float R1 = hl.R1(1.0f, 0.6f, floatValue2);
                qw1Var.getClass();
                ChatActivityEnterView chatActivityEnterView2 = qw1Var.b;
                chatActivityEnterView2.h = R1;
                chatActivityEnterView2.x2();
                qw1 qw1Var2 = chatActivityEnterView.P4;
                qw1Var2.getClass();
                ChatActivityEnterView chatActivityEnterView3 = qw1Var2.b;
                chatActivityEnterView3.n = (1.0f - floatValue2) * f;
                chatActivityEnterView3.x2();
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView4 = (ChatActivityEnterView) ((u7) obj).c;
                qw1 qw1Var3 = chatActivityEnterView4.N4;
                float R12 = hl.R1(0.6f, 1.0f, floatValue3);
                qw1Var3.getClass();
                ChatActivityEnterView chatActivityEnterView5 = qw1Var3.b;
                chatActivityEnterView5.h = R12;
                chatActivityEnterView5.x2();
                qw1 qw1Var4 = chatActivityEnterView4.P4;
                qw1Var4.getClass();
                ChatActivityEnterView chatActivityEnterView6 = qw1Var4.b;
                chatActivityEnterView6.n = f * floatValue3;
                chatActivityEnterView6.x2();
                return;
            case 3:
                ((a72) obj).F.setTranslationY(hl.R1(f, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                ArrayList arrayList = (ArrayList) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    View view2 = (View) arrayList.get(i3);
                    if (view2 != null) {
                        view2.setTranslationY(f * floatValue4);
                    }
                }
                return;
            case 5:
                xl4 xl4Var = (xl4) obj;
                WindowManager.LayoutParams layoutParams = xl4Var.f;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xl4Var.E = floatValue5;
                layoutParams.x = (int) floatValue5;
                xl4Var.j.setAlpha((1.0f - valueAnimator.getAnimatedFraction()) * f);
                xl4Var.v();
                return;
            case 6:
                ((wh8) obj).S.setTranslationY(hl.R1(f, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 7:
                hx8 hx8Var = (hx8) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float R13 = hl.R1(0.0f, f, floatValue6);
                hx8Var.a.setTranslationX(R13);
                hx8Var.b.setTranslationX(R13);
                ImageView imageView = hx8Var.c;
                imageView.setTranslationX(R13);
                og2 og2Var = hx8Var.f;
                if (ob6.a0) {
                    i = hl.L(32.0f);
                } else {
                    i = -hl.L(32.0f);
                }
                og2Var.setTranslationX(i + R13);
                float f2 = (floatValue6 * 0.5f) + 0.5f;
                og2Var.setScaleX(f2);
                og2Var.setScaleY(f2);
                og2Var.setAlpha(floatValue6);
                float f3 = 1.0f - floatValue6;
                float f4 = (f3 * 0.5f) + 0.5f;
                imageView.setScaleX(f4);
                imageView.setScaleY(f4);
                imageView.setAlpha(f3);
                return;
            case 8:
                zoc zocVar = (zoc) obj;
                zocVar.getClass();
                zocVar.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + f) % 360.0f;
                zocVar.a.invalidate();
                return;
            default:
                itc itcVar = (itc) obj;
                float floatValue7 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                itcVar.c = itcVar.c();
                itcVar.d = f * floatValue7;
                if (floatValue7 > 0.0f) {
                    z = true;
                }
                itcVar.s = z;
                return;
        }
    }
}
