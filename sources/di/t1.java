package di;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.z11;
import org.telegram.ui.bn;
public final class t1 implements org.telegram.ui.ActionBar.r1, bi.f1, pj0 {
    public final int f9792a;
    public final fs f9793b;
    public final long f9794c;
    public final Object d;
    public final Object f9795e;
    public final Object f9796f;

    public t1(f6 f6Var, long j3, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, long[] jArr, bi.a2 a2Var) {
        this.f9792a = 0;
        this.f9793b = f6Var;
        this.f9794c = j3;
        this.d = stargiftdepositpayloadArr;
        this.f9795e = jArr;
        this.f9796f = a2Var;
    }

    @Override
    public void b(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        f6 f6Var = (f6) this.f9793b;
        bi.g1 g1Var = (bi.g1) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f9795e;
        cg.b bVar = (cg.b) this.f9796f;
        if (g1Var.G1) {
            return;
        }
        f6Var.f8782g2.setLoading(true);
        if (!g1Var.G1) {
            g1Var.G1 = true;
            g1Var.C1.g(true);
        }
        x8 x10 = x8.x(f6Var.f30189a, bVar);
        long j3 = this.f9794c;
        x10.H(tL_starGiftUnique, j3, tL_textWithEntities, z10, new r1(f6Var, g1Var, bVar, tL_starGiftUnique, j3, tL_textWithEntities, z10));
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
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f9792a) {
            case 0:
                f6 f6Var = (f6) this.f9793b;
                f6Var.getClass();
                f6Var.v1(this.f9794c, ((TL_stars.starGiftDepositPayload[]) this.d)[0], ((long[]) this.f9795e)[0], u1Var.h(i7, true, true), (bi.a2) this.f9796f);
                return;
            case 1:
            default:
                z11 z11Var = (z11) this.f9793b;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.f9795e;
                me meVar = (me) this.f9796f;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    long j3 = this.f9794c;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (j3 == ((Integer) obj).intValue()) {
                            z11Var.n(0L, false);
                        }
                    } else {
                        z11Var.f42744l0.addAll(hashSet);
                        z11Var.q();
                        org.telegram.ui.Components.lc.b0(z11Var.f42747s).U(gd.K0(hashSet.size(), "TopicsDeleted"), false, new i2(z11Var, hashSet, arrayList, j3, 17), new hn0(z11Var, arrayList, meVar, 11)).j();
                        u1Var.dismiss();
                        return;
                    }
                }
            case 2:
                bn.f1((bn) this.f9793b, (TLRPC.TL_game) this.d, (fj) this.f9795e, (String) this.f9796f, this.f9794c);
                return;
        }
    }

    public t1(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i7) {
        this.f9792a = i7;
        this.f9793b = (fs) obj;
        this.d = callback;
        this.f9795e = obj2;
        this.f9794c = j3;
        this.f9796f = obj3;
    }

    public t1(bn bnVar, TLRPC.TL_game tL_game, fj fjVar, String str, long j3) {
        this.f9792a = 2;
        this.f9793b = bnVar;
        this.d = tL_game;
        this.f9795e = fjVar;
        this.f9796f = str;
        this.f9794c = j3;
    }

    public t1(z11 z11Var, ArrayList arrayList, long j3, HashSet hashSet, me meVar) {
        this.f9792a = 4;
        this.f9793b = z11Var;
        this.d = arrayList;
        this.f9794c = j3;
        this.f9795e = hashSet;
        this.f9796f = meVar;
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
