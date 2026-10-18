package ai;

import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dq;
import org.telegram.ui.en;
import org.telegram.ui.sn;
import org.telegram.ui.yo;
public final class t0 implements Runnable {
    public final int f2190a;
    public final Object f2191b;
    public final Object f2192c;
    public final Object d;
    public final Object e;
    public final Object f2193f;

    public t0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f2190a = i10;
        this.f2192c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2193f = obj4;
        this.f2191b = obj5;
    }

    private final void a() {
        org.telegram.ui.od odVar = (org.telegram.ui.od) this.f2192c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2191b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f2193f;
        odVar.W = 0;
        String str2 = odVar.X;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                odVar.U.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
                org.telegram.ui.Cells.y1 y1Var = odVar.U;
                int i10 = org.telegram.ui.ActionBar.h6.f21338w6;
                y1Var.setTag(Integer.valueOf(i10));
                odVar.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                odVar.Z = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                odVar.U.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                odVar.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21207p7, false));
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    odVar.U.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                } else {
                    odVar.U.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                }
                odVar.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F6, false));
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                odVar.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21207p7, false));
                odVar.f39736j0 = false;
                odVar.f0();
            } else {
                odVar.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21207p7, false));
                odVar.U.setText(LocaleController.getString(R.string.LinkInUse));
            }
            odVar.Z = false;
        }
    }

    private final void b() {
        sn snVar = (sn) this.f2192c;
        boolean[] zArr = (boolean[]) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        ImageView imageView = (ImageView) this.f2193f;
        ImageView imageView2 = (ImageView) this.f2191b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(jArr, zArr2, imageView, imageView2, 11);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = snVar.f41175d5.getId();
        tL_messages_rateTranscribedAudio.peer = snVar.getMessagesController().getInputPeer(snVar.f41175d5.messageOwner.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = snVar.f41175d5.messageOwner.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        snVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.ea(snVar, iVar, jArr, 4));
        AndroidUtilities.runOnUIThread(iVar, 150L);
    }

    private final void c() {
        en enVar = (en) this.f2192c;
        org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.e;
        MessageObject messageObject = (MessageObject) this.f2193f;
        org.telegram.ui.w5 w5Var = (org.telegram.ui.w5) this.f2191b;
        sn snVar = enVar.f36557a;
        if (((TLRPC.Message) this.d).suggested_post.schedule_date == 0) {
            b2VarArr[0].setOnDismissListener(null);
            org.telegram.ui.ActionBar.f3 f3Var = org.telegram.ui.Components.f5.S(snVar.getParentActivity(), 0L, new m4.w0(17, enVar, messageObject), snVar.getResourceProvider(), 1).f20609a;
            f3Var.show();
            f3Var.setOnDismissListener(w5Var);
            return;
        }
        snVar.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f20293id, 0);
    }

    private final void d() {
        yo yoVar = (yo) this.f2192c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2191b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f2193f;
        yoVar.f43433h0 = 0;
        String str2 = yoVar.f43434i0;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                yoVar.f43430f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
                yoVar.f43430f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f21338w6);
                yoVar.f43436k0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                yoVar.f43430f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                yoVar.f43430f.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21207p7, false));
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    yoVar.f43430f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                } else {
                    yoVar.f43430f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                }
                yoVar.f43430f.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F6, false));
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                yoVar.f43427c0 = false;
                yoVar.Z();
            } else {
                yoVar.f43430f.setText(LocaleController.getString(R.string.LinkInUse));
                yoVar.f43430f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f21207p7);
            }
            yoVar.f43436k0 = false;
        }
    }

    private final void f() {
        dq.Y((dq) this.f2192c, (TLRPC.TL_error) this.f2191b, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, (TLRPC.TL_channels_editCreator) this.f2193f);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.t0.run():void");
    }

    public t0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i10) {
        this.f2190a = i10;
        this.f2192c = obj;
        this.d = obj2;
        this.f2191b = tL_error;
        this.e = tLObject;
        this.f2193f = obj3;
    }

    public t0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i10) {
        this.f2190a = i10;
        this.f2192c = obj;
        this.f2191b = tL_error;
        this.d = obj2;
        this.e = obj3;
        this.f2193f = tLObject;
    }

    public t0(Object obj, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLObject tLObject2, Object obj2, int i10) {
        this.f2190a = i10;
        this.f2192c = obj;
        this.e = b2Var;
        this.d = tLObject;
        this.f2193f = tLObject2;
        this.f2191b = obj2;
    }

    public t0(org.telegram.ui.rb rbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f2190a = 22;
        this.f2192c = rbVar;
        this.d = tL_chatInviteExported;
        this.f2193f = tL_messages_exportedChatInvite;
        this.f2191b = zArr;
        this.e = b2Var;
    }
}
