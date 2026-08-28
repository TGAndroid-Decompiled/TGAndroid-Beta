package fh;

import android.content.Context;
import android.text.style.CharacterStyle;
import gh.v7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.l61;
import org.telegram.ui.nm0;
import org.telegram.ui.qn;
import org.telegram.ui.r21;
import org.telegram.ui.tk0;
import org.telegram.ui.wm0;
import org.telegram.ui.y21;
public final class k1 implements Runnable {
    public final int f6573a;
    public final Object f6574b;
    public final Object f6575c;
    public final Object d;
    public final Object f6576e;
    public final Object f6577f;
    public final Object h;

    public k1(v7 v7Var, Object obj, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Utilities.Callback callback, int i9) {
        this.f6573a = i9;
        this.d = v7Var;
        this.f6576e = obj;
        this.f6574b = messageObject;
        this.f6577f = inputInvoice;
        this.f6575c = tL_payments_paymentFormStars;
        this.h = callback;
    }

    private final void a() {
        Context context = (Context) this.d;
        org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f6576e;
        byte[] bArr = (byte[]) this.f6577f;
        jg0 jg0Var = (jg0) this.f6575c;
        y21 y21Var = new y21(context, b6Var, 0L, bArr);
        y21Var.N((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f6574b));
        y21Var.f44697s = new r21((org.telegram.ui.ActionBar.o2) this.h, context, b6Var, jg0Var);
        y21Var.show();
    }

    private final void b() {
        l61.Q((l61) this.d, (TLRPC.TL_error) this.f6575c, (TLRPC.InputCheckPasswordSRP) this.f6576e, (TLRPC.User) this.f6574b, (TwoStepVerificationActivity) this.f6577f, (TLRPC.TL_channels_editCreator) this.h);
    }

    private final void c() {
        org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.d;
        TLObject tLObject = (TLObject) this.f6574b;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f6576e;
        String str = (String) this.f6577f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f6575c;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.b6 b6Var = y0Var.f44077e;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                tk0.b(false, y0Var.I, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, y0Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                tk0.b(false, y0Var.I, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, y0Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                org.telegram.ui.Components.y4.p0(y0Var.getContext(), str, false, true, true, false, 0L, null, null, null);
            }
        } else if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                new oc(y0Var, b6Var).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str2), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, b6Var)), R.raw.error).j();
                return;
            }
            new oc(y0Var, b6Var).d0(tL_error, false);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: fh.k1.run():void");
    }

    public k1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i9) {
        this.f6573a = i9;
        this.d = obj;
        this.f6576e = obj2;
        this.f6574b = obj3;
        this.f6577f = obj4;
        this.h = obj5;
        this.f6575c = obj6;
    }

    public k1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i9, boolean z10) {
        this.f6573a = i9;
        this.d = obj;
        this.f6574b = obj2;
        this.f6576e = obj3;
        this.f6577f = obj4;
        this.h = obj5;
        this.f6575c = obj6;
    }

    public k1(of.x0 x0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f6573a = 11;
        this.d = x0Var;
        this.f6576e = str;
        this.f6575c = tL_error;
        this.f6574b = tLObject;
        this.f6577f = messagesController;
        this.h = messagesStorage;
    }

    public k1(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.f6573a = i9;
        this.f6574b = tLObject;
        this.d = obj;
        this.f6576e = obj2;
        this.f6577f = obj3;
        this.h = obj4;
        this.f6575c = obj5;
    }

    public k1(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.b6 b6Var, kh.d dVar, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f6573a = 15;
        this.f6575c = tL_error;
        this.d = context;
        this.f6576e = b6Var;
        this.f6574b = dVar;
        this.f6577f = f3Var;
        this.h = runnable;
    }

    public k1(qn qnVar, ve.d dVar, org.telegram.ui.Cells.t1 t1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.f6573a = 14;
        this.d = qnVar;
        this.f6576e = dVar;
        this.f6577f = t1Var;
        this.h = str;
        this.f6574b = tLObject;
        this.f6575c = characterStyle;
    }

    public k1(wm0 wm0Var, TLRPC.TL_error tL_error, String str, nm0 nm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.f6573a = 17;
        this.d = wm0Var;
        this.f6575c = tL_error;
        this.f6576e = str;
        this.f6577f = nm0Var;
        this.f6574b = tLObject;
        this.h = sendverifyphonecode;
    }

    public k1(y21 y21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.f6573a = 18;
        this.d = y21Var;
        this.f6574b = tLObject;
        this.f6576e = charSequence;
        this.f6575c = tL_error;
        this.f6577f = bArr;
        this.h = str;
    }

    public k1(l61 l61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f6573a = 20;
        this.d = l61Var;
        this.f6575c = tL_error;
        this.f6576e = inputCheckPasswordSRP;
        this.f6574b = user;
        this.f6577f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public k1(org.telegram.ui.web.y0 y0Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.f6573a = 21;
        this.d = y0Var;
        this.f6574b = tLObject;
        this.f6576e = tL_messages_requestUrlAuth;
        this.f6577f = str;
        this.f6575c = tL_error;
        this.h = str2;
    }
}
