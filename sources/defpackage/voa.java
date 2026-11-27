package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.Dictation.DictationAsr;
public final class voa extends FrameLayout {
    public final uj4 E;
    public final String F;
    public final String G;
    public String H;
    public final RectF I;
    public final RectF J;
    public final Path K;
    public final mm L;
    public final mm M;
    public final mm N;
    public final mm O;
    public final Path P;
    public final PathMeasure Q;
    public final Path R;
    public final Paint S;
    public long T;
    public final v41 U;
    public float V;
    public long W;
    public final String a;
    public boolean a0;
    public String b;
    public boolean b0;
    public Drawable c;
    public boolean c0;
    public final boolean d;
    public boolean d0;
    public String e;
    public boolean e0;
    public boolean f;
    public float f0;
    public final String[] g0;
    public final nm3 h;
    public final View h0;
    public ida i0;
    public final og2 n;
    public final TextPaint r;
    public final Paint s;
    public final Paint w;
    public final TextPaint x;
    public final TextPaint y;

    public voa(Context context, String str, String str2, boolean z, boolean z2) {
        super(context);
        nm3 nm3Var;
        String[] strArr;
        int i;
        float f;
        float f2;
        Paint paint = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.r = textPaint;
        Paint paint2 = new Paint(1);
        this.s = paint2;
        this.w = new Paint(1);
        TextPaint textPaint2 = new TextPaint(1);
        this.x = textPaint2;
        this.y = new TextPaint(1);
        uj4 uj4Var = new uj4(this);
        this.E = uj4Var;
        k43 k43Var = k43.h;
        mm mmVar = new mm(this, 0L, 320L, k43Var);
        String M0 = ob6.M0(2131744983, null);
        this.F = M0;
        this.G = ob6.M0(2131744929, null);
        this.H = M0;
        this.I = new RectF();
        this.J = new RectF();
        this.K = new Path();
        mm mmVar2 = new mm(this, 0L, 300L, k43Var);
        this.L = mmVar2;
        mm mmVar3 = new mm(this, 0L, 420L, k43Var);
        this.M = mmVar3;
        mm mmVar4 = new mm(this, 0L, 420L, k43Var);
        this.N = mmVar4;
        this.O = new mm(this, 0L, 380L, k43Var);
        this.P = new Path();
        this.Q = new PathMeasure();
        this.R = new Path();
        this.S = new Paint(1);
        this.U = new v41(this);
        setWillNotDraw(false);
        this.a = str;
        this.b = str2;
        this.d = z;
        this.f = z2;
        if (str != null) {
            nm3Var = DictationAsr.N(str);
        } else {
            nm3Var = null;
        }
        this.h = nm3Var;
        if (nm3Var != null) {
            strArr = nm3Var.d(str);
        } else {
            strArr = new String[0];
        }
        this.g0 = strArr;
        if (strArr.length > 1) {
            View view = new View(context);
            this.h0 = view;
            addView(view, new FrameLayout.LayoutParams(0, 0));
            this.b = bn3.R(DictationAsr.i0(nm3Var, str));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(hl.N(1.66f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
        }
        textPaint.setTextSize(hl.L(16.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(hl.N(2.0f));
        textPaint2.setTextSize(hl.L(14.0f));
        uj4Var.w(hl.L(14.0f));
        uj4Var.m(0.3f, 400L, 6.0f, k43Var);
        uj4Var.B = 0.2f;
        uj4Var.K = true;
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        uj4Var.b = i;
        textPaint2.setTypeface(hl.o());
        og2 og2Var = new og2(26, null, context);
        this.n = og2Var;
        og2Var.setDrawUnchecked(false);
        og2Var.b(-1, -1, aob.Fi);
        og2Var.setDrawBackgroundAsArc(-1);
        addView(og2Var, tre.d(26, 26.0f, (ob6.a0 ? 3 : 5) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        og2Var.setImportantForAccessibility(2);
        View view2 = this.h0;
        if (view2 != null) {
            view2.setImportantForAccessibility(2);
        }
        setFocusable(true);
        e();
        mmVar2.e(true, this.f0);
        float f3 = 1.0f;
        if (this.a0) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        mmVar.e(true, f);
        if (c()) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        mmVar3.e(true, f2);
        if (!this.b0 && !d() && c()) {
            f3 = 0.0f;
        }
        mmVar4.e(true, f3);
    }

    public final float a() {
        int i;
        TextPaint textPaint = this.r;
        textPaint.setTextSize(hl.L(16.0f));
        this.y.setTextSize(hl.L(14.0f));
        float measureText = textPaint.measureText(this.b);
        if (getWidth() > 0) {
            String str = this.F;
            TextPaint textPaint2 = this.x;
            float max = Math.max(textPaint2.measureText(str), textPaint2.measureText(this.G)) + hl.L(28.0f);
            int width = getWidth() - hl.L(21.0f);
            if (this.h0 != null) {
                i = hl.L(18.0f);
            } else {
                i = 0;
            }
            float L = (((width - i) - hl.L(21.0f)) - max) - hl.L(17.0f);
            if (measureText > L && L > 0.0f) {
                textPaint.setTextSize(Math.max(0.6f, L / measureText) * hl.L(16.0f));
                return textPaint.measureText(this.b);
            }
        }
        return measureText;
    }

    public final void b() {
        if (this.b0) {
            return;
        }
        if (!this.a0) {
            DictationAsr.t(this.h);
        } else if (this.c0) {
            this.d0 = true;
            nm3 g0 = DictationAsr.g0(this.a);
            if (g0 != null && DictationAsr.z(g0)) {
                DictationAsr.u(g0, true);
            }
        }
        e();
    }

    public final boolean c() {
        if (this.a0 && !this.c0 && !this.b0 && !d()) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        if (this.T != 0 && SystemClock.uptimeMillis() - this.T < 1800) {
            return true;
        }
        return false;
    }

    public final void e() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.voa.e():void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        float f;
        float f2;
        float L2;
        float f3;
        float L3;
        float width;
        boolean z;
        boolean z2;
        boolean z3;
        float f4;
        float L4;
        float width2;
        int i;
        float L5;
        boolean z4 = ob6.a0;
        int w0 = aob.w0(null, aob.Fi, false);
        if (this.h == null) {
            f = 25.0f;
            L = hl.L(25.0f);
        } else {
            L = hl.L(32.0f);
            f = 21.5f;
        }
        float L6 = hl.L(f);
        int i2 = aob.G6;
        int w02 = aob.w0(null, i2, false);
        TextPaint textPaint = this.r;
        textPaint.setColor(w02);
        int w03 = aob.w0(null, aob.z6, false);
        TextPaint textPaint2 = this.y;
        textPaint2.setColor(w03);
        float a = a();
        float textSize = ((textPaint.getTextSize() * hl.L(5.5f)) / hl.L(16.0f)) + L6;
        String str = this.b;
        if (z4) {
            f2 = 5.5f;
            L2 = (getWidth() - hl.L(21.0f)) - a;
        } else {
            f2 = 5.5f;
            L2 = hl.L(21.0f);
        }
        canvas.drawText(str, L2, textSize, textPaint);
        if (this.h0 != null) {
            Drawable drawable = this.c;
            if (drawable == null) {
                drawable = getContext().getResources().getDrawable(2131230871).mutate();
                this.c = drawable;
            }
            drawable.setColorFilter(new PorterDuffColorFilter(aob.w0(null, i2, false), PorterDuff.Mode.MULTIPLY));
            if (z4) {
                L5 = ((getWidth() - hl.L(21.0f)) - a) - hl.L(11.0f);
            } else {
                L5 = hl.L(21.0f) + a + hl.L(11.0f);
            }
            int L7 = hl.L(16.0f);
            float f5 = L7 / 2.0f;
            float f6 = L5 - f5;
            float f7 = L6 - f5;
            this.c.setBounds(Math.round(f6), Math.round(f7), Math.round(f6) + L7, Math.round(f7) + L7);
            this.c.draw(canvas);
        }
        if (c()) {
            f3 = 130.0f;
        } else {
            f3 = 64.0f;
        }
        float L8 = hl.L(f3);
        int color = textPaint2.getColor();
        uj4 uj4Var = this.E;
        uj4Var.u(color);
        if (z4) {
            L3 = L8;
        } else {
            L3 = hl.L(21.0f);
        }
        float L9 = hl.L(43.0f) - hl.L(12.0f);
        if (z4) {
            width = getWidth() - hl.L(21.0f);
        } else {
            width = getWidth() - L8;
        }
        uj4Var.o(L3, L9, width, hl.L(12.0f) + hl.L(43.0f));
        uj4Var.draw(canvas);
        float d = this.M.d(!c());
        if (!this.b0 && !d() && c()) {
            z = false;
        } else {
            z = true;
        }
        float d2 = this.N.d(z);
        float e = this.L.e(false, this.f0);
        if (this.T != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        float d3 = this.O.d(z2);
        this.n.setAlpha(d);
        if (d < 1.0f) {
            String str2 = this.H;
            TextPaint textPaint3 = this.x;
            float measureText = textPaint3.measureText(str2);
            float L10 = hl.L(30.0f);
            float R1 = hl.R1(hl.L(28.0f) + measureText, L10, d2);
            if (z4) {
                width2 = hl.L(17.0f) + R1;
            } else {
                width2 = getWidth() - hl.L(17.0f);
            }
            float f8 = L10 / 2.0f;
            RectF rectF = this.J;
            rectF.set(width2 - R1, L - f8, width2, L + f8);
            float f9 = 1.0f - (d * d);
            float a2 = this.U.a(0.08f) * (1.0f - d);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            int p1 = aob.p1(f9, w0);
            Paint paint = this.w;
            paint.setColor(p1);
            canvas.drawRoundRect(rectF, f8, f8, paint);
            int w04 = aob.w0(null, aob.Ji, false);
            canvas.save();
            Path path = this.K;
            path.rewind();
            path.addRoundRect(rectF, f8, f8, Path.Direction.CW);
            canvas.clipPath(path);
            float L11 = hl.L(16.0f);
            if (d2 < 1.0f) {
                textPaint3.setColor(aob.p1((1.0f - d2) * f9, w04));
                canvas.save();
                canvas.translate(0.0f, (-d2) * L11);
                z3 = z4;
                canvas.scale(1.0f, 1.0f - (0.4f * d2), rectF.centerX(), rectF.centerY());
                canvas.drawText(this.H, rectF.centerX() - (measureText / 2.0f), rectF.centerY() + hl.L(5.0f), textPaint3);
                canvas.restore();
            } else {
                z3 = z4;
            }
            int i3 = (d2 > 0.0f ? 1 : (d2 == 0.0f ? 0 : -1));
            if (i3 > 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                i = i3;
                long j = this.W;
                if (j != 0) {
                    this.V = ((((float) (uptimeMillis - j)) * 0.36f) + this.V) % 360.0f;
                }
                this.W = uptimeMillis;
                float L12 = hl.L(8.0f);
                float A = qd4.A(1.0f, d2, L11, rectF.centerY());
                float centerX = rectF.centerX() - L12;
                float f10 = A - L12;
                float centerX2 = rectF.centerX() + L12;
                float f11 = A + L12;
                RectF rectF2 = this.I;
                rectF2.set(centerX, f10, centerX2, f11);
                if (d3 < 1.0f) {
                    canvas.save();
                    float f12 = 1.0f - (d3 * 0.5f);
                    canvas.scale(f12, f12, rectF2.centerX(), rectF2.centerY());
                    int p12 = aob.p1((1.0f - d3) * d2 * f9, w04);
                    Paint paint2 = this.s;
                    paint2.setColor(p12);
                    canvas.drawArc(rectF2, this.V - 90.0f, Math.max(0.1f, Math.min(0.9f, e)) * 360.0f, false, paint2);
                    canvas.restore();
                }
                if (d3 > 0.0f) {
                    float centerX3 = rectF.centerX();
                    float centerY = rectF.centerY();
                    Path path2 = this.P;
                    path2.rewind();
                    path2.moveTo(centerX3 - hl.L(f2), hl.L(0.5f) + centerY);
                    path2.lineTo(centerX3 - hl.L(1.75f), hl.L(4.25f) + centerY);
                    path2.lineTo(centerX3 + hl.L(5.75f), centerY - hl.L(3.75f));
                    PathMeasure pathMeasure = this.Q;
                    pathMeasure.setPath(path2, false);
                    Path path3 = this.R;
                    path3.rewind();
                    pathMeasure.getSegment(0.0f, pathMeasure.getLength() * d3, path3, true);
                    Paint.Style style = Paint.Style.STROKE;
                    Paint paint3 = this.S;
                    paint3.setStyle(style);
                    paint3.setStrokeWidth(hl.N(2.33f));
                    paint3.setStrokeCap(Paint.Cap.ROUND);
                    paint3.setStrokeJoin(Paint.Join.ROUND);
                    paint3.setColor(aob.p1(f9, w04));
                    canvas.drawPath(path3, paint3);
                }
            } else {
                i = i3;
            }
            canvas.restore();
            canvas.restore();
            f4 = 0.0f;
            if (i > 0 || d > 0.0f || d3 > 0.0f) {
                invalidate();
            }
        } else {
            z3 = z4;
            f4 = 0.0f;
            this.W = 0L;
        }
        if (this.f) {
            if (z3) {
                L4 = f4;
            } else {
                L4 = hl.L(21.0f);
            }
            float height = getHeight() - 1;
            int width3 = getWidth();
            if (z3) {
                width3 -= hl.L(21.0f);
            }
            canvas.drawLine(L4, height, width3, getHeight() - 1, aob.j0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder(this.b);
        if (this.e != null && !this.a0) {
            sb.append(", ");
            sb.append(this.e);
        }
        boolean z = false;
        if (this.b0) {
            sb.append(", ");
            sb.append(ob6.a0(null, null, 2131744996, Integer.valueOf(Math.round(this.f0 * 100.0f))));
        } else if (!this.a0) {
            sb.append(", ");
            sb.append(ob6.M0(2131744995, null));
        } else if (this.c0) {
            sb.append(", ");
            sb.append(ob6.M0(2131744994, null));
        }
        accessibilityNodeInfo.setText(sb);
        if (this.a0) {
            charSequence = "android.widget.CheckBox";
        } else {
            charSequence = "android.widget.Button";
        }
        accessibilityNodeInfo.setClassName(charSequence);
        accessibilityNodeInfo.setCheckable(this.a0);
        if (this.a0 && this.e0) {
            z = true;
        }
        accessibilityNodeInfo.setChecked(z);
        if (!this.a0 && !this.b0) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, this.F));
        }
        if (this.c0) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296268, this.G));
        }
        if (this.h0 != null && this.i0 != null) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296269, ob6.M0(2131744993, null)));
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int L;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.h0;
        if (view != null) {
            int a = (int) (a() + hl.L(18.0f));
            int L2 = hl.L(34.0f);
            if (this.h == null) {
                f = 25.0f;
            } else {
                f = 21.5f;
            }
            int round = Math.round(hl.L(f) - (L2 / 2.0f));
            if (ob6.a0) {
                L = qu6.x(21.0f, getWidth(), a);
            } else {
                L = hl.L(21.0f);
            }
            view.layout(L - hl.L(6.0f), round, hl.L(6.0f) + L + a, L2 + round);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (this.h == null) {
            f = 50.0f;
        } else {
            f = 64.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(hl.L(f) + (this.f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.voa.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        ida idaVar;
        if (i == 2131296268 && this.c0) {
            b();
            return true;
        } else if (i == 2131296269 && this.h0 != null && (idaVar = this.i0) != null) {
            idaVar.run();
            return true;
        } else {
            return super.performAccessibilityAction(i, bundle);
        }
    }
}
