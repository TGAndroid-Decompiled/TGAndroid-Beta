package g;

import ag.p2;
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
import m.l3;
import r0.h0;
import r0.k0;
import v7.j7;
public final class b0 extends j7 implements m.b {
    public static final AccelerateInterpolator f7148x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f7149y = new DecelerateInterpolator();
    public Context f7150a;
    public Context f7151b;
    public ActionBarOverlayLayout f7152c;
    public ActionBarContainer d;
    public k1 e;
    public ActionBarContextView f7153f;
    public final View f7154g;
    public boolean h;
    public a0 f7155i;
    public a0 f7156j;
    public n4.q f7157k;
    public boolean f7158l;
    public final ArrayList f7159m;
    public int f7160n;
    public boolean f7161o;
    public boolean f7162p;
    public boolean f7163q;
    public boolean f7164r;
    public k.j f7165s;
    public boolean f7166t;
    public final z f7167u;
    public final z v;
    public final a4.l f7168w;

    public b0(Activity activity, boolean z10) {
        new ArrayList();
        this.f7159m = new ArrayList();
        this.f7160n = 0;
        this.f7161o = true;
        this.f7164r = true;
        this.f7167u = new z(this, 0);
        this.v = new z(this, 1);
        this.f7168w = new a4.l(this, 17);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.f7154g = decorView.findViewById(16908290);
    }

    public final void a(boolean z10) {
        k0 i10;
        k0 k0Var;
        long j10;
        if (z10) {
            if (!this.f7163q) {
                this.f7163q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f7152c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f7163q) {
            this.f7163q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7152c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = h0.f46134a;
        if (actionBarContainer.isLaidOut()) {
            if (z10) {
                l3 l3Var = (l3) this.e;
                i10 = h0.a(l3Var.f12459a);
                i10.a(0.0f);
                i10.c(100L);
                i10.d(new k.i(l3Var, 4));
                k0Var = this.f7153f.i(0, 200L);
            } else {
                l3 l3Var2 = (l3) this.e;
                k0 a2 = h0.a(l3Var2.f12459a);
                a2.a(1.0f);
                a2.c(200L);
                a2.d(new k.i(l3Var2, 0));
                i10 = this.f7153f.i(8, 100L);
                k0Var = a2;
            }
            k.j jVar = new k.j();
            ArrayList arrayList = (ArrayList) jVar.f10517c;
            arrayList.add(i10);
            View view = (View) i10.f46144a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = (View) k0Var.f46144a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            arrayList.add(k0Var);
            jVar.b();
        } else if (z10) {
            ((l3) this.e).f12459a.setVisibility(4);
            this.f7153f.setVisibility(0);
        } else {
            ((l3) this.e).f12459a.setVisibility(0);
            this.f7153f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        k1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296411);
        this.f7152c = actionBarOverlayLayout;
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
        this.f7153f = (ActionBarContextView) view.findViewById(2131296311);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296305);
        this.d = actionBarContainer;
        k1 k1Var = this.e;
        if (k1Var != null && this.f7153f != null && actionBarContainer != null) {
            Context context = ((l3) k1Var).f12459a.getContext();
            this.f7150a = context;
            if ((((l3) this.e).f12460b & 4) != 0) {
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
                ((l3) this.e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((l3) this.e).getClass();
            }
            this.e.getClass();
            ((l3) this.e).f12459a.setCollapsible(false);
            this.f7152c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f7150a.obtainStyledAttributes(null, f.a.f6695a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7152c;
                if (actionBarOverlayLayout2.f1034n) {
                    this.f7166t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = h0.f46134a;
                r0.z.h(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(b0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void c(boolean z10) {
        int i10;
        if (!this.h) {
            if (z10) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            l3 l3Var = (l3) this.e;
            int i11 = l3Var.f12460b;
            this.h = true;
            l3Var.a((i10 & 4) | (i11 & (-5)));
        }
    }

    public final void d(boolean z10) {
        int[] iArr;
        int[] iArr2;
        boolean z11 = this.f7162p;
        boolean z12 = this.f7163q;
        p2 p2Var = null;
        a4.l lVar = this.f7168w;
        View view = this.f7154g;
        if (!z12 && z11) {
            if (this.f7164r) {
                this.f7164r = false;
                k.j jVar = this.f7165s;
                if (jVar != null) {
                    jVar.a();
                }
                int i10 = this.f7160n;
                z zVar = this.f7167u;
                if (i10 == 0 && z10) {
                    this.d.setAlpha(1.0f);
                    this.d.setTransitioning(true);
                    k.j jVar2 = new k.j();
                    ArrayList arrayList = (ArrayList) jVar2.f10517c;
                    float f7 = -this.d.getHeight();
                    if (z10) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f7 -= iArr2[1];
                    }
                    k0 a2 = h0.a(this.d);
                    a2.e(f7);
                    View view2 = (View) a2.f46144a.get();
                    if (view2 != null) {
                        if (lVar != null) {
                            p2Var = new p2(25, lVar, view2);
                        }
                        view2.animate().setUpdateListener(p2Var);
                    }
                    if (!jVar2.f10516b) {
                        arrayList.add(a2);
                    }
                    if (this.f7161o && view != null) {
                        k0 a10 = h0.a(view);
                        a10.e(f7);
                        if (!jVar2.f10516b) {
                            arrayList.add(a10);
                        }
                    }
                    boolean z13 = jVar2.f10516b;
                    if (!z13) {
                        jVar2.d = f7148x;
                    }
                    if (!z13) {
                        jVar2.f10515a = 250L;
                    }
                    if (!z13) {
                        jVar2.e = zVar;
                    }
                    this.f7165s = jVar2;
                    jVar2.b();
                    return;
                }
                zVar.c();
            }
        } else if (!this.f7164r) {
            this.f7164r = true;
            k.j jVar3 = this.f7165s;
            if (jVar3 != null) {
                jVar3.a();
            }
            this.d.setVisibility(0);
            int i11 = this.f7160n;
            z zVar2 = this.v;
            if (i11 == 0 && z10) {
                this.d.setTranslationY(0.0f);
                float f10 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f10 -= iArr[1];
                }
                this.d.setTranslationY(f10);
                k.j jVar4 = new k.j();
                ArrayList arrayList2 = (ArrayList) jVar4.f10517c;
                k0 a11 = h0.a(this.d);
                a11.e(0.0f);
                View view3 = (View) a11.f46144a.get();
                if (view3 != null) {
                    if (lVar != null) {
                        p2Var = new p2(25, lVar, view3);
                    }
                    view3.animate().setUpdateListener(p2Var);
                }
                if (!jVar4.f10516b) {
                    arrayList2.add(a11);
                }
                if (this.f7161o && view != null) {
                    view.setTranslationY(f10);
                    k0 a12 = h0.a(view);
                    a12.e(0.0f);
                    if (!jVar4.f10516b) {
                        arrayList2.add(a12);
                    }
                }
                boolean z14 = jVar4.f10516b;
                if (!z14) {
                    jVar4.d = f7149y;
                }
                if (!z14) {
                    jVar4.f10515a = 250L;
                }
                if (!z14) {
                    jVar4.e = zVar2;
                }
                this.f7165s = jVar4;
                jVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f7161o && view != null) {
                    view.setTranslationY(0.0f);
                }
                zVar2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f7152c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = h0.f46134a;
                r0.x.c(actionBarOverlayLayout);
            }
        }
    }

    public b0(t tVar) {
        new ArrayList();
        this.f7159m = new ArrayList();
        this.f7160n = 0;
        this.f7161o = true;
        this.f7164r = true;
        this.f7167u = new z(this, 0);
        this.v = new z(this, 1);
        this.f7168w = new a4.l(this, 17);
        b(tVar.getWindow().getDecorView());
    }
}
