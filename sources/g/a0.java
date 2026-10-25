package g;

import a8.fc;
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
import bh.b0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.k1;
import m.n3;
import r0.i0;
import r0.l0;
public final class a0 extends fc implements m.b {
    public static final AccelerateInterpolator f12084x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f12085y = new DecelerateInterpolator();
    public Context f12086a;
    public Context f12087b;
    public ActionBarOverlayLayout f12088c;
    public ActionBarContainer d;
    public k1 e;
    public ActionBarContextView f12089f;
    public final View f12090g;
    public boolean h;
    public z f12091i;
    public z f12092j;
    public n4.s f12093k;
    public boolean f12094l;
    public final ArrayList f12095m;
    public int f12096n;
    public boolean f12097o;
    public boolean f12098p;
    public boolean f12099q;
    public boolean f12100r;
    public dc.d f12101s;
    public boolean f12102t;
    public final y f12103u;
    public final y v;
    public final a4.l f12104w;

    public a0(Activity activity, boolean z10) {
        new ArrayList();
        this.f12095m = new ArrayList();
        this.f12096n = 0;
        this.f12097o = true;
        this.f12100r = true;
        this.f12103u = new y(this, 0);
        this.v = new y(this, 1);
        this.f12104w = new a4.l(this, 21);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.f12090g = decorView.findViewById(16908290);
    }

    public final void a(boolean z10) {
        l0 i10;
        l0 l0Var;
        long j10;
        if (z10) {
            if (!this.f12099q) {
                this.f12099q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f12088c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f12099q) {
            this.f12099q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12088c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = i0.f47105a;
        if (actionBarContainer.isLaidOut()) {
            if (z10) {
                n3 n3Var = (n3) this.e;
                i10 = i0.a(n3Var.f17785a);
                i10.a(0.0f);
                i10.c(100L);
                i10.d(new k.i(n3Var, 4));
                l0Var = this.f12089f.i(0, 200L);
            } else {
                n3 n3Var2 = (n3) this.e;
                l0 a2 = i0.a(n3Var2.f17785a);
                a2.a(1.0f);
                a2.c(200L);
                a2.d(new k.i(n3Var2, 0));
                i10 = this.f12089f.i(8, 100L);
                l0Var = a2;
            }
            dc.d dVar = new dc.d();
            ArrayList arrayList = (ArrayList) dVar.f8317c;
            arrayList.add(i10);
            View view = (View) i10.f47116a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = (View) l0Var.f47116a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            arrayList.add(l0Var);
            dVar.b();
        } else if (z10) {
            ((n3) this.e).f17785a.setVisibility(4);
            this.f12089f.setVisibility(0);
        } else {
            ((n3) this.e).f17785a.setVisibility(0);
            this.f12089f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        k1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296411);
        this.f12088c = actionBarOverlayLayout;
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
        this.f12089f = (ActionBarContextView) view.findViewById(2131296311);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296305);
        this.d = actionBarContainer;
        k1 k1Var = this.e;
        if (k1Var != null && this.f12089f != null && actionBarContainer != null) {
            Context context = ((n3) k1Var).f17785a.getContext();
            this.f12086a = context;
            if ((((n3) this.e).f17786b & 4) != 0) {
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
            ((n3) this.e).f17785a.setCollapsible(false);
            this.f12088c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f12086a.obtainStyledAttributes(null, f.a.f10025a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12088c;
                if (actionBarOverlayLayout2.f2202n) {
                    this.f12102t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = i0.f47105a;
                r0.a0.h(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(a0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
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
            int i11 = n3Var.f17786b;
            this.h = true;
            n3Var.a((i10 & 4) | (i11 & (-5)));
        }
    }

    public final void d(boolean z10) {
        int[] iArr;
        int[] iArr2;
        boolean z11 = this.f12098p;
        boolean z12 = this.f12099q;
        b0 b0Var = null;
        a4.l lVar = this.f12104w;
        View view = this.f12090g;
        if (!z12 && z11) {
            if (this.f12100r) {
                this.f12100r = false;
                dc.d dVar = this.f12101s;
                if (dVar != null) {
                    dVar.a();
                }
                int i10 = this.f12096n;
                y yVar = this.f12103u;
                if (i10 == 0 && z10) {
                    this.d.setAlpha(1.0f);
                    this.d.setTransitioning(true);
                    dc.d dVar2 = new dc.d();
                    ArrayList arrayList = (ArrayList) dVar2.f8317c;
                    float f7 = -this.d.getHeight();
                    if (z10) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f7 -= iArr2[1];
                    }
                    l0 a2 = i0.a(this.d);
                    a2.e(f7);
                    View view2 = (View) a2.f47116a.get();
                    if (view2 != null) {
                        if (lVar != null) {
                            b0Var = new b0(27, lVar, view2);
                        }
                        view2.animate().setUpdateListener(b0Var);
                    }
                    if (!dVar2.f8316b) {
                        arrayList.add(a2);
                    }
                    if (this.f12097o && view != null) {
                        l0 a10 = i0.a(view);
                        a10.e(f7);
                        if (!dVar2.f8316b) {
                            arrayList.add(a10);
                        }
                    }
                    boolean z13 = dVar2.f8316b;
                    if (!z13) {
                        dVar2.d = f12084x;
                    }
                    if (!z13) {
                        dVar2.f8315a = 250L;
                    }
                    if (!z13) {
                        dVar2.e = yVar;
                    }
                    this.f12101s = dVar2;
                    dVar2.b();
                    return;
                }
                yVar.c();
            }
        } else if (!this.f12100r) {
            this.f12100r = true;
            dc.d dVar3 = this.f12101s;
            if (dVar3 != null) {
                dVar3.a();
            }
            this.d.setVisibility(0);
            int i11 = this.f12096n;
            y yVar2 = this.v;
            if (i11 == 0 && z10) {
                this.d.setTranslationY(0.0f);
                float f10 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f10 -= iArr[1];
                }
                this.d.setTranslationY(f10);
                dc.d dVar4 = new dc.d();
                ArrayList arrayList2 = (ArrayList) dVar4.f8317c;
                l0 a11 = i0.a(this.d);
                a11.e(0.0f);
                View view3 = (View) a11.f47116a.get();
                if (view3 != null) {
                    if (lVar != null) {
                        b0Var = new b0(27, lVar, view3);
                    }
                    view3.animate().setUpdateListener(b0Var);
                }
                if (!dVar4.f8316b) {
                    arrayList2.add(a11);
                }
                if (this.f12097o && view != null) {
                    view.setTranslationY(f10);
                    l0 a12 = i0.a(view);
                    a12.e(0.0f);
                    if (!dVar4.f8316b) {
                        arrayList2.add(a12);
                    }
                }
                boolean z14 = dVar4.f8316b;
                if (!z14) {
                    dVar4.d = f12085y;
                }
                if (!z14) {
                    dVar4.f8315a = 250L;
                }
                if (!z14) {
                    dVar4.e = yVar2;
                }
                this.f12101s = dVar4;
                dVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f12097o && view != null) {
                    view.setTranslationY(0.0f);
                }
                yVar2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f12088c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = i0.f47105a;
                r0.y.c(actionBarOverlayLayout);
            }
        }
    }

    public a0(t tVar) {
        new ArrayList();
        this.f12095m = new ArrayList();
        this.f12096n = 0;
        this.f12097o = true;
        this.f12100r = true;
        this.f12103u = new y(this, 0);
        this.v = new y(this, 1);
        this.f12104w = new a4.l(this, 21);
        b(tVar.getWindow().getDecorView());
    }
}
