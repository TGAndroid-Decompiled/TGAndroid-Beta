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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fn0;
import org.telegram.ui.i71;
import org.telegram.ui.q31;
import org.telegram.ui.vm0;
import org.telegram.ui.zn;
public final class e1 implements Runnable {
    public final int f10682a;
    public final Object f10683b;
    public final Object f10684c;
    public final Object d;
    public final Object e;
    public final Object f10685f;
    public final Object h;

    public e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f10682a = i10;
        this.d = obj;
        this.e = obj2;
        this.f10683b = obj3;
        this.f10685f = obj4;
        this.h = obj5;
        this.f10684c = obj6;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: kh.e1.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: kh.e1.run():void");
    }

    public e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10, boolean z4) {
        this.f10682a = i10;
        this.d = obj;
        this.f10683b = obj2;
        this.e = obj3;
        this.f10685f = obj4;
        this.h = obj5;
        this.f10684c = obj6;
    }

    public e1(t7 t7Var, Object obj, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Utilities.Callback callback, int i10) {
        this.f10682a = i10;
        this.d = t7Var;
        this.e = obj;
        this.f10683b = messageObject;
        this.f10685f = inputInvoice;
        this.f10684c = tL_payments_paymentFormStars;
        this.h = callback;
    }

    public e1(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f10682a = i10;
        this.f10683b = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f10685f = obj3;
        this.h = obj4;
        this.f10684c = obj5;
    }

    public e1(TLRPC.TL_error tL_error, Context context, f6 f6Var, ph.d dVar, org.telegram.ui.ActionBar.g3 g3Var, Runnable runnable) {
        this.f10682a = 12;
        this.f10684c = tL_error;
        this.d = context;
        this.e = f6Var;
        this.f10683b = dVar;
        this.f10685f = g3Var;
        this.h = runnable;
    }

    public e1(zn znVar, ze.c cVar, org.telegram.ui.Cells.s1 s1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.f10682a = 11;
        this.d = znVar;
        this.e = cVar;
        this.f10685f = s1Var;
        this.h = str;
        this.f10683b = tLObject;
        this.f10684c = characterStyle;
    }

    public e1(fn0 fn0Var, TLRPC.TL_error tL_error, String str, vm0 vm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.f10682a = 14;
        this.d = fn0Var;
        this.f10684c = tL_error;
        this.e = str;
        this.f10685f = vm0Var;
        this.f10683b = tLObject;
        this.h = sendverifyphonecode;
    }

    public e1(q31 q31Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.f10682a = 15;
        this.d = q31Var;
        this.f10683b = tLObject;
        this.e = charSequence;
        this.f10684c = tL_error;
        this.f10685f = bArr;
        this.h = str;
    }

    public e1(i71 i71Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f10682a = 17;
        this.d = i71Var;
        this.f10684c = tL_error;
        this.e = inputCheckPasswordSRP;
        this.f10683b = user;
        this.f10685f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public e1(org.telegram.ui.web.c1 c1Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.f10682a = 18;
        this.d = c1Var;
        this.f10683b = tLObject;
        this.e = tL_messages_requestUrlAuth;
        this.f10685f = str;
        this.f10684c = tL_error;
        this.h = str2;
    }

    public e1(tf.m0 m0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f10682a = 22;
        this.d = m0Var;
        this.e = str;
        this.f10684c = tL_error;
        this.f10683b = tLObject;
        this.f10685f = messagesController;
        this.h = messagesStorage;
    }
}
