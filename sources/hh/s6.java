package hh;

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

public final class s6 implements Runnable {

    public final int f10022a;

    public final u7 f10023b;

    public final TLObject f10024c;

    public s6(u7 u7Var, TLObject tLObject, int i10) {
        this.f10022a = i10;
        this.f10023b = u7Var;
        this.f10024c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f10022a) {
            case 0:
                u7 u7Var = this.f10023b;
                int i10 = u7Var.f10151a;
                u7Var.A = false;
                TLObject tLObject = this.f10024c;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i10).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i10).putChats(starsStatus.chats, false);
                    u7Var.f10173z.addAll(starsStatus.subscriptions);
                    u7Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                break;
            case 1:
                u7 u7Var2 = this.f10023b;
                int i11 = u7Var2.f10151a;
                u7Var2.f10171x = false;
                TLObject tLObject2 = this.f10024c;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                    MessagesController.getInstance(i11).putUsers(starsStatus2.users, false);
                    MessagesController.getInstance(i11).putChats(starsStatus2.chats, false);
                    u7Var2.v.addAll(starsStatus2.subscriptions);
                    u7Var2.f10172y = (starsStatus2.flags & 4) == 0;
                    u7Var2.f10170w = starsStatus2.subscriptions_next_offset;
                    u7Var2.k0(starsStatus2.balance);
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                break;
            case 2:
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                TLObject tLObject3 = this.f10024c;
                boolean z10 = tLObject3 instanceof Vector;
                final u7 u7Var3 = this.f10023b;
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
                    u7Var3.f10157i = true;
                }
                u7Var3.f10158j = arrayList;
                u7Var3.h = false;
                NotificationCenter.getInstance(u7Var3.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                if (!arrayList2.isEmpty()) {
                    final int i13 = 0;
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    ArrayList arrayList4 = new ArrayList();
                                    int i14 = 0;
                                    while (true) {
                                        final ArrayList arrayList5 = arrayList2;
                                        if (i14 >= arrayList5.size()) {
                                            BillingController billingController = BillingController.getInstance();
                                            final int i15 = 1;
                                            final u7 u7Var4 = u7Var3;
                                            billingController.queryProductDetails(arrayList4, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i15) {
                                                        case 0:
                                                            final int i16 = 1;
                                                            final u7 u7Var5 = u7Var4;
                                                            final ArrayList arrayList6 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i16) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i17 = 0; i17 < list2.size(); i17++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i17);
                                                                                        int i18 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7 = arrayList6;
                                                                                            if (i18 >= arrayList7.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7.get(i18)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList7.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var6 = u7Var5;
                                                                                if (u7Var6.f10161m != null) {
                                                                                    for (int i19 = 0; i19 < u7Var6.f10161m.size(); i19++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) u7Var6.f10161m.get(i19);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var6.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList8 = arrayList6;
                                                                                            if (i21 >= arrayList8.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var7 = u7Var5;
                                                                                if (u7Var7.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var7.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var7.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var7.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList6;
                                                                                            if (i24 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var8 = u7Var5;
                                                                                if (u7Var8.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var8.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var8.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var8.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i17 = 2;
                                                            final u7 u7Var6 = u7Var4;
                                                            final ArrayList arrayList7 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i17) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i18 = 0; i18 < list2.size(); i18++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i18);
                                                                                        int i19 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList8 = arrayList7;
                                                                                            if (i19 >= arrayList8.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList8.get(i19)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList8.get(i19);
                                                                                            } else {
                                                                                                i19++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var7 = u7Var6;
                                                                                if (u7Var7.f10161m != null) {
                                                                                    for (int i110 = 0; i110 < u7Var7.f10161m.size(); i110++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) u7Var7.f10161m.get(i110);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var7.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList7;
                                                                                            if (i21 >= arrayList9.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList9.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList9.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var8 = u7Var6;
                                                                                if (u7Var8.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var8.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var8.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var8.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList10 = arrayList7;
                                                                                            if (i24 >= arrayList10.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList10.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList10.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var9 = u7Var6;
                                                                                if (u7Var9.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var9.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var9.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var9.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i18 = 0;
                                                            final u7 u7Var7 = u7Var4;
                                                            final ArrayList arrayList8 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i18) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i19 = 0; i19 < list2.size(); i19++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i19);
                                                                                        int i110 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList8;
                                                                                            if (i110 >= arrayList9.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList9.get(i110)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList9.get(i110);
                                                                                            } else {
                                                                                                i110++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var8 = u7Var7;
                                                                                if (u7Var8.f10161m != null) {
                                                                                    for (int i111 = 0; i111 < u7Var8.f10161m.size(); i111++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) u7Var8.f10161m.get(i111);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var8.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList10 = arrayList8;
                                                                                            if (i21 >= arrayList10.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList10.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList10.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var9 = u7Var7;
                                                                                if (u7Var9.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var9.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var9.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var9.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList11 = arrayList8;
                                                                                            if (i24 >= arrayList11.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList11.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList11.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var10 = u7Var7;
                                                                                if (u7Var10.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var10.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var10.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var10.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            c9.b bVar = new c9.b();
                                            bVar.f2567c = "inapp";
                                            bVar.f2566b = ((TL_stars.TL_starsTopupOption) arrayList5.get(i14)).store_product;
                                            arrayList4.add(bVar.a());
                                            i14++;
                                        }
                                        break;
                                    }
                                    break;
                                case 1:
                                    ArrayList arrayList6 = new ArrayList();
                                    int i16 = 0;
                                    while (true) {
                                        final ArrayList arrayList7 = arrayList2;
                                        if (i16 >= arrayList7.size()) {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final int i17 = 2;
                                            final u7 u7Var5 = u7Var3;
                                            billingController2.queryProductDetails(arrayList6, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i17) {
                                                        case 0:
                                                            final int i18 = 1;
                                                            final u7 u7Var6 = u7Var5;
                                                            final ArrayList arrayList8 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i18) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i19 = 0; i19 < list2.size(); i19++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i19);
                                                                                        int i110 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList8;
                                                                                            if (i110 >= arrayList9.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList9.get(i110)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList9.get(i110);
                                                                                            } else {
                                                                                                i110++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var8 = u7Var6;
                                                                                if (u7Var8.f10161m != null) {
                                                                                    for (int i111 = 0; i111 < u7Var8.f10161m.size(); i111++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) u7Var8.f10161m.get(i111);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var8.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList10 = arrayList8;
                                                                                            if (i21 >= arrayList10.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList10.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList10.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var9 = u7Var6;
                                                                                if (u7Var9.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var9.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var9.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var9.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList11 = arrayList8;
                                                                                            if (i24 >= arrayList11.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList11.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList11.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var10 = u7Var6;
                                                                                if (u7Var10.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var10.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var10.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var10.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i19 = 2;
                                                            final u7 u7Var7 = u7Var5;
                                                            final ArrayList arrayList9 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i19) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i110 = 0; i110 < list2.size(); i110++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i110);
                                                                                        int i111 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList10 = arrayList9;
                                                                                            if (i111 >= arrayList10.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList10.get(i111)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList10.get(i111);
                                                                                            } else {
                                                                                                i111++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var8 = u7Var7;
                                                                                if (u7Var8.f10161m != null) {
                                                                                    for (int i112 = 0; i112 < u7Var8.f10161m.size(); i112++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) u7Var8.f10161m.get(i112);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var8.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList11 = arrayList9;
                                                                                            if (i21 >= arrayList11.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList11.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList11.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var9 = u7Var7;
                                                                                if (u7Var9.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var9.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var9.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var9.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList12 = arrayList9;
                                                                                            if (i24 >= arrayList12.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList12.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList12.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var10 = u7Var7;
                                                                                if (u7Var10.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var10.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var10.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var10.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i110 = 0;
                                                            final u7 u7Var8 = u7Var5;
                                                            final ArrayList arrayList10 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i110) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i111 = 0; i111 < list2.size(); i111++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i111);
                                                                                        int i112 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList11 = arrayList10;
                                                                                            if (i112 >= arrayList11.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList11.get(i112)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList11.get(i112);
                                                                                            } else {
                                                                                                i112++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var9 = u7Var8;
                                                                                if (u7Var9.f10161m != null) {
                                                                                    for (int i113 = 0; i113 < u7Var9.f10161m.size(); i113++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) u7Var9.f10161m.get(i113);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var9.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList12 = arrayList10;
                                                                                            if (i21 >= arrayList12.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList12.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList12.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var10 = u7Var8;
                                                                                if (u7Var10.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var10.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var10.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var10.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList10;
                                                                                            if (i24 >= arrayList13.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList13.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList13.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var8;
                                                                                if (u7Var11.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var11.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var11.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            c9.b bVar2 = new c9.b();
                                            bVar2.f2567c = "inapp";
                                            bVar2.f2566b = ((TL_stars.TL_starsGiftOption) arrayList7.get(i16)).store_product;
                                            arrayList6.add(bVar2.a());
                                            i16++;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    ArrayList arrayList8 = new ArrayList();
                                    int i18 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList2;
                                        if (i18 >= arrayList9.size()) {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final int i19 = 0;
                                            final u7 u7Var6 = u7Var3;
                                            billingController3.queryProductDetails(arrayList8, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i19) {
                                                        case 0:
                                                            final int i110 = 1;
                                                            final u7 u7Var7 = u7Var6;
                                                            final ArrayList arrayList10 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i110) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i111 = 0; i111 < list2.size(); i111++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i111);
                                                                                        int i112 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList11 = arrayList10;
                                                                                            if (i112 >= arrayList11.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList11.get(i112)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList11.get(i112);
                                                                                            } else {
                                                                                                i112++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var9 = u7Var7;
                                                                                if (u7Var9.f10161m != null) {
                                                                                    for (int i113 = 0; i113 < u7Var9.f10161m.size(); i113++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) u7Var9.f10161m.get(i113);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var9.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList12 = arrayList10;
                                                                                            if (i21 >= arrayList12.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList12.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList12.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var10 = u7Var7;
                                                                                if (u7Var10.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var10.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var10.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var10.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList10;
                                                                                            if (i24 >= arrayList13.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList13.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList13.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var7;
                                                                                if (u7Var11.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var11.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var11.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i111 = 2;
                                                            final u7 u7Var8 = u7Var6;
                                                            final ArrayList arrayList11 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i111) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i112 = 0; i112 < list2.size(); i112++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i112);
                                                                                        int i113 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList12 = arrayList11;
                                                                                            if (i113 >= arrayList12.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList12.get(i113)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList12.get(i113);
                                                                                            } else {
                                                                                                i113++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var9 = u7Var8;
                                                                                if (u7Var9.f10161m != null) {
                                                                                    for (int i114 = 0; i114 < u7Var9.f10161m.size(); i114++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) u7Var9.f10161m.get(i114);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var9.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList11;
                                                                                            if (i21 >= arrayList13.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList13.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList13.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var10 = u7Var8;
                                                                                if (u7Var10.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var10.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var10.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var10.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList11;
                                                                                            if (i24 >= arrayList14.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList14.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList14.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var8;
                                                                                if (u7Var11.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var11.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var11.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i112 = 0;
                                                            final u7 u7Var9 = u7Var6;
                                                            final ArrayList arrayList12 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i112) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i113 = 0; i113 < list2.size(); i113++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i113);
                                                                                        int i114 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList12;
                                                                                            if (i114 >= arrayList13.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList13.get(i114)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList13.get(i114);
                                                                                            } else {
                                                                                                i114++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var10 = u7Var9;
                                                                                if (u7Var10.f10161m != null) {
                                                                                    for (int i115 = 0; i115 < u7Var10.f10161m.size(); i115++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) u7Var10.f10161m.get(i115);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var10.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList12;
                                                                                            if (i21 >= arrayList14.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList14.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList14.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var9;
                                                                                if (u7Var11.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var11.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var11.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList12;
                                                                                            if (i24 >= arrayList15.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList15.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList15.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var9;
                                                                                if (u7Var12.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var12.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var12.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            c9.b bVar3 = new c9.b();
                                            bVar3.f2567c = "inapp";
                                            bVar3.f2566b = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i18)).store_product;
                                            arrayList8.add(bVar3.a());
                                            i18++;
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    if (!BillingController.getInstance().isReady()) {
                        BillingController.getInstance().whenSetuped(runnable);
                    } else {
                        runnable.run();
                    }
                }
                break;
            case 3:
                ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                TLObject tLObject4 = this.f10024c;
                boolean z11 = tLObject4 instanceof Vector;
                final u7 u7Var4 = this.f10023b;
                if (z11) {
                    ArrayList<T> arrayList6 = ((Vector) tLObject4).objects;
                    int size2 = arrayList6.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = arrayList6.get(i14);
                        i14++;
                        if (obj2 instanceof TL_stars.TL_starsGiftOption) {
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                            arrayList4.add(tL_starsGiftOption);
                            if (tL_starsGiftOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList5.add(tL_starsGiftOption);
                                tL_starsGiftOption.loadingStorePrice = true;
                            }
                        }
                    }
                    u7Var4.f10160l = true;
                }
                u7Var4.f10161m = arrayList4;
                u7Var4.f10159k = false;
                NotificationCenter.getInstance(u7Var4.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                if (!arrayList5.isEmpty()) {
                    final int i15 = 1;
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    ArrayList arrayList7 = new ArrayList();
                                    int i16 = 0;
                                    while (true) {
                                        final ArrayList arrayList8 = arrayList5;
                                        if (i16 >= arrayList8.size()) {
                                            BillingController billingController = BillingController.getInstance();
                                            final int i17 = 1;
                                            final u7 u7Var5 = u7Var4;
                                            billingController.queryProductDetails(arrayList7, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i17) {
                                                        case 0:
                                                            final int i110 = 1;
                                                            final u7 u7Var7 = u7Var5;
                                                            final ArrayList arrayList10 = arrayList8;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i110) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i113 = 0; i113 < list2.size(); i113++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i113);
                                                                                        int i114 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList10;
                                                                                            if (i114 >= arrayList13.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList13.get(i114)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList13.get(i114);
                                                                                            } else {
                                                                                                i114++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var10 = u7Var7;
                                                                                if (u7Var10.f10161m != null) {
                                                                                    for (int i115 = 0; i115 < u7Var10.f10161m.size(); i115++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var10.f10161m.get(i115);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var10.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList10;
                                                                                            if (i21 >= arrayList14.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList14.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList14.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var7;
                                                                                if (u7Var11.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var11.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var11.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList10;
                                                                                            if (i24 >= arrayList15.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList15.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList15.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var7;
                                                                                if (u7Var12.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var12.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var12.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i111 = 2;
                                                            final u7 u7Var8 = u7Var5;
                                                            final ArrayList arrayList11 = arrayList8;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i111) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i113 = 0; i113 < list2.size(); i113++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i113);
                                                                                        int i114 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList11;
                                                                                            if (i114 >= arrayList13.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList13.get(i114)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList13.get(i114);
                                                                                            } else {
                                                                                                i114++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var10 = u7Var8;
                                                                                if (u7Var10.f10161m != null) {
                                                                                    for (int i115 = 0; i115 < u7Var10.f10161m.size(); i115++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var10.f10161m.get(i115);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var10.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList11;
                                                                                            if (i21 >= arrayList14.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList14.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList14.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var8;
                                                                                if (u7Var11.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var11.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var11.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList11;
                                                                                            if (i24 >= arrayList15.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList15.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList15.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var8;
                                                                                if (u7Var12.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var12.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var12.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i112 = 0;
                                                            final u7 u7Var9 = u7Var5;
                                                            final ArrayList arrayList12 = arrayList8;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i112) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i113 = 0; i113 < list2.size(); i113++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i113);
                                                                                        int i114 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList12;
                                                                                            if (i114 >= arrayList13.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList13.get(i114)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList13.get(i114);
                                                                                            } else {
                                                                                                i114++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var10 = u7Var9;
                                                                                if (u7Var10.f10161m != null) {
                                                                                    for (int i115 = 0; i115 < u7Var10.f10161m.size(); i115++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var10.f10161m.get(i115);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var10.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList12;
                                                                                            if (i21 >= arrayList14.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList14.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList14.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var9;
                                                                                if (u7Var11.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var11.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var11.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList12;
                                                                                            if (i24 >= arrayList15.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList15.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList15.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var9;
                                                                                if (u7Var12.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var12.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var12.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            c9.b bVar = new c9.b();
                                            bVar.f2567c = "inapp";
                                            bVar.f2566b = ((TL_stars.TL_starsTopupOption) arrayList8.get(i16)).store_product;
                                            arrayList7.add(bVar.a());
                                            i16++;
                                        }
                                        break;
                                    }
                                    break;
                                case 1:
                                    ArrayList arrayList9 = new ArrayList();
                                    int i18 = 0;
                                    while (true) {
                                        final ArrayList arrayList10 = arrayList5;
                                        if (i18 >= arrayList10.size()) {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final int i19 = 2;
                                            final u7 u7Var6 = u7Var4;
                                            billingController2.queryProductDetails(arrayList9, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i19) {
                                                        case 0:
                                                            final int i110 = 1;
                                                            final u7 u7Var7 = u7Var6;
                                                            final ArrayList arrayList11 = arrayList10;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i110) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i113 = 0; i113 < list2.size(); i113++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i113);
                                                                                        int i114 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList11;
                                                                                            if (i114 >= arrayList13.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList13.get(i114)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList13.get(i114);
                                                                                            } else {
                                                                                                i114++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var10 = u7Var7;
                                                                                if (u7Var10.f10161m != null) {
                                                                                    for (int i115 = 0; i115 < u7Var10.f10161m.size(); i115++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var10.f10161m.get(i115);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var10.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList11;
                                                                                            if (i21 >= arrayList14.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList14.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList14.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var7;
                                                                                if (u7Var11.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var11.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var11.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList11;
                                                                                            if (i24 >= arrayList15.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList15.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList15.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var7;
                                                                                if (u7Var12.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var12.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var12.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i111 = 2;
                                                            final u7 u7Var8 = u7Var6;
                                                            final ArrayList arrayList12 = arrayList10;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i111) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i113 = 0; i113 < list2.size(); i113++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i113);
                                                                                        int i114 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList12;
                                                                                            if (i114 >= arrayList13.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList13.get(i114)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList13.get(i114);
                                                                                            } else {
                                                                                                i114++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var10 = u7Var8;
                                                                                if (u7Var10.f10161m != null) {
                                                                                    for (int i115 = 0; i115 < u7Var10.f10161m.size(); i115++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var10.f10161m.get(i115);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var10.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList12;
                                                                                            if (i21 >= arrayList14.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList14.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList14.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var8;
                                                                                if (u7Var11.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var11.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var11.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList12;
                                                                                            if (i24 >= arrayList15.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList15.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList15.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var8;
                                                                                if (u7Var12.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var12.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var12.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i112 = 0;
                                                            final u7 u7Var9 = u7Var6;
                                                            final ArrayList arrayList13 = arrayList10;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i112) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i113 = 0; i113 < list2.size(); i113++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i113);
                                                                                        int i114 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList13;
                                                                                            if (i114 >= arrayList14.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList14.get(i114)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList14.get(i114);
                                                                                            } else {
                                                                                                i114++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var10 = u7Var9;
                                                                                if (u7Var10.f10161m != null) {
                                                                                    for (int i115 = 0; i115 < u7Var10.f10161m.size(); i115++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var10.f10161m.get(i115);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var10.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList13;
                                                                                            if (i21 >= arrayList15.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList15.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList15.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var9;
                                                                                if (u7Var11.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var11.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var11.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList13;
                                                                                            if (i24 >= arrayList16.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList16.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList16.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var9;
                                                                                if (u7Var12.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var12.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var12.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            c9.b bVar2 = new c9.b();
                                            bVar2.f2567c = "inapp";
                                            bVar2.f2566b = ((TL_stars.TL_starsGiftOption) arrayList10.get(i18)).store_product;
                                            arrayList9.add(bVar2.a());
                                            i18++;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    ArrayList arrayList11 = new ArrayList();
                                    int i110 = 0;
                                    while (true) {
                                        final ArrayList arrayList12 = arrayList5;
                                        if (i110 >= arrayList12.size()) {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final int i111 = 0;
                                            final u7 u7Var7 = u7Var4;
                                            billingController3.queryProductDetails(arrayList11, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i111) {
                                                        case 0:
                                                            final int i112 = 1;
                                                            final u7 u7Var8 = u7Var7;
                                                            final ArrayList arrayList13 = arrayList12;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i112) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i113 = 0; i113 < list2.size(); i113++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i113);
                                                                                        int i114 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList13;
                                                                                            if (i114 >= arrayList14.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList14.get(i114)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList14.get(i114);
                                                                                            } else {
                                                                                                i114++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var10 = u7Var8;
                                                                                if (u7Var10.f10161m != null) {
                                                                                    for (int i115 = 0; i115 < u7Var10.f10161m.size(); i115++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var10.f10161m.get(i115);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var10.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList13;
                                                                                            if (i21 >= arrayList15.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList15.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList15.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var8;
                                                                                if (u7Var11.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var11.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var11.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList13;
                                                                                            if (i24 >= arrayList16.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList16.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList16.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var8;
                                                                                if (u7Var12.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var12.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var12.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i113 = 2;
                                                            final u7 u7Var9 = u7Var7;
                                                            final ArrayList arrayList14 = arrayList12;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i113) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i114 = 0; i114 < list2.size(); i114++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i114);
                                                                                        int i115 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList14;
                                                                                            if (i115 >= arrayList15.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList15.get(i115)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList15.get(i115);
                                                                                            } else {
                                                                                                i115++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var10 = u7Var9;
                                                                                if (u7Var10.f10161m != null) {
                                                                                    for (int i116 = 0; i116 < u7Var10.f10161m.size(); i116++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var10.f10161m.get(i116);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var10.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList14;
                                                                                            if (i21 >= arrayList16.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList16.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList16.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var9;
                                                                                if (u7Var11.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var11.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var11.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList14;
                                                                                            if (i24 >= arrayList17.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList17.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList17.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var9;
                                                                                if (u7Var12.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var12.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var12.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i114 = 0;
                                                            final u7 u7Var10 = u7Var7;
                                                            final ArrayList arrayList15 = arrayList12;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i114) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i115 = 0; i115 < list2.size(); i115++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i115);
                                                                                        int i116 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList15;
                                                                                            if (i116 >= arrayList16.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList16.get(i116)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList16.get(i116);
                                                                                            } else {
                                                                                                i116++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var10;
                                                                                if (u7Var11.f10161m != null) {
                                                                                    for (int i117 = 0; i117 < u7Var11.f10161m.size(); i117++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var11.f10161m.get(i117);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList15;
                                                                                            if (i21 >= arrayList17.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList17.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList17.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var10;
                                                                                if (u7Var12.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var12.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) u7Var12.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList15;
                                                                                            if (i24 >= arrayList18.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList18.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList18.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var13 = u7Var10;
                                                                                if (u7Var13.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var13.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var13.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var13.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            c9.b bVar3 = new c9.b();
                                            bVar3.f2567c = "inapp";
                                            bVar3.f2566b = ((TL_stars.TL_starsGiveawayOption) arrayList12.get(i110)).store_product;
                                            arrayList11.add(bVar3.a());
                                            i110++;
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    if (!BillingController.getInstance().isReady()) {
                        BillingController.getInstance().whenSetuped(runnable2);
                    } else {
                        runnable2.run();
                    }
                }
                break;
            case 4:
                ArrayList arrayList7 = new ArrayList();
                final ArrayList arrayList8 = new ArrayList();
                TLObject tLObject5 = this.f10024c;
                boolean z12 = tLObject5 instanceof Vector;
                final u7 u7Var5 = this.f10023b;
                if (z12) {
                    ArrayList<T> arrayList9 = ((Vector) tLObject5).objects;
                    int size3 = arrayList9.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        Object obj3 = arrayList9.get(i16);
                        i16++;
                        if (obj3 instanceof TL_stars.TL_starsGiveawayOption) {
                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                            arrayList7.add(tL_starsGiveawayOption);
                            if (tL_starsGiveawayOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList8.add(tL_starsGiveawayOption);
                                tL_starsGiveawayOption.loadingStorePrice = true;
                            }
                        }
                    }
                    u7Var5.f10163o = true;
                }
                u7Var5.f10164p = arrayList7;
                u7Var5.f10162n = false;
                NotificationCenter.getInstance(u7Var5.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                if (!arrayList8.isEmpty()) {
                    final int i17 = 2;
                    Runnable runnable3 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (i17) {
                                case 0:
                                    ArrayList arrayList10 = new ArrayList();
                                    int i18 = 0;
                                    while (true) {
                                        final ArrayList arrayList11 = arrayList8;
                                        if (i18 >= arrayList11.size()) {
                                            BillingController billingController = BillingController.getInstance();
                                            final int i19 = 1;
                                            final u7 u7Var6 = u7Var5;
                                            billingController.queryProductDetails(arrayList10, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i19) {
                                                        case 0:
                                                            final int i112 = 1;
                                                            final u7 u7Var8 = u7Var6;
                                                            final ArrayList arrayList13 = arrayList11;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i112) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i115 = 0; i115 < list2.size(); i115++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i115);
                                                                                        int i116 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList13;
                                                                                            if (i116 >= arrayList16.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList16.get(i116)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList16.get(i116);
                                                                                            } else {
                                                                                                i116++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var8;
                                                                                if (u7Var11.f10161m != null) {
                                                                                    for (int i117 = 0; i117 < u7Var11.f10161m.size(); i117++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var11.f10161m.get(i117);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList13;
                                                                                            if (i21 >= arrayList17.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList17.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList17.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var8;
                                                                                if (u7Var12.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var12.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) u7Var12.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList13;
                                                                                            if (i24 >= arrayList18.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList18.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList18.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var13 = u7Var8;
                                                                                if (u7Var13.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var13.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var13.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var13.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i113 = 2;
                                                            final u7 u7Var9 = u7Var6;
                                                            final ArrayList arrayList14 = arrayList11;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i113) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i115 = 0; i115 < list2.size(); i115++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i115);
                                                                                        int i116 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList14;
                                                                                            if (i116 >= arrayList16.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList16.get(i116)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList16.get(i116);
                                                                                            } else {
                                                                                                i116++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var9;
                                                                                if (u7Var11.f10161m != null) {
                                                                                    for (int i117 = 0; i117 < u7Var11.f10161m.size(); i117++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var11.f10161m.get(i117);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList14;
                                                                                            if (i21 >= arrayList17.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList17.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList17.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var9;
                                                                                if (u7Var12.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var12.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) u7Var12.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList14;
                                                                                            if (i24 >= arrayList18.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList18.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList18.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var13 = u7Var9;
                                                                                if (u7Var13.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var13.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var13.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var13.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i114 = 0;
                                                            final u7 u7Var10 = u7Var6;
                                                            final ArrayList arrayList15 = arrayList11;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i114) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i115 = 0; i115 < list2.size(); i115++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i115);
                                                                                        int i116 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList15;
                                                                                            if (i116 >= arrayList16.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList16.get(i116)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList16.get(i116);
                                                                                            } else {
                                                                                                i116++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var10;
                                                                                if (u7Var11.f10161m != null) {
                                                                                    for (int i117 = 0; i117 < u7Var11.f10161m.size(); i117++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var11.f10161m.get(i117);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList15;
                                                                                            if (i21 >= arrayList17.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList17.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList17.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var10;
                                                                                if (u7Var12.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var12.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) u7Var12.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList15;
                                                                                            if (i24 >= arrayList18.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList18.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList18.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var13 = u7Var10;
                                                                                if (u7Var13.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var13.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var13.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var13.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            c9.b bVar = new c9.b();
                                            bVar.f2567c = "inapp";
                                            bVar.f2566b = ((TL_stars.TL_starsTopupOption) arrayList11.get(i18)).store_product;
                                            arrayList10.add(bVar.a());
                                            i18++;
                                        }
                                        break;
                                    }
                                    break;
                                case 1:
                                    ArrayList arrayList12 = new ArrayList();
                                    int i110 = 0;
                                    while (true) {
                                        final ArrayList arrayList13 = arrayList8;
                                        if (i110 >= arrayList13.size()) {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final int i111 = 2;
                                            final u7 u7Var7 = u7Var5;
                                            billingController2.queryProductDetails(arrayList12, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i111) {
                                                        case 0:
                                                            final int i112 = 1;
                                                            final u7 u7Var8 = u7Var7;
                                                            final ArrayList arrayList14 = arrayList13;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i112) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i115 = 0; i115 < list2.size(); i115++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i115);
                                                                                        int i116 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList14;
                                                                                            if (i116 >= arrayList16.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList16.get(i116)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList16.get(i116);
                                                                                            } else {
                                                                                                i116++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var8;
                                                                                if (u7Var11.f10161m != null) {
                                                                                    for (int i117 = 0; i117 < u7Var11.f10161m.size(); i117++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var11.f10161m.get(i117);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList14;
                                                                                            if (i21 >= arrayList17.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList17.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList17.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var8;
                                                                                if (u7Var12.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var12.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) u7Var12.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList14;
                                                                                            if (i24 >= arrayList18.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList18.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList18.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var13 = u7Var8;
                                                                                if (u7Var13.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var13.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var13.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var13.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i113 = 2;
                                                            final u7 u7Var9 = u7Var7;
                                                            final ArrayList arrayList15 = arrayList13;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i113) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i115 = 0; i115 < list2.size(); i115++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i115);
                                                                                        int i116 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList15;
                                                                                            if (i116 >= arrayList16.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList16.get(i116)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList16.get(i116);
                                                                                            } else {
                                                                                                i116++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var9;
                                                                                if (u7Var11.f10161m != null) {
                                                                                    for (int i117 = 0; i117 < u7Var11.f10161m.size(); i117++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var11.f10161m.get(i117);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList15;
                                                                                            if (i21 >= arrayList17.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList17.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList17.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var9;
                                                                                if (u7Var12.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var12.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) u7Var12.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList15;
                                                                                            if (i24 >= arrayList18.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList18.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList18.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var13 = u7Var9;
                                                                                if (u7Var13.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var13.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var13.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var13.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i114 = 0;
                                                            final u7 u7Var10 = u7Var7;
                                                            final ArrayList arrayList16 = arrayList13;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i114) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i115 = 0; i115 < list2.size(); i115++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i115);
                                                                                        int i116 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList16;
                                                                                            if (i116 >= arrayList17.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList17.get(i116)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList17.get(i116);
                                                                                            } else {
                                                                                                i116++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var10;
                                                                                if (u7Var11.f10161m != null) {
                                                                                    for (int i117 = 0; i117 < u7Var11.f10161m.size(); i117++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var11.f10161m.get(i117);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList16;
                                                                                            if (i21 >= arrayList18.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList18.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList18.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var10;
                                                                                if (u7Var12.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var12.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) u7Var12.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList19 = arrayList16;
                                                                                            if (i24 >= arrayList19.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList19.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList19.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var13 = u7Var10;
                                                                                if (u7Var13.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var13.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var13.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var13.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            c9.b bVar2 = new c9.b();
                                            bVar2.f2567c = "inapp";
                                            bVar2.f2566b = ((TL_stars.TL_starsGiftOption) arrayList13.get(i110)).store_product;
                                            arrayList12.add(bVar2.a());
                                            i110++;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    ArrayList arrayList14 = new ArrayList();
                                    int i112 = 0;
                                    while (true) {
                                        final ArrayList arrayList15 = arrayList8;
                                        if (i112 >= arrayList15.size()) {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final int i113 = 0;
                                            final u7 u7Var8 = u7Var5;
                                            billingController3.queryProductDetails(arrayList14, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i113) {
                                                        case 0:
                                                            final int i114 = 1;
                                                            final u7 u7Var9 = u7Var8;
                                                            final ArrayList arrayList16 = arrayList15;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i114) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i115 = 0; i115 < list2.size(); i115++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i115);
                                                                                        int i116 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList16;
                                                                                            if (i116 >= arrayList17.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList17.get(i116)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList17.get(i116);
                                                                                            } else {
                                                                                                i116++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var9;
                                                                                if (u7Var11.f10161m != null) {
                                                                                    for (int i117 = 0; i117 < u7Var11.f10161m.size(); i117++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var11.f10161m.get(i117);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList16;
                                                                                            if (i21 >= arrayList18.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList18.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList18.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var9;
                                                                                if (u7Var12.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var12.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) u7Var12.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList19 = arrayList16;
                                                                                            if (i24 >= arrayList19.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList19.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList19.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var13 = u7Var9;
                                                                                if (u7Var13.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var13.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var13.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var13.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i115 = 2;
                                                            final u7 u7Var10 = u7Var8;
                                                            final ArrayList arrayList17 = arrayList15;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i115) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i116 = 0; i116 < list2.size(); i116++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i116);
                                                                                        int i117 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList17;
                                                                                            if (i117 >= arrayList18.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList18.get(i117)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList18.get(i117);
                                                                                            } else {
                                                                                                i117++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var11 = u7Var10;
                                                                                if (u7Var11.f10161m != null) {
                                                                                    for (int i118 = 0; i118 < u7Var11.f10161m.size(); i118++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var11.f10161m.get(i118);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var11.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList19 = arrayList17;
                                                                                            if (i21 >= arrayList19.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList19.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList19.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var10;
                                                                                if (u7Var12.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var12.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) u7Var12.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList110 = arrayList17;
                                                                                            if (i24 >= arrayList110.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList110.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList110.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var13 = u7Var10;
                                                                                if (u7Var13.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var13.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var13.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var13.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i116 = 0;
                                                            final u7 u7Var11 = u7Var8;
                                                            final ArrayList arrayList18 = arrayList15;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i iVarA;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i iVarA2;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i iVarA3;
                                                                    switch (i116) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.f18147a));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i117 = 0; i117 < list2.size(); i117++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i117);
                                                                                        int i118 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList19 = arrayList18;
                                                                                            if (i118 >= arrayList19.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList19.get(i118)).store_product.equals(lVar.f18163c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList19.get(i118);
                                                                                            } else {
                                                                                                i118++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (iVarA = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = iVarA.f18152c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var12 = u7Var11;
                                                                                if (u7Var12.f10161m != null) {
                                                                                    for (int i119 = 0; i119 < u7Var12.f10161m.size(); i119++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) u7Var12.f10161m.get(i119);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var12.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.f18147a));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList110 = arrayList18;
                                                                                            if (i21 >= arrayList110.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList110.get(i21)).store_product.equals(lVar2.f18163c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList110.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (iVarA2 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = iVarA2.f18152c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var13 = u7Var11;
                                                                                if (u7Var13.f10164p != null) {
                                                                                    for (int i22 = 0; i22 < u7Var13.f10164p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) u7Var13.f10164p.get(i22);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var13.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.f18147a != 0) {
                                                                                u7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.f18147a));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList111 = arrayList18;
                                                                                            if (i24 >= arrayList111.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList111.get(i24)).store_product.equals(lVar3.f18163c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList111.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (iVarA3 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = iVarA3.f18152c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (iVarA3.f18151b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                u7 u7Var14 = u7Var11;
                                                                                if (u7Var14.f10158j != null) {
                                                                                    for (int i25 = 0; i25 < u7Var14.f10158j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) u7Var14.f10158j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(u7Var14.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            c9.b bVar3 = new c9.b();
                                            bVar3.f2567c = "inapp";
                                            bVar3.f2566b = ((TL_stars.TL_starsGiveawayOption) arrayList15.get(i112)).store_product;
                                            arrayList14.add(bVar3.a());
                                            i112++;
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    if (!BillingController.getInstance().isReady()) {
                        BillingController.getInstance().whenSetuped(runnable3);
                    } else {
                        runnable3.run();
                    }
                }
                break;
            default:
                MessagesController.getInstance(this.f10023b.f10151a).processUpdates((TLRPC.Updates) this.f10024c, false);
                break;
        }
    }
}
