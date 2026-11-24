package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public abstract class qxb extends rm0 {
    public static final int o3 = 0;
    public boolean k3;
    public boolean l3;
    public float m3;
    public final sxb n3;

    public qxb(sxb sxbVar, Context context) {
        super(context, null);
        this.n3 = sxbVar;
        this.k3 = true;
        this.g1 = true;
        this.i3 = gm.L(200.0f);
    }

    public final void B1(boolean z, hg3 hg3Var) {
        sxb sxbVar = this.n3;
        sxbVar.F = z;
        byte b = 2;
        boolean z2 = true;
        if (!z) {
            if (hg3Var != null) {
                sxbVar.G.g1(1, 0);
                if (sxbVar.F) {
                    b = 0;
                }
                sxbVar.E = b;
                pi3 pi3Var = sxbVar.x;
                if (pi3Var != null) {
                    if (b == 0) {
                        z2 = false;
                    }
                    pi3Var.X = z2;
                }
            }
        } else {
            sxbVar.G.g1(0, 0);
            if (sxbVar.F) {
                b = 0;
            }
            sxbVar.E = b;
            pi3 pi3Var2 = sxbVar.x;
            if (pi3Var2 != null) {
                if (b == 0) {
                    z2 = false;
                }
                pi3Var2.X = z2;
            }
            if (hg3Var != null) {
                hg3Var.c0();
                hg3Var.invalidate();
            }
        }
        hxb hxbVar = sxbVar.F0;
        if (hxbVar != null) {
            hxbVar.forceLayout();
        }
    }

    @Override
    public final boolean G0(View view) {
        if ((view instanceof jf5) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.setTranslationY(this.m3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        sxb sxbVar = this.n3;
        if (sxbVar.d1 != null) {
            canvas.save();
            canvas.translate(sxbVar.d1.getLeft(), sxbVar.d1.getY());
            sxbVar.d1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
        if (this.n3.d1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        sxb sxbVar = this.n3;
        if (sxbVar.x != null && this.m3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            sxbVar.x.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.W1) {
            HashSet hashSet = sxb.s1;
            sxb sxbVar = this.n3;
            if (sxbVar.getParentLayout() == null || !((ActionBarLayout) sxbVar.getParentLayout()).w()) {
                if (motionEvent.getAction() == 0) {
                    aVar = ((d) sxbVar).actionBar;
                    aVar.getClass();
                    y59 adapter = getAdapter();
                    if (sxbVar.c != adapter.b()) {
                        this.l3 = true;
                        adapter.f();
                        this.l3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        a aVar;
        if (this.k3) {
            sxb sxbVar = this.n3;
            if (sxbVar.getMessagesController().R1) {
                if (sxbVar.y > 0) {
                    this.l3 = true;
                    aVar = ((d) sxbVar).actionBar;
                    ((u46) getLayoutManager()).g1(1, (int) aVar.getTranslationY());
                    this.l3 = false;
                }
                this.k3 = false;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u46 u46Var;
        int K0;
        float f;
        if (!this.W1) {
            HashSet hashSet = sxb.s1;
            sxb sxbVar = this.n3;
            if (sxbVar.getParentLayout() == null || !((ActionBarLayout) sxbVar.getParentLayout()).w()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    wwb wwbVar = sxbVar.P;
                    if (wwbVar.E != 0 && sxbVar.Q.e && wwbVar.i(null, 4) != 0) {
                        sxbVar.Q.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && sxbVar.E == 2 && sxbVar.y > 0 && (K0 = (u46Var = (u46) getLayoutManager()).K0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m = u46Var.m(K0);
                    if (gda.l1) {
                        f = 78.0f;
                    } else {
                        f = 72.0f;
                    }
                    int L = (int) (gm.L(f) * 0.85f);
                    int measuredHeight = m.getMeasuredHeight() + (m.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - sxbVar.Z;
                    if (measuredHeight >= L && currentTimeMillis >= 200) {
                        if (sxbVar.E != 1) {
                            if (this.m3 == 0.0f) {
                                x0(0, m.getTop() - paddingTop, d53.h);
                            }
                            if (!sxbVar.a0) {
                                sxbVar.a0 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                pi3 pi3Var = sxbVar.x;
                                if (pi3Var != null) {
                                    pi3Var.a(true);
                                }
                            }
                            ((hg3) m).i0();
                            sxbVar.E = (byte) 1;
                        }
                    } else {
                        x0(0, measuredHeight, d53.h);
                        sxbVar.E = (byte) 2;
                    }
                    float f2 = this.m3;
                    if (f2 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, 0.0f);
                        ofFloat.addUpdateListener(new oxb(this, (byte) 1));
                        ofFloat.setDuration(Math.max(100L, hg9.x(this.m3, gm.L(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(d53.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new q7b(this, (byte) 8));
                        ofFloat.start();
                    }
                }
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final void removeView(View view) {
        super.removeView(view);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void requestLayout() {
        if (this.l3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(y59 y59Var) {
        super.setAdapter(y59Var);
        this.k3 = true;
    }

    public final void setViewsOffset(float f) {
        View m;
        this.m3 = f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setTranslationY(f);
        }
        if (this.D1 != -1 && (m = getLayoutManager().m(this.D1)) != null) {
            int right = m.getRight();
            int bottom = (int) (m.getBottom() + f);
            Rect rect = this.F1;
            rect.set(m.getLeft(), (int) (m.getTop() + f), right, bottom);
            this.C1.setBounds(rect);
        }
        invalidate();
    }
}
