package bi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
public final class a9 implements Runnable {
    public final int f3459a;
    public final ea f3460b;
    public final TLObject f3461c;

    public a9(ea eaVar, TLObject tLObject, int i7) {
        this.f3459a = i7;
        this.f3460b = eaVar;
        this.f3461c = tLObject;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f3459a) {
            case 0:
                ea eaVar = this.f3460b;
                int i7 = eaVar.f3807a;
                eaVar.A = false;
                TLObject tLObject = this.f3461c;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    qp.s1(i7).Y3(starsStatus.users, false);
                    qp.s1(i7).S3(starsStatus.chats, false);
                    eaVar.f3829z.addAll(starsStatus.subscriptions);
                    eaVar.i0(starsStatus.balance);
                    qs.f(i7).k(223, new Object[0]);
                    return;
                }
                return;
            case 1:
                ea eaVar2 = this.f3460b;
                int i10 = eaVar2.f3807a;
                eaVar2.f3827x = false;
                TLObject tLObject2 = this.f3461c;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                    qp.s1(i10).Y3(starsStatus2.users, false);
                    qp.s1(i10).S3(starsStatus2.chats, false);
                    eaVar2.v.addAll(starsStatus2.subscriptions);
                    if ((starsStatus2.flags & 4) == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    eaVar2.f3828y = z9;
                    eaVar2.f3826w = starsStatus2.subscriptions_next_offset;
                    eaVar2.i0(starsStatus2.balance);
                    qs.f(i10).k(223, new Object[0]);
                    return;
                }
                return;
            case 2:
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                TLObject tLObject3 = this.f3461c;
                boolean z10 = tLObject3 instanceof Vector;
                final ea eaVar3 = this.f3460b;
                if (z10) {
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
                    eaVar3.f3813i = true;
                }
                eaVar3.f3814j = arrayList;
                eaVar3.h = false;
                qs.f(eaVar3.f3807a).k(218, new Object[0]);
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
                                            ?? obj2 = new Object();
                                            obj2.f11113b = "inapp";
                                            obj2.f11112a = ((TL_stars.TL_starsTopupOption) arrayList5.get(i12)).store_product;
                                            arrayList4.add(obj2.a());
                                            i12++;
                                        } else {
                                            org.telegram.messenger.r1 i13 = org.telegram.messenger.r1.i();
                                            final ea eaVar4 = eaVar3;
                                            i13.o(arrayList4, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final ea eaVar5 = eaVar4;
                                                            final ArrayList arrayList6 = arrayList5;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i14 = fVar.f11151a;
                                                                            if (i14 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i14)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i15);
                                                                                    int i16 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7 = arrayList6;
                                                                                        if (i16 < arrayList7.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7.get(i16)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList7.get(i16);
                                                                                            } else {
                                                                                                i16++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f11156c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar6 = eaVar5;
                                                                            if (eaVar6.f3817m != null) {
                                                                                for (int i17 = 0; i17 < eaVar6.f3817m.size(); i17++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar6.f3817m.get(i17);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar6.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8 = arrayList6;
                                                                                        if (i20 < arrayList8.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar7 = eaVar5;
                                                                            if (eaVar7.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar7.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar7.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar7.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList6;
                                                                                        if (i24 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar5;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final ea eaVar6 = eaVar4;
                                                            final ArrayList arrayList7 = arrayList5;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i14 = fVar.f11151a;
                                                                            if (i14 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i14)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i15);
                                                                                    int i16 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList7;
                                                                                        if (i16 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i16)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i16);
                                                                                            } else {
                                                                                                i16++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f11156c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar62 = eaVar6;
                                                                            if (eaVar62.f3817m != null) {
                                                                                for (int i17 = 0; i17 < eaVar62.f3817m.size(); i17++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar62.f3817m.get(i17);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar62.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8 = arrayList7;
                                                                                        if (i20 < arrayList8.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar7 = eaVar6;
                                                                            if (eaVar7.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar7.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar7.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar7.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList7;
                                                                                        if (i24 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar6;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final ea eaVar7 = eaVar4;
                                                            final ArrayList arrayList8 = arrayList5;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i14 = fVar.f11151a;
                                                                            if (i14 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i14)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i15);
                                                                                    int i16 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList8;
                                                                                        if (i16 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i16)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i16);
                                                                                            } else {
                                                                                                i16++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f11156c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar62 = eaVar7;
                                                                            if (eaVar62.f3817m != null) {
                                                                                for (int i17 = 0; i17 < eaVar62.f3817m.size(); i17++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar62.f3817m.get(i17);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar62.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList8;
                                                                                        if (i20 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar7;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList8;
                                                                                        if (i24 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar7;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
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
                                            ?? obj3 = new Object();
                                            obj3.f11113b = "inapp";
                                            obj3.f11112a = ((TL_stars.TL_starsGiftOption) arrayList7.get(i14)).store_product;
                                            arrayList6.add(obj3.a());
                                            i14++;
                                        } else {
                                            org.telegram.messenger.r1 i15 = org.telegram.messenger.r1.i();
                                            final ea eaVar5 = eaVar3;
                                            i15.o(arrayList6, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final ea eaVar52 = eaVar5;
                                                            final ArrayList arrayList62 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i16 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList62;
                                                                                        if (i16 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i16)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i16);
                                                                                            } else {
                                                                                                i16++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f11156c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar62 = eaVar52;
                                                                            if (eaVar62.f3817m != null) {
                                                                                for (int i17 = 0; i17 < eaVar62.f3817m.size(); i17++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar62.f3817m.get(i17);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar62.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList62;
                                                                                        if (i20 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar52;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList62;
                                                                                        if (i24 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar52;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final ea eaVar6 = eaVar5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i16 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i16 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i16)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i16);
                                                                                            } else {
                                                                                                i16++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f11156c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar62 = eaVar6;
                                                                            if (eaVar62.f3817m != null) {
                                                                                for (int i17 = 0; i17 < eaVar62.f3817m.size(); i17++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar62.f3817m.get(i17);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar62.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList72;
                                                                                        if (i20 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar6;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList72;
                                                                                        if (i24 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar6;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final ea eaVar7 = eaVar5;
                                                            final ArrayList arrayList8 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i16 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList8;
                                                                                        if (i16 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i16)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i16);
                                                                                            } else {
                                                                                                i16++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f11156c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar62 = eaVar7;
                                                                            if (eaVar62.f3817m != null) {
                                                                                for (int i17 = 0; i17 < eaVar62.f3817m.size(); i17++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar62.f3817m.get(i17);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar62.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList8;
                                                                                        if (i20 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar7;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList8;
                                                                                        if (i24 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar7;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
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
                                            ?? obj4 = new Object();
                                            obj4.f11113b = "inapp";
                                            obj4.f11112a = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i16)).store_product;
                                            arrayList8.add(obj4.a());
                                            i16++;
                                        } else {
                                            org.telegram.messenger.r1 i17 = org.telegram.messenger.r1.i();
                                            final ea eaVar6 = eaVar3;
                                            i17.o(arrayList8, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final ea eaVar52 = eaVar6;
                                                            final ArrayList arrayList62 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList62;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f11156c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar62 = eaVar52;
                                                                            if (eaVar62.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar62.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar62.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar62.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList62;
                                                                                        if (i20 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar52;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList62;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar52;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final ea eaVar62 = eaVar6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f11156c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar62;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList72;
                                                                                        if (i20 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar62;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar62;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final ea eaVar7 = eaVar6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a10.f11156c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar7;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar7;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar7;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
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
                        org.telegram.messenger.r1.i().f25208i.add(runnable);
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
                TLObject tLObject4 = this.f3461c;
                boolean z11 = tLObject4 instanceof Vector;
                final ea eaVar4 = this.f3460b;
                if (z11) {
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
                    eaVar4.f3816l = true;
                }
                eaVar4.f3817m = arrayList4;
                eaVar4.f3815k = false;
                qs.f(eaVar4.f3807a).k(219, new Object[0]);
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
                                            ?? obj22 = new Object();
                                            obj22.f11113b = "inapp";
                                            obj22.f11112a = ((TL_stars.TL_starsTopupOption) arrayList52.get(i122)).store_product;
                                            arrayList42.add(obj22.a());
                                            i122++;
                                        } else {
                                            org.telegram.messenger.r1 i13 = org.telegram.messenger.r1.i();
                                            final ea eaVar42 = eaVar4;
                                            i13.o(arrayList42, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final ea eaVar52 = eaVar42;
                                                            final ArrayList arrayList62 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList62;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar52;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList62;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar52;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList62;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar52;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final ea eaVar62 = eaVar42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar62;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar62;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar62;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final ea eaVar7 = eaVar42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar7;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar7;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar7;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
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
                                            ?? obj3 = new Object();
                                            obj3.f11113b = "inapp";
                                            obj3.f11112a = ((TL_stars.TL_starsGiftOption) arrayList7.get(i14)).store_product;
                                            arrayList62.add(obj3.a());
                                            i14++;
                                        } else {
                                            org.telegram.messenger.r1 i15 = org.telegram.messenger.r1.i();
                                            final ea eaVar5 = eaVar4;
                                            i15.o(arrayList62, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final ea eaVar52 = eaVar5;
                                                            final ArrayList arrayList622 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar52;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar52;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar52;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final ea eaVar62 = eaVar5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar62;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar62;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar62;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final ea eaVar7 = eaVar5;
                                                            final ArrayList arrayList82 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar7;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar7;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar7;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
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
                                            ?? obj4 = new Object();
                                            obj4.f11113b = "inapp";
                                            obj4.f11112a = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i16)).store_product;
                                            arrayList8.add(obj4.a());
                                            i16++;
                                        } else {
                                            org.telegram.messenger.r1 i17 = org.telegram.messenger.r1.i();
                                            final ea eaVar6 = eaVar4;
                                            i17.o(arrayList8, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final ea eaVar52 = eaVar6;
                                                            final ArrayList arrayList622 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar52;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar52;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar52;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final ea eaVar62 = eaVar6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar62;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar62;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar62;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final ea eaVar7 = eaVar6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar7;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar7;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar7;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
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
                        org.telegram.messenger.r1.i().f25208i.add(runnable2);
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
                TLObject tLObject5 = this.f3461c;
                boolean z12 = tLObject5 instanceof Vector;
                final ea eaVar5 = this.f3460b;
                if (z12) {
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
                    eaVar5.f3819o = true;
                }
                eaVar5.f3820p = arrayList7;
                eaVar5.f3818n = false;
                qs.f(eaVar5.f3807a).k(220, new Object[0]);
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
                                            ?? obj22 = new Object();
                                            obj22.f11113b = "inapp";
                                            obj22.f11112a = ((TL_stars.TL_starsTopupOption) arrayList52.get(i122)).store_product;
                                            arrayList42.add(obj22.a());
                                            i122++;
                                        } else {
                                            org.telegram.messenger.r1 i132 = org.telegram.messenger.r1.i();
                                            final ea eaVar42 = eaVar5;
                                            i132.o(arrayList42, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final ea eaVar52 = eaVar42;
                                                            final ArrayList arrayList622 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar52;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar52;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar52;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final ea eaVar62 = eaVar42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar62;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar62;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar62;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final ea eaVar7 = eaVar42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar7;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar7;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar7;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
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
                                            ?? obj32 = new Object();
                                            obj32.f11113b = "inapp";
                                            obj32.f11112a = ((TL_stars.TL_starsGiftOption) arrayList72.get(i14)).store_product;
                                            arrayList62.add(obj32.a());
                                            i14++;
                                        } else {
                                            org.telegram.messenger.r1 i15 = org.telegram.messenger.r1.i();
                                            final ea eaVar52 = eaVar5;
                                            i15.o(arrayList62, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final ea eaVar522 = eaVar52;
                                                            final ArrayList arrayList622 = arrayList72;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i162 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar522;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar522;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar522;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final ea eaVar62 = eaVar52;
                                                            final ArrayList arrayList722 = arrayList72;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList722;
                                                                                        if (i162 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar62;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList722;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar62;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList722;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar62;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final ea eaVar7 = eaVar52;
                                                            final ArrayList arrayList82 = arrayList72;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList82;
                                                                                        if (i162 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar7;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar7;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i24 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar7;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
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
                                            ?? obj4 = new Object();
                                            obj4.f11113b = "inapp";
                                            obj4.f11112a = ((TL_stars.TL_starsGiveawayOption) arrayList92.get(i16)).store_product;
                                            arrayList82.add(obj4.a());
                                            i16++;
                                        } else {
                                            org.telegram.messenger.r1 i17 = org.telegram.messenger.r1.i();
                                            final ea eaVar6 = eaVar5;
                                            i17.o(arrayList82, new org.telegram.messenger.q1() {
                                                @Override
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final ea eaVar522 = eaVar6;
                                                            final ArrayList arrayList622 = arrayList92;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList622;
                                                                                        if (i162 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar522;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar522;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList622;
                                                                                        if (i24 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar522;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final ea eaVar62 = eaVar6;
                                                            final ArrayList arrayList722 = arrayList92;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList722;
                                                                                        if (i162 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar62;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList722;
                                                                                        if (i20 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar62;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList722;
                                                                                        if (i24 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar62;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final ea eaVar7 = eaVar6;
                                                            final ArrayList arrayList822 = arrayList92;
                                                            org.telegram.messenger.g0.h3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i142 = fVar.f11151a;
                                                                            if (i142 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i142)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i152 = 0; i152 < list2.size(); i152++) {
                                                                                    f5.l lVar = (f5.l) list2.get(i152);
                                                                                    int i162 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList822;
                                                                                        if (i162 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i162)).store_product.equals(lVar.f11168c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i162);
                                                                                            } else {
                                                                                                i162++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a10.f11156c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar622 = eaVar7;
                                                                            if (eaVar622.f3817m != null) {
                                                                                for (int i172 = 0; i172 < eaVar622.f3817m.size(); i172++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.f3817m.get(i172);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar622.f3807a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i18 = fVar.f11151a;
                                                                            if (i18 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i18)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                    f5.l lVar2 = (f5.l) list3.get(i19);
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8222 = arrayList822;
                                                                                        if (i20 < arrayList8222.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8222.get(i20)).store_product.equals(lVar2.f11168c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList8222.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a11.f11156c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar72 = eaVar7;
                                                                            if (eaVar72.f3820p != null) {
                                                                                for (int i21 = 0; i21 < eaVar72.f3820p.size(); i21++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.f3820p.get(i21);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar72.f3807a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i22 = fVar.f11151a;
                                                                            if (i22 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i22)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                    f5.l lVar3 = (f5.l) list4.get(i23);
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList822;
                                                                                        if (i24 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i24)).store_product.equals(lVar3.f11168c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a12.f11156c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.f11155b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            ea eaVar8 = eaVar7;
                                                                            if (eaVar8.f3814j != null) {
                                                                                for (int i25 = 0; i25 < eaVar8.f3814j.size(); i25++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.f3814j.get(i25);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            qs.f(eaVar8.f3807a).k(218, new Object[0]);
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
                        org.telegram.messenger.r1.i().f25208i.add(runnable3);
                        return;
                    } else {
                        runnable3.run();
                        return;
                    }
                }
                return;
            default:
                qp.s1(this.f3460b.f3807a).O3((TLRPC.Updates) this.f3461c, false);
                return;
        }
    }
}
