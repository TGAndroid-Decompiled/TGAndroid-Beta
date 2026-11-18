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
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Dictation.DictationAsr;
public final class w2 extends FrameLayout {
    public String E;
    public final RectF F;
    public final RectF G;
    public final Path H;
    public final c6 I;
    public final c6 J;
    public final c6 K;
    public final mc L;
    public float M;
    public long N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final String f1589a;
    public final String f1590b;
    public final String f1591c;
    public final boolean d;
    public final t f1592e;
    public final mp f1593f;
    public final TextPaint h;
    public final TextPaint f1594n;
    public final Paint f1595r;
    public final Paint f1596s;
    public final TextPaint f1597w;
    public final String f1598x;
    public final String f1599y;

    public w2(Context context, String str, String str2, String str3, boolean z10) {
        super(context);
        t tVar;
        int i7;
        float f10;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f1594n = textPaint2;
        Paint paint = new Paint(1);
        this.f1595r = paint;
        this.f1596s = new Paint(1);
        TextPaint textPaint3 = new TextPaint(1);
        this.f1597w = textPaint3;
        String M0 = gd.M0(2131745070, null);
        this.f1598x = M0;
        this.f1599y = gd.M0(2131745037, null);
        this.E = M0;
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        lr lrVar = lr.h;
        c6 c6Var = new c6(this, 0L, 300L, lrVar);
        this.I = c6Var;
        c6 c6Var2 = new c6(this, 0L, 420L, lrVar);
        this.J = c6Var2;
        c6 c6Var3 = new c6(this, 0L, 420L, lrVar);
        this.K = c6Var3;
        this.L = new mc(this);
        setWillNotDraw(false);
        this.f1589a = str;
        this.f1590b = str2;
        this.f1591c = str3;
        this.d = z10;
        if (str != null) {
            tVar = DictationAsr.H(str);
        } else {
            tVar = null;
        }
        this.f1592e = tVar;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        mp mpVar = new mp(26, context, null);
        this.f1593f = mpVar;
        mpVar.setDrawUnchecked(false);
        mpVar.b(-1, -1, n6.Fi);
        mpVar.setDrawBackgroundAsArc(-1);
        if (gd.f24213a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        addView(mpVar, ma.d(26, 26.0f, i7 | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        b();
        c6Var.e(true, this.S);
        float f11 = 1.0f;
        if (a()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        c6Var2.e(true, f10);
        if (!this.P && a()) {
            f11 = 0.0f;
        }
        c6Var3.e(true, f11);
    }

    public final boolean a() {
        if (this.O && !this.Q && !this.P) {
            return false;
        }
        return true;
    }

    public final void b() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Cells.y yVar;
        t[] I;
        String str;
        t[] I2;
        boolean z15 = true;
        if (this.f1592e == null) {
            this.O = true;
            z11 = DictationAsr.v();
        } else {
            String str2 = this.f1589a;
            t[] I3 = DictationAsr.I();
            int length = I3.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    t tVar = I3[i7];
                    if (tVar.b(str2) && DictationAsr.w(tVar)) {
                        z10 = true;
                        break;
                    }
                    i7++;
                } else {
                    z10 = false;
                    break;
                }
            }
            this.O = z10;
            if (z10 && !DictationAsr.v() && DictationAsr.y(this.f1589a)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (this.f1592e != null) {
            String str3 = this.f1589a;
            for (t tVar2 : DictationAsr.I()) {
                if (tVar2.b(str3) && tVar2.h) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        if (!z12) {
            this.R = false;
        }
        if (z12 && (!this.O || this.R)) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.P = z13;
        if (this.O && !z13 && DictationAsr.W(this.f1589a) != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.Q = z14;
        if (a() && !this.P) {
            if (this.O) {
                str = this.f1599y;
            } else {
                str = this.f1598x;
            }
            this.E = str;
        }
        float f10 = 0.0f;
        if (this.f1592e != null) {
            String str4 = this.f1589a;
            for (t tVar3 : DictationAsr.I()) {
                if (tVar3.b(str4) && tVar3.h) {
                    f10 = Math.max(f10, tVar3.f1537i);
                }
            }
        }
        this.S = f10;
        this.f1593f.a(z11, isAttachedToWindow());
        boolean z16 = this.O;
        if (getBackground() == null) {
            z15 = false;
        }
        if (z16 != z15) {
            if (z16) {
                yVar = n6.N0(false);
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
        boolean z12 = gd.f24213a0;
        int x02 = n6.x0(null, n6.f29805z6, false);
        int x03 = n6.x0(null, n6.Fi, false);
        float L4 = org.telegram.messenger.g0.L(25.0f);
        int x04 = n6.x0(null, n6.G6, false);
        TextPaint textPaint = this.h;
        textPaint.setColor(x04);
        TextPaint textPaint2 = this.f1594n;
        textPaint2.setColor(x02);
        String str = this.f1590b;
        float measureText = textPaint.measureText(str);
        float L5 = org.telegram.messenger.g0.L(5.5f) + L4;
        if (z12) {
            L = (getWidth() - org.telegram.messenger.g0.L(21.0f)) - measureText;
        } else {
            L = org.telegram.messenger.g0.L(21.0f);
        }
        canvas.drawText(str, L, L5, textPaint);
        String str2 = this.f1591c;
        if (str2 != null) {
            float measureText2 = textPaint2.measureText(str2);
            if (z12) {
                L3 = (((getWidth() - org.telegram.messenger.g0.L(21.0f)) - measureText) - org.telegram.messenger.g0.L(8.0f)) - measureText2;
            } else {
                L3 = org.telegram.messenger.g0.L(21.0f) + measureText + org.telegram.messenger.g0.L(8.0f);
            }
            canvas.drawText(str2, L3, L5, textPaint2);
        }
        float d = this.J.d(!a());
        if (!this.P && a()) {
            z10 = false;
        } else {
            z10 = true;
        }
        float d2 = this.K.d(z10);
        float e10 = this.I.e(false, this.S);
        this.f1593f.setAlpha(d);
        if (d < 1.0f) {
            String str3 = this.E;
            TextPaint textPaint3 = this.f1597w;
            float measureText3 = textPaint3.measureText(str3);
            float L6 = org.telegram.messenger.g0.L(28.0f) + measureText3;
            float L7 = org.telegram.messenger.g0.L(30.0f);
            if (z12) {
                width = org.telegram.messenger.g0.L(17.0f) + L6;
            } else {
                width = getWidth() - org.telegram.messenger.g0.L(17.0f);
            }
            float f11 = L7 / 2.0f;
            RectF rectF = this.G;
            rectF.set(width - L6, L4 - f11, width, L4 + f11);
            float f12 = 1.0f - d;
            float a10 = this.L.a(0.08f) * (1.0f - (0.2f * d));
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            int r12 = n6.r1(f12, x03);
            Paint paint = this.f1596s;
            paint.setColor(r12);
            canvas.drawRoundRect(rectF, f11, f11, paint);
            int x05 = n6.x0(null, n6.Ji, false);
            canvas.save();
            Path path = this.H;
            path.rewind();
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
            canvas.clipPath(path);
            float L8 = org.telegram.messenger.g0.L(16.0f);
            if (d2 < 1.0f) {
                textPaint3.setColor(n6.r1((1.0f - d2) * f12, x05));
                canvas.save();
                canvas.translate(0.0f, (-d2) * L8);
                canvas.scale(1.0f, 1.0f - (0.4f * d2), rectF.centerX(), rectF.centerY());
                canvas.drawText(this.E, rectF.centerX() - (measureText3 / 2.0f), rectF.centerY() + org.telegram.messenger.g0.L(5.0f), textPaint3);
                canvas.restore();
            }
            int i7 = (d2 > 0.0f ? 1 : (d2 == 0.0f ? 0 : -1));
            if (i7 > 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                z11 = z12;
                long j3 = this.N;
                if (j3 != 0) {
                    this.M = ((((float) (uptimeMillis - j3)) * 0.36f) + this.M) % 360.0f;
                }
                this.N = uptimeMillis;
                float L9 = org.telegram.messenger.g0.L(8.0f);
                float z13 = com.google.android.gms.internal.vision.e2.z(1.0f, d2, L8, rectF.centerY());
                RectF rectF2 = this.F;
                rectF2.set(rectF.centerX() - L9, z13 - L9, rectF.centerX() + L9, z13 + L9);
                int r13 = n6.r1(f12 * d2, x05);
                Paint paint2 = this.f1595r;
                paint2.setColor(r13);
                canvas.drawArc(rectF2, this.M - 90.0f, Math.max(0.1f, Math.min(0.9f, e10)) * 360.0f, false, paint2);
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
            this.N = 0L;
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
            canvas.drawLine(L2, height, width2, getHeight() - 1, n6.f29517k0);
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
        RectF rectF = this.G;
        mc mcVar = this.L;
        if (action == 0) {
            if (a() && !this.P && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = true;
            } else {
                z10 = false;
            }
            mcVar.c(z10);
            if (z10) {
                return true;
            }
        } else if (action == 2) {
            if (mcVar.f37434i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                mcVar.c(false);
            }
            if (mcVar.f37434i) {
                return true;
            }
        } else if (action == 1 || action == 3) {
            boolean z11 = mcVar.f37434i;
            mcVar.c(false);
            if (z11) {
                if (action == 1) {
                    performHapticFeedback(3);
                    if (!this.P) {
                        if (!this.O) {
                            DictationAsr.r(this.f1592e);
                        } else if (this.Q) {
                            this.R = true;
                            t W = DictationAsr.W(this.f1589a);
                            if (W != null && DictationAsr.w(W)) {
                                DictationAsr.s(W, true);
                            }
                        }
                        b();
                    }
                }
                return true;
            }
        }
        if (!mcVar.f37434i && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
