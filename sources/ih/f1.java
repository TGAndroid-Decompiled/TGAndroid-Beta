package ih;

import android.content.Context;
import android.text.style.CharacterStyle;
import jh.s7;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.lm0;
import org.telegram.ui.n61;
import org.telegram.ui.tn;
import org.telegram.ui.vm0;
import org.telegram.ui.y21;
public final class f1 implements Runnable {
    public final int f9148a;
    public final Object f9149b;
    public final Object f9150c;
    public final Object d;
    public final Object f9151e;
    public final Object f9152f;
    public final Object h;

    public f1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f9148a = i10;
        this.d = obj;
        this.f9151e = obj2;
        this.f9149b = obj3;
        this.f9152f = obj4;
        this.h = obj5;
        this.f9150c = obj6;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ih.f1.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ih.f1.run():void");
    }

    public f1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10, boolean z10) {
        this.f9148a = i10;
        this.d = obj;
        this.f9149b = obj2;
        this.f9151e = obj3;
        this.f9152f = obj4;
        this.h = obj5;
        this.f9150c = obj6;
    }

    public f1(s7 s7Var, Object obj, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Utilities.Callback callback, int i10) {
        this.f9148a = i10;
        this.d = s7Var;
        this.f9151e = obj;
        this.f9149b = messageObject;
        this.f9152f = inputInvoice;
        this.f9150c = tL_payments_paymentFormStars;
        this.h = callback;
    }

    public f1(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f9148a = i10;
        this.f9149b = tLObject;
        this.d = obj;
        this.f9151e = obj2;
        this.f9152f = obj3;
        this.h = obj4;
        this.f9150c = obj5;
    }

    public f1(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.c6 c6Var, nh.d dVar, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f9148a = 13;
        this.f9150c = tL_error;
        this.d = context;
        this.f9151e = c6Var;
        this.f9149b = dVar;
        this.f9152f = f3Var;
        this.h = runnable;
    }

    public f1(tn tnVar, ye.c cVar, org.telegram.ui.Cells.s1 s1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.f9148a = 12;
        this.d = tnVar;
        this.f9151e = cVar;
        this.f9152f = s1Var;
        this.h = str;
        this.f9149b = tLObject;
        this.f9150c = characterStyle;
    }

    public f1(vm0 vm0Var, TLRPC.TL_error tL_error, String str, lm0 lm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.f9148a = 15;
        this.d = vm0Var;
        this.f9150c = tL_error;
        this.f9151e = str;
        this.f9152f = lm0Var;
        this.f9149b = tLObject;
        this.h = sendverifyphonecode;
    }

    public f1(y21 y21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.f9148a = 16;
        this.d = y21Var;
        this.f9149b = tLObject;
        this.f9151e = charSequence;
        this.f9150c = tL_error;
        this.f9152f = bArr;
        this.h = str;
    }

    public f1(n61 n61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f9148a = 18;
        this.d = n61Var;
        this.f9150c = tL_error;
        this.f9151e = inputCheckPasswordSRP;
        this.f9149b = user;
        this.f9152f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public f1(org.telegram.ui.web.z0 z0Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.f9148a = 19;
        this.d = z0Var;
        this.f9149b = tLObject;
        this.f9151e = tL_messages_requestUrlAuth;
        this.f9152f = str;
        this.f9150c = tL_error;
        this.h = str2;
    }

    public f1(rf.n0 n0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f9148a = 22;
        this.d = n0Var;
        this.f9151e = str;
        this.f9150c = tL_error;
        this.f9149b = tLObject;
        this.f9152f = messagesController;
        this.h = messagesStorage;
    }
}
