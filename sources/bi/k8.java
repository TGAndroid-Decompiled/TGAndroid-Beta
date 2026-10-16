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
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ff;
import org.telegram.ui.gj;
import org.telegram.ui.ql0;
import org.telegram.ui.sh1;
public final class k8 implements Runnable {
    public final int f3251a;
    public final Object f3252b;
    public final Object f3253c;
    public final Object d;
    public final Object e;
    public final Object f3254f;
    public final Object h;

    public k8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f3251a = i10;
        this.f3252b = obj;
        this.f3253c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f3254f = obj5;
        this.h = obj6;
    }

    private final void a() {
        ((WalletEngine2) this.f3252b).lambda$prepareSendNFT$26((String) this.f3253c, (String) this.d, (String) this.e, (byte[]) this.f3254f, (Utilities.Callback2) this.h);
    }

    private final void b() {
        org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f3252b;
        TLObject tLObject = (TLObject) this.f3253c;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.d;
        String str = (String) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f3254f;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.c6 c6Var = c1Var.e;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                ql0.b(false, c1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, c1Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                ql0.b(false, c1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, c1Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                org.telegram.ui.Components.g5.o0(c1Var.getContext(), str, false, true, true, false, 0L, null, null, null);
            }
        } else if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                new zc(c1Var, c6Var).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str2), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, c6Var)), R.raw.error).j();
                return;
            }
            new zc(c1Var, c6Var).f0(tL_error, false);
        }
    }

    private final void c() {
        org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f3252b;
        File file = (File) this.f3253c;
        org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.d;
        String str = (String) this.e;
        String str2 = (String) this.f3254f;
        String str3 = (String) this.h;
        if (file == null) {
            a2Var.c(500L);
            return;
        }
        int[] iArr = new int[11];
        Utilities.globalQueue.postRunnable(new ze0(file, iArr, new ff(c1Var, iArr, file, a2Var, str, str2, str3, 10), 21));
    }

    private final void d() {
        yh.p1.Q((yh.p1) this.f3252b, (org.telegram.ui.ActionBar.a2) this.f3253c, (TLObject) this.d, (rg.g2) this.e, (Utilities.Callback) this.f3254f, (TLRPC.TL_error) this.h);
    }

    private final void f() {
        zh.r3.d1((zh.r3) this.f3252b, (TLObject) this.f3253c, (CharSequence) this.d, (TL_stars.TL_starGiftUnique) this.e, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f3254f, (TLRPC.TL_error) this.h);
    }

    private final void g() {
        zh.r3.z0((zh.r3) this.f3252b, (TLObject) this.f3253c, (ug.m1[]) this.d, (Long) this.e, (pi.g) this.f3254f, (TLRPC.TL_error) this.h);
    }

    private final void h() {
        zh.n5 n5Var = (zh.n5) this.f3252b;
        List list = (List) this.f3253c;
        rh.r rVar = (rh.r) this.d;
        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.e;
        c5.i iVar = (c5.i) this.f3254f;
        Activity activity = (Activity) this.h;
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new zh.e4(rVar, 0));
            return;
        }
        c5.p pVar = (c5.p) list.get(0);
        if (pVar.a() == null) {
            AndroidUtilities.runOnUIThread(new zh.e4(rVar, 1));
            return;
        }
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
        ConnectionsManager.getInstance(n5Var.f50865a).sendRequest(tL_payments_canPurchaseStore, new sh1(pVar, iVar, rVar, activity, tL_inputStorePaymentStarsGiveaway, list, 3));
    }

    private final void i() {
        zh.n5 n5Var = (zh.n5) this.f3252b;
        Runnable runnable = (Runnable) this.f3253c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f3254f;
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
        zh.n5 n5Var = (zh.n5) this.f3252b;
        TLObject tLObject = (TLObject) this.f3253c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.e;
        gj gjVar = (gj) this.f3254f;
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
        ((boolean[]) this.f3253c)[0] = true;
        ((zh.n5) this.f3252b).a0((MessageObject) this.d, (TLRPC.InputInvoice) this.e, (TLRPC.TL_payments_paymentFormStars) this.f3254f, new zh.v0(1, (Utilities.Callback) this.h));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.k8.run():void");
    }

    public k8(org.telegram.ui.ac acVar, TLRPC.ChannelParticipant channelParticipant, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, org.telegram.ui.wa waVar) {
        this.f3251a = 5;
        this.f3252b = acVar;
        this.f3254f = channelParticipant;
        this.f3253c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.h = waVar;
    }
}
