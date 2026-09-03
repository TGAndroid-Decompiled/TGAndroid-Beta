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
import j7.n7;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.l1;
import m.o3;
import nh.e5;
import r0.b0;
import r0.j0;
import r0.m0;
public final class a0 extends n7 implements m.b {
    public static final AccelerateInterpolator f6211x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f6212y = new DecelerateInterpolator();
    public Context f6213a;
    public Context f6214b;
    public ActionBarOverlayLayout f6215c;
    public ActionBarContainer d;
    public l1 e;
    public ActionBarContextView f6216f;
    public final View f6217g;
    public boolean h;
    public z f6218i;
    public z f6219j;
    public f7.b f6220k;
    public boolean f6221l;
    public final ArrayList f6222m;
    public int f6223n;
    public boolean f6224o;
    public boolean f6225p;
    public boolean f6226q;
    public boolean f6227r;
    public k.j f6228s;
    public boolean f6229t;
    public final y f6230u;
    public final y v;
    public final bb.b f6231w;

    public a0(Activity activity, boolean z4) {
        new ArrayList();
        this.f6222m = new ArrayList();
        this.f6223n = 0;
        this.f6224o = true;
        this.f6227r = true;
        this.f6230u = new y(this, 0);
        this.v = new y(this, 1);
        this.f6231w = new bb.b(this, 16);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z4) {
            return;
        }
        this.f6217g = decorView.findViewById(16908290);
    }

    public final void a(boolean z4) {
        m0 i10;
        m0 m0Var;
        long j10;
        if (z4) {
            if (!this.f6226q) {
                this.f6226q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6215c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f6226q) {
            this.f6226q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6215c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = j0.f43142a;
        if (actionBarContainer.isLaidOut()) {
            if (z4) {
                o3 o3Var = (o3) this.e;
                i10 = j0.a(o3Var.f13566a);
                i10.a(0.0f);
                i10.c(100L);
                i10.d(new k.i(o3Var, 4));
                m0Var = this.f6216f.i(0, 200L);
            } else {
                o3 o3Var2 = (o3) this.e;
                m0 a2 = j0.a(o3Var2.f13566a);
                a2.a(1.0f);
                a2.c(200L);
                a2.d(new k.i(o3Var2, 0));
                i10 = this.f6216f.i(8, 100L);
                m0Var = a2;
            }
            k.j jVar = new k.j();
            ArrayList arrayList = (ArrayList) jVar.f9526c;
            arrayList.add(i10);
            View view = (View) i10.f43152a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = (View) m0Var.f43152a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            arrayList.add(m0Var);
            jVar.b();
        } else if (z4) {
            ((o3) this.e).f13566a.setVisibility(4);
            this.f6216f.setVisibility(0);
        } else {
            ((o3) this.e).f13566a.setVisibility(0);
            this.f6216f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        l1 wrapper;
        boolean z4;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296411);
        this.f6215c = actionBarOverlayLayout;
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
        this.f6216f = (ActionBarContextView) view.findViewById(2131296311);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296305);
        this.d = actionBarContainer;
        l1 l1Var = this.e;
        if (l1Var != null && this.f6216f != null && actionBarContainer != null) {
            Context context = ((o3) l1Var).f13566a.getContext();
            this.f6213a = context;
            if ((((o3) this.e).f13567b & 4) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
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
            ((o3) this.e).f13566a.setCollapsible(false);
            this.f6215c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f6213a.obtainStyledAttributes(null, f.a.f5608a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6215c;
                if (actionBarOverlayLayout2.f414n) {
                    this.f6229t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = j0.f43142a;
                b0.i(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(a0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void c(boolean z4) {
        int i10;
        if (!this.h) {
            if (z4) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            o3 o3Var = (o3) this.e;
            int i11 = o3Var.f13567b;
            this.h = true;
            o3Var.a((i10 & 4) | (i11 & (-5)));
        }
    }

    public final void d(boolean z4) {
        int[] iArr;
        int[] iArr2;
        boolean z10 = this.f6225p;
        boolean z11 = this.f6226q;
        e5 e5Var = null;
        bb.b bVar = this.f6231w;
        View view = this.f6217g;
        if (!z11 && z10) {
            if (this.f6227r) {
                this.f6227r = false;
                k.j jVar = this.f6228s;
                if (jVar != null) {
                    jVar.a();
                }
                int i10 = this.f6223n;
                y yVar = this.f6230u;
                if (i10 == 0 && z4) {
                    this.d.setAlpha(1.0f);
                    this.d.setTransitioning(true);
                    k.j jVar2 = new k.j();
                    ArrayList arrayList = (ArrayList) jVar2.f9526c;
                    float f10 = -this.d.getHeight();
                    if (z4) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f10 -= iArr2[1];
                    }
                    m0 a2 = j0.a(this.d);
                    a2.e(f10);
                    View view2 = (View) a2.f43152a.get();
                    if (view2 != null) {
                        if (bVar != null) {
                            e5Var = new e5(bVar, view2);
                        }
                        view2.animate().setUpdateListener(e5Var);
                    }
                    if (!jVar2.f9525b) {
                        arrayList.add(a2);
                    }
                    if (this.f6224o && view != null) {
                        m0 a10 = j0.a(view);
                        a10.e(f10);
                        if (!jVar2.f9525b) {
                            arrayList.add(a10);
                        }
                    }
                    boolean z12 = jVar2.f9525b;
                    if (!z12) {
                        jVar2.d = f6211x;
                    }
                    if (!z12) {
                        jVar2.f9524a = 250L;
                    }
                    if (!z12) {
                        jVar2.e = yVar;
                    }
                    this.f6228s = jVar2;
                    jVar2.b();
                    return;
                }
                yVar.c();
            }
        } else if (!this.f6227r) {
            this.f6227r = true;
            k.j jVar3 = this.f6228s;
            if (jVar3 != null) {
                jVar3.a();
            }
            this.d.setVisibility(0);
            int i11 = this.f6223n;
            y yVar2 = this.v;
            if (i11 == 0 && z4) {
                this.d.setTranslationY(0.0f);
                float f11 = -this.d.getHeight();
                if (z4) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f11 -= iArr[1];
                }
                this.d.setTranslationY(f11);
                k.j jVar4 = new k.j();
                ArrayList arrayList2 = (ArrayList) jVar4.f9526c;
                m0 a11 = j0.a(this.d);
                a11.e(0.0f);
                View view3 = (View) a11.f43152a.get();
                if (view3 != null) {
                    if (bVar != null) {
                        e5Var = new e5(bVar, view3);
                    }
                    view3.animate().setUpdateListener(e5Var);
                }
                if (!jVar4.f9525b) {
                    arrayList2.add(a11);
                }
                if (this.f6224o && view != null) {
                    view.setTranslationY(f11);
                    m0 a12 = j0.a(view);
                    a12.e(0.0f);
                    if (!jVar4.f9525b) {
                        arrayList2.add(a12);
                    }
                }
                boolean z13 = jVar4.f9525b;
                if (!z13) {
                    jVar4.d = f6212y;
                }
                if (!z13) {
                    jVar4.f9524a = 250L;
                }
                if (!z13) {
                    jVar4.e = yVar2;
                }
                this.f6228s = jVar4;
                jVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f6224o && view != null) {
                    view.setTranslationY(0.0f);
                }
                yVar2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f6215c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = j0.f43142a;
                r0.z.c(actionBarOverlayLayout);
            }
        }
    }

    public a0(s sVar) {
        new ArrayList();
        this.f6222m = new ArrayList();
        this.f6223n = 0;
        this.f6224o = true;
        this.f6227r = true;
        this.f6230u = new y(this, 0);
        this.v = new y(this, 1);
        this.f6231w = new bb.b(this, 16);
        b(sVar.getWindow().getDecorView());
    }
}
