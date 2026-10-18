package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a4 implements Runnable {
    public final int f955a;
    public final long f956b;
    public final Object f957c;
    public final Object d;
    public final Object e;
    public final Object f958f;
    public final Object h;

    public a4(k7 k7Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        this.f955a = 0;
        this.d = k7Var;
        this.f957c = tLObject;
        this.e = str;
        this.f958f = inputSavedStarGift;
        this.h = tL_error;
        this.f956b = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.a4.run():void");
    }

    public a4(ga gaVar, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f955a = 1;
        this.d = gaVar;
        this.e = zArr;
        this.f956b = j10;
        this.f957c = tLObject;
        this.f958f = tL_textWithEntities;
        this.h = callback2;
    }

    public a4(ga gaVar, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, Utilities.Callback2 callback2) {
        this.f955a = 2;
        this.d = gaVar;
        this.f957c = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f958f = starGift;
        this.f956b = j10;
        this.h = callback2;
    }

    public a4(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i10) {
        this.f955a = i10;
        this.d = obj;
        this.f957c = obj2;
        this.f956b = j10;
        this.e = obj3;
        this.f958f = obj4;
        this.h = obj5;
    }

    public a4(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.f955a = 4;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.f957c = tLObject;
        this.h = tL_error;
        this.f958f = requestDelegateTimestamp;
        this.f956b = j10;
    }

    public a4(org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, MessagesController.DialogFilter dialogFilter, TLRPC.TL_error tL_error, Runnable runnable, long j10) {
        this.f955a = 6;
        this.d = n2Var;
        this.f957c = tLObject;
        this.e = dialogFilter;
        this.h = tL_error;
        this.f958f = runnable;
        this.f956b = j10;
    }
}
