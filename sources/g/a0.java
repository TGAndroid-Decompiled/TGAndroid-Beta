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
import m.m1;
import m.p3;
import r0.i0;
import r0.l0;
import v7.i7;
public final class a0 extends i7 implements m.b {
    public static final AccelerateInterpolator f9712x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f9713y = new DecelerateInterpolator();
    public Context f9714a;
    public Context f9715b;
    public ActionBarOverlayLayout f9716c;
    public ActionBarContainer d;
    public m1 e;
    public ActionBarContextView f9717f;
    public final View f9718g;
    public boolean h;
    public z f9719i;
    public z f9720j;
    public n4.s f9721k;
    public boolean f9722l;
    public final ArrayList f9723m;
    public int f9724n;
    public boolean f9725o;
    public boolean f9726p;
    public boolean f9727q;
    public boolean f9728r;
    public cc.d f9729s;
    public boolean f9730t;
    public final y f9731u;
    public final y v;
    public final a4.l f9732w;

    public a0(Activity activity, boolean z10) {
        new ArrayList();
        this.f9723m = new ArrayList();
        this.f9724n = 0;
        this.f9725o = true;
        this.f9728r = true;
        this.f9731u = new y(this, 0);
        this.v = new y(this, 1);
        this.f9732w = new a4.l(this, 22);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.f9718g = decorView.findViewById(16908290);
    }

    public final void a(boolean z10) {
        l0 i10;
        l0 l0Var;
        long j10;
        if (z10) {
            if (!this.f9727q) {
                this.f9727q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f9716c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f9727q) {
            this.f9727q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f9716c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = i0.f43485a;
        if (actionBarContainer.isLaidOut()) {
            if (z10) {
                p3 p3Var = (p3) this.e;
                i10 = i0.a(p3Var.f14924a);
                i10.a(0.0f);
                i10.c(100L);
                i10.d(new k.i(p3Var, 4));
                l0Var = this.f9717f.i(0, 200L);
            } else {
                p3 p3Var2 = (p3) this.e;
                l0 a2 = i0.a(p3Var2.f14924a);
                a2.a(1.0f);
                a2.c(200L);
                a2.d(new k.i(p3Var2, 0));
                i10 = this.f9717f.i(8, 100L);
                l0Var = a2;
            }
            cc.d dVar = new cc.d();
            ArrayList arrayList = (ArrayList) dVar.f4721c;
            arrayList.add(i10);
            View view = (View) i10.f43495a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = (View) l0Var.f43495a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            arrayList.add(l0Var);
            dVar.b();
        } else if (z10) {
            ((p3) this.e).f14924a.setVisibility(4);
            this.f9717f.setVisibility(0);
        } else {
            ((p3) this.e).f14924a.setVisibility(0);
            this.f9717f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        m1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296411);
        this.f9716c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(2131296303);
        if (findViewById instanceof m1) {
            wrapper = (m1) findViewById;
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
        this.f9717f = (ActionBarContextView) view.findViewById(2131296311);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296305);
        this.d = actionBarContainer;
        m1 m1Var = this.e;
        if (m1Var != null && this.f9717f != null && actionBarContainer != null) {
            Context context = ((p3) m1Var).f14924a.getContext();
            this.f9714a = context;
            if ((((p3) this.e).f14925b & 4) != 0) {
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
                ((p3) this.e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((p3) this.e).getClass();
            }
            this.e.getClass();
            ((p3) this.e).f14924a.setCollapsible(false);
            this.f9716c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f9714a.obtainStyledAttributes(null, f.a.f8805a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f9716c;
                if (actionBarOverlayLayout2.f1134n) {
                    this.f9730t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = i0.f43485a;
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
            p3 p3Var = (p3) this.e;
            int i11 = p3Var.f14925b;
            this.h = true;
            p3Var.a((i10 & 4) | (i11 & (-5)));
        }
    }

    public final void d(boolean z10) {
        int[] iArr;
        int[] iArr2;
        boolean z11 = this.f9726p;
        boolean z12 = this.f9727q;
        ah.l0 l0Var = null;
        a4.l lVar = this.f9732w;
        View view = this.f9718g;
        if (!z12 && z11) {
            if (this.f9728r) {
                this.f9728r = false;
                cc.d dVar = this.f9729s;
                if (dVar != null) {
                    dVar.a();
                }
                int i10 = this.f9724n;
                y yVar = this.f9731u;
                if (i10 == 0 && z10) {
                    this.d.setAlpha(1.0f);
                    this.d.setTransitioning(true);
                    cc.d dVar2 = new cc.d();
                    ArrayList arrayList = (ArrayList) dVar2.f4721c;
                    float f7 = -this.d.getHeight();
                    if (z10) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f7 -= iArr2[1];
                    }
                    l0 a2 = i0.a(this.d);
                    a2.e(f7);
                    View view2 = (View) a2.f43495a.get();
                    if (view2 != null) {
                        if (lVar != null) {
                            l0Var = new ah.l0(27, lVar, view2);
                        }
                        view2.animate().setUpdateListener(l0Var);
                    }
                    if (!dVar2.f4720b) {
                        arrayList.add(a2);
                    }
                    if (this.f9725o && view != null) {
                        l0 a10 = i0.a(view);
                        a10.e(f7);
                        if (!dVar2.f4720b) {
                            arrayList.add(a10);
                        }
                    }
                    boolean z13 = dVar2.f4720b;
                    if (!z13) {
                        dVar2.d = f9712x;
                    }
                    if (!z13) {
                        dVar2.f4719a = 250L;
                    }
                    if (!z13) {
                        dVar2.e = yVar;
                    }
                    this.f9729s = dVar2;
                    dVar2.b();
                    return;
                }
                yVar.c();
            }
        } else if (!this.f9728r) {
            this.f9728r = true;
            cc.d dVar3 = this.f9729s;
            if (dVar3 != null) {
                dVar3.a();
            }
            this.d.setVisibility(0);
            int i11 = this.f9724n;
            y yVar2 = this.v;
            if (i11 == 0 && z10) {
                this.d.setTranslationY(0.0f);
                float f10 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f10 -= iArr[1];
                }
                this.d.setTranslationY(f10);
                cc.d dVar4 = new cc.d();
                ArrayList arrayList2 = (ArrayList) dVar4.f4721c;
                l0 a11 = i0.a(this.d);
                a11.e(0.0f);
                View view3 = (View) a11.f43495a.get();
                if (view3 != null) {
                    if (lVar != null) {
                        l0Var = new ah.l0(27, lVar, view3);
                    }
                    view3.animate().setUpdateListener(l0Var);
                }
                if (!dVar4.f4720b) {
                    arrayList2.add(a11);
                }
                if (this.f9725o && view != null) {
                    view.setTranslationY(f10);
                    l0 a12 = i0.a(view);
                    a12.e(0.0f);
                    if (!dVar4.f4720b) {
                        arrayList2.add(a12);
                    }
                }
                boolean z14 = dVar4.f4720b;
                if (!z14) {
                    dVar4.d = f9713y;
                }
                if (!z14) {
                    dVar4.f4719a = 250L;
                }
                if (!z14) {
                    dVar4.e = yVar2;
                }
                this.f9729s = dVar4;
                dVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f9725o && view != null) {
                    view.setTranslationY(0.0f);
                }
                yVar2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f9716c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = i0.f43485a;
                r0.y.c(actionBarOverlayLayout);
            }
        }
    }

    public a0(t tVar) {
        new ArrayList();
        this.f9723m = new ArrayList();
        this.f9724n = 0;
        this.f9725o = true;
        this.f9728r = true;
        this.f9731u = new y(this, 0);
        this.v = new y(this, 1);
        this.f9732w = new a4.l(this, 22);
        b(tVar.getWindow().getDecorView());
    }
}
