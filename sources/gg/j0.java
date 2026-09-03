package gg;

import android.widget.ImageView;
import java.util.ArrayList;
import kh.d6;
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
import org.telegram.ui.da;
import org.telegram.ui.fp;
import org.telegram.ui.ln;
import org.telegram.ui.qr;
import org.telegram.ui.rr;
import org.telegram.ui.x5;
import org.telegram.ui.zn;
public final class j0 implements Runnable {
    public final int f6664a;
    public final Object f6665b;
    public final Object f6666c;
    public final Object d;
    public final Object e;
    public final Object f6667f;

    public j0(int i10, Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error) {
        this.f6664a = i10;
        this.e = obj;
        this.f6667f = obj2;
        this.f6666c = obj3;
        this.d = obj4;
        this.f6665b = tL_error;
    }

    private final void a() {
        zn znVar = (zn) this.f6665b;
        boolean[] zArr = (boolean[]) this.e;
        boolean[] zArr2 = (boolean[]) this.f6667f;
        ImageView imageView = (ImageView) this.f6666c;
        ImageView imageView2 = (ImageView) this.d;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(jArr, zArr2, imageView, imageView2, 28);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = znVar.f40515a5.getId();
        tL_messages_rateTranscribedAudio.peer = znVar.getMessagesController().getInputPeer(znVar.f40515a5.messageOwner.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = znVar.f40515a5.messageOwner.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        znVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new da(znVar, cVar, jArr, 4));
        AndroidUtilities.runOnUIThread(cVar, 150L);
    }

    private final void b() {
        ln lnVar = (ln) this.f6665b;
        org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.f6667f;
        MessageObject messageObject = (MessageObject) this.f6666c;
        x5 x5Var = (x5) this.d;
        zn znVar = lnVar.f35808a;
        if (((TLRPC.Message) this.e).suggested_post.schedule_date == 0) {
            d2VarArr[0].setOnDismissListener(null);
            g3 g3Var = z4.T(znVar.getParentActivity(), 0L, new mg.w(19, lnVar, messageObject), znVar.getResourceProvider(), 1).f19500a;
            g3Var.show();
            g3Var.setOnDismissListener(x5Var);
            return;
        }
        znVar.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f19180id, 0);
    }

    private final void c() {
        fp fpVar = (fp) this.e;
        String str = (String) this.f6667f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f6665b;
        TLObject tLObject = (TLObject) this.f6666c;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.d;
        fpVar.f34184e0 = 0;
        String str2 = fpVar.f34186f0;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                fpVar.f34185f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
                fpVar.f34185f.setTextColorByKey(j6.f20219w6);
                fpVar.f34188h0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                fpVar.f34185f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                fpVar.f34185f.setTextColor(j6.w0(null, j6.f20097p7, false));
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    fpVar.f34185f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                } else {
                    fpVar.f34185f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                }
                fpVar.f34185f.setTextColor(j6.w0(null, j6.F6, false));
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                fpVar.Z = false;
                fpVar.Z();
            } else {
                fpVar.f34185f.setText(LocaleController.getString(R.string.LinkInUse));
                fpVar.f34185f.setTextColorByKey(j6.f20097p7);
            }
            fpVar.f34188h0 = false;
        }
    }

    private final void e() {
        qr qrVar = (qr) this.f6665b;
        ArrayList arrayList = (ArrayList) this.e;
        a0.h hVar = (a0.h) this.f6667f;
        ArrayList arrayList2 = (ArrayList) this.f6666c;
        ArrayList arrayList3 = (ArrayList) this.d;
        tf.j1 j1Var = qrVar.h;
        rr rrVar = qrVar.f37464y;
        if (rrVar.l1) {
            qrVar.f37461s = false;
            qrVar.d = arrayList;
            qrVar.e = hVar;
            qrVar.f37458f = arrayList2;
            j1Var.f(arrayList, null);
            if (!ChatObject.isChannel(rrVar.f37992r)) {
                ArrayList arrayList4 = j1Var.f44823g;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
            }
            int i10 = qrVar.f37460r;
            qrVar.l();
            if (qrVar.f37460r > i10) {
                rrVar.y0(i10);
            }
            if (!j1Var.e() && qrVar.f37460r == 0) {
                rrVar.f37958b.e(false, true);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gg.j0.run():void");
    }

    public j0(v2 v2Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        this.f6664a = 3;
        this.e = v2Var;
        this.f6666c = tLObject;
        this.f6667f = userFull;
        this.d = tL_birthday;
        this.f6665b = tL_error;
    }

    public j0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f6664a = i10;
        this.f6665b = obj;
        this.e = obj2;
        this.f6667f = obj3;
        this.f6666c = obj4;
        this.d = obj5;
    }

    public j0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i10) {
        this.f6664a = i10;
        this.e = obj;
        this.f6667f = obj2;
        this.f6665b = tL_error;
        this.f6666c = tLObject;
        this.d = obj3;
    }

    public j0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i10) {
        this.f6664a = i10;
        this.e = obj;
        this.f6665b = tL_error;
        this.f6667f = obj2;
        this.f6666c = obj3;
        this.d = tLObject;
    }

    public j0(d6 d6Var, TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f6664a = 4;
        this.e = d6Var;
        this.f6666c = tLObject;
        this.f6667f = tL_inputStorePaymentGiftPremium;
        this.f6665b = tL_error;
        this.d = tL_payments_canPurchaseStore;
    }

    public j0(t7 t7Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.f6664a = 10;
        this.f6665b = t7Var;
        this.f6667f = d2Var;
        this.f6666c = tLObject;
        this.d = inputSavedStarGift;
        this.e = callback;
    }

    public j0(TLObject tLObject, MessagesController messagesController, c1 c1Var, m mVar, TLRPC.TL_error tL_error) {
        this.f6664a = 2;
        this.f6666c = tLObject;
        this.d = messagesController;
        this.e = c1Var;
        this.f6667f = mVar;
        this.f6665b = tL_error;
    }

    public j0(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.f6664a = i10;
        this.f6665b = tL_error;
        this.e = callback;
        this.f6666c = tLObject;
        this.d = messagesController;
        this.f6667f = callback2;
    }
}
