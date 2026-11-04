package ci;

import org.telegram.messenger.mo;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z2 implements Runnable {
    public final int f6444a;
    public final long f6445b;
    public final Object f6446c;
    public final Object d;
    public final Object f6447e;
    public final Object f6448f;
    public final Object h;

    public z2(l6 l6Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        this.f6444a = 0;
        this.d = l6Var;
        this.f6446c = tLObject;
        this.f6447e = str;
        this.f6448f = inputSavedStarGift;
        this.h = tL_error;
        this.f6445b = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.z2.run():void");
    }

    public z2(e9 e9Var, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, n10 n10Var) {
        this.f6444a = 1;
        this.d = e9Var;
        this.f6447e = zArr;
        this.f6445b = j10;
        this.f6446c = tLObject;
        this.f6448f = tL_textWithEntities;
        this.h = n10Var;
    }

    public z2(e9 e9Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, n10 n10Var) {
        this.f6444a = 2;
        this.d = e9Var;
        this.f6446c = zArr;
        this.f6447e = tL_payments_paymentFormStarGift;
        this.f6448f = starGift;
        this.f6445b = j10;
        this.h = n10Var;
    }

    public z2(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i3) {
        this.f6444a = i3;
        this.d = obj;
        this.f6446c = obj2;
        this.f6445b = j10;
        this.f6447e = obj3;
        this.f6448f = obj4;
        this.h = obj5;
    }

    public z2(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.f6444a = 5;
        this.d = connectionsManager;
        this.f6447e = requestDelegate;
        this.f6446c = tLObject;
        this.h = tL_error;
        this.f6448f = requestDelegateTimestamp;
        this.f6445b = j10;
    }

    public z2(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, mo moVar, TLRPC.TL_error tL_error, Runnable runnable, long j10) {
        this.f6444a = 7;
        this.d = d2Var;
        this.f6446c = tLObject;
        this.f6447e = moVar;
        this.h = tL_error;
        this.f6448f = runnable;
        this.f6445b = j10;
    }
}
