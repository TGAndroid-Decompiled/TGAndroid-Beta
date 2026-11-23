package di;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.bn;
public final class t1 implements org.telegram.ui.ActionBar.q1, bi.j1, rj0 {
    public final int f9811a;
    public final gs f9812b;
    public final long f9813c;
    public final Object d;
    public final Object f9814e;
    public final Object f9815f;

    public t1(f6 f6Var, long j3, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, long[] jArr, bi.e2 e2Var) {
        this.f9811a = 0;
        this.f9812b = f6Var;
        this.f9813c = j3;
        this.d = stargiftdepositpayloadArr;
        this.f9814e = jArr;
        this.f9815f = e2Var;
    }

    @Override
    public void b(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        f6 f6Var = (f6) this.f9812b;
        bi.k1 k1Var = (bi.k1) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f9814e;
        cg.b bVar = (cg.b) this.f9815f;
        if (k1Var.G1) {
            return;
        }
        f6Var.f8806g2.setLoading(true);
        if (!k1Var.G1) {
            k1Var.G1 = true;
            k1Var.C1.g(true);
        }
        y8 x10 = y8.x(f6Var.f30173a, bVar);
        long j3 = this.f9813c;
        x10.H(tL_starGiftUnique, j3, tL_textWithEntities, z10, new r1(f6Var, k1Var, bVar, tL_starGiftUnique, j3, tL_textWithEntities, z10));
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(final float r18, final float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: di.t1.f(float, float, int, android.view.View):void");
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f9811a) {
            case 0:
                f6 f6Var = (f6) this.f9812b;
                f6Var.getClass();
                f6Var.v1(this.f9813c, ((TL_stars.starGiftDepositPayload[]) this.d)[0], ((long[]) this.f9814e)[0], t1Var.h(i7, true, true), (bi.e2) this.f9815f);
                return;
            case 1:
            default:
                a21 a21Var = (a21) this.f9812b;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.f9814e;
                me meVar = (me) this.f9815f;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    long j3 = this.f9813c;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (j3 == ((Integer) obj).intValue()) {
                            a21Var.n(0L, false);
                        }
                    } else {
                        a21Var.f33296l0.addAll(hashSet);
                        a21Var.q();
                        org.telegram.ui.Components.lc.b0(a21Var.f33299s).U(hd.K0(hashSet.size(), "TopicsDeleted"), false, new j2(a21Var, hashSet, arrayList, j3, 17), new fm0(a21Var, arrayList, meVar, 13)).j();
                        t1Var.dismiss();
                        return;
                    }
                }
            case 2:
                bn.f1((bn) this.f9812b, (TLRPC.TL_game) this.d, (gj) this.f9814e, (String) this.f9815f, this.f9813c);
                return;
        }
    }

    public t1(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i7) {
        this.f9811a = i7;
        this.f9812b = (gs) obj;
        this.d = callback;
        this.f9814e = obj2;
        this.f9813c = j3;
        this.f9815f = obj3;
    }

    public t1(bn bnVar, TLRPC.TL_game tL_game, gj gjVar, String str, long j3) {
        this.f9811a = 2;
        this.f9812b = bnVar;
        this.d = tL_game;
        this.f9814e = gjVar;
        this.f9815f = str;
        this.f9813c = j3;
    }

    public t1(a21 a21Var, ArrayList arrayList, long j3, HashSet hashSet, me meVar) {
        this.f9811a = 4;
        this.f9812b = a21Var;
        this.d = arrayList;
        this.f9813c = j3;
        this.f9814e = hashSet;
        this.f9815f = meVar;
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
