package g;

import a8.ga;
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
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.k1;
import m.k3;
import r0.i0;
import r0.l0;
public final class b0 extends ga implements m.b {
    public static final AccelerateInterpolator f12933x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f12934y = new DecelerateInterpolator();
    public Context f12935a;
    public Context f12936b;
    public ActionBarOverlayLayout f12937c;
    public ActionBarContainer d;
    public k1 f12938e;
    public ActionBarContextView f12939f;
    public final View f12940g;
    public boolean h;
    public a0 f12941i;
    public a0 f12942j;
    public q4.q f12943k;
    public boolean f12944l;
    public final ArrayList f12945m;
    public int f12946n;
    public boolean f12947o;
    public boolean f12948p;
    public boolean f12949q;
    public boolean f12950r;
    public ac.d f12951s;
    public boolean f12952t;
    public final z f12953u;
    public final z v;
    public final cb.c f12954w;

    public b0(Activity activity, boolean z10) {
        new ArrayList();
        this.f12945m = new ArrayList();
        this.f12946n = 0;
        this.f12947o = true;
        this.f12950r = true;
        this.f12953u = new z(this, 0);
        this.v = new z(this, 1);
        this.f12954w = new cb.c(this, 24);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.f12940g = decorView.findViewById(16908290);
    }

    public final void a(boolean z10) {
        l0 i7;
        l0 l0Var;
        long j3;
        if (z10) {
            if (!this.f12949q) {
                this.f12949q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f12937c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f12949q) {
            this.f12949q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12937c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = i0.f56254a;
        if (actionBarContainer.isLaidOut()) {
            if (z10) {
                k3 k3Var = (k3) this.f12938e;
                i7 = i0.a(k3Var.f20095a);
                i7.a(0.0f);
                i7.c(100L);
                i7.d(new k.i(k3Var, 4));
                l0Var = this.f12939f.i(0, 200L);
            } else {
                k3 k3Var2 = (k3) this.f12938e;
                l0 a10 = i0.a(k3Var2.f20095a);
                a10.a(1.0f);
                a10.c(200L);
                a10.d(new k.i(k3Var2, 0));
                i7 = this.f12939f.i(8, 100L);
                l0Var = a10;
            }
            ac.d dVar = new ac.d();
            ArrayList arrayList = (ArrayList) dVar.f1017c;
            arrayList.add(i7);
            View view = (View) i7.f56266a.get();
            if (view != null) {
                j3 = view.animate().getDuration();
            } else {
                j3 = 0;
            }
            View view2 = (View) l0Var.f56266a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j3);
            }
            arrayList.add(l0Var);
            dVar.b();
        } else if (z10) {
            ((k3) this.f12938e).f20095a.setVisibility(4);
            this.f12939f.setVisibility(0);
        } else {
            ((k3) this.f12938e).f20095a.setVisibility(0);
            this.f12939f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        k1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296413);
        this.f12937c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(2131296305);
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
        this.f12938e = wrapper;
        this.f12939f = (ActionBarContextView) view.findViewById(2131296313);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296307);
        this.d = actionBarContainer;
        k1 k1Var = this.f12938e;
        if (k1Var != null && this.f12939f != null && actionBarContainer != null) {
            Context context = ((k3) k1Var).f20095a.getContext();
            this.f12935a = context;
            if ((((k3) this.f12938e).f20096b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.h = true;
            }
            int i7 = context.getApplicationInfo().targetSdkVersion;
            this.f12938e.getClass();
            if (!context.getResources().getBoolean(2131034112)) {
                ((k3) this.f12938e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((k3) this.f12938e).getClass();
            }
            this.f12938e.getClass();
            ((k3) this.f12938e).f20095a.setCollapsible(false);
            this.f12937c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f12935a.obtainStyledAttributes(null, f.a.f10983a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12937c;
                if (actionBarOverlayLayout2.f1845n) {
                    this.f12952t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = i0.f56254a;
                r0.a0.h(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(b0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void c(boolean z10) {
        int i7;
        if (!this.h) {
            if (z10) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            k3 k3Var = (k3) this.f12938e;
            int i10 = k3Var.f20096b;
            this.h = true;
            k3Var.a((i7 & 4) | (i10 & (-5)));
        }
    }

    public final void d(boolean z10) {
        int[] iArr;
        int[] iArr2;
        boolean z11 = this.f12948p;
        boolean z12 = this.f12949q;
        ch.w wVar = null;
        cb.c cVar = this.f12954w;
        View view = this.f12940g;
        if (!z12 && z11) {
            if (this.f12950r) {
                this.f12950r = false;
                ac.d dVar = this.f12951s;
                if (dVar != null) {
                    dVar.a();
                }
                int i7 = this.f12946n;
                z zVar = this.f12953u;
                if (i7 == 0 && z10) {
                    this.d.setAlpha(1.0f);
                    this.d.setTransitioning(true);
                    ac.d dVar2 = new ac.d();
                    ArrayList arrayList = (ArrayList) dVar2.f1017c;
                    float f10 = -this.d.getHeight();
                    if (z10) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f10 -= iArr2[1];
                    }
                    l0 a10 = i0.a(this.d);
                    a10.e(f10);
                    View view2 = (View) a10.f56266a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            wVar = new ch.w(27, cVar, view2);
                        }
                        view2.animate().setUpdateListener(wVar);
                    }
                    if (!dVar2.f1016b) {
                        arrayList.add(a10);
                    }
                    if (this.f12947o && view != null) {
                        l0 a11 = i0.a(view);
                        a11.e(f10);
                        if (!dVar2.f1016b) {
                            arrayList.add(a11);
                        }
                    }
                    boolean z13 = dVar2.f1016b;
                    if (!z13) {
                        dVar2.d = f12933x;
                    }
                    if (!z13) {
                        dVar2.f1015a = 250L;
                    }
                    if (!z13) {
                        dVar2.f1018e = zVar;
                    }
                    this.f12951s = dVar2;
                    dVar2.b();
                    return;
                }
                zVar.c();
            }
        } else if (!this.f12950r) {
            this.f12950r = true;
            ac.d dVar3 = this.f12951s;
            if (dVar3 != null) {
                dVar3.a();
            }
            this.d.setVisibility(0);
            int i10 = this.f12946n;
            z zVar2 = this.v;
            if (i10 == 0 && z10) {
                this.d.setTranslationY(0.0f);
                float f11 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f11 -= iArr[1];
                }
                this.d.setTranslationY(f11);
                ac.d dVar4 = new ac.d();
                ArrayList arrayList2 = (ArrayList) dVar4.f1017c;
                l0 a12 = i0.a(this.d);
                a12.e(0.0f);
                View view3 = (View) a12.f56266a.get();
                if (view3 != null) {
                    if (cVar != null) {
                        wVar = new ch.w(27, cVar, view3);
                    }
                    view3.animate().setUpdateListener(wVar);
                }
                if (!dVar4.f1016b) {
                    arrayList2.add(a12);
                }
                if (this.f12947o && view != null) {
                    view.setTranslationY(f11);
                    l0 a13 = i0.a(view);
                    a13.e(0.0f);
                    if (!dVar4.f1016b) {
                        arrayList2.add(a13);
                    }
                }
                boolean z14 = dVar4.f1016b;
                if (!z14) {
                    dVar4.d = f12934y;
                }
                if (!z14) {
                    dVar4.f1015a = 250L;
                }
                if (!z14) {
                    dVar4.f1018e = zVar2;
                }
                this.f12951s = dVar4;
                dVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f12947o && view != null) {
                    view.setTranslationY(0.0f);
                }
                zVar2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f12937c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = i0.f56254a;
                r0.y.c(actionBarOverlayLayout);
            }
        }
    }

    public b0(u uVar) {
        new ArrayList();
        this.f12945m = new ArrayList();
        this.f12946n = 0;
        this.f12947o = true;
        this.f12950r = true;
        this.f12953u = new z(this, 0);
        this.v = new z(this, 1);
        this.f12954w = new cb.c(this, 24);
        b(uVar.getWindow().getDecorView());
    }
}
