package hg;

import android.widget.ImageView;
import java.util.ArrayList;
import lh.e6;
import mh.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ba;
import org.telegram.ui.ep;
import org.telegram.ui.jn;
import org.telegram.ui.pr;
import org.telegram.ui.qr;
import org.telegram.ui.v5;
import org.telegram.ui.xn;
public final class j0 implements Runnable {
    public final int f7524a;
    public final Object f7525b;
    public final Object f7526c;
    public final Object d;
    public final Object f7527e;
    public final Object f7528f;

    public j0(int i10, Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error) {
        this.f7524a = i10;
        this.f7527e = obj;
        this.f7528f = obj2;
        this.f7526c = obj3;
        this.d = obj4;
        this.f7525b = tL_error;
    }

    private final void a() {
        xn xnVar = (xn) this.f7525b;
        boolean[] zArr = (boolean[]) this.f7527e;
        boolean[] zArr2 = (boolean[]) this.f7528f;
        ImageView imageView = (ImageView) this.f7526c;
        ImageView imageView2 = (ImageView) this.d;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(jArr, zArr2, imageView, imageView2, 28);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = xnVar.f43095a5.getId();
        tL_messages_rateTranscribedAudio.peer = xnVar.getMessagesController().getInputPeer(xnVar.f43095a5.messageOwner.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = xnVar.f43095a5.messageOwner.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        xnVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new ba(xnVar, cVar, jArr, 4));
        AndroidUtilities.runOnUIThread(cVar, 150L);
    }

    private final void b() {
        jn jnVar = (jn) this.f7525b;
        org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.f7528f;
        MessageObject messageObject = (MessageObject) this.f7526c;
        v5 v5Var = (v5) this.d;
        xn xnVar = jnVar.f38085a;
        if (((TLRPC.Message) this.f7527e).suggested_post.schedule_date == 0) {
            d2VarArr[0].setOnDismissListener(null);
            h3 h3Var = z4.T(xnVar.getParentActivity(), 0L, new ng.w(19, jnVar, messageObject), xnVar.getResourceProvider(), 1).f21209a;
            h3Var.show();
            h3Var.setOnDismissListener(v5Var);
            return;
        }
        xnVar.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f20866id, 0);
    }

    private final void c() {
        ep epVar = (ep) this.f7527e;
        String str = (String) this.f7528f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f7525b;
        TLObject tLObject = (TLObject) this.f7526c;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.d;
        epVar.f36544e0 = 0;
        String str2 = epVar.f36546f0;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                epVar.f36545f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
                epVar.f36545f.setTextColorByKey(k6.f22000w6);
                epVar.f36548h0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                epVar.f36545f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                epVar.f36545f.setTextColor(k6.w0(null, k6.f21878p7, false));
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    epVar.f36545f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                } else {
                    epVar.f36545f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                }
                epVar.f36545f.setTextColor(k6.w0(null, k6.F6, false));
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                epVar.Z = false;
                epVar.Z();
            } else {
                epVar.f36545f.setText(LocaleController.getString(R.string.LinkInUse));
                epVar.f36545f.setTextColorByKey(k6.f21878p7);
            }
            epVar.f36548h0 = false;
        }
    }

    private final void e() {
        pr prVar = (pr) this.f7525b;
        ArrayList arrayList = (ArrayList) this.f7527e;
        a0.h hVar = (a0.h) this.f7528f;
        ArrayList arrayList2 = (ArrayList) this.f7526c;
        ArrayList arrayList3 = (ArrayList) this.d;
        uf.k1 k1Var = prVar.h;
        qr qrVar = prVar.f40116y;
        if (qrVar.l1) {
            prVar.f40113s = false;
            prVar.d = arrayList;
            prVar.f40109e = hVar;
            prVar.f40110f = arrayList2;
            k1Var.f(arrayList, null);
            if (!ChatObject.isChannel(qrVar.f40605r)) {
                ArrayList arrayList4 = k1Var.f48659g;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
            }
            int i10 = prVar.f40112r;
            prVar.l();
            if (prVar.f40112r > i10) {
                qrVar.y0(i10);
            }
            if (!k1Var.e() && prVar.f40112r == 0) {
                qrVar.f40570b.e(false, true);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hg.j0.run():void");
    }

    public j0(v2 v2Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        this.f7524a = 3;
        this.f7527e = v2Var;
        this.f7526c = tLObject;
        this.f7528f = userFull;
        this.d = tL_birthday;
        this.f7525b = tL_error;
    }

    public j0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f7524a = i10;
        this.f7525b = obj;
        this.f7527e = obj2;
        this.f7528f = obj3;
        this.f7526c = obj4;
        this.d = obj5;
    }

    public j0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i10) {
        this.f7524a = i10;
        this.f7527e = obj;
        this.f7528f = obj2;
        this.f7525b = tL_error;
        this.f7526c = tLObject;
        this.d = obj3;
    }

    public j0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i10) {
        this.f7524a = i10;
        this.f7527e = obj;
        this.f7525b = tL_error;
        this.f7528f = obj2;
        this.f7526c = obj3;
        this.d = tLObject;
    }

    public j0(e6 e6Var, TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f7524a = 4;
        this.f7527e = e6Var;
        this.f7526c = tLObject;
        this.f7528f = tL_inputStorePaymentGiftPremium;
        this.f7525b = tL_error;
        this.d = tL_payments_canPurchaseStore;
    }

    public j0(t7 t7Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.f7524a = 10;
        this.f7525b = t7Var;
        this.f7528f = d2Var;
        this.f7526c = tLObject;
        this.d = inputSavedStarGift;
        this.f7527e = callback;
    }

    public j0(TLObject tLObject, MessagesController messagesController, c1 c1Var, m mVar, TLRPC.TL_error tL_error) {
        this.f7524a = 2;
        this.f7526c = tLObject;
        this.d = messagesController;
        this.f7527e = c1Var;
        this.f7528f = mVar;
        this.f7525b = tL_error;
    }

    public j0(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.f7524a = i10;
        this.f7525b = tL_error;
        this.f7527e = callback;
        this.f7526c = tLObject;
        this.d = messagesController;
        this.f7528f = callback2;
    }
}
