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
import j7.p7;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;
import m.i3;
import m.j1;
import m.k1;
import m.n3;
import m.u3;
import r0.b0;
import r0.j0;
import r0.m0;
public final class q extends g implements l.j, LayoutInflater.Factory2 {
    public static final a0.k f6762n0 = new a0.k(0);
    public static final int[] f6763o0 = {16842836};
    public static final boolean f6764p0 = !"robolectric".equals(Build.FINGERPRINT);
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
    public int f6765a0;
    public boolean f6766b0;
    public n f6767c0;
    public final s d;
    public n f6768d0;
    public final Context f6769e;
    public boolean f6770e0;
    public Window f6771f;
    public int f6772f0;
    public final h f6773g0;
    public m h;
    public boolean f6774h0;
    public Rect f6775i0;
    public Rect f6776j0;
    public u f6777k0;
    public OnBackInvokedDispatcher f6778l0;
    public OnBackInvokedCallback m0;
    public a0 f6779n;
    public CharSequence f6780r;
    public j1 f6781s;
    public y5.h v;
    public f0 f6782w;
    public k.a f6783x;
    public ActionBarContextView f6784y;

    public q(s sVar, s sVar2) {
        Context context = sVar.getContext();
        Window window = sVar.getWindow();
        this.D = null;
        this.E = true;
        this.Y = -100;
        this.f6773g0 = new h(this, 0);
        this.f6769e = context;
        this.d = sVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.Y == -100) {
            String name = this.d.getClass().getName();
            a0.k kVar = f6762n0;
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
        this.X = new Configuration(this.f6769e.getResources().getConfiguration());
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
                                return this.f6771f.requestFeature(i10);
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
            i12 = g.f6734a;
        }
        Context context = this.f6769e;
        int i13 = -1;
        if (i12 != -100) {
            if (i12 != -1) {
                if (i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        if (i12 == 3) {
                            if (this.f6768d0 == null) {
                                this.f6768d0 = new n(this, context);
                            }
                            i13 = this.f6768d0.e();
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
        this.f6766b0 = true;
        int i14 = this.f6765a0;
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
        if (((~i14) & i11) != 0 && z4 && this.U && !f6764p0) {
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
                    if (!p7.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            p7.f9733g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e6) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e6);
                        }
                        p7.h = true;
                    }
                    Field field = p7.f9733g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e10);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!p7.f9729b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    p7.f9728a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e11) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e11);
                                }
                                p7.f9729b = true;
                            }
                            Field field2 = p7.f9728a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e12);
                                }
                            }
                            if (obj2 != null) {
                                p7.a(obj2);
                            }
                        }
                    }
                } else if (i17 >= 23) {
                    if (!p7.f9729b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            p7.f9728a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e13) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e13);
                        }
                        p7.f9729b = true;
                    }
                    Field field3 = p7.f9728a;
                    if (field3 != null) {
                        try {
                            obj3 = field3.get(resources);
                        } catch (IllegalAccessException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e14);
                        }
                    }
                    if (obj3 != null) {
                        p7.a(obj3);
                    }
                } else {
                    if (!p7.f9729b) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            p7.f9728a = declaredField4;
                            declaredField4.setAccessible(true);
                        } catch (NoSuchFieldException e15) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e15);
                        }
                        p7.f9729b = true;
                    }
                    Field field4 = p7.f9728a;
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
            n nVar = this.f6767c0;
            if (nVar != null) {
                nVar.c();
            }
        }
        if (i12 == 3) {
            if (this.f6768d0 == null) {
                this.f6768d0 = new n(this, context);
            }
            this.f6768d0.l();
        } else {
            n nVar2 = this.f6768d0;
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
        if (this.f6771f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof m)) {
                m mVar = new m(this, callback);
                this.h = mVar;
                window.setCallback(mVar);
                Context context = this.f6769e;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f6763o0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    m.q a2 = m.q.a();
                    synchronized (a2) {
                        drawable = a2.f13302a.f(resourceId, context, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f6771f = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f6778l0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.m0) != null) {
                        l.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.m0 = null;
                    }
                    this.f6778l0 = null;
                    y();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void f(int i10, p pVar, l.l lVar) {
        if (lVar == null) {
            if (pVar == null && i10 >= 0) {
                p[] pVarArr = this.R;
                if (i10 < pVarArr.length) {
                    pVar = pVarArr[i10];
                }
            }
            if (pVar != null) {
                lVar = pVar.h;
            }
        }
        if ((pVar == null || pVar.f6758m) && !this.W) {
            m mVar = this.h;
            Window.Callback callback = this.f6771f.getCallback();
            mVar.getClass();
            try {
                mVar.d = true;
                callback.onPanelClosed(i10, lVar);
            } finally {
                mVar.d = false;
            }
        }
    }

    public final void g(l.l lVar) {
        m.h hVar;
        if (this.Q) {
            return;
        }
        this.Q = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f6781s;
        actionBarOverlayLayout.f();
        ActionMenuView actionMenuView = ((n3) actionBarOverlayLayout.f441e).f13264a.f480a;
        if (actionMenuView != null && (hVar = actionMenuView.G) != null) {
            hVar.f();
            m.d dVar = hVar.G;
            if (dVar != null && dVar.b()) {
                dVar.f11458i.dismiss();
            }
        }
        Window.Callback callback = this.f6771f.getCallback();
        if (callback != null && !this.W) {
            callback.onPanelClosed(108, lVar);
        }
        this.Q = false;
    }

    public final void h(p pVar, boolean z4) {
        o oVar;
        j1 j1Var;
        m.h hVar;
        if (z4 && pVar.f6748a == 0 && (j1Var = this.f6781s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.f();
            ActionMenuView actionMenuView = ((n3) actionBarOverlayLayout.f441e).f13264a.f480a;
            if (actionMenuView != null && (hVar = actionMenuView.G) != null && hVar.g()) {
                g(pVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f6769e.getSystemService("window");
        if (windowManager != null && pVar.f6758m && (oVar = pVar.f6751e) != null) {
            windowManager.removeView(oVar);
            if (z4) {
                f(pVar.f6748a, pVar, null);
            }
        }
        pVar.f6756k = false;
        pVar.f6757l = false;
        pVar.f6758m = false;
        pVar.f6752f = null;
        pVar.f6759n = true;
        if (this.S == pVar) {
            this.S = null;
        }
        if (pVar.f6748a == 0) {
            y();
        }
    }

    public final boolean i(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: g.q.i(android.view.KeyEvent):boolean");
    }

    @Override
    public final void j(l.l r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.q.j(l.l):void");
    }

    public final void k(int i10) {
        p p10 = p(i10);
        if (p10.h != null) {
            Bundle bundle = new Bundle();
            p10.h.t(bundle);
            if (bundle.size() > 0) {
                p10.f6761p = bundle;
            }
            p10.h.w();
            p10.h.clear();
        }
        p10.f6760o = true;
        p10.f6759n = true;
        if ((i10 == 108 || i10 == 0) && this.f6781s != null) {
            p p11 = p(0);
            p11.f6756k = false;
            w(p11, null);
        }
    }

    public final void l() {
        ViewGroup viewGroup;
        Context context;
        if (!this.F) {
            Context context2 = this.f6769e;
            int[] iArr = f.a.f5695j;
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
                this.f6771f.getDecorView();
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
                        j1 j1Var = (j1) viewGroup.findViewById(2131296411);
                        this.f6781s = j1Var;
                        j1Var.setWindowCallback(this.f6771f.getCallback());
                        if (this.M) {
                            ((ActionBarOverlayLayout) this.f6781s).e(109);
                        }
                        if (this.J) {
                            ((ActionBarOverlayLayout) this.f6781s).e(2);
                        }
                        if (this.K) {
                            ((ActionBarOverlayLayout) this.f6781s).e(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.N ? (ViewGroup) from.inflate(2131492886, (ViewGroup) null) : (ViewGroup) from.inflate(2131492885, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    ja.c cVar = new ja.c(this);
                    WeakHashMap weakHashMap = j0.f46438a;
                    b0.j(viewGroup, cVar);
                    if (this.f6781s == null) {
                        this.H = (TextView) viewGroup.findViewById(2131296712);
                    }
                    Method method = u3.f13356a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, null);
                    } catch (IllegalAccessException e6) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e6);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131296304);
                    ViewGroup viewGroup2 = (ViewGroup) this.f6771f.findViewById(16908290);
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
                    this.f6771f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new o5.i(this, 14));
                    this.G = viewGroup;
                    CharSequence charSequence = this.f6780r;
                    if (!TextUtils.isEmpty(charSequence)) {
                        j1 j1Var2 = this.f6781s;
                        if (j1Var2 != null) {
                            j1Var2.setWindowTitle(charSequence);
                        } else {
                            a0 a0Var = this.f6779n;
                            if (a0Var != null) {
                                n3 n3Var = (n3) a0Var.f6680e;
                                if (!n3Var.f13269g) {
                                    Toolbar toolbar = n3Var.f13264a;
                                    n3Var.h = charSequence;
                                    if ((n3Var.f13265b & 8) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (n3Var.f13269g) {
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
                    View decorView = this.f6771f.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = j0.f46438a;
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
                    p p10 = p(0);
                    if (!this.W && p10.h == null) {
                        r(108);
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
        if (this.f6771f != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final Context n() {
        Context context;
        a0 q10 = q();
        if (q10 != null) {
            if (q10.f6678b == null) {
                TypedValue typedValue = new TypedValue();
                q10.f6677a.getTheme().resolveAttribute(2130968586, typedValue, true);
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    q10.f6678b = new ContextThemeWrapper(q10.f6677a, i10);
                } else {
                    q10.f6678b = q10.f6677a;
                }
            }
            context = q10.f6678b;
        } else {
            context = null;
        }
        if (context == null) {
            return this.f6769e;
        }
        return context;
    }

    public final f2.v o(Context context) {
        if (this.f6767c0 == null) {
            if (androidx.biometric.e.f525e == null) {
                Context applicationContext = context.getApplicationContext();
                androidx.biometric.e.f525e = new androidx.biometric.e(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f6767c0 = new n(this, androidx.biometric.e.f525e);
        }
        return this.f6767c0;
    }

    @Override
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        throw new UnsupportedOperationException("Method not decompiled: g.q.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final p p(int i10) {
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
            obj.f6748a = i10;
            obj.f6759n = false;
            objArr[i10] = obj;
            return obj;
        }
        return pVar;
    }

    public final a0 q() {
        l();
        if (this.L && this.f6779n == null) {
            s sVar = this.d;
            if (e2.c.s(sVar)) {
                this.f6779n = new a0(sVar);
            }
            a0 a0Var = this.f6779n;
            if (a0Var != null) {
                a0Var.c(this.f6774h0);
            }
        }
        return this.f6779n;
    }

    public final void r(int i10) {
        this.f6772f0 = (1 << i10) | this.f6772f0;
        if (!this.f6770e0) {
            View decorView = this.f6771f.getDecorView();
            WeakHashMap weakHashMap = j0.f46438a;
            decorView.postOnAnimation(this.f6773g0);
            this.f6770e0 = true;
        }
    }

    @Override
    public final boolean s(l.l lVar, MenuItem menuItem) {
        int i10;
        p pVar;
        Window.Callback callback = this.f6771f.getCallback();
        if (callback != null && !this.W) {
            l.l k10 = lVar.k();
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
                return callback.onMenuItemSelected(pVar.f6748a, menuItem);
            }
        }
        return false;
    }

    public final boolean t() {
        k1 k1Var;
        i3 i3Var;
        l.n nVar;
        boolean z4 = this.T;
        this.T = false;
        p p10 = p(0);
        if (p10.f6758m) {
            if (!z4) {
                h(p10, true);
                return true;
            }
        } else {
            k.a aVar = this.f6783x;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            a0 q10 = q();
            if (q10 == null || (k1Var = q10.f6680e) == null || (i3Var = ((n3) k1Var).f13264a.f483b0) == null || i3Var.f13220b == null) {
                return false;
            }
            i3 i3Var2 = ((n3) k1Var).f13264a.f483b0;
            if (i3Var2 == null) {
                nVar = null;
            } else {
                nVar = i3Var2.f13220b;
            }
            if (nVar != null) {
                nVar.collapseActionView();
            }
        }
        return true;
    }

    public final void u(g.p r14, android.view.KeyEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: g.q.u(g.p, android.view.KeyEvent):void");
    }

    public final boolean v(p pVar, int i10, KeyEvent keyEvent) {
        l.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!pVar.f6756k && !w(pVar, keyEvent)) || (lVar = pVar.h) == null) {
            return false;
        }
        return lVar.performShortcut(i10, keyEvent, 1);
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
            if (this.f6778l0 != null && (p(0).f6758m || this.f6783x != null)) {
                z4 = true;
            }
            if (z4 && this.m0 == null) {
                this.m0 = l.b(this.f6778l0, this);
            } else if (!z4 && (onBackInvokedCallback = this.m0) != null) {
                l.c(this.f6778l0, onBackInvokedCallback);
            }
        }
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
