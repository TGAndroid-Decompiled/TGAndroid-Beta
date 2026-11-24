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
public class tk4 extends View implements vlb {
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final ylb M;
    public float[] N;
    public Paint O;
    public int P;
    public int Q;
    public float R;
    public tk4 S;
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

    public tk4(Context context, ylb ylbVar) {
        super(context);
        this.c = new Paint();
        this.d = new Paint();
        this.n = new RectF();
        this.x = true;
        this.I = cmb.F8;
        this.J = cmb.h6;
        this.K = -1;
        this.L = 1;
        this.M = ylbVar;
        this.h = new Matrix();
    }

    public final float a(float f) {
        if (jb6.a0) {
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
        if (jb6.a0) {
            rectF.left = getMeasuredWidth() - rectF.left;
            rectF.right = getMeasuredWidth() - rectF.right;
        }
    }

    public final int c(int i) {
        int i2;
        int i3;
        switch (getViewType()) {
            case 1:
                return gm.L(78.0f) + 1;
            case 2:
                return gm.L(2.0f) + ((i - ((getColumnsCount() - 1) * gm.L(2.0f))) / getColumnsCount());
            case 3:
            case 4:
                return gm.L(56.0f);
            case 5:
                return gm.L(80.0f);
            case 6:
            case 18:
                return gm.L(64.0f);
            case 7:
                if (gda.l1) {
                    i2 = 78;
                } else {
                    i2 = 72;
                }
                return gm.L(i2 + 1);
            case 8:
                return gm.L(61.0f);
            case 9:
                return gm.L(66.0f);
            case 10:
                return gm.L(58.0f);
            case 11:
                return gm.L(36.0f);
            case 12:
                return gm.L(103.0f);
            case 13:
            case 14:
            case 17:
            case 20:
            case 27:
            default:
                return 0;
            case 15:
                return gm.L(107.0f);
            case 16:
            case 23:
                return gm.L(50.0f);
            case 19:
                return gm.L(58.0f);
            case 21:
                return gm.L(58.0f);
            case 22:
                return gm.L(60.0f);
            case 24:
                if (gda.l1) {
                    i3 = 76;
                } else {
                    i3 = 64;
                }
                return gm.L(i3 + 1);
            case 25:
                return gm.L(51.0f);
            case 26:
                return gm.L(50.0f) + 1;
            case 28:
                return gm.L(58.0f);
            case 29:
                return gm.L(60.0f) + 1;
            case 30:
                return gm.L(32.0f);
            case 31:
                return gm.L(48.0f) + 1;
            case 32:
                return gm.L(56.0f) + 1;
            case 33:
                return gm.L(58.0f);
            case 34:
                return gm.L(140.0f);
            case 35:
                return gm.L(112.0f);
            case 36:
                return gm.L(108.0f);
            case 37:
                return gm.L(73.0f);
            case 38:
                return gm.L(58.0f);
            case 39:
                return gm.L(96.0f);
        }
    }

    public final int d(int i) {
        return cmb.v0(i, this.M);
    }

    public final void e(int i, int i2, int i3) {
        this.I = i;
        this.J = i2;
        this.K = i3;
        invalidate();
    }

    public final void f() {
        tk4 tk4Var = this.S;
        if (tk4Var != null) {
            tk4Var.f();
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
            i = Math.max(i, gm.q.x);
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
        float f5;
        Paint paint3;
        if (this.S != null) {
            if (getParent() != null) {
                View view = (View) getParent();
                tk4 tk4Var = this.S;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                tk4Var.P = measuredWidth;
                tk4Var.Q = measuredHeight;
                tk4Var.R = -getX();
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
            int L20 = gm.L(32.0f) + i4;
            int i5 = this.K;
            Paint paint5 = this.d;
            if (i5 >= 0) {
                paint5.setColor(d(i5));
            }
            float measuredWidth2 = getMeasuredWidth();
            float L21 = gm.L(32.0f);
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
        float f6 = 8.0f;
        float f7 = 2.0f;
        int i6 = 0;
        RectF rectF = this.n;
        if (viewType == 39) {
            canvas2.save();
            if (jb6.a0) {
                canvas2.scale(-1.0f, 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            }
            int i7 = 0;
            while (i4 < getMeasuredHeight()) {
                canvas2.drawCircle(gm.L(22.0f), gm.L(18.0f) + i4, gm.L(f6), paint4);
                rectF.set(gm.L(36.0f), gm.L(12.0f) + i4, gm.L(128.0f), gm.L(24.0f) + i4);
                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint4);
                rectF.set(getMeasuredWidth() - gm.L(83.0f), gm.L(10.0f) + i4, getMeasuredWidth() - gm.L(11.0f), gm.L(82.0f) + i4);
                canvas2.drawRoundRect(rectF, gm.L(f6), gm.L(f6), paint4);
                int i8 = 0;
                while (i8 < 3) {
                    float L22 = gm.L(14.0f);
                    int i9 = i8 * 18;
                    float L23 = gm.L(i9 + 33) + i4;
                    int measuredWidth3 = getMeasuredWidth();
                    if (i8 == 2) {
                        f5 = 136.0f;
                    } else {
                        f5 = 100.0f;
                    }
                    rectF.set(L22, L23, measuredWidth3 - gm.L(f5), gm.L(i9 + 45) + i4);
                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint4);
                    i8++;
                    f6 = f6;
                }
                float f8 = f6;
                i4 = td4.h(this, i4);
                if (this.E && (i7 = i7 + 1) >= this.L) {
                    break;
                }
                f6 = f8;
            }
            canvas2.restore();
        } else {
            float f9 = 8.0f;
            int i10 = 1;
            if (getViewType() == 7) {
                while (i4 <= getMeasuredHeight()) {
                    int c = c(getMeasuredWidth());
                    canvas2.drawCircle(a(gm.L(10.0f) + L19), (c >> 1) + i4, gm.L(28.0f), paint4);
                    rectF.set(gm.L(76.0f), gm.L(16.0f) + i4, gm.L(148.0f), gm.L(24.0f) + i4);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint4);
                    rectF.set(gm.L(76.0f), gm.L(38.0f) + i4, gm.L(268.0f), gm.L(46.0f) + i4);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint4);
                    if (gda.l1) {
                        rectF.set(gm.L(76.0f), gm.L(54.0f) + i4, gm.L(220.0f), gm.L(62.0f) + i4);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint4);
                    }
                    if (this.x) {
                        rectF.set(getMeasuredWidth() - gm.L(50.0f), gm.L(16.0f) + i4, getMeasuredWidth() - gm.L(12.0f), gm.L(24.0f) + i4);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint4);
                    }
                    i4 = td4.h(this, i4);
                    int i11 = i6 + 1;
                    if (this.E && i11 >= this.L) {
                        break;
                    }
                    i6 = i11;
                }
            } else if (getViewType() == 24) {
                while (i4 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(gm.L(10.0f) + L18), hg9.v(10.0f, i4, L18), gm.L(14.0f), paint4);
                    canvas2.save();
                    canvas2.translate(0.0f, -gm.L(4.0f));
                    rectF.set(gm.L(50.0f), gm.L(16.0f) + i4, gm.L(148.0f), gm.L(24.0f) + i4);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint4);
                    rectF.set(gm.L(50.0f), gm.L(38.0f) + i4, gm.L(268.0f), gm.L(46.0f) + i4);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint4);
                    if (gda.l1) {
                        rectF.set(gm.L(50.0f), gm.L(54.0f) + i4, gm.L(220.0f), gm.L(62.0f) + i4);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint4);
                    }
                    if (this.x) {
                        rectF.set(getMeasuredWidth() - gm.L(50.0f), gm.L(16.0f) + i4, getMeasuredWidth() - gm.L(12.0f), gm.L(24.0f) + i4);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint4);
                    }
                    canvas2.restore();
                    i4 += c(getMeasuredWidth());
                    int i12 = i6 + 1;
                    if (this.E && i12 >= this.L) {
                        break;
                    }
                    i6 = i12;
                }
            } else if (getViewType() == 18) {
                int i13 = i4;
                while (i13 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(hg9.v(9.0f, this.H, L17)), gm.L(32.0f) + i13, gm.L(25.0f), paint4);
                    if (i6 % 2 == 0) {
                        i3 = 52;
                    } else {
                        i3 = 72;
                    }
                    rectF.set(gm.L(76.0f), gm.L(20.0f) + i13, gm.L(i3 + 76), gm.L(28.0f) + i13);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint4);
                    rectF.set(gm.L(i3 + 84), gm.L(20.0f) + i13, gm.L(i3 + 168), gm.L(28.0f) + i13);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint4);
                    rectF.set(gm.L(76.0f), gm.L(42.0f) + i13, gm.L(140.0f), gm.L(50.0f) + i13);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint4);
                    Canvas canvas3 = canvas2;
                    Paint paint6 = paint4;
                    canvas3.drawLine(gm.L(76.0f), td4.h(this, i13), getMeasuredWidth(), td4.h(this, i13), paint6);
                    canvas2 = canvas3;
                    i13 = td4.h(this, i13);
                    int i14 = i6 + 1;
                    if (this.E && i14 >= this.L) {
                        break;
                    }
                    i6 = i14;
                    paint4 = paint6;
                }
            } else {
                Paint paint7 = paint4;
                float f10 = 10.0f;
                float f11 = 6.0f;
                if (getViewType() != 37 && getViewType() != 38) {
                    if (getViewType() == 19) {
                        int i15 = i4;
                        while (i15 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(hg9.v(9.0f, this.H, L16)), gm.L(29.0f) + i15, gm.L(20.0f), paint7);
                            if (i6 % 2 == 0) {
                                i2 = 92;
                            } else {
                                i2 = 128;
                            }
                            rectF.set(gm.L(76.0f), gm.L(16.0f) + i15, gm.L(i2 + 76), gm.L(24.0f) + i15);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                            rectF.set(gm.L(76.0f), gm.L(38.0f) + i15, gm.L(240.0f), gm.L(46.0f) + i15);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                            Canvas canvas4 = canvas2;
                            Paint paint8 = paint7;
                            canvas4.drawLine(gm.L(76.0f), td4.h(this, i15), getMeasuredWidth(), td4.h(this, i15), paint8);
                            canvas2 = canvas4;
                            paint7 = paint8;
                            i15 = td4.h(this, i15);
                            int i16 = i6 + 1;
                            if (this.E && i16 >= this.L) {
                                break;
                            }
                            i6 = i16;
                        }
                    } else if (getViewType() == 1) {
                        while (i4 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(gm.L(9.0f) + L15), (gm.L(78.0f) >> 1) + i4, gm.L(25.0f), paint7);
                            rectF.set(gm.L(68.0f), gm.L(20.0f) + i4, gm.L(140.0f), gm.L(28.0f) + i4);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                            rectF.set(gm.L(68.0f), gm.L(42.0f) + i4, gm.L(260.0f), gm.L(50.0f) + i4);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                            if (this.x) {
                                rectF.set(getMeasuredWidth() - gm.L(50.0f), gm.L(20.0f) + i4, getMeasuredWidth() - gm.L(12.0f), gm.L(28.0f) + i4);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                            }
                            i4 = td4.h(this, i4);
                            int i17 = i6 + 1;
                            if (this.E && i17 >= this.L) {
                                break;
                            }
                            i6 = i17;
                        }
                    } else if (getViewType() != 2 && getViewType() != 27) {
                        if (getViewType() == 3) {
                            while (i4 <= getMeasuredHeight()) {
                                rectF.set(gm.L(12.0f), gm.L(8.0f) + i4, gm.L(52.0f), gm.L(48.0f) + i4);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                rectF.set(gm.L(68.0f), gm.L(12.0f) + i4, gm.L(140.0f), gm.L(20.0f) + i4);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                rectF.set(gm.L(68.0f), gm.L(34.0f) + i4, gm.L(260.0f), gm.L(42.0f) + i4);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                if (this.x) {
                                    rectF.set(getMeasuredWidth() - gm.L(50.0f), gm.L(12.0f) + i4, getMeasuredWidth() - gm.L(12.0f), gm.L(20.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                }
                                i4 = td4.h(this, i4);
                                int i18 = i6 + 1;
                                if (this.E && i18 >= this.L) {
                                    break;
                                }
                                i6 = i18;
                            }
                        } else if (getViewType() == 4) {
                            while (i4 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(gm.L(12.0f) + L14), hg9.v(6.0f, i4, L14), gm.L(44.0f) >> 1, paint7);
                                rectF.set(gm.L(68.0f), gm.L(12.0f) + i4, gm.L(140.0f), gm.L(20.0f) + i4);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                rectF.set(gm.L(68.0f), gm.L(34.0f) + i4, gm.L(260.0f), gm.L(42.0f) + i4);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                if (this.x) {
                                    rectF.set(getMeasuredWidth() - gm.L(50.0f), gm.L(12.0f) + i4, getMeasuredWidth() - gm.L(12.0f), gm.L(20.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                }
                                i4 = td4.h(this, i4);
                                int i19 = i6 + 1;
                                if (this.E && i19 >= this.L) {
                                    break;
                                }
                                i6 = i19;
                            }
                        } else if (getViewType() == 5) {
                            while (i4 <= getMeasuredHeight()) {
                                rectF.set(gm.L(10.0f), gm.L(11.0f) + i4, gm.L(62.0f), gm.L(63.0f) + i4);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                rectF.set(gm.L(68.0f), gm.L(12.0f) + i4, gm.L(140.0f), gm.L(20.0f) + i4);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                rectF.set(gm.L(68.0f), gm.L(34.0f) + i4, gm.L(268.0f), gm.L(42.0f) + i4);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                rectF.set(gm.L(68.0f), gm.L(54.0f) + i4, gm.L(188.0f), gm.L(62.0f) + i4);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                if (this.x) {
                                    rectF.set(getMeasuredWidth() - gm.L(50.0f), gm.L(12.0f) + i4, getMeasuredWidth() - gm.L(12.0f), gm.L(20.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                }
                                i4 = td4.h(this, i4);
                                int i20 = i6 + 1;
                                if (this.E && i20 >= this.L) {
                                    break;
                                }
                                i6 = i20;
                            }
                        } else if (getViewType() != 6 && getViewType() != 10) {
                            if (getViewType() == 29) {
                                while (i4 <= getMeasuredHeight()) {
                                    canvas2.drawCircle(a(hg9.v(9.0f, this.H, L13)), (gm.L(64.0f) >> 1) + i4, gm.L(23.0f), paint7);
                                    rectF.set(gm.L(68.0f) + this.H, gm.L(17.0f) + i4, gm.L(260.0f) + this.H, gm.L(25.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                    rectF.set(gm.L(68.0f) + this.H, gm.L(39.0f) + i4, gm.L(140.0f) + this.H, gm.L(47.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                    i4 = td4.h(this, i4);
                                    int i21 = i6 + 1;
                                    if (this.E && i21 >= this.L) {
                                        break;
                                    }
                                    i6 = i21;
                                }
                            } else if (getViewType() == 33) {
                                while (i4 <= getMeasuredHeight()) {
                                    canvas2.drawCircle(a(hg9.v(13.0f, this.H, L12)), (gm.L(58.0f) >> 1) + i4, gm.L(23.0f), paint7);
                                    rectF.set(gm.L(72.0f) + this.H, gm.L(17.0f) + i4, gm.L(260.0f) + this.H, gm.L(25.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                    rectF.set(gm.L(72.0f) + this.H, gm.L(39.0f) + i4, gm.L(140.0f) + this.H, gm.L(47.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                    i4 = td4.h(this, i4);
                                    int i22 = i6 + 1;
                                    if (this.E && i22 >= this.L) {
                                        break;
                                    }
                                    i6 = i22;
                                }
                            } else if (getViewType() == 30) {
                                while (i4 <= getMeasuredHeight()) {
                                    i4 += c(getMeasuredWidth());
                                    rectF.set(0.0f, i4, getMeasuredWidth(), i4);
                                    b(rectF);
                                    canvas2.drawRect(rectF, paint7);
                                    int i23 = i6 + 1;
                                    if (this.E && i23 >= this.L) {
                                        break;
                                    }
                                    i6 = i23;
                                }
                            } else if (getViewType() == 8) {
                                while (i4 <= getMeasuredHeight()) {
                                    canvas2.drawCircle(a(hg9.v(11.0f, this.H, L11)), (gm.L(64.0f) >> 1) + i4, gm.L(23.0f), paint7);
                                    rectF.set(gm.L(68.0f) + this.H, gm.L(17.0f) + i4, gm.L(140.0f) + this.H, gm.L(25.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                    rectF.set(gm.L(68.0f) + this.H, gm.L(39.0f) + i4, gm.L(260.0f) + this.H, gm.L(47.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                    if (this.x) {
                                        rectF.set(getMeasuredWidth() - gm.L(50.0f), gm.L(20.0f) + i4, getMeasuredWidth() - gm.L(12.0f), gm.L(28.0f) + i4);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                    }
                                    i4 = td4.h(this, i4);
                                    int i24 = i6 + 1;
                                    if (this.E && i24 >= this.L) {
                                        break;
                                    }
                                    i6 = i24;
                                }
                            } else if (getViewType() == 9) {
                                while (i4 <= getMeasuredHeight()) {
                                    canvas2.drawCircle(a(gm.L(35.0f)), (c(getMeasuredWidth()) >> 1) + i4, gm.L(32.0f) / 2, paint7);
                                    rectF.set(gm.L(72.0f), gm.L(16.0f) + i4, gm.L(268.0f), gm.L(24.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                    rectF.set(gm.L(72.0f), gm.L(38.0f) + i4, gm.L(140.0f), gm.L(46.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                    if (this.x) {
                                        rectF.set(getMeasuredWidth() - gm.L(50.0f), gm.L(16.0f) + i4, getMeasuredWidth() - gm.L(12.0f), gm.L(24.0f) + i4);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                    }
                                    i4 = td4.h(this, i4);
                                    int i25 = i6 + 1;
                                    if (this.E && i25 >= this.L) {
                                        break;
                                    }
                                    i6 = i25;
                                }
                            } else if (getViewType() == 11) {
                                int i26 = 0;
                                while (i4 <= getMeasuredHeight()) {
                                    rectF.set(gm.L(18.0f), gm.L(14.0f), (getMeasuredWidth() * 0.5f) + gm.L(this.N[0] * 40.0f), gm.L(8.0f) + gm.L(14.0f));
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                    rectF.set(getMeasuredWidth() - gm.L(18.0f), gm.L(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - gm.L(this.N[0] * 20.0f), gm.L(8.0f) + gm.L(14.0f));
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                    i4 = td4.h(this, i4);
                                    i26++;
                                    if (this.E && i26 >= this.L) {
                                        break;
                                    }
                                }
                            } else if (getViewType() == 12) {
                                int L24 = gm.L(14.0f) + i4;
                                while (L24 <= getMeasuredHeight()) {
                                    int measuredWidth4 = getMeasuredWidth() / 4;
                                    for (int i27 = 0; i27 < 4; i27++) {
                                        float f12 = (measuredWidth4 / 2.0f) + (measuredWidth4 * i27);
                                        canvas2.drawCircle(f12, (gm.L(56.0f) / 2.0f) + gm.L(7.0f) + L24, gm.L(28.0f), paint7);
                                        float L25 = gm.L(16.0f) + gm.L(56.0f) + gm.L(7.0f) + L24;
                                        RectF rectF2 = gm.P;
                                        rectF2.set(f12 - gm.L(24.0f), L25 - gm.L(4.0f), f12 + gm.L(24.0f), L25 + gm.L(4.0f));
                                        canvas2.drawRoundRect(rectF2, gm.L(4.0f), gm.L(4.0f), paint7);
                                    }
                                    L24 = td4.h(this, L24);
                                    if (this.E) {
                                        break;
                                    }
                                }
                            } else if (getViewType() == 13) {
                                float measuredHeight2 = getMeasuredHeight() / 2.0f;
                                RectF rectF3 = gm.P;
                                rectF3.set(gm.L(40.0f), measuredHeight2 - gm.L(4.0f), getMeasuredWidth() - gm.L(120.0f), gm.L(4.0f) + measuredHeight2);
                                canvas2.drawRoundRect(rectF3, gm.L(4.0f), gm.L(4.0f), paint7);
                                if (this.O == null) {
                                    Paint paint9 = new Paint(1);
                                    this.O = paint9;
                                    paint9.setColor(cmb.u0(cmb.F8));
                                }
                                for (int i28 = 0; i28 < 3; i28++) {
                                    canvas2.drawCircle(hg9.y(12.0f, i28, gm.L(13.0f) + (getMeasuredWidth() - gm.L(56.0f))), measuredHeight2, gm.L(13.0f), this.O);
                                    canvas2.drawCircle(hg9.y(12.0f, i28, gm.L(13.0f) + (getMeasuredWidth() - gm.L(56.0f))), measuredHeight2, gm.L(12.0f), paint7);
                                }
                            } else {
                                float f13 = 21.0f;
                                if (getViewType() != 14 && getViewType() != 17) {
                                    if (getViewType() == 15) {
                                        int L26 = gm.L(23.0f);
                                        int L27 = gm.L(4.0f);
                                        while (i4 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(a(hg9.v(12.0f, this.H, L26)), hg9.v(f9, i4, L26), L26, paint7);
                                            rectF.set(gm.L(74.0f) + this.H, gm.L(12.0f) + i4, gm.L(260.0f) + this.H, gm.L(20.0f) + i4);
                                            b(rectF);
                                            float f14 = L27;
                                            canvas2.drawRoundRect(rectF, f14, f14, paint7);
                                            rectF.set(gm.L(74.0f) + this.H, gm.L(36.0f) + i4, gm.L(140.0f) + this.H, gm.L(42.0f) + i4);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, f14, f14, paint7);
                                            if (this.U > 0.0f) {
                                                rectF.set(gm.L(73.0f) + this.H, gm.L(62.0f) + i4, gm.L(73.0f) + this.H + this.U, gm.L(94.0f) + i4);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, f14, f14, paint7);
                                            }
                                            i4 = td4.h(this, i4);
                                            int i29 = i6 + 1;
                                            if (this.E && i29 >= this.L) {
                                                break;
                                            }
                                            i6 = i29;
                                            f9 = 8.0f;
                                        }
                                    } else if (getViewType() != 16 && getViewType() != 23) {
                                        int i30 = this.F;
                                        if (i30 == 21) {
                                            while (i4 <= getMeasuredHeight()) {
                                                canvas2.drawCircle(a(gm.L(20.0f) + L10), (gm.L(58.0f) >> 1) + i4, gm.L(46.0f) >> 1, paint7);
                                                rectF.set(gm.L(74.0f), gm.L(16.0f) + i4, gm.L(140.0f), gm.L(24.0f) + i4);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                                rectF.set(gm.L(74.0f), gm.L(38.0f) + i4, gm.L(260.0f), gm.L(46.0f) + i4);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                                i4 = td4.h(this, i4);
                                                int i31 = i6 + 1;
                                                if (this.E && i31 >= this.L) {
                                                    break;
                                                }
                                                i6 = i31;
                                            }
                                        } else if (i30 == 22) {
                                            while (i4 <= getMeasuredHeight()) {
                                                canvas2.drawCircle(a(gm.L(20.0f) + L9), hg9.v(6.0f, i4, L9), gm.L(48.0f) >> 1, paint7);
                                                rectF.set(gm.L(76.0f), gm.L(16.0f) + i4, gm.L(140.0f), gm.L(24.0f) + i4);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                                rectF.set(gm.L(76.0f), gm.L(38.0f) + i4, gm.L(260.0f), gm.L(46.0f) + i4);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                                i4 = td4.h(this, i4);
                                                int i32 = i6 + 1;
                                                if (this.E && i32 >= this.L) {
                                                    break;
                                                }
                                                i6 = i32;
                                            }
                                        } else if (i30 == 25) {
                                            while (i4 <= getMeasuredHeight()) {
                                                canvas2.drawCircle(gm.L(17.0f) + L8, hg9.v(6.0f, i4, L8), gm.L(38.0f) >> 1, paint7);
                                                rectF.set(gm.L(76.0f), gm.L(21.0f) + i4, gm.L(220.0f), gm.L(29.0f) + i4);
                                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                                i4 = td4.h(this, i4);
                                                int i33 = i6 + 1;
                                                if (this.E && i33 >= this.L) {
                                                    break;
                                                }
                                                i6 = i33;
                                            }
                                        } else if (i30 == 26) {
                                            while (i4 <= getMeasuredHeight()) {
                                                int L28 = gm.L(21.0f) >> 1;
                                                if (jb6.a0) {
                                                    L7 = kt6.y(21.0f, getMeasuredWidth(), L28);
                                                } else {
                                                    L7 = gm.L(21.0f) + L28;
                                                }
                                                canvas2.drawCircle(L7, hg9.v(16.0f, i4, L28), L28, paint7);
                                                rectF.set(gm.L(60.0f), gm.L(21.0f) + i4, gm.L(190.0f), gm.L(29.0f) + i4);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                                rectF.set(getMeasuredWidth() - gm.L(16.0f), gm.L(21.0f) + i4, getMeasuredWidth() - gm.L(62.0f), gm.L(29.0f) + i4);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                                i4 = td4.h(this, i4);
                                                int i34 = i6 + 1;
                                                if (this.E && i34 >= this.L) {
                                                    break;
                                                }
                                                i6 = i34;
                                            }
                                        } else if (getViewType() == 28) {
                                            while (i4 <= getMeasuredHeight()) {
                                                canvas2.drawCircle(a(hg9.v(f10, this.H, L6)), (gm.L(58.0f) >> 1) + i4, gm.L(24.0f), paint7);
                                                rectF.set(gm.L(68.0f) + this.H, gm.L(17.0f) + i4, gm.L(260.0f) + this.H, gm.L(25.0f) + i4);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                                rectF.set(gm.L(68.0f) + this.H, gm.L(39.0f) + i4, gm.L(140.0f) + this.H, gm.L(47.0f) + i4);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                                if (this.x) {
                                                    rectF.set(getMeasuredWidth() - gm.L(50.0f), gm.L(20.0f) + i4, getMeasuredWidth() - gm.L(12.0f), gm.L(28.0f) + i4);
                                                    b(rectF);
                                                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                                }
                                                i4 = td4.h(this, i4);
                                                int i35 = i6 + 1;
                                                if (this.E && i35 >= this.L) {
                                                    break;
                                                }
                                                i6 = i35;
                                                f10 = 10.0f;
                                            }
                                        } else if (getViewType() == 31) {
                                            while (i4 <= getMeasuredHeight()) {
                                                int c2 = c(getMeasuredWidth());
                                                float f15 = i4;
                                                rectF.set(gm.L(18.0f) + this.H, ((c2 - gm.L(22.0f)) / 2.0f) + f15, gm.L(40.0f) + this.H, ((gm.L(22.0f) + c2) / 2.0f) + f15);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gm.L(11.0f), gm.L(11.0f), paint7);
                                                rectF.set(gm.L(58.0f) + this.H, ((c2 - gm.L(8.0f)) / 2.0f) + f15, b10.x(19.0f, getMeasuredWidth(), gm.L(132.0f) + this.H), ((gm.L(8.0f) + c2) / 2.0f) + f15);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                                i4 += c2;
                                                int i36 = i6 + 1;
                                                if (this.E && i36 >= this.L) {
                                                    break;
                                                }
                                                i6 = i36;
                                            }
                                        } else if (getViewType() == 32) {
                                            while (i4 <= getMeasuredHeight()) {
                                                int c3 = c(getMeasuredWidth());
                                                float f16 = i4;
                                                rectF.set(gm.L(10.0f) + this.H, ((c3 - gm.L(32.0f)) / 2.0f) + f16, gm.L(42.0f) + this.H, ((gm.L(32.0f) + c3) / 2.0f) + f16);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint7);
                                                rectF.set(gm.L(64.0f) + this.H, (((c3 - gm.L(14.0f)) - gm.L(10.0f)) / 2.0f) + f16, b10.x(19.0f, getMeasuredWidth(), gm.L(118.0f) + this.H), ((gm.L(10.0f) + (c3 - gm.L(14.0f))) / 2.0f) + f16);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                                rectF.set(gm.L(64.0f) + this.H, (((gm.L(14.0f) + c3) - gm.L(8.0f)) / 2.0f) + f16, b10.x(19.0f, getMeasuredWidth(), gm.L(144.0f) + this.H), ((gm.L(8.0f) + (gm.L(14.0f) + c3)) / 2.0f) + f16);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                                i4 += c3;
                                                int i37 = i6 + 1;
                                                if (this.E && i37 >= this.L) {
                                                    break;
                                                }
                                                i6 = i37;
                                            }
                                        } else if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
                                            rectF.set(this.H, this.G, getMeasuredWidth() - this.H, getMeasuredHeight() - this.G);
                                            rectF.inset(gm.L(3.33f), gm.L(4.0f));
                                            canvas2.drawRoundRect(rectF, gm.L(11.0f), gm.L(11.0f), paint7);
                                        }
                                    } else {
                                        int i38 = 0;
                                        while (i4 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(a(hg9.v(8.0f, this.H, L4)), gm.L(24.0f) + i4, gm.L(18.0f), paint7);
                                            rectF.set(gm.L(58.0f) + this.H, gm.L(20.0f) + i4, getWidth() - gm.L(53.0f), gm.L(28.0f) + i4);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), paint7);
                                            if (i38 < 4) {
                                                canvas2.drawCircle(a(kt6.y(12.0f, getWidth(), L5)), gm.L(24.0f) + i4, gm.L(12.0f), paint7);
                                            }
                                            i4 = td4.h(this, i4);
                                            i38++;
                                            if (this.E && i38 >= this.L) {
                                                break;
                                            }
                                        }
                                        rectF.set(gm.L(8.0f) + this.H, gm.L(20.0f) + i4, getWidth() - gm.L(8.0f), gm.L(28.0f) + i4);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), paint7);
                                        rectF.set(gm.L(8.0f) + this.H, gm.L(36.0f) + i4, getWidth() - gm.L(53.0f), gm.L(44.0f) + i4);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), paint7);
                                    }
                                } else {
                                    int L29 = gm.L(12.0f);
                                    int L30 = gm.L(77.0f);
                                    int L31 = gm.L(4.0f);
                                    float L32 = gm.L(21.0f);
                                    float L33 = gm.L(41.0f);
                                    while (L29 < getMeasuredWidth()) {
                                        Paint paint10 = this.O;
                                        if (paint10 == null) {
                                            paint10 = new Paint(i10);
                                            this.O = paint10;
                                        }
                                        paint10.setColor(cmb.v0(cmb.g5, this.M));
                                        RectF rectF4 = gm.P;
                                        int i39 = L29 + L30;
                                        int i40 = i10;
                                        float f17 = f13;
                                        rectF4.set(gm.L(4.0f) + L29, gm.L(4.0f), i39 - gm.L(4.0f), getMeasuredHeight() - gm.L(4.0f));
                                        canvas2.drawRoundRect(rectF4, gm.L(f11), gm.L(f11), paint7);
                                        if (getViewType() == 14) {
                                            float L34 = gm.L(8.0f) + L31;
                                            float f18 = L29;
                                            float L35 = gm.L(22.0f) + L31 + f18;
                                            rectF.set(L35, L34, L35 + L33, L34 + L32);
                                            canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.O);
                                            float L36 = gm.L(4.0f) + L32 + L34;
                                            float L37 = f18 + gm.L(5.0f) + L31;
                                            rectF.set(L37, L36, L37 + L33, L36 + L32);
                                            canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.O);
                                        } else if (getViewType() == 17) {
                                            float L38 = gm.L(5.0f);
                                            float L39 = gm.L(32.0f);
                                            f4 = f11;
                                            float z2 = aq1.z(L30, L39, f7, L29);
                                            rectF4.set(z2, gm.L(f17), L39 + z2, gm.L(32.0f) + L3);
                                            canvas2.drawRoundRect(rectF4, L38, L38, this.O);
                                            canvas2.drawCircle((L30 / 2) + L29, getMeasuredHeight() - gm.L(20.0f), gm.L(8.0f), this.O);
                                            L29 = i39;
                                            i10 = i40;
                                            f13 = f17;
                                            f11 = f4;
                                            f7 = 2.0f;
                                        }
                                        f4 = f11;
                                        canvas2.drawCircle((L30 / 2) + L29, getMeasuredHeight() - gm.L(20.0f), gm.L(8.0f), this.O);
                                        L29 = i39;
                                        i10 = i40;
                                        f13 = f17;
                                        f11 = f4;
                                        f7 = 2.0f;
                                    }
                                }
                            }
                        } else {
                            while (i4 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(hg9.v(9.0f, this.H, L2)), (gm.L(64.0f) >> 1) + i4, gm.L(23.0f), paint7);
                                rectF.set(gm.L(68.0f) + this.H, gm.L(17.0f) + i4, gm.L(260.0f) + this.H, gm.L(25.0f) + i4);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                rectF.set(gm.L(68.0f) + this.H, gm.L(39.0f) + i4, gm.L(140.0f) + this.H, gm.L(47.0f) + i4);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                if (this.x) {
                                    rectF.set(getMeasuredWidth() - gm.L(50.0f), gm.L(20.0f) + i4, getMeasuredWidth() - gm.L(12.0f), gm.L(28.0f) + i4);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                                }
                                i4 = td4.h(this, i4);
                                int i41 = i6 + 1;
                                if (this.E && i41 >= this.L) {
                                    break;
                                }
                                i6 = i41;
                            }
                        }
                    } else {
                        int i42 = 2;
                        int measuredWidth5 = (getMeasuredWidth() - ((getColumnsCount() - 1) * gm.L(2.0f))) / getColumnsCount();
                        if (getViewType() == 27) {
                            i = (int) (measuredWidth5 * 1.25f);
                        } else {
                            i = measuredWidth5;
                        }
                        int i43 = i4;
                        int i44 = 0;
                        while (true) {
                            if (i43 >= getMeasuredHeight() && !this.E) {
                                break;
                            }
                            int i45 = 0;
                            while (i45 < getColumnsCount()) {
                                if (i44 == 0 && i45 < this.w) {
                                    paint2 = paint7;
                                } else {
                                    paint2 = paint7;
                                    canvas.drawRect((gm.L(2.0f) + measuredWidth5) * i45, i43, L + measuredWidth5, i43 + i, paint2);
                                }
                                i45++;
                                paint7 = paint2;
                            }
                            Paint paint11 = paint7;
                            i43 = hg9.v(2.0f, i, i43);
                            i44++;
                            int i46 = i42;
                            if (this.E && i44 >= i46) {
                                break;
                            }
                            i42 = i46;
                            paint7 = paint11;
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
                        int i47 = this.H;
                        if (z) {
                            canvas2.drawCircle(gm.L(36.0f) + i47, gm.L(35.0f) + i4, gm.L(23.0f), paint7);
                        } else {
                            rectF.set(gm.L(15.0f) + i47, gm.L(6.0f) + i4, gm.L(61.0f) + this.H, gm.L(52.0f) + i4);
                            canvas2.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), paint7);
                        }
                        float L40 = gm.L(71.0f) + this.H;
                        int measuredWidth6 = getMeasuredWidth();
                        if (z) {
                            f = 76.0f;
                        } else {
                            f = 20.0f;
                        }
                        float max = Math.max(L40, measuredWidth6 - gm.L(f));
                        rectF.set(L40, gm.L(14.0f) + i4, Math.min(gm.L(100.0f) + L40, max), gm.L(22.0f) + i4);
                        canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                        if (z) {
                            f2 = 33.0f;
                        } else {
                            f2 = 36.0f;
                        }
                        float L41 = gm.L(f2) + i4;
                        float min = Math.min(gm.L(140.0f) + L40, max);
                        if (z) {
                            f3 = 41.0f;
                        } else {
                            f3 = 44.0f;
                        }
                        rectF.set(L40, L41, min, gm.L(f3) + i4);
                        canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                        if (z) {
                            rectF.set(L40, gm.L(51.0f) + i4, Math.min(gm.L(80.0f) + L40, max), gm.L(59.0f) + i4);
                            canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                            if (getMeasuredWidth() - gm.L(68.0f) >= L40) {
                                rectF.set(getMeasuredWidth() - gm.L(68.0f), gm.L(15.0f) + i4, getMeasuredWidth() - gm.L(20.0f), gm.L(23.0f) + i4);
                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint7);
                            }
                        }
                        i4 += c4;
                        int i48 = i6 + 1;
                        if (this.E && i48 >= this.L) {
                            break;
                        }
                        i6 = i48;
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

    public void setGlobalGradientView(tk4 tk4Var) {
        this.S = tk4Var;
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
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(14.0f));
        float L = gm.L(34.0f);
        if (z) {
            i = 2131754375;
        } else {
            i = 2131754370;
        }
        this.U = textPaint.measureText(jb6.M0(i, null)) + L;
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
        tk4 tk4Var = this.S;
        if (tk4Var != null) {
            tk4Var.updateColors();
            return;
        }
        int i2 = this.I;
        ylb ylbVar = this.M;
        int v0 = cmb.v0(i2, ylbVar);
        int v02 = cmb.v0(this.J, ylbVar);
        if (this.s == v02 && this.r == v0) {
            return;
        }
        this.r = v0;
        this.s = v02;
        int i3 = this.F;
        if (i3 != 34 && i3 != 35 && i3 != 36) {
            if (!this.E && i3 != 13 && i3 != 14 && i3 != 17) {
                this.a = gm.L(600.0f);
            } else {
                this.a = gm.L(200.0f);
            }
        } else {
            this.a = gm.q.x;
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

    public tk4(Context context) {
        this(context, null);
    }
}
