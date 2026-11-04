package ci;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
public final class a8 implements Runnable {
    public final int f4833a;
    public final e9 f4834b;
    public final TLObject f4835c;

    public a8(e9 e9Var, TLObject tLObject, int i3) {
        this.f4833a = i3;
        this.f4834b = e9Var;
        this.f4835c = tLObject;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f4833a) {
            case 0:
                e9 e9Var = this.f4834b;
                int i3 = e9Var.f5029a;
                e9Var.A = false;
                TLObject tLObject = this.f4835c;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    hp.s1(i3).Y3(starsStatus.users, false);
                    hp.s1(i3).S3(starsStatus.chats, false);
                    e9Var.f5051z.addAll(starsStatus.subscriptions);
                    e9Var.i0(starsStatus.balance);
                    hs.f(i3).k(223, new Object[0]);
                    return;
                }
                return;
            case 1:
                e9 e9Var2 = this.f4834b;
                int i10 = e9Var2.f5029a;
                e9Var2.f5049x = false;
                TLObject tLObject2 = this.f4835c;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                    hp.s1(i10).Y3(starsStatus2.users, false);
                    hp.s1(i10).S3(starsStatus2.chats, false);
                    e9Var2.v.addAll(starsStatus2.subscriptions);
                    if ((starsStatus2.flags & 4) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e9Var2.f5050y = z10;
                    e9Var2.f5048w = starsStatus2.subscriptions_next_offset;
                    e9Var2.i0(starsStatus2.balance);
                    hs.f(i10).k(223, new Object[0]);
                    return;
                }
                return;
            case 2:
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                TLObject tLObject3 = this.f4835c;
                boolean z11 = tLObject3 instanceof Vector;
                final e9 e9Var3 = this.f4834b;
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
                            if (tL_starsTopupOption.store_product != null && !org.telegram.messenger.r2.b()) {
                                arrayList2.add(tL_starsTopupOption);
                                tL_starsTopupOption.loadingStorePrice = true;
                            }
                        }
                    }
                    e9Var3.f5035i = true;
                }
                e9Var3.f5036j = arrayList;
                e9Var3.h = false;
                hs.f(e9Var3.f5029a).k(218, new Object[0]);
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
                                            e5.a aVar = new e5.a();
                                            aVar.f9555c = "inapp";
                                            aVar.f9554b = ((TL_stars.TL_starsTopupOption) arrayList5.get(i12)).store_product;
                                            arrayList4.add(aVar.a());
                                            i12++;
                                        } else {
                                            org.telegram.messenger.r1 i13 = org.telegram.messenger.r1.i();
                                            final e9 e9Var4 = e9Var3;
                                            i13.o(arrayList4, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void k(final e5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e9 e9Var5 = e9Var4;
                                                            final ArrayList arrayList6 = arrayList5;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i14 = fVar.f9593a;
                                                                            if (i14 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i14)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i15);
                                                                                    int i16 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7 = arrayList6;
                                                                                        if (i16 < arrayList7.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7.get(i16)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList7.get(i16);
                                                                                            } else {
                                                                                                i16++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f9598c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var6 = e9Var5;
                                                                            if (e9Var6.f5039m != null) {
                                                                                for (int i17 = 0; i17 < e9Var6.f5039m.size(); i17++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e9Var6.f5039m.get(i17);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var6.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8 = arrayList6;
                                                                                        if (i20 < arrayList8.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var7 = e9Var5;
                                                                            if (e9Var7.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var7.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var7.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var7.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList6;
                                                                                        if (i24 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var5;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e9 e9Var6 = e9Var4;
                                                            final ArrayList arrayList7 = arrayList5;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i14 = fVar.f9593a;
                                                                            if (i14 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i14)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i15);
                                                                                    int i16 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList7;
                                                                                        if (i16 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i16)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i16);
                                                                                            } else {
                                                                                                i16++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f9598c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var62 = e9Var6;
                                                                            if (e9Var62.f5039m != null) {
                                                                                for (int i17 = 0; i17 < e9Var62.f5039m.size(); i17++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e9Var62.f5039m.get(i17);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var62.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8 = arrayList7;
                                                                                        if (i20 < arrayList8.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var7 = e9Var6;
                                                                            if (e9Var7.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var7.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var7.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var7.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList7;
                                                                                        if (i24 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var6;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e9 e9Var7 = e9Var4;
                                                            final ArrayList arrayList8 = arrayList5;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i14 = fVar.f9593a;
                                                                            if (i14 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i14)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i15);
                                                                                    int i16 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList8;
                                                                                        if (i16 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i16)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i16);
                                                                                            } else {
                                                                                                i16++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f9598c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var62 = e9Var7;
                                                                            if (e9Var62.f5039m != null) {
                                                                                for (int i17 = 0; i17 < e9Var62.f5039m.size(); i17++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e9Var62.f5039m.get(i17);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var62.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList8;
                                                                                        if (i20 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var7;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList8;
                                                                                        if (i24 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var7;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
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
                                            e5.a aVar2 = new e5.a();
                                            aVar2.f9555c = "inapp";
                                            aVar2.f9554b = ((TL_stars.TL_starsGiftOption) arrayList7.get(i14)).store_product;
                                            arrayList6.add(aVar2.a());
                                            i14++;
                                        } else {
                                            org.telegram.messenger.r1 i15 = org.telegram.messenger.r1.i();
                                            final e9 e9Var5 = e9Var3;
                                            i15.o(arrayList6, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void k(final e5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e9 e9Var52 = e9Var5;
                                                            final ArrayList arrayList62 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i16 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList62;
                                                                                        if (i16 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i16)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i16);
                                                                                            } else {
                                                                                                i16++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f9598c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var62 = e9Var52;
                                                                            if (e9Var62.f5039m != null) {
                                                                                for (int i17 = 0; i17 < e9Var62.f5039m.size(); i17++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e9Var62.f5039m.get(i17);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var62.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList62;
                                                                                        if (i20 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var52;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList62;
                                                                                        if (i24 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var52;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e9 e9Var6 = e9Var5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i16 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i16 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i16)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i16);
                                                                                            } else {
                                                                                                i16++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f9598c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var62 = e9Var6;
                                                                            if (e9Var62.f5039m != null) {
                                                                                for (int i17 = 0; i17 < e9Var62.f5039m.size(); i17++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e9Var62.f5039m.get(i17);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var62.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList72;
                                                                                        if (i20 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var6;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList72;
                                                                                        if (i24 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var6;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e9 e9Var7 = e9Var5;
                                                            final ArrayList arrayList8 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i16 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList8;
                                                                                        if (i16 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i16)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i16);
                                                                                            } else {
                                                                                                i16++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f9598c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var62 = e9Var7;
                                                                            if (e9Var62.f5039m != null) {
                                                                                for (int i17 = 0; i17 < e9Var62.f5039m.size(); i17++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e9Var62.f5039m.get(i17);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var62.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList8;
                                                                                        if (i20 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var7;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList8;
                                                                                        if (i24 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var7;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
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
                                    int i16 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList2;
                                        if (i16 < arrayList9.size()) {
                                            e5.a aVar3 = new e5.a();
                                            aVar3.f9555c = "inapp";
                                            aVar3.f9554b = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i16)).store_product;
                                            arrayList8.add(aVar3.a());
                                            i16++;
                                        } else {
                                            org.telegram.messenger.r1 i17 = org.telegram.messenger.r1.i();
                                            final e9 e9Var6 = e9Var3;
                                            i17.o(arrayList8, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void k(final e5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e9 e9Var52 = e9Var6;
                                                            final ArrayList arrayList62 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList62;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f9598c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var62 = e9Var52;
                                                                            if (e9Var62.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var62.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e9Var62.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var62.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList62;
                                                                                        if (i20 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var52;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList62;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var52;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e9 e9Var62 = e9Var6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f9598c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var62;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList72;
                                                                                        if (i20 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var62;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var62;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e9 e9Var7 = e9Var6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f9598c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var7;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var7;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var7;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
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
                    if (!org.telegram.messenger.r1.i().k()) {
                        org.telegram.messenger.r1.i().f25038i.add(runnable);
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
                TLObject tLObject4 = this.f4835c;
                boolean z12 = tLObject4 instanceof Vector;
                final e9 e9Var4 = this.f4834b;
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
                            if (tL_starsGiftOption.store_product != null && !org.telegram.messenger.r2.b()) {
                                arrayList5.add(tL_starsGiftOption);
                                tL_starsGiftOption.loadingStorePrice = true;
                            }
                        }
                    }
                    e9Var4.f5038l = true;
                }
                e9Var4.f5039m = arrayList4;
                e9Var4.f5037k = false;
                hs.f(e9Var4.f5029a).k(219, new Object[0]);
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
                                            e5.a aVar = new e5.a();
                                            aVar.f9555c = "inapp";
                                            aVar.f9554b = ((TL_stars.TL_starsTopupOption) arrayList52.get(i122)).store_product;
                                            arrayList42.add(aVar.a());
                                            i122++;
                                        } else {
                                            org.telegram.messenger.r1 i13 = org.telegram.messenger.r1.i();
                                            final e9 e9Var42 = e9Var4;
                                            i13.o(arrayList42, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void k(final e5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e9 e9Var52 = e9Var42;
                                                            final ArrayList arrayList62 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList62;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var52;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList62;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var52;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList62;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var52;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e9 e9Var62 = e9Var42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var62;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var62;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var62;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e9 e9Var7 = e9Var42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var7;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var7;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var7;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
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
                                            e5.a aVar2 = new e5.a();
                                            aVar2.f9555c = "inapp";
                                            aVar2.f9554b = ((TL_stars.TL_starsGiftOption) arrayList7.get(i14)).store_product;
                                            arrayList62.add(aVar2.a());
                                            i14++;
                                        } else {
                                            org.telegram.messenger.r1 i15 = org.telegram.messenger.r1.i();
                                            final e9 e9Var5 = e9Var4;
                                            i15.o(arrayList62, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void k(final e5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e9 e9Var52 = e9Var5;
                                                            final ArrayList arrayList622 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var52;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var52;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var52;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e9 e9Var62 = e9Var5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var62;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var62;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var62;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e9 e9Var7 = e9Var5;
                                                            final ArrayList arrayList82 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var7;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var7;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var7;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
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
                                    int i16 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList5;
                                        if (i16 < arrayList9.size()) {
                                            e5.a aVar3 = new e5.a();
                                            aVar3.f9555c = "inapp";
                                            aVar3.f9554b = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i16)).store_product;
                                            arrayList8.add(aVar3.a());
                                            i16++;
                                        } else {
                                            org.telegram.messenger.r1 i17 = org.telegram.messenger.r1.i();
                                            final e9 e9Var6 = e9Var4;
                                            i17.o(arrayList8, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void k(final e5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e9 e9Var52 = e9Var6;
                                                            final ArrayList arrayList622 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var52;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var52;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var52;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e9 e9Var62 = e9Var6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var62;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var62;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var62;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e9 e9Var7 = e9Var6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var7;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var7;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var7;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
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
                    if (!org.telegram.messenger.r1.i().k()) {
                        org.telegram.messenger.r1.i().f25038i.add(runnable2);
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
                TLObject tLObject5 = this.f4835c;
                boolean z13 = tLObject5 instanceof Vector;
                final e9 e9Var5 = this.f4834b;
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
                            if (tL_starsGiveawayOption.store_product != null && !org.telegram.messenger.r2.b()) {
                                arrayList8.add(tL_starsGiveawayOption);
                                tL_starsGiveawayOption.loadingStorePrice = true;
                            }
                        }
                    }
                    e9Var5.f5041o = true;
                }
                e9Var5.f5042p = arrayList7;
                e9Var5.f5040n = false;
                hs.f(e9Var5.f5029a).k(220, new Object[0]);
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
                                            e5.a aVar = new e5.a();
                                            aVar.f9555c = "inapp";
                                            aVar.f9554b = ((TL_stars.TL_starsTopupOption) arrayList52.get(i122)).store_product;
                                            arrayList42.add(aVar.a());
                                            i122++;
                                        } else {
                                            org.telegram.messenger.r1 i132 = org.telegram.messenger.r1.i();
                                            final e9 e9Var42 = e9Var5;
                                            i132.o(arrayList42, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void k(final e5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e9 e9Var52 = e9Var42;
                                                            final ArrayList arrayList622 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var52;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var52;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var52;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e9 e9Var62 = e9Var42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var62;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var62;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var62;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e9 e9Var7 = e9Var42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var7;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var7;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var7;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
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
                                        final ArrayList arrayList72 = arrayList8;
                                        if (i14 < arrayList72.size()) {
                                            e5.a aVar2 = new e5.a();
                                            aVar2.f9555c = "inapp";
                                            aVar2.f9554b = ((TL_stars.TL_starsGiftOption) arrayList72.get(i14)).store_product;
                                            arrayList62.add(aVar2.a());
                                            i14++;
                                        } else {
                                            org.telegram.messenger.r1 i15 = org.telegram.messenger.r1.i();
                                            final e9 e9Var52 = e9Var5;
                                            i15.o(arrayList62, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void k(final e5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e9 e9Var522 = e9Var52;
                                                            final ArrayList arrayList622 = arrayList72;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var522;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var522;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var522;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e9 e9Var62 = e9Var52;
                                                            final ArrayList arrayList722 = arrayList72;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList722;
                                                                                        if (i162 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var62;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList722;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var62;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList722;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var62;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e9 e9Var7 = e9Var52;
                                                            final ArrayList arrayList82 = arrayList72;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList82;
                                                                                        if (i162 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var7;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var7;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var7;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
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
                                    int i16 = 0;
                                    while (true) {
                                        final ArrayList arrayList92 = arrayList8;
                                        if (i16 < arrayList92.size()) {
                                            e5.a aVar3 = new e5.a();
                                            aVar3.f9555c = "inapp";
                                            aVar3.f9554b = ((TL_stars.TL_starsGiveawayOption) arrayList92.get(i16)).store_product;
                                            arrayList82.add(aVar3.a());
                                            i16++;
                                        } else {
                                            org.telegram.messenger.r1 i17 = org.telegram.messenger.r1.i();
                                            final e9 e9Var6 = e9Var5;
                                            i17.o(arrayList82, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void k(final e5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e9 e9Var522 = e9Var6;
                                                            final ArrayList arrayList622 = arrayList92;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList622;
                                                                                        if (i162 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var522;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var522;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList622;
                                                                                        if (i24 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var522;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e9 e9Var62 = e9Var6;
                                                            final ArrayList arrayList722 = arrayList92;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList722;
                                                                                        if (i162 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var62;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList722;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var62;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList722;
                                                                                        if (i24 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var62;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e9 e9Var7 = e9Var6;
                                                            final ArrayList arrayList822 = arrayList92;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    e5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    e5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    e5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f9593a;
                                                                            if (i142 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    e5.l lVar = (e5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList822;
                                                                                        if (i162 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i162)).store_product.equals(lVar.f9611c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f9598c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var622 = e9Var7;
                                                                            if (e9Var622.f5039m != null) {
                                                                                for (int i172 = 0; i172 < e9Var622.f5039m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e9Var622.f5039m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var622.f5029a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f9593a;
                                                                            if (i18 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    e5.l lVar2 = (e5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8222 = arrayList822;
                                                                                        if (i20 < arrayList8222.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8222.get(i20)).store_product.equals(lVar2.f9611c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList8222.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f9598c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var72 = e9Var7;
                                                                            if (e9Var72.f5042p != null) {
                                                                                for (int i21 = 0; i21 < e9Var72.f5042p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e9Var72.f5042p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var72.f5029a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f9593a;
                                                                            if (i22 != 0) {
                                                                                e9.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    e5.l lVar3 = (e5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList822;
                                                                                        if (i24 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i24)).store_product.equals(lVar3.f9611c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f9598c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f9597b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e9 e9Var8 = e9Var7;
                                                                            if (e9Var8.f5036j != null) {
                                                                                for (int i25 = 0; i25 < e9Var8.f5036j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e9Var8.f5036j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            hs.f(e9Var8.f5029a).k(218, new Object[0]);
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
                    if (!org.telegram.messenger.r1.i().k()) {
                        org.telegram.messenger.r1.i().f25038i.add(runnable3);
                        return;
                    } else {
                        runnable3.run();
                        return;
                    }
                }
                return;
            default:
                hp.s1(this.f4834b.f5029a).O3((TLRPC.Updates) this.f4835c, false);
                return;
        }
    }
}
