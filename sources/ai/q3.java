package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q3 implements Runnable {
    public final int f2052a;
    public final Object f2053b;
    public final Object f2054c;
    public final long d;
    public final Object e;
    public final Object f2055f;
    public final Object h;

    public q3(k7 k7Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        this.f2052a = 0;
        this.f2053b = k7Var;
        this.f2054c = tLObject;
        this.f2055f = str;
        this.h = inputSavedStarGift;
        this.e = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.q3.run():void");
    }

    public q3(k7 k7Var, pf.c cVar, TLObject tLObject, long j10, TLRPC.Document document, TLRPC.TL_error tL_error) {
        this.f2052a = 1;
        this.f2053b = k7Var;
        this.f2055f = cVar;
        this.f2054c = tLObject;
        this.d = j10;
        this.h = document;
        this.e = tL_error;
    }

    public q3(ga gaVar, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f2052a = 2;
        this.f2053b = gaVar;
        this.f2055f = zArr;
        this.d = j10;
        this.f2054c = tLObject;
        this.h = tL_textWithEntities;
        this.e = callback2;
    }

    public q3(ga gaVar, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, Utilities.Callback2 callback2) {
        this.f2052a = 3;
        this.f2053b = gaVar;
        this.f2054c = zArr;
        this.f2055f = tL_payments_paymentFormStarGift;
        this.h = starGift;
        this.d = j10;
        this.e = callback2;
    }

    public q3(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i10) {
        this.f2052a = i10;
        this.f2053b = obj;
        this.f2054c = obj2;
        this.d = j10;
        this.f2055f = obj3;
        this.h = obj4;
        this.e = obj5;
    }

    public q3(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.f2052a = 5;
        this.f2053b = connectionsManager;
        this.f2055f = requestDelegate;
        this.f2054c = tLObject;
        this.e = tL_error;
        this.h = requestDelegateTimestamp;
        this.d = j10;
    }

    public q3(org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, MessagesController.DialogFilter dialogFilter, TLRPC.TL_error tL_error, Runnable runnable, long j10) {
        this.f2052a = 7;
        this.f2053b = n2Var;
        this.f2054c = tLObject;
        this.f2055f = dialogFilter;
        this.e = tL_error;
        this.h = runnable;
        this.d = j10;
    }
}
