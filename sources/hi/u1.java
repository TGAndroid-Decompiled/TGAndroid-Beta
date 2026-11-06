package hi;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.s9;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.r31;
public final class u1 implements v10 {
    public final int f14973a;
    public final Object f14974b;

    public u1(Object obj, int i7) {
        this.f14973a = i7;
        this.f14974b = obj;
    }

    private final void b(Object obj, Object obj2) {
        vh.g gVar = (vh.g) this.f14974b;
        ArrayList arrayList = (ArrayList) obj;
        f41 f41Var = (f41) obj2;
        ArrayList arrayList2 = gVar.S1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int L = org.telegram.messenger.g0.L(13.0f) + ((org.telegram.messenger.g0.f22537q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(68.0f));
            int L2 = org.telegram.messenger.g0.L(88.0f) + gVar.d2;
            arrayList.add(r31.E(0, L2));
            int i7 = L - L2;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                for (TLRPC.TL_help_country tL_help_country : (List) gVar.R1.get((String) obj3)) {
                    if (TextUtils.isEmpty(gVar.U1) || wg.w0.g1(tL_help_country, org.telegram.messenger.g0.O3(gVar.U1).toLowerCase())) {
                        i7 -= org.telegram.messenger.g0.L(44.0f);
                        boolean containsKey = gVar.f57397b2.containsKey(tL_help_country.iso2);
                        int i11 = vh.f.f57394b;
                        r31 K = r31.K(vh.f.class);
                        K.f37598l = tL_help_country.iso2;
                        K.G = tL_help_country;
                        K.f37592e = containsKey;
                        arrayList.add(K);
                    }
                }
            }
            arrayList.add(r31.E(1, Math.max(0, i7)));
        }
    }

    private final void c(Object obj, Object obj2) {
        zh.d dVar = (zh.d) this.f14974b;
        ArrayList arrayList = (ArrayList) obj;
        f41 f41Var = (f41) obj2;
        List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = dVar.P1;
        if (list == null) {
            return;
        }
        for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
            s9 s9Var = dVar.Q1;
            wg.z0 z0Var = new wg.z0(6, dVar, tL_StarGiftAuctionAcquiredGift);
            int i7 = zh.b.f60095b;
            r31 K = r31.K(zh.b.class);
            K.G = tL_StarGiftAuctionAcquiredGift;
            K.H = s9Var;
            K.D = z0Var;
            arrayList.add(K);
        }
        arrayList.add(r31.D(org.telegram.messenger.g0.L(16.0f)));
    }

    private final void d(Object obj, Object obj2) {
        f41 f41Var = (f41) obj2;
        ((ArrayList) obj).add(((zh.f) this.f14974b).P1);
    }

    private final void e(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        f41 f41Var = (f41) obj2;
        arrayList.add(((zh.m) this.f14974b).Q1);
        arrayList.add(r31.D(org.telegram.messenger.g0.L(16.0f)));
    }

    private final void f(Object obj, Object obj2) {
        f41 f41Var = (f41) obj2;
        ((ArrayList) obj).add(r31.j(-1, ((zh.v) this.f14974b).R1));
    }

    @Override
    public final void a(java.lang.Object r26, java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: hi.u1.a(java.lang.Object, java.lang.Object):void");
    }
}
