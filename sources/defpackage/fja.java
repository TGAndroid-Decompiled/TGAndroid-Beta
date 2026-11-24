package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class fja extends View {
    public float E;
    public int F;
    public String[] G;
    public int[] H;
    public Drawable[] I;
    public int J;
    public int K;
    public float L;
    public final lm M;
    public final lm N;
    public eja O;
    public final wjb P;
    public final i66 a;
    public final Paint b;
    public final Paint c;
    public final TextPaint d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean w;
    public boolean x;
    public float y;

    public fja(Context context, wjb wjbVar) {
        super(context);
        this.s = -1;
        this.K = Integer.MIN_VALUE;
        s33 s33Var = s33.f;
        this.M = new lm(120L, this, s33Var);
        this.N = new lm(150L, this, s33Var);
        this.P = wjbVar;
        this.b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(gl.L(13.0f));
        this.a = new i66(this, (byte) 2);
    }

    public void setOption(int i) {
        if (this.J != i) {
            gl.X3(this);
        }
        this.J = i;
        eja ejaVar = this.O;
        if (ejaVar != null) {
            ejaVar.k(i);
        }
        invalidate();
    }

    public final void b(int i, Drawable[] drawableArr, String... strArr) {
        String[] strArr2;
        this.G = strArr;
        this.I = drawableArr;
        this.J = i;
        this.H = new int[strArr.length];
        int i2 = 0;
        while (true) {
            if (i2 >= this.G.length) {
                break;
            }
            this.H[i2] = (int) Math.ceil(this.d.measureText(strArr2[i2]));
            i2++;
        }
        Drawable[] drawableArr2 = this.I;
        if (drawableArr2 != null) {
            for (Drawable drawable : drawableArr2) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
        }
        requestLayout();
    }

    public int getSelectedIndex() {
        return this.J;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        float f5;
        int L;
        int L2;
        int i2;
        Canvas canvas2 = canvas;
        char c = 0;
        float e = this.M.e(false, this.J);
        float f6 = 0.0f;
        float f7 = 1.0f;
        if (this.w) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e2 = this.N.e(false, f);
        int i3 = 2;
        int L3 = gl.L(11.0f) + (getMeasuredHeight() / 2);
        int i4 = 0;
        while (true) {
            int length = this.G.length;
            int i5 = this.n;
            int i6 = this.r;
            wjb wjbVar = this.P;
            Paint paint = this.b;
            if (i4 < length) {
                int i7 = i6 + (this.h << 1);
                int i8 = this.f;
                int i9 = (i8 / i3) + ((i7 + i8) * i4) + i5;
                float f8 = i4;
                float f9 = f8 - e;
                char c2 = c;
                float max = Math.max(f6, f7 - Math.abs(f9));
                float a = moe.a((e - f8) + f7, f6, f7);
                int v0 = bkb.v0(bkb.L6, wjbVar);
                float f10 = f7;
                int v02 = bkb.v0(bkb.M6, wjbVar);
                int i10 = this.K;
                int i11 = i3;
                if (i10 != Integer.MIN_VALUE && i4 <= i10) {
                    f2 = 0.5f;
                } else {
                    f2 = f10;
                }
                int f11 = bm2.f(a, v0, bkb.p1(f2, v02));
                paint.setColor(f11);
                Paint paint2 = this.c;
                paint2.setColor(f11);
                float f12 = L3;
                canvas2.drawCircle(i9, f12, gl.U1(max, this.f / 2, gl.L(6.0f)), paint);
                if (i4 != 0) {
                    int i12 = (i9 - (this.f / 2)) - this.h;
                    int i13 = this.r;
                    int i14 = i12 - i13;
                    f3 = 3.0f;
                    int i15 = this.s;
                    if (i15 != -1 && i4 - 1 >= i15) {
                        int L4 = gl.L(3.0f) + i14;
                        int L5 = (i13 - gl.L(3.0f)) / gl.L(13.0f);
                        if (this.e != L5) {
                            i2 = L4;
                            i = i9;
                            float[] fArr = new float[i11];
                            fArr[c2] = gl.L(6.0f);
                            fArr[1] = (L2 - (gl.L(8.0f) * L5)) / (L5 - 1);
                            paint2.setPathEffect(new DashPathEffect(fArr, 0.0f));
                            this.e = L5;
                        } else {
                            i2 = L4;
                            i = i9;
                        }
                        canvas2 = canvas;
                        canvas2.drawLine(gl.L(f10) + i2, f12, (i2 + L2) - gl.L(f10), f12, paint2);
                    } else {
                        i = i9;
                        float f13 = f9 - f10;
                        float a2 = moe.a(f10 - Math.abs(f13), 0.0f, f10);
                        int L6 = (int) (i13 - (gl.L(3.0f) * moe.a(f10 - Math.min(Math.abs(f9), Math.abs(f13)), 0.0f, f10)));
                        f10 = 1.0f;
                        canvas2 = canvas;
                        canvas2.drawRect((int) ((gl.L(3.0f) * a2) + i14), L3 - gl.L(1.0f), L6 + L, gl.L(1.0f) + L3, paint);
                    }
                } else {
                    i = i9;
                    f3 = 3.0f;
                }
                int i16 = this.H[i4];
                String str = this.G[i4];
                int f14 = bm2.f(max, bkb.v0(bkb.x6, wjbVar), bkb.v0(bkb.m6, wjbVar));
                TextPaint textPaint = this.d;
                textPaint.setColor(f14);
                if (this.I != null) {
                    canvas2.save();
                    if (i4 == 0) {
                        canvas2.translate(gl.L(12.0f), gl.L(15.5f));
                    } else if (i4 == this.G.length - 1) {
                        canvas2.translate(((getMeasuredWidth() - i16) - gl.L(22.0f)) - gl.L(10.0f), gl.L(28.0f) - gl.L(12.5f));
                    } else {
                        canvas2.translate((i - (i16 / 2)) - gl.L(10.0f), gl.L(28.0f) - gl.L(12.5f));
                    }
                    this.I[i4].setColorFilter(textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                    this.I[i4].draw(canvas2);
                    canvas2.restore();
                    canvas2.save();
                    float intrinsicWidth = this.I[i4].getIntrinsicWidth() / 2.0f;
                    if (i4 == 0) {
                        f5 = f3;
                    } else {
                        f5 = 2.0f;
                    }
                    f4 = 0.0f;
                    canvas2.translate(intrinsicWidth - gl.L(f5), 0.0f);
                } else {
                    f4 = 0.0f;
                }
                if (i4 == 0) {
                    canvas2.drawText(str, gl.L(22.0f), gl.L(28.0f), textPaint);
                } else if (i4 == this.G.length - 1) {
                    canvas2.drawText(str, (getMeasuredWidth() - i16) - gl.L(22.0f), gl.L(28.0f), textPaint);
                } else {
                    canvas2.drawText(str, i - (i16 / 2), gl.L(28.0f), textPaint);
                }
                if (this.I != null) {
                    canvas2.restore();
                }
                i4++;
                f6 = f4;
                c = c2;
                f7 = f10;
                i3 = 2;
            } else {
                int i17 = this.f;
                float f15 = ((i6 + (this.h << 1) + i17) * e) + i5 + (i17 / 2);
                int i18 = bkb.M6;
                paint.setColor(bm2.o(bkb.v0(i18, wjbVar), 80));
                float f16 = L3;
                canvas2.drawCircle(f15, f16, gl.L(e2 * 12.0f), paint);
                paint.setColor(bkb.v0(i18, wjbVar));
                canvas2.drawCircle(f15, f16, gl.L(6.0f), paint);
                return;
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(74.0f), 1073741824));
        this.f = gl.L(6.0f);
        this.h = gl.L(2.0f);
        this.n = gl.L(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i3 = this.f;
        String[] strArr = this.G;
        this.r = (((measuredWidth - (i3 * strArr.length)) - ((strArr.length - 1) * (this.h << 1))) - (this.n << 1)) / Math.max(1, strArr.length - 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float a = moe.a(((this.f / 2.0f) + (x - this.n)) / ((this.r + (this.h << 1)) + i), 0.0f, this.G.length - 1);
        if (Math.abs(a - Math.round(a)) < 0.35f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            a = Math.round(a);
        }
        int i2 = this.K;
        if (i2 != Integer.MIN_VALUE) {
            a = Math.max(a, i2);
        }
        if (motionEvent.getAction() == 0) {
            this.y = x;
            this.E = y;
            this.L = a;
            this.F = this.J;
            this.x = true;
            invalidate();
            return true;
        } else if (motionEvent.getAction() == 2) {
            if (!this.w && Math.abs(this.y - x) > Math.abs(this.E - y)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.x && Math.abs(this.y - x) >= gl.e) {
                this.w = true;
                this.x = false;
            }
            if (this.w) {
                this.L = a;
                invalidate();
                if (Math.round(this.L) != this.J && z) {
                    setOption(Math.round(this.L));
                }
            }
            invalidate();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        } else {
            if (!this.w) {
                this.L = a;
                if (motionEvent.getAction() == 1 && Math.round(this.L) != this.J) {
                    setOption(Math.round(this.L));
                }
            } else {
                int i3 = this.J;
                if (i3 != this.F) {
                    setOption(i3);
                }
            }
            eja ejaVar = this.O;
            if (ejaVar != null) {
                ejaVar.n();
            }
            this.x = false;
            this.w = false;
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(false);
            return true;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!super.performAccessibilityAction(i, bundle) && !this.a.g(this, i, bundle)) {
            return false;
        }
        return true;
    }

    public void setCallback(eja ejaVar) {
        this.O = ejaVar;
    }

    public void setDashedFrom(int i) {
        this.s = i;
    }

    public void setMinAllowedIndex(int i) {
        String[] strArr;
        if (i != -1 && (strArr = this.G) != null) {
            i = Math.min(i, strArr.length - 1);
        }
        if (this.K != i) {
            this.K = i;
            if (this.J < i) {
                this.J = i;
            }
            invalidate();
        }
    }
}
