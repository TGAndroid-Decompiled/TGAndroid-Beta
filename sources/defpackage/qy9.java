package defpackage;

import android.view.View;
import java.util.HashMap;
public final class qy9 extends fy0 implements gk7 {
    public final w64 S1;
    public final u41 T1;
    public final y1b U1;
    public final HashMap V1;
    public final int W1;
    public int X1;
    public l5c Y1;

    public qy9(org.telegram.ui.ActionBar.d r17, long r18, int r20, defpackage.gq7 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy9.<init>(org.telegram.ui.ActionBar.d, long, int, gq7):void");
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, false, new tf8(this, (byte) 19), this.J0);
        this.Y1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        return k96.M0(2131744561, null);
    }

    public final void Y0() {
        int abs;
        w64 w64Var = this.S1;
        int K0 = w64Var.K0();
        if (K0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(w64Var.M0() - K0) + 1;
        }
        y1b y1bVar = this.U1;
        if (y1bVar != null) {
            int i = K0 + abs;
            int i2 = y1bVar.i();
            int i3 = this.W1;
            if (i > i2 - i3) {
                y1bVar.p(Math.min(100, Math.max(1, i3 / 2) * i3 * i3), false);
            }
        }
    }

    public final boolean Z0(int i, View view) {
        c4c G;
        l5c l5cVar = this.Y1;
        if (l5cVar == null || i == 0 || (G = l5cVar.G(i - 1)) == null) {
            return false;
        }
        Object obj = G.H;
        if (obj instanceof k27) {
            k27 k27Var = (k27) obj;
            int e1 = k27Var.e1();
            Integer valueOf = Integer.valueOf(e1);
            HashMap hashMap = this.V1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(e1));
                G.e = false;
                ((qfa) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(e1), k27Var.l);
                G.e = true;
                ((qfa) view).i(true, true);
            }
            u41 u41Var = this.T1;
            u41Var.setEnabled(!hashMap.isEmpty());
            u41Var.c(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.z5 && ((y1b) objArr[0]) == this.U1) {
            this.Y1.O(false);
            Y0();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X1 = this.U1.o();
        kk7.f(this.a).b(this, kk7.z5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U1.z(this.X1);
        kk7.f(this.a).n(this, kk7.z5);
    }
}
