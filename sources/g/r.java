package g;

import a8.gc;
import a8.h0;
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
import m.i3;
import m.j1;
import m.k1;
import m.n3;
import m.u3;
import r0.i0;
import r0.l0;
public final class r extends g implements l.i, LayoutInflater.Factory2 {
    public static final a0.l f12166q0 = new a0.l(0);
    public static final int[] f12167r0 = {16842836};
    public static final boolean f12168s0 = !"robolectric".equals(Build.FINGERPRINT);
    public PopupWindow E;
    public h F;
    public l0 G;
    public final boolean H;
    public boolean I;
    public ViewGroup J;
    public TextView K;
    public View L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public q[] U;
    public q V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public Configuration f12169a0;
    public final int f12170b0;
    public int f12171c0;
    public final t d;
    public int f12172d0;
    public final Context e;
    public boolean f12173e0;
    public Window f12174f;
    public n f12175f0;
    public n f12176g0;
    public m h;
    public boolean f12177h0;
    public int f12178i0;
    public final h f12179j0;
    public boolean f12180k0;
    public Rect f12181l0;
    public Rect m0;
    public a0 f12182n;
    public v f12183n0;
    public OnBackInvokedDispatcher f12184o0;
    public OnBackInvokedCallback f12185p0;
    public CharSequence f12186r;
    public j1 f12187s;
    public za.c v;
    public b6.i f12188w;
    public k.a f12189x;
    public ActionBarContextView f12190y;

    public r(t tVar, t tVar2) {
        Context context = tVar.getContext();
        Window window = tVar.getWindow();
        this.G = null;
        this.H = true;
        this.f12170b0 = -100;
        this.f12179j0 = new h(this, 0);
        this.e = context;
        this.d = tVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.f12170b0 == -100) {
            String name = this.d.getClass().getName();
            a0.l lVar = f12166q0;
            Integer num = (Integer) lVar.get(name);
            if (num != null) {
                this.f12170b0 = num.intValue();
                lVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            e(window);
        }
        m.q.c();
    }

    @Override
    public final boolean F(l.k kVar, MenuItem menuItem) {
        int i10;
        q qVar;
        Window.Callback callback = this.f12174f.getCallback();
        if (callback != null && !this.Z) {
            l.k k10 = kVar.k();
            q[] qVarArr = this.U;
            if (qVarArr != null) {
                i10 = qVarArr.length;
            } else {
                i10 = 0;
            }
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    qVar = qVarArr[i11];
                    if (qVar != null && qVar.h == k10) {
                        break;
                    }
                    i11++;
                } else {
                    qVar = null;
                    break;
                }
            }
            if (qVar != null) {
                return callback.onMenuItemSelected(qVar.f12153a, menuItem);
            }
        }
        return false;
    }

    @Override
    public final void a() {
        this.X = true;
        d(false);
        l();
        this.f12169a0 = new Configuration(this.e.getResources().getConfiguration());
        this.Y = true;
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
        if (this.S && i10 == 108) {
            return false;
        }
        if (this.O && i10 == 1) {
            this.O = false;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 5) {
                    if (i10 != 10) {
                        if (i10 != 108) {
                            if (i10 != 109) {
                                return this.f12174f.requestFeature(i10);
                            }
                            w();
                            this.P = true;
                            return true;
                        }
                        w();
                        this.O = true;
                        return true;
                    }
                    w();
                    this.Q = true;
                    return true;
                }
                w();
                this.N = true;
                return true;
            }
            w();
            this.M = true;
            return true;
        }
        w();
        this.S = true;
        return true;
    }

    public final boolean d(boolean z10) {
        int i10;
        int i11;
        Object obj;
        boolean z11 = false;
        if (this.Z) {
            return false;
        }
        int i12 = this.f12170b0;
        if (i12 == -100) {
            i12 = g.f12139a;
        }
        Context context = this.e;
        int i13 = -1;
        if (i12 != -100) {
            if (i12 != -1) {
                if (i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        if (i12 == 3) {
                            if (this.f12176g0 == null) {
                                this.f12176g0 = new n(this, context);
                            }
                            i13 = this.f12176g0.e();
                        } else {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    i13 = n(context).e();
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
        this.f12173e0 = true;
        int i14 = this.f12172d0;
        Configuration configuration2 = this.f12169a0;
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
        if (((~i14) & i11) != 0 && z10 && this.X && !f12168s0) {
            boolean z12 = this.Y;
        }
        if (i11 != 0) {
            Resources resources = context.getResources();
            Configuration configuration3 = new Configuration(resources.getConfiguration());
            configuration3.uiMode = i16 | (resources.getConfiguration().uiMode & (-49));
            Object obj2 = null;
            resources.updateConfiguration(configuration3, null);
            if (i17 < 26 && i17 < 28) {
                if (i17 >= 24) {
                    if (!gc.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            gc.f497g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                        }
                        gc.h = true;
                    }
                    Field field = gc.f497g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e10);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!gc.f494b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    gc.f493a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e11) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e11);
                                }
                                gc.f494b = true;
                            }
                            Field field2 = gc.f493a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e12);
                                }
                            }
                            if (obj2 != null) {
                                gc.a(obj2);
                            }
                        }
                    }
                } else {
                    if (!gc.f494b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            gc.f493a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e13) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e13);
                        }
                        gc.f494b = true;
                    }
                    Field field3 = gc.f493a;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e14);
                        }
                    }
                    if (obj2 != null) {
                        gc.a(obj2);
                    }
                }
            }
            int i18 = this.f12171c0;
            if (i18 != 0) {
                context.setTheme(i18);
                context.getTheme().applyStyle(this.f12171c0, true);
            }
            z11 = true;
        }
        if (i12 == 0) {
            n(context).l();
        } else {
            n nVar = this.f12175f0;
            if (nVar != null) {
                nVar.c();
            }
        }
        if (i12 == 3) {
            if (this.f12176g0 == null) {
                this.f12176g0 = new n(this, context);
            }
            this.f12176g0.l();
        } else {
            n nVar2 = this.f12176g0;
            if (nVar2 != null) {
                nVar2.c();
            }
        }
        return z11;
    }

    public final void e(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f12174f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof m)) {
                m mVar = new m(this, callback);
                this.h = mVar;
                window.setCallback(mVar);
                Context context = this.e;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f12167r0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    m.q a2 = m.q.a();
                    synchronized (a2) {
                        drawable = a2.f17820a.f(resourceId, context, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f12174f = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f12184o0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f12185p0) != null) {
                        l.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f12185p0 = null;
                    }
                    this.f12184o0 = null;
                    x();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void f(int i10, q qVar, l.k kVar) {
        if (kVar == null) {
            if (qVar == null && i10 >= 0) {
                q[] qVarArr = this.U;
                if (i10 < qVarArr.length) {
                    qVar = qVarArr[i10];
                }
            }
            if (qVar != null) {
                kVar = qVar.h;
            }
        }
        if ((qVar == null || qVar.f12162m) && !this.Z) {
            m mVar = this.h;
            Window.Callback callback = this.f12174f.getCallback();
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
        if (this.T) {
            return;
        }
        this.T = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f12187s;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((n3) actionBarOverlayLayout.e).f17784a.f2240a;
        if (actionMenuView != null && (hVar = actionMenuView.J) != null) {
            hVar.f();
            m.d dVar = hVar.J;
            if (dVar != null && dVar.b()) {
                dVar.f16778i.dismiss();
            }
        }
        Window.Callback callback = this.f12174f.getCallback();
        if (callback != null && !this.Z) {
            callback.onPanelClosed(108, kVar);
        }
        this.T = false;
    }

    public final void h(q qVar, boolean z10) {
        p pVar;
        j1 j1Var;
        m.h hVar;
        if (z10 && qVar.f12153a == 0 && (j1Var = this.f12187s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.e();
            ActionMenuView actionMenuView = ((n3) actionBarOverlayLayout.e).f17784a.f2240a;
            if (actionMenuView != null && (hVar = actionMenuView.J) != null && hVar.h()) {
                g(qVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && qVar.f12162m && (pVar = qVar.e) != null) {
            windowManager.removeView(pVar);
            if (z10) {
                f(qVar.f12153a, qVar, null);
            }
        }
        qVar.f12160k = false;
        qVar.f12161l = false;
        qVar.f12162m = false;
        qVar.f12156f = null;
        qVar.f12163n = true;
        if (this.V == qVar) {
            this.V = null;
        }
        if (qVar.f12153a == 0) {
            x();
        }
    }

    public final boolean i(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: g.r.i(android.view.KeyEvent):boolean");
    }

    public final void j(int i10) {
        q o10 = o(i10);
        if (o10.h != null) {
            Bundle bundle = new Bundle();
            o10.h.t(bundle);
            if (bundle.size() > 0) {
                o10.f12165p = bundle;
            }
            o10.h.w();
            o10.h.clear();
        }
        o10.f12164o = true;
        o10.f12163n = true;
        if ((i10 == 108 || i10 == 0) && this.f12187s != null) {
            q o11 = o(0);
            o11.f12160k = false;
            v(o11, null);
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        Context context;
        if (!this.I) {
            Context context2 = this.e;
            int[] iArr = f.a.f10030j;
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
                this.R = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                l();
                this.f12174f.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.S) {
                    if (this.R) {
                        viewGroup = (ViewGroup) from.inflate(2131492876, (ViewGroup) null);
                        this.P = false;
                        this.O = false;
                    } else if (this.O) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(2130968585, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new k.c(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(2131492887, (ViewGroup) null);
                        j1 j1Var = (j1) viewGroup.findViewById(2131296411);
                        this.f12187s = j1Var;
                        j1Var.setWindowCallback(this.f12174f.getCallback());
                        if (this.P) {
                            ((ActionBarOverlayLayout) this.f12187s).d(109);
                        }
                        if (this.M) {
                            ((ActionBarOverlayLayout) this.f12187s).d(2);
                        }
                        if (this.N) {
                            ((ActionBarOverlayLayout) this.f12187s).d(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.Q ? (ViewGroup) from.inflate(2131492886, (ViewGroup) null) : (ViewGroup) from.inflate(2131492885, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    a4.l lVar = new a4.l(this, 20);
                    WeakHashMap weakHashMap = i0.f47143a;
                    r0.a0.i(viewGroup, lVar);
                    if (this.f12187s == null) {
                        this.K = (TextView) viewGroup.findViewById(2131296714);
                    }
                    Method method = u3.f17867a;
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
                    } catch (InvocationTargetException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131296304);
                    ViewGroup viewGroup2 = (ViewGroup) this.f12174f.findViewById(16908290);
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
                    this.f12174f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new rb.c(this, 22));
                    this.J = viewGroup;
                    CharSequence charSequence = this.f12186r;
                    if (!TextUtils.isEmpty(charSequence)) {
                        j1 j1Var2 = this.f12187s;
                        if (j1Var2 != null) {
                            j1Var2.setWindowTitle(charSequence);
                        } else {
                            a0 a0Var = this.f12182n;
                            if (a0Var != null) {
                                n3 n3Var = (n3) a0Var.e;
                                if (!n3Var.f17788g) {
                                    Toolbar toolbar = n3Var.f17784a;
                                    n3Var.h = charSequence;
                                    if ((n3Var.f17785b & 8) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (n3Var.f17788g) {
                                            i0.l(toolbar.getRootView(), charSequence);
                                        }
                                    }
                                }
                            } else {
                                TextView textView = this.K;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.J.findViewById(16908290);
                    View decorView = this.f12174f.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = i0.f47143a;
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
                    this.I = true;
                    q o10 = o(0);
                    if (!this.Z && o10.h == null) {
                        q(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.O + ", windowActionBarOverlay: " + this.P + ", android:windowIsFloating: " + this.R + ", windowActionModeOverlay: " + this.Q + ", windowNoTitle: " + this.S + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void l() {
        if (this.f12174f != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final Context m() {
        Context context;
        a0 p10 = p();
        if (p10 != null) {
            if (p10.f12086b == null) {
                TypedValue typedValue = new TypedValue();
                p10.f12085a.getTheme().resolveAttribute(2130968586, typedValue, true);
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    p10.f12086b = new ContextThemeWrapper(p10.f12085a, i10);
                } else {
                    p10.f12086b = p10.f12085a;
                }
            }
            context = p10.f12086b;
        } else {
            context = null;
        }
        if (context == null) {
            return this.e;
        }
        return context;
    }

    public final o n(Context context) {
        if (this.f12175f0 == null) {
            if (h0.e == null) {
                Context applicationContext = context.getApplicationContext();
                h0.e = new h0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f12175f0 = new n(this, h0.e);
        }
        return this.f12175f0;
    }

    public final q o(int i10) {
        Object[] objArr = this.U;
        if (objArr == null || objArr.length <= i10) {
            q[] qVarArr = new q[i10 + 1];
            if (objArr != null) {
                System.arraycopy(objArr, 0, qVarArr, 0, objArr.length);
            }
            this.U = qVarArr;
            objArr = qVarArr;
        }
        q qVar = objArr[i10];
        if (qVar == 0) {
            ?? obj = new Object();
            obj.f12153a = i10;
            obj.f12163n = false;
            objArr[i10] = obj;
            return obj;
        }
        return qVar;
    }

    @Override
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        throw new UnsupportedOperationException("Method not decompiled: g.r.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final a0 p() {
        k();
        if (this.O && this.f12182n == null) {
            t tVar = this.d;
            if (c3.h0.t(tVar)) {
                this.f12182n = new a0(tVar);
            }
            a0 a0Var = this.f12182n;
            if (a0Var != null) {
                a0Var.c(this.f12180k0);
            }
        }
        return this.f12182n;
    }

    public final void q(int i10) {
        this.f12178i0 = (1 << i10) | this.f12178i0;
        if (!this.f12177h0) {
            View decorView = this.f12174f.getDecorView();
            WeakHashMap weakHashMap = i0.f47143a;
            decorView.postOnAnimation(this.f12179j0);
            this.f12177h0 = true;
        }
    }

    @Override
    public final void r(l.k r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.r.r(l.k):void");
    }

    public final boolean s() {
        k1 k1Var;
        i3 i3Var;
        l.m mVar;
        boolean z10 = this.W;
        this.W = false;
        q o10 = o(0);
        if (o10.f12162m) {
            if (!z10) {
                h(o10, true);
                return true;
            }
        } else {
            k.a aVar = this.f12189x;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            a0 p10 = p();
            if (p10 == null || (k1Var = p10.e) == null || (i3Var = ((n3) k1Var).f17784a.f2247e0) == null || i3Var.f17744b == null) {
                return false;
            }
            i3 i3Var2 = ((n3) k1Var).f17784a.f2247e0;
            if (i3Var2 == null) {
                mVar = null;
            } else {
                mVar = i3Var2.f17744b;
            }
            if (mVar != null) {
                mVar.collapseActionView();
            }
        }
        return true;
    }

    public final void t(g.q r14, android.view.KeyEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: g.r.t(g.q, android.view.KeyEvent):void");
    }

    public final boolean u(q qVar, int i10, KeyEvent keyEvent) {
        l.k kVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!qVar.f12160k && !v(qVar, keyEvent)) || (kVar = qVar.h) == null) {
            return false;
        }
        return kVar.performShortcut(i10, keyEvent, 1);
    }

    public final boolean v(g.q r13, android.view.KeyEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: g.r.v(g.q, android.view.KeyEvent):boolean");
    }

    public final void w() {
        if (!this.I) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void x() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f12184o0 != null && (o(0).f12162m || this.f12189x != null)) {
                z10 = true;
            }
            if (z10 && this.f12185p0 == null) {
                this.f12185p0 = l.b(this.f12184o0, this);
            } else if (!z10 && (onBackInvokedCallback = this.f12185p0) != null) {
                l.c(this.f12184o0, onBackInvokedCallback);
            }
        }
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
