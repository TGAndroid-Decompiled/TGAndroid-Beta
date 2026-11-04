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
import b8.gc;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.f3;
import m.j1;
import m.k1;
import m.k3;
import m.r3;
import r0.i0;
import r0.l0;
public final class s extends g implements l.i, LayoutInflater.Factory2 {
    public static final a0.l f11737r0 = new a0.l(0);
    public static final int[] f11738s0 = {16842836};
    public static final boolean f11739t0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView E;
    public PopupWindow F;
    public h G;
    public l0 H;
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
    public r[] V;
    public r W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean f11740a0;
    public Configuration f11741b0;
    public final int f11742c0;
    public final u d;
    public int f11743d0;
    public final Context f11744e;
    public int f11745e0;
    public Window f11746f;
    public boolean f11747f0;
    public o f11748g0;
    public n h;
    public o f11749h0;
    public boolean f11750i0;
    public int f11751j0;
    public final h f11752k0;
    public boolean f11753l0;
    public Rect m0;
    public b0 f11754n;
    public Rect f11755n0;
    public w f11756o0;
    public OnBackInvokedDispatcher f11757p0;
    public OnBackInvokedCallback f11758q0;
    public CharSequence f11759r;
    public j1 f11760s;
    public c6.i f11761w;
    public i f11762x;
    public k.a f11763y;

    public s(u uVar, u uVar2) {
        Context context = uVar.getContext();
        Window window = uVar.getWindow();
        this.H = null;
        this.I = true;
        this.f11742c0 = -100;
        this.f11752k0 = new h(this, 0);
        this.f11744e = context;
        this.d = uVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.f11742c0 == -100) {
            String name = this.d.getClass().getName();
            a0.l lVar = f11737r0;
            Integer num = (Integer) lVar.get(name);
            if (num != null) {
                this.f11742c0 = num.intValue();
                lVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            f(window);
        }
        m.q.c();
    }

    @Override
    public final boolean U0(l.k kVar, MenuItem menuItem) {
        int i3;
        r rVar;
        Window.Callback callback = this.f11746f.getCallback();
        if (callback != null && !this.f11740a0) {
            l.k k10 = kVar.k();
            r[] rVarArr = this.V;
            if (rVarArr != null) {
                i3 = rVarArr.length;
            } else {
                i3 = 0;
            }
            int i10 = 0;
            while (true) {
                if (i10 < i3) {
                    rVar = rVarArr[i10];
                    if (rVar != null && rVar.h == k10) {
                        break;
                    }
                    i10++;
                } else {
                    rVar = null;
                    break;
                }
            }
            if (rVar != null) {
                return callback.onMenuItemSelected(rVar.f11723a, menuItem);
            }
        }
        return false;
    }

    @Override
    public final void a() {
        this.Y = true;
        e(false);
        m();
        this.f11741b0 = new Configuration(this.f11744e.getResources().getConfiguration());
        this.Z = true;
    }

    @Override
    public final void b(l.k r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.b(l.k):void");
    }

    @Override
    public final boolean d(int i3) {
        if (i3 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i3 = 108;
        } else if (i3 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i3 = 109;
        }
        if (this.T && i3 == 108) {
            return false;
        }
        if (this.P && i3 == 1) {
            this.P = false;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 5) {
                    if (i3 != 10) {
                        if (i3 != 108) {
                            if (i3 != 109) {
                                return this.f11746f.requestFeature(i3);
                            }
                            w();
                            this.Q = true;
                            return true;
                        }
                        w();
                        this.P = true;
                        return true;
                    }
                    w();
                    this.R = true;
                    return true;
                }
                w();
                this.O = true;
                return true;
            }
            w();
            this.N = true;
            return true;
        }
        w();
        this.T = true;
        return true;
    }

    public final boolean e(boolean z10) {
        int i3;
        int i10;
        Object obj;
        boolean z11 = false;
        if (this.f11740a0) {
            return false;
        }
        int i11 = this.f11742c0;
        if (i11 == -100) {
            i11 = g.f11706a;
        }
        Context context = this.f11744e;
        int i12 = -1;
        if (i11 != -100) {
            if (i11 != -1) {
                if (i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        if (i11 == 3) {
                            if (this.f11749h0 == null) {
                                this.f11749h0 = new o(this, context);
                            }
                            i12 = this.f11749h0.e();
                        } else {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    i12 = o(context).e();
                }
            }
            i12 = i11;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                i3 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            } else {
                i3 = 32;
            }
        } else {
            i3 = 16;
        }
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.uiMode = i3 | (configuration.uiMode & (-49));
        this.f11747f0 = true;
        int i13 = this.f11745e0;
        Configuration configuration2 = this.f11741b0;
        if (configuration2 == null) {
            configuration2 = context.getResources().getConfiguration();
        }
        int i14 = configuration2.uiMode & 48;
        int i15 = configuration.uiMode & 48;
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 24) {
            l.b(configuration2);
        } else {
            n0.c.b(k.a(configuration2.locale));
        }
        if (i14 != i15) {
            i10 = 512;
        } else {
            i10 = 0;
        }
        if (((~i13) & i10) != 0 && z10 && this.Y && !f11739t0) {
            boolean z12 = this.Z;
        }
        if (i10 != 0) {
            Resources resources = context.getResources();
            Configuration configuration3 = new Configuration(resources.getConfiguration());
            configuration3.uiMode = i15 | (resources.getConfiguration().uiMode & (-49));
            Object obj2 = null;
            resources.updateConfiguration(configuration3, null);
            if (i16 < 26 && i16 < 28) {
                if (i16 >= 24) {
                    if (!gc.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            gc.f2642g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
                        }
                        gc.h = true;
                    }
                    Field field = gc.f2642g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e11) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!gc.f2638b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    gc.f2637a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
                                }
                                gc.f2638b = true;
                            }
                            Field field2 = gc.f2637a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e13) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                                }
                            }
                            if (obj2 != null) {
                                gc.a(obj2);
                            }
                        }
                    }
                } else {
                    if (!gc.f2638b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            gc.f2637a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e14);
                        }
                        gc.f2638b = true;
                    }
                    Field field3 = gc.f2637a;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e15) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e15);
                        }
                    }
                    if (obj2 != null) {
                        gc.a(obj2);
                    }
                }
            }
            int i17 = this.f11743d0;
            if (i17 != 0) {
                context.setTheme(i17);
                context.getTheme().applyStyle(this.f11743d0, true);
            }
            z11 = true;
        }
        if (i11 == 0) {
            o(context).l();
        } else {
            o oVar = this.f11748g0;
            if (oVar != null) {
                oVar.c();
            }
        }
        if (i11 == 3) {
            if (this.f11749h0 == null) {
                this.f11749h0 = new o(this, context);
            }
            this.f11749h0.l();
        } else {
            o oVar2 = this.f11749h0;
            if (oVar2 != null) {
                oVar2.c();
            }
        }
        return z11;
    }

    public final void f(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f11746f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof n)) {
                n nVar = new n(this, callback);
                this.h = nVar;
                window.setCallback(nVar);
                Context context = this.f11744e;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f11738s0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    m.q a10 = m.q.a();
                    synchronized (a10) {
                        drawable = a10.f18705a.f(resourceId, context, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f11746f = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f11757p0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f11758q0) != null) {
                        m.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f11758q0 = null;
                    }
                    this.f11757p0 = null;
                    x();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void g(int i3, r rVar, l.k kVar) {
        if (kVar == null) {
            if (rVar == null && i3 >= 0) {
                r[] rVarArr = this.V;
                if (i3 < rVarArr.length) {
                    rVar = rVarArr[i3];
                }
            }
            if (rVar != null) {
                kVar = rVar.h;
            }
        }
        if ((rVar == null || rVar.f11733m) && !this.f11740a0) {
            n nVar = this.h;
            Window.Callback callback = this.f11746f.getCallback();
            nVar.getClass();
            try {
                nVar.d = true;
                callback.onPanelClosed(i3, kVar);
            } finally {
                nVar.d = false;
            }
        }
    }

    public final void h(l.k kVar) {
        m.h hVar;
        if (this.U) {
            return;
        }
        this.U = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f11760s;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((k3) actionBarOverlayLayout.f1353e).f18622a.f1396a;
        if (actionMenuView != null && (hVar = actionMenuView.K) != null) {
            hVar.f();
            m.d dVar = hVar.K;
            if (dVar != null && dVar.b()) {
                dVar.f17480i.dismiss();
            }
        }
        Window.Callback callback = this.f11746f.getCallback();
        if (callback != null && !this.f11740a0) {
            callback.onPanelClosed(108, kVar);
        }
        this.U = false;
    }

    public final void i(r rVar, boolean z10) {
        q qVar;
        j1 j1Var;
        m.h hVar;
        if (z10 && rVar.f11723a == 0 && (j1Var = this.f11760s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.e();
            ActionMenuView actionMenuView = ((k3) actionBarOverlayLayout.f1353e).f18622a.f1396a;
            if (actionMenuView != null && (hVar = actionMenuView.K) != null && hVar.g()) {
                h(rVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f11744e.getSystemService("window");
        if (windowManager != null && rVar.f11733m && (qVar = rVar.f11726e) != null) {
            windowManager.removeView(qVar);
            if (z10) {
                g(rVar.f11723a, rVar, null);
            }
        }
        rVar.f11731k = false;
        rVar.f11732l = false;
        rVar.f11733m = false;
        rVar.f11727f = null;
        rVar.f11734n = true;
        if (this.W == rVar) {
            this.W = null;
        }
        if (rVar.f11723a == 0) {
            x();
        }
    }

    public final boolean j(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.j(android.view.KeyEvent):boolean");
    }

    public final void k(int i3) {
        r p10 = p(i3);
        if (p10.h != null) {
            Bundle bundle = new Bundle();
            p10.h.t(bundle);
            if (bundle.size() > 0) {
                p10.f11736p = bundle;
            }
            p10.h.w();
            p10.h.clear();
        }
        p10.f11735o = true;
        p10.f11734n = true;
        if ((i3 == 108 || i3 == 0) && this.f11760s != null) {
            r p11 = p(0);
            p11.f11731k = false;
            v(p11, null);
        }
    }

    public final void l() {
        ViewGroup viewGroup;
        Context context;
        if (!this.J) {
            Context context2 = this.f11744e;
            int[] iArr = f.a.f11314j;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    d(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    d(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    d(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    d(10);
                }
                this.S = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                m();
                this.f11746f.getDecorView();
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
                            context = new k.c(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(2131492887, (ViewGroup) null);
                        j1 j1Var = (j1) viewGroup.findViewById(2131296411);
                        this.f11760s = j1Var;
                        j1Var.setWindowCallback(this.f11746f.getCallback());
                        if (this.Q) {
                            ((ActionBarOverlayLayout) this.f11760s).d(109);
                        }
                        if (this.N) {
                            ((ActionBarOverlayLayout) this.f11760s).d(2);
                        }
                        if (this.O) {
                            ((ActionBarOverlayLayout) this.f11760s).d(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.R ? (ViewGroup) from.inflate(2131492886, (ViewGroup) null) : (ViewGroup) from.inflate(2131492885, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    i iVar = new i(this);
                    WeakHashMap weakHashMap = i0.f54015a;
                    r0.a0.i(viewGroup, iVar);
                    if (this.f11760s == null) {
                        this.L = (TextView) viewGroup.findViewById(2131296714);
                    }
                    Method method = r3.f18722a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, null);
                    } catch (IllegalAccessException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e11) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131296304);
                    ViewGroup viewGroup2 = (ViewGroup) this.f11746f.findViewById(16908290);
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
                    this.f11746f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new bb.c(this, 25));
                    this.K = viewGroup;
                    CharSequence charSequence = this.f11759r;
                    if (!TextUtils.isEmpty(charSequence)) {
                        j1 j1Var2 = this.f11760s;
                        if (j1Var2 != null) {
                            j1Var2.setWindowTitle(charSequence);
                        } else {
                            b0 b0Var = this.f11754n;
                            if (b0Var != null) {
                                k3 k3Var = (k3) b0Var.f11663e;
                                if (!k3Var.f18627g) {
                                    Toolbar toolbar = k3Var.f18622a;
                                    k3Var.h = charSequence;
                                    if ((k3Var.f18623b & 8) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (k3Var.f18627g) {
                                            i0.k(toolbar.getRootView(), charSequence);
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
                    View decorView = this.f11746f.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = i0.f54015a;
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
                    r p10 = p(0);
                    if (!this.f11740a0 && p10.h == null) {
                        r(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.P + ", windowActionBarOverlay: " + this.Q + ", android:windowIsFloating: " + this.S + ", windowActionModeOverlay: " + this.R + ", windowNoTitle: " + this.T + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void m() {
        if (this.f11746f != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final Context n() {
        Context context;
        b0 q10 = q();
        if (q10 != null) {
            if (q10.f11661b == null) {
                TypedValue typedValue = new TypedValue();
                q10.f11660a.getTheme().resolveAttribute(2130968586, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    q10.f11661b = new ContextThemeWrapper(q10.f11660a, i3);
                } else {
                    q10.f11661b = q10.f11660a;
                }
            }
            context = q10.f11661b;
        } else {
            context = null;
        }
        if (context == null) {
            return this.f11744e;
        }
        return context;
    }

    public final p o(Context context) {
        if (this.f11748g0 == null) {
            if (android.support.v4.media.session.a0.f1184f == null) {
                Context applicationContext = context.getApplicationContext();
                android.support.v4.media.session.a0.f1184f = new android.support.v4.media.session.a0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f11748g0 = new o(this, android.support.v4.media.session.a0.f1184f);
        }
        return this.f11748g0;
    }

    @Override
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final r p(int i3) {
        Object[] objArr = this.V;
        if (objArr == null || objArr.length <= i3) {
            r[] rVarArr = new r[i3 + 1];
            if (objArr != null) {
                System.arraycopy(objArr, 0, rVarArr, 0, objArr.length);
            }
            this.V = rVarArr;
            objArr = rVarArr;
        }
        r rVar = objArr[i3];
        if (rVar == 0) {
            ?? obj = new Object();
            obj.f11723a = i3;
            obj.f11734n = false;
            objArr[i3] = obj;
            return obj;
        }
        return rVar;
    }

    public final b0 q() {
        l();
        if (this.P && this.f11754n == null) {
            u uVar = this.d;
            if (com.google.android.recaptcha.internal.a.u(uVar)) {
                this.f11754n = new b0(uVar);
            }
            b0 b0Var = this.f11754n;
            if (b0Var != null) {
                b0Var.c(this.f11753l0);
            }
        }
        return this.f11754n;
    }

    public final void r(int i3) {
        this.f11751j0 = (1 << i3) | this.f11751j0;
        if (!this.f11750i0) {
            View decorView = this.f11746f.getDecorView();
            WeakHashMap weakHashMap = i0.f54015a;
            decorView.postOnAnimation(this.f11752k0);
            this.f11750i0 = true;
        }
    }

    public final boolean s() {
        k1 k1Var;
        f3 f3Var;
        l.m mVar;
        boolean z10 = this.X;
        this.X = false;
        r p10 = p(0);
        if (p10.f11733m) {
            if (!z10) {
                i(p10, true);
                return true;
            }
        } else {
            k.a aVar = this.f11763y;
            if (aVar != null) {
                aVar.c();
                return true;
            }
            b0 q10 = q();
            if (q10 == null || (k1Var = q10.f11663e) == null || (f3Var = ((k3) k1Var).f18622a.f1406f0) == null || f3Var.f18577b == null) {
                return false;
            }
            f3 f3Var2 = ((k3) k1Var).f18622a.f1406f0;
            if (f3Var2 == null) {
                mVar = null;
            } else {
                mVar = f3Var2.f18577b;
            }
            if (mVar != null) {
                mVar.collapseActionView();
            }
        }
        return true;
    }

    public final void t(g.r r14, android.view.KeyEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.t(g.r, android.view.KeyEvent):void");
    }

    public final boolean u(r rVar, int i3, KeyEvent keyEvent) {
        l.k kVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!rVar.f11731k && !v(rVar, keyEvent)) || (kVar = rVar.h) == null) {
            return false;
        }
        return kVar.performShortcut(i3, keyEvent, 1);
    }

    public final boolean v(g.r r13, android.view.KeyEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.v(g.r, android.view.KeyEvent):boolean");
    }

    public final void w() {
        if (!this.J) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void x() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f11757p0 != null && (p(0).f11733m || this.f11763y != null)) {
                z10 = true;
            }
            if (z10 && this.f11758q0 == null) {
                this.f11758q0 = m.b(this.f11757p0, this);
            } else if (!z10 && (onBackInvokedCallback = this.f11758q0) != null) {
                m.c(this.f11757p0, onBackInvokedCallback);
            }
        }
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
