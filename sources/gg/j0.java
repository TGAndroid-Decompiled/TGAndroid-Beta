package gg;

import android.widget.ImageView;
import java.util.ArrayList;
import kh.e6;
import lh.t7;
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
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ba;
import org.telegram.ui.dp;
import org.telegram.ui.jn;
import org.telegram.ui.or;
import org.telegram.ui.pr;
import org.telegram.ui.v5;
import org.telegram.ui.xn;
public final class j0 implements Runnable {
    public final int f6677a;
    public final Object f6678b;
    public final Object f6679c;
    public final Object d;
    public final Object e;
    public final Object f6680f;

    public j0(int i10, Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error) {
        this.f6677a = i10;
        this.e = obj;
        this.f6680f = obj2;
        this.f6679c = obj3;
        this.d = obj4;
        this.f6678b = tL_error;
    }

    private final void a() {
        xn xnVar = (xn) this.f6678b;
        boolean[] zArr = (boolean[]) this.e;
        boolean[] zArr2 = (boolean[]) this.f6680f;
        ImageView imageView = (ImageView) this.f6679c;
        ImageView imageView2 = (ImageView) this.d;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(jArr, zArr2, imageView, imageView2, 28);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = xnVar.f39949a5.getId();
        tL_messages_rateTranscribedAudio.peer = xnVar.getMessagesController().getInputPeer(xnVar.f39949a5.messageOwner.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = xnVar.f39949a5.messageOwner.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        xnVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new ba(xnVar, cVar, jArr, 4));
        AndroidUtilities.runOnUIThread(cVar, 150L);
    }

    private final void b() {
        jn jnVar = (jn) this.f6678b;
        org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.f6680f;
        MessageObject messageObject = (MessageObject) this.f6679c;
        v5 v5Var = (v5) this.d;
        xn xnVar = jnVar.f35381a;
        if (((TLRPC.Message) this.e).suggested_post.schedule_date == 0) {
            d2VarArr[0].setOnDismissListener(null);
            g3 g3Var = z4.T(xnVar.getParentActivity(), 0L, new mg.w(19, jnVar, messageObject), xnVar.getResourceProvider(), 1).f19525a;
            g3Var.show();
            g3Var.setOnDismissListener(v5Var);
            return;
        }
        xnVar.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f19205id, 0);
    }

    private final void c() {
        dp dpVar = (dp) this.e;
        String str = (String) this.f6680f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f6678b;
        TLObject tLObject = (TLObject) this.f6679c;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.d;
        dpVar.f33753e0 = 0;
        String str2 = dpVar.f33755f0;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                dpVar.f33754f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
                dpVar.f33754f.setTextColorByKey(j6.f20244w6);
                dpVar.f33757h0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                dpVar.f33754f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                dpVar.f33754f.setTextColor(j6.w0(null, j6.f20122p7, false));
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    dpVar.f33754f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                } else {
                    dpVar.f33754f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                }
                dpVar.f33754f.setTextColor(j6.w0(null, j6.F6, false));
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                dpVar.Z = false;
                dpVar.Z();
            } else {
                dpVar.f33754f.setText(LocaleController.getString(R.string.LinkInUse));
                dpVar.f33754f.setTextColorByKey(j6.f20122p7);
            }
            dpVar.f33757h0 = false;
        }
    }

    private final void e() {
        or orVar = (or) this.f6678b;
        ArrayList arrayList = (ArrayList) this.e;
        a0.h hVar = (a0.h) this.f6680f;
        ArrayList arrayList2 = (ArrayList) this.f6679c;
        ArrayList arrayList3 = (ArrayList) this.d;
        tf.k1 k1Var = orVar.h;
        pr prVar = orVar.f36967y;
        if (prVar.l1) {
            orVar.f36964s = false;
            orVar.d = arrayList;
            orVar.e = hVar;
            orVar.f36961f = arrayList2;
            k1Var.f(arrayList, null);
            if (!ChatObject.isChannel(prVar.f37481r)) {
                ArrayList arrayList4 = k1Var.f44773g;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
            }
            int i10 = orVar.f36963r;
            orVar.l();
            if (orVar.f36963r > i10) {
                prVar.y0(i10);
            }
            if (!k1Var.e() && orVar.f36963r == 0) {
                prVar.f37447b.e(false, true);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gg.j0.run():void");
    }

    public j0(v2 v2Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        this.f6677a = 3;
        this.e = v2Var;
        this.f6679c = tLObject;
        this.f6680f = userFull;
        this.d = tL_birthday;
        this.f6678b = tL_error;
    }

    public j0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f6677a = i10;
        this.f6678b = obj;
        this.e = obj2;
        this.f6680f = obj3;
        this.f6679c = obj4;
        this.d = obj5;
    }

    public j0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i10) {
        this.f6677a = i10;
        this.e = obj;
        this.f6680f = obj2;
        this.f6678b = tL_error;
        this.f6679c = tLObject;
        this.d = obj3;
    }

    public j0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i10) {
        this.f6677a = i10;
        this.e = obj;
        this.f6678b = tL_error;
        this.f6680f = obj2;
        this.f6679c = obj3;
        this.d = tLObject;
    }

    public j0(e6 e6Var, TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f6677a = 4;
        this.e = e6Var;
        this.f6679c = tLObject;
        this.f6680f = tL_inputStorePaymentGiftPremium;
        this.f6678b = tL_error;
        this.d = tL_payments_canPurchaseStore;
    }

    public j0(t7 t7Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.f6677a = 10;
        this.f6678b = t7Var;
        this.f6680f = d2Var;
        this.f6679c = tLObject;
        this.d = inputSavedStarGift;
        this.e = callback;
    }

    public j0(TLObject tLObject, MessagesController messagesController, c1 c1Var, m mVar, TLRPC.TL_error tL_error) {
        this.f6677a = 2;
        this.f6679c = tLObject;
        this.d = messagesController;
        this.e = c1Var;
        this.f6680f = mVar;
        this.f6678b = tL_error;
    }

    public j0(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.f6677a = i10;
        this.f6678b = tL_error;
        this.e = callback;
        this.f6679c = tLObject;
        this.d = messagesController;
        this.f6680f = callback2;
    }
}
