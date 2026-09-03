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
import j7.o7;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.k1;
import m.n3;
import oh.f5;
import r0.b0;
import r0.j0;
import r0.m0;
public final class a0 extends o7 implements m.b {
    public static final AccelerateInterpolator f6675x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f6676y = new DecelerateInterpolator();
    public Context f6677a;
    public Context f6678b;
    public ActionBarOverlayLayout f6679c;
    public ActionBarContainer d;
    public k1 f6680e;
    public ActionBarContextView f6681f;
    public final View f6682g;
    public boolean h;
    public z f6683i;
    public z f6684j;
    public f7.b f6685k;
    public boolean f6686l;
    public final ArrayList f6687m;
    public int f6688n;
    public boolean f6689o;
    public boolean f6690p;
    public boolean f6691q;
    public boolean f6692r;
    public k.j f6693s;
    public boolean f6694t;
    public final y f6695u;
    public final y v;
    public final ja.c f6696w;

    public a0(Activity activity, boolean z4) {
        new ArrayList();
        this.f6687m = new ArrayList();
        this.f6688n = 0;
        this.f6689o = true;
        this.f6692r = true;
        this.f6695u = new y(this, 0);
        this.v = new y(this, 1);
        this.f6696w = new ja.c(this);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z4) {
            return;
        }
        this.f6682g = decorView.findViewById(16908290);
    }

    public final void a(boolean z4) {
        m0 i10;
        m0 m0Var;
        long j10;
        if (z4) {
            if (!this.f6691q) {
                this.f6691q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6679c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f6691q) {
            this.f6691q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6679c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = j0.f46469a;
        if (actionBarContainer.isLaidOut()) {
            if (z4) {
                n3 n3Var = (n3) this.f6680e;
                i10 = j0.a(n3Var.f13266a);
                i10.a(0.0f);
                i10.c(100L);
                i10.d(new k.i(n3Var, 4));
                m0Var = this.f6681f.i(0, 200L);
            } else {
                n3 n3Var2 = (n3) this.f6680e;
                m0 a2 = j0.a(n3Var2.f13266a);
                a2.a(1.0f);
                a2.c(200L);
                a2.d(new k.i(n3Var2, 0));
                i10 = this.f6681f.i(8, 100L);
                m0Var = a2;
            }
            k.j jVar = new k.j();
            ArrayList arrayList = (ArrayList) jVar.f10243c;
            arrayList.add(i10);
            View view = (View) i10.f46481a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = (View) m0Var.f46481a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            arrayList.add(m0Var);
            jVar.b();
        } else if (z4) {
            ((n3) this.f6680e).f13266a.setVisibility(4);
            this.f6681f.setVisibility(0);
        } else {
            ((n3) this.f6680e).f13266a.setVisibility(0);
            this.f6681f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        k1 wrapper;
        boolean z4;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296411);
        this.f6679c = actionBarOverlayLayout;
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
        this.f6680e = wrapper;
        this.f6681f = (ActionBarContextView) view.findViewById(2131296311);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296305);
        this.d = actionBarContainer;
        k1 k1Var = this.f6680e;
        if (k1Var != null && this.f6681f != null && actionBarContainer != null) {
            Context context = ((n3) k1Var).f13266a.getContext();
            this.f6677a = context;
            if ((((n3) this.f6680e).f13267b & 4) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.h = true;
            }
            int i10 = context.getApplicationInfo().targetSdkVersion;
            this.f6680e.getClass();
            if (!context.getResources().getBoolean(2131034112)) {
                ((n3) this.f6680e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((n3) this.f6680e).getClass();
            }
            this.f6680e.getClass();
            ((n3) this.f6680e).f13266a.setCollapsible(false);
            this.f6679c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f6677a.obtainStyledAttributes(null, f.a.f5688a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6679c;
                if (actionBarOverlayLayout2.f443n) {
                    this.f6694t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = j0.f46469a;
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
            n3 n3Var = (n3) this.f6680e;
            int i11 = n3Var.f13267b;
            this.h = true;
            n3Var.a((i10 & 4) | (i11 & (-5)));
        }
    }

    public final void d(boolean z4) {
        int[] iArr;
        int[] iArr2;
        boolean z10 = this.f6690p;
        boolean z11 = this.f6691q;
        f5 f5Var = null;
        ja.c cVar = this.f6696w;
        View view = this.f6682g;
        if (!z11 && z10) {
            if (this.f6692r) {
                this.f6692r = false;
                k.j jVar = this.f6693s;
                if (jVar != null) {
                    jVar.a();
                }
                int i10 = this.f6688n;
                y yVar = this.f6695u;
                if (i10 == 0 && z4) {
                    this.d.setAlpha(1.0f);
                    this.d.setTransitioning(true);
                    k.j jVar2 = new k.j();
                    ArrayList arrayList = (ArrayList) jVar2.f10243c;
                    float f10 = -this.d.getHeight();
                    if (z4) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f10 -= iArr2[1];
                    }
                    m0 a2 = j0.a(this.d);
                    a2.e(f10);
                    View view2 = (View) a2.f46481a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            f5Var = new f5(cVar, view2);
                        }
                        view2.animate().setUpdateListener(f5Var);
                    }
                    if (!jVar2.f10242b) {
                        arrayList.add(a2);
                    }
                    if (this.f6689o && view != null) {
                        m0 a10 = j0.a(view);
                        a10.e(f10);
                        if (!jVar2.f10242b) {
                            arrayList.add(a10);
                        }
                    }
                    boolean z12 = jVar2.f10242b;
                    if (!z12) {
                        jVar2.d = f6675x;
                    }
                    if (!z12) {
                        jVar2.f10241a = 250L;
                    }
                    if (!z12) {
                        jVar2.f10244e = yVar;
                    }
                    this.f6693s = jVar2;
                    jVar2.b();
                    return;
                }
                yVar.c();
            }
        } else if (!this.f6692r) {
            this.f6692r = true;
            k.j jVar3 = this.f6693s;
            if (jVar3 != null) {
                jVar3.a();
            }
            this.d.setVisibility(0);
            int i11 = this.f6688n;
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
                ArrayList arrayList2 = (ArrayList) jVar4.f10243c;
                m0 a11 = j0.a(this.d);
                a11.e(0.0f);
                View view3 = (View) a11.f46481a.get();
                if (view3 != null) {
                    if (cVar != null) {
                        f5Var = new f5(cVar, view3);
                    }
                    view3.animate().setUpdateListener(f5Var);
                }
                if (!jVar4.f10242b) {
                    arrayList2.add(a11);
                }
                if (this.f6689o && view != null) {
                    view.setTranslationY(f11);
                    m0 a12 = j0.a(view);
                    a12.e(0.0f);
                    if (!jVar4.f10242b) {
                        arrayList2.add(a12);
                    }
                }
                boolean z13 = jVar4.f10242b;
                if (!z13) {
                    jVar4.d = f6676y;
                }
                if (!z13) {
                    jVar4.f10241a = 250L;
                }
                if (!z13) {
                    jVar4.f10244e = yVar2;
                }
                this.f6693s = jVar4;
                jVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f6689o && view != null) {
                    view.setTranslationY(0.0f);
                }
                yVar2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f6679c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = j0.f46469a;
                r0.z.c(actionBarOverlayLayout);
            }
        }
    }

    public a0(s sVar) {
        new ArrayList();
        this.f6687m = new ArrayList();
        this.f6688n = 0;
        this.f6689o = true;
        this.f6692r = true;
        this.f6695u = new y(this, 0);
        this.v = new y(this, 1);
        this.f6696w = new ja.c(this);
        b(sVar.getWindow().getDecorView());
    }
}
