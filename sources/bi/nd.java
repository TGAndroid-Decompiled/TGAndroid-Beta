package bi;

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
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.xq;
public final class nd extends View implements te.b {
    public final int f4437a = 0;
    public final Object f4438b;
    public Object f4439c;
    public Object d;
    public Object f4440e;
    public Object f4441f;
    public final Object h;

    public nd(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = f6Var;
        this.f4439c = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
        this.f4438b = new Paint(1);
        this.f4440e = new Paint(1);
        this.f4441f = new my0(org.telegram.messenger.id.M0(2131745039, null), 14.16f, org.telegram.messenger.g0.o());
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
        canvas.translate(f10 - (intrinsicWidth / 2.0f), f11 - (intrinsicHeight / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override
    public void F(float f10, int i7) {
        if (i7 == 1 && f10 == 1.0f) {
            this.d = null;
        }
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    public void b(boolean z9, boolean z10) {
        float f10;
        te.a aVar = (te.a) this.f4440e;
        Drawable drawable = (Drawable) this.f4439c;
        if (drawable == null) {
            if (z9) {
                aVar.a(true, false);
            }
        } else if (drawable instanceof org.telegram.ui.ActionBar.y1) {
            org.telegram.ui.ActionBar.y1 y1Var = (org.telegram.ui.ActionBar.y1) drawable;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            y1Var.c(z10, f10);
        } else {
            aVar.a(z9, z10);
        }
    }

    public void c(Drawable drawable) {
        te.c cVar = (te.c) this.f4441f;
        cVar.b();
        cVar.c(1.0f);
        this.d = null;
        Drawable drawable2 = (Drawable) this.f4439c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4439c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (!((org.telegram.ui.ActionBar.y4) this.h).G) {
                ((te.a) this.f4440e).a(false, false);
            }
        }
        d();
        invalidate();
    }

    public void d() {
        org.telegram.ui.ActionBar.y4 y4Var = (org.telegram.ui.ActionBar.y4) this.h;
        setBackground(org.telegram.ui.ActionBar.k6.h0(y4Var.f28793h0, 1, -1));
        Drawable drawable = (Drawable) this.f4439c;
        if (drawable instanceof org.telegram.ui.ActionBar.y1) {
            ((org.telegram.ui.ActionBar.y1) drawable).a(y4Var.f28791f0);
            ((org.telegram.ui.ActionBar.y1) ((Drawable) this.f4439c)).b(y4Var.f28792g0);
        } else if (drawable instanceof org.telegram.ui.ActionBar.r4) {
            ((org.telegram.ui.ActionBar.r4) drawable).f28472j = y4Var.f28791f0;
        } else if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(y4Var.f28791f0, PorterDuff.Mode.SRC_IN));
        }
        ((Drawable) this.f4438b).setColorFilter(new PorterDuffColorFilter(y4Var.f28792g0, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float[] fArr;
        switch (this.f4437a) {
            case 0:
                Matrix matrix = (Matrix) this.d;
                matrix.reset();
                matrix.postTranslate(org.telegram.messenger.g0.L(14.0f), 0.0f);
                matrix.postScale((getWidth() - org.telegram.messenger.g0.L(28.0f)) / 255.0f, 1.0f);
                LinearGradient linearGradient = (LinearGradient) this.f4439c;
                linearGradient.setLocalMatrix(matrix);
                Paint paint = (Paint) this.f4438b;
                paint.setShader(linearGradient);
                my0 my0Var = (my0) this.f4441f;
                float L = my0Var.f36147c + org.telegram.messenger.g0.L(30.0f);
                Paint paint2 = (Paint) this.f4440e;
                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27853d7, (org.telegram.ui.ActionBar.f6) this.h));
                canvas.drawRect(org.telegram.messenger.g0.L(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - L) / 2.0f) - org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, paint2);
                canvas.drawRect(org.telegram.messenger.g0.L(8.0f) + ((getWidth() + L) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - org.telegram.messenger.g0.L(24.0f), getHeight() / 2.0f, paint2);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set((getWidth() - L) / 2.0f, 0.0f, (getWidth() + L) / 2.0f, getHeight());
                canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
                ((my0) this.f4441f).c((getWidth() - my0Var.f36147c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.d;
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    try {
                        fArr = (float[]) this.f4440e;
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
                            fi.f2 f2Var = (fi.f2) obj;
                            int i12 = f2Var.f11952e - 1;
                            float[] fArr2 = (float[]) this.f4440e;
                            float f10 = fArr2[i12];
                            if (f10 > 0.0f) {
                                fArr2[i12] = f10 + org.telegram.messenger.g0.L(10.0f);
                            }
                            float[] fArr3 = (float[]) this.f4440e;
                            fArr3[i12] = fArr3[i12] + f2Var.h.e(false, f2Var.f11950b);
                        }
                        int size2 = arrayList.size();
                        while (i7 < size2) {
                            Object obj2 = arrayList.get(i7);
                            i7++;
                            fi.f2 f2Var2 = (fi.f2) obj2;
                            f2Var2.a(canvas, com.google.android.recaptcha.internal.a.A((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), ((float[]) this.f4440e)[f2Var2.f11952e - 1], 2.0f, getPaddingLeft()) + f2Var2.d, org.telegram.messenger.k5.D(48.0f, f2Var2.f11952e - 1, org.telegram.messenger.g0.L(12.0f)));
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
        switch (this.f4437a) {
            case 1:
                super.onAttachedToWindow();
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((fi.f2) obj).b(true);
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f4437a) {
            case 1:
                super.onDetachedFromWindow();
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((fi.f2) obj).b(false);
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
        switch (this.f4437a) {
            case 2:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f11 = ((te.a) this.f4440e).f55487e;
                float f12 = ((te.c) this.f4441f).f55493f;
                Drawable drawable = (Drawable) this.d;
                if (drawable != null && f12 < 0.5f) {
                    float C = com.google.android.recaptcha.internal.a.C(f12, 2.0f, 1.0f, 1.0f - f11);
                    canvas2 = canvas;
                    a(canvas2, drawable, width, height, C, 0.0f);
                } else {
                    Drawable drawable2 = (Drawable) this.f4439c;
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
                    a(canvas2, (Drawable) this.f4438b, width, height, f11, (1.0f - f11) * 90.0f);
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
        switch (this.f4437a) {
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
                    fi.f2 f2Var = (fi.f2) obj;
                    f2Var.d = f10;
                    float L = f2Var.f11950b + org.telegram.messenger.g0.L(10.0f) + f10;
                    if (L > paddingLeft) {
                        i12++;
                        f2Var.d = 0.0f;
                        f10 = f2Var.f11950b + org.telegram.messenger.g0.L(10.0f) + 0.0f;
                    } else {
                        f10 = L;
                    }
                    f2Var.f11952e = i12;
                }
                float[] fArr = (float[]) this.f4440e;
                if (fArr != null && fArr.length == i12) {
                    Arrays.fill(fArr, 0.0f);
                } else {
                    this.f4440e = new float[i12];
                }
                int size3 = arrayList.size();
                while (i11 < size3) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    fi.f2 f2Var2 = (fi.f2) obj2;
                    int i14 = f2Var2.f11952e - 1;
                    float[] fArr2 = (float[]) this.f4440e;
                    float f11 = fArr2[i14];
                    if (f11 > 0.0f) {
                        fArr2[i14] = f11 + org.telegram.messenger.g0.L(10.0f);
                    }
                    float[] fArr3 = (float[]) this.f4440e;
                    fArr3[i14] = fArr3[i14] + f2Var2.f11950b;
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
        fi.f2 f2Var;
        fi.c1 c1Var;
        boolean z9;
        switch (this.f4437a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        f2Var = (fi.f2) obj;
                        if (f2Var.f11953f.contains(motionEvent.getX(), motionEvent.getY())) {
                        }
                    } else {
                        f2Var = null;
                    }
                }
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    fi.f2 f2Var2 = (fi.f2) obj2;
                    if (f2Var2 != f2Var) {
                        f2Var2.f11954g.c(false);
                    }
                }
                if (f2Var != null) {
                    org.telegram.ui.Components.ic icVar = f2Var.f11954g;
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    icVar.c(z9);
                }
                if (motionEvent.getAction() == 1 && f2Var != null && (c1Var = (fi.c1) this.f4441f) != null) {
                    c1Var.a(Integer.valueOf(f2Var.f11949a));
                }
                if (f2Var == null) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f4437a) {
            case 2:
                super.setAlpha(f10);
                ((org.telegram.ui.ActionBar.y4) this.h).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f10) {
        switch (this.f4437a) {
            case 2:
                super.setTranslationX(f10);
                ((org.telegram.ui.ActionBar.y4) this.h).invalidate();
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f4437a) {
            case 2:
                if (drawable != ((Drawable) this.f4439c) && drawable != ((Drawable) this.d) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public nd(org.telegram.ui.ActionBar.y4 y4Var, Context context) {
        super(context);
        this.h = y4Var;
        xq xqVar = xq.h;
        this.f4440e = new te.a(0, this, xqVar, 380L, false);
        this.f4441f = new te.c(1, this, xqVar, 380L, 1.0f);
        this.f4438b = context.getDrawable(2131231241).mutate();
        d();
    }

    public nd(fi.k2 k2Var, Context context) {
        super(context);
        this.h = k2Var;
        Paint paint = new Paint(1);
        this.f4438b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f4439c = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(org.telegram.messenger.g0.N(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        setPadding(0, 0, 0, 0);
        if (k2Var.J0(4)) {
            fi.g2 g2Var = new fi.g2(this, 4, 2131232200, org.telegram.messenger.id.M0(2131744446, null));
            int i7 = fi.k2.f12251y1;
            if (!p10.i(k2Var.f28616a).q()) {
                Drawable mutate = getContext().getResources().getDrawable(2131232243).mutate();
                g2Var.f12057j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.r1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                g2Var.f12061n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(g2Var);
        }
        if (k2Var.J0(0)) {
            arrayList.add(new fi.g2(this, 0, 2131231648, org.telegram.messenger.id.M0(2131744445, null)));
        }
        if (k2Var.J0(5)) {
            fi.sb sbVar = fi.tb.f12867b;
            fi.g2[] g2VarArr = {null};
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sbVar == null ? "🌤" : sbVar.f12823c);
            sb2.append(" ");
            sb2.append(sbVar == null ? fi.tb.a() ? "24°C" : "72°F" : sbVar.a());
            CharSequence m10 = org.telegram.messenger.i6.m(sb2.toString(), textPaint.getFontMetricsInt(), false, null, 0);
            SpannableStringBuilder spannableStringBuilder = m10;
            if (qp.s1(k2Var.f28616a).W5) {
                spannableStringBuilder = m10;
                spannableStringBuilder = m10;
                if (c8.ia.d("android.permission.ACCESS_COARSE_LOCATION") && sbVar == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("___");
                    spannableStringBuilder2.setSpan(new b80(org.telegram.messenger.g0.L(68.0f), this), 0, spannableStringBuilder2.length(), 33);
                    g2VarArr[0] = new fi.g2(this, spannableStringBuilder2);
                    c8.ia.c(2131624119, 2131747303, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new b9(3, new b9(2, new ai.f1(8, this, g2VarArr), false), false));
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
            fi.g2 g2Var2 = g2VarArr[0];
            arrayList.add(g2Var2 == null ? new fi.g2(this, spannableStringBuilder) : g2Var2);
        }
        if (k2Var.J0(1)) {
            arrayList.add(new fi.g2(this, 1, 2131231188, org.telegram.messenger.id.M0(2131744447, null)));
        }
        if (k2Var.J0(2)) {
            arrayList.add(new fi.g2(this, 2, 2131231146, org.telegram.messenger.id.M0(2131744444, null)));
        }
        if (k2Var.J0(3)) {
            arrayList.add(new fi.i2(this));
        }
    }
}
