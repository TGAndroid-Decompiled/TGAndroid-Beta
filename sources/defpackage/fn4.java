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
public final class fn4 extends FrameLayout {
    public final ArrayList a;
    public final ArrayList b;
    public View.OnApplyWindowInsetsListener c;
    public boolean d;

    public fn4(Context context, AttributeSet attributeSet, go4 go4Var) {
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hy8.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        bn4 C = go4Var.C(id);
        if (classAttribute != null && C == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag ".concat(string);
                } else {
                    str = "";
                }
                sc8.j(tb4.y("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str));
                throw null;
            }
            ao4 H = go4Var.H();
            context.getClassLoader();
            bn4 a = H.a(classAttribute);
            a.getClass();
            a.O = id;
            a.P = id;
            a.Q = string;
            a.K = go4Var;
            dn4 dn4Var = go4Var.w;
            a.L = dn4Var;
            a.V = true;
            if (dn4Var == null) {
                activity = null;
            } else {
                activity = dn4Var.a;
            }
            if (activity != null) {
                a.V = true;
            }
            id0 id0Var = new id0(go4Var);
            id0Var.o = true;
            a.W = this;
            a.G = true;
            id0Var.f(getId(), a, string);
            if (!id0Var.g) {
                go4 go4Var2 = id0Var.q;
                if (go4Var2.w != null && !go4Var2.J) {
                    go4Var2.z(true);
                    id0 id0Var2 = go4Var2.h;
                    if (id0Var2 != null) {
                        id0Var2.r = false;
                        id0Var2.d();
                        if (go4.K(3)) {
                            Log.d("FragmentManager", "Reversing mTransitioningOp " + go4Var2.h + " as part of execSingleAction for action " + id0Var);
                        }
                        go4Var2.h.e(false, false);
                        go4Var2.h.a(go4Var2.L, go4Var2.M);
                        ArrayList arrayList = go4Var2.h.a;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            bn4 bn4Var = ((wo4) obj).b;
                            if (bn4Var != null) {
                                bn4Var.y = false;
                            }
                        }
                        go4Var2.h = null;
                    }
                    id0Var.a(go4Var2.L, go4Var2.M);
                    go4Var2.b = true;
                    try {
                        go4Var2.W(go4Var2.L, go4Var2.M);
                        go4Var2.d();
                        go4Var2.h0();
                        go4Var2.v();
                        ((HashMap) go4Var2.c.b).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        go4Var2.d();
                        throw th;
                    }
                }
            } else {
                sc8.j("This transaction is already being added to the back stack");
                throw null;
            }
        }
        ArrayList q = go4Var.c.q();
        int size2 = q.size();
        while (i < size2) {
            Object obj2 = q.get(i);
            i++;
            bn4 bn4Var2 = ((to4) obj2).c;
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
        bn4 bn4Var;
        view.getClass();
        Object tag = view.getTag(2131296441);
        if (tag instanceof bn4) {
            bn4Var = (bn4) tag;
        } else {
            bn4Var = null;
        }
        if (bn4Var != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        vxc h;
        windowInsets.getClass();
        vxc h2 = vxc.h(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.getClass();
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            h = vxc.h(null, onApplyWindowInsets);
        } else {
            h = jdc.h(this, h2);
        }
        if (!h.a.n()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                jdc.b(getChildAt(i), h);
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

    public final <F extends bn4> F getFragment() {
        bn4 bn4Var;
        en4 en4Var;
        go4 u;
        fn4 fn4Var = this;
        while (true) {
            if (fn4Var != 0) {
                Object tag = fn4Var.getTag(2131296441);
                if (tag instanceof bn4) {
                    bn4Var = (bn4) tag;
                } else {
                    bn4Var = null;
                }
                if (bn4Var != null) {
                    break;
                }
                ViewParent parent = fn4Var.getParent();
                if (parent instanceof View) {
                    fn4Var = (View) parent;
                } else {
                    fn4Var = 0;
                }
            } else {
                bn4Var = null;
                break;
            }
        }
        if (bn4Var != null) {
            if (bn4Var.t()) {
                u = bn4Var.l();
            } else {
                w44.f("The Fragment ", bn4Var, " that owns View ", this, " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                return null;
            }
        } else {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof en4) {
                        en4Var = (en4) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    en4Var = null;
                    break;
                }
            }
            if (en4Var != null) {
                u = en4Var.u();
            } else {
                w44.d(this, " is not within a subclass of FragmentActivity.", "View ");
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
