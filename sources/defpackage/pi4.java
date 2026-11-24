package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
import java.util.Random;
public class pi4 extends View implements tjb {
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final wjb M;
    public float[] N;
    public Paint O;
    public int P;
    public int Q;
    public float R;
    public pi4 S;
    public boolean T;
    public float U;
    public int a;
    public LinearGradient b;
    public final Paint c;
    public final Paint d;
    public long e;
    public int f;
    public final Matrix h;
    public final RectF n;
    public int r;
    public int s;
    public int w;
    public boolean x;
    public boolean y;

    public pi4(Context context, wjb wjbVar) {
        super(context);
        this.c = new Paint();
        this.d = new Paint();
        this.n = new RectF();
        this.x = true;
        this.I = bkb.F8;
        this.J = bkb.h6;
        this.K = -1;
        this.L = 1;
        this.M = wjbVar;
        this.h = new Matrix();
    }

    public final float a(float f) {
        if (k96.a0) {
            return getMeasuredWidth() - f;
        }
        return f;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.I));
        hashSet.add(Integer.valueOf(this.J));
    }

    public final void b(RectF rectF) {
        if (k96.a0) {
            rectF.left = getMeasuredWidth() - rectF.left;
            rectF.right = getMeasuredWidth() - rectF.right;
        }
    }

    public final int c(int i) {
        int i2;
        int i3;
        switch (getViewType()) {
            case 1:
                return gl.L(78.0f) + 1;
            case 2:
                return gl.L(2.0f) + ((i - ((getColumnsCount() - 1) * gl.L(2.0f))) / getColumnsCount());
            case 3:
            case 4:
                return gl.L(56.0f);
            case 5:
                return gl.L(80.0f);
            case 6:
            case 18:
                return gl.L(64.0f);
            case 7:
                if (gba.l1) {
                    i2 = 78;
                } else {
                    i2 = 72;
                }
                return gl.L(i2 + 1);
            case 8:
                return gl.L(61.0f);
            case 9:
                return gl.L(66.0f);
            case 10:
                return gl.L(58.0f);
            case 11:
                return gl.L(36.0f);
            case 12:
                return gl.L(103.0f);
            case 13:
            case 14:
            case 17:
            case 20:
            case 27:
            default:
                return 0;
            case 15:
                return gl.L(107.0f);
            case 16:
            case 23:
                return gl.L(50.0f);
            case 19:
                return gl.L(58.0f);
            case 21:
                return gl.L(58.0f);
            case 22:
                return gl.L(60.0f);
            case 24:
                if (gba.l1) {
                    i3 = 76;
                } else {
                    i3 = 64;
                }
                return gl.L(i3 + 1);
            case 25:
                return gl.L(51.0f);
            case 26:
                return gl.L(50.0f) + 1;
            case 28:
                return gl.L(58.0f);
            case 29:
                return gl.L(60.0f) + 1;
            case 30:
                return gl.L(32.0f);
            case 31:
                return gl.L(48.0f) + 1;
            case 32:
                return gl.L(56.0f) + 1;
            case 33:
                return gl.L(58.0f);
            case 34:
                return gl.L(140.0f);
            case 35:
                return gl.L(112.0f);
            case 36:
                return gl.L(108.0f);
            case 37:
                return gl.L(73.0f);
            case 38:
                return gl.L(58.0f);
        }
    }

    public final int d(int i) {
        return bkb.v0(i, this.M);
    }

    public final void e(int i, int i2, int i3) {
        this.I = i;
        this.J = i2;
        this.K = i3;
        invalidate();
    }

    public final void f() {
        pi4 pi4Var = this.S;
        if (pi4Var != null) {
            pi4Var.f();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.e - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int i = this.P;
        if (i == 0) {
            i = getMeasuredWidth();
        }
        int i2 = this.F;
        if (i2 == 34 || i2 == 35 || i2 == 36) {
            i = Math.max(i, gl.q.x);
        }
        int i3 = this.Q;
        if (i3 == 0) {
            i3 = getMeasuredHeight();
        }
        this.e = elapsedRealtime;
        boolean z = this.E;
        Matrix matrix = this.h;
        if (!z && this.F != 13 && getViewType() != 14 && getViewType() != 17) {
            int i4 = (int) ((((float) (abs * i3)) / 400.0f) + this.f);
            this.f = i4;
            if (i4 >= (i3 << 1)) {
                i4 = (-this.a) << 1;
                this.f = i4;
            }
            matrix.setTranslate(this.R, i4);
        } else {
            int i5 = (int) ((((float) (abs * i)) / 400.0f) + this.f);
            this.f = i5;
            if (i5 >= (i << 1)) {
                i5 = (-this.a) << 1;
                this.f = i5;
            }
            matrix.setTranslate(i5 + this.R, 0.0f);
        }
        LinearGradient linearGradient = this.b;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public int getAdditionalHeight() {
        return 0;
    }

    public int getColumnsCount() {
        return 2;
    }

    public Paint getPaint() {
        return this.c;
    }

    public int getViewType() {
        return this.F;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2;
        boolean z;
        float f;
        float f2;
        float f3;
        int i;
        int L;
        Paint paint2;
        int L2;
        float f4;
        int L3;
        int L4;
        int L5;
        int L6;
        int L7;
        int L8;
        int L9;
        int L10;
        int L11;
        int L12;
        int L13;
        int L14;
        int L15;
        int L16;
        int i2;
        int L17;
        int i3;
        int L18;
        int L19;
        Paint paint3;
        if (this.S != null) {
            if (getParent() != null) {
                View view = (View) getParent();
                pi4 pi4Var = this.S;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                pi4Var.P = measuredWidth;
                pi4Var.Q = measuredHeight;
                pi4Var.R = -getX();
            }
            paint = this.S.c;
        } else {
            paint = this.c;
        }
        Paint paint4 = paint;
        if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
            this.R = -getX();
        }
        updateColors();
        f();
        int i4 = this.G;
        if (this.y) {
            int L20 = gl.L(32.0f) + i4;
            int i5 = this.K;
            Paint paint5 = this.d;
            if (i5 >= 0) {
                paint5.setColor(d(i5));
            }
            float measuredWidth2 = getMeasuredWidth();
            float L21 = gl.L(32.0f);
            if (this.K >= 0) {
                paint3 = paint5;
            } else {
                paint3 = paint4;
            }
            canvas.drawRect(0.0f, 0.0f, measuredWidth2, L21, paint3);
            canvas2 = canvas;
            i4 = L20;
        } else {
            canvas2 = canvas;
        }
        int viewType = getViewType();
        int i6 = 0;
        RectF rectF = this.n;
        if (viewType == 7) {
            while (i4 <= getMeasuredHeight()) {
                int c = c(getMeasuredWidth());
                canvas2.drawCircle(a(gl.L(10.0f) + L19), (c >> 1) + i4, gl.L(28.0f), paint4);
                rectF.set(gl.L(76.0f), gl.L(16.0f) + i4, gl.L(148.0f), gl.L(24.0f) + i4);
                b(rectF);
                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint4);
                rectF.set(gl.L(76.0f), gl.L(38.0f) + i4, gl.L(268.0f), gl.L(46.0f) + i4);
                b(rectF);
                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint4);
                if (gba.l1) {
                    rectF.set(gl.L(76.0f), gl.L(54.0f) + i4, gl.L(220.0f), gl.L(62.0f) + i4);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint4);
                }
                if (this.x) {
                    rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(16.0f) + i4, getMeasuredWidth() - gl.L(12.0f), gl.L(24.0f) + i4);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint4);
                }
                i4 = tb4.h(this, i4);
                int i7 = i6 + 1;
                if (this.E && i7 >= this.L) {
                    break;
                }
                i6 = i7;
            }
        } else {
            float f5 = 0.0f;
            if (getViewType() == 24) {
                while (i4 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(gl.L(10.0f) + L18), de9.w(10.0f, i4, L18), gl.L(14.0f), paint4);
                    canvas2.save();
                    canvas2.translate(0.0f, -gl.L(4.0f));
                    rectF.set(gl.L(50.0f), gl.L(16.0f) + i4, gl.L(148.0f), gl.L(24.0f) + i4);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint4);
                    rectF.set(gl.L(50.0f), gl.L(38.0f) + i4, gl.L(268.0f), gl.L(46.0f) + i4);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint4);
                    if (gba.l1) {
                        rectF.set(gl.L(50.0f), gl.L(54.0f) + i4, gl.L(220.0f), gl.L(62.0f) + i4);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint4);
                    }
                    if (this.x) {
                        rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(16.0f) + i4, getMeasuredWidth() - gl.L(12.0f), gl.L(24.0f) + i4);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint4);
                    }
                    canvas2.restore();
                    i4 += c(getMeasuredWidth());
                    int i8 = i6 + 1;
                    if (this.E && i8 >= this.L) {
                        break;
                    }
                    i6 = i8;
                }
            } else if (getViewType() == 18) {
                int i9 = i4;
                while (i9 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(de9.w(9.0f, this.H, L17)), gl.L(32.0f) + i9, gl.L(25.0f), paint4);
                    if (i6 % 2 == 0) {
                        i3 = 52;
                    } else {
                        i3 = 72;
                    }
                    rectF.set(gl.L(76.0f), gl.L(20.0f) + i9, gl.L(i3 + 76), gl.L(28.0f) + i9);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint4);
                    rectF.set(gl.L(i3 + 84), gl.L(20.0f) + i9, gl.L(i3 + 168), gl.L(28.0f) + i9);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint4);
                    rectF.set(gl.L(76.0f), gl.L(42.0f) + i9, gl.L(140.0f), gl.L(50.0f) + i9);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint4);
                    Canvas canvas3 = canvas2;
                    Paint paint6 = paint4;
                    canvas3.drawLine(gl.L(76.0f), tb4.h(this, i9), getMeasuredWidth(), tb4.h(this, i9), paint6);
                    canvas2 = canvas3;
                    i9 = tb4.h(this, i9);
                    int i10 = i6 + 1;
                    if (this.E && i10 >= this.L) {
                        break;
                    }
                    i6 = i10;
                    paint4 = paint6;
                }
            } else {
                Paint paint7 = paint4;
                float f6 = 6.0f;
                float f7 = 8.0f;
                if (getViewType() != 37 && getViewType() != 38) {
                    if (getViewType() == 19) {
                        int i11 = i4;
                        while (i11 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(de9.w(9.0f, this.H, L16)), gl.L(29.0f) + i11, gl.L(20.0f), paint7);
                            if (i6 % 2 == 0) {
                                i2 = 92;
                            } else {
                                i2 = 128;
                            }
                            rectF.set(gl.L(76.0f), gl.L(16.0f) + i11, gl.L(i2 + 76), gl.L(24.0f) + i11);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                            rectF.set(gl.L(76.0f), gl.L(38.0f) + i11, gl.L(240.0f), gl.L(46.0f) + i11);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                            Canvas canvas4 = canvas2;
                            Paint paint8 = paint7;
                            canvas4.drawLine(gl.L(76.0f), tb4.h(this, i11), getMeasuredWidth(), tb4.h(this, i11), paint8);
                            canvas2 = canvas4;
                            paint7 = paint8;
                            i11 = tb4.h(this, i11);
                            int i12 = i6 + 1;
                            if (this.E && i12 >= this.L) {
                                break;
                            }
                            i6 = i12;
                        }
                    } else if (getViewType() == 1) {
                        while (i4 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(gl.L(9.0f) + L15), (gl.L(78.0f) >> 1) + i4, gl.L(25.0f), paint7);
                            rectF.set(gl.L(68.0f), gl.L(20.0f) + i4, gl.L(140.0f), gl.L(28.0f) + i4);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                            rectF.set(gl.L(68.0f), gl.L(42.0f) + i4, gl.L(260.0f), gl.L(50.0f) + i4);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                            if (this.x) {
                                rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(20.0f) + i4, getMeasuredWidth() - gl.L(12.0f), gl.L(28.0f) + i4);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                            }
                            i4 = tb4.h(this, i4);
                            int i13 = i6 + 1;
                            if (this.E && i13 >= this.L) {
                                break;
                            }
                            i6 = i13;
                        }
                    } else {
                        float f8 = 10.0f;
                        if (getViewType() != 2 && getViewType() != 27) {
                            if (getViewType() == 3) {
                                while (i4 <= getMeasuredHeight()) {
                                    rectF.set(gl.L(12.0f), gl.L(8.0f) + i4, gl.L(52.0f), gl.L(48.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                    rectF.set(gl.L(68.0f), gl.L(12.0f) + i4, gl.L(140.0f), gl.L(20.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                    rectF.set(gl.L(68.0f), gl.L(34.0f) + i4, gl.L(260.0f), gl.L(42.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                    if (this.x) {
                                        rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(12.0f) + i4, getMeasuredWidth() - gl.L(12.0f), gl.L(20.0f) + i4);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                    }
                                    i4 = tb4.h(this, i4);
                                    int i14 = i6 + 1;
                                    if (this.E && i14 >= this.L) {
                                        break;
                                    }
                                    i6 = i14;
                                }
                            } else if (getViewType() == 4) {
                                while (i4 <= getMeasuredHeight()) {
                                    canvas2.drawCircle(a(gl.L(12.0f) + L14), de9.w(6.0f, i4, L14), gl.L(44.0f) >> 1, paint7);
                                    rectF.set(gl.L(68.0f), gl.L(12.0f) + i4, gl.L(140.0f), gl.L(20.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                    rectF.set(gl.L(68.0f), gl.L(34.0f) + i4, gl.L(260.0f), gl.L(42.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                    if (this.x) {
                                        rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(12.0f) + i4, getMeasuredWidth() - gl.L(12.0f), gl.L(20.0f) + i4);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                    }
                                    i4 = tb4.h(this, i4);
                                    int i15 = i6 + 1;
                                    if (this.E && i15 >= this.L) {
                                        break;
                                    }
                                    i6 = i15;
                                }
                            } else {
                                float f9 = 2.0f;
                                float f10 = 16.0f;
                                if (getViewType() == 5) {
                                    while (i4 <= getMeasuredHeight()) {
                                        rectF.set(gl.L(10.0f), gl.L(11.0f) + i4, gl.L(62.0f), gl.L(63.0f) + i4);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                        rectF.set(gl.L(68.0f), gl.L(12.0f) + i4, gl.L(140.0f), gl.L(20.0f) + i4);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                        rectF.set(gl.L(68.0f), gl.L(34.0f) + i4, gl.L(268.0f), gl.L(42.0f) + i4);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                        rectF.set(gl.L(68.0f), gl.L(54.0f) + i4, gl.L(188.0f), gl.L(62.0f) + i4);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                        if (this.x) {
                                            rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(12.0f) + i4, getMeasuredWidth() - gl.L(12.0f), gl.L(20.0f) + i4);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                        }
                                        i4 = tb4.h(this, i4);
                                        int i16 = i6 + 1;
                                        if (this.E && i16 >= this.L) {
                                            break;
                                        }
                                        i6 = i16;
                                    }
                                } else if (getViewType() != 6 && getViewType() != 10) {
                                    if (getViewType() == 29) {
                                        while (i4 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(a(de9.w(9.0f, this.H, L13)), (gl.L(64.0f) >> 1) + i4, gl.L(23.0f), paint7);
                                            rectF.set(gl.L(68.0f) + this.H, gl.L(17.0f) + i4, gl.L(260.0f) + this.H, gl.L(25.0f) + i4);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                            rectF.set(gl.L(68.0f) + this.H, gl.L(39.0f) + i4, gl.L(140.0f) + this.H, gl.L(47.0f) + i4);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                            i4 = tb4.h(this, i4);
                                            int i17 = i6 + 1;
                                            if (this.E && i17 >= this.L) {
                                                break;
                                            }
                                            i6 = i17;
                                        }
                                    } else if (getViewType() == 33) {
                                        while (i4 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(a(de9.w(13.0f, this.H, L12)), (gl.L(58.0f) >> 1) + i4, gl.L(23.0f), paint7);
                                            rectF.set(gl.L(72.0f) + this.H, gl.L(17.0f) + i4, gl.L(260.0f) + this.H, gl.L(25.0f) + i4);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                            rectF.set(gl.L(72.0f) + this.H, gl.L(39.0f) + i4, gl.L(140.0f) + this.H, gl.L(47.0f) + i4);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                            i4 = tb4.h(this, i4);
                                            int i18 = i6 + 1;
                                            if (this.E && i18 >= this.L) {
                                                break;
                                            }
                                            i6 = i18;
                                        }
                                    } else if (getViewType() == 30) {
                                        while (i4 <= getMeasuredHeight()) {
                                            i4 += c(getMeasuredWidth());
                                            rectF.set(0.0f, i4, getMeasuredWidth(), i4);
                                            b(rectF);
                                            canvas2.drawRect(rectF, paint7);
                                            int i19 = i6 + 1;
                                            if (this.E && i19 >= this.L) {
                                                break;
                                            }
                                            i6 = i19;
                                        }
                                    } else if (getViewType() == 8) {
                                        while (i4 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(a(de9.w(11.0f, this.H, L11)), (gl.L(64.0f) >> 1) + i4, gl.L(23.0f), paint7);
                                            rectF.set(gl.L(68.0f) + this.H, gl.L(17.0f) + i4, gl.L(140.0f) + this.H, gl.L(25.0f) + i4);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                            rectF.set(gl.L(68.0f) + this.H, gl.L(39.0f) + i4, gl.L(260.0f) + this.H, gl.L(47.0f) + i4);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                            if (this.x) {
                                                rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(20.0f) + i4, getMeasuredWidth() - gl.L(12.0f), gl.L(28.0f) + i4);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                            }
                                            i4 = tb4.h(this, i4);
                                            int i20 = i6 + 1;
                                            if (this.E && i20 >= this.L) {
                                                break;
                                            }
                                            i6 = i20;
                                        }
                                    } else if (getViewType() == 9) {
                                        while (i4 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(a(gl.L(35.0f)), (c(getMeasuredWidth()) >> 1) + i4, gl.L(32.0f) / 2, paint7);
                                            rectF.set(gl.L(72.0f), gl.L(16.0f) + i4, gl.L(268.0f), gl.L(24.0f) + i4);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                            rectF.set(gl.L(72.0f), gl.L(38.0f) + i4, gl.L(140.0f), gl.L(46.0f) + i4);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                            if (this.x) {
                                                rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(16.0f) + i4, getMeasuredWidth() - gl.L(12.0f), gl.L(24.0f) + i4);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                            }
                                            i4 = tb4.h(this, i4);
                                            int i21 = i6 + 1;
                                            if (this.E && i21 >= this.L) {
                                                break;
                                            }
                                            i6 = i21;
                                        }
                                    } else if (getViewType() == 11) {
                                        int i22 = 0;
                                        while (i4 <= getMeasuredHeight()) {
                                            rectF.set(gl.L(18.0f), gl.L(14.0f), (getMeasuredWidth() * 0.5f) + gl.L(this.N[0] * 40.0f), gl.L(8.0f) + gl.L(14.0f));
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                            rectF.set(getMeasuredWidth() - gl.L(18.0f), gl.L(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - gl.L(this.N[0] * 20.0f), gl.L(8.0f) + gl.L(14.0f));
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                            i4 = tb4.h(this, i4);
                                            i22++;
                                            if (this.E && i22 >= this.L) {
                                                break;
                                            }
                                        }
                                    } else if (getViewType() == 12) {
                                        int L22 = gl.L(14.0f) + i4;
                                        while (L22 <= getMeasuredHeight()) {
                                            int measuredWidth3 = getMeasuredWidth() / 4;
                                            for (int i23 = 0; i23 < 4; i23++) {
                                                float f11 = (measuredWidth3 / 2.0f) + (measuredWidth3 * i23);
                                                canvas2.drawCircle(f11, (gl.L(56.0f) / 2.0f) + gl.L(7.0f) + L22, gl.L(28.0f), paint7);
                                                float L23 = gl.L(16.0f) + gl.L(56.0f) + gl.L(7.0f) + L22;
                                                RectF rectF2 = gl.P;
                                                rectF2.set(f11 - gl.L(24.0f), L23 - gl.L(4.0f), f11 + gl.L(24.0f), L23 + gl.L(4.0f));
                                                canvas2.drawRoundRect(rectF2, gl.L(4.0f), gl.L(4.0f), paint7);
                                            }
                                            L22 = tb4.h(this, L22);
                                            if (this.E) {
                                                break;
                                            }
                                        }
                                    } else if (getViewType() == 13) {
                                        float measuredHeight2 = getMeasuredHeight() / 2.0f;
                                        RectF rectF3 = gl.P;
                                        rectF3.set(gl.L(40.0f), measuredHeight2 - gl.L(4.0f), getMeasuredWidth() - gl.L(120.0f), gl.L(4.0f) + measuredHeight2);
                                        canvas2.drawRoundRect(rectF3, gl.L(4.0f), gl.L(4.0f), paint7);
                                        if (this.O == null) {
                                            Paint paint9 = new Paint(1);
                                            this.O = paint9;
                                            paint9.setColor(bkb.u0(bkb.F8));
                                        }
                                        for (int i24 = 0; i24 < 3; i24++) {
                                            canvas2.drawCircle(de9.y(12.0f, i24, gl.L(13.0f) + (getMeasuredWidth() - gl.L(56.0f))), measuredHeight2, gl.L(13.0f), this.O);
                                            canvas2.drawCircle(de9.y(12.0f, i24, gl.L(13.0f) + (getMeasuredWidth() - gl.L(56.0f))), measuredHeight2, gl.L(12.0f), paint7);
                                        }
                                    } else {
                                        float f12 = 21.0f;
                                        if (getViewType() != 14 && getViewType() != 17) {
                                            if (getViewType() == 15) {
                                                int L24 = gl.L(23.0f);
                                                int L25 = gl.L(4.0f);
                                                while (i4 <= getMeasuredHeight()) {
                                                    canvas2.drawCircle(a(de9.w(12.0f, this.H, L24)), de9.w(8.0f, i4, L24), L24, paint7);
                                                    rectF.set(gl.L(74.0f) + this.H, gl.L(12.0f) + i4, gl.L(260.0f) + this.H, gl.L(20.0f) + i4);
                                                    b(rectF);
                                                    float f13 = L25;
                                                    canvas2.drawRoundRect(rectF, f13, f13, paint7);
                                                    float f14 = f5;
                                                    rectF.set(gl.L(74.0f) + this.H, gl.L(36.0f) + i4, gl.L(140.0f) + this.H, gl.L(42.0f) + i4);
                                                    b(rectF);
                                                    canvas2.drawRoundRect(rectF, f13, f13, paint7);
                                                    if (this.U > f14) {
                                                        rectF.set(gl.L(73.0f) + this.H, gl.L(62.0f) + i4, gl.L(73.0f) + this.H + this.U, gl.L(94.0f) + i4);
                                                        b(rectF);
                                                        canvas2.drawRoundRect(rectF, f13, f13, paint7);
                                                    }
                                                    i4 = tb4.h(this, i4);
                                                    int i25 = i6 + 1;
                                                    if (this.E && i25 >= this.L) {
                                                        break;
                                                    }
                                                    i6 = i25;
                                                    f5 = f14;
                                                }
                                            } else if (getViewType() != 16 && getViewType() != 23) {
                                                int i26 = this.F;
                                                if (i26 == 21) {
                                                    while (i4 <= getMeasuredHeight()) {
                                                        canvas2.drawCircle(a(gl.L(20.0f) + L10), (gl.L(58.0f) >> 1) + i4, gl.L(46.0f) >> 1, paint7);
                                                        rectF.set(gl.L(74.0f), gl.L(16.0f) + i4, gl.L(140.0f), gl.L(24.0f) + i4);
                                                        b(rectF);
                                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                                        rectF.set(gl.L(74.0f), gl.L(38.0f) + i4, gl.L(260.0f), gl.L(46.0f) + i4);
                                                        b(rectF);
                                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                                        i4 = tb4.h(this, i4);
                                                        int i27 = i6 + 1;
                                                        if (this.E && i27 >= this.L) {
                                                            break;
                                                        }
                                                        i6 = i27;
                                                    }
                                                } else if (i26 == 22) {
                                                    while (i4 <= getMeasuredHeight()) {
                                                        canvas2.drawCircle(a(gl.L(20.0f) + L9), de9.w(6.0f, i4, L9), gl.L(48.0f) >> 1, paint7);
                                                        rectF.set(gl.L(76.0f), gl.L(16.0f) + i4, gl.L(140.0f), gl.L(24.0f) + i4);
                                                        b(rectF);
                                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                                        rectF.set(gl.L(76.0f), gl.L(38.0f) + i4, gl.L(260.0f), gl.L(46.0f) + i4);
                                                        b(rectF);
                                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                                        i4 = tb4.h(this, i4);
                                                        int i28 = i6 + 1;
                                                        if (this.E && i28 >= this.L) {
                                                            break;
                                                        }
                                                        i6 = i28;
                                                    }
                                                } else if (i26 == 25) {
                                                    while (i4 <= getMeasuredHeight()) {
                                                        canvas2.drawCircle(gl.L(17.0f) + L8, de9.w(6.0f, i4, L8), gl.L(38.0f) >> 1, paint7);
                                                        rectF.set(gl.L(76.0f), gl.L(21.0f) + i4, gl.L(220.0f), gl.L(29.0f) + i4);
                                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                                        i4 = tb4.h(this, i4);
                                                        int i29 = i6 + 1;
                                                        if (this.E && i29 >= this.L) {
                                                            break;
                                                        }
                                                        i6 = i29;
                                                    }
                                                } else if (i26 == 26) {
                                                    while (i4 <= getMeasuredHeight()) {
                                                        int L26 = gl.L(21.0f) >> 1;
                                                        if (k96.a0) {
                                                            L7 = ls6.x(21.0f, getMeasuredWidth(), L26);
                                                        } else {
                                                            L7 = gl.L(21.0f) + L26;
                                                        }
                                                        canvas2.drawCircle(L7, de9.w(f10, i4, L26), L26, paint7);
                                                        rectF.set(gl.L(60.0f), gl.L(21.0f) + i4, gl.L(190.0f), gl.L(29.0f) + i4);
                                                        b(rectF);
                                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                                        f10 = 16.0f;
                                                        rectF.set(getMeasuredWidth() - gl.L(16.0f), gl.L(21.0f) + i4, getMeasuredWidth() - gl.L(62.0f), gl.L(29.0f) + i4);
                                                        b(rectF);
                                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                                        i4 = tb4.h(this, i4);
                                                        int i30 = i6 + 1;
                                                        if (this.E && i30 >= this.L) {
                                                            break;
                                                        }
                                                        i6 = i30;
                                                    }
                                                } else if (getViewType() == 28) {
                                                    while (i4 <= getMeasuredHeight()) {
                                                        canvas2.drawCircle(a(de9.w(f8, this.H, L6)), (gl.L(58.0f) >> 1) + i4, gl.L(24.0f), paint7);
                                                        rectF.set(gl.L(68.0f) + this.H, gl.L(17.0f) + i4, gl.L(260.0f) + this.H, gl.L(25.0f) + i4);
                                                        b(rectF);
                                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                                        rectF.set(gl.L(68.0f) + this.H, gl.L(39.0f) + i4, gl.L(140.0f) + this.H, gl.L(47.0f) + i4);
                                                        b(rectF);
                                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                                        if (this.x) {
                                                            rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(20.0f) + i4, getMeasuredWidth() - gl.L(12.0f), gl.L(28.0f) + i4);
                                                            b(rectF);
                                                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                                        }
                                                        i4 = tb4.h(this, i4);
                                                        int i31 = i6 + 1;
                                                        if (this.E && i31 >= this.L) {
                                                            break;
                                                        }
                                                        i6 = i31;
                                                        f8 = 10.0f;
                                                    }
                                                } else if (getViewType() == 31) {
                                                    while (i4 <= getMeasuredHeight()) {
                                                        int c2 = c(getMeasuredWidth());
                                                        float f15 = i4;
                                                        rectF.set(gl.L(18.0f) + this.H, ((c2 - gl.L(22.0f)) / 2.0f) + f15, gl.L(40.0f) + this.H, ((gl.L(22.0f) + c2) / 2.0f) + f15);
                                                        b(rectF);
                                                        canvas2.drawRoundRect(rectF, gl.L(11.0f), gl.L(11.0f), paint7);
                                                        rectF.set(gl.L(58.0f) + this.H, ((c2 - gl.L(8.0f)) / 2.0f) + f15, b00.x(19.0f, getMeasuredWidth(), gl.L(132.0f) + this.H), ((gl.L(8.0f) + c2) / 2.0f) + f15);
                                                        b(rectF);
                                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                                        i4 += c2;
                                                        int i32 = i6 + 1;
                                                        if (this.E && i32 >= this.L) {
                                                            break;
                                                        }
                                                        i6 = i32;
                                                    }
                                                } else if (getViewType() == 32) {
                                                    while (i4 <= getMeasuredHeight()) {
                                                        int c3 = c(getMeasuredWidth());
                                                        float f16 = i4;
                                                        rectF.set(gl.L(10.0f) + this.H, ((c3 - gl.L(32.0f)) / 2.0f) + f16, gl.L(42.0f) + this.H, ((gl.L(32.0f) + c3) / 2.0f) + f16);
                                                        b(rectF);
                                                        canvas2.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint7);
                                                        rectF.set(gl.L(64.0f) + this.H, (((c3 - gl.L(14.0f)) - gl.L(10.0f)) / 2.0f) + f16, b00.x(19.0f, getMeasuredWidth(), gl.L(118.0f) + this.H), ((gl.L(10.0f) + (c3 - gl.L(14.0f))) / 2.0f) + f16);
                                                        b(rectF);
                                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                                        rectF.set(gl.L(64.0f) + this.H, (((gl.L(14.0f) + c3) - gl.L(8.0f)) / 2.0f) + f16, b00.x(19.0f, getMeasuredWidth(), gl.L(144.0f) + this.H), ((gl.L(8.0f) + (gl.L(14.0f) + c3)) / 2.0f) + f16);
                                                        b(rectF);
                                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                                        i4 += c3;
                                                        int i33 = i6 + 1;
                                                        if (this.E && i33 >= this.L) {
                                                            break;
                                                        }
                                                        i6 = i33;
                                                    }
                                                } else if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
                                                    rectF.set(this.H, this.G, getMeasuredWidth() - this.H, getMeasuredHeight() - this.G);
                                                    rectF.inset(gl.L(3.33f), gl.L(4.0f));
                                                    canvas2.drawRoundRect(rectF, gl.L(11.0f), gl.L(11.0f), paint7);
                                                }
                                            } else {
                                                int i34 = 0;
                                                while (i4 <= getMeasuredHeight()) {
                                                    canvas2.drawCircle(a(de9.w(8.0f, this.H, L4)), gl.L(24.0f) + i4, gl.L(18.0f), paint7);
                                                    rectF.set(gl.L(58.0f) + this.H, gl.L(20.0f) + i4, getWidth() - gl.L(53.0f), gl.L(28.0f) + i4);
                                                    b(rectF);
                                                    canvas2.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint7);
                                                    if (i34 < 4) {
                                                        canvas2.drawCircle(a(ls6.x(12.0f, getWidth(), L5)), gl.L(24.0f) + i4, gl.L(12.0f), paint7);
                                                    }
                                                    i4 = tb4.h(this, i4);
                                                    i34++;
                                                    if (this.E && i34 >= this.L) {
                                                        break;
                                                    }
                                                }
                                                rectF.set(gl.L(8.0f) + this.H, gl.L(20.0f) + i4, getWidth() - gl.L(8.0f), gl.L(28.0f) + i4);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint7);
                                                rectF.set(gl.L(8.0f) + this.H, gl.L(36.0f) + i4, getWidth() - gl.L(53.0f), gl.L(44.0f) + i4);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint7);
                                            }
                                        } else {
                                            int L27 = gl.L(12.0f);
                                            int L28 = gl.L(77.0f);
                                            int L29 = gl.L(4.0f);
                                            float L30 = gl.L(21.0f);
                                            float L31 = gl.L(41.0f);
                                            while (L27 < getMeasuredWidth()) {
                                                Paint paint10 = this.O;
                                                if (paint10 == null) {
                                                    paint10 = new Paint(1);
                                                    this.O = paint10;
                                                }
                                                paint10.setColor(bkb.v0(bkb.g5, this.M));
                                                RectF rectF4 = gl.P;
                                                int i35 = L27 + L28;
                                                float f17 = f12;
                                                float f18 = f6;
                                                rectF4.set(gl.L(4.0f) + L27, gl.L(4.0f), i35 - gl.L(4.0f), getMeasuredHeight() - gl.L(4.0f));
                                                canvas2.drawRoundRect(rectF4, gl.L(f18), gl.L(f18), paint7);
                                                if (getViewType() == 14) {
                                                    float L32 = gl.L(f7) + L29;
                                                    float f19 = L27;
                                                    float L33 = gl.L(22.0f) + L29 + f19;
                                                    rectF.set(L33, L32, L33 + L31, L32 + L30);
                                                    canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.O);
                                                    float L34 = gl.L(4.0f) + L30 + L32;
                                                    float L35 = f19 + gl.L(5.0f) + L29;
                                                    rectF.set(L35, L34, L35 + L31, L34 + L30);
                                                    canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.O);
                                                } else if (getViewType() == 17) {
                                                    float L36 = gl.L(5.0f);
                                                    float L37 = gl.L(32.0f);
                                                    f4 = f7;
                                                    float z2 = oo1.z(L28, L37, f9, L27);
                                                    rectF4.set(z2, gl.L(f17), L37 + z2, gl.L(32.0f) + L3);
                                                    canvas2.drawRoundRect(rectF4, L36, L36, this.O);
                                                    canvas2.drawCircle((L28 / 2) + L27, getMeasuredHeight() - gl.L(20.0f), gl.L(f4), this.O);
                                                    L27 = i35;
                                                    f7 = f4;
                                                    f12 = f17;
                                                    f6 = f18;
                                                    f9 = 2.0f;
                                                }
                                                f4 = f7;
                                                canvas2.drawCircle((L28 / 2) + L27, getMeasuredHeight() - gl.L(20.0f), gl.L(f4), this.O);
                                                L27 = i35;
                                                f7 = f4;
                                                f12 = f17;
                                                f6 = f18;
                                                f9 = 2.0f;
                                            }
                                        }
                                    }
                                } else {
                                    while (i4 <= getMeasuredHeight()) {
                                        canvas2.drawCircle(a(de9.w(9.0f, this.H, L2)), (gl.L(64.0f) >> 1) + i4, gl.L(23.0f), paint7);
                                        rectF.set(gl.L(68.0f) + this.H, gl.L(17.0f) + i4, gl.L(260.0f) + this.H, gl.L(25.0f) + i4);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                        rectF.set(gl.L(68.0f) + this.H, gl.L(39.0f) + i4, gl.L(140.0f) + this.H, gl.L(47.0f) + i4);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                        if (this.x) {
                                            rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(20.0f) + i4, getMeasuredWidth() - gl.L(12.0f), gl.L(28.0f) + i4);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                                        }
                                        i4 = tb4.h(this, i4);
                                        int i36 = i6 + 1;
                                        if (this.E && i36 >= this.L) {
                                            break;
                                        }
                                        i6 = i36;
                                    }
                                }
                            }
                        } else {
                            int i37 = 2;
                            int measuredWidth4 = (getMeasuredWidth() - ((getColumnsCount() - 1) * gl.L(2.0f))) / getColumnsCount();
                            if (getViewType() == 27) {
                                i = (int) (measuredWidth4 * 1.25f);
                            } else {
                                i = measuredWidth4;
                            }
                            int i38 = i4;
                            int i39 = 0;
                            while (true) {
                                if (i38 >= getMeasuredHeight() && !this.E) {
                                    break;
                                }
                                int i40 = 0;
                                while (i40 < getColumnsCount()) {
                                    if (i39 == 0 && i40 < this.w) {
                                        paint2 = paint7;
                                    } else {
                                        paint2 = paint7;
                                        canvas.drawRect((gl.L(2.0f) + measuredWidth4) * i40, i38, L + measuredWidth4, i38 + i, paint2);
                                    }
                                    i40++;
                                    paint7 = paint2;
                                }
                                Paint paint11 = paint7;
                                i38 = de9.w(2.0f, i, i38);
                                i39++;
                                int i41 = i37;
                                if (this.E && i39 >= i41) {
                                    break;
                                }
                                i37 = i41;
                                paint7 = paint11;
                            }
                        }
                    }
                } else {
                    if (getViewType() == 37) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int c4 = c(getMeasuredWidth());
                    while (i4 <= getMeasuredHeight()) {
                        int i42 = this.H;
                        if (z) {
                            canvas2.drawCircle(gl.L(36.0f) + i42, gl.L(35.0f) + i4, gl.L(23.0f), paint7);
                        } else {
                            rectF.set(gl.L(15.0f) + i42, gl.L(6.0f) + i4, gl.L(61.0f) + this.H, gl.L(52.0f) + i4);
                            canvas2.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint7);
                        }
                        float L38 = gl.L(71.0f) + this.H;
                        int measuredWidth5 = getMeasuredWidth();
                        if (z) {
                            f = 76.0f;
                        } else {
                            f = 20.0f;
                        }
                        float max = Math.max(L38, measuredWidth5 - gl.L(f));
                        rectF.set(L38, gl.L(14.0f) + i4, Math.min(gl.L(100.0f) + L38, max), gl.L(22.0f) + i4);
                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                        if (z) {
                            f2 = 33.0f;
                        } else {
                            f2 = 36.0f;
                        }
                        float L39 = gl.L(f2) + i4;
                        float min = Math.min(gl.L(140.0f) + L38, max);
                        if (z) {
                            f3 = 41.0f;
                        } else {
                            f3 = 44.0f;
                        }
                        rectF.set(L38, L39, min, gl.L(f3) + i4);
                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                        if (z) {
                            rectF.set(L38, gl.L(51.0f) + i4, Math.min(gl.L(80.0f) + L38, max), gl.L(59.0f) + i4);
                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                            if (getMeasuredWidth() - gl.L(68.0f) >= L38) {
                                rectF.set(getMeasuredWidth() - gl.L(68.0f), gl.L(15.0f) + i4, getMeasuredWidth() - gl.L(20.0f), gl.L(23.0f) + i4);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint7);
                            }
                        }
                        i4 += c4;
                        int i43 = i6 + 1;
                        if (this.E && i43 >= this.L) {
                            break;
                        }
                        i6 = i43;
                    }
                }
            }
        }
        invalidate();
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (this.E) {
            int i3 = this.L;
            if (i3 > 1 && this.T) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + (c(View.MeasureSpec.getSize(i)) * this.L), 1073741824));
                return;
            } else if (i3 > 1 && View.MeasureSpec.getSize(i2) > 0) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + Math.min(View.MeasureSpec.getSize(i2), c(View.MeasureSpec.getSize(i)) * this.L), 1073741824));
                return;
            } else {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + c(View.MeasureSpec.getSize(i)), 1073741824));
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setGlobalGradientView(pi4 pi4Var) {
        this.S = pi4Var;
    }

    public void setIgnoreHeightCheck(boolean z) {
        this.T = z;
    }

    public void setIsSingleCell(boolean z) {
        this.E = z;
    }

    public void setItemsCount(int i) {
        this.L = i;
    }

    public void setMemberRequestButton(boolean z) {
        int i;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(gl.o());
        textPaint.setTextSize(gl.L(14.0f));
        float L = gl.L(34.0f);
        if (z) {
            i = 2131754375;
        } else {
            i = 2131754370;
        }
        this.U = textPaint.measureText(k96.M0(i, null)) + L;
    }

    public void setPaddingLeft(int i) {
        this.H = i;
        invalidate();
    }

    public void setPaddingTop(int i) {
        this.G = i;
        invalidate();
    }

    public void setUseHeaderOffset(boolean z) {
        this.y = z;
    }

    public void setViewType(int i) {
        this.F = i;
        if (i == 11) {
            Random random = new Random();
            this.N = new float[2];
            for (int i2 = 0; i2 < 2; i2++) {
                this.N[i2] = Math.abs(random.nextInt() % 1000) / 1000.0f;
            }
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        LinearGradient linearGradient;
        int i;
        pi4 pi4Var = this.S;
        if (pi4Var != null) {
            pi4Var.updateColors();
            return;
        }
        int i2 = this.I;
        wjb wjbVar = this.M;
        int v0 = bkb.v0(i2, wjbVar);
        int v02 = bkb.v0(this.J, wjbVar);
        if (this.s == v02 && this.r == v0) {
            return;
        }
        this.r = v0;
        this.s = v02;
        int i3 = this.F;
        if (i3 != 34 && i3 != 35 && i3 != 36) {
            if (!this.E && i3 != 13 && i3 != 14 && i3 != 17) {
                this.a = gl.L(600.0f);
            } else {
                this.a = gl.L(200.0f);
            }
        } else {
            this.a = gl.q.x;
        }
        if (!this.E && (i = this.F) != 13 && i != 14 && i != 17) {
            linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.a, new int[]{v02, v0, v0, v02}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.b = linearGradient;
        } else {
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, this.a, 0.0f, new int[]{v02, v0, v0, v02}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.b = linearGradient2;
            linearGradient = linearGradient2;
        }
        this.c.setShader(linearGradient);
    }

    public pi4(Context context) {
        this(context, null);
    }
}
