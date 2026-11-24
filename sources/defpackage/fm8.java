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
public final class fm8 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public fm8(Object obj, Object obj2, he heVar, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = heVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        k47 k47Var = null;
        r1 = null;
        r1 = null;
        nl1 nl1Var = null;
        k47Var = null;
        boolean z = false;
        switch (this.a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                gm.c3(new jy6(privacySettingsActivity, (he) this.c, tLObject, (TL_account.setAccountTTL) this.d, (byte) 25));
                return;
            case 1:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.e7;
                gm.c3(new hz7((Object) ((ProfileActivity) this.b), tLObject, (Object) ((TLRPC.UserFull) this.c), (Object) tL_birthday, tL_error, (byte) 12));
                return;
            case 2:
                jp8 jp8Var = (jp8) this.d;
                RectF rectF2 = ProfileActivity.e7;
                gm.c3(new hz7((Object) ((ProfileActivity) this.b), tLObject, (Object) ((TLRPC.TL_username) this.c), (Object) jp8Var, tL_error, (byte) 10));
                return;
            case 3:
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.e7;
                gm.c3(new hz7((Object) ((ProfileActivity) this.b), tLObject, (Object) ((String) this.c), (Object) user, tL_error, (byte) 11));
                return;
            case 4:
                gm.c3(new no8((sp8) this.b, tLObject, (z8c) this.c, (TLRPC.Photo) this.d, (byte) 1));
                return;
            case 5:
                gm.c3(new hz7((Object) ((pz8) this.b), tLObject, (Object) ((ArrayList) this.c), (Object) ((TLRPC.TL_messages_sendQuickReplyMessages) this.d), tL_error, (byte) 15));
                return;
            case 6:
                gm.c3(new hz7((k0a) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, (TLRPC.User) this.d, (byte) 18));
                return;
            case 7:
                gm.c3(new hz7((j3a) this.b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d));
                return;
            case 8:
                gm.c3(new z3a((a6a) this.b, (String) this.c, (List) this.d, (byte) 1));
                return;
            case 9:
                gm.c3(new no8((a6a) this.b, tLObject, (m5a) this.c, (String) this.d, (byte) 14));
                return;
            case 10:
                a6a a6aVar = (a6a) this.b;
                d dVar = (d) this.c;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.d;
                if (tL_error == null) {
                    a6aVar.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    gm.c3(new v3a(a6aVar, tL_error, dVar, tL_messages_editMessage, (byte) 0));
                    return;
                }
            case 11:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                sessionsActivity.getClass();
                gm.c3(new no8(sessionsActivity, (he) this.c, tL_error, (TLObject) ((TLRPC.TL_authorization) this.d), (byte) 19));
                return;
            case 12:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.b;
                sessionsActivity2.getClass();
                gm.c3(new no8(sessionsActivity2, (he) this.c, tL_error, (TLObject) ((TLRPC.TL_webAuthorization) this.d), (byte) 18));
                return;
            case 13:
                gm.c3(new no8(tLObject, (boolean[]) this.b, (yu0) this.c, (TLRPC.UserFull) this.d, (byte) 22));
                return;
            case 14:
                wsa wsaVar = (wsa) this.b;
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) this.d;
                he heVar = (he) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    oc7.r1(wsaVar.a).d4(messages_messages.users, false);
                    oc7.r1(wsaVar.a).X3(messages_messages.chats, false);
                    int i = 0;
                    while (true) {
                        if (i < messages_messages.messages.size()) {
                            TLRPC.Message message = messages_messages.messages.get(i);
                            if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                                k47Var = new k47(wsaVar.a, message, false, false);
                                k47Var.K5();
                            } else {
                                i++;
                            }
                        }
                    }
                }
                if (k47Var != null) {
                    gm.c3(new hw9(wsaVar, heVar, k47Var, (byte) 20));
                    return;
                } else {
                    gm.c3(new td(heVar, (byte) 6));
                    return;
                }
            case 15:
                wsa wsaVar2 = (wsa) this.b;
                k11 k11Var = (k11) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    oc7.r1(wsaVar2.a).T3((TLRPC.Updates) tLObject, false);
                    gm.c3(new hw9(wsaVar2, k11Var, tL_starGiftUnique, (byte) 16));
                    return;
                } else if (tL_error != null) {
                    if (tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                        gm.c3(new hq6(wsaVar2, k11Var, Long.parseLong(tL_error.text.substring(26)), (byte) 26));
                        return;
                    } else {
                        gm.c3(new hw9(wsaVar2, k11Var, tL_error, (byte) 17));
                        return;
                    }
                } else {
                    return;
                }
            case 16:
                gm.c3(new no8((wsa) this.b, tLObject, (TL_wallet.nftItem) this.c, (String) this.d, (byte) 25));
                return;
            case 17:
                gm.c3(new hz7((jva) this.b, tL_error, (jac) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, (byte) 27));
                return;
            case 18:
                gm.c3(new vua((jva) this.b, tL_error, (lf2) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, (byte) 0));
                return;
            case 19:
                gm.c3(new hz7((jva) this.b, tL_error, (fv4) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, (byte) 24));
                return;
            case 20:
                iza izaVar = (iza) this.b;
                String str = (String) this.c;
                wza wzaVar = (wza) this.d;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        jza jzaVar = izaVar.r;
                        byte b = jzaVar.i;
                        if (jzaVar == izaVar.x.x) {
                            z = true;
                        }
                        nl1Var = xza.f0(jSONObject, b, z);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(izaVar.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                gm.c3(new hza(izaVar, nl1Var, str, wzaVar, (byte) 0));
                return;
            case 21:
                gm.c3(new vua((x2b) this.b, (String) this.c, tL_error, tLObject, (TextView) this.d));
                return;
            case 22:
                gm.c3(new vua((v7b) this.b, (he) this.c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error));
                return;
            case 23:
                gm.c3(new vua((ycb) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error));
                return;
            case 24:
                gm.c3(new hza(tLObject, (amb) this.b, (bmb) this.c, (TLRPC.TL_theme) this.d, (byte) 10));
                return;
            case 25:
                gm.c3(new hza((svb) this.b, tLObject, (String) this.d, (he) this.c, (byte) 12));
                return;
            case 26:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.e.c(new hza(twoStepVerificationActivity, bArr, tLObject, bArr2, (byte) 17));
                    return;
                } else {
                    gm.c3(new x4c(twoStepVerificationActivity, tL_error, (byte) 1));
                    return;
                }
            case 27:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$48((TL_phone.PhoneCall) this.c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            case 28:
                VoIPService.lambda$startConferenceGroupCall$52((ArrayList) this.b, (ArrayList) this.c, (ljc) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$44((ArrayList) this.b, (ArrayList) this.c, (ljc) this.d, tLObject, tL_error);
                return;
        }
    }

    public fm8(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
