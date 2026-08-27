package g;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import g7.a7;
import java.util.ArrayList;
import java.util.WeakHashMap;
import lh.m2;
import m.l1;
import m.p3;
import r0.j0;
import r0.m0;

public final class b0 extends a7 implements m.c {

    public static final AccelerateInterpolator f6203x = new AccelerateInterpolator();

    public static final DecelerateInterpolator f6204y = new DecelerateInterpolator();

    public Context f6205a;

    public Context f6206b;

    public ActionBarOverlayLayout f6207c;
    public ActionBarContainer d;

    public l1 f6208e;

    public ActionBarContextView f6209f;

    public final View f6210g;
    public boolean h;

    public a0 f6211i;

    public a0 f6212j;

    public xe.b f6213k;

    public boolean f6214l;

    public final ArrayList f6215m;

    public int f6216n;

    public boolean f6217o;

    public boolean f6218p;

    public boolean f6219q;

    public boolean f6220r;

    public k.j f6221s;

    public boolean f6222t;

    public final z f6223u;
    public final z v;

    public final a9.i f6224w;

    public b0(Activity activity, boolean z10) {
        new ArrayList();
        this.f6215m = new ArrayList();
        this.f6216n = 0;
        this.f6217o = true;
        this.f6220r = true;
        this.f6223u = new z(this, 0);
        this.v = new z(this, 1);
        this.f6224w = new a9.i(this, 16);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.f6210g = decorView.findViewById(16908290);
    }

    public final void a(boolean z10) {
        m0 m0VarI;
        m0 m0VarI2;
        if (z10) {
            if (!this.f6219q) {
                this.f6219q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6207c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f6219q) {
            this.f6219q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6207c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = j0.f46605a;
        if (!actionBarContainer.isLaidOut()) {
            if (z10) {
                ((p3) this.f6208e).f17412a.setVisibility(4);
                this.f6209f.setVisibility(0);
                return;
            } else {
                ((p3) this.f6208e).f17412a.setVisibility(0);
                this.f6209f.setVisibility(8);
                return;
            }
        }
        if (z10) {
            p3 p3Var = (p3) this.f6208e;
            m0VarI = j0.a(p3Var.f17412a);
            m0VarI.a(0.0f);
            m0VarI.c(100L);
            m0VarI.d(new k.i(p3Var, 4));
            m0VarI2 = this.f6209f.i(0, 200L);
        } else {
            p3 p3Var2 = (p3) this.f6208e;
            m0 m0VarA = j0.a(p3Var2.f17412a);
            m0VarA.a(1.0f);
            m0VarA.c(200L);
            m0VarA.d(new k.i(p3Var2, 0));
            m0VarI = this.f6209f.i(8, 100L);
            m0VarI2 = m0VarA;
        }
        k.j jVar = new k.j();
        ArrayList arrayList = (ArrayList) jVar.f14253c;
        arrayList.add(m0VarI);
        View view = (View) m0VarI.f46617a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) m0VarI2.f46617a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(m0VarI2);
        jVar.b();
    }

    public final void b(View view) {
        l1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296411);
        this.f6207c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(2131296303);
        if (callbackFindViewById instanceof l1) {
            wrapper = (l1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f6208e = wrapper;
        this.f6209f = (ActionBarContextView) view.findViewById(2131296311);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296305);
        this.d = actionBarContainer;
        l1 l1Var = this.f6208e;
        if (l1Var == null || this.f6209f == null || actionBarContainer == null) {
            throw new IllegalStateException(b0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((p3) l1Var).f17412a.getContext();
        this.f6205a = context;
        if ((((p3) this.f6208e).f17413b & 4) != 0) {
            this.h = true;
        }
        int i10 = context.getApplicationInfo().targetSdkVersion;
        this.f6208e.getClass();
        if (context.getResources().getBoolean(2131034112)) {
            this.d.setTabContainer(null);
            ((p3) this.f6208e).getClass();
        } else {
            ((p3) this.f6208e).getClass();
            this.d.setTabContainer(null);
        }
        this.f6208e.getClass();
        ((p3) this.f6208e).f17412a.setCollapsible(false);
        this.f6207c.setHasNonEmbeddedTabs(false);
        TypedArray typedArrayObtainStyledAttributes = this.f6205a.obtainStyledAttributes(null, f.a.f5574a, 2130968581, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6207c;
            if (!actionBarOverlayLayout2.f981n) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f6222t = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = j0.f46605a;
            r0.b0.i(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void c(boolean z10) {
        if (this.h) {
            return;
        }
        int i10 = z10 ? 4 : 0;
        p3 p3Var = (p3) this.f6208e;
        int i11 = p3Var.f17413b;
        this.h = true;
        p3Var.a((i10 & 4) | (i11 & (-5)));
    }

    public final void d(boolean z10) {
        boolean z11 = this.f6218p;
        boolean z12 = this.f6219q;
        a9.i iVar = this.f6224w;
        View view = this.f6210g;
        if (!z12 && z11) {
            if (this.f6220r) {
                this.f6220r = false;
                k.j jVar = this.f6221s;
                if (jVar != null) {
                    jVar.a();
                }
                int i10 = this.f6216n;
                z zVar = this.f6223u;
                if (i10 != 0 || !z10) {
                    zVar.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                k.j jVar2 = new k.j();
                ArrayList arrayList = (ArrayList) jVar2.f14253c;
                float f10 = -this.d.getHeight();
                if (z10) {
                    int[] iArr = {0, 0};
                    this.d.getLocationInWindow(iArr);
                    f10 -= iArr[1];
                }
                m0 m0VarA = j0.a(this.d);
                m0VarA.e(f10);
                View view2 = (View) m0VarA.f46617a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(iVar != null ? new m2(iVar, view2) : null);
                }
                if (!jVar2.f14252b) {
                    arrayList.add(m0VarA);
                }
                if (this.f6217o && view != null) {
                    m0 m0VarA2 = j0.a(view);
                    m0VarA2.e(f10);
                    if (!jVar2.f14252b) {
                        arrayList.add(m0VarA2);
                    }
                }
                boolean z13 = jVar2.f14252b;
                if (!z13) {
                    jVar2.d = f6203x;
                }
                if (!z13) {
                    jVar2.f14251a = 250L;
                }
                if (!z13) {
                    jVar2.f14254e = zVar;
                }
                this.f6221s = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f6220r) {
            return;
        }
        this.f6220r = true;
        k.j jVar3 = this.f6221s;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.d.setVisibility(0);
        int i11 = this.f6216n;
        z zVar2 = this.v;
        if (i11 == 0 && z10) {
            this.d.setTranslationY(0.0f);
            float f11 = -this.d.getHeight();
            if (z10) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f11 -= iArr2[1];
            }
            this.d.setTranslationY(f11);
            k.j jVar4 = new k.j();
            ArrayList arrayList2 = (ArrayList) jVar4.f14253c;
            m0 m0VarA3 = j0.a(this.d);
            m0VarA3.e(0.0f);
            View view3 = (View) m0VarA3.f46617a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(iVar != null ? new m2(iVar, view3) : null);
            }
            if (!jVar4.f14252b) {
                arrayList2.add(m0VarA3);
            }
            if (this.f6217o && view != null) {
                view.setTranslationY(f11);
                m0 m0VarA4 = j0.a(view);
                m0VarA4.e(0.0f);
                if (!jVar4.f14252b) {
                    arrayList2.add(m0VarA4);
                }
            }
            boolean z14 = jVar4.f14252b;
            if (!z14) {
                jVar4.d = f6204y;
            }
            if (!z14) {
                jVar4.f14251a = 250L;
            }
            if (!z14) {
                jVar4.f14254e = zVar2;
            }
            this.f6221s = jVar4;
            jVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.f6217o && view != null) {
                view.setTranslationY(0.0f);
            }
            zVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6207c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = j0.f46605a;
            r0.z.c(actionBarOverlayLayout);
        }
    }

    public b0(t tVar) {
        new ArrayList();
        this.f6215m = new ArrayList();
        this.f6216n = 0;
        this.f6217o = true;
        this.f6220r = true;
        this.f6223u = new z(this, 0);
        this.v = new z(this, 1);
        this.f6224w = new a9.i(this, 16);
        b(tVar.getWindow().getDecorView());
    }
}
