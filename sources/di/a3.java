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
    public final int f8469a;
    public final long f8470b;
    public final Object f8471c;
    public final Object d;
    public final Object f8472e;
    public final Object f8473f;
    public final Object h;

    public a3(f6 f6Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j3) {
        this.f8469a = 0;
        this.d = f6Var;
        this.f8471c = tLObject;
        this.f8472e = str;
        this.f8473f = inputSavedStarGift;
        this.h = tL_error;
        this.f8470b = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.a3.run():void");
    }

    public a3(x8 x8Var, boolean[] zArr, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, q10 q10Var) {
        this.f8469a = 1;
        this.d = x8Var;
        this.f8472e = zArr;
        this.f8470b = j3;
        this.f8471c = tLObject;
        this.f8473f = tL_textWithEntities;
        this.h = q10Var;
    }

    public a3(Object obj, Object obj2, long j3, Object obj3, Object obj4, Object obj5, int i7) {
        this.f8469a = i7;
        this.d = obj;
        this.f8471c = obj2;
        this.f8470b = j3;
        this.f8472e = obj3;
        this.f8473f = obj4;
        this.h = obj5;
    }

    public a3(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        this.f8469a = 4;
        this.d = connectionsManager;
        this.f8472e = requestDelegate;
        this.f8471c = tLObject;
        this.h = tL_error;
        this.f8473f = requestDelegateTimestamp;
        this.f8470b = j3;
    }

    public a3(org.telegram.ui.ActionBar.h2 h2Var, TLObject tLObject, ro roVar, TLRPC.TL_error tL_error, Runnable runnable, long j3) {
        this.f8469a = 6;
        this.d = h2Var;
        this.f8471c = tLObject;
        this.f8472e = roVar;
        this.h = tL_error;
        this.f8473f = runnable;
        this.f8470b = j3;
    }
}
