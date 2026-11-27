package defpackage;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class mg4 extends v79 {
    public final yg4 a;

    public mg4(yg4 yg4Var) {
        this.a = yg4Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 1) {
            hl.t1(this.a.L.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        r47 r47Var;
        yg4 yg4Var = this.a;
        pg4 pg4Var = yg4Var.n0;
        x46 x46Var = yg4Var.k0;
        fm0 fm0Var = yg4Var.a;
        lw3 lw3Var = yg4Var.o0;
        if (recyclerView.getAdapter() != null && yg4Var.d != null) {
            int K0 = x46Var.K0();
            int M0 = x46Var.M0();
            int abs = Math.abs(M0 - K0) + 1;
            int b = recyclerView.getAdapter().b();
            if (!yg4Var.N && abs > 0 && M0 >= b - 10 && !yg4Var.O) {
                hl.c3(new lw3(this, (byte) 25));
            }
            if (yg4Var.d == yg4Var.V) {
                if (i2 != 0 && !yg4Var.f.isEmpty() && TextUtils.isEmpty(yg4Var.R)) {
                    hl.r(lw3Var);
                    hl.d3(lw3Var, 1650L);
                    fm0Var.a(true, true);
                }
                f89 L = recyclerView.L(K0);
                if (L != null && L.f == 0) {
                    View view = L.a;
                    if (view instanceof kja) {
                        kja kjaVar = (kja) view;
                        if (kjaVar.e <= 0) {
                            r47Var = null;
                        } else {
                            r47Var = kjaVar.b[0];
                        }
                        if (r47Var != null) {
                            int i3 = r47Var.k.date;
                            pg4Var.getClass();
                            String u = ob6.u(i3, false);
                            if (!TextUtils.equals(pg4Var.c, u)) {
                                pg4Var.c = u;
                                pg4Var.a.t(u, true, true);
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
            View pinnedHeader = yg4Var.b.getPinnedHeader();
            if (pinnedHeader instanceof p55) {
                p55 p55Var = (p55) pinnedHeader;
                CharSequence text = p55Var.getText();
                if (!TextUtils.isEmpty(text) && p55Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(pg4Var.c, charSequence)) {
                        pg4Var.c = charSequence;
                        pg4Var.a.t(charSequence, true, true);
                    }
                    if (i2 != 0) {
                        hl.r(lw3Var);
                        hl.d3(lw3Var, 1650L);
                        fm0Var.a(true, true);
                        return;
                    }
                    return;
                }
            }
            hl.r(lw3Var);
            fm0Var.a(false, true);
        }
    }
}
