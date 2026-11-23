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
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.xy0;
public final class yb extends View implements te.b {
    public final int f10081a = 0;
    public final Object f10082b;
    public Object f10083c;
    public Object d;
    public Object f10084e;
    public Object f10085f;
    public final Object h;

    public yb(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = h6Var;
        this.f10083c = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
        this.f10082b = new Paint(1);
        this.f10084e = new Paint(1);
        this.f10085f = new xy0(hd.N0(2131744795, null), 14.16f, org.telegram.messenger.g0.o());
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
        o10.k(intrinsicHeight, 2.0f, f11, f10 - (intrinsicWidth / 2.0f), canvas);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override
    public void D(float f10, int i7) {
        if (i7 == 1 && f10 == 1.0f) {
            this.d = null;
        }
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    public void b(boolean z10, boolean z11) {
        float f10;
        te.a aVar = (te.a) this.f10084e;
        Drawable drawable = (Drawable) this.f10083c;
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
        te.c cVar = (te.c) this.f10085f;
        cVar.b();
        cVar.c(1.0f);
        this.d = null;
        Drawable drawable2 = (Drawable) this.f10083c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f10083c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (!((org.telegram.ui.ActionBar.z4) this.h).H) {
                ((te.a) this.f10084e).a(false, false);
            }
        }
        d();
        invalidate();
    }

    public void d() {
        org.telegram.ui.ActionBar.z4 z4Var = (org.telegram.ui.ActionBar.z4) this.h;
        setBackground(org.telegram.ui.ActionBar.m6.h0(z4Var.f30301i0, 1, -1));
        Drawable drawable = (Drawable) this.f10083c;
        if (drawable instanceof org.telegram.ui.ActionBar.x1) {
            ((org.telegram.ui.ActionBar.x1) drawable).a(z4Var.f30299g0);
            ((org.telegram.ui.ActionBar.x1) ((Drawable) this.f10083c)).b(z4Var.f30300h0);
        } else if (drawable instanceof org.telegram.ui.ActionBar.s4) {
            ((org.telegram.ui.ActionBar.s4) drawable).f29962j = z4Var.f30299g0;
        } else if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(z4Var.f30299g0, PorterDuff.Mode.SRC_IN));
        }
        ((Drawable) this.f10082b).setColorFilter(new PorterDuffColorFilter(z4Var.f30300h0, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float[] fArr;
        switch (this.f10081a) {
            case 0:
                Matrix matrix = (Matrix) this.d;
                matrix.reset();
                matrix.postTranslate(org.telegram.messenger.g0.L(14.0f), 0.0f);
                matrix.postScale((getWidth() - org.telegram.messenger.g0.L(28.0f)) / 255.0f, 1.0f);
                LinearGradient linearGradient = (LinearGradient) this.f10083c;
                linearGradient.setLocalMatrix(matrix);
                Paint paint = (Paint) this.f10082b;
                paint.setShader(linearGradient);
                xy0 xy0Var = (xy0) this.f10085f;
                float L = xy0Var.f42224c + org.telegram.messenger.g0.L(30.0f);
                Paint paint2 = (Paint) this.f10084e;
                paint2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29348d7, (org.telegram.ui.ActionBar.h6) this.h));
                canvas.drawRect(org.telegram.messenger.g0.L(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - L) / 2.0f) - org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, paint2);
                canvas.drawRect(org.telegram.messenger.g0.L(8.0f) + ((getWidth() + L) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - org.telegram.messenger.g0.L(24.0f), getHeight() / 2.0f, paint2);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set((getWidth() - L) / 2.0f, 0.0f, (getWidth() + L) / 2.0f, getHeight());
                canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
                ((xy0) this.f10085f).c((getWidth() - xy0Var.f42224c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.d;
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    try {
                        fArr = (float[]) this.f10084e;
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
                            int i12 = e2Var.f14501e - 1;
                            float[] fArr2 = (float[]) this.f10084e;
                            float f10 = fArr2[i12];
                            if (f10 > 0.0f) {
                                fArr2[i12] = f10 + org.telegram.messenger.g0.L(10.0f);
                            }
                            float[] fArr3 = (float[]) this.f10084e;
                            fArr3[i12] = fArr3[i12] + e2Var.h.e(false, e2Var.f14499b);
                        }
                        int size2 = arrayList.size();
                        while (i7 < size2) {
                            Object obj2 = arrayList.get(i7);
                            i7++;
                            hi.e2 e2Var2 = (hi.e2) obj2;
                            e2Var2.a(canvas, com.google.android.gms.internal.vision.e2.A((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), ((float[]) this.f10084e)[e2Var2.f14501e - 1], 2.0f, getPaddingLeft()) + e2Var2.d, org.telegram.messenger.f3.D(48.0f, e2Var2.f14501e - 1, org.telegram.messenger.g0.L(12.0f)));
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
        switch (this.f10081a) {
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
        switch (this.f10081a) {
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
        switch (this.f10081a) {
            case 2:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f11 = ((te.a) this.f10084e).f57665e;
                float f12 = ((te.c) this.f10085f).f57671f;
                Drawable drawable = (Drawable) this.d;
                if (drawable != null && f12 < 0.5f) {
                    float C = com.google.android.gms.internal.vision.e2.C(f12, 2.0f, 1.0f, 1.0f - f11);
                    canvas2 = canvas;
                    a(canvas2, drawable, width, height, C, 0.0f);
                } else {
                    Drawable drawable2 = (Drawable) this.f10083c;
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
                    a(canvas2, (Drawable) this.f10082b, width, height, f11, (1.0f - f11) * 90.0f);
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
        switch (this.f10081a) {
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
                    float L = e2Var.f14499b + org.telegram.messenger.g0.L(10.0f) + f10;
                    if (L > paddingLeft) {
                        i12++;
                        e2Var.d = 0.0f;
                        f10 = e2Var.f14499b + org.telegram.messenger.g0.L(10.0f) + 0.0f;
                    } else {
                        f10 = L;
                    }
                    e2Var.f14501e = i12;
                }
                float[] fArr = (float[]) this.f10084e;
                if (fArr != null && fArr.length == i12) {
                    Arrays.fill(fArr, 0.0f);
                } else {
                    this.f10084e = new float[i12];
                }
                int size3 = arrayList.size();
                while (i11 < size3) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    hi.e2 e2Var2 = (hi.e2) obj2;
                    int i14 = e2Var2.f14501e - 1;
                    float[] fArr2 = (float[]) this.f10084e;
                    float f11 = fArr2[i14];
                    if (f11 > 0.0f) {
                        fArr2[i14] = f11 + org.telegram.messenger.g0.L(10.0f);
                    }
                    float[] fArr3 = (float[]) this.f10084e;
                    fArr3[i14] = fArr3[i14] + e2Var2.f14499b;
                }
                setMeasuredDimension(size, org.telegram.messenger.f3.D(12.0f, i12 - 1, org.telegram.messenger.f3.D(36.0f, i12, org.telegram.messenger.g0.L(24.0f))));
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
        switch (this.f10081a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        e2Var = (hi.e2) obj;
                        if (e2Var.f14502f.contains(motionEvent.getX(), motionEvent.getY())) {
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
                        e2Var2.f14503g.c(false);
                    }
                }
                if (e2Var != null) {
                    org.telegram.ui.Components.mc mcVar = e2Var.f14503g;
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    mcVar.c(z10);
                }
                if (motionEvent.getAction() == 1 && e2Var != null && (d1Var = (hi.d1) this.f10085f) != null) {
                    d1Var.a(Integer.valueOf(e2Var.f14498a));
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
        switch (this.f10081a) {
            case 2:
                super.setAlpha(f10);
                ((org.telegram.ui.ActionBar.z4) this.h).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f10) {
        switch (this.f10081a) {
            case 2:
                super.setTranslationX(f10);
                ((org.telegram.ui.ActionBar.z4) this.h).invalidate();
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f10081a) {
            case 2:
                if (drawable != ((Drawable) this.f10083c) && drawable != ((Drawable) this.d) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public yb(org.telegram.ui.ActionBar.z4 z4Var, Context context) {
        super(context);
        this.h = z4Var;
        nr nrVar = nr.h;
        this.f10084e = new te.a(0, this, nrVar, 380L, false);
        this.f10085f = new te.c(1, this, nrVar, 380L, 1.0f);
        this.f10082b = context.getDrawable(2131231241).mutate();
        d();
    }

    public yb(hi.i2 i2Var, Context context) {
        super(context);
        this.h = i2Var;
        Paint paint = new Paint(1);
        this.f10082b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f10083c = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(org.telegram.messenger.g0.N(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        setPadding(0, 0, 0, 0);
        if (i2Var.K0(4)) {
            hi.f2 f2Var = new hi.f2(this, 4, 2131232202, hd.N0(2131744202, null));
            int i7 = hi.i2.C1;
            if (!k10.i(i2Var.f30139a).q()) {
                Drawable mutate = getContext().getResources().getDrawable(2131232245).mutate();
                f2Var.f14594j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.r1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                f2Var.f14598n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(f2Var);
        }
        if (i2Var.K0(0)) {
            arrayList.add(new hi.f2(this, 0, 2131231649, hd.N0(2131744201, null)));
        }
        if (i2Var.K0(5)) {
            hi.qb qbVar = hi.rb.f15315b;
            hi.f2[] f2VarArr = {null};
            StringBuilder sb2 = new StringBuilder();
            sb2.append(qbVar == null ? "🌤" : qbVar.f15259c);
            sb2.append(" ");
            sb2.append(qbVar == null ? hi.rb.a() ? "24°C" : "72°F" : qbVar.a());
            CharSequence m10 = org.telegram.messenger.j6.m(sb2.toString(), textPaint.getFontMetricsInt(), false, null, 0);
            SpannableStringBuilder spannableStringBuilder = m10;
            if (np.u1(i2Var.f30139a).Z5) {
                spannableStringBuilder = m10;
                spannableStringBuilder = m10;
                if (c8.oa.d("android.permission.ACCESS_COARSE_LOCATION") && qbVar == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("___");
                    spannableStringBuilder2.setSpan(new r80(org.telegram.messenger.g0.L(68.0f), this), 0, spannableStringBuilder2.length(), 33);
                    f2VarArr[0] = new hi.f2(this, spannableStringBuilder2);
                    c8.oa.c(2131624120, 2131747108, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ai.n2(4, new ai.n2(3, new ai.r1(15, this, f2VarArr), false), false));
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
            hi.f2 f2Var2 = f2VarArr[0];
            arrayList.add(f2Var2 == null ? new hi.f2(this, spannableStringBuilder) : f2Var2);
        }
        if (i2Var.K0(1)) {
            arrayList.add(new hi.f2(this, 1, 2131231188, hd.N0(2131744203, null)));
        }
        if (i2Var.K0(2)) {
            arrayList.add(new hi.f2(this, 2, 2131231146, hd.N0(2131744200, null)));
        }
        if (i2Var.K0(3)) {
            arrayList.add(new hi.g2(this));
        }
    }
}
