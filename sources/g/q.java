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
import f7.o7;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;
import m.k1;
import m.k3;
import m.l1;
import m.p3;
import m.w3;
import r0.b0;
import r0.j0;
import r0.m0;
public final class q extends g implements l.i, LayoutInflater.Factory2 {
    public static final a0.k m0 = new a0.k(0);
    public static final int[] f7009n0 = {16842836};
    public static final boolean f7010o0 = !"robolectric".equals(Build.FINGERPRINT);
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
    public boolean f7011a0;
    public n f7012b0;
    public n f7013c0;
    public final s d;
    public boolean f7014d0;
    public final Context f7015e;
    public int f7016e0;
    public Window f7017f;
    public final h f7018f0;
    public boolean f7019g0;
    public m h;
    public Rect f7020h0;
    public Rect f7021i0;
    public u f7022j0;
    public OnBackInvokedDispatcher f7023k0;
    public OnBackInvokedCallback f7024l0;
    public a0 f7025n;
    public CharSequence f7026r;
    public k1 f7027s;
    public android.support.v4.media.c v;
    public xa.c f7028w;
    public k.a f7029x;
    public ActionBarContextView f7030y;

    public q(s sVar, s sVar2) {
        Context context = sVar.getContext();
        Window window = sVar.getWindow();
        this.C = null;
        this.D = true;
        this.X = -100;
        this.f7018f0 = new h(this, 0);
        this.f7015e = context;
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
        this.W = new Configuration(this.f7015e.getResources().getConfiguration());
        this.U = true;
    }

    @Override
    public final boolean c(int i9) {
        if (i9 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i9 = 108;
        } else if (i9 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i9 = 109;
        }
        if (this.O && i9 == 108) {
            return false;
        }
        if (this.K && i9 == 1) {
            this.K = false;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 5) {
                    if (i9 != 10) {
                        if (i9 != 108) {
                            if (i9 != 109) {
                                return this.f7017f.requestFeature(i9);
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
        int i9;
        int i10;
        Object obj;
        boolean z11 = false;
        if (this.V) {
            return false;
        }
        int i11 = this.X;
        if (i11 == -100) {
            i11 = g.f6981a;
        }
        Context context = this.f7015e;
        int i12 = -1;
        if (i11 != -100) {
            if (i11 != -1) {
                if (i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        if (i11 == 3) {
                            if (this.f7013c0 == null) {
                                this.f7013c0 = new n(this, context);
                            }
                            i12 = this.f7013c0.e();
                        } else {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    i12 = o(context).e();
                }
            }
            i12 = i11;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                i9 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            } else {
                i9 = 32;
            }
        } else {
            i9 = 16;
        }
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.uiMode = i9 | (configuration.uiMode & (-49));
        this.f7011a0 = true;
        int i13 = this.Z;
        Configuration configuration2 = this.W;
        if (configuration2 == null) {
            configuration2 = context.getResources().getConfiguration();
        }
        int i14 = configuration2.uiMode & 48;
        int i15 = configuration.uiMode & 48;
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 24) {
            k.b(configuration2);
        } else {
            n0.c.b(j.a(configuration2.locale));
        }
        if (i14 != i15) {
            i10 = 512;
        } else {
            i10 = 0;
        }
        if (((~i13) & i10) != 0 && z10 && this.T && !f7010o0) {
            boolean z12 = this.U;
        }
        if (i10 != 0) {
            Resources resources = context.getResources();
            Configuration configuration3 = new Configuration(resources.getConfiguration());
            configuration3.uiMode = i15 | (resources.getConfiguration().uiMode & (-49));
            Map map = null;
            r5 = null;
            r5 = null;
            Object obj2 = null;
            Object obj3 = null;
            resources.updateConfiguration(configuration3, null);
            if (i16 < 26 && i16 < 28) {
                if (i16 >= 24) {
                    if (!o7.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            o7.f5774g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
                        }
                        o7.h = true;
                    }
                    Field field = o7.f5774g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e11) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!o7.f5770b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    o7.f5769a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
                                }
                                o7.f5770b = true;
                            }
                            Field field2 = o7.f5769a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e13) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                                }
                            }
                            if (obj2 != null) {
                                o7.a(obj2);
                            }
                        }
                    }
                } else if (i16 >= 23) {
                    if (!o7.f5770b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            o7.f5769a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e14);
                        }
                        o7.f5770b = true;
                    }
                    Field field3 = o7.f5769a;
                    if (field3 != null) {
                        try {
                            obj3 = field3.get(resources);
                        } catch (IllegalAccessException e15) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e15);
                        }
                    }
                    if (obj3 != null) {
                        o7.a(obj3);
                    }
                } else {
                    if (!o7.f5770b) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            o7.f5769a = declaredField4;
                            declaredField4.setAccessible(true);
                        } catch (NoSuchFieldException e16) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e16);
                        }
                        o7.f5770b = true;
                    }
                    Field field4 = o7.f5769a;
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
            int i17 = this.Y;
            if (i17 != 0) {
                context.setTheme(i17);
                if (Build.VERSION.SDK_INT >= 23) {
                    context.getTheme().applyStyle(this.Y, true);
                }
            }
            z11 = true;
        }
        if (i11 == 0) {
            o(context).l();
        } else {
            n nVar = this.f7012b0;
            if (nVar != null) {
                nVar.c();
            }
        }
        if (i11 == 3) {
            if (this.f7013c0 == null) {
                this.f7013c0 = new n(this, context);
            }
            this.f7013c0.l();
        } else {
            n nVar2 = this.f7013c0;
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
        if (this.f7017f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof m)) {
                m mVar = new m(this, callback);
                this.h = mVar;
                window.setCallback(mVar);
                Context context = this.f7015e;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f7009n0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    m.r a2 = m.r.a();
                    synchronized (a2) {
                        drawable = a2.f17064a.f(resourceId, context, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f7017f = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f7023k0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f7024l0) != null) {
                        l.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f7024l0 = null;
                    }
                    this.f7023k0 = null;
                    y();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void f(int i9, p pVar, l.k kVar) {
        if (kVar == null) {
            if (pVar == null && i9 >= 0) {
                p[] pVarArr = this.Q;
                if (i9 < pVarArr.length) {
                    pVar = pVarArr[i9];
                }
            }
            if (pVar != null) {
                kVar = pVar.h;
            }
        }
        if ((pVar == null || pVar.f7005m) && !this.V) {
            m mVar = this.h;
            Window.Callback callback = this.f7017f.getCallback();
            mVar.getClass();
            try {
                mVar.d = true;
                callback.onPanelClosed(i9, kVar);
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
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f7027s;
        actionBarOverlayLayout.f();
        ActionMenuView actionMenuView = ((p3) actionBarOverlayLayout.f474e).f17037a.f512a;
        if (actionMenuView != null && (iVar = actionMenuView.F) != null) {
            iVar.f();
            m.e eVar = iVar.F;
            if (eVar != null && eVar.b()) {
                eVar.f16617i.dismiss();
            }
        }
        Window.Callback callback = this.f7017f.getCallback();
        if (callback != null && !this.V) {
            callback.onPanelClosed(108, kVar);
        }
        this.P = false;
    }

    public final void h(p pVar, boolean z10) {
        o oVar;
        k1 k1Var;
        m.i iVar;
        if (z10 && pVar.f6995a == 0 && (k1Var = this.f7027s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
            actionBarOverlayLayout.f();
            ActionMenuView actionMenuView = ((p3) actionBarOverlayLayout.f474e).f17037a.f512a;
            if (actionMenuView != null && (iVar = actionMenuView.F) != null && iVar.g()) {
                g(pVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f7015e.getSystemService("window");
        if (windowManager != null && pVar.f7005m && (oVar = pVar.f6998e) != null) {
            windowManager.removeView(oVar);
            if (z10) {
                f(pVar.f6995a, pVar, null);
            }
        }
        pVar.f7003k = false;
        pVar.f7004l = false;
        pVar.f7005m = false;
        pVar.f6999f = null;
        pVar.f7006n = true;
        if (this.R == pVar) {
            this.R = null;
        }
        if (pVar.f6995a == 0) {
            y();
        }
    }

    public final boolean i(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: g.q.i(android.view.KeyEvent):boolean");
    }

    public final void j(int i9) {
        p p6 = p(i9);
        if (p6.h != null) {
            Bundle bundle = new Bundle();
            p6.h.t(bundle);
            if (bundle.size() > 0) {
                p6.f7008p = bundle;
            }
            p6.h.w();
            p6.h.clear();
        }
        p6.f7007o = true;
        p6.f7006n = true;
        if ((i9 == 108 || i9 == 0) && this.f7027s != null) {
            p p9 = p(0);
            p9.f7003k = false;
            w(p9, null);
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        Context context;
        if (!this.E) {
            Context context2 = this.f7015e;
            int[] iArr = f.a.f5276j;
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
                this.f7017f.getDecorView();
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
                        this.f7027s = k1Var;
                        k1Var.setWindowCallback(this.f7017f.getCallback());
                        if (this.L) {
                            ((ActionBarOverlayLayout) this.f7027s).e(109);
                        }
                        if (this.I) {
                            ((ActionBarOverlayLayout) this.f7027s).e(2);
                        }
                        if (this.J) {
                            ((ActionBarOverlayLayout) this.f7027s).e(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.M ? (ViewGroup) from.inflate(2131492886, (ViewGroup) null) : (ViewGroup) from.inflate(2131492885, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    fa.c cVar = new fa.c(this, 17);
                    WeakHashMap weakHashMap = j0.f46915a;
                    b0.j(viewGroup, cVar);
                    if (this.f7027s == null) {
                        this.G = (TextView) viewGroup.findViewById(2131296712);
                    }
                    Method method = w3.f17123a;
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
                    ViewGroup viewGroup2 = (ViewGroup) this.f7017f.findViewById(16908290);
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
                    this.f7017f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new k5.i(this, 15));
                    this.F = viewGroup;
                    CharSequence charSequence = this.f7026r;
                    if (!TextUtils.isEmpty(charSequence)) {
                        k1 k1Var2 = this.f7027s;
                        if (k1Var2 != null) {
                            k1Var2.setWindowTitle(charSequence);
                        } else {
                            a0 a0Var = this.f7025n;
                            if (a0Var != null) {
                                p3 p3Var = (p3) a0Var.f6927e;
                                if (!p3Var.f17042g) {
                                    Toolbar toolbar = p3Var.f17037a;
                                    p3Var.h = charSequence;
                                    if ((p3Var.f17038b & 8) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (p3Var.f17042g) {
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
                    View decorView = this.f7017f.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = j0.f46915a;
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
                    p p6 = p(0);
                    if (!this.V && p6.h == null) {
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

    @Override
    public final void l(l.k r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.q.l(l.k):void");
    }

    public final void m() {
        if (this.f7017f != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final Context n() {
        Context context;
        a0 q10 = q();
        if (q10 != null) {
            if (q10.f6925b == null) {
                TypedValue typedValue = new TypedValue();
                q10.f6924a.getTheme().resolveAttribute(2130968586, typedValue, true);
                int i9 = typedValue.resourceId;
                if (i9 != 0) {
                    q10.f6925b = new ContextThemeWrapper(q10.f6924a, i9);
                } else {
                    q10.f6925b = q10.f6924a;
                }
            }
            context = q10.f6925b;
        } else {
            context = null;
        }
        if (context == null) {
            return this.f7015e;
        }
        return context;
    }

    public final f2.x o(Context context) {
        if (this.f7012b0 == null) {
            if (a5.m.f96e == null) {
                Context applicationContext = context.getApplicationContext();
                a5.m.f96e = new a5.m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f7012b0 = new n(this, a5.m.f96e);
        }
        return this.f7012b0;
    }

    @Override
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        throw new UnsupportedOperationException("Method not decompiled: g.q.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final p p(int i9) {
        Object[] objArr = this.Q;
        if (objArr == null || objArr.length <= i9) {
            p[] pVarArr = new p[i9 + 1];
            if (objArr != null) {
                System.arraycopy(objArr, 0, pVarArr, 0, objArr.length);
            }
            this.Q = pVarArr;
            objArr = pVarArr;
        }
        p pVar = objArr[i9];
        if (pVar == 0) {
            ?? obj = new Object();
            obj.f6995a = i9;
            obj.f7006n = false;
            objArr[i9] = obj;
            return obj;
        }
        return pVar;
    }

    public final a0 q() {
        k();
        if (this.K && this.f7025n == null) {
            s sVar = this.d;
            if (e2.c.v(sVar)) {
                this.f7025n = new a0(sVar);
            }
            a0 a0Var = this.f7025n;
            if (a0Var != null) {
                a0Var.c(this.f7019g0);
            }
        }
        return this.f7025n;
    }

    @Override
    public final boolean r(l.k kVar, MenuItem menuItem) {
        int i9;
        p pVar;
        Window.Callback callback = this.f7017f.getCallback();
        if (callback != null && !this.V) {
            l.k k10 = kVar.k();
            p[] pVarArr = this.Q;
            if (pVarArr != null) {
                i9 = pVarArr.length;
            } else {
                i9 = 0;
            }
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    pVar = pVarArr[i10];
                    if (pVar != null && pVar.h == k10) {
                        break;
                    }
                    i10++;
                } else {
                    pVar = null;
                    break;
                }
            }
            if (pVar != null) {
                return callback.onMenuItemSelected(pVar.f6995a, menuItem);
            }
        }
        return false;
    }

    public final void s(int i9) {
        this.f7016e0 = (1 << i9) | this.f7016e0;
        if (!this.f7014d0) {
            View decorView = this.f7017f.getDecorView();
            WeakHashMap weakHashMap = j0.f46915a;
            decorView.postOnAnimation(this.f7018f0);
            this.f7014d0 = true;
        }
    }

    public final boolean t() {
        l1 l1Var;
        k3 k3Var;
        l.m mVar;
        boolean z10 = this.S;
        this.S = false;
        p p6 = p(0);
        if (p6.f7005m) {
            if (!z10) {
                h(p6, true);
                return true;
            }
        } else {
            k.a aVar = this.f7029x;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            a0 q10 = q();
            if (q10 == null || (l1Var = q10.f6927e) == null || (k3Var = ((p3) l1Var).f17037a.f513a0) == null || k3Var.f16991b == null) {
                return false;
            }
            k3 k3Var2 = ((p3) l1Var).f17037a.f513a0;
            if (k3Var2 == null) {
                mVar = null;
            } else {
                mVar = k3Var2.f16991b;
            }
            if (mVar != null) {
                mVar.collapseActionView();
            }
        }
        return true;
    }

    public final void u(g.p r18, android.view.KeyEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: g.q.u(g.p, android.view.KeyEvent):void");
    }

    public final boolean v(p pVar, int i9, KeyEvent keyEvent) {
        l.k kVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!pVar.f7003k && !w(pVar, keyEvent)) || (kVar = pVar.h) == null) {
            return false;
        }
        return kVar.performShortcut(i9, keyEvent, 1);
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
            if (this.f7023k0 != null && (p(0).f7005m || this.f7029x != null)) {
                z10 = true;
            }
            if (z10 && this.f7024l0 == null) {
                this.f7024l0 = l.b(this.f7023k0, this);
            } else if (!z10 && (onBackInvokedCallback = this.f7024l0) != null) {
                l.c(this.f7023k0, onBackInvokedCallback);
            }
        }
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
