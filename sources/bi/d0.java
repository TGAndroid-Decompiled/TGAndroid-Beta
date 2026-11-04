package bi;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.ProfilingResult;
import android.util.Log;
import android.view.View;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.function.Consumer;
public final class d0 implements Consumer {
    public final int f3694a;
    public final Object f3695b;
    public final Object f3696c;

    public d0(int i3, Object obj, Object obj2) {
        this.f3694a = i3;
        this.f3695b = obj;
        this.f3696c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        m mVar;
        float f10;
        float f11;
        float[] fArr;
        switch (this.f3694a) {
            case 0:
                j0 j0Var = (j0) this.f3695b;
                m mVar2 = (m) this.f3696c;
                Canvas canvas = (Canvas) obj;
                c cVar = j0Var.f3776y;
                RectF rectF = cVar.N;
                WeakHashMap weakHashMap = cVar.O;
                Paint paint = cVar.f3665c;
                long b10 = c.b();
                int i3 = 0;
                while (i3 < mVar2.getChildCount()) {
                    View childAt = mVar2.getChildAt(i3);
                    if ((childAt instanceof l) && childAt.getVisibility() == 0) {
                        if (!weakHashMap.containsKey(childAt)) {
                            weakHashMap.put(childAt, Boolean.TRUE);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            f11 = 2.5f;
                            gradientDrawable.setColor(-1);
                            gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(10.0f));
                            f10 = 10.0f;
                            childAt.setBackground(new RippleDrawable(ColorStateList.valueOf(788529151), null, new InsetDrawable((Drawable) gradientDrawable, (int) org.telegram.messenger.g0.N(2.5f))));
                        } else {
                            f10 = 10.0f;
                            f11 = 2.5f;
                        }
                        String key = ((l) childAt).getKey();
                        if (key != null && (fArr = (float[]) cVar.f3672n.get(key)) != null) {
                            float c2 = c.c(fArr, b10);
                            if (c2 > 0.004f) {
                                float translationX = childAt.getTranslationX() + childAt.getLeft();
                                float translationY = childAt.getTranslationY() + childAt.getTop();
                                float N = (int) org.telegram.messenger.g0.N(f11);
                                mVar = mVar2;
                                rectF.set(translationX + N, translationY + N, (translationX + childAt.getWidth()) - N, (translationY + childAt.getHeight()) - N);
                                if (!childAt.isPressed()) {
                                    paint.setColor(788529151);
                                    paint.setAlpha((int) (Color.alpha(788529151) * c2));
                                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), paint);
                                }
                                i3++;
                                mVar2 = mVar;
                            }
                        }
                    }
                    mVar = mVar2;
                    i3++;
                    mVar2 = mVar;
                }
                if (!j0Var.d.J.isEmpty()) {
                    j0Var.f3776y.invalidate();
                    return;
                }
                return;
            case 1:
                z9.m.a((z9.m) this.f3695b, (String) this.f3696c, (ProfilingResult) obj);
                return;
            default:
                String str = (String) this.f3696c;
                fa.d dVar = ((z9.x) this.f3695b).f60258b;
                int intValue = ((Integer) obj).intValue();
                if (((byte) 1) == 1) {
                    ca.k0 k0Var = new ca.k0(new ca.l0(intValue));
                    try {
                        fa.d.f11532g.getClass();
                        fa.d.g(dVar.f11535b.b(str, "profiling-manager-info"), da.a.f8594a.d2(k0Var));
                        return;
                    } catch (IOException e10) {
                        Log.w("FirebaseCrashlytics", "Could not persist Profiling Manager info " + str, e10);
                        return;
                    }
                }
                throw new IllegalStateException("Missing required properties: trigger");
        }
    }

    public Consumer andThen(Consumer consumer) {
        int i3 = this.f3694a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
