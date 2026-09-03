package mh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class n2 implements Runnable {
    public final int f14468a;
    public final long f14469b;
    public final Object f14470c;
    public final Object d;
    public final Object f14471e;
    public final Object f14472f;
    public final Object h;

    public n2(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i10) {
        this.f14468a = i10;
        this.d = obj;
        this.f14470c = obj2;
        this.f14469b = j10;
        this.f14471e = obj3;
        this.f14472f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: mh.n2.run():void");
    }

    public n2(g5 g5Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        this.f14468a = 0;
        this.d = g5Var;
        this.f14470c = tLObject;
        this.f14471e = str;
        this.f14472f = inputSavedStarGift;
        this.h = tL_error;
        this.f14469b = j10;
    }

    public n2(t7 t7Var, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f14468a = 1;
        this.d = t7Var;
        this.f14471e = zArr;
        this.f14469b = j10;
        this.f14470c = tLObject;
        this.f14472f = tL_textWithEntities;
        this.h = callback2;
    }

    public n2(t7 t7Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, Utilities.Callback2 callback2) {
        this.f14468a = 2;
        this.d = t7Var;
        this.f14470c = zArr;
        this.f14471e = tL_payments_paymentFormStarGift;
        this.f14472f = starGift;
        this.f14469b = j10;
        this.h = callback2;
    }

    public n2(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.f14468a = 4;
        this.d = connectionsManager;
        this.f14471e = requestDelegate;
        this.f14470c = tLObject;
        this.h = tL_error;
        this.f14472f = requestDelegateTimestamp;
        this.f14469b = j10;
    }

    public n2(org.telegram.ui.ActionBar.p2 p2Var, TLObject tLObject, MessagesController.DialogFilter dialogFilter, TLRPC.TL_error tL_error, Runnable runnable, long j10) {
        this.f14468a = 6;
        this.d = p2Var;
        this.f14470c = tLObject;
        this.f14471e = dialogFilter;
        this.h = tL_error;
        this.f14472f = runnable;
        this.f14469b = j10;
    }
}
