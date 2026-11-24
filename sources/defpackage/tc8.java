package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
public final class tc8 extends View {
    public float E;
    public ValueAnimator F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public final Paint J;
    public int K;
    public int L;
    public final ylb M;
    public boolean N;
    public int a;
    public int b;
    public int c;
    public float d;
    public int e;
    public int f;
    public boolean h;
    public boolean n;
    public float r;
    public float s;
    public int w;
    public int x;
    public final RectF y;

    public tc8(Activity activity, ylb ylbVar) {
        super(activity);
        this.a = -1;
        this.b = 0;
        this.y = new RectF();
        Paint paint = new Paint(1);
        this.I = paint;
        Paint paint2 = new Paint(1);
        this.J = paint2;
        this.K = -1;
        this.M = ylbVar;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint();
        this.G = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(6.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        this.H = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(6.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        d();
    }

    public final void a() {
        int i;
        boolean z;
        if (this.n) {
            i = Math.max(this.e, this.f);
        } else {
            i = this.b;
        }
        int i2 = 0;
        if (i > 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 2;
        }
        if (getLayerType() != i2) {
            setLayerType(i2, null);
            invalidate();
        }
        this.N = z;
    }

    public final void b(int i) {
        if (this.n) {
            this.K = i;
            return;
        }
        if (this.h) {
            if (this.c != i) {
                ValueAnimator valueAnimator = this.F;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f = this.d;
                float f2 = this.E;
                this.d = (this.c * f2) + ((1.0f - f2) * f);
            } else {
                return;
            }
        } else {
            this.d = this.a;
        }
        if (i != this.a) {
            this.c = i;
            this.h = true;
            this.E = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new rc8(this, (byte) 1));
            this.F.addListener(new sc8(this, (byte) 0));
            this.F.setInterpolator(d53.f);
            this.F.setDuration(220L);
            this.F.start();
        }
    }

    public final void c(int i, int i2, boolean z) {
        int L;
        int i3;
        int i4;
        int i5 = this.a;
        if (i5 < 0 || i2 == 0 || this.b == 0) {
            z = false;
        }
        if (!z) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.a = i;
            this.b = i2;
            invalidate();
        } else if (this.b == i2 && (Math.abs(i5 - i) <= 2 || this.h || this.n)) {
            b(i);
        } else {
            ValueAnimator valueAnimator2 = this.F;
            if (valueAnimator2 != null) {
                this.K = 0;
                valueAnimator2.cancel();
            }
            int L2 = gm.L(8.0f) << 1;
            this.w = (getMeasuredHeight() - L2) / Math.min(this.b, 3);
            this.x = (getMeasuredHeight() - L2) / Math.min(i2, 3);
            float f = (this.a - 1) * this.w;
            this.r = f;
            if (f < 0.0f) {
                this.r = 0.0f;
            } else {
                int i6 = this.w;
                if (aq1.h(this.b, 1, i3, L) - f < (getMeasuredHeight() - L) - i6) {
                    this.r = aq1.h(this.b, 1, i6, L) - ((getMeasuredHeight() - L) - this.w);
                }
            }
            float f2 = (i - 1) * this.x;
            this.s = f2;
            if (f2 < 0.0f) {
                this.s = 0.0f;
            } else {
                int i7 = i2 - 1;
                int i8 = this.x;
                if (((i4 * i7) + L) - f2 < (getMeasuredHeight() - L) - i8) {
                    this.s = ((i7 * i8) + L) - ((getMeasuredHeight() - L) - this.x);
                }
            }
            this.d = this.a;
            this.c = i;
            this.a = i;
            this.e = this.b;
            this.f = i2;
            this.b = i2;
            this.n = true;
            this.h = true;
            this.E = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new rc8(this, (byte) 0));
            this.F.addListener(new sc8(this, (byte) 1));
            this.F.setInterpolator(d53.f);
            this.F.setDuration(220L);
            this.F.start();
        }
        a();
    }

    public final void d() {
        int v0 = cmb.v0(cmb.Ue, this.M);
        this.L = v0;
        this.I.setColor(on2.p(v0, (int) ((Color.alpha(v0) / 255.0f) * 112.0f)));
        this.J.setColor(this.L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredHeight;
        float f;
        int i;
        RectF rectF;
        float f2;
        int i2;
        int i3;
        int i4;
        int i5;
        super.onDraw(canvas);
        if (this.a >= 0 && this.b != 0) {
            int L = gm.L(8.0f);
            float f3 = 1.0f;
            if (this.n) {
                float f4 = this.E;
                measuredHeight = (this.x * f4) + ((1.0f - f4) * this.w);
            } else if (this.b != 0) {
                measuredHeight = (getMeasuredHeight() - (L << 1)) / Math.min(this.b, 3);
            } else {
                return;
            }
            if (measuredHeight != 0.0f) {
                float N = gm.N(0.7f);
                if (this.n) {
                    float f5 = this.r;
                    float f6 = this.E;
                    f = (this.s * f6) + ((1.0f - f6) * f5);
                } else {
                    if (this.h) {
                        float f7 = this.E;
                        f = ((this.c - 1) * measuredHeight * f7) + ((1.0f - f7) * (this.d - 1.0f) * measuredHeight);
                    } else {
                        f = (this.a - 1) * measuredHeight;
                    }
                    if (f < 0.0f) {
                        f = 0.0f;
                    } else {
                        float f8 = L;
                        if ((((this.b - 1) * measuredHeight) + f8) - f < (getMeasuredHeight() - L) - measuredHeight) {
                            f = (((this.b - 1) * measuredHeight) + f8) - ((getMeasuredHeight() - L) - measuredHeight);
                        }
                    }
                }
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float f9 = L;
                int max = Math.max(0, (int) (((f9 + f) / measuredHeight) - 1.0f));
                int i6 = max + 6;
                if (this.n) {
                    i = Math.max(this.e, this.f);
                } else {
                    i = this.b;
                }
                int min = Math.min(i6, i);
                while (true) {
                    rectF = this.y;
                    if (max >= min) {
                        break;
                    }
                    float f10 = ((max * measuredHeight) + f9) - f;
                    float f11 = f10 + measuredHeight;
                    if (f11 >= 0.0f && f10 <= getMeasuredHeight()) {
                        rectF.set(0.0f, f10 + N, getMeasuredWidth(), f11 - N);
                        boolean z = this.n;
                        Paint paint = this.I;
                        if (z) {
                            if (max >= this.f) {
                                f2 = f3;
                                paint.setColor(on2.p(this.L, (int) ((f2 - this.E) * (Color.alpha(i4) / 255.0f) * 76.0f)));
                                canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                                paint.setColor(on2.p(this.L, (int) ((Color.alpha(i5) / 255.0f) * 76.0f)));
                            } else {
                                f2 = f3;
                                if (max >= this.e) {
                                    paint.setColor(on2.p(this.L, (int) ((Color.alpha(i2) / 255.0f) * 76.0f * this.E)));
                                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                                    paint.setColor(on2.p(this.L, (int) ((Color.alpha(i3) / 255.0f) * 76.0f)));
                                }
                            }
                        } else {
                            f2 = f3;
                        }
                        canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                    } else {
                        f2 = f3;
                    }
                    max++;
                    f3 = f2;
                }
                float f12 = f3;
                boolean z2 = this.h;
                Paint paint2 = this.J;
                if (z2) {
                    float f13 = this.d;
                    float f14 = this.E;
                    float f15 = ((((this.c * f14) + ((f12 - f14) * f13)) * measuredHeight) + f9) - f;
                    rectF.set(0.0f, f15 + N, getMeasuredWidth(), (f15 + measuredHeight) - N);
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
                } else {
                    float f16 = ((this.a * measuredHeight) + f9) - f;
                    rectF.set(0.0f, f16 + N, getMeasuredWidth(), (f16 + measuredHeight) - N);
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
                }
                if (this.N) {
                    Paint paint3 = this.G;
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), gm.L(6.0f), paint3);
                    canvas.drawRect(0.0f, getMeasuredHeight() - gm.L(6.0f), getMeasuredWidth(), getMeasuredHeight(), paint3);
                    canvas.translate(0.0f, getMeasuredHeight() - gm.L(6.0f));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), gm.L(6.0f), this.H);
                }
            }
        }
    }
}
