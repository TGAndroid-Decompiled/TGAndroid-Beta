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
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import v7.v7;
import w7.p7;
public abstract class d2 implements l.b0 {
    public static final Method P;
    public static final Method Q;
    public static final Method R;
    public View E;
    public AdapterView.OnItemClickListener F;
    public final Handler K;
    public Rect M;
    public boolean N;
    public final x O;
    public final Context f14152a;
    public ListAdapter f14153b;
    public r1 f14154c;
    public int f14155f;
    public int h;
    public boolean f14157r;
    public boolean f14158s;
    public boolean v;
    public h1.a f14161y;
    public final int d = -2;
    public int e = -2;
    public final int f14156n = 1002;
    public int f14159w = 0;
    public final int f14160x = Integer.MAX_VALUE;
    public final a2 G = new a2(this, 1);
    public final c2 H = new c2(this, 0);
    public final b2 I = new b2(this);
    public final a2 J = new a2(this, 0);
    public final Rect L = new Rect();

    static {
        int i10 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i10 <= 28) {
            try {
                P = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                R = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                Q = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public d2(Context context, AttributeSet attributeSet, int i10) {
        Drawable drawable;
        int resourceId;
        this.f14152a = context;
        this.K = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f8772o, i10, 0);
        this.f14155f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f14157r = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i10, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f8776s, i10, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            p7.a(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = v7.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.O = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override
    public final boolean a() {
        return this.O.isShowing();
    }

    public final int b() {
        return this.f14155f;
    }

    public final void c(int i10) {
        this.f14155f = i10;
    }

    @Override
    public final void dismiss() {
        x xVar = this.O;
        xVar.dismiss();
        xVar.setContentView(null);
        this.f14154c = null;
        this.K.removeCallbacks(this.G);
    }

    public final Drawable e() {
        return this.O.getBackground();
    }

    @Override
    public final r1 f() {
        return this.f14154c;
    }

    @Override
    public final void h() {
        int i10;
        boolean z10;
        int a2;
        int makeMeasureSpec;
        int i11;
        int i12;
        boolean z11;
        r1 r1Var;
        int i13;
        int i14;
        r1 r1Var2 = this.f14154c;
        Context context = this.f14152a;
        x xVar = this.O;
        int i15 = 0;
        if (r1Var2 == null) {
            r1 o9 = o(context, !this.N);
            this.f14154c = o9;
            o9.setAdapter(this.f14153b);
            this.f14154c.setOnItemClickListener(this.F);
            this.f14154c.setFocusable(true);
            this.f14154c.setFocusableInTouchMode(true);
            this.f14154c.setOnItemSelectedListener(new x1(this, 0));
            this.f14154c.setOnScrollListener(this.I);
            xVar.setContentView(this.f14154c);
        } else {
            ViewGroup viewGroup = (ViewGroup) xVar.getContentView();
        }
        Drawable background = xVar.getBackground();
        Rect rect = this.L;
        if (background != null) {
            background.getPadding(rect);
            int i16 = rect.top;
            i10 = rect.bottom + i16;
            if (!this.f14157r) {
                this.h = -i16;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        if (xVar.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = this.E;
        int i17 = this.h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = Q;
            if (method != null) {
                try {
                    a2 = ((Integer) method.invoke(xVar, view, Integer.valueOf(i17), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a2 = xVar.getMaxAvailableHeight(view, i17);
        } else {
            a2 = y1.a(xVar, view, i17, z10);
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
            int a10 = this.f14154c.a(makeMeasureSpec, a2);
            if (a10 > 0) {
                i11 = this.f14154c.getPaddingBottom() + this.f14154c.getPaddingTop() + i10;
            } else {
                i11 = 0;
            }
            i12 = a10 + i11;
        }
        if (xVar.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        p7.b(xVar, this.f14156n);
        if (xVar.isShowing()) {
            View view2 = this.E;
            WeakHashMap weakHashMap = r0.i0.f41843a;
            if (view2.isAttachedToWindow()) {
                int i20 = this.e;
                if (i20 == -1) {
                    i20 = -1;
                } else if (i20 == -2) {
                    i20 = this.E.getWidth();
                }
                if (i18 == -1) {
                    if (z11) {
                        i18 = i12;
                    } else {
                        i18 = -1;
                    }
                    if (z11) {
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
                View view3 = this.E;
                int i21 = i20;
                int i22 = this.f14155f;
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
            i24 = this.E.getWidth();
        }
        if (i18 == -1) {
            i18 = -1;
        } else if (i18 == -2) {
            i18 = i12;
        }
        xVar.setWidth(i24);
        xVar.setHeight(i18);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = P;
            if (method2 != null) {
                try {
                    method2.invoke(xVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            z1.b(xVar, true);
        }
        xVar.setOutsideTouchable(true);
        xVar.setTouchInterceptor(this.H);
        if (this.v) {
            p7.a(xVar, this.f14158s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = R;
            if (method3 != null) {
                try {
                    method3.invoke(xVar, this.M);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            z1.a(xVar, this.M);
        }
        xVar.showAsDropDown(this.E, this.f14155f, this.h, this.f14159w);
        this.f14154c.setSelection(-1);
        if ((!this.N || this.f14154c.isInTouchMode()) && (r1Var = this.f14154c) != null) {
            r1Var.setListSelectionHidden(true);
            r1Var.requestLayout();
        }
        if (!this.N) {
            this.K.post(this.J);
        }
    }

    public final void i(Drawable drawable) {
        this.O.setBackgroundDrawable(drawable);
    }

    public final void j(int i10) {
        this.h = i10;
        this.f14157r = true;
    }

    public final int m() {
        if (!this.f14157r) {
            return 0;
        }
        return this.h;
    }

    public void n(ListAdapter listAdapter) {
        h1.a aVar = this.f14161y;
        if (aVar == null) {
            this.f14161y = new h1.a(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f14153b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(aVar);
            }
        }
        this.f14153b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f14161y);
        }
        r1 r1Var = this.f14154c;
        if (r1Var != null) {
            r1Var.setAdapter(this.f14153b);
        }
    }

    public r1 o(Context context, boolean z10) {
        return new r1(context, z10);
    }

    public final void p(int i10) {
        Drawable background = this.O.getBackground();
        if (background != null) {
            Rect rect = this.L;
            background.getPadding(rect);
            this.e = rect.left + rect.right + i10;
            return;
        }
        this.e = i10;
    }
}
