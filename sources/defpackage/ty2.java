package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public final class ty2 {
    public float A;
    public float B;
    public boolean C;
    public float D;
    public final boolean E;
    public boolean F;
    public View G;
    public final ylb I;
    public boolean a;
    public Paint d;
    public boolean g;
    public int h;
    public String i;
    public boolean j;
    public ValueAnimator k;
    public float m;
    public StaticLayout n;
    public StaticLayout o;
    public StaticLayout p;
    public StaticLayout q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int x;
    public int y;
    public float b = 1.0f;
    public int c = -1;
    public TextPaint e = new TextPaint(1);
    public final RectF f = new RectF();
    public float l = 1.0f;
    public int v = cmb.ig;
    public int w = cmb.jg;
    public int z = 17;
    public byte H = 0;

    public ty2(View view, boolean z, ylb ylbVar) {
        this.G = view;
        this.I = ylbVar;
        this.E = z;
        if (z) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.e.setTypeface(gm.o());
        this.e.setTextSize(gm.L(13.0f));
    }

    public final void a(Canvas canvas) {
        float A;
        float f;
        boolean z;
        int L;
        Paint paint;
        float interpolation;
        byte b = this.H;
        boolean z2 = true;
        if (b != 1 && b != 2) {
            int i = this.v;
            ylb ylbVar = this.I;
            int v0 = cmb.v0(i, ylbVar);
            int v02 = cmb.v0(this.w, ylbVar);
            if (this.u != v0) {
                this.u = v0;
                this.e.setColor(v0);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.t != v02) {
                this.t = v02;
                paint2.setColor(v02);
            }
        }
        float f2 = this.l;
        if (f2 != 1.0f) {
            int i2 = this.c;
            if (i2 != 0 && i2 != 1) {
                float f3 = f2 * 2.0f;
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
                float L2 = (this.x - gm.L(23.0f)) / 2.0f;
                int i3 = this.s;
                int i4 = this.r;
                if (i3 == i4) {
                    A = i3;
                } else {
                    A = td4.A(1.0f, f3, i4, i3 * f3);
                }
                e(A);
                if (this.j) {
                    float f4 = this.l;
                    if (f4 <= 0.5f) {
                        interpolation = d53.g.getInterpolation(f4 * 2.0f);
                    } else {
                        interpolation = d53.i.getInterpolation(1.0f - ((f4 - 0.5f) * 2.0f));
                    }
                    f = (interpolation * 0.1f) + 1.0f;
                } else {
                    f = 1.0f;
                }
                float f5 = this.B;
                RectF rectF = this.f;
                rectF.set(f5, L2, A + f5 + gm.L(11.0f), gm.L(23.0f) + L2);
                canvas.save();
                canvas.scale(f, f, rectF.centerX(), rectF.centerY());
                if (this.b != 1.0f) {
                    canvas.save();
                    float f6 = this.b;
                    canvas.scale(f6, f6, rectF.centerX(), rectF.centerY());
                    z = true;
                } else {
                    z = false;
                }
                if (this.E && (paint = this.d) != null) {
                    float f7 = gm.p * 11.5f;
                    canvas.drawRoundRect(rectF, f7, f7, paint);
                    if (this.g && cmb.b1()) {
                        float f8 = 11.5f * gm.p;
                        canvas.drawRoundRect(rectF, f8, f8, cmb.g2);
                    }
                }
                if (z) {
                    canvas.restore();
                }
                canvas.clipRect(rectF);
                if (this.C == this.j) {
                    z2 = false;
                }
                if (this.q != null) {
                    canvas.save();
                    float f9 = this.A;
                    float L3 = gm.L(4.0f) + L2;
                    int L4 = gm.L(13.0f);
                    if (!z2) {
                        L4 = -L4;
                    }
                    canvas.translate(f9, td4.A(1.0f, f3, L4, L3));
                    this.e.setAlpha((int) (f3 * 255.0f));
                    this.q.draw(canvas);
                    canvas.restore();
                } else if (this.n != null) {
                    canvas.save();
                    float f10 = this.A;
                    float L5 = gm.L(4.0f) + L2;
                    int L6 = gm.L(13.0f);
                    if (!z2) {
                        L6 = -L6;
                    }
                    canvas.translate(f10, td4.A(1.0f, f3, L6, L5));
                    this.e.setAlpha((int) (f3 * 255.0f));
                    this.n.draw(canvas);
                    canvas.restore();
                }
                if (this.o != null) {
                    canvas.save();
                    float f11 = this.A;
                    float L7 = gm.L(4.0f) + L2;
                    if (z2) {
                        L = -gm.L(13.0f);
                    } else {
                        L = gm.L(13.0f);
                    }
                    canvas.translate(f11, (L * f3) + L7);
                    this.e.setAlpha((int) ((1.0f - f3) * 255.0f));
                    this.o.draw(canvas);
                    canvas.restore();
                }
                if (this.p != null) {
                    canvas.save();
                    canvas.translate(this.A, L2 + gm.L(4.0f));
                    this.e.setAlpha(255);
                    this.p.draw(canvas);
                    canvas.restore();
                }
                this.e.setAlpha(255);
                canvas.restore();
                return;
            }
            e(this.s);
            float f12 = (this.s / 2.0f) + this.A;
            float f13 = this.x / 2.0f;
            canvas.save();
            int i5 = this.c;
            float f14 = this.l;
            if (i5 != 0) {
                f14 = 1.0f - f14;
            }
            canvas.scale(f14, f14, f12, f13);
            b(canvas);
            canvas.restore();
            return;
        }
        b(canvas);
    }

    public final void b(Canvas canvas) {
        boolean z;
        float L = (this.x - gm.L(23.0f)) / 2.0f;
        e(this.s);
        float f = this.B;
        RectF rectF = this.f;
        rectF.set(f, L, this.s + f + gm.L(11.0f), gm.L(23.0f) + L);
        if (this.d != null && this.E) {
            if (this.b != 1.0f) {
                canvas.save();
                float f2 = this.b;
                canvas.scale(f2, f2, rectF.centerX(), rectF.centerY());
                z = true;
            } else {
                z = false;
            }
            float f3 = gm.p * 11.5f;
            canvas.drawRoundRect(rectF, f3, f3, this.d);
            if (this.g && cmb.b1()) {
                float f4 = 11.5f * gm.p;
                canvas.drawRoundRect(rectF, f4, f4, cmb.g2);
            }
            if (z) {
                canvas.restore();
            }
        }
        if (this.n != null) {
            canvas.save();
            canvas.translate(this.A, L + gm.L(4.0f));
            this.n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i, boolean z) {
        String valueOf;
        boolean z2;
        boolean z3;
        View view;
        View view2;
        if (this.a) {
            valueOf = gm.o0(i, 0);
        } else {
            valueOf = String.valueOf(i);
        }
        String str = valueOf;
        if (!TextUtils.equals(str, this.i)) {
            ValueAnimator valueAnimator = this.k;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i > 0 && this.F && (view2 = this.G) != null) {
                view2.setVisibility(0);
            }
            if (Math.abs(i - this.h) > 99) {
                z2 = false;
            } else {
                z2 = z;
            }
            float f = 0.0f;
            if (!z2) {
                this.h = i;
                this.i = str;
                if (i == 0) {
                    if (this.F && (view = this.G) != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.s = Math.max(gm.L(12.0f), (int) Math.ceil(this.e.measureText(str.toString())));
                StaticLayout staticLayout = new StaticLayout(str, this.e, this.s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.n = staticLayout;
                if (staticLayout.getLineCount() >= 1) {
                    f = this.n.getLineWidth(0);
                }
                this.m = f;
                View view3 = this.G;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z2) {
                ValueAnimator valueAnimator2 = this.k;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.l = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.k = ofFloat;
                ofFloat.addUpdateListener(new et1(this, (byte) 16));
                this.k.addListener(new kh2(this, (byte) 3));
                if (this.h <= 0) {
                    this.c = 0;
                    this.k.setDuration(220L);
                    this.k.setInterpolator(new OvershootInterpolator());
                } else if (i == 0) {
                    this.c = 1;
                    this.k.setDuration(150L);
                    this.k.setInterpolator(d53.f);
                } else {
                    this.c = 2;
                    this.k.setDuration(430L);
                    this.k.setInterpolator(d53.f);
                }
                if (this.n != null) {
                    String str2 = this.i;
                    if (str2.length() == str.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        for (int i2 = 0; i2 < str2.length(); i2++) {
                            if (str2.charAt(i2) == str.charAt(i2)) {
                                int i3 = i2 + 1;
                                spannableStringBuilder.setSpan(new vy2((byte) 1), i2, i3, 0);
                                spannableStringBuilder2.setSpan(new vy2((byte) 1), i2, i3, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new vy2((byte) 1), i2, i2 + 1, 0);
                            }
                        }
                        int max = Math.max(gm.L(12.0f), (int) Math.ceil(this.e.measureText(str2.toString())));
                        TextPaint textPaint = this.e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                        this.p = new StaticLayout(spannableStringBuilder3, this.e, max, alignment, 1.0f, 0.0f, false);
                        this.q = new StaticLayout(spannableStringBuilder2, this.e, max, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.o = this.n;
                    }
                }
                this.r = this.s;
                if (i > this.h) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.j = z3;
                this.k.start();
            }
            if (i > 0) {
                this.s = Math.max(gm.L(12.0f), (int) Math.ceil(this.e.measureText(str.toString())));
                StaticLayout staticLayout2 = new StaticLayout(str, this.e, this.s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.n = staticLayout2;
                if (staticLayout2.getLineCount() >= 1) {
                    f = this.n.getLineWidth(0);
                }
                this.m = f;
            }
            this.h = i;
            this.i = str;
            View view4 = this.G;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void d(int i, int i2) {
        boolean z;
        if (i != this.x) {
            int i3 = this.h;
            this.h = -1;
            if (this.c == 0) {
                z = true;
            } else {
                z = false;
            }
            c(i3, z);
            this.x = i;
        }
        this.y = i2;
    }

    public final void e(float f) {
        float f2;
        float f3;
        if (this.E) {
            f2 = gm.L(5.5f);
        } else {
            f2 = 0.0f;
        }
        int i = this.z;
        if (i == 5) {
            float f4 = this.y - f2;
            this.A = f4;
            float f5 = this.D;
            if (f5 != 0.0f) {
                f3 = f4 - Math.max((f / 2.0f) + f5, f);
                this.A = f3;
            } else {
                f3 = f4 - f;
                this.A = f3;
            }
        } else if (i == 3) {
            this.A = f2;
            f3 = f2;
        } else {
            f3 = (int) ((this.y - f) / 2.0f);
            this.A = f3;
        }
        this.B = f3 - f2;
    }
}
