package defpackage;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jp1 implements ee, g59, ew4 {
    public final byte a;
    public final long b;
    public final jm7 c;
    public final Object d;
    public final Object e;
    public final Object f;

    public jp1(Object obj, KeyEvent.Callback callback, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = (jm7) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j;
        this.f = obj3;
    }

    @Override
    public final void b(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        wsa wsaVar = (wsa) this.c;
        fw4 fw4Var = (fw4) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
        ok okVar = (ok) this.f;
        wsaVar.getClass();
        if (fw4Var.F1) {
            return;
        }
        wsaVar.f2.setLoading(true);
        if (!fw4Var.F1) {
            fw4Var.F1 = true;
            fw4Var.B1.h(true);
        }
        jva u = jva.u(wsaVar.a, okVar);
        long j = this.b;
        u.E(tL_starGiftUnique, j, tL_textWithEntities, z, new tpa(wsaVar, fw4Var, okVar, tL_starGiftUnique, j, tL_textWithEntities, z));
    }

    @Override
    public final void d(final float r18, final float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp1.d(float, float, int, android.view.View):void");
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        jm7 jm7Var = this.c;
        switch (b) {
            case 0:
                ((yv1) jm7Var).F9((TLRPC.TL_game) obj3, (k47) obj2, (String) obj, this.b);
                return;
            case 1:
            default:
                mzb mzbVar = (mzb) jm7Var;
                ArrayList arrayList = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj2;
                jd jdVar = (jd) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    long j = this.b;
                    if (i2 < size) {
                        Object obj4 = arrayList.get(i2);
                        i2++;
                        if (j == ((Integer) obj4).intValue()) {
                            mzbVar.k(0L, false);
                        }
                    } else {
                        mzbVar.l0.addAll(hashSet);
                        mzbVar.n();
                        c41.b0(mzbVar.s).U(jb6.J0(hashSet.size(), "TopicsDeleted"), false, new nz8(mzbVar, hashSet, arrayList, j, (byte) 17), new b7b(mzbVar, arrayList, jdVar)).j();
                        heVar.dismiss();
                        return;
                    }
                }
            case 2:
                ((wsa) jm7Var).j1(this.b, ((TL_stars.starGiftDepositPayload[]) obj3)[0], ((long[]) obj2)[0], heVar.g(i, true, true), (yw4) obj);
                return;
        }
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    public jp1(wsa wsaVar, long j, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, long[] jArr, yw4 yw4Var) {
        this.a = (byte) 2;
        this.c = wsaVar;
        this.b = j;
        this.d = stargiftdepositpayloadArr;
        this.e = jArr;
        this.f = yw4Var;
    }

    public jp1(mzb mzbVar, ArrayList arrayList, long j, HashSet hashSet, jd jdVar) {
        this.a = (byte) 4;
        this.c = mzbVar;
        this.d = arrayList;
        this.b = j;
        this.e = hashSet;
        this.f = jdVar;
    }

    public jp1(yv1 yv1Var, TLRPC.TL_game tL_game, k47 k47Var, String str, long j) {
        this.a = (byte) 0;
        this.c = yv1Var;
        this.d = tL_game;
        this.e = k47Var;
        this.f = str;
        this.b = j;
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}
