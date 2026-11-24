package defpackage;

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
public final class zec implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static final int[] f = new int[2];
    public static final RectF h = new RectF();
    public static final float[] n = new float[2];
    public final View a;
    public ViewTreeObserver b;
    public boolean c;
    public final WeakHashMap d = new WeakHashMap();
    public final RectF e = new RectF();

    public zec(View view) {
        this.a = view;
        view.addOnAttachStateChangeListener(this);
        a();
    }

    public static boolean b(View view, ViewGroup viewGroup, PointF pointF) {
        RectF rectF = h;
        boolean c = c(view, viewGroup, rectF);
        if (c) {
            pointF.x = rectF.left;
            pointF.y = rectF.top;
        }
        return c;
    }

    public static boolean c(View view, View view2, RectF rectF) {
        float f2 = 0.0f;
        View view3 = view;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (view3 != null && view3 != view2) {
            f3 += view3.getX();
            f4 += view3.getY();
            ViewParent parent = view3.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view3 = (View) parent;
            f3 -= view3.getScrollX();
            f4 -= view3.getScrollY();
        }
        if (view3 != view2) {
            if (view3 != null) {
                float f5 = 0.0f;
                while (view2 != view3) {
                    float x = view2.getX() + f2;
                    float y = view2.getY() + f5;
                    ViewParent parent2 = view2.getParent();
                    if (parent2 instanceof View) {
                        view2 = (View) parent2;
                        f5 = y - view2.getScrollY();
                        f2 = x - view2.getScrollX();
                    }
                }
                float[] fArr = n;
                fArr[0] = f2;
                fArr[1] = f5;
                f3 -= fArr[0];
                f4 -= fArr[1];
            }
            return false;
        }
        rectF.set(f3, f4, view.getWidth() + f3, view.getHeight() + f4);
        return true;
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View view = this.a;
        if (view.isAttachedToWindow() && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            this.b = viewTreeObserver;
            if (!this.c) {
                viewTreeObserver.addOnPreDrawListener(this);
                this.c = true;
            }
        }
    }

    public final void d(View view, ViewGroup viewGroup, xec xecVar, boolean z) {
        yec yecVar = new yec(viewGroup, xecVar);
        yecVar.d = z;
        WeakHashMap weakHashMap = this.d;
        List list = (List) weakHashMap.get(view);
        if (list == null) {
            list = new ArrayList(1);
            weakHashMap.put(view, list);
        }
        list.add(yecVar);
        RectF rectF = this.e;
        c(view, viewGroup, rectF);
        yecVar.c.set(rectF);
        if (!this.c) {
            a();
        }
        if (z) {
            new vk9(view, this);
        }
    }

    @Override
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        ViewTreeObserver viewTreeObserver2 = this.b;
        if (viewTreeObserver != viewTreeObserver2) {
            if (this.c && viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                this.b.removeOnPreDrawListener(this);
            }
            this.c = false;
            this.b = null;
            a();
        }
        WeakHashMap weakHashMap = this.d;
        if (!weakHashMap.isEmpty()) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                View view = (View) entry.getKey();
                List<yec> list = (List) entry.getValue();
                if (view != null && list != null) {
                    for (yec yecVar : list) {
                        boolean z = yecVar.d;
                        RectF rectF = yecVar.c;
                        ViewGroup viewGroup = yecVar.a;
                        RectF rectF2 = this.e;
                        if (z) {
                            int[] iArr = f;
                            view.getLocationOnScreen(iArr);
                            int i = iArr[0];
                            rectF2.set(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
                            viewGroup.getLocationOnScreen(iArr);
                            rectF2.offset(-iArr[0], -iArr[1]);
                        } else if (c(view, viewGroup, rectF2)) {
                        }
                        if (!yecVar.e || !rectF2.equals(rectF)) {
                            rectF.set(rectF2);
                            yecVar.e = true;
                            try {
                                yecVar.b.a(view, new RectF(rectF2));
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
        if (view == this.a) {
            if (this.c && (viewTreeObserver = this.b) != null && viewTreeObserver.isAlive()) {
                this.b.removeOnPreDrawListener(this);
            }
            this.c = false;
            this.b = null;
        }
    }
}
