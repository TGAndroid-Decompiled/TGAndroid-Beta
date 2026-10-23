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
import com.google.android.gms.internal.play_billing.k3;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.j3;
import m.k1;
import m.l1;
import m.o3;
import m.v3;
import r0.i0;
import r0.l0;
import v7.j7;
public final class r extends g implements l.i, LayoutInflater.Factory2 {
    public static final a0.l f10700q0 = new a0.l(0);
    public static final int[] f10701r0 = {16842836};
    public static final boolean f10702s0 = !"robolectric".equals(Build.FINGERPRINT);
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
    public Configuration f10703a0;
    public final int f10704b0;
    public int f10705c0;
    public final t d;
    public int f10706d0;
    public final Context e;
    public boolean f10707e0;
    public Window f10708f;
    public n f10709f0;
    public n f10710g0;
    public m h;
    public boolean f10711h0;
    public int f10712i0;
    public final h f10713j0;
    public boolean f10714k0;
    public Rect f10715l0;
    public Rect m0;
    public a0 f10716n;
    public v f10717n0;
    public OnBackInvokedDispatcher f10718o0;
    public OnBackInvokedCallback f10719p0;
    public CharSequence f10720r;
    public k1 f10721s;
    public ya.d v;
    public a6.i f10722w;
    public k.a f10723x;
    public ActionBarContextView f10724y;

    public r(t tVar, t tVar2) {
        Context context = tVar.getContext();
        Window window = tVar.getWindow();
        this.G = null;
        this.H = true;
        this.f10704b0 = -100;
        this.f10713j0 = new h(this, 0);
        this.e = context;
        this.d = tVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.f10704b0 == -100) {
            String name = this.d.getClass().getName();
            a0.l lVar = f10700q0;
            Integer num = (Integer) lVar.get(name);
            if (num != null) {
                this.f10704b0 = num.intValue();
                lVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            e(window);
        }
        m.r.c();
    }

    @Override
    public final void a() {
        this.X = true;
        d(false);
        l();
        this.f10703a0 = new Configuration(this.e.getResources().getConfiguration());
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
                                return this.f10708f.requestFeature(i10);
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
        int i12 = this.f10704b0;
        if (i12 == -100) {
            i12 = g.f10673a;
        }
        Context context = this.e;
        int i13 = -1;
        if (i12 != -100) {
            if (i12 != -1) {
                if (i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        if (i12 == 3) {
                            if (this.f10710g0 == null) {
                                this.f10710g0 = new n(this, context);
                            }
                            i13 = this.f10710g0.e();
                        } else {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
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
        this.f10707e0 = true;
        int i14 = this.f10706d0;
        Configuration configuration2 = this.f10703a0;
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
        if (((~i14) & i11) != 0 && z10 && this.X && !f10702s0) {
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
                    if (!j7.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            j7.f48081g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                        }
                        j7.h = true;
                    }
                    Field field = j7.f48081g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e7) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e7);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!j7.f48078b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    j7.f48077a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e10) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e10);
                                }
                                j7.f48078b = true;
                            }
                            Field field2 = j7.f48077a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e11) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e11);
                                }
                            }
                            if (obj2 != null) {
                                j7.a(obj2);
                            }
                        }
                    }
                } else {
                    if (!j7.f48078b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            j7.f48077a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e12) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e12);
                        }
                        j7.f48078b = true;
                    }
                    Field field3 = j7.f48077a;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e13) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e13);
                        }
                    }
                    if (obj2 != null) {
                        j7.a(obj2);
                    }
                }
            }
            int i18 = this.f10705c0;
            if (i18 != 0) {
                context.setTheme(i18);
                context.getTheme().applyStyle(this.f10705c0, true);
            }
            z11 = true;
        }
        if (i12 == 0) {
            o(context).l();
        } else {
            n nVar = this.f10709f0;
            if (nVar != null) {
                nVar.c();
            }
        }
        if (i12 == 3) {
            if (this.f10710g0 == null) {
                this.f10710g0 = new n(this, context);
            }
            this.f10710g0.l();
        } else {
            n nVar2 = this.f10710g0;
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
        if (this.f10708f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof m)) {
                m mVar = new m(this, callback);
                this.h = mVar;
                window.setCallback(mVar);
                Context context = this.e;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f10701r0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    m.r a2 = m.r.a();
                    synchronized (a2) {
                        drawable = a2.f16311a.f(resourceId, context, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f10708f = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f10718o0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f10719p0) != null) {
                        l.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f10719p0 = null;
                    }
                    this.f10718o0 = null;
                    y();
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
        if ((qVar == null || qVar.f10696m) && !this.Z) {
            m mVar = this.h;
            Window.Callback callback = this.f10708f.getCallback();
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
        if (this.T) {
            return;
        }
        this.T = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f10721s;
        actionBarOverlayLayout.f();
        ActionMenuView actionMenuView = ((o3) actionBarOverlayLayout.e).f16275a.f2787a;
        if (actionMenuView != null && (iVar = actionMenuView.J) != null) {
            iVar.f();
            m.e eVar = iVar.J;
            if (eVar != null && eVar.b()) {
                eVar.f15813i.dismiss();
            }
        }
        Window.Callback callback = this.f10708f.getCallback();
        if (callback != null && !this.Z) {
            callback.onPanelClosed(108, kVar);
        }
        this.T = false;
    }

    public final void h(q qVar, boolean z10) {
        p pVar;
        k1 k1Var;
        m.i iVar;
        if (z10 && qVar.f10687a == 0 && (k1Var = this.f10721s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
            actionBarOverlayLayout.f();
            ActionMenuView actionMenuView = ((o3) actionBarOverlayLayout.e).f16275a.f2787a;
            if (actionMenuView != null && (iVar = actionMenuView.J) != null && iVar.g()) {
                g(qVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && qVar.f10696m && (pVar = qVar.e) != null) {
            windowManager.removeView(pVar);
            if (z10) {
                f(qVar.f10687a, qVar, null);
            }
        }
        qVar.f10694k = false;
        qVar.f10695l = false;
        qVar.f10696m = false;
        qVar.f10690f = null;
        qVar.f10697n = true;
        if (this.V == qVar) {
            this.V = null;
        }
        if (qVar.f10687a == 0) {
            y();
        }
    }

    public final boolean i(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: g.r.i(android.view.KeyEvent):boolean");
    }

    public final void j(int i10) {
        q p5 = p(i10);
        if (p5.h != null) {
            Bundle bundle = new Bundle();
            p5.h.t(bundle);
            if (bundle.size() > 0) {
                p5.f10699p = bundle;
            }
            p5.h.w();
            p5.h.clear();
        }
        p5.f10698o = true;
        p5.f10697n = true;
        if ((i10 == 108 || i10 == 0) && this.f10721s != null) {
            q p9 = p(0);
            p9.f10694k = false;
            w(p9, null);
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        Context context;
        if (!this.I) {
            Context context2 = this.e;
            int[] iArr = f.a.f10255j;
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
                this.f10708f.getDecorView();
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
                        k1 k1Var = (k1) viewGroup.findViewById(2131296411);
                        this.f10721s = k1Var;
                        k1Var.setWindowCallback(this.f10708f.getCallback());
                        if (this.P) {
                            ((ActionBarOverlayLayout) this.f10721s).e(109);
                        }
                        if (this.M) {
                            ((ActionBarOverlayLayout) this.f10721s).e(2);
                        }
                        if (this.N) {
                            ((ActionBarOverlayLayout) this.f10721s).e(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.Q ? (ViewGroup) from.inflate(2131492886, (ViewGroup) null) : (ViewGroup) from.inflate(2131492885, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    a4.l lVar = new a4.l(this, 18);
                    WeakHashMap weakHashMap = i0.f44830a;
                    r0.a0.i(viewGroup, lVar);
                    if (this.f10721s == null) {
                        this.K = (TextView) viewGroup.findViewById(2131296712);
                    }
                    Method method = v3.f16358a;
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
                    } catch (InvocationTargetException e7) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e7);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131296304);
                    ViewGroup viewGroup2 = (ViewGroup) this.f10708f.findViewById(16908290);
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
                    this.f10708f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new qb.c(this, 22));
                    this.J = viewGroup;
                    CharSequence charSequence = this.f10720r;
                    if (!TextUtils.isEmpty(charSequence)) {
                        k1 k1Var2 = this.f10721s;
                        if (k1Var2 != null) {
                            k1Var2.setWindowTitle(charSequence);
                        } else {
                            a0 a0Var = this.f10716n;
                            if (a0Var != null) {
                                o3 o3Var = (o3) a0Var.e;
                                if (!o3Var.f16279g) {
                                    Toolbar toolbar = o3Var.f16275a;
                                    o3Var.h = charSequence;
                                    if ((o3Var.f16276b & 8) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (o3Var.f16279g) {
                                            i0.k(toolbar.getRootView(), charSequence);
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
                    View decorView = this.f10708f.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = i0.f44830a;
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
                    q p5 = p(0);
                    if (!this.Z && p5.h == null) {
                        s(108);
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
        if (this.f10708f != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final Context m() {
        Context context;
        a0 r10 = r();
        if (r10 != null) {
            if (r10.f10620b == null) {
                TypedValue typedValue = new TypedValue();
                r10.f10619a.getTheme().resolveAttribute(2130968586, typedValue, true);
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    r10.f10620b = new ContextThemeWrapper(r10.f10619a, i10);
                } else {
                    r10.f10620b = r10.f10619a;
                }
            }
            context = r10.f10620b;
        } else {
            context = null;
        }
        if (context == null) {
            return this.e;
        }
        return context;
    }

    @Override
    public final void n(l.k r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.r.n(l.k):void");
    }

    public final o o(Context context) {
        if (this.f10709f0 == null) {
            if (androidx.biometric.e.e == null) {
                Context applicationContext = context.getApplicationContext();
                androidx.biometric.e.e = new androidx.biometric.e(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f10709f0 = new n(this, androidx.biometric.e.e);
        }
        return this.f10709f0;
    }

    @Override
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        throw new UnsupportedOperationException("Method not decompiled: g.r.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final q p(int i10) {
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
            obj.f10687a = i10;
            obj.f10697n = false;
            objArr[i10] = obj;
            return obj;
        }
        return qVar;
    }

    @Override
    public final boolean q(l.k kVar, MenuItem menuItem) {
        int i10;
        q qVar;
        Window.Callback callback = this.f10708f.getCallback();
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
                return callback.onMenuItemSelected(qVar.f10687a, menuItem);
            }
        }
        return false;
    }

    public final a0 r() {
        k();
        if (this.O && this.f10716n == null) {
            t tVar = this.d;
            if (k3.s(tVar)) {
                this.f10716n = new a0(tVar);
            }
            a0 a0Var = this.f10716n;
            if (a0Var != null) {
                a0Var.c(this.f10714k0);
            }
        }
        return this.f10716n;
    }

    public final void s(int i10) {
        this.f10712i0 = (1 << i10) | this.f10712i0;
        if (!this.f10711h0) {
            View decorView = this.f10708f.getDecorView();
            WeakHashMap weakHashMap = i0.f44830a;
            decorView.postOnAnimation(this.f10713j0);
            this.f10711h0 = true;
        }
    }

    public final boolean t() {
        l1 l1Var;
        j3 j3Var;
        l.m mVar;
        boolean z10 = this.W;
        this.W = false;
        q p5 = p(0);
        if (p5.f10696m) {
            if (!z10) {
                h(p5, true);
                return true;
            }
        } else {
            k.a aVar = this.f10723x;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            a0 r10 = r();
            if (r10 == null || (l1Var = r10.e) == null || (j3Var = ((o3) l1Var).f16275a.f2794e0) == null || j3Var.f16235b == null) {
                return false;
            }
            j3 j3Var2 = ((o3) l1Var).f16275a.f2794e0;
            if (j3Var2 == null) {
                mVar = null;
            } else {
                mVar = j3Var2.f16235b;
            }
            if (mVar != null) {
                mVar.collapseActionView();
            }
        }
        return true;
    }

    public final void u(g.q r14, android.view.KeyEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: g.r.u(g.q, android.view.KeyEvent):void");
    }

    public final boolean v(q qVar, int i10, KeyEvent keyEvent) {
        l.k kVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!qVar.f10694k && !w(qVar, keyEvent)) || (kVar = qVar.h) == null) {
            return false;
        }
        return kVar.performShortcut(i10, keyEvent, 1);
    }

    public final boolean w(g.q r13, android.view.KeyEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: g.r.w(g.q, android.view.KeyEvent):boolean");
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
            if (this.f10718o0 != null && (p(0).f10696m || this.f10723x != null)) {
                z10 = true;
            }
            if (z10 && this.f10719p0 == null) {
                this.f10719p0 = l.b(this.f10718o0, this);
            } else if (!z10 && (onBackInvokedCallback = this.f10719p0) != null) {
                l.c(this.f10718o0, onBackInvokedCallback);
            }
        }
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
