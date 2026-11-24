package defpackage;

import android.graphics.RectF;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class ck8 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ck8(Object obj, Object obj2, hd hdVar, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = hdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        k27 k27Var = null;
        r1 = null;
        r1 = null;
        fk1 fk1Var = null;
        k27Var = null;
        boolean z = true;
        switch (this.a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                gl.d3(new jw6(privacySettingsActivity, (hd) this.c, tLObject, (TL_account.setAccountTTL) this.d, (byte) 25));
                return;
            case 1:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.Z6;
                gl.d3(new ex7((Object) ((ProfileActivity) this.b), tLObject, (Object) ((TLRPC.UserFull) this.c), (Object) tL_birthday, tL_error, (byte) 12));
                return;
            case 2:
                in8 in8Var = (in8) this.d;
                RectF rectF2 = ProfileActivity.Z6;
                gl.d3(new ex7((Object) ((ProfileActivity) this.b), tLObject, (Object) ((TLRPC.TL_username) this.c), (Object) in8Var, tL_error, (byte) 10));
                return;
            case 3:
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.Z6;
                gl.d3(new ex7((Object) ((ProfileActivity) this.b), tLObject, (Object) ((String) this.c), (Object) user, tL_error, (byte) 11));
                return;
            case 4:
                gl.d3(new bm8((rn8) this.b, tLObject, (y6c) this.c, (TLRPC.Photo) this.d, (byte) 1));
                return;
            case 5:
                gl.d3(new ex7((Object) ((ox8) this.b), tLObject, (Object) ((ArrayList) this.c), (Object) ((TLRPC.TL_messages_sendQuickReplyMessages) this.d), tL_error, (byte) 15));
                return;
            case 6:
                gl.d3(new ex7((iy9) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, (TLRPC.User) this.d, (byte) 18));
                return;
            case 7:
                gl.d3(new ex7((h1a) this.b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d));
                return;
            case 8:
                gl.d3(new x1a((z3a) this.b, (String) this.c, (List) this.d, (byte) 1));
                return;
            case 9:
                gl.d3(new bm8((z3a) this.b, tLObject, (k3a) this.c, (String) this.d, (byte) 14));
                return;
            case 10:
                z3a z3aVar = (z3a) this.b;
                d dVar = (d) this.c;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.d;
                if (tL_error == null) {
                    z3aVar.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    gl.d3(new t1a(z3aVar, tL_error, dVar, tL_messages_editMessage, (byte) 0));
                    return;
                }
            case 11:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                sessionsActivity.getClass();
                gl.d3(new bm8((Object) sessionsActivity, (Object) ((hd) this.c), tL_error, (Object) ((TLRPC.TL_authorization) this.d), (byte) 19));
                return;
            case 12:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.b;
                sessionsActivity2.getClass();
                gl.d3(new bm8((Object) sessionsActivity2, (Object) ((hd) this.c), tL_error, (Object) ((TLRPC.TL_webAuthorization) this.d), (byte) 18));
                return;
            case 13:
                gl.d3(new bm8(tLObject, (boolean[]) this.b, (pt0) this.c, (TLRPC.UserFull) this.d));
                return;
            case 14:
                vqa vqaVar = (vqa) this.b;
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) this.d;
                hd hdVar = (hd) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    na7.q1(vqaVar.a).a4(messages_messages.users, false);
                    na7.q1(vqaVar.a).U3(messages_messages.chats, false);
                    int i = 0;
                    while (true) {
                        if (i < messages_messages.messages.size()) {
                            TLRPC.Message message = messages_messages.messages.get(i);
                            if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                                k27Var = new k27(vqaVar.a, message, false, false);
                                k27Var.K5();
                            } else {
                                i++;
                            }
                        }
                    }
                }
                if (k27Var != null) {
                    gl.d3(new q3a(vqaVar, hdVar, k27Var, (byte) 17));
                    return;
                } else {
                    gl.d3(new tc(hdVar, (byte) 6));
                    return;
                }
            case 15:
                vqa vqaVar2 = (vqa) this.b;
                c01 c01Var = (c01) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    na7.q1(vqaVar2.a).Q3((TLRPC.Updates) tLObject, false);
                    gl.d3(new q3a(vqaVar2, c01Var, tL_starGiftUnique, (byte) 13));
                    return;
                } else if (tL_error != null) {
                    if (tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                        gl.d3(new go6(vqaVar2, c01Var, Long.parseLong(tL_error.text.substring(26)), (byte) 26));
                        return;
                    } else {
                        gl.d3(new q3a(vqaVar2, c01Var, tL_error, (byte) 14));
                        return;
                    }
                } else {
                    return;
                }
            case 16:
                gl.d3(new bm8((vqa) this.b, tLObject, (TL_wallet.nftItem) this.c, (String) this.d, (byte) 25));
                return;
            case 17:
                gl.d3(new ex7((gta) this.b, tL_error, (i8c) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, (byte) 27));
                return;
            case 18:
                gl.d3(new tsa((gta) this.b, tL_error, (ae2) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, (byte) 0));
                return;
            case 19:
                gl.d3(new ex7((gta) this.b, tL_error, (et4) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, (byte) 24));
                return;
            case 20:
                fxa fxaVar = (fxa) this.b;
                String str = (String) this.c;
                txa txaVar = (txa) this.d;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        gxa gxaVar = fxaVar.r;
                        byte b = gxaVar.i;
                        if (gxaVar != fxaVar.x.x) {
                            z = false;
                        }
                        fk1Var = uxa.e0(jSONObject, b, z);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(fxaVar.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                gl.d3(new exa(fxaVar, fk1Var, str, txaVar, (byte) 0));
                return;
            case 21:
                gl.d3(new tsa((u0b) this.b, (String) this.c, tL_error, tLObject, (TextView) this.d));
                return;
            case 22:
                gl.d3(new tsa((t5b) this.b, (hd) this.c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error));
                return;
            case 23:
                gl.d3(new tsa((xab) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error));
                return;
            case 24:
                gl.d3(new exa(tLObject, (zjb) this.b, (akb) this.c, (TLRPC.TL_theme) this.d, (byte) 10));
                return;
            case 25:
                gl.d3(new exa((rtb) this.b, tLObject, (String) this.d, (hd) this.c, (byte) 12));
                return;
            case 26:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.e.c(new exa(twoStepVerificationActivity, bArr, tLObject, bArr2, (byte) 17));
                    return;
                } else {
                    gl.d3(new a5b(twoStepVerificationActivity, tL_error, (byte) 29));
                    return;
                }
            case 27:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$48((TL_phone.PhoneCall) this.c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            case 28:
                VoIPService.lambda$startConferenceGroupCall$52((ArrayList) this.b, (ArrayList) this.c, (khc) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$44((ArrayList) this.b, (ArrayList) this.c, (khc) this.d, tLObject, tL_error);
                return;
        }
    }

    public ck8(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
