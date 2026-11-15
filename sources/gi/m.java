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
import bi.b6;
import bi.d0;
import bi.s;
import bi.v4;
import c8.ja;
import di.z6;
import fi.c1;
import fi.c6;
import fi.f4;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.z51;
import v4.y;
public final class m extends FrameLayout {
    public static final int f13335b0 = 0;
    public final cv0 E;
    public final j F;
    public final hi.d G;
    public final y H;
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
    public c6 f13336a;
    public final vp0 f13337a0;
    public boolean f13338b;
    public float f13339c;
    public int d;
    public int f13340e;
    public final e f13341f;
    public final s41 h;
    public final v4.k f13342n;
    public final sr0 f13343r;
    public final g f13344s;
    public final h f13345w;
    public final l f13346x;
    public final i f13347y;

    public m(vp0 vp0Var, Context context) {
        super(context);
        this.f13337a0 = vp0Var;
        this.d = Utilities.j(gz.f23989u1, 6, 2);
        this.f13340e = Utilities.j(gz.f23989u1, 6, 2);
        this.I = false;
        this.J = false;
        this.W = new Rect();
        s41 s41Var = new s41();
        this.h = s41Var;
        s41Var.O = new d(this, 1);
        s41Var.y1(this.d);
        v4.k kVar = new v4.k();
        this.f13342n = kVar;
        kVar.n(280L);
        kVar.o(er.h);
        kVar.f58564m = false;
        e eVar = new e(this, context);
        this.f13341f = eVar;
        eVar.setScrollingTouchSlop(1);
        eVar.setPinnedSectionOffsetY(-g0.L(2.0f));
        eVar.setPadding(0, 0, 0, 0);
        eVar.setItemAnimator(null);
        eVar.setClipToPadding(false);
        eVar.setSectionsType(2);
        eVar.setLayoutManager(s41Var);
        addView(eVar, ja.c(-1.0f, -1));
        eVar.i(new f(this, 0));
        eVar.setOnItemClickListener(new b6(this, 7));
        eVar.setOnItemLongClickListener(new z6(this, 14));
        ?? uj0Var = new uj0(context, null);
        this.f13343r = uj0Var;
        g gVar = new g(0, this);
        this.f13344s = gVar;
        uj0Var.setLayoutManager(gVar);
        uj0Var.i(new f(this, 1));
        gVar.y1(this.f13340e);
        uj0Var.setVisibility(8);
        addView((View) uj0Var, ja.c(-1.0f, -1));
        h hVar = new h(this, context);
        this.f13345w = hVar;
        eVar.setAdapter(hVar);
        l lVar = new l(this, getContext());
        hVar.f13331f = lVar;
        this.f13346x = lVar;
        uj0Var.setAdapter(lVar);
        i iVar = new i(this, context);
        this.f13347y = iVar;
        iVar.f38448x = false;
        cv0 cv0Var = new cv0(context, iVar, 1, null);
        this.E = cv0Var;
        cv0Var.setVisibility(8);
        cv0Var.setAnimateLayoutChange(true);
        addView(cv0Var, ja.c(-1.0f, -1));
        cv0Var.setOnTouchListener(new a(0));
        cv0Var.e(true, false);
        cv0Var.f33707b.setVisibility(8);
        cv0Var.d.setText(hd.M0(2131746698, null));
        cv0Var.f33709e.setText(hd.G(np.s1(vp0Var.f13353b).U5, "ProfileBotPreviewEmptyText", new Object[0]));
        String M0 = hd.M0(2131746702, null);
        hi.d dVar = cv0Var.f33710f;
        dVar.i(M0, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new b(this, 0));
        j jVar = new j(this, context);
        this.F = jVar;
        int i7 = j6.f29241y6;
        e6 e6Var = vp0Var.f13354c;
        q6.U(jVar, i7, e6Var);
        jVar.setText(hd.M0(2131746703, null));
        jVar.setTextSize(1, 14.0f);
        jVar.setTextAlignment(4);
        jVar.setGravity(17);
        jVar.setTypeface(g0.o());
        LinearLayout.LayoutParams t6 = ja.t(165, -2, 17, 0, 17, 0, 12);
        z51 z51Var = cv0Var.f33706a;
        z51Var.addView(jVar, t6);
        hi.d dVar2 = new hi.d(context, e6Var, false);
        this.G = dVar2;
        dVar2.setMinWidth(g0.L(200.0f));
        z51Var.addView(dVar2, ja.r(-2, 44, 17));
        cv0Var.addView(iVar, 0, ja.c(-1.0f, -1));
        eVar.setEmptyView(cv0Var);
        eVar.X1 = true;
        eVar.Y1 = 0;
        new SparseArray();
        new HashMap();
        y yVar = new y(new c(this, 0));
        this.H = yVar;
        yVar.h(eVar);
        ah.a aVar = new ah.a(context, e6Var);
        this.K = aVar;
        addView(aVar, ja.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f13338b) {
            float f10 = this.f13339c;
            float f11 = 1.0f;
            int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            sr0 sr0Var = this.f13343r;
            e eVar = this.f13341f;
            if (i7 == 0) {
                this.f13338b = false;
                int i10 = this.f13340e;
                this.d = i10;
                this.f13337a0.E = i10;
                gz.F(i10);
                h hVar = this.f13345w;
                int b10 = hVar.b();
                sr0Var.setVisibility(8);
                int i11 = this.d;
                s41 s41Var = this.h;
                s41Var.y1(i11);
                eVar.a0();
                eVar.invalidate();
                if (hVar.b() == b10) {
                    g0.a4(eVar);
                } else {
                    hVar.f();
                }
                int i12 = this.T;
                if (i12 >= 0) {
                    View m10 = this.f13344s.m(i12);
                    if (m10 != null) {
                        this.U = m10.getTop();
                    }
                    s41Var.h1(this.T, (-eVar.getPaddingTop()) + this.U);
                }
            } else if (f10 == 0.0f) {
                this.f13338b = false;
                sr0Var.setVisibility(8);
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
                ofFloat.addUpdateListener(new f4(this, 1));
                ofFloat.addListener(new v4(6, this, z10));
                ofFloat.setInterpolator(er.f34419f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i7;
        int i10;
        if (!this.f13338b && !this.f13337a0.H.F1) {
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
            this.f13340e = j3;
            if (j3 != this.d && !this.I) {
                sr0 sr0Var = this.f13343r;
                sr0Var.setVisibility(0);
                sr0Var.setAdapter(this.f13346x);
                sr0Var.setPadding(sr0Var.getPaddingLeft(), 0, sr0Var.getPaddingRight(), this.K.getMeasuredHeight() + g0.L(42.0f));
                g gVar = this.f13344s;
                gVar.y1(j3);
                sr0Var.a0();
                gVar.O = new d(this, 0);
                g0.a4(this.f13341f);
                this.f13338b = true;
                this.f13339c = 0.0f;
                int i13 = this.T;
                if (i13 >= 0) {
                    gVar.h1(i13, this.U - sr0Var.getPaddingTop());
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
        String M0;
        ai.q qVar;
        int i11 = this.f13337a0.f13353b;
        c6 c6Var = this.f13336a;
        int i12 = 0;
        if (c6Var == null) {
            size = 0;
        } else {
            size = c6Var.f11944i.size();
        }
        c6 c6Var2 = this.f13336a;
        if (c6Var2 != null && !TextUtils.isEmpty(c6Var2.E)) {
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
            a02 = hd.M0(2131746695, null);
        } else {
            a02 = hd.a0(null, null, 2131746694, p21.O0(this.f13336a.E, null, null));
        }
        String M02 = hd.M0(2131746715, null);
        c1 c1Var = new c1(this, 22);
        if (!z10 && size > 0) {
            M0 = null;
        } else {
            if (z10) {
                i10 = 2131746697;
            } else {
                i10 = 2131746696;
            }
            M0 = hd.M0(i10, null);
        }
        if (!z10 && size > 0) {
            qVar = null;
        } else {
            qVar = new ai.q(5, this, z10);
        }
        j jVar = (j) aVar.d;
        hi.d dVar = (hi.d) aVar.f1057e;
        ((TextView) aVar.f1055b).setText(a02);
        s sVar = (s) aVar.f1056c;
        sVar.i(M02, false, true);
        sVar.setOnClickListener(new ah.d(c1Var, 25));
        if (M0 == null) {
            jVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            jVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.i(M0, false, true);
            dVar.setOnClickListener(new d0(2, qVar));
        }
        j jVar2 = this.F;
        hi.d dVar2 = this.G;
        cv0 cv0Var = this.E;
        if (z10) {
            cv0Var.d.setVisibility(0);
            cv0Var.d.setText(hd.M0(2131746698, null));
            cv0Var.f33709e.setText(hd.G(np.s1(i11).U5, "ProfileBotPreviewEmptyText", new Object[0]));
            cv0Var.f33710f.i(hd.M0(2131746702, null), false, true);
            jVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            cv0Var.d.setVisibility(8);
            cv0Var.f33709e.setText(hd.a0(null, null, 2131746694, p21.O0(this.f13336a.E, null, null)));
            cv0Var.f33710f.i(hd.M0(2131746702, null), false, true);
            jVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.i(hd.M0(2131746696, null), false, true);
            dVar2.setOnClickListener(new b(this, 1));
        }
        hi.d dVar3 = cv0Var.f33710f;
        if (this.f13345w.b() >= np.s1(i11).U5) {
            i12 = 8;
        }
        dVar3.setVisibility(i12);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f13343r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        e eVar = this.f13341f;
        eVar.setPadding(eVar.getPaddingLeft(), eVar.f39397f3, eVar.getPaddingRight(), this.K.getMeasuredHeight() + g0.L(42.0f));
    }

    public void setList(c6 c6Var) {
        if (this.f13336a != c6Var) {
            this.I = false;
            this.J = false;
            this.d = this.f13337a0.E;
        }
        this.f13336a = c6Var;
        h hVar = this.f13345w;
        hVar.f13330e = c6Var;
        if (hVar != hVar.f13334s.f13346x) {
            hVar.M();
        }
        hVar.f();
        l lVar = this.f13346x;
        lVar.f13330e = c6Var;
        if (lVar != lVar.f13334s.f13346x) {
            lVar.M();
        }
        lVar.f();
        c();
    }

    public void setVisibleHeight(int i7) {
        float f10 = (-(getMeasuredHeight() - Math.max(i7, g0.L(280.0f)))) / 2.0f;
        this.E.setTranslationY(f10);
        this.f13347y.setTranslationY(-f10);
    }
}
