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
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.df;
import org.telegram.ui.gj;
import org.telegram.ui.nl0;
import org.telegram.ui.oh1;
public final class a9 implements Runnable {
    public final int f650a;
    public final Object f651b;
    public final Object f652c;
    public final Object d;
    public final Object f653e;
    public final Object f654f;
    public final Object h;

    public a9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f650a = i10;
        this.f651b = obj;
        this.f652c = obj2;
        this.d = obj3;
        this.f653e = obj4;
        this.f654f = obj5;
        this.h = obj6;
    }

    private final void a() {
        ((WalletEngine2) this.f651b).lambda$prepareSendNFT$26((String) this.f652c, (String) this.d, (String) this.f653e, (byte[]) this.f654f, (Utilities.Callback2) this.h);
    }

    private final void b() {
        org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f651b;
        TLObject tLObject = (TLObject) this.f652c;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.d;
        String str = (String) this.f653e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f654f;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.c6 c6Var = b1Var.f43186e;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                nl0.b(false, b1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, b1Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                nl0.b(false, b1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, b1Var);
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                org.telegram.ui.Components.g5.o0(b1Var.getContext(), str, false, true, true, false, 0L, null, null, null);
            }
        } else if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                new zc(b1Var, c6Var).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str2), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, c6Var)), R.raw.error).j();
                return;
            }
            new zc(b1Var, c6Var).f0(tL_error, false);
        }
    }

    private final void c() {
        org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f651b;
        File file = (File) this.f652c;
        org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.d;
        String str = (String) this.f653e;
        String str2 = (String) this.f654f;
        String str3 = (String) this.h;
        if (file == null) {
            a2Var.c(500L);
            return;
        }
        int[] iArr = new int[11];
        Utilities.globalQueue.postRunnable(new mh0(file, iArr, new df(b1Var, iArr, file, a2Var, str, str2, str3, 10), 19));
    }

    private final void e() {
        xh.q1.Q((xh.q1) this.f651b, (org.telegram.ui.ActionBar.a2) this.f652c, (TLObject) this.d, (qg.f2) this.f653e, (Utilities.Callback) this.f654f, (TLRPC.TL_error) this.h);
    }

    private final void f() {
        yh.s3.d1((yh.s3) this.f651b, (TLObject) this.f652c, (CharSequence) this.d, (TL_stars.TL_starGiftUnique) this.f653e, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f654f, (TLRPC.TL_error) this.h);
    }

    private final void g() {
        yh.s3.z0((yh.s3) this.f651b, (TLObject) this.f652c, (tg.m1[]) this.d, (Long) this.f653e, (pi.h) this.f654f, (TLRPC.TL_error) this.h);
    }

    private final void h() {
        yh.n5 n5Var = (yh.n5) this.f651b;
        List list = (List) this.f652c;
        qh.r rVar = (qh.r) this.d;
        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f653e;
        c5.h hVar = (c5.h) this.f654f;
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
        ConnectionsManager.getInstance(n5Var.f53134a).sendRequest(tL_payments_canPurchaseStore, new oh1(oVar, hVar, rVar, activity, tL_inputStorePaymentStarsGiveaway, list, 3));
    }

    private final void i() {
        yh.n5 n5Var = (yh.n5) this.f651b;
        Runnable runnable = (Runnable) this.f652c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.f653e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f654f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        if (!n5Var.f53137e) {
            yh.n5.e("NO_BALANCE");
            runnable.run();
            return;
        }
        n5Var.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
    }

    private final void j() {
        String str;
        yh.n5 n5Var = (yh.n5) this.f651b;
        TLObject tLObject = (TLObject) this.f652c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.f653e;
        gj gjVar = (gj) this.f654f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            n5Var.Y(messageObject, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, gjVar, null);
        } else {
            if (tL_error == null) {
                str = "NO_PAYMENT_FORM";
            } else {
                str = tL_error.text;
            }
            yh.n5.e(str);
        }
        gjVar.run();
    }

    private final void k() {
        ((boolean[]) this.f652c)[0] = true;
        ((yh.n5) this.f651b).a0((MessageObject) this.d, (TLRPC.InputInvoice) this.f653e, (TLRPC.TL_payments_paymentFormStars) this.f654f, new yh.v0(1, (Utilities.Callback) this.h));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.a9.run():void");
    }

    public a9(org.telegram.ui.yb ybVar, TLRPC.ChannelParticipant channelParticipant, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, org.telegram.ui.va vaVar) {
        this.f650a = 5;
        this.f651b = ybVar;
        this.f654f = channelParticipant;
        this.f652c = arrayList;
        this.d = arrayList2;
        this.f653e = arrayList3;
        this.h = vaVar;
    }
}
