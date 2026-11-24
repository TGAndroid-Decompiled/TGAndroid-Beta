package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public abstract class gb {
    public static final s33 w = la2.V;
    public final FrameLayout a;
    public FrameLayout b;
    public ViewGroup c;
    public View d;
    public boolean f;
    public boolean g;
    public View l;
    public ValueAnimator m;
    public float p;
    public float q;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean e = false;
    public final o1 h = new o1(this, (byte) 2);
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public final on n = new on(null);
    public final ArrayList o = new ArrayList();
    public final fb t = new fb(this, (byte) 0);
    public final boolean u = true;

    public gb(FrameLayout frameLayout) {
        this.a = frameLayout;
        gl.d3(new b1(this, (byte) 7));
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return a(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    public abstract boolean b();

    public final void c() {
        d();
        View view = this.a;
        Activity a = a(view.getContext());
        if (a != null) {
            this.c = (ViewGroup) ((ViewGroup) a.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (view.getParent() instanceof mq3) {
                        view2 = view;
                        break;
                    } else if (!(view.getParent() instanceof View)) {
                        break;
                    } else {
                        view = (View) view.getParent();
                    }
                } else {
                    break;
                }
            }
        }
        this.d = view2;
        if (view2 != null) {
            this.l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.t);
            this.l = null;
        }
    }

    public abstract void e(float f, float f2, boolean z);

    public abstract void g(int i, boolean z);

    public final void h(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.o;
            if (i2 < arrayList.size()) {
                ((View) arrayList.get(i2)).getLayoutParams().height = i;
                ((View) arrayList.get(i2)).requestLayout();
                i2++;
            } else {
                return;
            }
        }
    }

    public int i() {
        return 0;
    }

    public final void j() {
        float f;
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f = false;
        this.e = false;
        this.n.e();
        this.m = null;
        h(-1);
        this.o.clear();
        this.d.requestLayout();
        boolean z = this.s;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        e(0.0f, f, z);
        if (!(this instanceof y72)) {
            this.a.setTranslationY(0.0f);
        }
        f();
    }

    public void f() {
    }
}
