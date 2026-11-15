package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Dictation.DictationAsr;
public final class u2 extends FrameLayout {
    public final Path E;
    public final u5 F;
    public final u5 G;
    public final u5 H;
    public final dc I;
    public float J;
    public long K;
    public boolean L;
    public boolean M;
    public float N;
    public final String f1566a;
    public final String f1567b;
    public final String f1568c;
    public final boolean d;
    public final s f1569e;
    public final fp f1570f;
    public final TextPaint h;
    public final TextPaint f1571n;
    public final Paint f1572r;
    public final Paint f1573s;
    public final TextPaint f1574w;
    public final RectF f1575x;
    public final RectF f1576y;

    public u2(Context context, String str, String str2, String str3, boolean z10) {
        super(context);
        s sVar;
        int i7;
        float f10;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f1571n = textPaint2;
        Paint paint = new Paint(1);
        this.f1572r = paint;
        this.f1573s = new Paint(1);
        TextPaint textPaint3 = new TextPaint(1);
        this.f1574w = textPaint3;
        this.f1575x = new RectF();
        this.f1576y = new RectF();
        this.E = new Path();
        er erVar = er.h;
        u5 u5Var = new u5(this, 0L, 300L, erVar);
        this.F = u5Var;
        u5 u5Var2 = new u5(this, 0L, 420L, erVar);
        this.G = u5Var2;
        u5 u5Var3 = new u5(this, 0L, 420L, erVar);
        this.H = u5Var3;
        this.I = new dc(this);
        setWillNotDraw(false);
        this.f1566a = str;
        this.f1567b = str2;
        this.f1568c = str3;
        this.d = z10;
        if (str != null) {
            sVar = DictationAsr.H(str);
        } else {
            sVar = null;
        }
        this.f1569e = sVar;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        fp fpVar = new fp(26, context, null);
        this.f1570f = fpVar;
        fpVar.setDrawUnchecked(false);
        fpVar.b(-1, -1, j6.Fi);
        fpVar.setDrawBackgroundAsArc(-1);
        if (hd.f24101a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        addView(fpVar, ja.d(26, 26.0f, i7 | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        b();
        u5Var.e(true, this.N);
        float f11 = 0.0f;
        if (this.L) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u5Var2.e(true, f10);
        u5Var3.e(true, (this.M || this.L) ? 1.0f : f11);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ai.u2.a():void");
    }

    public final void b() {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.y yVar;
        s[] I;
        s[] I2;
        boolean z13 = true;
        if (this.f1569e == null) {
            this.L = true;
            z11 = DictationAsr.v();
        } else {
            String str = this.f1566a;
            s[] I3 = DictationAsr.I();
            int length = I3.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    s sVar = I3[i7];
                    if (sVar.b(str) && DictationAsr.w(sVar)) {
                        z10 = true;
                        break;
                    }
                    i7++;
                } else {
                    z10 = false;
                    break;
                }
            }
            this.L = z10;
            if (z10 && !DictationAsr.v() && DictationAsr.y(this.f1566a)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (!this.L && this.f1569e != null) {
            String str2 = this.f1566a;
            for (s sVar2 : DictationAsr.I()) {
                if (sVar2.b(str2) && sVar2.h) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        this.M = z12;
        float f10 = 0.0f;
        if (this.f1569e != null) {
            String str3 = this.f1566a;
            for (s sVar3 : DictationAsr.I()) {
                if (sVar3.b(str3) && sVar3.h) {
                    f10 = Math.max(f10, sVar3.f1536i);
                }
            }
        }
        this.N = f10;
        this.f1570f.a(z11, isAttachedToWindow());
        boolean z14 = this.L;
        if (getBackground() == null) {
            z13 = false;
        }
        if (z14 != z13) {
            if (z14) {
                yVar = j6.N0(false);
            } else {
                yVar = null;
            }
            setBackground(yVar);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        boolean z10;
        boolean z11;
        float f10;
        float L2;
        float width;
        float L3;
        boolean z12 = hd.f24101a0;
        int x02 = j6.x0(null, j6.f29260z6, false);
        int x03 = j6.x0(null, j6.Fi, false);
        float L4 = org.telegram.messenger.g0.L(25.0f);
        int x04 = j6.x0(null, j6.G6, false);
        TextPaint textPaint = this.h;
        textPaint.setColor(x04);
        TextPaint textPaint2 = this.f1571n;
        textPaint2.setColor(x02);
        String str = this.f1567b;
        float measureText = textPaint.measureText(str);
        float L5 = org.telegram.messenger.g0.L(5.5f) + L4;
        if (z12) {
            L = (getWidth() - org.telegram.messenger.g0.L(21.0f)) - measureText;
        } else {
            L = org.telegram.messenger.g0.L(21.0f);
        }
        canvas.drawText(str, L, L5, textPaint);
        String str2 = this.f1568c;
        if (str2 != null) {
            float measureText2 = textPaint2.measureText(str2);
            if (z12) {
                L3 = (((getWidth() - org.telegram.messenger.g0.L(21.0f)) - measureText) - org.telegram.messenger.g0.L(8.0f)) - measureText2;
            } else {
                L3 = org.telegram.messenger.g0.L(21.0f) + measureText + org.telegram.messenger.g0.L(8.0f);
            }
            canvas.drawText(str2, L3, L5, textPaint2);
        }
        float d = this.G.d(this.L);
        if (!this.M && !this.L) {
            z10 = false;
        } else {
            z10 = true;
        }
        float d2 = this.H.d(z10);
        float e10 = this.F.e(false, this.N);
        this.f1570f.setAlpha(d);
        if (d < 1.0f) {
            TextPaint textPaint3 = this.f1574w;
            float measureText3 = textPaint3.measureText("Download");
            float L6 = measureText3 + org.telegram.messenger.g0.L(28.0f);
            float L7 = org.telegram.messenger.g0.L(30.0f);
            if (z12) {
                width = org.telegram.messenger.g0.L(17.0f) + L6;
            } else {
                width = getWidth() - org.telegram.messenger.g0.L(17.0f);
            }
            float f11 = L7 / 2.0f;
            RectF rectF = this.f1576y;
            rectF.set(width - L6, L4 - f11, width, L4 + f11);
            float f12 = 1.0f - d;
            float a10 = this.I.a(0.08f) * (1.0f - (0.2f * d));
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            int r12 = j6.r1(f12, x03);
            Paint paint = this.f1573s;
            paint.setColor(r12);
            canvas.drawRoundRect(rectF, f11, f11, paint);
            int x05 = j6.x0(null, j6.Ji, false);
            canvas.save();
            Path path = this.E;
            path.rewind();
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
            canvas.clipPath(path);
            float L8 = org.telegram.messenger.g0.L(16.0f);
            if (d2 < 1.0f) {
                textPaint3.setColor(j6.r1((1.0f - d2) * f12, x05));
                canvas.save();
                canvas.translate(0.0f, (-d2) * L8);
                canvas.scale(1.0f, 1.0f - (0.4f * d2), rectF.centerX(), rectF.centerY());
                canvas.drawText("Download", rectF.centerX() - (measureText3 / 2.0f), rectF.centerY() + org.telegram.messenger.g0.L(5.0f), textPaint3);
                canvas.restore();
            }
            int i7 = (d2 > 0.0f ? 1 : (d2 == 0.0f ? 0 : -1));
            if (i7 > 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                z11 = z12;
                long j3 = this.K;
                if (j3 != 0) {
                    this.J = ((((float) (uptimeMillis - j3)) * 0.36f) + this.J) % 360.0f;
                }
                this.K = uptimeMillis;
                float L9 = org.telegram.messenger.g0.L(8.0f);
                float z13 = com.google.android.gms.internal.vision.e2.z(1.0f, d2, L8, rectF.centerY());
                RectF rectF2 = this.f1575x;
                rectF2.set(rectF.centerX() - L9, z13 - L9, rectF.centerX() + L9, z13 + L9);
                int r13 = j6.r1(f12 * d2, x05);
                Paint paint2 = this.f1572r;
                paint2.setColor(r13);
                canvas.drawArc(rectF2, this.J - 90.0f, Math.max(0.1f, Math.min(0.9f, e10)) * 360.0f, false, paint2);
            } else {
                z11 = z12;
            }
            canvas.restore();
            canvas.restore();
            f10 = 0.0f;
            if (i7 > 0 || d > 0.0f) {
                invalidate();
            }
        } else {
            z11 = z12;
            f10 = 0.0f;
            this.K = 0L;
        }
        if (this.d) {
            if (z11) {
                L2 = f10;
            } else {
                L2 = org.telegram.messenger.g0.L(21.0f);
            }
            float height = getHeight() - 1;
            int width2 = getWidth();
            if (z11) {
                width2 -= org.telegram.messenger.g0.L(21.0f);
            }
            canvas.drawLine(L2, height, width2, getHeight() - 1, j6.f28972k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.d ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        RectF rectF = this.f1576y;
        dc dcVar = this.I;
        if (action == 0) {
            if (!this.L && !this.M && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = true;
            } else {
                z10 = false;
            }
            dcVar.c(z10);
            if (z10) {
                return true;
            }
        } else if (action == 2) {
            if (dcVar.f33917i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                dcVar.c(false);
            }
            if (dcVar.f33917i) {
                return true;
            }
        } else if (action == 1 || action == 3) {
            boolean z11 = dcVar.f33917i;
            dcVar.c(false);
            if (z11) {
                if (action == 1) {
                    performHapticFeedback(3);
                    a();
                }
                return true;
            }
        }
        if (!dcVar.f33917i && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
