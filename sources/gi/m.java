package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.d0;
import bi.g7;
import bi.k8;
import bi.s;
import c8.ma;
import di.v6;
import fi.a6;
import fi.d4;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cz;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.cs0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.d61;
import v4.z;
public final class m extends FrameLayout {
    public static final int f13679b0 = 0;
    public final nv0 E;
    public final j F;
    public final hi.e G;
    public final z H;
    public boolean I;
    public boolean J;
    public final ah.a K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public final Rect W;
    public a6 f13680a;
    public final fq0 f13681a0;
    public boolean f13682b;
    public float f13683c;
    public int d;
    public int f13684e;
    public final e f13685f;
    public final f51 h;
    public final v4.k f13686n;
    public final cs0 f13687r;
    public final g f13688s;
    public final h f13689w;
    public final l f13690x;
    public final i f13691y;

    public m(fq0 fq0Var, Context context) {
        super(context);
        this.f13681a0 = fq0Var;
        this.d = Utilities.j(cz.f23447u1, 6, 2);
        this.f13684e = Utilities.j(cz.f23447u1, 6, 2);
        this.I = false;
        this.J = false;
        this.W = new Rect();
        f51 f51Var = new f51();
        this.h = f51Var;
        f51Var.O = new d(this, 1);
        f51Var.y1(this.d);
        v4.k kVar = new v4.k();
        this.f13686n = kVar;
        kVar.n(280L);
        kVar.o(nr.h);
        kVar.f59194m = false;
        e eVar = new e(this, context);
        this.f13685f = eVar;
        eVar.setScrollingTouchSlop(1);
        eVar.setPinnedSectionOffsetY(-g0.L(2.0f));
        eVar.setPadding(0, 0, 0, 0);
        eVar.setItemAnimator(null);
        eVar.setClipToPadding(false);
        eVar.setSectionsType(2);
        eVar.setLayoutManager(f51Var);
        addView(eVar, ma.c(-1.0f, -1));
        eVar.i(new f(this, 0));
        eVar.setOnItemClickListener(new k8(this, 7));
        eVar.setOnItemLongClickListener(new v6(this, 15));
        ?? ek0Var = new ek0(context, null);
        this.f13687r = ek0Var;
        g gVar = new g(0, this);
        this.f13688s = gVar;
        ek0Var.setLayoutManager(gVar);
        ek0Var.i(new f(this, 1));
        gVar.y1(this.f13684e);
        ek0Var.setVisibility(8);
        addView((View) ek0Var, ma.c(-1.0f, -1));
        h hVar = new h(this, context);
        this.f13689w = hVar;
        eVar.setAdapter(hVar);
        l lVar = new l(this, getContext());
        hVar.f13675f = lVar;
        this.f13690x = lVar;
        ek0Var.setAdapter(lVar);
        i iVar = new i(this, context);
        this.f13691y = iVar;
        iVar.f42605x = false;
        nv0 nv0Var = new nv0(context, iVar, 1, null);
        this.E = nv0Var;
        nv0Var.setVisibility(8);
        nv0Var.setAnimateLayoutChange(true);
        addView(nv0Var, ma.c(-1.0f, -1));
        nv0Var.setOnTouchListener(new a(0));
        nv0Var.e(true, false);
        nv0Var.f37993b.setVisibility(8);
        nv0Var.d.setText(hd.N0(2131746502, null));
        nv0Var.f37995e.setText(hd.G(np.u1(fq0Var.f13697b).W5, "ProfileBotPreviewEmptyText", new Object[0]));
        String N0 = hd.N0(2131746506, null);
        hi.e eVar2 = nv0Var.f37996f;
        eVar2.i(N0, false, true);
        eVar2.setVisibility(0);
        eVar2.setOnClickListener(new b(this, 0));
        j jVar = new j(this, context);
        this.F = jVar;
        int i7 = m6.f29773y6;
        h6 h6Var = fq0Var.f13698c;
        t6.U(jVar, i7, h6Var);
        jVar.setText(hd.N0(2131746507, null));
        jVar.setTextSize(1, 14.0f);
        jVar.setTextAlignment(4);
        jVar.setGravity(17);
        jVar.setTypeface(g0.o());
        LinearLayout.LayoutParams t6 = ma.t(165, -2, 17, 0, 17, 0, 12);
        d61 d61Var = nv0Var.f37992a;
        d61Var.addView(jVar, t6);
        hi.e eVar3 = new hi.e(context, h6Var, false);
        this.G = eVar3;
        eVar3.setMinWidth(g0.L(200.0f));
        d61Var.addView(eVar3, ma.r(-2, 44, 17));
        nv0Var.addView(iVar, 0, ma.c(-1.0f, -1));
        eVar.setEmptyView(nv0Var);
        eVar.X1 = true;
        eVar.Y1 = 0;
        new SparseArray();
        new HashMap();
        z zVar = new z(new c(this, 0));
        this.H = zVar;
        zVar.h(eVar);
        ah.a aVar = new ah.a(context, h6Var);
        this.K = aVar;
        addView(aVar, ma.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f13682b) {
            float f10 = this.f13683c;
            float f11 = 1.0f;
            int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            cs0 cs0Var = this.f13687r;
            e eVar = this.f13685f;
            if (i7 == 0) {
                this.f13682b = false;
                int i10 = this.f13684e;
                this.d = i10;
                this.f13681a0.E = i10;
                cz.F(i10);
                h hVar = this.f13689w;
                int b10 = hVar.b();
                cs0Var.setVisibility(8);
                int i11 = this.d;
                f51 f51Var = this.h;
                f51Var.y1(i11);
                eVar.a0();
                eVar.invalidate();
                if (hVar.b() == b10) {
                    g0.Z3(eVar);
                } else {
                    hVar.f();
                }
                int i12 = this.T;
                if (i12 >= 0) {
                    View m10 = this.f13688s.m(i12);
                    if (m10 != null) {
                        this.U = m10.getTop();
                    }
                    f51Var.h1(this.T, (-eVar.getPaddingTop()) + this.U);
                }
            } else if (f10 == 0.0f) {
                this.f13682b = false;
                cs0Var.setVisibility(8);
                eVar.invalidate();
            } else {
                if (f10 > 0.2f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
                ofFloat.addUpdateListener(new d4(this, 1));
                ofFloat.addListener(new g7(6, this, z10));
                ofFloat.setInterpolator(nr.f37960f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i7;
        int i10;
        if (!this.f13682b && !this.f13681a0.H.F1) {
            int i11 = this.d;
            if (!z10) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            int i12 = i11 + i7;
            if (i12 > 6) {
                if (!z10) {
                    i12 = 9;
                } else {
                    i12 = 6;
                }
            }
            if (this.I) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            int j3 = Utilities.j(i12, 6, i10);
            this.f13684e = j3;
            if (j3 != this.d && !this.I) {
                cs0 cs0Var = this.f13687r;
                cs0Var.setVisibility(0);
                cs0Var.setAdapter(this.f13690x);
                cs0Var.setPadding(cs0Var.getPaddingLeft(), 0, cs0Var.getPaddingRight(), this.K.getMeasuredHeight() + g0.L(42.0f));
                g gVar = this.f13688s;
                gVar.y1(j3);
                cs0Var.a0();
                gVar.O = new d(this, 0);
                g0.Z3(this.f13685f);
                this.f13682b = true;
                this.f13683c = 0.0f;
                int i13 = this.T;
                if (i13 >= 0) {
                    gVar.h1(i13, this.U - cs0Var.getPaddingTop());
                }
            }
        }
    }

    public final void c() {
        int size;
        boolean z10;
        int i7;
        String a02;
        int i10;
        String N0;
        ch.k kVar;
        int i11 = this.f13681a0.f13697b;
        a6 a6Var = this.f13680a;
        int i12 = 0;
        if (a6Var == null) {
            size = 0;
        } else {
            size = a6Var.f12089i.size();
        }
        a6 a6Var2 = this.f13680a;
        if (a6Var2 != null && !TextUtils.isEmpty(a6Var2.E)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (size > 0) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        ah.a aVar = this.K;
        aVar.setVisibility(i7);
        if (z10) {
            a02 = hd.N0(2131746499, null);
        } else {
            a02 = hd.a0(null, null, 2131746498, b31.P0(this.f13680a.E, null, null));
        }
        String N02 = hd.N0(2131746521, null);
        f2.a aVar2 = new f2.a(this, 26);
        if (!z10 && size > 0) {
            N0 = null;
        } else {
            if (z10) {
                i10 = 2131746501;
            } else {
                i10 = 2131746500;
            }
            N0 = hd.N0(i10, null);
        }
        if (!z10 && size > 0) {
            kVar = null;
        } else {
            kVar = new ch.k(4, this, z10);
        }
        j jVar = (j) aVar.d;
        hi.e eVar = (hi.e) aVar.f1056e;
        ((TextView) aVar.f1054b).setText(a02);
        s sVar = (s) aVar.f1055c;
        sVar.i(N02, false, true);
        sVar.setOnClickListener(new ah.d(aVar2, 26));
        if (N0 == null) {
            jVar.setVisibility(8);
            eVar.setVisibility(8);
        } else {
            jVar.setVisibility(0);
            eVar.setVisibility(0);
            eVar.i(N0, false, true);
            eVar.setOnClickListener(new d0(2, kVar));
        }
        j jVar2 = this.F;
        hi.e eVar2 = this.G;
        nv0 nv0Var = this.E;
        if (z10) {
            nv0Var.d.setVisibility(0);
            nv0Var.d.setText(hd.N0(2131746502, null));
            nv0Var.f37995e.setText(hd.G(np.u1(i11).W5, "ProfileBotPreviewEmptyText", new Object[0]));
            nv0Var.f37996f.i(hd.N0(2131746506, null), false, true);
            jVar2.setVisibility(8);
            eVar2.setVisibility(8);
        } else {
            nv0Var.d.setVisibility(8);
            nv0Var.f37995e.setText(hd.a0(null, null, 2131746498, b31.P0(this.f13680a.E, null, null)));
            nv0Var.f37996f.i(hd.N0(2131746506, null), false, true);
            jVar2.setVisibility(0);
            eVar2.setVisibility(0);
            eVar2.i(hd.N0(2131746500, null), false, true);
            eVar2.setOnClickListener(new b(this, 1));
        }
        hi.e eVar3 = nv0Var.f37996f;
        if (this.f13689w.b() >= np.u1(i11).W5) {
            i12 = 8;
        }
        eVar3.setVisibility(i12);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f13687r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        e eVar = this.f13685f;
        eVar.setPadding(eVar.getPaddingLeft(), eVar.f34293f3, eVar.getPaddingRight(), this.K.getMeasuredHeight() + g0.L(42.0f));
    }

    public void setList(a6 a6Var) {
        if (this.f13680a != a6Var) {
            this.I = false;
            this.J = false;
            this.d = this.f13681a0.E;
        }
        this.f13680a = a6Var;
        h hVar = this.f13689w;
        hVar.f13674e = a6Var;
        if (hVar != hVar.f13678s.f13690x) {
            hVar.M();
        }
        hVar.f();
        l lVar = this.f13690x;
        lVar.f13674e = a6Var;
        if (lVar != lVar.f13678s.f13690x) {
            lVar.M();
        }
        lVar.f();
        c();
    }

    public void setVisibleHeight(int i7) {
        float f10 = (-(getMeasuredHeight() - Math.max(i7, g0.L(280.0f)))) / 2.0f;
        this.E.setTranslationY(f10);
        this.f13691y.setTranslationY(-f10);
    }
}
