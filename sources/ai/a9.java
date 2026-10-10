package ai;

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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.cj;
import org.telegram.ui.mh1;
import org.telegram.ui.ml0;
import org.telegram.ui.ze;
public final class a9 implements Runnable {
    public final int f648a;
    public final Object f649b;
    public final Object f650c;
    public final Object d;
    public final Object f651e;
    public final Object f652f;
    public final Object h;

    public a9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f648a = i10;
        this.f649b = obj;
        this.f650c = obj2;
        this.d = obj3;
        this.f651e = obj4;
        this.f652f = obj5;
        this.h = obj6;
    }

    private final void a() {
        ((WalletEngine2) this.f649b).lambda$prepareSendNFT$26((String) this.f650c, (String) this.d, (String) this.f651e, (byte[]) this.f652f, (Utilities.Callback2) this.h);
    }

    private final void b() {
        org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f649b;
        TLObject tLObject = (TLObject) this.f650c;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.d;
        String str = (String) this.f651e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f652f;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.e6 e6Var = b1Var.f43288e;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                ml0.b(false, b1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, b1Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                ml0.b(false, b1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, b1Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                org.telegram.ui.Components.g5.o0(b1Var.getContext(), str, false, true, true, false, 0L, null, null, null);
            }
        } else if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                new ad(b1Var, e6Var).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str2), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Gi, e6Var)), R.raw.error).j();
                return;
            }
            new ad(b1Var, e6Var).f0(tL_error, false);
        }
    }

    private final void c() {
        org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f649b;
        File file = (File) this.f650c;
        org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.d;
        String str = (String) this.f651e;
        String str2 = (String) this.f652f;
        String str3 = (String) this.h;
        if (file == null) {
            b2Var.c(500L);
            return;
        }
        int[] iArr = new int[11];
        Utilities.globalQueue.postRunnable(new cf0(file, iArr, new ze(b1Var, iArr, file, b2Var, str, str2, str3, 10), 21));
    }

    private final void e() {
        xh.r1.Q((xh.r1) this.f649b, (org.telegram.ui.ActionBar.b2) this.f650c, (TLObject) this.d, (qg.f2) this.f651e, (Utilities.Callback) this.f652f, (TLRPC.TL_error) this.h);
    }

    private final void f() {
        yh.s3.d1((yh.s3) this.f649b, (TLObject) this.f650c, (CharSequence) this.d, (TL_stars.TL_starGiftUnique) this.f651e, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f652f, (TLRPC.TL_error) this.h);
    }

    private final void g() {
        yh.s3.z0((yh.s3) this.f649b, (TLObject) this.f650c, (tg.m1[]) this.d, (Long) this.f651e, (tg.q) this.f652f, (TLRPC.TL_error) this.h);
    }

    private final void h() {
        yh.m5 m5Var = (yh.m5) this.f649b;
        List list = (List) this.f650c;
        qh.r rVar = (qh.r) this.d;
        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f651e;
        c5.h hVar = (c5.h) this.f652f;
        Activity activity = (Activity) this.h;
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new yh.e4(rVar, 0));
            return;
        }
        c5.o oVar = (c5.o) list.get(0);
        if (oVar.a() == null) {
            AndroidUtilities.runOnUIThread(new yh.e4(rVar, 1));
            return;
        }
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
        ConnectionsManager.getInstance(m5Var.f52924a).sendRequest(tL_payments_canPurchaseStore, new mh1(oVar, hVar, rVar, activity, tL_inputStorePaymentStarsGiveaway, list, 3));
    }

    private final void i() {
        yh.m5 m5Var = (yh.m5) this.f649b;
        Runnable runnable = (Runnable) this.f650c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.f651e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f652f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        if (!m5Var.f52927e) {
            yh.m5.e("NO_BALANCE");
            runnable.run();
            return;
        }
        m5Var.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
    }

    private final void j() {
        String str;
        yh.m5 m5Var = (yh.m5) this.f649b;
        TLObject tLObject = (TLObject) this.f650c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.f651e;
        cj cjVar = (cj) this.f652f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            m5Var.Y(messageObject, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, cjVar, null);
        } else {
            if (tL_error == null) {
                str = "NO_PAYMENT_FORM";
            } else {
                str = tL_error.text;
            }
            yh.m5.e(str);
        }
        cjVar.run();
    }

    private final void k() {
        ((boolean[]) this.f650c)[0] = true;
        ((yh.m5) this.f649b).a0((MessageObject) this.d, (TLRPC.InputInvoice) this.f651e, (TLRPC.TL_payments_paymentFormStars) this.f652f, new yh.v0(1, (Utilities.Callback) this.h));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.a9.run():void");
    }

    public a9(org.telegram.ui.vb vbVar, TLRPC.ChannelParticipant channelParticipant, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, org.telegram.ui.sa saVar) {
        this.f648a = 5;
        this.f649b = vbVar;
        this.f652f = channelParticipant;
        this.f650c = arrayList;
        this.d = arrayList2;
        this.f651e = arrayList3;
        this.h = saVar;
    }
}
