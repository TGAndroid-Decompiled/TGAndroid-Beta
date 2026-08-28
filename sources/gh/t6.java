package gh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
public final class t6 implements Runnable {
    public final int f8917a;
    public final v7 f8918b;
    public final TLObject f8919c;

    public t6(v7 v7Var, TLObject tLObject, int i9) {
        this.f8917a = i9;
        this.f8918b = v7Var;
        this.f8919c = tLObject;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f8917a) {
            case 0:
                v7 v7Var = this.f8918b;
                int i9 = v7Var.f9045a;
                v7Var.A = false;
                TLObject tLObject = this.f8919c;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i9).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i9).putChats(starsStatus.chats, false);
                    v7Var.f9067z.addAll(starsStatus.subscriptions);
                    v7Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                    return;
                }
                return;
            case 1:
                v7 v7Var2 = this.f8918b;
                int i10 = v7Var2.f9045a;
                v7Var2.f9065x = false;
                TLObject tLObject2 = this.f8919c;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                    MessagesController.getInstance(i10).putUsers(starsStatus2.users, false);
                    MessagesController.getInstance(i10).putChats(starsStatus2.chats, false);
                    v7Var2.v.addAll(starsStatus2.subscriptions);
                    if ((starsStatus2.flags & 4) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    v7Var2.f9066y = z10;
                    v7Var2.f9064w = starsStatus2.subscriptions_next_offset;
                    v7Var2.k0(starsStatus2.balance);
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                    return;
                }
                return;
            case 2:
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                TLObject tLObject3 = this.f8919c;
                boolean z11 = tLObject3 instanceof Vector;
                final v7 v7Var3 = this.f8918b;
                if (z11) {
                    ArrayList<T> arrayList3 = ((Vector) tLObject3).objects;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList3.get(i11);
                        i11++;
                        if (obj instanceof TL_stars.TL_starsTopupOption) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj;
                            arrayList.add(tL_starsTopupOption);
                            if (tL_starsTopupOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList2.add(tL_starsTopupOption);
                                tL_starsTopupOption.loadingStorePrice = true;
                            }
                        }
                    }
                    v7Var3.f9051i = true;
                }
                v7Var3.f9052j = arrayList;
                v7Var3.h = false;
                NotificationCenter.getInstance(v7Var3.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                if (!arrayList2.isEmpty()) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ArrayList arrayList4 = new ArrayList();
                                    int i12 = 0;
                                    while (true) {
                                        final ArrayList arrayList5 = arrayList2;
                                        if (i12 < arrayList5.size()) {
                                            b9.c cVar = new b9.c();
                                            cVar.f1663c = "inapp";
                                            cVar.f1662b = ((TL_stars.TL_starsTopupOption) arrayList5.get(i12)).store_product;
                                            arrayList4.add(cVar.a());
                                            i12++;
                                        } else {
                                            BillingController billingController = BillingController.getInstance();
                                            final v7 v7Var4 = v7Var3;
                                            billingController.queryProductDetails(arrayList4, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final v7 v7Var5 = v7Var4;
                                                            final ArrayList arrayList6 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i13 = 0; i13 < list2.size(); i13++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i13);
                                                                                    int i14 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7 = arrayList6;
                                                                                        if (i14 < arrayList7.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7.get(i14)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList7.get(i14);
                                                                                            } else {
                                                                                                i14++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f18324c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var6 = v7Var5;
                                                                            if (v7Var6.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var6.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var6.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var6.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8 = arrayList6;
                                                                                        if (i17 < arrayList8.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var7 = v7Var5;
                                                                            if (v7Var7.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var7.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var7.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var7.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList6;
                                                                                        if (i20 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var5;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final v7 v7Var6 = v7Var4;
                                                            final ArrayList arrayList7 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i13 = 0; i13 < list2.size(); i13++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i13);
                                                                                    int i14 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList7;
                                                                                        if (i14 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i14)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i14);
                                                                                            } else {
                                                                                                i14++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f18324c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var62 = v7Var6;
                                                                            if (v7Var62.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var62.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var62.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var62.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8 = arrayList7;
                                                                                        if (i17 < arrayList8.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var7 = v7Var6;
                                                                            if (v7Var7.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var7.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var7.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var7.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList7;
                                                                                        if (i20 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var6;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final v7 v7Var7 = v7Var4;
                                                            final ArrayList arrayList8 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i13 = 0; i13 < list2.size(); i13++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i13);
                                                                                    int i14 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList8;
                                                                                        if (i14 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i14)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i14);
                                                                                            } else {
                                                                                                i14++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f18324c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var62 = v7Var7;
                                                                            if (v7Var62.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var62.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var62.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var62.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList8;
                                                                                        if (i17 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var7;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList8;
                                                                                        if (i20 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var7;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList6 = new ArrayList();
                                    int i13 = 0;
                                    while (true) {
                                        final ArrayList arrayList7 = arrayList2;
                                        if (i13 < arrayList7.size()) {
                                            b9.c cVar2 = new b9.c();
                                            cVar2.f1663c = "inapp";
                                            cVar2.f1662b = ((TL_stars.TL_starsGiftOption) arrayList7.get(i13)).store_product;
                                            arrayList6.add(cVar2.a());
                                            i13++;
                                        } else {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final v7 v7Var5 = v7Var3;
                                            billingController2.queryProductDetails(arrayList6, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final v7 v7Var52 = v7Var5;
                                                            final ArrayList arrayList62 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i14 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList62;
                                                                                        if (i14 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i14)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i14);
                                                                                            } else {
                                                                                                i14++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f18324c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var62 = v7Var52;
                                                                            if (v7Var62.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var62.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var62.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var62.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList62;
                                                                                        if (i17 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var52;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList62;
                                                                                        if (i20 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var52;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final v7 v7Var6 = v7Var5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i14 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i14 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i14)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i14);
                                                                                            } else {
                                                                                                i14++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f18324c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var62 = v7Var6;
                                                                            if (v7Var62.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var62.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var62.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var62.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList72;
                                                                                        if (i17 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var6;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList72;
                                                                                        if (i20 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var6;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final v7 v7Var7 = v7Var5;
                                                            final ArrayList arrayList8 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i14 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList8;
                                                                                        if (i14 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i14)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i14);
                                                                                            } else {
                                                                                                i14++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f18324c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var62 = v7Var7;
                                                                            if (v7Var62.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var62.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var62.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var62.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList8;
                                                                                        if (i17 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var7;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList8;
                                                                                        if (i20 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var7;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                                default:
                                    ArrayList arrayList8 = new ArrayList();
                                    int i14 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList2;
                                        if (i14 < arrayList9.size()) {
                                            b9.c cVar3 = new b9.c();
                                            cVar3.f1663c = "inapp";
                                            cVar3.f1662b = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i14)).store_product;
                                            arrayList8.add(cVar3.a());
                                            i14++;
                                        } else {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final v7 v7Var6 = v7Var3;
                                            billingController3.queryProductDetails(arrayList8, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final v7 v7Var52 = v7Var6;
                                                            final ArrayList arrayList62 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList62;
                                                                                        if (i142 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f18324c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var62 = v7Var52;
                                                                            if (v7Var62.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var62.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var62.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var62.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList62;
                                                                                        if (i17 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var52;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList62;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var52;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final v7 v7Var62 = v7Var6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i142 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f18324c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var62;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList72;
                                                                                        if (i17 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var62;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var62;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final v7 v7Var7 = v7Var6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i142 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f18324c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var7;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var7;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var7;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                            }
                        }
                    };
                    if (!BillingController.getInstance().isReady()) {
                        BillingController.getInstance().whenSetuped(runnable);
                        return;
                    } else {
                        runnable.run();
                        return;
                    }
                }
                return;
            case 3:
                ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                TLObject tLObject4 = this.f8919c;
                boolean z12 = tLObject4 instanceof Vector;
                final v7 v7Var4 = this.f8918b;
                if (z12) {
                    ArrayList<T> arrayList6 = ((Vector) tLObject4).objects;
                    int size2 = arrayList6.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = arrayList6.get(i12);
                        i12++;
                        if (obj2 instanceof TL_stars.TL_starsGiftOption) {
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                            arrayList4.add(tL_starsGiftOption);
                            if (tL_starsGiftOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList5.add(tL_starsGiftOption);
                                tL_starsGiftOption.loadingStorePrice = true;
                            }
                        }
                    }
                    v7Var4.f9054l = true;
                }
                v7Var4.f9055m = arrayList4;
                v7Var4.f9053k = false;
                NotificationCenter.getInstance(v7Var4.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                if (!arrayList5.isEmpty()) {
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ArrayList arrayList42 = new ArrayList();
                                    int i122 = 0;
                                    while (true) {
                                        final ArrayList arrayList52 = arrayList5;
                                        if (i122 < arrayList52.size()) {
                                            b9.c cVar = new b9.c();
                                            cVar.f1663c = "inapp";
                                            cVar.f1662b = ((TL_stars.TL_starsTopupOption) arrayList52.get(i122)).store_product;
                                            arrayList42.add(cVar.a());
                                            i122++;
                                        } else {
                                            BillingController billingController = BillingController.getInstance();
                                            final v7 v7Var42 = v7Var4;
                                            billingController.queryProductDetails(arrayList42, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final v7 v7Var52 = v7Var42;
                                                            final ArrayList arrayList62 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList62;
                                                                                        if (i142 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var52;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList62;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var52;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList62;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var52;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final v7 v7Var62 = v7Var42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i142 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var62;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var62;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var62;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final v7 v7Var7 = v7Var42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i142 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var7;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var7;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var7;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    int i13 = 0;
                                    while (true) {
                                        final ArrayList arrayList7 = arrayList5;
                                        if (i13 < arrayList7.size()) {
                                            b9.c cVar2 = new b9.c();
                                            cVar2.f1663c = "inapp";
                                            cVar2.f1662b = ((TL_stars.TL_starsGiftOption) arrayList7.get(i13)).store_product;
                                            arrayList62.add(cVar2.a());
                                            i13++;
                                        } else {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final v7 v7Var5 = v7Var4;
                                            billingController2.queryProductDetails(arrayList62, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final v7 v7Var52 = v7Var5;
                                                            final ArrayList arrayList622 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i142 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var52;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var52;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var52;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final v7 v7Var62 = v7Var5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i142 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var62;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var62;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var62;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final v7 v7Var7 = v7Var5;
                                                            final ArrayList arrayList82 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i142 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var7;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var7;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var7;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                                default:
                                    ArrayList arrayList8 = new ArrayList();
                                    int i14 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList5;
                                        if (i14 < arrayList9.size()) {
                                            b9.c cVar3 = new b9.c();
                                            cVar3.f1663c = "inapp";
                                            cVar3.f1662b = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i14)).store_product;
                                            arrayList8.add(cVar3.a());
                                            i14++;
                                        } else {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final v7 v7Var6 = v7Var4;
                                            billingController3.queryProductDetails(arrayList8, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final v7 v7Var52 = v7Var6;
                                                            final ArrayList arrayList622 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i142 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var52;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var52;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var52;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final v7 v7Var62 = v7Var6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i142 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var62;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var62;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var62;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final v7 v7Var7 = v7Var6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i142 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var7;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var7;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var7;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                            }
                        }
                    };
                    if (!BillingController.getInstance().isReady()) {
                        BillingController.getInstance().whenSetuped(runnable2);
                        return;
                    } else {
                        runnable2.run();
                        return;
                    }
                }
                return;
            case 4:
                ArrayList arrayList7 = new ArrayList();
                final ArrayList arrayList8 = new ArrayList();
                TLObject tLObject5 = this.f8919c;
                boolean z13 = tLObject5 instanceof Vector;
                final v7 v7Var5 = this.f8918b;
                if (z13) {
                    ArrayList<T> arrayList9 = ((Vector) tLObject5).objects;
                    int size3 = arrayList9.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj3 = arrayList9.get(i13);
                        i13++;
                        if (obj3 instanceof TL_stars.TL_starsGiveawayOption) {
                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                            arrayList7.add(tL_starsGiveawayOption);
                            if (tL_starsGiveawayOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList8.add(tL_starsGiveawayOption);
                                tL_starsGiveawayOption.loadingStorePrice = true;
                            }
                        }
                    }
                    v7Var5.f9057o = true;
                }
                v7Var5.f9058p = arrayList7;
                v7Var5.f9056n = false;
                NotificationCenter.getInstance(v7Var5.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                if (!arrayList8.isEmpty()) {
                    Runnable runnable3 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ArrayList arrayList42 = new ArrayList();
                                    int i122 = 0;
                                    while (true) {
                                        final ArrayList arrayList52 = arrayList8;
                                        if (i122 < arrayList52.size()) {
                                            b9.c cVar = new b9.c();
                                            cVar.f1663c = "inapp";
                                            cVar.f1662b = ((TL_stars.TL_starsTopupOption) arrayList52.get(i122)).store_product;
                                            arrayList42.add(cVar.a());
                                            i122++;
                                        } else {
                                            BillingController billingController = BillingController.getInstance();
                                            final v7 v7Var42 = v7Var5;
                                            billingController.queryProductDetails(arrayList42, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final v7 v7Var52 = v7Var42;
                                                            final ArrayList arrayList622 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i142 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var52;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var52;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var52;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final v7 v7Var62 = v7Var42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i142 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var62;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var62;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var62;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final v7 v7Var7 = v7Var42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i132 = 0; i132 < list2.size(); i132++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i132);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i142 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var7;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var7;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var7;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    int i132 = 0;
                                    while (true) {
                                        final ArrayList arrayList72 = arrayList8;
                                        if (i132 < arrayList72.size()) {
                                            b9.c cVar2 = new b9.c();
                                            cVar2.f1663c = "inapp";
                                            cVar2.f1662b = ((TL_stars.TL_starsGiftOption) arrayList72.get(i132)).store_product;
                                            arrayList62.add(cVar2.a());
                                            i132++;
                                        } else {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final v7 v7Var52 = v7Var5;
                                            billingController2.queryProductDetails(arrayList62, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final v7 v7Var522 = v7Var52;
                                                            final ArrayList arrayList622 = arrayList72;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1322 = 0; i1322 < list2.size(); i1322++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i1322);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i142 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var522;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var522;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var522;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final v7 v7Var62 = v7Var52;
                                                            final ArrayList arrayList722 = arrayList72;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1322 = 0; i1322 < list2.size(); i1322++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i1322);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList722;
                                                                                        if (i142 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var62;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList722;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var62;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList722;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var62;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final v7 v7Var7 = v7Var52;
                                                            final ArrayList arrayList82 = arrayList72;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1322 = 0; i1322 < list2.size(); i1322++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i1322);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList82;
                                                                                        if (i142 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var7;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var7;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i20 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var7;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                                default:
                                    ArrayList arrayList82 = new ArrayList();
                                    int i14 = 0;
                                    while (true) {
                                        final ArrayList arrayList92 = arrayList8;
                                        if (i14 < arrayList92.size()) {
                                            b9.c cVar3 = new b9.c();
                                            cVar3.f1663c = "inapp";
                                            cVar3.f1662b = ((TL_stars.TL_starsGiveawayOption) arrayList92.get(i14)).store_product;
                                            arrayList82.add(cVar3.a());
                                            i14++;
                                        } else {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final v7 v7Var6 = v7Var5;
                                            billingController3.queryProductDetails(arrayList82, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final v7 v7Var522 = v7Var6;
                                                            final ArrayList arrayList622 = arrayList92;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1322 = 0; i1322 < list2.size(); i1322++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i1322);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList622;
                                                                                        if (i142 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var522;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var522;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList622;
                                                                                        if (i20 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var522;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final v7 v7Var62 = v7Var6;
                                                            final ArrayList arrayList722 = arrayList92;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1322 = 0; i1322 < list2.size(); i1322++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i1322);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList722;
                                                                                        if (i142 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var62;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList722;
                                                                                        if (i17 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var62;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList722;
                                                                                        if (i20 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var62;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final v7 v7Var7 = v7Var6;
                                                            final ArrayList arrayList822 = arrayList92;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18319a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1322 = 0; i1322 < list2.size(); i1322++) {
                                                                                    n2.l lVar = (n2.l) list2.get(i1322);
                                                                                    int i142 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList822;
                                                                                        if (i142 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i142)).store_product.equals(lVar.f18335c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i142);
                                                                                            } else {
                                                                                                i142++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f18324c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var622 = v7Var7;
                                                                            if (v7Var622.f9055m != null) {
                                                                                for (int i15 = 0; i15 < v7Var622.f9055m.size(); i15++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.f9055m.get(i15);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var622.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18319a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                    n2.l lVar2 = (n2.l) list3.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8222 = arrayList822;
                                                                                        if (i17 < arrayList8222.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8222.get(i17)).store_product.equals(lVar2.f18335c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList8222.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a3.f18324c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var72 = v7Var7;
                                                                            if (v7Var72.f9058p != null) {
                                                                                for (int i18 = 0; i18 < v7Var72.f9058p.size(); i18++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.f9058p.get(i18);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var72.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18319a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18319a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                    n2.l lVar3 = (n2.l) list4.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList822;
                                                                                        if (i20 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i20)).store_product.equals(lVar3.f18335c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a10.f18324c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.f18323b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            v7 v7Var8 = v7Var7;
                                                                            if (v7Var8.f9052j != null) {
                                                                                for (int i21 = 0; i21 < v7Var8.f9052j.size(); i21++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.f9052j.get(i21);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(v7Var8.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                            }
                        }
                    };
                    if (!BillingController.getInstance().isReady()) {
                        BillingController.getInstance().whenSetuped(runnable3);
                        return;
                    } else {
                        runnable3.run();
                        return;
                    }
                }
                return;
            default:
                MessagesController.getInstance(this.f8918b.f9045a).processUpdates((TLRPC.Updates) this.f8919c, false);
                return;
        }
    }
}
