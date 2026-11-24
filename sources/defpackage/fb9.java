package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.widget.LinearLayout;
import org.telegram.ui.Wallet.c;
public final class fb9 extends LinearLayout implements jm7 {
    public final int a;
    public final io b;
    public final io c;
    public final pn2[] d;
    public final pn2[] e;
    public SpannableString f;
    public qac h;
    public long n;

    public fb9(int i, ylb ylbVar, Context context) {
        super(context);
        this.d = new pn2[1];
        this.e = new pn2[1];
        this.n = -1L;
        this.a = i;
        setOrientation(1);
        setGravity(21);
        int L = gm.L(6.0f);
        setPadding(gm.L(13.0f) + L, L, gm.L(14.0f) + L, L);
        io a = a(context, ylbVar);
        this.b = a;
        addView(a, qoe.r(-2, 18, 5));
        io a2 = a(context, ylbVar);
        this.c = a2;
        addView(a2, qoe.r(-2, 18, 5));
        b(false);
    }

    public static io a(Context context, ylb ylbVar) {
        io ioVar = new io(context, false, true, false);
        ioVar.n = true;
        ioVar.setTypeface(gm.o());
        ioVar.setTextSize(gm.L(14.0f));
        ioVar.setGravity(5);
        anb.U(ioVar, cmb.F6, ylbVar);
        return ioVar;
    }

    public final void b(boolean z) {
        int i = this.a;
        jva v = jva.v(i, false);
        jva v2 = jva.v(i, true);
        long j = v.m().amount;
        nk p = v2.p();
        if (u15.c(i)) {
            p = nk.j(Math.max(0L, c.C(i).z()) + p.b, ok.b);
        }
        boolean z2 = v.e;
        io ioVar = this.c;
        io ioVar2 = this.b;
        if (z2 && v2.e) {
            ioVar2.c(nxa.b1(false, "⭐️".concat(jb6.E(j, ' ')), 0.7f, this.d), z, true);
            if (p.l()) {
                ioVar.setVisibility(8);
            } else {
                ioVar.setVisibility(0);
                String concat = "⭐️".concat(p.o(2).d());
                pn2[] pn2VarArr = this.e;
                ioVar.c(nxa.b1(true, concat, 0.7f, pn2VarArr), z, true);
                pn2 pn2Var = pn2VarArr[0];
                if (pn2Var != null) {
                    pn2Var.a(cmb.Yl);
                }
            }
            this.n = j;
            return;
        }
        if (this.f == null) {
            SpannableString spannableString = new SpannableString("x");
            this.f = spannableString;
            spannableString.setSpan(new ta6(gm.L(48.0f), ioVar2), 0, 1, 33);
        }
        ioVar2.c(this.f, false, true);
        ioVar.setVisibility(8);
        this.n = -1L;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != nm7.A3 && i != nm7.e4) {
            return;
        }
        b(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(false);
        int i = this.a;
        nm7.f(i).a(this, nm7.A3);
        nm7.f(i).a(this, nm7.e4);
        if (u15.c(i) && c.C(i).x() == null) {
            c.C(i).J();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        nm7.f(i).n(this, nm7.A3);
        nm7.f(i).n(this, nm7.e4);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        qac qacVar = this.h;
        if (qacVar != null && i != i3) {
            qacVar.a(Integer.valueOf(i));
        }
    }

    public void setOnWidthChanged(qac qacVar) {
        this.h = qacVar;
    }
}
