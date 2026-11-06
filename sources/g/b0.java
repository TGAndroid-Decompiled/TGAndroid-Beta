package g;

import a8.ca;
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
import bi.de;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.l1;
import m.m3;
import r0.i0;
import r0.l0;
public final class b0 extends ca implements m.c {
    public static final AccelerateInterpolator f13274x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f13275y = new DecelerateInterpolator();
    public Context f13276a;
    public Context f13277b;
    public ActionBarOverlayLayout f13278c;
    public ActionBarContainer d;
    public l1 f13279e;
    public ActionBarContextView f13280f;
    public final View f13281g;
    public boolean h;
    public a0 f13282i;
    public a0 f13283j;
    public q4.q f13284k;
    public boolean f13285l;
    public final ArrayList f13286m;
    public int f13287n;
    public boolean f13288o;
    public boolean f13289p;
    public boolean f13290q;
    public boolean f13291r;
    public ac.d f13292s;
    public boolean f13293t;
    public final z f13294u;
    public final z v;
    public final aa.n f13295w;

    public b0(Activity activity, boolean z9) {
        new ArrayList();
        this.f13286m = new ArrayList();
        this.f13287n = 0;
        this.f13288o = true;
        this.f13291r = true;
        this.f13294u = new z(this, 0);
        this.v = new z(this, 1);
        this.f13295w = new aa.n(this, 25);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z9) {
            return;
        }
        this.f13281g = decorView.findViewById(16908290);
    }

    public final void a(boolean z9) {
        l0 i7;
        l0 l0Var;
        long j3;
        if (z9) {
            if (!this.f13290q) {
                this.f13290q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13278c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f13290q) {
            this.f13290q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13278c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = i0.f54073a;
        if (actionBarContainer.isLaidOut()) {
            if (z9) {
                m3 m3Var = (m3) this.f13279e;
                i7 = i0.a(m3Var.f19159a);
                i7.a(0.0f);
                i7.c(100L);
                i7.d(new k.i(m3Var, 4));
                l0Var = this.f13280f.i(0, 200L);
            } else {
                m3 m3Var2 = (m3) this.f13279e;
                l0 a10 = i0.a(m3Var2.f19159a);
                a10.a(1.0f);
                a10.c(200L);
                a10.d(new k.i(m3Var2, 0));
                i7 = this.f13280f.i(8, 100L);
                l0Var = a10;
            }
            ac.d dVar = new ac.d();
            ArrayList arrayList = (ArrayList) dVar.f1020c;
            arrayList.add(i7);
            View view = (View) i7.f54085a.get();
            if (view != null) {
                j3 = view.animate().getDuration();
            } else {
                j3 = 0;
            }
            View view2 = (View) l0Var.f54085a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j3);
            }
            arrayList.add(l0Var);
            dVar.b();
        } else if (z9) {
            ((m3) this.f13279e).f19159a.setVisibility(4);
            this.f13280f.setVisibility(0);
        } else {
            ((m3) this.f13279e).f19159a.setVisibility(0);
            this.f13280f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        l1 wrapper;
        boolean z9;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296411);
        this.f13278c = actionBarOverlayLayout;
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
        this.f13279e = wrapper;
        this.f13280f = (ActionBarContextView) view.findViewById(2131296311);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296305);
        this.d = actionBarContainer;
        l1 l1Var = this.f13279e;
        if (l1Var != null && this.f13280f != null && actionBarContainer != null) {
            Context context = ((m3) l1Var).f19159a.getContext();
            this.f13276a = context;
            if ((((m3) this.f13279e).f19160b & 4) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                this.h = true;
            }
            int i7 = context.getApplicationInfo().targetSdkVersion;
            this.f13279e.getClass();
            if (!context.getResources().getBoolean(2131034112)) {
                ((m3) this.f13279e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((m3) this.f13279e).getClass();
            }
            this.f13279e.getClass();
            ((m3) this.f13279e).f19159a.setCollapsible(false);
            this.f13278c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f13276a.obtainStyledAttributes(null, f.a.f10855a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13278c;
                if (actionBarOverlayLayout2.f1933n) {
                    this.f13293t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = i0.f54073a;
                r0.a0.h(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(b0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void c(boolean z9) {
        int i7;
        if (!this.h) {
            if (z9) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            m3 m3Var = (m3) this.f13279e;
            int i10 = m3Var.f19160b;
            this.h = true;
            m3Var.a((i7 & 4) | (i10 & (-5)));
        }
    }

    public final void d(boolean z9) {
        int[] iArr;
        int[] iArr2;
        boolean z10 = this.f13289p;
        boolean z11 = this.f13290q;
        de deVar = null;
        aa.n nVar = this.f13295w;
        View view = this.f13281g;
        if (!z11 && z10) {
            if (this.f13291r) {
                this.f13291r = false;
                ac.d dVar = this.f13292s;
                if (dVar != null) {
                    dVar.a();
                }
                int i7 = this.f13287n;
                z zVar = this.f13294u;
                if (i7 == 0 && z9) {
                    this.d.setAlpha(1.0f);
                    this.d.setTransitioning(true);
                    ac.d dVar2 = new ac.d();
                    ArrayList arrayList = (ArrayList) dVar2.f1020c;
                    float f10 = -this.d.getHeight();
                    if (z9) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f10 -= iArr2[1];
                    }
                    l0 a10 = i0.a(this.d);
                    a10.e(f10);
                    View view2 = (View) a10.f54085a.get();
                    if (view2 != null) {
                        if (nVar != null) {
                            deVar = new de(27, nVar, view2);
                        }
                        view2.animate().setUpdateListener(deVar);
                    }
                    if (!dVar2.f1019b) {
                        arrayList.add(a10);
                    }
                    if (this.f13288o && view != null) {
                        l0 a11 = i0.a(view);
                        a11.e(f10);
                        if (!dVar2.f1019b) {
                            arrayList.add(a11);
                        }
                    }
                    boolean z12 = dVar2.f1019b;
                    if (!z12) {
                        dVar2.d = f13274x;
                    }
                    if (!z12) {
                        dVar2.f1018a = 250L;
                    }
                    if (!z12) {
                        dVar2.f1021e = zVar;
                    }
                    this.f13292s = dVar2;
                    dVar2.b();
                    return;
                }
                zVar.c();
            }
        } else if (!this.f13291r) {
            this.f13291r = true;
            ac.d dVar3 = this.f13292s;
            if (dVar3 != null) {
                dVar3.a();
            }
            this.d.setVisibility(0);
            int i10 = this.f13287n;
            z zVar2 = this.v;
            if (i10 == 0 && z9) {
                this.d.setTranslationY(0.0f);
                float f11 = -this.d.getHeight();
                if (z9) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f11 -= iArr[1];
                }
                this.d.setTranslationY(f11);
                ac.d dVar4 = new ac.d();
                ArrayList arrayList2 = (ArrayList) dVar4.f1020c;
                l0 a12 = i0.a(this.d);
                a12.e(0.0f);
                View view3 = (View) a12.f54085a.get();
                if (view3 != null) {
                    if (nVar != null) {
                        deVar = new de(27, nVar, view3);
                    }
                    view3.animate().setUpdateListener(deVar);
                }
                if (!dVar4.f1019b) {
                    arrayList2.add(a12);
                }
                if (this.f13288o && view != null) {
                    view.setTranslationY(f11);
                    l0 a13 = i0.a(view);
                    a13.e(0.0f);
                    if (!dVar4.f1019b) {
                        arrayList2.add(a13);
                    }
                }
                boolean z13 = dVar4.f1019b;
                if (!z13) {
                    dVar4.d = f13275y;
                }
                if (!z13) {
                    dVar4.f1018a = 250L;
                }
                if (!z13) {
                    dVar4.f1021e = zVar2;
                }
                this.f13292s = dVar4;
                dVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f13288o && view != null) {
                    view.setTranslationY(0.0f);
                }
                zVar2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f13278c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = i0.f54073a;
                r0.y.c(actionBarOverlayLayout);
            }
        }
    }

    public b0(u uVar) {
        new ArrayList();
        this.f13286m = new ArrayList();
        this.f13287n = 0;
        this.f13288o = true;
        this.f13291r = true;
        this.f13294u = new z(this, 0);
        this.v = new z(this, 1);
        this.f13295w = new aa.n(this, 25);
        b(uVar.getWindow().getDecorView());
    }
}
