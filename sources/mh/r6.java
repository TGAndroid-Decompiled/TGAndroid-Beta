package mh;

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
public final class r6 implements Runnable {
    public final int f14693a;
    public final t7 f14694b;
    public final TLObject f14695c;

    public r6(t7 t7Var, TLObject tLObject, int i10) {
        this.f14693a = i10;
        this.f14694b = t7Var;
        this.f14695c = tLObject;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f14693a) {
            case 0:
                t7 t7Var = this.f14694b;
                int i10 = t7Var.f14830a;
                t7Var.A = false;
                TLObject tLObject = this.f14695c;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i10).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i10).putChats(starsStatus.chats, false);
                    t7Var.f14852z.addAll(starsStatus.subscriptions);
                    t7Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                    return;
                }
                return;
            case 1:
                t7 t7Var2 = this.f14694b;
                int i11 = t7Var2.f14830a;
                t7Var2.f14850x = false;
                TLObject tLObject2 = this.f14695c;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                    MessagesController.getInstance(i11).putUsers(starsStatus2.users, false);
                    MessagesController.getInstance(i11).putChats(starsStatus2.chats, false);
                    t7Var2.v.addAll(starsStatus2.subscriptions);
                    if ((starsStatus2.flags & 4) == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    t7Var2.f14851y = z4;
                    t7Var2.f14849w = starsStatus2.subscriptions_next_offset;
                    t7Var2.k0(starsStatus2.balance);
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                    return;
                }
                return;
            case 2:
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                TLObject tLObject3 = this.f14695c;
                boolean z10 = tLObject3 instanceof Vector;
                final t7 t7Var3 = this.f14694b;
                if (z10) {
                    ArrayList<T> arrayList3 = ((Vector) tLObject3).objects;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList3.get(i12);
                        i12++;
                        if (obj instanceof TL_stars.TL_starsTopupOption) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj;
                            arrayList.add(tL_starsTopupOption);
                            if (tL_starsTopupOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList2.add(tL_starsTopupOption);
                                tL_starsTopupOption.loadingStorePrice = true;
                            }
                        }
                    }
                    t7Var3.f14836i = true;
                }
                t7Var3.f14837j = arrayList;
                t7Var3.h = false;
                NotificationCenter.getInstance(t7Var3.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                if (!arrayList2.isEmpty()) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ArrayList arrayList4 = new ArrayList();
                                    int i13 = 0;
                                    while (true) {
                                        final ArrayList arrayList5 = arrayList2;
                                        if (i13 < arrayList5.size()) {
                                            b6.h hVar = new b6.h();
                                            hVar.f1729c = "inapp";
                                            hVar.f1728b = ((TL_stars.TL_starsTopupOption) arrayList5.get(i13)).store_product;
                                            arrayList4.add(hVar.a());
                                            i13++;
                                        } else {
                                            BillingController billingController = BillingController.getInstance();
                                            final t7 t7Var4 = t7Var3;
                                            billingController.queryProductDetails(arrayList4, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.h hVar2, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final t7 t7Var5 = t7Var4;
                                                            final ArrayList arrayList6 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar3 = hVar2;
                                                                            if (hVar3.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar3.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i14 = 0; i14 < list2.size(); i14++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i14);
                                                                                    int i15 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7 = arrayList6;
                                                                                        if (i15 < arrayList7.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7.get(i15)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList7.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f44181c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var6 = t7Var5;
                                                                            if (t7Var6.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var6.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) t7Var6.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var6.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar2;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8 = arrayList6;
                                                                                        if (i18 < arrayList8.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var7 = t7Var5;
                                                                            if (t7Var7.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var7.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var7.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var7.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar2;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList6;
                                                                                        if (i21 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var5;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final t7 t7Var6 = t7Var4;
                                                            final ArrayList arrayList7 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar3 = hVar2;
                                                                            if (hVar3.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar3.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i14 = 0; i14 < list2.size(); i14++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i14);
                                                                                    int i15 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList7;
                                                                                        if (i15 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i15)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f44181c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var62 = t7Var6;
                                                                            if (t7Var62.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var62.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) t7Var62.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var62.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar2;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8 = arrayList7;
                                                                                        if (i18 < arrayList8.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var7 = t7Var6;
                                                                            if (t7Var7.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var7.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var7.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var7.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar2;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList7;
                                                                                        if (i21 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var6;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final t7 t7Var7 = t7Var4;
                                                            final ArrayList arrayList8 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar3 = hVar2;
                                                                            if (hVar3.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar3.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i14 = 0; i14 < list2.size(); i14++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i14);
                                                                                    int i15 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList8;
                                                                                        if (i15 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i15)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f44181c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var62 = t7Var7;
                                                                            if (t7Var62.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var62.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) t7Var62.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var62.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar2;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList8;
                                                                                        if (i18 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var7;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar2;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList8;
                                                                                        if (i21 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var7;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                                    int i14 = 0;
                                    while (true) {
                                        final ArrayList arrayList7 = arrayList2;
                                        if (i14 < arrayList7.size()) {
                                            b6.h hVar2 = new b6.h();
                                            hVar2.f1729c = "inapp";
                                            hVar2.f1728b = ((TL_stars.TL_starsGiftOption) arrayList7.get(i14)).store_product;
                                            arrayList6.add(hVar2.a());
                                            i14++;
                                        } else {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final t7 t7Var5 = t7Var3;
                                            billingController2.queryProductDetails(arrayList6, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.h hVar22, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final t7 t7Var52 = t7Var5;
                                                            final ArrayList arrayList62 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar3 = hVar22;
                                                                            if (hVar3.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar3.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i15 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList62;
                                                                                        if (i15 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i15)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f44181c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var62 = t7Var52;
                                                                            if (t7Var62.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var62.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) t7Var62.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var62.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList62;
                                                                                        if (i18 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var52;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList62;
                                                                                        if (i21 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var52;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final t7 t7Var6 = t7Var5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar3 = hVar22;
                                                                            if (hVar3.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar3.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i15 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i15 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i15)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f44181c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var62 = t7Var6;
                                                                            if (t7Var62.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var62.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) t7Var62.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var62.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList72;
                                                                                        if (i18 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var6;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList72;
                                                                                        if (i21 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var6;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final t7 t7Var7 = t7Var5;
                                                            final ArrayList arrayList8 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar3 = hVar22;
                                                                            if (hVar3.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar3.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i15 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList8;
                                                                                        if (i15 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i15)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f44181c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var62 = t7Var7;
                                                                            if (t7Var62.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var62.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) t7Var62.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var62.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList8;
                                                                                        if (i18 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var7;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList8;
                                                                                        if (i21 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var7;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                                    int i15 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList2;
                                        if (i15 < arrayList9.size()) {
                                            b6.h hVar3 = new b6.h();
                                            hVar3.f1729c = "inapp";
                                            hVar3.f1728b = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i15)).store_product;
                                            arrayList8.add(hVar3.a());
                                            i15++;
                                        } else {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final t7 t7Var6 = t7Var3;
                                            billingController3.queryProductDetails(arrayList8, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.h hVar22, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final t7 t7Var52 = t7Var6;
                                                            final ArrayList arrayList62 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList62;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f44181c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var62 = t7Var52;
                                                                            if (t7Var62.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var62.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) t7Var62.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var62.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList62;
                                                                                        if (i18 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var52;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList62;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var52;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final t7 t7Var62 = t7Var6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f44181c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var62;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList72;
                                                                                        if (i18 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var62;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var62;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final t7 t7Var7 = t7Var6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f44181c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var7;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var7;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var7;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                TLObject tLObject4 = this.f14695c;
                boolean z11 = tLObject4 instanceof Vector;
                final t7 t7Var4 = this.f14694b;
                if (z11) {
                    ArrayList<T> arrayList6 = ((Vector) tLObject4).objects;
                    int size2 = arrayList6.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList6.get(i13);
                        i13++;
                        if (obj2 instanceof TL_stars.TL_starsGiftOption) {
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                            arrayList4.add(tL_starsGiftOption);
                            if (tL_starsGiftOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList5.add(tL_starsGiftOption);
                                tL_starsGiftOption.loadingStorePrice = true;
                            }
                        }
                    }
                    t7Var4.f14839l = true;
                }
                t7Var4.f14840m = arrayList4;
                t7Var4.f14838k = false;
                NotificationCenter.getInstance(t7Var4.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                if (!arrayList5.isEmpty()) {
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ArrayList arrayList42 = new ArrayList();
                                    int i132 = 0;
                                    while (true) {
                                        final ArrayList arrayList52 = arrayList5;
                                        if (i132 < arrayList52.size()) {
                                            b6.h hVar = new b6.h();
                                            hVar.f1729c = "inapp";
                                            hVar.f1728b = ((TL_stars.TL_starsTopupOption) arrayList52.get(i132)).store_product;
                                            arrayList42.add(hVar.a());
                                            i132++;
                                        } else {
                                            BillingController billingController = BillingController.getInstance();
                                            final t7 t7Var42 = t7Var4;
                                            billingController.queryProductDetails(arrayList42, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.h hVar22, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final t7 t7Var52 = t7Var42;
                                                            final ArrayList arrayList62 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList62;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var52;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList62;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var52;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList62;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var52;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final t7 t7Var62 = t7Var42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var62;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var62;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var62;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final t7 t7Var7 = t7Var42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var7;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var7;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var7;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                                    int i14 = 0;
                                    while (true) {
                                        final ArrayList arrayList7 = arrayList5;
                                        if (i14 < arrayList7.size()) {
                                            b6.h hVar2 = new b6.h();
                                            hVar2.f1729c = "inapp";
                                            hVar2.f1728b = ((TL_stars.TL_starsGiftOption) arrayList7.get(i14)).store_product;
                                            arrayList62.add(hVar2.a());
                                            i14++;
                                        } else {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final t7 t7Var5 = t7Var4;
                                            billingController2.queryProductDetails(arrayList62, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.h hVar22, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final t7 t7Var52 = t7Var5;
                                                            final ArrayList arrayList622 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var52;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var52;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var52;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final t7 t7Var62 = t7Var5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var62;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var62;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var62;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final t7 t7Var7 = t7Var5;
                                                            final ArrayList arrayList82 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var7;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var7;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var7;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                                    int i15 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList5;
                                        if (i15 < arrayList9.size()) {
                                            b6.h hVar3 = new b6.h();
                                            hVar3.f1729c = "inapp";
                                            hVar3.f1728b = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i15)).store_product;
                                            arrayList8.add(hVar3.a());
                                            i15++;
                                        } else {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final t7 t7Var6 = t7Var4;
                                            billingController3.queryProductDetails(arrayList8, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.h hVar22, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final t7 t7Var52 = t7Var6;
                                                            final ArrayList arrayList622 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var52;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var52;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var52;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final t7 t7Var62 = t7Var6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var62;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var62;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var62;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final t7 t7Var7 = t7Var6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var7;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var7;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var7;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                TLObject tLObject5 = this.f14695c;
                boolean z12 = tLObject5 instanceof Vector;
                final t7 t7Var5 = this.f14694b;
                if (z12) {
                    ArrayList<T> arrayList9 = ((Vector) tLObject5).objects;
                    int size3 = arrayList9.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj3 = arrayList9.get(i14);
                        i14++;
                        if (obj3 instanceof TL_stars.TL_starsGiveawayOption) {
                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                            arrayList7.add(tL_starsGiveawayOption);
                            if (tL_starsGiveawayOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList8.add(tL_starsGiveawayOption);
                                tL_starsGiveawayOption.loadingStorePrice = true;
                            }
                        }
                    }
                    t7Var5.f14842o = true;
                }
                t7Var5.f14843p = arrayList7;
                t7Var5.f14841n = false;
                NotificationCenter.getInstance(t7Var5.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                if (!arrayList8.isEmpty()) {
                    Runnable runnable3 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ArrayList arrayList42 = new ArrayList();
                                    int i132 = 0;
                                    while (true) {
                                        final ArrayList arrayList52 = arrayList8;
                                        if (i132 < arrayList52.size()) {
                                            b6.h hVar = new b6.h();
                                            hVar.f1729c = "inapp";
                                            hVar.f1728b = ((TL_stars.TL_starsTopupOption) arrayList52.get(i132)).store_product;
                                            arrayList42.add(hVar.a());
                                            i132++;
                                        } else {
                                            BillingController billingController = BillingController.getInstance();
                                            final t7 t7Var42 = t7Var5;
                                            billingController.queryProductDetails(arrayList42, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.h hVar22, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final t7 t7Var52 = t7Var42;
                                                            final ArrayList arrayList622 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var52;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var52;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var52;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final t7 t7Var62 = t7Var42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var62;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var62;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var62;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final t7 t7Var7 = t7Var42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var7;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var7;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var7;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                                    int i142 = 0;
                                    while (true) {
                                        final ArrayList arrayList72 = arrayList8;
                                        if (i142 < arrayList72.size()) {
                                            b6.h hVar2 = new b6.h();
                                            hVar2.f1729c = "inapp";
                                            hVar2.f1728b = ((TL_stars.TL_starsGiftOption) arrayList72.get(i142)).store_product;
                                            arrayList62.add(hVar2.a());
                                            i142++;
                                        } else {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final t7 t7Var52 = t7Var5;
                                            billingController2.queryProductDetails(arrayList62, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.h hVar22, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final t7 t7Var522 = t7Var52;
                                                            final ArrayList arrayList622 = arrayList72;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1422 = 0; i1422 < list2.size(); i1422++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i1422);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var522;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var522;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var522;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final t7 t7Var62 = t7Var52;
                                                            final ArrayList arrayList722 = arrayList72;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1422 = 0; i1422 < list2.size(); i1422++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i1422);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList722;
                                                                                        if (i152 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var62;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList722;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var62;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList722;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var62;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final t7 t7Var7 = t7Var52;
                                                            final ArrayList arrayList82 = arrayList72;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1422 = 0; i1422 < list2.size(); i1422++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i1422);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList82;
                                                                                        if (i152 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var7;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var7;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var7;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                                    int i15 = 0;
                                    while (true) {
                                        final ArrayList arrayList92 = arrayList8;
                                        if (i15 < arrayList92.size()) {
                                            b6.h hVar3 = new b6.h();
                                            hVar3.f1729c = "inapp";
                                            hVar3.f1728b = ((TL_stars.TL_starsGiveawayOption) arrayList92.get(i15)).store_product;
                                            arrayList82.add(hVar3.a());
                                            i15++;
                                        } else {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final t7 t7Var6 = t7Var5;
                                            billingController3.queryProductDetails(arrayList82, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.h hVar22, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final t7 t7Var522 = t7Var6;
                                                            final ArrayList arrayList622 = arrayList92;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1422 = 0; i1422 < list2.size(); i1422++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i1422);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList622;
                                                                                        if (i152 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var522;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var522;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList622;
                                                                                        if (i21 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var522;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final t7 t7Var62 = t7Var6;
                                                            final ArrayList arrayList722 = arrayList92;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1422 = 0; i1422 < list2.size(); i1422++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i1422);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList722;
                                                                                        if (i152 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var62;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList722;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var62;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList722;
                                                                                        if (i21 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var62;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final t7 t7Var7 = t7Var6;
                                                            final ArrayList arrayList822 = arrayList92;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.j a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.j a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.j a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.h hVar32 = hVar22;
                                                                            if (hVar32.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar32.f44176a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1422 = 0; i1422 < list2.size(); i1422++) {
                                                                                    p2.m mVar = (p2.m) list2.get(i1422);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList822;
                                                                                        if (i152 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i152)).store_product.equals(mVar.f44192c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f44181c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var622 = t7Var7;
                                                                            if (t7Var622.f14840m != null) {
                                                                                for (int i16 = 0; i16 < t7Var622.f14840m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) t7Var622.f14840m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var622.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.h hVar4 = hVar22;
                                                                            if (hVar4.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar4.f44176a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.m mVar2 = (p2.m) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8222 = arrayList822;
                                                                                        if (i18 < arrayList8222.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8222.get(i18)).store_product.equals(mVar2.f44192c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList8222.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f44181c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var72 = t7Var7;
                                                                            if (t7Var72.f14843p != null) {
                                                                                for (int i19 = 0; i19 < t7Var72.f14843p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) t7Var72.f14843p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var72.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.h hVar5 = hVar22;
                                                                            if (hVar5.f44176a != 0) {
                                                                                t7.e("BILLING_" + BillingController.getResponseCodeString(hVar5.f44176a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.m mVar3 = (p2.m) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList822;
                                                                                        if (i21 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i21)).store_product.equals(mVar3.f44192c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f44181c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f44180b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            t7 t7Var8 = t7Var7;
                                                                            if (t7Var8.f14837j != null) {
                                                                                for (int i22 = 0; i22 < t7Var8.f14837j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) t7Var8.f14837j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(t7Var8.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                MessagesController.getInstance(this.f14694b.f14830a).processUpdates((TLRPC.Updates) this.f14695c, false);
                return;
        }
    }
}
