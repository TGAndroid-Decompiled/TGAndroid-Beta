package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
public final class lsa implements Runnable {
    public final byte a;
    public final gta b;
    public final TLObject c;

    public lsa(gta gtaVar, TLObject tLObject, byte b) {
        this.a = b;
        this.b = gtaVar;
        this.c = tLObject;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = true;
        TLObject tLObject = this.c;
        final gta gtaVar = this.b;
        switch (b) {
            case 0:
                int i = gtaVar.a;
                gtaVar.A = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    na7.q1(i).b4(starsStatus.users, false);
                    na7.q1(i).V3(starsStatus.chats, false);
                    gtaVar.z.addAll(starsStatus.subscriptions);
                    gtaVar.i0(starsStatus.balance);
                    kk7.f(i).k(225, new Object[0]);
                    return;
                }
                return;
            case 1:
                int i2 = gtaVar.a;
                gtaVar.x = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject;
                    na7.q1(i2).b4(starsStatus2.users, false);
                    na7.q1(i2).V3(starsStatus2.chats, false);
                    gtaVar.v.addAll(starsStatus2.subscriptions);
                    if ((starsStatus2.flags & 4) != 0) {
                        z = false;
                    }
                    gtaVar.y = z;
                    gtaVar.w = starsStatus2.subscriptions_next_offset;
                    gtaVar.i0(starsStatus2.balance);
                    kk7.f(i2).k(225, new Object[0]);
                    return;
                }
                return;
            case 2:
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList3 = ((Vector) tLObject).objects;
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList3.get(i3);
                        i3++;
                        if (obj instanceof TL_stars.TL_starsTopupOption) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj;
                            arrayList.add(tL_starsTopupOption);
                            if (tL_starsTopupOption.store_product != null && !w01.b()) {
                                arrayList2.add(tL_starsTopupOption);
                                tL_starsTopupOption.loadingStorePrice = true;
                            }
                        }
                    }
                    gtaVar.i = true;
                }
                gtaVar.j = arrayList;
                gtaVar.h = false;
                kk7.f(gtaVar.a).k(220, new Object[0]);
                if (!arrayList2.isEmpty()) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            final ArrayList arrayList4 = arrayList2;
                            final gta gtaVar2 = gtaVar;
                            int i4 = 0;
                            switch (b2) {
                                case 0:
                                    ArrayList arrayList5 = new ArrayList();
                                    while (i4 < arrayList4.size()) {
                                        ?? obj2 = new Object();
                                        obj2.b = "inapp";
                                        obj2.a = ((TL_stars.TL_starsTopupOption) arrayList4.get(i4)).store_product;
                                        arrayList5.add(obj2.a());
                                        i4++;
                                    }
                                    ci0.h().o(arrayList5, new bi0() {
                                        @Override
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList6 = arrayList4;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList7 = arrayList6;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar4 = gtaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i5 = fi0Var2.a;
                                                                    if (i5 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i5)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList7.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList7.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList7.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar4.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar4.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar4.m.get(i8);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar4.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList7.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList7.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList7.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar4.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar4.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar4.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar4.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList7.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList7.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList7.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar4.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar4.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar4.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar4.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList7 = arrayList4;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList7;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i5 = fi0Var2.a;
                                                                    if (i5 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i5)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList72.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList72.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList8 = arrayList4;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList8;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i5 = fi0Var2.a;
                                                                    if (i5 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i5)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList72.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList72.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                case 1:
                                    ArrayList arrayList6 = new ArrayList();
                                    while (i4 < arrayList4.size()) {
                                        ?? obj3 = new Object();
                                        obj3.b = "inapp";
                                        obj3.a = ((TL_stars.TL_starsGiftOption) arrayList4.get(i4)).store_product;
                                        arrayList6.add(obj3.a());
                                        i4++;
                                    }
                                    ci0.h().o(arrayList6, new bi0() {
                                        @Override
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList62 = arrayList4;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList62;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i5 = fi0Var2.a;
                                                                    if (i5 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i5)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList72.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList72.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList7 = arrayList4;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList7;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i5 = fi0Var2.a;
                                                                    if (i5 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i5)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList72.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList72.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList8 = arrayList4;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList8;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i5 = fi0Var2.a;
                                                                    if (i5 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i5)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList72.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList72.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    ArrayList arrayList7 = new ArrayList();
                                    for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                                        ?? obj4 = new Object();
                                        obj4.b = "inapp";
                                        obj4.a = ((TL_stars.TL_starsGiveawayOption) arrayList4.get(i5)).store_product;
                                        arrayList7.add(obj4.a());
                                    }
                                    ci0.h().o(arrayList7, new bi0() {
                                        @Override
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList62 = arrayList4;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList62;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList72.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList72.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList72 = arrayList4;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList8 = arrayList4;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
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
                    };
                    if (!ci0.h().j()) {
                        ci0.h().i.add(runnable);
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
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList6 = ((Vector) tLObject).objects;
                    int size2 = arrayList6.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj2 = arrayList6.get(i4);
                        i4++;
                        if (obj2 instanceof TL_stars.TL_starsGiftOption) {
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                            arrayList4.add(tL_starsGiftOption);
                            if (tL_starsGiftOption.store_product != null && !w01.b()) {
                                arrayList5.add(tL_starsGiftOption);
                                tL_starsGiftOption.loadingStorePrice = true;
                            }
                        }
                    }
                    gtaVar.l = true;
                }
                gtaVar.m = arrayList4;
                gtaVar.k = false;
                kk7.f(gtaVar.a).k(221, new Object[0]);
                if (!arrayList5.isEmpty()) {
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            final ArrayList arrayList42 = arrayList5;
                            final gta gtaVar2 = gtaVar;
                            int i42 = 0;
                            switch (b2) {
                                case 0:
                                    ArrayList arrayList52 = new ArrayList();
                                    while (i42 < arrayList42.size()) {
                                        ?? obj22 = new Object();
                                        obj22.b = "inapp";
                                        obj22.a = ((TL_stars.TL_starsTopupOption) arrayList42.get(i42)).store_product;
                                        arrayList52.add(obj22.a());
                                        i42++;
                                    }
                                    ci0.h().o(arrayList52, new bi0() {
                                        @Override
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList62 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList62;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList8 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    while (i42 < arrayList42.size()) {
                                        ?? obj3 = new Object();
                                        obj3.b = "inapp";
                                        obj3.a = ((TL_stars.TL_starsGiftOption) arrayList42.get(i42)).store_product;
                                        arrayList62.add(obj3.a());
                                        i42++;
                                    }
                                    ci0.h().o(arrayList62, new bi0() {
                                        @Override
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList8 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    ArrayList arrayList7 = new ArrayList();
                                    for (int i5 = 0; i5 < arrayList42.size(); i5++) {
                                        ?? obj4 = new Object();
                                        obj4.b = "inapp";
                                        obj4.a = ((TL_stars.TL_starsGiveawayOption) arrayList42.get(i5)).store_product;
                                        arrayList7.add(obj4.a());
                                    }
                                    ci0.h().o(arrayList7, new bi0() {
                                        @Override
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList8 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption.currency = a2.c;
                                                                                tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                tL_starsGiveawayOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
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
                    };
                    if (!ci0.h().j()) {
                        ci0.h().i.add(runnable2);
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
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList9 = ((Vector) tLObject).objects;
                    int size3 = arrayList9.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj3 = arrayList9.get(i5);
                        i5++;
                        if (obj3 instanceof TL_stars.TL_starsGiveawayOption) {
                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                            arrayList7.add(tL_starsGiveawayOption);
                            if (tL_starsGiveawayOption.store_product != null && !w01.b()) {
                                arrayList8.add(tL_starsGiveawayOption);
                                tL_starsGiveawayOption.loadingStorePrice = true;
                            }
                        }
                    }
                    gtaVar.o = true;
                }
                gtaVar.p = arrayList7;
                gtaVar.n = false;
                kk7.f(gtaVar.a).k(222, new Object[0]);
                if (!arrayList8.isEmpty()) {
                    Runnable runnable3 = new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            final ArrayList arrayList42 = arrayList8;
                            final gta gtaVar2 = gtaVar;
                            int i42 = 0;
                            switch (b2) {
                                case 0:
                                    ArrayList arrayList52 = new ArrayList();
                                    while (i42 < arrayList42.size()) {
                                        ?? obj22 = new Object();
                                        obj22.b = "inapp";
                                        obj22.a = ((TL_stars.TL_starsTopupOption) arrayList42.get(i42)).store_product;
                                        arrayList52.add(obj22.a());
                                        i42++;
                                    }
                                    ci0.h().o(arrayList52, new bi0() {
                                        @Override
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                tL_starsGiveawayOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                tL_starsGiveawayOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList82 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList82;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                tL_starsGiveawayOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    while (i42 < arrayList42.size()) {
                                        ?? obj32 = new Object();
                                        obj32.b = "inapp";
                                        obj32.a = ((TL_stars.TL_starsGiftOption) arrayList42.get(i42)).store_product;
                                        arrayList62.add(obj32.a());
                                        i42++;
                                    }
                                    ci0.h().o(arrayList62, new bi0() {
                                        @Override
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                tL_starsGiveawayOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                tL_starsGiveawayOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList82 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList82;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i52 = fi0Var2.a;
                                                                    if (i52 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i52)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                tL_starsGiveawayOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    ArrayList arrayList72 = new ArrayList();
                                    for (int i52 = 0; i52 < arrayList42.size(); i52++) {
                                        ?? obj4 = new Object();
                                        obj4.b = "inapp";
                                        obj4.a = ((TL_stars.TL_starsGiveawayOption) arrayList42.get(i52)).store_product;
                                        arrayList72.add(obj4.a());
                                    }
                                    ci0.h().o(arrayList72, new bi0() {
                                        @Override
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i522 = fi0Var2.a;
                                                                    if (i522 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i522)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                tL_starsGiveawayOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList722 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList7222 = arrayList722;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i522 = fi0Var2.a;
                                                                    if (i522 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i522)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList7222.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList7222.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList7222.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList7222.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                tL_starsGiveawayOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList7222.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList7222.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList7222.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList82 = arrayList42;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList7222 = arrayList82;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i522 = fi0Var2.a;
                                                                    if (i522 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i522)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i6 = 0; i6 < list2.size(); i6++) {
                                                                            kl8 kl8Var = (kl8) list2.get(i6);
                                                                            int i7 = 0;
                                                                            while (true) {
                                                                                if (i7 < arrayList7222.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i7)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i7);
                                                                                    } else {
                                                                                        i7++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.m != null) {
                                                                        for (int i8 = 0; i8 < gtaVar42.m.size(); i8++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i8);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i9 = fi0Var2.a;
                                                                    if (i9 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i9)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                            kl8 kl8Var2 = (kl8) list2.get(i10);
                                                                            int i11 = 0;
                                                                            while (true) {
                                                                                if (i11 < arrayList7222.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList7222.get(i11)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList7222.get(i11);
                                                                                    } else {
                                                                                        i11++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (gtaVar42.p != null) {
                                                                        for (int i12 = 0; i12 < gtaVar42.p.size(); i12++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i12);
                                                                            if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                tL_starsGiveawayOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i13 = fi0Var2.a;
                                                                    if (i13 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i13)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i14 = 0;
                                                                        while (i14 < list2.size()) {
                                                                            kl8 kl8Var3 = (kl8) list2.get(i14);
                                                                            int i15 = 0;
                                                                            while (true) {
                                                                                if (i15 < arrayList7222.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList7222.get(i15)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList7222.get(i15);
                                                                                    } else {
                                                                                        i15++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = kl8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i14++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (gtaVar42.j != null) {
                                                                        for (int i16 = 0; i16 < gtaVar42.j.size(); i16++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i16);
                                                                            if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                tL_starsTopupOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    kk7.f(gtaVar42.a).k(220, new Object[0]);
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
                    };
                    if (!ci0.h().j()) {
                        ci0.h().i.add(runnable3);
                        return;
                    } else {
                        runnable3.run();
                        return;
                    }
                }
                return;
            default:
                na7.q1(gtaVar.a).R3((TLRPC.Updates) tLObject, false);
                return;
        }
    }
}
