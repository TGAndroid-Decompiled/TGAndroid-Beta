package g;

import ag.o1;
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
import h7.n7;
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
    public static final a0.k m0 = new a0.k(0);
    public static final int[] f6919n0 = {16842836};
    public static final boolean f6920o0 = !"robolectric".equals(Build.FINGERPRINT);
    public PopupWindow A;
    public h B;
    public m0 C;
    public final boolean D;
    public boolean E;
    public ViewGroup F;
    public TextView G;
    public View H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public p[] Q;
    public p R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Configuration W;
    public final int X;
    public int Y;
    public int Z;
    public boolean f6921a0;
    public n f6922b0;
    public n f6923c0;
    public final s d;
    public boolean f6924d0;
    public final Context f6925e;
    public int f6926e0;
    public Window f6927f;
    public final h f6928f0;
    public boolean f6929g0;
    public m h;
    public Rect f6930h0;
    public Rect f6931i0;
    public u f6932j0;
    public OnBackInvokedDispatcher f6933k0;
    public OnBackInvokedCallback f6934l0;
    public a0 f6935n;
    public CharSequence f6936r;
    public k1 f6937s;
    public m5.i v;
    public o1 f6938w;
    public k.a f6939x;
    public ActionBarContextView f6940y;

    public q(s sVar, s sVar2) {
        Context context = sVar.getContext();
        Window window = sVar.getWindow();
        this.C = null;
        this.D = true;
        this.X = -100;
        this.f6928f0 = new h(this, 0);
        this.f6925e = context;
        this.d = sVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.X == -100) {
            String name = this.d.getClass().getName();
            a0.k kVar = m0;
            Integer num = (Integer) kVar.get(name);
            if (num != null) {
                this.X = num.intValue();
                kVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            e(window);
        }
        m.r.c();
    }

    @Override
    public final void a() {
        this.T = true;
        d(false);
        m();
        this.W = new Configuration(this.f6925e.getResources().getConfiguration());
        this.U = true;
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
        if (this.O && i10 == 108) {
            return false;
        }
        if (this.K && i10 == 1) {
            this.K = false;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 5) {
                    if (i10 != 10) {
                        if (i10 != 108) {
                            if (i10 != 109) {
                                return this.f6927f.requestFeature(i10);
                            }
                            x();
                            this.L = true;
                            return true;
                        }
                        x();
                        this.K = true;
                        return true;
                    }
                    x();
                    this.M = true;
                    return true;
                }
                x();
                this.J = true;
                return true;
            }
            x();
            this.I = true;
            return true;
        }
        x();
        this.O = true;
        return true;
    }

    public final boolean d(boolean z10) {
        int i10;
        int i11;
        Object obj;
        boolean z11 = false;
        if (this.V) {
            return false;
        }
        int i12 = this.X;
        if (i12 == -100) {
            i12 = g.f6891a;
        }
        Context context = this.f6925e;
        int i13 = -1;
        if (i12 != -100) {
            if (i12 != -1) {
                if (i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        if (i12 == 3) {
                            if (this.f6923c0 == null) {
                                this.f6923c0 = new n(this, context);
                            }
                            i13 = this.f6923c0.e();
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
        this.f6921a0 = true;
        int i14 = this.Z;
        Configuration configuration2 = this.W;
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
        if (((~i14) & i11) != 0 && z10 && this.T && !f6920o0) {
            boolean z12 = this.U;
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
                    if (!n7.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            n7.f7720g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
                        }
                        n7.h = true;
                    }
                    Field field = n7.f7720g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e11) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!n7.f7716b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    n7.f7715a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
                                }
                                n7.f7716b = true;
                            }
                            Field field2 = n7.f7715a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e13) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                                }
                            }
                            if (obj2 != null) {
                                n7.a(obj2);
                            }
                        }
                    }
                } else if (i17 >= 23) {
                    if (!n7.f7716b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            n7.f7715a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e14);
                        }
                        n7.f7716b = true;
                    }
                    Field field3 = n7.f7715a;
                    if (field3 != null) {
                        try {
                            obj3 = field3.get(resources);
                        } catch (IllegalAccessException e15) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e15);
                        }
                    }
                    if (obj3 != null) {
                        n7.a(obj3);
                    }
                } else {
                    if (!n7.f7716b) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            n7.f7715a = declaredField4;
                            declaredField4.setAccessible(true);
                        } catch (NoSuchFieldException e16) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e16);
                        }
                        n7.f7716b = true;
                    }
                    Field field4 = n7.f7715a;
                    if (field4 != null) {
                        try {
                            map = (Map) field4.get(resources);
                        } catch (IllegalAccessException e17) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e17);
                        }
                        if (map != null) {
                            map.clear();
                        }
                    }
                }
            }
            int i18 = this.Y;
            if (i18 != 0) {
                context.setTheme(i18);
                if (Build.VERSION.SDK_INT >= 23) {
                    context.getTheme().applyStyle(this.Y, true);
                }
            }
            z11 = true;
        }
        if (i12 == 0) {
            o(context).l();
        } else {
            n nVar = this.f6922b0;
            if (nVar != null) {
                nVar.c();
            }
        }
        if (i12 == 3) {
            if (this.f6923c0 == null) {
                this.f6923c0 = new n(this, context);
            }
            this.f6923c0.l();
        } else {
            n nVar2 = this.f6923c0;
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
        if (this.f6927f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof m)) {
                m mVar = new m(this, callback);
                this.h = mVar;
                window.setCallback(mVar);
                Context context = this.f6925e;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f6919n0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    m.r a2 = m.r.a();
                    synchronized (a2) {
                        drawable = a2.f16663a.f(resourceId, context, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f6927f = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f6933k0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f6934l0) != null) {
                        l.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f6934l0 = null;
                    }
                    this.f6933k0 = null;
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
                p[] pVarArr = this.Q;
                if (i10 < pVarArr.length) {
                    pVar = pVarArr[i10];
                }
            }
            if (pVar != null) {
                kVar = pVar.h;
            }
        }
        if ((pVar == null || pVar.f6915m) && !this.V) {
            m mVar = this.h;
            Window.Callback callback = this.f6927f.getCallback();
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
        m.i iVar;
        if (this.P) {
            return;
        }
        this.P = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f6937s;
        actionBarOverlayLayout.f();
        ActionMenuView actionMenuView = ((o3) actionBarOverlayLayout.f966e).f16625a.f1004a;
        if (actionMenuView != null && (iVar = actionMenuView.F) != null) {
            iVar.f();
            m.e eVar = iVar.F;
            if (eVar != null && eVar.b()) {
                eVar.f14045i.dismiss();
            }
        }
        Window.Callback callback = this.f6927f.getCallback();
        if (callback != null && !this.V) {
            callback.onPanelClosed(108, kVar);
        }
        this.P = false;
    }

    public final void h(p pVar, boolean z10) {
        o oVar;
        k1 k1Var;
        m.i iVar;
        if (z10 && pVar.f6905a == 0 && (k1Var = this.f6937s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
            actionBarOverlayLayout.f();
            ActionMenuView actionMenuView = ((o3) actionBarOverlayLayout.f966e).f16625a.f1004a;
            if (actionMenuView != null && (iVar = actionMenuView.F) != null && iVar.h()) {
                g(pVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f6925e.getSystemService("window");
        if (windowManager != null && pVar.f6915m && (oVar = pVar.f6908e) != null) {
            windowManager.removeView(oVar);
            if (z10) {
                f(pVar.f6905a, pVar, null);
            }
        }
        pVar.f6913k = false;
        pVar.f6914l = false;
        pVar.f6915m = false;
        pVar.f6909f = null;
        pVar.f6916n = true;
        if (this.R == pVar) {
            this.R = null;
        }
        if (pVar.f6905a == 0) {
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
        p p10 = p(i10);
        if (p10.h != null) {
            Bundle bundle = new Bundle();
            p10.h.t(bundle);
            if (bundle.size() > 0) {
                p10.f6918p = bundle;
            }
            p10.h.w();
            p10.h.clear();
        }
        p10.f6917o = true;
        p10.f6916n = true;
        if ((i10 == 108 || i10 == 0) && this.f6937s != null) {
            p p11 = p(0);
            p11.f6913k = false;
            w(p11, null);
        }
    }

    public final void l() {
        ViewGroup viewGroup;
        Context context;
        if (!this.E) {
            Context context2 = this.f6925e;
            int[] iArr = f.a.f6238j;
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
                this.N = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                m();
                this.f6927f.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.O) {
                    if (this.N) {
                        viewGroup = (ViewGroup) from.inflate(2131492876, (ViewGroup) null);
                        this.L = false;
                        this.K = false;
                    } else if (this.K) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(2130968585, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new k.c(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(2131492887, (ViewGroup) null);
                        k1 k1Var = (k1) viewGroup.findViewById(2131296411);
                        this.f6937s = k1Var;
                        k1Var.setWindowCallback(this.f6927f.getCallback());
                        if (this.L) {
                            ((ActionBarOverlayLayout) this.f6937s).e(109);
                        }
                        if (this.I) {
                            ((ActionBarOverlayLayout) this.f6937s).e(2);
                        }
                        if (this.J) {
                            ((ActionBarOverlayLayout) this.f6937s).e(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.M ? (ViewGroup) from.inflate(2131492886, (ViewGroup) null) : (ViewGroup) from.inflate(2131492885, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    za.c cVar = new za.c(this, 15);
                    WeakHashMap weakHashMap = j0.f46829a;
                    b0.j(viewGroup, cVar);
                    if (this.f6937s == null) {
                        this.G = (TextView) viewGroup.findViewById(2131296712);
                    }
                    Method method = v3.f16717a;
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
                    ViewGroup viewGroup2 = (ViewGroup) this.f6927f.findViewById(16908290);
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
                    this.f6927f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new ha.c(this, 18));
                    this.F = viewGroup;
                    CharSequence charSequence = this.f6936r;
                    if (!TextUtils.isEmpty(charSequence)) {
                        k1 k1Var2 = this.f6937s;
                        if (k1Var2 != null) {
                            k1Var2.setWindowTitle(charSequence);
                        } else {
                            a0 a0Var = this.f6935n;
                            if (a0Var != null) {
                                o3 o3Var = (o3) a0Var.f6837e;
                                if (!o3Var.f16630g) {
                                    Toolbar toolbar = o3Var.f16625a;
                                    o3Var.h = charSequence;
                                    if ((o3Var.f16626b & 8) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (o3Var.f16630g) {
                                            j0.l(toolbar.getRootView(), charSequence);
                                        }
                                    }
                                }
                            } else {
                                TextView textView = this.G;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.F.findViewById(16908290);
                    View decorView = this.f6927f.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = j0.f46829a;
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
                    this.E = true;
                    p p10 = p(0);
                    if (!this.V && p10.h == null) {
                        s(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.K + ", windowActionBarOverlay: " + this.L + ", android:windowIsFloating: " + this.N + ", windowActionModeOverlay: " + this.M + ", windowNoTitle: " + this.O + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void m() {
        if (this.f6927f != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final Context n() {
        Context context;
        a0 r6 = r();
        if (r6 != null) {
            if (r6.f6835b == null) {
                TypedValue typedValue = new TypedValue();
                r6.f6834a.getTheme().resolveAttribute(2130968586, typedValue, true);
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    r6.f6835b = new ContextThemeWrapper(r6.f6834a, i10);
                } else {
                    r6.f6835b = r6.f6834a;
                }
            }
            context = r6.f6835b;
        } else {
            context = null;
        }
        if (context == null) {
            return this.f6925e;
        }
        return context;
    }

    public final f2.v o(Context context) {
        if (this.f6922b0 == null) {
            if (androidx.biometric.e.f1028e == null) {
                Context applicationContext = context.getApplicationContext();
                androidx.biometric.e.f1028e = new androidx.biometric.e(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f6922b0 = new n(this, androidx.biometric.e.f1028e);
        }
        return this.f6922b0;
    }

    @Override
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        throw new UnsupportedOperationException("Method not decompiled: g.q.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final p p(int i10) {
        Object[] objArr = this.Q;
        if (objArr == null || objArr.length <= i10) {
            p[] pVarArr = new p[i10 + 1];
            if (objArr != null) {
                System.arraycopy(objArr, 0, pVarArr, 0, objArr.length);
            }
            this.Q = pVarArr;
            objArr = pVarArr;
        }
        p pVar = objArr[i10];
        if (pVar == 0) {
            ?? obj = new Object();
            obj.f6905a = i10;
            obj.f6916n = false;
            objArr[i10] = obj;
            return obj;
        }
        return pVar;
    }

    @Override
    public final boolean q(l.k kVar, MenuItem menuItem) {
        int i10;
        p pVar;
        Window.Callback callback = this.f6927f.getCallback();
        if (callback != null && !this.V) {
            l.k k9 = kVar.k();
            p[] pVarArr = this.Q;
            if (pVarArr != null) {
                i10 = pVarArr.length;
            } else {
                i10 = 0;
            }
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    pVar = pVarArr[i11];
                    if (pVar != null && pVar.h == k9) {
                        break;
                    }
                    i11++;
                } else {
                    pVar = null;
                    break;
                }
            }
            if (pVar != null) {
                return callback.onMenuItemSelected(pVar.f6905a, menuItem);
            }
        }
        return false;
    }

    public final a0 r() {
        l();
        if (this.K && this.f6935n == null) {
            s sVar = this.d;
            if (com.google.android.recaptcha.internal.a.u(sVar)) {
                this.f6935n = new a0(sVar);
            }
            a0 a0Var = this.f6935n;
            if (a0Var != null) {
                a0Var.c(this.f6929g0);
            }
        }
        return this.f6935n;
    }

    public final void s(int i10) {
        this.f6926e0 = (1 << i10) | this.f6926e0;
        if (!this.f6924d0) {
            View decorView = this.f6927f.getDecorView();
            WeakHashMap weakHashMap = j0.f46829a;
            decorView.postOnAnimation(this.f6928f0);
            this.f6924d0 = true;
        }
    }

    public final boolean t() {
        l1 l1Var;
        j3 j3Var;
        l.m mVar;
        boolean z10 = this.S;
        this.S = false;
        p p10 = p(0);
        if (p10.f6915m) {
            if (!z10) {
                h(p10, true);
                return true;
            }
        } else {
            k.a aVar = this.f6939x;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            a0 r6 = r();
            if (r6 == null || (l1Var = r6.f6837e) == null || (j3Var = ((o3) l1Var).f16625a.f1005a0) == null || j3Var.f16581b == null) {
                return false;
            }
            j3 j3Var2 = ((o3) l1Var).f16625a.f1005a0;
            if (j3Var2 == null) {
                mVar = null;
            } else {
                mVar = j3Var2.f16581b;
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
        if ((!pVar.f6913k && !w(pVar, keyEvent)) || (kVar = pVar.h) == null) {
            return false;
        }
        return kVar.performShortcut(i10, keyEvent, 1);
    }

    public final boolean w(g.p r13, android.view.KeyEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: g.q.w(g.p, android.view.KeyEvent):boolean");
    }

    public final void x() {
        if (!this.E) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void y() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f6933k0 != null && (p(0).f6915m || this.f6939x != null)) {
                z10 = true;
            }
            if (z10 && this.f6934l0 == null) {
                this.f6934l0 = l.b(this.f6933k0, this);
            } else if (!z10 && (onBackInvokedCallback = this.f6934l0) != null) {
                l.c(this.f6933k0, onBackInvokedCallback);
            }
        }
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
