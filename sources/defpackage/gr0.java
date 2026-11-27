package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
public final class gr0 extends FrameLayout {
    public final z2b E;
    public final u8 F;
    public final c51 G;
    public final lu5 H;
    public boolean I;
    public boolean J;
    public final dr0 K;
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
    public p5b a;
    public final bga a0;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final yq0 f;
    public final o9c h;
    public final zb3 n;
    public final yha r;
    public final ar0 s;
    public final br0 w;
    public final fr0 x;
    public final cr0 y;

    public gr0(bga bgaVar, Context context) {
        super(context);
        this.a0 = bgaVar;
        this.d = Utilities.j(xea.q1, 6, 2);
        this.e = Utilities.j(xea.q1, 6, 2);
        this.I = false;
        this.J = false;
        this.W = new Rect();
        o9c o9cVar = new o9c();
        this.h = o9cVar;
        o9cVar.O = new xq0(this, (byte) 1);
        o9cVar.x1(this.d);
        zb3 zb3Var = new zb3();
        this.n = zb3Var;
        zb3Var.n(280L);
        zb3Var.o(k43.h);
        zb3Var.m = false;
        yq0 yq0Var = new yq0(this, context);
        this.f = yq0Var;
        yq0Var.setScrollingTouchSlop(1);
        yq0Var.setPinnedSectionOffsetY(-hl.L(2.0f));
        yq0Var.setPadding(0, 0, 0, 0);
        yq0Var.setItemAnimator(null);
        yq0Var.setClipToPadding(false);
        yq0Var.setSectionsType(2);
        yq0Var.setLayoutManager(o9cVar);
        addView(yq0Var, tre.c(-1.0f, -1));
        yq0Var.i(new zq0(this, (byte) 0));
        yq0Var.setOnItemClickListener(new u(this, (byte) 7));
        yq0Var.setOnItemLongClickListener(new tg0(this, (byte) 10));
        ?? d79Var = new d79(context, null);
        this.r = d79Var;
        ar0 ar0Var = new ar0(this, (byte) 0);
        this.s = ar0Var;
        d79Var.setLayoutManager(ar0Var);
        d79Var.i(new zq0(this, (byte) 1));
        ar0Var.x1(this.e);
        d79Var.setVisibility(8);
        addView((View) d79Var, tre.c(-1.0f, -1));
        br0 br0Var = new br0(this, context);
        this.w = br0Var;
        yq0Var.setAdapter(br0Var);
        fr0 fr0Var = new fr0(this, getContext());
        br0Var.f = fr0Var;
        this.x = fr0Var;
        d79Var.setAdapter(fr0Var);
        cr0 cr0Var = new cr0(this, context);
        this.y = cr0Var;
        cr0Var.x = false;
        z2b z2bVar = new z2b(context, cr0Var, 1, null);
        this.E = z2bVar;
        z2bVar.setVisibility(8);
        z2bVar.setAnimateLayoutChange(true);
        addView(z2bVar, tre.c(-1.0f, -1));
        z2bVar.setOnTouchListener(new q8((byte) 18));
        z2bVar.e(true, false);
        z2bVar.b.setVisibility(8);
        z2bVar.d.setText(ob6.M0(2131746425, null));
        z2bVar.e.setText(ob6.G(uc7.s1(bgaVar.b).l4.A2.f(), "ProfileBotPreviewEmptyText", new Object[0]));
        String M0 = ob6.M0(2131746429, null);
        c51 c51Var = z2bVar.f;
        c51Var.i(M0, false, true);
        c51Var.setVisibility(0);
        c51Var.setOnClickListener(new wq0(this, (byte) 0));
        u8 u8Var = new u8(this, context);
        this.F = u8Var;
        int i = aob.y6;
        vnb vnbVar = bgaVar.c;
        yob.X(u8Var, i, vnbVar);
        u8Var.setText(ob6.M0(2131746430, null));
        u8Var.setTextSize(1, 14.0f);
        u8Var.setTextAlignment(4);
        u8Var.setGravity(17);
        u8Var.setTypeface(hl.o());
        LinearLayout.LayoutParams t = tre.t(165, -2, 17, 0, 17, 0, 12);
        oob oobVar = z2bVar.a;
        oobVar.addView(u8Var, t);
        c51 c51Var2 = new c51(vnbVar, context, false);
        this.G = c51Var2;
        c51Var2.setMinWidth(hl.L(200.0f));
        oobVar.addView(c51Var2, tre.r(-2, 44, 17));
        z2bVar.addView(cr0Var, 0, tre.c(-1.0f, -1));
        yq0Var.setEmptyView(z2bVar);
        yq0Var.X1 = true;
        yq0Var.Y1 = false;
        lu5 lu5Var = new lu5(new s10(this, (byte) 1));
        this.H = lu5Var;
        lu5Var.h(yq0Var);
        dr0 dr0Var = new dr0(context, vnbVar);
        this.K = dr0Var;
        addView(dr0Var, tre.e(-1, -2, 48));
    }

    public final void a() {
        boolean z;
        if (this.b) {
            float f = this.c;
            float f2 = 1.0f;
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            yha yhaVar = this.r;
            yq0 yq0Var = this.f;
            if (i == 0) {
                this.b = false;
                int i2 = this.e;
                this.d = i2;
                this.a0.E = i2;
                xea.E(i2);
                br0 br0Var = this.w;
                int b = br0Var.b();
                yhaVar.setVisibility(8);
                int i3 = this.d;
                o9c o9cVar = this.h;
                o9cVar.x1(i3);
                yq0Var.c0();
                yq0Var.invalidate();
                if (br0Var.b() == b) {
                    hl.V3(yq0Var);
                } else {
                    br0Var.f();
                }
                int i4 = this.T;
                if (i4 >= 0) {
                    View m = this.s.m(i4);
                    if (m != null) {
                        this.U = m.getTop();
                    }
                    o9cVar.g1(this.T, (-yq0Var.getPaddingTop()) + this.U);
                }
            } else if (f == 0.0f) {
                this.b = false;
                yhaVar.setVisibility(8);
                yq0Var.invalidate();
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
                ofFloat.addUpdateListener(new ce0(this, (byte) 1));
                ofFloat.addListener(new z7((byte) 7, this, z));
                ofFloat.setInterpolator(k43.f);
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
                yha yhaVar = this.r;
                yhaVar.setVisibility(0);
                yhaVar.setAdapter(this.x);
                yhaVar.setPadding(yhaVar.getPaddingLeft(), 0, yhaVar.getPaddingRight(), this.K.getMeasuredHeight() + hl.L(42.0f));
                ar0 ar0Var = this.s;
                ar0Var.x1(j);
                yhaVar.c0();
                ar0Var.O = new xq0(this, (byte) 0);
                hl.V3(this.f);
                this.b = true;
                this.c = 0.0f;
                int i5 = this.T;
                if (i5 >= 0) {
                    ar0Var.g1(i5, this.U - yhaVar.getPaddingTop());
                }
            }
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gr0.c():void");
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
        yq0 yq0Var = this.f;
        yq0Var.setPadding(yq0Var.getPaddingLeft(), yq0Var.f3, yq0Var.getPaddingRight(), this.K.getMeasuredHeight() + hl.L(42.0f));
    }

    public void setList(p5b p5bVar) {
        if (this.a != p5bVar) {
            this.I = false;
            this.J = false;
            this.d = this.a0.E;
        }
        this.a = p5bVar;
        br0 br0Var = this.w;
        br0Var.e = p5bVar;
        if (br0Var != br0Var.s.x) {
            br0Var.M();
        }
        br0Var.f();
        fr0 fr0Var = this.x;
        fr0Var.e = p5bVar;
        if (fr0Var != fr0Var.s.x) {
            fr0Var.M();
        }
        fr0Var.f();
        c();
    }

    public void setVisibleHeight(int i) {
        float f = (-(getMeasuredHeight() - Math.max(i, hl.L(280.0f)))) / 2.0f;
        this.E.setTranslationY(f);
        this.y.setTranslationY(-f);
    }
}
