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
import org.telegram.messenger.p10;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.o80;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.a21;
import org.telegram.ui.a31;
import org.telegram.ui.bn;
import org.telegram.ui.ei0;
import org.telegram.ui.fk0;
import org.telegram.ui.ne;
import org.telegram.ui.py0;
import org.telegram.ui.wj0;
public final class n2 implements Runnable {
    public final int f3868a;
    public final Object f3869b;
    public final Object f3870c;
    public final Object d;
    public final Object f3871e;
    public final Object f3872f;
    public final Object h;

    public n2(di.y8 y8Var, Object obj, fj fjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, w10 w10Var, int i7) {
        this.f3868a = i7;
        this.d = y8Var;
        this.f3871e = obj;
        this.f3869b = fjVar;
        this.f3872f = inputInvoice;
        this.f3870c = tL_payments_paymentFormStars;
        this.h = w10Var;
    }

    private final void a() {
        byte[] bArr = (byte[]) this.f3869b;
        org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) this.f3872f;
        byte[] bArr2 = j2Var.f44514b;
        org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.h;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f3870c;
        org.telegram.ui.Wallet.v0 v0Var = ((org.telegram.ui.Wallet.m2) this.d).f44649b;
        if (TextUtils.equals((String) this.f3871e, v0Var.y()) && Arrays.equals(bArr, v0Var.E())) {
            TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
            inputtonconnectoauthsession.session_id = tonconnectsession.f28754id;
            inputtonconnectoauthsession.challenge_answer = bArr2;
            inputtonconnectoauthsession.body = j2Var.f44515c;
            inputtonconnectoauthsession.proof = j2Var.d;
            f0Var.a(inputtonconnectoauthsession, null);
            return;
        }
        Arrays.fill(bArr2, (byte) 0);
        f0Var.a(null, "Wallet changed. Open the request again.");
    }

    private final void b() {
        org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) this.d;
        String str = (String) this.f3871e;
        w10 w10Var = (w10) this.h;
        org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.f3869b;
        org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) this.f3872f;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f3870c;
        if (str != null) {
            w10Var.a(str);
        } else if (m2Var.A(i2Var) && !m2Var.j(i2Var)) {
            m2Var.f44652f.sendRequestTyped(sendtransfer, new d3.b(1), new ne(m2Var, w10Var, i2Var, s0Var, sendtransfer, 6));
        } else {
            w10Var.a("Request expired or wallet changed");
        }
    }

    private final void c() {
        int i7;
        org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) this.d;
        org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.f3871e;
        org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) this.f3869b;
        a31 a31Var = (a31) this.f3872f;
        JSONObject jSONObject = (JSONObject) this.h;
        String str = (String) this.f3870c;
        if (m2Var.A(i2Var) && !m2Var.j(i2Var)) {
            if (jSONObject == null) {
                i7 = 0;
            } else {
                i7 = -1;
            }
            m2Var.y(i2Var, s0Var, jSONObject, i7, str, a31Var);
            return;
        }
        m2Var.y(i2Var, s0Var, null, 0, "Request expired or wallet changed", a31Var);
    }

    private final void d() {
        org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) this.d;
        int[] iArr = (int[]) this.f3871e;
        TextView textView = (TextView) this.f3869b;
        org.telegram.ui.Wallet.w7 w7Var = (org.telegram.ui.Wallet.w7) this.f3872f;
        org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) this.h;
        org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.f3870c;
        if (!z2Var.f45474e && !z2Var.d) {
            iArr[0] = 0;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
            spannableStringBuilder.setSpan(new o80(org.telegram.messenger.g0.L(80.0f), textView), 0, spannableStringBuilder.length(), 33);
            textView.setText(gd.V(null, null, 2131742868, spannableStringBuilder));
            w7Var.run();
            WalletEngine2 walletEngine2 = v0Var.f45256b;
            if (walletEngine2 == null) {
                iArr[0] = 3;
                textView.setText(gd.N0(2131742715, null));
                w7Var.run();
                return;
            }
            walletEngine2.previewTonConnect(l2Var, new di.s1(z2Var, iArr, v0Var, textView, l2Var, w7Var));
        }
    }

    private final void f() {
        ((WalletEngine2) this.d).lambda$prepareSendNFT$29((String) this.f3871e, (String) this.f3869b, (String) this.f3872f, (byte[]) this.h, (p10) this.f3870c);
    }

    private final void g() {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.d;
        TLObject tLObject = (TLObject) this.f3869b;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f3871e;
        String str = (String) this.f3872f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f3870c;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.i6 i6Var = v0Var.f53582e;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                ei0.b(false, v0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, v0Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                ei0.b(false, v0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, v0Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                org.telegram.ui.Components.b5.m0(v0Var.getContext(), str, false, true, true, false, 0L, null, null, null);
            }
        } else if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                new kc(v0Var, i6Var).I(2131624012, gd.N0(2131753125, null), org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, i6Var), gd.a0(null, null, 2131753127, str2))).j();
            } else {
                new kc(v0Var, i6Var).g0(tL_error, false);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.n2.run():void");
    }

    public n2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f3868a = i7;
        this.d = obj;
        this.f3871e = obj2;
        this.f3869b = obj3;
        this.f3872f = obj4;
        this.h = obj5;
        this.f3870c = obj6;
    }

    public n2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7, boolean z10) {
        this.f3868a = i7;
        this.d = obj;
        this.f3869b = obj2;
        this.f3871e = obj3;
        this.f3872f = obj4;
        this.h = obj5;
        this.f3870c = obj6;
    }

    public n2(jg.z0 z0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, mp mpVar, tr trVar) {
        this.f3868a = 10;
        this.d = z0Var;
        this.f3871e = str;
        this.f3870c = tL_error;
        this.f3869b = tLObject;
        this.f3872f = mpVar;
        this.h = trVar;
    }

    public n2(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f3868a = i7;
        this.f3869b = tLObject;
        this.d = obj;
        this.f3871e = obj2;
        this.f3872f = obj3;
        this.h = obj4;
        this.f3870c = obj5;
    }

    public n2(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.i6 i6Var, hi.e eVar, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.f3868a = 15;
        this.f3870c = tL_error;
        this.d = context;
        this.f3871e = i6Var;
        this.f3869b = eVar;
        this.f3872f = p6Var;
        this.h = runnable;
    }

    public n2(bn bnVar, vf.b bVar, org.telegram.ui.Cells.r1 r1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.f3868a = 13;
        this.d = bnVar;
        this.f3871e = bVar;
        this.f3872f = r1Var;
        this.h = str;
        this.f3869b = tLObject;
        this.f3870c = characterStyle;
    }

    public n2(fk0 fk0Var, TLRPC.TL_error tL_error, String str, wj0 wj0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.f3868a = 17;
        this.d = fk0Var;
        this.f3870c = tL_error;
        this.f3871e = str;
        this.f3872f = wj0Var;
        this.f3869b = tLObject;
        this.h = sendverifyphonecode;
    }

    public n2(py0 py0Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.f3868a = 18;
        this.d = py0Var;
        this.f3869b = tLObject;
        this.f3871e = charSequence;
        this.f3870c = tL_error;
        this.f3872f = bArr;
        this.h = str;
    }

    public n2(a21 a21Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f3868a = 20;
        this.d = a21Var;
        this.f3870c = tL_error;
        this.f3871e = inputCheckPasswordSRP;
        this.f3869b = user;
        this.f3872f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public n2(org.telegram.ui.Wallet.m2 m2Var, String str, w10 w10Var, org.telegram.ui.Wallet.i2 i2Var, org.telegram.ui.Wallet.s0 s0Var, TL_wallet.sendTransfer sendtransfer) {
        this.f3868a = 23;
        this.d = m2Var;
        this.f3871e = str;
        this.h = w10Var;
        this.f3869b = i2Var;
        this.f3872f = s0Var;
        this.f3870c = sendtransfer;
    }

    public n2(org.telegram.ui.web.v0 v0Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.f3868a = 28;
        this.d = v0Var;
        this.f3869b = tLObject;
        this.f3871e = tL_messages_requestUrlAuth;
        this.f3872f = str;
        this.f3870c = tL_error;
        this.h = str2;
    }
}
