package di;

import org.telegram.messenger.p10;
import org.telegram.messenger.ro;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a3 implements Runnable {
    public final int f8460a;
    public final long f8461b;
    public final Object f8462c;
    public final Object d;
    public final Object f8463e;
    public final Object f8464f;
    public final Object h;

    public a3(f6 f6Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j3) {
        this.f8460a = 0;
        this.d = f6Var;
        this.f8462c = tLObject;
        this.f8463e = str;
        this.f8464f = inputSavedStarGift;
        this.h = tL_error;
        this.f8461b = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.a3.run():void");
    }

    public a3(y8 y8Var, boolean[] zArr, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, p10 p10Var) {
        this.f8460a = 1;
        this.d = y8Var;
        this.f8463e = zArr;
        this.f8461b = j3;
        this.f8462c = tLObject;
        this.f8464f = tL_textWithEntities;
        this.h = p10Var;
    }

    public a3(Object obj, Object obj2, long j3, Object obj3, Object obj4, Object obj5, int i7) {
        this.f8460a = i7;
        this.d = obj;
        this.f8462c = obj2;
        this.f8461b = j3;
        this.f8463e = obj3;
        this.f8464f = obj4;
        this.h = obj5;
    }

    public a3(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        this.f8460a = 4;
        this.d = connectionsManager;
        this.f8463e = requestDelegate;
        this.f8462c = tLObject;
        this.h = tL_error;
        this.f8464f = requestDelegateTimestamp;
        this.f8461b = j3;
    }

    public a3(org.telegram.ui.ActionBar.g2 g2Var, TLObject tLObject, ro roVar, TLRPC.TL_error tL_error, Runnable runnable, long j3) {
        this.f8460a = 6;
        this.d = g2Var;
        this.f8462c = tLObject;
        this.f8463e = roVar;
        this.h = tL_error;
        this.f8464f = runnable;
        this.f8461b = j3;
    }
}
