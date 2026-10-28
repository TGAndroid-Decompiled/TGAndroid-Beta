package hi;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.u61;
public final class e2 implements Utilities.Callback2 {
    public final int f12955a;
    public final Object f12956b;

    public e2(Object obj, int i10) {
        this.f12955a = i10;
        this.f12956b = obj;
    }

    private final void a(Object obj, Object obj2) {
        vh.f fVar = (vh.f) this.f12956b;
        ArrayList arrayList = (ArrayList) obj;
        k71 k71Var = (k71) obj2;
        ArrayList arrayList2 = fVar.f50348a0;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int dp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
            int dp2 = AndroidUtilities.dp(88.0f) + fVar.f50359l0;
            arrayList.add(u61.E(0, dp2));
            int i10 = dp - dp2;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                for (TLRPC.TL_help_country tL_help_country : (List) fVar.Z.get((String) obj3)) {
                    if (TextUtils.isEmpty(fVar.f50350c0) || vg.z0.U(tL_help_country, AndroidUtilities.translitSafe(fVar.f50350c0).toLowerCase())) {
                        i10 -= AndroidUtilities.dp(44.0f);
                        boolean containsKey = fVar.f50357j0.containsKey(tL_help_country.iso2);
                        int i12 = vh.e.f50346a;
                        u61 K = u61.K(vh.e.class);
                        K.f33249l = tL_help_country.iso2;
                        K.G = tL_help_country;
                        K.e = containsKey;
                        arrayList.add(K);
                    }
                }
            }
            arrayList.add(u61.E(1, Math.max(0, i10)));
        }
    }

    private final void b(Object obj, Object obj2) {
        zh.c cVar = (zh.c) this.f12956b;
        ArrayList arrayList = (ArrayList) obj;
        k71 k71Var = (k71) obj2;
        List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = cVar.X;
        if (list == null) {
            return;
        }
        for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
            GiftAuctionController.Auction auction = cVar.Y;
            org.telegram.ui.web.c cVar2 = new org.telegram.ui.web.c(12, cVar, tL_StarGiftAuctionAcquiredGift);
            int i10 = zh.a.f52951a;
            u61 K = u61.K(zh.a.class);
            K.G = tL_StarGiftAuctionAcquiredGift;
            K.H = auction;
            K.D = cVar2;
            arrayList.add(K);
        }
        arrayList.add(u61.D(AndroidUtilities.dp(16.0f)));
    }

    private final void c(Object obj, Object obj2) {
        k71 k71Var = (k71) obj2;
        ((ArrayList) obj).add(u61.j(-1, ((zh.v) this.f12956b).Z));
    }

    @Override
    public final void run(java.lang.Object r24, java.lang.Object r25) {
        throw new UnsupportedOperationException("Method not decompiled: hi.e2.run(java.lang.Object, java.lang.Object):void");
    }
}
