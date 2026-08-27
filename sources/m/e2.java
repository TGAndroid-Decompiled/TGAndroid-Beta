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
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import h7.o7;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public abstract class e2 implements l.c0 {
    public static final Method L;
    public static final Method M;
    public static final Method N;
    public View A;
    public AdapterView.OnItemClickListener B;
    public final d2 D;
    public final b2 F;
    public final Handler G;
    public Rect I;
    public boolean J;
    public final y K;

    public final Context f17305a;

    public ListAdapter f17306b;

    public s1 f17307c;

    public int f17309f;
    public int h;

    public boolean f17311r;

    public boolean f17312s;
    public boolean v;

    public h1.a f17315y;
    public final int d = -2;

    public int f17308e = -2;

    public final int f17310n = 1002;

    public int f17313w = 0;

    public final int f17314x = Integer.MAX_VALUE;
    public final b2 C = new b2(this, 1);
    public final c2 E = new c2(this);
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
        int resourceId;
        int i11 = 0;
        this.D = new d2(this, i11);
        this.F = new b2(this, i11);
        this.f17305a = context;
        this.G = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f5586o, i10, 0);
        this.f17309f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f17311r = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        y yVar = new y(context, attributeSet, i10, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f5590s, i10, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            o7.a(yVar, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        yVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : g7.o7.b(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.K = yVar;
        yVar.setInputMethodMode(1);
    }

    @Override
    public final boolean a() {
        return this.K.isShowing();
    }

    public final int b() {
        return this.f17309f;
    }

    public final void c(int i10) {
        this.f17309f = i10;
    }

    @Override
    public final void dismiss() {
        y yVar = this.K;
        yVar.dismiss();
        yVar.setContentView(null);
        this.f17307c = null;
        this.G.removeCallbacks(this.C);
    }

    public final Drawable e() {
        return this.K.getBackground();
    }

    @Override
    public final s1 f() {
        return this.f17307c;
    }

    @Override
    public final void g() {
        int i10;
        int iA;
        int iMakeMeasureSpec;
        int paddingBottom;
        s1 s1Var;
        s1 s1Var2 = this.f17307c;
        Context context = this.f17305a;
        y yVar = this.K;
        if (s1Var2 == null) {
            s1 s1VarP = p(context, !this.J);
            this.f17307c = s1VarP;
            s1VarP.setAdapter(this.f17306b);
            this.f17307c.setOnItemClickListener(this.B);
            this.f17307c.setFocusable(true);
            this.f17307c.setFocusableInTouchMode(true);
            this.f17307c.setOnItemSelectedListener(new y1(this, 0));
            this.f17307c.setOnScrollListener(this.E);
            yVar.setContentView(this.f17307c);
        }
        Drawable background = yVar.getBackground();
        Rect rect = this.H;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i10 = rect.bottom + i11;
            if (!this.f17311r) {
                this.h = -i11;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        boolean z10 = yVar.getInputMethodMode() == 2;
        View view = this.A;
        int i12 = this.h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = M;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(yVar, view, Integer.valueOf(i12), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    iA = yVar.getMaxAvailableHeight(view, i12);
                }
            } else {
                iA = yVar.getMaxAvailableHeight(view, i12);
            }
        } else {
            iA = z1.a(yVar, view, i12, z10);
        }
        int i13 = this.d;
        if (i13 == -1) {
            paddingBottom = iA + i10;
        } else {
            int i14 = this.f17308e;
            if (i14 != -2) {
                iMakeMeasureSpec = i14 != -1 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.f17307c.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f17307c.getPaddingBottom() + this.f17307c.getPaddingTop() + i10 : 0);
        }
        boolean z11 = yVar.getInputMethodMode() == 2;
        o7.b(yVar, this.f17310n);
        if (yVar.isShowing()) {
            View view2 = this.A;
            WeakHashMap weakHashMap = r0.j0.f46605a;
            if (view2.isAttachedToWindow()) {
                int width = this.f17308e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.A.getWidth();
                }
                if (i13 == -1) {
                    i13 = z11 ? paddingBottom : -1;
                    if (z11) {
                        yVar.setWidth(this.f17308e == -1 ? -1 : 0);
                        yVar.setHeight(0);
                    } else {
                        yVar.setWidth(this.f17308e == -1 ? -1 : 0);
                        yVar.setHeight(-1);
                    }
                } else if (i13 == -2) {
                    i13 = paddingBottom;
                }
                yVar.setOutsideTouchable(true);
                View view3 = this.A;
                int i15 = width;
                int i16 = this.f17309f;
                int i17 = this.h;
                int i18 = i15 < 0 ? -1 : i15;
                if (i13 < 0) {
                    i13 = -1;
                }
                yVar.update(view3, i16, i17, i18, i13);
                return;
            }
            return;
        }
        int width2 = this.f17308e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.A.getWidth();
        }
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = paddingBottom;
        }
        yVar.setWidth(width2);
        yVar.setHeight(i13);
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
            o7.a(yVar, this.f17312s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = N;
            if (method3 != null) {
                try {
                    method3.invoke(yVar, this.I);
                } catch (Exception e9) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e9);
                }
            }
        } else {
            a2.a(yVar, this.I);
        }
        yVar.showAsDropDown(this.A, this.f17309f, this.h, this.f17313w);
        this.f17307c.setSelection(-1);
        if ((!this.J || this.f17307c.isInTouchMode()) && (s1Var = this.f17307c) != null) {
            s1Var.setListSelectionHidden(true);
            s1Var.requestLayout();
        }
        if (this.J) {
            return;
        }
        this.G.post(this.F);
    }

    public final void i(Drawable drawable) {
        this.K.setBackgroundDrawable(drawable);
    }

    public final void k(int i10) {
        this.h = i10;
        this.f17311r = true;
    }

    public final int n() {
        if (this.f17311r) {
            return this.h;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        h1.a aVar = this.f17315y;
        if (aVar == null) {
            this.f17315y = new h1.a(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f17306b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(aVar);
            }
        }
        this.f17306b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f17315y);
        }
        s1 s1Var = this.f17307c;
        if (s1Var != null) {
            s1Var.setAdapter(this.f17306b);
        }
    }

    public s1 p(Context context, boolean z10) {
        return new s1(context, z10);
    }

    public final void q(int i10) {
        Drawable background = this.K.getBackground();
        if (background == null) {
            this.f17308e = i10;
            return;
        }
        Rect rect = this.H;
        background.getPadding(rect);
        this.f17308e = rect.left + rect.right + i10;
    }
}
