package bi;

import org.telegram.messenger.v10;
import org.telegram.messenger.vo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class m3 implements Runnable {
    public final int f4312a;
    public final long f4313b;
    public final Object f4314c;
    public final Object d;
    public final Object f4315e;
    public final Object f4316f;
    public final Object h;

    public m3(k7 k7Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j3) {
        this.f4312a = 0;
        this.d = k7Var;
        this.f4314c = tLObject;
        this.f4315e = str;
        this.f4316f = inputSavedStarGift;
        this.h = tL_error;
        this.f4313b = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.m3.run():void");
    }

    public m3(ea eaVar, boolean[] zArr, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, v10 v10Var) {
        this.f4312a = 1;
        this.d = eaVar;
        this.f4315e = zArr;
        this.f4313b = j3;
        this.f4314c = tLObject;
        this.f4316f = tL_textWithEntities;
        this.h = v10Var;
    }

    public m3(ea eaVar, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, v10 v10Var) {
        this.f4312a = 2;
        this.d = eaVar;
        this.f4314c = zArr;
        this.f4315e = tL_payments_paymentFormStarGift;
        this.f4316f = starGift;
        this.f4313b = j3;
        this.h = v10Var;
    }

    public m3(Object obj, Object obj2, long j3, Object obj3, Object obj4, Object obj5, int i7) {
        this.f4312a = i7;
        this.d = obj;
        this.f4314c = obj2;
        this.f4313b = j3;
        this.f4315e = obj3;
        this.f4316f = obj4;
        this.h = obj5;
    }

    public m3(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        this.f4312a = 5;
        this.d = connectionsManager;
        this.f4315e = requestDelegate;
        this.f4314c = tLObject;
        this.h = tL_error;
        this.f4316f = requestDelegateTimestamp;
        this.f4313b = j3;
    }

    public m3(org.telegram.ui.ActionBar.f2 f2Var, TLObject tLObject, vo voVar, TLRPC.TL_error tL_error, Runnable runnable, long j3) {
        this.f4312a = 7;
        this.d = f2Var;
        this.f4314c = tLObject;
        this.f4315e = voVar;
        this.h = tL_error;
        this.f4316f = runnable;
        this.f4313b = j3;
    }
}
