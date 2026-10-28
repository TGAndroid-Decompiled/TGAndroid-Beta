package bi;

import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cp;
import org.telegram.ui.hn;
import org.telegram.ui.iq;
import org.telegram.ui.wn;
public final class u0 implements Runnable {
    public final int f5503a;
    public final Object f5504b;
    public final Object f5505c;
    public final Object d;
    public final Object e;
    public final Object f5506f;

    public u0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f5503a = i10;
        this.f5505c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5506f = obj4;
        this.f5504b = obj5;
    }

    private final void a() {
        org.telegram.ui.nd ndVar = (org.telegram.ui.nd) this.f5505c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f5504b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f5506f;
        ndVar.X = 0;
        String str2 = ndVar.Y;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                ndVar.V.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
                org.telegram.ui.Cells.w1 w1Var = ndVar.V;
                int i10 = org.telegram.ui.ActionBar.y6.f23712w6;
                w1Var.setTag(Integer.valueOf(i10));
                org.telegram.ui.ActionBar.f7.V(ndVar.V, i10, null);
                ndVar.f41744a0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                ndVar.V.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.ActionBar.f7.V(ndVar.V, org.telegram.ui.ActionBar.y6.f23582p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    ndVar.V.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                } else {
                    ndVar.V.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                }
                org.telegram.ui.ActionBar.f7.V(ndVar.V, org.telegram.ui.ActionBar.y6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.ui.ActionBar.f7.V(ndVar.V, org.telegram.ui.ActionBar.y6.f23582p7, null);
                ndVar.f41757k0 = false;
                ndVar.h0();
            } else {
                org.telegram.ui.ActionBar.f7.V(ndVar.V, org.telegram.ui.ActionBar.y6.f23582p7, null);
                ndVar.V.setText(LocaleController.getString(R.string.LinkInUse));
            }
            ndVar.f41744a0 = false;
        }
    }

    private final void b() {
        wn wnVar = (wn) this.f5505c;
        boolean[] zArr = (boolean[]) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        ImageView imageView = (ImageView) this.f5506f;
        ImageView imageView2 = (ImageView) this.f5504b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        m4.v0 v0Var = new m4.v0(jArr, zArr2, imageView, imageView2, 14);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = wnVar.f45291t5.getId();
        tL_messages_rateTranscribedAudio.peer = wnVar.getMessagesController().getInputPeer(wnVar.f45291t5.messageOwner.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = wnVar.f45291t5.messageOwner.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        wnVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.ea(wnVar, v0Var, jArr, 4));
        AndroidUtilities.runOnUIThread(v0Var, 150L);
    }

    private final void c() {
        hn hnVar = (hn) this.f5505c;
        org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) this.e;
        MessageObject messageObject = (MessageObject) this.f5506f;
        org.telegram.ui.u5 u5Var = (org.telegram.ui.u5) this.f5504b;
        wn wnVar = hnVar.f39938a;
        if (((TLRPC.Message) this.d).suggested_post.schedule_date == 0) {
            e2VarArr[0].setOnDismissListener(null);
            org.telegram.ui.ActionBar.k3 k3Var = org.telegram.ui.Components.g5.S(wnVar.getParentActivity(), 0L, new m4.s0(20, hnVar, messageObject), wnVar.getResourceProvider(), 1).f22602a;
            k3Var.show();
            k3Var.setOnDismissListener(u5Var);
            return;
        }
        wnVar.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f22049id, 0);
    }

    private final void d() {
        cp cpVar = (cp) this.f5505c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f5504b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f5506f;
        cpVar.f38412h0 = 0;
        String str2 = cpVar.f38413i0;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                cpVar.h.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
                cpVar.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.f23712w6);
                cpVar.f38415k0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                cpVar.h.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.ActionBar.f7.V(cpVar.h.getTextView(), org.telegram.ui.ActionBar.y6.f23582p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    cpVar.h.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                } else {
                    cpVar.h.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                }
                org.telegram.ui.ActionBar.f7.V(cpVar.h.getTextView(), org.telegram.ui.ActionBar.y6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                cpVar.f38406c0 = false;
                cpVar.b0();
            } else {
                cpVar.h.setText(LocaleController.getString(R.string.LinkInUse));
                cpVar.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.f23582p7);
            }
            cpVar.f38415k0 = false;
        }
    }

    private final void f() {
        iq.Z((iq) this.f5505c, (TLRPC.TL_error) this.f5504b, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, (TLRPC.TL_channels_editCreator) this.f5506f);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.u0.run():void");
    }

    public u0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i10) {
        this.f5503a = i10;
        this.f5505c = obj;
        this.d = obj2;
        this.f5504b = tL_error;
        this.e = tLObject;
        this.f5506f = obj3;
    }

    public u0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i10) {
        this.f5503a = i10;
        this.f5505c = obj;
        this.f5504b = tL_error;
        this.d = obj2;
        this.e = obj3;
        this.f5506f = tLObject;
    }

    public u0(Object obj, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TLObject tLObject2, Object obj2, int i10) {
        this.f5503a = i10;
        this.f5505c = obj;
        this.e = e2Var;
        this.d = tLObject;
        this.f5506f = tLObject2;
        this.f5504b = obj2;
    }

    public u0(org.telegram.ui.qb qbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f5503a = 22;
        this.f5505c = qbVar;
        this.d = tL_chatInviteExported;
        this.f5506f = tL_messages_exportedChatInvite;
        this.f5504b = zArr;
        this.e = e2Var;
    }
}
