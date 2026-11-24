package defpackage;

import android.view.View;
import java.util.HashMap;
public final class s0a extends mz0 implements jm7 {
    public final f84 S1;
    public final b61 T1;
    public final z3b U1;
    public final HashMap V1;
    public final int W1;
    public int X1;
    public l7c Y1;

    public s0a(org.telegram.ui.ActionBar.d r17, long r18, int r20, defpackage.js7 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s0a.<init>(org.telegram.ui.ActionBar.d, long, int, js7):void");
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, false, new vh8(this, (byte) 19), this.J0);
        this.Y1 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return jb6.M0(2131744487, null);
    }

    public final void Y0() {
        int abs;
        f84 f84Var = this.S1;
        int K0 = f84Var.K0();
        if (K0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(f84Var.M0() - K0) + 1;
        }
        z3b z3bVar = this.U1;
        if (z3bVar != null) {
            int i = K0 + abs;
            int i2 = z3bVar.i();
            int i3 = this.W1;
            if (i > i2 - i3) {
                z3bVar.p(Math.min(100, Math.max(1, i3 / 2) * i3 * i3), false);
            }
        }
    }

    public final boolean Z0(int i, View view) {
        c6c G;
        l7c l7cVar = this.Y1;
        if (l7cVar == null || i == 0 || (G = l7cVar.G(i - 1)) == null) {
            return false;
        }
        Object obj = G.H;
        if (obj instanceof k47) {
            k47 k47Var = (k47) obj;
            int e1 = k47Var.e1();
            Integer valueOf = Integer.valueOf(e1);
            HashMap hashMap = this.V1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(e1));
                G.e = false;
                ((sha) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(e1), k47Var.l);
                G.e = true;
                ((sha) view).i(true, true);
            }
            b61 b61Var = this.T1;
            b61Var.setEnabled(!hashMap.isEmpty());
            b61Var.c(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.B5 && ((z3b) objArr[0]) == this.U1) {
            this.Y1.O(false);
            Y0();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X1 = this.U1.o();
        nm7.f(this.a).b(this, nm7.B5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U1.z(this.X1);
        nm7.f(this.a).n(this, nm7.B5);
    }
}
