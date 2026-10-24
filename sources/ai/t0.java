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
import org.telegram.ui.dn;
import org.telegram.ui.dq;
import org.telegram.ui.sn;
import org.telegram.ui.yo;
public final class t0 implements Runnable {
    public final int f2181a;
    public final Object f2182b;
    public final Object f2183c;
    public final Object d;
    public final Object e;
    public final Object f2184f;

    public t0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f2181a = i10;
        this.f2183c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2184f = obj4;
        this.f2182b = obj5;
    }

    private final void a() {
        org.telegram.ui.md mdVar = (org.telegram.ui.md) this.f2183c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2182b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f2184f;
        mdVar.X = 0;
        String str2 = mdVar.Y;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                mdVar.V.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
                org.telegram.ui.Cells.x1 x1Var = mdVar.V;
                int i10 = org.telegram.ui.ActionBar.k6.f21536w6;
                x1Var.setTag(Integer.valueOf(i10));
                org.telegram.ui.ActionBar.r6.W(mdVar.V, i10, null);
                mdVar.f39535a0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                mdVar.V.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.ActionBar.r6.W(mdVar.V, org.telegram.ui.ActionBar.k6.f21405p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    mdVar.V.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                } else {
                    mdVar.V.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                }
                org.telegram.ui.ActionBar.r6.W(mdVar.V, org.telegram.ui.ActionBar.k6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.ui.ActionBar.r6.W(mdVar.V, org.telegram.ui.ActionBar.k6.f21405p7, null);
                mdVar.f39548k0 = false;
                mdVar.g0();
            } else {
                org.telegram.ui.ActionBar.r6.W(mdVar.V, org.telegram.ui.ActionBar.k6.f21405p7, null);
                mdVar.V.setText(LocaleController.getString(R.string.LinkInUse));
            }
            mdVar.f39535a0 = false;
        }
    }

    private final void b() {
        sn snVar = (sn) this.f2183c;
        boolean[] zArr = (boolean[]) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        ImageView imageView = (ImageView) this.f2184f;
        ImageView imageView2 = (ImageView) this.f2182b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(jArr, zArr2, imageView, imageView2, 11);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = snVar.p5.getId();
        tL_messages_rateTranscribedAudio.peer = snVar.getMessagesController().getInputPeer(snVar.p5.messageOwner.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = snVar.p5.messageOwner.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        snVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.ca(snVar, iVar, jArr, 4));
        AndroidUtilities.runOnUIThread(iVar, 150L);
    }

    private final void c() {
        dn dnVar = (dn) this.f2183c;
        org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.e;
        MessageObject messageObject = (MessageObject) this.f2184f;
        org.telegram.ui.v5 v5Var = (org.telegram.ui.v5) this.f2182b;
        sn snVar = dnVar.f36651a;
        if (((TLRPC.Message) this.d).suggested_post.schedule_date == 0) {
            c2VarArr[0].setOnDismissListener(null);
            org.telegram.ui.ActionBar.h3 h3Var = org.telegram.ui.Components.d5.S(snVar.getParentActivity(), 0L, new m4.w0(17, dnVar, messageObject), snVar.getResourceProvider(), 1).f20729a;
            h3Var.show();
            h3Var.setOnDismissListener(v5Var);
            return;
        }
        snVar.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f20365id, 0);
    }

    private final void d() {
        yo yoVar = (yo) this.f2183c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2182b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f2184f;
        yoVar.f43911i0 = 0;
        String str2 = yoVar.f43912j0;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                yoVar.f43907f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
                yoVar.f43907f.setTextColorByKey(org.telegram.ui.ActionBar.k6.f21536w6);
                yoVar.f43914l0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                yoVar.f43907f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.ActionBar.r6.W(yoVar.f43907f.getTextView(), org.telegram.ui.ActionBar.k6.f21405p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    yoVar.f43907f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                } else {
                    yoVar.f43907f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                }
                org.telegram.ui.ActionBar.r6.W(yoVar.f43907f.getTextView(), org.telegram.ui.ActionBar.k6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                yoVar.f43905d0 = false;
                yoVar.a0();
            } else {
                yoVar.f43907f.setText(LocaleController.getString(R.string.LinkInUse));
                yoVar.f43907f.setTextColorByKey(org.telegram.ui.ActionBar.k6.f21405p7);
            }
            yoVar.f43914l0 = false;
        }
    }

    private final void f() {
        dq.Y((dq) this.f2183c, (TLRPC.TL_error) this.f2182b, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, (TLRPC.TL_channels_editCreator) this.f2184f);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.t0.run():void");
    }

    public t0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i10) {
        this.f2181a = i10;
        this.f2183c = obj;
        this.d = obj2;
        this.f2182b = tL_error;
        this.e = tLObject;
        this.f2184f = obj3;
    }

    public t0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i10) {
        this.f2181a = i10;
        this.f2183c = obj;
        this.f2182b = tL_error;
        this.d = obj2;
        this.e = obj3;
        this.f2184f = tLObject;
    }

    public t0(Object obj, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLObject tLObject2, Object obj2, int i10) {
        this.f2181a = i10;
        this.f2183c = obj;
        this.e = c2Var;
        this.d = tLObject;
        this.f2184f = tLObject2;
        this.f2182b = obj2;
    }

    public t0(org.telegram.ui.pb pbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f2181a = 22;
        this.f2183c = pbVar;
        this.d = tL_chatInviteExported;
        this.f2184f = tL_messages_exportedChatInvite;
        this.f2182b = zArr;
        this.e = c2Var;
    }
}
