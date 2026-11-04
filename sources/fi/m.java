package fi;

import ai.j0;
import ai.j6;
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
import b8.mf;
import ci.e1;
import dh.x;
import ei.k6;
import ei.n4;
import ei.y8;
import ei.z5;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.qr0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.s51;
import u4.y;
public final class m extends FrameLayout {
    public static final int f11614b0 = 0;
    public final zu0 E;
    public final j F;
    public final gi.d G;
    public final y H;
    public boolean I;
    public boolean J;
    public final bh.a K;
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
    public k6 f11615a;
    public final tp0 f11616a0;
    public boolean f11617b;
    public float f11618c;
    public int d;
    public int f11619e;
    public final e f11620f;
    public final j41 h;
    public final u4.k f11621n;
    public final qr0 f11622r;
    public final g f11623s;
    public final h f11624w;
    public final l f11625x;
    public final i f11626y;

    public m(tp0 tp0Var, Context context) {
        super(context);
        this.f11616a0 = tp0Var;
        this.d = Utilities.j(az.f21669u1, 6, 2);
        this.f11619e = Utilities.j(az.f21669u1, 6, 2);
        this.I = false;
        this.J = false;
        this.W = new Rect();
        j41 j41Var = new j41();
        this.h = j41Var;
        j41Var.O = new d(this, 1);
        j41Var.y1(this.d);
        u4.k kVar = new u4.k();
        this.f11621n = kVar;
        kVar.n(280L);
        kVar.o(xq.h);
        kVar.f55567m = false;
        e eVar = new e(this, context);
        this.f11620f = eVar;
        eVar.setScrollingTouchSlop(1);
        eVar.setPinnedSectionOffsetY(-g0.L(2.0f));
        eVar.setPadding(0, 0, 0, 0);
        eVar.setItemAnimator(null);
        eVar.setClipToPadding(false);
        eVar.setSectionsType(2);
        eVar.setLayoutManager(j41Var);
        addView(eVar, mf.c(-1.0f, -1));
        eVar.i(new f(this, 0));
        eVar.setOnItemClickListener(new j6(this, 7));
        eVar.setOnItemLongClickListener(new y8(this, 3));
        ?? tj0Var = new tj0(context, null);
        this.f11622r = tj0Var;
        g gVar = new g(0, this);
        this.f11623s = gVar;
        tj0Var.setLayoutManager(gVar);
        tj0Var.i(new f(this, 1));
        gVar.y1(this.f11619e);
        tj0Var.setVisibility(8);
        addView((View) tj0Var, mf.c(-1.0f, -1));
        h hVar = new h(this, context);
        this.f11624w = hVar;
        eVar.setAdapter(hVar);
        l lVar = new l(this, getContext());
        hVar.f11610f = lVar;
        this.f11625x = lVar;
        tj0Var.setAdapter(lVar);
        i iVar = new i(this, context);
        this.f11626y = iVar;
        iVar.f34869x = false;
        zu0 zu0Var = new zu0(context, iVar, 1, null);
        this.E = zu0Var;
        zu0Var.setVisibility(8);
        zu0Var.setAnimateLayoutChange(true);
        addView(zu0Var, mf.c(-1.0f, -1));
        zu0Var.setOnTouchListener(new a(0));
        zu0Var.e(true, false);
        zu0Var.f41126b.setVisibility(8);
        zu0Var.d.setText(bd.M0(2131746706, null));
        zu0Var.f41128e.setText(bd.G(hp.s1(tp0Var.f11632b).T5, "ProfileBotPreviewEmptyText", new Object[0]));
        String M0 = bd.M0(2131746710, null);
        gi.d dVar = zu0Var.f41129f;
        dVar.i(M0, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new b(this, 0));
        j jVar = new j(this, context);
        this.F = jVar;
        int i3 = org.telegram.ui.ActionBar.k6.f28273y6;
        e6 e6Var = tp0Var.f11633c;
        r6.V(jVar, i3, e6Var);
        jVar.setText(bd.M0(2131746711, null));
        jVar.setTextSize(1, 14.0f);
        jVar.setTextAlignment(4);
        jVar.setGravity(17);
        jVar.setTypeface(g0.o());
        LinearLayout.LayoutParams t10 = mf.t(165, -2, 17, 0, 17, 0, 12);
        s51 s51Var = zu0Var.f41125a;
        s51Var.addView(jVar, t10);
        gi.d dVar2 = new gi.d(context, e6Var, false);
        this.G = dVar2;
        dVar2.setMinWidth(g0.L(200.0f));
        s51Var.addView(dVar2, mf.r(-2, 44, 17));
        zu0Var.addView(iVar, 0, mf.c(-1.0f, -1));
        eVar.setEmptyView(zu0Var);
        eVar.X1 = true;
        eVar.Y1 = 0;
        new SparseArray();
        new HashMap();
        y yVar = new y(new c(this, 0));
        this.H = yVar;
        yVar.h(eVar);
        bh.a aVar = new bh.a(context, e6Var);
        this.K = aVar;
        addView(aVar, mf.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f11617b) {
            float f10 = this.f11618c;
            float f11 = 1.0f;
            int i3 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            qr0 qr0Var = this.f11622r;
            e eVar = this.f11620f;
            if (i3 == 0) {
                this.f11617b = false;
                int i10 = this.f11619e;
                this.d = i10;
                this.f11616a0.E = i10;
                az.F(i10);
                h hVar = this.f11624w;
                int b10 = hVar.b();
                qr0Var.setVisibility(8);
                int i11 = this.d;
                j41 j41Var = this.h;
                j41Var.y1(i11);
                eVar.a0();
                eVar.invalidate();
                if (hVar.b() == b10) {
                    g0.b4(eVar);
                } else {
                    hVar.f();
                }
                int i12 = this.T;
                if (i12 >= 0) {
                    View m10 = this.f11623s.m(i12);
                    if (m10 != null) {
                        this.U = m10.getTop();
                    }
                    j41Var.h1(this.T, (-eVar.getPaddingTop()) + this.U);
                }
            } else if (f10 == 0.0f) {
                this.f11617b = false;
                qr0Var.setVisibility(8);
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
                ofFloat.addUpdateListener(new n4(this, 1));
                ofFloat.addListener(new x(6, this, z10));
                ofFloat.setInterpolator(xq.f40452f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i3;
        int i10;
        if (!this.f11617b && !this.f11616a0.H.F1) {
            int i11 = this.d;
            if (!z10) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            int i12 = i11 + i3;
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
            int j10 = Utilities.j(i12, 6, i10);
            this.f11619e = j10;
            if (j10 != this.d && !this.I) {
                qr0 qr0Var = this.f11622r;
                qr0Var.setVisibility(0);
                qr0Var.setAdapter(this.f11625x);
                qr0Var.setPadding(qr0Var.getPaddingLeft(), 0, qr0Var.getPaddingRight(), this.K.getMeasuredHeight() + g0.L(42.0f));
                g gVar = this.f11623s;
                gVar.y1(j10);
                qr0Var.a0();
                gVar.O = new d(this, 0);
                g0.b4(this.f11620f);
                this.f11617b = true;
                this.f11618c = 0.0f;
                int i13 = this.T;
                if (i13 >= 0) {
                    gVar.h1(i13, this.U - qr0Var.getPaddingTop());
                }
            }
        }
    }

    public final void c() {
        int size;
        boolean z10;
        int i3;
        String a02;
        int i10;
        String M0;
        e1 e1Var;
        int i11 = this.f11616a0.f11632b;
        k6 k6Var = this.f11615a;
        int i12 = 0;
        if (k6Var == null) {
            size = 0;
        } else {
            size = k6Var.f10876i.size();
        }
        k6 k6Var2 = this.f11615a;
        if (k6Var2 != null && !TextUtils.isEmpty(k6Var2.E)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (size > 0) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        bh.a aVar = this.K;
        aVar.setVisibility(i3);
        if (z10) {
            a02 = bd.M0(2131746703, null);
        } else {
            a02 = bd.a0(null, null, 2131746702, f21.O0(this.f11615a.E, null, null));
        }
        String M02 = bd.M0(2131746723, null);
        z5 z5Var = new z5(this, 14);
        if (!z10 && size > 0) {
            M0 = null;
        } else {
            if (z10) {
                i10 = 2131746705;
            } else {
                i10 = 2131746704;
            }
            M0 = bd.M0(i10, null);
        }
        if (!z10 && size > 0) {
            e1Var = null;
        } else {
            e1Var = new e1(4, this, z10);
        }
        j jVar = (j) aVar.d;
        gi.d dVar = (gi.d) aVar.f3301e;
        ((TextView) aVar.f3299b).setText(a02);
        ai.x xVar = (ai.x) aVar.f3300c;
        xVar.i(M02, false, true);
        xVar.setOnClickListener(new ai.b(z5Var, 22));
        if (M0 == null) {
            jVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            jVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.i(M0, false, true);
            dVar.setOnClickListener(new j0(2, e1Var));
        }
        j jVar2 = this.F;
        gi.d dVar2 = this.G;
        zu0 zu0Var = this.E;
        if (z10) {
            zu0Var.d.setVisibility(0);
            zu0Var.d.setText(bd.M0(2131746706, null));
            zu0Var.f41128e.setText(bd.G(hp.s1(i11).T5, "ProfileBotPreviewEmptyText", new Object[0]));
            zu0Var.f41129f.i(bd.M0(2131746710, null), false, true);
            jVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            zu0Var.d.setVisibility(8);
            zu0Var.f41128e.setText(bd.a0(null, null, 2131746702, f21.O0(this.f11615a.E, null, null)));
            zu0Var.f41129f.i(bd.M0(2131746710, null), false, true);
            jVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.i(bd.M0(2131746704, null), false, true);
            dVar2.setOnClickListener(new b(this, 1));
        }
        gi.d dVar3 = zu0Var.f41129f;
        if (this.f11624w.b() >= hp.s1(i11).T5) {
            i12 = 8;
        }
        dVar3.setVisibility(i12);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f11622r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        e eVar = this.f11620f;
        eVar.setPadding(eVar.getPaddingLeft(), eVar.f37515f3, eVar.getPaddingRight(), this.K.getMeasuredHeight() + g0.L(42.0f));
    }

    public void setList(k6 k6Var) {
        if (this.f11615a != k6Var) {
            this.I = false;
            this.J = false;
            this.d = this.f11616a0.E;
        }
        this.f11615a = k6Var;
        h hVar = this.f11624w;
        hVar.f11609e = k6Var;
        if (hVar != hVar.f11613s.f11625x) {
            hVar.M();
        }
        hVar.f();
        l lVar = this.f11625x;
        lVar.f11609e = k6Var;
        if (lVar != lVar.f11613s.f11625x) {
            lVar.M();
        }
        lVar.f();
        c();
    }

    public void setVisibleHeight(int i3) {
        float f10 = (-(getMeasuredHeight() - Math.max(i3, g0.L(280.0f)))) / 2.0f;
        this.E.setTranslationY(f10);
        this.f11626y.setTranslationY(-f10);
    }
}
