package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rm1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final float b;
    public final Object c;

    public rm1(Object obj, float f, byte b) {
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
                mu1 mu1Var = (mu1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var.X8 = floatValue;
                mu1Var.b9 = floatValue / f;
                View view = mu1Var.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i2 = ChatActivityEnterView.r7;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ex1 ex1Var = chatActivityEnterView.F0;
                if (ex1Var != null) {
                    ex1Var.setAlpha(1.0f - floatValue2);
                }
                bw1 bw1Var = chatActivityEnterView.O4;
                float R1 = gl.R1(1.0f, 0.6f, floatValue2);
                bw1Var.getClass();
                ChatActivityEnterView chatActivityEnterView2 = bw1Var.b;
                chatActivityEnterView2.h = R1;
                chatActivityEnterView2.l2();
                bw1 bw1Var2 = chatActivityEnterView.Q4;
                bw1Var2.getClass();
                ChatActivityEnterView chatActivityEnterView3 = bw1Var2.b;
                chatActivityEnterView3.n = (1.0f - floatValue2) * f;
                chatActivityEnterView3.l2();
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView4 = (ChatActivityEnterView) ((t7) obj).c;
                bw1 bw1Var3 = chatActivityEnterView4.O4;
                float R12 = gl.R1(0.6f, 1.0f, floatValue3);
                bw1Var3.getClass();
                ChatActivityEnterView chatActivityEnterView5 = bw1Var3.b;
                chatActivityEnterView5.h = R12;
                chatActivityEnterView5.l2();
                bw1 bw1Var4 = chatActivityEnterView4.Q4;
                bw1Var4.getClass();
                ChatActivityEnterView chatActivityEnterView6 = bw1Var4.b;
                chatActivityEnterView6.n = f * floatValue3;
                chatActivityEnterView6.l2();
                return;
            case 3:
                ((k62) obj).F.setTranslationY(gl.R1(f, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
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
                ((ie8) obj).S.setTranslationY(gl.R1(f, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 6:
                yt8 yt8Var = (yt8) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float R13 = gl.R1(0.0f, f, floatValue5);
                yt8Var.a.setTranslationX(R13);
                yt8Var.b.setTranslationX(R13);
                ImageView imageView = yt8Var.c;
                imageView.setTranslationX(R13);
                wf2 wf2Var = yt8Var.f;
                if (k96.a0) {
                    i = gl.L(32.0f);
                } else {
                    i = -gl.L(32.0f);
                }
                wf2Var.setTranslationX(i + R13);
                float f2 = (floatValue5 * 0.5f) + 0.5f;
                wf2Var.setScaleX(f2);
                wf2Var.setScaleY(f2);
                wf2Var.setAlpha(floatValue5);
                float f3 = 1.0f - floatValue5;
                float f4 = (f3 * 0.5f) + 0.5f;
                imageView.setScaleX(f4);
                imageView.setScaleY(f4);
                imageView.setAlpha(f3);
                return;
            case 7:
                nkc nkcVar = (nkc) obj;
                nkcVar.getClass();
                nkcVar.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + f) % 360.0f;
                nkcVar.a.invalidate();
                return;
            default:
                voc vocVar = (voc) obj;
                float floatValue6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vocVar.c = vocVar.c();
                vocVar.d = f * floatValue6;
                if (floatValue6 > 0.0f) {
                    z = true;
                }
                vocVar.s = z;
                return;
        }
    }
}
