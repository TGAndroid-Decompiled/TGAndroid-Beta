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
    public final zya E;
    public final t8 F;
    public final u41 G;
    public final is5 H;
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
    public s1b a;
    public final kca a0;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final yq0 f;
    public final o5c h;
    public final gb3 n;
    public final hea r;
    public final ar0 s;
    public final br0 w;
    public final fr0 x;
    public final cr0 y;

    public gr0(kca kcaVar, Context context) {
        super(context);
        this.a0 = kcaVar;
        this.d = Utilities.j(gba.q1, 6, 2);
        this.e = Utilities.j(gba.q1, 6, 2);
        this.I = false;
        this.J = false;
        this.W = new Rect();
        o5c o5cVar = new o5c();
        this.h = o5cVar;
        o5cVar.O = new xq0(this, (byte) 1);
        o5cVar.x1(this.d);
        gb3 gb3Var = new gb3();
        this.n = gb3Var;
        gb3Var.n(280L);
        gb3Var.o(s33.h);
        gb3Var.m = false;
        yq0 yq0Var = new yq0(this, context);
        this.f = yq0Var;
        yq0Var.setScrollingTouchSlop(1);
        yq0Var.setPinnedSectionOffsetY(-gl.L(2.0f));
        yq0Var.setPadding(0, 0, 0, 0);
        yq0Var.setItemAnimator(null);
        yq0Var.setClipToPadding(false);
        yq0Var.setSectionsType(2);
        yq0Var.setLayoutManager(o5cVar);
        addView(yq0Var, nme.c(-1.0f, -1));
        yq0Var.i(new zq0(this, (byte) 0));
        yq0Var.setOnItemClickListener(new u(this, (byte) 7));
        yq0Var.setOnItemLongClickListener(new sg0(this, (byte) 10));
        ?? o39Var = new o39(context, null);
        this.r = o39Var;
        ar0 ar0Var = new ar0(this, (byte) 0);
        this.s = ar0Var;
        o39Var.setLayoutManager(ar0Var);
        o39Var.i(new zq0(this, (byte) 1));
        ar0Var.x1(this.e);
        o39Var.setVisibility(8);
        addView((View) o39Var, nme.c(-1.0f, -1));
        br0 br0Var = new br0(this, context);
        this.w = br0Var;
        yq0Var.setAdapter(br0Var);
        fr0 fr0Var = new fr0(this, getContext());
        br0Var.f = fr0Var;
        this.x = fr0Var;
        o39Var.setAdapter(fr0Var);
        cr0 cr0Var = new cr0(this, context);
        this.y = cr0Var;
        cr0Var.x = false;
        zya zyaVar = new zya(context, cr0Var, 1, null);
        this.E = zyaVar;
        zyaVar.setVisibility(8);
        zyaVar.setAnimateLayoutChange(true);
        addView(zyaVar, nme.c(-1.0f, -1));
        zyaVar.setOnTouchListener(new p8((byte) 18));
        zyaVar.e(true, false);
        zyaVar.b.setVisibility(8);
        zyaVar.d.setText(k96.M0(2131746505, null));
        zyaVar.e.setText(k96.G(na7.q1(kcaVar.b).k4.s2.f(), "ProfileBotPreviewEmptyText", new Object[0]));
        String M0 = k96.M0(2131746509, null);
        u41 u41Var = zyaVar.f;
        u41Var.i(M0, false, true);
        u41Var.setVisibility(0);
        u41Var.setOnClickListener(new wq0(this, (byte) 0));
        t8 t8Var = new t8(this, context);
        this.F = t8Var;
        int i = bkb.x6;
        wjb wjbVar = kcaVar.c;
        zkb.X(t8Var, i, wjbVar);
        t8Var.setText(k96.M0(2131746510, null));
        t8Var.setTextSize(1, 14.0f);
        t8Var.setTextAlignment(4);
        t8Var.setGravity(17);
        t8Var.setTypeface(gl.o());
        LinearLayout.LayoutParams t = nme.t(165, -2, 17, 0, 17, 0, 12);
        pkb pkbVar = zyaVar.a;
        pkbVar.addView(t8Var, t);
        u41 u41Var2 = new u41(wjbVar, context, false);
        this.G = u41Var2;
        u41Var2.setMinWidth(gl.L(200.0f));
        pkbVar.addView(u41Var2, nme.r(-2, 44, 17));
        zyaVar.addView(cr0Var, 0, nme.c(-1.0f, -1));
        yq0Var.setEmptyView(zyaVar);
        yq0Var.X1 = true;
        yq0Var.Y1 = false;
        is5 is5Var = new is5(new r10(this, (byte) 1));
        this.H = is5Var;
        is5Var.h(yq0Var);
        dr0 dr0Var = new dr0(context, wjbVar);
        this.K = dr0Var;
        addView(dr0Var, nme.e(-1, -2, 48));
    }

    public final void a() {
        boolean z;
        if (this.b) {
            float f = this.c;
            float f2 = 1.0f;
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            hea heaVar = this.r;
            yq0 yq0Var = this.f;
            if (i == 0) {
                this.b = false;
                int i2 = this.e;
                this.d = i2;
                this.a0.E = i2;
                gba.E(i2);
                br0 br0Var = this.w;
                int b = br0Var.b();
                heaVar.setVisibility(8);
                int i3 = this.d;
                o5c o5cVar = this.h;
                o5cVar.x1(i3);
                yq0Var.b0();
                yq0Var.invalidate();
                if (br0Var.b() == b) {
                    gl.V3(yq0Var);
                } else {
                    br0Var.f();
                }
                int i4 = this.T;
                if (i4 >= 0) {
                    View m = this.s.m(i4);
                    if (m != null) {
                        this.U = m.getTop();
                    }
                    o5cVar.g1(this.T, (-yq0Var.getPaddingTop()) + this.U);
                }
            } else if (f == 0.0f) {
                this.b = false;
                heaVar.setVisibility(8);
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
                ofFloat.addUpdateListener(new ae0(this, (byte) 1));
                ofFloat.addListener(new y7((byte) 7, this, z));
                ofFloat.setInterpolator(s33.f);
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
                hea heaVar = this.r;
                heaVar.setVisibility(0);
                heaVar.setAdapter(this.x);
                heaVar.setPadding(heaVar.getPaddingLeft(), 0, heaVar.getPaddingRight(), this.K.getMeasuredHeight() + gl.L(42.0f));
                ar0 ar0Var = this.s;
                ar0Var.x1(j);
                heaVar.b0();
                ar0Var.O = new xq0(this, (byte) 0);
                gl.V3(this.f);
                this.b = true;
                this.c = 0.0f;
                int i5 = this.T;
                if (i5 >= 0) {
                    ar0Var.g1(i5, this.U - heaVar.getPaddingTop());
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
        yq0Var.setPadding(yq0Var.getPaddingLeft(), yq0Var.f3, yq0Var.getPaddingRight(), this.K.getMeasuredHeight() + gl.L(42.0f));
    }

    public void setList(s1b s1bVar) {
        if (this.a != s1bVar) {
            this.I = false;
            this.J = false;
            this.d = this.a0.E;
        }
        this.a = s1bVar;
        br0 br0Var = this.w;
        br0Var.e = s1bVar;
        if (br0Var != br0Var.s.x) {
            br0Var.M();
        }
        br0Var.f();
        fr0 fr0Var = this.x;
        fr0Var.e = s1bVar;
        if (fr0Var != fr0Var.s.x) {
            fr0Var.M();
        }
        fr0Var.f();
        c();
    }

    public void setVisibleHeight(int i) {
        float f = (-(getMeasuredHeight() - Math.max(i, gl.L(280.0f)))) / 2.0f;
        this.E.setTranslationY(f);
        this.y.setTranslationY(-f);
    }
}
