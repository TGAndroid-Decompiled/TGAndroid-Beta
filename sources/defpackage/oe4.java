package defpackage;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class oe4 extends i49 {
    public final af4 a;

    public oe4(af4 af4Var) {
        this.a = af4Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 1) {
            gl.t1(this.a.L.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        k27 k27Var;
        af4 af4Var = this.a;
        re4 re4Var = af4Var.n0;
        t26 t26Var = af4Var.k0;
        fm0 fm0Var = af4Var.a;
        s54 s54Var = af4Var.o0;
        if (recyclerView.getAdapter() != null && af4Var.d != null) {
            int K0 = t26Var.K0();
            int M0 = t26Var.M0();
            int abs = Math.abs(M0 - K0) + 1;
            int b = recyclerView.getAdapter().b();
            if (!af4Var.N && abs > 0 && M0 >= b - 10 && !af4Var.O) {
                gl.c3(new s54(this, (byte) 12));
            }
            if (af4Var.d == af4Var.V) {
                if (i2 != 0 && !af4Var.f.isEmpty() && TextUtils.isEmpty(af4Var.R)) {
                    gl.r(s54Var);
                    gl.d3(s54Var, 1650L);
                    fm0Var.a(true, true);
                }
                s49 K = recyclerView.K(K0);
                if (K != null && K.f == 0) {
                    View view = K.a;
                    if (view instanceof rfa) {
                        rfa rfaVar = (rfa) view;
                        if (rfaVar.e <= 0) {
                            k27Var = null;
                        } else {
                            k27Var = rfaVar.b[0];
                        }
                        if (k27Var != null) {
                            int i3 = k27Var.k.date;
                            re4Var.getClass();
                            String u = k96.u(i3, false);
                            if (!TextUtils.equals(re4Var.c, u)) {
                                re4Var.c = u;
                                re4Var.a.t(u, true, true);
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
            View pinnedHeader = af4Var.b.getPinnedHeader();
            if (pinnedHeader instanceof l35) {
                l35 l35Var = (l35) pinnedHeader;
                CharSequence text = l35Var.getText();
                if (!TextUtils.isEmpty(text) && l35Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(re4Var.c, charSequence)) {
                        re4Var.c = charSequence;
                        re4Var.a.t(charSequence, true, true);
                    }
                    if (i2 != 0) {
                        gl.r(s54Var);
                        gl.d3(s54Var, 1650L);
                        fm0Var.a(true, true);
                        return;
                    }
                    return;
                }
            }
            gl.r(s54Var);
            fm0Var.a(false, true);
        }
    }
}
