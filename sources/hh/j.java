package hh;

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
public final class j implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static final int[] f11515f = new int[2];
    public static final RectF h = new RectF();
    public final View f11516a;
    public ViewTreeObserver f11517b;
    public boolean f11518c;
    public final WeakHashMap d = new WeakHashMap();
    public final RectF f11519e = new RectF();

    public j(View view) {
        this.f11516a = view;
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
        View view3 = view;
        float f10 = 0.0f;
        while (view3 != null && view3 != view2) {
            float x10 = view3.getX() + f7;
            float y3 = view3.getY() + f10;
            ViewParent parent = view3.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view3 = (View) parent;
            f10 = y3 - view3.getScrollY();
            f7 = x10 - view3.getScrollX();
        }
        if (view3 != view2) {
            return false;
        }
        rectF.set(f7, f10, view.getWidth() + f7, view.getHeight() + f10);
        return true;
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f11516a;
        if (view.isAttachedToWindow() && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            this.f11517b = viewTreeObserver;
            if (!this.f11518c) {
                viewTreeObserver.addOnPreDrawListener(this);
                this.f11518c = true;
            }
        }
    }

    public final void d(View view, ViewGroup viewGroup, h hVar, boolean z10) {
        i iVar = new i(viewGroup, hVar);
        iVar.d = z10;
        WeakHashMap weakHashMap = this.d;
        List list = (List) weakHashMap.get(view);
        if (list == null) {
            list = new ArrayList(1);
            weakHashMap.put(view, list);
        }
        list.add(iVar);
        RectF rectF = this.f11519e;
        c(view, viewGroup, rectF);
        iVar.f11513c.set(rectF);
        if (!this.f11518c) {
            a();
        }
        if (z10) {
            new aa.a(view, this);
        }
    }

    @Override
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.f11516a.getViewTreeObserver();
        ViewTreeObserver viewTreeObserver2 = this.f11517b;
        if (viewTreeObserver != viewTreeObserver2) {
            if (this.f11518c && viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                this.f11517b.removeOnPreDrawListener(this);
            }
            this.f11518c = false;
            this.f11517b = null;
            a();
        }
        WeakHashMap weakHashMap = this.d;
        if (!weakHashMap.isEmpty()) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                View view = (View) entry.getKey();
                List<i> list = (List) entry.getValue();
                if (view != null && list != null) {
                    for (i iVar : list) {
                        boolean z10 = iVar.d;
                        RectF rectF = iVar.f11513c;
                        ViewGroup viewGroup = iVar.f11511a;
                        RectF rectF2 = this.f11519e;
                        if (z10) {
                            int[] iArr = f11515f;
                            view.getLocationOnScreen(iArr);
                            int i10 = iArr[0];
                            rectF2.set(i10, iArr[1], view.getWidth() + i10, view.getHeight() + iArr[1]);
                            viewGroup.getLocationOnScreen(iArr);
                            rectF2.offset(-iArr[0], -iArr[1]);
                        } else if (!c(view, viewGroup, rectF2)) {
                        }
                        if (!iVar.f11514e || !rectF2.equals(rectF)) {
                            rectF.set(rectF2);
                            iVar.f11514e = true;
                            try {
                                iVar.f11512b.j(new RectF(rectF2), view);
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
        if (view == this.f11516a) {
            if (this.f11518c && (viewTreeObserver = this.f11517b) != null && viewTreeObserver.isAlive()) {
                this.f11517b.removeOnPreDrawListener(this);
            }
            this.f11518c = false;
            this.f11517b = null;
        }
    }
}
