package defpackage;

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
public final class p1d implements d8 {
    public static final AccelerateInterpolator x = new AccelerateInterpolator();
    public static final DecelerateInterpolator y = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public z93 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public o1d i;
    public o1d j;
    public lh2 k;
    public boolean l;
    public boolean p;
    public boolean q;
    public bjc s;
    public boolean t;
    public final ArrayList m = new ArrayList();
    public int n = 0;
    public boolean o = true;
    public boolean r = true;
    public final n1d u = new n1d(this, (byte) 0);
    public final n1d v = new n1d(this, (byte) 1);
    public final pq8 w = new pq8(this, (byte) 26);

    public p1d(Activity activity, boolean z) {
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (!z) {
            this.g = decorView.findViewById(16908290);
        }
    }

    public final void a(boolean z) {
        zic i;
        zic zicVar;
        long j;
        boolean z2 = this.q;
        if (z) {
            if (!z2) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (z2) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = ihc.a;
        boolean isLaidOut = actionBarContainer.isLaidOut();
        z93 z93Var = this.e;
        if (isLaidOut) {
            if (z) {
                jxb jxbVar = (jxb) z93Var;
                i = ihc.a(jxbVar.a);
                i.a(0.0f);
                i.c(100L);
                i.d(new ixb(jxbVar, 4));
                zicVar = this.f.i(0, 200L);
            } else {
                jxb jxbVar2 = (jxb) z93Var;
                zic a = ihc.a(jxbVar2.a);
                a.a(1.0f);
                a.c(200L);
                a.d(new ixb(jxbVar2, 0));
                i = this.f.i(8, 100L);
                zicVar = a;
            }
            bjc bjcVar = new bjc();
            ArrayList arrayList = (ArrayList) bjcVar.c;
            arrayList.add(i);
            View view = (View) i.a.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) zicVar.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(zicVar);
            bjcVar.b();
        } else if (z) {
            ((jxb) z93Var).a.setVisibility(4);
            this.f.setVisibility(0);
        } else {
            ((jxb) z93Var).a.setVisibility(0);
            this.f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        z93 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296413);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(2131296305);
        if (findViewById instanceof z93) {
            wrapper = (z93) findViewById;
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
        this.f = (ActionBarContextView) view.findViewById(2131296313);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296307);
        this.d = actionBarContainer;
        z93 z93Var = this.e;
        if (z93Var != null && this.f != null && actionBarContainer != null) {
            Context context = ((jxb) z93Var).a.getContext();
            this.a = context;
            if ((((jxb) this.e).b & 4) != 0) {
                this.h = true;
            }
            int i = context.getApplicationInfo().targetSdkVersion;
            this.e.getClass();
            if (!context.getResources().getBoolean(2131034112)) {
                ((jxb) this.e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((jxb) this.e).getClass();
            }
            this.e.getClass();
            ((jxb) this.e).a.setCollapsible(false);
            this.c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, w19.a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
                if (actionBarOverlayLayout2.n) {
                    this.t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    grb.i("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                    return;
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = ihc.a;
                ahc.h(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        grb.i(p1d.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void c(boolean z) {
        int i;
        if (!this.h) {
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            jxb jxbVar = (jxb) this.e;
            int i2 = jxbVar.b;
            this.h = true;
            jxbVar.a((i & 4) | (i2 & (-5)));
        }
    }

    public final void d(boolean z) {
        boolean z2;
        int[] iArr;
        int[] iArr2;
        boolean z3 = this.p;
        if (!this.q && z3) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z4 = this.r;
        lk lkVar = null;
        pq8 pq8Var = this.w;
        View view = this.g;
        if (z2) {
            if (!z4) {
                this.r = true;
                bjc bjcVar = this.s;
                if (bjcVar != null) {
                    bjcVar.a();
                }
                this.d.setVisibility(0);
                int i = this.n;
                n1d n1dVar = this.v;
                if (i == 0 && z) {
                    this.d.setTranslationY(0.0f);
                    float f = -this.d.getHeight();
                    if (z) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f -= iArr2[1];
                    }
                    this.d.setTranslationY(f);
                    bjc bjcVar2 = new bjc();
                    ArrayList arrayList = (ArrayList) bjcVar2.c;
                    zic a = ihc.a(this.d);
                    a.e(0.0f);
                    View view2 = (View) a.a.get();
                    if (view2 != null) {
                        if (pq8Var != null) {
                            lkVar = new lk(pq8Var, view2, (byte) 29);
                        }
                        view2.animate().setUpdateListener(lkVar);
                    }
                    if (!bjcVar2.b) {
                        arrayList.add(a);
                    }
                    if (this.o && view != null) {
                        view.setTranslationY(f);
                        zic a2 = ihc.a(view);
                        a2.e(0.0f);
                        if (!bjcVar2.b) {
                            arrayList.add(a2);
                        }
                    }
                    boolean z5 = bjcVar2.b;
                    if (!z5) {
                        bjcVar2.d = y;
                    }
                    if (!z5) {
                        bjcVar2.a = 250L;
                    }
                    if (!z5) {
                        bjcVar2.e = n1dVar;
                    }
                    this.s = bjcVar2;
                    bjcVar2.b();
                } else {
                    this.d.setAlpha(1.0f);
                    this.d.setTranslationY(0.0f);
                    if (this.o && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    n1dVar.c();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = ihc.a;
                    ygc.c(actionBarOverlayLayout);
                }
            }
        } else if (z4) {
            this.r = false;
            bjc bjcVar3 = this.s;
            if (bjcVar3 != null) {
                bjcVar3.a();
            }
            int i2 = this.n;
            n1d n1dVar2 = this.u;
            if (i2 == 0 && z) {
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                bjc bjcVar4 = new bjc();
                ArrayList arrayList2 = (ArrayList) bjcVar4.c;
                float f2 = -this.d.getHeight();
                if (z) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr[1];
                }
                zic a3 = ihc.a(this.d);
                a3.e(f2);
                View view3 = (View) a3.a.get();
                if (view3 != null) {
                    if (pq8Var != null) {
                        lkVar = new lk(pq8Var, view3, (byte) 29);
                    }
                    view3.animate().setUpdateListener(lkVar);
                }
                if (!bjcVar4.b) {
                    arrayList2.add(a3);
                }
                if (this.o && view != null) {
                    zic a4 = ihc.a(view);
                    a4.e(f2);
                    if (!bjcVar4.b) {
                        arrayList2.add(a4);
                    }
                }
                boolean z6 = bjcVar4.b;
                if (!z6) {
                    bjcVar4.d = x;
                }
                if (!z6) {
                    bjcVar4.a = 250L;
                }
                if (!z6) {
                    bjcVar4.e = n1dVar2;
                }
                this.s = bjcVar4;
                bjcVar4.b();
                return;
            }
            n1dVar2.c();
        }
    }

    public p1d(ep epVar) {
        b(epVar.getWindow().getDecorView());
    }
}
