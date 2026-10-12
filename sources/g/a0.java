package g;

import ah.l0;
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
import r0.b0;
import r0.j0;
import r0.m0;
import v7.i7;
public final class a0 extends i7 implements m.b {
    public static final AccelerateInterpolator f9709x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f9710y = new DecelerateInterpolator();
    public Context f9711a;
    public Context f9712b;
    public ActionBarOverlayLayout f9713c;
    public ActionBarContainer d;
    public k1 e;
    public ActionBarContextView f9714f;
    public final View f9715g;
    public boolean h;
    public z f9716i;
    public z f9717j;
    public n4.s f9718k;
    public boolean f9719l;
    public final ArrayList f9720m;
    public int f9721n;
    public boolean f9722o;
    public boolean f9723p;
    public boolean f9724q;
    public boolean f9725r;
    public cc.d f9726s;
    public boolean f9727t;
    public final y f9728u;
    public final y v;
    public final k6.h f9729w;

    public a0(Activity activity, boolean z10) {
        new ArrayList();
        this.f9720m = new ArrayList();
        this.f9721n = 0;
        this.f9722o = true;
        this.f9725r = true;
        this.f9728u = new y(this, 0);
        this.v = new y(this, 1);
        this.f9729w = new k6.h(this, 23);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.f9715g = decorView.findViewById(16908290);
    }

    public final void a(boolean z10) {
        m0 i10;
        m0 m0Var;
        long j10;
        if (z10) {
            if (!this.f9724q) {
                this.f9724q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f9713c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f9724q) {
            this.f9724q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f9713c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = j0.f43732a;
        if (actionBarContainer.isLaidOut()) {
            if (z10) {
                m3 m3Var = (m3) this.e;
                i10 = j0.a(m3Var.f15164a);
                i10.a(0.0f);
                i10.c(100L);
                i10.d(new k.i(m3Var, 4));
                m0Var = this.f9714f.i(0, 200L);
            } else {
                m3 m3Var2 = (m3) this.e;
                m0 a2 = j0.a(m3Var2.f15164a);
                a2.a(1.0f);
                a2.c(200L);
                a2.d(new k.i(m3Var2, 0));
                i10 = this.f9714f.i(8, 100L);
                m0Var = a2;
            }
            cc.d dVar = new cc.d();
            ArrayList arrayList = (ArrayList) dVar.f4718c;
            arrayList.add(i10);
            View view = (View) i10.f43742a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = (View) m0Var.f43742a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            arrayList.add(m0Var);
            dVar.b();
        } else if (z10) {
            ((m3) this.e).f15164a.setVisibility(4);
            this.f9714f.setVisibility(0);
        } else {
            ((m3) this.e).f15164a.setVisibility(0);
            this.f9714f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        k1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296411);
        this.f9713c = actionBarOverlayLayout;
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
        this.f9714f = (ActionBarContextView) view.findViewById(2131296311);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296305);
        this.d = actionBarContainer;
        k1 k1Var = this.e;
        if (k1Var != null && this.f9714f != null && actionBarContainer != null) {
            Context context = ((m3) k1Var).f15164a.getContext();
            this.f9711a = context;
            if ((((m3) this.e).f15165b & 4) != 0) {
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
                ((m3) this.e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((m3) this.e).getClass();
            }
            this.e.getClass();
            ((m3) this.e).f15164a.setCollapsible(false);
            this.f9713c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f9711a.obtainStyledAttributes(null, f.a.f8802a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f9713c;
                if (actionBarOverlayLayout2.f1130n) {
                    this.f9727t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = j0.f43732a;
                b0.h(actionBarContainer2, dimensionPixelSize);
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
            m3 m3Var = (m3) this.e;
            int i11 = m3Var.f15165b;
            this.h = true;
            m3Var.a((i10 & 4) | (i11 & (-5)));
        }
    }

    public final void d(boolean z10) {
        int[] iArr;
        int[] iArr2;
        boolean z11 = this.f9723p;
        boolean z12 = this.f9724q;
        l0 l0Var = null;
        k6.h hVar = this.f9729w;
        View view = this.f9715g;
        if (!z12 && z11) {
            if (this.f9725r) {
                this.f9725r = false;
                cc.d dVar = this.f9726s;
                if (dVar != null) {
                    dVar.a();
                }
                int i10 = this.f9721n;
                y yVar = this.f9728u;
                if (i10 == 0 && z10) {
                    this.d.setAlpha(1.0f);
                    this.d.setTransitioning(true);
                    cc.d dVar2 = new cc.d();
                    ArrayList arrayList = (ArrayList) dVar2.f4718c;
                    float f7 = -this.d.getHeight();
                    if (z10) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f7 -= iArr2[1];
                    }
                    m0 a2 = j0.a(this.d);
                    a2.e(f7);
                    View view2 = (View) a2.f43742a.get();
                    if (view2 != null) {
                        if (hVar != null) {
                            l0Var = new l0(27, hVar, view2);
                        }
                        view2.animate().setUpdateListener(l0Var);
                    }
                    if (!dVar2.f4717b) {
                        arrayList.add(a2);
                    }
                    if (this.f9722o && view != null) {
                        m0 a10 = j0.a(view);
                        a10.e(f7);
                        if (!dVar2.f4717b) {
                            arrayList.add(a10);
                        }
                    }
                    boolean z13 = dVar2.f4717b;
                    if (!z13) {
                        dVar2.d = f9709x;
                    }
                    if (!z13) {
                        dVar2.f4716a = 250L;
                    }
                    if (!z13) {
                        dVar2.e = yVar;
                    }
                    this.f9726s = dVar2;
                    dVar2.b();
                    return;
                }
                yVar.c();
            }
        } else if (!this.f9725r) {
            this.f9725r = true;
            cc.d dVar3 = this.f9726s;
            if (dVar3 != null) {
                dVar3.a();
            }
            this.d.setVisibility(0);
            int i11 = this.f9721n;
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
                ArrayList arrayList2 = (ArrayList) dVar4.f4718c;
                m0 a11 = j0.a(this.d);
                a11.e(0.0f);
                View view3 = (View) a11.f43742a.get();
                if (view3 != null) {
                    if (hVar != null) {
                        l0Var = new l0(27, hVar, view3);
                    }
                    view3.animate().setUpdateListener(l0Var);
                }
                if (!dVar4.f4717b) {
                    arrayList2.add(a11);
                }
                if (this.f9722o && view != null) {
                    view.setTranslationY(f10);
                    m0 a12 = j0.a(view);
                    a12.e(0.0f);
                    if (!dVar4.f4717b) {
                        arrayList2.add(a12);
                    }
                }
                boolean z14 = dVar4.f4717b;
                if (!z14) {
                    dVar4.d = f9710y;
                }
                if (!z14) {
                    dVar4.f4716a = 250L;
                }
                if (!z14) {
                    dVar4.e = yVar2;
                }
                this.f9726s = dVar4;
                dVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f9722o && view != null) {
                    view.setTranslationY(0.0f);
                }
                yVar2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f9713c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = j0.f43732a;
                r0.z.c(actionBarOverlayLayout);
            }
        }
    }

    public a0(t tVar) {
        new ArrayList();
        this.f9720m = new ArrayList();
        this.f9721n = 0;
        this.f9722o = true;
        this.f9725r = true;
        this.f9728u = new y(this, 0);
        this.v = new y(this, 1);
        this.f9729w = new k6.h(this, 23);
        b(tVar.getWindow().getDecorView());
    }
}
