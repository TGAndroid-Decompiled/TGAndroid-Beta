package ai;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import j$.util.function.Consumer$CC;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import org.telegram.messenger.AndroidUtilities;
public final class r0 implements Consumer {
    public final z0 f1661a;
    public final r f1662b;

    public r0(z0 z0Var, r rVar) {
        this.f1661a = z0Var;
        this.f1662b = rVar;
    }

    @Override
    public final void accept(Object obj) {
        d dVar;
        float f7;
        float f10;
        float[] fArr;
        r0 r0Var = this;
        Canvas canvas = (Canvas) obj;
        z0 z0Var = r0Var.f1661a;
        d dVar2 = z0Var.f2011x;
        RectF rectF = dVar2.M;
        WeakHashMap weakHashMap = dVar2.N;
        Paint paint = dVar2.f1456c;
        long b10 = d.b();
        int i10 = 0;
        while (true) {
            r rVar = r0Var.f1662b;
            if (i10 >= rVar.getChildCount()) {
                break;
            }
            View childAt = rVar.getChildAt(i10);
            if ((childAt instanceof q) && childAt.getVisibility() == 0) {
                if (!weakHashMap.containsKey(childAt)) {
                    weakHashMap.put(childAt, Boolean.TRUE);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setCornerRadius(AndroidUtilities.dp(10.0f));
                    f10 = 2.5f;
                    f7 = 10.0f;
                    childAt.setBackground(new RippleDrawable(ColorStateList.valueOf(788529151), null, new InsetDrawable((Drawable) gradientDrawable, (int) AndroidUtilities.dpf2(2.5f))));
                } else {
                    f7 = 10.0f;
                    f10 = 2.5f;
                }
                String key = ((q) childAt).getKey();
                if (key != null && (fArr = (float[]) dVar2.f1461n.get(key)) != null) {
                    float c10 = d.c(fArr, b10);
                    if (c10 > 0.004f) {
                        float translationX = childAt.getTranslationX() + childAt.getLeft();
                        float translationY = childAt.getTranslationY() + childAt.getTop();
                        float dpf2 = (int) AndroidUtilities.dpf2(f10);
                        dVar = dVar2;
                        rectF.set(translationX + dpf2, translationY + dpf2, (translationX + childAt.getWidth()) - dpf2, (translationY + childAt.getHeight()) - dpf2);
                        if (!childAt.isPressed()) {
                            paint.setColor(788529151);
                            paint.setAlpha((int) (Color.alpha(788529151) * c10));
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), paint);
                        }
                        i10++;
                        r0Var = this;
                        dVar2 = dVar;
                    }
                }
            }
            dVar = dVar2;
            i10++;
            r0Var = this;
            dVar2 = dVar;
        }
        if (!z0Var.d.I.isEmpty()) {
            z0Var.f2011x.invalidate();
        }
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
