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
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.z11;
import org.telegram.ui.bn;
public final class t1 implements org.telegram.ui.ActionBar.q1, bi.j1, rj0 {
    public final int f9772a;
    public final fs f9773b;
    public final long f9774c;
    public final Object d;
    public final Object f9775e;
    public final Object f9776f;

    public t1(f6 f6Var, long j3, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, long[] jArr, bi.f2 f2Var) {
        this.f9772a = 0;
        this.f9773b = f6Var;
        this.f9774c = j3;
        this.d = stargiftdepositpayloadArr;
        this.f9775e = jArr;
        this.f9776f = f2Var;
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public void a(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        f6 f6Var = (f6) this.f9773b;
        bi.k1 k1Var = (bi.k1) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f9775e;
        cg.b bVar = (cg.b) this.f9776f;
        if (k1Var.G1) {
            return;
        }
        f6Var.f8767g2.setLoading(true);
        if (!k1Var.G1) {
            k1Var.G1 = true;
            k1Var.C1.h(true);
        }
        y8 x10 = y8.x(f6Var.f30223a, bVar);
        long j3 = this.f9774c;
        x10.H(tL_starGiftUnique, j3, tL_textWithEntities, z10, new r1(f6Var, k1Var, bVar, tL_starGiftUnique, j3, tL_textWithEntities, z10));
    }

    @Override
    public void g(final float r18, final float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: di.t1.g(float, float, int, android.view.View):void");
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f9772a) {
            case 0:
                f6 f6Var = (f6) this.f9773b;
                f6Var.getClass();
                f6Var.v1(this.f9774c, ((TL_stars.starGiftDepositPayload[]) this.d)[0], ((long[]) this.f9775e)[0], t1Var.h(i7, true, true), (bi.f2) this.f9776f);
                return;
            case 1:
            default:
                z11 z11Var = (z11) this.f9773b;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.f9775e;
                ne neVar = (ne) this.f9776f;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    long j3 = this.f9774c;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (j3 == ((Integer) obj).intValue()) {
                            z11Var.n(0L, false);
                        }
                    } else {
                        z11Var.f42639l0.addAll(hashSet);
                        z11Var.q();
                        org.telegram.ui.Components.kc.b0(z11Var.f42642s).U(gd.K0(hashSet.size(), "TopicsDeleted"), false, new j2(z11Var, hashSet, arrayList, j3, 17), new sh0(z11Var, arrayList, neVar, 15)).j();
                        t1Var.dismiss();
                        return;
                    }
                }
            case 2:
                bn.f1((bn) this.f9773b, (TLRPC.TL_game) this.d, (fj) this.f9775e, (String) this.f9776f, this.f9774c);
                return;
        }
    }

    public t1(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i7) {
        this.f9772a = i7;
        this.f9773b = (fs) obj;
        this.d = callback;
        this.f9775e = obj2;
        this.f9774c = j3;
        this.f9776f = obj3;
    }

    public t1(bn bnVar, TLRPC.TL_game tL_game, fj fjVar, String str, long j3) {
        this.f9772a = 2;
        this.f9773b = bnVar;
        this.d = tL_game;
        this.f9775e = fjVar;
        this.f9776f = str;
        this.f9774c = j3;
    }

    public t1(z11 z11Var, ArrayList arrayList, long j3, HashSet hashSet, ne neVar) {
        this.f9772a = 4;
        this.f9773b = z11Var;
        this.d = arrayList;
        this.f9774c = j3;
        this.f9775e = hashSet;
        this.f9776f = neVar;
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
