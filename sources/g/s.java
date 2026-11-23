package g;

import a8.ga;
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
    public static final a0.l f13049r0 = new a0.l(0);
    public static final int[] f13050s0 = {16842836};
    public static final boolean f13051t0 = !"robolectric".equals(Build.FINGERPRINT);
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
    public boolean f13052a0;
    public Configuration f13053b0;
    public final int f13054c0;
    public final u d;
    public int f13055d0;
    public final Context f13056e;
    public int f13057e0;
    public Window f13058f;
    public boolean f13059f0;
    public o f13060g0;
    public n h;
    public o f13061h0;
    public boolean f13062i0;
    public int f13063j0;
    public final h f13064k0;
    public boolean f13065l0;
    public Rect m0;
    public b0 f13066n;
    public Rect f13067n0;
    public w f13068o0;
    public OnBackInvokedDispatcher f13069p0;
    public OnBackInvokedCallback f13070q0;
    public CharSequence f13071r;
    public j1 f13072s;
    public d6.i f13073w;
    public i f13074x;
    public k.a f13075y;

    public s(u uVar, u uVar2) {
        Context context = uVar.getContext();
        Window window = uVar.getWindow();
        this.H = null;
        this.I = true;
        this.f13054c0 = -100;
        this.f13064k0 = new h(this, 0);
        this.f13056e = context;
        this.d = uVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.f13054c0 == -100) {
            String name = this.d.getClass().getName();
            a0.l lVar = f13049r0;
            Integer num = (Integer) lVar.get(name);
            if (num != null) {
                this.f13054c0 = num.intValue();
                lVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            f(window);
        }
        m.q.c();
    }

    @Override
    public final void a() {
        this.Y = true;
        e(false);
        n();
        this.f13053b0 = new Configuration(this.f13056e.getResources().getConfiguration());
        this.Z = true;
    }

    @Override
    public final void b(l.k r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.b(l.k):void");
    }

    @Override
    public final boolean d(int i7) {
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
                                return this.f13058f.requestFeature(i7);
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

    public final boolean e(boolean z10) {
        int i7;
        int i10;
        Object obj;
        boolean z11 = false;
        if (this.f13052a0) {
            return false;
        }
        int i11 = this.f13054c0;
        if (i11 == -100) {
            i11 = g.f13018a;
        }
        Context context = this.f13056e;
        int i12 = -1;
        if (i11 != -100) {
            if (i11 != -1) {
                if (i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        if (i11 == 3) {
                            if (this.f13061h0 == null) {
                                this.f13061h0 = new o(this, context);
                            }
                            i12 = this.f13061h0.e();
                        } else {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    i12 = p(context).e();
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
        this.f13059f0 = true;
        int i13 = this.f13057e0;
        Configuration configuration2 = this.f13053b0;
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
        if (((~i13) & i10) != 0 && z10 && this.Y && !f13051t0) {
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
                    if (!ga.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            ga.f461g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
                        }
                        ga.h = true;
                    }
                    Field field = ga.f461g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e11) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!ga.f457b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    ga.f456a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
                                }
                                ga.f457b = true;
                            }
                            Field field2 = ga.f456a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e13) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                                }
                            }
                            if (obj2 != null) {
                                ga.a(obj2);
                            }
                        }
                    }
                } else {
                    if (!ga.f457b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            ga.f456a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e14);
                        }
                        ga.f457b = true;
                    }
                    Field field3 = ga.f456a;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e15) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e15);
                        }
                    }
                    if (obj2 != null) {
                        ga.a(obj2);
                    }
                }
            }
            int i17 = this.f13055d0;
            if (i17 != 0) {
                context.setTheme(i17);
                context.getTheme().applyStyle(this.f13055d0, true);
            }
            z11 = true;
        }
        if (i11 == 0) {
            p(context).l();
        } else {
            o oVar = this.f13060g0;
            if (oVar != null) {
                oVar.c();
            }
        }
        if (i11 == 3) {
            if (this.f13061h0 == null) {
                this.f13061h0 = new o(this, context);
            }
            this.f13061h0.l();
        } else {
            o oVar2 = this.f13061h0;
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
        if (this.f13058f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof n)) {
                n nVar = new n(this, callback);
                this.h = nVar;
                window.setCallback(nVar);
                Context context = this.f13056e;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f13050s0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    m.q a10 = m.q.a();
                    synchronized (a10) {
                        drawable = a10.f20212a.f(resourceId, context, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f13058f = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f13069p0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f13070q0) != null) {
                        m.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f13070q0 = null;
                    }
                    this.f13069p0 = null;
                    y();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void g(int i7, r rVar, l.k kVar) {
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
        if ((rVar == null || rVar.f13045m) && !this.f13052a0) {
            n nVar = this.h;
            Window.Callback callback = this.f13058f.getCallback();
            nVar.getClass();
            try {
                nVar.d = true;
                callback.onPanelClosed(i7, kVar);
            } finally {
                nVar.d = false;
            }
        }
    }

    @Override
    public final boolean h(l.k kVar, MenuItem menuItem) {
        int i7;
        r rVar;
        Window.Callback callback = this.f13058f.getCallback();
        if (callback != null && !this.f13052a0) {
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
                return callback.onMenuItemSelected(rVar.f13035a, menuItem);
            }
        }
        return false;
    }

    public final void i(l.k kVar) {
        m.h hVar;
        if (this.U) {
            return;
        }
        this.U = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f13072s;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((k3) actionBarOverlayLayout.f1892e).f20129a.f1935a;
        if (actionMenuView != null && (hVar = actionMenuView.K) != null) {
            hVar.f();
            m.d dVar = hVar.K;
            if (dVar != null && dVar.b()) {
                dVar.f19271i.dismiss();
            }
        }
        Window.Callback callback = this.f13058f.getCallback();
        if (callback != null && !this.f13052a0) {
            callback.onPanelClosed(108, kVar);
        }
        this.U = false;
    }

    public final void j(r rVar, boolean z10) {
        q qVar;
        j1 j1Var;
        m.h hVar;
        if (z10 && rVar.f13035a == 0 && (j1Var = this.f13072s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.e();
            ActionMenuView actionMenuView = ((k3) actionBarOverlayLayout.f1892e).f20129a.f1935a;
            if (actionMenuView != null && (hVar = actionMenuView.K) != null && hVar.g()) {
                i(rVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f13056e.getSystemService("window");
        if (windowManager != null && rVar.f13045m && (qVar = rVar.f13038e) != null) {
            windowManager.removeView(qVar);
            if (z10) {
                g(rVar.f13035a, rVar, null);
            }
        }
        rVar.f13043k = false;
        rVar.f13044l = false;
        rVar.f13045m = false;
        rVar.f13039f = null;
        rVar.f13046n = true;
        if (this.W == rVar) {
            this.W = null;
        }
        if (rVar.f13035a == 0) {
            y();
        }
    }

    public final boolean k(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.k(android.view.KeyEvent):boolean");
    }

    public final void l(int i7) {
        r q10 = q(i7);
        if (q10.h != null) {
            Bundle bundle = new Bundle();
            q10.h.t(bundle);
            if (bundle.size() > 0) {
                q10.f13048p = bundle;
            }
            q10.h.w();
            q10.h.clear();
        }
        q10.f13047o = true;
        q10.f13046n = true;
        if ((i7 == 108 || i7 == 0) && this.f13072s != null) {
            r q11 = q(0);
            q11.f13043k = false;
            w(q11, null);
        }
    }

    public final void m() {
        ViewGroup viewGroup;
        Context context;
        if (!this.J) {
            Context context2 = this.f13056e;
            int[] iArr = f.a.f11027j;
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
                n();
                this.f13058f.getDecorView();
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
                        this.f13072s = j1Var;
                        j1Var.setWindowCallback(this.f13058f.getCallback());
                        if (this.Q) {
                            ((ActionBarOverlayLayout) this.f13072s).d(109);
                        }
                        if (this.N) {
                            ((ActionBarOverlayLayout) this.f13072s).d(2);
                        }
                        if (this.O) {
                            ((ActionBarOverlayLayout) this.f13072s).d(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.R ? (ViewGroup) from.inflate(2131492886, (ViewGroup) null) : (ViewGroup) from.inflate(2131492885, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    i iVar = new i(this);
                    WeakHashMap weakHashMap = i0.f56289a;
                    r0.a0.i(viewGroup, iVar);
                    if (this.f13072s == null) {
                        this.L = (TextView) viewGroup.findViewById(2131296716);
                    }
                    Method method = r3.f20229a;
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
                    ViewGroup viewGroup2 = (ViewGroup) this.f13058f.findViewById(16908290);
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
                    this.f13058f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new cb.c(this, 23));
                    this.K = viewGroup;
                    CharSequence charSequence = this.f13071r;
                    if (!TextUtils.isEmpty(charSequence)) {
                        j1 j1Var2 = this.f13072s;
                        if (j1Var2 != null) {
                            j1Var2.setWindowTitle(charSequence);
                        } else {
                            b0 b0Var = this.f13066n;
                            if (b0Var != null) {
                                k3 k3Var = (k3) b0Var.f12975e;
                                if (!k3Var.f20134g) {
                                    Toolbar toolbar = k3Var.f20129a;
                                    k3Var.h = charSequence;
                                    if ((k3Var.f20130b & 8) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (k3Var.f20134g) {
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
                    View decorView = this.f13058f.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = i0.f56289a;
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
                    if (!this.f13052a0 && q10.h == null) {
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

    public final void n() {
        if (this.f13058f != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final Context o() {
        Context context;
        b0 r10 = r();
        if (r10 != null) {
            if (r10.f12973b == null) {
                TypedValue typedValue = new TypedValue();
                r10.f12972a.getTheme().resolveAttribute(2130968586, typedValue, true);
                int i7 = typedValue.resourceId;
                if (i7 != 0) {
                    r10.f12973b = new ContextThemeWrapper(r10.f12972a, i7);
                } else {
                    r10.f12973b = r10.f12972a;
                }
            }
            context = r10.f12973b;
        } else {
            context = null;
        }
        if (context == null) {
            return this.f13056e;
        }
        return context;
    }

    @Override
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final p p(Context context) {
        if (this.f13060g0 == null) {
            if (android.support.v4.media.session.a0.f1722f == null) {
                Context applicationContext = context.getApplicationContext();
                android.support.v4.media.session.a0.f1722f = new android.support.v4.media.session.a0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f13060g0 = new o(this, android.support.v4.media.session.a0.f1722f);
        }
        return this.f13060g0;
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
            obj.f13035a = i7;
            obj.f13046n = false;
            objArr[i7] = obj;
            return obj;
        }
        return rVar;
    }

    public final b0 r() {
        m();
        if (this.P && this.f13066n == null) {
            u uVar = this.d;
            if (e2.s(uVar)) {
                this.f13066n = new b0(uVar);
            }
            b0 b0Var = this.f13066n;
            if (b0Var != null) {
                b0Var.c(this.f13065l0);
            }
        }
        return this.f13066n;
    }

    public final void s(int i7) {
        this.f13063j0 = (1 << i7) | this.f13063j0;
        if (!this.f13062i0) {
            View decorView = this.f13058f.getDecorView();
            WeakHashMap weakHashMap = i0.f56289a;
            decorView.postOnAnimation(this.f13064k0);
            this.f13062i0 = true;
        }
    }

    public final boolean t() {
        k1 k1Var;
        f3 f3Var;
        l.m mVar;
        boolean z10 = this.X;
        this.X = false;
        r q10 = q(0);
        if (q10.f13045m) {
            if (!z10) {
                j(q10, true);
                return true;
            }
        } else {
            k.a aVar = this.f13075y;
            if (aVar != null) {
                aVar.c();
                return true;
            }
            b0 r10 = r();
            if (r10 == null || (k1Var = r10.f12975e) == null || (f3Var = ((k3) k1Var).f20129a.f1945f0) == null || f3Var.f20084b == null) {
                return false;
            }
            f3 f3Var2 = ((k3) k1Var).f20129a.f1945f0;
            if (f3Var2 == null) {
                mVar = null;
            } else {
                mVar = f3Var2.f20084b;
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
        if ((!rVar.f13043k && !w(rVar, keyEvent)) || (kVar = rVar.h) == null) {
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
            if (this.f13069p0 != null && (q(0).f13045m || this.f13075y != null)) {
                z10 = true;
            }
            if (z10 && this.f13070q0 == null) {
                this.f13070q0 = m.b(this.f13069p0, this);
            } else if (!z10 && (onBackInvokedCallback = this.f13070q0) != null) {
                m.c(this.f13069p0, onBackInvokedCallback);
            }
        }
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
