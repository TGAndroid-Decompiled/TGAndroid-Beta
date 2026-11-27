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
public final class a12 extends wma {
    public int g0;
    public final RectF h0;
    public boolean i0;
    public float j0;
    public final z02 k0;
    public final n12 l0;

    public a12(n12 n12Var, Context context) {
        super(context, null);
        this.l0 = n12Var;
        this.h0 = new RectF();
        this.k0 = new z02(this, this);
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
        int Z0;
        float f6;
        int v0;
        float alpha;
        float f7;
        int i;
        f12 f12Var;
        canvas.save();
        n12 n12Var = this.l0;
        f12 f12Var2 = n12Var.v2;
        c62 c62Var = n12Var.k2;
        if ((f12Var2 == c62Var || (f12Var = n12Var.w2) == c62Var || (f12Var2 == n12Var.d2 && f12Var == null)) && f12Var2 != null) {
            canvas.save();
            float f8 = n12Var.i4;
            boolean z = n12Var.a2;
            tt ttVar = n12Var.L2;
            m02 m02Var = n12Var.f3;
            canvas.translate(0.0f, f8);
            int alpha2 = (int) (f12Var2.getAlpha() * 255.0f);
            int j = f12Var2.j();
            int L3 = hl.L(13.0f);
            if (m02Var != null) {
                f = m02Var.getAlpha();
            } else {
                f = 0.0f;
            }
            int L4 = L3 + ((int) (f * hl.L(26.0f)));
            if (ttVar != null) {
                f2 = ttVar.getAlpha() * ttVar.getMeasuredHeight();
            } else {
                f2 = 0.0f;
            }
            int i2 = L4 + ((int) f2);
            int Y0 = (n12Var.Y0(0) - n12Var.t0) - i2;
            if (n12Var.B0 == 1 || n12Var.q3 != null) {
                Y0 = (int) (f12Var2.getTranslationY() + Y0);
            }
            int L5 = hl.L(20.0f) + Y0;
            getMeasuredHeight();
            int i3 = n12Var.t0;
            if (j != 0) {
                i3 = a.getCurrentActionBarHeight();
            }
            if (j == 2) {
                if (Y0 < i3) {
                    f5 = bp1.x(i3 - Y0, n12Var.t0, 1.0f, 0.0f);
                    f3 = 1.0f;
                } else {
                    f5 = 1.0f;
                    f3 = 1.0f;
                }
            } else {
                float f9 = i2;
                f3 = 1.0f;
                if (f12Var2 == n12Var.i2) {
                    L = hl.L(11.0f);
                } else {
                    if (f12Var2 == n12Var.g2) {
                        L2 = hl.L(3.0f);
                    } else if (f12Var2 == n12Var.h2) {
                        L2 = hl.L(3.0f);
                    } else {
                        L = hl.L(4.0f);
                    }
                    f4 = f9 - L2;
                    float alpha3 = n12Var.U2.getAlpha();
                    int i4 = (int) (((i3 - f4) + hl.m) * alpha3);
                    Y0 -= i4;
                    L5 -= i4;
                    f5 = 1.0f - alpha3;
                }
                f4 = f9 + L;
                float alpha32 = n12Var.U2.getAlpha();
                int i42 = (int) (((i3 - f4) + hl.m) * alpha32);
                Y0 -= i42;
                L5 -= i42;
                f5 = 1.0f - alpha32;
            }
            if (!z) {
                int i5 = hl.m;
                Y0 += i5;
                L5 += i5;
            }
            if (n12Var.v2.h()) {
                Z0 = n12Var.v2.getCustomBackground();
            } else {
                Z0 = n12Var.Z0(true);
            }
            n12Var.s0.setAlpha(alpha2);
            n12Var.s0.setBounds(0, Y0, getMeasuredWidth(), hl.L(45.0f) + getMeasuredHeight() + n12Var.t0);
            n12Var.s0.draw(canvas);
            RectF rectF = this.h0;
            if (j == 2) {
                aob.s0.setColor(Z0);
                aob.s0.setAlpha(alpha2);
                f6 = 24.0f;
                rectF.set(n12Var.u0, n12Var.t0 + Y0, getMeasuredWidth() - n12Var.u0, hl.L(24.0f) + n12Var.t0 + Y0);
            } else {
                f6 = 24.0f;
            }
            if ((f5 != f3 && j != 2) || n12Var.v2.g()) {
                Paint paint = aob.s0;
                if (n12Var.v2.g()) {
                    Z0 = n12Var.v2.getCustomActionBarBackground();
                }
                paint.setColor(Z0);
                aob.s0.setAlpha(alpha2);
                rectF.set(n12Var.u0, n12Var.t0 + Y0, getMeasuredWidth() - n12Var.u0, hl.L(f6) + n12Var.t0 + Y0);
            }
            if (n12Var.v2.g()) {
                aob.s0.setColor(n12Var.v2.getCustomActionBarBackground());
                aob.s0.setAlpha(alpha2);
                int Y02 = n12Var.Y0(0);
                if (!z) {
                    Y02 += hl.m;
                }
                rectF.set(n12Var.u0, (hl.L(12.0f) + n12Var.t0 + Y0) * f5, getMeasuredWidth() - n12Var.u0, hl.L(12.0f) + Y02);
                canvas.save();
                canvas.drawRect(rectF, aob.s0);
                canvas.restore();
            }
            if ((m02Var == null || m02Var.getAlpha() != f3) && f5 != 0.0f) {
                int L6 = hl.L(36.0f);
                rectF.set((getMeasuredWidth() - L6) / 2, L5, (getMeasuredWidth() + L6) / 2, hl.L(4.0f) + L5);
                if (j == 2) {
                    v0 = 536870912;
                    f7 = f5;
                } else if (n12Var.v2.g()) {
                    int customActionBarBackground = n12Var.v2.getCustomActionBarBackground();
                    if (vm2.h(customActionBarBackground) < 0.5d) {
                        i = -1;
                    } else {
                        i = -16777216;
                    }
                    v0 = vm2.f(0.5f, customActionBarBackground, i);
                    if (m02Var != null) {
                        alpha = m02Var.getAlpha();
                        f7 = f3 - alpha;
                    }
                    f7 = f3;
                } else {
                    v0 = aob.v0(aob.zj, n12Var.J0);
                    if (m02Var != null) {
                        alpha = m02Var.getAlpha();
                        f7 = f3 - alpha;
                    }
                    f7 = f3;
                }
                int alpha4 = Color.alpha(v0);
                aob.s0.setColor(v0);
                aob.s0.setAlpha((int) (f12Var2.getAlpha() * alpha4 * f7 * f5));
                canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), aob.s0);
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
        int Z0;
        boolean z;
        float f9;
        boolean drawChild;
        int v0;
        float alpha;
        f12 f12Var;
        n12 n12Var = this.l0;
        boolean z2 = n12Var.a2;
        tt ttVar = n12Var.L2;
        jl0 jl0Var = n12Var.x2;
        m02 m02Var = n12Var.f3;
        y10 y10Var = n12Var.U2;
        if ((view instanceof f12) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, n12Var.i4);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            f12 f12Var2 = (f12) view;
            int j2 = f12Var2.j();
            int L5 = hl.L(13.0f);
            if (m02Var != null) {
                i2 = hl.L(m02Var.getAlpha() * 26.0f);
            } else {
                i2 = 0;
            }
            int i4 = L5 + i2;
            if (ttVar != null) {
                f5 = ttVar.getAlpha() * ttVar.getMeasuredHeight();
            } else {
                f5 = 0.0f;
            }
            int i5 = i4 + ((int) f5);
            if (f12Var2 == n12Var.v2) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int Y0 = (n12Var.Y0(i3) - n12Var.t0) - i5;
            if (n12Var.B0 == 1 || n12Var.q3 != null) {
                Y0 = (int) (view.getTranslationY() + Y0);
            }
            int L6 = hl.L(20.0f) + Y0;
            int measuredHeight = getMeasuredHeight();
            int i6 = n12Var.t0;
            int L7 = hl.L(45.0f) + measuredHeight + i6;
            if (j2 != 0) {
                i6 = a.getCurrentActionBarHeight();
            }
            if (j2 == 2) {
                if (Y0 < i6) {
                    f8 = bp1.x(i6 - Y0, n12Var.t0, 1.0f, 0.0f);
                    f6 = 0.0f;
                } else {
                    f6 = 0.0f;
                    f8 = 1.0f;
                }
            } else {
                f6 = 0.0f;
                if (n12Var.t0 + Y0 < i6) {
                    float f10 = i5;
                    if (f12Var2 == n12Var.i2) {
                        L3 = hl.L(11.0f);
                    } else {
                        if (f12Var2 == n12Var.g2) {
                            L4 = hl.L(3.0f);
                        } else if (f12Var2 == n12Var.h2) {
                            L4 = hl.L(3.0f);
                        } else {
                            L3 = hl.L(4.0f);
                        }
                        f7 = f10 - L4;
                        float min = Math.min(1.0f, ((i6 - Y0) - n12Var.t0) / f7);
                        int i7 = (int) ((i6 - f7) * min);
                        Y0 -= i7;
                        L6 -= i7;
                        L7 += i7;
                        f8 = 1.0f - min;
                    }
                    f7 = f10 + L3;
                    float min2 = Math.min(1.0f, ((i6 - Y0) - n12Var.t0) / f7);
                    int i72 = (int) ((i6 - f7) * min2);
                    Y0 -= i72;
                    L6 -= i72;
                    L7 += i72;
                    f8 = 1.0f - min2;
                }
                f8 = 1.0f;
            }
            if (!z2) {
                int i8 = hl.m;
                Y0 += i8;
                L6 += i8;
                L7 -= i8;
            }
            int i9 = L7;
            if (n12Var.v2.h()) {
                Z0 = n12Var.v2.getCustomBackground();
            } else {
                Z0 = n12Var.Z0(true);
            }
            f12 f12Var3 = n12Var.v2;
            c62 c62Var = n12Var.k2;
            if (f12Var3 != c62Var && (f12Var = n12Var.w2) != c62Var && (f12Var3 != n12Var.d2 || f12Var != null)) {
                z = true;
            } else {
                z = false;
            }
            RectF rectF = this.h0;
            if (z) {
                n12Var.s0.setAlpha(alpha2);
                f9 = 24.0f;
                n12Var.s0.setBounds(0, Y0, getMeasuredWidth(), i9);
                n12Var.s0.draw(canvas);
                if (j2 == 2) {
                    aob.s0.setColor(Z0);
                    aob.s0.setAlpha(alpha2);
                    rectF.set(n12Var.u0, n12Var.t0 + Y0, getMeasuredWidth() - n12Var.u0, hl.L(24.0f) + n12Var.t0 + Y0);
                }
            } else {
                f9 = 24.0f;
            }
            f12Var2.F(((n12Var.t0 + Y0) - view.getTop()) - view.getTranslationY(), f8);
            if (view != n12Var.e2 && view != n12Var.m2 && view != n12Var.f2) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j);
            }
            if (z) {
                if (f8 != 1.0f && j2 != 2) {
                    aob.s0.setColor(Z0);
                    aob.s0.setAlpha(alpha2);
                    rectF.set(n12Var.u0, n12Var.t0 + Y0, getMeasuredWidth() - n12Var.u0, hl.L(f9) + n12Var.t0 + Y0);
                }
                if ((m02Var == null || m02Var.getAlpha() != 1.0f) && f8 != f6) {
                    int L8 = hl.L(36.0f);
                    rectF.set((getMeasuredWidth() - L8) / 2, L6, (getMeasuredWidth() + L8) / 2, hl.L(4.0f) + L6);
                    if (j2 == 2) {
                        v0 = 536870912;
                        alpha = f8;
                    } else {
                        v0 = aob.v0(aob.zj, n12Var.J0);
                        if (m02Var == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - m02Var.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(v0);
                    aob.s0.setColor(v0);
                    aob.s0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f8));
                    canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), aob.s0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == y10Var) {
            float alpha4 = y10Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            float x = y10Var.getX();
            f12 f12Var4 = n12Var.v2;
            if (f12Var4 != null) {
                int j3 = f12Var4.j();
                int L9 = hl.L(13.0f);
                if (m02Var != null) {
                    f2 = m02Var.getAlpha();
                } else {
                    f2 = 0.0f;
                }
                int L10 = L9 + ((int) (f2 * hl.L(26.0f)));
                if (ttVar != null) {
                    f3 = ttVar.getAlpha() * ttVar.getMeasuredHeight();
                } else {
                    f3 = 0.0f;
                }
                int i10 = L10 + ((int) f3);
                int Y02 = (n12Var.Y0(0) - n12Var.t0) - i10;
                if (n12Var.B0 == 1 || n12Var.q3 != null) {
                    Y02 = (int) (f12Var4.getTranslationY() + Y02);
                }
                int L11 = hl.L(20.0f) + Y02;
                if (j3 != 0) {
                    i = a.getCurrentActionBarHeight();
                } else {
                    i = n12Var.t0;
                }
                if (j3 != 2 && Y02 + n12Var.t0 < i) {
                    float f11 = i10;
                    if (f12Var4 == n12Var.i2) {
                        L = hl.L(11.0f);
                    } else {
                        if (f12Var4 == n12Var.g2) {
                            L2 = hl.L(3.0f);
                        } else if (f12Var4 == n12Var.h2) {
                            L2 = hl.L(3.0f);
                        } else {
                            L = hl.L(4.0f);
                        }
                        f4 = f11 - L2;
                        L11 -= (int) (y10Var.getAlpha() * ((i - f4) + hl.m));
                    }
                    f4 = f11 + L;
                    L11 -= (int) (y10Var.getAlpha() * ((i - f4) + hl.m));
                }
                if (!z2) {
                    L11 += hl.m;
                }
                f = L11;
            } else {
                f = 0.0f;
            }
            canvas.clipRect(x, f, y10Var.getX() + y10Var.getWidth(), y10Var.getY() + y10Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof o24) && jl0Var != null) {
            canvas.save();
            jl0Var.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(jl0Var.S.k);
            jl0Var.draw(canvas);
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
        z02 z02Var = this.k0;
        z02Var.b = this;
        z02Var.c();
        n12 n12Var = this.l0;
        n12Var.B2.setAdjustPanLayoutHelper(z02Var);
        n12Var.M2.setAdjustPanLayoutHelper(z02Var);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k0.d();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        n12 n12Var = this.l0;
        int[] iArr = n12Var.Y3;
        if (n12Var.v2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i = 0;
            if (iArr[0] != 0) {
                float y = motionEvent.getY();
                tt ttVar = n12Var.L2;
                int i2 = iArr[0] - (n12Var.t0 << 1);
                int L = hl.L(13.0f);
                m02 m02Var = n12Var.f3;
                if (m02Var != null) {
                    i = hl.L(m02Var.getAlpha() * 26.0f);
                }
                int i3 = i2 - (L + i);
                if (ttVar != null) {
                    f = ttVar.getAlpha() * ttVar.getMeasuredHeight();
                } else {
                    f = 0.0f;
                }
                int L2 = hl.L(20.0f) + (i3 - ((int) f));
                if (!n12Var.a2) {
                    L2 += hl.m;
                }
                if (y < L2 && n12Var.U2.getAlpha() == 0.0f) {
                    n12Var.l0();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a12.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size;
        int i3;
        float f;
        a72 a72Var;
        a72 a72Var2;
        int X0;
        int i4;
        int i5;
        a12 a12Var = this;
        n12 n12Var = a12Var.l0;
        s7 s7Var = n12Var.X2;
        boolean z = n12Var.a2;
        if (a12Var.getLayoutParams().height > 0) {
            size = a12Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        if (!z) {
            a12Var.i0 = true;
            int i6 = n12Var.u0;
            a12Var.setPadding(i6, 0, i6, 0);
            a12Var.i0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i) - (n12Var.u0 << 1);
        if (hl.O1()) {
            s7Var.setAdditionalYOffset(-hl.L(3.0f));
        } else {
            Point point = hl.q;
            if (point.x > point.y) {
                s7Var.setAdditionalYOffset(0);
            } else {
                s7Var.setAdditionalYOffset(-hl.L(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) n12Var.c3.getLayoutParams()).height = a.getCurrentActionBarHeight();
        a12Var.i0 = true;
        int min = (int) (size2 / Math.min(4.5f, n12Var.x3.b()));
        if (n12Var.V3 != min) {
            n12Var.V3 = min;
            hl.c3(new go1(a12Var, (byte) 19));
        }
        a12Var.i0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        a12Var.setMeasuredDimension(size3, size4);
        int i7 = n12Var.u0;
        r02 r02Var = n12Var.M2;
        p02 p02Var = n12Var.B2;
        int i8 = size3 - (i7 << 1);
        if (!p02Var.O && hl.L(20.0f) >= 0 && !p02Var.e && !p02Var.P) {
            a12Var.i0 = true;
            p02Var.j();
            a12Var.i0 = false;
        }
        if (!r02Var.O && hl.L(20.0f) >= 0 && !r02Var.e && !r02Var.P) {
            a12Var.i0 = true;
            r02Var.j();
            a12Var.i0 = false;
        }
        if (n12Var.g2 != null && hl.L(20.0f) >= 0) {
            a72 a72Var3 = n12Var.g2;
            if (!a72Var3.H && !a72Var3.b1 && !a72Var3.g1 && !a72Var3.i1) {
                a12Var.i0 = true;
                a72Var3.Z();
                a12Var.i0 = false;
            }
        }
        if (n12Var.h2 != null && hl.L(20.0f) >= 0) {
            a72 a72Var4 = n12Var.h2;
            if (!a72Var4.H && !a72Var4.b1 && !a72Var4.g1 && !a72Var4.i1) {
                a12Var.i0 = true;
                a72Var4.Z();
                a12Var.i0 = false;
            }
        }
        if (hl.L(20.0f) >= 0) {
            if (n12Var.d) {
                f12 f12Var = n12Var.v2;
                a72 a72Var5 = n12Var.g2;
                if (f12Var == a72Var5 && a72Var5.F != null && a72Var5.i1) {
                    X0 = hl.L(120.0f);
                } else {
                    a72 a72Var6 = n12Var.h2;
                    if (f12Var == a72Var6 && a72Var6.F != null && a72Var6.i1) {
                        X0 = hl.L(120.0f);
                    } else {
                        X0 = 0;
                    }
                }
            } else {
                X0 = n12Var.X0();
            }
            WeakHashMap weakHashMap = ihc.a;
            l2d a = bhc.a(a12Var);
            if (a != null) {
                i4 = a.a.f(8).d;
            } else {
                i4 = 0;
            }
            l2d a2 = bhc.a(a12Var);
            if (a2 != null) {
                int i9 = a2.a.f(527).d;
            }
            if (i4 > 0) {
                i5 = 0;
            } else {
                i5 = hl.n;
            }
            int max = Math.max(i5, X0);
            a12Var.i0 = true;
            f12 f12Var2 = n12Var.v2;
            if (f12Var2.f) {
                f12Var2.e = hl.L(62.0f) + max;
                n12Var.v2.C(i8, size4);
            } else {
                f12Var2.e = hl.n;
                f12Var2.C(i8, size4 - X0);
            }
            f12 f12Var3 = n12Var.w2;
            if (f12Var3 != null) {
                if (f12Var3.f) {
                    f12Var3.e = hl.L(62.0f) + max;
                    n12Var.w2.C(i8, size4);
                } else {
                    f12Var3.e = hl.n;
                    f12Var3.C(i8, size4 - X0);
                }
            }
            a12Var.i0 = false;
        }
        int childCount = a12Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            int i11 = i10;
            View childAt = a12Var.getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (childAt == n12Var.s3) {
                    i3 = i11;
                    a12Var.measureChildWithMargins(childAt, i, 0, makeMeasureSpec, 0);
                } else {
                    i3 = i11;
                    int i12 = hl.m;
                    int i13 = hl.n;
                    if (childAt instanceof f12) {
                        f12 f12Var4 = (f12) childAt;
                        if (f12Var4.h) {
                            i12 = 0;
                        }
                        if (f12Var4.f) {
                            i13 = 0;
                        }
                    }
                    if (!p02Var.l(childAt) && !r02Var.l(childAt) && (((a72Var = n12Var.g2) == null || childAt != a72Var.F) && ((a72Var2 = n12Var.h2) == null || childAt != a72Var2.F))) {
                        measureChildWithMargins(childAt, i, 0, makeMeasureSpec, i12 + i13);
                    } else if (z) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, 1073741824));
                    } else if (!hl.E && !hl.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (hl.O1()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        if (hl.O1()) {
                            f = 200.0f;
                        } else {
                            f = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(f), getPaddingTop() + (size4 - hl.m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - hl.m), 1073741824));
                    }
                }
            } else {
                i3 = i11;
            }
            i10 = i3 + 1;
            a12Var = this;
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
        jl0 jl0Var = this.l0.x2;
        if (jl0Var != null) {
            jl0Var.t(hl.L(29.0f), hl.L(29.0f), i6, i5, true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n12 n12Var = this.l0;
        if (!n12Var.v2.o(motionEvent)) {
            if (!n12Var.J && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.i0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f) {
        n12 n12Var = this.l0;
        m02 m02Var = n12Var.u3;
        float f2 = f + n12Var.i4;
        byte b = n12Var.B0;
        if (b == 0) {
            this.j0 = f2;
        }
        if (b == 1) {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            f12 f12Var = n12Var.v2;
            if (i < 0) {
                f12Var.setTranslationY(f2);
                if (n12Var.N2 != 0 || n12Var.Q2) {
                    n12Var.f3.setTranslationY((n12Var.m3 + f2) - n12Var.i4);
                }
                m02Var.setTranslationY(0.0f);
                f2 = 0.0f;
            } else {
                f12Var.setTranslationY(0.0f);
                m02Var.setTranslationY(((f2 / this.j0) * m02Var.getMeasuredHeight()) + (-f2));
            }
            n12Var.b.invalidate();
        }
        super.setTranslationY((f2 - n12Var.i4) + n12Var.s2);
        if (n12Var.B0 != 1) {
            n12Var.v2.m(n12Var.i4);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
    }

    @Override
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
    }
}
