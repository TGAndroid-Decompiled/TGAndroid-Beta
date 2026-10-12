package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ha implements Runnable {
    public final int f1094a;
    public final Object f1095b;
    public final long f1096c;
    public final Object d;
    public final Object f1097e;
    public final Object f1098f;
    public final Object h;

    public ha(Object obj, Object obj2, long j3, Object obj3, Object obj4, Object obj5, int i10) {
        this.f1094a = i10;
        this.d = obj;
        this.f1095b = obj2;
        this.f1096c = j3;
        this.f1097e = obj3;
        this.f1098f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.ha.run():void");
    }

    public ha(Object obj, TLObject tLObject, Object obj2, TLObject tLObject2, Object obj3, long j3, int i10) {
        this.f1094a = i10;
        this.d = obj;
        this.f1095b = tLObject;
        this.f1097e = obj2;
        this.f1098f = tLObject2;
        this.h = obj3;
        this.f1096c = j3;
    }

    public ha(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        this.f1094a = 1;
        this.d = connectionsManager;
        this.f1097e = requestDelegate;
        this.f1095b = tLObject;
        this.f1098f = tL_error;
        this.h = requestDelegateTimestamp;
        this.f1096c = j3;
    }

    public ha(yh.n5 n5Var, boolean[] zArr, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f1094a = 5;
        this.d = n5Var;
        this.f1097e = zArr;
        this.f1096c = j3;
        this.f1095b = tLObject;
        this.f1098f = tL_textWithEntities;
        this.h = callback2;
    }

    public ha(yh.n5 n5Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, Utilities.Callback2 callback2) {
        this.f1094a = 6;
        this.d = n5Var;
        this.f1095b = zArr;
        this.f1097e = tL_payments_paymentFormStarGift;
        this.f1098f = starGift;
        this.f1096c = j3;
        this.h = callback2;
    }
}
