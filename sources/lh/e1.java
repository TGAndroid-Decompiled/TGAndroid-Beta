package lh;

import android.content.Context;
import android.text.style.CharacterStyle;
import mh.t7;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c71;
import org.telegram.ui.fn0;
import org.telegram.ui.m31;
import org.telegram.ui.vm0;
import org.telegram.ui.xn;
public final class e1 implements Runnable {
    public final int f12686a;
    public final Object f12687b;
    public final Object f12688c;
    public final Object d;
    public final Object f12689e;
    public final Object f12690f;
    public final Object h;

    public e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f12686a = i10;
        this.d = obj;
        this.f12689e = obj2;
        this.f12687b = obj3;
        this.f12690f = obj4;
        this.h = obj5;
        this.f12688c = obj6;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: lh.e1.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: lh.e1.run():void");
    }

    public e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10, boolean z4) {
        this.f12686a = i10;
        this.d = obj;
        this.f12687b = obj2;
        this.f12689e = obj3;
        this.f12690f = obj4;
        this.h = obj5;
        this.f12688c = obj6;
    }

    public e1(t7 t7Var, Object obj, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Utilities.Callback callback, int i10) {
        this.f12686a = i10;
        this.d = t7Var;
        this.f12689e = obj;
        this.f12687b = messageObject;
        this.f12690f = inputInvoice;
        this.f12688c = tL_payments_paymentFormStars;
        this.h = callback;
    }

    public e1(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f12686a = i10;
        this.f12687b = tLObject;
        this.d = obj;
        this.f12689e = obj2;
        this.f12690f = obj3;
        this.h = obj4;
        this.f12688c = obj5;
    }

    public e1(TLRPC.TL_error tL_error, Context context, g6 g6Var, qh.d dVar, org.telegram.ui.ActionBar.h3 h3Var, Runnable runnable) {
        this.f12686a = 12;
        this.f12688c = tL_error;
        this.d = context;
        this.f12689e = g6Var;
        this.f12687b = dVar;
        this.f12690f = h3Var;
        this.h = runnable;
    }

    public e1(xn xnVar, af.f fVar, org.telegram.ui.Cells.t1 t1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.f12686a = 11;
        this.d = xnVar;
        this.f12689e = fVar;
        this.f12690f = t1Var;
        this.h = str;
        this.f12687b = tLObject;
        this.f12688c = characterStyle;
    }

    public e1(fn0 fn0Var, TLRPC.TL_error tL_error, String str, vm0 vm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.f12686a = 14;
        this.d = fn0Var;
        this.f12688c = tL_error;
        this.f12689e = str;
        this.f12690f = vm0Var;
        this.f12687b = tLObject;
        this.h = sendverifyphonecode;
    }

    public e1(m31 m31Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.f12686a = 15;
        this.d = m31Var;
        this.f12687b = tLObject;
        this.f12689e = charSequence;
        this.f12688c = tL_error;
        this.f12690f = bArr;
        this.h = str;
    }

    public e1(c71 c71Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f12686a = 17;
        this.d = c71Var;
        this.f12688c = tL_error;
        this.f12689e = inputCheckPasswordSRP;
        this.f12687b = user;
        this.f12690f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public e1(org.telegram.ui.web.a1 a1Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.f12686a = 18;
        this.d = a1Var;
        this.f12687b = tLObject;
        this.f12689e = tL_messages_requestUrlAuth;
        this.f12690f = str;
        this.f12688c = tL_error;
        this.h = str2;
    }

    public e1(uf.m0 m0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f12686a = 22;
        this.d = m0Var;
        this.f12689e = str;
        this.f12688c = tL_error;
        this.f12687b = tLObject;
        this.f12690f = messagesController;
        this.h = messagesStorage;
    }
}
