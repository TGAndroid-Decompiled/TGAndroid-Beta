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
import m.l3;
import org.telegram.ui.Components.voip.r0;
import r0.i0;
import r0.l0;
import v7.j7;
public final class b0 extends j7 implements m.b {
    public static final AccelerateInterpolator f10004x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f10005y = new DecelerateInterpolator();
    public Context f10006a;
    public Context f10007b;
    public ActionBarOverlayLayout f10008c;
    public ActionBarContainer d;
    public k1 f10009e;
    public ActionBarContextView f10010f;
    public final View f10011g;
    public boolean h;
    public a0 f10012i;
    public a0 f10013j;
    public n4.y f10014k;
    public boolean f10015l;
    public final ArrayList f10016m;
    public int f10017n;
    public boolean f10018o;
    public boolean f10019p;
    public boolean f10020q;
    public boolean f10021r;
    public bc.d f10022s;
    public boolean f10023t;
    public final z f10024u;
    public final z v;
    public final a4.m f10025w;

    public b0(Activity activity, boolean z10) {
        new ArrayList();
        this.f10016m = new ArrayList();
        this.f10017n = 0;
        this.f10018o = true;
        this.f10021r = true;
        this.f10024u = new z(this, 0);
        this.v = new z(this, 1);
        this.f10025w = new a4.m(this, 16);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.f10011g = decorView.findViewById(16908290);
    }

    public final void a(boolean z10) {
        l0 i10;
        l0 l0Var;
        long j3;
        if (z10) {
            if (!this.f10020q) {
                this.f10020q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f10008c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f10020q) {
            this.f10020q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f10008c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = i0.f45595a;
        if (actionBarContainer.isLaidOut()) {
            if (z10) {
                l3 l3Var = (l3) this.f10009e;
                i10 = i0.a(l3Var.f15784a);
                i10.a(0.0f);
                i10.c(100L);
                i10.d(new k.i(l3Var, 4));
                l0Var = this.f10010f.i(0, 200L);
            } else {
                l3 l3Var2 = (l3) this.f10009e;
                l0 a2 = i0.a(l3Var2.f15784a);
                a2.a(1.0f);
                a2.c(200L);
                a2.d(new k.i(l3Var2, 0));
                i10 = this.f10010f.i(8, 100L);
                l0Var = a2;
            }
            bc.d dVar = new bc.d();
            ArrayList arrayList = (ArrayList) dVar.f3772c;
            arrayList.add(i10);
            View view = (View) i10.f45607a.get();
            if (view != null) {
                j3 = view.animate().getDuration();
            } else {
                j3 = 0;
            }
            View view2 = (View) l0Var.f45607a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j3);
            }
            arrayList.add(l0Var);
            dVar.b();
        } else if (z10) {
            ((l3) this.f10009e).f15784a.setVisibility(4);
            this.f10010f.setVisibility(0);
        } else {
            ((l3) this.f10009e).f15784a.setVisibility(0);
            this.f10010f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        k1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296411);
        this.f10008c = actionBarOverlayLayout;
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
        this.f10009e = wrapper;
        this.f10010f = (ActionBarContextView) view.findViewById(2131296311);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296305);
        this.d = actionBarContainer;
        k1 k1Var = this.f10009e;
        if (k1Var != null && this.f10010f != null && actionBarContainer != null) {
            Context context = ((l3) k1Var).f15784a.getContext();
            this.f10006a = context;
            if ((((l3) this.f10009e).f15785b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.h = true;
            }
            int i10 = context.getApplicationInfo().targetSdkVersion;
            this.f10009e.getClass();
            if (!context.getResources().getBoolean(2131034112)) {
                ((l3) this.f10009e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((l3) this.f10009e).getClass();
            }
            this.f10009e.getClass();
            ((l3) this.f10009e).f15784a.setCollapsible(false);
            this.f10008c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f10006a.obtainStyledAttributes(null, f.a.f9514a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f10008c;
                if (actionBarOverlayLayout2.f2154n) {
                    this.f10023t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = i0.f45595a;
                r0.a0.i(actionBarContainer2, dimensionPixelSize);
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
            l3 l3Var = (l3) this.f10009e;
            int i11 = l3Var.f15785b;
            this.h = true;
            l3Var.a((i10 & 4) | (i11 & (-5)));
        }
    }

    public final void d(boolean z10) {
        int[] iArr;
        int[] iArr2;
        boolean z11 = this.f10019p;
        boolean z12 = this.f10020q;
        r0 r0Var = null;
        a4.m mVar = this.f10025w;
        View view = this.f10011g;
        if (!z12 && z11) {
            if (this.f10021r) {
                this.f10021r = false;
                bc.d dVar = this.f10022s;
                if (dVar != null) {
                    dVar.a();
                }
                int i10 = this.f10017n;
                z zVar = this.f10024u;
                if (i10 == 0 && z10) {
                    this.d.setAlpha(1.0f);
                    this.d.setTransitioning(true);
                    bc.d dVar2 = new bc.d();
                    ArrayList arrayList = (ArrayList) dVar2.f3772c;
                    float f7 = -this.d.getHeight();
                    if (z10) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f7 -= iArr2[1];
                    }
                    l0 a2 = i0.a(this.d);
                    a2.e(f7);
                    View view2 = (View) a2.f45607a.get();
                    if (view2 != null) {
                        if (mVar != null) {
                            r0Var = new r0(mVar, view2);
                        }
                        view2.animate().setUpdateListener(r0Var);
                    }
                    if (!dVar2.f3771b) {
                        arrayList.add(a2);
                    }
                    if (this.f10018o && view != null) {
                        l0 a10 = i0.a(view);
                        a10.e(f7);
                        if (!dVar2.f3771b) {
                            arrayList.add(a10);
                        }
                    }
                    boolean z13 = dVar2.f3771b;
                    if (!z13) {
                        dVar2.d = f10004x;
                    }
                    if (!z13) {
                        dVar2.f3770a = 250L;
                    }
                    if (!z13) {
                        dVar2.f3773e = zVar;
                    }
                    this.f10022s = dVar2;
                    dVar2.b();
                    return;
                }
                zVar.c();
            }
        } else if (!this.f10021r) {
            this.f10021r = true;
            bc.d dVar3 = this.f10022s;
            if (dVar3 != null) {
                dVar3.a();
            }
            this.d.setVisibility(0);
            int i11 = this.f10017n;
            z zVar2 = this.v;
            if (i11 == 0 && z10) {
                this.d.setTranslationY(0.0f);
                float f10 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f10 -= iArr[1];
                }
                this.d.setTranslationY(f10);
                bc.d dVar4 = new bc.d();
                ArrayList arrayList2 = (ArrayList) dVar4.f3772c;
                l0 a11 = i0.a(this.d);
                a11.e(0.0f);
                View view3 = (View) a11.f45607a.get();
                if (view3 != null) {
                    if (mVar != null) {
                        r0Var = new r0(mVar, view3);
                    }
                    view3.animate().setUpdateListener(r0Var);
                }
                if (!dVar4.f3771b) {
                    arrayList2.add(a11);
                }
                if (this.f10018o && view != null) {
                    view.setTranslationY(f10);
                    l0 a12 = i0.a(view);
                    a12.e(0.0f);
                    if (!dVar4.f3771b) {
                        arrayList2.add(a12);
                    }
                }
                boolean z14 = dVar4.f3771b;
                if (!z14) {
                    dVar4.d = f10005y;
                }
                if (!z14) {
                    dVar4.f3770a = 250L;
                }
                if (!z14) {
                    dVar4.f3773e = zVar2;
                }
                this.f10022s = dVar4;
                dVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f10018o && view != null) {
                    view.setTranslationY(0.0f);
                }
                zVar2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f10008c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = i0.f45595a;
                r0.y.c(actionBarOverlayLayout);
            }
        }
    }

    public b0(u uVar) {
        new ArrayList();
        this.f10016m = new ArrayList();
        this.f10017n = 0;
        this.f10018o = true;
        this.f10021r = true;
        this.f10024u = new z(this, 0);
        this.v = new z(this, 1);
        this.f10025w = new a4.m(this, 16);
        b(uVar.getWindow().getDecorView());
    }
}
