package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.l31;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.a21;
import org.telegram.ui.an;
import org.telegram.ui.bi0;
import org.telegram.ui.bk0;
import org.telegram.ui.oy0;
import org.telegram.ui.sj0;
public final class a3 implements Runnable {
    public final int f3438a;
    public final Object f3439b;
    public final Object f3440c;
    public final Object d;
    public final Object f3441e;
    public final Object f3442f;
    public final Object h;

    public a3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f3438a = i7;
        this.f3439b = obj;
        this.f3440c = obj2;
        this.f3441e = obj3;
        this.f3442f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    private final void a() {
        org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.f3439b;
        String str = (String) this.f3440c;
        c20 c20Var = (c20) this.f3441e;
        org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.f3442f;
        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.h;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.d;
        if (str != null) {
            c20Var.a(str);
        } else if (f2Var.A(b2Var) && !f2Var.j(b2Var)) {
            f2Var.f42439f.sendRequestTyped(sendtransfer, new d3.b(1), new t3(f2Var, c20Var, b2Var, k0Var, sendtransfer, 6));
        } else {
            c20Var.a("Request expired or wallet changed");
        }
    }

    private final void b() {
        org.telegram.ui.Wallet.u2 u2Var = (org.telegram.ui.Wallet.u2) this.f3439b;
        int[] iArr = (int[]) this.f3440c;
        TextView textView = (TextView) this.f3441e;
        org.telegram.ui.Wallet.g7 g7Var = (org.telegram.ui.Wallet.g7) this.f3442f;
        org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) this.h;
        org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.d;
        if (!u2Var.f43173e && !u2Var.d) {
            iArr[0] = 0;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
            spannableStringBuilder.setSpan(new b80(org.telegram.messenger.g0.L(80.0f), textView), 0, spannableStringBuilder.length(), 33);
            textView.setText(org.telegram.messenger.hd.V(null, null, 2131743121, spannableStringBuilder));
            g7Var.run();
            WalletEngine2 walletEngine2 = n0Var.f42769b;
            if (walletEngine2 == null) {
                iArr[0] = 3;
                textView.setText(org.telegram.messenger.hd.M0(2131742987, null));
                g7Var.run();
                return;
            }
            walletEngine2.previewTonConnect(e2Var, new org.telegram.ui.Wallet.f1(u2Var, iArr, n0Var, textView, e2Var, g7Var, 4));
        }
    }

    private final void c() {
        org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f3439b;
        TLObject tLObject = (TLObject) this.f3440c;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f3441e;
        String str = (String) this.f3442f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.f6 f6Var = x0Var.f51355e;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                bi0.b(false, x0Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, x0Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                bi0.b(false, x0Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, x0Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                org.telegram.ui.Components.v4.m0(x0Var.getContext(), str, false, true, true, false, 0L, null, null, null);
            }
        } else if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                new org.telegram.ui.Components.hc(x0Var, f6Var).I(2131624011, org.telegram.messenger.hd.M0(2131753128, null), org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, f6Var), org.telegram.messenger.hd.a0(null, null, 2131753130, str2))).j();
            } else {
                new org.telegram.ui.Components.hc(x0Var, f6Var).f0(tL_error, false);
            }
        }
    }

    private final void d() {
        org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f3439b;
        File file = (File) this.f3440c;
        org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f3441e;
        String str = (String) this.f3442f;
        String str2 = (String) this.h;
        String str3 = (String) this.d;
        if (file == null) {
            u1Var.c(500L);
            return;
        }
        int[] iArr = new int[11];
        Utilities.f21333e.c(new l31(file, iArr, new r7((ls) x0Var, (Object) iArr, (Object) file, (Object) u1Var, str, (Object) str2, (Object) str3, 15), 4));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.a3.run():void");
    }

    public a3(jg.z0 z0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, qp qpVar, yr yrVar) {
        this.f3438a = 9;
        this.f3439b = z0Var;
        this.f3441e = str;
        this.d = tL_error;
        this.f3440c = tLObject;
        this.f3442f = qpVar;
        this.h = yrVar;
    }

    public a3(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f3438a = i7;
        this.f3440c = tLObject;
        this.f3439b = obj;
        this.f3441e = obj2;
        this.f3442f = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    public a3(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.f6 f6Var, fi.d dVar, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.f3438a = 13;
        this.d = tL_error;
        this.f3439b = context;
        this.f3440c = f6Var;
        this.f3441e = dVar;
        this.f3442f = p6Var;
        this.h = runnable;
    }

    public a3(an anVar, vf.b bVar, org.telegram.ui.Cells.q1 q1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.f3438a = 12;
        this.f3439b = anVar;
        this.f3441e = bVar;
        this.f3442f = q1Var;
        this.h = str;
        this.f3440c = tLObject;
        this.d = characterStyle;
    }

    public a3(bk0 bk0Var, TLRPC.TL_error tL_error, String str, sj0 sj0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.f3438a = 15;
        this.f3439b = bk0Var;
        this.d = tL_error;
        this.f3441e = str;
        this.f3442f = sj0Var;
        this.f3440c = tLObject;
        this.h = sendverifyphonecode;
    }

    public a3(oy0 oy0Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.f3438a = 16;
        this.f3439b = oy0Var;
        this.f3440c = tLObject;
        this.f3441e = charSequence;
        this.d = tL_error;
        this.f3442f = bArr;
        this.h = str;
    }

    public a3(a21 a21Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f3438a = 18;
        this.f3439b = a21Var;
        this.d = tL_error;
        this.f3440c = inputCheckPasswordSRP;
        this.f3441e = user;
        this.f3442f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public a3(org.telegram.ui.web.x0 x0Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.f3438a = 25;
        this.f3439b = x0Var;
        this.f3440c = tLObject;
        this.f3441e = tL_messages_requestUrlAuth;
        this.f3442f = str;
        this.d = tL_error;
        this.h = str2;
    }

    public a3(zh.h1 h1Var, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, ub ubVar, c20 c20Var, TLRPC.TL_error tL_error) {
        this.f3438a = 27;
        this.f3439b = h1Var;
        this.f3441e = u1Var;
        this.f3440c = tLObject;
        this.f3442f = ubVar;
        this.h = c20Var;
        this.d = tL_error;
    }
}
