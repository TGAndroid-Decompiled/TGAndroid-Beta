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
import v7.q7;
public abstract class e2 implements l.b0 {
    public static final Method P;
    public static final Method Q;
    public static final Method R;
    public View E;
    public AdapterView.OnItemClickListener F;
    public final Handler K;
    public Rect M;
    public boolean N;
    public final y O;
    public final Context f16247a;
    public ListAdapter f16248b;
    public s1 f16249c;
    public int f16250f;
    public int h;
    public boolean f16252r;
    public boolean f16253s;
    public boolean v;
    public h1.a f16256y;
    public final int d = -2;
    public int e = -2;
    public final int f16251n = 1002;
    public int f16254w = 0;
    public final int f16255x = Integer.MAX_VALUE;
    public final b2 G = new b2(this, 1);
    public final d2 H = new d2(this, 0);
    public final c2 I = new c2(this);
    public final b2 J = new b2(this, 0);
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

    public e2(Context context, AttributeSet attributeSet, int i10) {
        Drawable drawable;
        int resourceId;
        this.f16247a = context;
        this.K = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f10277o, i10, 0);
        this.f16250f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f16252r = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i10, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f10281s, i10, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = q7.b(context, resourceId);
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
        return this.f16250f;
    }

    public final void c(int i10) {
        this.f16250f = i10;
    }

    @Override
    public final void dismiss() {
        y yVar = this.O;
        yVar.dismiss();
        yVar.setContentView(null);
        this.f16249c = null;
        this.K.removeCallbacks(this.G);
    }

    public final Drawable e() {
        return this.O.getBackground();
    }

    @Override
    public final s1 f() {
        return this.f16249c;
    }

    @Override
    public final void g() {
        int i10;
        boolean z10;
        int a2;
        int makeMeasureSpec;
        int i11;
        int i12;
        boolean z11;
        s1 s1Var;
        int i13;
        int i14;
        s1 s1Var2 = this.f16249c;
        Context context = this.f16247a;
        y yVar = this.O;
        int i15 = 0;
        if (s1Var2 == null) {
            s1 p5 = p(context, !this.N);
            this.f16249c = p5;
            p5.setAdapter(this.f16248b);
            this.f16249c.setOnItemClickListener(this.F);
            this.f16249c.setFocusable(true);
            this.f16249c.setFocusableInTouchMode(true);
            this.f16249c.setOnItemSelectedListener(new y1(this, 0));
            this.f16249c.setOnScrollListener(this.I);
            yVar.setContentView(this.f16249c);
        } else {
            ViewGroup viewGroup = (ViewGroup) yVar.getContentView();
        }
        Drawable background = yVar.getBackground();
        Rect rect = this.L;
        if (background != null) {
            background.getPadding(rect);
            int i16 = rect.top;
            i10 = rect.bottom + i16;
            if (!this.f16252r) {
                this.h = -i16;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        if (yVar.getInputMethodMode() == 2) {
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
                    a2 = ((Integer) method.invoke(yVar, view, Integer.valueOf(i17), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a2 = yVar.getMaxAvailableHeight(view, i17);
        } else {
            a2 = z1.a(yVar, view, i17, z10);
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
            int a10 = this.f16249c.a(makeMeasureSpec, a2);
            if (a10 > 0) {
                i11 = this.f16249c.getPaddingBottom() + this.f16249c.getPaddingTop() + i10;
            } else {
                i11 = 0;
            }
            i12 = a10 + i11;
        }
        if (yVar.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        yVar.setWindowLayoutType(this.f16251n);
        if (yVar.isShowing()) {
            View view2 = this.E;
            WeakHashMap weakHashMap = r0.i0.f45241a;
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
                        yVar.setWidth(i14);
                        yVar.setHeight(0);
                    } else {
                        if (this.e == -1) {
                            i15 = -1;
                        }
                        yVar.setWidth(i15);
                        yVar.setHeight(-1);
                    }
                } else if (i18 == -2) {
                    i18 = i12;
                }
                yVar.setOutsideTouchable(true);
                View view3 = this.E;
                int i21 = i20;
                int i22 = this.f16250f;
                int i23 = this.h;
                if (i21 < 0) {
                    i13 = -1;
                } else {
                    i13 = i21;
                }
                if (i18 < 0) {
                    i18 = -1;
                }
                yVar.update(view3, i22, i23, i13, i18);
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
        yVar.setWidth(i24);
        yVar.setHeight(i18);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = P;
            if (method2 != null) {
                try {
                    method2.invoke(yVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            a2.b(yVar, true);
        }
        yVar.setOutsideTouchable(true);
        yVar.setTouchInterceptor(this.H);
        if (this.v) {
            yVar.setOverlapAnchor(this.f16253s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = R;
            if (method3 != null) {
                try {
                    method3.invoke(yVar, this.M);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            a2.a(yVar, this.M);
        }
        yVar.showAsDropDown(this.E, this.f16250f, this.h, this.f16254w);
        this.f16249c.setSelection(-1);
        if ((!this.N || this.f16249c.isInTouchMode()) && (s1Var = this.f16249c) != null) {
            s1Var.setListSelectionHidden(true);
            s1Var.requestLayout();
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
        this.f16252r = true;
    }

    public final int n() {
        if (!this.f16252r) {
            return 0;
        }
        return this.h;
    }

    public void o(ListAdapter listAdapter) {
        h1.a aVar = this.f16256y;
        if (aVar == null) {
            this.f16256y = new h1.a(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f16248b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(aVar);
            }
        }
        this.f16248b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f16256y);
        }
        s1 s1Var = this.f16249c;
        if (s1Var != null) {
            s1Var.setAdapter(this.f16248b);
        }
    }

    public s1 p(Context context, boolean z10) {
        return new s1(context, z10);
    }

    public final void r(int i10) {
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
