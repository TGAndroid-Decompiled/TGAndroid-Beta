package lh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class o2 implements Runnable {
    public final int f12853a;
    public final long f12854b;
    public final Object f12855c;
    public final Object d;
    public final Object e;
    public final Object f12856f;
    public final Object h;

    public o2(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i10) {
        this.f12853a = i10;
        this.d = obj;
        this.f12855c = obj2;
        this.f12854b = j10;
        this.e = obj3;
        this.f12856f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: lh.o2.run():void");
    }

    public o2(g5 g5Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        this.f12853a = 0;
        this.d = g5Var;
        this.f12855c = tLObject;
        this.e = str;
        this.f12856f = inputSavedStarGift;
        this.h = tL_error;
        this.f12854b = j10;
    }

    public o2(t7 t7Var, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f12853a = 1;
        this.d = t7Var;
        this.e = zArr;
        this.f12854b = j10;
        this.f12855c = tLObject;
        this.f12856f = tL_textWithEntities;
        this.h = callback2;
    }

    public o2(t7 t7Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, Utilities.Callback2 callback2) {
        this.f12853a = 2;
        this.d = t7Var;
        this.f12855c = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f12856f = starGift;
        this.f12854b = j10;
        this.h = callback2;
    }

    public o2(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.f12853a = 4;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.f12855c = tLObject;
        this.h = tL_error;
        this.f12856f = requestDelegateTimestamp;
        this.f12854b = j10;
    }

    public o2(org.telegram.ui.ActionBar.p2 p2Var, TLObject tLObject, MessagesController.DialogFilter dialogFilter, TLRPC.TL_error tL_error, Runnable runnable, long j10) {
        this.f12853a = 6;
        this.d = p2Var;
        this.f12855c = tLObject;
        this.e = dialogFilter;
        this.h = tL_error;
        this.f12856f = runnable;
        this.f12854b = j10;
    }
}
