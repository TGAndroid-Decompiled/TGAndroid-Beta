package g;

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
import androidx.biometric.f0;
import j7.o7;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;
import m.j3;
import m.k1;
import m.l1;
import m.o3;
import m.v3;
import r0.b0;
import r0.j0;
import r0.m0;
public final class q extends g implements l.i, LayoutInflater.Factory2 {
    public static final a0.k f6292n0 = new a0.k(0);
    public static final int[] f6293o0 = {16842836};
    public static final boolean f6294p0 = !"robolectric".equals(Build.FINGERPRINT);
    public PopupWindow B;
    public h C;
    public m0 D;
    public final boolean E;
    public boolean F;
    public ViewGroup G;
    public TextView H;
    public View I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public p[] R;
    public p S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public Configuration X;
    public final int Y;
    public int Z;
    public int f6295a0;
    public boolean f6296b0;
    public n f6297c0;
    public final s d;
    public n f6298d0;
    public final Context e;
    public boolean f6299e0;
    public Window f6300f;
    public int f6301f0;
    public final h f6302g0;
    public m h;
    public boolean f6303h0;
    public Rect f6304i0;
    public Rect f6305j0;
    public u f6306k0;
    public OnBackInvokedDispatcher f6307l0;
    public OnBackInvokedCallback m0;
    public a0 f6308n;
    public CharSequence f6309r;
    public k1 f6310s;
    public o5.i v;
    public f0 f6311w;
    public k.a f6312x;
    public ActionBarContextView f6313y;

    public q(s sVar, s sVar2) {
        Context context = sVar.getContext();
        Window window = sVar.getWindow();
        this.D = null;
        this.E = true;
        this.Y = -100;
        this.f6302g0 = new h(this, 0);
        this.e = context;
        this.d = sVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.Y == -100) {
            String name = this.d.getClass().getName();
            a0.k kVar = f6292n0;
            Integer num = (Integer) kVar.get(name);
            if (num != null) {
                this.Y = num.intValue();
                kVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            e(window);
        }
        m.q.c();
    }

    @Override
    public final void a() {
        this.U = true;
        d(false);
        m();
        this.X = new Configuration(this.e.getResources().getConfiguration());
        this.V = true;
    }

    @Override
    public final boolean c(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.P && i10 == 108) {
            return false;
        }
        if (this.L && i10 == 1) {
            this.L = false;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 5) {
                    if (i10 != 10) {
                        if (i10 != 108) {
                            if (i10 != 109) {
                                return this.f6300f.requestFeature(i10);
                            }
                            x();
                            this.M = true;
                            return true;
                        }
                        x();
                        this.L = true;
                        return true;
                    }
                    x();
                    this.N = true;
                    return true;
                }
                x();
                this.K = true;
                return true;
            }
            x();
            this.J = true;
            return true;
        }
        x();
        this.P = true;
        return true;
    }

    public final boolean d(boolean z4) {
        int i10;
        int i11;
        Object obj;
        boolean z10 = false;
        if (this.W) {
            return false;
        }
        int i12 = this.Y;
        if (i12 == -100) {
            i12 = g.f6267a;
        }
        Context context = this.e;
        int i13 = -1;
        if (i12 != -100) {
            if (i12 != -1) {
                if (i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        if (i12 == 3) {
                            if (this.f6298d0 == null) {
                                this.f6298d0 = new n(this, context);
                            }
                            i13 = this.f6298d0.e();
                        } else {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    i13 = o(context).e();
                }
            }
            i13 = i12;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                i10 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            } else {
                i10 = 32;
            }
        } else {
            i10 = 16;
        }
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.uiMode = i10 | (configuration.uiMode & (-49));
        this.f6296b0 = true;
        int i14 = this.f6295a0;
        Configuration configuration2 = this.X;
        if (configuration2 == null) {
            configuration2 = context.getResources().getConfiguration();
        }
        int i15 = configuration2.uiMode & 48;
        int i16 = configuration.uiMode & 48;
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 24) {
            k.b(configuration2);
        } else {
            n0.c.b(j.a(configuration2.locale));
        }
        if (i15 != i16) {
            i11 = 512;
        } else {
            i11 = 0;
        }
        if (((~i14) & i11) != 0 && z4 && this.U && !f6294p0) {
            boolean z11 = this.V;
        }
        if (i11 != 0) {
            Resources resources = context.getResources();
            Configuration configuration3 = new Configuration(resources.getConfiguration());
            configuration3.uiMode = i16 | (resources.getConfiguration().uiMode & (-49));
            Map map = null;
            r5 = null;
            r5 = null;
            Object obj2 = null;
            Object obj3 = null;
            resources.updateConfiguration(configuration3, null);
            if (i17 < 26 && i17 < 28) {
                if (i17 >= 24) {
                    if (!o7.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            o7.f9107g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                        }
                        o7.h = true;
                    }
                    Field field = o7.f9107g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e6) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e6);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!o7.f9104b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    o7.f9103a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e10) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e10);
                                }
                                o7.f9104b = true;
                            }
                            Field field2 = o7.f9103a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e11) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e11);
                                }
                            }
                            if (obj2 != null) {
                                o7.a(obj2);
                            }
                        }
                    }
                } else if (i17 >= 23) {
                    if (!o7.f9104b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            o7.f9103a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e12) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e12);
                        }
                        o7.f9104b = true;
                    }
                    Field field3 = o7.f9103a;
                    if (field3 != null) {
                        try {
                            obj3 = field3.get(resources);
                        } catch (IllegalAccessException e13) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e13);
                        }
                    }
                    if (obj3 != null) {
                        o7.a(obj3);
                    }
                } else {
                    if (!o7.f9104b) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            o7.f9103a = declaredField4;
                            declaredField4.setAccessible(true);
                        } catch (NoSuchFieldException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e14);
                        }
                        o7.f9104b = true;
                    }
                    Field field4 = o7.f9103a;
                    if (field4 != null) {
                        try {
                            map = (Map) field4.get(resources);
                        } catch (IllegalAccessException e15) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e15);
                        }
                        if (map != null) {
                            map.clear();
                        }
                    }
                }
            }
            int i18 = this.Z;
            if (i18 != 0) {
                context.setTheme(i18);
                if (Build.VERSION.SDK_INT >= 23) {
                    context.getTheme().applyStyle(this.Z, true);
                }
            }
            z10 = true;
        }
        if (i12 == 0) {
            o(context).l();
        } else {
            n nVar = this.f6297c0;
            if (nVar != null) {
                nVar.c();
            }
        }
        if (i12 == 3) {
            if (this.f6298d0 == null) {
                this.f6298d0 = new n(this, context);
            }
            this.f6298d0.l();
        } else {
            n nVar2 = this.f6298d0;
            if (nVar2 != null) {
                nVar2.c();
            }
        }
        return z10;
    }

    public final void e(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f6300f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof m)) {
                m mVar = new m(this, callback);
                this.h = mVar;
                window.setCallback(mVar);
                Context context = this.e;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f6293o0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    m.q a2 = m.q.a();
                    synchronized (a2) {
                        drawable = a2.f13604a.f(resourceId, context, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f6300f = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f6307l0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.m0) != null) {
                        l.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.m0 = null;
                    }
                    this.f6307l0 = null;
                    y();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void f(int i10, p pVar, l.k kVar) {
        if (kVar == null) {
            if (pVar == null && i10 >= 0) {
                p[] pVarArr = this.R;
                if (i10 < pVarArr.length) {
                    pVar = pVarArr[i10];
                }
            }
            if (pVar != null) {
                kVar = pVar.h;
            }
        }
        if ((pVar == null || pVar.f6288m) && !this.W) {
            m mVar = this.h;
            Window.Callback callback = this.f6300f.getCallback();
            mVar.getClass();
            try {
                mVar.d = true;
                callback.onPanelClosed(i10, kVar);
            } finally {
                mVar.d = false;
            }
        }
    }

    public final void g(l.k kVar) {
        m.h hVar;
        if (this.Q) {
            return;
        }
        this.Q = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f6310s;
        actionBarOverlayLayout.f();
        ActionMenuView actionMenuView = ((o3) actionBarOverlayLayout.e).f13582a.f434a;
        if (actionMenuView != null && (hVar = actionMenuView.G) != null) {
            hVar.f();
            m.d dVar = hVar.G;
            if (dVar != null && dVar.b()) {
                dVar.f11100i.dismiss();
            }
        }
        Window.Callback callback = this.f6300f.getCallback();
        if (callback != null && !this.W) {
            callback.onPanelClosed(108, kVar);
        }
        this.Q = false;
    }

    public final void h(p pVar, boolean z4) {
        o oVar;
        k1 k1Var;
        m.h hVar;
        if (z4 && pVar.f6279a == 0 && (k1Var = this.f6310s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
            actionBarOverlayLayout.f();
            ActionMenuView actionMenuView = ((o3) actionBarOverlayLayout.e).f13582a.f434a;
            if (actionMenuView != null && (hVar = actionMenuView.G) != null && hVar.g()) {
                g(pVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && pVar.f6288m && (oVar = pVar.e) != null) {
            windowManager.removeView(oVar);
            if (z4) {
                f(pVar.f6279a, pVar, null);
            }
        }
        pVar.f6286k = false;
        pVar.f6287l = false;
        pVar.f6288m = false;
        pVar.f6282f = null;
        pVar.f6289n = true;
        if (this.S == pVar) {
            this.S = null;
        }
        if (pVar.f6279a == 0) {
            y();
        }
    }

    @Override
    public final void i(l.k r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.q.i(l.k):void");
    }

    public final boolean j(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: g.q.j(android.view.KeyEvent):boolean");
    }

    public final void k(int i10) {
        p q10 = q(i10);
        if (q10.h != null) {
            Bundle bundle = new Bundle();
            q10.h.t(bundle);
            if (bundle.size() > 0) {
                q10.f6291p = bundle;
            }
            q10.h.w();
            q10.h.clear();
        }
        q10.f6290o = true;
        q10.f6289n = true;
        if ((i10 == 108 || i10 == 0) && this.f6310s != null) {
            p q11 = q(0);
            q11.f6286k = false;
            w(q11, null);
        }
    }

    public final void l() {
        ViewGroup viewGroup;
        Context context;
        if (!this.F) {
            Context context2 = this.e;
            int[] iArr = f.a.f5625j;
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
                this.O = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                m();
                this.f6300f.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.P) {
                    if (this.O) {
                        viewGroup = (ViewGroup) from.inflate(2131492876, (ViewGroup) null);
                        this.M = false;
                        this.L = false;
                    } else if (this.L) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(2130968585, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new k.c(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(2131492887, (ViewGroup) null);
                        k1 k1Var = (k1) viewGroup.findViewById(2131296411);
                        this.f6310s = k1Var;
                        k1Var.setWindowCallback(this.f6300f.getCallback());
                        if (this.M) {
                            ((ActionBarOverlayLayout) this.f6310s).e(109);
                        }
                        if (this.J) {
                            ((ActionBarOverlayLayout) this.f6310s).e(2);
                        }
                        if (this.K) {
                            ((ActionBarOverlayLayout) this.f6310s).e(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.N ? (ViewGroup) from.inflate(2131492886, (ViewGroup) null) : (ViewGroup) from.inflate(2131492885, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    a3.c cVar = new a3.c(this, 15);
                    WeakHashMap weakHashMap = j0.f43118a;
                    b0.j(viewGroup, cVar);
                    if (this.f6310s == null) {
                        this.H = (TextView) viewGroup.findViewById(2131296712);
                    }
                    Method method = v3.f13666a;
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
                    } catch (InvocationTargetException e6) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e6);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131296304);
                    ViewGroup viewGroup2 = (ViewGroup) this.f6300f.findViewById(16908290);
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
                    this.f6300f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new ja.c(this, 10));
                    this.G = viewGroup;
                    CharSequence charSequence = this.f6309r;
                    if (!TextUtils.isEmpty(charSequence)) {
                        k1 k1Var2 = this.f6310s;
                        if (k1Var2 != null) {
                            k1Var2.setWindowTitle(charSequence);
                        } else {
                            a0 a0Var = this.f6308n;
                            if (a0Var != null) {
                                o3 o3Var = (o3) a0Var.e;
                                if (!o3Var.f13586g) {
                                    Toolbar toolbar = o3Var.f13582a;
                                    o3Var.h = charSequence;
                                    if ((o3Var.f13583b & 8) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (o3Var.f13586g) {
                                            j0.l(toolbar.getRootView(), charSequence);
                                        }
                                    }
                                }
                            } else {
                                TextView textView = this.H;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.G.findViewById(16908290);
                    View decorView = this.f6300f.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = j0.f43118a;
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
                    this.F = true;
                    p q10 = q(0);
                    if (!this.W && q10.h == null) {
                        s(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.L + ", windowActionBarOverlay: " + this.M + ", android:windowIsFloating: " + this.O + ", windowActionModeOverlay: " + this.N + ", windowNoTitle: " + this.P + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void m() {
        if (this.f6300f != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final Context n() {
        Context context;
        a0 r10 = r();
        if (r10 != null) {
            if (r10.f6214b == null) {
                TypedValue typedValue = new TypedValue();
                r10.f6213a.getTheme().resolveAttribute(2130968586, typedValue, true);
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    r10.f6214b = new ContextThemeWrapper(r10.f6213a, i10);
                } else {
                    r10.f6214b = r10.f6213a;
                }
            }
            context = r10.f6214b;
        } else {
            context = null;
        }
        if (context == null) {
            return this.e;
        }
        return context;
    }

    public final f2.v o(Context context) {
        if (this.f6297c0 == null) {
            if (androidx.biometric.e.e == null) {
                Context applicationContext = context.getApplicationContext();
                androidx.biometric.e.e = new androidx.biometric.e(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f6297c0 = new n(this, androidx.biometric.e.e);
        }
        return this.f6297c0;
    }

    @Override
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        throw new UnsupportedOperationException("Method not decompiled: g.q.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override
    public final boolean p(l.k kVar, MenuItem menuItem) {
        int i10;
        p pVar;
        Window.Callback callback = this.f6300f.getCallback();
        if (callback != null && !this.W) {
            l.k k10 = kVar.k();
            p[] pVarArr = this.R;
            if (pVarArr != null) {
                i10 = pVarArr.length;
            } else {
                i10 = 0;
            }
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    pVar = pVarArr[i11];
                    if (pVar != null && pVar.h == k10) {
                        break;
                    }
                    i11++;
                } else {
                    pVar = null;
                    break;
                }
            }
            if (pVar != null) {
                return callback.onMenuItemSelected(pVar.f6279a, menuItem);
            }
        }
        return false;
    }

    public final p q(int i10) {
        Object[] objArr = this.R;
        if (objArr == null || objArr.length <= i10) {
            p[] pVarArr = new p[i10 + 1];
            if (objArr != null) {
                System.arraycopy(objArr, 0, pVarArr, 0, objArr.length);
            }
            this.R = pVarArr;
            objArr = pVarArr;
        }
        p pVar = objArr[i10];
        if (pVar == 0) {
            ?? obj = new Object();
            obj.f6279a = i10;
            obj.f6289n = false;
            objArr[i10] = obj;
            return obj;
        }
        return pVar;
    }

    public final a0 r() {
        l();
        if (this.L && this.f6308n == null) {
            s sVar = this.d;
            if (e2.c.s(sVar)) {
                this.f6308n = new a0(sVar);
            }
            a0 a0Var = this.f6308n;
            if (a0Var != null) {
                a0Var.c(this.f6303h0);
            }
        }
        return this.f6308n;
    }

    public final void s(int i10) {
        this.f6301f0 = (1 << i10) | this.f6301f0;
        if (!this.f6299e0) {
            View decorView = this.f6300f.getDecorView();
            WeakHashMap weakHashMap = j0.f43118a;
            decorView.postOnAnimation(this.f6302g0);
            this.f6299e0 = true;
        }
    }

    public final boolean t() {
        l1 l1Var;
        j3 j3Var;
        l.m mVar;
        boolean z4 = this.T;
        this.T = false;
        p q10 = q(0);
        if (q10.f6288m) {
            if (!z4) {
                h(q10, true);
                return true;
            }
        } else {
            k.a aVar = this.f6312x;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            a0 r10 = r();
            if (r10 == null || (l1Var = r10.e) == null || (j3Var = ((o3) l1Var).f13582a.f437b0) == null || j3Var.f13542b == null) {
                return false;
            }
            j3 j3Var2 = ((o3) l1Var).f13582a.f437b0;
            if (j3Var2 == null) {
                mVar = null;
            } else {
                mVar = j3Var2.f13542b;
            }
            if (mVar != null) {
                mVar.collapseActionView();
            }
        }
        return true;
    }

    public final void u(g.p r14, android.view.KeyEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: g.q.u(g.p, android.view.KeyEvent):void");
    }

    public final boolean v(p pVar, int i10, KeyEvent keyEvent) {
        l.k kVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!pVar.f6286k && !w(pVar, keyEvent)) || (kVar = pVar.h) == null) {
            return false;
        }
        return kVar.performShortcut(i10, keyEvent, 1);
    }

    public final boolean w(g.p r13, android.view.KeyEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: g.q.w(g.p, android.view.KeyEvent):boolean");
    }

    public final void x() {
        if (!this.F) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void y() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z4 = false;
            if (this.f6307l0 != null && (q(0).f6288m || this.f6312x != null)) {
                z4 = true;
            }
            if (z4 && this.m0 == null) {
                this.m0 = l.b(this.f6307l0, this);
            } else if (!z4 && (onBackInvokedCallback = this.m0) != null) {
                l.c(this.f6307l0, onBackInvokedCallback);
            }
        }
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
