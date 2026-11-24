package defpackage;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
public final class hp4 extends FrameLayout {
    public final ArrayList a;
    public final ArrayList b;
    public View.OnApplyWindowInsetsListener c;
    public boolean d;

    public hp4(Context context, AttributeSet attributeSet, hq4 hq4Var) {
        super(context, attributeSet);
        Activity activity;
        String str;
        context.getClass();
        attributeSet.getClass();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i09.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        dp4 C = hq4Var.C(id);
        if (classAttribute != null && C == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag ".concat(string);
                } else {
                    str = "";
                }
                dq9.m(kt6.o("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str));
                throw null;
            }
            bq4 H = hq4Var.H();
            context.getClassLoader();
            dp4 a = H.a(classAttribute);
            a.getClass();
            a.O = id;
            a.P = id;
            a.Q = string;
            a.K = hq4Var;
            fp4 fp4Var = hq4Var.w;
            a.L = fp4Var;
            a.V = true;
            if (fp4Var == null) {
                activity = null;
            } else {
                activity = fp4Var.a;
            }
            if (activity != null) {
                a.V = true;
            }
            ie0 ie0Var = new ie0(hq4Var);
            ie0Var.o = true;
            a.W = this;
            a.G = true;
            ie0Var.f(getId(), a, string);
            if (!ie0Var.g) {
                hq4 hq4Var2 = ie0Var.q;
                if (hq4Var2.w != null && !hq4Var2.J) {
                    hq4Var2.z(true);
                    ie0 ie0Var2 = hq4Var2.h;
                    if (ie0Var2 != null) {
                        ie0Var2.r = false;
                        ie0Var2.d();
                        if (hq4.K(3)) {
                            Log.d("FragmentManager", "Reversing mTransitioningOp " + hq4Var2.h + " as part of execSingleAction for action " + ie0Var);
                        }
                        hq4Var2.h.e(false, false);
                        hq4Var2.h.a(hq4Var2.L, hq4Var2.M);
                        ArrayList arrayList = hq4Var2.h.a;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            dp4 dp4Var = ((xq4) obj).b;
                            if (dp4Var != null) {
                                dp4Var.y = false;
                            }
                        }
                        hq4Var2.h = null;
                    }
                    ie0Var.a(hq4Var2.L, hq4Var2.M);
                    hq4Var2.b = true;
                    try {
                        hq4Var2.W(hq4Var2.L, hq4Var2.M);
                        hq4Var2.d();
                        hq4Var2.h0();
                        hq4Var2.v();
                        ((HashMap) hq4Var2.c.b).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        hq4Var2.d();
                        throw th;
                    }
                }
            } else {
                dq9.m("This transaction is already being added to the back stack");
                throw null;
            }
        }
        ArrayList s = hq4Var.c.s();
        int size2 = s.size();
        while (i < size2) {
            Object obj2 = s.get(i);
            i++;
            dp4 dp4Var2 = ((uq4) obj2).c;
            getId();
        }
    }

    public final void a(View view) {
        if (this.b.contains(view)) {
            this.a.add(view);
        }
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        dp4 dp4Var;
        view.getClass();
        Object tag = view.getTag(2131296441);
        if (tag instanceof dp4) {
            dp4Var = (dp4) tag;
        } else {
            dp4Var = null;
        }
        if (dp4Var != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        wzc h;
        windowInsets.getClass();
        wzc h2 = wzc.h(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.getClass();
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            h = wzc.h(null, onApplyWindowInsets);
        } else {
            h = kfc.h(this, h2);
        }
        if (!h.a.n()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                kfc.b(getChildAt(i), h);
            }
        }
        return windowInsets;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.d) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.d) {
            ArrayList arrayList = this.a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void endViewTransition(View view) {
        view.getClass();
        this.b.remove(view);
        if (this.a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends dp4> F getFragment() {
        dp4 dp4Var;
        gp4 gp4Var;
        hq4 u;
        hp4 hp4Var = this;
        while (true) {
            if (hp4Var != 0) {
                Object tag = hp4Var.getTag(2131296441);
                if (tag instanceof dp4) {
                    dp4Var = (dp4) tag;
                } else {
                    dp4Var = null;
                }
                if (dp4Var != null) {
                    break;
                }
                ViewParent parent = hp4Var.getParent();
                if (parent instanceof View) {
                    hp4Var = (View) parent;
                } else {
                    hp4Var = 0;
                }
            } else {
                dp4Var = null;
                break;
            }
        }
        if (dp4Var != null) {
            if (dp4Var.t()) {
                u = dp4Var.l();
            } else {
                zo4.n("The Fragment ", dp4Var, " that owns View ", this, " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                return null;
            }
        } else {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof gp4) {
                        gp4Var = (gp4) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    gp4Var = null;
                    break;
                }
            }
            if (gp4Var != null) {
                u = gp4Var.u();
            } else {
                zo4.i(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
        }
        return (F) u.C(getId());
    }

    @Override
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.d = z;
    }

    @Override
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.c = onApplyWindowInsetsListener;
    }

    @Override
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.b.add(view);
        }
        super.startViewTransition(view);
    }
}
