package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
public final class ova implements Runnable {
    public final byte a;
    public final jxa b;
    public final TLObject c;

    public ova(jxa jxaVar, TLObject tLObject, byte b) {
        this.a = b;
        this.b = jxaVar;
        this.c = tLObject;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = true;
        TLObject tLObject = this.c;
        final jxa jxaVar = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList3 = ((Vector) tLObject).objects;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList3.get(i);
                        i++;
                        if (obj instanceof TL_stars.TL_starsGiveawayOption) {
                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj;
                            arrayList.add(tL_starsGiveawayOption);
                            if (tL_starsGiveawayOption.store_product != null && !f11.b()) {
                                arrayList2.add(tL_starsGiveawayOption);
                                tL_starsGiveawayOption.loadingStorePrice = true;
                            }
                        }
                    }
                    jxaVar.o = true;
                }
                jxaVar.p = arrayList;
                jxaVar.n = false;
                jn7.f(jxaVar.a).k(223, new Object[0]);
                if (!arrayList2.isEmpty()) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            final ArrayList arrayList4 = arrayList2;
                            final jxa jxaVar2 = jxaVar;
                            int i2 = 0;
                            switch (b2) {
                                case 0:
                                    ArrayList arrayList5 = new ArrayList();
                                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                                        ?? obj2 = new Object();
                                        obj2.b = "inapp";
                                        obj2.a = ((TL_stars.TL_starsGiveawayOption) arrayList4.get(i3)).store_product;
                                        arrayList5.add(obj2.a());
                                    }
                                    di0.h().o(arrayList5, new ci0() {
                                        @Override
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList6 = arrayList4;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList7 = arrayList6;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar4 = jxaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList7.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList7.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList7.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar4.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar4.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar4.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar4.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList7.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList7.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList7.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar4.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar4.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar4.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar4.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList7.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList7.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList7.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar4.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar4.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar4.j.get(i15);
                                                                            if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                tL_starsTopupOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar4.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList7 = arrayList4;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList7;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                tL_starsTopupOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList8 = arrayList4;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList8;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                tL_starsTopupOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
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
                                    while (i2 < arrayList4.size()) {
                                        ?? obj3 = new Object();
                                        obj3.b = "inapp";
                                        obj3.a = ((TL_stars.TL_starsTopupOption) arrayList4.get(i2)).store_product;
                                        arrayList6.add(obj3.a());
                                        i2++;
                                    }
                                    di0.h().o(arrayList6, new ci0() {
                                        @Override
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList62 = arrayList4;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList62;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                tL_starsTopupOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList7 = arrayList4;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList7;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                tL_starsTopupOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList8 = arrayList4;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList8;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                tL_starsTopupOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
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
                                    while (i2 < arrayList4.size()) {
                                        ?? obj4 = new Object();
                                        obj4.b = "inapp";
                                        obj4.a = ((TL_stars.TL_starsGiftOption) arrayList4.get(i2)).store_product;
                                        arrayList7.add(obj4.a());
                                        i2++;
                                    }
                                    di0.h().o(arrayList7, new ci0() {
                                        @Override
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList62 = arrayList4;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList62;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList72.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                tL_starsTopupOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList72 = arrayList4;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                tL_starsTopupOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList8 = arrayList4;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                tL_starsTopupOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
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
                    if (!di0.h().j()) {
                        di0.h().i.add(runnable);
                        return;
                    } else {
                        runnable.run();
                        return;
                    }
                }
                return;
            case 1:
                int i2 = jxaVar.a;
                jxaVar.x = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    uc7.s1(i2).j4(starsStatus.users, false);
                    uc7.s1(i2).c4(starsStatus.chats, false);
                    jxaVar.v.addAll(starsStatus.subscriptions);
                    if ((starsStatus.flags & 4) != 0) {
                        z = false;
                    }
                    jxaVar.y = z;
                    jxaVar.w = starsStatus.subscriptions_next_offset;
                    jxaVar.j0(starsStatus.balance);
                    jn7.f(i2).k(226, new Object[0]);
                    return;
                }
                return;
            case 2:
                ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList6 = ((Vector) tLObject).objects;
                    int size2 = arrayList6.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj2 = arrayList6.get(i3);
                        i3++;
                        if (obj2 instanceof TL_stars.TL_starsTopupOption) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj2;
                            arrayList4.add(tL_starsTopupOption);
                            if (tL_starsTopupOption.store_product != null && !f11.b()) {
                                arrayList5.add(tL_starsTopupOption);
                                tL_starsTopupOption.loadingStorePrice = true;
                            }
                        }
                    }
                    jxaVar.i = true;
                }
                jxaVar.j = arrayList4;
                jxaVar.h = false;
                jn7.f(jxaVar.a).k(221, new Object[0]);
                if (!arrayList5.isEmpty()) {
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            final ArrayList arrayList42 = arrayList5;
                            final jxa jxaVar2 = jxaVar;
                            int i22 = 0;
                            switch (b2) {
                                case 0:
                                    ArrayList arrayList52 = new ArrayList();
                                    for (int i32 = 0; i32 < arrayList42.size(); i32++) {
                                        ?? obj22 = new Object();
                                        obj22.b = "inapp";
                                        obj22.a = ((TL_stars.TL_starsGiveawayOption) arrayList42.get(i32)).store_product;
                                        arrayList52.add(obj22.a());
                                    }
                                    di0.h().o(arrayList52, new ci0() {
                                        @Override
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList62 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList62;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList8 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
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
                                    while (i22 < arrayList42.size()) {
                                        ?? obj3 = new Object();
                                        obj3.b = "inapp";
                                        obj3.a = ((TL_stars.TL_starsTopupOption) arrayList42.get(i22)).store_product;
                                        arrayList62.add(obj3.a());
                                        i22++;
                                    }
                                    di0.h().o(arrayList62, new ci0() {
                                        @Override
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList8 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
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
                                    while (i22 < arrayList42.size()) {
                                        ?? obj4 = new Object();
                                        obj4.b = "inapp";
                                        obj4.a = ((TL_stars.TL_starsGiftOption) arrayList42.get(i22)).store_product;
                                        arrayList7.add(obj4.a());
                                        i22++;
                                    }
                                    di0.h().o(arrayList7, new ci0() {
                                        @Override
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList8 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i4 = gi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i4)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i5);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption.currency = a.c;
                                                                                tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                tL_starsGiftOption2.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
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
                    if (!di0.h().j()) {
                        di0.h().i.add(runnable2);
                        return;
                    } else {
                        runnable2.run();
                        return;
                    }
                }
                return;
            case 3:
                int i4 = jxaVar.a;
                jxaVar.A = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject;
                    uc7.s1(i4).j4(starsStatus2.users, false);
                    uc7.s1(i4).c4(starsStatus2.chats, false);
                    jxaVar.z.addAll(starsStatus2.subscriptions);
                    jxaVar.j0(starsStatus2.balance);
                    jn7.f(i4).k(226, new Object[0]);
                    return;
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
                        if (obj3 instanceof TL_stars.TL_starsGiftOption) {
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj3;
                            arrayList7.add(tL_starsGiftOption);
                            if (tL_starsGiftOption.store_product != null && !f11.b()) {
                                arrayList8.add(tL_starsGiftOption);
                                tL_starsGiftOption.loadingStorePrice = true;
                            }
                        }
                    }
                    jxaVar.l = true;
                }
                jxaVar.m = arrayList7;
                jxaVar.k = false;
                jn7.f(jxaVar.a).k(222, new Object[0]);
                if (!arrayList8.isEmpty()) {
                    Runnable runnable3 = new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            final ArrayList arrayList42 = arrayList8;
                            final jxa jxaVar2 = jxaVar;
                            int i22 = 0;
                            switch (b2) {
                                case 0:
                                    ArrayList arrayList52 = new ArrayList();
                                    for (int i32 = 0; i32 < arrayList42.size(); i32++) {
                                        ?? obj22 = new Object();
                                        obj22.b = "inapp";
                                        obj22.a = ((TL_stars.TL_starsGiveawayOption) arrayList42.get(i32)).store_product;
                                        arrayList52.add(obj22.a());
                                    }
                                    di0.h().o(arrayList52, new ci0() {
                                        @Override
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i42 = gi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i42)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i52);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i42 = gi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i42)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i52);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList82 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList82;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i42 = gi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i42)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i52);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
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
                                    while (i22 < arrayList42.size()) {
                                        ?? obj32 = new Object();
                                        obj32.b = "inapp";
                                        obj32.a = ((TL_stars.TL_starsTopupOption) arrayList42.get(i22)).store_product;
                                        arrayList62.add(obj32.a());
                                        i22++;
                                    }
                                    di0.h().o(arrayList62, new ci0() {
                                        @Override
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i42 = gi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i42)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i52);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i42 = gi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i42)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i52);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList82 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList82;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i42 = gi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i42)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i52);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
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
                                    while (i22 < arrayList42.size()) {
                                        ?? obj4 = new Object();
                                        obj4.b = "inapp";
                                        obj4.a = ((TL_stars.TL_starsGiftOption) arrayList42.get(i22)).store_product;
                                        arrayList72.add(obj4.a());
                                        i22++;
                                    }
                                    di0.h().o(arrayList72, new ci0() {
                                        @Override
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (r3) {
                                                case 0:
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar3;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i42 = gi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i42)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i52);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList722.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                case 1:
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList722 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList7222 = arrayList722;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i42 = gi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i42)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i52);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList7222.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList7222.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList7222.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList7222.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList7222.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList7222.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList7222.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                default:
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList82 = arrayList42;
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b3 = r5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList7222 = arrayList82;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b3) {
                                                                case 0:
                                                                    int i42 = gi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i42)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                            wo8 wo8Var = (wo8) list2.get(i52);
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 < arrayList7222.size()) {
                                                                                    if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i6)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiftOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                tL_starsGiftOption2.currency = a.c;
                                                                                tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                tL_starsGiftOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.m != null) {
                                                                        for (int i7 = 0; i7 < jxaVar42.m.size(); i7++) {
                                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i7);
                                                                            if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                tL_starsGiftOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(222, new Object[0]);
                                                                    return;
                                                                case 1:
                                                                    int i8 = gi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i8)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                            wo8 wo8Var2 = (wo8) list2.get(i9);
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                if (i10 < arrayList7222.size()) {
                                                                                    if (((TL_stars.TL_starsGiveawayOption) arrayList7222.get(i10)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList7222.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsGiveawayOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                tL_starsGiveawayOption2.currency = a2.c;
                                                                                tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (jxaVar42.p != null) {
                                                                        for (int i11 = 0; i11 < jxaVar42.p.size(); i11++) {
                                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i11);
                                                                            if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                tL_starsGiveawayOption3.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(223, new Object[0]);
                                                                    return;
                                                                default:
                                                                    int i12 = gi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i12)));
                                                                        return;
                                                                    }
                                                                    if (list2 != null) {
                                                                        int i13 = 0;
                                                                        while (i13 < list2.size()) {
                                                                            wo8 wo8Var3 = (wo8) list2.get(i13);
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 < arrayList7222.size()) {
                                                                                    if (((TL_stars.TL_starsTopupOption) arrayList7222.get(i14)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList7222.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                } else {
                                                                                    tL_starsTopupOption2 = null;
                                                                                }
                                                                            }
                                                                            if (tL_starsTopupOption2 != null && (a3 = wo8Var3.a()) != null) {
                                                                                tL_starsTopupOption2.currency = a3.c;
                                                                                d = d2;
                                                                                tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                tL_starsTopupOption2.loadingStorePrice = false;
                                                                            } else {
                                                                                d = d2;
                                                                            }
                                                                            i13++;
                                                                            d2 = d;
                                                                        }
                                                                    }
                                                                    if (jxaVar42.j != null) {
                                                                        for (int i15 = 0; i15 < jxaVar42.j.size(); i15++) {
                                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i15);
                                                                            if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                tL_starsTopupOption22.missingStorePrice = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    jn7.f(jxaVar42.a).k(221, new Object[0]);
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
                    if (!di0.h().j()) {
                        di0.h().i.add(runnable3);
                        return;
                    } else {
                        runnable3.run();
                        return;
                    }
                }
                return;
            default:
                uc7.s1(jxaVar.a).Y3((TLRPC.Updates) tLObject, false);
                return;
        }
    }
}
