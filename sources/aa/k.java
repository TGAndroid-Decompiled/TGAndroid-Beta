package aa;

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
import ci.j0;
import da.k0;
import da.l0;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import org.telegram.messenger.g0;
public final class k implements Consumer {
    public final int f817a;
    public final Object f818b;
    public final Object f819c;

    public k(int i7, Object obj, Object obj2) {
        this.f817a = i7;
        this.f819c = obj;
        this.f818b = obj2;
    }

    @Override
    public final void accept(Object obj) {
        ci.m mVar;
        ci.c cVar;
        float f10;
        float f11;
        float[] fArr;
        switch (this.f817a) {
            case 0:
                p.a((p) this.f819c, (String) this.f818b, (ProfilingResult) obj);
                return;
            case 1:
                String str = (String) this.f818b;
                ga.b bVar = ((e0) this.f819c).f800b;
                int intValue = ((Integer) obj).intValue();
                if (((byte) 1) == 1) {
                    k0 k0Var = new k0(new l0(intValue));
                    try {
                        ga.b.f13299g.getClass();
                        ga.b.g(bVar.f13302b.b(str, "profiling-manager-info"), ea.a.f10906a.v(k0Var));
                        return;
                    } catch (IOException e10) {
                        Log.w("FirebaseCrashlytics", "Could not persist Profiling Manager info " + str, e10);
                        return;
                    }
                }
                throw new IllegalStateException("Missing required properties: trigger");
            default:
                j0 j0Var = (j0) this.f819c;
                ci.m mVar2 = (ci.m) this.f818b;
                Canvas canvas = (Canvas) obj;
                ci.c cVar2 = j0Var.f5727y;
                RectF rectF = cVar2.N;
                WeakHashMap weakHashMap = cVar2.O;
                Paint paint = cVar2.f5626c;
                long b10 = ci.c.b();
                int i7 = 0;
                while (i7 < mVar2.getChildCount()) {
                    View childAt = mVar2.getChildAt(i7);
                    if (!(childAt instanceof ci.l) || childAt.getVisibility() != 0) {
                        mVar = mVar2;
                    } else {
                        if (!weakHashMap.containsKey(childAt)) {
                            weakHashMap.put(childAt, Boolean.TRUE);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            f11 = 2.5f;
                            gradientDrawable.setColor(-1);
                            gradientDrawable.setCornerRadius(g0.L(10.0f));
                            f10 = 10.0f;
                            mVar = mVar2;
                            childAt.setBackground(new RippleDrawable(ColorStateList.valueOf(788529151), null, new InsetDrawable((Drawable) gradientDrawable, (int) g0.N(2.5f))));
                        } else {
                            mVar = mVar2;
                            f10 = 10.0f;
                            f11 = 2.5f;
                        }
                        String key = ((ci.l) childAt).getKey();
                        if (key != null && (fArr = (float[]) cVar2.f5633n.get(key)) != null) {
                            float c10 = ci.c.c(fArr, b10);
                            if (c10 > 0.004f) {
                                float translationX = childAt.getTranslationX() + childAt.getLeft();
                                float translationY = childAt.getTranslationY() + childAt.getTop();
                                float N = (int) g0.N(f11);
                                cVar = cVar2;
                                rectF.set(translationX + N, translationY + N, (translationX + childAt.getWidth()) - N, (translationY + childAt.getHeight()) - N);
                                if (!childAt.isPressed()) {
                                    paint.setColor(788529151);
                                    paint.setAlpha((int) (Color.alpha(788529151) * c10));
                                    canvas.drawRoundRect(rectF, g0.L(f10), g0.L(f10), paint);
                                }
                                i7++;
                                mVar2 = mVar;
                                cVar2 = cVar;
                            }
                        }
                    }
                    cVar = cVar2;
                    i7++;
                    mVar2 = mVar;
                    cVar2 = cVar;
                }
                if (!j0Var.d.J.isEmpty()) {
                    j0Var.f5727y.invalidate();
                    return;
                }
                return;
        }
    }

    public Consumer andThen(Consumer consumer) {
        int i7 = this.f817a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
