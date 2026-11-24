package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
public final class gs0 extends FrameLayout {
    public final a1b E;
    public final t8 F;
    public final b61 G;
    public final hu5 H;
    public boolean I;
    public boolean J;
    public final ds0 K;
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
    public t3b a;
    public final kea a0;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final yr0 f;
    public final o7c h;
    public final sc3 n;
    public final hga r;
    public final as0 s;
    public final bs0 w;
    public final fs0 x;
    public final cs0 y;

    public gs0(kea keaVar, Context context) {
        super(context);
        this.a0 = keaVar;
        this.d = Utilities.j(gda.q1, 6, 2);
        this.e = Utilities.j(gda.q1, 6, 2);
        this.I = false;
        this.J = false;
        this.W = new Rect();
        o7c o7cVar = new o7c();
        this.h = o7cVar;
        o7cVar.O = new xr0(this, (byte) 1);
        o7cVar.x1(this.d);
        sc3 sc3Var = new sc3();
        this.n = sc3Var;
        sc3Var.n(280L);
        sc3Var.o(d53.h);
        sc3Var.m = false;
        yr0 yr0Var = new yr0(this, context);
        this.f = yr0Var;
        yr0Var.setScrollingTouchSlop(1);
        yr0Var.setPinnedSectionOffsetY(-gm.L(2.0f));
        yr0Var.setPadding(0, 0, 0, 0);
        yr0Var.setItemAnimator(null);
        yr0Var.setClipToPadding(false);
        yr0Var.setSectionsType(2);
        yr0Var.setLayoutManager(o7cVar);
        addView(yr0Var, qoe.c(-1.0f, -1));
        yr0Var.i(new zr0(this, (byte) 0));
        yr0Var.setOnItemClickListener(new u(this, (byte) 8));
        yr0Var.setOnItemLongClickListener(new xg0(this, (byte) 12));
        ?? r59Var = new r59(context, null);
        this.r = r59Var;
        as0 as0Var = new as0(this, (byte) 0);
        this.s = as0Var;
        r59Var.setLayoutManager(as0Var);
        r59Var.i(new zr0(this, (byte) 1));
        as0Var.x1(this.e);
        r59Var.setVisibility(8);
        addView((View) r59Var, qoe.c(-1.0f, -1));
        bs0 bs0Var = new bs0(this, context);
        this.w = bs0Var;
        yr0Var.setAdapter(bs0Var);
        fs0 fs0Var = new fs0(this, getContext());
        bs0Var.f = fs0Var;
        this.x = fs0Var;
        r59Var.setAdapter(fs0Var);
        cs0 cs0Var = new cs0(this, context);
        this.y = cs0Var;
        cs0Var.x = false;
        a1b a1bVar = new a1b(context, cs0Var, 1, null);
        this.E = a1bVar;
        a1bVar.setVisibility(8);
        a1bVar.setAnimateLayoutChange(true);
        addView(a1bVar, qoe.c(-1.0f, -1));
        a1bVar.setOnTouchListener(new p8((byte) 18));
        a1bVar.e(true, false);
        a1bVar.b.setVisibility(8);
        a1bVar.d.setText(jb6.M0(2131746431, null));
        a1bVar.e.setText(jb6.G(oc7.r1(keaVar.b).l4.s2.f(), "ProfileBotPreviewEmptyText", new Object[0]));
        String M0 = jb6.M0(2131746435, null);
        b61 b61Var = a1bVar.f;
        b61Var.i(M0, false, true);
        b61Var.setVisibility(0);
        b61Var.setOnClickListener(new wr0(this, (byte) 0));
        t8 t8Var = new t8(this, context);
        this.F = t8Var;
        int i = cmb.x6;
        ylb ylbVar = keaVar.c;
        anb.X(t8Var, i, ylbVar);
        t8Var.setText(jb6.M0(2131746436, null));
        t8Var.setTextSize(1, 14.0f);
        t8Var.setTextAlignment(4);
        t8Var.setGravity(17);
        t8Var.setTypeface(gm.o());
        LinearLayout.LayoutParams t = qoe.t(165, -2, 17, 0, 17, 0, 12);
        qmb qmbVar = a1bVar.a;
        qmbVar.addView(t8Var, t);
        b61 b61Var2 = new b61(ylbVar, context, false);
        this.G = b61Var2;
        b61Var2.setMinWidth(gm.L(200.0f));
        qmbVar.addView(b61Var2, qoe.r(-2, 44, 17));
        a1bVar.addView(cs0Var, 0, qoe.c(-1.0f, -1));
        yr0Var.setEmptyView(a1bVar);
        yr0Var.X1 = true;
        yr0Var.Y1 = false;
        hu5 hu5Var = new hu5(new r20(this, (byte) 1));
        this.H = hu5Var;
        hu5Var.h(yr0Var);
        ds0 ds0Var = new ds0(context, ylbVar);
        this.K = ds0Var;
        addView(ds0Var, qoe.e(-1, -2, 48));
    }

    public final void a() {
        boolean z;
        if (this.b) {
            float f = this.c;
            float f2 = 1.0f;
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            hga hgaVar = this.r;
            yr0 yr0Var = this.f;
            if (i == 0) {
                this.b = false;
                int i2 = this.e;
                this.d = i2;
                this.a0.E = i2;
                gda.E(i2);
                bs0 bs0Var = this.w;
                int b = bs0Var.b();
                hgaVar.setVisibility(8);
                int i3 = this.d;
                o7c o7cVar = this.h;
                o7cVar.x1(i3);
                yr0Var.b0();
                yr0Var.invalidate();
                if (bs0Var.b() == b) {
                    gm.V3(yr0Var);
                } else {
                    bs0Var.f();
                }
                int i4 = this.T;
                if (i4 >= 0) {
                    View m = this.s.m(i4);
                    if (m != null) {
                        this.U = m.getTop();
                    }
                    o7cVar.g1(this.T, (-yr0Var.getPaddingTop()) + this.U);
                }
            } else if (f == 0.0f) {
                this.b = false;
                hgaVar.setVisibility(8);
                yr0Var.invalidate();
            } else {
                if (f > 0.2f) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    f2 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
                ofFloat.addUpdateListener(new af0(this, (byte) 1));
                ofFloat.addListener(new y7((byte) 7, this, z));
                ofFloat.setInterpolator(d53.f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z) {
        int i;
        int i2;
        if (!this.b && !this.a0.H.F1) {
            int i3 = this.d;
            if (!z) {
                i = 1;
            } else {
                i = -1;
            }
            int i4 = i3 + i;
            if (i4 > 6) {
                if (!z) {
                    i4 = 9;
                } else {
                    i4 = 6;
                }
            }
            if (this.I) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            int j = Utilities.j(i4, 6, i2);
            this.e = j;
            if (j != this.d && !this.I) {
                hga hgaVar = this.r;
                hgaVar.setVisibility(0);
                hgaVar.setAdapter(this.x);
                hgaVar.setPadding(hgaVar.getPaddingLeft(), 0, hgaVar.getPaddingRight(), this.K.getMeasuredHeight() + gm.L(42.0f));
                as0 as0Var = this.s;
                as0Var.x1(j);
                hgaVar.b0();
                as0Var.O = new xr0(this, (byte) 0);
                gm.V3(this.f);
                this.b = true;
                this.c = 0.0f;
                int i5 = this.T;
                if (i5 >= 0) {
                    as0Var.g1(i5, this.U - hgaVar.getPaddingTop());
                }
            }
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gs0.c():void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.r) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        yr0 yr0Var = this.f;
        yr0Var.setPadding(yr0Var.getPaddingLeft(), yr0Var.f3, yr0Var.getPaddingRight(), this.K.getMeasuredHeight() + gm.L(42.0f));
    }

    public void setList(t3b t3bVar) {
        if (this.a != t3bVar) {
            this.I = false;
            this.J = false;
            this.d = this.a0.E;
        }
        this.a = t3bVar;
        bs0 bs0Var = this.w;
        bs0Var.e = t3bVar;
        if (bs0Var != bs0Var.s.x) {
            bs0Var.M();
        }
        bs0Var.f();
        fs0 fs0Var = this.x;
        fs0Var.e = t3bVar;
        if (fs0Var != fs0Var.s.x) {
            fs0Var.M();
        }
        fs0Var.f();
        c();
    }

    public void setVisibleHeight(int i) {
        float f = (-(getMeasuredHeight() - Math.max(i, gm.L(280.0f)))) / 2.0f;
        this.E.setTranslationY(f);
        this.y.setTranslationY(-f);
    }
}
