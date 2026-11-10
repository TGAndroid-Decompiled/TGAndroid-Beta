package hi;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.s9;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.x31;
public final class u1 implements v10 {
    public final int f14978a;
    public final Object f14979b;

    public u1(Object obj, int i7) {
        this.f14978a = i7;
        this.f14979b = obj;
    }

    private final void b(Object obj, Object obj2) {
        vh.g gVar = (vh.g) this.f14979b;
        ArrayList arrayList = (ArrayList) obj;
        m41 m41Var = (m41) obj2;
        ArrayList arrayList2 = gVar.V1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int L = org.telegram.messenger.g0.L(13.0f) + ((org.telegram.messenger.g0.f22567q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(68.0f));
            int L2 = org.telegram.messenger.g0.L(88.0f) + gVar.f57526g2;
            arrayList.add(x31.E(0, L2));
            int i7 = L - L2;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                for (TLRPC.TL_help_country tL_help_country : (List) gVar.U1.get((String) obj3)) {
                    if (TextUtils.isEmpty(gVar.X1) || wg.w0.g1(tL_help_country, org.telegram.messenger.g0.O3(gVar.X1).toLowerCase())) {
                        i7 -= org.telegram.messenger.g0.L(44.0f);
                        boolean containsKey = gVar.f57524e2.containsKey(tL_help_country.iso2);
                        int i11 = vh.f.f57519b;
                        x31 K = x31.K(vh.f.class);
                        K.f40156l = tL_help_country.iso2;
                        K.G = tL_help_country;
                        K.f40150e = containsKey;
                        arrayList.add(K);
                    }
                }
            }
            arrayList.add(x31.E(1, Math.max(0, i7)));
        }
    }

    private final void c(Object obj, Object obj2) {
        zh.d dVar = (zh.d) this.f14979b;
        ArrayList arrayList = (ArrayList) obj;
        m41 m41Var = (m41) obj2;
        List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = dVar.S1;
        if (list == null) {
            return;
        }
        for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
            s9 s9Var = dVar.T1;
            wg.a1 a1Var = new wg.a1(5, dVar, tL_StarGiftAuctionAcquiredGift);
            int i7 = zh.b.f60215b;
            x31 K = x31.K(zh.b.class);
            K.G = tL_StarGiftAuctionAcquiredGift;
            K.H = s9Var;
            K.D = a1Var;
            arrayList.add(K);
        }
        arrayList.add(x31.D(org.telegram.messenger.g0.L(16.0f)));
    }

    private final void d(Object obj, Object obj2) {
        m41 m41Var = (m41) obj2;
        ((ArrayList) obj).add(((zh.f) this.f14979b).S1);
    }

    private final void e(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        m41 m41Var = (m41) obj2;
        arrayList.add(((zh.l) this.f14979b).T1);
        arrayList.add(x31.D(org.telegram.messenger.g0.L(16.0f)));
    }

    private final void f(Object obj, Object obj2) {
        m41 m41Var = (m41) obj2;
        ((ArrayList) obj).add(x31.j(-1, ((zh.u) this.f14979b).U1));
    }

    @Override
    public final void a(java.lang.Object r26, java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: hi.u1.a(java.lang.Object, java.lang.Object):void");
    }
}
