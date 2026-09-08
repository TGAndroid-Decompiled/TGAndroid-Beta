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
import com.google.android.gms.internal.vision.e2;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;
import m.g3;
import m.j1;
import m.k1;
import m.l3;
import m.s3;
import r0.i0;
import r0.l0;
import v7.k7;
public final class s extends h implements l.j, LayoutInflater.Factory2 {
    public static final a0.l f10258q0 = new a0.l(0);
    public static final int[] f10259r0 = {16842836};
    public static final boolean f10260s0 = !"robolectric".equals(Build.FINGERPRINT);
    public PopupWindow E;
    public i F;
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
    public r[] U;
    public r V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public Configuration f10261a0;
    public final int f10262b0;
    public int f10263c0;
    public final u d;
    public int f10264d0;
    public final Context f10265e;
    public boolean f10266e0;
    public Window f10267f;
    public o f10268f0;
    public o f10269g0;
    public n h;
    public boolean f10270h0;
    public int f10271i0;
    public final i f10272j0;
    public boolean f10273k0;
    public Rect f10274l0;
    public Rect m0;
    public b0 f10275n;
    public w f10276n0;
    public OnBackInvokedDispatcher f10277o0;
    public OnBackInvokedCallback f10278p0;
    public CharSequence f10279r;
    public j1 f10280s;
    public xa.c v;
    public a6.i f10281w;
    public k.a f10282x;
    public ActionBarContextView f10283y;

    public s(u uVar, u uVar2) {
        Context context = uVar.getContext();
        Window window = uVar.getWindow();
        this.G = null;
        this.H = true;
        this.f10262b0 = -100;
        this.f10272j0 = new i(this, 0);
        this.f10265e = context;
        this.d = uVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.f10262b0 == -100) {
            String name = this.d.getClass().getName();
            a0.l lVar = f10258q0;
            Integer num = (Integer) lVar.get(name);
            if (num != null) {
                this.f10262b0 = num.intValue();
                lVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            e(window);
        }
        m.q.c();
    }

    @Override
    public final void a() {
        this.X = true;
        d(false);
        l();
        this.f10261a0 = new Configuration(this.f10265e.getResources().getConfiguration());
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
                                return this.f10267f.requestFeature(i10);
                            }
                            x();
                            this.P = true;
                            return true;
                        }
                        x();
                        this.O = true;
                        return true;
                    }
                    x();
                    this.Q = true;
                    return true;
                }
                x();
                this.N = true;
                return true;
            }
            x();
            this.M = true;
            return true;
        }
        x();
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
        int i12 = this.f10262b0;
        if (i12 == -100) {
            i12 = h.f10228a;
        }
        Context context = this.f10265e;
        int i13 = -1;
        if (i12 != -100) {
            if (i12 != -1) {
                if (i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        if (i12 == 3) {
                            if (this.f10269g0 == null) {
                                this.f10269g0 = new o(this, context);
                            }
                            i13 = this.f10269g0.e();
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
        this.f10266e0 = true;
        int i14 = this.f10264d0;
        Configuration configuration2 = this.f10261a0;
        if (configuration2 == null) {
            configuration2 = context.getResources().getConfiguration();
        }
        int i15 = configuration2.uiMode & 48;
        int i16 = configuration.uiMode & 48;
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 24) {
            l.b(configuration2);
        } else {
            n0.c.b(k.a(configuration2.locale));
        }
        if (i15 != i16) {
            i11 = 512;
        } else {
            i11 = 0;
        }
        if (((~i14) & i11) != 0 && z10 && this.X && !f10260s0) {
            boolean z12 = this.Y;
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
                    if (!k7.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            k7.f47540g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e7) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e7);
                        }
                        k7.h = true;
                    }
                    Field field = k7.f47540g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e10);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!k7.f47536b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    k7.f47535a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e11) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e11);
                                }
                                k7.f47536b = true;
                            }
                            Field field2 = k7.f47535a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e12);
                                }
                            }
                            if (obj2 != null) {
                                k7.a(obj2);
                            }
                        }
                    }
                } else if (i17 >= 23) {
                    if (!k7.f47536b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            k7.f47535a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e13) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e13);
                        }
                        k7.f47536b = true;
                    }
                    Field field3 = k7.f47535a;
                    if (field3 != null) {
                        try {
                            obj3 = field3.get(resources);
                        } catch (IllegalAccessException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e14);
                        }
                    }
                    if (obj3 != null) {
                        k7.a(obj3);
                    }
                } else {
                    if (!k7.f47536b) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            k7.f47535a = declaredField4;
                            declaredField4.setAccessible(true);
                        } catch (NoSuchFieldException e15) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e15);
                        }
                        k7.f47536b = true;
                    }
                    Field field4 = k7.f47535a;
                    if (field4 != null) {
                        try {
                            map = (Map) field4.get(resources);
                        } catch (IllegalAccessException e16) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e16);
                        }
                        if (map != null) {
                            map.clear();
                        }
                    }
                }
            }
            int i18 = this.f10263c0;
            if (i18 != 0) {
                context.setTheme(i18);
                if (Build.VERSION.SDK_INT >= 23) {
                    context.getTheme().applyStyle(this.f10263c0, true);
                }
            }
            z11 = true;
        }
        if (i12 == 0) {
            o(context).l();
        } else {
            o oVar = this.f10268f0;
            if (oVar != null) {
                oVar.c();
            }
        }
        if (i12 == 3) {
            if (this.f10269g0 == null) {
                this.f10269g0 = new o(this, context);
            }
            this.f10269g0.l();
        } else {
            o oVar2 = this.f10269g0;
            if (oVar2 != null) {
                oVar2.c();
            }
        }
        return z11;
    }

    public final void e(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f10267f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof n)) {
                n nVar = new n(this, callback);
                this.h = nVar;
                window.setCallback(nVar);
                Context context = this.f10265e;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f10259r0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    m.q a2 = m.q.a();
                    synchronized (a2) {
                        drawable = a2.f15668a.f(resourceId, context, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f10267f = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f10277o0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f10278p0) != null) {
                        m.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f10278p0 = null;
                    }
                    this.f10277o0 = null;
                    y();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void f(int i10, r rVar, l.l lVar) {
        if (lVar == null) {
            if (rVar == null && i10 >= 0) {
                r[] rVarArr = this.U;
                if (i10 < rVarArr.length) {
                    rVar = rVarArr[i10];
                }
            }
            if (rVar != null) {
                lVar = rVar.h;
            }
        }
        if ((rVar == null || rVar.f10254m) && !this.Z) {
            n nVar = this.h;
            Window.Callback callback = this.f10267f.getCallback();
            nVar.getClass();
            try {
                nVar.d = true;
                callback.onPanelClosed(i10, lVar);
            } finally {
                nVar.d = false;
            }
        }
    }

    public final void g(l.l lVar) {
        m.h hVar;
        if (this.T) {
            return;
        }
        this.T = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f10280s;
        actionBarOverlayLayout.f();
        ActionMenuView actionMenuView = ((l3) actionBarOverlayLayout.f980e).f15596a.f1022a;
        if (actionMenuView != null && (hVar = actionMenuView.J) != null) {
            hVar.f();
            m.d dVar = hVar.J;
            if (dVar != null && dVar.b()) {
                dVar.f15199i.dismiss();
            }
        }
        Window.Callback callback = this.f10267f.getCallback();
        if (callback != null && !this.Z) {
            callback.onPanelClosed(108, lVar);
        }
        this.T = false;
    }

    public final void h(r rVar, boolean z10) {
        q qVar;
        j1 j1Var;
        m.h hVar;
        if (z10 && rVar.f10244a == 0 && (j1Var = this.f10280s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.f();
            ActionMenuView actionMenuView = ((l3) actionBarOverlayLayout.f980e).f15596a.f1022a;
            if (actionMenuView != null && (hVar = actionMenuView.J) != null && hVar.g()) {
                g(rVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f10265e.getSystemService("window");
        if (windowManager != null && rVar.f10254m && (qVar = rVar.f10247e) != null) {
            windowManager.removeView(qVar);
            if (z10) {
                f(rVar.f10244a, rVar, null);
            }
        }
        rVar.f10252k = false;
        rVar.f10253l = false;
        rVar.f10254m = false;
        rVar.f10248f = null;
        rVar.f10255n = true;
        if (this.V == rVar) {
            this.V = null;
        }
        if (rVar.f10244a == 0) {
            y();
        }
    }

    public final boolean i(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.i(android.view.KeyEvent):boolean");
    }

    public final void j(int i10) {
        r p5 = p(i10);
        if (p5.h != null) {
            Bundle bundle = new Bundle();
            p5.h.t(bundle);
            if (bundle.size() > 0) {
                p5.f10257p = bundle;
            }
            p5.h.w();
            p5.h.clear();
        }
        p5.f10256o = true;
        p5.f10255n = true;
        if ((i10 == 108 || i10 == 0) && this.f10280s != null) {
            r p10 = p(0);
            p10.f10252k = false;
            w(p10, null);
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        Context context;
        if (!this.I) {
            Context context2 = this.f10265e;
            int[] iArr = f.a.f9172j;
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
                this.f10267f.getDecorView();
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
                        this.f10280s = j1Var;
                        j1Var.setWindowCallback(this.f10267f.getCallback());
                        if (this.P) {
                            ((ActionBarOverlayLayout) this.f10280s).e(109);
                        }
                        if (this.M) {
                            ((ActionBarOverlayLayout) this.f10280s).e(2);
                        }
                        if (this.N) {
                            ((ActionBarOverlayLayout) this.f10280s).e(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.Q ? (ViewGroup) from.inflate(2131492886, (ViewGroup) null) : (ViewGroup) from.inflate(2131492885, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    a4.m mVar = new a4.m(this, 20);
                    WeakHashMap weakHashMap = i0.f44725a;
                    r0.a0.j(viewGroup, mVar);
                    if (this.f10280s == null) {
                        this.K = (TextView) viewGroup.findViewById(2131296712);
                    }
                    Method method = s3.f15692a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, null);
                    } catch (IllegalAccessException e7) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e7);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131296304);
                    ViewGroup viewGroup2 = (ViewGroup) this.f10267f.findViewById(16908290);
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
                    this.f10267f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new a6.m(this, 18));
                    this.J = viewGroup;
                    CharSequence charSequence = this.f10279r;
                    if (!TextUtils.isEmpty(charSequence)) {
                        j1 j1Var2 = this.f10280s;
                        if (j1Var2 != null) {
                            j1Var2.setWindowTitle(charSequence);
                        } else {
                            b0 b0Var = this.f10275n;
                            if (b0Var != null) {
                                l3 l3Var = (l3) b0Var.f10174e;
                                if (!l3Var.f15601g) {
                                    Toolbar toolbar = l3Var.f15596a;
                                    l3Var.h = charSequence;
                                    if ((l3Var.f15597b & 8) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (l3Var.f15601g) {
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
                    View decorView = this.f10267f.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = i0.f44725a;
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
                    r p5 = p(0);
                    if (!this.Z && p5.h == null) {
                        r(108);
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
        if (this.f10267f != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final Context m() {
        Context context;
        b0 q6 = q();
        if (q6 != null) {
            if (q6.f10172b == null) {
                TypedValue typedValue = new TypedValue();
                q6.f10171a.getTheme().resolveAttribute(2130968586, typedValue, true);
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    q6.f10172b = new ContextThemeWrapper(q6.f10171a, i10);
                } else {
                    q6.f10172b = q6.f10171a;
                }
            }
            context = q6.f10172b;
        } else {
            context = null;
        }
        if (context == null) {
            return this.f10265e;
        }
        return context;
    }

    @Override
    public final void n(l.l r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.n(l.l):void");
    }

    public final p o(Context context) {
        if (this.f10268f0 == null) {
            if (aa.a.f381e == null) {
                Context applicationContext = context.getApplicationContext();
                aa.a.f381e = new aa.a(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f10268f0 = new o(this, aa.a.f381e);
        }
        return this.f10268f0;
    }

    @Override
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final r p(int i10) {
        Object[] objArr = this.U;
        if (objArr == null || objArr.length <= i10) {
            r[] rVarArr = new r[i10 + 1];
            if (objArr != null) {
                System.arraycopy(objArr, 0, rVarArr, 0, objArr.length);
            }
            this.U = rVarArr;
            objArr = rVarArr;
        }
        r rVar = objArr[i10];
        if (rVar == 0) {
            ?? obj = new Object();
            obj.f10244a = i10;
            obj.f10255n = false;
            objArr[i10] = obj;
            return obj;
        }
        return rVar;
    }

    public final b0 q() {
        k();
        if (this.O && this.f10275n == null) {
            u uVar = this.d;
            if (e2.u(uVar)) {
                this.f10275n = new b0(uVar);
            }
            b0 b0Var = this.f10275n;
            if (b0Var != null) {
                b0Var.c(this.f10273k0);
            }
        }
        return this.f10275n;
    }

    public final void r(int i10) {
        this.f10271i0 = (1 << i10) | this.f10271i0;
        if (!this.f10270h0) {
            View decorView = this.f10267f.getDecorView();
            WeakHashMap weakHashMap = i0.f44725a;
            decorView.postOnAnimation(this.f10272j0);
            this.f10270h0 = true;
        }
    }

    @Override
    public final boolean s(l.l lVar, MenuItem menuItem) {
        int i10;
        r rVar;
        Window.Callback callback = this.f10267f.getCallback();
        if (callback != null && !this.Z) {
            l.l k10 = lVar.k();
            r[] rVarArr = this.U;
            if (rVarArr != null) {
                i10 = rVarArr.length;
            } else {
                i10 = 0;
            }
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    rVar = rVarArr[i11];
                    if (rVar != null && rVar.h == k10) {
                        break;
                    }
                    i11++;
                } else {
                    rVar = null;
                    break;
                }
            }
            if (rVar != null) {
                return callback.onMenuItemSelected(rVar.f10244a, menuItem);
            }
        }
        return false;
    }

    public final boolean t() {
        k1 k1Var;
        g3 g3Var;
        l.n nVar;
        boolean z10 = this.W;
        this.W = false;
        r p5 = p(0);
        if (p5.f10254m) {
            if (!z10) {
                h(p5, true);
                return true;
            }
        } else {
            k.a aVar = this.f10282x;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            b0 q6 = q();
            if (q6 == null || (k1Var = q6.f10174e) == null || (g3Var = ((l3) k1Var).f15596a.f1030e0) == null || g3Var.f15553b == null) {
                return false;
            }
            g3 g3Var2 = ((l3) k1Var).f15596a.f1030e0;
            if (g3Var2 == null) {
                nVar = null;
            } else {
                nVar = g3Var2.f15553b;
            }
            if (nVar != null) {
                nVar.collapseActionView();
            }
        }
        return true;
    }

    public final void u(g.r r14, android.view.KeyEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.u(g.r, android.view.KeyEvent):void");
    }

    public final boolean v(r rVar, int i10, KeyEvent keyEvent) {
        l.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!rVar.f10252k && !w(rVar, keyEvent)) || (lVar = rVar.h) == null) {
            return false;
        }
        return lVar.performShortcut(i10, keyEvent, 1);
    }

    public final boolean w(g.r r13, android.view.KeyEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.w(g.r, android.view.KeyEvent):boolean");
    }

    public final void x() {
        if (!this.I) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void y() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f10277o0 != null && (p(0).f10254m || this.f10282x != null)) {
                z10 = true;
            }
            if (z10 && this.f10278p0 == null) {
                this.f10278p0 = m.b(this.f10277o0, this);
            } else if (!z10 && (onBackInvokedCallback = this.f10278p0) != null) {
                m.c(this.f10277o0, onBackInvokedCallback);
            }
        }
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
