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
import f7.n7;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kh.g4;
import m.l1;
import m.p3;
import r0.b0;
import r0.j0;
import r0.m0;
public final class a0 extends n7 implements m.c {
    public static final AccelerateInterpolator f6922x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f6923y = new DecelerateInterpolator();
    public Context f6924a;
    public Context f6925b;
    public ActionBarOverlayLayout f6926c;
    public ActionBarContainer d;
    public l1 f6927e;
    public ActionBarContextView f6928f;
    public final View f6929g;
    public boolean h;
    public z f6930i;
    public z f6931j;
    public we.b f6932k;
    public boolean f6933l;
    public final ArrayList f6934m;
    public int f6935n;
    public boolean f6936o;
    public boolean f6937p;
    public boolean f6938q;
    public boolean f6939r;
    public jb.d f6940s;
    public boolean f6941t;
    public final y f6942u;
    public final y v;
    public final fa.c f6943w;

    public a0(Activity activity, boolean z10) {
        new ArrayList();
        this.f6934m = new ArrayList();
        this.f6935n = 0;
        this.f6936o = true;
        this.f6939r = true;
        this.f6942u = new y(this, 0);
        this.v = new y(this, 1);
        this.f6943w = new fa.c(this, 18);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.f6929g = decorView.findViewById(16908290);
    }

    public final void a(boolean z10) {
        m0 i9;
        m0 m0Var;
        long j10;
        if (z10) {
            if (!this.f6938q) {
                this.f6938q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6926c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f6938q) {
            this.f6938q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6926c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = j0.f46915a;
        if (actionBarContainer.isLaidOut()) {
            if (z10) {
                p3 p3Var = (p3) this.f6927e;
                i9 = j0.a(p3Var.f17037a);
                i9.a(0.0f);
                i9.c(100L);
                i9.d(new k.i(p3Var, 4));
                m0Var = this.f6928f.i(0, 200L);
            } else {
                p3 p3Var2 = (p3) this.f6927e;
                m0 a2 = j0.a(p3Var2.f17037a);
                a2.a(1.0f);
                a2.c(200L);
                a2.d(new k.i(p3Var2, 0));
                i9 = this.f6928f.i(8, 100L);
                m0Var = a2;
            }
            jb.d dVar = new jb.d();
            ArrayList arrayList = (ArrayList) dVar.f14293c;
            arrayList.add(i9);
            View view = (View) i9.f46927a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = (View) m0Var.f46927a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            arrayList.add(m0Var);
            dVar.b();
        } else if (z10) {
            ((p3) this.f6927e).f17037a.setVisibility(4);
            this.f6928f.setVisibility(0);
        } else {
            ((p3) this.f6927e).f17037a.setVisibility(0);
            this.f6928f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        l1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296411);
        this.f6926c = actionBarOverlayLayout;
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
        this.f6927e = wrapper;
        this.f6928f = (ActionBarContextView) view.findViewById(2131296311);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296305);
        this.d = actionBarContainer;
        l1 l1Var = this.f6927e;
        if (l1Var != null && this.f6928f != null && actionBarContainer != null) {
            Context context = ((p3) l1Var).f17037a.getContext();
            this.f6924a = context;
            if ((((p3) this.f6927e).f17038b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.h = true;
            }
            int i9 = context.getApplicationInfo().targetSdkVersion;
            this.f6927e.getClass();
            if (!context.getResources().getBoolean(2131034112)) {
                ((p3) this.f6927e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((p3) this.f6927e).getClass();
            }
            this.f6927e.getClass();
            ((p3) this.f6927e).f17037a.setCollapsible(false);
            this.f6926c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f6924a.obtainStyledAttributes(null, f.a.f5269a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6926c;
                if (actionBarOverlayLayout2.f476n) {
                    this.f6941t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = j0.f46915a;
                b0.i(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(a0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void c(boolean z10) {
        int i9;
        if (!this.h) {
            if (z10) {
                i9 = 4;
            } else {
                i9 = 0;
            }
            p3 p3Var = (p3) this.f6927e;
            int i10 = p3Var.f17038b;
            this.h = true;
            p3Var.a((i9 & 4) | (i10 & (-5)));
        }
    }

    public final void d(boolean z10) {
        int[] iArr;
        int[] iArr2;
        boolean z11 = this.f6937p;
        boolean z12 = this.f6938q;
        g4 g4Var = null;
        fa.c cVar = this.f6943w;
        View view = this.f6929g;
        if (!z12 && z11) {
            if (this.f6939r) {
                this.f6939r = false;
                jb.d dVar = this.f6940s;
                if (dVar != null) {
                    dVar.a();
                }
                int i9 = this.f6935n;
                y yVar = this.f6942u;
                if (i9 == 0 && z10) {
                    this.d.setAlpha(1.0f);
                    this.d.setTransitioning(true);
                    jb.d dVar2 = new jb.d();
                    ArrayList arrayList = (ArrayList) dVar2.f14293c;
                    float f10 = -this.d.getHeight();
                    if (z10) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f10 -= iArr2[1];
                    }
                    m0 a2 = j0.a(this.d);
                    a2.e(f10);
                    View view2 = (View) a2.f46927a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            g4Var = new g4(cVar, view2);
                        }
                        view2.animate().setUpdateListener(g4Var);
                    }
                    if (!dVar2.f14292b) {
                        arrayList.add(a2);
                    }
                    if (this.f6936o && view != null) {
                        m0 a3 = j0.a(view);
                        a3.e(f10);
                        if (!dVar2.f14292b) {
                            arrayList.add(a3);
                        }
                    }
                    boolean z13 = dVar2.f14292b;
                    if (!z13) {
                        dVar2.d = f6922x;
                    }
                    if (!z13) {
                        dVar2.f14291a = 250L;
                    }
                    if (!z13) {
                        dVar2.f14294e = yVar;
                    }
                    this.f6940s = dVar2;
                    dVar2.b();
                    return;
                }
                yVar.c();
            }
        } else if (!this.f6939r) {
            this.f6939r = true;
            jb.d dVar3 = this.f6940s;
            if (dVar3 != null) {
                dVar3.a();
            }
            this.d.setVisibility(0);
            int i10 = this.f6935n;
            y yVar2 = this.v;
            if (i10 == 0 && z10) {
                this.d.setTranslationY(0.0f);
                float f11 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f11 -= iArr[1];
                }
                this.d.setTranslationY(f11);
                jb.d dVar4 = new jb.d();
                ArrayList arrayList2 = (ArrayList) dVar4.f14293c;
                m0 a10 = j0.a(this.d);
                a10.e(0.0f);
                View view3 = (View) a10.f46927a.get();
                if (view3 != null) {
                    if (cVar != null) {
                        g4Var = new g4(cVar, view3);
                    }
                    view3.animate().setUpdateListener(g4Var);
                }
                if (!dVar4.f14292b) {
                    arrayList2.add(a10);
                }
                if (this.f6936o && view != null) {
                    view.setTranslationY(f11);
                    m0 a11 = j0.a(view);
                    a11.e(0.0f);
                    if (!dVar4.f14292b) {
                        arrayList2.add(a11);
                    }
                }
                boolean z14 = dVar4.f14292b;
                if (!z14) {
                    dVar4.d = f6923y;
                }
                if (!z14) {
                    dVar4.f14291a = 250L;
                }
                if (!z14) {
                    dVar4.f14294e = yVar2;
                }
                this.f6940s = dVar4;
                dVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f6936o && view != null) {
                    view.setTranslationY(0.0f);
                }
                yVar2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f6926c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = j0.f46915a;
                r0.z.c(actionBarOverlayLayout);
            }
        }
    }

    public a0(s sVar) {
        new ArrayList();
        this.f6934m = new ArrayList();
        this.f6935n = 0;
        this.f6936o = true;
        this.f6939r = true;
        this.f6942u = new y(this, 0);
        this.v = new y(this, 1);
        this.f6943w = new fa.c(this, 18);
        b(sVar.getWindow().getDecorView());
    }
}
