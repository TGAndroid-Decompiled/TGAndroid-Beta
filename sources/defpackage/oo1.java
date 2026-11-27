package defpackage;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class oo1 implements fd, s69, gw4 {
    public final byte a;
    public final long b;
    public final fn7 c;
    public final Object d;
    public final Object e;
    public final Object f;

    public oo1(Object obj, KeyEvent.Callback callback, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = (fn7) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j;
        this.f = obj3;
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final void b(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        wua wuaVar = (wua) this.c;
        hw4 hw4Var = (hw4) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
        pj pjVar = (pj) this.f;
        wuaVar.getClass();
        if (hw4Var.F1) {
            return;
        }
        wuaVar.f2.setLoading(true);
        hw4Var.G0(true);
        jxa u = jxa.u(wuaVar.a, pjVar);
        long j = this.b;
        u.E(tL_starGiftUnique, j, tL_textWithEntities, z, new pra(wuaVar, hw4Var, pjVar, tL_starGiftUnique, j, tL_textWithEntities, z));
    }

    @Override
    public final void d(final float r18, final float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo1.d(float, float, int, android.view.View):void");
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                ((zu1) fn7Var).G9((TLRPC.TL_game) obj3, (r47) obj2, (String) obj, this.b);
                return;
            case 1:
            default:
                l1c l1cVar = (l1c) fn7Var;
                ArrayList arrayList = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj2;
                kc kcVar = (kc) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    long j = this.b;
                    if (i2 < size) {
                        Object obj4 = arrayList.get(i2);
                        i2++;
                        if (j == ((Integer) obj4).intValue()) {
                            l1cVar.k(0L, false);
                        }
                    } else {
                        l1cVar.l0.addAll(hashSet);
                        l1cVar.n();
                        d31.b0(l1cVar.s).U(ob6.J0(hashSet.size(), "TopicsDeleted"), false, new z09(l1cVar, hashSet, arrayList, j, (byte) 17), new hab(l1cVar, arrayList, kcVar)).j();
                        idVar.dismiss();
                        return;
                    }
                }
            case 2:
                ((wua) fn7Var).k1(this.b, ((TL_stars.starGiftDepositPayload[]) obj3)[0], ((long[]) obj2)[0], idVar.g(i, true, true), (bx4) obj);
                return;
        }
    }

    public oo1(wua wuaVar, long j, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, long[] jArr, bx4 bx4Var) {
        this.a = (byte) 2;
        this.c = wuaVar;
        this.b = j;
        this.d = stargiftdepositpayloadArr;
        this.e = jArr;
        this.f = bx4Var;
    }

    public oo1(l1c l1cVar, ArrayList arrayList, long j, HashSet hashSet, kc kcVar) {
        this.a = (byte) 4;
        this.c = l1cVar;
        this.d = arrayList;
        this.b = j;
        this.e = hashSet;
        this.f = kcVar;
    }

    public oo1(zu1 zu1Var, TLRPC.TL_game tL_game, r47 r47Var, String str, long j) {
        this.a = (byte) 0;
        this.c = zu1Var;
        this.d = tL_game;
        this.e = r47Var;
        this.f = str;
        this.b = j;
    }

    @Override
    public final void u(View view, float f, float f2) {
    }
}
