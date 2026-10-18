package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z3 implements Runnable {
    public final int f2526a;
    public final long f2527b;
    public final Object f2528c;
    public final Object d;
    public final Object e;
    public final Object f2529f;
    public final Object h;

    public z3(k7 k7Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        this.f2526a = 0;
        this.d = k7Var;
        this.f2528c = tLObject;
        this.e = str;
        this.f2529f = inputSavedStarGift;
        this.h = tL_error;
        this.f2527b = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.z3.run():void");
    }

    public z3(ga gaVar, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f2526a = 1;
        this.d = gaVar;
        this.e = zArr;
        this.f2527b = j10;
        this.f2528c = tLObject;
        this.f2529f = tL_textWithEntities;
        this.h = callback2;
    }

    public z3(ga gaVar, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, Utilities.Callback2 callback2) {
        this.f2526a = 2;
        this.d = gaVar;
        this.f2528c = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f2529f = starGift;
        this.f2527b = j10;
        this.h = callback2;
    }

    public z3(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i10) {
        this.f2526a = i10;
        this.d = obj;
        this.f2528c = obj2;
        this.f2527b = j10;
        this.e = obj3;
        this.f2529f = obj4;
        this.h = obj5;
    }

    public z3(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.f2526a = 4;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.f2528c = tLObject;
        this.h = tL_error;
        this.f2529f = requestDelegateTimestamp;
        this.f2527b = j10;
    }

    public z3(org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, MessagesController.DialogFilter dialogFilter, TLRPC.TL_error tL_error, Runnable runnable, long j10) {
        this.f2526a = 6;
        this.d = n2Var;
        this.f2528c = tLObject;
        this.e = dialogFilter;
        this.h = tL_error;
        this.f2529f = runnable;
        this.f2527b = j10;
    }
}
