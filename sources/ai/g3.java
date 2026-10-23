package ai;

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
import org.telegram.ui.Components.fy0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.an0;
import org.telegram.ui.di1;
import org.telegram.ui.l61;
import org.telegram.ui.qm0;
import org.telegram.ui.s21;
import org.telegram.ui.sn;
import org.telegram.ui.xk0;
public final class g3 implements Runnable {
    public final int f1341a;
    public final Object f1342b;
    public final Object f1343c;
    public final Object d;
    public final Object e;
    public final Object f1344f;
    public final Object h;

    public g3(hg.a1 a1Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f1341a = 10;
        this.f1342b = a1Var;
        this.e = str;
        this.d = tL_error;
        this.f1343c = tLObject;
        this.f1344f = messagesController;
        this.h = messagesStorage;
    }

    private final void a() {
        l61.R((l61) this.f1342b, (TLRPC.TL_error) this.d, (TLRPC.InputCheckPasswordSRP) this.f1343c, (TLRPC.User) this.e, (TwoStepVerificationActivity) this.f1344f, (TLRPC.TL_channels_editCreator) this.h);
    }

    private final void b() {
        byte[] bArr = (byte[]) this.e;
        org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.f1344f;
        byte[] bArr2 = b2Var.f34325b;
        org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.h;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
        org.telegram.ui.Wallet.l0 l0Var = ((org.telegram.ui.Wallet.e2) this.f1342b).f34430b;
        if (TextUtils.equals((String) this.f1343c, l0Var.s()) && Arrays.equals(bArr, l0Var.x())) {
            TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
            inputtonconnectoauthsession.session_id = tonconnectsession.f20601id;
            inputtonconnectoauthsession.challenge_answer = bArr2;
            inputtonconnectoauthsession.body = b2Var.f34326c;
            inputtonconnectoauthsession.proof = b2Var.d;
            r1Var.run(inputtonconnectoauthsession, null);
            return;
        }
        Arrays.fill(bArr2, (byte) 0);
        r1Var.run(null, "Wallet changed. Open the request again.");
    }

    private final void c() {
        org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.f1342b;
        byte[] bArr = (byte[]) this.e;
        org.telegram.ui.Wallet.w wVar = (org.telegram.ui.Wallet.w) this.f1344f;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
        org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.d;
        org.telegram.ui.Wallet.l0 l0Var = e2Var.f34430b;
        if (TextUtils.equals((String) this.f1343c, l0Var.s()) && Arrays.equals(bArr, l0Var.x())) {
            TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
            tonconnectclosesession.session_id = tonconnectsession.f20601id;
            tonconnectclosesession.body = b2Var.f34326c;
            e2Var.f34432f.sendRequestTyped(tonconnectclosesession, new Object(), new org.telegram.ui.Wallet.d(wVar, 3));
            return;
        }
        wVar.run("Wallet or TON Connect session changed. Open the request again.");
    }

    private final void d() {
        org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.f1342b;
        String str = (String) this.f1343c;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.f1344f;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.h;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.d;
        if (str != null) {
            callback.run(str);
        } else if (e2Var.y(a2Var) && !e2Var.i(a2Var)) {
            e2Var.f34432f.sendRequestTyped(sendtransfer, new Object(), new x3(e2Var, callback, a2Var, i0Var, sendtransfer, 6));
        } else {
            callback.run("Request expired or wallet changed");
        }
    }

    private final void f() {
        int i10;
        org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.f1342b;
        org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.f1343c;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.e;
        org.telegram.ui.Wallet.w wVar = (org.telegram.ui.Wallet.w) this.f1344f;
        JSONObject jSONObject = (JSONObject) this.h;
        String str = (String) this.d;
        if (e2Var.y(a2Var) && !e2Var.i(a2Var)) {
            if (jSONObject == null) {
                i10 = 0;
            } else {
                i10 = -1;
            }
            e2Var.w(a2Var, i0Var, jSONObject, i10, str, wVar);
            return;
        }
        e2Var.w(a2Var, i0Var, null, 0, "Request expired or wallet changed", wVar);
    }

    private final void g() {
        ((WalletEngine2) this.f1342b).lambda$prepareSendNFT$26((String) this.f1343c, (String) this.e, (String) this.f1344f, (byte[]) this.h, (Utilities.Callback2) this.d);
    }

    private final void h() {
        org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f1342b;
        TLObject tLObject = (TLObject) this.f1343c;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
        String str = (String) this.f1344f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.g6 g6Var = b1Var.e;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                xk0.b(false, b1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, b1Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                xk0.b(false, b1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, b1Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                org.telegram.ui.Components.f5.p0(b1Var.getContext(), str, false, true, true, false, 0L, null, null, null);
            }
        } else if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                new org.telegram.ui.Components.xc(b1Var, g6Var).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str2), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, g6Var)), R.raw.error).j();
                return;
            }
            new org.telegram.ui.Components.xc(b1Var, g6Var).f0(tL_error, false);
        }
    }

    private final void i() {
        org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f1342b;
        File file = (File) this.f1343c;
        org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
        String str = (String) this.f1344f;
        String str2 = (String) this.h;
        String str3 = (String) this.d;
        if (file == null) {
            c2Var.c(500L);
            return;
        }
        int[] iArr = new int[11];
        Utilities.globalQueue.postRunnable(new fy0(file, iArr, new v7((NotificationCenter.NotificationCenterDelegate) b1Var, (Object) iArr, (Object) file, (Object) c2Var, str, (Object) str2, (Object) str3, 14), 6));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.g3.run():void");
    }

    public g3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f1341a = i10;
        this.f1342b = obj;
        this.f1343c = obj2;
        this.e = obj3;
        this.f1344f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    public g3(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f1341a = i10;
        this.f1343c = tLObject;
        this.f1342b = obj;
        this.e = obj2;
        this.f1344f = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    public g3(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.g6 g6Var, ei.d dVar, org.telegram.ui.r6 r6Var, Runnable runnable) {
        this.f1341a = 14;
        this.d = tL_error;
        this.f1342b = context;
        this.f1343c = g6Var;
        this.e = dVar;
        this.f1344f = r6Var;
        this.h = runnable;
    }

    public g3(sn snVar, pf.c cVar, org.telegram.ui.Cells.t1 t1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.f1341a = 13;
        this.f1342b = snVar;
        this.e = cVar;
        this.f1344f = t1Var;
        this.h = str;
        this.f1343c = tLObject;
        this.d = characterStyle;
    }

    public g3(an0 an0Var, TLRPC.TL_error tL_error, String str, qm0 qm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.f1341a = 16;
        this.f1342b = an0Var;
        this.d = tL_error;
        this.e = str;
        this.f1344f = qm0Var;
        this.f1343c = tLObject;
        this.h = sendverifyphonecode;
    }

    public g3(s21 s21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.f1341a = 17;
        this.f1342b = s21Var;
        this.f1343c = tLObject;
        this.e = charSequence;
        this.d = tL_error;
        this.f1344f = bArr;
        this.h = str;
    }

    public g3(l61 l61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f1341a = 19;
        this.f1342b = l61Var;
        this.d = tL_error;
        this.f1343c = inputCheckPasswordSRP;
        this.e = user;
        this.f1344f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public g3(org.telegram.ui.web.b1 b1Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.f1341a = 25;
        this.f1342b = b1Var;
        this.f1343c = tLObject;
        this.e = tL_messages_requestUrlAuth;
        this.f1344f = str;
        this.d = tL_error;
        this.h = str2;
    }

    public g3(yh.o1 o1Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, di1 di1Var, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.f1341a = 27;
        this.f1342b = o1Var;
        this.e = c2Var;
        this.f1343c = tLObject;
        this.f1344f = di1Var;
        this.h = callback;
        this.d = tL_error;
    }
}
