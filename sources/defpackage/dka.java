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
public final class dka extends nx0 implements fn7 {
    public final gw9 l1;
    public final t20 m1;
    public final Drawable n1;
    public TextView o1;
    public int p1;
    public boolean q1;
    public final cka r1;
    public int s1;

    public dka(Context context, cka ckaVar, vnb vnbVar) {
        super(1, vnbVar, context, false);
        jn7.e().b(this, jn7.G4);
        this.r1 = ckaVar;
        J();
        Drawable mutate = context.getResources().getDrawable(2131232744).mutate();
        this.n1 = mutate;
        int i = aob.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(aob.v0(i, this.J0), PorterDuff.Mode.MULTIPLY));
        d26 d26Var = new d26((byte) 24, context, this);
        this.b = d26Var;
        d26Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.setPadding(i2, 0, i2, 0);
        gw9 gw9Var = new gw9((byte) 3, context, this);
        this.l1 = gw9Var;
        getContext();
        gw9Var.setLayoutManager(new x46(1, false));
        t20 t20Var = new t20(this, context, (byte) 15);
        this.m1 = t20Var;
        gw9Var.setAdapter(t20Var);
        gw9Var.setVerticalScrollBarEnabled(false);
        gw9Var.setClipToPadding(false);
        gw9Var.setEnabled(true);
        yob.l(gw9Var, 21, aob.A5, vnbVar);
        gw9Var.setOnScrollListener(new e98(this, (byte) 21));
        gw9Var.setOnItemClickListener(new t39(this, (byte) 9));
        this.b.addView(gw9Var, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(2131231241);
        this.b.addView(view, tre.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        b6 b6Var = new b6(context, (byte) 26);
        yob.h(aob.d6, null, b6Var);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i3 = aob.Zi;
        yob.X(textView, i3, null);
        textView.setGravity(17);
        hf0 f0 = aob.f0(aob.w0(null, i3, false) & 268435455, 0, -1);
        uob g = yob.g(i3, 15);
        textView.setBackground(f0);
        yob.j(textView, f0, null, g, null);
        textView.setPadding(hl.L(33.0f), 0, hl.L(33.0f), 0);
        textView.setText(ob6.M0(2131752570, null).toUpperCase());
        textView.setTypeface(hl.o());
        b6Var.addView(textView, tre.e(-2, -1, 51));
        LinearLayout j = uh9.j(context, 0);
        hf0 f02 = aob.f0(aob.w0(null, i3, false) & 268435455, 0, -1);
        uob g2 = yob.g(i3, 15);
        j.setBackground(f02);
        yob.j(j, f02, null, g2, null);
        j.setPadding(hl.L(33.0f), 0, hl.L(33.0f), 0);
        b6Var.addView(j, tre.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        ik8.v(textView2, 1, 13.0f);
        yob.X(textView2, aob.cj, null);
        textView2.setGravity(17);
        int L = hl.L(11.0f);
        int i4 = aob.bj;
        ShapeDrawable b0 = aob.b0(L, aob.w0(null, i4, false));
        uob M = yob.M(i4);
        textView2.setBackground(b0);
        yob.j(textView2, b0, M, null, null);
        textView2.setMinWidth(hl.L(23.0f));
        textView2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), hl.L(1.0f));
        TextView m = ik8.m(j, textView2, tre.t(-2, 23, 16, 0, 0, 10, 0), context);
        m.setTextSize(1, 14.0f);
        yob.X(m, i3, null);
        m.setGravity(17);
        m.setCompoundDrawablePadding(hl.L(8.0f));
        m.setText(ob6.M0(2131745368, null).toUpperCase());
        m.setTypeface(hl.o());
        j.addView(m, tre.r(-2, -2, 16));
        yob.h(i, vnbVar, b6Var);
        this.b.addView(b6Var, tre.e(-1, 48, 83));
        textView.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        yob.X(textView, aob.q7, vnbVar);
        textView.setText(ob6.M0(2131744497, null));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final dka b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                dka dkaVar = this.b;
                switch (b) {
                    case 0:
                        for (int i5 = 0; i5 < 4; i5++) {
                            Utilities.d.c(new zc6(id6.f(i5), (byte) 5));
                        }
                        dkaVar.dismiss();
                        return;
                    default:
                        dkaVar.dismiss();
                        return;
                }
            }
        });
        yob.X(m, aob.n5, vnbVar);
        m.setText(ob6.M0(2131752006, null).toUpperCase());
        j.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        j.setOnClickListener(new View.OnClickListener(this) {
            public final dka b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                dka dkaVar = this.b;
                switch (b) {
                    case 0:
                        for (int i5 = 0; i5 < 4; i5++) {
                            Utilities.d.c(new zc6(id6.f(i5), (byte) 5));
                        }
                        dkaVar.dismiss();
                        return;
                    default:
                        dkaVar.dismiss();
                        return;
                }
            }
        });
        textView2.setVisibility(8);
        t20Var.f();
    }

    public static hd6 E0(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            ArrayList arrayList = id6.f(i2).J;
            if (i >= arrayList.size()) {
                i -= arrayList.size();
            } else {
                return (hd6) arrayList.get(i);
            }
        }
        return null;
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void F0() {
        gw9 gw9Var = this.l1;
        if (gw9Var.getChildCount() <= 0) {
            int paddingTop = gw9Var.getPaddingTop();
            this.p1 = paddingTop;
            gw9Var.setTopGlowOffset(paddingTop);
            this.b.invalidate();
            return;
        }
        int i = 0;
        View childAt = gw9Var.getChildAt(0);
        n69 n69Var = (n69) gw9Var.H(childAt);
        int top = childAt.getTop() - hl.L(8.0f);
        if (top > 0 && n69Var != null && n69Var.b() == 0) {
            i = top;
        }
        if (this.p1 != i) {
            this.p1 = i;
            gw9Var.setTopGlowOffset(i);
            this.b.invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.G4) {
            if (id6.g() == 0) {
                dismiss();
            } else {
                this.m1.f();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        jn7.e().n(this, jn7.G4);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            int v0 = aob.v0(aob.h5, this.J0);
            Drawable drawable = this.n1;
            if (drawable != null && v0 != this.s1) {
                this.s1 = v0;
                drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
