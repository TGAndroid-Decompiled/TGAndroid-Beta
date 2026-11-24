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
public final class d4c extends FrameLayout implements jm7 {
    public k69 E;
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
    public final ylb Q;
    public float R;
    public final Paint S;
    public final int a;
    public final a4c b;
    public final TLRPC.StickerSetCovered[] c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f;
    public final s3c h;
    public final t3c n;
    public final u3c r;
    public final c4c s;
    public final e3b w;
    public final FrameLayout x;
    public d y;

    public d4c(Context context, final a4c a4cVar, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, ylb ylbVar) {
        super(context);
        int i = z8c.t0;
        this.a = i;
        this.R = 1.0f;
        this.S = new Paint();
        this.b = a4cVar;
        this.c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.P = stickerSetCovered;
        this.Q = ylbVar;
        c4c c4cVar = new c4c(this, context);
        this.s = c4cVar;
        this.w = new e3b(context, new r3c(this, a4cVar), stickerSetCoveredArr, longSparseArray, longSparseArray2, ylbVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        anb.h(cmb.g5, ylbVar, frameLayout);
        s3c s3cVar = new s3c(this, context, ylbVar);
        this.h = s3cVar;
        s3cVar.setHint(jb6.M0(2131745439, null));
        frameLayout.addView(s3cVar, qoe.e(-1, -1, 48));
        t3c t3cVar = new t3c(this, context, a4cVar);
        this.n = t3cVar;
        final s19 s19Var = new s19(this, (byte) 28);
        t3cVar.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                s19 s19Var2 = s19Var;
                return a4cVar.e(d4c.this.n, s19Var2, motionEvent);
            }
        });
        t3cVar.setOverScrollMode(2);
        t3cVar.setClipToPadding(false);
        t3cVar.setItemAnimator(null);
        t3cVar.setLayoutAnimation(null);
        u3c u3cVar = new u3c(this, gm.L(58.0f), t3cVar);
        this.r = u3cVar;
        t3cVar.setLayoutManager(u3cVar);
        u3cVar.O = new v3c(this);
        t3cVar.setOnScrollListener(new w3c(this));
        t3cVar.setAdapter(c4cVar);
        t3cVar.setOnItemClickListener(s19Var);
        addView(t3cVar, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        anb.h(cmb.U5, ylbVar, view);
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gm.e1());
        layoutParams.topMargin = gm.L(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, qoe.e(-1, 58, 51));
        d();
        nm7 f = nm7.f(i);
        f.b(this, nm7.x0);
        f.b(this, nm7.z0);
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
            wi8.s(animate, f, 200L);
        }
    }

    public final void a(boolean z) {
        this.N = z;
        if (z) {
            if (getContentTopOffset() > 0 && this.M == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.M = ofFloat;
                ofFloat.addUpdateListener(new z3c(this, contentTopOffset));
                this.M.addListener(new q7b(this, (byte) 12));
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
        x3c x3cVar;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            a4c a4cVar = this.b;
            a4cVar.getClass();
            if (a4cVar instanceof y04) {
                x3cVar = new x3c(this);
            } else {
                x3cVar = null;
            }
            x2b x2bVar = new x2b(getContext(), this.y, inputStickerSet2, null, x3cVar, this.Q);
            x2bVar.d2 = false;
            x2bVar.W1 = new y3c(this, inputStickerSet2);
            this.y.showDialog(x2bVar);
        }
    }

    public final boolean c() {
        int i;
        boolean z;
        t3c t3cVar = this.n;
        int childCount = t3cVar.getChildCount();
        View view = this.f;
        FrameLayout frameLayout = this.x;
        if (childCount <= 0) {
            int paddingTop = t3cVar.getPaddingTop();
            this.F = paddingTop;
            t3cVar.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.F);
            view.setTranslationY(this.F);
            setShadowVisible(false);
            return true;
        }
        View childAt = t3cVar.getChildAt(0);
        for (int i2 = 1; i2 < t3cVar.getChildCount(); i2++) {
            View childAt2 = t3cVar.getChildAt(i2);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        b59 b59Var = (b59) t3cVar.G(childAt);
        int top = childAt.getTop() - gm.L(58.0f);
        if (top > 0 && b59Var != null && b59Var.b() == 0) {
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
        t3cVar.setTopGlowOffset(gm.L(58.0f) + i);
        frameLayout.setTranslationY(this.F);
        view.setTranslationY(this.F);
        return true;
    }

    public final void d() {
        t3c t3cVar = this.n;
        y59 adapter = t3cVar.getAdapter();
        c4c c4cVar = this.s;
        if (adapter == c4cVar) {
            c4cVar.getClass();
            return;
        }
        this.w.getClass();
        int childCount = t3cVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = t3cVar.getChildAt(i);
            if (childAt instanceof w1b) {
                w1b w1bVar = (w1b) childAt;
                w1bVar.d();
                w1bVar.e();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.x0;
        t3c t3cVar = this.n;
        c4c c4cVar = this.s;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.K) {
                    y59 adapter = t3cVar.getAdapter();
                    if (adapter != null) {
                        adapter.n(0, adapter.b(), 0);
                        return;
                    }
                    return;
                }
                c4cVar.G();
            }
        } else if (i == nm7.z0) {
            if (this.L != hs6.d0(this.a).Z()) {
                this.K = false;
            }
            if (this.K) {
                y59 adapter2 = t3cVar.getAdapter();
                if (adapter2 != null) {
                    adapter2.n(0, adapter2.b(), 0);
                    return;
                }
                return;
            }
            c4cVar.G();
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
                u3c u3cVar = this.r;
                View m = u3cVar.m(intValue);
                if (m != null) {
                    i = (int) m.getY();
                    i2 = m.getMeasuredHeight() + ((int) m.getY());
                } else {
                    i = -1;
                    i2 = -1;
                }
                View m2 = u3cVar.m(num.intValue() + 1);
                if (m2 != null) {
                    if (m == null) {
                        i = (int) m2.getY();
                    }
                    i2 = m2.getMeasuredHeight() + ((int) m2.getY());
                }
                if (m != null || m2 != null) {
                    int w0 = cmb.w0(null, cmb.Ei, false);
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
        y59 adapter = this.n.getAdapter();
        adapter.g(adapter.b() - 1);
        this.J = false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Integer num;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.J) {
            this.J = true;
            c4c c4cVar = this.s;
            c4cVar.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.P;
            if (stickerSetCovered != null && (num = (Integer) c4cVar.h.get(stickerSetCovered)) != null) {
                this.r.g1(num.intValue(), gm.L(58.0f) + (-this.n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i) {
        int L = gm.L(58.0f) + i;
        t3c t3cVar = this.n;
        if (t3cVar.getPaddingTop() != L) {
            this.I = true;
            t3cVar.setPadding(0, L, 0, 0);
            this.I = false;
        }
    }

    public void setOnScrollListener(k69 k69Var) {
        this.E = k69Var;
    }

    public void setParentFragment(d dVar) {
        this.y = dVar;
    }
}
