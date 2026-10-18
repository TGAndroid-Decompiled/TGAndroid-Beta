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
    public static final a0.l f10701q0 = new a0.l(0);
    public static final int[] f10702r0 = {16842836};
    public static final boolean f10703s0 = !"robolectric".equals(Build.FINGERPRINT);
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
    public Configuration f10704a0;
    public final int f10705b0;
    public int f10706c0;
    public final t d;
    public int f10707d0;
    public final Context e;
    public boolean f10708e0;
    public Window f10709f;
    public n f10710f0;
    public n f10711g0;
    public m h;
    public boolean f10712h0;
    public int f10713i0;
    public final h f10714j0;
    public boolean f10715k0;
    public Rect f10716l0;
    public Rect m0;
    public a0 f10717n;
    public v f10718n0;
    public OnBackInvokedDispatcher f10719o0;
    public OnBackInvokedCallback f10720p0;
    public CharSequence f10721r;
    public k1 f10722s;
    public ya.d v;
    public a6.i f10723w;
    public k.a f10724x;
    public ActionBarContextView f10725y;

    public r(t tVar, t tVar2) {
        Context context = tVar.getContext();
        Window window = tVar.getWindow();
        this.G = null;
        this.H = true;
        this.f10705b0 = -100;
        this.f10714j0 = new h(this, 0);
        this.e = context;
        this.d = tVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.f10705b0 == -100) {
            String name = this.d.getClass().getName();
            a0.l lVar = f10701q0;
            Integer num = (Integer) lVar.get(name);
            if (num != null) {
                this.f10705b0 = num.intValue();
                lVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            f(window);
        }
        m.r.c();
    }

    @Override
    public final void a() {
        this.X = true;
        e(false);
        m();
        this.f10704a0 = new Configuration(this.e.getResources().getConfiguration());
        this.Y = true;
    }

    @Override
    public final void b(l.k r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.r.b(l.k):void");
    }

    @Override
    public final boolean d(int i10) {
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
                                return this.f10709f.requestFeature(i10);
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

    public final boolean e(boolean z10) {
        int i10;
        int i11;
        Object obj;
        boolean z11 = false;
        if (this.Z) {
            return false;
        }
        int i12 = this.f10705b0;
        if (i12 == -100) {
            i12 = g.f10674a;
        }
        Context context = this.e;
        int i13 = -1;
        if (i12 != -100) {
            if (i12 != -1) {
                if (i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        if (i12 == 3) {
                            if (this.f10711g0 == null) {
                                this.f10711g0 = new n(this, context);
                            }
                            i13 = this.f10711g0.e();
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
        this.f10708e0 = true;
        int i14 = this.f10707d0;
        Configuration configuration2 = this.f10704a0;
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
        if (((~i14) & i11) != 0 && z10 && this.X && !f10703s0) {
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
                            j7.f48070g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                        }
                        j7.h = true;
                    }
                    Field field = j7.f48070g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e7) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e7);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!j7.f48067b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    j7.f48066a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e10) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e10);
                                }
                                j7.f48067b = true;
                            }
                            Field field2 = j7.f48066a;
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
                    if (!j7.f48067b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            j7.f48066a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e12) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e12);
                        }
                        j7.f48067b = true;
                    }
                    Field field3 = j7.f48066a;
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
            int i18 = this.f10706c0;
            if (i18 != 0) {
                context.setTheme(i18);
                context.getTheme().applyStyle(this.f10706c0, true);
            }
            z11 = true;
        }
        if (i12 == 0) {
            o(context).l();
        } else {
            n nVar = this.f10710f0;
            if (nVar != null) {
                nVar.c();
            }
        }
        if (i12 == 3) {
            if (this.f10711g0 == null) {
                this.f10711g0 = new n(this, context);
            }
            this.f10711g0.l();
        } else {
            n nVar2 = this.f10711g0;
            if (nVar2 != null) {
                nVar2.c();
            }
        }
        return z11;
    }

    public final void f(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f10709f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof m)) {
                m mVar = new m(this, callback);
                this.h = mVar;
                window.setCallback(mVar);
                Context context = this.e;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f10702r0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    m.r a2 = m.r.a();
                    synchronized (a2) {
                        drawable = a2.f16310a.f(resourceId, context, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f10709f = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f10719o0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f10720p0) != null) {
                        l.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f10720p0 = null;
                    }
                    this.f10719o0 = null;
                    y();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void g(int i10, q qVar, l.k kVar) {
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
        if ((qVar == null || qVar.f10697m) && !this.Z) {
            m mVar = this.h;
            Window.Callback callback = this.f10709f.getCallback();
            mVar.getClass();
            try {
                mVar.d = true;
                callback.onPanelClosed(i10, kVar);
            } finally {
                mVar.d = false;
            }
        }
    }

    public final void h(l.k kVar) {
        m.i iVar;
        if (this.T) {
            return;
        }
        this.T = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f10722s;
        actionBarOverlayLayout.f();
        ActionMenuView actionMenuView = ((o3) actionBarOverlayLayout.e).f16274a.f2791a;
        if (actionMenuView != null && (iVar = actionMenuView.J) != null) {
            iVar.f();
            m.e eVar = iVar.J;
            if (eVar != null && eVar.b()) {
                eVar.f15812i.dismiss();
            }
        }
        Window.Callback callback = this.f10709f.getCallback();
        if (callback != null && !this.Z) {
            callback.onPanelClosed(108, kVar);
        }
        this.T = false;
    }

    public final void i(q qVar, boolean z10) {
        p pVar;
        k1 k1Var;
        m.i iVar;
        if (z10 && qVar.f10688a == 0 && (k1Var = this.f10722s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
            actionBarOverlayLayout.f();
            ActionMenuView actionMenuView = ((o3) actionBarOverlayLayout.e).f16274a.f2791a;
            if (actionMenuView != null && (iVar = actionMenuView.J) != null && iVar.g()) {
                h(qVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && qVar.f10697m && (pVar = qVar.e) != null) {
            windowManager.removeView(pVar);
            if (z10) {
                g(qVar.f10688a, qVar, null);
            }
        }
        qVar.f10695k = false;
        qVar.f10696l = false;
        qVar.f10697m = false;
        qVar.f10691f = null;
        qVar.f10698n = true;
        if (this.V == qVar) {
            this.V = null;
        }
        if (qVar.f10688a == 0) {
            y();
        }
    }

    public final boolean j(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: g.r.j(android.view.KeyEvent):boolean");
    }

    public final void k(int i10) {
        q q6 = q(i10);
        if (q6.h != null) {
            Bundle bundle = new Bundle();
            q6.h.t(bundle);
            if (bundle.size() > 0) {
                q6.f10700p = bundle;
            }
            q6.h.w();
            q6.h.clear();
        }
        q6.f10699o = true;
        q6.f10698n = true;
        if ((i10 == 108 || i10 == 0) && this.f10722s != null) {
            q q10 = q(0);
            q10.f10695k = false;
            w(q10, null);
        }
    }

    public final void l() {
        ViewGroup viewGroup;
        Context context;
        if (!this.I) {
            Context context2 = this.e;
            int[] iArr = f.a.f10256j;
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
                this.R = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                m();
                this.f10709f.getDecorView();
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
                        this.f10722s = k1Var;
                        k1Var.setWindowCallback(this.f10709f.getCallback());
                        if (this.P) {
                            ((ActionBarOverlayLayout) this.f10722s).e(109);
                        }
                        if (this.M) {
                            ((ActionBarOverlayLayout) this.f10722s).e(2);
                        }
                        if (this.N) {
                            ((ActionBarOverlayLayout) this.f10722s).e(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.Q ? (ViewGroup) from.inflate(2131492886, (ViewGroup) null) : (ViewGroup) from.inflate(2131492885, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    ag.b bVar = new ag.b(this, 17);
                    WeakHashMap weakHashMap = i0.f44818a;
                    r0.a0.i(viewGroup, bVar);
                    if (this.f10722s == null) {
                        this.K = (TextView) viewGroup.findViewById(2131296712);
                    }
                    Method method = v3.f16357a;
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
                    ViewGroup viewGroup2 = (ViewGroup) this.f10709f.findViewById(16908290);
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
                    this.f10709f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new a6.m(this, 22));
                    this.J = viewGroup;
                    CharSequence charSequence = this.f10721r;
                    if (!TextUtils.isEmpty(charSequence)) {
                        k1 k1Var2 = this.f10722s;
                        if (k1Var2 != null) {
                            k1Var2.setWindowTitle(charSequence);
                        } else {
                            a0 a0Var = this.f10717n;
                            if (a0Var != null) {
                                o3 o3Var = (o3) a0Var.e;
                                if (!o3Var.f16278g) {
                                    Toolbar toolbar = o3Var.f16274a;
                                    o3Var.h = charSequence;
                                    if ((o3Var.f16275b & 8) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (o3Var.f16278g) {
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
                    View decorView = this.f10709f.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = i0.f44818a;
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
                    q q6 = q(0);
                    if (!this.Z && q6.h == null) {
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

    public final void m() {
        if (this.f10709f != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final Context n() {
        Context context;
        a0 r10 = r();
        if (r10 != null) {
            if (r10.f10621b == null) {
                TypedValue typedValue = new TypedValue();
                r10.f10620a.getTheme().resolveAttribute(2130968586, typedValue, true);
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    r10.f10621b = new ContextThemeWrapper(r10.f10620a, i10);
                } else {
                    r10.f10621b = r10.f10620a;
                }
            }
            context = r10.f10621b;
        } else {
            context = null;
        }
        if (context == null) {
            return this.e;
        }
        return context;
    }

    public final o o(Context context) {
        if (this.f10710f0 == null) {
            if (androidx.biometric.e.e == null) {
                Context applicationContext = context.getApplicationContext();
                androidx.biometric.e.e = new androidx.biometric.e(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f10710f0 = new n(this, androidx.biometric.e.e);
        }
        return this.f10710f0;
    }

    @Override
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        throw new UnsupportedOperationException("Method not decompiled: g.r.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override
    public final boolean p(l.k kVar, MenuItem menuItem) {
        int i10;
        q qVar;
        Window.Callback callback = this.f10709f.getCallback();
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
                return callback.onMenuItemSelected(qVar.f10688a, menuItem);
            }
        }
        return false;
    }

    public final q q(int i10) {
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
            obj.f10688a = i10;
            obj.f10698n = false;
            objArr[i10] = obj;
            return obj;
        }
        return qVar;
    }

    public final a0 r() {
        l();
        if (this.O && this.f10717n == null) {
            t tVar = this.d;
            if (k3.s(tVar)) {
                this.f10717n = new a0(tVar);
            }
            a0 a0Var = this.f10717n;
            if (a0Var != null) {
                a0Var.c(this.f10715k0);
            }
        }
        return this.f10717n;
    }

    public final void s(int i10) {
        this.f10713i0 = (1 << i10) | this.f10713i0;
        if (!this.f10712h0) {
            View decorView = this.f10709f.getDecorView();
            WeakHashMap weakHashMap = i0.f44818a;
            decorView.postOnAnimation(this.f10714j0);
            this.f10712h0 = true;
        }
    }

    public final boolean t() {
        l1 l1Var;
        j3 j3Var;
        l.m mVar;
        boolean z10 = this.W;
        this.W = false;
        q q6 = q(0);
        if (q6.f10697m) {
            if (!z10) {
                i(q6, true);
                return true;
            }
        } else {
            k.a aVar = this.f10724x;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            a0 r10 = r();
            if (r10 == null || (l1Var = r10.e) == null || (j3Var = ((o3) l1Var).f16274a.f2798e0) == null || j3Var.f16234b == null) {
                return false;
            }
            j3 j3Var2 = ((o3) l1Var).f16274a.f2798e0;
            if (j3Var2 == null) {
                mVar = null;
            } else {
                mVar = j3Var2.f16234b;
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
        if ((!qVar.f10695k && !w(qVar, keyEvent)) || (kVar = qVar.h) == null) {
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
            if (this.f10719o0 != null && (q(0).f10697m || this.f10724x != null)) {
                z10 = true;
            }
            if (z10 && this.f10720p0 == null) {
                this.f10720p0 = l.b(this.f10719o0, this);
            } else if (!z10 && (onBackInvokedCallback = this.f10720p0) != null) {
                l.c(this.f10719o0, onBackInvokedCallback);
            }
        }
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
