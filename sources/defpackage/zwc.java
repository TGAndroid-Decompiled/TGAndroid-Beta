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
public final class zwc implements c8 {
    public static final AccelerateInterpolator x = new AccelerateInterpolator();
    public static final DecelerateInterpolator y = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public g93 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public ywc i;
    public ywc j;
    public tg2 k;
    public boolean l;
    public boolean p;
    public boolean q;
    public cfc s;
    public boolean t;
    public final ArrayList m = new ArrayList();
    public int n = 0;
    public boolean o = true;
    public boolean r = true;
    public final xwc u = new xwc(this, (byte) 0);
    public final xwc v = new xwc(this, (byte) 1);
    public final g29 w = new g29(this, (byte) 22);

    public zwc(Activity activity, boolean z) {
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (!z) {
            this.g = decorView.findViewById(16908290);
        }
    }

    public final void a(boolean z) {
        afc i;
        afc afcVar;
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
        WeakHashMap weakHashMap = jdc.a;
        boolean isLaidOut = actionBarContainer.isLaidOut();
        g93 g93Var = this.e;
        if (isLaidOut) {
            if (z) {
                itb itbVar = (itb) g93Var;
                i = jdc.a(itbVar.a);
                i.a(0.0f);
                i.c(100L);
                i.d(new htb(itbVar, 4));
                afcVar = this.f.i(0, 200L);
            } else {
                itb itbVar2 = (itb) g93Var;
                afc a = jdc.a(itbVar2.a);
                a.a(1.0f);
                a.c(200L);
                a.d(new htb(itbVar2, 0));
                i = this.f.i(8, 100L);
                afcVar = a;
            }
            cfc cfcVar = new cfc();
            ArrayList arrayList = (ArrayList) cfcVar.c;
            arrayList.add(i);
            View view = (View) i.a.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) afcVar.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(afcVar);
            cfcVar.b();
        } else if (z) {
            ((itb) g93Var).a.setVisibility(4);
            this.f.setVisibility(0);
        } else {
            ((itb) g93Var).a.setVisibility(0);
            this.f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        g93 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296413);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(2131296305);
        if (findViewById instanceof g93) {
            wrapper = (g93) findViewById;
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
        g93 g93Var = this.e;
        if (g93Var != null && this.f != null && actionBarContainer != null) {
            Context context = ((itb) g93Var).a.getContext();
            this.a = context;
            if ((((itb) this.e).b & 4) != 0) {
                this.h = true;
            }
            int i = context.getApplicationInfo().targetSdkVersion;
            this.e.getClass();
            if (!context.getResources().getBoolean(2131034112)) {
                ((itb) this.e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((itb) this.e).getClass();
            }
            this.e.getClass();
            ((itb) this.e).a.setCollapsible(false);
            this.c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, jy8.a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
                if (actionBarOverlayLayout2.n) {
                    this.t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    sc8.j("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                    return;
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = jdc.a;
                bdc.h(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        sc8.j(zwc.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void c(boolean z) {
        int i;
        if (!this.h) {
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            itb itbVar = (itb) this.e;
            int i2 = itbVar.b;
            this.h = true;
            itbVar.a((i & 4) | (i2 & (-5)));
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
        pk pkVar = null;
        g29 g29Var = this.w;
        View view = this.g;
        if (z2) {
            if (!z4) {
                this.r = true;
                cfc cfcVar = this.s;
                if (cfcVar != null) {
                    cfcVar.a();
                }
                this.d.setVisibility(0);
                int i = this.n;
                xwc xwcVar = this.v;
                if (i == 0 && z) {
                    this.d.setTranslationY(0.0f);
                    float f = -this.d.getHeight();
                    if (z) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f -= iArr2[1];
                    }
                    this.d.setTranslationY(f);
                    cfc cfcVar2 = new cfc();
                    ArrayList arrayList = (ArrayList) cfcVar2.c;
                    afc a = jdc.a(this.d);
                    a.e(0.0f);
                    View view2 = (View) a.a.get();
                    if (view2 != null) {
                        if (g29Var != null) {
                            pkVar = new pk(g29Var, view2, (byte) 29);
                        }
                        view2.animate().setUpdateListener(pkVar);
                    }
                    if (!cfcVar2.b) {
                        arrayList.add(a);
                    }
                    if (this.o && view != null) {
                        view.setTranslationY(f);
                        afc a2 = jdc.a(view);
                        a2.e(0.0f);
                        if (!cfcVar2.b) {
                            arrayList.add(a2);
                        }
                    }
                    boolean z5 = cfcVar2.b;
                    if (!z5) {
                        cfcVar2.d = y;
                    }
                    if (!z5) {
                        cfcVar2.a = 250L;
                    }
                    if (!z5) {
                        cfcVar2.e = xwcVar;
                    }
                    this.s = cfcVar2;
                    cfcVar2.b();
                } else {
                    this.d.setAlpha(1.0f);
                    this.d.setTranslationY(0.0f);
                    if (this.o && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    xwcVar.c();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = jdc.a;
                    zcc.c(actionBarOverlayLayout);
                }
            }
        } else if (z4) {
            this.r = false;
            cfc cfcVar3 = this.s;
            if (cfcVar3 != null) {
                cfcVar3.a();
            }
            int i2 = this.n;
            xwc xwcVar2 = this.u;
            if (i2 == 0 && z) {
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                cfc cfcVar4 = new cfc();
                ArrayList arrayList2 = (ArrayList) cfcVar4.c;
                float f2 = -this.d.getHeight();
                if (z) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr[1];
                }
                afc a3 = jdc.a(this.d);
                a3.e(f2);
                View view3 = (View) a3.a.get();
                if (view3 != null) {
                    if (g29Var != null) {
                        pkVar = new pk(g29Var, view3, (byte) 29);
                    }
                    view3.animate().setUpdateListener(pkVar);
                }
                if (!cfcVar4.b) {
                    arrayList2.add(a3);
                }
                if (this.o && view != null) {
                    afc a4 = jdc.a(view);
                    a4.e(f2);
                    if (!cfcVar4.b) {
                        arrayList2.add(a4);
                    }
                }
                boolean z6 = cfcVar4.b;
                if (!z6) {
                    cfcVar4.d = x;
                }
                if (!z6) {
                    cfcVar4.a = 250L;
                }
                if (!z6) {
                    cfcVar4.e = xwcVar2;
                }
                this.s = cfcVar4;
                cfcVar4.b();
                return;
            }
            xwcVar2.c();
        }
    }

    public zwc(dp dpVar) {
        b(dpVar.getWindow().getDecorView());
    }
}
