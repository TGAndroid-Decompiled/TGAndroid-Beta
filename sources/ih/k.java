package ih;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
public final class k implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static final int[] f12371f = new int[2];
    public static final RectF h = new RectF();
    public final View f12372a;
    public ViewTreeObserver f12373b;
    public boolean f12374c;
    public final WeakHashMap d = new WeakHashMap();
    public final RectF f12375e = new RectF();

    public k(View view) {
        this.f12372a = view;
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
        float f7 = 0.0f;
        float f10 = 0.0f;
        View view3 = view;
        while (view3 != null && view3 != view2) {
            float x10 = view3.getX() + f7;
            float y3 = view3.getY() + f10;
            ViewParent parent = view3.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view3 = (View) parent;
            float scrollX = x10 - view3.getScrollX();
            f10 = y3 - view3.getScrollY();
            f7 = scrollX;
        }
        if (view3 != view2) {
            return false;
        }
        rectF.set(f7, f10, view.getWidth() + f7, view.getHeight() + f10);
        return true;
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f12372a;
        if (view.isAttachedToWindow() && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            this.f12373b = viewTreeObserver;
            if (!this.f12374c) {
                viewTreeObserver.addOnPreDrawListener(this);
                this.f12374c = true;
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
        RectF rectF = this.f12375e;
        c(view, viewGroup, rectF);
        jVar.f12369c.set(rectF);
        if (!this.f12374c) {
            a();
        }
        if (z10) {
            view.getViewTreeObserver().addOnPreDrawListener(this);
        }
    }

    @Override
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.f12372a.getViewTreeObserver();
        ViewTreeObserver viewTreeObserver2 = this.f12373b;
        if (viewTreeObserver != viewTreeObserver2) {
            if (this.f12374c && viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                this.f12373b.removeOnPreDrawListener(this);
            }
            this.f12374c = false;
            this.f12373b = null;
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
                        RectF rectF = jVar.f12369c;
                        ViewGroup viewGroup = jVar.f12367a;
                        RectF rectF2 = this.f12375e;
                        if (z10) {
                            int[] iArr = f12371f;
                            view.getLocationOnScreen(iArr);
                            int i10 = iArr[0];
                            rectF2.set(i10, iArr[1], view.getWidth() + i10, view.getHeight() + iArr[1]);
                            viewGroup.getLocationOnScreen(iArr);
                            rectF2.offset(-iArr[0], -iArr[1]);
                        } else if (!c(view, viewGroup, rectF2)) {
                        }
                        if (!jVar.f12370e || !rectF2.equals(rectF)) {
                            rectF.set(rectF2);
                            jVar.f12370e = true;
                            try {
                                jVar.f12368b.k(new RectF(rectF2), view);
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
        if (view == this.f12372a) {
            if (this.f12374c && (viewTreeObserver = this.f12373b) != null && viewTreeObserver.isAlive()) {
                this.f12373b.removeOnPreDrawListener(this);
            }
            this.f12374c = false;
            this.f12373b = null;
        }
    }
}
