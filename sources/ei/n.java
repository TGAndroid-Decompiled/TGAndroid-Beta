package ei;

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
import bi.k1;
import bi.w;
import bi.z6;
import c8.ha;
import di.f8;
import di.k6;
import di.n4;
import di.r4;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.l21;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.d61;
import v4.y;
public final class n extends FrameLayout {
    public static final int f10828a0 = 0;
    public final cv0 D;
    public final k E;
    public final fi.d F;
    public final y G;
    public boolean H;
    public boolean I;
    public final ah.a J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public float P;
    public float Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public final Rect V;
    public final tp0 W;
    public k6 f10829a;
    public boolean f10830b;
    public float f10831c;
    public int d;
    public int f10832e;
    public final f f10833f;
    public final p41 h;
    public final v4.k f10834n;
    public final tr0 f10835r;
    public final h f10836s;
    public final i f10837w;
    public final m f10838x;
    public final j f10839y;

    public n(tp0 tp0Var, Context context) {
        super(context);
        this.W = tp0Var;
        this.d = Utilities.j(iz.f23442u1, 6, 2);
        this.f10832e = Utilities.j(iz.f23442u1, 6, 2);
        this.H = false;
        this.I = false;
        this.V = new Rect();
        p41 p41Var = new p41();
        this.h = p41Var;
        p41Var.O = new e(this, 1);
        p41Var.y1(this.d);
        v4.k kVar = new v4.k();
        this.f10834n = kVar;
        kVar.n(280L);
        kVar.o(xq.h);
        kVar.f57083m = false;
        f fVar = new f(this, context);
        this.f10833f = fVar;
        fVar.setScrollingTouchSlop(1);
        fVar.setPinnedSectionOffsetY(-g0.L(2.0f));
        fVar.setPadding(0, 0, 0, 0);
        fVar.setItemAnimator(null);
        fVar.setClipToPadding(false);
        fVar.setSectionsType(2);
        fVar.setLayoutManager(p41Var);
        addView(fVar, ha.c(-1.0f, -1));
        fVar.i(new g(this, 0));
        fVar.setOnItemClickListener(new ai.k(this, 6));
        fVar.setOnItemLongClickListener(new r4(this, 7));
        ?? qj0Var = new qj0(context, null);
        this.f10835r = qj0Var;
        h hVar = new h(0, this);
        this.f10836s = hVar;
        qj0Var.setLayoutManager(hVar);
        qj0Var.i(new g(this, 1));
        hVar.y1(this.f10832e);
        qj0Var.setVisibility(8);
        addView((View) qj0Var, ha.c(-1.0f, -1));
        i iVar = new i(this, context);
        this.f10837w = iVar;
        fVar.setAdapter(iVar);
        m mVar = new m(this, getContext());
        iVar.f10824f = mVar;
        this.f10838x = mVar;
        qj0Var.setAdapter(mVar);
        j jVar = new j(this, context);
        this.f10839y = jVar;
        jVar.f36181x = false;
        cv0 cv0Var = new cv0(context, jVar, 1, null);
        this.D = cv0Var;
        cv0Var.setVisibility(8);
        cv0Var.setAnimateLayoutChange(true);
        addView(cv0Var, ha.c(-1.0f, -1));
        cv0Var.setOnTouchListener(new b(0));
        cv0Var.e(true, false);
        cv0Var.f32766b.setVisibility(8);
        cv0Var.d.setText(id.M0(2131746698, null));
        cv0Var.f32768e.setText(id.G(qp.s1(tp0Var.f10845b).T5, "ProfileBotPreviewEmptyText", new Object[0]));
        String M0 = id.M0(2131746702, null);
        fi.d dVar = cv0Var.f32769f;
        dVar.i(M0, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new c(this, 0));
        k kVar2 = new k(this, context);
        this.E = kVar2;
        int i7 = l6.f28257y6;
        g6 g6Var = tp0Var.f10846c;
        s6.U(kVar2, i7, g6Var);
        kVar2.setText(id.M0(2131746703, null));
        kVar2.setTextSize(1, 14.0f);
        kVar2.setTextAlignment(4);
        kVar2.setGravity(17);
        kVar2.setTypeface(g0.o());
        LinearLayout.LayoutParams t6 = ha.t(165, -2, 17, 0, 17, 0, 12);
        d61 d61Var = cv0Var.f32765a;
        d61Var.addView(kVar2, t6);
        fi.d dVar2 = new fi.d(context, g6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(g0.L(200.0f));
        d61Var.addView(dVar2, ha.r(-2, 44, 17));
        cv0Var.addView(jVar, 0, ha.c(-1.0f, -1));
        fVar.setEmptyView(cv0Var);
        fVar.W1 = true;
        fVar.X1 = 0;
        new SparseArray();
        new HashMap();
        y yVar = new y(new d(this, 0));
        this.G = yVar;
        yVar.h(fVar);
        ah.a aVar = new ah.a(context, g6Var);
        this.J = aVar;
        addView(aVar, ha.e(-1, -2, 48));
    }

    public final void a() {
        boolean z9;
        if (this.f10830b) {
            float f10 = this.f10831c;
            float f11 = 1.0f;
            int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            tr0 tr0Var = this.f10835r;
            f fVar = this.f10833f;
            if (i7 == 0) {
                this.f10830b = false;
                int i10 = this.f10832e;
                this.d = i10;
                this.W.D = i10;
                iz.F(i10);
                i iVar = this.f10837w;
                int b10 = iVar.b();
                tr0Var.setVisibility(8);
                int i11 = this.d;
                p41 p41Var = this.h;
                p41Var.y1(i11);
                fVar.a0();
                fVar.invalidate();
                if (iVar.b() == b10) {
                    g0.b4(fVar);
                } else {
                    iVar.f();
                }
                int i12 = this.S;
                if (i12 >= 0) {
                    View m10 = this.f10836s.m(i12);
                    if (m10 != null) {
                        this.T = m10.getTop();
                    }
                    p41Var.h1(this.S, (-fVar.getPaddingTop()) + this.T);
                }
            } else if (f10 == 0.0f) {
                this.f10830b = false;
                tr0Var.setVisibility(8);
                fVar.invalidate();
            } else {
                if (f10 > 0.2f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
                ofFloat.addUpdateListener(new n4(this, 1));
                ofFloat.addListener(new ch.y(5, this, z9));
                ofFloat.setInterpolator(xq.f40458f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z9) {
        int i7;
        int i10;
        if (!this.f10830b && !this.W.G.E1) {
            int i11 = this.d;
            if (!z9) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            int i12 = i11 + i7;
            if (i12 > 6) {
                if (!z9) {
                    i12 = 9;
                } else {
                    i12 = 6;
                }
            }
            if (this.H) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            int j3 = Utilities.j(i12, 6, i10);
            this.f10832e = j3;
            if (j3 != this.d && !this.H) {
                tr0 tr0Var = this.f10835r;
                tr0Var.setVisibility(0);
                tr0Var.setAdapter(this.f10838x);
                tr0Var.setPadding(tr0Var.getPaddingLeft(), 0, tr0Var.getPaddingRight(), this.J.getMeasuredHeight() + g0.L(42.0f));
                h hVar = this.f10836s;
                hVar.y1(j3);
                tr0Var.a0();
                hVar.O = new e(this, 0);
                g0.b4(this.f10833f);
                this.f10830b = true;
                this.f10831c = 0.0f;
                int i13 = this.S;
                if (i13 >= 0) {
                    hVar.h1(i13, this.T - tr0Var.getPaddingTop());
                }
            }
        }
    }

    public final void c() {
        int size;
        boolean z9;
        int i7;
        String a02;
        int i10;
        String M0;
        k1 k1Var;
        int i11 = this.W.f10845b;
        k6 k6Var = this.f10829a;
        int i12 = 0;
        if (k6Var == null) {
            size = 0;
        } else {
            size = k6Var.f9694i.size();
        }
        k6 k6Var2 = this.f10829a;
        if (k6Var2 != null && !TextUtils.isEmpty(k6Var2.E)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (size > 0) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        ah.a aVar = this.J;
        aVar.setVisibility(i7);
        if (z9) {
            a02 = id.M0(2131746695, null);
        } else {
            a02 = id.a0(null, null, 2131746694, l21.O0(this.f10829a.E, null, null));
        }
        String M02 = id.M0(2131746715, null);
        f8 f8Var = new f8(this, 8);
        if (!z9 && size > 0) {
            M0 = null;
        } else {
            if (z9) {
                i10 = 2131746697;
            } else {
                i10 = 2131746696;
            }
            M0 = id.M0(i10, null);
        }
        if (!z9 && size > 0) {
            k1Var = null;
        } else {
            k1Var = new k1(4, this, z9);
        }
        k kVar = (k) aVar.d;
        fi.d dVar = (fi.d) aVar.f1059e;
        ((TextView) aVar.f1057b).setText(a02);
        w wVar = (w) aVar.f1058c;
        wVar.i(M02, false, true);
        wVar.setOnClickListener(new ah.d(f8Var, 19));
        if (M0 == null) {
            kVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            kVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.i(M0, false, true);
            dVar.setOnClickListener(new z6(1, k1Var));
        }
        k kVar2 = this.E;
        fi.d dVar2 = this.F;
        cv0 cv0Var = this.D;
        if (z9) {
            cv0Var.d.setVisibility(0);
            cv0Var.d.setText(id.M0(2131746698, null));
            cv0Var.f32768e.setText(id.G(qp.s1(i11).T5, "ProfileBotPreviewEmptyText", new Object[0]));
            cv0Var.f32769f.i(id.M0(2131746702, null), false, true);
            kVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            cv0Var.d.setVisibility(8);
            cv0Var.f32768e.setText(id.a0(null, null, 2131746694, l21.O0(this.f10829a.E, null, null)));
            cv0Var.f32769f.i(id.M0(2131746702, null), false, true);
            kVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.i(id.M0(2131746696, null), false, true);
            dVar2.setOnClickListener(new c(this, 1));
        }
        fi.d dVar3 = cv0Var.f32769f;
        if (this.f10837w.b() >= qp.s1(i11).T5) {
            i12 = 8;
        }
        dVar3.setVisibility(i12);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f10835r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        f fVar = this.f10833f;
        fVar.setPadding(fVar.getPaddingLeft(), fVar.f38476e3, fVar.getPaddingRight(), this.J.getMeasuredHeight() + g0.L(42.0f));
    }

    public void setList(k6 k6Var) {
        if (this.f10829a != k6Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.D;
        }
        this.f10829a = k6Var;
        i iVar = this.f10837w;
        iVar.f10823e = k6Var;
        if (iVar != iVar.f10827s.f10838x) {
            iVar.M();
        }
        iVar.f();
        m mVar = this.f10838x;
        mVar.f10823e = k6Var;
        if (mVar != mVar.f10827s.f10838x) {
            mVar.M();
        }
        mVar.f();
        c();
    }

    public void setVisibleHeight(int i7) {
        float f10 = (-(getMeasuredHeight() - Math.max(i7, g0.L(280.0f)))) / 2.0f;
        this.D.setTranslationY(f10);
        this.f10839y.setTranslationY(-f10);
    }
}
