package oh;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import c3.i0;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Wallet.a7;
import org.telegram.ui.Wallet.q9;
import w7.u;
public final class k implements ValueAnimator.AnimatorUpdateListener {
    public final int f14269a;
    public final float f14270b;
    public final float f14271c;
    public final float d;
    public final float e;
    public final int f14272f;
    public final KeyEvent.Callback f14273g;

    public k(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f14269a = i11;
        this.f14273g = callback;
        this.f14270b = f7;
        this.f14271c = f10;
        this.d = f11;
        this.e = f12;
        this.f14272f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14269a) {
            case 0:
                p pVar = (p) this.f14273g;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.f14291y = floatValue;
                float f7 = this.f14270b;
                float z10 = i0.z(1.0f, f7, floatValue, f7);
                o oVar = pVar.D;
                oVar.setScaleX(z10);
                oVar.setScaleY(z10);
                oVar.setTranslationX((1.0f - pVar.f14291y) * this.f14271c);
                oVar.setTranslationY((1.0f - pVar.f14291y) * this.d);
                int i10 = (int) ((1.0f - pVar.f14291y) * this.e);
                pVar.h.N(i10, i10);
                float a2 = u.a((pVar.f14291y * 2.0f) - 1.0f, 0.0f, 1.0f);
                pVar.f14284c.setAlpha((int) (a2 * 255.0f));
                pVar.d.setAlpha(a2);
                pVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = pVar.f14285f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - pVar.f14291y) * this.f14272f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = pVar.f14290x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (pVar.f14291y * 255.0f));
                }
                pVar.f14286n.setAlpha(a2);
                return;
            default:
                q9 q9Var = (q9) this.f14273g;
                q9Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gr grVar = gr.h;
                float interpolation = grVar.getInterpolation(floatValue2);
                float interpolation2 = grVar.getInterpolation(Math.min(1.0f, (floatValue2 * 320.0f) / 120.0f));
                a7 a7Var = q9Var.d;
                float f10 = this.f14271c;
                float f11 = this.f14270b;
                a7Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = q9Var.f35089f;
                float f12 = this.e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = q9Var.e;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i11 = this.f14272f;
                layoutParams.width = Math.round(((q9Var.D - i11) * interpolation) + i11);
                frameLayout.requestLayout();
                return;
        }
    }
}
