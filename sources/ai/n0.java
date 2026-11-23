package ai;

import a8.sa;
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
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.fe;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.rf;
public final class n0 extends View {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public boolean E;
    public int E0;
    public final d6 F;
    public long F0;
    public final d6 G;
    public long G0;
    public final d6 H;
    public long H0;
    public final d6 I;
    public long I0;
    public final d6 J;
    public Drawable J0;
    public final d6 K;
    public final int[] K0;
    public int L;
    public boolean L0;
    public float M;
    public final d6 M0;
    public float N;
    public final d6 N0;
    public float O;
    public final d6 O0;
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
    public l0 V0;
    public oh0 W;
    public fh.g W0;
    public final Path X0;
    public Paint Y0;
    public float Z0;
    public final k0 f1380a;
    public int f1381a0;
    public float f1382a1;
    public fe f1383b;
    public final Paint f1384b0;
    public long f1385b1;
    public oe f1386c;
    public final Paint f1387c0;
    public long f1388c1;
    public final Paint d;
    public final Paint f1389d0;
    public m0 f1390d1;
    public final Paint f1391e;
    public final Paint f1392e0;
    public int f1393e1;
    public final Paint f1394f;
    public final Paint f1395f0;
    public int f1396f1;
    public final d6 f1397g0;
    public int f1398g1;
    public final Paint h;
    public final d6 f1399h0;
    public int f1400h1;
    public float f1401i0;
    public int f1402i1;
    public float f1403j0;
    public boolean f1404j1;
    public float f1405k0;
    public final sa f1406k1;
    public boolean f1407l0;
    public boolean l1;
    public final RectF m0;
    public float f1408m1;
    public final Drawable f1409n;
    public final RectF f1410n0;
    public float n1;
    public final int[] f1411o0;
    public boolean f1412p0;
    public int f1413q0;
    public final RectF f1414r;
    public int f1415r0;
    public final RectF f1416s;
    public LinearGradient f1417s0;
    public RadialGradient f1418t0;
    public LinearGradient f1419u0;
    public final Paint f1420v0;
    public final RectF f1421w;
    public final Paint f1422w0;
    public final float[] f1423x;
    public final Matrix f1424x0;
    public boolean f1425y;
    public boolean f1426y0;
    public final float[] f1427z0;

    public n0(Context context, k0 k0Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f1391e = new Paint(1);
        this.f1394f = new Paint(1);
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f1414r = new RectF();
        this.f1416s = new RectF();
        this.f1421w = new RectF();
        this.f1423x = new float[2];
        nr nrVar = nr.f37918g;
        this.F = new d6(this, 0L, 220L, nrVar);
        nr nrVar2 = nr.h;
        this.G = new d6(this, 0L, 320L, nrVar2);
        nr nrVar3 = nr.f37920j;
        this.H = new d6(this, 0L, 200L, nrVar3);
        this.I = new d6(this, 0L, 300L, nrVar2);
        this.J = new d6(this, 0L, 200L, nrVar3);
        this.K = new d6(this, 0L, 160L, nrVar2);
        this.L = 0;
        this.P = new float[3];
        this.Q = -1;
        this.U = new Paint(1);
        this.V = new Path();
        this.f1384b0 = new Paint(1);
        this.f1387c0 = new Paint(1);
        this.f1389d0 = new Paint(1);
        this.f1392e0 = new Paint(1);
        this.f1395f0 = new Paint(1);
        this.f1397g0 = new d6(this, 0L, 320L, new nr(0.25d, 0.1d, 0.25d, 1.0d));
        this.f1399h0 = new d6(this, 0L, 150L, nrVar);
        this.m0 = new RectF();
        this.f1410n0 = new RectF();
        this.f1411o0 = new int[2];
        this.f1420v0 = new Paint(1);
        this.f1422w0 = new Paint(1);
        this.f1424x0 = new Matrix();
        this.f1427z0 = new float[5];
        this.K0 = new int[2];
        this.M0 = new d6(this, 0L, 220L, nrVar);
        this.N0 = new d6(this, 0L, 420L, nrVar3);
        this.O0 = new d6(this, 0L, 260L, nrVar);
        this.P0 = new Paint(1);
        this.Q0 = new RectF();
        this.S0 = new Matrix();
        this.T0 = new SparseArray();
        this.U0 = new Paint(1);
        this.X0 = new Path();
        this.f1393e1 = -15820126;
        this.f1396f1 = -14910766;
        this.f1398g1 = -14910766;
        this.f1400h1 = -7696492;
        this.f1402i1 = -1726275033;
        this.f1406k1 = new sa(this, 2);
        this.f1380a = k0Var;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        paint2.setColor(-1);
        Drawable g10 = i5.c.g(context, 2131232696);
        this.f1409n = g10;
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
        if (this.f1412p0) {
            return g(i7);
        }
        float max = Math.max(0.0f, Math.min(1.0f, this.f1382a1)) * q0.c(11);
        if (max <= 0.004f) {
            return this.f1402i1;
        }
        return i0.a.f(max, this.f1402i1, i0.a.f(0.5f, i7, this.f1398g1) | (-16777216));
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
        RectF rectF = this.f1421w;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
        canvas.drawArc(rectF, f15, 140.0f, false, paint);
        paint.setShader(null);
    }

    public final void d(android.graphics.Canvas r28) {
        throw new UnsupportedOperationException("Method not decompiled: ai.n0.d(android.graphics.Canvas):void");
    }

    public final void e() {
        this.f1425y = false;
        this.E = false;
        this.F.e(true, 0.0f);
        this.G.e(true, 0.0f);
        setVisibility(8);
    }

    public final int f(float f10, float f11) {
        if (this.f1407l0) {
            RectF rectF = this.m0;
            if (!rectF.isEmpty() && this.f1397g0.f34349c > 0.7f && rectF.contains(f10, f11)) {
                return 1;
            }
        }
        if (this.F.f34349c >= 0.6f && this.f1425y) {
            RectF rectF2 = this.f1414r;
            if (!rectF2.isEmpty() && this.E && rectF2.contains(f10, f11)) {
                return 0;
            }
            if (this.f1416s.contains(f10, f11)) {
                return 2;
            }
        }
        return -1;
    }

    public final int g(int i7) {
        if (this.f1412p0) {
            return i0.a.f(0.4f, i7, -1);
        }
        return i0.a.f(q0.c(11), this.f1400h1, i0.a.f(0.5f, i7, this.f1398g1));
    }

    public int getRightMode() {
        return this.L;
    }

    public final void h() {
        if (!this.f1404j1 && isAttachedToWindow()) {
            this.f1404j1 = true;
            postOnAnimation(this.f1406k1);
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
        removeCallbacks(this.f1406k1);
        this.f1404j1 = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r72) {
        throw new UnsupportedOperationException("Method not decompiled: ai.n0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1425y) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.Q = f(motionEvent.getX(), motionEvent.getY());
                invalidate();
                if (this.Q < 0) {
                    return false;
                }
            } else if (actionMasked == 1) {
                int f10 = f(motionEvent.getX(), motionEvent.getY());
                int i7 = this.Q;
                this.Q = -1;
                invalidate();
                if (i7 >= 0 && i7 == f10) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    k0 k0Var = this.f1380a;
                    if (i7 == 0) {
                        k0Var.s();
                    } else if (i7 == 1) {
                        k0Var.t();
                    } else {
                        rf rfVar = k0Var.f1322f;
                        int i10 = k0Var.f1335r;
                        if (i10 == 1) {
                            Editable text = rfVar.f39132a.F0.getText();
                            if (k0Var.f1337s.getRightMode() == 2 || (text != null && ((k0Var.w() > 0 || k0Var.N > 0) && text.toString().trim().length() > 0))) {
                                k0Var.B();
                            }
                        } else if (i10 == 3) {
                            rfVar.f39132a.v1();
                        }
                    }
                }
            } else {
                if (actionMasked == 3) {
                    this.Q = -1;
                    invalidate();
                }
                if (this.Q < 0) {
                    return false;
                }
            }
            return true;
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

    public void setBorderColorSource(l0 l0Var) {
        this.V0 = l0Var;
    }

    public void setBubbleProvider(m0 m0Var) {
        this.f1390d1 = m0Var;
    }

    public void setCancelShown(boolean z10) {
        this.E = z10;
        if (!z10) {
            this.R = false;
        }
        invalidate();
    }

    public void setDayIconBase(int i7) {
        this.f1400h1 = (-16777216) | i7;
        this.f1402i1 = i7;
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
        this.f1409n.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
    }

    public void setShown(boolean z10) {
        float f10;
        if (this.f1425y == z10 && this.E == z10) {
            return;
        }
        this.f1425y = z10;
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
        if (this.f1407l0 == z10) {
            return;
        }
        this.f1407l0 = z10;
        d6 d6Var = this.f1397g0;
        if (z10) {
            d6Var.e(true, 0.0f);
            this.f1399h0.e(true, 0.0f);
        } else {
            float f10 = d6Var.f34349c;
            this.f1401i0 = f10;
            d6Var.e(true, f10);
        }
        invalidate();
    }
}
