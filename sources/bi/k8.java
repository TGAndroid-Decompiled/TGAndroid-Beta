package bi;

import android.app.Activity;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ff;
import org.telegram.ui.gj;
import org.telegram.ui.rl0;
import org.telegram.ui.sh1;
public final class k8 implements Runnable {
    public final int f3247a;
    public final Object f3248b;
    public final Object f3249c;
    public final Object d;
    public final Object e;
    public final Object f3250f;
    public final Object h;

    public k8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f3247a = i10;
        this.f3248b = obj;
        this.f3249c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f3250f = obj5;
        this.h = obj6;
    }

    private final void a() {
        ((WalletEngine2) this.f3248b).lambda$prepareSendNFT$26((String) this.f3249c, (String) this.d, (String) this.e, (byte[]) this.f3250f, (Utilities.Callback2) this.h);
    }

    private final void b() {
        org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f3248b;
        TLObject tLObject = (TLObject) this.f3249c;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.d;
        String str = (String) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f3250f;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.c6 c6Var = b1Var.e;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                rl0.b(false, b1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, b1Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                rl0.b(false, b1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, b1Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                org.telegram.ui.Components.g5.o0(b1Var.getContext(), str, false, true, true, false, 0L, null, null, null);
            }
        } else if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                new zc(b1Var, c6Var).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str2), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, c6Var)), R.raw.error).j();
                return;
            }
            new zc(b1Var, c6Var).f0(tL_error, false);
        }
    }

    private final void c() {
        org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f3248b;
        File file = (File) this.f3249c;
        org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.d;
        String str = (String) this.e;
        String str2 = (String) this.f3250f;
        String str3 = (String) this.h;
        if (file == null) {
            a2Var.c(500L);
            return;
        }
        int[] iArr = new int[11];
        Utilities.globalQueue.postRunnable(new v70(file, iArr, new ff(b1Var, iArr, file, a2Var, str, str2, str3, 10), 24));
    }

    private final void d() {
        yh.p1.Q((yh.p1) this.f3248b, (org.telegram.ui.ActionBar.a2) this.f3249c, (TLObject) this.d, (rg.g2) this.e, (Utilities.Callback) this.f3250f, (TLRPC.TL_error) this.h);
    }

    private final void f() {
        zh.r3.d1((zh.r3) this.f3248b, (TLObject) this.f3249c, (CharSequence) this.d, (TL_stars.TL_starGiftUnique) this.e, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f3250f, (TLRPC.TL_error) this.h);
    }

    private final void g() {
        zh.r3.z0((zh.r3) this.f3248b, (TLObject) this.f3249c, (ug.m1[]) this.d, (Long) this.e, (org.webrtc.i) this.f3250f, (TLRPC.TL_error) this.h);
    }

    private final void h() {
        zh.n5 n5Var = (zh.n5) this.f3248b;
        List list = (List) this.f3249c;
        rh.s sVar = (rh.s) this.d;
        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.e;
        c5.i iVar = (c5.i) this.f3250f;
        Activity activity = (Activity) this.h;
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new zh.e4(sVar, 0));
            return;
        }
        c5.p pVar = (c5.p) list.get(0);
        if (pVar.a() == null) {
            AndroidUtilities.runOnUIThread(new zh.e4(sVar, 1));
            return;
        }
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
        ConnectionsManager.getInstance(n5Var.f50864a).sendRequest(tL_payments_canPurchaseStore, new sh1(pVar, iVar, sVar, activity, tL_inputStorePaymentStarsGiveaway, list, 3));
    }

    private final void i() {
        zh.n5 n5Var = (zh.n5) this.f3248b;
        Runnable runnable = (Runnable) this.f3249c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f3250f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        if (!n5Var.e) {
            zh.n5.e("NO_BALANCE");
            runnable.run();
            return;
        }
        n5Var.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
    }

    private final void j() {
        String str;
        zh.n5 n5Var = (zh.n5) this.f3248b;
        TLObject tLObject = (TLObject) this.f3249c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.e;
        gj gjVar = (gj) this.f3250f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            n5Var.Y(messageObject, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, gjVar, null);
        } else {
            if (tL_error == null) {
                str = "NO_PAYMENT_FORM";
            } else {
                str = tL_error.text;
            }
            zh.n5.e(str);
        }
        gjVar.run();
    }

    private final void k() {
        ((boolean[]) this.f3249c)[0] = true;
        ((zh.n5) this.f3248b).a0((MessageObject) this.d, (TLRPC.InputInvoice) this.e, (TLRPC.TL_payments_paymentFormStars) this.f3250f, new zh.v0(1, (Utilities.Callback) this.h));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.k8.run():void");
    }

    public k8(org.telegram.ui.ac acVar, TLRPC.ChannelParticipant channelParticipant, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, org.telegram.ui.wa waVar) {
        this.f3247a = 5;
        this.f3248b = acVar;
        this.f3250f = channelParticipant;
        this.f3249c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.h = waVar;
    }
}
