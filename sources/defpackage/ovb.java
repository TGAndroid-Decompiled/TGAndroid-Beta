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
public abstract class ovb extends rl0 {
    public static final int o3 = 0;
    public boolean k3;
    public boolean l3;
    public float m3;
    public final qvb n3;

    public ovb(qvb qvbVar, Context context) {
        super(context, null);
        this.n3 = qvbVar;
        this.k3 = true;
        this.g1 = true;
        this.i3 = gl.L(200.0f);
    }

    public final void B1(boolean z, ue3 ue3Var) {
        qvb qvbVar = this.n3;
        qvbVar.F = z;
        byte b = 2;
        boolean z2 = true;
        if (!z) {
            if (ue3Var != null) {
                qvbVar.G.g1(1, 0);
                if (qvbVar.F) {
                    b = 0;
                }
                qvbVar.E = b;
                dh3 dh3Var = qvbVar.x;
                if (dh3Var != null) {
                    if (b == 0) {
                        z2 = false;
                    }
                    dh3Var.X = z2;
                }
            }
        } else {
            qvbVar.G.g1(0, 0);
            if (qvbVar.F) {
                b = 0;
            }
            qvbVar.E = b;
            dh3 dh3Var2 = qvbVar.x;
            if (dh3Var2 != null) {
                if (b == 0) {
                    z2 = false;
                }
                dh3Var2.X = z2;
            }
            if (ue3Var != null) {
                ue3Var.d0();
                ue3Var.invalidate();
            }
        }
        gvb gvbVar = qvbVar.F0;
        if (gvbVar != null) {
            gvbVar.forceLayout();
        }
    }

    @Override
    public final boolean G0(View view) {
        if ((view instanceof ld5) && !view.isClickable()) {
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
        qvb qvbVar = this.n3;
        if (qvbVar.d1 != null) {
            canvas.save();
            canvas.translate(qvbVar.d1.getLeft(), qvbVar.d1.getY());
            qvbVar.d1.draw(canvas);
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
        qvb qvbVar = this.n3;
        if (qvbVar.x != null && this.m3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            qvbVar.x.c(canvas, true);
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
            HashSet hashSet = qvb.s1;
            qvb qvbVar = this.n3;
            if (qvbVar.getParentLayout() == null || !((ActionBarLayout) qvbVar.getParentLayout()).w()) {
                if (motionEvent.getAction() == 0) {
                    aVar = ((d) qvbVar).actionBar;
                    aVar.getClass();
                    w39 adapter = getAdapter();
                    if (qvbVar.c != adapter.b()) {
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
            qvb qvbVar = this.n3;
            if (qvbVar.getMessagesController().R1) {
                if (qvbVar.y > 0) {
                    this.l3 = true;
                    aVar = ((d) qvbVar).actionBar;
                    ((t26) getLayoutManager()).g1(1, (int) aVar.getTranslationY());
                    this.l3 = false;
                }
                this.k3 = false;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t26 t26Var;
        int K0;
        float f;
        if (!this.W1) {
            HashSet hashSet = qvb.s1;
            qvb qvbVar = this.n3;
            if (qvbVar.getParentLayout() == null || !((ActionBarLayout) qvbVar.getParentLayout()).w()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    vub vubVar = qvbVar.P;
                    if (vubVar.E != 0 && qvbVar.Q.e && vubVar.i(null, 4) != 0) {
                        qvbVar.Q.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && qvbVar.E == 2 && qvbVar.y > 0 && (K0 = (t26Var = (t26) getLayoutManager()).K0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m = t26Var.m(K0);
                    if (gba.l1) {
                        f = 78.0f;
                    } else {
                        f = 72.0f;
                    }
                    int L = (int) (gl.L(f) * 0.85f);
                    int measuredHeight = m.getMeasuredHeight() + (m.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - qvbVar.Z;
                    if (measuredHeight >= L && currentTimeMillis >= 200) {
                        if (qvbVar.E != 1) {
                            if (this.m3 == 0.0f) {
                                x0(0, m.getTop() - paddingTop, s33.h);
                            }
                            if (!qvbVar.a0) {
                                qvbVar.a0 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                dh3 dh3Var = qvbVar.x;
                                if (dh3Var != null) {
                                    dh3Var.a(true);
                                }
                            }
                            ((ue3) m).j0();
                            qvbVar.E = (byte) 1;
                        }
                    } else {
                        x0(0, measuredHeight, s33.h);
                        qvbVar.E = (byte) 2;
                    }
                    float f2 = this.m3;
                    if (f2 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, 0.0f);
                        ofFloat.addUpdateListener(new gja(this, (byte) 29));
                        ofFloat.setDuration(Math.max(100L, de9.x(this.m3, gl.L(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(s33.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new iab(this, (byte) 6));
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
    public final void setAdapter(w39 w39Var) {
        super.setAdapter(w39Var);
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
