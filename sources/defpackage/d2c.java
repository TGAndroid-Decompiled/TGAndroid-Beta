package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class d2c extends FrameLayout implements gk7 {
    public i49 E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public long L;
    public ValueAnimator M;
    public boolean N;
    public boolean O;
    public final TLRPC.StickerSetCovered P;
    public final wjb Q;
    public float R;
    public final Paint S;
    public final int a;
    public final a2c b;
    public final TLRPC.StickerSetCovered[] c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f;
    public final s1c h;
    public final t1c n;
    public final u1c r;
    public final c2c s;
    public final c1b w;
    public final FrameLayout x;
    public d y;

    public d2c(Context context, final a2c a2cVar, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, wjb wjbVar) {
        super(context);
        int i = y6c.t0;
        this.a = i;
        this.R = 1.0f;
        this.S = new Paint();
        this.b = a2cVar;
        this.c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.P = stickerSetCovered;
        this.Q = wjbVar;
        c2c c2cVar = new c2c(this, context);
        this.s = c2cVar;
        this.w = new c1b(context, new r1c(this, a2cVar), stickerSetCoveredArr, longSparseArray, longSparseArray2, wjbVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        zkb.h(bkb.g5, wjbVar, frameLayout);
        s1c s1cVar = new s1c(this, context, wjbVar);
        this.h = s1cVar;
        s1cVar.setHint(k96.M0(2131745513, null));
        frameLayout.addView(s1cVar, nme.e(-1, -1, 48));
        t1c t1cVar = new t1c(this, context, a2cVar);
        this.n = t1cVar;
        final f09 f09Var = new f09(this, (byte) 27);
        t1cVar.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                f09 f09Var2 = f09Var;
                return a2cVar.e(d2c.this.n, f09Var2, motionEvent);
            }
        });
        t1cVar.setOverScrollMode(2);
        t1cVar.setClipToPadding(false);
        t1cVar.setItemAnimator(null);
        t1cVar.setLayoutAnimation(null);
        u1c u1cVar = new u1c(this, gl.L(58.0f), t1cVar);
        this.r = u1cVar;
        t1cVar.setLayoutManager(u1cVar);
        u1cVar.O = new v1c(this);
        t1cVar.setOnScrollListener(new w1c(this));
        t1cVar.setAdapter(c2cVar);
        t1cVar.setOnItemClickListener(f09Var);
        addView(t1cVar, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        zkb.h(bkb.U5, wjbVar, view);
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gl.e1());
        layoutParams.topMargin = gl.L(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, nme.e(-1, 58, 51));
        d();
        kk7 f = kk7.f(i);
        f.b(this, kk7.w0);
        f.b(this, kk7.y0);
    }

    private void setShadowVisible(boolean z) {
        float f;
        if (this.H != z) {
            this.H = z;
            ViewPropertyAnimator animate = this.f.animate();
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ug8.s(animate, f, 200L);
        }
    }

    public final void a(boolean z) {
        this.N = z;
        if (z) {
            if (getContentTopOffset() > 0 && this.M == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.M = ofFloat;
                ofFloat.addUpdateListener(new z1c(this, contentTopOffset));
                this.M.addListener(new iab(this, (byte) 10));
                this.M.setDuration(250L);
                this.M.setInterpolator(gb.w);
                this.M.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.M;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.M.cancel();
            this.M = null;
        }
    }

    public final void b(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet) {
        x1c x1cVar;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            a2c a2cVar = this.b;
            a2cVar.getClass();
            if (a2cVar instanceof oz3) {
                x1cVar = new x1c(this);
            } else {
                x1cVar = null;
            }
            u0b u0bVar = new u0b(getContext(), this.y, inputStickerSet2, null, x1cVar, this.Q);
            u0bVar.d2 = false;
            u0bVar.W1 = new y1c(this, inputStickerSet2);
            this.y.showDialog(u0bVar);
        }
    }

    public final boolean c() {
        int i;
        boolean z;
        t1c t1cVar = this.n;
        int childCount = t1cVar.getChildCount();
        View view = this.f;
        FrameLayout frameLayout = this.x;
        if (childCount <= 0) {
            int paddingTop = t1cVar.getPaddingTop();
            this.F = paddingTop;
            t1cVar.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.F);
            view.setTranslationY(this.F);
            setShadowVisible(false);
            return true;
        }
        View childAt = t1cVar.getChildAt(0);
        for (int i2 = 1; i2 < t1cVar.getChildCount(); i2++) {
            View childAt2 = t1cVar.getChildAt(i2);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        y29 y29Var = (y29) t1cVar.G(childAt);
        int top = childAt.getTop() - gl.L(58.0f);
        if (top > 0 && y29Var != null && y29Var.b() == 0) {
            i = top;
        } else {
            i = 0;
        }
        if (top < 0) {
            z = true;
        } else {
            z = false;
        }
        setShadowVisible(z);
        if (this.F == i) {
            return false;
        }
        this.F = i;
        t1cVar.setTopGlowOffset(gl.L(58.0f) + i);
        frameLayout.setTranslationY(this.F);
        view.setTranslationY(this.F);
        return true;
    }

    public final void d() {
        t1c t1cVar = this.n;
        w39 adapter = t1cVar.getAdapter();
        c2c c2cVar = this.s;
        if (adapter == c2cVar) {
            c2cVar.getClass();
            return;
        }
        this.w.getClass();
        int childCount = t1cVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = t1cVar.getChildAt(i);
            if (childAt instanceof vza) {
                vza vzaVar = (vza) childAt;
                vzaVar.d();
                vzaVar.e();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.w0;
        t1c t1cVar = this.n;
        c2c c2cVar = this.s;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.K) {
                    w39 adapter = t1cVar.getAdapter();
                    if (adapter != null) {
                        adapter.n(0, adapter.b(), 0);
                        return;
                    }
                    return;
                }
                c2cVar.G();
            }
        } else if (i == kk7.y0) {
            if (this.L != hq6.d0(this.a).Z()) {
                this.K = false;
            }
            if (this.K) {
                w39 adapter2 = t1cVar.getAdapter();
                if (adapter2 != null) {
                    adapter2.n(0, adapter2.b(), 0);
                    return;
                }
                return;
            }
            c2cVar.G();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i;
        int i2;
        float f;
        float f2 = this.R;
        if (f2 != 0.0f && (stickerSetCovered = this.P) != null) {
            float f3 = f2 - 0.0053333333f;
            this.R = f3;
            if (f3 < 0.0f) {
                this.R = 0.0f;
            } else {
                invalidate();
            }
            Integer num = (Integer) this.s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                u1c u1cVar = this.r;
                View m = u1cVar.m(intValue);
                if (m != null) {
                    i = (int) m.getY();
                    i2 = m.getMeasuredHeight() + ((int) m.getY());
                } else {
                    i = -1;
                    i2 = -1;
                }
                View m2 = u1cVar.m(num.intValue() + 1);
                if (m2 != null) {
                    if (m == null) {
                        i = (int) m2.getY();
                    }
                    i2 = m2.getMeasuredHeight() + ((int) m2.getY());
                }
                if (m != null || m2 != null) {
                    int w0 = bkb.w0(null, bkb.Ei, false);
                    Paint paint = this.S;
                    paint.setColor(w0);
                    float f4 = this.R;
                    if (f4 < 0.06f) {
                        f = f4 / 0.06f;
                    } else {
                        f = 1.0f;
                    }
                    paint.setAlpha((int) (f * 25.5f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, i, getMeasuredWidth(), i2, paint);
                    super.dispatchDraw(canvas2);
                }
            }
        }
        canvas2 = canvas;
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.G = false;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!this.G) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.n.dispatchTouchEvent(obtain);
            obtain.recycle();
        }
        return dispatchTouchEvent;
    }

    public int getContentTopOffset() {
        return this.F;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w39 adapter = this.n.getAdapter();
        adapter.g(adapter.b() - 1);
        this.J = false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Integer num;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.J) {
            this.J = true;
            c2c c2cVar = this.s;
            c2cVar.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.P;
            if (stickerSetCovered != null && (num = (Integer) c2cVar.h.get(stickerSetCovered)) != null) {
                this.r.g1(num.intValue(), gl.L(58.0f) + (-this.n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i) {
        int L = gl.L(58.0f) + i;
        t1c t1cVar = this.n;
        if (t1cVar.getPaddingTop() != L) {
            this.I = true;
            t1cVar.setPadding(0, L, 0, 0);
            this.I = false;
        }
    }

    public void setOnScrollListener(i49 i49Var) {
        this.E = i49Var;
    }

    public void setParentFragment(d dVar) {
        this.y = dVar;
    }
}
