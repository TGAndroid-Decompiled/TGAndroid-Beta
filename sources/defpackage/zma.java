package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.Dictation.DictationAsr;
public final class zma extends FrameLayout {
    public final String E;
    public String F;
    public final RectF G;
    public final RectF H;
    public final Path I;
    public final ln J;
    public final ln K;
    public final ln L;
    public final u51 M;
    public float N;
    public long O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public float U;
    public final String[] V;
    public final View W;
    public final String a;
    public e6a a0;
    public String b;
    public final Paint c;
    public final String d;
    public final boolean e;
    public final gn3 f;
    public final jh2 h;
    public final TextPaint n;
    public final TextPaint r;
    public final Paint s;
    public final Paint w;
    public final TextPaint x;
    public final String y;

    public zma(Context context, String str, String str2, String str3, boolean z) {
        super(context);
        gn3 gn3Var;
        String[] strArr;
        int i;
        float f;
        Paint paint = new Paint(1);
        this.c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.n = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.r = textPaint2;
        Paint paint2 = new Paint(1);
        this.s = paint2;
        this.w = new Paint(1);
        TextPaint textPaint3 = new TextPaint(1);
        this.x = textPaint3;
        String M0 = jb6.M0(2131744994, null);
        this.y = M0;
        this.E = jb6.M0(2131744961, null);
        this.F = M0;
        this.G = new RectF();
        this.H = new RectF();
        this.I = new Path();
        d53 d53Var = d53.h;
        ln lnVar = new ln(this, 0L, 300L, d53Var);
        this.J = lnVar;
        ln lnVar2 = new ln(this, 0L, 420L, d53Var);
        this.K = lnVar2;
        ln lnVar3 = new ln(this, 0L, 420L, d53Var);
        this.L = lnVar3;
        this.M = new u51(this);
        setWillNotDraw(false);
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.e = z;
        if (str != null) {
            gn3Var = DictationAsr.L(str);
        } else {
            gn3Var = null;
        }
        this.f = gn3Var;
        if (gn3Var != null) {
            strArr = gn3Var.d(str);
        } else {
            strArr = new String[0];
        }
        this.V = strArr;
        if (strArr.length > 1) {
            View view = new View(context);
            this.W = view;
            addView(view, new FrameLayout.LayoutParams(0, 0));
            this.b = un3.N(DictationAsr.g0(gn3Var, str));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gm.N(1.66f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
        }
        textPaint.setTextSize(gm.L(16.0f));
        textPaint2.setTextSize(gm.L(14.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(gm.N(2.0f));
        textPaint3.setTextSize(gm.L(14.0f));
        textPaint3.setTypeface(gm.o());
        jh2 jh2Var = new jh2(26, null, context);
        this.h = jh2Var;
        jh2Var.setDrawUnchecked(false);
        jh2Var.b(-1, -1, cmb.Ei);
        jh2Var.setDrawBackgroundAsArc(-1);
        if (jb6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        addView(jh2Var, qoe.d(26, 26.0f, i | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        jh2Var.setImportantForAccessibility(2);
        View view2 = this.W;
        if (view2 != null) {
            view2.setImportantForAccessibility(2);
        }
        setFocusable(true);
        c();
        lnVar.e(true, this.U);
        float f2 = 1.0f;
        if (b()) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        lnVar2.e(true, f);
        if (!this.Q && b()) {
            f2 = 0.0f;
        }
        lnVar3.e(true, f2);
    }

    public final void a() {
        if (this.Q) {
            return;
        }
        if (!this.P) {
            DictationAsr.s(this.f);
        } else if (this.R) {
            this.S = true;
            gn3 e0 = DictationAsr.e0(this.a);
            if (e0 != null && DictationAsr.y(e0)) {
                DictationAsr.t(e0, true);
            }
        }
        c();
    }

    public final boolean b() {
        if (this.P && !this.R && !this.Q) {
            return false;
        }
        return true;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zma.c():void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        boolean z;
        float f;
        float f2;
        float L2;
        float width;
        float L3;
        float L4;
        Canvas canvas2 = canvas;
        boolean z2 = jb6.a0;
        int w0 = cmb.w0(null, cmb.y6, false);
        int w02 = cmb.w0(null, cmb.Ei, false);
        float L5 = gm.L(25.0f);
        int w03 = cmb.w0(null, cmb.F6, false);
        TextPaint textPaint = this.n;
        textPaint.setColor(w03);
        TextPaint textPaint2 = this.r;
        textPaint2.setColor(w0);
        float measureText = textPaint.measureText(this.b);
        float L6 = L5 + gm.L(5.5f);
        String str = this.b;
        if (z2) {
            L = (getWidth() - gm.L(21.0f)) - measureText;
        } else {
            L = gm.L(21.0f);
        }
        canvas2.drawText(str, L, L6, textPaint);
        if (this.W != null) {
            Paint paint = this.c;
            paint.setColor(w0);
            if (z2) {
                L4 = ((getWidth() - gm.L(21.0f)) - measureText) - gm.L(12.0f);
            } else {
                L4 = gm.L(21.0f) + measureText + gm.L(12.0f);
            }
            float f3 = L4;
            canvas2.drawLine(f3 - gm.L(4.5f), L5 - gm.L(2.0f), f3, gm.L(2.5f) + L5, paint);
            canvas2 = canvas;
            canvas2.drawLine(f3, L5 + gm.L(2.5f), f3 + gm.L(4.5f), L5 - gm.L(2.0f), paint);
            measureText += gm.L(18.0f);
        }
        String str2 = this.d;
        if (str2 != null) {
            float measureText2 = textPaint2.measureText(str2);
            if (z2) {
                L3 = (((getWidth() - gm.L(21.0f)) - measureText) - gm.L(8.0f)) - measureText2;
            } else {
                L3 = gm.L(8.0f) + gm.L(21.0f) + measureText;
            }
            canvas2.drawText(str2, L3, L6, textPaint2);
        }
        float d = this.K.d(!b());
        if (!this.Q && b()) {
            z = false;
        } else {
            z = true;
        }
        float d2 = this.L.d(z);
        float e = this.J.e(false, this.U);
        this.h.setAlpha(d);
        if (d < 1.0f) {
            String str3 = this.F;
            TextPaint textPaint3 = this.x;
            float measureText3 = textPaint3.measureText(str3);
            f = 21.0f;
            float L7 = gm.L(28.0f) + measureText3;
            float L8 = gm.L(30.0f);
            if (z2) {
                width = gm.L(17.0f) + L7;
            } else {
                width = getWidth() - gm.L(17.0f);
            }
            float f4 = L8 / 2.0f;
            RectF rectF = this.H;
            rectF.set(width - L7, L5 - f4, width, L5 + f4);
            float f5 = 1.0f - d;
            float a = this.M.a(0.08f) * (1.0f - (d * 0.2f));
            canvas2.save();
            canvas2.scale(a, a, rectF.centerX(), rectF.centerY());
            int p1 = cmb.p1(f5, w02);
            Paint paint2 = this.w;
            paint2.setColor(p1);
            canvas2.drawRoundRect(rectF, f4, f4, paint2);
            int w04 = cmb.w0(null, cmb.Ii, false);
            canvas2.save();
            Path path = this.I;
            path.rewind();
            path.addRoundRect(rectF, f4, f4, Path.Direction.CW);
            canvas2.clipPath(path);
            float L9 = gm.L(16.0f);
            if (d2 < 1.0f) {
                textPaint3.setColor(cmb.p1((1.0f - d2) * f5, w04));
                canvas2.save();
                canvas2.translate(0.0f, (-d2) * L9);
                canvas2.scale(1.0f, 1.0f - (0.4f * d2), rectF.centerX(), rectF.centerY());
                canvas2.drawText(this.F, rectF.centerX() - (measureText3 / 2.0f), rectF.centerY() + gm.L(5.0f), textPaint3);
                canvas2.restore();
            }
            int i = (d2 > 0.0f ? 1 : (d2 == 0.0f ? 0 : -1));
            if (i > 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = this.O;
                if (j != 0) {
                    this.N = ((((float) (uptimeMillis - j)) * 0.36f) + this.N) % 360.0f;
                }
                this.O = uptimeMillis;
                float L10 = gm.L(8.0f);
                float A = td4.A(1.0f, d2, L9, rectF.centerY());
                RectF rectF2 = this.G;
                rectF2.set(rectF.centerX() - L10, A - L10, rectF.centerX() + L10, A + L10);
                int p12 = cmb.p1(d2 * f5, w04);
                Paint paint3 = this.s;
                paint3.setColor(p12);
                canvas2.drawArc(rectF2, this.N - 90.0f, Math.max(0.1f, Math.min(0.9f, e)) * 360.0f, false, paint3);
            }
            canvas.restore();
            canvas.restore();
            f2 = 0.0f;
            if (i > 0 || d > 0.0f) {
                invalidate();
            }
        } else {
            f = 21.0f;
            f2 = 0.0f;
            this.O = 0L;
        }
        if (this.e) {
            if (z2) {
                L2 = f2;
            } else {
                L2 = gm.L(f);
            }
            float height = getHeight() - 1;
            int width2 = getWidth();
            if (z2) {
                width2 -= gm.L(f);
            }
            canvas.drawLine(L2, height, width2, getHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder(this.b);
        String str = this.d;
        if (str != null) {
            sb.append(", ");
            sb.append(str);
        }
        boolean z = false;
        if (this.Q) {
            sb.append(", ");
            sb.append(jb6.a0(null, null, 2131745004, Integer.valueOf(Math.round(this.U * 100.0f))));
        } else if (!this.P) {
            sb.append(", ");
            sb.append(jb6.M0(2131745003, null));
        } else if (this.R) {
            sb.append(", ");
            sb.append(jb6.M0(2131745002, null));
        }
        accessibilityNodeInfo.setText(sb);
        if (this.P) {
            charSequence = "android.widget.CheckBox";
        } else {
            charSequence = "android.widget.Button";
        }
        accessibilityNodeInfo.setClassName(charSequence);
        accessibilityNodeInfo.setCheckable(this.P);
        if (this.P && this.T) {
            z = true;
        }
        accessibilityNodeInfo.setChecked(z);
        if (!this.P && !this.Q) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, this.y));
        }
        if (this.R) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296268, this.E));
        }
        if (this.W != null && this.a0 != null) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296269, jb6.M0(2131745001, null)));
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.W;
        if (view != null) {
            int measureText = (int) (this.n.measureText(this.b) + gm.L(18.0f));
            int L2 = gm.L(34.0f);
            int L3 = (gm.L(50.0f) - L2) / 2;
            if (jb6.a0) {
                L = kt6.y(21.0f, getWidth(), measureText);
            } else {
                L = gm.L(21.0f);
            }
            view.layout(L - gm.L(6.0f), L3, gm.L(6.0f) + L + measureText, L2 + L3);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f) + (this.e ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zma.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        e6a e6aVar;
        if (i == 2131296268 && this.R) {
            a();
            return true;
        } else if (i == 2131296269 && this.W != null && (e6aVar = this.a0) != null) {
            e6aVar.run();
            return true;
        } else {
            return super.performAccessibilityAction(i, bundle);
        }
    }
}
