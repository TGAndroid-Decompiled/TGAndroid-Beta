package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public abstract class el9 extends FrameLayout {
    public static long R;
    public static final int S = 0;
    public float E;
    public kj3 F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public VelocityTracker M;
    public boolean N;
    public float O;
    public float P;
    public Paint Q;
    public kj3 a;
    public View b;
    public bdb c;
    public a d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public po n;
    public boolean r;
    public int s;
    public boolean w;
    public tk5 x;
    public zna y;

    public static void f(kj3 kj3Var, kj3 kj3Var2, float f) {
        int measuredWidth;
        if (kj3Var == null) {
            if (kj3Var2 != null) {
                measuredWidth = kj3Var2.getFragmentView().getMeasuredWidth();
            } else {
                return;
            }
        } else {
            measuredWidth = kj3Var.getFragmentView().getMeasuredWidth();
        }
        if (kj3Var != null) {
            if (kj3Var.getFragmentView() != null) {
                kj3Var.getFragmentView().setAlpha(1.0f - f);
                kj3Var.getFragmentView().setTranslationX(measuredWidth * 0.6f * f);
            }
            kj3Var.setPreviewOpenedProgress(1.0f - f);
        }
        if (kj3Var2 != null) {
            if (kj3Var2.getFragmentView() != null) {
                kj3Var2.getFragmentView().setAlpha(1.0f);
                kj3Var2.getFragmentView().setTranslationX((1.0f - f) * measuredWidth);
            }
            kj3Var2.setPreviewReplaceProgress(f);
        }
    }

    public static int getRightPaddingSize() {
        if (gda.l1) {
            return 74;
        }
        return 76;
    }

    public final void a() {
        if (!this.f) {
            return;
        }
        e(false);
        b();
    }

    public final void b() {
        this.f = false;
        if (!gda.c()) {
            this.e = 0.0f;
            g();
            kj3 kj3Var = this.a;
            if (kj3Var != null) {
                kj3Var.onPause();
                this.a.onFragmentDestroy();
                removeAllViews();
                this.a = null;
                nm7.e().k(nm7.v4, new Object[0]);
            }
            d(false);
            return;
        }
        this.n.d();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e, 0.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new bl9(this, (byte) 0));
        this.h.addListener(new dl9(this, (byte) 0));
        this.h.setDuration(250L);
        this.h.setInterpolator(d53.f);
        this.h.start();
    }

    public final boolean c() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public abstract void d(boolean z);

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        if (this.w) {
            f(this.F, this.a, this.E);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f3 = this.e;
        a aVar = this.d;
        if (aVar != null && aVar.getActionMode() != null) {
            f = this.d.getActionMode().getAlpha();
        } else {
            f = 0.0f;
        }
        a aVar2 = this.d;
        if (aVar2 == null) {
            f2 = 0.0f;
        } else {
            f2 = aVar2.p0;
        }
        float max = Math.max(f, f2) * f3;
        if (this.a != null && this.d != null && max > 0.0f) {
            Paint paint = this.Q;
            if (paint == null) {
                paint = new Paint();
                this.Q = paint;
            }
            paint.setColor(cmb.w0(null, cmb.v8, false));
            if (max == 1.0f) {
                canvas.save();
            } else {
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.P, (int) (max * 255.0f), 31);
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.P, this.Q);
            canvas.translate(this.d.getX(), this.d.getY());
            canvas.save();
            canvas.translate(this.d.getBackButton().getX(), this.d.getBackButton().getY());
            this.d.getBackButton().draw(canvas);
            canvas.restore();
            if (this.d.getActionMode() != null) {
                int i = (max > (this.d.getActionMode().getAlpha() * this.e) ? 1 : (max == (this.d.getActionMode().getAlpha() * this.e) ? 0 : -1));
                a aVar3 = this.d;
                if (i != 0) {
                    aVar3.draw(canvas);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.P, (int) (this.d.getActionMode().getAlpha() * 255.0f), 31);
                    this.d.getActionMode().draw(canvas);
                    canvas.restore();
                } else {
                    aVar3.getActionMode().draw(canvas);
                }
            } else {
                this.d.draw(canvas);
            }
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar = this.d;
        if (view == aVar && aVar.getActionMode() != null && this.d.getActionMode().getAlpha() == 1.0f) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public abstract void e(boolean z);

    public final void g() {
        if (!this.w && c()) {
            setOpenProgress(this.e);
            View view = this.b;
            if (view != null) {
                view.setTranslationX((1.0f - this.e) * (getMeasuredWidth() - gm.L(getRightPaddingSize())));
            }
            a aVar = this.d;
            if (aVar != null) {
                aVar.setTranslationX((1.0f - this.e) * gm.L(48.0f));
            }
            kj3 kj3Var = this.a;
            if (kj3Var != null) {
                kj3Var.setPreviewOpenedProgress(this.e);
            }
            invalidate();
        }
    }

    public long getCurrentFragmetDialogId() {
        return R;
    }

    public d getFragment() {
        return this.a;
    }

    public View getFragmentView() {
        return this.b;
    }

    public abstract boolean getOccupyStatusbar();

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        if (getOccupyStatusbar()) {
            i3 = gm.m;
        } else {
            i3 = 0;
        }
        View view = this.b;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = gm.L(getRightPaddingSize());
            layoutParams.topMargin = a.getCurrentActionBarHeight() + i3 + this.s;
        }
        a aVar = this.d;
        if (aVar != null) {
            ((FrameLayout.LayoutParams) aVar.getLayoutParams()).topMargin = i3;
        }
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (this.G != measuredWidth) {
            this.G = measuredWidth;
            g();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tk5 tk5Var = this.x;
        if ((tk5Var != null && ((ActionBarLayout) tk5Var).w()) || !c() || !this.N) {
            return false;
        }
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                this.H = motionEvent.getPointerId(0);
                this.I = true;
                this.K = (int) motionEvent.getX();
                this.L = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.M;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.H) {
                if (this.M == null) {
                    this.M = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.K));
                int abs = Math.abs(((int) motionEvent.getY()) - this.L);
                this.M.addMovement(motionEvent);
                if (this.I && !this.J && max >= gm.Z0(true, 0.4f) && Math.abs(max) / 3 > abs) {
                    if (ActionBarLayout.s(this, motionEvent.getX(), motionEvent.getY()) == null) {
                        this.I = false;
                        this.J = true;
                        this.K = (int) motionEvent.getX();
                        e(false);
                    } else {
                        this.I = false;
                    }
                } else if (this.J) {
                    float f = max;
                    this.O = f;
                    this.e = Utilities.i(1.0f - (f / getMeasuredWidth()), 1.0f, 0.0f);
                    g();
                }
            }
            return this.J;
        }
        if (motionEvent != null && motionEvent.getPointerId(0) == this.H && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
            VelocityTracker velocityTracker2 = this.M;
            if (velocityTracker2 == null) {
                velocityTracker2 = VelocityTracker.obtain();
                this.M = velocityTracker2;
            }
            velocityTracker2.computeCurrentVelocity(1000);
            if (this.J) {
                float f2 = this.O;
                float xVelocity = this.M.getXVelocity();
                float yVelocity = this.M.getYVelocity();
                if (f2 < getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e, 1.0f);
                    this.h = ofFloat;
                    ofFloat.addUpdateListener(new bl9(this, (byte) 1));
                    this.h.addListener(new dl9(this, (byte) 1));
                    this.h.setDuration(250L);
                    this.h.setInterpolator(d53.f);
                    this.h.start();
                } else {
                    b();
                }
            }
            this.I = false;
            this.J = false;
            VelocityTracker velocityTracker3 = this.M;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.M = null;
            }
        } else if (motionEvent == null) {
            this.I = false;
            this.J = false;
            VelocityTracker velocityTracker4 = this.M;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.M = null;
            }
        }
        return this.J;
    }

    @Override
    public final void removeView(View view) {
        super.removeView(view);
        if (view == this.b) {
            a();
        }
    }

    @Override
    public final void removeViewInLayout(View view) {
        super.removeViewInLayout(view);
        if (view == this.b) {
            a();
        }
    }

    public void setCurrentTop(int i) {
        this.P = i;
        View view = this.b;
        if (view != null) {
            view.setTranslationY((i - view.getTop()) + this.s);
        }
        bdb bdbVar = this.c;
        if (bdbVar != null) {
            bdbVar.setTranslationY(i - bdbVar.getTop());
        }
    }

    public void setFragmentViewPadding(int i) {
        this.s = i;
    }

    public void setTransitionPaddingBottom(int i) {
        kj3 kj3Var = this.a;
        if (wi8.A(kj3Var)) {
            float f = i;
            kj3Var.Y0 = f;
            kj3Var.h.setTranslationY(((-f) - kj3Var.h1) - kj3Var.g1);
        }
    }

    public void setOpenProgress(float f) {
    }
}
