package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b4 implements Runnable {
    public final int f1017a;
    public final long f1018b;
    public final Object f1019c;
    public final Object d;
    public final Object e;
    public final Object f1020f;
    public final Object h;

    public b4(k7 k7Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        this.f1017a = 0;
        this.d = k7Var;
        this.f1019c = tLObject;
        this.e = str;
        this.f1020f = inputSavedStarGift;
        this.h = tL_error;
        this.f1018b = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.b4.run():void");
    }

    public b4(fa faVar, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f1017a = 1;
        this.d = faVar;
        this.e = zArr;
        this.f1018b = j10;
        this.f1019c = tLObject;
        this.f1020f = tL_textWithEntities;
        this.h = callback2;
    }

    public b4(fa faVar, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, Utilities.Callback2 callback2) {
        this.f1017a = 2;
        this.d = faVar;
        this.f1019c = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f1020f = starGift;
        this.f1018b = j10;
        this.h = callback2;
    }

    public b4(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i10) {
        this.f1017a = i10;
        this.d = obj;
        this.f1019c = obj2;
        this.f1018b = j10;
        this.e = obj3;
        this.f1020f = obj4;
        this.h = obj5;
    }

    public b4(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.f1017a = 4;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.f1019c = tLObject;
        this.h = tL_error;
        this.f1020f = requestDelegateTimestamp;
        this.f1018b = j10;
    }

    public b4(org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, MessagesController.DialogFilter dialogFilter, TLRPC.TL_error tL_error, Runnable runnable, long j10) {
        this.f1017a = 6;
        this.d = n2Var;
        this.f1019c = tLObject;
        this.e = dialogFilter;
        this.h = tL_error;
        this.f1020f = runnable;
        this.f1018b = j10;
    }
}
