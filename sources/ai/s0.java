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
import org.telegram.ui.Components.sf;
public final class s0 extends View {
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
    public q0 V0;
    public oh0 W;
    public fh.g W0;
    public final Path X0;
    public Paint Y0;
    public float Z0;
    public final p0 f1460a;
    public int f1461a0;
    public float f1462a1;
    public fe f1463b;
    public final Paint f1464b0;
    public long f1465b1;
    public oe f1466c;
    public final Paint f1467c0;
    public long f1468c1;
    public final Paint d;
    public final Paint f1469d0;
    public r0 f1470d1;
    public final Paint f1471e;
    public final Paint f1472e0;
    public int f1473e1;
    public final Paint f1474f;
    public final Paint f1475f0;
    public int f1476f1;
    public final d6 f1477g0;
    public int f1478g1;
    public final Paint h;
    public final d6 f1479h0;
    public int f1480h1;
    public float f1481i0;
    public int f1482i1;
    public float f1483j0;
    public boolean f1484j1;
    public float f1485k0;
    public final sa f1486k1;
    public boolean f1487l0;
    public boolean l1;
    public final RectF m0;
    public float f1488m1;
    public final Drawable f1489n;
    public final RectF f1490n0;
    public float n1;
    public final int[] f1491o0;
    public boolean f1492p0;
    public int f1493q0;
    public final RectF f1494r;
    public int f1495r0;
    public final RectF f1496s;
    public LinearGradient f1497s0;
    public RadialGradient f1498t0;
    public LinearGradient f1499u0;
    public final Paint f1500v0;
    public final RectF f1501w;
    public final Paint f1502w0;
    public final float[] f1503x;
    public final Matrix f1504x0;
    public boolean f1505y;
    public boolean f1506y0;
    public final float[] f1507z0;

    public s0(Context context, p0 p0Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f1471e = new Paint(1);
        this.f1474f = new Paint(1);
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f1494r = new RectF();
        this.f1496s = new RectF();
        this.f1501w = new RectF();
        this.f1503x = new float[2];
        nr nrVar = nr.f37961g;
        this.F = new d6(this, 0L, 220L, nrVar);
        nr nrVar2 = nr.h;
        this.G = new d6(this, 0L, 320L, nrVar2);
        nr nrVar3 = nr.f37963j;
        this.H = new d6(this, 0L, 200L, nrVar3);
        this.I = new d6(this, 0L, 300L, nrVar2);
        this.J = new d6(this, 0L, 200L, nrVar3);
        this.K = new d6(this, 0L, 160L, nrVar2);
        this.L = 0;
        this.P = new float[3];
        this.Q = -1;
        this.U = new Paint(1);
        this.V = new Path();
        this.f1464b0 = new Paint(1);
        this.f1467c0 = new Paint(1);
        this.f1469d0 = new Paint(1);
        this.f1472e0 = new Paint(1);
        this.f1475f0 = new Paint(1);
        this.f1477g0 = new d6(this, 0L, 320L, new nr(0.25d, 0.1d, 0.25d, 1.0d));
        this.f1479h0 = new d6(this, 0L, 150L, nrVar);
        this.m0 = new RectF();
        this.f1490n0 = new RectF();
        this.f1491o0 = new int[2];
        this.f1500v0 = new Paint(1);
        this.f1502w0 = new Paint(1);
        this.f1504x0 = new Matrix();
        this.f1507z0 = new float[5];
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
        this.f1473e1 = -15820126;
        this.f1476f1 = -14910766;
        this.f1478g1 = -14910766;
        this.f1480h1 = -7696492;
        this.f1482i1 = -1726275033;
        this.f1486k1 = new sa(this, 2);
        this.f1460a = p0Var;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        paint2.setColor(-1);
        Drawable g10 = i5.c.g(context, 2131232696);
        this.f1489n = g10;
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
        if (this.f1492p0) {
            return g(i7);
        }
        float max = Math.max(0.0f, Math.min(1.0f, this.f1462a1)) * v0.c(11);
        if (max <= 0.004f) {
            return this.f1482i1;
        }
        return i0.a.f(max, this.f1482i1, i0.a.f(0.5f, i7, this.f1478g1) | (-16777216));
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
        RectF rectF = this.f1501w;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
        canvas.drawArc(rectF, f15, 140.0f, false, paint);
        paint.setShader(null);
    }

    public final void d(android.graphics.Canvas r28) {
        throw new UnsupportedOperationException("Method not decompiled: ai.s0.d(android.graphics.Canvas):void");
    }

    public final void e() {
        this.f1505y = false;
        this.E = false;
        this.F.e(true, 0.0f);
        this.G.e(true, 0.0f);
        setVisibility(8);
    }

    public final int f(float f10, float f11) {
        if (this.f1487l0) {
            RectF rectF = this.m0;
            if (!rectF.isEmpty() && this.f1477g0.f34386c > 0.7f && rectF.contains(f10, f11)) {
                return 1;
            }
        }
        if (this.F.f34386c >= 0.6f && this.f1505y) {
            RectF rectF2 = this.f1494r;
            if (!rectF2.isEmpty() && this.E && rectF2.contains(f10, f11)) {
                return 0;
            }
            if (this.f1496s.contains(f10, f11)) {
                return 2;
            }
        }
        return -1;
    }

    public final int g(int i7) {
        if (this.f1492p0) {
            return i0.a.f(0.4f, i7, -1);
        }
        return i0.a.f(v0.c(11), this.f1480h1, i0.a.f(0.5f, i7, this.f1478g1));
    }

    public int getRightMode() {
        return this.L;
    }

    public final void h() {
        if (!this.f1484j1 && isAttachedToWindow()) {
            this.f1484j1 = true;
            postOnAnimation(this.f1486k1);
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
        removeCallbacks(this.f1486k1);
        this.f1484j1 = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r72) {
        throw new UnsupportedOperationException("Method not decompiled: ai.s0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1505y) {
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
                    p0 p0Var = this.f1460a;
                    if (i7 == 0) {
                        p0Var.s();
                    } else if (i7 == 1) {
                        p0Var.t();
                    } else {
                        sf sfVar = p0Var.f1392f;
                        int i10 = p0Var.f1405r;
                        if (i10 == 1) {
                            Editable text = sfVar.f39572a.F0.getText();
                            if (p0Var.f1407s.getRightMode() == 2 || (text != null && ((p0Var.w() > 0 || p0Var.N > 0) && text.toString().trim().length() > 0))) {
                                p0Var.B();
                            }
                        } else if (i10 == 3) {
                            sfVar.f39572a.v1();
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

    public void setBorderColorSource(q0 q0Var) {
        this.V0 = q0Var;
    }

    public void setBubbleProvider(r0 r0Var) {
        this.f1470d1 = r0Var;
    }

    public void setCancelShown(boolean z10) {
        this.E = z10;
        if (!z10) {
            this.R = false;
        }
        invalidate();
    }

    public void setDayIconBase(int i7) {
        this.f1480h1 = (-16777216) | i7;
        this.f1482i1 = i7;
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
        this.f1489n.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
    }

    public void setShown(boolean z10) {
        float f10;
        if (this.f1505y == z10 && this.E == z10) {
            return;
        }
        this.f1505y = z10;
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
        if (this.f1487l0 == z10) {
            return;
        }
        this.f1487l0 = z10;
        d6 d6Var = this.f1477g0;
        if (z10) {
            d6Var.e(true, 0.0f);
            this.f1479h0.e(true, 0.0f);
        } else {
            float f10 = d6Var.f34386c;
            this.f1481i0 = f10;
            d6Var.e(true, f10);
        }
        invalidate();
    }
}
