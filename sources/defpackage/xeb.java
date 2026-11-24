package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class xeb {
    public zeb a;
    public web b;
    public TL_iv.pageTableCell c;
    public final int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r = -1;
    public final efb s;

    public xeb(efb efbVar, int i) {
        this.s = efbVar;
        this.d = i;
    }

    public final void a(Canvas canvas, View view, boolean z) {
        boolean z2;
        boolean z3;
        int i;
        Paint paint;
        Paint paint2;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        RectF rectF;
        int i3;
        int i4;
        fib fibVar;
        Canvas canvas2 = canvas;
        if (this.c != null) {
            int i5 = this.p + this.k;
            efb efbVar = this.s;
            int i6 = efbVar.E;
            Path path = efbVar.M;
            float[] fArr = efbVar.O;
            dfb dfbVar = efbVar.P;
            RectF rectF2 = efbVar.N;
            boolean z4 = false;
            if (i5 == i6) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.q + this.l == efbVar.F) {
                z3 = true;
            } else {
                z3 = false;
            }
            int L = gl.L(8.0f);
            boolean z5 = this.c.header;
            if (z5 || (efbVar.I && this.a.a.b.a % 2 == 0)) {
                int i7 = this.p;
                if (i7 == 0 && this.q == 0) {
                    float f5 = L;
                    fArr[1] = f5;
                    fArr[0] = f5;
                    z4 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                }
                if (z2 && this.q == 0) {
                    float f6 = L;
                    fArr[3] = f6;
                    fArr[2] = f6;
                    z4 = true;
                } else {
                    fArr[3] = 0.0f;
                    fArr[2] = 0.0f;
                }
                if (z2 && z3) {
                    float f7 = L;
                    fArr[5] = f7;
                    fArr[4] = f7;
                    z4 = true;
                } else {
                    fArr[5] = 0.0f;
                    fArr[4] = 0.0f;
                }
                if (i7 == 0 && z3) {
                    float f8 = L;
                    fArr[7] = f8;
                    fArr[6] = f8;
                    z4 = true;
                } else {
                    fArr[7] = 0.0f;
                    fArr[6] = 0.0f;
                }
                if (z4) {
                    rectF2.set(i7, this.q, i7 + this.k, i + this.l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.c.header) {
                        canvas2.drawPath(path, dfbVar.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, dfbVar.getStripPaint());
                    }
                } else {
                    int i8 = this.q;
                    int i9 = this.k;
                    if (z5) {
                        canvas2.drawRect(i7, i8, i7 + i9, i8 + this.l, dfbVar.getHeaderPaint());
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                        canvas2.drawRect(i7, i8, i7 + i9, this.l + i8, dfbVar.getStripPaint());
                    }
                }
            }
            if (z && this.b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.r >= 0 && (fibVar = efbVar.a) != null) {
                    fibVar.Y(canvas2, (eib) efbVar.getParent().getParent(), this.r);
                }
                this.b.d(canvas2, view);
                canvas2.restore();
            }
            if (efbVar.H) {
                Paint linePaint = dfbVar.getLinePaint();
                Paint linePaint2 = dfbVar.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i10 = this.p;
                int i11 = this.q;
                int i12 = this.l;
                if (i10 == 0) {
                    float f9 = i11;
                    float f10 = i12 + i11;
                    if (i11 == 0) {
                        f9 += L;
                    }
                    float f11 = f9;
                    if (f10 == efbVar.F) {
                        f10 -= L;
                    }
                    float f12 = i10 + strokeWidth;
                    canvas2.drawLine(f12, f11, f12, f10, linePaint);
                    paint = linePaint;
                    paint2 = linePaint2;
                } else {
                    paint = linePaint;
                    float f13 = i10 - strokeWidth2;
                    paint2 = linePaint2;
                    canvas.drawLine(f13, i11, f13, i11 + i12, paint2);
                }
                int i13 = this.q;
                int i14 = this.p;
                int i15 = this.k;
                if (i13 == 0) {
                    float f14 = i14;
                    float f15 = i15 + i14;
                    if (i14 == 0) {
                        f14 += L;
                    }
                    float f16 = f14;
                    if (f15 == efbVar.E) {
                        f15 -= L;
                    }
                    float f17 = f15;
                    float f18 = i13 + strokeWidth;
                    canvas.drawLine(f16, f18, f17, f18, paint);
                } else {
                    float f19 = i13 - strokeWidth2;
                    canvas.drawLine(i14, f19, i15 + i14, f19, paint2);
                }
                if (z2 && (i2 = this.q) == 0) {
                    f = i2 + L;
                } else {
                    i2 = this.q;
                    f = i2 - strokeWidth;
                }
                float f20 = f;
                if (z2 && z3) {
                    f2 = (i2 + this.l) - L;
                } else {
                    f2 = (i2 + this.l) - strokeWidth;
                }
                float f21 = (this.p + this.k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f21, f20, f21, f2, paint3);
                int i16 = this.p;
                if (i16 == 0 && z3) {
                    f3 = i16 + L;
                } else {
                    f3 = i16 - strokeWidth;
                }
                if (z2 && z3) {
                    f4 = (i16 + this.k) - L;
                } else {
                    f4 = (i16 + this.k) - strokeWidth;
                }
                float f22 = (this.q + this.l) - strokeWidth;
                canvas.drawLine(f3, f22, f4, f22, paint3);
                int i17 = this.p;
                if (i17 == 0 && (i4 = this.q) == 0) {
                    float f23 = i17 + strokeWidth;
                    float f24 = i4 + strokeWidth;
                    float f25 = L << 1;
                    rectF2.set(f23, f24, f23 + f25, f25 + f24);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z2 && (i3 = this.q) == 0) {
                    float f26 = (this.p + this.k) - strokeWidth;
                    float f27 = L << 1;
                    float f28 = i3 + strokeWidth;
                    rectF.set(f26 - f27, f28, f26, f27 + f28);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i18 = this.p;
                if (i18 == 0 && z3) {
                    float f29 = i18 + strokeWidth;
                    float f30 = (this.q + this.l) - strokeWidth;
                    float f31 = L << 1;
                    rectF.set(f29, f30 - f31, f31 + f29, f30);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z2 && z3) {
                    float f32 = (this.p + this.k) - strokeWidth;
                    float f33 = L << 1;
                    float f34 = (this.q + this.l) - strokeWidth;
                    rectF.set(f32 - f33, f34 - f33, f32, f34);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.p + this.g;
    }

    public final int c() {
        return this.q + this.h;
    }

    public final void d(int r4, int r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xeb.d(int, int, boolean):void");
    }

    public final void e(web webVar) {
        Layout layout;
        int min;
        this.b = webVar;
        if (webVar != null) {
            layout = webVar.a();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.e = 0;
            this.i = 0;
            int lineCount = layout.getLineCount();
            for (int i = 0; i < lineCount; i++) {
                float lineLeft = layout.getLineLeft(i);
                if (i == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.i, (int) Math.ceil(lineLeft));
                }
                this.i = min;
                this.e = (int) Math.ceil(Math.max(layout.getLineWidth(i), this.e));
            }
            this.f = layout.getHeight();
            return;
        }
        this.i = 0;
        this.e = 0;
        this.f = 0;
    }

    public final void f() {
        int i = -this.i;
        this.g = i;
        TL_iv.pageTableCell pagetablecell = this.c;
        boolean z = pagetablecell.align_right;
        efb efbVar = this.s;
        if (z) {
            this.g = ((this.k - this.e) - efbVar.w) + i;
        } else if (pagetablecell.align_center) {
            this.g = Math.round((this.k - this.e) / 2.0f) + i;
        } else {
            this.g = i + efbVar.w;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.c;
        if (pagetablecell.valign_middle) {
            this.h = (this.l - this.f) / 2;
            return;
        }
        boolean z = pagetablecell.valign_bottom;
        efb efbVar = this.s;
        if (z) {
            this.h = (this.l - this.f) - efbVar.s;
        } else {
            this.h = efbVar.r;
        }
    }
}
