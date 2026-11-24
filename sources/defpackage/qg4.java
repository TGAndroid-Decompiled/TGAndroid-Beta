package defpackage;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class qg4 extends k69 {
    public final ch4 a;

    public qg4(ch4 ch4Var) {
        this.a = ch4Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 1) {
            gm.t1(this.a.L.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        k47 k47Var;
        ch4 ch4Var = this.a;
        tg4 tg4Var = ch4Var.n0;
        u46 u46Var = ch4Var.k0;
        fn0 fn0Var = ch4Var.a;
        a14 a14Var = ch4Var.o0;
        if (recyclerView.getAdapter() != null && ch4Var.d != null) {
            int K0 = u46Var.K0();
            int M0 = u46Var.M0();
            int abs = Math.abs(M0 - K0) + 1;
            int b = recyclerView.getAdapter().b();
            if (!ch4Var.N && abs > 0 && M0 >= b - 10 && !ch4Var.O) {
                gm.c3(new a14(this, (byte) 19));
            }
            if (ch4Var.d == ch4Var.V) {
                if (i2 != 0 && !ch4Var.f.isEmpty() && TextUtils.isEmpty(ch4Var.R)) {
                    gm.r(a14Var);
                    gm.d3(a14Var, 1650L);
                    fn0Var.a(true, true);
                }
                u69 K = recyclerView.K(K0);
                if (K != null && K.f == 0) {
                    View view = K.a;
                    if (view instanceof tha) {
                        tha thaVar = (tha) view;
                        if (thaVar.e <= 0) {
                            k47Var = null;
                        } else {
                            k47Var = thaVar.b[0];
                        }
                        if (k47Var != null) {
                            int i3 = k47Var.k.date;
                            tg4Var.getClass();
                            String u = jb6.u(i3, false);
                            if (!TextUtils.equals(tg4Var.c, u)) {
                                tg4Var.c = u;
                                tg4Var.a.t(u, true, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            View pinnedHeader = ch4Var.b.getPinnedHeader();
            if (pinnedHeader instanceof l55) {
                l55 l55Var = (l55) pinnedHeader;
                CharSequence text = l55Var.getText();
                if (!TextUtils.isEmpty(text) && l55Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(tg4Var.c, charSequence)) {
                        tg4Var.c = charSequence;
                        tg4Var.a.t(charSequence, true, true);
                    }
                    if (i2 != 0) {
                        gm.r(a14Var);
                        gm.d3(a14Var, 1650L);
                        fn0Var.a(true, true);
                        return;
                    }
                    return;
                }
            }
            gm.r(a14Var);
            fn0Var.a(false, true);
        }
    }
}
