package di;

import org.telegram.messenger.r10;
import org.telegram.messenger.so;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a3 implements Runnable {
    public final int f8461a;
    public final long f8462b;
    public final Object f8463c;
    public final Object d;
    public final Object f8464e;
    public final Object f8465f;
    public final Object h;

    public a3(f6 f6Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j3) {
        this.f8461a = 0;
        this.d = f6Var;
        this.f8463c = tLObject;
        this.f8464e = str;
        this.f8465f = inputSavedStarGift;
        this.h = tL_error;
        this.f8462b = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.a3.run():void");
    }

    public a3(y8 y8Var, boolean[] zArr, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, r10 r10Var) {
        this.f8461a = 1;
        this.d = y8Var;
        this.f8464e = zArr;
        this.f8462b = j3;
        this.f8463c = tLObject;
        this.f8465f = tL_textWithEntities;
        this.h = r10Var;
    }

    public a3(Object obj, Object obj2, long j3, Object obj3, Object obj4, Object obj5, int i7) {
        this.f8461a = i7;
        this.d = obj;
        this.f8463c = obj2;
        this.f8462b = j3;
        this.f8464e = obj3;
        this.f8465f = obj4;
        this.h = obj5;
    }

    public a3(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        this.f8461a = 4;
        this.d = connectionsManager;
        this.f8464e = requestDelegate;
        this.f8463c = tLObject;
        this.h = tL_error;
        this.f8465f = requestDelegateTimestamp;
        this.f8462b = j3;
    }

    public a3(org.telegram.ui.ActionBar.g2 g2Var, TLObject tLObject, so soVar, TLRPC.TL_error tL_error, Runnable runnable, long j3) {
        this.f8461a = 6;
        this.d = g2Var;
        this.f8463c = tLObject;
        this.f8464e = soVar;
        this.h = tL_error;
        this.f8465f = runnable;
        this.f8462b = j3;
    }
}
