package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.widget.LinearLayout;
import org.telegram.ui.Wallet.c;
public final class f99 extends LinearLayout implements gk7 {
    public final int a;
    public final hn b;
    public final hn c;
    public final cm2[] d;
    public final cm2[] e;
    public SpannableString f;
    public p8c h;
    public long n;

    public f99(int i, wjb wjbVar, Context context) {
        super(context);
        this.d = new cm2[1];
        this.e = new cm2[1];
        this.n = -1L;
        this.a = i;
        setOrientation(1);
        setGravity(21);
        int L = gl.L(6.0f);
        setPadding(gl.L(13.0f) + L, L, gl.L(14.0f) + L, L);
        hn a = a(context, wjbVar);
        this.b = a;
        addView(a, nme.r(-2, 18, 5));
        hn a2 = a(context, wjbVar);
        this.c = a2;
        addView(a2, nme.r(-2, 18, 5));
        b(false);
    }

    public static hn a(Context context, wjb wjbVar) {
        hn hnVar = new hn(context, false, true, false);
        hnVar.n = true;
        hnVar.setTypeface(gl.o());
        hnVar.setTextSize(gl.L(14.0f));
        hnVar.setGravity(5);
        zkb.U(hnVar, bkb.F6, wjbVar);
        return hnVar;
    }

    public final void b(boolean z) {
        int i = this.a;
        gta v = gta.v(i, false);
        gta v2 = gta.v(i, true);
        long j = v.m().amount;
        nj p = v2.p();
        if (uz4.c(i)) {
            p = nj.j(Math.max(0L, c.C(i).z()) + p.b, oj.b);
        }
        boolean z2 = v.e;
        hn hnVar = this.c;
        hn hnVar2 = this.b;
        if (z2 && v2.e) {
            hnVar2.c(jva.a1(false, "⭐️".concat(k96.E(j, ' ')), 0.7f, this.d), z, true);
            if (p.l()) {
                hnVar.setVisibility(8);
            } else {
                hnVar.setVisibility(0);
                String concat = "⭐️".concat(p.o(2).d());
                cm2[] cm2VarArr = this.e;
                hnVar.c(jva.a1(true, concat, 0.7f, cm2VarArr), z, true);
                cm2 cm2Var = cm2VarArr[0];
                if (cm2Var != null) {
                    cm2Var.a(bkb.Yl);
                }
            }
            this.n = j;
            return;
        }
        if (this.f == null) {
            SpannableString spannableString = new SpannableString("x");
            this.f = spannableString;
            spannableString.setSpan(new u86(gl.L(48.0f), hnVar2), 0, 1, 33);
        }
        hnVar2.c(this.f, false, true);
        hnVar.setVisibility(8);
        this.n = -1L;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != kk7.z3 && i != kk7.c4) {
            return;
        }
        b(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(false);
        int i = this.a;
        kk7.f(i).a(this, kk7.z3);
        kk7.f(i).a(this, kk7.c4);
        if (uz4.c(i) && c.C(i).x() == null) {
            c.C(i).J();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        kk7.f(i).n(this, kk7.z3);
        kk7.f(i).n(this, kk7.c4);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        p8c p8cVar = this.h;
        if (p8cVar != null && i != i3) {
            p8cVar.a(Integer.valueOf(i));
        }
    }

    public void setOnWidthChanged(p8c p8cVar) {
        this.h = p8cVar;
    }
}
