package defpackage;

import android.view.View;
import java.util.HashMap;
public final class k2a extends ny0 implements fn7 {
    public final q74 S1;
    public final c51 T1;
    public final v5b U1;
    public final HashMap V1;
    public final int W1;
    public int X1;
    public l9c Y1;

    public k2a(org.telegram.ui.ActionBar.e r17, long r18, int r20, defpackage.mt7 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k2a.<init>(org.telegram.ui.ActionBar.e, long, int, mt7):void");
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, false, new hj8(this, (byte) 19), this.J0);
        this.Y1 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131744455, null);
    }

    public final void Z0() {
        int abs;
        q74 q74Var = this.S1;
        int K0 = q74Var.K0();
        if (K0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(q74Var.M0() - K0) + 1;
        }
        v5b v5bVar = this.U1;
        if (v5bVar != null) {
            int i = K0 + abs;
            int i2 = v5bVar.i();
            int i3 = this.W1;
            if (i > i2 - i3) {
                v5bVar.p(Math.min(100, Math.max(1, i3 / 2) * i3 * i3), false);
            }
        }
    }

    public final boolean a1(int i, View view) {
        b8c G;
        l9c l9cVar = this.Y1;
        if (l9cVar == null || i == 0 || (G = l9cVar.G(i - 1)) == null) {
            return false;
        }
        Object obj = G.H;
        if (obj instanceof r47) {
            r47 r47Var = (r47) obj;
            int e1 = r47Var.e1();
            Integer valueOf = Integer.valueOf(e1);
            HashMap hashMap = this.V1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(e1));
                G.e = false;
                ((jja) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(e1), r47Var.l);
                G.e = true;
                ((jja) view).i(true, true);
            }
            c51 c51Var = this.T1;
            c51Var.setEnabled(!hashMap.isEmpty());
            c51Var.c(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.A5 && ((v5b) objArr[0]) == this.U1) {
            this.Y1.O(false);
            Z0();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X1 = this.U1.o();
        jn7.f(this.a).b(this, jn7.A5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U1.z(this.X1);
        jn7.f(this.a).n(this, jn7.A5);
    }
}
