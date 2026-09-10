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
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.k1;
import m.n3;
import r0.i0;
import r0.l0;
import v7.k7;
public final class c0 extends k7 implements m.b {
    public static final AccelerateInterpolator f8345x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f8346y = new DecelerateInterpolator();
    public Context f8347a;
    public Context f8348b;
    public ActionBarOverlayLayout f8349c;
    public ActionBarContainer d;
    public k1 e;
    public ActionBarContextView f8350f;
    public final View f8351g;
    public boolean h;
    public b0 f8352i;
    public b0 f8353j;
    public of.b f8354k;
    public boolean f8355l;
    public final ArrayList f8356m;
    public int f8357n;
    public boolean f8358o;
    public boolean f8359p;
    public boolean f8360q;
    public boolean f8361r;
    public bc.d f8362s;
    public boolean f8363t;
    public final a0 f8364u;
    public final a0 v;
    public final a6.i f8365w;

    public c0(Activity activity, boolean z10) {
        new ArrayList();
        this.f8356m = new ArrayList();
        this.f8357n = 0;
        this.f8358o = true;
        this.f8361r = true;
        this.f8364u = new a0(this, 0);
        this.v = new a0(this, 1);
        this.f8365w = new a6.i(this, 19);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.f8351g = decorView.findViewById(16908290);
    }

    public final void a(boolean z10) {
        l0 i10;
        l0 l0Var;
        long j3;
        if (z10) {
            if (!this.f8360q) {
                this.f8360q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f8349c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f8360q) {
            this.f8360q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8349c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = i0.f41062a;
        if (actionBarContainer.isLaidOut()) {
            if (z10) {
                n3 n3Var = (n3) this.e;
                i10 = i0.a(n3Var.f13078a);
                i10.a(0.0f);
                i10.c(100L);
                i10.d(new k.i(n3Var, 4));
                l0Var = this.f8350f.i(0, 200L);
            } else {
                n3 n3Var2 = (n3) this.e;
                l0 a2 = i0.a(n3Var2.f13078a);
                a2.a(1.0f);
                a2.c(200L);
                a2.d(new k.i(n3Var2, 0));
                i10 = this.f8350f.i(8, 100L);
                l0Var = a2;
            }
            bc.d dVar = new bc.d();
            ArrayList arrayList = (ArrayList) dVar.f2191c;
            arrayList.add(i10);
            View view = (View) i10.f41072a.get();
            if (view != null) {
                j3 = view.animate().getDuration();
            } else {
                j3 = 0;
            }
            View view2 = (View) l0Var.f41072a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j3);
            }
            arrayList.add(l0Var);
            dVar.b();
        } else if (z10) {
            ((n3) this.e).f13078a.setVisibility(4);
            this.f8350f.setVisibility(0);
        } else {
            ((n3) this.e).f13078a.setVisibility(0);
            this.f8350f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        k1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296411);
        this.f8349c = actionBarOverlayLayout;
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
        this.e = wrapper;
        this.f8350f = (ActionBarContextView) view.findViewById(2131296311);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296305);
        this.d = actionBarContainer;
        k1 k1Var = this.e;
        if (k1Var != null && this.f8350f != null && actionBarContainer != null) {
            Context context = ((n3) k1Var).f13078a.getContext();
            this.f8347a = context;
            if ((((n3) this.e).f13079b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.h = true;
            }
            int i10 = context.getApplicationInfo().targetSdkVersion;
            this.e.getClass();
            if (!context.getResources().getBoolean(2131034112)) {
                ((n3) this.e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((n3) this.e).getClass();
            }
            this.e.getClass();
            ((n3) this.e).f13078a.setCollapsible(false);
            this.f8349c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f8347a.obtainStyledAttributes(null, f.a.f7645a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8349c;
                if (actionBarOverlayLayout2.f672n) {
                    this.f8363t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = i0.f41062a;
                r0.a0.i(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(c0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void c(boolean z10) {
        int i10;
        if (!this.h) {
            if (z10) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            n3 n3Var = (n3) this.e;
            int i11 = n3Var.f13079b;
            this.h = true;
            n3Var.a((i10 & 4) | (i11 & (-5)));
        }
    }

    public final void d(boolean z10) {
        int[] iArr;
        int[] iArr2;
        boolean z11 = this.f8359p;
        boolean z12 = this.f8360q;
        qg.o oVar = null;
        a6.i iVar = this.f8365w;
        View view = this.f8351g;
        if (!z12 && z11) {
            if (this.f8361r) {
                this.f8361r = false;
                bc.d dVar = this.f8362s;
                if (dVar != null) {
                    dVar.a();
                }
                int i10 = this.f8357n;
                a0 a0Var = this.f8364u;
                if (i10 == 0 && z10) {
                    this.d.setAlpha(1.0f);
                    this.d.setTransitioning(true);
                    bc.d dVar2 = new bc.d();
                    ArrayList arrayList = (ArrayList) dVar2.f2191c;
                    float f7 = -this.d.getHeight();
                    if (z10) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f7 -= iArr2[1];
                    }
                    l0 a2 = i0.a(this.d);
                    a2.e(f7);
                    View view2 = (View) a2.f41072a.get();
                    if (view2 != null) {
                        if (iVar != null) {
                            oVar = new qg.o(iVar, view2);
                        }
                        view2.animate().setUpdateListener(oVar);
                    }
                    if (!dVar2.f2190b) {
                        arrayList.add(a2);
                    }
                    if (this.f8358o && view != null) {
                        l0 a10 = i0.a(view);
                        a10.e(f7);
                        if (!dVar2.f2190b) {
                            arrayList.add(a10);
                        }
                    }
                    boolean z13 = dVar2.f2190b;
                    if (!z13) {
                        dVar2.d = f8345x;
                    }
                    if (!z13) {
                        dVar2.f2189a = 250L;
                    }
                    if (!z13) {
                        dVar2.e = a0Var;
                    }
                    this.f8362s = dVar2;
                    dVar2.b();
                    return;
                }
                a0Var.c();
            }
        } else if (!this.f8361r) {
            this.f8361r = true;
            bc.d dVar3 = this.f8362s;
            if (dVar3 != null) {
                dVar3.a();
            }
            this.d.setVisibility(0);
            int i11 = this.f8357n;
            a0 a0Var2 = this.v;
            if (i11 == 0 && z10) {
                this.d.setTranslationY(0.0f);
                float f10 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f10 -= iArr[1];
                }
                this.d.setTranslationY(f10);
                bc.d dVar4 = new bc.d();
                ArrayList arrayList2 = (ArrayList) dVar4.f2191c;
                l0 a11 = i0.a(this.d);
                a11.e(0.0f);
                View view3 = (View) a11.f41072a.get();
                if (view3 != null) {
                    if (iVar != null) {
                        oVar = new qg.o(iVar, view3);
                    }
                    view3.animate().setUpdateListener(oVar);
                }
                if (!dVar4.f2190b) {
                    arrayList2.add(a11);
                }
                if (this.f8358o && view != null) {
                    view.setTranslationY(f10);
                    l0 a12 = i0.a(view);
                    a12.e(0.0f);
                    if (!dVar4.f2190b) {
                        arrayList2.add(a12);
                    }
                }
                boolean z14 = dVar4.f2190b;
                if (!z14) {
                    dVar4.d = f8346y;
                }
                if (!z14) {
                    dVar4.f2189a = 250L;
                }
                if (!z14) {
                    dVar4.e = a0Var2;
                }
                this.f8362s = dVar4;
                dVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f8358o && view != null) {
                    view.setTranslationY(0.0f);
                }
                a0Var2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f8349c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = i0.f41062a;
                r0.y.c(actionBarOverlayLayout);
            }
        }
    }

    public c0(u uVar) {
        new ArrayList();
        this.f8356m = new ArrayList();
        this.f8357n = 0;
        this.f8358o = true;
        this.f8361r = true;
        this.f8364u = new a0(this, 0);
        this.v = new a0(this, 1);
        this.f8365w = new a6.i(this, 19);
        b(uVar.getWindow().getDecorView());
    }
}
