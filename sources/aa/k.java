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
import ci.i0;
import da.k0;
import da.l0;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import org.telegram.messenger.g0;
public final class k implements Consumer {
    public final int f818a;
    public final Object f819b;
    public final Object f820c;

    public k(int i7, Object obj, Object obj2) {
        this.f818a = i7;
        this.f820c = obj;
        this.f819b = obj2;
    }

    @Override
    public final void accept(Object obj) {
        ci.m mVar;
        ci.c cVar;
        float f10;
        float f11;
        float[] fArr;
        switch (this.f818a) {
            case 0:
                p.a((p) this.f820c, (String) this.f819b, (ProfilingResult) obj);
                return;
            case 1:
                String str = (String) this.f819b;
                ga.b bVar = ((e0) this.f820c).f801b;
                int intValue = ((Integer) obj).intValue();
                if (((byte) 1) == 1) {
                    k0 k0Var = new k0(new l0(intValue));
                    try {
                        ga.b.f12956g.getClass();
                        ga.b.g(bVar.f12959b.b(str, "profiling-manager-info"), ea.a.f10562a.o(k0Var));
                        return;
                    } catch (IOException e10) {
                        Log.w("FirebaseCrashlytics", "Could not persist Profiling Manager info " + str, e10);
                        return;
                    }
                }
                throw new IllegalStateException("Missing required properties: trigger");
            default:
                i0 i0Var = (i0) this.f820c;
                ci.m mVar2 = (ci.m) this.f819b;
                Canvas canvas = (Canvas) obj;
                ci.c cVar2 = i0Var.f5415y;
                RectF rectF = cVar2.N;
                WeakHashMap weakHashMap = cVar2.O;
                Paint paint = cVar2.f5315c;
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
                        if (key != null && (fArr = (float[]) cVar2.f5322n.get(key)) != null) {
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
                if (!i0Var.d.J.isEmpty()) {
                    i0Var.f5415y.invalidate();
                    return;
                }
                return;
        }
    }

    public Consumer andThen(Consumer consumer) {
        int i7 = this.f818a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
