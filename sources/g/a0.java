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
import h7.m7;
import java.util.ArrayList;
import java.util.WeakHashMap;
import lh.d5;
import m.l1;
import m.o3;
import r0.b0;
import r0.j0;
import r0.m0;
public final class a0 extends m7 implements m.c {
    public static final AccelerateInterpolator f6832x = new AccelerateInterpolator();
    public static final DecelerateInterpolator f6833y = new DecelerateInterpolator();
    public Context f6834a;
    public Context f6835b;
    public ActionBarOverlayLayout f6836c;
    public ActionBarContainer d;
    public l1 f6837e;
    public ActionBarContextView f6838f;
    public final View f6839g;
    public boolean h;
    public z f6840i;
    public z f6841j;
    public ze.b f6842k;
    public boolean f6843l;
    public final ArrayList f6844m;
    public int f6845n;
    public boolean f6846o;
    public boolean f6847p;
    public boolean f6848q;
    public boolean f6849r;
    public k.j f6850s;
    public boolean f6851t;
    public final y f6852u;
    public final y v;
    public final za.c f6853w;

    public a0(Activity activity, boolean z10) {
        new ArrayList();
        this.f6844m = new ArrayList();
        this.f6845n = 0;
        this.f6846o = true;
        this.f6849r = true;
        this.f6852u = new y(this, 0);
        this.v = new y(this, 1);
        this.f6853w = new za.c(this, 16);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.f6839g = decorView.findViewById(16908290);
    }

    public final void a(boolean z10) {
        m0 i10;
        m0 m0Var;
        long j10;
        if (z10) {
            if (!this.f6848q) {
                this.f6848q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6836c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.f6848q) {
            this.f6848q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6836c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = j0.f46829a;
        if (actionBarContainer.isLaidOut()) {
            if (z10) {
                o3 o3Var = (o3) this.f6837e;
                i10 = j0.a(o3Var.f16625a);
                i10.a(0.0f);
                i10.c(100L);
                i10.d(new k.i(o3Var, 4));
                m0Var = this.f6838f.i(0, 200L);
            } else {
                o3 o3Var2 = (o3) this.f6837e;
                m0 a2 = j0.a(o3Var2.f16625a);
                a2.a(1.0f);
                a2.c(200L);
                a2.d(new k.i(o3Var2, 0));
                i10 = this.f6838f.i(8, 100L);
                m0Var = a2;
            }
            k.j jVar = new k.j();
            ArrayList arrayList = (ArrayList) jVar.f13241c;
            arrayList.add(i10);
            View view = (View) i10.f46841a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = (View) m0Var.f46841a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            arrayList.add(m0Var);
            jVar.b();
        } else if (z10) {
            ((o3) this.f6837e).f16625a.setVisibility(4);
            this.f6838f.setVisibility(0);
        } else {
            ((o3) this.f6837e).f16625a.setVisibility(0);
            this.f6838f.setVisibility(8);
        }
    }

    public final void b(View view) {
        String str;
        l1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296411);
        this.f6836c = actionBarOverlayLayout;
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
        this.f6837e = wrapper;
        this.f6838f = (ActionBarContextView) view.findViewById(2131296311);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296305);
        this.d = actionBarContainer;
        l1 l1Var = this.f6837e;
        if (l1Var != null && this.f6838f != null && actionBarContainer != null) {
            Context context = ((o3) l1Var).f16625a.getContext();
            this.f6834a = context;
            if ((((o3) this.f6837e).f16626b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.h = true;
            }
            int i10 = context.getApplicationInfo().targetSdkVersion;
            this.f6837e.getClass();
            if (!context.getResources().getBoolean(2131034112)) {
                ((o3) this.f6837e).getClass();
                this.d.setTabContainer(null);
            } else {
                this.d.setTabContainer(null);
                ((o3) this.f6837e).getClass();
            }
            this.f6837e.getClass();
            ((o3) this.f6837e).f16625a.setCollapsible(false);
            this.f6836c.setHasNonEmbeddedTabs(false);
            TypedArray obtainStyledAttributes = this.f6834a.obtainStyledAttributes(null, f.a.f6231a, 2130968581, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6836c;
                if (actionBarOverlayLayout2.f968n) {
                    this.f6851t = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = j0.f46829a;
                b0.i(actionBarContainer2, dimensionPixelSize);
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
            o3 o3Var = (o3) this.f6837e;
            int i11 = o3Var.f16626b;
            this.h = true;
            o3Var.a((i10 & 4) | (i11 & (-5)));
        }
    }

    public final void d(boolean z10) {
        int[] iArr;
        int[] iArr2;
        boolean z11 = this.f6847p;
        boolean z12 = this.f6848q;
        d5 d5Var = null;
        za.c cVar = this.f6853w;
        View view = this.f6839g;
        if (!z12 && z11) {
            if (this.f6849r) {
                this.f6849r = false;
                k.j jVar = this.f6850s;
                if (jVar != null) {
                    jVar.a();
                }
                int i10 = this.f6845n;
                y yVar = this.f6852u;
                if (i10 == 0 && z10) {
                    this.d.setAlpha(1.0f);
                    this.d.setTransitioning(true);
                    k.j jVar2 = new k.j();
                    ArrayList arrayList = (ArrayList) jVar2.f13241c;
                    float f9 = -this.d.getHeight();
                    if (z10) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f9 -= iArr2[1];
                    }
                    m0 a2 = j0.a(this.d);
                    a2.e(f9);
                    View view2 = (View) a2.f46841a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            d5Var = new d5(cVar, view2);
                        }
                        view2.animate().setUpdateListener(d5Var);
                    }
                    if (!jVar2.f13240b) {
                        arrayList.add(a2);
                    }
                    if (this.f6846o && view != null) {
                        m0 a10 = j0.a(view);
                        a10.e(f9);
                        if (!jVar2.f13240b) {
                            arrayList.add(a10);
                        }
                    }
                    boolean z13 = jVar2.f13240b;
                    if (!z13) {
                        jVar2.d = f6832x;
                    }
                    if (!z13) {
                        jVar2.f13239a = 250L;
                    }
                    if (!z13) {
                        jVar2.f13242e = yVar;
                    }
                    this.f6850s = jVar2;
                    jVar2.b();
                    return;
                }
                yVar.c();
            }
        } else if (!this.f6849r) {
            this.f6849r = true;
            k.j jVar3 = this.f6850s;
            if (jVar3 != null) {
                jVar3.a();
            }
            this.d.setVisibility(0);
            int i11 = this.f6845n;
            y yVar2 = this.v;
            if (i11 == 0 && z10) {
                this.d.setTranslationY(0.0f);
                float f10 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f10 -= iArr[1];
                }
                this.d.setTranslationY(f10);
                k.j jVar4 = new k.j();
                ArrayList arrayList2 = (ArrayList) jVar4.f13241c;
                m0 a11 = j0.a(this.d);
                a11.e(0.0f);
                View view3 = (View) a11.f46841a.get();
                if (view3 != null) {
                    if (cVar != null) {
                        d5Var = new d5(cVar, view3);
                    }
                    view3.animate().setUpdateListener(d5Var);
                }
                if (!jVar4.f13240b) {
                    arrayList2.add(a11);
                }
                if (this.f6846o && view != null) {
                    view.setTranslationY(f10);
                    m0 a12 = j0.a(view);
                    a12.e(0.0f);
                    if (!jVar4.f13240b) {
                        arrayList2.add(a12);
                    }
                }
                boolean z14 = jVar4.f13240b;
                if (!z14) {
                    jVar4.d = f6833y;
                }
                if (!z14) {
                    jVar4.f13239a = 250L;
                }
                if (!z14) {
                    jVar4.f13242e = yVar2;
                }
                this.f6850s = jVar4;
                jVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f6846o && view != null) {
                    view.setTranslationY(0.0f);
                }
                yVar2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f6836c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = j0.f46829a;
                r0.z.c(actionBarOverlayLayout);
            }
        }
    }

    public a0(s sVar) {
        new ArrayList();
        this.f6844m = new ArrayList();
        this.f6845n = 0;
        this.f6846o = true;
        this.f6849r = true;
        this.f6852u = new y(this, 0);
        this.v = new y(this, 1);
        this.f6853w = new za.c(this, 16);
        b(sVar.getWindow().getDecorView());
    }
}
