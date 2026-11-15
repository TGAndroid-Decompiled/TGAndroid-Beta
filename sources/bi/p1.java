package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.widget.TextView;
import di.v8;
import java.util.Arrays;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e80;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.g7;
import org.telegram.ui.an;
import org.telegram.ui.di0;
import org.telegram.ui.ek0;
import org.telegram.ui.my0;
import org.telegram.ui.vj0;
import org.telegram.ui.x11;
import org.telegram.ui.x21;
public final class p1 implements Runnable {
    public final int f3776a;
    public final Object f3777b;
    public final Object f3778c;
    public final Object d;
    public final Object f3779e;
    public final Object f3780f;
    public final Object h;

    public p1(v8 v8Var, Object obj, gj gjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, z10 z10Var, int i7) {
        this.f3776a = i7;
        this.d = v8Var;
        this.f3779e = obj;
        this.f3777b = gjVar;
        this.f3780f = inputInvoice;
        this.f3778c = tL_payments_paymentFormStars;
        this.h = z10Var;
    }

    private final void a() {
        org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.d;
        byte[] bArr = (byte[]) this.f3777b;
        x21 x21Var = (x21) this.f3780f;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
        org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.f3778c;
        org.telegram.ui.Wallet.l0 l0Var = d2Var.f43730b;
        if (TextUtils.equals((String) this.f3779e, l0Var.t()) && Arrays.equals(bArr, l0Var.y())) {
            TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
            tonconnectclosesession.session_id = tonconnectsession.f28313id;
            tonconnectclosesession.body = a2Var.f43470c;
            d2Var.f43733f.sendRequestTyped(tonconnectclosesession, new d3.b(1), new org.telegram.ui.Wallet.d(x21Var, 3));
            return;
        }
        x21Var.a("Wallet or TON Connect session changed. Open the request again.");
    }

    private final void b() {
        byte[] bArr = (byte[]) this.f3777b;
        org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.f3780f;
        byte[] bArr2 = a2Var.f43469b;
        org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) this.h;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f3778c;
        org.telegram.ui.Wallet.l0 l0Var = ((org.telegram.ui.Wallet.d2) this.d).f43730b;
        if (TextUtils.equals((String) this.f3779e, l0Var.t()) && Arrays.equals(bArr, l0Var.y())) {
            TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
            inputtonconnectoauthsession.session_id = tonconnectsession.f28313id;
            inputtonconnectoauthsession.challenge_answer = bArr2;
            inputtonconnectoauthsession.body = a2Var.f43470c;
            inputtonconnectoauthsession.proof = a2Var.d;
            t1Var.a(inputtonconnectoauthsession, null);
            return;
        }
        Arrays.fill(bArr2, (byte) 0);
        t1Var.a(null, "Wallet changed. Open the request again.");
    }

    private final void c() {
        org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.d;
        String str = (String) this.f3779e;
        z10 z10Var = (z10) this.h;
        org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.f3777b;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f3780f;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f3778c;
        if (str != null) {
            z10Var.a(str);
        } else if (d2Var.A(z1Var) && !d2Var.j(z1Var)) {
            d2Var.f43733f.sendRequestTyped(sendtransfer, new d3.b(1), new di.z2(d2Var, z10Var, z1Var, i0Var, sendtransfer, 6));
        } else {
            z10Var.a("Request expired or wallet changed");
        }
    }

    private final void d() {
        org.telegram.ui.Wallet.r2 r2Var = (org.telegram.ui.Wallet.r2) this.d;
        int[] iArr = (int[]) this.f3779e;
        TextView textView = (TextView) this.f3777b;
        g7 g7Var = (g7) this.f3780f;
        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.h;
        org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.f3778c;
        if (!r2Var.f44432e && !r2Var.d) {
            iArr[0] = 0;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
            spannableStringBuilder.setSpan(new e80(org.telegram.messenger.g0.L(80.0f), textView), 0, spannableStringBuilder.length(), 33);
            textView.setText(hd.V(null, null, 2131743120, spannableStringBuilder));
            g7Var.run();
            WalletEngine2 walletEngine2 = l0Var.f44079b;
            if (walletEngine2 == null) {
                iArr[0] = 3;
                textView.setText(hd.M0(2131742986, null));
                g7Var.run();
                return;
            }
            walletEngine2.previewTonConnect(c2Var, new org.telegram.ui.Wallet.d1(r2Var, iArr, l0Var, textView, c2Var, g7Var, 4));
        }
    }

    private final void f() {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.d;
        TLObject tLObject = (TLObject) this.f3777b;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f3779e;
        String str = (String) this.f3780f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f3778c;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.e6 e6Var = v0Var.f52818e;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                di0.b(false, v0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, v0Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                di0.b(false, v0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, v0Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                org.telegram.ui.Components.t4.m0(v0Var.getContext(), str, false, true, true, false, 0L, null, null, null);
            }
        } else if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                new cc(v0Var, e6Var).I(2131624012, hd.M0(2131753128, null), org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.xj, e6Var), hd.a0(null, null, 2131753130, str2))).j();
            } else {
                new cc(v0Var, e6Var).f0(tL_error, false);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.p1.run():void");
    }

    public p1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f3776a = i7;
        this.d = obj;
        this.f3779e = obj2;
        this.f3777b = obj3;
        this.f3780f = obj4;
        this.h = obj5;
        this.f3778c = obj6;
    }

    public p1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7, boolean z10) {
        this.f3776a = i7;
        this.d = obj;
        this.f3777b = obj2;
        this.f3779e = obj3;
        this.f3780f = obj4;
        this.h = obj5;
        this.f3778c = obj6;
    }

    public p1(jg.z0 z0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, np npVar, vr vrVar) {
        this.f3776a = 10;
        this.d = z0Var;
        this.f3779e = str;
        this.f3778c = tL_error;
        this.f3777b = tLObject;
        this.f3780f = npVar;
        this.h = vrVar;
    }

    public p1(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f3776a = i7;
        this.f3777b = tLObject;
        this.d = obj;
        this.f3779e = obj2;
        this.f3780f = obj3;
        this.h = obj4;
        this.f3778c = obj5;
    }

    public p1(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.e6 e6Var, hi.d dVar, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.f3776a = 15;
        this.f3778c = tL_error;
        this.d = context;
        this.f3779e = e6Var;
        this.f3777b = dVar;
        this.f3780f = p6Var;
        this.h = runnable;
    }

    public p1(an anVar, vf.b bVar, org.telegram.ui.Cells.q1 q1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.f3776a = 13;
        this.d = anVar;
        this.f3779e = bVar;
        this.f3780f = q1Var;
        this.h = str;
        this.f3777b = tLObject;
        this.f3778c = characterStyle;
    }

    public p1(ek0 ek0Var, TLRPC.TL_error tL_error, String str, vj0 vj0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.f3776a = 17;
        this.d = ek0Var;
        this.f3778c = tL_error;
        this.f3779e = str;
        this.f3780f = vj0Var;
        this.f3777b = tLObject;
        this.h = sendverifyphonecode;
    }

    public p1(my0 my0Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.f3776a = 18;
        this.d = my0Var;
        this.f3777b = tLObject;
        this.f3779e = charSequence;
        this.f3778c = tL_error;
        this.f3780f = bArr;
        this.h = str;
    }

    public p1(x11 x11Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f3776a = 20;
        this.d = x11Var;
        this.f3778c = tL_error;
        this.f3779e = inputCheckPasswordSRP;
        this.f3777b = user;
        this.f3780f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public p1(org.telegram.ui.Wallet.d2 d2Var, String str, z10 z10Var, org.telegram.ui.Wallet.z1 z1Var, org.telegram.ui.Wallet.i0 i0Var, TL_wallet.sendTransfer sendtransfer) {
        this.f3776a = 24;
        this.d = d2Var;
        this.f3779e = str;
        this.h = z10Var;
        this.f3777b = z1Var;
        this.f3780f = i0Var;
        this.f3778c = sendtransfer;
    }

    public p1(org.telegram.ui.web.v0 v0Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.f3776a = 27;
        this.d = v0Var;
        this.f3777b = tLObject;
        this.f3779e = tL_messages_requestUrlAuth;
        this.f3780f = str;
        this.f3778c = tL_error;
        this.h = str2;
    }
}
