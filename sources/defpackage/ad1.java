package defpackage;

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
public final class ad1 extends View {
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
    public zc1 R;
    public String S;
    public String T;
    public qac U;
    public qac V;
    public final zc1[] a;
    public final Paint b;
    public final TextPaint c;
    public zc1 d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public float s;
    public float w;
    public float x;
    public float y;

    public ad1(Context context) {
        super(context);
        this.a = new zc1[]{new zc1(this, -1), new zc1(this, 1)};
        this.b = new Paint(1);
        this.c = new TextPaint(1);
        this.s = 1.0f;
        this.E = Layout.Alignment.ALIGN_CENTER;
        this.F = -1;
        this.N = new StaticLayout[2];
        this.O = new String[2];
        this.P = new float[4];
    }

    public static float c(float f, float f2, float f3) {
        return Utilities.i((f - f2) / (f3 - f2), 1.0f, 0.0f);
    }

    public final void a(android.graphics.Canvas r14, int r15, java.lang.String r16, defpackage.zc1 r17, float r18, float r19, float r20, float r21, float r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad1.a(android.graphics.Canvas, int, java.lang.String, zc1, float, float, float, float, float):void");
    }

    public final void b() {
        zc1[] zc1VarArr;
        float j;
        if (this.R == null) {
            return;
        }
        this.R = null;
        for (zc1 zc1Var : this.a) {
            zc1Var.i = null;
            ln lnVar = zc1Var.e;
            uib uibVar = zc1Var.h;
            if (uibVar == null) {
                j = 0.0f;
            } else {
                j = uibVar.j() + gm.L(31.0f) + gm.L(31.0f);
            }
            lnVar.e(true, j);
        }
        qac qacVar = this.V;
        if (qacVar != null) {
            qacVar.a(Float.valueOf(1.0f));
        }
        invalidate();
    }

    public final void d(float f, float f2, float f3, float f4, float f5, float f6, TextPaint textPaint, int i, float f7, float f8, float f9, Layout.Alignment alignment) {
        boolean z;
        if (this.e == f && this.f == f2 && this.h == f3 && this.n == f4) {
            z = false;
        } else {
            z = true;
        }
        this.e = f;
        this.f = f2;
        this.h = f3;
        this.n = f4;
        this.r = f5;
        this.s = f6;
        this.w = f7;
        this.x = f8;
        this.y = f9;
        if (alignment != null && alignment != this.E) {
            this.E = alignment;
            StaticLayout[] staticLayoutArr = this.N;
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.F = i;
        TextPaint textPaint2 = this.c;
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
        if (!z && this.R == null) {
            return;
        }
        invalidate();
    }

    public final void e(CharSequence charSequence, CharSequence charSequence2) {
        String charSequence3;
        if (this.R != null) {
            return;
        }
        zc1[] zc1VarArr = this.a;
        zc1 zc1Var = zc1VarArr[0];
        String str = null;
        if (charSequence == null) {
            charSequence3 = null;
        } else {
            charSequence3 = charSequence.toString();
        }
        zc1Var.b(charSequence3);
        zc1 zc1Var2 = zc1VarArr[1];
        if (charSequence2 != null) {
            str = charSequence2.toString();
        }
        zc1Var2.b(str);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        float f;
        char c;
        boolean z3;
        float j;
        float f2;
        boolean z4;
        float e;
        float f3;
        float f4;
        boolean z5;
        zc1[] zc1VarArr;
        zc1 zc1Var;
        float f5;
        float L;
        float f6;
        float c2;
        Canvas canvas2 = canvas;
        boolean z6 = true;
        if (this.R != null) {
            z = true;
        } else {
            z = false;
        }
        float f7 = 1.0f;
        if (z) {
            float elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - this.Q)) / 320.0f;
            if (elapsedRealtime >= 1.0f) {
                b();
                f = 1.0f;
                z2 = false;
            } else {
                float interpolation = d53.h.getInterpolation(elapsedRealtime);
                qac qacVar = this.V;
                if (qacVar != null) {
                    qacVar.a(Float.valueOf(interpolation));
                }
                invalidate();
                z2 = z;
                f = interpolation;
            }
        } else {
            z2 = z;
            f = 1.0f;
        }
        zc1[] zc1VarArr2 = this.a;
        int length = zc1VarArr2.length;
        int i = 0;
        while (i < length) {
            zc1 zc1Var2 = zc1VarArr2[i];
            ln lnVar = zc1Var2.d;
            ln lnVar2 = zc1Var2.e;
            Drawable drawable = zc1Var2.b;
            RectF rectF = zc1Var2.f;
            float f8 = f7;
            if (zc1Var2.h != null) {
                z3 = z6;
            } else {
                z3 = false;
            }
            float d = lnVar.d(z3);
            uib uibVar = zc1Var2.h;
            if (uibVar == null) {
                j = 0.0f;
            } else {
                j = uibVar.j() + gm.L(31.0f) + gm.L(31.0f);
            }
            if (z2) {
                if (zc1Var2.k) {
                    f6 = zc1Var2.j;
                } else {
                    f6 = j;
                }
                if (zc1Var2.h == null) {
                    j = zc1Var2.j;
                }
                e = gm.R1(f6, j, f);
                lnVar2.e(z6, e);
                if (zc1Var2 == this.R) {
                    f2 = 0.0f;
                    c2 = f8 - c(f, 0.0f, 0.25f);
                    f4 = c(f, 0.5f, f8);
                } else {
                    f2 = 0.0f;
                    c2 = f8 - c(f, 0.0f, 0.4f);
                    f4 = c(f, 0.75f, f8);
                }
                f3 = c2;
            } else {
                f2 = 0.0f;
                if (d <= 0.0f) {
                    z4 = z6;
                } else {
                    z4 = false;
                }
                e = lnVar2.e(z4, j);
                f3 = 0.0f;
                f4 = 1.0f;
            }
            if (d > f2 && e > f2) {
                float a = zc1Var2.a();
                float f9 = e / 2.0f;
                float f10 = f3;
                float i2 = Utilities.i(this.e, (getWidth() - gm.L(8.0f)) - f9, gm.L(8.0f) + f9);
                float L2 = gm.L(30.0f) / 2.0f;
                z5 = z2;
                float f11 = i2 + f9;
                zc1VarArr = zc1VarArr2;
                rectF.set(i2 - f9, a - L2, f11, a + L2);
                float R1 = gm.R1(0.8f, 1.0f, d) * zc1Var2.c.a(0.04f);
                canvas2.save();
                canvas2.scale(R1, R1, i2, a);
                int p1 = cmb.p1(d, -1946157056);
                Paint paint = this.b;
                paint.setColor(p1);
                canvas2.drawRoundRect(rectF, L2, L2, paint);
                int L3 = gm.L(14.0f);
                drawable.setAlpha((int) (217.0f * d));
                int i3 = 0;
                while (i3 < 2) {
                    if (i3 == 0) {
                        L = rectF.left + gm.L(10.0f);
                    } else {
                        L = (rectF.right - gm.L(10.0f)) - L3;
                    }
                    int i4 = (int) L;
                    int i5 = (int) (a - (L3 / 2.0f));
                    int i6 = L3;
                    drawable.setBounds(i4, i5, i4 + L3, i5 + i6);
                    drawable.draw(canvas2);
                    i3++;
                    L3 = i6;
                }
                canvas2.save();
                canvas2.clipRect(rectF.left + gm.L(24.0f), rectF.top, rectF.right - gm.L(24.0f), rectF.bottom);
                uib uibVar2 = zc1Var2.i;
                if (uibVar2 != null) {
                    if (f10 > 0.0f) {
                        zc1Var = zc1Var2;
                        f5 = 0.0f;
                        uibVar2.c(i2 - (uibVar2.j() / 2.0f), a, d * 0.85f * f10, -1, canvas);
                    } else {
                        zc1Var = zc1Var2;
                        f5 = 0.0f;
                    }
                } else {
                    zc1Var = zc1Var2;
                    f5 = 0.0f;
                }
                uib uibVar3 = zc1Var.h;
                if (uibVar3 != null && f4 > f5) {
                    uibVar3.c(i2 - (uibVar3.j() / 2.0f), a, d * 0.85f * f4, -1, canvas);
                }
                canvas.restore();
                canvas.restore();
            } else {
                z5 = z2;
                zc1VarArr = zc1VarArr2;
                rectF.setEmpty();
            }
            i++;
            canvas2 = canvas;
            z2 = z5;
            zc1VarArr2 = zc1VarArr;
            z6 = true;
            f7 = 1.0f;
        }
        zc1[] zc1VarArr3 = zc1VarArr2;
        if (z2) {
            zc1 zc1Var3 = this.R;
            if (zc1Var3 == zc1VarArr3[0]) {
                c = 1;
            } else {
                c = 0;
            }
            zc1 zc1Var4 = zc1VarArr3[c];
            a(canvas, 0, this.S, zc1Var3, 1.0f - f, this.w, this.x, this.y, c(f, 0.0f, 0.25f));
            a(canvas, 1, this.T, zc1Var4, f, this.K, this.L, this.M, 1.0f - c(f, 0.75f, 1.0f));
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        zc1[] zc1VarArr;
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            for (zc1 zc1Var : this.a) {
                String str = zc1Var.g;
                zc1Var.g = null;
                zc1Var.h = null;
                zc1Var.b(str);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qac qacVar;
        zc1[] zc1VarArr;
        if (motionEvent.getAction() == 0) {
            this.d = null;
            for (zc1 zc1Var : this.a) {
                if (zc1Var.h != null && zc1Var.f.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.d = zc1Var;
                    zc1Var.c.c(true);
                    return true;
                }
            }
        } else if (this.d != null) {
            if (motionEvent.getAction() == 2) {
                if (!this.d.f.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.d.c.c(false);
                    this.d = null;
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                zc1 zc1Var2 = this.d;
                this.d = null;
                zc1Var2.c.c(false);
                if (motionEvent.getAction() == 1 && (qacVar = this.U) != null) {
                    qacVar.a(Integer.valueOf(zc1Var2.a));
                }
            }
            return true;
        }
        return false;
    }

    public void setOnClick(qac qacVar) {
        this.U = qacVar;
    }

    public void setOnSwitchProgress(qac qacVar) {
        this.V = qacVar;
    }
}
