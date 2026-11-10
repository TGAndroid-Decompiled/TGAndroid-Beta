package aa;

import ai.s0;
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
import da.k0;
import da.l0;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.function.Consumer;
public final class k implements Consumer {
    public final int f819a;
    public final Object f820b;
    public final Object f821c;

    public k(int i7, Object obj, Object obj2) {
        this.f819a = i7;
        this.f821c = obj;
        this.f820b = obj2;
    }

    @Override
    public final void accept(Object obj) {
        ai.r rVar;
        ai.d dVar;
        float f10;
        float f11;
        float[] fArr;
        switch (this.f819a) {
            case 0:
                q.a((q) this.f821c, (String) this.f820b, (ProfilingResult) obj);
                return;
            case 1:
                String str = (String) this.f820b;
                ga.b bVar = ((f0) this.f821c).f805b;
                int intValue = ((Integer) obj).intValue();
                if (((byte) 1) == 1) {
                    k0 k0Var = new k0(new l0(intValue));
                    try {
                        ga.b.f13611g.getClass();
                        ga.b.g(bVar.f13614b.b(str, "profiling-manager-info"), ea.a.f10731a.u(k0Var));
                        return;
                    } catch (IOException e10) {
                        Log.w("FirebaseCrashlytics", "Could not persist Profiling Manager info " + str, e10);
                        return;
                    }
                }
                throw new IllegalStateException("Missing required properties: trigger");
            default:
                s0 s0Var = (s0) this.f821c;
                ai.r rVar2 = (ai.r) this.f820b;
                Canvas canvas = (Canvas) obj;
                ai.d dVar2 = s0Var.f1640y;
                RectF rectF = dVar2.M;
                WeakHashMap weakHashMap = dVar2.N;
                Paint paint = dVar2.f1143c;
                long b10 = ai.d.b();
                int i7 = 0;
                while (i7 < rVar2.getChildCount()) {
                    View childAt = rVar2.getChildAt(i7);
                    if (!(childAt instanceof ai.q) || childAt.getVisibility() != 0) {
                        rVar = rVar2;
                    } else {
                        if (!weakHashMap.containsKey(childAt)) {
                            weakHashMap.put(childAt, Boolean.TRUE);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            f11 = 2.5f;
                            gradientDrawable.setColor(-1);
                            gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(10.0f));
                            f10 = 10.0f;
                            rVar = rVar2;
                            childAt.setBackground(new RippleDrawable(ColorStateList.valueOf(788529151), null, new InsetDrawable((Drawable) gradientDrawable, (int) org.telegram.messenger.g0.N(2.5f))));
                        } else {
                            rVar = rVar2;
                            f10 = 10.0f;
                            f11 = 2.5f;
                        }
                        String key = ((ai.q) childAt).getKey();
                        if (key != null && (fArr = (float[]) dVar2.f1149n.get(key)) != null) {
                            float c10 = ai.d.c(fArr, b10);
                            if (c10 > 0.004f) {
                                float translationX = childAt.getTranslationX() + childAt.getLeft();
                                float translationY = childAt.getTranslationY() + childAt.getTop();
                                float N = (int) org.telegram.messenger.g0.N(f11);
                                dVar = dVar2;
                                rectF.set(translationX + N, translationY + N, (translationX + childAt.getWidth()) - N, (translationY + childAt.getHeight()) - N);
                                if (!childAt.isPressed()) {
                                    paint.setColor(788529151);
                                    paint.setAlpha((int) (Color.alpha(788529151) * c10));
                                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), paint);
                                }
                                i7++;
                                rVar2 = rVar;
                                dVar2 = dVar;
                            }
                        }
                    }
                    dVar = dVar2;
                    i7++;
                    rVar2 = rVar;
                    dVar2 = dVar;
                }
                if (!s0Var.d.I.isEmpty()) {
                    s0Var.f1640y.invalidate();
                    return;
                }
                return;
        }
    }

    public Consumer andThen(Consumer consumer) {
        int i7 = this.f819a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
