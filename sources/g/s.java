package g;

import a8.ha;
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
import java.util.WeakHashMap;
import m.f3;
import m.j1;
import m.k1;
import m.k3;
import m.r3;
import r0.i0;
import r0.l0;
public final class s extends g implements l.i, LayoutInflater.Factory2 {
    public static final a0.l f13011r0 = new a0.l(0);
    public static final int[] f13012s0 = {16842836};
    public static final boolean f13013t0 = !"robolectric".equals(Build.FINGERPRINT);
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
    public boolean f13014a0;
    public Configuration f13015b0;
    public final int f13016c0;
    public final u d;
    public int f13017d0;
    public final Context f13018e;
    public int f13019e0;
    public Window f13020f;
    public boolean f13021f0;
    public o f13022g0;
    public n h;
    public o f13023h0;
    public boolean f13024i0;
    public int f13025j0;
    public final h f13026k0;
    public boolean f13027l0;
    public Rect m0;
    public b0 f13028n;
    public Rect f13029n0;
    public w f13030o0;
    public OnBackInvokedDispatcher f13031p0;
    public OnBackInvokedCallback f13032q0;
    public CharSequence f13033r;
    public j1 f13034s;
    public d6.i f13035w;
    public i f13036x;
    public k.a f13037y;

    public s(u uVar, u uVar2) {
        Context context = uVar.getContext();
        Window window = uVar.getWindow();
        this.H = null;
        this.I = true;
        this.f13016c0 = -100;
        this.f13026k0 = new h(this, 0);
        this.f13018e = context;
        this.d = uVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.f13016c0 == -100) {
            String name = this.d.getClass().getName();
            a0.l lVar = f13011r0;
            Integer num = (Integer) lVar.get(name);
            if (num != null) {
                this.f13016c0 = num.intValue();
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
        this.Y = true;
        d(false);
        m();
        this.f13015b0 = new Configuration(this.f13018e.getResources().getConfiguration());
        this.Z = true;
    }

    @Override
    public final boolean c(int i7) {
        if (i7 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i7 = 108;
        } else if (i7 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i7 = 109;
        }
        if (this.T && i7 == 108) {
            return false;
        }
        if (this.P && i7 == 1) {
            this.P = false;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 5) {
                    if (i7 != 10) {
                        if (i7 != 108) {
                            if (i7 != 109) {
                                return this.f13020f.requestFeature(i7);
                            }
                            x();
                            this.Q = true;
                            return true;
                        }
                        x();
                        this.P = true;
                        return true;
                    }
                    x();
                    this.R = true;
                    return true;
                }
                x();
                this.O = true;
                return true;
            }
            x();
            this.N = true;
            return true;
        }
        x();
        this.T = true;
        return true;
    }

    public final boolean d(boolean z10) {
        int i7;
        int i10;
        Object obj;
        boolean z11 = false;
        if (this.f13014a0) {
            return false;
        }
        int i11 = this.f13016c0;
        if (i11 == -100) {
            i11 = g.f12980a;
        }
        Context context = this.f13018e;
        int i12 = -1;
        if (i11 != -100) {
            if (i11 != -1) {
                if (i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        if (i11 == 3) {
                            if (this.f13023h0 == null) {
                                this.f13023h0 = new o(this, context);
                            }
                            i12 = this.f13023h0.e();
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
                i7 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            } else {
                i7 = 32;
            }
        } else {
            i7 = 16;
        }
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.uiMode = i7 | (configuration.uiMode & (-49));
        this.f13021f0 = true;
        int i13 = this.f13019e0;
        Configuration configuration2 = this.f13015b0;
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
        if (((~i13) & i10) != 0 && z10 && this.Y && !f13013t0) {
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
                    if (!ha.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            ha.f482g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
                        }
                        ha.h = true;
                    }
                    Field field = ha.f482g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e11) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!ha.f478b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    ha.f477a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
                                }
                                ha.f478b = true;
                            }
                            Field field2 = ha.f477a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e13) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                                }
                            }
                            if (obj2 != null) {
                                ha.a(obj2);
                            }
                        }
                    }
                } else {
                    if (!ha.f478b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            ha.f477a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e14);
                        }
                        ha.f478b = true;
                    }
                    Field field3 = ha.f477a;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e15) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e15);
                        }
                    }
                    if (obj2 != null) {
                        ha.a(obj2);
                    }
                }
            }
            int i17 = this.f13017d0;
            if (i17 != 0) {
                context.setTheme(i17);
                context.getTheme().applyStyle(this.f13017d0, true);
            }
            z11 = true;
        }
        if (i11 == 0) {
            o(context).l();
        } else {
            o oVar = this.f13022g0;
            if (oVar != null) {
                oVar.c();
            }
        }
        if (i11 == 3) {
            if (this.f13023h0 == null) {
                this.f13023h0 = new o(this, context);
            }
            this.f13023h0.l();
        } else {
            o oVar2 = this.f13023h0;
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
        if (this.f13020f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof n)) {
                n nVar = new n(this, callback);
                this.h = nVar;
                window.setCallback(nVar);
                Context context = this.f13018e;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f13012s0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    m.q a10 = m.q.a();
                    synchronized (a10) {
                        drawable = a10.f20274a.f(resourceId, context, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f13020f = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f13031p0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f13032q0) != null) {
                        m.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f13032q0 = null;
                    }
                    this.f13031p0 = null;
                    y();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void f(int i7, r rVar, l.k kVar) {
        if (kVar == null) {
            if (rVar == null && i7 >= 0) {
                r[] rVarArr = this.V;
                if (i7 < rVarArr.length) {
                    rVar = rVarArr[i7];
                }
            }
            if (rVar != null) {
                kVar = rVar.h;
            }
        }
        if ((rVar == null || rVar.f13007m) && !this.f13014a0) {
            n nVar = this.h;
            Window.Callback callback = this.f13020f.getCallback();
            nVar.getClass();
            try {
                nVar.d = true;
                callback.onPanelClosed(i7, kVar);
            } finally {
                nVar.d = false;
            }
        }
    }

    public final void g(l.k kVar) {
        m.h hVar;
        if (this.U) {
            return;
        }
        this.U = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f13034s;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((k3) actionBarOverlayLayout.f1844e).f20192a.f1887a;
        if (actionMenuView != null && (hVar = actionMenuView.K) != null) {
            hVar.e();
            m.d dVar = hVar.K;
            if (dVar != null && dVar.b()) {
                dVar.f19336i.dismiss();
            }
        }
        Window.Callback callback = this.f13020f.getCallback();
        if (callback != null && !this.f13014a0) {
            callback.onPanelClosed(108, kVar);
        }
        this.U = false;
    }

    public final void h(r rVar, boolean z10) {
        q qVar;
        j1 j1Var;
        m.h hVar;
        if (z10 && rVar.f12997a == 0 && (j1Var = this.f13034s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.e();
            ActionMenuView actionMenuView = ((k3) actionBarOverlayLayout.f1844e).f20192a.f1887a;
            if (actionMenuView != null && (hVar = actionMenuView.K) != null && hVar.g()) {
                g(rVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f13018e.getSystemService("window");
        if (windowManager != null && rVar.f13007m && (qVar = rVar.f13000e) != null) {
            windowManager.removeView(qVar);
            if (z10) {
                f(rVar.f12997a, rVar, null);
            }
        }
        rVar.f13005k = false;
        rVar.f13006l = false;
        rVar.f13007m = false;
        rVar.f13001f = null;
        rVar.f13008n = true;
        if (this.W == rVar) {
            this.W = null;
        }
        if (rVar.f12997a == 0) {
            y();
        }
    }

    @Override
    public final void i(l.k r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.i(l.k):void");
    }

    public final boolean j(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.j(android.view.KeyEvent):boolean");
    }

    public final void k(int i7) {
        r q10 = q(i7);
        if (q10.h != null) {
            Bundle bundle = new Bundle();
            q10.h.t(bundle);
            if (bundle.size() > 0) {
                q10.f13010p = bundle;
            }
            q10.h.w();
            q10.h.clear();
        }
        q10.f13009o = true;
        q10.f13008n = true;
        if ((i7 == 108 || i7 == 0) && this.f13034s != null) {
            r q11 = q(0);
            q11.f13005k = false;
            w(q11, null);
        }
    }

    public final void l() {
        ViewGroup viewGroup;
        Context context;
        if (!this.J) {
            Context context2 = this.f13018e;
            int[] iArr = f.a.f10988j;
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
                m();
                this.f13020f.getDecorView();
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
                        j1 j1Var = (j1) viewGroup.findViewById(2131296413);
                        this.f13034s = j1Var;
                        j1Var.setWindowCallback(this.f13020f.getCallback());
                        if (this.Q) {
                            ((ActionBarOverlayLayout) this.f13034s).d(109);
                        }
                        if (this.N) {
                            ((ActionBarOverlayLayout) this.f13034s).d(2);
                        }
                        if (this.O) {
                            ((ActionBarOverlayLayout) this.f13034s).d(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.R ? (ViewGroup) from.inflate(2131492886, (ViewGroup) null) : (ViewGroup) from.inflate(2131492885, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    i iVar = new i(this);
                    WeakHashMap weakHashMap = i0.f56367a;
                    r0.a0.i(viewGroup, iVar);
                    if (this.f13034s == null) {
                        this.L = (TextView) viewGroup.findViewById(2131296716);
                    }
                    Method method = r3.f20291a;
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
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131296306);
                    ViewGroup viewGroup2 = (ViewGroup) this.f13020f.findViewById(16908290);
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
                    this.f13020f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new cb.c(this, 24));
                    this.K = viewGroup;
                    CharSequence charSequence = this.f13033r;
                    if (!TextUtils.isEmpty(charSequence)) {
                        j1 j1Var2 = this.f13034s;
                        if (j1Var2 != null) {
                            j1Var2.setWindowTitle(charSequence);
                        } else {
                            b0 b0Var = this.f13028n;
                            if (b0Var != null) {
                                k3 k3Var = (k3) b0Var.f12937e;
                                if (!k3Var.f20197g) {
                                    Toolbar toolbar = k3Var.f20192a;
                                    k3Var.h = charSequence;
                                    if ((k3Var.f20193b & 8) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (k3Var.f20197g) {
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
                    View decorView = this.f13020f.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = i0.f56367a;
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
                    r q10 = q(0);
                    if (!this.f13014a0 && q10.h == null) {
                        s(108);
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
        if (this.f13020f != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final Context n() {
        Context context;
        b0 r10 = r();
        if (r10 != null) {
            if (r10.f12935b == null) {
                TypedValue typedValue = new TypedValue();
                r10.f12934a.getTheme().resolveAttribute(2130968586, typedValue, true);
                int i7 = typedValue.resourceId;
                if (i7 != 0) {
                    r10.f12935b = new ContextThemeWrapper(r10.f12934a, i7);
                } else {
                    r10.f12935b = r10.f12934a;
                }
            }
            context = r10.f12935b;
        } else {
            context = null;
        }
        if (context == null) {
            return this.f13018e;
        }
        return context;
    }

    public final p o(Context context) {
        if (this.f13022g0 == null) {
            if (android.support.v4.media.session.a0.f1674f == null) {
                Context applicationContext = context.getApplicationContext();
                android.support.v4.media.session.a0.f1674f = new android.support.v4.media.session.a0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f13022g0 = new o(this, android.support.v4.media.session.a0.f1674f);
        }
        return this.f13022g0;
    }

    @Override
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override
    public final boolean p(l.k kVar, MenuItem menuItem) {
        int i7;
        r rVar;
        Window.Callback callback = this.f13020f.getCallback();
        if (callback != null && !this.f13014a0) {
            l.k k10 = kVar.k();
            r[] rVarArr = this.V;
            if (rVarArr != null) {
                i7 = rVarArr.length;
            } else {
                i7 = 0;
            }
            int i10 = 0;
            while (true) {
                if (i10 < i7) {
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
                return callback.onMenuItemSelected(rVar.f12997a, menuItem);
            }
        }
        return false;
    }

    public final r q(int i7) {
        Object[] objArr = this.V;
        if (objArr == null || objArr.length <= i7) {
            r[] rVarArr = new r[i7 + 1];
            if (objArr != null) {
                System.arraycopy(objArr, 0, rVarArr, 0, objArr.length);
            }
            this.V = rVarArr;
            objArr = rVarArr;
        }
        r rVar = objArr[i7];
        if (rVar == 0) {
            ?? obj = new Object();
            obj.f12997a = i7;
            obj.f13008n = false;
            objArr[i7] = obj;
            return obj;
        }
        return rVar;
    }

    public final b0 r() {
        l();
        if (this.P && this.f13028n == null) {
            u uVar = this.d;
            if (e2.s(uVar)) {
                this.f13028n = new b0(uVar);
            }
            b0 b0Var = this.f13028n;
            if (b0Var != null) {
                b0Var.c(this.f13027l0);
            }
        }
        return this.f13028n;
    }

    public final void s(int i7) {
        this.f13025j0 = (1 << i7) | this.f13025j0;
        if (!this.f13024i0) {
            View decorView = this.f13020f.getDecorView();
            WeakHashMap weakHashMap = i0.f56367a;
            decorView.postOnAnimation(this.f13026k0);
            this.f13024i0 = true;
        }
    }

    public final boolean t() {
        k1 k1Var;
        f3 f3Var;
        l.m mVar;
        boolean z10 = this.X;
        this.X = false;
        r q10 = q(0);
        if (q10.f13007m) {
            if (!z10) {
                h(q10, true);
                return true;
            }
        } else {
            k.a aVar = this.f13037y;
            if (aVar != null) {
                aVar.b();
                return true;
            }
            b0 r10 = r();
            if (r10 == null || (k1Var = r10.f12937e) == null || (f3Var = ((k3) k1Var).f20192a.f1897f0) == null || f3Var.f20147b == null) {
                return false;
            }
            f3 f3Var2 = ((k3) k1Var).f20192a.f1897f0;
            if (f3Var2 == null) {
                mVar = null;
            } else {
                mVar = f3Var2.f20147b;
            }
            if (mVar != null) {
                mVar.collapseActionView();
            }
        }
        return true;
    }

    public final void u(g.r r14, android.view.KeyEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.u(g.r, android.view.KeyEvent):void");
    }

    public final boolean v(r rVar, int i7, KeyEvent keyEvent) {
        l.k kVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!rVar.f13005k && !w(rVar, keyEvent)) || (kVar = rVar.h) == null) {
            return false;
        }
        return kVar.performShortcut(i7, keyEvent, 1);
    }

    public final boolean w(g.r r13, android.view.KeyEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.w(g.r, android.view.KeyEvent):boolean");
    }

    public final void x() {
        if (!this.J) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void y() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f13031p0 != null && (q(0).f13007m || this.f13037y != null)) {
                z10 = true;
            }
            if (z10 && this.f13032q0 == null) {
                this.f13032q0 = m.b(this.f13031p0, this);
            } else if (!z10 && (onBackInvokedCallback = this.f13032q0) != null) {
                m.c(this.f13031p0, onBackInvokedCallback);
            }
        }
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
