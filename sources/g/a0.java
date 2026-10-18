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
import m.l1;
import m.o3;
import r0.i0;
import r0.l0;
import v7.i7;
public final class a0 extends i7 implements m.c {
    public static final AccelerateInterpolator f10620x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f10621y = new DecelerateInterpolator();
    public Context f10622a;
    public Context f10623b;
    public ActionBarOverlayLayout f10624c;
    public ActionBarContainer d;
    public l1 e;
    public ActionBarContextView f10625f;
    public final View f10626g;
    public boolean h;
    public z f10627i;
    public z f10628j;
    public n4.s f10629k;
    public boolean f10630l;
    public final ArrayList f10631m;
    public int f10632n;
    public boolean f10633o;
    public boolean f10634p;
    public boolean f10635q;
    public boolean f10636r;
    public cc.d f10637s;
    public boolean f10638t;
    public final y f10639u;
    public final y v;
    public final ag.b f10640w;

    public a0(Activity activity, boolean z10) {
        new ArrayList();
        this.f10631m = new ArrayList();
        this.f10632n = 0;
        this.f10633o = true;
        this.f10636r = true;
        this.f10639u = new y(this, 0);
        this.v = new y(this, 1);
        this.f10640w = new ag.b(this, 18);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.f10626g = decorView.findViewById(16908290);
    }

    public final void a(boolean z10) {
        l0 i10;
        l0 l0Var;
        long j10;
        if (z10) {
            if (!this.f10635q) {
                this.f10635q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f10624c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f10635q) {
            this.f10635q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f10624c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = i0.f44864a;
        if (actionBarContainer.isLaidOut()) {
            if (z10) {
                o3 o3Var = (o3) this.e;
                i10 = i0.a(o3Var.f16276a);
                i10.a(0.0f);
                i10.c(100L);
                i10.d(new k.i(o3Var, 4));
                l0Var = this.f10625f.i(0, 200L);
            } else {
                o3 o3Var2 = (o3) this.e;
                l0 a2 = i0.a(o3Var2.f16276a);
                a2.a(1.0f);
                a2.c(200L);
                a2.d(new k.i(o3Var2, 0));
                i10 = this.f10625f.i(8, 100L);
                l0Var = a2;
            }
            cc.d dVar = new cc.d();
            ArrayList arrayList = (ArrayList) dVar.f5092c;
            arrayList.add(i10);
            View view = (View) i10.f44874a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = (View) l0Var.f44874a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            arrayList.add(l0Var);
            dVar.b();
        } else if (z10) {
            ((o3) this.e).f16276a.setVisibility(4);
            this.f10625f.setVisibility(0);
        } else {
            ((o3) this.e).f16276a.setVisibility(0);
            this.f10625f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        l1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296411);
        this.f10624c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(2131296303);
        if (findViewById instanceof l1) {
            wrapper = (l1) findViewById;
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
        this.f10625f = (ActionBarContextView) view.findViewById(2131296311);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296305);
        this.d = actionBarContainer;
        l1 l1Var = this.e;
        if (l1Var != null && this.f10625f != null && actionBarContainer != null) {
            Context context = ((o3) l1Var).f16276a.getContext();
            this.f10622a = context;
            if ((((o3) this.e).f16277b & 4) != 0) {
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
                ((o3) this.e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((o3) this.e).getClass();
            }
            this.e.getClass();
            ((o3) this.e).f16276a.setCollapsible(false);
            this.f10624c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f10622a.obtainStyledAttributes(null, f.a.f10252a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f10624c;
                if (actionBarOverlayLayout2.f2753n) {
                    this.f10638t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = i0.f44864a;
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
            o3 o3Var = (o3) this.e;
            int i11 = o3Var.f16277b;
            this.h = true;
            o3Var.a((i10 & 4) | (i11 & (-5)));
        }
    }

    public final void d(boolean z10) {
        int[] iArr;
        int[] iArr2;
        boolean z11 = this.f10634p;
        boolean z12 = this.f10635q;
        ah.l0 l0Var = null;
        ag.b bVar = this.f10640w;
        View view = this.f10626g;
        if (!z12 && z11) {
            if (this.f10636r) {
                this.f10636r = false;
                cc.d dVar = this.f10637s;
                if (dVar != null) {
                    dVar.a();
                }
                int i10 = this.f10632n;
                y yVar = this.f10639u;
                if (i10 == 0 && z10) {
                    this.d.setAlpha(1.0f);
                    this.d.setTransitioning(true);
                    cc.d dVar2 = new cc.d();
                    ArrayList arrayList = (ArrayList) dVar2.f5092c;
                    float f7 = -this.d.getHeight();
                    if (z10) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f7 -= iArr2[1];
                    }
                    l0 a2 = i0.a(this.d);
                    a2.e(f7);
                    View view2 = (View) a2.f44874a.get();
                    if (view2 != null) {
                        if (bVar != null) {
                            l0Var = new ah.l0(27, bVar, view2);
                        }
                        view2.animate().setUpdateListener(l0Var);
                    }
                    if (!dVar2.f5091b) {
                        arrayList.add(a2);
                    }
                    if (this.f10633o && view != null) {
                        l0 a10 = i0.a(view);
                        a10.e(f7);
                        if (!dVar2.f5091b) {
                            arrayList.add(a10);
                        }
                    }
                    boolean z13 = dVar2.f5091b;
                    if (!z13) {
                        dVar2.d = f10620x;
                    }
                    if (!z13) {
                        dVar2.f5090a = 250L;
                    }
                    if (!z13) {
                        dVar2.e = yVar;
                    }
                    this.f10637s = dVar2;
                    dVar2.b();
                    return;
                }
                yVar.c();
            }
        } else if (!this.f10636r) {
            this.f10636r = true;
            cc.d dVar3 = this.f10637s;
            if (dVar3 != null) {
                dVar3.a();
            }
            this.d.setVisibility(0);
            int i11 = this.f10632n;
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
                ArrayList arrayList2 = (ArrayList) dVar4.f5092c;
                l0 a11 = i0.a(this.d);
                a11.e(0.0f);
                View view3 = (View) a11.f44874a.get();
                if (view3 != null) {
                    if (bVar != null) {
                        l0Var = new ah.l0(27, bVar, view3);
                    }
                    view3.animate().setUpdateListener(l0Var);
                }
                if (!dVar4.f5091b) {
                    arrayList2.add(a11);
                }
                if (this.f10633o && view != null) {
                    view.setTranslationY(f10);
                    l0 a12 = i0.a(view);
                    a12.e(0.0f);
                    if (!dVar4.f5091b) {
                        arrayList2.add(a12);
                    }
                }
                boolean z14 = dVar4.f5091b;
                if (!z14) {
                    dVar4.d = f10621y;
                }
                if (!z14) {
                    dVar4.f5090a = 250L;
                }
                if (!z14) {
                    dVar4.e = yVar2;
                }
                this.f10637s = dVar4;
                dVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f10633o && view != null) {
                    view.setTranslationY(0.0f);
                }
                yVar2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f10624c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = i0.f44864a;
                r0.y.c(actionBarOverlayLayout);
            }
        }
    }

    public a0(t tVar) {
        new ArrayList();
        this.f10631m = new ArrayList();
        this.f10632n = 0;
        this.f10633o = true;
        this.f10636r = true;
        this.f10639u = new y(this, 0);
        this.v = new y(this, 1);
        this.f10640w = new ag.b(this, 18);
        b(tVar.getWindow().getDecorView());
    }
}
