package ai;

import a8.sa;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ae;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ee;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.wd;
public final class p0 extends View {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public boolean E;
    public int E0;
    public final u5 F;
    public long F0;
    public final u5 G;
    public long G0;
    public final u5 H;
    public long H0;
    public final u5 I;
    public long I0;
    public final u5 J;
    public Drawable J0;
    public final u5 K;
    public final int[] K0;
    public int L;
    public boolean L0;
    public float M;
    public final u5 M0;
    public float N;
    public final u5 N0;
    public float O;
    public final u5 O0;
    public final float[] P;
    public final Paint P0;
    public int Q;
    public final RectF Q0;
    public boolean R;
    public long R0;
    public float S;
    public final Matrix S0;
    public float T;
    public final SparseArray T0;
    public final Paint U;
    public final Paint U0;
    public final Path V;
    public n0 V0;
    public ch0 W;
    public fh.g W0;
    public final Path X0;
    public Paint Y0;
    public float Z0;
    public final m0 f1429a;
    public int f1430a0;
    public float f1431a1;
    public wd f1432b;
    public final Paint f1433b0;
    public long f1434b1;
    public ee f1435c;
    public final Paint f1436c0;
    public long f1437c1;
    public final Paint d;
    public final Paint f1438d0;
    public o0 f1439d1;
    public final Paint f1440e;
    public final Paint f1441e0;
    public int f1442e1;
    public final Paint f1443f;
    public final Paint f1444f0;
    public int f1445f1;
    public final u5 f1446g0;
    public int f1447g1;
    public final Paint h;
    public final u5 f1448h0;
    public int f1449h1;
    public float f1450i0;
    public int f1451i1;
    public float f1452j0;
    public boolean f1453j1;
    public float f1454k0;
    public final sa f1455k1;
    public boolean f1456l0;
    public boolean l1;
    public final RectF m0;
    public float f1457m1;
    public final Drawable f1458n;
    public final RectF f1459n0;
    public float n1;
    public final int[] f1460o0;
    public boolean f1461p0;
    public int f1462q0;
    public final RectF f1463r;
    public int f1464r0;
    public final RectF f1465s;
    public LinearGradient f1466s0;
    public RadialGradient f1467t0;
    public LinearGradient f1468u0;
    public final Paint f1469v0;
    public final RectF f1470w;
    public final Paint f1471w0;
    public final float[] f1472x;
    public final Matrix f1473x0;
    public boolean f1474y;
    public boolean f1475y0;
    public final float[] f1476z0;

    public p0(Context context, m0 m0Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f1440e = new Paint(1);
        this.f1443f = new Paint(1);
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f1463r = new RectF();
        this.f1465s = new RectF();
        this.f1470w = new RectF();
        this.f1472x = new float[2];
        er erVar = er.f34421g;
        this.F = new u5(this, 0L, 220L, erVar);
        er erVar2 = er.h;
        this.G = new u5(this, 0L, 320L, erVar2);
        er erVar3 = er.f34423j;
        this.H = new u5(this, 0L, 200L, erVar3);
        this.I = new u5(this, 0L, 300L, erVar2);
        this.J = new u5(this, 0L, 200L, erVar3);
        this.K = new u5(this, 0L, 160L, erVar2);
        this.L = 0;
        this.P = new float[3];
        this.Q = -1;
        this.U = new Paint(1);
        this.V = new Path();
        this.f1433b0 = new Paint(1);
        this.f1436c0 = new Paint(1);
        this.f1438d0 = new Paint(1);
        this.f1441e0 = new Paint(1);
        this.f1444f0 = new Paint(1);
        this.f1446g0 = new u5(this, 0L, 320L, new er(0.25d, 0.1d, 0.25d, 1.0d));
        this.f1448h0 = new u5(this, 0L, 150L, erVar);
        this.m0 = new RectF();
        this.f1459n0 = new RectF();
        this.f1460o0 = new int[2];
        this.f1469v0 = new Paint(1);
        this.f1471w0 = new Paint(1);
        this.f1473x0 = new Matrix();
        this.f1476z0 = new float[5];
        this.K0 = new int[2];
        this.M0 = new u5(this, 0L, 220L, erVar);
        this.N0 = new u5(this, 0L, 420L, erVar3);
        this.O0 = new u5(this, 0L, 260L, erVar);
        this.P0 = new Paint(1);
        this.Q0 = new RectF();
        this.S0 = new Matrix();
        this.T0 = new SparseArray();
        this.U0 = new Paint(1);
        this.X0 = new Path();
        this.f1442e1 = -15820126;
        this.f1445f1 = -14910766;
        this.f1447g1 = -14910766;
        this.f1449h1 = -7696492;
        this.f1451i1 = -1726275033;
        this.f1455k1 = new sa(this, 2);
        this.f1429a = m0Var;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        paint2.setColor(-1);
        Drawable g10 = i5.c.g(context, 2131232695);
        this.f1458n = g10;
        g10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final boolean a(View view, float[] fArr) {
        if (view == null || view.getWidth() == 0) {
            return false;
        }
        float width = view.getWidth() / 2.0f;
        float height = view.getHeight() / 2.0f;
        ViewParent parent = getParent();
        while (view != null && view != parent) {
            width += view.getTranslationX() + view.getLeft();
            height += view.getTranslationY() + view.getTop();
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                view = (View) parent2;
            } else {
                view = null;
            }
        }
        if (view == null) {
            return false;
        }
        fArr[0] = width - getLeft();
        fArr[1] = height - getTop();
        return true;
    }

    public final int b(int i7) {
        if (this.f1461p0) {
            return g(i7);
        }
        float max = Math.max(0.0f, Math.min(1.0f, this.f1431a1)) * s0.c(11);
        if (max <= 0.004f) {
            return this.f1451i1;
        }
        return i0.a.f(max, this.f1451i1, i0.a.f(0.5f, i7, this.f1447g1) | (-16777216));
    }

    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, int i7, float f14) {
        if (f14 <= 0.01f) {
            return;
        }
        int i10 = (i7 & 16316664) | (-16777216);
        SparseArray sparseArray = this.T0;
        SweepGradient sweepGradient = (SweepGradient) sparseArray.get(i10);
        if (sweepGradient == null) {
            int i11 = 16777215 & i10;
            SweepGradient sweepGradient2 = new SweepGradient(0.0f, 0.0f, new int[]{i11, i10, i11, i11}, new float[]{0.0f, 0.19444445f, 0.3888889f, 1.0f});
            if (sparseArray.size() > 256) {
                sparseArray.clear();
            }
            sparseArray.put(i10, sweepGradient2);
            sweepGradient = sweepGradient2;
        }
        float f15 = f13 - 70.0f;
        Matrix matrix = this.S0;
        matrix.setRotate(f15);
        matrix.postTranslate(f10, f11);
        sweepGradient.setLocalMatrix(matrix);
        Paint paint = this.U0;
        paint.setShader(sweepGradient);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(1.1f)));
        paint.setColor(-1);
        paint.setAlpha((int) (Math.min(1.0f, f14) * 255.0f));
        RectF rectF = this.f1470w;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
        canvas.drawArc(rectF, f15, 140.0f, false, paint);
        paint.setShader(null);
    }

    public final void d(android.graphics.Canvas r28) {
        throw new UnsupportedOperationException("Method not decompiled: ai.p0.d(android.graphics.Canvas):void");
    }

    public final void e() {
        this.f1474y = false;
        this.E = false;
        this.F.e(true, 0.0f);
        this.G.e(true, 0.0f);
        setVisibility(8);
    }

    public final int f(float f10, float f11) {
        if (this.f1456l0) {
            RectF rectF = this.m0;
            if (!rectF.isEmpty() && this.f1446g0.f39903c > 0.7f && rectF.contains(f10, f11)) {
                return 1;
            }
        }
        if (this.F.f39903c >= 0.6f && this.f1474y) {
            RectF rectF2 = this.f1463r;
            if (!rectF2.isEmpty() && this.E && rectF2.contains(f10, f11)) {
                return 0;
            }
            if (this.f1465s.contains(f10, f11)) {
                return 2;
            }
        }
        return -1;
    }

    public final int g(int i7) {
        if (this.f1461p0) {
            return i0.a.f(0.4f, i7, -1);
        }
        return i0.a.f(s0.c(11), this.f1449h1, i0.a.f(0.5f, i7, this.f1447g1));
    }

    public int getRightMode() {
        return this.L;
    }

    public final void h() {
        if (!this.f1453j1 && isAttachedToWindow()) {
            this.f1453j1 = true;
            postOnAnimation(this.f1455k1);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            h();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1455k1);
        this.f1453j1 = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r72) {
        throw new UnsupportedOperationException("Method not decompiled: ai.p0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1474y) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.Q = f(motionEvent.getX(), motionEvent.getY());
                invalidate();
                if (this.Q >= 0) {
                    return true;
                }
            } else {
                if (actionMasked == 1) {
                    int f10 = f(motionEvent.getX(), motionEvent.getY());
                    int i7 = this.Q;
                    this.Q = -1;
                    invalidate();
                    if (i7 >= 0 && i7 == f10) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        m0 m0Var = this.f1429a;
                        if (i7 == 0) {
                            ae aeVar = m0Var.f1365f;
                            if (m0Var.k()) {
                                b2 b2Var = m0Var.G;
                                if (b2Var != null) {
                                    b2Var.c();
                                }
                                m0Var.G = null;
                                Editable text = aeVar.f32967b.F0.getText();
                                if (text != null && m0Var.I <= text.length()) {
                                    m0Var.L = true;
                                    m0Var.F.a();
                                    text.delete(m0Var.I, text.length());
                                    m0Var.L = false;
                                }
                                m0Var.z();
                                m0Var.f();
                                m0Var.u(false);
                                m0Var.f1385w.setIsland(false);
                                m0Var.f1385w.setSettings(false);
                                m0Var.f1385w.setStopMode(false);
                                m0Var.w();
                                m0Var.f1378r = 0;
                                aeVar.b();
                            }
                        } else if (i7 == 1) {
                            m0Var.n();
                        } else {
                            ae aeVar2 = m0Var.f1365f;
                            int i10 = m0Var.f1378r;
                            if (i10 == 1) {
                                ChatActivityEnterView chatActivityEnterView = aeVar2.f32967b;
                                ChatActivityEnterView chatActivityEnterView2 = aeVar2.f32967b;
                                Editable text2 = chatActivityEnterView.F0.getText();
                                if (m0Var.f1380s.getRightMode() == 2 || (text2 != null && ((m0Var.q() > 0 || m0Var.N > 0) && text2.toString().trim().length() > 0))) {
                                    Log.d("Dictation", "send from listening (" + m0Var.q() + " chars)");
                                    b2 b2Var2 = m0Var.G;
                                    if (b2Var2 != null) {
                                        b2Var2.c();
                                    }
                                    m0Var.G = null;
                                    org.telegram.messenger.g0.r(m0Var.f1379r0);
                                    m0Var.F.a();
                                    m0Var.f1380s.setStopIsland(false);
                                    chatActivityEnterView2.A1(null, true);
                                    m0Var.v(false);
                                    m0Var.P = 0.0f;
                                    m0Var.f1385w.setIsland(false);
                                    m0Var.f1385w.setSettings(false);
                                    m0Var.f1385w.setStopMode(false);
                                    m0Var.w();
                                    m0Var.u(false);
                                    m0Var.f1378r = 0;
                                    m0Var.f1359b0 = 0.0f;
                                    ValueAnimator valueAnimator = m0Var.f1361c0;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    aeVar2.e(0.0f);
                                    m0Var.f1380s.e();
                                    aeVar2.b();
                                    chatActivityEnterView2.j1();
                                }
                            } else if (i10 == 3) {
                                aeVar2.f32967b.j1();
                            }
                        }
                    }
                } else {
                    if (actionMasked == 3) {
                        this.Q = -1;
                        invalidate();
                    }
                    if (this.Q >= 0) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        if (i7 == 0 && getVisibility() == 0) {
            h();
        }
    }

    public void setBorderColorSource(n0 n0Var) {
        this.V0 = n0Var;
    }

    public void setBubbleProvider(o0 o0Var) {
        this.f1439d1 = o0Var;
    }

    public void setCancelShown(boolean z10) {
        this.E = z10;
        if (!z10) {
            this.R = false;
        }
        invalidate();
    }

    public void setDayIconBase(int i7) {
        this.f1449h1 = (-16777216) | i7;
        this.f1451i1 = i7;
    }

    public void setHandOff(boolean z10) {
        this.l1 = z10;
        invalidate();
    }

    public void setLevel(float f10) {
        this.N = f10;
    }

    public void setRightMode(int i7) {
        if (this.L == i7) {
            return;
        }
        this.L = i7;
        invalidate();
    }

    public void setSendIconColor(int i7) {
        this.f1458n.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
    }

    public void setShown(boolean z10) {
        float f10;
        if (this.f1474y == z10 && this.E == z10) {
            return;
        }
        this.f1474y = z10;
        this.E = z10;
        if (z10) {
            setVisibility(0);
            h();
            this.G.e(true, 0.0f);
            this.L0 = false;
            this.l1 = false;
            this.M0.e(true, 0.0f);
            this.G0 = 0L;
            if (this.A0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.F.e(true, f10);
            this.L = 0;
            this.H.e(true, 1.0f);
            this.I.e(true, 0.0f);
            this.J.e(true, 0.0f);
        }
        invalidate();
    }

    public void setStopGlass(fh.g gVar) {
        this.W0 = gVar;
        if (gVar != null) {
            gVar.r(0.0f);
            gVar.W = 0.0f;
        }
    }

    public void setStopIsland(boolean z10) {
        if (this.f1456l0 == z10) {
            return;
        }
        this.f1456l0 = z10;
        u5 u5Var = this.f1446g0;
        if (z10) {
            u5Var.e(true, 0.0f);
            this.f1448h0.e(true, 0.0f);
        } else {
            float f10 = u5Var.f39903c;
            this.f1450i0 = f10;
            u5Var.e(true, f10);
        }
        invalidate();
    }
}
