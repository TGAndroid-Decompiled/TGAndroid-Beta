package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class kga extends fx0 implements gk7 {
    public final ns9 l1;
    public final s20 m1;
    public final Drawable n1;
    public TextView o1;
    public int p1;
    public boolean q1;
    public final jga r1;
    public int s1;

    public kga(Context context, jga jgaVar, wjb wjbVar) {
        super(1, wjbVar, context, false);
        kk7.e().b(this, kk7.F4);
        this.r1 = jgaVar;
        K();
        Drawable mutate = context.getResources().getDrawable(2131232733).mutate();
        this.n1 = mutate;
        int i = bkb.g5;
        mutate.setColorFilter(new PorterDuffColorFilter(bkb.v0(i, this.J0), PorterDuff.Mode.MULTIPLY));
        oc6 oc6Var = new oc6((byte) 22, context, this);
        this.b = oc6Var;
        oc6Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.setPadding(i2, 0, i2, 0);
        ns9 ns9Var = new ns9((byte) 3, context, this);
        this.l1 = ns9Var;
        getContext();
        ns9Var.setLayoutManager(new t26(1, false));
        s20 s20Var = new s20(this, context, (byte) 15);
        this.m1 = s20Var;
        ns9Var.setAdapter(s20Var);
        ns9Var.setVerticalScrollBarEnabled(false);
        ns9Var.setClipToPadding(false);
        ns9Var.setEnabled(true);
        zkb.l(ns9Var, 21, bkb.z5, wjbVar);
        ns9Var.setOnScrollListener(new n58(this, (byte) 21));
        ns9Var.setOnItemClickListener(new f09(this, (byte) 9));
        this.b.addView(ns9Var, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(2131231241);
        this.b.addView(view, nme.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        a6 a6Var = new a6(context, (byte) 25);
        zkb.h(bkb.c6, null, a6Var);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i3 = bkb.Yi;
        zkb.X(textView, i3, null);
        textView.setGravity(17);
        ff0 f0 = bkb.f0(bkb.w0(null, i3, false) & 268435455, 0, -1);
        vkb g = zkb.g(i3, 15);
        textView.setBackground(f0);
        zkb.j(textView, f0, null, g, null);
        textView.setPadding(gl.L(33.0f), 0, gl.L(33.0f), 0);
        textView.setText(k96.M0(2131752577, null).toUpperCase());
        textView.setTypeface(gl.o());
        a6Var.addView(textView, nme.e(-2, -1, 51));
        LinearLayout j = de9.j(context, 0);
        ff0 f02 = bkb.f0(bkb.w0(null, i3, false) & 268435455, 0, -1);
        vkb g2 = zkb.g(i3, 15);
        j.setBackground(f02);
        zkb.j(j, f02, null, g2, null);
        j.setPadding(gl.L(33.0f), 0, gl.L(33.0f), 0);
        a6Var.addView(j, nme.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        ug8.v(textView2, 1, 13.0f);
        zkb.X(textView2, bkb.bj, null);
        textView2.setGravity(17);
        int L = gl.L(11.0f);
        int i4 = bkb.aj;
        ShapeDrawable b0 = bkb.b0(L, bkb.w0(null, i4, false));
        vkb M = zkb.M(i4);
        textView2.setBackground(b0);
        zkb.j(textView2, b0, M, null, null);
        textView2.setMinWidth(gl.L(23.0f));
        textView2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), gl.L(1.0f));
        TextView m = ug8.m(j, textView2, nme.t(-2, 23, 16, 0, 0, 10, 0), context);
        m.setTextSize(1, 14.0f);
        zkb.X(m, i3, null);
        m.setGravity(17);
        m.setCompoundDrawablePadding(gl.L(8.0f));
        m.setText(k96.M0(2131745448, null).toUpperCase());
        m.setTypeface(gl.o());
        j.addView(m, nme.r(-2, -2, 16));
        zkb.h(i, wjbVar, a6Var);
        this.b.addView(a6Var, nme.e(-1, 48, 83));
        textView.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        zkb.X(textView, bkb.p7, wjbVar);
        textView.setText(k96.M0(2131744603, null));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final kga b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                kga kgaVar = this.b;
                switch (b) {
                    case 0:
                        for (int i5 = 0; i5 < 4; i5++) {
                            Utilities.d.c(new va6(eb6.f(i5), (byte) 6));
                        }
                        kgaVar.dismiss();
                        return;
                    default:
                        kgaVar.dismiss();
                        return;
                }
            }
        });
        zkb.X(m, bkb.m5, wjbVar);
        m.setText(k96.M0(2131752029, null).toUpperCase());
        j.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        j.setOnClickListener(new View.OnClickListener(this) {
            public final kga b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                kga kgaVar = this.b;
                switch (b) {
                    case 0:
                        for (int i5 = 0; i5 < 4; i5++) {
                            Utilities.d.c(new va6(eb6.f(i5), (byte) 6));
                        }
                        kgaVar.dismiss();
                        return;
                    default:
                        kgaVar.dismiss();
                        return;
                }
            }
        });
        textView2.setVisibility(8);
        s20Var.f();
    }

    public static db6 D0(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            ArrayList arrayList = eb6.f(i2).J;
            if (i >= arrayList.size()) {
                i -= arrayList.size();
            } else {
                return (db6) arrayList.get(i);
            }
        }
        return null;
    }

    @Override
    public final boolean E() {
        return false;
    }

    public final void E0() {
        ns9 ns9Var = this.l1;
        if (ns9Var.getChildCount() <= 0) {
            int paddingTop = ns9Var.getPaddingTop();
            this.p1 = paddingTop;
            ns9Var.setTopGlowOffset(paddingTop);
            this.b.invalidate();
            return;
        }
        int i = 0;
        View childAt = ns9Var.getChildAt(0);
        y29 y29Var = (y29) ns9Var.G(childAt);
        int top = childAt.getTop() - gl.L(8.0f);
        if (top > 0 && y29Var != null && y29Var.b() == 0) {
            i = top;
        }
        if (this.p1 != i) {
            this.p1 = i;
            ns9Var.setTopGlowOffset(i);
            this.b.invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.F4) {
            if (eb6.g() == 0) {
                dismiss();
            } else {
                this.m1.f();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        kk7.e().n(this, kk7.F4);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            int v0 = bkb.v0(bkb.g5, this.J0);
            Drawable drawable = this.n1;
            if (drawable != null && v0 != this.s1) {
                this.s1 = v0;
                drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
