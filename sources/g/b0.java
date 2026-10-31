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
    public static final AccelerateInterpolator f7147x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f7148y = new DecelerateInterpolator();
    public Context f7149a;
    public Context f7150b;
    public ActionBarOverlayLayout f7151c;
    public ActionBarContainer d;
    public k1 e;
    public ActionBarContextView f7152f;
    public final View f7153g;
    public boolean h;
    public a0 f7154i;
    public a0 f7155j;
    public n4.q f7156k;
    public boolean f7157l;
    public final ArrayList f7158m;
    public int f7159n;
    public boolean f7160o;
    public boolean f7161p;
    public boolean f7162q;
    public boolean f7163r;
    public k.j f7164s;
    public boolean f7165t;
    public final z f7166u;
    public final z v;
    public final a4.l f7167w;

    public b0(Activity activity, boolean z10) {
        new ArrayList();
        this.f7158m = new ArrayList();
        this.f7159n = 0;
        this.f7160o = true;
        this.f7163r = true;
        this.f7166u = new z(this, 0);
        this.v = new z(this, 1);
        this.f7167w = new a4.l(this, 17);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.f7153g = decorView.findViewById(16908290);
    }

    public final void a(boolean z10) {
        k0 i10;
        k0 k0Var;
        long j10;
        if (z10) {
            if (!this.f7162q) {
                this.f7162q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f7151c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f7162q) {
            this.f7162q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7151c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = h0.f46123a;
        if (actionBarContainer.isLaidOut()) {
            if (z10) {
                l3 l3Var = (l3) this.e;
                i10 = h0.a(l3Var.f12458a);
                i10.a(0.0f);
                i10.c(100L);
                i10.d(new k.i(l3Var, 4));
                k0Var = this.f7152f.i(0, 200L);
            } else {
                l3 l3Var2 = (l3) this.e;
                k0 a2 = h0.a(l3Var2.f12458a);
                a2.a(1.0f);
                a2.c(200L);
                a2.d(new k.i(l3Var2, 0));
                i10 = this.f7152f.i(8, 100L);
                k0Var = a2;
            }
            k.j jVar = new k.j();
            ArrayList arrayList = (ArrayList) jVar.f10516c;
            arrayList.add(i10);
            View view = (View) i10.f46133a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = (View) k0Var.f46133a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            arrayList.add(k0Var);
            jVar.b();
        } else if (z10) {
            ((l3) this.e).f12458a.setVisibility(4);
            this.f7152f.setVisibility(0);
        } else {
            ((l3) this.e).f12458a.setVisibility(0);
            this.f7152f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        k1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296411);
        this.f7151c = actionBarOverlayLayout;
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
        this.f7152f = (ActionBarContextView) view.findViewById(2131296311);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296305);
        this.d = actionBarContainer;
        k1 k1Var = this.e;
        if (k1Var != null && this.f7152f != null && actionBarContainer != null) {
            Context context = ((l3) k1Var).f12458a.getContext();
            this.f7149a = context;
            if ((((l3) this.e).f12459b & 4) != 0) {
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
            ((l3) this.e).f12458a.setCollapsible(false);
            this.f7151c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f7149a.obtainStyledAttributes(null, f.a.f6694a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7151c;
                if (actionBarOverlayLayout2.f1034n) {
                    this.f7165t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = h0.f46123a;
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
            int i11 = l3Var.f12459b;
            this.h = true;
            l3Var.a((i10 & 4) | (i11 & (-5)));
        }
    }

    public final void d(boolean z10) {
        int[] iArr;
        int[] iArr2;
        boolean z11 = this.f7161p;
        boolean z12 = this.f7162q;
        p2 p2Var = null;
        a4.l lVar = this.f7167w;
        View view = this.f7153g;
        if (!z12 && z11) {
            if (this.f7163r) {
                this.f7163r = false;
                k.j jVar = this.f7164s;
                if (jVar != null) {
                    jVar.a();
                }
                int i10 = this.f7159n;
                z zVar = this.f7166u;
                if (i10 == 0 && z10) {
                    this.d.setAlpha(1.0f);
                    this.d.setTransitioning(true);
                    k.j jVar2 = new k.j();
                    ArrayList arrayList = (ArrayList) jVar2.f10516c;
                    float f7 = -this.d.getHeight();
                    if (z10) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f7 -= iArr2[1];
                    }
                    k0 a2 = h0.a(this.d);
                    a2.e(f7);
                    View view2 = (View) a2.f46133a.get();
                    if (view2 != null) {
                        if (lVar != null) {
                            p2Var = new p2(25, lVar, view2);
                        }
                        view2.animate().setUpdateListener(p2Var);
                    }
                    if (!jVar2.f10515b) {
                        arrayList.add(a2);
                    }
                    if (this.f7160o && view != null) {
                        k0 a10 = h0.a(view);
                        a10.e(f7);
                        if (!jVar2.f10515b) {
                            arrayList.add(a10);
                        }
                    }
                    boolean z13 = jVar2.f10515b;
                    if (!z13) {
                        jVar2.d = f7147x;
                    }
                    if (!z13) {
                        jVar2.f10514a = 250L;
                    }
                    if (!z13) {
                        jVar2.e = zVar;
                    }
                    this.f7164s = jVar2;
                    jVar2.b();
                    return;
                }
                zVar.c();
            }
        } else if (!this.f7163r) {
            this.f7163r = true;
            k.j jVar3 = this.f7164s;
            if (jVar3 != null) {
                jVar3.a();
            }
            this.d.setVisibility(0);
            int i11 = this.f7159n;
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
                ArrayList arrayList2 = (ArrayList) jVar4.f10516c;
                k0 a11 = h0.a(this.d);
                a11.e(0.0f);
                View view3 = (View) a11.f46133a.get();
                if (view3 != null) {
                    if (lVar != null) {
                        p2Var = new p2(25, lVar, view3);
                    }
                    view3.animate().setUpdateListener(p2Var);
                }
                if (!jVar4.f10515b) {
                    arrayList2.add(a11);
                }
                if (this.f7160o && view != null) {
                    view.setTranslationY(f10);
                    k0 a12 = h0.a(view);
                    a12.e(0.0f);
                    if (!jVar4.f10515b) {
                        arrayList2.add(a12);
                    }
                }
                boolean z14 = jVar4.f10515b;
                if (!z14) {
                    jVar4.d = f7148y;
                }
                if (!z14) {
                    jVar4.f10514a = 250L;
                }
                if (!z14) {
                    jVar4.e = zVar2;
                }
                this.f7164s = jVar4;
                jVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f7160o && view != null) {
                    view.setTranslationY(0.0f);
                }
                zVar2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f7151c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = h0.f46123a;
                r0.x.c(actionBarOverlayLayout);
            }
        }
    }

    public b0(t tVar) {
        new ArrayList();
        this.f7158m = new ArrayList();
        this.f7159n = 0;
        this.f7160o = true;
        this.f7163r = true;
        this.f7166u = new z(this, 0);
        this.v = new z(this, 1);
        this.f7167w = new a4.l(this, 17);
        b(tVar.getWindow().getDecorView());
    }
}
