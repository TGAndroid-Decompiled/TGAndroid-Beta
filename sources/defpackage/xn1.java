package defpackage;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class xn1 implements ed, d39, cu4 {
    public final byte a;
    public final long b;
    public final gk7 c;
    public final Object d;
    public final Object e;
    public final Object f;

    public xn1(Object obj, KeyEvent.Callback callback, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = (gk7) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j;
        this.f = obj3;
    }

    @Override
    public final void b(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        vqa vqaVar = (vqa) this.c;
        du4 du4Var = (du4) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
        oj ojVar = (oj) this.f;
        vqaVar.getClass();
        if (du4Var.F1) {
            return;
        }
        vqaVar.f2.setLoading(true);
        if (!du4Var.F1) {
            du4Var.F1 = true;
            du4Var.B1.h(true);
        }
        gta u = gta.u(vqaVar.a, ojVar);
        long j = this.b;
        u.E(tL_starGiftUnique, j, tL_textWithEntities, z, new tna(vqaVar, du4Var, ojVar, tL_starGiftUnique, j, tL_textWithEntities, z));
    }

    @Override
    public final void e(final float r18, final float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn1.e(float, float, int, android.view.View):void");
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        gk7 gk7Var = this.c;
        switch (b) {
            case 0:
                ((mu1) gk7Var).t9((TLRPC.TL_game) obj3, (k27) obj2, (String) obj, this.b);
                return;
            case 1:
            default:
                kxb kxbVar = (kxb) gk7Var;
                ArrayList arrayList = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj2;
                jc jcVar = (jc) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    long j = this.b;
                    if (i2 < size) {
                        Object obj4 = arrayList.get(i2);
                        i2++;
                        if (j == ((Integer) obj4).intValue()) {
                            kxbVar.k(0L, false);
                        }
                    } else {
                        kxbVar.l0.addAll(hashSet);
                        kxbVar.n();
                        u21.b0(kxbVar.s).U(k96.J0(hashSet.size(), "TopicsDeleted"), false, new mx8(kxbVar, hashSet, arrayList, j, (byte) 17), new a5b(kxbVar, arrayList, jcVar)).j();
                        hdVar.dismiss();
                        return;
                    }
                }
            case 2:
                ((vqa) gk7Var).j1(this.b, ((TL_stars.starGiftDepositPayload[]) obj3)[0], ((long[]) obj2)[0], hdVar.g(i, true, true), (xu4) obj);
                return;
        }
    }

    public xn1(vqa vqaVar, long j, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, long[] jArr, xu4 xu4Var) {
        this.a = (byte) 2;
        this.c = vqaVar;
        this.b = j;
        this.d = stargiftdepositpayloadArr;
        this.e = jArr;
        this.f = xu4Var;
    }

    public xn1(kxb kxbVar, ArrayList arrayList, long j, HashSet hashSet, jc jcVar) {
        this.a = (byte) 4;
        this.c = kxbVar;
        this.d = arrayList;
        this.b = j;
        this.e = hashSet;
        this.f = jcVar;
    }

    public xn1(mu1 mu1Var, TLRPC.TL_game tL_game, k27 k27Var, String str, long j) {
        this.a = (byte) 0;
        this.c = mu1Var;
        this.d = tL_game;
        this.e = k27Var;
        this.f = str;
        this.b = j;
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}
