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
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.bn;
public final class t1 implements org.telegram.ui.ActionBar.q1, bi.j1, rj0 {
    public final int f9774a;
    public final gs f9775b;
    public final long f9776c;
    public final Object d;
    public final Object f9777e;
    public final Object f9778f;

    public t1(f6 f6Var, long j3, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, long[] jArr, bi.f2 f2Var) {
        this.f9774a = 0;
        this.f9775b = f6Var;
        this.f9776c = j3;
        this.d = stargiftdepositpayloadArr;
        this.f9777e = jArr;
        this.f9778f = f2Var;
    }

    @Override
    public void b(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        f6 f6Var = (f6) this.f9775b;
        bi.k1 k1Var = (bi.k1) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f9777e;
        cg.b bVar = (cg.b) this.f9778f;
        if (k1Var.G1) {
            return;
        }
        f6Var.f8768g2.setLoading(true);
        if (!k1Var.G1) {
            k1Var.G1 = true;
            k1Var.C1.g(true);
        }
        y8 x10 = y8.x(f6Var.f30139a, bVar);
        long j3 = this.f9776c;
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
        switch (this.f9774a) {
            case 0:
                f6 f6Var = (f6) this.f9775b;
                f6Var.getClass();
                f6Var.v1(this.f9776c, ((TL_stars.starGiftDepositPayload[]) this.d)[0], ((long[]) this.f9777e)[0], t1Var.h(i7, true, true), (bi.f2) this.f9778f);
                return;
            case 1:
            default:
                a21 a21Var = (a21) this.f9775b;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.f9777e;
                me meVar = (me) this.f9778f;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    long j3 = this.f9776c;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (j3 == ((Integer) obj).intValue()) {
                            a21Var.n(0L, false);
                        }
                    } else {
                        a21Var.f33262l0.addAll(hashSet);
                        a21Var.q();
                        org.telegram.ui.Components.lc.b0(a21Var.f33265s).U(hd.K0(hashSet.size(), "TopicsDeleted"), false, new i2(a21Var, hashSet, arrayList, j3, 17), new jn0(a21Var, arrayList, meVar, 11)).j();
                        t1Var.dismiss();
                        return;
                    }
                }
            case 2:
                bn.f1((bn) this.f9775b, (TLRPC.TL_game) this.d, (gj) this.f9777e, (String) this.f9778f, this.f9776c);
                return;
        }
    }

    public t1(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i7) {
        this.f9774a = i7;
        this.f9775b = (gs) obj;
        this.d = callback;
        this.f9777e = obj2;
        this.f9776c = j3;
        this.f9778f = obj3;
    }

    public t1(bn bnVar, TLRPC.TL_game tL_game, gj gjVar, String str, long j3) {
        this.f9774a = 2;
        this.f9775b = bnVar;
        this.d = tL_game;
        this.f9777e = gjVar;
        this.f9778f = str;
        this.f9776c = j3;
    }

    public t1(a21 a21Var, ArrayList arrayList, long j3, HashSet hashSet, me meVar) {
        this.f9774a = 4;
        this.f9775b = a21Var;
        this.d = arrayList;
        this.f9776c = j3;
        this.f9777e = hashSet;
        this.f9778f = meVar;
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
