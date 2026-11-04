package g;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import b8.fc;
import ci.uc;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.k1;
import m.k3;
import r0.i0;
import r0.l0;
public final class b0 extends fc implements m.b {
    public static final AccelerateInterpolator f11658x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f11659y = new DecelerateInterpolator();
    public Context f11660a;
    public Context f11661b;
    public ActionBarOverlayLayout f11662c;
    public ActionBarContainer d;
    public k1 f11663e;
    public ActionBarContextView f11664f;
    public final View f11665g;
    public boolean h;
    public a0 f11666i;
    public a0 f11667j;
    public tf.b f11668k;
    public boolean f11669l;
    public final ArrayList f11670m;
    public int f11671n;
    public boolean f11672o;
    public boolean f11673p;
    public boolean f11674q;
    public boolean f11675r;
    public k.j f11676s;
    public boolean f11677t;
    public final z f11678u;
    public final z v;
    public final bb.c f11679w;

    public b0(Activity activity, boolean z10) {
        new ArrayList();
        this.f11670m = new ArrayList();
        this.f11671n = 0;
        this.f11672o = true;
        this.f11675r = true;
        this.f11678u = new z(this, 0);
        this.v = new z(this, 1);
        this.f11679w = new bb.c(this, 26);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.f11665g = decorView.findViewById(16908290);
    }

    public final void a(boolean z10) {
        l0 i3;
        l0 l0Var;
        long j10;
        if (z10) {
            if (!this.f11674q) {
                this.f11674q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f11662c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f11674q) {
            this.f11674q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f11662c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = i0.f54015a;
        if (actionBarContainer.isLaidOut()) {
            if (z10) {
                k3 k3Var = (k3) this.f11663e;
                i3 = i0.a(k3Var.f18622a);
                i3.a(0.0f);
                i3.c(100L);
                i3.d(new k.i(k3Var, 4));
                l0Var = this.f11664f.i(0, 200L);
            } else {
                k3 k3Var2 = (k3) this.f11663e;
                l0 a10 = i0.a(k3Var2.f18622a);
                a10.a(1.0f);
                a10.c(200L);
                a10.d(new k.i(k3Var2, 0));
                i3 = this.f11664f.i(8, 100L);
                l0Var = a10;
            }
            k.j jVar = new k.j();
            ArrayList arrayList = (ArrayList) jVar.f16431c;
            arrayList.add(i3);
            View view = (View) i3.f54027a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = (View) l0Var.f54027a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            arrayList.add(l0Var);
            jVar.b();
        } else if (z10) {
            ((k3) this.f11663e).f18622a.setVisibility(4);
            this.f11664f.setVisibility(0);
        } else {
            ((k3) this.f11663e).f18622a.setVisibility(0);
            this.f11664f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        k1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296411);
        this.f11662c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(2131296303);
        if (findViewById instanceof k1) {
            wrapper = (k1) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f11663e = wrapper;
        this.f11664f = (ActionBarContextView) view.findViewById(2131296311);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296305);
        this.d = actionBarContainer;
        k1 k1Var = this.f11663e;
        if (k1Var != null && this.f11664f != null && actionBarContainer != null) {
            Context context = ((k3) k1Var).f18622a.getContext();
            this.f11660a = context;
            if ((((k3) this.f11663e).f18623b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.h = true;
            }
            int i3 = context.getApplicationInfo().targetSdkVersion;
            this.f11663e.getClass();
            if (!context.getResources().getBoolean(2131034112)) {
                ((k3) this.f11663e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((k3) this.f11663e).getClass();
            }
            this.f11663e.getClass();
            ((k3) this.f11663e).f18622a.setCollapsible(false);
            this.f11662c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f11660a.obtainStyledAttributes(null, f.a.f11307a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f11662c;
                if (actionBarOverlayLayout2.f1355n) {
                    this.f11677t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = i0.f54015a;
                r0.a0.h(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(b0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void c(boolean z10) {
        int i3;
        if (!this.h) {
            if (z10) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            k3 k3Var = (k3) this.f11663e;
            int i10 = k3Var.f18623b;
            this.h = true;
            k3Var.a((i3 & 4) | (i10 & (-5)));
        }
    }

    public final void d(boolean z10) {
        int[] iArr;
        int[] iArr2;
        boolean z11 = this.f11673p;
        boolean z12 = this.f11674q;
        uc ucVar = null;
        bb.c cVar = this.f11679w;
        View view = this.f11665g;
        if (!z12 && z11) {
            if (this.f11675r) {
                this.f11675r = false;
                k.j jVar = this.f11676s;
                if (jVar != null) {
                    jVar.a();
                }
                int i3 = this.f11671n;
                z zVar = this.f11678u;
                if (i3 == 0 && z10) {
                    this.d.setAlpha(1.0f);
                    this.d.setTransitioning(true);
                    k.j jVar2 = new k.j();
                    ArrayList arrayList = (ArrayList) jVar2.f16431c;
                    float f10 = -this.d.getHeight();
                    if (z10) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f10 -= iArr2[1];
                    }
                    l0 a10 = i0.a(this.d);
                    a10.e(f10);
                    View view2 = (View) a10.f54027a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            ucVar = new uc(26, cVar, view2);
                        }
                        view2.animate().setUpdateListener(ucVar);
                    }
                    if (!jVar2.f16430b) {
                        arrayList.add(a10);
                    }
                    if (this.f11672o && view != null) {
                        l0 a11 = i0.a(view);
                        a11.e(f10);
                        if (!jVar2.f16430b) {
                            arrayList.add(a11);
                        }
                    }
                    boolean z13 = jVar2.f16430b;
                    if (!z13) {
                        jVar2.d = f11658x;
                    }
                    if (!z13) {
                        jVar2.f16429a = 250L;
                    }
                    if (!z13) {
                        jVar2.f16432e = zVar;
                    }
                    this.f11676s = jVar2;
                    jVar2.b();
                    return;
                }
                zVar.c();
            }
        } else if (!this.f11675r) {
            this.f11675r = true;
            k.j jVar3 = this.f11676s;
            if (jVar3 != null) {
                jVar3.a();
            }
            this.d.setVisibility(0);
            int i10 = this.f11671n;
            z zVar2 = this.v;
            if (i10 == 0 && z10) {
                this.d.setTranslationY(0.0f);
                float f11 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f11 -= iArr[1];
                }
                this.d.setTranslationY(f11);
                k.j jVar4 = new k.j();
                ArrayList arrayList2 = (ArrayList) jVar4.f16431c;
                l0 a12 = i0.a(this.d);
                a12.e(0.0f);
                View view3 = (View) a12.f54027a.get();
                if (view3 != null) {
                    if (cVar != null) {
                        ucVar = new uc(26, cVar, view3);
                    }
                    view3.animate().setUpdateListener(ucVar);
                }
                if (!jVar4.f16430b) {
                    arrayList2.add(a12);
                }
                if (this.f11672o && view != null) {
                    view.setTranslationY(f11);
                    l0 a13 = i0.a(view);
                    a13.e(0.0f);
                    if (!jVar4.f16430b) {
                        arrayList2.add(a13);
                    }
                }
                boolean z14 = jVar4.f16430b;
                if (!z14) {
                    jVar4.d = f11659y;
                }
                if (!z14) {
                    jVar4.f16429a = 250L;
                }
                if (!z14) {
                    jVar4.f16432e = zVar2;
                }
                this.f11676s = jVar4;
                jVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f11672o && view != null) {
                    view.setTranslationY(0.0f);
                }
                zVar2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f11662c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = i0.f54015a;
                r0.y.c(actionBarOverlayLayout);
            }
        }
    }

    public b0(u uVar) {
        new ArrayList();
        this.f11670m = new ArrayList();
        this.f11671n = 0;
        this.f11672o = true;
        this.f11675r = true;
        this.f11678u = new z(this, 0);
        this.v = new z(this, 1);
        this.f11679w = new bb.c(this, 26);
        b(uVar.getWindow().getDecorView());
    }
}
