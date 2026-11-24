package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;
public final class c81 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final AtomicBoolean b;
    public final View c;
    public final Object d;
    public final Object e;

    public c81(View view, AtomicBoolean atomicBoolean, Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = view;
        this.b = atomicBoolean;
        this.d = obj;
        this.e = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        int i2;
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        AtomicBoolean atomicBoolean = this.b;
        View view = this.c;
        switch (b) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) view;
                l46 l46Var = (l46) obj2;
                String str = (String) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float abs = (Math.abs(floatValue - 0.5f) / 5.0f) + 0.9f;
                frameLayout.setScaleX(abs);
                frameLayout.setScaleY(abs);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    l46Var.setText(str);
                    return;
                }
                return;
            default:
                ImageView imageView = (ImageView) view;
                boolean[] zArr = (boolean[]) obj2;
                wjb wjbVar = (wjb) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float abs2 = ((Math.abs(floatValue2 - 0.5f) / 0.5f) * 0.25f) + 0.75f;
                imageView.setScaleX(abs2);
                imageView.setScaleY(abs2);
                if (floatValue2 >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    if (zArr[0]) {
                        i = bkb.Ei;
                    } else {
                        i = bkb.y6;
                    }
                    zkb.s(imageView, i, wjbVar, PorterDuff.Mode.SRC_IN);
                    if (zArr[0]) {
                        i2 = 2131232817;
                    } else {
                        i2 = 2131232818;
                    }
                    imageView.setImageResource(i2);
                    return;
                }
                return;
        }
    }
}
