package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
public final class bp extends po implements wz6, LayoutInflater.Factory2 {
    public static final aia r0 = new aia(0);
    public static final int[] s0 = {16842836};
    public static final boolean t0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView E;
    public PopupWindow F;
    public qo G;
    public afc H;
    public final boolean I;
    public boolean J;
    public ViewGroup K;
    public TextView L;
    public View M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public ap[] V;
    public ap W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public Configuration b0;
    public final int c0;
    public final dp d;
    public int d0;
    public final Context e;
    public int e0;
    public Window f;
    public boolean f0;
    public xo g0;
    public wo h;
    public xo h0;
    public boolean i0;
    public int j0;
    public final qo k0;
    public boolean l0;
    public Rect m0;
    public zwc n;
    public Rect n0;
    public cr o0;
    public OnBackInvokedDispatcher p0;
    public OnBackInvokedCallback q0;
    public CharSequence r;
    public ActionBarOverlayLayout s;
    public lj9 w;
    public qx4 x;
    public f9 y;

    public bp(dp dpVar, dp dpVar2) {
        Context context = dpVar.getContext();
        Window window = dpVar.getWindow();
        this.H = null;
        this.I = true;
        this.c0 = -100;
        this.k0 = new qo(this, (byte) 0);
        this.e = context;
        this.d = dpVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.c0 == -100) {
            String name = this.d.getClass().getName();
            aia aiaVar = r0;
            Integer num = (Integer) aiaVar.get(name);
            if (num != null) {
                this.c0 = num.intValue();
                aiaVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            e(window);
        }
        fp.c();
    }

    @Override
    public final boolean B(yz6 yz6Var, MenuItem menuItem) {
        int i;
        ap apVar;
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.a0) {
            yz6 k = yz6Var.k();
            ap[] apVarArr = this.V;
            if (apVarArr != null) {
                i = apVarArr.length;
            } else {
                i = 0;
            }
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    apVar = apVarArr[i2];
                    if (apVar != null && apVar.h == k) {
                        break;
                    }
                    i2++;
                } else {
                    apVar = null;
                    break;
                }
            }
            if (apVar != null) {
                return callback.onMenuItemSelected(apVar.a, menuItem);
            }
        }
        return false;
    }

    @Override
    public final void a() {
        this.Y = true;
        d(false);
        l();
        this.b0 = new Configuration(this.e.getResources().getConfiguration());
        this.Z = true;
    }

    @Override
    public final boolean c(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.T && i == 108) {
            return false;
        }
        if (this.P && i == 1) {
            this.P = false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    if (i != 10) {
                        if (i != 108) {
                            if (i != 109) {
                                return this.f.requestFeature(i);
                            }
                            v();
                            this.Q = true;
                            return true;
                        }
                        v();
                        this.P = true;
                        return true;
                    }
                    v();
                    this.R = true;
                    return true;
                }
                v();
                this.O = true;
                return true;
            }
            v();
            this.N = true;
            return true;
        }
        v();
        this.T = true;
        return true;
    }

    public final boolean d(boolean z) {
        int i;
        char c;
        Object obj;
        boolean z2 = false;
        if (this.a0) {
            return false;
        }
        int i2 = this.c0;
        if (i2 == -100) {
            i2 = po.a;
        }
        Context context = this.e;
        int i3 = -1;
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 == 3) {
                            xo xoVar = this.h0;
                            if (xoVar == null) {
                                xoVar = new xo(this, context);
                                this.h0 = xoVar;
                            }
                            i3 = xoVar.e();
                        } else {
                            sc8.j("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return false;
                        }
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    i3 = n(context).e();
                }
            }
            i3 = i2;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                i = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            } else {
                i = 32;
            }
        } else {
            i = 16;
        }
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.uiMode = i | (configuration.uiMode & (-49));
        this.f0 = true;
        Configuration configuration2 = this.b0;
        if (configuration2 == null) {
            configuration2 = context.getResources().getConfiguration();
        }
        int i4 = configuration2.uiMode & 48;
        int i5 = configuration.uiMode & 48;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 24) {
            to.b(configuration2);
        } else {
            m96.b(so.a(configuration2.locale));
        }
        if (i4 != i5) {
            c = 512;
        } else {
            c = 0;
        }
        if (c != 0) {
            Resources resources = context.getResources();
            Configuration configuration3 = new Configuration(resources.getConfiguration());
            configuration3.uiMode = i5 | (resources.getConfiguration().uiMode & (-49));
            Object obj2 = null;
            resources.updateConfiguration(configuration3, null);
            if (i6 < 26 && i6 < 28) {
                if (i6 >= 24) {
                    if (!mse.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            mse.g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                        }
                        mse.h = true;
                    }
                    Field field = mse.g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e2) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!mse.b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    mse.a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e3) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                                }
                                mse.b = true;
                            }
                            Field field2 = mse.a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e4) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                                }
                            }
                            if (obj2 != null) {
                                mse.a(obj2);
                            }
                        }
                    }
                } else {
                    if (!mse.b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            mse.a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e5) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e5);
                        }
                        mse.b = true;
                    }
                    Field field3 = mse.a;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e6) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e6);
                        }
                    }
                    if (obj2 != null) {
                        mse.a(obj2);
                    }
                }
            }
            int i7 = this.d0;
            if (i7 != 0) {
                context.setTheme(i7);
                context.getTheme().applyStyle(this.d0, true);
            }
            z2 = true;
        }
        if (i2 == 0) {
            n(context).l();
        } else {
            xo xoVar2 = this.g0;
            if (xoVar2 != null) {
                xoVar2.c();
            }
        }
        xo xoVar3 = this.h0;
        if (i2 == 3) {
            if (xoVar3 == null) {
                xoVar3 = new xo(this, context);
                this.h0 = xoVar3;
            }
            xoVar3.l();
        } else if (xoVar3 != null) {
            xoVar3.c();
        }
        return z2;
    }

    public final void e(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof wo)) {
                wo woVar = new wo(this, callback);
                this.h = woVar;
                window.setCallback(woVar);
                Context context = this.e;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, s0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    fp a = fp.a();
                    synchronized (a) {
                        drawable = a.a.f(resourceId, context, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.p0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.q0) != null) {
                        vo.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.q0 = null;
                    }
                    this.p0 = null;
                    w();
                    return;
                }
                return;
            }
            sc8.j("AppCompat has already installed itself into the Window");
            return;
        }
        sc8.j("AppCompat has already installed itself into the Window");
    }

    public final void f(int i, ap apVar, yz6 yz6Var) {
        if (yz6Var == null) {
            if (apVar == null && i >= 0) {
                ap[] apVarArr = this.V;
                if (i < apVarArr.length) {
                    apVar = apVarArr[i];
                }
            }
            if (apVar != null) {
                yz6Var = apVar.h;
            }
        }
        if ((apVar == null || apVar.m) && !this.a0) {
            wo woVar = this.h;
            Window.Callback callback = this.f.getCallback();
            woVar.getClass();
            try {
                woVar.d = true;
                callback.onPanelClosed(i, yz6Var);
            } finally {
                woVar.d = false;
            }
        }
    }

    public final void g(yz6 yz6Var) {
        b9 b9Var;
        if (this.U) {
            return;
        }
        this.U = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.s;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((itb) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (b9Var = actionMenuView.K) != null) {
            b9Var.e();
            y8 y8Var = b9Var.K;
            if (y8Var != null && y8Var.b()) {
                y8Var.i.dismiss();
            }
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.a0) {
            callback.onPanelClosed(108, yz6Var);
        }
        this.U = false;
    }

    public final void h(ap apVar, boolean z) {
        zo zoVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        b9 b9Var;
        if (z && apVar.a == 0 && (actionBarOverlayLayout = this.s) != null) {
            actionBarOverlayLayout.e();
            ActionMenuView actionMenuView = ((itb) actionBarOverlayLayout.e).a.a;
            if (actionMenuView != null && (b9Var = actionMenuView.K) != null && b9Var.f()) {
                g(apVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && apVar.m && (zoVar = apVar.e) != null) {
            windowManager.removeView(zoVar);
            if (z) {
                f(apVar.a, apVar, null);
            }
        }
        apVar.k = false;
        apVar.l = false;
        apVar.m = false;
        apVar.f = null;
        apVar.n = true;
        if (this.W == apVar) {
            this.W = null;
        }
        if (apVar.a == 0) {
            w();
        }
    }

    public final boolean i(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp.i(android.view.KeyEvent):boolean");
    }

    public final void j(int i) {
        ap o = o(i);
        if (o.h != null) {
            Bundle bundle = new Bundle();
            o.h.t(bundle);
            if (bundle.size() > 0) {
                o.p = bundle;
            }
            o.h.w();
            o.h.clear();
        }
        o.o = true;
        o.n = true;
        if ((i == 108 || i == 0) && this.s != null) {
            ap o2 = o(0);
            o2.k = false;
            u(o2, null);
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        Context context;
        if (!this.J) {
            Context context2 = this.e;
            int[] iArr = jy8.j;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    c(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    c(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    c(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    c(10);
                }
                this.S = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                l();
                this.f.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.T) {
                    if (this.S) {
                        viewGroup = (ViewGroup) from.inflate(2131492876, (ViewGroup) null);
                        this.Q = false;
                        this.P = false;
                    } else if (this.P) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(2130968585, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new ew2(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(2131492887, (ViewGroup) null);
                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(2131296413);
                        this.s = actionBarOverlayLayout;
                        actionBarOverlayLayout.setWindowCallback(this.f.getCallback());
                        if (this.Q) {
                            this.s.d(109);
                        }
                        if (this.N) {
                            this.s.d(2);
                        }
                        if (this.O) {
                            this.s.d(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.R ? (ViewGroup) from.inflate(2131492886, (ViewGroup) null) : (ViewGroup) from.inflate(2131492885, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    l69 l69Var = new l69(this, (byte) 5);
                    WeakHashMap weakHashMap = jdc.a;
                    bdc.i(viewGroup, l69Var);
                    if (this.s == null) {
                        this.L = (TextView) viewGroup.findViewById(2131296716);
                    }
                    Method method = gfc.a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, null);
                    } catch (IllegalAccessException e) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e2) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131296306);
                    ViewGroup viewGroup2 = (ViewGroup) this.f.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new i4d(this));
                    this.K = viewGroup;
                    CharSequence charSequence = this.r;
                    if (!TextUtils.isEmpty(charSequence)) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = this.s;
                        if (actionBarOverlayLayout2 != null) {
                            actionBarOverlayLayout2.setWindowTitle(charSequence);
                        } else {
                            zwc zwcVar = this.n;
                            if (zwcVar != null) {
                                itb itbVar = (itb) zwcVar.e;
                                if (!itbVar.g) {
                                    Toolbar toolbar = itbVar.a;
                                    itbVar.h = charSequence;
                                    if ((itbVar.b & 8) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (itbVar.g) {
                                            jdc.l(toolbar.getRootView(), charSequence);
                                        }
                                    }
                                }
                            } else {
                                TextView textView = this.L;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.K.findViewById(16908290);
                    View decorView = this.f.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = jdc.a;
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.J = true;
                    ap o = o(0);
                    if (!this.a0 && o.h == null) {
                        q(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.P + ", windowActionBarOverlay: " + this.Q + ", android:windowIsFloating: " + this.S + ", windowActionModeOverlay: " + this.R + ", windowNoTitle: " + this.T + " }");
            }
            obtainStyledAttributes.recycle();
            sc8.j("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void l() {
        if (this.f != null) {
            return;
        }
        sc8.j("We have not been given a Window");
    }

    public final Context m() {
        Context context;
        zwc p = p();
        if (p != null) {
            if (p.b == null) {
                TypedValue typedValue = new TypedValue();
                p.a.getTheme().resolveAttribute(2130968586, typedValue, true);
                int i = typedValue.resourceId;
                if (i != 0) {
                    p.b = new ContextThemeWrapper(p.a, i);
                } else {
                    p.b = p.a;
                }
            }
            context = p.b;
        } else {
            context = null;
        }
        if (context == null) {
            return this.e;
        }
        return context;
    }

    public final yo n(Context context) {
        xo xoVar = this.g0;
        if (xoVar == null) {
            vk9 vk9Var = vk9.e;
            if (vk9Var == null) {
                Context applicationContext = context.getApplicationContext();
                vk9Var = new vk9(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
                vk9.e = vk9Var;
            }
            xoVar = new xo(this, vk9Var);
            this.g0 = xoVar;
        }
        return xoVar;
    }

    public final ap o(int i) {
        Object[] objArr = this.V;
        if (objArr == null || objArr.length <= i) {
            ap[] apVarArr = new ap[i + 1];
            if (objArr != null) {
                System.arraycopy(objArr, 0, apVarArr, 0, objArr.length);
            }
            this.V = apVarArr;
            objArr = apVarArr;
        }
        ap apVar = objArr[i];
        if (apVar == 0) {
            ?? obj = new Object();
            obj.a = i;
            obj.n = false;
            objArr[i] = obj;
            return obj;
        }
        return apVar;
    }

    @Override
    public final void o1(defpackage.yz6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp.o1(yz6):void");
    }

    @Override
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final zwc p() {
        zwc zwcVar;
        k();
        if (this.P && (zwcVar = this.n) == null) {
            dp dpVar = this.d;
            if (ug8.A(dpVar)) {
                zwcVar = new zwc(dpVar);
                this.n = zwcVar;
            }
            if (zwcVar != null) {
                zwcVar.c(this.l0);
            }
        }
        return this.n;
    }

    public final void q(int i) {
        this.j0 |= 1 << i;
        if (!this.i0) {
            View decorView = this.f.getDecorView();
            WeakHashMap weakHashMap = jdc.a;
            decorView.postOnAnimation(this.k0);
            this.i0 = true;
        }
    }

    public final boolean r() {
        g93 g93Var;
        dtb dtbVar;
        c07 c07Var;
        boolean z = this.X;
        this.X = false;
        ap o = o(0);
        if (o.m) {
            if (!z) {
                h(o, true);
                return true;
            }
        } else {
            f9 f9Var = this.y;
            if (f9Var != null) {
                f9Var.b();
                return true;
            }
            zwc p = p();
            if (p == null || (g93Var = p.e) == null || (dtbVar = ((itb) g93Var).a.f0) == null || dtbVar.b == null) {
                return false;
            }
            dtb dtbVar2 = ((itb) g93Var).a.f0;
            if (dtbVar2 == null) {
                c07Var = null;
            } else {
                c07Var = dtbVar2.b;
            }
            if (c07Var != null) {
                c07Var.collapseActionView();
            }
        }
        return true;
    }

    public final void s(defpackage.ap r14, android.view.KeyEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp.s(ap, android.view.KeyEvent):void");
    }

    public final boolean t(ap apVar, int i, KeyEvent keyEvent) {
        yz6 yz6Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!apVar.k && !u(apVar, keyEvent)) || (yz6Var = apVar.h) == null) {
            return false;
        }
        return yz6Var.performShortcut(i, keyEvent, 1);
    }

    public final boolean u(defpackage.ap r13, android.view.KeyEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp.u(ap, android.view.KeyEvent):boolean");
    }

    public final void v() {
        if (!this.J) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void w() {
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.p0 != null && (o(0).m || this.y != null)) {
                z = true;
            }
            OnBackInvokedCallback onBackInvokedCallback = this.q0;
            if (z) {
                if (onBackInvokedCallback == null) {
                    this.q0 = vo.b(this.p0, this);
                }
            } else if (onBackInvokedCallback != null) {
                vo.c(this.p0, onBackInvokedCallback);
            }
        }
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
