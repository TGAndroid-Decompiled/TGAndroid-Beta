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
public abstract class e2 implements l.b0 {
    public static final Method P;
    public static final Method Q;
    public static final Method R;
    public c5.h D;
    public View E;
    public AdapterView.OnItemClickListener F;
    public final Handler K;
    public Rect M;
    public boolean N;
    public final y O;
    public final Context f19085a;
    public ListAdapter f19086b;
    public s1 f19087c;
    public int f19089f;
    public int h;
    public boolean f19091r;
    public boolean f19092s;
    public boolean f19093w;
    public final int d = -2;
    public int f19088e = -2;
    public final int f19090n = 1002;
    public int f19094x = 0;
    public final int f19095y = Integer.MAX_VALUE;
    public final b2 G = new b2(this, 1);
    public final d2 H = new d2(this, 0);
    public final c2 I = new c2(this);
    public final b2 J = new b2(this, 0);
    public final Rect L = new Rect();

    static {
        int i7 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i7 <= 28) {
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

    public e2(Context context, AttributeSet attributeSet, int i7) {
        Drawable drawable;
        int resourceId;
        this.f19085a = context;
        this.K = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f10867o, i7, 0);
        this.f19089f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f19091r = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i7, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f10871s, i7, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = b5.a.b(context, resourceId);
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
        return this.f19089f;
    }

    public final void c(int i7) {
        this.f19089f = i7;
    }

    @Override
    public final void dismiss() {
        y yVar = this.O;
        yVar.dismiss();
        yVar.setContentView(null);
        this.f19087c = null;
        this.K.removeCallbacks(this.G);
    }

    public final Drawable e() {
        return this.O.getBackground();
    }

    @Override
    public final s1 f() {
        return this.f19087c;
    }

    @Override
    public final void g() {
        int i7;
        boolean z9;
        int a10;
        int makeMeasureSpec;
        int i10;
        int i11;
        boolean z10;
        s1 s1Var;
        int i12;
        int i13;
        s1 s1Var2 = this.f19087c;
        Context context = this.f19085a;
        y yVar = this.O;
        int i14 = 0;
        if (s1Var2 == null) {
            s1 o4 = o(context, !this.N);
            this.f19087c = o4;
            o4.setAdapter(this.f19086b);
            this.f19087c.setOnItemClickListener(this.F);
            this.f19087c.setFocusable(true);
            this.f19087c.setFocusableInTouchMode(true);
            this.f19087c.setOnItemSelectedListener(new y1(this, 0));
            this.f19087c.setOnScrollListener(this.I);
            yVar.setContentView(this.f19087c);
        } else {
            ViewGroup viewGroup = (ViewGroup) yVar.getContentView();
        }
        Drawable background = yVar.getBackground();
        Rect rect = this.L;
        if (background != null) {
            background.getPadding(rect);
            int i15 = rect.top;
            i7 = rect.bottom + i15;
            if (!this.f19091r) {
                this.h = -i15;
            }
        } else {
            rect.setEmpty();
            i7 = 0;
        }
        if (yVar.getInputMethodMode() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        View view = this.E;
        int i16 = this.h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = Q;
            if (method != null) {
                try {
                    a10 = ((Integer) method.invoke(yVar, view, Integer.valueOf(i16), Boolean.valueOf(z9))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a10 = yVar.getMaxAvailableHeight(view, i16);
        } else {
            a10 = z1.a(yVar, view, i16, z9);
        }
        int i17 = this.d;
        if (i17 == -1) {
            i11 = a10 + i7;
        } else {
            int i18 = this.f19088e;
            if (i18 != -2) {
                if (i18 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a11 = this.f19087c.a(makeMeasureSpec, a10);
            if (a11 > 0) {
                i10 = this.f19087c.getPaddingBottom() + this.f19087c.getPaddingTop() + i7;
            } else {
                i10 = 0;
            }
            i11 = a11 + i10;
        }
        if (yVar.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        yVar.setWindowLayoutType(this.f19090n);
        if (yVar.isShowing()) {
            View view2 = this.E;
            WeakHashMap weakHashMap = r0.i0.f54097a;
            if (view2.isAttachedToWindow()) {
                int i19 = this.f19088e;
                if (i19 == -1) {
                    i19 = -1;
                } else if (i19 == -2) {
                    i19 = this.E.getWidth();
                }
                if (i17 == -1) {
                    if (z10) {
                        i17 = i11;
                    } else {
                        i17 = -1;
                    }
                    if (z10) {
                        if (this.f19088e == -1) {
                            i13 = -1;
                        } else {
                            i13 = 0;
                        }
                        yVar.setWidth(i13);
                        yVar.setHeight(0);
                    } else {
                        if (this.f19088e == -1) {
                            i14 = -1;
                        }
                        yVar.setWidth(i14);
                        yVar.setHeight(-1);
                    }
                } else if (i17 == -2) {
                    i17 = i11;
                }
                yVar.setOutsideTouchable(true);
                View view3 = this.E;
                int i20 = i19;
                int i21 = this.f19089f;
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
        int i23 = this.f19088e;
        if (i23 == -1) {
            i23 = -1;
        } else if (i23 == -2) {
            i23 = this.E.getWidth();
        }
        if (i17 == -1) {
            i17 = -1;
        } else if (i17 == -2) {
            i17 = i11;
        }
        yVar.setWidth(i23);
        yVar.setHeight(i17);
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
        if (this.f19093w) {
            yVar.setOverlapAnchor(this.f19092s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = R;
            if (method3 != null) {
                try {
                    method3.invoke(yVar, this.M);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            a2.a(yVar, this.M);
        }
        yVar.showAsDropDown(this.E, this.f19089f, this.h, this.f19094x);
        this.f19087c.setSelection(-1);
        if ((!this.N || this.f19087c.isInTouchMode()) && (s1Var = this.f19087c) != null) {
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

    public final void j(int i7) {
        this.h = i7;
        this.f19091r = true;
    }

    public final int m() {
        if (!this.f19091r) {
            return 0;
        }
        return this.h;
    }

    public void n(ListAdapter listAdapter) {
        c5.h hVar = this.D;
        if (hVar == null) {
            this.D = new c5.h(this, 2);
        } else {
            ListAdapter listAdapter2 = this.f19086b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(hVar);
            }
        }
        this.f19086b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.D);
        }
        s1 s1Var = this.f19087c;
        if (s1Var != null) {
            s1Var.setAdapter(this.f19086b);
        }
    }

    public s1 o(Context context, boolean z9) {
        return new s1(context, z9);
    }

    public final void p(int i7) {
        Drawable background = this.O.getBackground();
        if (background != null) {
            Rect rect = this.L;
            background.getPadding(rect);
            this.f19088e = rect.left + rect.right + i7;
            return;
        }
        this.f19088e = i7;
    }
}
