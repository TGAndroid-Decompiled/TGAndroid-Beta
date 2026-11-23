package ai;

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
import c8.na;
import org.telegram.messenger.f3;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.op;
import org.telegram.ui.Dictation.DictationAsr;
public final class p2 extends FrameLayout {
    public final String E;
    public String F;
    public final RectF G;
    public final RectF H;
    public final Path I;
    public final d6 J;
    public final d6 K;
    public final d6 L;
    public final mc M;
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
    public final String f1477a;
    public a1.e f1478a0;
    public String f1479b;
    public final Paint f1480c;
    public final String d;
    public final boolean f1481e;
    public final p f1482f;
    public final op h;
    public final TextPaint f1483n;
    public final TextPaint f1484r;
    public final Paint f1485s;
    public final Paint f1486w;
    public final TextPaint f1487x;
    public final String f1488y;

    public p2(Context context, String str, String str2, String str3, boolean z10) {
        super(context);
        p pVar;
        String[] strArr;
        int i7;
        float f10;
        Paint paint = new Paint(1);
        this.f1480c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f1483n = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f1484r = textPaint2;
        Paint paint2 = new Paint(1);
        this.f1485s = paint2;
        this.f1486w = new Paint(1);
        TextPaint textPaint3 = new TextPaint(1);
        this.f1487x = textPaint3;
        String N0 = hd.N0(2131745064, null);
        this.f1488y = N0;
        this.E = hd.N0(2131745031, null);
        this.F = N0;
        this.G = new RectF();
        this.H = new RectF();
        this.I = new Path();
        nr nrVar = nr.h;
        d6 d6Var = new d6(this, 0L, 300L, nrVar);
        this.J = d6Var;
        d6 d6Var2 = new d6(this, 0L, 420L, nrVar);
        this.K = d6Var2;
        d6 d6Var3 = new d6(this, 0L, 420L, nrVar);
        this.L = d6Var3;
        this.M = new mc(this);
        setWillNotDraw(false);
        this.f1477a = str;
        this.f1479b = str2;
        this.d = str3;
        this.f1481e = z10;
        if (str != null) {
            pVar = DictationAsr.I(str);
        } else {
            pVar = null;
        }
        this.f1482f = pVar;
        if (pVar != null) {
            strArr = pVar.d(str);
        } else {
            strArr = new String[0];
        }
        this.V = strArr;
        if (strArr.length > 1) {
            View view = new View(context);
            this.W = view;
            addView(view, new FrameLayout.LayoutParams(0, 0));
            this.f1479b = k0.N(DictationAsr.c0(pVar, str));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        op opVar = new op(26, context, null);
        this.h = opVar;
        opVar.setDrawUnchecked(false);
        opVar.b(-1, -1, m6.Fi);
        opVar.setDrawBackgroundAsArc(-1);
        if (hd.f24408a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        addView(opVar, na.d(26, 26.0f, i7 | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        opVar.setImportantForAccessibility(2);
        View view2 = this.W;
        if (view2 != null) {
            view2.setImportantForAccessibility(2);
        }
        setFocusable(true);
        c();
        d6Var.e(true, this.U);
        float f11 = 1.0f;
        if (b()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        d6Var2.e(true, f10);
        if (!this.Q && b()) {
            f11 = 0.0f;
        }
        d6Var3.e(true, f11);
    }

    public final void a() {
        if (this.Q) {
            return;
        }
        if (!this.P) {
            DictationAsr.t(this.f1482f);
        } else if (this.R) {
            this.S = true;
            p b02 = DictationAsr.b0(this.f1477a);
            if (b02 != null && DictationAsr.y(b02)) {
                DictationAsr.u(b02, true);
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
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        p[] J;
        String str;
        p[] J2;
        if (this.W != null) {
            String N = k0.N(DictationAsr.c0(this.f1482f, this.f1477a));
            if (!N.equals(this.f1479b)) {
                this.f1479b = N;
                requestLayout();
            }
        }
        boolean z15 = this.Q;
        boolean z16 = true;
        if (this.f1482f == null) {
            this.P = true;
            this.T = DictationAsr.x();
        } else {
            String str2 = this.f1477a;
            p[] J3 = DictationAsr.J();
            int length = J3.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    p pVar = J3[i7];
                    if (pVar.c(str2) && DictationAsr.y(pVar)) {
                        z10 = true;
                        break;
                    }
                    i7++;
                } else {
                    z10 = false;
                    break;
                }
            }
            this.P = z10;
            if (z10 && !DictationAsr.x() && DictationAsr.z(this.f1477a)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.T = z11;
        }
        if (this.f1482f != null) {
            String str3 = this.f1477a;
            for (p pVar2 : DictationAsr.J()) {
                if (pVar2.c(str3) && pVar2.f1449j) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        if (!z12) {
            this.S = false;
        }
        if (z12 && (!this.P || this.S)) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.Q = z13;
        if (this.P && !z13 && DictationAsr.b0(this.f1477a) != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.R = z14;
        if (b() && !this.Q) {
            if (this.P) {
                str = this.E;
            } else {
                str = this.f1488y;
            }
            this.F = str;
        }
        float f10 = 0.0f;
        if (this.f1482f != null) {
            String str4 = this.f1477a;
            for (p pVar3 : DictationAsr.J()) {
                if (pVar3.c(str4) && pVar3.f1449j) {
                    f10 = Math.max(f10, pVar3.f1450k);
                }
            }
        }
        this.U = f10;
        this.h.a(this.T, isAttachedToWindow());
        org.telegram.ui.Cells.y yVar = null;
        if (z15 && !this.Q && this.P && isAttachedToWindow() && org.telegram.messenger.g0.C1()) {
            announceForAccessibility(hd.a0(null, null, 2131745075, this.f1479b));
        }
        boolean z17 = this.P;
        if (getBackground() == null) {
            z16 = false;
        }
        if (z17 != z16) {
            if (z17) {
                yVar = m6.N0(false);
            }
            setBackground(yVar);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        boolean z10;
        float f10;
        float f11;
        float L2;
        float width;
        float L3;
        float L4;
        Canvas canvas2 = canvas;
        boolean z11 = hd.f24408a0;
        int x02 = m6.x0(null, m6.f29758z6, false);
        int x03 = m6.x0(null, m6.Fi, false);
        float L5 = org.telegram.messenger.g0.L(25.0f);
        int x04 = m6.x0(null, m6.G6, false);
        TextPaint textPaint = this.f1483n;
        textPaint.setColor(x04);
        TextPaint textPaint2 = this.f1484r;
        textPaint2.setColor(x02);
        float measureText = textPaint.measureText(this.f1479b);
        float L6 = L5 + org.telegram.messenger.g0.L(5.5f);
        String str = this.f1479b;
        if (z11) {
            L = (getWidth() - org.telegram.messenger.g0.L(21.0f)) - measureText;
        } else {
            L = org.telegram.messenger.g0.L(21.0f);
        }
        canvas2.drawText(str, L, L6, textPaint);
        if (this.W != null) {
            Paint paint = this.f1480c;
            paint.setColor(x02);
            if (z11) {
                L4 = ((getWidth() - org.telegram.messenger.g0.L(21.0f)) - measureText) - org.telegram.messenger.g0.L(12.0f);
            } else {
                L4 = org.telegram.messenger.g0.L(21.0f) + measureText + org.telegram.messenger.g0.L(12.0f);
            }
            float f12 = L4;
            canvas2.drawLine(f12 - org.telegram.messenger.g0.L(4.5f), L5 - org.telegram.messenger.g0.L(2.0f), f12, org.telegram.messenger.g0.L(2.5f) + L5, paint);
            canvas2 = canvas;
            canvas2.drawLine(f12, L5 + org.telegram.messenger.g0.L(2.5f), f12 + org.telegram.messenger.g0.L(4.5f), L5 - org.telegram.messenger.g0.L(2.0f), paint);
            measureText += org.telegram.messenger.g0.L(18.0f);
        }
        String str2 = this.d;
        if (str2 != null) {
            float measureText2 = textPaint2.measureText(str2);
            if (z11) {
                L3 = (((getWidth() - org.telegram.messenger.g0.L(21.0f)) - measureText) - org.telegram.messenger.g0.L(8.0f)) - measureText2;
            } else {
                L3 = org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(21.0f) + measureText;
            }
            canvas2.drawText(str2, L3, L6, textPaint2);
        }
        float d = this.K.d(!b());
        if (!this.Q && b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        float d2 = this.L.d(z10);
        float e10 = this.J.e(false, this.U);
        this.h.setAlpha(d);
        if (d < 1.0f) {
            String str3 = this.F;
            TextPaint textPaint3 = this.f1487x;
            float measureText3 = textPaint3.measureText(str3);
            f10 = 21.0f;
            float L7 = org.telegram.messenger.g0.L(28.0f) + measureText3;
            float L8 = org.telegram.messenger.g0.L(30.0f);
            if (z11) {
                width = org.telegram.messenger.g0.L(17.0f) + L7;
            } else {
                width = getWidth() - org.telegram.messenger.g0.L(17.0f);
            }
            float f13 = L8 / 2.0f;
            RectF rectF = this.H;
            rectF.set(width - L7, L5 - f13, width, L5 + f13);
            float f14 = 1.0f - d;
            float a10 = this.M.a(0.08f) * (1.0f - (d * 0.2f));
            canvas2.save();
            canvas2.scale(a10, a10, rectF.centerX(), rectF.centerY());
            int r12 = m6.r1(f14, x03);
            Paint paint2 = this.f1486w;
            paint2.setColor(r12);
            canvas2.drawRoundRect(rectF, f13, f13, paint2);
            int x05 = m6.x0(null, m6.Ji, false);
            canvas2.save();
            Path path = this.I;
            path.rewind();
            path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
            canvas2.clipPath(path);
            float L9 = org.telegram.messenger.g0.L(16.0f);
            if (d2 < 1.0f) {
                textPaint3.setColor(m6.r1((1.0f - d2) * f14, x05));
                canvas2.save();
                canvas2.translate(0.0f, (-d2) * L9);
                canvas2.scale(1.0f, 1.0f - (0.4f * d2), rectF.centerX(), rectF.centerY());
                canvas2.drawText(this.F, rectF.centerX() - (measureText3 / 2.0f), rectF.centerY() + org.telegram.messenger.g0.L(5.0f), textPaint3);
                canvas2.restore();
            }
            int i7 = (d2 > 0.0f ? 1 : (d2 == 0.0f ? 0 : -1));
            if (i7 > 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j3 = this.O;
                if (j3 != 0) {
                    this.N = ((((float) (uptimeMillis - j3)) * 0.36f) + this.N) % 360.0f;
                }
                this.O = uptimeMillis;
                float L10 = org.telegram.messenger.g0.L(8.0f);
                float z12 = com.google.android.gms.internal.vision.e2.z(1.0f, d2, L9, rectF.centerY());
                RectF rectF2 = this.G;
                rectF2.set(rectF.centerX() - L10, z12 - L10, rectF.centerX() + L10, z12 + L10);
                int r13 = m6.r1(d2 * f14, x05);
                Paint paint3 = this.f1485s;
                paint3.setColor(r13);
                canvas2.drawArc(rectF2, this.N - 90.0f, Math.max(0.1f, Math.min(0.9f, e10)) * 360.0f, false, paint3);
            }
            canvas.restore();
            canvas.restore();
            f11 = 0.0f;
            if (i7 > 0 || d > 0.0f) {
                invalidate();
            }
        } else {
            f10 = 21.0f;
            f11 = 0.0f;
            this.O = 0L;
        }
        if (this.f1481e) {
            if (z11) {
                L2 = f11;
            } else {
                L2 = org.telegram.messenger.g0.L(f10);
            }
            float height = getHeight() - 1;
            int width2 = getWidth();
            if (z11) {
                width2 -= org.telegram.messenger.g0.L(f10);
            }
            canvas.drawLine(L2, height, width2, getHeight() - 1, m6.f29470k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder(this.f1479b);
        String str = this.d;
        if (str != null) {
            sb2.append(", ");
            sb2.append(str);
        }
        boolean z10 = false;
        if (this.Q) {
            sb2.append(", ");
            sb2.append(hd.a0(null, null, 2131745074, Integer.valueOf(Math.round(this.U * 100.0f))));
        } else if (!this.P) {
            sb2.append(", ");
            sb2.append(hd.N0(2131745073, null));
        } else if (this.R) {
            sb2.append(", ");
            sb2.append(hd.N0(2131745072, null));
        }
        accessibilityNodeInfo.setText(sb2);
        if (this.P) {
            charSequence = "android.widget.CheckBox";
        } else {
            charSequence = "android.widget.Button";
        }
        accessibilityNodeInfo.setClassName(charSequence);
        accessibilityNodeInfo.setCheckable(this.P);
        if (this.P && this.T) {
            z10 = true;
        }
        accessibilityNodeInfo.setChecked(z10);
        if (!this.P && !this.Q) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, this.f1488y));
        }
        if (this.R) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296268, this.E));
        }
        if (this.W != null && this.f1478a0 != null) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296269, hd.N0(2131745071, null)));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L;
        super.onLayout(z10, i7, i10, i11, i12);
        View view = this.W;
        if (view != null) {
            int measureText = (int) (this.f1483n.measureText(this.f1479b) + org.telegram.messenger.g0.L(18.0f));
            int L2 = org.telegram.messenger.g0.L(34.0f);
            int L3 = (org.telegram.messenger.g0.L(50.0f) - L2) / 2;
            if (hd.f24408a0) {
                L = f3.z(21.0f, getWidth(), measureText);
            } else {
                L = org.telegram.messenger.g0.L(21.0f);
            }
            view.layout(L - org.telegram.messenger.g0.L(6.0f), L3, org.telegram.messenger.g0.L(6.0f) + L + measureText, L2 + L3);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f1481e ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: ai.p2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        a1.e eVar;
        if (i7 == 2131296268 && this.R) {
            a();
            return true;
        } else if (i7 == 2131296269 && this.W != null && (eVar = this.f1478a0) != null) {
            eVar.run();
            return true;
        } else {
            return super.performAccessibilityAction(i7, bundle);
        }
    }
}
