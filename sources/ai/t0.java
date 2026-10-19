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
import org.telegram.ui.bq;
import org.telegram.ui.cn;
import org.telegram.ui.qn;
import org.telegram.ui.wo;
public final class t0 implements Runnable {
    public final int f2178a;
    public final Object f2179b;
    public final Object f2180c;
    public final Object d;
    public final Object e;
    public final Object f2181f;

    public t0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f2178a = i10;
        this.f2180c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2181f = obj4;
        this.f2179b = obj5;
    }

    private final void a() {
        org.telegram.ui.md mdVar = (org.telegram.ui.md) this.f2180c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2179b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f2181f;
        mdVar.W = 0;
        String str2 = mdVar.X;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                mdVar.U.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
                org.telegram.ui.Cells.y1 y1Var = mdVar.U;
                int i10 = org.telegram.ui.ActionBar.h6.f21339w6;
                y1Var.setTag(Integer.valueOf(i10));
                mdVar.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                mdVar.Z = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                mdVar.U.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                mdVar.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21208p7, false));
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    mdVar.U.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                } else {
                    mdVar.U.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                }
                mdVar.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F6, false));
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                mdVar.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21208p7, false));
                mdVar.f39184j0 = false;
                mdVar.f0();
            } else {
                mdVar.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21208p7, false));
                mdVar.U.setText(LocaleController.getString(R.string.LinkInUse));
            }
            mdVar.Z = false;
        }
    }

    private final void b() {
        qn qnVar = (qn) this.f2180c;
        boolean[] zArr = (boolean[]) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        ImageView imageView = (ImageView) this.f2181f;
        ImageView imageView2 = (ImageView) this.f2179b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(jArr, zArr2, imageView, imageView2, 11);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = qnVar.f40651d5.getId();
        tL_messages_rateTranscribedAudio.peer = qnVar.getMessagesController().getInputPeer(qnVar.f40651d5.messageOwner.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = qnVar.f40651d5.messageOwner.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        qnVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.ca(qnVar, iVar, jArr, 4));
        AndroidUtilities.runOnUIThread(iVar, 150L);
    }

    private final void c() {
        cn cnVar = (cn) this.f2180c;
        org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.e;
        MessageObject messageObject = (MessageObject) this.f2181f;
        org.telegram.ui.w5 w5Var = (org.telegram.ui.w5) this.f2179b;
        qn qnVar = cnVar.f36004a;
        if (((TLRPC.Message) this.d).suggested_post.schedule_date == 0) {
            b2VarArr[0].setOnDismissListener(null);
            org.telegram.ui.ActionBar.f3 f3Var = org.telegram.ui.Components.f5.S(qnVar.getParentActivity(), 0L, new m4.w0(17, cnVar, messageObject), qnVar.getResourceProvider(), 1).f20610a;
            f3Var.show();
            f3Var.setOnDismissListener(w5Var);
            return;
        }
        qnVar.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f20294id, 0);
    }

    private final void d() {
        wo woVar = (wo) this.f2180c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2179b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f2181f;
        woVar.f42911h0 = 0;
        String str2 = woVar.f42912i0;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                woVar.f42908f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
                woVar.f42908f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f21339w6);
                woVar.f42914k0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                woVar.f42908f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                woVar.f42908f.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21208p7, false));
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    woVar.f42908f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                } else {
                    woVar.f42908f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                }
                woVar.f42908f.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F6, false));
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                woVar.f42905c0 = false;
                woVar.Z();
            } else {
                woVar.f42908f.setText(LocaleController.getString(R.string.LinkInUse));
                woVar.f42908f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f21208p7);
            }
            woVar.f42914k0 = false;
        }
    }

    private final void f() {
        bq.Y((bq) this.f2180c, (TLRPC.TL_error) this.f2179b, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, (TLRPC.TL_channels_editCreator) this.f2181f);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.t0.run():void");
    }

    public t0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i10) {
        this.f2178a = i10;
        this.f2180c = obj;
        this.d = obj2;
        this.f2179b = tL_error;
        this.e = tLObject;
        this.f2181f = obj3;
    }

    public t0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i10) {
        this.f2178a = i10;
        this.f2180c = obj;
        this.f2179b = tL_error;
        this.d = obj2;
        this.e = obj3;
        this.f2181f = tLObject;
    }

    public t0(Object obj, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLObject tLObject2, Object obj2, int i10) {
        this.f2178a = i10;
        this.f2180c = obj;
        this.e = b2Var;
        this.d = tLObject;
        this.f2181f = tLObject2;
        this.f2179b = obj2;
    }

    public t0(org.telegram.ui.pb pbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f2178a = 22;
        this.f2180c = pbVar;
        this.d = tL_chatInviteExported;
        this.f2181f = tL_messages_exportedChatInvite;
        this.f2179b = zArr;
        this.e = b2Var;
    }
}
