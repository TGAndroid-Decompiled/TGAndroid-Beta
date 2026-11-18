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
import bi.d7;
import bi.h8;
import bi.s;
import c8.ma;
import di.c7;
import fi.d4;
import fi.z5;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.y21;
import org.telegram.ui.d61;
import v4.z;
public final class m extends FrameLayout {
    public static final int f13647b0 = 0;
    public final kv0 E;
    public final j F;
    public final hi.d G;
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
    public z5 f13648a;
    public final dq0 f13649a0;
    public boolean f13650b;
    public float f13651c;
    public int d;
    public int f13652e;
    public final e f13653f;
    public final c51 h;
    public final v4.k f13654n;
    public final as0 f13655r;
    public final g f13656s;
    public final h f13657w;
    public final l f13658x;
    public final i f13659y;

    public m(dq0 dq0Var, Context context) {
        super(context);
        this.f13649a0 = dq0Var;
        this.d = Utilities.j(bz.f23202u1, 6, 2);
        this.f13652e = Utilities.j(bz.f23202u1, 6, 2);
        this.I = false;
        this.J = false;
        this.W = new Rect();
        c51 c51Var = new c51();
        this.h = c51Var;
        c51Var.O = new d(this, 1);
        c51Var.y1(this.d);
        v4.k kVar = new v4.k();
        this.f13654n = kVar;
        kVar.n(280L);
        kVar.o(lr.h);
        kVar.f59152m = false;
        e eVar = new e(this, context);
        this.f13653f = eVar;
        eVar.setScrollingTouchSlop(1);
        eVar.setPinnedSectionOffsetY(-g0.L(2.0f));
        eVar.setPadding(0, 0, 0, 0);
        eVar.setItemAnimator(null);
        eVar.setClipToPadding(false);
        eVar.setSectionsType(2);
        eVar.setLayoutManager(c51Var);
        addView(eVar, ma.c(-1.0f, -1));
        eVar.i(new f(this, 0));
        eVar.setOnItemClickListener(new h8(this, 7));
        eVar.setOnItemLongClickListener(new c7(this, 14));
        ?? ck0Var = new ck0(context, null);
        this.f13655r = ck0Var;
        g gVar = new g(0, this);
        this.f13656s = gVar;
        ck0Var.setLayoutManager(gVar);
        ck0Var.i(new f(this, 1));
        gVar.y1(this.f13652e);
        ck0Var.setVisibility(8);
        addView((View) ck0Var, ma.c(-1.0f, -1));
        h hVar = new h(this, context);
        this.f13657w = hVar;
        eVar.setAdapter(hVar);
        l lVar = new l(this, getContext());
        hVar.f13643f = lVar;
        this.f13658x = lVar;
        ck0Var.setAdapter(lVar);
        i iVar = new i(this, context);
        this.f13659y = iVar;
        iVar.f41829x = false;
        kv0 kv0Var = new kv0(context, iVar, 1, null);
        this.E = kv0Var;
        kv0Var.setVisibility(8);
        kv0Var.setAnimateLayoutChange(true);
        addView(kv0Var, ma.c(-1.0f, -1));
        kv0Var.setOnTouchListener(new a(0));
        kv0Var.e(true, false);
        kv0Var.f36894b.setVisibility(8);
        kv0Var.d.setText(gd.M0(2131746503, null));
        kv0Var.f36896e.setText(gd.G(mp.u1(dq0Var.f13665b).W5, "ProfileBotPreviewEmptyText", new Object[0]));
        String M0 = gd.M0(2131746507, null);
        hi.d dVar = kv0Var.f36897f;
        dVar.i(M0, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new b(this, 0));
        j jVar = new j(this, context);
        this.F = jVar;
        int i7 = n6.f29786y6;
        i6 i6Var = dq0Var.f13666c;
        u6.U(jVar, i7, i6Var);
        jVar.setText(gd.M0(2131746508, null));
        jVar.setTextSize(1, 14.0f);
        jVar.setTextAlignment(4);
        jVar.setGravity(17);
        jVar.setTypeface(g0.o());
        LinearLayout.LayoutParams t6 = ma.t(165, -2, 17, 0, 17, 0, 12);
        d61 d61Var = kv0Var.f36893a;
        d61Var.addView(jVar, t6);
        hi.d dVar2 = new hi.d(context, i6Var, false);
        this.G = dVar2;
        dVar2.setMinWidth(g0.L(200.0f));
        d61Var.addView(dVar2, ma.r(-2, 44, 17));
        kv0Var.addView(iVar, 0, ma.c(-1.0f, -1));
        eVar.setEmptyView(kv0Var);
        eVar.X1 = true;
        eVar.Y1 = 0;
        new SparseArray();
        new HashMap();
        z zVar = new z(new c(this, 0));
        this.H = zVar;
        zVar.h(eVar);
        ah.a aVar = new ah.a(context, i6Var);
        this.K = aVar;
        addView(aVar, ma.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f13650b) {
            float f10 = this.f13651c;
            float f11 = 1.0f;
            int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            as0 as0Var = this.f13655r;
            e eVar = this.f13653f;
            if (i7 == 0) {
                this.f13650b = false;
                int i10 = this.f13652e;
                this.d = i10;
                this.f13649a0.E = i10;
                bz.F(i10);
                h hVar = this.f13657w;
                int b10 = hVar.b();
                as0Var.setVisibility(8);
                int i11 = this.d;
                c51 c51Var = this.h;
                c51Var.y1(i11);
                eVar.a0();
                eVar.invalidate();
                if (hVar.b() == b10) {
                    g0.Z3(eVar);
                } else {
                    hVar.f();
                }
                int i12 = this.T;
                if (i12 >= 0) {
                    View m10 = this.f13656s.m(i12);
                    if (m10 != null) {
                        this.U = m10.getTop();
                    }
                    c51Var.h1(this.T, (-eVar.getPaddingTop()) + this.U);
                }
            } else if (f10 == 0.0f) {
                this.f13650b = false;
                as0Var.setVisibility(8);
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
                ofFloat.addListener(new d7(6, this, z10));
                ofFloat.setInterpolator(lr.f37208f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i7;
        int i10;
        if (!this.f13650b && !this.f13649a0.H.F1) {
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
            this.f13652e = j3;
            if (j3 != this.d && !this.I) {
                as0 as0Var = this.f13655r;
                as0Var.setVisibility(0);
                as0Var.setAdapter(this.f13658x);
                as0Var.setPadding(as0Var.getPaddingLeft(), 0, as0Var.getPaddingRight(), this.K.getMeasuredHeight() + g0.L(42.0f));
                g gVar = this.f13656s;
                gVar.y1(j3);
                as0Var.a0();
                gVar.O = new d(this, 0);
                g0.Z3(this.f13653f);
                this.f13650b = true;
                this.f13651c = 0.0f;
                int i13 = this.T;
                if (i13 >= 0) {
                    gVar.h1(i13, this.U - as0Var.getPaddingTop());
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
        ch.k kVar;
        int i11 = this.f13649a0.f13665b;
        z5 z5Var = this.f13648a;
        int i12 = 0;
        if (z5Var == null) {
            size = 0;
        } else {
            size = z5Var.f12045i.size();
        }
        z5 z5Var2 = this.f13648a;
        if (z5Var2 != null && !TextUtils.isEmpty(z5Var2.E)) {
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
            a02 = gd.M0(2131746500, null);
        } else {
            a02 = gd.a0(null, null, 2131746499, y21.P0(this.f13648a.E, null, null));
        }
        String M02 = gd.M0(2131746522, null);
        f2.a aVar2 = new f2.a(this, 26);
        if (!z10 && size > 0) {
            M0 = null;
        } else {
            if (z10) {
                i10 = 2131746502;
            } else {
                i10 = 2131746501;
            }
            M0 = gd.M0(i10, null);
        }
        if (!z10 && size > 0) {
            kVar = null;
        } else {
            kVar = new ch.k(4, this, z10);
        }
        j jVar = (j) aVar.d;
        hi.d dVar = (hi.d) aVar.f1056e;
        ((TextView) aVar.f1054b).setText(a02);
        s sVar = (s) aVar.f1055c;
        sVar.i(M02, false, true);
        sVar.setOnClickListener(new ah.d(aVar2, 27));
        if (M0 == null) {
            jVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            jVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.i(M0, false, true);
            dVar.setOnClickListener(new d0(2, kVar));
        }
        j jVar2 = this.F;
        hi.d dVar2 = this.G;
        kv0 kv0Var = this.E;
        if (z10) {
            kv0Var.d.setVisibility(0);
            kv0Var.d.setText(gd.M0(2131746503, null));
            kv0Var.f36896e.setText(gd.G(mp.u1(i11).W5, "ProfileBotPreviewEmptyText", new Object[0]));
            kv0Var.f36897f.i(gd.M0(2131746507, null), false, true);
            jVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            kv0Var.d.setVisibility(8);
            kv0Var.f36896e.setText(gd.a0(null, null, 2131746499, y21.P0(this.f13648a.E, null, null)));
            kv0Var.f36897f.i(gd.M0(2131746507, null), false, true);
            jVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.i(gd.M0(2131746501, null), false, true);
            dVar2.setOnClickListener(new b(this, 1));
        }
        hi.d dVar3 = kv0Var.f36897f;
        if (this.f13657w.b() >= mp.u1(i11).W5) {
            i12 = 8;
        }
        dVar3.setVisibility(i12);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f13655r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        e eVar = this.f13653f;
        eVar.setPadding(eVar.getPaddingLeft(), eVar.f33440f3, eVar.getPaddingRight(), this.K.getMeasuredHeight() + g0.L(42.0f));
    }

    public void setList(z5 z5Var) {
        if (this.f13648a != z5Var) {
            this.I = false;
            this.J = false;
            this.d = this.f13649a0.E;
        }
        this.f13648a = z5Var;
        h hVar = this.f13657w;
        hVar.f13642e = z5Var;
        if (hVar != hVar.f13646s.f13658x) {
            hVar.M();
        }
        hVar.f();
        l lVar = this.f13658x;
        lVar.f13642e = z5Var;
        if (lVar != lVar.f13646s.f13658x) {
            lVar.M();
        }
        lVar.f();
        c();
    }

    public void setVisibleHeight(int i7) {
        float f10 = (-(getMeasuredHeight() - Math.max(i7, g0.L(280.0f)))) / 2.0f;
        this.E.setTranslationY(f10);
        this.f13659y.setTranslationY(-f10);
    }
}
