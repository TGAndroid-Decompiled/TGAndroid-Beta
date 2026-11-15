package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;
public final class ub extends View implements te.b {
    public final int f9562a = 0;
    public final Object f9563b;
    public Object f9564c;
    public Object d;
    public Object f9565e;
    public Object f9566f;
    public final Object h;

    public ub(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = e6Var;
        this.f9564c = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
        this.f9563b = new Paint(1);
        this.f9565e = new Paint(1);
        this.f9566f = new oy0(hd.M0(2131745036, null), 14.16f, org.telegram.messenger.g0.o());
    }

    public static void a(Canvas canvas, Drawable drawable, float f10, float f11, float f12, float f13) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            intrinsicWidth = org.telegram.messenger.g0.L(24.0f);
            intrinsicHeight = intrinsicWidth;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.setAlpha((int) (255.0f * f12));
        canvas.save();
        canvas.rotate(f13, f10, f11);
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f12);
        canvas.scale(T1, T1, f10, f11);
        i20.j(intrinsicHeight, 2.0f, f11, f10 - (intrinsicWidth / 2.0f), canvas);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override
    public void E(float f10, int i7) {
        if (i7 == 1 && f10 == 1.0f) {
            this.d = null;
        }
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    public void b(boolean z10, boolean z11) {
        float f10;
        te.a aVar = (te.a) this.f9565e;
        Drawable drawable = (Drawable) this.f9564c;
        if (drawable == null) {
            if (z10) {
                aVar.a(true, false);
            }
        } else if (drawable instanceof org.telegram.ui.ActionBar.x1) {
            org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) drawable;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            x1Var.c(z11, f10);
        } else {
            aVar.a(z10, z11);
        }
    }

    public void c(Drawable drawable) {
        te.c cVar = (te.c) this.f9566f;
        cVar.b();
        cVar.c(1.0f);
        this.d = null;
        Drawable drawable2 = (Drawable) this.f9564c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9564c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (!((org.telegram.ui.ActionBar.w4) this.h).H) {
                ((te.a) this.f9565e).a(false, false);
            }
        }
        d();
        invalidate();
    }

    public void d() {
        org.telegram.ui.ActionBar.w4 w4Var = (org.telegram.ui.ActionBar.w4) this.h;
        setBackground(org.telegram.ui.ActionBar.j6.h0(w4Var.f29819i0, 1, -1));
        Drawable drawable = (Drawable) this.f9564c;
        if (drawable instanceof org.telegram.ui.ActionBar.x1) {
            ((org.telegram.ui.ActionBar.x1) drawable).a(w4Var.f29817g0);
            ((org.telegram.ui.ActionBar.x1) ((Drawable) this.f9564c)).b(w4Var.f29818h0);
        } else if (drawable instanceof org.telegram.ui.ActionBar.p4) {
            ((org.telegram.ui.ActionBar.p4) drawable).f29483j = w4Var.f29817g0;
        } else if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(w4Var.f29817g0, PorterDuff.Mode.SRC_IN));
        }
        ((Drawable) this.f9563b).setColorFilter(new PorterDuffColorFilter(w4Var.f29818h0, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float[] fArr;
        switch (this.f9562a) {
            case 0:
                Matrix matrix = (Matrix) this.d;
                matrix.reset();
                matrix.postTranslate(org.telegram.messenger.g0.L(14.0f), 0.0f);
                matrix.postScale((getWidth() - org.telegram.messenger.g0.L(28.0f)) / 255.0f, 1.0f);
                LinearGradient linearGradient = (LinearGradient) this.f9564c;
                linearGradient.setLocalMatrix(matrix);
                Paint paint = (Paint) this.f9563b;
                paint.setShader(linearGradient);
                oy0 oy0Var = (oy0) this.f9566f;
                float L = oy0Var.f38103c + org.telegram.messenger.g0.L(30.0f);
                Paint paint2 = (Paint) this.f9565e;
                paint2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28850d7, (org.telegram.ui.ActionBar.e6) this.h));
                canvas.drawRect(org.telegram.messenger.g0.L(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - L) / 2.0f) - org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, paint2);
                canvas.drawRect(org.telegram.messenger.g0.L(8.0f) + ((getWidth() + L) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - org.telegram.messenger.g0.L(24.0f), getHeight() / 2.0f, paint2);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set((getWidth() - L) / 2.0f, 0.0f, (getWidth() + L) / 2.0f, getHeight());
                canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
                ((oy0) this.f9566f).c((getWidth() - oy0Var.f38103c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.d;
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    try {
                        fArr = (float[]) this.f9565e;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (i10 < fArr.length) {
                        fArr[i10] = 0.0f;
                        i10++;
                    } else {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            hi.e2 e2Var = (hi.e2) obj;
                            int i12 = e2Var.f14231e - 1;
                            float[] fArr2 = (float[]) this.f9565e;
                            float f10 = fArr2[i12];
                            if (f10 > 0.0f) {
                                fArr2[i12] = f10 + org.telegram.messenger.g0.L(10.0f);
                            }
                            float[] fArr3 = (float[]) this.f9565e;
                            fArr3[i12] = fArr3[i12] + e2Var.h.e(false, e2Var.f14229b);
                        }
                        int size2 = arrayList.size();
                        while (i7 < size2) {
                            Object obj2 = arrayList.get(i7);
                            i7++;
                            hi.e2 e2Var2 = (hi.e2) obj2;
                            e2Var2.a(canvas, com.google.android.gms.internal.vision.e2.A((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), ((float[]) this.f9565e)[e2Var2.f14231e - 1], 2.0f, getPaddingLeft()) + e2Var2.d, org.telegram.messenger.k5.D(48.0f, e2Var2.f14231e - 1, org.telegram.messenger.g0.L(12.0f)));
                        }
                        return;
                    }
                }
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f9562a) {
            case 1:
                super.onAttachedToWindow();
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((hi.e2) obj).b(true);
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f9562a) {
            case 1:
                super.onDetachedFromWindow();
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((hi.e2) obj).b(false);
                }
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        switch (this.f9562a) {
            case 2:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f11 = ((te.a) this.f9565e).f57085e;
                float f12 = ((te.c) this.f9566f).f57091f;
                Drawable drawable = (Drawable) this.d;
                if (drawable != null && f12 < 0.5f) {
                    float C = com.google.android.gms.internal.vision.e2.C(f12, 2.0f, 1.0f, 1.0f - f11);
                    canvas2 = canvas;
                    a(canvas2, drawable, width, height, C, 0.0f);
                } else {
                    Drawable drawable2 = (Drawable) this.f9564c;
                    if (drawable2 != null && f11 < 1.0f) {
                        float f13 = 1.0f - f11;
                        float f14 = (f12 - 0.5f) * 2.0f;
                        if (drawable == null) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        canvas2 = canvas;
                        a(canvas2, drawable2, width, height, Math.min(1.0f, f14 + f10) * f13, (-90.0f) * f11);
                    } else {
                        canvas2 = canvas;
                    }
                }
                if (f11 > 0.0f) {
                    a(canvas2, (Drawable) this.f9563b, width, height, f11, (1.0f - f11) * 90.0f);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f9562a) {
            case 1:
                int size = View.MeasureSpec.getSize(i7);
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                ArrayList arrayList = (ArrayList) this.d;
                int size2 = arrayList.size();
                int i11 = 0;
                int i12 = 1;
                float f10 = 0.0f;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    hi.e2 e2Var = (hi.e2) obj;
                    e2Var.d = f10;
                    float L = e2Var.f14229b + org.telegram.messenger.g0.L(10.0f) + f10;
                    if (L > paddingLeft) {
                        i12++;
                        e2Var.d = 0.0f;
                        f10 = e2Var.f14229b + org.telegram.messenger.g0.L(10.0f) + 0.0f;
                    } else {
                        f10 = L;
                    }
                    e2Var.f14231e = i12;
                }
                float[] fArr = (float[]) this.f9565e;
                if (fArr != null && fArr.length == i12) {
                    Arrays.fill(fArr, 0.0f);
                } else {
                    this.f9565e = new float[i12];
                }
                int size3 = arrayList.size();
                while (i11 < size3) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    hi.e2 e2Var2 = (hi.e2) obj2;
                    int i14 = e2Var2.f14231e - 1;
                    float[] fArr2 = (float[]) this.f9565e;
                    float f11 = fArr2[i14];
                    if (f11 > 0.0f) {
                        fArr2[i14] = f11 + org.telegram.messenger.g0.L(10.0f);
                    }
                    float[] fArr3 = (float[]) this.f9565e;
                    fArr3[i14] = fArr3[i14] + e2Var2.f14229b;
                }
                setMeasuredDimension(size, org.telegram.messenger.k5.D(12.0f, i12 - 1, org.telegram.messenger.k5.D(36.0f, i12, org.telegram.messenger.g0.L(24.0f))));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        hi.e2 e2Var;
        hi.d1 d1Var;
        boolean z10;
        switch (this.f9562a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        e2Var = (hi.e2) obj;
                        if (e2Var.f14232f.contains(motionEvent.getX(), motionEvent.getY())) {
                        }
                    } else {
                        e2Var = null;
                    }
                }
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    hi.e2 e2Var2 = (hi.e2) obj2;
                    if (e2Var2 != e2Var) {
                        e2Var2.f14233g.c(false);
                    }
                }
                if (e2Var != null) {
                    org.telegram.ui.Components.dc dcVar = e2Var.f14233g;
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dcVar.c(z10);
                }
                if (motionEvent.getAction() == 1 && e2Var != null && (d1Var = (hi.d1) this.f9566f) != null) {
                    d1Var.a(Integer.valueOf(e2Var.f14228a));
                }
                if (e2Var == null) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f9562a) {
            case 2:
                super.setAlpha(f10);
                ((org.telegram.ui.ActionBar.w4) this.h).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f10) {
        switch (this.f9562a) {
            case 2:
                super.setTranslationX(f10);
                ((org.telegram.ui.ActionBar.w4) this.h).invalidate();
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f9562a) {
            case 2:
                if (drawable != ((Drawable) this.f9564c) && drawable != ((Drawable) this.d) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public ub(org.telegram.ui.ActionBar.w4 w4Var, Context context) {
        super(context);
        this.h = w4Var;
        er erVar = er.h;
        this.f9565e = new te.a(0, this, erVar, 380L, false);
        this.f9566f = new te.c(1, this, erVar, 380L, 1.0f);
        this.f9563b = context.getDrawable(2131231241).mutate();
        d();
    }

    public ub(hi.i2 i2Var, Context context) {
        super(context);
        this.h = i2Var;
        Paint paint = new Paint(1);
        this.f9563b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f9564c = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(org.telegram.messenger.g0.N(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        setPadding(0, 0, 0, 0);
        if (i2Var.J0(4)) {
            hi.f2 f2Var = new hi.f2(this, 4, 2131232201, hd.M0(2131744443, null));
            int i7 = hi.i2.C1;
            if (!m10.i(i2Var.f29679a).q()) {
                Drawable mutate = getContext().getResources().getDrawable(2131232244).mutate();
                f2Var.f14263j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.r1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                f2Var.f14267n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(f2Var);
        }
        if (i2Var.J0(0)) {
            arrayList.add(new hi.f2(this, 0, 2131231648, hd.M0(2131744442, null)));
        }
        if (i2Var.J0(5)) {
            hi.pb pbVar = hi.qb.f14934b;
            hi.f2[] f2VarArr = {null};
            StringBuilder sb2 = new StringBuilder();
            sb2.append(pbVar == null ? "🌤" : pbVar.f14885c);
            sb2.append(" ");
            sb2.append(pbVar == null ? hi.qb.a() ? "24°C" : "72°F" : pbVar.a());
            CharSequence m10 = org.telegram.messenger.j6.m(sb2.toString(), textPaint.getFontMetricsInt(), false, null, 0);
            SpannableStringBuilder spannableStringBuilder = m10;
            if (np.s1(i2Var.f29679a).X5) {
                spannableStringBuilder = m10;
                spannableStringBuilder = m10;
                if (c8.ka.d("android.permission.ACCESS_COARSE_LOCATION") && pbVar == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("___");
                    spannableStringBuilder2.setSpan(new e80(org.telegram.messenger.g0.L(68.0f), this), 0, spannableStringBuilder2.length(), 33);
                    f2VarArr[0] = new hi.f2(this, spannableStringBuilder2);
                    c8.ka.c(2131624120, 2131747302, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ai.u2(4, new ai.u2(3, new ai.v1(13, this, f2VarArr), false), false));
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
            hi.f2 f2Var2 = f2VarArr[0];
            arrayList.add(f2Var2 == null ? new hi.f2(this, spannableStringBuilder) : f2Var2);
        }
        if (i2Var.J0(1)) {
            arrayList.add(new hi.f2(this, 1, 2131231188, hd.M0(2131744444, null)));
        }
        if (i2Var.J0(2)) {
            arrayList.add(new hi.f2(this, 2, 2131231146, hd.M0(2131744441, null)));
        }
        if (i2Var.J0(3)) {
            arrayList.add(new hi.g2(this));
        }
    }
}
