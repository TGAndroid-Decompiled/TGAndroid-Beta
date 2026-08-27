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
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
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
import g7.b7;
import h7.r6;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;
import m.a1;
import m.d0;
import m.i1;
import m.k1;
import m.k3;
import m.l1;
import m.p3;
import m.q0;
import m.u3;
import m.w3;
import r0.j0;
import r0.m0;

public final class r extends h implements l.j, LayoutInflater.Factory2 {
    public static final a0.k m0 = new a0.k(0);

    public static final int[] f6290n0 = {16842836};

    public static final boolean f6291o0 = !"robolectric".equals(Build.FINGERPRINT);
    public PopupWindow A;
    public i B;
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
    public q[] Q;
    public q R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Configuration W;
    public final int X;
    public int Y;
    public int Z;

    public boolean f6292a0;

    public o f6293b0;

    public o f6294c0;
    public final t d;

    public boolean f6295d0;

    public final Context f6296e;

    public int f6297e0;

    public Window f6298f;

    public final i f6299f0;

    public boolean f6300g0;
    public n h;

    public Rect f6301h0;

    public Rect f6302i0;

    public v f6303j0;

    public OnBackInvokedDispatcher f6304k0;

    public OnBackInvokedCallback f6305l0;

    public b0 f6306n;

    public CharSequence f6307r;

    public k1 f6308s;
    public ga.c v;

    public k5.i f6309w;

    public k.a f6310x;

    public ActionBarContextView f6311y;

    public r(t tVar, t tVar2) {
        Context context = tVar.getContext();
        Window window = tVar.getWindow();
        this.C = null;
        this.D = true;
        this.X = -100;
        this.f6299f0 = new i(this, 0);
        this.f6296e = context;
        this.d = tVar;
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
        this.W = new Configuration(this.f6296e.getResources().getConfiguration());
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
        if (i10 == 1) {
            x();
            this.O = true;
            return true;
        }
        if (i10 == 2) {
            x();
            this.I = true;
            return true;
        }
        if (i10 == 5) {
            x();
            this.J = true;
            return true;
        }
        if (i10 == 10) {
            x();
            this.M = true;
            return true;
        }
        if (i10 == 108) {
            x();
            this.K = true;
            return true;
        }
        if (i10 != 109) {
            return this.f6298f.requestFeature(i10);
        }
        x();
        this.L = true;
        return true;
    }

    public final boolean d(boolean z10) {
        int i10;
        Object obj;
        boolean z11 = false;
        if (this.V) {
            return false;
        }
        int i11 = this.X;
        if (i11 == -100) {
            i11 = h.f6262a;
        }
        Context context = this.f6296e;
        int iE = -1;
        if (i11 != -100) {
            if (i11 == -1) {
                iE = i11;
            } else if (i11 != 0) {
                if (i11 == 1 || i11 == 2) {
                    iE = i11;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    if (this.f6294c0 == null) {
                        this.f6294c0 = new o(this, context);
                    }
                    iE = this.f6294c0.e();
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                iE = o(context).e();
            }
        }
        if (iE != 1) {
            i10 = iE != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i10 = 16;
        }
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.uiMode = i10 | (configuration.uiMode & (-49));
        this.f6292a0 = true;
        int i12 = this.Z;
        Configuration configuration2 = this.W;
        if (configuration2 == null) {
            configuration2 = context.getResources().getConfiguration();
        }
        int i13 = configuration2.uiMode & 48;
        int i14 = configuration.uiMode & 48;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 24) {
            l.b(configuration2);
        } else {
            n0.c.b(k.a(configuration2.locale));
        }
        int i16 = i13 != i14 ? 512 : 0;
        if (((~i12) & i16) != 0 && z10 && this.T && !f6291o0) {
            boolean z12 = this.U;
        }
        if (i16 != 0) {
            Resources resources = context.getResources();
            Configuration configuration3 = new Configuration(resources.getConfiguration());
            configuration3.uiMode = i14 | (resources.getConfiguration().uiMode & (-49));
            Map map = null;
            obj = null;
            obj = null;
            Object obj2 = null;
            Object obj3 = null;
            resources.updateConfiguration(configuration3, null);
            if (i15 < 26 && i15 < 28) {
                if (i15 >= 24) {
                    if (!b7.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            b7.f6417g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e9) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e9);
                        }
                        b7.h = true;
                    }
                    Field field = b7.f6417g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e10);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!b7.f6413b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    b7.f6412a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e11) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e11);
                                }
                                b7.f6413b = true;
                            }
                            Field field2 = b7.f6412a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e12);
                                }
                            }
                            if (obj2 != null) {
                                b7.a(obj2);
                            }
                        }
                    }
                } else if (i15 >= 23) {
                    if (!b7.f6413b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            b7.f6412a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e13) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e13);
                        }
                        b7.f6413b = true;
                    }
                    Field field3 = b7.f6412a;
                    if (field3 != null) {
                        try {
                            obj3 = field3.get(resources);
                        } catch (IllegalAccessException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e14);
                        }
                    }
                    if (obj3 != null) {
                        b7.a(obj3);
                    }
                } else {
                    if (!b7.f6413b) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            b7.f6412a = declaredField4;
                            declaredField4.setAccessible(true);
                        } catch (NoSuchFieldException e15) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e15);
                        }
                        b7.f6413b = true;
                    }
                    Field field4 = b7.f6412a;
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
            o oVar = this.f6293b0;
            if (oVar != null) {
                oVar.c();
            }
        }
        if (i11 == 3) {
            if (this.f6294c0 == null) {
                this.f6294c0 = new o(this, context);
            }
            this.f6294c0.l();
        } else {
            o oVar2 = this.f6294c0;
            if (oVar2 != null) {
                oVar2.c();
            }
        }
        return z11;
    }

    public final void e(Window window) {
        Drawable drawableF;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f6298f != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(this, callback);
        this.h = nVar;
        window.setCallback(nVar);
        Context context = this.f6296e;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f6290n0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableF = null;
        } else {
            m.r rVarA = m.r.a();
            synchronized (rVarA) {
                drawableF = rVarA.f17439a.f(resourceId, context, true);
            }
        }
        if (drawableF != null) {
            window.setBackgroundDrawable(drawableF);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f6298f = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f6304k0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f6305l0) != null) {
            m.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f6305l0 = null;
        }
        this.f6304k0 = null;
        y();
    }

    public final void f(int i10, q qVar, l.l lVar) {
        if (lVar == null) {
            if (qVar == null && i10 >= 0) {
                q[] qVarArr = this.Q;
                if (i10 < qVarArr.length) {
                    qVar = qVarArr[i10];
                }
            }
            if (qVar != null) {
                lVar = qVar.h;
            }
        }
        if ((qVar == null || qVar.f6286m) && !this.V) {
            n nVar = this.h;
            Window.Callback callback = this.f6298f.getCallback();
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
        m.i iVar;
        if (this.P) {
            return;
        }
        this.P = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f6308s;
        actionBarOverlayLayout.f();
        ActionMenuView actionMenuView = ((p3) actionBarOverlayLayout.f979e).f17412a.f1018a;
        if (actionMenuView != null && (iVar = actionMenuView.F) != null) {
            iVar.f();
            m.e eVar = iVar.F;
            if (eVar != null && eVar.b()) {
                eVar.f15373i.dismiss();
            }
        }
        Window.Callback callback = this.f6298f.getCallback();
        if (callback != null && !this.V) {
            callback.onPanelClosed(108, lVar);
        }
        this.P = false;
    }

    public final void h(q qVar, boolean z10) {
        p pVar;
        k1 k1Var;
        m.i iVar;
        if (z10 && qVar.f6276a == 0 && (k1Var = this.f6308s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
            actionBarOverlayLayout.f();
            ActionMenuView actionMenuView = ((p3) actionBarOverlayLayout.f979e).f17412a.f1018a;
            if (actionMenuView != null && (iVar = actionMenuView.F) != null && iVar.g()) {
                g(qVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f6296e.getSystemService("window");
        if (windowManager != null && qVar.f6286m && (pVar = qVar.f6279e) != null) {
            windowManager.removeView(pVar);
            if (z10) {
                f(qVar.f6276a, qVar, null);
            }
        }
        qVar.f6284k = false;
        qVar.f6285l = false;
        qVar.f6286m = false;
        qVar.f6280f = null;
        qVar.f6287n = true;
        if (this.R == qVar) {
            this.R = null;
        }
        if (qVar.f6276a == 0) {
            y();
        }
    }

    public final boolean i(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        q qVarP;
        k1 k1Var;
        Context context;
        boolean z10;
        boolean z11;
        boolean zW;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        m.i iVar;
        m.i iVar2;
        m.i iVar3;
        q qVarP2;
        t tVar = this.d;
        if ((!(tVar instanceof r0.k) && !com.google.android.recaptcha.internal.a.u(tVar)) || (decorView = this.f6298f.getDecorView()) == null || !r6.a(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                n nVar = this.h;
                Window.Callback callback = this.f6298f.getCallback();
                nVar.getClass();
                try {
                    nVar.f6271c = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    nVar.f6271c = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.S = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    qVarP2 = p(0);
                                    if (!qVarP2.f6286m) {
                                        w(qVarP2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.f6310x == null) {
                                    qVarP = p(0);
                                    k1Var = this.f6308s;
                                    context = this.f6296e;
                                    if (k1Var != null) {
                                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
                                        actionBarOverlayLayout.f();
                                        toolbar = ((p3) actionBarOverlayLayout.f979e).f17412a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f1018a) == null || !actionMenuView.E || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z10 = qVarP.f6286m;
                                            if (!z10 || qVarP.f6285l) {
                                                h(qVarP, true);
                                                z11 = z10;
                                            } else {
                                                if (qVarP.f6284k) {
                                                    if (qVarP.f6288o) {
                                                        qVarP.f6284k = false;
                                                        zW = w(qVarP, keyEvent);
                                                    } else {
                                                        zW = true;
                                                    }
                                                    if (zW) {
                                                        u(qVarP, keyEvent);
                                                        z11 = true;
                                                    }
                                                }
                                                z11 = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f6308s;
                                            actionBarOverlayLayout2.f();
                                            ActionMenuView actionMenuView2 = ((p3) actionBarOverlayLayout2.f979e).f17412a.f1018a;
                                            if (actionMenuView2 == null || (iVar2 = actionMenuView2.F) == null || !iVar2.g()) {
                                                if (!this.V && w(qVarP, keyEvent)) {
                                                    ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f6308s;
                                                    actionBarOverlayLayout3.f();
                                                    ActionMenuView actionMenuView3 = ((p3) actionBarOverlayLayout3.f979e).f17412a.f1018a;
                                                    if (actionMenuView3 != null && (iVar = actionMenuView3.F) != null && iVar.l()) {
                                                        z11 = true;
                                                    }
                                                }
                                                z11 = false;
                                            } else {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f6308s;
                                                actionBarOverlayLayout4.f();
                                                ActionMenuView actionMenuView4 = ((p3) actionBarOverlayLayout4.f979e).f17412a.f1018a;
                                                if (actionMenuView4 == null || (iVar3 = actionMenuView4.F) == null || !iVar3.f()) {
                                                    z11 = false;
                                                } else {
                                                    z11 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        z10 = qVarP.f6286m;
                                        if (z10) {
                                        }
                                        h(qVarP, true);
                                        z11 = z10;
                                    }
                                    if (z11) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (s()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    nVar.f6271c = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.S = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            qVarP2 = p(0);
                            if (!qVarP2.f6286m) {
                                w(qVarP2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.f6310x == null) {
                            qVarP = p(0);
                            k1Var = this.f6308s;
                            context = this.f6296e;
                            if (k1Var != null) {
                                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) k1Var;
                                actionBarOverlayLayout5.f();
                                toolbar = ((p3) actionBarOverlayLayout5.f979e).f17412a;
                                if (toolbar.getVisibility() == 0) {
                                    z10 = qVarP.f6286m;
                                    if (z10) {
                                    }
                                    h(qVarP, true);
                                    z11 = z10;
                                } else {
                                    z10 = qVarP.f6286m;
                                    if (z10) {
                                    }
                                    h(qVarP, true);
                                    z11 = z10;
                                }
                            } else {
                                z10 = qVarP.f6286m;
                                if (z10) {
                                }
                                h(qVarP, true);
                                z11 = z10;
                            }
                            if (z11) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (s()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void j(int i10) {
        q qVarP = p(i10);
        if (qVarP.h != null) {
            Bundle bundle = new Bundle();
            qVarP.h.t(bundle);
            if (bundle.size() > 0) {
                qVarP.f6289p = bundle;
            }
            qVarP.h.w();
            qVarP.h.clear();
        }
        qVarP.f6288o = true;
        qVarP.f6287n = true;
        if ((i10 == 108 || i10 == 0) && this.f6308s != null) {
            q qVarP2 = p(0);
            qVarP2.f6284k = false;
            w(qVarP2, null);
        }
    }

    @Override
    public final void k(l.l r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.r.k(l.l):void");
    }

    public final void l() {
        ViewGroup viewGroup;
        if (this.E) {
            return;
        }
        Context context = this.f6296e;
        int[] iArr = f.a.f5581j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            c(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            c(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            c(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            c(10);
        }
        this.N = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m();
        this.f6298f.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.O) {
            viewGroup = this.M ? (ViewGroup) layoutInflaterFrom.inflate(2131492886, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(2131492885, (ViewGroup) null);
        } else if (this.N) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(2131492876, (ViewGroup) null);
            this.L = false;
            this.K = false;
        } else if (this.K) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130968585, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new k.c(context, typedValue.resourceId) : context).inflate(2131492887, (ViewGroup) null);
            k1 k1Var = (k1) viewGroup.findViewById(2131296411);
            this.f6308s = k1Var;
            k1Var.setWindowCallback(this.f6298f.getCallback());
            if (this.L) {
                ((ActionBarOverlayLayout) this.f6308s).e(109);
            }
            if (this.I) {
                ((ActionBarOverlayLayout) this.f6308s).e(2);
            }
            if (this.J) {
                ((ActionBarOverlayLayout) this.f6308s).e(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.K + ", windowActionBarOverlay: " + this.L + ", android:windowIsFloating: " + this.N + ", windowActionModeOverlay: " + this.M + ", windowNoTitle: " + this.O + " }");
        }
        int i10 = 15;
        a9.i iVar = new a9.i(this, i10);
        WeakHashMap weakHashMap = j0.f46605a;
        r0.b0.j(viewGroup, iVar);
        if (this.f6308s == null) {
            this.G = (TextView) viewGroup.findViewById(2131296712);
        }
        Method method = w3.f17498a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e9) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e9);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131296304);
        ViewGroup viewGroup2 = (ViewGroup) this.f6298f.findViewById(16908290);
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
        this.f6298f.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ae.b(this, i10));
        this.F = viewGroup;
        CharSequence charSequence = this.f6307r;
        if (!TextUtils.isEmpty(charSequence)) {
            k1 k1Var2 = this.f6308s;
            if (k1Var2 != null) {
                k1Var2.setWindowTitle(charSequence);
            } else {
                b0 b0Var = this.f6306n;
                if (b0Var != null) {
                    p3 p3Var = (p3) b0Var.f6208e;
                    if (!p3Var.f17417g) {
                        Toolbar toolbar = p3Var.f17412a;
                        p3Var.h = charSequence;
                        if ((p3Var.f17413b & 8) != 0) {
                            toolbar.setTitle(charSequence);
                            if (p3Var.f17417g) {
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
        View decorView = this.f6298f.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = j0.f46605a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.E = true;
        q qVarP = p(0);
        if (this.V || qVarP.h != null) {
            return;
        }
        r(108);
    }

    public final void m() {
        if (this.f6298f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context n() {
        Context context;
        b0 b0VarQ = q();
        if (b0VarQ != null) {
            if (b0VarQ.f6206b == null) {
                TypedValue typedValue = new TypedValue();
                b0VarQ.f6205a.getTheme().resolveAttribute(2130968586, typedValue, true);
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    b0VarQ.f6206b = new ContextThemeWrapper(b0VarQ.f6205a, i10);
                } else {
                    b0VarQ.f6206b = b0VarQ.f6205a;
                }
            }
            context = b0VarQ.f6206b;
        } else {
            context = null;
        }
        return context == null ? this.f6296e : context;
    }

    public final f2.w o(Context context) {
        if (this.f6293b0 == null) {
            if (a5.n.f98e == null) {
                Context applicationContext = context.getApplicationContext();
                a5.n.f98e = new a5.n(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f6293b0 = new o(this, a5.n.f98e);
        }
        return this.f6293b0;
    }

    @Override
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View b0Var;
        View view2 = null;
        if (this.f6303j0 == null) {
            int[] iArr = f.a.f5581j;
            Context context2 = this.f6296e;
            String string = context2.obtainStyledAttributes(iArr).getString(116);
            if (string == null) {
                this.f6303j0 = new v();
            } else {
                try {
                    this.f6303j0 = (v) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f6303j0 = new v();
                }
            }
        }
        v vVar = this.f6303j0;
        int i10 = u3.f17484a;
        vVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f5595y, 0, 0);
        byte b10 = 4;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        Context cVar = (resourceId == 0 || ((context instanceof k.c) && ((k.c) context).f14208a == resourceId)) ? context : new k.c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (!str.equals("RatingBar")) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case -1455429095:
                if (!str.equals("CheckedTextView")) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case -1346021293:
                if (!str.equals("MultiAutoCompleteTextView")) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case -938935918:
                if (!str.equals("TextView")) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b10 = -1;
                }
                break;
            case -658531749:
                if (!str.equals("SeekBar")) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case -339785223:
                if (!str.equals("Spinner")) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case 776382189:
                if (!str.equals("RadioButton")) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 799298502:
                if (!str.equals("ToggleButton")) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case 1125864064:
                if (!str.equals("ImageView")) {
                    b10 = -1;
                } else {
                    b10 = 9;
                }
                break;
            case 1413872058:
                if (!str.equals("AutoCompleteTextView")) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case 1601505219:
                if (!str.equals("CheckBox")) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case 1666676343:
                if (!str.equals("EditText")) {
                    b10 = -1;
                } else {
                    b10 = 12;
                }
                break;
            case 2001146706:
                if (!str.equals("Button")) {
                    b10 = -1;
                } else {
                    b10 = 13;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                b0Var = new m.b0(cVar, attributeSet);
                break;
            case 1:
                b0Var = new m.q(cVar, attributeSet);
                break;
            case 2:
                b0Var = new m.x(cVar, attributeSet);
                break;
            case 3:
                b0Var = new a1(cVar, attributeSet);
                break;
            case 4:
                b0Var = new m.v(cVar, attributeSet, 2130968812);
                break;
            case 5:
                b0Var = new d0(cVar, attributeSet);
                break;
            case 6:
                b0Var = new q0(cVar, attributeSet);
                break;
            case 7:
                b0Var = new m.a0(cVar, attributeSet);
                break;
            case 8:
                b0Var = new i1(cVar, attributeSet);
                break;
            case 9:
                b0Var = new m.w(cVar, attributeSet, 0);
                break;
            case 10:
                b0Var = new m.m(cVar, attributeSet);
                break;
            case 11:
                b0Var = new m.p(cVar, attributeSet);
                break;
            case 12:
                b0Var = new m.t(cVar, attributeSet);
                break;
            case 13:
                b0Var = new m.o(cVar, attributeSet);
                break;
            default:
                b0Var = null;
                break;
        }
        if (b0Var != null || context == cVar) {
            view2 = b0Var;
        } else {
            Object[] objArr = vVar.f6322a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = cVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr = v.f6321g;
                        if (i11 < 3) {
                            View viewA = vVar.a(cVar, str, strArr[i11]);
                            if (viewA != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewA;
                            } else {
                                i11++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewA2 = vVar.a(cVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewA2;
                }
            } catch (Exception unused) {
                objArr[0] = view2;
                objArr[1] = view2;
            } catch (Throwable th2) {
                objArr[0] = view2;
                objArr[1] = view2;
                throw th2;
            }
        }
        if (view2 != null) {
            Context context3 = view2.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap weakHashMap = j0.f46605a;
                if (view2.hasOnClickListeners()) {
                    TypedArray typedArrayObtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, v.f6318c);
                    String string2 = typedArrayObtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        view2.setOnClickListener(new u(view2, string2));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes3 = cVar.obtainStyledAttributes(attributeSet, v.d);
                if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                    boolean z10 = typedArrayObtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = j0.f46605a;
                    new r0.x(2131296684, Boolean.class, 0, 28, 2).d(view2, Boolean.valueOf(z10));
                }
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = cVar.obtainStyledAttributes(attributeSet, v.f6319e);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    j0.l(view2, typedArrayObtainStyledAttributes4.getString(0));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = cVar.obtainStyledAttributes(attributeSet, v.f6320f);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    boolean z11 = typedArrayObtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap weakHashMap3 = j0.f46605a;
                    new r0.x(2131296690, Boolean.class, 0, 28, 0).d(view2, Boolean.valueOf(z11));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        return view2;
    }

    public final q p(int i10) {
        q[] qVarArr = this.Q;
        if (qVarArr == null || qVarArr.length <= i10) {
            q[] qVarArr2 = new q[i10 + 1];
            if (qVarArr != null) {
                System.arraycopy(qVarArr, 0, qVarArr2, 0, qVarArr.length);
            }
            this.Q = qVarArr2;
            qVarArr = qVarArr2;
        }
        q qVar = qVarArr[i10];
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q();
        qVar2.f6276a = i10;
        qVar2.f6287n = false;
        qVarArr[i10] = qVar2;
        return qVar2;
    }

    public final b0 q() {
        l();
        if (this.K && this.f6306n == null) {
            t tVar = this.d;
            if (com.google.android.recaptcha.internal.a.u(tVar)) {
                this.f6306n = new b0(tVar);
            }
            b0 b0Var = this.f6306n;
            if (b0Var != null) {
                b0Var.c(this.f6300g0);
            }
        }
        return this.f6306n;
    }

    public final void r(int i10) {
        this.f6297e0 = (1 << i10) | this.f6297e0;
        if (this.f6295d0) {
            return;
        }
        View decorView = this.f6298f.getDecorView();
        WeakHashMap weakHashMap = j0.f46605a;
        decorView.postOnAnimation(this.f6299f0);
        this.f6295d0 = true;
    }

    public final boolean s() {
        l1 l1Var;
        k3 k3Var;
        boolean z10 = this.S;
        this.S = false;
        q qVarP = p(0);
        if (!qVarP.f6286m) {
            k.a aVar = this.f6310x;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            b0 b0VarQ = q();
            if (b0VarQ == null || (l1Var = b0VarQ.f6208e) == null || (k3Var = ((p3) l1Var).f17412a.f1019a0) == null || k3Var.f17366b == null) {
                return false;
            }
            k3 k3Var2 = ((p3) l1Var).f17412a.f1019a0;
            l.n nVar = k3Var2 == null ? null : k3Var2.f17366b;
            if (nVar != null) {
                nVar.collapseActionView();
            }
        } else if (!z10) {
            h(qVarP, true);
            return true;
        }
        return true;
    }

    @Override
    public final boolean t(l.l lVar, MenuItem menuItem) {
        q qVar;
        Window.Callback callback = this.f6298f.getCallback();
        if (callback != null && !this.V) {
            l.l lVarK = lVar.k();
            q[] qVarArr = this.Q;
            int length = qVarArr != null ? qVarArr.length : 0;
            for (int i10 = 0; i10 < length; i10++) {
                qVar = qVarArr[i10];
                if (qVar != null && qVar.h == lVarK) {
                    if (qVar != null) {
                        return callback.onMenuItemSelected(qVar.f6276a, menuItem);
                    }
                }
            }
            qVar = null;
            if (qVar != null) {
                return callback.onMenuItemSelected(qVar.f6276a, menuItem);
            }
        }
        return false;
    }

    public final void u(g.q r14, android.view.KeyEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: g.r.u(g.q, android.view.KeyEvent):void");
    }

    public final boolean v(q qVar, int i10, KeyEvent keyEvent) {
        l.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((qVar.f6284k || w(qVar, keyEvent)) && (lVar = qVar.h) != null) {
            return lVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    public final boolean w(q qVar, KeyEvent keyEvent) {
        l.l lVar;
        k1 k1Var;
        k1 k1Var2;
        Resources.Theme themeNewTheme;
        k1 k1Var3;
        k1 k1Var4;
        if (!this.V) {
            boolean z10 = qVar.f6284k;
            int i10 = qVar.f6276a;
            if (z10) {
                return true;
            }
            q qVar2 = this.R;
            if (qVar2 != null && qVar2 != qVar) {
                h(qVar2, false);
            }
            Window.Callback callback = this.f6298f.getCallback();
            if (callback != null) {
                qVar.f6281g = callback.onCreatePanelView(i10);
            }
            boolean z11 = i10 == 0 || i10 == 108;
            if (z11 && (k1Var4 = this.f6308s) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var4;
                actionBarOverlayLayout.f();
                ((p3) actionBarOverlayLayout.f979e).f17421l = true;
            }
            if (qVar.f6281g == null) {
                l.l lVar2 = qVar.h;
                if (lVar2 == null || qVar.f6288o) {
                    if (lVar2 == null) {
                        Context context = this.f6296e;
                        if ((i10 == 0 || i10 == 108) && this.f6308s != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(2130968585, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(2130968586, typedValue, true);
                            } else {
                                theme.resolveAttribute(2130968586, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                k.c cVar = new k.c(context, 0);
                                cVar.getTheme().setTo(themeNewTheme);
                                context = cVar;
                            }
                        }
                        l.l lVar3 = new l.l(context);
                        lVar3.f15313e = this;
                        l.l lVar4 = qVar.h;
                        if (lVar3 != lVar4) {
                            if (lVar4 != null) {
                                lVar4.r(qVar.f6282i);
                            }
                            qVar.h = lVar3;
                            l.h hVar = qVar.f6282i;
                            if (hVar != null) {
                                lVar3.b(hVar, lVar3.f15310a);
                            }
                        }
                        if (qVar.h != null) {
                            if (z11 && (k1Var2 = this.f6308s) != null) {
                                if (this.v == null) {
                                    this.v = new ga.c(this, 14);
                                }
                                ((ActionBarOverlayLayout) k1Var2).g(qVar.h, this.v);
                            }
                            qVar.h.w();
                            if (callback.onCreatePanelMenu(i10, qVar.h)) {
                                qVar.f6288o = false;
                            } else {
                                lVar = qVar.h;
                                if (lVar != null) {
                                    if (lVar != null) {
                                        lVar.r(qVar.f6282i);
                                    }
                                    qVar.h = null;
                                }
                                if (z11 && (k1Var = this.f6308s) != null) {
                                    ((ActionBarOverlayLayout) k1Var).g(null, this.v);
                                }
                            }
                        }
                    } else {
                        if (z11) {
                            if (this.v == null) {
                                this.v = new ga.c(this, 14);
                            }
                            ((ActionBarOverlayLayout) k1Var2).g(qVar.h, this.v);
                        }
                        qVar.h.w();
                        if (callback.onCreatePanelMenu(i10, qVar.h)) {
                            lVar = qVar.h;
                            if (lVar != null) {
                                if (lVar != null) {
                                    lVar.r(qVar.f6282i);
                                }
                                qVar.h = null;
                            }
                            if (z11) {
                                ((ActionBarOverlayLayout) k1Var).g(null, this.v);
                            }
                        } else {
                            qVar.f6288o = false;
                        }
                    }
                }
                qVar.h.w();
                Bundle bundle = qVar.f6289p;
                if (bundle != null) {
                    qVar.h.s(bundle);
                    qVar.f6289p = null;
                }
                if (!callback.onPreparePanel(0, qVar.f6281g, qVar.h)) {
                    if (z11 && (k1Var3 = this.f6308s) != null) {
                        ((ActionBarOverlayLayout) k1Var3).g(null, this.v);
                    }
                    qVar.h.v();
                    return false;
                }
                qVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                qVar.h.v();
            }
            qVar.f6284k = true;
            qVar.f6285l = false;
            this.R = qVar;
            return true;
        }
        return false;
    }

    public final void x() {
        if (this.E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void y() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f6304k0 != null && (p(0).f6286m || this.f6310x != null)) {
                z10 = true;
            }
            if (z10 && this.f6305l0 == null) {
                this.f6305l0 = m.b(this.f6304k0, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.f6305l0) == null) {
                    return;
                }
                m.c(this.f6304k0, onBackInvokedCallback);
            }
        }
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
