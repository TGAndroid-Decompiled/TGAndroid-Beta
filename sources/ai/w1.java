package ai;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.widget.TextView;
import ci.e9;
import java.util.Arrays;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.x70;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ey0;
import org.telegram.ui.pj0;
import org.telegram.ui.q11;
import org.telegram.ui.wm;
import org.telegram.ui.yh0;
import org.telegram.ui.yj0;
public final class w1 implements Runnable {
    public final int f1050a;
    public final Object f1051b;
    public final Object f1052c;
    public final Object d;
    public final Object f1053e;
    public final Object f1054f;
    public final Object h;

    public w1(e9 e9Var, Object obj, zi ziVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, u10 u10Var, int i3) {
        this.f1050a = i3;
        this.d = e9Var;
        this.f1053e = obj;
        this.f1051b = ziVar;
        this.f1054f = inputInvoice;
        this.f1052c = tL_payments_paymentFormStars;
        this.h = u10Var;
    }

    private final void a() {
        byte[] bArr = (byte[]) this.f1051b;
        org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.f1054f;
        byte[] bArr2 = z1Var.f43495b;
        org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.h;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f1052c;
        org.telegram.ui.Wallet.k0 k0Var = ((org.telegram.ui.Wallet.c2) this.d).f42378b;
        if (TextUtils.equals((String) this.f1053e, k0Var.t()) && Arrays.equals(bArr, k0Var.y())) {
            TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
            inputtonconnectoauthsession.session_id = tonconnectsession.f27264id;
            inputtonconnectoauthsession.challenge_answer = bArr2;
            inputtonconnectoauthsession.body = z1Var.f43496c;
            inputtonconnectoauthsession.proof = z1Var.d;
            s1Var.a(inputtonconnectoauthsession, null);
            return;
        }
        Arrays.fill(bArr2, (byte) 0);
        s1Var.a(null, "Wallet changed. Open the request again.");
    }

    private final void b() {
        org.telegram.ui.Wallet.s2 s2Var = (org.telegram.ui.Wallet.s2) this.d;
        int[] iArr = (int[]) this.f1053e;
        TextView textView = (TextView) this.f1051b;
        org.telegram.ui.Wallet.e7 e7Var = (org.telegram.ui.Wallet.e7) this.f1054f;
        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.h;
        org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.f1052c;
        if (!s2Var.f43147e && !s2Var.d) {
            iArr[0] = 0;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
            spannableStringBuilder.setSpan(new x70(org.telegram.messenger.g0.L(80.0f), textView), 0, spannableStringBuilder.length(), 33);
            textView.setText(bd.V(null, null, 2131743130, spannableStringBuilder));
            e7Var.run();
            WalletEngine2 walletEngine2 = k0Var.f42719b;
            if (walletEngine2 == null) {
                iArr[0] = 3;
                textView.setText(bd.M0(2131742996, null));
                e7Var.run();
                return;
            }
            walletEngine2.previewTonConnect(b2Var, new org.telegram.ui.Wallet.c1(s2Var, iArr, k0Var, textView, b2Var, e7Var, 4));
        }
    }

    private final void c() {
        ((WalletEngine2) this.d).lambda$prepareSendNFT$26((String) this.f1053e, (String) this.f1051b, (String) this.f1054f, (byte[]) this.h, (n10) this.f1052c);
    }

    private final void e() {
        org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.d;
        TLObject tLObject = (TLObject) this.f1051b;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f1053e;
        String str = (String) this.f1054f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1052c;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.e6 e6Var = w0Var.f51067e;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                yh0.b(false, w0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, w0Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                yh0.b(false, w0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, w0Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                org.telegram.ui.Components.t4.o0(w0Var.getContext(), str, false, true, true, false, 0L, null, null, null);
            }
        } else if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                new fc(w0Var, e6Var).I(2131624011, bd.M0(2131753128, null), org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, e6Var), bd.a0(null, null, 2131753130, str2))).j();
            } else {
                new fc(w0Var, e6Var).f0(tL_error, false);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.w1.run():void");
    }

    public w1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i3) {
        this.f1050a = i3;
        this.d = obj;
        this.f1053e = obj2;
        this.f1051b = obj3;
        this.f1054f = obj4;
        this.h = obj5;
        this.f1052c = obj6;
    }

    public w1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i3, boolean z10) {
        this.f1050a = i3;
        this.d = obj;
        this.f1051b = obj2;
        this.f1053e = obj3;
        this.f1054f = obj4;
        this.h = obj5;
        this.f1052c = obj6;
    }

    public w1(kg.w0 w0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, hp hpVar, qr qrVar) {
        this.f1050a = 10;
        this.d = w0Var;
        this.f1053e = str;
        this.f1052c = tL_error;
        this.f1051b = tLObject;
        this.f1054f = hpVar;
        this.h = qrVar;
    }

    public w1(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.f1050a = i3;
        this.f1051b = tLObject;
        this.d = obj;
        this.f1053e = obj2;
        this.f1054f = obj3;
        this.h = obj4;
        this.f1052c = obj5;
    }

    public w1(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.e6 e6Var, gi.d dVar, org.telegram.ui.q6 q6Var, Runnable runnable) {
        this.f1050a = 14;
        this.f1052c = tL_error;
        this.d = context;
        this.f1053e = e6Var;
        this.f1051b = dVar;
        this.f1054f = q6Var;
        this.h = runnable;
    }

    public w1(wm wmVar, sf.b bVar, org.telegram.ui.Cells.q1 q1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.f1050a = 13;
        this.d = wmVar;
        this.f1053e = bVar;
        this.f1054f = q1Var;
        this.h = str;
        this.f1051b = tLObject;
        this.f1052c = characterStyle;
    }

    public w1(yj0 yj0Var, TLRPC.TL_error tL_error, String str, pj0 pj0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.f1050a = 16;
        this.d = yj0Var;
        this.f1052c = tL_error;
        this.f1053e = str;
        this.f1054f = pj0Var;
        this.f1051b = tLObject;
        this.h = sendverifyphonecode;
    }

    public w1(ey0 ey0Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.f1050a = 17;
        this.d = ey0Var;
        this.f1051b = tLObject;
        this.f1053e = charSequence;
        this.f1052c = tL_error;
        this.f1054f = bArr;
        this.h = str;
    }

    public w1(q11 q11Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f1050a = 19;
        this.d = q11Var;
        this.f1052c = tL_error;
        this.f1053e = inputCheckPasswordSRP;
        this.f1051b = user;
        this.f1054f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public w1(org.telegram.ui.Wallet.c2 c2Var, String str, u10 u10Var, org.telegram.ui.Wallet.y1 y1Var, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.sendTransfer sendtransfer) {
        this.f1050a = 23;
        this.d = c2Var;
        this.f1053e = str;
        this.h = u10Var;
        this.f1051b = y1Var;
        this.f1054f = h0Var;
        this.f1052c = sendtransfer;
    }

    public w1(org.telegram.ui.web.w0 w0Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.f1050a = 26;
        this.d = w0Var;
        this.f1051b = tLObject;
        this.f1053e = tL_messages_requestUrlAuth;
        this.f1054f = str;
        this.f1052c = tL_error;
        this.h = str2;
    }
}
