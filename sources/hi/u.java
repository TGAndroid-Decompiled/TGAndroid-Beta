package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.wy0;
public final class u extends View {
    public Layout.Alignment E;
    public int F;
    public float G;
    public float H;
    public float I;
    public int J;
    public float K;
    public float L;
    public float M;
    public final StaticLayout[] N;
    public final String[] O;
    public final float[] P;
    public long Q;
    public t R;
    public String S;
    public String T;
    public w10 U;
    public w10 V;
    public final t[] f15470a;
    public final Paint f15471b;
    public final TextPaint f15472c;
    public t d;
    public float f15473e;
    public float f15474f;
    public float h;
    public float f15475n;
    public float f15476r;
    public float f15477s;
    public float f15478w;
    public float f15479x;
    public float f15480y;

    public u(Context context) {
        super(context);
        this.f15470a = new t[]{new t(this, -1), new t(this, 1)};
        this.f15471b = new Paint(1);
        this.f15472c = new TextPaint(1);
        this.f15477s = 1.0f;
        this.E = Layout.Alignment.ALIGN_CENTER;
        this.F = -1;
        this.N = new StaticLayout[2];
        this.O = new String[2];
        this.P = new float[4];
    }

    public static float c(float f10, float f11, float f12) {
        return Utilities.i((f10 - f11) / (f12 - f11), 1.0f, 0.0f);
    }

    public final void a(android.graphics.Canvas r14, int r15, java.lang.String r16, hi.t r17, float r18, float r19, float r20, float r21, float r22) {
        throw new UnsupportedOperationException("Method not decompiled: hi.u.a(android.graphics.Canvas, int, java.lang.String, hi.t, float, float, float, float, float):void");
    }

    public final void b() {
        t[] tVarArr;
        float k10;
        if (this.R == null) {
            return;
        }
        this.R = null;
        for (t tVar : this.f15470a) {
            tVar.f15424i = null;
            org.telegram.ui.Components.c6 c6Var = tVar.f15421e;
            wy0 wy0Var = tVar.h;
            if (wy0Var == null) {
                k10 = 0.0f;
            } else {
                k10 = wy0Var.k() + org.telegram.messenger.g0.L(31.0f) + org.telegram.messenger.g0.L(31.0f);
            }
            c6Var.e(true, k10);
        }
        w10 w10Var = this.V;
        if (w10Var != null) {
            w10Var.a(Float.valueOf(1.0f));
        }
        invalidate();
    }

    public final void d(float f10, float f11, float f12, float f13, float f14, float f15, TextPaint textPaint, int i7, float f16, float f17, float f18, Layout.Alignment alignment) {
        boolean z10;
        if (this.f15473e == f10 && this.f15474f == f11 && this.h == f12 && this.f15475n == f13) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f15473e = f10;
        this.f15474f = f11;
        this.h = f12;
        this.f15475n = f13;
        this.f15476r = f14;
        this.f15477s = f15;
        this.f15478w = f16;
        this.f15479x = f17;
        this.f15480y = f18;
        if (alignment != null && alignment != this.E) {
            this.E = alignment;
            StaticLayout[] staticLayoutArr = this.N;
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.F = i7;
        TextPaint textPaint2 = this.f15472c;
        textPaint2.set(textPaint);
        textPaint2.setTextAlign(Paint.Align.LEFT);
        if (Build.VERSION.SDK_INT >= 29) {
            this.G = textPaint.getShadowLayerRadius();
            this.H = textPaint.getShadowLayerDx();
            this.I = textPaint.getShadowLayerDy();
            this.J = textPaint.getShadowLayerColor();
        } else {
            this.G = 0.0f;
        }
        if (!z10 && this.R == null) {
            return;
        }
        invalidate();
    }

    public final void e(CharSequence charSequence, CharSequence charSequence2) {
        String charSequence3;
        if (this.R != null) {
            return;
        }
        t[] tVarArr = this.f15470a;
        t tVar = tVarArr[0];
        String str = null;
        if (charSequence == null) {
            charSequence3 = null;
        } else {
            charSequence3 = charSequence.toString();
        }
        tVar.b(charSequence3);
        t tVar2 = tVarArr[1];
        if (charSequence2 != null) {
            str = charSequence2.toString();
        }
        tVar2.b(str);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        float f10;
        char c10;
        boolean z12;
        float k10;
        float f11;
        boolean z13;
        float e10;
        float f12;
        float f13;
        boolean z14;
        t[] tVarArr;
        t tVar;
        float f14;
        float L;
        float f15;
        float c11;
        Canvas canvas2 = canvas;
        boolean z15 = true;
        if (this.R != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f16 = 1.0f;
        if (z10) {
            float elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - this.Q)) / 320.0f;
            if (elapsedRealtime >= 1.0f) {
                b();
                f10 = 1.0f;
                z11 = false;
            } else {
                float interpolation = kr.h.getInterpolation(elapsedRealtime);
                w10 w10Var = this.V;
                if (w10Var != null) {
                    w10Var.a(Float.valueOf(interpolation));
                }
                invalidate();
                z11 = z10;
                f10 = interpolation;
            }
        } else {
            z11 = z10;
            f10 = 1.0f;
        }
        t[] tVarArr2 = this.f15470a;
        int length = tVarArr2.length;
        int i7 = 0;
        while (i7 < length) {
            t tVar2 = tVarArr2[i7];
            org.telegram.ui.Components.c6 c6Var = tVar2.d;
            org.telegram.ui.Components.c6 c6Var2 = tVar2.f15421e;
            Drawable drawable = tVar2.f15419b;
            RectF rectF = tVar2.f15422f;
            float f17 = f16;
            if (tVar2.h != null) {
                z12 = z15;
            } else {
                z12 = false;
            }
            float d = c6Var.d(z12);
            wy0 wy0Var = tVar2.h;
            if (wy0Var == null) {
                k10 = 0.0f;
            } else {
                k10 = wy0Var.k() + org.telegram.messenger.g0.L(31.0f) + org.telegram.messenger.g0.L(31.0f);
            }
            if (z11) {
                if (tVar2.f15426k) {
                    f15 = tVar2.f15425j;
                } else {
                    f15 = k10;
                }
                if (tVar2.h == null) {
                    k10 = tVar2.f15425j;
                }
                e10 = org.telegram.messenger.g0.T1(f15, k10, f10);
                c6Var2.e(z15, e10);
                if (tVar2 == this.R) {
                    f11 = 0.0f;
                    c11 = f17 - c(f10, 0.0f, 0.25f);
                    f13 = c(f10, 0.5f, f17);
                } else {
                    f11 = 0.0f;
                    c11 = f17 - c(f10, 0.0f, 0.4f);
                    f13 = c(f10, 0.75f, f17);
                }
                f12 = c11;
            } else {
                f11 = 0.0f;
                if (d <= 0.0f) {
                    z13 = z15;
                } else {
                    z13 = false;
                }
                e10 = c6Var2.e(z13, k10);
                f12 = 0.0f;
                f13 = 1.0f;
            }
            if (d <= f11 || e10 <= f11) {
                z14 = z11;
                tVarArr = tVarArr2;
                rectF.setEmpty();
            } else {
                float a10 = tVar2.a();
                float f18 = e10 / 2.0f;
                float f19 = f12;
                float i10 = Utilities.i(this.f15473e, (getWidth() - org.telegram.messenger.g0.L(8.0f)) - f18, org.telegram.messenger.g0.L(8.0f) + f18);
                float L2 = org.telegram.messenger.g0.L(30.0f) / 2.0f;
                z14 = z11;
                float f20 = i10 + f18;
                tVarArr = tVarArr2;
                rectF.set(i10 - f18, a10 - L2, f20, a10 + L2);
                float T1 = org.telegram.messenger.g0.T1(0.8f, 1.0f, d) * tVar2.f15420c.a(0.04f);
                canvas2.save();
                canvas2.scale(T1, T1, i10, a10);
                int r12 = org.telegram.ui.ActionBar.n6.r1(d, -1946157056);
                Paint paint = this.f15471b;
                paint.setColor(r12);
                canvas2.drawRoundRect(rectF, L2, L2, paint);
                int L3 = org.telegram.messenger.g0.L(14.0f);
                drawable.setAlpha((int) (217.0f * d));
                int i11 = 0;
                while (i11 < 2) {
                    if (i11 == 0) {
                        L = rectF.left + org.telegram.messenger.g0.L(10.0f);
                    } else {
                        L = (rectF.right - org.telegram.messenger.g0.L(10.0f)) - L3;
                    }
                    int i12 = (int) L;
                    int i13 = (int) (a10 - (L3 / 2.0f));
                    int i14 = L3;
                    drawable.setBounds(i12, i13, i12 + L3, i13 + i14);
                    drawable.draw(canvas2);
                    i11++;
                    L3 = i14;
                }
                canvas2.save();
                canvas2.clipRect(rectF.left + org.telegram.messenger.g0.L(24.0f), rectF.top, rectF.right - org.telegram.messenger.g0.L(24.0f), rectF.bottom);
                wy0 wy0Var2 = tVar2.f15424i;
                if (wy0Var2 != null) {
                    if (f19 > 0.0f) {
                        tVar = tVar2;
                        f14 = 0.0f;
                        wy0Var2.c(i10 - (wy0Var2.k() / 2.0f), a10, d * 0.85f * f19, -1, canvas);
                    } else {
                        tVar = tVar2;
                        f14 = 0.0f;
                    }
                } else {
                    tVar = tVar2;
                    f14 = 0.0f;
                }
                wy0 wy0Var3 = tVar.h;
                if (wy0Var3 != null && f13 > f14) {
                    wy0Var3.c(i10 - (wy0Var3.k() / 2.0f), a10, d * 0.85f * f13, -1, canvas);
                }
                canvas.restore();
                canvas.restore();
            }
            i7++;
            canvas2 = canvas;
            z11 = z14;
            tVarArr2 = tVarArr;
            z15 = true;
            f16 = 1.0f;
        }
        t[] tVarArr3 = tVarArr2;
        if (z11) {
            t tVar3 = this.R;
            if (tVar3 == tVarArr3[0]) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            t tVar4 = tVarArr3[c10];
            a(canvas, 0, this.S, tVar3, 1.0f - f10, this.f15478w, this.f15479x, this.f15480y, c(f10, 0.0f, 0.25f));
            a(canvas, 1, this.T, tVar4, f10, this.K, this.L, this.M, 1.0f - c(f10, 0.75f, 1.0f));
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        t[] tVarArr;
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != i11) {
            for (t tVar : this.f15470a) {
                String str = tVar.f15423g;
                tVar.f15423g = null;
                tVar.h = null;
                tVar.b(str);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        w10 w10Var;
        t[] tVarArr;
        if (motionEvent.getAction() == 0) {
            this.d = null;
            for (t tVar : this.f15470a) {
                if (tVar.h != null && tVar.f15422f.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.d = tVar;
                    tVar.f15420c.c(true);
                    return true;
                }
            }
            return false;
        } else if (this.d == null) {
            return false;
        } else {
            if (motionEvent.getAction() == 2) {
                if (!this.d.f15422f.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.d.f15420c.c(false);
                    this.d = null;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                t tVar2 = this.d;
                this.d = null;
                tVar2.f15420c.c(false);
                if (motionEvent.getAction() == 1 && (w10Var = this.U) != null) {
                    w10Var.a(Integer.valueOf(tVar2.f15418a));
                }
            }
            return true;
        }
    }

    public void setOnClick(w10 w10Var) {
        this.U = w10Var;
    }

    public void setOnSwitchProgress(w10 w10Var) {
        this.V = w10Var;
    }
}
