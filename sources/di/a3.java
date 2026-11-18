package di;

import org.telegram.messenger.q10;
import org.telegram.messenger.ro;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a3 implements Runnable {
    public final int f8466a;
    public final long f8467b;
    public final Object f8468c;
    public final Object d;
    public final Object f8469e;
    public final Object f8470f;
    public final Object h;

    public a3(f6 f6Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j3) {
        this.f8466a = 0;
        this.d = f6Var;
        this.f8468c = tLObject;
        this.f8469e = str;
        this.f8470f = inputSavedStarGift;
        this.h = tL_error;
        this.f8467b = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.a3.run():void");
    }

    public a3(x8 x8Var, boolean[] zArr, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, q10 q10Var) {
        this.f8466a = 1;
        this.d = x8Var;
        this.f8469e = zArr;
        this.f8467b = j3;
        this.f8468c = tLObject;
        this.f8470f = tL_textWithEntities;
        this.h = q10Var;
    }

    public a3(Object obj, Object obj2, long j3, Object obj3, Object obj4, Object obj5, int i7) {
        this.f8466a = i7;
        this.d = obj;
        this.f8468c = obj2;
        this.f8467b = j3;
        this.f8469e = obj3;
        this.f8470f = obj4;
        this.h = obj5;
    }

    public a3(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        this.f8466a = 4;
        this.d = connectionsManager;
        this.f8469e = requestDelegate;
        this.f8468c = tLObject;
        this.h = tL_error;
        this.f8470f = requestDelegateTimestamp;
        this.f8467b = j3;
    }

    public a3(org.telegram.ui.ActionBar.h2 h2Var, TLObject tLObject, ro roVar, TLRPC.TL_error tL_error, Runnable runnable, long j3) {
        this.f8466a = 6;
        this.d = h2Var;
        this.f8468c = tLObject;
        this.f8469e = roVar;
        this.h = tL_error;
        this.f8470f = runnable;
        this.f8467b = j3;
    }
}
