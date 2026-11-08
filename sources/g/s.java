package g;

import a8.da;
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
import m.h3;
import m.k1;
import m.l1;
import m.m3;
import m.t3;
import r0.i0;
import r0.l0;
public final class s extends g implements l.i, LayoutInflater.Factory2 {
    public static final a0.l f13353q0 = new a0.l(0);
    public static final int[] f13354r0 = {16842836};
    public static final boolean f13355s0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView D;
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
    public r[] U;
    public r V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public Configuration f13356a0;
    public final int f13357b0;
    public int f13358c0;
    public final u d;
    public int f13359d0;
    public final Context f13360e;
    public boolean f13361e0;
    public Window f13362f;
    public o f13363f0;
    public o f13364g0;
    public n h;
    public boolean f13365h0;
    public int f13366i0;
    public final h f13367j0;
    public boolean f13368k0;
    public Rect f13369l0;
    public Rect m0;
    public b0 f13370n;
    public w f13371n0;
    public OnBackInvokedDispatcher f13372o0;
    public OnBackInvokedCallback f13373p0;
    public CharSequence f13374r;
    public k1 f13375s;
    public cb.c f13376w;
    public i f13377x;
    public k.a f13378y;

    public s(u uVar, u uVar2) {
        Context context = uVar.getContext();
        Window window = uVar.getWindow();
        this.G = null;
        this.H = true;
        this.f13357b0 = -100;
        this.f13367j0 = new h(this, 0);
        this.f13360e = context;
        this.d = uVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.f13357b0 == -100) {
            String name = this.d.getClass().getName();
            a0.l lVar = f13353q0;
            Integer num = (Integer) lVar.get(name);
            if (num != null) {
                this.f13357b0 = num.intValue();
                lVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            e(window);
        }
        m.r.c();
    }

    @Override
    public final boolean F0(l.k kVar, MenuItem menuItem) {
        int i7;
        r rVar;
        Window.Callback callback = this.f13362f.getCallback();
        if (callback != null && !this.Z) {
            l.k k10 = kVar.k();
            r[] rVarArr = this.U;
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
                return callback.onMenuItemSelected(rVar.f13339a, menuItem);
            }
        }
        return false;
    }

    @Override
    public final void a() {
        this.X = true;
        d(false);
        l();
        this.f13356a0 = new Configuration(this.f13360e.getResources().getConfiguration());
        this.Y = true;
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
        if (this.S && i7 == 108) {
            return false;
        }
        if (this.O && i7 == 1) {
            this.O = false;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 5) {
                    if (i7 != 10) {
                        if (i7 != 108) {
                            if (i7 != 109) {
                                return this.f13362f.requestFeature(i7);
                            }
                            v();
                            this.P = true;
                            return true;
                        }
                        v();
                        this.O = true;
                        return true;
                    }
                    v();
                    this.Q = true;
                    return true;
                }
                v();
                this.N = true;
                return true;
            }
            v();
            this.M = true;
            return true;
        }
        v();
        this.S = true;
        return true;
    }

    public final boolean d(boolean z9) {
        int i7;
        int i10;
        Object obj;
        boolean z10 = false;
        if (this.Z) {
            return false;
        }
        int i11 = this.f13357b0;
        if (i11 == -100) {
            i11 = g.f13322a;
        }
        Context context = this.f13360e;
        int i12 = -1;
        if (i11 != -100) {
            if (i11 != -1) {
                if (i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        if (i11 == 3) {
                            if (this.f13364g0 == null) {
                                this.f13364g0 = new o(this, context);
                            }
                            i12 = this.f13364g0.e();
                        } else {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    i12 = n(context).e();
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
        this.f13361e0 = true;
        int i13 = this.f13359d0;
        Configuration configuration2 = this.f13356a0;
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
        if (((~i13) & i10) != 0 && z9 && this.X && !f13355s0) {
            boolean z11 = this.Y;
        }
        if (i10 != 0) {
            Resources resources = context.getResources();
            Configuration configuration3 = new Configuration(resources.getConfiguration());
            configuration3.uiMode = i15 | (resources.getConfiguration().uiMode & (-49));
            Object obj2 = null;
            resources.updateConfiguration(configuration3, null);
            if (i16 < 26 && i16 < 28) {
                if (i16 >= 24) {
                    if (!da.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            da.f371g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
                        }
                        da.h = true;
                    }
                    Field field = da.f371g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e11) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!da.f367b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    da.f366a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
                                }
                                da.f367b = true;
                            }
                            Field field2 = da.f366a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e13) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                                }
                            }
                            if (obj2 != null) {
                                da.a(obj2);
                            }
                        }
                    }
                } else {
                    if (!da.f367b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            da.f366a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e14);
                        }
                        da.f367b = true;
                    }
                    Field field3 = da.f366a;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e15) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e15);
                        }
                    }
                    if (obj2 != null) {
                        da.a(obj2);
                    }
                }
            }
            int i17 = this.f13358c0;
            if (i17 != 0) {
                context.setTheme(i17);
                context.getTheme().applyStyle(this.f13358c0, true);
            }
            z10 = true;
        }
        if (i11 == 0) {
            n(context).l();
        } else {
            o oVar = this.f13363f0;
            if (oVar != null) {
                oVar.c();
            }
        }
        if (i11 == 3) {
            if (this.f13364g0 == null) {
                this.f13364g0 = new o(this, context);
            }
            this.f13364g0.l();
        } else {
            o oVar2 = this.f13364g0;
            if (oVar2 != null) {
                oVar2.c();
            }
        }
        return z10;
    }

    public final void e(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f13362f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof n)) {
                n nVar = new n(this, callback);
                this.h = nVar;
                window.setCallback(nVar);
                Context context = this.f13360e;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f13354r0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    m.r a10 = m.r.a();
                    synchronized (a10) {
                        drawable = a10.f19236a.f(resourceId, context, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f13362f = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f13372o0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f13373p0) != null) {
                        m.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f13373p0 = null;
                    }
                    this.f13372o0 = null;
                    w();
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
                r[] rVarArr = this.U;
                if (i7 < rVarArr.length) {
                    rVar = rVarArr[i7];
                }
            }
            if (rVar != null) {
                kVar = rVar.h;
            }
        }
        if ((rVar == null || rVar.f13349m) && !this.Z) {
            n nVar = this.h;
            Window.Callback callback = this.f13362f.getCallback();
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
        m.i iVar;
        if (this.T) {
            return;
        }
        this.T = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f13375s;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((m3) actionBarOverlayLayout.f1931e).f19162a.f1973a;
        if (actionMenuView != null && (iVar = actionMenuView.J) != null) {
            iVar.f();
            m.e eVar = iVar.J;
            if (eVar != null && eVar.b()) {
                eVar.f17734i.dismiss();
            }
        }
        Window.Callback callback = this.f13362f.getCallback();
        if (callback != null && !this.Z) {
            callback.onPanelClosed(108, kVar);
        }
        this.T = false;
    }

    public final void h(r rVar, boolean z9) {
        q qVar;
        k1 k1Var;
        m.i iVar;
        if (z9 && rVar.f13339a == 0 && (k1Var = this.f13375s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
            actionBarOverlayLayout.e();
            ActionMenuView actionMenuView = ((m3) actionBarOverlayLayout.f1931e).f19162a.f1973a;
            if (actionMenuView != null && (iVar = actionMenuView.J) != null && iVar.g()) {
                g(rVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f13360e.getSystemService("window");
        if (windowManager != null && rVar.f13349m && (qVar = rVar.f13342e) != null) {
            windowManager.removeView(qVar);
            if (z9) {
                f(rVar.f13339a, rVar, null);
            }
        }
        rVar.f13347k = false;
        rVar.f13348l = false;
        rVar.f13349m = false;
        rVar.f13343f = null;
        rVar.f13350n = true;
        if (this.V == rVar) {
            this.V = null;
        }
        if (rVar.f13339a == 0) {
            w();
        }
    }

    public final boolean i(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.i(android.view.KeyEvent):boolean");
    }

    public final void j(int i7) {
        r o4 = o(i7);
        if (o4.h != null) {
            Bundle bundle = new Bundle();
            o4.h.t(bundle);
            if (bundle.size() > 0) {
                o4.f13352p = bundle;
            }
            o4.h.w();
            o4.h.clear();
        }
        o4.f13351o = true;
        o4.f13350n = true;
        if ((i7 == 108 || i7 == 0) && this.f13375s != null) {
            r o10 = o(0);
            o10.f13347k = false;
            u(o10, null);
        }
    }

    @Override
    public final void j0(l.k r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.j0(l.k):void");
    }

    public final void k() {
        ViewGroup viewGroup;
        Context context;
        if (!this.I) {
            Context context2 = this.f13360e;
            int[] iArr = f.a.f10862j;
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
                this.f13362f.getDecorView();
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
                        this.f13375s = k1Var;
                        k1Var.setWindowCallback(this.f13362f.getCallback());
                        if (this.P) {
                            ((ActionBarOverlayLayout) this.f13375s).d(109);
                        }
                        if (this.M) {
                            ((ActionBarOverlayLayout) this.f13375s).d(2);
                        }
                        if (this.N) {
                            ((ActionBarOverlayLayout) this.f13375s).d(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.Q ? (ViewGroup) from.inflate(2131492886, (ViewGroup) null) : (ViewGroup) from.inflate(2131492885, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    i iVar = new i(this);
                    WeakHashMap weakHashMap = i0.f54191a;
                    r0.a0.i(viewGroup, iVar);
                    if (this.f13375s == null) {
                        this.K = (TextView) viewGroup.findViewById(2131296714);
                    }
                    Method method = t3.f19259a;
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
                    ViewGroup viewGroup2 = (ViewGroup) this.f13362f.findViewById(16908290);
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
                    this.f13362f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new aa.n(this, 24));
                    this.J = viewGroup;
                    CharSequence charSequence = this.f13374r;
                    if (!TextUtils.isEmpty(charSequence)) {
                        k1 k1Var2 = this.f13375s;
                        if (k1Var2 != null) {
                            k1Var2.setWindowTitle(charSequence);
                        } else {
                            b0 b0Var = this.f13370n;
                            if (b0Var != null) {
                                m3 m3Var = (m3) b0Var.f13279e;
                                if (!m3Var.f19167g) {
                                    Toolbar toolbar = m3Var.f19162a;
                                    m3Var.h = charSequence;
                                    if ((m3Var.f19163b & 8) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (m3Var.f19167g) {
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
                    View decorView = this.f13362f.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = i0.f54191a;
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
                    r o4 = o(0);
                    if (!this.Z && o4.h == null) {
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
        if (this.f13362f != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final Context m() {
        Context context;
        b0 p10 = p();
        if (p10 != null) {
            if (p10.f13277b == null) {
                TypedValue typedValue = new TypedValue();
                p10.f13276a.getTheme().resolveAttribute(2130968586, typedValue, true);
                int i7 = typedValue.resourceId;
                if (i7 != 0) {
                    p10.f13277b = new ContextThemeWrapper(p10.f13276a, i7);
                } else {
                    p10.f13277b = p10.f13276a;
                }
            }
            context = p10.f13277b;
        } else {
            context = null;
        }
        if (context == null) {
            return this.f13360e;
        }
        return context;
    }

    public final p n(Context context) {
        if (this.f13363f0 == null) {
            if (android.support.v4.media.session.a0.f1761f == null) {
                Context applicationContext = context.getApplicationContext();
                android.support.v4.media.session.a0.f1761f = new android.support.v4.media.session.a0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f13363f0 = new o(this, android.support.v4.media.session.a0.f1761f);
        }
        return this.f13363f0;
    }

    public final r o(int i7) {
        Object[] objArr = this.U;
        if (objArr == null || objArr.length <= i7) {
            r[] rVarArr = new r[i7 + 1];
            if (objArr != null) {
                System.arraycopy(objArr, 0, rVarArr, 0, objArr.length);
            }
            this.U = rVarArr;
            objArr = rVarArr;
        }
        r rVar = objArr[i7];
        if (rVar == 0) {
            ?? obj = new Object();
            obj.f13339a = i7;
            obj.f13350n = false;
            objArr[i7] = obj;
            return obj;
        }
        return rVar;
    }

    @Override
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final b0 p() {
        k();
        if (this.O && this.f13370n == null) {
            u uVar = this.d;
            if (com.google.android.recaptcha.internal.a.u(uVar)) {
                this.f13370n = new b0(uVar);
            }
            b0 b0Var = this.f13370n;
            if (b0Var != null) {
                b0Var.c(this.f13368k0);
            }
        }
        return this.f13370n;
    }

    public final void q(int i7) {
        this.f13366i0 = (1 << i7) | this.f13366i0;
        if (!this.f13365h0) {
            View decorView = this.f13362f.getDecorView();
            WeakHashMap weakHashMap = i0.f54191a;
            decorView.postOnAnimation(this.f13367j0);
            this.f13365h0 = true;
        }
    }

    public final boolean r() {
        l1 l1Var;
        h3 h3Var;
        l.m mVar;
        boolean z9 = this.W;
        this.W = false;
        r o4 = o(0);
        if (o4.f13349m) {
            if (!z9) {
                h(o4, true);
                return true;
            }
        } else {
            k.a aVar = this.f13378y;
            if (aVar != null) {
                aVar.b();
                return true;
            }
            b0 p10 = p();
            if (p10 == null || (l1Var = p10.f13279e) == null || (h3Var = ((m3) l1Var).f19162a.f1981e0) == null || h3Var.f19120b == null) {
                return false;
            }
            h3 h3Var2 = ((m3) l1Var).f19162a.f1981e0;
            if (h3Var2 == null) {
                mVar = null;
            } else {
                mVar = h3Var2.f19120b;
            }
            if (mVar != null) {
                mVar.collapseActionView();
            }
        }
        return true;
    }

    public final void s(g.r r14, android.view.KeyEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.s(g.r, android.view.KeyEvent):void");
    }

    public final boolean t(r rVar, int i7, KeyEvent keyEvent) {
        l.k kVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!rVar.f13347k && !u(rVar, keyEvent)) || (kVar = rVar.h) == null) {
            return false;
        }
        return kVar.performShortcut(i7, keyEvent, 1);
    }

    public final boolean u(g.r r13, android.view.KeyEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.u(g.r, android.view.KeyEvent):boolean");
    }

    public final void v() {
        if (!this.I) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void w() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z9 = false;
            if (this.f13372o0 != null && (o(0).f13349m || this.f13378y != null)) {
                z9 = true;
            }
            if (z9 && this.f13373p0 == null) {
                this.f13373p0 = m.b(this.f13372o0, this);
            } else if (!z9 && (onBackInvokedCallback = this.f13373p0) != null) {
                m.c(this.f13372o0, onBackInvokedCallback);
            }
        }
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
