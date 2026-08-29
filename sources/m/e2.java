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
import h7.s7;
import i7.c8;
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
    public final Context f16529a;
    public ListAdapter f16530b;
    public s1 f16531c;
    public int f16533f;
    public int h;
    public boolean f16535r;
    public boolean f16536s;
    public boolean v;
    public h1.a f16539y;
    public final int d = -2;
    public int f16532e = -2;
    public final int f16534n = 1002;
    public int f16537w = 0;
    public final int f16538x = Integer.MAX_VALUE;
    public final b2 C = new b2(this, 1);
    public final d2 D = new d2(this, 0);
    public final c2 E = new c2(this);
    public final b2 F = new b2(this, 0);
    public final Rect H = new Rect();

    static {
        int i10 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i10 <= 28) {
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

    public e2(Context context, AttributeSet attributeSet, int i10) {
        Drawable drawable;
        int resourceId;
        this.f16529a = context;
        this.G = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f6243o, i10, 0);
        this.f16533f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f16535r = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i10, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f6247s, i10, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            c8.a(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = s7.b(context, resourceId);
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
        return this.f16533f;
    }

    public final void c(int i10) {
        this.f16533f = i10;
    }

    @Override
    public final void dismiss() {
        y yVar = this.K;
        yVar.dismiss();
        yVar.setContentView(null);
        this.f16531c = null;
        this.G.removeCallbacks(this.C);
    }

    public final Drawable e() {
        return this.K.getBackground();
    }

    @Override
    public final s1 f() {
        return this.f16531c;
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
        s1 s1Var;
        int i13;
        int i14;
        s1 s1Var2 = this.f16531c;
        Context context = this.f16529a;
        y yVar = this.K;
        int i15 = 0;
        if (s1Var2 == null) {
            s1 q6 = q(context, !this.J);
            this.f16531c = q6;
            q6.setAdapter(this.f16530b);
            this.f16531c.setOnItemClickListener(this.B);
            this.f16531c.setFocusable(true);
            this.f16531c.setFocusableInTouchMode(true);
            this.f16531c.setOnItemSelectedListener(new y1(this, 0));
            this.f16531c.setOnScrollListener(this.E);
            yVar.setContentView(this.f16531c);
        } else {
            ViewGroup viewGroup = (ViewGroup) yVar.getContentView();
        }
        Drawable background = yVar.getBackground();
        Rect rect = this.H;
        if (background != null) {
            background.getPadding(rect);
            int i16 = rect.top;
            i10 = rect.bottom + i16;
            if (!this.f16535r) {
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
        View view = this.A;
        int i17 = this.h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = M;
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
            int i19 = this.f16532e;
            if (i19 != -2) {
                if (i19 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a10 = this.f16531c.a(makeMeasureSpec, a2);
            if (a10 > 0) {
                i11 = this.f16531c.getPaddingBottom() + this.f16531c.getPaddingTop() + i10;
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
        c8.b(yVar, this.f16534n);
        if (yVar.isShowing()) {
            View view2 = this.A;
            WeakHashMap weakHashMap = r0.j0.f46829a;
            if (view2.isAttachedToWindow()) {
                int i20 = this.f16532e;
                if (i20 == -1) {
                    i20 = -1;
                } else if (i20 == -2) {
                    i20 = this.A.getWidth();
                }
                if (i18 == -1) {
                    if (z11) {
                        i18 = i12;
                    } else {
                        i18 = -1;
                    }
                    if (z11) {
                        if (this.f16532e == -1) {
                            i14 = -1;
                        } else {
                            i14 = 0;
                        }
                        yVar.setWidth(i14);
                        yVar.setHeight(0);
                    } else {
                        if (this.f16532e == -1) {
                            i15 = -1;
                        }
                        yVar.setWidth(i15);
                        yVar.setHeight(-1);
                    }
                } else if (i18 == -2) {
                    i18 = i12;
                }
                yVar.setOutsideTouchable(true);
                View view3 = this.A;
                int i21 = i20;
                int i22 = this.f16533f;
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
        int i24 = this.f16532e;
        if (i24 == -1) {
            i24 = -1;
        } else if (i24 == -2) {
            i24 = this.A.getWidth();
        }
        if (i18 == -1) {
            i18 = -1;
        } else if (i18 == -2) {
            i18 = i12;
        }
        yVar.setWidth(i24);
        yVar.setHeight(i18);
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
            c8.a(yVar, this.f16536s);
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
        yVar.showAsDropDown(this.A, this.f16533f, this.h, this.f16537w);
        this.f16531c.setSelection(-1);
        if ((!this.J || this.f16531c.isInTouchMode()) && (s1Var = this.f16531c) != null) {
            s1Var.setListSelectionHidden(true);
            s1Var.requestLayout();
        }
        if (!this.J) {
            this.G.post(this.F);
        }
    }

    public final void j(Drawable drawable) {
        this.K.setBackgroundDrawable(drawable);
    }

    public final void k(int i10) {
        this.h = i10;
        this.f16535r = true;
    }

    public final int n() {
        if (!this.f16535r) {
            return 0;
        }
        return this.h;
    }

    public void p(ListAdapter listAdapter) {
        h1.a aVar = this.f16539y;
        if (aVar == null) {
            this.f16539y = new h1.a(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f16530b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(aVar);
            }
        }
        this.f16530b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f16539y);
        }
        s1 s1Var = this.f16531c;
        if (s1Var != null) {
            s1Var.setAdapter(this.f16530b);
        }
    }

    public s1 q(Context context, boolean z10) {
        return new s1(context, z10);
    }

    public final void r(int i10) {
        Drawable background = this.K.getBackground();
        if (background != null) {
            Rect rect = this.H;
            background.getPadding(rect);
            this.f16532e = rect.left + rect.right + i10;
            return;
        }
        this.f16532e = i10;
    }
}
