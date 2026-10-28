package bi;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.io.File;
import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.an0;
import org.telegram.ui.fl0;
import org.telegram.ui.hi1;
import org.telegram.ui.kn0;
import org.telegram.ui.p61;
import org.telegram.ui.wn;
import org.telegram.ui.x21;
public final class c3 implements Runnable {
    public final int f4421a;
    public final Object f4422b;
    public final Object f4423c;
    public final Object d;
    public final Object e;
    public final Object f4424f;
    public final Object h;

    public c3(ig.a1 a1Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f4421a = 10;
        this.f4422b = a1Var;
        this.e = str;
        this.d = tL_error;
        this.f4423c = tLObject;
        this.f4424f = messagesController;
        this.h = messagesStorage;
    }

    private final void a() {
        p61.R((p61) this.f4422b, (TLRPC.TL_error) this.d, (TLRPC.InputCheckPasswordSRP) this.f4423c, (TLRPC.User) this.e, (TwoStepVerificationActivity) this.f4424f, (TLRPC.TL_channels_editCreator) this.h);
    }

    private final void b() {
        byte[] bArr = (byte[]) this.e;
        org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.f4424f;
        byte[] bArr2 = b2Var.f36414b;
        org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.h;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
        org.telegram.ui.Wallet.l0 l0Var = ((org.telegram.ui.Wallet.e2) this.f4422b).f36514b;
        if (TextUtils.equals((String) this.f4423c, l0Var.t()) && Arrays.equals(bArr, l0Var.y())) {
            TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
            inputtonconnectoauthsession.session_id = tonconnectsession.f22291id;
            inputtonconnectoauthsession.challenge_answer = bArr2;
            inputtonconnectoauthsession.body = b2Var.f36415c;
            inputtonconnectoauthsession.proof = b2Var.d;
            r1Var.run(inputtonconnectoauthsession, null);
            return;
        }
        Arrays.fill(bArr2, (byte) 0);
        r1Var.run(null, "Wallet changed. Open the request again.");
    }

    private final void c() {
        org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.f4422b;
        byte[] bArr = (byte[]) this.e;
        org.telegram.ui.Wallet.s sVar = (org.telegram.ui.Wallet.s) this.f4424f;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
        org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.d;
        org.telegram.ui.Wallet.l0 l0Var = e2Var.f36514b;
        if (TextUtils.equals((String) this.f4423c, l0Var.t()) && Arrays.equals(bArr, l0Var.y())) {
            TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
            tonconnectclosesession.session_id = tonconnectsession.f22291id;
            tonconnectclosesession.body = b2Var.f36415c;
            e2Var.f36516f.sendRequestTyped(tonconnectclosesession, new Object(), new org.telegram.ui.Wallet.d(sVar, 3));
            return;
        }
        sVar.run("Wallet or TON Connect session changed. Open the request again.");
    }

    private final void d() {
        org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.f4422b;
        String str = (String) this.f4423c;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.f4424f;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.h;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.d;
        if (str != null) {
            callback.run(str);
        } else if (e2Var.y(a2Var) && !e2Var.i(a2Var)) {
            e2Var.f36516f.sendRequestTyped(sendtransfer, new Object(), new t3(e2Var, callback, a2Var, i0Var, sendtransfer, 6));
        } else {
            callback.run("Request expired or wallet changed");
        }
    }

    private final void f() {
        int i10;
        org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.f4422b;
        org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.f4423c;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.e;
        org.telegram.ui.Wallet.s sVar = (org.telegram.ui.Wallet.s) this.f4424f;
        JSONObject jSONObject = (JSONObject) this.h;
        String str = (String) this.d;
        if (e2Var.y(a2Var) && !e2Var.i(a2Var)) {
            if (jSONObject == null) {
                i10 = 0;
            } else {
                i10 = -1;
            }
            e2Var.w(a2Var, i0Var, jSONObject, i10, str, sVar);
            return;
        }
        e2Var.w(a2Var, i0Var, null, 0, "Request expired or wallet changed", sVar);
    }

    private final void g() {
        ((WalletEngine2) this.f4422b).lambda$prepareSendNFT$26((String) this.f4423c, (String) this.e, (String) this.f4424f, (byte[]) this.h, (Utilities.Callback2) this.d);
    }

    private final void h() {
        org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f4422b;
        TLObject tLObject = (TLObject) this.f4423c;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
        String str = (String) this.f4424f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.u6 u6Var = a1Var.e;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                fl0.b(false, a1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, a1Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                fl0.b(false, a1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, a1Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                org.telegram.ui.Components.g5.o0(a1Var.getContext(), str, false, true, true, false, 0L, null, null, null);
            }
        } else if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                new org.telegram.ui.Components.wc(a1Var, u6Var).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str2), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Gi, u6Var)), R.raw.error).j();
                return;
            }
            new org.telegram.ui.Components.wc(a1Var, u6Var).g0(tL_error, false);
        }
    }

    private final void i() {
        org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f4422b;
        File file = (File) this.f4423c;
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.e;
        String str = (String) this.f4424f;
        String str2 = (String) this.h;
        String str3 = (String) this.d;
        if (file == null) {
            e2Var.c(500L);
            return;
        }
        int[] iArr = new int[11];
        Utilities.globalQueue.postRunnable(new oy0(file, iArr, new r7((NotificationCenter.NotificationCenterDelegate) a1Var, (Object) iArr, (Object) file, (Object) e2Var, str, (Object) str2, (Object) str3, 14), 6));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.c3.run():void");
    }

    public c3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f4421a = i10;
        this.f4422b = obj;
        this.f4423c = obj2;
        this.e = obj3;
        this.f4424f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    public c3(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f4421a = i10;
        this.f4423c = tLObject;
        this.f4422b = obj;
        this.e = obj2;
        this.f4424f = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    public c3(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.u6 u6Var, fi.d dVar, org.telegram.ui.s6 s6Var, Runnable runnable) {
        this.f4421a = 14;
        this.d = tL_error;
        this.f4422b = context;
        this.f4423c = u6Var;
        this.e = dVar;
        this.f4424f = s6Var;
        this.h = runnable;
    }

    public c3(wn wnVar, qf.c cVar, org.telegram.ui.Cells.s1 s1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.f4421a = 13;
        this.f4422b = wnVar;
        this.e = cVar;
        this.f4424f = s1Var;
        this.h = str;
        this.f4423c = tLObject;
        this.d = characterStyle;
    }

    public c3(kn0 kn0Var, TLRPC.TL_error tL_error, String str, an0 an0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.f4421a = 16;
        this.f4422b = kn0Var;
        this.d = tL_error;
        this.e = str;
        this.f4424f = an0Var;
        this.f4423c = tLObject;
        this.h = sendverifyphonecode;
    }

    public c3(x21 x21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.f4421a = 17;
        this.f4422b = x21Var;
        this.f4423c = tLObject;
        this.e = charSequence;
        this.d = tL_error;
        this.f4424f = bArr;
        this.h = str;
    }

    public c3(p61 p61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f4421a = 19;
        this.f4422b = p61Var;
        this.d = tL_error;
        this.f4423c = inputCheckPasswordSRP;
        this.e = user;
        this.f4424f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public c3(org.telegram.ui.web.a1 a1Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.f4421a = 25;
        this.f4422b = a1Var;
        this.f4423c = tLObject;
        this.e = tL_messages_requestUrlAuth;
        this.f4424f = str;
        this.d = tL_error;
        this.h = str2;
    }

    public c3(zh.p1 p1Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, hi1 hi1Var, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.f4421a = 27;
        this.f4422b = p1Var;
        this.e = e2Var;
        this.f4423c = tLObject;
        this.f4424f = hi1Var;
        this.h = callback;
        this.d = tL_error;
    }
}
