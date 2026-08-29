package jh;

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
public final class q6 implements Runnable {
    public final int f12663a;
    public final s7 f12664b;
    public final TLObject f12665c;

    public q6(s7 s7Var, TLObject tLObject, int i10) {
        this.f12663a = i10;
        this.f12664b = s7Var;
        this.f12665c = tLObject;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f12663a) {
            case 0:
                s7 s7Var = this.f12664b;
                int i10 = s7Var.f12787a;
                s7Var.A = false;
                TLObject tLObject = this.f12665c;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i10).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i10).putChats(starsStatus.chats, false);
                    s7Var.f12809z.addAll(starsStatus.subscriptions);
                    s7Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                    return;
                }
                return;
            case 1:
                s7 s7Var2 = this.f12664b;
                int i11 = s7Var2.f12787a;
                s7Var2.f12807x = false;
                TLObject tLObject2 = this.f12665c;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                    MessagesController.getInstance(i11).putUsers(starsStatus2.users, false);
                    MessagesController.getInstance(i11).putChats(starsStatus2.chats, false);
                    s7Var2.v.addAll(starsStatus2.subscriptions);
                    if ((starsStatus2.flags & 4) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s7Var2.f12808y = z10;
                    s7Var2.f12806w = starsStatus2.subscriptions_next_offset;
                    s7Var2.k0(starsStatus2.balance);
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                    return;
                }
                return;
            case 2:
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                TLObject tLObject3 = this.f12665c;
                boolean z11 = tLObject3 instanceof Vector;
                final s7 s7Var3 = this.f12664b;
                if (z11) {
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
                    s7Var3.f12793i = true;
                }
                s7Var3.f12794j = arrayList;
                s7Var3.h = false;
                NotificationCenter.getInstance(s7Var3.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                                            d9.c cVar = new d9.c();
                                            cVar.f5537c = "inapp";
                                            cVar.f5536b = ((TL_stars.TL_starsTopupOption) arrayList5.get(i13)).store_product;
                                            arrayList4.add(cVar.a());
                                            i13++;
                                        } else {
                                            BillingController billingController = BillingController.getInstance();
                                            final s7 s7Var4 = s7Var3;
                                            billingController.queryProductDetails(arrayList4, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final s7 s7Var5 = s7Var4;
                                                            final ArrayList arrayList6 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i14 = 0; i14 < list2.size(); i14++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i14);
                                                                                    int i15 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7 = arrayList6;
                                                                                        if (i15 < arrayList7.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7.get(i15)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList7.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f45462c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var6 = s7Var5;
                                                                            if (s7Var6.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var6.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s7Var6.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var6.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8 = arrayList6;
                                                                                        if (i18 < arrayList8.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var7 = s7Var5;
                                                                            if (s7Var7.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var7.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var7.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var7.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList6;
                                                                                        if (i21 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var5;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final s7 s7Var6 = s7Var4;
                                                            final ArrayList arrayList7 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i14 = 0; i14 < list2.size(); i14++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i14);
                                                                                    int i15 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList7;
                                                                                        if (i15 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i15)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f45462c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var62 = s7Var6;
                                                                            if (s7Var62.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var62.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s7Var62.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var62.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8 = arrayList7;
                                                                                        if (i18 < arrayList8.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var7 = s7Var6;
                                                                            if (s7Var7.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var7.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var7.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var7.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList7;
                                                                                        if (i21 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var6;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final s7 s7Var7 = s7Var4;
                                                            final ArrayList arrayList8 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i14 = 0; i14 < list2.size(); i14++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i14);
                                                                                    int i15 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList8;
                                                                                        if (i15 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i15)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f45462c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var62 = s7Var7;
                                                                            if (s7Var62.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var62.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s7Var62.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var62.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList8;
                                                                                        if (i18 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var7;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList8;
                                                                                        if (i21 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var7;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                                            d9.c cVar2 = new d9.c();
                                            cVar2.f5537c = "inapp";
                                            cVar2.f5536b = ((TL_stars.TL_starsGiftOption) arrayList7.get(i14)).store_product;
                                            arrayList6.add(cVar2.a());
                                            i14++;
                                        } else {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final s7 s7Var5 = s7Var3;
                                            billingController2.queryProductDetails(arrayList6, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final s7 s7Var52 = s7Var5;
                                                            final ArrayList arrayList62 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i15 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList62;
                                                                                        if (i15 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i15)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f45462c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var62 = s7Var52;
                                                                            if (s7Var62.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var62.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s7Var62.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var62.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList62;
                                                                                        if (i18 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var52;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList62;
                                                                                        if (i21 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var52;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final s7 s7Var6 = s7Var5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i15 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i15 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i15)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f45462c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var62 = s7Var6;
                                                                            if (s7Var62.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var62.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s7Var62.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var62.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList72;
                                                                                        if (i18 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var6;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList72;
                                                                                        if (i21 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var6;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final s7 s7Var7 = s7Var5;
                                                            final ArrayList arrayList8 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i15 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList8;
                                                                                        if (i15 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i15)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f45462c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var62 = s7Var7;
                                                                            if (s7Var62.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var62.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s7Var62.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var62.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList8;
                                                                                        if (i18 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var7;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList8;
                                                                                        if (i21 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var7;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                                            d9.c cVar3 = new d9.c();
                                            cVar3.f5537c = "inapp";
                                            cVar3.f5536b = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i15)).store_product;
                                            arrayList8.add(cVar3.a());
                                            i15++;
                                        } else {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final s7 s7Var6 = s7Var3;
                                            billingController3.queryProductDetails(arrayList8, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final s7 s7Var52 = s7Var6;
                                                            final ArrayList arrayList62 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList62;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f45462c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var62 = s7Var52;
                                                                            if (s7Var62.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var62.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s7Var62.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var62.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList62;
                                                                                        if (i18 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var52;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList62;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var52;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final s7 s7Var62 = s7Var6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f45462c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var62;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList72;
                                                                                        if (i18 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var62;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var62;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final s7 s7Var7 = s7Var6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f45462c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var7;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var7;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var7;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                TLObject tLObject4 = this.f12665c;
                boolean z12 = tLObject4 instanceof Vector;
                final s7 s7Var4 = this.f12664b;
                if (z12) {
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
                    s7Var4.f12796l = true;
                }
                s7Var4.f12797m = arrayList4;
                s7Var4.f12795k = false;
                NotificationCenter.getInstance(s7Var4.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
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
                                            d9.c cVar = new d9.c();
                                            cVar.f5537c = "inapp";
                                            cVar.f5536b = ((TL_stars.TL_starsTopupOption) arrayList52.get(i132)).store_product;
                                            arrayList42.add(cVar.a());
                                            i132++;
                                        } else {
                                            BillingController billingController = BillingController.getInstance();
                                            final s7 s7Var42 = s7Var4;
                                            billingController.queryProductDetails(arrayList42, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final s7 s7Var52 = s7Var42;
                                                            final ArrayList arrayList62 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList62;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var52;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList62;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var52;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList62;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var52;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final s7 s7Var62 = s7Var42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var62;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var62;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var62;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final s7 s7Var7 = s7Var42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var7;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var7;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var7;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                                            d9.c cVar2 = new d9.c();
                                            cVar2.f5537c = "inapp";
                                            cVar2.f5536b = ((TL_stars.TL_starsGiftOption) arrayList7.get(i14)).store_product;
                                            arrayList62.add(cVar2.a());
                                            i14++;
                                        } else {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final s7 s7Var5 = s7Var4;
                                            billingController2.queryProductDetails(arrayList62, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final s7 s7Var52 = s7Var5;
                                                            final ArrayList arrayList622 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var52;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var52;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var52;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final s7 s7Var62 = s7Var5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var62;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var62;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var62;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final s7 s7Var7 = s7Var5;
                                                            final ArrayList arrayList82 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var7;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var7;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var7;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                                            d9.c cVar3 = new d9.c();
                                            cVar3.f5537c = "inapp";
                                            cVar3.f5536b = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i15)).store_product;
                                            arrayList8.add(cVar3.a());
                                            i15++;
                                        } else {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final s7 s7Var6 = s7Var4;
                                            billingController3.queryProductDetails(arrayList8, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final s7 s7Var52 = s7Var6;
                                                            final ArrayList arrayList622 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var52;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var52;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var52;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final s7 s7Var62 = s7Var6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var62;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var62;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var62;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final s7 s7Var7 = s7Var6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var7;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var7;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var7;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                TLObject tLObject5 = this.f12665c;
                boolean z13 = tLObject5 instanceof Vector;
                final s7 s7Var5 = this.f12664b;
                if (z13) {
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
                    s7Var5.f12799o = true;
                }
                s7Var5.f12800p = arrayList7;
                s7Var5.f12798n = false;
                NotificationCenter.getInstance(s7Var5.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
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
                                            d9.c cVar = new d9.c();
                                            cVar.f5537c = "inapp";
                                            cVar.f5536b = ((TL_stars.TL_starsTopupOption) arrayList52.get(i132)).store_product;
                                            arrayList42.add(cVar.a());
                                            i132++;
                                        } else {
                                            BillingController billingController = BillingController.getInstance();
                                            final s7 s7Var42 = s7Var5;
                                            billingController.queryProductDetails(arrayList42, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final s7 s7Var52 = s7Var42;
                                                            final ArrayList arrayList622 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var52;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var52;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var52;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final s7 s7Var62 = s7Var42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var62;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var62;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var62;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final s7 s7Var7 = s7Var42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i142 = 0; i142 < list2.size(); i142++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i142);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var7;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var7;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var7;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                                            d9.c cVar2 = new d9.c();
                                            cVar2.f5537c = "inapp";
                                            cVar2.f5536b = ((TL_stars.TL_starsGiftOption) arrayList72.get(i142)).store_product;
                                            arrayList62.add(cVar2.a());
                                            i142++;
                                        } else {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final s7 s7Var52 = s7Var5;
                                            billingController2.queryProductDetails(arrayList62, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final s7 s7Var522 = s7Var52;
                                                            final ArrayList arrayList622 = arrayList72;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1422 = 0; i1422 < list2.size(); i1422++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i1422);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i152 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var522;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var522;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var522;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final s7 s7Var62 = s7Var52;
                                                            final ArrayList arrayList722 = arrayList72;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1422 = 0; i1422 < list2.size(); i1422++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i1422);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList722;
                                                                                        if (i152 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var62;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList722;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var62;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList722;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var62;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final s7 s7Var7 = s7Var52;
                                                            final ArrayList arrayList82 = arrayList72;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1422 = 0; i1422 < list2.size(); i1422++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i1422);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList82;
                                                                                        if (i152 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var7;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var7;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i21 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var7;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                                            d9.c cVar3 = new d9.c();
                                            cVar3.f5537c = "inapp";
                                            cVar3.f5536b = ((TL_stars.TL_starsGiveawayOption) arrayList92.get(i15)).store_product;
                                            arrayList82.add(cVar3.a());
                                            i15++;
                                        } else {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final s7 s7Var6 = s7Var5;
                                            billingController3.queryProductDetails(arrayList82, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final p2.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final s7 s7Var522 = s7Var6;
                                                            final ArrayList arrayList622 = arrayList92;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1422 = 0; i1422 < list2.size(); i1422++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i1422);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList622;
                                                                                        if (i152 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var522;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var522;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList622;
                                                                                        if (i21 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var522;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final s7 s7Var62 = s7Var6;
                                                            final ArrayList arrayList722 = arrayList92;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1422 = 0; i1422 < list2.size(); i1422++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i1422);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList722;
                                                                                        if (i152 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var62;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList722;
                                                                                        if (i18 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var62;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList722;
                                                                                        if (i21 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var62;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final s7 s7Var7 = s7Var6;
                                                            final ArrayList arrayList822 = arrayList92;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    p2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    p2.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    p2.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            p2.g gVar2 = gVar;
                                                                            if (gVar2.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f45457a));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i1422 = 0; i1422 < list2.size(); i1422++) {
                                                                                    p2.l lVar = (p2.l) list2.get(i1422);
                                                                                    int i152 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList822;
                                                                                        if (i152 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i152)).store_product.equals(lVar.f45473c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i152);
                                                                                            } else {
                                                                                                i152++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f45462c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var622 = s7Var7;
                                                                            if (s7Var622.f12797m != null) {
                                                                                for (int i16 = 0; i16 < s7Var622.f12797m.size(); i16++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s7Var622.f12797m.get(i16);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var622.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            p2.g gVar3 = gVar;
                                                                            if (gVar3.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f45457a));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                    p2.l lVar2 = (p2.l) list3.get(i17);
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8222 = arrayList822;
                                                                                        if (i18 < arrayList8222.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8222.get(i18)).store_product.equals(lVar2.f45473c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList8222.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f45462c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var72 = s7Var7;
                                                                            if (s7Var72.f12800p != null) {
                                                                                for (int i19 = 0; i19 < s7Var72.f12800p.size(); i19++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s7Var72.f12800p.get(i19);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var72.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            p2.g gVar4 = gVar;
                                                                            if (gVar4.f45457a != 0) {
                                                                                s7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f45457a));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                                                                    p2.l lVar3 = (p2.l) list4.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList822;
                                                                                        if (i21 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i21)).store_product.equals(lVar3.f45473c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f45462c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.f45461b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            s7 s7Var8 = s7Var7;
                                                                            if (s7Var8.f12794j != null) {
                                                                                for (int i22 = 0; i22 < s7Var8.f12794j.size(); i22++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s7Var8.f12794j.get(i22);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            NotificationCenter.getInstance(s7Var8.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
                MessagesController.getInstance(this.f12664b.f12787a).processUpdates((TLRPC.Updates) this.f12665c, false);
                return;
        }
    }
}
