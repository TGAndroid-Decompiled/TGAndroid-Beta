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
import m.m3;
import r0.i0;
import r0.l0;
import v7.g7;
public final class a0 extends g7 implements m.b {
    public static final AccelerateInterpolator f10074x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f10075y = new DecelerateInterpolator();
    public Context f10076a;
    public Context f10077b;
    public ActionBarOverlayLayout f10078c;
    public ActionBarContainer d;
    public k1 f10079e;
    public ActionBarContextView f10080f;
    public final View f10081g;
    public boolean h;
    public z f10082i;
    public z f10083j;
    public n4.x f10084k;
    public boolean f10085l;
    public final ArrayList f10086m;
    public int f10087n;
    public boolean f10088o;
    public boolean f10089p;
    public boolean f10090q;
    public boolean f10091r;
    public bc.d f10092s;
    public boolean f10093t;
    public final y f10094u;
    public final y v;
    public final a4.l f10095w;

    public a0(Activity activity, boolean z10) {
        new ArrayList();
        this.f10086m = new ArrayList();
        this.f10087n = 0;
        this.f10088o = true;
        this.f10091r = true;
        this.f10094u = new y(this, 0);
        this.v = new y(this, 1);
        this.f10095w = new a4.l(this, 17);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.f10081g = decorView.findViewById(16908290);
    }

    public final void a(boolean z10) {
        l0 i10;
        l0 l0Var;
        long j3;
        if (z10) {
            if (!this.f10090q) {
                this.f10090q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f10078c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f10090q) {
            this.f10090q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f10078c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = i0.f46890a;
        if (actionBarContainer.isLaidOut()) {
            if (z10) {
                m3 m3Var = (m3) this.f10079e;
                i10 = i0.a(m3Var.f15796a);
                i10.a(0.0f);
                i10.c(100L);
                i10.d(new k.i(m3Var, 4));
                l0Var = this.f10080f.i(0, 200L);
            } else {
                m3 m3Var2 = (m3) this.f10079e;
                l0 a2 = i0.a(m3Var2.f15796a);
                a2.a(1.0f);
                a2.c(200L);
                a2.d(new k.i(m3Var2, 0));
                i10 = this.f10080f.i(8, 100L);
                l0Var = a2;
            }
            bc.d dVar = new bc.d();
            ArrayList arrayList = (ArrayList) dVar.f3851c;
            arrayList.add(i10);
            View view = (View) i10.f46902a.get();
            if (view != null) {
                j3 = view.animate().getDuration();
            } else {
                j3 = 0;
            }
            View view2 = (View) l0Var.f46902a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j3);
            }
            arrayList.add(l0Var);
            dVar.b();
        } else if (z10) {
            ((m3) this.f10079e).f15796a.setVisibility(4);
            this.f10080f.setVisibility(0);
        } else {
            ((m3) this.f10079e).f15796a.setVisibility(0);
            this.f10080f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        k1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296411);
        this.f10078c = actionBarOverlayLayout;
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
        this.f10079e = wrapper;
        this.f10080f = (ActionBarContextView) view.findViewById(2131296311);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296305);
        this.d = actionBarContainer;
        k1 k1Var = this.f10079e;
        if (k1Var != null && this.f10080f != null && actionBarContainer != null) {
            Context context = ((m3) k1Var).f15796a.getContext();
            this.f10076a = context;
            if ((((m3) this.f10079e).f15797b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.h = true;
            }
            int i10 = context.getApplicationInfo().targetSdkVersion;
            this.f10079e.getClass();
            if (!context.getResources().getBoolean(2131034112)) {
                ((m3) this.f10079e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((m3) this.f10079e).getClass();
            }
            this.f10079e.getClass();
            ((m3) this.f10079e).f15796a.setCollapsible(false);
            this.f10078c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f10076a.obtainStyledAttributes(null, f.a.f9525a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f10078c;
                if (actionBarOverlayLayout2.f2233n) {
                    this.f10093t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = i0.f46890a;
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
            m3 m3Var = (m3) this.f10079e;
            int i11 = m3Var.f15797b;
            this.h = true;
            m3Var.a((i10 & 4) | (i11 & (-5)));
        }
    }

    public final void d(boolean z10) {
        int[] iArr;
        int[] iArr2;
        boolean z11 = this.f10089p;
        boolean z12 = this.f10090q;
        ai.x xVar = null;
        a4.l lVar = this.f10095w;
        View view = this.f10081g;
        if (!z12 && z11) {
            if (this.f10091r) {
                this.f10091r = false;
                bc.d dVar = this.f10092s;
                if (dVar != null) {
                    dVar.a();
                }
                int i10 = this.f10087n;
                y yVar = this.f10094u;
                if (i10 == 0 && z10) {
                    this.d.setAlpha(1.0f);
                    this.d.setTransitioning(true);
                    bc.d dVar2 = new bc.d();
                    ArrayList arrayList = (ArrayList) dVar2.f3851c;
                    float f7 = -this.d.getHeight();
                    if (z10) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f7 -= iArr2[1];
                    }
                    l0 a2 = i0.a(this.d);
                    a2.e(f7);
                    View view2 = (View) a2.f46902a.get();
                    if (view2 != null) {
                        if (lVar != null) {
                            xVar = new ai.x(27, lVar, view2);
                        }
                        view2.animate().setUpdateListener(xVar);
                    }
                    if (!dVar2.f3850b) {
                        arrayList.add(a2);
                    }
                    if (this.f10088o && view != null) {
                        l0 a10 = i0.a(view);
                        a10.e(f7);
                        if (!dVar2.f3850b) {
                            arrayList.add(a10);
                        }
                    }
                    boolean z13 = dVar2.f3850b;
                    if (!z13) {
                        dVar2.d = f10074x;
                    }
                    if (!z13) {
                        dVar2.f3849a = 250L;
                    }
                    if (!z13) {
                        dVar2.f3852e = yVar;
                    }
                    this.f10092s = dVar2;
                    dVar2.b();
                    return;
                }
                yVar.c();
            }
        } else if (!this.f10091r) {
            this.f10091r = true;
            bc.d dVar3 = this.f10092s;
            if (dVar3 != null) {
                dVar3.a();
            }
            this.d.setVisibility(0);
            int i11 = this.f10087n;
            y yVar2 = this.v;
            if (i11 == 0 && z10) {
                this.d.setTranslationY(0.0f);
                float f10 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f10 -= iArr[1];
                }
                this.d.setTranslationY(f10);
                bc.d dVar4 = new bc.d();
                ArrayList arrayList2 = (ArrayList) dVar4.f3851c;
                l0 a11 = i0.a(this.d);
                a11.e(0.0f);
                View view3 = (View) a11.f46902a.get();
                if (view3 != null) {
                    if (lVar != null) {
                        xVar = new ai.x(27, lVar, view3);
                    }
                    view3.animate().setUpdateListener(xVar);
                }
                if (!dVar4.f3850b) {
                    arrayList2.add(a11);
                }
                if (this.f10088o && view != null) {
                    view.setTranslationY(f10);
                    l0 a12 = i0.a(view);
                    a12.e(0.0f);
                    if (!dVar4.f3850b) {
                        arrayList2.add(a12);
                    }
                }
                boolean z14 = dVar4.f3850b;
                if (!z14) {
                    dVar4.d = f10075y;
                }
                if (!z14) {
                    dVar4.f3849a = 250L;
                }
                if (!z14) {
                    dVar4.f3852e = yVar2;
                }
                this.f10092s = dVar4;
                dVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f10088o && view != null) {
                    view.setTranslationY(0.0f);
                }
                yVar2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f10078c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = i0.f46890a;
                r0.y.c(actionBarOverlayLayout);
            }
        }
    }

    public a0(t tVar) {
        new ArrayList();
        this.f10086m = new ArrayList();
        this.f10087n = 0;
        this.f10088o = true;
        this.f10091r = true;
        this.f10094u = new y(this, 0);
        this.v = new y(this, 1);
        this.f10095w = new a4.l(this, 17);
        b(tVar.getWindow().getDecorView());
    }
}
