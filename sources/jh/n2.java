package jh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class n2 implements Runnable {
    public final int f12501a;
    public final long f12502b;
    public final Object f12503c;
    public final Object d;
    public final Object f12504e;
    public final Object f12505f;
    public final Object h;

    public n2(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i10) {
        this.f12501a = i10;
        this.d = obj;
        this.f12503c = obj2;
        this.f12502b = j10;
        this.f12504e = obj3;
        this.f12505f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: jh.n2.run():void");
    }

    public n2(h5 h5Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        this.f12501a = 0;
        this.d = h5Var;
        this.f12503c = tLObject;
        this.f12504e = str;
        this.f12505f = inputSavedStarGift;
        this.h = tL_error;
        this.f12502b = j10;
    }

    public n2(s7 s7Var, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f12501a = 1;
        this.d = s7Var;
        this.f12504e = zArr;
        this.f12502b = j10;
        this.f12503c = tLObject;
        this.f12505f = tL_textWithEntities;
        this.h = callback2;
    }

    public n2(s7 s7Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, Utilities.Callback2 callback2) {
        this.f12501a = 2;
        this.d = s7Var;
        this.f12503c = zArr;
        this.f12504e = tL_payments_paymentFormStarGift;
        this.f12505f = starGift;
        this.f12502b = j10;
        this.h = callback2;
    }

    public n2(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.f12501a = 4;
        this.d = connectionsManager;
        this.f12504e = requestDelegate;
        this.f12503c = tLObject;
        this.h = tL_error;
        this.f12505f = requestDelegateTimestamp;
        this.f12502b = j10;
    }

    public n2(org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, MessagesController.DialogFilter dialogFilter, TLRPC.TL_error tL_error, Runnable runnable, long j10) {
        this.f12501a = 6;
        this.d = o2Var;
        this.f12503c = tLObject;
        this.f12504e = dialogFilter;
        this.h = tL_error;
        this.f12505f = runnable;
        this.f12502b = j10;
    }
}
