package defpackage;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class npc extends FrameLayout {
    public int E;
    public float F;
    public float G;
    public float H;
    public float I;
    public ValueAnimator J;
    public zna K;
    public float L;
    public float M;
    public float N;
    public float O;
    public zna P;
    public float Q;
    public float R;
    public long S;
    public boolean T;
    public float U;
    public float V;
    public long W;
    public final int a;
    public boolean a0;
    public final short b;
    public final ipc b0;
    public View c;
    public float c0;
    public mpc d;
    public Runnable d0;
    public lpc e;
    public float e0;
    public vs4 f;
    public double f0;
    public long g0;
    public s09 h;
    public float h0;
    public float i0;
    public float j0;
    public final ipc k0;
    public int l0;
    public final jpc m0;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    public npc(int r4, android.content.Context r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npc.<init>(int, android.content.Context, boolean):void");
    }

    private void setIdleAnimationEnabled(boolean z) {
        mpc mpcVar = this.d;
        if (mpcVar != null) {
            mpcVar.setIdleAnimationEnabled(z);
        }
        lpc lpcVar = this.e;
        if (lpcVar != null) {
            lpcVar.setIdleAnimationEnabled(z);
        }
    }

    private void setRenderScale(float f) {
        mpc mpcVar = this.d;
        if (mpcVar != null) {
            mpcVar.setRenderScale(f);
        }
        if (this.e != null) {
            this.f.h = f / 3.5f;
        }
    }

    private void setRendererPaused(boolean z) {
        mpc mpcVar = this.d;
        if (mpcVar != null) {
            mpcVar.setPaused(z);
        }
        lpc lpcVar = this.e;
        if (lpcVar != null) {
            lpcVar.setPaused(z);
        }
    }

    public final void a(float f) {
        if (f > 1.0f && this.f != null) {
            setRenderScale(3.5f);
        }
        if (this.K == null) {
            zna znaVar = new zna(new xk4(this.c.getScaleX()));
            this.K = znaVar;
            aoa aoaVar = new aoa(f);
            aoaVar.a(0.55f);
            aoaVar.b(280.0f);
            znaVar.m = aoaVar;
            this.K.f(0.001f);
            this.K.b(new hpc(this, (byte) 0));
            this.K.a(new hx0(this, (byte) 12));
        }
        this.K.c(f);
    }

    public final void b() {
        vs4 vs4Var = this.f;
        if (vs4Var == null) {
            return;
        }
        float f = this.H;
        float f2 = this.h0;
        float f3 = this.j0;
        vs4Var.d = td4.A(1.0f, f3, f2, f);
        vs4Var.i = td4.A(1.0f, f3, this.i0, this.I);
    }

    public final void c(npc npcVar) {
        vs4 vs4Var;
        if (npcVar != null && (vs4Var = npcVar.f) != null && this.f != null) {
            this.H = vs4Var.d;
            this.I = vs4Var.i;
            b();
        }
    }

    public final void d() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        s09 s09Var = this.h;
        short s = this.b;
        s09Var.f(2131624351, s, s, null);
        this.h.getAnimatedDrawable().F(0);
        this.c = this.h;
        setOnClickListener(new kpc(this, (byte) 0));
        setClickable(!this.y);
    }

    public final void e(boolean z) {
        ValueAnimator valueAnimator;
        if (this.E != -1) {
            this.E = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            vs4 vs4Var = this.f;
            if (vs4Var != null) {
                if (z) {
                    this.h0 = (float) Math.IEEEremainder(vs4Var.d - this.H, 360.0d);
                    this.i0 = (float) Math.IEEEremainder(this.f.i - this.I, 360.0d);
                    this.j0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.J = ofFloat;
                    ofFloat.setDuration(350L);
                    this.J.setInterpolator(d53.h);
                    this.J.addUpdateListener(new oxb(this, (byte) 14));
                    this.J.addListener(new koc(this, (byte) 1));
                    this.J.start();
                } else {
                    this.j0 = 1.0f;
                    this.i0 = 0.0f;
                    this.h0 = 0.0f;
                    b();
                }
            }
        }
        if (!z && (valueAnimator = this.J) != null) {
            valueAnimator.removeAllListeners();
            this.J.cancel();
            this.J = null;
            this.j0 = 1.0f;
            this.i0 = 0.0f;
            this.h0 = 0.0f;
            b();
        }
        if (this.c != null) {
            if (z) {
                a(1.0f);
                return;
            }
            zna znaVar = this.K;
            if (znaVar != null) {
                znaVar.d();
                this.K = null;
            }
            this.c.setScaleX(1.0f);
            this.c.setScaleY(1.0f);
            if (this.f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void f(boolean z, float f) {
        if (!z && f <= 1.001f && this.f != null) {
            setRenderScale(1.0f);
        }
    }

    public final void g() {
        this.y = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.m0);
        setClickable(false);
        if (this.f != null) {
            mpc mpcVar = this.d;
            if (mpcVar != null) {
                mpcVar.K = 3.5f;
                mpcVar.a.h = mpcVar.J / 3.5f;
                mpcVar.f();
            }
            setIdleAnimationEnabled(false);
            vs4 vs4Var = this.f;
            this.H = vs4Var.d;
            this.I = vs4Var.i;
            if (this.r) {
                Choreographer choreographer = Choreographer.getInstance();
                ipc ipcVar = this.k0;
                choreographer.removeFrameCallback(ipcVar);
                this.g0 = 0L;
                Choreographer.getInstance().postFrameCallback(ipcVar);
            }
        }
    }

    public float getConversionWobble() {
        return this.L;
    }

    public float getFlightPitch() {
        vs4 vs4Var = this.f;
        if (vs4Var == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(vs4Var.i + vs4Var.j);
    }

    public float getFlightYaw() {
        vs4 vs4Var = this.f;
        if (vs4Var == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(vs4Var.d + vs4Var.f);
    }

    public final void h() {
        if (this.f != null) {
            e(false);
            this.l0++;
            removeCallbacks(this.m0);
            Choreographer.getInstance().removeFrameCallback(this.k0);
            this.g0 = 0L;
            this.e0 = 0.0f;
            m(null);
            setIdleAnimationEnabled(false);
            setRendererPaused(true);
            mpc mpcVar = this.d;
            if (mpcVar != null) {
                mpcVar.setPaused(true);
                mpcVar.onPause();
            }
            lpc lpcVar = this.e;
            if (lpcVar != null) {
                lpcVar.o();
            }
            removeView(this.c);
            this.d = null;
            this.e = null;
            this.f = null;
            d();
            View view = this.c;
            int i = this.a;
            addView(view, new FrameLayout.LayoutParams(i, i, 17));
            this.r = false;
            if (this.c0 != 0.0f) {
                this.h.getAnimatedDrawable().F(1);
            }
            j();
            Runnable runnable = this.d0;
            this.d0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i() {
        if (this.f != null && this.r && !this.y) {
            setIdleAnimationEnabled(true);
        }
    }

    public final void j() {
        boolean z;
        if (!this.s && this.n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z = true;
        } else {
            z = false;
        }
        if (this.r != z) {
            this.r = z;
            if (!z) {
                e(false);
            }
            int i = this.l0 + 1;
            this.l0 = i;
            if (this.f != null) {
                removeCallbacks(this.m0);
                setIdleAnimationEnabled(false);
                if (this.y) {
                    ipc ipcVar = this.k0;
                    if (z) {
                        Choreographer.getInstance().removeFrameCallback(ipcVar);
                        this.g0 = 0L;
                        Choreographer.getInstance().postFrameCallback(ipcVar);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(ipcVar);
                        this.g0 = 0L;
                        this.e0 = 0.0f;
                    }
                } else if (z) {
                    vs4 vs4Var = this.f;
                    vs4Var.d = 0.0f;
                    vs4Var.i = 0.0f;
                    m(new ge7(this, i, (byte) 28));
                }
                setRendererPaused(!z);
                return;
            }
            s09 s09Var = this.h;
            if (s09Var != null) {
                if (z) {
                    if (!this.w || this.x) {
                        s09Var.d();
                    }
                    this.w = true;
                    return;
                }
                this.x = s09Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        vs4 vs4Var = this.f;
        if (vs4Var != null) {
            vs4Var.f = this.U + this.M;
            return;
        }
        s09 s09Var = this.h;
        if (s09Var != null) {
            s09Var.setRotationY(this.U + this.M);
        }
    }

    public final void l(Runnable runnable) {
        this.d0 = runnable;
        if (this.f != null) {
            m(new jpc(this, (byte) 1));
        } else if (runnable != null) {
            post(new jpc(this, (byte) 1));
        }
    }

    public final void m(Runnable runnable) {
        mpc mpcVar = this.d;
        if (mpcVar != null) {
            mpcVar.w = runnable;
            if (mpcVar.s && runnable != null) {
                mpcVar.w = null;
                runnable.run();
            }
        }
        lpc lpcVar = this.e;
        if (lpcVar != null) {
            lpcVar.b0 = runnable;
            if (lpcVar.a0 && runnable != null) {
                lpcVar.b0 = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.n = false;
        Choreographer.getInstance().removeFrameCallback(this.b0);
        zna znaVar = this.P;
        if (znaVar != null) {
            znaVar.d();
            this.P = null;
            setTranslationX(0.0f);
        }
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = 0L;
        this.a0 = false;
        this.T = false;
        this.W = 0L;
        this.V = 0.0f;
        this.U = 0.0f;
        k();
        j();
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((isEnabled() && this.y && this.f != null && this.r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft();
        int i3 = this.a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i3, i);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i3, i2);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.y && this.f != null && this.r) {
            int actionMasked = motionEvent.getActionMasked();
            int i = 0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.E == -1) {
                                    return false;
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.E) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i = 1;
                                }
                                this.E = motionEvent.getPointerId(i);
                                this.F = motionEvent.getX(i);
                                this.G = motionEvent.getY(i);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.E);
                        if (findPointerIndex < 0) {
                            e(true);
                            return true;
                        }
                        float f = 0.8f / gm.p;
                        vs4 vs4Var = this.f;
                        vs4Var.d = td4.A(motionEvent.getX(findPointerIndex), this.F, f, vs4Var.d);
                        vs4 vs4Var2 = this.f;
                        vs4Var2.i = td4.A(motionEvent.getY(findPointerIndex), this.G, f, vs4Var2.i);
                        this.F = motionEvent.getX(findPointerIndex);
                        this.G = motionEvent.getY(findPointerIndex);
                        return true;
                    }
                }
                e(true);
                return true;
            }
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.J.cancel();
                this.J = null;
            }
            this.e0 = 0.0f;
            this.E = motionEvent.getPointerId(0);
            this.F = motionEvent.getX();
            this.G = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            a(3.0f);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        j();
    }

    @Override
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        j();
    }

    @Override
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        j();
    }

    public void setContinuousRotation(float f) {
        this.c0 = f;
        g();
        setEnabled(false);
        s09 s09Var = this.h;
        if (s09Var != null) {
            s09Var.getAnimatedDrawable().F(1);
        }
    }

    public void setConversionWobble(float f) {
        this.L = f;
        vs4 vs4Var = this.f;
        if (vs4Var != null) {
            vs4Var.g = f + this.N;
            return;
        }
        s09 s09Var = this.h;
        if (s09Var != null) {
            s09Var.setRotation(f + this.N);
        }
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            e(false);
        }
    }

    public void setHeaderTilt(float f) {
        vs4 vs4Var = this.f;
        if (vs4Var != null) {
            vs4Var.j = f;
        }
    }

    public void setIntroProgress(float f) {
        float f2 = 1.0f;
        float f3 = 1.0f - f;
        float f4 = (2.0f * f3) + 1.0f;
        this.c.setScaleX(f4);
        this.c.setScaleY(f4);
        if (this.f != null) {
            if (f4 > 1.0f) {
                f2 = 3.5f;
            }
            setRenderScale(f2);
        }
        this.M = f3 * (-720.0f);
        this.N = ((float) Math.sin(f * 3.141592653589793d)) * 35.0f;
        k();
        vs4 vs4Var = this.f;
        if (vs4Var != null) {
            vs4Var.g = this.L + this.N;
            return;
        }
        s09 s09Var = this.h;
        if (s09Var != null) {
            s09Var.setRotation(this.L + this.N);
        }
    }

    public void setPaused(boolean z) {
        this.s = z;
        j();
    }

    public void setStarParticlesView(dta dtaVar) {
        mpc mpcVar = this.d;
        if (mpcVar != null) {
            mpcVar.setStarParticlesView(dtaVar);
        }
        lpc lpcVar = this.e;
        if (lpcVar != null) {
            lpcVar.setStarParticlesView(dtaVar);
        }
    }
}
