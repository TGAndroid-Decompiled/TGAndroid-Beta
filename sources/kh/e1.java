package kh;

import android.content.Context;
import android.text.style.CharacterStyle;
import lh.t7;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b71;
import org.telegram.ui.dn0;
import org.telegram.ui.k31;
import org.telegram.ui.tm0;
import org.telegram.ui.xn;
public final class e1 implements Runnable {
    public final int f10552a;
    public final Object f10553b;
    public final Object f10554c;
    public final Object d;
    public final Object e;
    public final Object f10555f;
    public final Object h;

    public e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f10552a = i10;
        this.d = obj;
        this.e = obj2;
        this.f10553b = obj3;
        this.f10555f = obj4;
        this.h = obj5;
        this.f10554c = obj6;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: kh.e1.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: kh.e1.run():void");
    }

    public e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10, boolean z4) {
        this.f10552a = i10;
        this.d = obj;
        this.f10553b = obj2;
        this.e = obj3;
        this.f10555f = obj4;
        this.h = obj5;
        this.f10554c = obj6;
    }

    public e1(t7 t7Var, Object obj, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Utilities.Callback callback, int i10) {
        this.f10552a = i10;
        this.d = t7Var;
        this.e = obj;
        this.f10553b = messageObject;
        this.f10555f = inputInvoice;
        this.f10554c = tL_payments_paymentFormStars;
        this.h = callback;
    }

    public e1(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f10552a = i10;
        this.f10553b = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f10555f = obj3;
        this.h = obj4;
        this.f10554c = obj5;
    }

    public e1(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.f6 f6Var, ph.d dVar, org.telegram.ui.ActionBar.g3 g3Var, Runnable runnable) {
        this.f10552a = 12;
        this.f10554c = tL_error;
        this.d = context;
        this.e = f6Var;
        this.f10553b = dVar;
        this.f10555f = g3Var;
        this.h = runnable;
    }

    public e1(xn xnVar, af.f fVar, org.telegram.ui.Cells.t1 t1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.f10552a = 11;
        this.d = xnVar;
        this.e = fVar;
        this.f10555f = t1Var;
        this.h = str;
        this.f10553b = tLObject;
        this.f10554c = characterStyle;
    }

    public e1(dn0 dn0Var, TLRPC.TL_error tL_error, String str, tm0 tm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.f10552a = 14;
        this.d = dn0Var;
        this.f10554c = tL_error;
        this.e = str;
        this.f10555f = tm0Var;
        this.f10553b = tLObject;
        this.h = sendverifyphonecode;
    }

    public e1(k31 k31Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.f10552a = 15;
        this.d = k31Var;
        this.f10553b = tLObject;
        this.e = charSequence;
        this.f10554c = tL_error;
        this.f10555f = bArr;
        this.h = str;
    }

    public e1(b71 b71Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f10552a = 17;
        this.d = b71Var;
        this.f10554c = tL_error;
        this.e = inputCheckPasswordSRP;
        this.f10553b = user;
        this.f10555f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public e1(org.telegram.ui.web.a1 a1Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.f10552a = 18;
        this.d = a1Var;
        this.f10553b = tLObject;
        this.e = tL_messages_requestUrlAuth;
        this.f10555f = str;
        this.f10554c = tL_error;
        this.h = str2;
    }

    public e1(tf.m0 m0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f10552a = 22;
        this.d = m0Var;
        this.e = str;
        this.f10554c = tL_error;
        this.f10553b = tLObject;
        this.f10555f = messagesController;
        this.h = messagesStorage;
    }
}
