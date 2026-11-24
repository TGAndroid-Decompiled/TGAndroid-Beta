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
public final class mia extends my0 implements jm7 {
    public final pu9 l1;
    public final s30 m1;
    public final Drawable n1;
    public TextView o1;
    public int p1;
    public boolean q1;
    public final lia r1;
    public int s1;

    public mia(Context context, lia liaVar, ylb ylbVar) {
        super(1, ylbVar, context, false);
        nm7.e().b(this, nm7.H4);
        this.r1 = liaVar;
        J();
        Drawable mutate = context.getResources().getDrawable(2131232745).mutate();
        this.n1 = mutate;
        int i = cmb.g5;
        mutate.setColorFilter(new PorterDuffColorFilter(cmb.v0(i, this.J0), PorterDuff.Mode.MULTIPLY));
        ne6 ne6Var = new ne6((byte) 22, context, this);
        this.b = ne6Var;
        ne6Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.setPadding(i2, 0, i2, 0);
        pu9 pu9Var = new pu9((byte) 3, context, this);
        this.l1 = pu9Var;
        getContext();
        pu9Var.setLayoutManager(new u46(1, false));
        s30 s30Var = new s30(this, context, (byte) 15);
        this.m1 = s30Var;
        pu9Var.setAdapter(s30Var);
        pu9Var.setVerticalScrollBarEnabled(false);
        pu9Var.setClipToPadding(false);
        pu9Var.setEnabled(true);
        anb.l(pu9Var, 21, cmb.z5, ylbVar);
        pu9Var.setOnScrollListener(new so7(this, (byte) 22));
        pu9Var.setOnItemClickListener(new s19(this, (byte) 10));
        this.b.addView(pu9Var, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(2131231242);
        this.b.addView(view, qoe.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        a6 a6Var = new a6(context, (byte) 25);
        anb.h(cmb.c6, null, a6Var);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i3 = cmb.Yi;
        anb.X(textView, i3, null);
        textView.setGravity(17);
        fg0 f0 = cmb.f0(cmb.w0(null, i3, false) & 268435455, 0, -1);
        wmb g = anb.g(i3, 15);
        textView.setBackground(f0);
        anb.j(textView, f0, null, g, null);
        textView.setPadding(gm.L(33.0f), 0, gm.L(33.0f), 0);
        textView.setText(jb6.M0(2131752542, null).toUpperCase());
        textView.setTypeface(gm.o());
        a6Var.addView(textView, qoe.e(-2, -1, 51));
        LinearLayout i4 = hg9.i(context, 0);
        fg0 f02 = cmb.f0(cmb.w0(null, i3, false) & 268435455, 0, -1);
        wmb g2 = anb.g(i3, 15);
        i4.setBackground(f02);
        anb.j(i4, f02, null, g2, null);
        i4.setPadding(gm.L(33.0f), 0, gm.L(33.0f), 0);
        a6Var.addView(i4, qoe.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        wi8.v(textView2, 1, 13.0f);
        anb.X(textView2, cmb.bj, null);
        textView2.setGravity(17);
        int L = gm.L(11.0f);
        int i5 = cmb.aj;
        ShapeDrawable b0 = cmb.b0(L, cmb.w0(null, i5, false));
        wmb M = anb.M(i5);
        textView2.setBackground(b0);
        anb.j(textView2, b0, M, null, null);
        textView2.setMinWidth(gm.L(23.0f));
        textView2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), gm.L(1.0f));
        TextView m = wi8.m(i4, textView2, qoe.t(-2, 23, 16, 0, 0, 10, 0), context);
        m.setTextSize(1, 14.0f);
        anb.X(m, i3, null);
        m.setGravity(17);
        m.setCompoundDrawablePadding(gm.L(8.0f));
        m.setText(jb6.M0(2131745374, null).toUpperCase());
        m.setTypeface(gm.o());
        i4.addView(m, qoe.r(-2, -2, 16));
        anb.h(i, ylbVar, a6Var);
        this.b.addView(a6Var, qoe.e(-1, 48, 83));
        textView.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        anb.X(textView, cmb.p7, ylbVar);
        textView.setText(jb6.M0(2131744529, null));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final mia b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                mia miaVar = this.b;
                switch (b) {
                    case 0:
                        for (int i6 = 0; i6 < 4; i6++) {
                            Utilities.d.c(new uc6(dd6.f(i6), (byte) 6));
                        }
                        miaVar.dismiss();
                        return;
                    default:
                        miaVar.dismiss();
                        return;
                }
            }
        });
        anb.X(m, cmb.m5, ylbVar);
        m.setText(jb6.M0(2131751978, null).toUpperCase());
        i4.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        i4.setOnClickListener(new View.OnClickListener(this) {
            public final mia b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                mia miaVar = this.b;
                switch (b) {
                    case 0:
                        for (int i6 = 0; i6 < 4; i6++) {
                            Utilities.d.c(new uc6(dd6.f(i6), (byte) 6));
                        }
                        miaVar.dismiss();
                        return;
                    default:
                        miaVar.dismiss();
                        return;
                }
            }
        });
        textView2.setVisibility(8);
        s30Var.f();
    }

    public static cd6 D0(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            ArrayList arrayList = dd6.f(i2).J;
            if (i >= arrayList.size()) {
                i -= arrayList.size();
            } else {
                return (cd6) arrayList.get(i);
            }
        }
        return null;
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void E0() {
        pu9 pu9Var = this.l1;
        if (pu9Var.getChildCount() <= 0) {
            int paddingTop = pu9Var.getPaddingTop();
            this.p1 = paddingTop;
            pu9Var.setTopGlowOffset(paddingTop);
            this.b.invalidate();
            return;
        }
        int i = 0;
        View childAt = pu9Var.getChildAt(0);
        b59 b59Var = (b59) pu9Var.G(childAt);
        int top = childAt.getTop() - gm.L(8.0f);
        if (top > 0 && b59Var != null && b59Var.b() == 0) {
            i = top;
        }
        if (this.p1 != i) {
            this.p1 = i;
            pu9Var.setTopGlowOffset(i);
            this.b.invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.H4) {
            if (dd6.g() == 0) {
                dismiss();
            } else {
                this.m1.f();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        nm7.e().n(this, nm7.H4);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            int v0 = cmb.v0(cmb.g5, this.J0);
            Drawable drawable = this.n1;
            if (drawable != null && v0 != this.s1) {
                this.s1 = v0;
                drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
