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
import org.telegram.ui.Components.cy0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.h61;
import org.telegram.ui.mm0;
import org.telegram.ui.o21;
import org.telegram.ui.qn;
import org.telegram.ui.uk0;
import org.telegram.ui.vm0;
import org.telegram.ui.wh1;
public final class g3 implements Runnable {
    public final int f1344a;
    public final Object f1345b;
    public final Object f1346c;
    public final Object d;
    public final Object e;
    public final Object f1347f;
    public final Object h;

    public g3(hg.a1 a1Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f1344a = 10;
        this.f1345b = a1Var;
        this.e = str;
        this.d = tL_error;
        this.f1346c = tLObject;
        this.f1347f = messagesController;
        this.h = messagesStorage;
    }

    private final void a() {
        h61.S((h61) this.f1345b, (TLRPC.TL_error) this.d, (TLRPC.InputCheckPasswordSRP) this.f1346c, (TLRPC.User) this.e, (TwoStepVerificationActivity) this.f1347f, (TLRPC.TL_channels_editCreator) this.h);
    }

    private final void b() {
        byte[] bArr = (byte[]) this.e;
        org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.f1347f;
        byte[] bArr2 = c2Var.f34073b;
        org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.h;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
        org.telegram.ui.Wallet.m0 m0Var = ((org.telegram.ui.Wallet.f2) this.f1345b).f34200b;
        if (TextUtils.equals((String) this.f1346c, m0Var.s()) && Arrays.equals(bArr, m0Var.x())) {
            TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
            inputtonconnectoauthsession.session_id = tonconnectsession.f20538id;
            inputtonconnectoauthsession.challenge_answer = bArr2;
            inputtonconnectoauthsession.body = c2Var.f34074c;
            inputtonconnectoauthsession.proof = c2Var.d;
            s1Var.run(inputtonconnectoauthsession, null);
            return;
        }
        Arrays.fill(bArr2, (byte) 0);
        s1Var.run(null, "Wallet changed. Open the request again.");
    }

    private final void c() {
        org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.f1345b;
        byte[] bArr = (byte[]) this.e;
        org.telegram.ui.Wallet.x xVar = (org.telegram.ui.Wallet.x) this.f1347f;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
        org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.d;
        org.telegram.ui.Wallet.m0 m0Var = f2Var.f34200b;
        if (TextUtils.equals((String) this.f1346c, m0Var.s()) && Arrays.equals(bArr, m0Var.x())) {
            TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
            tonconnectclosesession.session_id = tonconnectsession.f20538id;
            tonconnectclosesession.body = c2Var.f34074c;
            f2Var.f34202f.sendRequestTyped(tonconnectclosesession, new Object(), new org.telegram.ui.Wallet.d(xVar, 3));
            return;
        }
        xVar.run("Wallet or TON Connect session changed. Open the request again.");
    }

    private final void d() {
        org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.f1345b;
        String str = (String) this.f1346c;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.f1347f;
        org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.h;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.d;
        if (str != null) {
            callback.run(str);
        } else if (f2Var.y(b2Var) && !f2Var.i(b2Var)) {
            f2Var.f34202f.sendRequestTyped(sendtransfer, new Object(), new x3(f2Var, callback, b2Var, j0Var, sendtransfer, 6));
        } else {
            callback.run("Request expired or wallet changed");
        }
    }

    private final void f() {
        int i10;
        org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.f1345b;
        org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.f1346c;
        org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.e;
        org.telegram.ui.Wallet.x xVar = (org.telegram.ui.Wallet.x) this.f1347f;
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
        ((WalletEngine2) this.f1345b).lambda$prepareSendNFT$26((String) this.f1346c, (String) this.e, (String) this.f1347f, (byte[]) this.h, (Utilities.Callback2) this.d);
    }

    private final void h() {
        org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f1345b;
        TLObject tLObject = (TLObject) this.f1346c;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
        String str = (String) this.f1347f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.d6 d6Var = a1Var.e;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                uk0.b(false, a1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, a1Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                uk0.b(false, a1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, a1Var);
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
        org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f1345b;
        File file = (File) this.f1346c;
        org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
        String str = (String) this.f1347f;
        String str2 = (String) this.h;
        String str3 = (String) this.d;
        if (file == null) {
            b2Var.c(500L);
            return;
        }
        int[] iArr = new int[11];
        Utilities.globalQueue.postRunnable(new cy0(file, iArr, new v7((NotificationCenter.NotificationCenterDelegate) a1Var, (Object) iArr, (Object) file, (Object) b2Var, str, (Object) str2, (Object) str3, 14), 6));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.g3.run():void");
    }

    public g3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f1344a = i10;
        this.f1345b = obj;
        this.f1346c = obj2;
        this.e = obj3;
        this.f1347f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    public g3(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f1344a = i10;
        this.f1346c = tLObject;
        this.f1345b = obj;
        this.e = obj2;
        this.f1347f = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    public g3(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.d6 d6Var, ei.d dVar, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f1344a = 14;
        this.d = tL_error;
        this.f1345b = context;
        this.f1346c = d6Var;
        this.e = dVar;
        this.f1347f = f3Var;
        this.h = runnable;
    }

    public g3(qn qnVar, pf.c cVar, org.telegram.ui.Cells.u1 u1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.f1344a = 13;
        this.f1345b = qnVar;
        this.e = cVar;
        this.f1347f = u1Var;
        this.h = str;
        this.f1346c = tLObject;
        this.d = characterStyle;
    }

    public g3(vm0 vm0Var, TLRPC.TL_error tL_error, String str, mm0 mm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.f1344a = 16;
        this.f1345b = vm0Var;
        this.d = tL_error;
        this.e = str;
        this.f1347f = mm0Var;
        this.f1346c = tLObject;
        this.h = sendverifyphonecode;
    }

    public g3(o21 o21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.f1344a = 17;
        this.f1345b = o21Var;
        this.f1346c = tLObject;
        this.e = charSequence;
        this.d = tL_error;
        this.f1347f = bArr;
        this.h = str;
    }

    public g3(h61 h61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f1344a = 19;
        this.f1345b = h61Var;
        this.d = tL_error;
        this.f1346c = inputCheckPasswordSRP;
        this.e = user;
        this.f1347f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public g3(org.telegram.ui.web.a1 a1Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.f1344a = 25;
        this.f1345b = a1Var;
        this.f1346c = tLObject;
        this.e = tL_messages_requestUrlAuth;
        this.f1347f = str;
        this.d = tL_error;
        this.h = str2;
    }

    public g3(yh.o1 o1Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, wh1 wh1Var, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.f1344a = 27;
        this.f1345b = o1Var;
        this.e = b2Var;
        this.f1346c = tLObject;
        this.f1347f = wh1Var;
        this.h = callback;
        this.d = tL_error;
    }
}
