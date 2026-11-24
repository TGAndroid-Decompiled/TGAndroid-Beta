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
public final class azc implements c8 {
    public static final AccelerateInterpolator x = new AccelerateInterpolator();
    public static final DecelerateInterpolator y = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public sa3 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public zyc i;
    public zyc j;
    public lx6 k;
    public boolean l;
    public boolean p;
    public boolean q;
    public chc s;
    public boolean t;
    public final ArrayList m = new ArrayList();
    public int n = 0;
    public boolean o = true;
    public boolean r = true;
    public final yyc u = new yyc(this, (byte) 0);
    public final yyc v = new yyc(this, (byte) 1);
    public final et8 w = new et8(this, (byte) 23);

    public azc(Activity activity, boolean z) {
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (!z) {
            this.g = decorView.findViewById(16908290);
        }
    }

    public final void a(boolean z) {
        ahc i;
        ahc ahcVar;
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
        WeakHashMap weakHashMap = kfc.a;
        boolean isLaidOut = actionBarContainer.isLaidOut();
        sa3 sa3Var = this.e;
        if (isLaidOut) {
            if (z) {
                jvb jvbVar = (jvb) sa3Var;
                i = kfc.a(jvbVar.a);
                i.a(0.0f);
                i.c(100L);
                i.d(new ivb(jvbVar, 4));
                ahcVar = this.f.i(0, 200L);
            } else {
                jvb jvbVar2 = (jvb) sa3Var;
                ahc a = kfc.a(jvbVar2.a);
                a.a(1.0f);
                a.c(200L);
                a.d(new ivb(jvbVar2, 0));
                i = this.f.i(8, 100L);
                ahcVar = a;
            }
            chc chcVar = new chc();
            ArrayList arrayList = (ArrayList) chcVar.c;
            arrayList.add(i);
            View view = (View) i.a.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) ahcVar.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(ahcVar);
            chcVar.b();
        } else if (z) {
            ((jvb) sa3Var).a.setVisibility(4);
            this.f.setVisibility(0);
        } else {
            ((jvb) sa3Var).a.setVisibility(0);
            this.f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        sa3 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296413);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(2131296305);
        if (findViewById instanceof sa3) {
            wrapper = (sa3) findViewById;
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
        sa3 sa3Var = this.e;
        if (sa3Var != null && this.f != null && actionBarContainer != null) {
            Context context = ((jvb) sa3Var).a.getContext();
            this.a = context;
            if ((((jvb) this.e).b & 4) != 0) {
                this.h = true;
            }
            int i = context.getApplicationInfo().targetSdkVersion;
            this.e.getClass();
            if (!context.getResources().getBoolean(2131034112)) {
                ((jvb) this.e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((jvb) this.e).getClass();
            }
            this.e.getClass();
            ((jvb) this.e).a.setCollapsible(false);
            this.c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, k09.a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
                if (actionBarOverlayLayout2.n) {
                    this.t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    dq9.m("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                    return;
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = kfc.a;
                cfc.h(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        dq9.m(azc.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void c(boolean z) {
        int i;
        if (!this.h) {
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            jvb jvbVar = (jvb) this.e;
            int i2 = jvbVar.b;
            this.h = true;
            jvbVar.a((i & 4) | (i2 & (-5)));
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
        pl plVar = null;
        et8 et8Var = this.w;
        View view = this.g;
        if (z2) {
            if (!z4) {
                this.r = true;
                chc chcVar = this.s;
                if (chcVar != null) {
                    chcVar.a();
                }
                this.d.setVisibility(0);
                int i = this.n;
                yyc yycVar = this.v;
                if (i == 0 && z) {
                    this.d.setTranslationY(0.0f);
                    float f = -this.d.getHeight();
                    if (z) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f -= iArr2[1];
                    }
                    this.d.setTranslationY(f);
                    chc chcVar2 = new chc();
                    ArrayList arrayList = (ArrayList) chcVar2.c;
                    ahc a = kfc.a(this.d);
                    a.e(0.0f);
                    View view2 = (View) a.a.get();
                    if (view2 != null) {
                        if (et8Var != null) {
                            plVar = new pl(et8Var, view2, (byte) 29);
                        }
                        view2.animate().setUpdateListener(plVar);
                    }
                    if (!chcVar2.b) {
                        arrayList.add(a);
                    }
                    if (this.o && view != null) {
                        view.setTranslationY(f);
                        ahc a2 = kfc.a(view);
                        a2.e(0.0f);
                        if (!chcVar2.b) {
                            arrayList.add(a2);
                        }
                    }
                    boolean z5 = chcVar2.b;
                    if (!z5) {
                        chcVar2.d = y;
                    }
                    if (!z5) {
                        chcVar2.a = 250L;
                    }
                    if (!z5) {
                        chcVar2.e = yycVar;
                    }
                    this.s = chcVar2;
                    chcVar2.b();
                } else {
                    this.d.setAlpha(1.0f);
                    this.d.setTranslationY(0.0f);
                    if (this.o && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    yycVar.c();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = kfc.a;
                    afc.c(actionBarOverlayLayout);
                }
            }
        } else if (z4) {
            this.r = false;
            chc chcVar3 = this.s;
            if (chcVar3 != null) {
                chcVar3.a();
            }
            int i2 = this.n;
            yyc yycVar2 = this.u;
            if (i2 == 0 && z) {
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                chc chcVar4 = new chc();
                ArrayList arrayList2 = (ArrayList) chcVar4.c;
                float f2 = -this.d.getHeight();
                if (z) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr[1];
                }
                ahc a3 = kfc.a(this.d);
                a3.e(f2);
                View view3 = (View) a3.a.get();
                if (view3 != null) {
                    if (et8Var != null) {
                        plVar = new pl(et8Var, view3, (byte) 29);
                    }
                    view3.animate().setUpdateListener(plVar);
                }
                if (!chcVar4.b) {
                    arrayList2.add(a3);
                }
                if (this.o && view != null) {
                    ahc a4 = kfc.a(view);
                    a4.e(f2);
                    if (!chcVar4.b) {
                        arrayList2.add(a4);
                    }
                }
                boolean z6 = chcVar4.b;
                if (!z6) {
                    chcVar4.d = x;
                }
                if (!z6) {
                    chcVar4.a = 250L;
                }
                if (!z6) {
                    chcVar4.e = yycVar2;
                }
                this.s = chcVar4;
                chcVar4.b();
                return;
            }
            yycVar2.c();
        }
    }

    public azc(dq dqVar) {
        b(dqVar.getWindow().getDecorView());
    }
}
