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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class qn8 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public qn8(Object obj, Object obj2, id idVar, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = idVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        r47 r47Var = null;
        r2 = null;
        r2 = null;
        ok1 ok1Var = null;
        r47Var = null;
        boolean z = true;
        switch (this.a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                hl.c3(new oy6(privacySettingsActivity, (id) this.c, tLObject, (TL_account.setAccountTTL) this.d, (byte) 26));
                return;
            case 1:
                uq8 uq8Var = (uq8) this.d;
                RectF rectF = ProfileActivity.Z6;
                hl.c3(new cp7((ProfileActivity) this.b, tLObject, (TLRPC.TL_username) this.c, uq8Var, tL_error, (byte) 11));
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF2 = ProfileActivity.Z6;
                hl.c3(new cp7((ProfileActivity) this.b, tLObject, (String) this.c, user, tL_error, (byte) 12));
                return;
            case 3:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF3 = ProfileActivity.Z6;
                hl.c3(new cp7((ProfileActivity) this.b, tLObject, (TLRPC.UserFull) this.c, tL_birthday, tL_error, (byte) 13));
                return;
            case 4:
                hl.c3(new vp8((cr8) this.b, tLObject, (yac) this.c, (TLRPC.Photo) this.d, (byte) 2));
                return;
            case 5:
                hl.c3(new cp7((Object) ((b19) this.b), (Object) tLObject, (ArrayList) this.c, (Object) ((TLRPC.TL_messages_sendQuickReplyMessages) this.d), (Object) tL_error, (byte) 16));
                return;
            case 6:
                hl.c3(new cp7((b2a) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, (TLRPC.User) this.d, (byte) 19));
                return;
            case 7:
                hl.c3(new cp7((a5a) this.b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d, (byte) 21));
                return;
            case 8:
                hl.c3(new vp8((r7a) this.b, tLObject, (d7a) this.c, (String) this.d, (byte) 16));
                return;
            case 9:
                r7a r7aVar = (r7a) this.b;
                e eVar = (e) this.c;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.d;
                if (tL_error == null) {
                    r7aVar.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    hl.c3(new z6a(r7aVar, tL_error, eVar, tL_messages_editMessage, (byte) 1));
                    return;
                }
            case 10:
                hl.c3(new x5a((r7a) this.b, (String) this.c, (List) this.d, (byte) 1));
                return;
            case 11:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                sessionsActivity.getClass();
                hl.c3(new vp8(sessionsActivity, (id) this.c, tL_error, (TLObject) ((TLRPC.TL_authorization) this.d), (byte) 20));
                return;
            case 12:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.b;
                sessionsActivity2.getClass();
                hl.c3(new vp8(sessionsActivity2, (id) this.c, tL_error, (TLObject) ((TLRPC.TL_webAuthorization) this.d), (byte) 19));
                return;
            case 13:
                hl.c3(new vp8(tLObject, (boolean[]) this.b, (yt0) this.c, (TLRPC.UserFull) this.d, (byte) 23));
                return;
            case 14:
                wua wuaVar = (wua) this.b;
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) this.d;
                id idVar = (id) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    uc7.s1(wuaVar.a).j4(messages_messages.users, false);
                    uc7.s1(wuaVar.a).c4(messages_messages.chats, false);
                    int i = 0;
                    while (true) {
                        if (i < messages_messages.messages.size()) {
                            TLRPC.Message message = messages_messages.messages.get(i);
                            if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                                r47Var = new r47(wuaVar.a, message, false, false);
                                r47Var.K5();
                            } else {
                                i++;
                            }
                        }
                    }
                }
                if (r47Var != null) {
                    hl.c3(new jr9(wuaVar, idVar, r47Var, (byte) 26));
                    return;
                } else {
                    hl.c3(new uc(idVar, (byte) 6));
                    return;
                }
            case 15:
                wua wuaVar2 = (wua) this.b;
                l01 l01Var = (l01) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    uc7.s1(wuaVar2.a).Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new jr9(wuaVar2, l01Var, tL_starGiftUnique, (byte) 22));
                    return;
                } else if (tL_error != null) {
                    if (tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                        hl.c3(new cq6(wuaVar2, l01Var, Long.parseLong(tL_error.text.substring(26)), (byte) 26));
                        return;
                    } else {
                        hl.c3(new jr9(wuaVar2, l01Var, tL_error, (byte) 23));
                        return;
                    }
                } else {
                    return;
                }
            case 16:
                hl.c3(new vp8((wua) this.b, tLObject, (TL_wallet.nftItem) this.c, (String) this.d, (byte) 26));
                return;
            case 17:
                hl.c3(new cp7((jxa) this.b, tL_error, (icc) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, (byte) 29));
                return;
            case 18:
                hl.c3(new cp7((jxa) this.b, tL_error, (iv4) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, (byte) 26));
                return;
            case 19:
                hl.c3(new cp7((jxa) this.b, tL_error, (qe2) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, (byte) 25));
                return;
            case 20:
                h1b h1bVar = (h1b) this.b;
                String str = (String) this.c;
                v1b v1bVar = (v1b) this.d;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        i1b i1bVar = h1bVar.r;
                        byte b = i1bVar.i;
                        if (i1bVar != h1bVar.x.x) {
                            z = false;
                        }
                        ok1Var = w1b.e0(jSONObject, b, z);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(h1bVar.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                hl.c3(new kta(h1bVar, ok1Var, str, v1bVar, (byte) 1));
                return;
            case 21:
                hl.c3(new uwa((s4b) this.b, (String) this.c, tL_error, tLObject, (TextView) this.d, (byte) 2));
                return;
            case 22:
                hl.c3(new uwa((r9b) this.b, (id) this.c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, (byte) 4));
                return;
            case 23:
                hl.c3(new uwa((ueb) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, (byte) 5));
                return;
            case 24:
                hl.c3(new kta(tLObject, (ynb) this.b, (znb) this.c, (TLRPC.TL_theme) this.d, (byte) 11));
                return;
            case 25:
                hl.c3(new kta((sxb) this.b, tLObject, (String) this.d, (id) this.c, (byte) 13));
                return;
            case 26:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.e.c(new kta(twoStepVerificationActivity, bArr, tLObject, bArr2, (byte) 18));
                    return;
                } else {
                    hl.c3(new bcb(twoStepVerificationActivity, tL_error, (byte) 25));
                    return;
                }
            case 27:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$48((TL_phone.PhoneCall) this.c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            case 28:
                VoIPService.lambda$startConferenceGroupCall$52((ArrayList) this.b, (ArrayList) this.c, (plc) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$44((ArrayList) this.b, (ArrayList) this.c, (plc) this.d, tLObject, tL_error);
                return;
        }
    }

    public qn8(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
