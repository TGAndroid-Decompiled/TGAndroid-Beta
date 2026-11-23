package g;

import a8.fa;
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
public final class b0 extends fa implements m.b {
    public static final AccelerateInterpolator f12970x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f12971y = new DecelerateInterpolator();
    public Context f12972a;
    public Context f12973b;
    public ActionBarOverlayLayout f12974c;
    public ActionBarContainer d;
    public k1 f12975e;
    public ActionBarContextView f12976f;
    public final View f12977g;
    public boolean h;
    public a0 f12978i;
    public a0 f12979j;
    public q4.q f12980k;
    public boolean f12981l;
    public final ArrayList f12982m;
    public int f12983n;
    public boolean f12984o;
    public boolean f12985p;
    public boolean f12986q;
    public boolean f12987r;
    public ac.d f12988s;
    public boolean f12989t;
    public final z f12990u;
    public final z v;
    public final cb.c f12991w;

    public b0(Activity activity, boolean z10) {
        new ArrayList();
        this.f12982m = new ArrayList();
        this.f12983n = 0;
        this.f12984o = true;
        this.f12987r = true;
        this.f12990u = new z(this, 0);
        this.v = new z(this, 1);
        this.f12991w = new cb.c(this, 24);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.f12977g = decorView.findViewById(16908290);
    }

    public final void a(boolean z10) {
        l0 i7;
        l0 l0Var;
        long j3;
        if (z10) {
            if (!this.f12986q) {
                this.f12986q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f12974c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f12986q) {
            this.f12986q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12974c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = i0.f56289a;
        if (actionBarContainer.isLaidOut()) {
            if (z10) {
                k3 k3Var = (k3) this.f12975e;
                i7 = i0.a(k3Var.f20129a);
                i7.a(0.0f);
                i7.c(100L);
                i7.d(new k.i(k3Var, 4));
                l0Var = this.f12976f.i(0, 200L);
            } else {
                k3 k3Var2 = (k3) this.f12975e;
                l0 a10 = i0.a(k3Var2.f20129a);
                a10.a(1.0f);
                a10.c(200L);
                a10.d(new k.i(k3Var2, 0));
                i7 = this.f12976f.i(8, 100L);
                l0Var = a10;
            }
            ac.d dVar = new ac.d();
            ArrayList arrayList = (ArrayList) dVar.f1017c;
            arrayList.add(i7);
            View view = (View) i7.f56301a.get();
            if (view != null) {
                j3 = view.animate().getDuration();
            } else {
                j3 = 0;
            }
            View view2 = (View) l0Var.f56301a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j3);
            }
            arrayList.add(l0Var);
            dVar.b();
        } else if (z10) {
            ((k3) this.f12975e).f20129a.setVisibility(4);
            this.f12976f.setVisibility(0);
        } else {
            ((k3) this.f12975e).f20129a.setVisibility(0);
            this.f12976f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        k1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296413);
        this.f12974c = actionBarOverlayLayout;
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
        this.f12975e = wrapper;
        this.f12976f = (ActionBarContextView) view.findViewById(2131296313);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296307);
        this.d = actionBarContainer;
        k1 k1Var = this.f12975e;
        if (k1Var != null && this.f12976f != null && actionBarContainer != null) {
            Context context = ((k3) k1Var).f20129a.getContext();
            this.f12972a = context;
            if ((((k3) this.f12975e).f20130b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.h = true;
            }
            int i7 = context.getApplicationInfo().targetSdkVersion;
            this.f12975e.getClass();
            if (!context.getResources().getBoolean(2131034112)) {
                ((k3) this.f12975e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((k3) this.f12975e).getClass();
            }
            this.f12975e.getClass();
            ((k3) this.f12975e).f20129a.setCollapsible(false);
            this.f12974c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f12972a.obtainStyledAttributes(null, f.a.f11020a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12974c;
                if (actionBarOverlayLayout2.f1894n) {
                    this.f12989t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = i0.f56289a;
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
            k3 k3Var = (k3) this.f12975e;
            int i10 = k3Var.f20130b;
            this.h = true;
            k3Var.a((i7 & 4) | (i10 & (-5)));
        }
    }

    public final void d(boolean z10) {
        int[] iArr;
        int[] iArr2;
        boolean z11 = this.f12985p;
        boolean z12 = this.f12986q;
        ch.w wVar = null;
        cb.c cVar = this.f12991w;
        View view = this.f12977g;
        if (!z12 && z11) {
            if (this.f12987r) {
                this.f12987r = false;
                ac.d dVar = this.f12988s;
                if (dVar != null) {
                    dVar.a();
                }
                int i7 = this.f12983n;
                z zVar = this.f12990u;
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
                    View view2 = (View) a10.f56301a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            wVar = new ch.w(27, cVar, view2);
                        }
                        view2.animate().setUpdateListener(wVar);
                    }
                    if (!dVar2.f1016b) {
                        arrayList.add(a10);
                    }
                    if (this.f12984o && view != null) {
                        l0 a11 = i0.a(view);
                        a11.e(f10);
                        if (!dVar2.f1016b) {
                            arrayList.add(a11);
                        }
                    }
                    boolean z13 = dVar2.f1016b;
                    if (!z13) {
                        dVar2.d = f12970x;
                    }
                    if (!z13) {
                        dVar2.f1015a = 250L;
                    }
                    if (!z13) {
                        dVar2.f1018e = zVar;
                    }
                    this.f12988s = dVar2;
                    dVar2.b();
                    return;
                }
                zVar.c();
            }
        } else if (!this.f12987r) {
            this.f12987r = true;
            ac.d dVar3 = this.f12988s;
            if (dVar3 != null) {
                dVar3.a();
            }
            this.d.setVisibility(0);
            int i10 = this.f12983n;
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
                View view3 = (View) a12.f56301a.get();
                if (view3 != null) {
                    if (cVar != null) {
                        wVar = new ch.w(27, cVar, view3);
                    }
                    view3.animate().setUpdateListener(wVar);
                }
                if (!dVar4.f1016b) {
                    arrayList2.add(a12);
                }
                if (this.f12984o && view != null) {
                    view.setTranslationY(f11);
                    l0 a13 = i0.a(view);
                    a13.e(0.0f);
                    if (!dVar4.f1016b) {
                        arrayList2.add(a13);
                    }
                }
                boolean z14 = dVar4.f1016b;
                if (!z14) {
                    dVar4.d = f12971y;
                }
                if (!z14) {
                    dVar4.f1015a = 250L;
                }
                if (!z14) {
                    dVar4.f1018e = zVar2;
                }
                this.f12988s = dVar4;
                dVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f12984o && view != null) {
                    view.setTranslationY(0.0f);
                }
                zVar2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f12974c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = i0.f56289a;
                r0.y.c(actionBarOverlayLayout);
            }
        }
    }

    public b0(u uVar) {
        new ArrayList();
        this.f12982m = new ArrayList();
        this.f12983n = 0;
        this.f12984o = true;
        this.f12987r = true;
        this.f12990u = new z(this, 0);
        this.v = new z(this, 1);
        this.f12991w = new cb.c(this, 24);
        b(uVar.getWindow().getDecorView());
    }
}
