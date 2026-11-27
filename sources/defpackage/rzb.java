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
import org.telegram.ui.ActionBar.e;
public abstract class rzb extends sl0 {
    public static final int o3 = 0;
    public boolean k3;
    public boolean l3;
    public float m3;
    public final tzb n3;

    public rzb(tzb tzbVar, Context context) {
        super(context, null);
        this.n3 = tzbVar;
        this.k3 = true;
        this.g1 = true;
        this.i3 = hl.L(200.0f);
    }

    public final void C1(boolean z, of3 of3Var) {
        tzb tzbVar = this.n3;
        tzbVar.F = z;
        byte b = 2;
        boolean z2 = true;
        if (!z) {
            if (of3Var != null) {
                tzbVar.G.g1(1, 0);
                if (tzbVar.F) {
                    b = 0;
                }
                tzbVar.E = b;
                xh3 xh3Var = tzbVar.x;
                if (xh3Var != null) {
                    if (b == 0) {
                        z2 = false;
                    }
                    xh3Var.X = z2;
                }
            }
        } else {
            tzbVar.G.g1(0, 0);
            if (tzbVar.F) {
                b = 0;
            }
            tzbVar.E = b;
            xh3 xh3Var2 = tzbVar.x;
            if (xh3Var2 != null) {
                if (b == 0) {
                    z2 = false;
                }
                xh3Var2.X = z2;
            }
            if (of3Var != null) {
                of3Var.c0();
                of3Var.invalidate();
            }
        }
        izb izbVar = tzbVar.F0;
        if (izbVar != null) {
            izbVar.forceLayout();
        }
    }

    @Override
    public final boolean H0(View view) {
        if ((view instanceof mf5) && !view.isClickable()) {
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
        tzb tzbVar = this.n3;
        if (tzbVar.d1 != null) {
            canvas.save();
            canvas.translate(tzbVar.d1.getLeft(), tzbVar.d1.getY());
            tzbVar.d1.draw(canvas);
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
        tzb tzbVar = this.n3;
        if (tzbVar.x != null && this.m3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            tzbVar.x.c(canvas, true);
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
            HashSet hashSet = tzb.s1;
            tzb tzbVar = this.n3;
            if (tzbVar.getParentLayout() == null || !((ActionBarLayout) tzbVar.getParentLayout()).w()) {
                if (motionEvent.getAction() == 0) {
                    aVar = ((e) tzbVar).actionBar;
                    aVar.getClass();
                    j79 adapter = getAdapter();
                    if (tzbVar.c != adapter.b()) {
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
            tzb tzbVar = this.n3;
            if (tzbVar.getMessagesController().R1) {
                if (tzbVar.y > 0) {
                    this.l3 = true;
                    aVar = ((e) tzbVar).actionBar;
                    ((x46) getLayoutManager()).g1(1, (int) aVar.getTranslationY());
                    this.l3 = false;
                }
                this.k3 = false;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x46 x46Var;
        int K0;
        float f;
        if (!this.W1) {
            HashSet hashSet = tzb.s1;
            tzb tzbVar = this.n3;
            if (tzbVar.getParentLayout() == null || !((ActionBarLayout) tzbVar.getParentLayout()).w()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    wyb wybVar = tzbVar.P;
                    if (wybVar.E != 0 && tzbVar.Q.e && wybVar.i(null, 4) != 0) {
                        tzbVar.Q.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && tzbVar.E == 2 && tzbVar.y > 0 && (K0 = (x46Var = (x46) getLayoutManager()).K0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m = x46Var.m(K0);
                    if (xea.l1) {
                        f = 78.0f;
                    } else {
                        f = 72.0f;
                    }
                    int L = (int) (hl.L(f) * 0.85f);
                    int measuredHeight = m.getMeasuredHeight() + (m.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - tzbVar.Z;
                    if (measuredHeight >= L && currentTimeMillis >= 200) {
                        if (tzbVar.E != 1) {
                            if (this.m3 == 0.0f) {
                                y0(0, m.getTop() - paddingTop, k43.h);
                            }
                            if (!tzbVar.a0) {
                                tzbVar.a0 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                xh3 xh3Var = tzbVar.x;
                                if (xh3Var != null) {
                                    xh3Var.a(true);
                                }
                            }
                            ((of3) m).i0();
                            tzbVar.E = (byte) 1;
                        }
                    } else {
                        y0(0, measuredHeight, k43.h);
                        tzbVar.E = (byte) 2;
                    }
                    float f2 = this.m3;
                    if (f2 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, 0.0f);
                        ofFloat.addUpdateListener(new pzb(this, (byte) 1));
                        ofFloat.setDuration(Math.max(100L, uh9.x(this.m3, hl.L(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(k43.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new omb(this, (byte) 5));
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
    public final void setAdapter(j79 j79Var) {
        super.setAdapter(j79Var);
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
