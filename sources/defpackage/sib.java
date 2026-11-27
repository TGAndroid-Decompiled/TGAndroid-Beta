package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class sib {
    public uib a;
    public rib b;
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
    public final zib s;

    public sib(zib zibVar, int i) {
        this.s = zibVar;
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
        amb ambVar;
        Canvas canvas2 = canvas;
        if (this.c != null) {
            int i5 = this.p + this.k;
            zib zibVar = this.s;
            int i6 = zibVar.E;
            Path path = zibVar.M;
            float[] fArr = zibVar.O;
            yib yibVar = zibVar.P;
            RectF rectF2 = zibVar.N;
            boolean z4 = false;
            if (i5 == i6) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.q + this.l == zibVar.F) {
                z3 = true;
            } else {
                z3 = false;
            }
            int L = hl.L(8.0f);
            boolean z5 = this.c.header;
            if (z5 || (zibVar.I && this.a.a.b.a % 2 == 0)) {
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
                        canvas2.drawPath(path, yibVar.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, yibVar.getStripPaint());
                    }
                } else {
                    int i8 = this.q;
                    int i9 = this.k;
                    if (z5) {
                        canvas2.drawRect(i7, i8, i7 + i9, i8 + this.l, yibVar.getHeaderPaint());
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                        canvas2.drawRect(i7, i8, i7 + i9, this.l + i8, yibVar.getStripPaint());
                    }
                }
            }
            if (z && this.b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.r >= 0 && (ambVar = zibVar.a) != null) {
                    ambVar.Y(canvas2, (zlb) zibVar.getParent().getParent(), this.r);
                }
                this.b.d(canvas2, view);
                canvas2.restore();
            }
            if (zibVar.H) {
                Paint linePaint = yibVar.getLinePaint();
                Paint linePaint2 = yibVar.getLinePaint();
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
                    if (f10 == zibVar.F) {
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
                    if (f15 == zibVar.E) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sib.d(int, int, boolean):void");
    }

    public final void e(rib ribVar) {
        Layout layout;
        int min;
        this.b = ribVar;
        if (ribVar != null) {
            layout = ribVar.a();
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
        zib zibVar = this.s;
        if (z) {
            this.g = ((this.k - this.e) - zibVar.w) + i;
        } else if (pagetablecell.align_center) {
            this.g = Math.round((this.k - this.e) / 2.0f) + i;
        } else {
            this.g = i + zibVar.w;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.c;
        if (pagetablecell.valign_middle) {
            this.h = (this.l - this.f) / 2;
            return;
        }
        boolean z = pagetablecell.valign_bottom;
        zib zibVar = this.s;
        if (z) {
            this.h = (this.l - this.f) - zibVar.s;
        } else {
            this.h = zibVar.r;
        }
    }
}
