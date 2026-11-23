package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.widget.TextView;
import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.r80;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.bn;
import org.telegram.ui.c21;
import org.telegram.ui.gi0;
import org.telegram.ui.hk0;
import org.telegram.ui.ne;
import org.telegram.ui.p51;
import org.telegram.ui.qy0;
import org.telegram.ui.yj0;
public final class l2 implements Runnable {
    public final int f3830a;
    public final Object f3831b;
    public final Object f3832c;
    public final Object d;
    public final Object f3833e;
    public final Object f3834f;
    public final Object h;

    public l2(di.y8 y8Var, Object obj, gj gjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, y10 y10Var, int i7) {
        this.f3830a = i7;
        this.d = y8Var;
        this.f3833e = obj;
        this.f3831b = gjVar;
        this.f3834f = inputInvoice;
        this.f3832c = tL_payments_paymentFormStars;
        this.h = y10Var;
    }

    private final void a() {
        byte[] bArr = (byte[]) this.f3831b;
        org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.f3834f;
        byte[] bArr2 = i2Var.f44386b;
        org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.h;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f3832c;
        org.telegram.ui.Wallet.u0 u0Var = ((org.telegram.ui.Wallet.l2) this.d).f44524b;
        if (TextUtils.equals((String) this.f3833e, u0Var.y()) && Arrays.equals(bArr, u0Var.E())) {
            TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
            inputtonconnectoauthsession.session_id = tonconnectsession.f28696id;
            inputtonconnectoauthsession.challenge_answer = bArr2;
            inputtonconnectoauthsession.body = i2Var.f44387c;
            inputtonconnectoauthsession.proof = i2Var.d;
            e0Var.a(inputtonconnectoauthsession, null);
            return;
        }
        Arrays.fill(bArr2, (byte) 0);
        e0Var.a(null, "Wallet changed. Open the request again.");
    }

    private final void b() {
        org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.d;
        String str = (String) this.f3833e;
        y10 y10Var = (y10) this.h;
        org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.f3831b;
        org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.f3834f;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f3832c;
        if (str != null) {
            y10Var.a(str);
        } else if (l2Var.A(h2Var) && !l2Var.j(h2Var)) {
            l2Var.f44527f.sendRequestTyped(sendtransfer, new d3.b(1), new ne(l2Var, y10Var, h2Var, r0Var, sendtransfer, 6));
        } else {
            y10Var.a("Request expired or wallet changed");
        }
    }

    private final void c() {
        int i7;
        org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.d;
        org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.f3833e;
        org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.f3831b;
        p51 p51Var = (p51) this.f3834f;
        JSONObject jSONObject = (JSONObject) this.h;
        String str = (String) this.f3832c;
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
        int[] iArr = (int[]) this.f3833e;
        TextView textView = (TextView) this.f3831b;
        org.telegram.ui.Wallet.v7 v7Var = (org.telegram.ui.Wallet.v7) this.f3834f;
        org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.h;
        org.telegram.ui.Wallet.k2 k2Var = (org.telegram.ui.Wallet.k2) this.f3832c;
        if (!y2Var.f45346e && !y2Var.d) {
            iArr[0] = 0;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
            spannableStringBuilder.setSpan(new r80(org.telegram.messenger.g0.L(80.0f), textView), 0, spannableStringBuilder.length(), 33);
            textView.setText(hd.V(null, null, 2131742873, spannableStringBuilder));
            v7Var.run();
            WalletEngine2 walletEngine2 = u0Var.f45128b;
            if (walletEngine2 == null) {
                iArr[0] = 3;
                textView.setText(hd.N0(2131742720, null));
                v7Var.run();
                return;
            }
            walletEngine2.previewTonConnect(k2Var, new di.s1(y2Var, iArr, u0Var, textView, k2Var, v7Var));
        }
    }

    private final void f() {
        ((WalletEngine2) this.d).lambda$prepareSendNFT$29((String) this.f3833e, (String) this.f3831b, (String) this.f3834f, (byte[]) this.h, (r10) this.f3832c);
    }

    private final void g() {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.d;
        TLObject tLObject = (TLObject) this.f3831b;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f3833e;
        String str = (String) this.f3834f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f3832c;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.h6 h6Var = v0Var.f53348e;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                gi0.b(false, v0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, v0Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                gi0.b(false, v0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, v0Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                org.telegram.ui.Components.c5.m0(v0Var.getContext(), str, false, true, true, false, 0L, null, null, null);
            }
        } else if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                new lc(v0Var, h6Var).I(2131624012, hd.N0(2131753125, null), org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, h6Var), hd.a0(null, null, 2131753127, str2))).j();
            } else {
                new lc(v0Var, h6Var).g0(tL_error, false);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.l2.run():void");
    }

    public l2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f3830a = i7;
        this.d = obj;
        this.f3833e = obj2;
        this.f3831b = obj3;
        this.f3834f = obj4;
        this.h = obj5;
        this.f3832c = obj6;
    }

    public l2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7, boolean z10) {
        this.f3830a = i7;
        this.d = obj;
        this.f3831b = obj2;
        this.f3833e = obj3;
        this.f3834f = obj4;
        this.h = obj5;
        this.f3832c = obj6;
    }

    public l2(jg.z0 z0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, np npVar, ur urVar) {
        this.f3830a = 10;
        this.d = z0Var;
        this.f3833e = str;
        this.f3832c = tL_error;
        this.f3831b = tLObject;
        this.f3834f = npVar;
        this.h = urVar;
    }

    public l2(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f3830a = i7;
        this.f3831b = tLObject;
        this.d = obj;
        this.f3833e = obj2;
        this.f3834f = obj3;
        this.h = obj4;
        this.f3832c = obj5;
    }

    public l2(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.h6 h6Var, hi.e eVar, org.telegram.ui.o6 o6Var, Runnable runnable) {
        this.f3830a = 15;
        this.f3832c = tL_error;
        this.d = context;
        this.f3833e = h6Var;
        this.f3831b = eVar;
        this.f3834f = o6Var;
        this.h = runnable;
    }

    public l2(bn bnVar, vf.b bVar, org.telegram.ui.Cells.r1 r1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.f3830a = 13;
        this.d = bnVar;
        this.f3833e = bVar;
        this.f3834f = r1Var;
        this.h = str;
        this.f3831b = tLObject;
        this.f3832c = characterStyle;
    }

    public l2(hk0 hk0Var, TLRPC.TL_error tL_error, String str, yj0 yj0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.f3830a = 17;
        this.d = hk0Var;
        this.f3832c = tL_error;
        this.f3833e = str;
        this.f3834f = yj0Var;
        this.f3831b = tLObject;
        this.h = sendverifyphonecode;
    }

    public l2(qy0 qy0Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.f3830a = 18;
        this.d = qy0Var;
        this.f3831b = tLObject;
        this.f3833e = charSequence;
        this.f3832c = tL_error;
        this.f3834f = bArr;
        this.h = str;
    }

    public l2(c21 c21Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f3830a = 20;
        this.d = c21Var;
        this.f3832c = tL_error;
        this.f3833e = inputCheckPasswordSRP;
        this.f3831b = user;
        this.f3834f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public l2(org.telegram.ui.Wallet.l2 l2Var, String str, y10 y10Var, org.telegram.ui.Wallet.h2 h2Var, org.telegram.ui.Wallet.r0 r0Var, TL_wallet.sendTransfer sendtransfer) {
        this.f3830a = 23;
        this.d = l2Var;
        this.f3833e = str;
        this.h = y10Var;
        this.f3831b = h2Var;
        this.f3834f = r0Var;
        this.f3832c = sendtransfer;
    }

    public l2(org.telegram.ui.web.v0 v0Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.f3830a = 28;
        this.d = v0Var;
        this.f3831b = tLObject;
        this.f3833e = tL_messages_requestUrlAuth;
        this.f3834f = str;
        this.f3832c = tL_error;
        this.h = str2;
    }
}
