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
import f7.t7;
import g7.q7;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
public abstract class e2 implements l.b0 {
    public static final Method L;
    public static final Method M;
    public static final Method N;
    public View A;
    public AdapterView.OnItemClickListener B;
    public final Handler G;
    public Rect I;
    public boolean J;
    public final y K;
    public final Context f16930a;
    public ListAdapter f16931b;
    public s1 f16932c;
    public int f16934f;
    public int h;
    public boolean f16936r;
    public boolean f16937s;
    public boolean v;
    public h1.a f16940y;
    public final int d = -2;
    public int f16933e = -2;
    public final int f16935n = 1002;
    public int f16938w = 0;
    public final int f16939x = Integer.MAX_VALUE;
    public final b2 C = new b2(this, 1);
    public final d2 D = new d2(this, 0);
    public final c2 E = new c2(this);
    public final b2 F = new b2(this, 0);
    public final Rect H = new Rect();

    static {
        int i9 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i9 <= 28) {
            try {
                L = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                N = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                M = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public e2(Context context, AttributeSet attributeSet, int i9) {
        Drawable drawable;
        int resourceId;
        this.f16930a = context;
        this.G = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f5281o, i9, 0);
        this.f16934f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f16936r = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i9, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f5285s, i9, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            q7.a(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = t7.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.K = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override
    public final boolean a() {
        return this.K.isShowing();
    }

    public final int b() {
        return this.f16934f;
    }

    public final void c(int i9) {
        this.f16934f = i9;
    }

    @Override
    public final void dismiss() {
        y yVar = this.K;
        yVar.dismiss();
        yVar.setContentView(null);
        this.f16932c = null;
        this.G.removeCallbacks(this.C);
    }

    public final Drawable e() {
        return this.K.getBackground();
    }

    @Override
    public final s1 f() {
        return this.f16932c;
    }

    @Override
    public final void g() {
        int i9;
        boolean z10;
        int a2;
        int makeMeasureSpec;
        int i10;
        int i11;
        boolean z11;
        s1 s1Var;
        int i12;
        int i13;
        s1 s1Var2 = this.f16932c;
        Context context = this.f16930a;
        y yVar = this.K;
        int i14 = 0;
        if (s1Var2 == null) {
            s1 p6 = p(context, !this.J);
            this.f16932c = p6;
            p6.setAdapter(this.f16931b);
            this.f16932c.setOnItemClickListener(this.B);
            this.f16932c.setFocusable(true);
            this.f16932c.setFocusableInTouchMode(true);
            this.f16932c.setOnItemSelectedListener(new y1(this, 0));
            this.f16932c.setOnScrollListener(this.E);
            yVar.setContentView(this.f16932c);
        } else {
            ViewGroup viewGroup = (ViewGroup) yVar.getContentView();
        }
        Drawable background = yVar.getBackground();
        Rect rect = this.H;
        if (background != null) {
            background.getPadding(rect);
            int i15 = rect.top;
            i9 = rect.bottom + i15;
            if (!this.f16936r) {
                this.h = -i15;
            }
        } else {
            rect.setEmpty();
            i9 = 0;
        }
        if (yVar.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = this.A;
        int i16 = this.h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = M;
            if (method != null) {
                try {
                    a2 = ((Integer) method.invoke(yVar, view, Integer.valueOf(i16), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a2 = yVar.getMaxAvailableHeight(view, i16);
        } else {
            a2 = z1.a(yVar, view, i16, z10);
        }
        int i17 = this.d;
        if (i17 == -1) {
            i11 = a2 + i9;
        } else {
            int i18 = this.f16933e;
            if (i18 != -2) {
                if (i18 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a3 = this.f16932c.a(makeMeasureSpec, a2);
            if (a3 > 0) {
                i10 = this.f16932c.getPaddingBottom() + this.f16932c.getPaddingTop() + i9;
            } else {
                i10 = 0;
            }
            i11 = a3 + i10;
        }
        if (yVar.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        q7.b(yVar, this.f16935n);
        if (yVar.isShowing()) {
            View view2 = this.A;
            WeakHashMap weakHashMap = r0.j0.f46915a;
            if (view2.isAttachedToWindow()) {
                int i19 = this.f16933e;
                if (i19 == -1) {
                    i19 = -1;
                } else if (i19 == -2) {
                    i19 = this.A.getWidth();
                }
                if (i17 == -1) {
                    if (z11) {
                        i17 = i11;
                    } else {
                        i17 = -1;
                    }
                    if (z11) {
                        if (this.f16933e == -1) {
                            i13 = -1;
                        } else {
                            i13 = 0;
                        }
                        yVar.setWidth(i13);
                        yVar.setHeight(0);
                    } else {
                        if (this.f16933e == -1) {
                            i14 = -1;
                        }
                        yVar.setWidth(i14);
                        yVar.setHeight(-1);
                    }
                } else if (i17 == -2) {
                    i17 = i11;
                }
                yVar.setOutsideTouchable(true);
                View view3 = this.A;
                int i20 = i19;
                int i21 = this.f16934f;
                int i22 = this.h;
                if (i20 < 0) {
                    i12 = -1;
                } else {
                    i12 = i20;
                }
                if (i17 < 0) {
                    i17 = -1;
                }
                yVar.update(view3, i21, i22, i12, i17);
                return;
            }
            return;
        }
        int i23 = this.f16933e;
        if (i23 == -1) {
            i23 = -1;
        } else if (i23 == -2) {
            i23 = this.A.getWidth();
        }
        if (i17 == -1) {
            i17 = -1;
        } else if (i17 == -2) {
            i17 = i11;
        }
        yVar.setWidth(i23);
        yVar.setHeight(i17);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = L;
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
        yVar.setTouchInterceptor(this.D);
        if (this.v) {
            q7.a(yVar, this.f16937s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = N;
            if (method3 != null) {
                try {
                    method3.invoke(yVar, this.I);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            a2.a(yVar, this.I);
        }
        yVar.showAsDropDown(this.A, this.f16934f, this.h, this.f16938w);
        this.f16932c.setSelection(-1);
        if ((!this.J || this.f16932c.isInTouchMode()) && (s1Var = this.f16932c) != null) {
            s1Var.setListSelectionHidden(true);
            s1Var.requestLayout();
        }
        if (!this.J) {
            this.G.post(this.F);
        }
    }

    public final void i(Drawable drawable) {
        this.K.setBackgroundDrawable(drawable);
    }

    public final void j(int i9) {
        this.h = i9;
        this.f16936r = true;
    }

    public final int n() {
        if (!this.f16936r) {
            return 0;
        }
        return this.h;
    }

    public void o(ListAdapter listAdapter) {
        h1.a aVar = this.f16940y;
        if (aVar == null) {
            this.f16940y = new h1.a(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f16931b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(aVar);
            }
        }
        this.f16931b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f16940y);
        }
        s1 s1Var = this.f16932c;
        if (s1Var != null) {
            s1Var.setAdapter(this.f16931b);
        }
    }

    public s1 p(Context context, boolean z10) {
        return new s1(context, z10);
    }

    public final void q(int i9) {
        Drawable background = this.K.getBackground();
        if (background != null) {
            Rect rect = this.H;
            background.getPadding(rect);
            this.f16933e = rect.left + rect.right + i9;
            return;
        }
        this.f16933e = i9;
    }
}
