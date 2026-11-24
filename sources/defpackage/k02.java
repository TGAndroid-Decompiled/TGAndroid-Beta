package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.a;
public final class k02 extends cja {
    public int m0;
    public final RectF n0;
    public boolean o0;
    public float p0;
    public final j02 q0;
    public final x02 r0;

    public k02(x02 x02Var, Context context) {
        super(context, null);
        this.r0 = x02Var;
        this.n0 = new RectF();
        this.q0 = new j02(this, this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int L;
        int L2;
        float f4;
        float f5;
        int Y0;
        float f6;
        int v0;
        float alpha;
        float f7;
        int i;
        p02 p02Var;
        canvas.save();
        x02 x02Var = this.r0;
        p02 p02Var2 = x02Var.v2;
        m52 m52Var = x02Var.k2;
        if ((p02Var2 == m52Var || (p02Var = x02Var.w2) == m52Var || (p02Var2 == x02Var.d2 && p02Var == null)) && p02Var2 != null) {
            canvas.save();
            float f8 = x02Var.i4;
            boolean z = x02Var.a2;
            st stVar = x02Var.L2;
            wz1 wz1Var = x02Var.f3;
            canvas.translate(0.0f, f8);
            int alpha2 = (int) (p02Var2.getAlpha() * 255.0f);
            int j = p02Var2.j();
            int L3 = gl.L(13.0f);
            if (wz1Var != null) {
                f = wz1Var.getAlpha();
            } else {
                f = 0.0f;
            }
            int L4 = L3 + ((int) (f * gl.L(26.0f)));
            if (stVar != null) {
                f2 = stVar.getAlpha() * stVar.getMeasuredHeight();
            } else {
                f2 = 0.0f;
            }
            int i2 = L4 + ((int) f2);
            int X0 = (x02Var.X0(0) - x02Var.t0) - i2;
            if (x02Var.B0 == 1 || x02Var.q3 != null) {
                X0 = (int) (p02Var2.getTranslationY() + X0);
            }
            int L5 = gl.L(20.0f) + X0;
            getMeasuredHeight();
            int i3 = x02Var.t0;
            if (j != 0) {
                i3 = a.getCurrentActionBarHeight();
            }
            if (j == 2) {
                if (X0 < i3) {
                    f5 = oo1.x(i3 - X0, x02Var.t0, 1.0f, 0.0f);
                    f3 = 1.0f;
                } else {
                    f5 = 1.0f;
                    f3 = 1.0f;
                }
            } else {
                float f9 = i2;
                f3 = 1.0f;
                if (p02Var2 == x02Var.i2) {
                    L = gl.L(11.0f);
                } else {
                    if (p02Var2 == x02Var.g2) {
                        L2 = gl.L(3.0f);
                    } else if (p02Var2 == x02Var.h2) {
                        L2 = gl.L(3.0f);
                    } else {
                        L = gl.L(4.0f);
                    }
                    f4 = f9 - L2;
                    float alpha3 = x02Var.U2.getAlpha();
                    int i4 = (int) (((i3 - f4) + gl.m) * alpha3);
                    X0 -= i4;
                    L5 -= i4;
                    f5 = 1.0f - alpha3;
                }
                f4 = f9 + L;
                float alpha32 = x02Var.U2.getAlpha();
                int i42 = (int) (((i3 - f4) + gl.m) * alpha32);
                X0 -= i42;
                L5 -= i42;
                f5 = 1.0f - alpha32;
            }
            if (!z) {
                int i5 = gl.m;
                X0 += i5;
                L5 += i5;
            }
            if (x02Var.v2.h()) {
                Y0 = x02Var.v2.getCustomBackground();
            } else {
                Y0 = x02Var.Y0(true);
            }
            x02Var.s0.setAlpha(alpha2);
            x02Var.s0.setBounds(0, X0, getMeasuredWidth(), gl.L(45.0f) + getMeasuredHeight() + x02Var.t0);
            x02Var.s0.draw(canvas);
            RectF rectF = this.n0;
            if (j == 2) {
                bkb.s0.setColor(Y0);
                bkb.s0.setAlpha(alpha2);
                f6 = 24.0f;
                rectF.set(x02Var.u0, x02Var.t0 + X0, getMeasuredWidth() - x02Var.u0, gl.L(24.0f) + x02Var.t0 + X0);
            } else {
                f6 = 24.0f;
            }
            if ((f5 != f3 && j != 2) || x02Var.v2.g()) {
                Paint paint = bkb.s0;
                if (x02Var.v2.g()) {
                    Y0 = x02Var.v2.getCustomActionBarBackground();
                }
                paint.setColor(Y0);
                bkb.s0.setAlpha(alpha2);
                rectF.set(x02Var.u0, x02Var.t0 + X0, getMeasuredWidth() - x02Var.u0, gl.L(f6) + x02Var.t0 + X0);
            }
            if (x02Var.v2.g()) {
                bkb.s0.setColor(x02Var.v2.getCustomActionBarBackground());
                bkb.s0.setAlpha(alpha2);
                int X02 = x02Var.X0(0);
                if (!z) {
                    X02 += gl.m;
                }
                rectF.set(x02Var.u0, (gl.L(12.0f) + x02Var.t0 + X0) * f5, getMeasuredWidth() - x02Var.u0, gl.L(12.0f) + X02);
                canvas.save();
                canvas.drawRect(rectF, bkb.s0);
                canvas.restore();
            }
            if ((wz1Var == null || wz1Var.getAlpha() != f3) && f5 != 0.0f) {
                int L6 = gl.L(36.0f);
                rectF.set((getMeasuredWidth() - L6) / 2, L5, (getMeasuredWidth() + L6) / 2, gl.L(4.0f) + L5);
                if (j == 2) {
                    v0 = 536870912;
                    f7 = f5;
                } else if (x02Var.v2.g()) {
                    int customActionBarBackground = x02Var.v2.getCustomActionBarBackground();
                    if (bm2.h(customActionBarBackground) < 0.5d) {
                        i = -1;
                    } else {
                        i = -16777216;
                    }
                    v0 = bm2.f(0.5f, customActionBarBackground, i);
                    if (wz1Var != null) {
                        alpha = wz1Var.getAlpha();
                        f7 = f3 - alpha;
                    }
                    f7 = f3;
                } else {
                    v0 = bkb.v0(bkb.yj, x02Var.J0);
                    if (wz1Var != null) {
                        alpha = wz1Var.getAlpha();
                        f7 = f3 - alpha;
                    }
                    f7 = f3;
                }
                int alpha4 = Color.alpha(v0);
                bkb.s0.setColor(v0);
                bkb.s0.setAlpha((int) (p02Var2.getAlpha() * alpha4 * f7 * f5));
                canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float f;
        float f2;
        float f3;
        int i;
        int L;
        int L2;
        float f4;
        int i2;
        float f5;
        int i3;
        float f6;
        int L3;
        int L4;
        float f7;
        float f8;
        int Y0;
        boolean z;
        float f9;
        boolean drawChild;
        int v0;
        float alpha;
        p02 p02Var;
        x02 x02Var = this.r0;
        boolean z2 = x02Var.a2;
        st stVar = x02Var.L2;
        il0 il0Var = x02Var.x2;
        wz1 wz1Var = x02Var.f3;
        x10 x10Var = x02Var.U2;
        if ((view instanceof p02) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, x02Var.i4);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            p02 p02Var2 = (p02) view;
            int j2 = p02Var2.j();
            int L5 = gl.L(13.0f);
            if (wz1Var != null) {
                i2 = gl.L(wz1Var.getAlpha() * 26.0f);
            } else {
                i2 = 0;
            }
            int i4 = L5 + i2;
            if (stVar != null) {
                f5 = stVar.getAlpha() * stVar.getMeasuredHeight();
            } else {
                f5 = 0.0f;
            }
            int i5 = i4 + ((int) f5);
            if (p02Var2 == x02Var.v2) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int X0 = (x02Var.X0(i3) - x02Var.t0) - i5;
            if (x02Var.B0 == 1 || x02Var.q3 != null) {
                X0 = (int) (view.getTranslationY() + X0);
            }
            int L6 = gl.L(20.0f) + X0;
            int measuredHeight = getMeasuredHeight();
            int i6 = x02Var.t0;
            int L7 = gl.L(45.0f) + measuredHeight + i6;
            if (j2 != 0) {
                i6 = a.getCurrentActionBarHeight();
            }
            if (j2 == 2) {
                if (X0 < i6) {
                    f8 = oo1.x(i6 - X0, x02Var.t0, 1.0f, 0.0f);
                    f6 = 0.0f;
                } else {
                    f6 = 0.0f;
                    f8 = 1.0f;
                }
            } else {
                f6 = 0.0f;
                if (x02Var.t0 + X0 < i6) {
                    float f10 = i5;
                    if (p02Var2 == x02Var.i2) {
                        L3 = gl.L(11.0f);
                    } else {
                        if (p02Var2 == x02Var.g2) {
                            L4 = gl.L(3.0f);
                        } else if (p02Var2 == x02Var.h2) {
                            L4 = gl.L(3.0f);
                        } else {
                            L3 = gl.L(4.0f);
                        }
                        f7 = f10 - L4;
                        float min = Math.min(1.0f, ((i6 - X0) - x02Var.t0) / f7);
                        int i7 = (int) ((i6 - f7) * min);
                        X0 -= i7;
                        L6 -= i7;
                        L7 += i7;
                        f8 = 1.0f - min;
                    }
                    f7 = f10 + L3;
                    float min2 = Math.min(1.0f, ((i6 - X0) - x02Var.t0) / f7);
                    int i72 = (int) ((i6 - f7) * min2);
                    X0 -= i72;
                    L6 -= i72;
                    L7 += i72;
                    f8 = 1.0f - min2;
                }
                f8 = 1.0f;
            }
            if (!z2) {
                int i8 = gl.m;
                X0 += i8;
                L6 += i8;
                L7 -= i8;
            }
            int i9 = L7;
            if (x02Var.v2.h()) {
                Y0 = x02Var.v2.getCustomBackground();
            } else {
                Y0 = x02Var.Y0(true);
            }
            p02 p02Var3 = x02Var.v2;
            m52 m52Var = x02Var.k2;
            if (p02Var3 != m52Var && (p02Var = x02Var.w2) != m52Var && (p02Var3 != x02Var.d2 || p02Var != null)) {
                z = true;
            } else {
                z = false;
            }
            RectF rectF = this.n0;
            if (z) {
                x02Var.s0.setAlpha(alpha2);
                f9 = 24.0f;
                x02Var.s0.setBounds(0, X0, getMeasuredWidth(), i9);
                x02Var.s0.draw(canvas);
                if (j2 == 2) {
                    bkb.s0.setColor(Y0);
                    bkb.s0.setAlpha(alpha2);
                    rectF.set(x02Var.u0, x02Var.t0 + X0, getMeasuredWidth() - x02Var.u0, gl.L(24.0f) + x02Var.t0 + X0);
                }
            } else {
                f9 = 24.0f;
            }
            p02Var2.G(((x02Var.t0 + X0) - view.getTop()) - view.getTranslationY(), f8);
            if (view != x02Var.e2 && view != x02Var.m2 && view != x02Var.f2) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j);
            }
            if (z) {
                if (f8 != 1.0f && j2 != 2) {
                    bkb.s0.setColor(Y0);
                    bkb.s0.setAlpha(alpha2);
                    rectF.set(x02Var.u0, x02Var.t0 + X0, getMeasuredWidth() - x02Var.u0, gl.L(f9) + x02Var.t0 + X0);
                }
                if ((wz1Var == null || wz1Var.getAlpha() != 1.0f) && f8 != f6) {
                    int L8 = gl.L(36.0f);
                    rectF.set((getMeasuredWidth() - L8) / 2, L6, (getMeasuredWidth() + L8) / 2, gl.L(4.0f) + L6);
                    if (j2 == 2) {
                        v0 = 536870912;
                        alpha = f8;
                    } else {
                        v0 = bkb.v0(bkb.yj, x02Var.J0);
                        if (wz1Var == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - wz1Var.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(v0);
                    bkb.s0.setColor(v0);
                    bkb.s0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f8));
                    canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == x10Var) {
            float alpha4 = x10Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            float x = x10Var.getX();
            p02 p02Var4 = x02Var.v2;
            if (p02Var4 != null) {
                int j3 = p02Var4.j();
                int L9 = gl.L(13.0f);
                if (wz1Var != null) {
                    f2 = wz1Var.getAlpha();
                } else {
                    f2 = 0.0f;
                }
                int L10 = L9 + ((int) (f2 * gl.L(26.0f)));
                if (stVar != null) {
                    f3 = stVar.getAlpha() * stVar.getMeasuredHeight();
                } else {
                    f3 = 0.0f;
                }
                int i10 = L10 + ((int) f3);
                int X02 = (x02Var.X0(0) - x02Var.t0) - i10;
                if (x02Var.B0 == 1 || x02Var.q3 != null) {
                    X02 = (int) (p02Var4.getTranslationY() + X02);
                }
                int L11 = gl.L(20.0f) + X02;
                if (j3 != 0) {
                    i = a.getCurrentActionBarHeight();
                } else {
                    i = x02Var.t0;
                }
                if (j3 != 2 && X02 + x02Var.t0 < i) {
                    float f11 = i10;
                    if (p02Var4 == x02Var.i2) {
                        L = gl.L(11.0f);
                    } else {
                        if (p02Var4 == x02Var.g2) {
                            L2 = gl.L(3.0f);
                        } else if (p02Var4 == x02Var.h2) {
                            L2 = gl.L(3.0f);
                        } else {
                            L = gl.L(4.0f);
                        }
                        f4 = f11 - L2;
                        L11 -= (int) (x10Var.getAlpha() * ((i - f4) + gl.m));
                    }
                    f4 = f11 + L;
                    L11 -= (int) (x10Var.getAlpha() * ((i - f4) + gl.m));
                }
                if (!z2) {
                    L11 += gl.m;
                }
                f = L11;
            } else {
                f = 0.0f;
            }
            canvas.clipRect(x, f, x10Var.getX() + x10Var.getWidth(), x10Var.getY() + x10Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof t14) && il0Var != null) {
            canvas.save();
            il0Var.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(il0Var.S.k);
            il0Var.draw(canvas);
            boolean drawChild3 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild3;
        } else {
            return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j02 j02Var = this.q0;
        j02Var.b = this;
        j02Var.c();
        x02 x02Var = this.r0;
        x02Var.B2.setAdjustPanLayoutHelper(j02Var);
        x02Var.M2.setAdjustPanLayoutHelper(j02Var);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q0.d();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        x02 x02Var = this.r0;
        int[] iArr = x02Var.Y3;
        if (x02Var.v2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i = 0;
            if (iArr[0] != 0) {
                float y = motionEvent.getY();
                st stVar = x02Var.L2;
                int i2 = iArr[0] - (x02Var.t0 << 1);
                int L = gl.L(13.0f);
                wz1 wz1Var = x02Var.f3;
                if (wz1Var != null) {
                    i = gl.L(wz1Var.getAlpha() * 26.0f);
                }
                int i3 = i2 - (L + i);
                if (stVar != null) {
                    f = stVar.getAlpha() * stVar.getMeasuredHeight();
                } else {
                    f = 0.0f;
                }
                int L2 = gl.L(20.0f) + (i3 - ((int) f));
                if (!x02Var.a2) {
                    L2 += gl.m;
                }
                if (y < L2 && x02Var.U2.getAlpha() == 0.0f) {
                    x02Var.l0();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k02.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size;
        int i3;
        float f;
        k62 k62Var;
        k62 k62Var2;
        int W0;
        int i4;
        int i5;
        k02 k02Var = this;
        x02 x02Var = k02Var.r0;
        r7 r7Var = x02Var.X2;
        boolean z = x02Var.a2;
        if (k02Var.getLayoutParams().height > 0) {
            size = k02Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        if (!z) {
            k02Var.o0 = true;
            int i6 = x02Var.u0;
            k02Var.setPadding(i6, 0, i6, 0);
            k02Var.o0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i) - (x02Var.u0 << 1);
        if (gl.O1()) {
            r7Var.setAdditionalYOffset(-gl.L(3.0f));
        } else {
            Point point = gl.q;
            if (point.x > point.y) {
                r7Var.setAdditionalYOffset(0);
            } else {
                r7Var.setAdditionalYOffset(-gl.L(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) x02Var.c3.getLayoutParams()).height = a.getCurrentActionBarHeight();
        k02Var.o0 = true;
        int min = (int) (size2 / Math.min(4.5f, x02Var.x3.b()));
        if (x02Var.V3 != min) {
            x02Var.V3 = min;
            gl.d3(new hq1(k02Var, (byte) 13));
        }
        k02Var.o0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        k02Var.setMeasuredDimension(size3, size4);
        int i7 = x02Var.u0;
        b02 b02Var = x02Var.M2;
        zz1 zz1Var = x02Var.B2;
        int i8 = size3 - (i7 << 1);
        if (!zz1Var.O && gl.L(20.0f) >= 0 && !zz1Var.e && !zz1Var.P) {
            k02Var.o0 = true;
            zz1Var.j();
            k02Var.o0 = false;
        }
        if (!b02Var.O && gl.L(20.0f) >= 0 && !b02Var.e && !b02Var.P) {
            k02Var.o0 = true;
            b02Var.j();
            k02Var.o0 = false;
        }
        if (x02Var.g2 != null && gl.L(20.0f) >= 0) {
            k62 k62Var3 = x02Var.g2;
            if (!k62Var3.H && !k62Var3.b1 && !k62Var3.g1 && !k62Var3.i1) {
                k02Var.o0 = true;
                k62Var3.a0();
                k02Var.o0 = false;
            }
        }
        if (x02Var.h2 != null && gl.L(20.0f) >= 0) {
            k62 k62Var4 = x02Var.h2;
            if (!k62Var4.H && !k62Var4.b1 && !k62Var4.g1 && !k62Var4.i1) {
                k02Var.o0 = true;
                k62Var4.a0();
                k02Var.o0 = false;
            }
        }
        if (gl.L(20.0f) >= 0) {
            if (x02Var.d) {
                p02 p02Var = x02Var.v2;
                k62 k62Var5 = x02Var.g2;
                if (p02Var == k62Var5 && k62Var5.F != null && k62Var5.i1) {
                    W0 = gl.L(120.0f);
                } else {
                    k62 k62Var6 = x02Var.h2;
                    if (p02Var == k62Var6 && k62Var6.F != null && k62Var6.i1) {
                        W0 = gl.L(120.0f);
                    } else {
                        W0 = 0;
                    }
                }
            } else {
                W0 = x02Var.W0();
            }
            WeakHashMap weakHashMap = jdc.a;
            vxc a = cdc.a(k02Var);
            if (a != null) {
                i4 = a.a.f(8).d;
            } else {
                i4 = 0;
            }
            vxc a2 = cdc.a(k02Var);
            if (a2 != null) {
                int i9 = a2.a.f(527).d;
            }
            if (i4 > 0) {
                i5 = 0;
            } else {
                i5 = gl.n;
            }
            int max = Math.max(i5, W0);
            k02Var.o0 = true;
            p02 p02Var2 = x02Var.v2;
            if (p02Var2.f) {
                p02Var2.e = gl.L(62.0f) + max;
                x02Var.v2.C(i8, size4);
            } else {
                p02Var2.e = gl.n;
                p02Var2.C(i8, size4 - W0);
            }
            p02 p02Var3 = x02Var.w2;
            if (p02Var3 != null) {
                if (p02Var3.f) {
                    p02Var3.e = gl.L(62.0f) + max;
                    x02Var.w2.C(i8, size4);
                } else {
                    p02Var3.e = gl.n;
                    p02Var3.C(i8, size4 - W0);
                }
            }
            k02Var.o0 = false;
        }
        int childCount = k02Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            int i11 = i10;
            View childAt = k02Var.getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (childAt == x02Var.s3) {
                    i3 = i11;
                    k02Var.measureChildWithMargins(childAt, i, 0, makeMeasureSpec, 0);
                } else {
                    i3 = i11;
                    int i12 = gl.m;
                    int i13 = gl.n;
                    if (childAt instanceof p02) {
                        p02 p02Var4 = (p02) childAt;
                        if (p02Var4.h) {
                            i12 = 0;
                        }
                        if (p02Var4.f) {
                            i13 = 0;
                        }
                    }
                    if (!zz1Var.l(childAt) && !b02Var.l(childAt) && (((k62Var = x02Var.g2) == null || childAt != k62Var.F) && ((k62Var2 = x02Var.h2) == null || childAt != k62Var2.F))) {
                        measureChildWithMargins(childAt, i, 0, makeMeasureSpec, i12 + i13);
                    } else if (z) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, 1073741824));
                    } else if (!gl.E && !gl.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (gl.O1()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        if (gl.O1()) {
                            f = 200.0f;
                        } else {
                            f = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(f), getPaddingTop() + (size4 - gl.m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - gl.m), 1073741824));
                    }
                }
            } else {
                i3 = i11;
            }
            i10 = i3 + 1;
            k02Var = this;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        WindowInsets rootWindowInsets;
        super.onSizeChanged(i, i2, i3, i4);
        int i6 = 0;
        if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
            RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
            if (roundedCorner == null) {
                i5 = 0;
            } else {
                i5 = roundedCorner.getRadius();
            }
            if (roundedCorner2 != null) {
                i6 = roundedCorner2.getRadius();
            }
        } else {
            i5 = 0;
        }
        il0 il0Var = this.r0.x2;
        if (il0Var != null) {
            il0Var.t(gl.L(29.0f), gl.L(29.0f), i6, i5, true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x02 x02Var = this.r0;
        if (!x02Var.v2.o(motionEvent)) {
            if (!x02Var.J && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.o0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f) {
        x02 x02Var = this.r0;
        wz1 wz1Var = x02Var.u3;
        float f2 = f + x02Var.i4;
        byte b = x02Var.B0;
        if (b == 0) {
            this.p0 = f2;
        }
        if (b == 1) {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            p02 p02Var = x02Var.v2;
            if (i < 0) {
                p02Var.setTranslationY(f2);
                if (x02Var.N2 != 0 || x02Var.Q2) {
                    x02Var.f3.setTranslationY((x02Var.m3 + f2) - x02Var.i4);
                }
                wz1Var.setTranslationY(0.0f);
                f2 = 0.0f;
            } else {
                p02Var.setTranslationY(0.0f);
                wz1Var.setTranslationY(((f2 / this.p0) * wz1Var.getMeasuredHeight()) + (-f2));
            }
            x02Var.b.invalidate();
        }
        super.setTranslationY((f2 - x02Var.i4) + x02Var.s2);
        if (x02Var.B0 != 1) {
            x02Var.v2.m(x02Var.i4);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
    }

    @Override
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
    }
}
