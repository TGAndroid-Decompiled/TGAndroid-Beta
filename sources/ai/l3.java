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
import org.telegram.ui.Components.ay0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.j61;
import org.telegram.ui.om0;
import org.telegram.ui.q21;
import org.telegram.ui.sn;
import org.telegram.ui.wk0;
import org.telegram.ui.xm0;
import org.telegram.ui.yh1;
public final class l3 implements Runnable {
    public final int f1763a;
    public final Object f1764b;
    public final Object f1765c;
    public final Object d;
    public final Object e;
    public final Object f1766f;
    public final Object h;

    public l3(hg.a1 a1Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f1763a = 10;
        this.f1764b = a1Var;
        this.e = str;
        this.d = tL_error;
        this.f1765c = tLObject;
        this.f1766f = messagesController;
        this.h = messagesStorage;
    }

    private final void a() {
        j61.S((j61) this.f1764b, (TLRPC.TL_error) this.d, (TLRPC.InputCheckPasswordSRP) this.f1765c, (TLRPC.User) this.e, (TwoStepVerificationActivity) this.f1766f, (TLRPC.TL_channels_editCreator) this.h);
    }

    private final void b() {
        byte[] bArr = (byte[]) this.e;
        org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.f1766f;
        byte[] bArr2 = c2Var.f34072b;
        org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.h;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
        org.telegram.ui.Wallet.m0 m0Var = ((org.telegram.ui.Wallet.f2) this.f1764b).f34192b;
        if (TextUtils.equals((String) this.f1765c, m0Var.s()) && Arrays.equals(bArr, m0Var.x())) {
            TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
            inputtonconnectoauthsession.session_id = tonconnectsession.f20530id;
            inputtonconnectoauthsession.challenge_answer = bArr2;
            inputtonconnectoauthsession.body = c2Var.f34073c;
            inputtonconnectoauthsession.proof = c2Var.d;
            s1Var.run(inputtonconnectoauthsession, null);
            return;
        }
        Arrays.fill(bArr2, (byte) 0);
        s1Var.run(null, "Wallet changed. Open the request again.");
    }

    private final void c() {
        org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.f1764b;
        byte[] bArr = (byte[]) this.e;
        org.telegram.ui.Wallet.x xVar = (org.telegram.ui.Wallet.x) this.f1766f;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
        org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.d;
        org.telegram.ui.Wallet.m0 m0Var = f2Var.f34192b;
        if (TextUtils.equals((String) this.f1765c, m0Var.s()) && Arrays.equals(bArr, m0Var.x())) {
            TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
            tonconnectclosesession.session_id = tonconnectsession.f20530id;
            tonconnectclosesession.body = c2Var.f34073c;
            f2Var.f34194f.sendRequestTyped(tonconnectclosesession, new Object(), new org.telegram.ui.Wallet.d(xVar, 3));
            return;
        }
        xVar.run("Wallet or TON Connect session changed. Open the request again.");
    }

    private final void d() {
        org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.f1764b;
        String str = (String) this.f1765c;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.f1766f;
        org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.h;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.d;
        if (str != null) {
            callback.run(str);
        } else if (f2Var.y(b2Var) && !f2Var.i(b2Var)) {
            f2Var.f34194f.sendRequestTyped(sendtransfer, new Object(), new t3(f2Var, callback, b2Var, j0Var, sendtransfer, 6));
        } else {
            callback.run("Request expired or wallet changed");
        }
    }

    private final void f() {
        int i10;
        org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.f1764b;
        org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.f1765c;
        org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.e;
        org.telegram.ui.Wallet.x xVar = (org.telegram.ui.Wallet.x) this.f1766f;
        JSONObject jSONObject = (JSONObject) this.h;
        String str = (String) this.d;
        if (f2Var.y(b2Var) && !f2Var.i(b2Var)) {
            if (jSONObject == null) {
                i10 = 0;
            } else {
                i10 = -1;
            }
            f2Var.w(b2Var, j0Var, jSONObject, i10, str, xVar);
            return;
        }
        f2Var.w(b2Var, j0Var, null, 0, "Request expired or wallet changed", xVar);
    }

    private final void g() {
        ((WalletEngine2) this.f1764b).lambda$prepareSendNFT$26((String) this.f1765c, (String) this.e, (String) this.f1766f, (byte[]) this.h, (Utilities.Callback2) this.d);
    }

    private final void h() {
        org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f1764b;
        TLObject tLObject = (TLObject) this.f1765c;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
        String str = (String) this.f1766f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.d6 d6Var = a1Var.e;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                wk0.b(false, a1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, a1Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                wk0.b(false, a1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, a1Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                org.telegram.ui.Components.f5.o0(a1Var.getContext(), str, false, true, true, false, 0L, null, null, null);
            }
        } else if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                new org.telegram.ui.Components.xc(a1Var, d6Var).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str2), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, d6Var)), R.raw.error).j();
                return;
            }
            new org.telegram.ui.Components.xc(a1Var, d6Var).f0(tL_error, false);
        }
    }

    private final void i() {
        org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f1764b;
        File file = (File) this.f1765c;
        org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
        String str = (String) this.f1766f;
        String str2 = (String) this.h;
        String str3 = (String) this.d;
        if (file == null) {
            b2Var.c(500L);
            return;
        }
        int[] iArr = new int[11];
        Utilities.globalQueue.postRunnable(new ay0(file, iArr, new u7((NotificationCenter.NotificationCenterDelegate) a1Var, (Object) iArr, (Object) file, (Object) b2Var, str, (Object) str2, (Object) str3, 14), 6));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.l3.run():void");
    }

    public l3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f1763a = i10;
        this.f1764b = obj;
        this.f1765c = obj2;
        this.e = obj3;
        this.f1766f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    public l3(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f1763a = i10;
        this.f1765c = tLObject;
        this.f1764b = obj;
        this.e = obj2;
        this.f1766f = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    public l3(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.d6 d6Var, ei.d dVar, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f1763a = 14;
        this.d = tL_error;
        this.f1764b = context;
        this.f1765c = d6Var;
        this.e = dVar;
        this.f1766f = f3Var;
        this.h = runnable;
    }

    public l3(sn snVar, pf.c cVar, org.telegram.ui.Cells.u1 u1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.f1763a = 13;
        this.f1764b = snVar;
        this.e = cVar;
        this.f1766f = u1Var;
        this.h = str;
        this.f1765c = tLObject;
        this.d = characterStyle;
    }

    public l3(xm0 xm0Var, TLRPC.TL_error tL_error, String str, om0 om0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.f1763a = 16;
        this.f1764b = xm0Var;
        this.d = tL_error;
        this.e = str;
        this.f1766f = om0Var;
        this.f1765c = tLObject;
        this.h = sendverifyphonecode;
    }

    public l3(q21 q21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.f1763a = 17;
        this.f1764b = q21Var;
        this.f1765c = tLObject;
        this.e = charSequence;
        this.d = tL_error;
        this.f1766f = bArr;
        this.h = str;
    }

    public l3(j61 j61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f1763a = 19;
        this.f1764b = j61Var;
        this.d = tL_error;
        this.f1765c = inputCheckPasswordSRP;
        this.e = user;
        this.f1766f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public l3(org.telegram.ui.web.a1 a1Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.f1763a = 25;
        this.f1764b = a1Var;
        this.f1765c = tLObject;
        this.e = tL_messages_requestUrlAuth;
        this.f1766f = str;
        this.d = tL_error;
        this.h = str2;
    }

    public l3(yh.p1 p1Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, yh1 yh1Var, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.f1763a = 27;
        this.f1764b = p1Var;
        this.e = b2Var;
        this.f1765c = tLObject;
        this.f1766f = yh1Var;
        this.h = callback;
        this.d = tL_error;
    }
}
