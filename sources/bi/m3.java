package bi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class m3 implements Runnable {
    public final int f5075a;
    public final long f5076b;
    public final Object f5077c;
    public final Object d;
    public final Object e;
    public final Object f5078f;
    public final Object h;

    public m3(h7 h7Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        this.f5075a = 0;
        this.d = h7Var;
        this.f5077c = tLObject;
        this.e = str;
        this.f5078f = inputSavedStarGift;
        this.h = tL_error;
        this.f5076b = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.m3.run():void");
    }

    public m3(ca caVar, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f5075a = 1;
        this.d = caVar;
        this.e = zArr;
        this.f5076b = j10;
        this.f5077c = tLObject;
        this.f5078f = tL_textWithEntities;
        this.h = callback2;
    }

    public m3(ca caVar, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, Utilities.Callback2 callback2) {
        this.f5075a = 2;
        this.d = caVar;
        this.f5077c = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f5078f = starGift;
        this.f5076b = j10;
        this.h = callback2;
    }

    public m3(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i10) {
        this.f5075a = i10;
        this.d = obj;
        this.f5077c = obj2;
        this.f5076b = j10;
        this.e = obj3;
        this.f5078f = obj4;
        this.h = obj5;
    }

    public m3(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.f5075a = 4;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.f5077c = tLObject;
        this.h = tL_error;
        this.f5078f = requestDelegateTimestamp;
        this.f5076b = j10;
    }

    public m3(org.telegram.ui.ActionBar.r2 r2Var, TLObject tLObject, MessagesController.DialogFilter dialogFilter, TLRPC.TL_error tL_error, Runnable runnable, long j10) {
        this.f5075a = 6;
        this.d = r2Var;
        this.f5077c = tLObject;
        this.e = dialogFilter;
        this.h = tL_error;
        this.f5078f = runnable;
        this.f5076b = j10;
    }
}
