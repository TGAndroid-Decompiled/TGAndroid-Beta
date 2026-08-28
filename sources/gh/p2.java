package gh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class p2 implements Runnable {
    public final int f8704a;
    public final long f8705b;
    public final Object f8706c;
    public final Object d;
    public final Object f8707e;
    public final Object f8708f;
    public final Object h;

    public p2(k5 k5Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        this.f8704a = 0;
        this.d = k5Var;
        this.f8706c = tLObject;
        this.f8707e = str;
        this.f8708f = inputSavedStarGift;
        this.h = tL_error;
        this.f8705b = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gh.p2.run():void");
    }

    public p2(v7 v7Var, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f8704a = 1;
        this.d = v7Var;
        this.f8707e = zArr;
        this.f8705b = j10;
        this.f8706c = tLObject;
        this.f8708f = tL_textWithEntities;
        this.h = callback2;
    }

    public p2(v7 v7Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, Utilities.Callback2 callback2) {
        this.f8704a = 2;
        this.d = v7Var;
        this.f8706c = zArr;
        this.f8707e = tL_payments_paymentFormStarGift;
        this.f8708f = starGift;
        this.f8705b = j10;
        this.h = callback2;
    }

    public p2(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i9) {
        this.f8704a = i9;
        this.d = obj;
        this.f8706c = obj2;
        this.f8705b = j10;
        this.f8707e = obj3;
        this.f8708f = obj4;
        this.h = obj5;
    }

    public p2(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.f8704a = 4;
        this.d = connectionsManager;
        this.f8707e = requestDelegate;
        this.f8706c = tLObject;
        this.h = tL_error;
        this.f8708f = requestDelegateTimestamp;
        this.f8705b = j10;
    }

    public p2(org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, MessagesController.DialogFilter dialogFilter, TLRPC.TL_error tL_error, Runnable runnable, long j10) {
        this.f8704a = 6;
        this.d = o2Var;
        this.f8706c = tLObject;
        this.f8707e = dialogFilter;
        this.h = tL_error;
        this.f8708f = runnable;
        this.f8705b = j10;
    }
}
