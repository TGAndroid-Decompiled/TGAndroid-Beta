package jh;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import h6.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
public final class k implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static final int[] f17410f = new int[2];
    public static final RectF h = new RectF();
    public static final float[] f17411n = new float[2];
    public final View f17412a;
    public ViewTreeObserver f17413b;
    public boolean f17414c;
    public final WeakHashMap d = new WeakHashMap();
    public final RectF f17415e = new RectF();

    public k(View view) {
        this.f17412a = view;
        view.addOnAttachStateChangeListener(this);
        a();
    }

    public static boolean b(View view, ViewGroup viewGroup, PointF pointF) {
        RectF rectF = h;
        boolean c10 = c(view, viewGroup, rectF);
        if (c10) {
            pointF.x = rectF.left;
            pointF.y = rectF.top;
        }
        return c10;
    }

    public static boolean c(View view, View view2, RectF rectF) {
        float f10 = 0.0f;
        View view3 = view;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (view3 != null && view3 != view2) {
            f11 += view3.getX();
            f12 += view3.getY();
            ViewParent parent = view3.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view3 = (View) parent;
            f11 -= view3.getScrollX();
            f12 -= view3.getScrollY();
        }
        if (view3 != view2) {
            if (view3 != null) {
                float f13 = 0.0f;
                while (view2 != view3) {
                    float x10 = view2.getX() + f10;
                    float y10 = view2.getY() + f13;
                    ViewParent parent2 = view2.getParent();
                    if (parent2 instanceof View) {
                        view2 = (View) parent2;
                        f13 = y10 - view2.getScrollY();
                        f10 = x10 - view2.getScrollX();
                    }
                }
                float[] fArr = f17411n;
                fArr[0] = f10;
                fArr[1] = f13;
                f11 -= fArr[0];
                f12 -= fArr[1];
            }
            return false;
        }
        rectF.set(f11, f12, view.getWidth() + f11, view.getHeight() + f12);
        return true;
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f17412a;
        if (view.isAttachedToWindow() && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            this.f17413b = viewTreeObserver;
            if (!this.f17414c) {
                viewTreeObserver.addOnPreDrawListener(this);
                this.f17414c = true;
            }
        }
    }

    public final void d(View view, ViewGroup viewGroup, i iVar, boolean z10) {
        j jVar = new j(viewGroup, iVar);
        jVar.d = z10;
        WeakHashMap weakHashMap = this.d;
        List list = (List) weakHashMap.get(view);
        if (list == null) {
            list = new ArrayList(1);
            weakHashMap.put(view, list);
        }
        list.add(jVar);
        RectF rectF = this.f17415e;
        c(view, viewGroup, rectF);
        jVar.f17408c.set(rectF);
        if (!this.f17414c) {
            a();
        }
        if (z10) {
            new m(view, this);
        }
    }

    @Override
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.f17412a.getViewTreeObserver();
        ViewTreeObserver viewTreeObserver2 = this.f17413b;
        if (viewTreeObserver != viewTreeObserver2) {
            if (this.f17414c && viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                this.f17413b.removeOnPreDrawListener(this);
            }
            this.f17414c = false;
            this.f17413b = null;
            a();
        }
        WeakHashMap weakHashMap = this.d;
        if (!weakHashMap.isEmpty()) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                View view = (View) entry.getKey();
                List<j> list = (List) entry.getValue();
                if (view != null && list != null) {
                    for (j jVar : list) {
                        boolean z10 = jVar.d;
                        RectF rectF = jVar.f17408c;
                        ViewGroup viewGroup = jVar.f17406a;
                        RectF rectF2 = this.f17415e;
                        if (z10) {
                            int[] iArr = f17410f;
                            view.getLocationOnScreen(iArr);
                            int i7 = iArr[0];
                            rectF2.set(i7, iArr[1], view.getWidth() + i7, view.getHeight() + iArr[1]);
                            viewGroup.getLocationOnScreen(iArr);
                            rectF2.offset(-iArr[0], -iArr[1]);
                        } else if (!c(view, viewGroup, rectF2)) {
                        }
                        if (!jVar.f17409e || !rectF2.equals(rectF)) {
                            rectF.set(rectF2);
                            jVar.f17409e = true;
                            try {
                                jVar.f17407b.j(new RectF(rectF2), view);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        if (view == this.f17412a) {
            if (this.f17414c && (viewTreeObserver = this.f17413b) != null && viewTreeObserver.isAlive()) {
                this.f17413b.removeOnPreDrawListener(this);
            }
            this.f17414c = false;
            this.f17413b = null;
        }
    }
}
