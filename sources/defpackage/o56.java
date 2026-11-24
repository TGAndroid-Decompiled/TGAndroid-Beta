package defpackage;

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
import java.lang.reflect.Method;
import java.util.WeakHashMap;
public abstract class o56 implements vga {
    public static final Method Q;
    public static final Method R;
    public static final Method S;
    public c43 E;
    public View F;
    public AdapterView.OnItemClickListener G;
    public final Handler L;
    public Rect N;
    public boolean O;
    public final np P;
    public final Context a;
    public ListAdapter b;
    public er3 c;
    public int f;
    public int h;
    public boolean r;
    public boolean s;
    public boolean w;
    public final int d = -2;
    public int e = -2;
    public final short n = 1002;
    public int x = 0;
    public final int y = Integer.MAX_VALUE;
    public final m56 H = new m56(this, (byte) 1);
    public final p04 I = new p04(this, (byte) 3);
    public final n56 J = new n56(this);
    public final m56 K = new m56(this, (byte) 0);
    public final Rect M = new Rect();

    static {
        int i = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i <= 28) {
            try {
                Q = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                S = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                R = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public o56(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        int resourceId;
        this.a = context;
        this.L = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jy8.o, i, 0);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.r = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, jy8.s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = hmd.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.P = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override
    public final boolean a() {
        return this.P.isShowing();
    }

    public final int b() {
        return this.f;
    }

    public final void c(int i) {
        this.f = i;
    }

    @Override
    public final void dismiss() {
        np npVar = this.P;
        npVar.dismiss();
        npVar.setContentView(null);
        this.c = null;
        this.L.removeCallbacks(this.H);
    }

    @Override
    public final er3 e() {
        return this.c;
    }

    @Override
    public final void f() {
        int i;
        boolean z;
        int a;
        int makeMeasureSpec;
        int i2;
        int i3;
        boolean z2;
        er3 er3Var;
        int i4;
        int i5;
        er3 er3Var2 = this.c;
        Context context = this.a;
        np npVar = this.P;
        int i6 = 0;
        if (er3Var2 == null) {
            er3 p = p(context, !this.O);
            this.c = p;
            p.setAdapter(this.b);
            this.c.setOnItemClickListener(this.G);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new j56(this, (byte) 0));
            this.c.setOnScrollListener(this.J);
            npVar.setContentView(this.c);
        } else {
            ViewGroup viewGroup = (ViewGroup) npVar.getContentView();
        }
        Drawable background = npVar.getBackground();
        Rect rect = this.M;
        if (background != null) {
            background.getPadding(rect);
            int i7 = rect.top;
            i = rect.bottom + i7;
            if (!this.r) {
                this.h = -i7;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        if (npVar.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        View view = this.F;
        int i8 = this.h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = R;
            if (method != null) {
                try {
                    a = ((Integer) method.invoke(npVar, view, Integer.valueOf(i8), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a = npVar.getMaxAvailableHeight(view, i8);
        } else {
            a = k56.a(npVar, view, i8, z);
        }
        int i9 = this.d;
        if (i9 == -1) {
            i3 = a + i;
        } else {
            int i10 = this.e;
            if (i10 != -2) {
                if (i10 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a2 = this.c.a(makeMeasureSpec, a);
            if (a2 > 0) {
                i2 = this.c.getPaddingBottom() + this.c.getPaddingTop() + i;
            } else {
                i2 = 0;
            }
            i3 = a2 + i2;
        }
        if (npVar.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        npVar.setWindowLayoutType(this.n);
        if (npVar.isShowing()) {
            View view2 = this.F;
            WeakHashMap weakHashMap = jdc.a;
            if (view2.isAttachedToWindow()) {
                int i11 = this.e;
                if (i11 == -1) {
                    i11 = -1;
                } else if (i11 == -2) {
                    i11 = this.F.getWidth();
                }
                if (i9 == -1) {
                    if (z2) {
                        i9 = i3;
                    } else {
                        i9 = -1;
                    }
                    int i12 = this.e;
                    if (z2) {
                        if (i12 == -1) {
                            i5 = -1;
                        } else {
                            i5 = 0;
                        }
                        npVar.setWidth(i5);
                        npVar.setHeight(0);
                    } else {
                        if (i12 == -1) {
                            i6 = -1;
                        }
                        npVar.setWidth(i6);
                        npVar.setHeight(-1);
                    }
                } else if (i9 == -2) {
                    i9 = i3;
                }
                npVar.setOutsideTouchable(true);
                View view3 = this.F;
                int i13 = i11;
                int i14 = this.f;
                int i15 = this.h;
                if (i13 < 0) {
                    i4 = -1;
                } else {
                    i4 = i13;
                }
                if (i9 < 0) {
                    i9 = -1;
                }
                npVar.update(view3, i14, i15, i4, i9);
                return;
            }
            return;
        }
        int i16 = this.e;
        if (i16 == -1) {
            i16 = -1;
        } else if (i16 == -2) {
            i16 = this.F.getWidth();
        }
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = i3;
        }
        npVar.setWidth(i16);
        npVar.setHeight(i9);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = Q;
            if (method2 != null) {
                try {
                    method2.invoke(npVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            l56.b(npVar, true);
        }
        npVar.setOutsideTouchable(true);
        npVar.setTouchInterceptor(this.I);
        if (this.w) {
            npVar.setOverlapAnchor(this.s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = S;
            if (method3 != null) {
                try {
                    method3.invoke(npVar, this.N);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            l56.a(npVar, this.N);
        }
        npVar.showAsDropDown(this.F, this.f, this.h, this.x);
        this.c.setSelection(-1);
        if ((!this.O || this.c.isInTouchMode()) && (er3Var = this.c) != null) {
            er3Var.setListSelectionHidden(true);
            er3Var.requestLayout();
        }
        if (!this.O) {
            this.L.post(this.K);
        }
    }

    public final Drawable g() {
        return this.P.getBackground();
    }

    public final void j(Drawable drawable) {
        this.P.setBackgroundDrawable(drawable);
    }

    public final void k(int i) {
        this.h = i;
        this.r = true;
    }

    public final int n() {
        if (!this.r) {
            return 0;
        }
        return this.h;
    }

    public void o(ListAdapter listAdapter) {
        c43 c43Var = this.E;
        if (c43Var == null) {
            this.E = new c43(this, (byte) 1);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c43Var);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.E);
        }
        er3 er3Var = this.c;
        if (er3Var != null) {
            er3Var.setAdapter(this.b);
        }
    }

    public er3 p(Context context, boolean z) {
        return new er3(context, z);
    }

    public final void r(int i) {
        Drawable background = this.P.getBackground();
        if (background != null) {
            Rect rect = this.M;
            background.getPadding(rect);
            this.e = rect.left + rect.right + i;
            return;
        }
        this.e = i;
    }
}
