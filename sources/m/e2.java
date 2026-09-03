package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import j7.r7;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k7.w7;
public abstract class e2 implements l.b0 {
    public static final Method M;
    public static final Method N;
    public static final Method O;
    public View B;
    public AdapterView.OnItemClickListener C;
    public final Handler H;
    public Rect J;
    public boolean K;
    public final x L;
    public final Context f13474a;
    public ListAdapter f13475b;
    public s1 f13476c;
    public int f13477f;
    public int h;
    public boolean f13479r;
    public boolean f13480s;
    public boolean v;
    public h1.a f13483y;
    public final int d = -2;
    public int e = -2;
    public final int f13478n = 1002;
    public int f13481w = 0;
    public final int f13482x = Integer.MAX_VALUE;
    public final b2 D = new b2(this, 1);
    public final d2 E = new d2(this, 0);
    public final c2 F = new c2(this);
    public final b2 G = new b2(this, 0);
    public final Rect I = new Rect();

    static {
        int i10 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i10 <= 28) {
            try {
                M = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                O = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                N = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public e2(Context context, AttributeSet attributeSet, int i10) {
        Drawable drawable;
        int resourceId;
        this.f13474a = context;
        this.H = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f5619o, i10, 0);
        this.f13477f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f13479r = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i10, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f5623s, i10, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            w7.a(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = r7.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.L = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override
    public final boolean a() {
        return this.L.isShowing();
    }

    public final int b() {
        return this.f13477f;
    }

    public final void c(int i10) {
        this.f13477f = i10;
    }

    @Override
    public final void dismiss() {
        x xVar = this.L;
        xVar.dismiss();
        xVar.setContentView(null);
        this.f13476c = null;
        this.H.removeCallbacks(this.D);
    }

    @Override
    public final s1 f() {
        return this.f13476c;
    }

    @Override
    public final void g() {
        int i10;
        boolean z4;
        int a2;
        int makeMeasureSpec;
        int i11;
        int i12;
        boolean z10;
        s1 s1Var;
        int i13;
        int i14;
        s1 s1Var2 = this.f13476c;
        Context context = this.f13474a;
        x xVar = this.L;
        int i15 = 0;
        if (s1Var2 == null) {
            s1 q10 = q(context, !this.K);
            this.f13476c = q10;
            q10.setAdapter(this.f13475b);
            this.f13476c.setOnItemClickListener(this.C);
            this.f13476c.setFocusable(true);
            this.f13476c.setFocusableInTouchMode(true);
            this.f13476c.setOnItemSelectedListener(new y1(this, 0));
            this.f13476c.setOnScrollListener(this.F);
            xVar.setContentView(this.f13476c);
        } else {
            ViewGroup viewGroup = (ViewGroup) xVar.getContentView();
        }
        Drawable background = xVar.getBackground();
        Rect rect = this.I;
        if (background != null) {
            background.getPadding(rect);
            int i16 = rect.top;
            i10 = rect.bottom + i16;
            if (!this.f13479r) {
                this.h = -i16;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        if (xVar.getInputMethodMode() == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        View view = this.B;
        int i17 = this.h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = N;
            if (method != null) {
                try {
                    a2 = ((Integer) method.invoke(xVar, view, Integer.valueOf(i17), Boolean.valueOf(z4))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a2 = xVar.getMaxAvailableHeight(view, i17);
        } else {
            a2 = z1.a(xVar, view, i17, z4);
        }
        int i18 = this.d;
        if (i18 == -1) {
            i12 = a2 + i10;
        } else {
            int i19 = this.e;
            if (i19 != -2) {
                if (i19 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a10 = this.f13476c.a(makeMeasureSpec, a2);
            if (a10 > 0) {
                i11 = this.f13476c.getPaddingBottom() + this.f13476c.getPaddingTop() + i10;
            } else {
                i11 = 0;
            }
            i12 = a10 + i11;
        }
        if (xVar.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7.b(xVar, this.f13478n);
        if (xVar.isShowing()) {
            View view2 = this.B;
            WeakHashMap weakHashMap = r0.j0.f43142a;
            if (view2.isAttachedToWindow()) {
                int i20 = this.e;
                if (i20 == -1) {
                    i20 = -1;
                } else if (i20 == -2) {
                    i20 = this.B.getWidth();
                }
                if (i18 == -1) {
                    if (z10) {
                        i18 = i12;
                    } else {
                        i18 = -1;
                    }
                    if (z10) {
                        if (this.e == -1) {
                            i14 = -1;
                        } else {
                            i14 = 0;
                        }
                        xVar.setWidth(i14);
                        xVar.setHeight(0);
                    } else {
                        if (this.e == -1) {
                            i15 = -1;
                        }
                        xVar.setWidth(i15);
                        xVar.setHeight(-1);
                    }
                } else if (i18 == -2) {
                    i18 = i12;
                }
                xVar.setOutsideTouchable(true);
                View view3 = this.B;
                int i21 = i20;
                int i22 = this.f13477f;
                int i23 = this.h;
                if (i21 < 0) {
                    i13 = -1;
                } else {
                    i13 = i21;
                }
                if (i18 < 0) {
                    i18 = -1;
                }
                xVar.update(view3, i22, i23, i13, i18);
                return;
            }
            return;
        }
        int i24 = this.e;
        if (i24 == -1) {
            i24 = -1;
        } else if (i24 == -2) {
            i24 = this.B.getWidth();
        }
        if (i18 == -1) {
            i18 = -1;
        } else if (i18 == -2) {
            i18 = i12;
        }
        xVar.setWidth(i24);
        xVar.setHeight(i18);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = M;
            if (method2 != null) {
                try {
                    method2.invoke(xVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            a2.b(xVar, true);
        }
        xVar.setOutsideTouchable(true);
        xVar.setTouchInterceptor(this.E);
        if (this.v) {
            w7.a(xVar, this.f13480s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = O;
            if (method3 != null) {
                try {
                    method3.invoke(xVar, this.J);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            a2.a(xVar, this.J);
        }
        xVar.showAsDropDown(this.B, this.f13477f, this.h, this.f13481w);
        this.f13476c.setSelection(-1);
        if ((!this.K || this.f13476c.isInTouchMode()) && (s1Var = this.f13476c) != null) {
            s1Var.setListSelectionHidden(true);
            s1Var.requestLayout();
        }
        if (!this.K) {
            this.H.post(this.G);
        }
    }

    public final Drawable h() {
        return this.L.getBackground();
    }

    public final void j(Drawable drawable) {
        this.L.setBackgroundDrawable(drawable);
    }

    public final void k(int i10) {
        this.h = i10;
        this.f13479r = true;
    }

    public final int o() {
        if (!this.f13479r) {
            return 0;
        }
        return this.h;
    }

    public void p(ListAdapter listAdapter) {
        h1.a aVar = this.f13483y;
        if (aVar == null) {
            this.f13483y = new h1.a(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f13475b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(aVar);
            }
        }
        this.f13475b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f13483y);
        }
        s1 s1Var = this.f13476c;
        if (s1Var != null) {
            s1Var.setAdapter(this.f13475b);
        }
    }

    public s1 q(Context context, boolean z4) {
        return new s1(context, z4);
    }

    public final void r(int i10) {
        Drawable background = this.L.getBackground();
        if (background != null) {
            Rect rect = this.I;
            background.getPadding(rect);
            this.e = rect.left + rect.right + i10;
            return;
        }
        this.e = i10;
    }
}
