package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.widget.TextView;
import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.b21;
import org.telegram.ui.bn;
import org.telegram.ui.gi0;
import org.telegram.ui.hk0;
import org.telegram.ui.ne;
import org.telegram.ui.p51;
import org.telegram.ui.qy0;
import org.telegram.ui.yj0;
public final class h2 implements Runnable {
    public final int f3658a;
    public final Object f3659b;
    public final Object f3660c;
    public final Object d;
    public final Object f3661e;
    public final Object f3662f;
    public final Object h;

    public h2(di.x8 x8Var, Object obj, fj fjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, x10 x10Var, int i7) {
        this.f3658a = i7;
        this.d = x8Var;
        this.f3661e = obj;
        this.f3659b = fjVar;
        this.f3662f = inputInvoice;
        this.f3660c = tL_payments_paymentFormStars;
        this.h = x10Var;
    }

    private final void a() {
        byte[] bArr = (byte[]) this.f3659b;
        org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.f3662f;
        byte[] bArr2 = i2Var.f44342b;
        org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.h;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f3660c;
        org.telegram.ui.Wallet.u0 u0Var = ((org.telegram.ui.Wallet.l2) this.d).f44480b;
        if (TextUtils.equals((String) this.f3661e, u0Var.y()) && Arrays.equals(bArr, u0Var.E())) {
            TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
            inputtonconnectoauthsession.session_id = tonconnectsession.f28665id;
            inputtonconnectoauthsession.challenge_answer = bArr2;
            inputtonconnectoauthsession.body = i2Var.f44343c;
            inputtonconnectoauthsession.proof = i2Var.d;
            e0Var.a(inputtonconnectoauthsession, null);
            return;
        }
        Arrays.fill(bArr2, (byte) 0);
        e0Var.a(null, "Wallet changed. Open the request again.");
    }

    private final void b() {
        org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.d;
        String str = (String) this.f3661e;
        x10 x10Var = (x10) this.h;
        org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.f3659b;
        org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.f3662f;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f3660c;
        if (str != null) {
            x10Var.a(str);
        } else if (l2Var.A(h2Var) && !l2Var.j(h2Var)) {
            l2Var.f44483f.sendRequestTyped(sendtransfer, new d3.b(1), new ne(l2Var, x10Var, h2Var, r0Var, sendtransfer, 6));
        } else {
            x10Var.a("Request expired or wallet changed");
        }
    }

    private final void c() {
        int i7;
        org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.d;
        org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.f3661e;
        org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.f3659b;
        p51 p51Var = (p51) this.f3662f;
        JSONObject jSONObject = (JSONObject) this.h;
        String str = (String) this.f3660c;
        if (l2Var.A(h2Var) && !l2Var.j(h2Var)) {
            if (jSONObject == null) {
                i7 = 0;
            } else {
                i7 = -1;
            }
            l2Var.y(h2Var, r0Var, jSONObject, i7, str, p51Var);
            return;
        }
        l2Var.y(h2Var, r0Var, null, 0, "Request expired or wallet changed", p51Var);
    }

    private final void d() {
        org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) this.d;
        int[] iArr = (int[]) this.f3661e;
        TextView textView = (TextView) this.f3659b;
        org.telegram.ui.Wallet.v7 v7Var = (org.telegram.ui.Wallet.v7) this.f3662f;
        org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.h;
        org.telegram.ui.Wallet.k2 k2Var = (org.telegram.ui.Wallet.k2) this.f3660c;
        if (!y2Var.f45302e && !y2Var.d) {
            iArr[0] = 0;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
            spannableStringBuilder.setSpan(new p80(org.telegram.messenger.g0.L(80.0f), textView), 0, spannableStringBuilder.length(), 33);
            textView.setText(gd.V(null, null, 2131742881, spannableStringBuilder));
            v7Var.run();
            WalletEngine2 walletEngine2 = u0Var.f45084b;
            if (walletEngine2 == null) {
                iArr[0] = 3;
                textView.setText(gd.M0(2131742728, null));
                v7Var.run();
                return;
            }
            walletEngine2.previewTonConnect(k2Var, new di.s1(y2Var, iArr, u0Var, textView, k2Var, v7Var));
        }
    }

    private final void f() {
        ((WalletEngine2) this.d).lambda$prepareSendNFT$29((String) this.f3661e, (String) this.f3659b, (String) this.f3662f, (byte[]) this.h, (q10) this.f3660c);
    }

    private final void g() {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.d;
        TLObject tLObject = (TLObject) this.f3659b;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f3661e;
        String str = (String) this.f3662f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f3660c;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.i6 i6Var = v0Var.f53301e;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                gi0.b(false, v0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, v0Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                gi0.b(false, v0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, v0Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                org.telegram.ui.Components.b5.m0(v0Var.getContext(), str, false, true, true, false, 0L, null, null, null);
            }
        } else if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                new lc(v0Var, i6Var).I(2131624012, gd.M0(2131753126, null), org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, i6Var), gd.a0(null, null, 2131753128, str2))).j();
            } else {
                new lc(v0Var, i6Var).g0(tL_error, false);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.h2.run():void");
    }

    public h2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f3658a = i7;
        this.d = obj;
        this.f3661e = obj2;
        this.f3659b = obj3;
        this.f3662f = obj4;
        this.h = obj5;
        this.f3660c = obj6;
    }

    public h2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7, boolean z10) {
        this.f3658a = i7;
        this.d = obj;
        this.f3659b = obj2;
        this.f3661e = obj3;
        this.f3662f = obj4;
        this.h = obj5;
        this.f3660c = obj6;
    }

    public h2(jg.z0 z0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, mp mpVar, tr trVar) {
        this.f3658a = 10;
        this.d = z0Var;
        this.f3661e = str;
        this.f3660c = tL_error;
        this.f3659b = tLObject;
        this.f3662f = mpVar;
        this.h = trVar;
    }

    public h2(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f3658a = i7;
        this.f3659b = tLObject;
        this.d = obj;
        this.f3661e = obj2;
        this.f3662f = obj3;
        this.h = obj4;
        this.f3660c = obj5;
    }

    public h2(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.i6 i6Var, hi.d dVar, org.telegram.ui.o6 o6Var, Runnable runnable) {
        this.f3658a = 15;
        this.f3660c = tL_error;
        this.d = context;
        this.f3661e = i6Var;
        this.f3659b = dVar;
        this.f3662f = o6Var;
        this.h = runnable;
    }

    public h2(bn bnVar, vf.b bVar, org.telegram.ui.Cells.r1 r1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.f3658a = 13;
        this.d = bnVar;
        this.f3661e = bVar;
        this.f3662f = r1Var;
        this.h = str;
        this.f3659b = tLObject;
        this.f3660c = characterStyle;
    }

    public h2(hk0 hk0Var, TLRPC.TL_error tL_error, String str, yj0 yj0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.f3658a = 17;
        this.d = hk0Var;
        this.f3660c = tL_error;
        this.f3661e = str;
        this.f3662f = yj0Var;
        this.f3659b = tLObject;
        this.h = sendverifyphonecode;
    }

    public h2(qy0 qy0Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.f3658a = 18;
        this.d = qy0Var;
        this.f3659b = tLObject;
        this.f3661e = charSequence;
        this.f3660c = tL_error;
        this.f3662f = bArr;
        this.h = str;
    }

    public h2(b21 b21Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f3658a = 20;
        this.d = b21Var;
        this.f3660c = tL_error;
        this.f3661e = inputCheckPasswordSRP;
        this.f3659b = user;
        this.f3662f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public h2(org.telegram.ui.Wallet.l2 l2Var, String str, x10 x10Var, org.telegram.ui.Wallet.h2 h2Var, org.telegram.ui.Wallet.r0 r0Var, TL_wallet.sendTransfer sendtransfer) {
        this.f3658a = 23;
        this.d = l2Var;
        this.f3661e = str;
        this.h = x10Var;
        this.f3659b = h2Var;
        this.f3662f = r0Var;
        this.f3660c = sendtransfer;
    }

    public h2(org.telegram.ui.web.v0 v0Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.f3658a = 28;
        this.d = v0Var;
        this.f3659b = tLObject;
        this.f3661e = tL_messages_requestUrlAuth;
        this.f3662f = str;
        this.f3660c = tL_error;
        this.h = str2;
    }
}
