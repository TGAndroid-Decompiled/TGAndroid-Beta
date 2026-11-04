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
import b8.oc;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
public abstract class d2 implements l.b0 {
    public static final Method Q;
    public static final Method R;
    public static final Method S;
    public b5.i E;
    public View F;
    public AdapterView.OnItemClickListener G;
    public final Handler L;
    public Rect N;
    public boolean O;
    public final x P;
    public final Context f18558a;
    public ListAdapter f18559b;
    public r1 f18560c;
    public int f18562f;
    public int h;
    public boolean f18564r;
    public boolean f18565s;
    public boolean f18566w;
    public final int d = -2;
    public int f18561e = -2;
    public final int f18563n = 1002;
    public int f18567x = 0;
    public final int f18568y = Integer.MAX_VALUE;
    public final a2 H = new a2(this, 1);
    public final c2 I = new c2(this, 0);
    public final b2 J = new b2(this);
    public final a2 K = new a2(this, 0);
    public final Rect M = new Rect();

    static {
        int i3 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i3 <= 28) {
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

    public d2(Context context, AttributeSet attributeSet, int i3) {
        Drawable drawable;
        int resourceId;
        this.f18558a = context;
        this.L = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f11319o, i3, 0);
        this.f18562f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f18564r = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i3, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f11323s, i3, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = oc.b(context, resourceId);
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
        return this.f18562f;
    }

    public final void c(int i3) {
        this.f18562f = i3;
    }

    @Override
    public final void dismiss() {
        x xVar = this.P;
        xVar.dismiss();
        xVar.setContentView(null);
        this.f18560c = null;
        this.L.removeCallbacks(this.H);
    }

    @Override
    public final r1 f() {
        return this.f18560c;
    }

    @Override
    public final void g() {
        int i3;
        boolean z10;
        int a10;
        int makeMeasureSpec;
        int i10;
        int i11;
        boolean z11;
        r1 r1Var;
        int i12;
        int i13;
        r1 r1Var2 = this.f18560c;
        Context context = this.f18558a;
        x xVar = this.P;
        int i14 = 0;
        if (r1Var2 == null) {
            r1 p10 = p(context, !this.O);
            this.f18560c = p10;
            p10.setAdapter(this.f18559b);
            this.f18560c.setOnItemClickListener(this.G);
            this.f18560c.setFocusable(true);
            this.f18560c.setFocusableInTouchMode(true);
            this.f18560c.setOnItemSelectedListener(new x1(this, 0));
            this.f18560c.setOnScrollListener(this.J);
            xVar.setContentView(this.f18560c);
        } else {
            ViewGroup viewGroup = (ViewGroup) xVar.getContentView();
        }
        Drawable background = xVar.getBackground();
        Rect rect = this.M;
        if (background != null) {
            background.getPadding(rect);
            int i15 = rect.top;
            i3 = rect.bottom + i15;
            if (!this.f18564r) {
                this.h = -i15;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        if (xVar.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = this.F;
        int i16 = this.h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = R;
            if (method != null) {
                try {
                    a10 = ((Integer) method.invoke(xVar, view, Integer.valueOf(i16), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a10 = xVar.getMaxAvailableHeight(view, i16);
        } else {
            a10 = y1.a(xVar, view, i16, z10);
        }
        int i17 = this.d;
        if (i17 == -1) {
            i11 = a10 + i3;
        } else {
            int i18 = this.f18561e;
            if (i18 != -2) {
                if (i18 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a11 = this.f18560c.a(makeMeasureSpec, a10);
            if (a11 > 0) {
                i10 = this.f18560c.getPaddingBottom() + this.f18560c.getPaddingTop() + i3;
            } else {
                i10 = 0;
            }
            i11 = a11 + i10;
        }
        if (xVar.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        xVar.setWindowLayoutType(this.f18563n);
        if (xVar.isShowing()) {
            View view2 = this.F;
            WeakHashMap weakHashMap = r0.i0.f54015a;
            if (view2.isAttachedToWindow()) {
                int i19 = this.f18561e;
                if (i19 == -1) {
                    i19 = -1;
                } else if (i19 == -2) {
                    i19 = this.F.getWidth();
                }
                if (i17 == -1) {
                    if (z11) {
                        i17 = i11;
                    } else {
                        i17 = -1;
                    }
                    if (z11) {
                        if (this.f18561e == -1) {
                            i13 = -1;
                        } else {
                            i13 = 0;
                        }
                        xVar.setWidth(i13);
                        xVar.setHeight(0);
                    } else {
                        if (this.f18561e == -1) {
                            i14 = -1;
                        }
                        xVar.setWidth(i14);
                        xVar.setHeight(-1);
                    }
                } else if (i17 == -2) {
                    i17 = i11;
                }
                xVar.setOutsideTouchable(true);
                View view3 = this.F;
                int i20 = i19;
                int i21 = this.f18562f;
                int i22 = this.h;
                if (i20 < 0) {
                    i12 = -1;
                } else {
                    i12 = i20;
                }
                if (i17 < 0) {
                    i17 = -1;
                }
                xVar.update(view3, i21, i22, i12, i17);
                return;
            }
            return;
        }
        int i23 = this.f18561e;
        if (i23 == -1) {
            i23 = -1;
        } else if (i23 == -2) {
            i23 = this.F.getWidth();
        }
        if (i17 == -1) {
            i17 = -1;
        } else if (i17 == -2) {
            i17 = i11;
        }
        xVar.setWidth(i23);
        xVar.setHeight(i17);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = Q;
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
        xVar.setTouchInterceptor(this.I);
        if (this.f18566w) {
            xVar.setOverlapAnchor(this.f18565s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = S;
            if (method3 != null) {
                try {
                    method3.invoke(xVar, this.N);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            z1.a(xVar, this.N);
        }
        xVar.showAsDropDown(this.F, this.f18562f, this.h, this.f18567x);
        this.f18560c.setSelection(-1);
        if ((!this.O || this.f18560c.isInTouchMode()) && (r1Var = this.f18560c) != null) {
            r1Var.setListSelectionHidden(true);
            r1Var.requestLayout();
        }
        if (!this.O) {
            this.L.post(this.K);
        }
    }

    public final Drawable h() {
        return this.P.getBackground();
    }

    public final void j(Drawable drawable) {
        this.P.setBackgroundDrawable(drawable);
    }

    public final void k(int i3) {
        this.h = i3;
        this.f18564r = true;
    }

    public final int n() {
        if (!this.f18564r) {
            return 0;
        }
        return this.h;
    }

    public void o(ListAdapter listAdapter) {
        b5.i iVar = this.E;
        if (iVar == null) {
            this.E = new b5.i(this, 2);
        } else {
            ListAdapter listAdapter2 = this.f18559b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(iVar);
            }
        }
        this.f18559b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.E);
        }
        r1 r1Var = this.f18560c;
        if (r1Var != null) {
            r1Var.setAdapter(this.f18559b);
        }
    }

    public r1 p(Context context, boolean z10) {
        return new r1(context, z10);
    }

    public final void q(int i3) {
        Drawable background = this.P.getBackground();
        if (background != null) {
            Rect rect = this.M;
            background.getPadding(rect);
            this.f18561e = rect.left + rect.right + i3;
            return;
        }
        this.f18561e = i3;
    }
}
