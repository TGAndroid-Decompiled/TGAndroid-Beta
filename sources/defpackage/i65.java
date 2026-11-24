package defpackage;

import android.os.Bundle;
import android.widget.Toast;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p;
public final class i65 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public i65(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j;
        byte b = this.a;
        nl1 nl1Var = null;
        int i = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                gm.c3(new d65(tLObject, (ArrayList) obj3, (ArrayList) obj2, (v15) obj, (byte) 2));
                return;
            case 1:
                jd5 jd5Var = (jd5) obj3;
                String str = (String) obj;
                kd5 kd5Var = jd5Var.r;
                if (Objects.equals(jd5Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = ((TLRPC.TL_messages_foundStickerSets) tLObject).sets;
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i2);
                        i2++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        tL_messages_stickerSet.set = stickerSet;
                        tL_messages_stickerSet.documents = stickerSetCovered2.covers;
                        if (!kd5Var.O || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList t0 = hs6.d0(kd5.a0(kd5Var)).t0(kd5Var.e0());
                    int size2 = t0.size();
                    while (i < size2) {
                        Object obj4 = t0.get(i);
                        i++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj4;
                        String str2 = tL_messages_stickerSet2.set.short_name;
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).contains(trim) || tL_messages_stickerSet2.set.title.toLowerCase(locale).contains(trim)) {
                            arrayList3.add(tL_messages_stickerSet2);
                        }
                    }
                    gm.c3(new d65(jd5Var, arrayList, arrayList3, str, (byte) 5));
                    return;
                }
                return;
            case 2:
                String str3 = LaunchActivity.C1;
                gm.c3(new v15((Object) ((LaunchActivity) obj3), (Object) tLObject, (Object) ((TLRPC.TL_messages_requestUrlAuth) obj2), (String) obj, (Object) tL_error, (byte) 11));
                return;
            case 3:
                String str4 = LaunchActivity.C1;
                gm.c3(new v15((LaunchActivity) obj3, (k16) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, (byte) 9));
                return;
            case 4:
                String str5 = LaunchActivity.C1;
                gm.c3(new v15((LaunchActivity) obj3, tLObject, (he) obj2, (k16) obj, tL_error, (byte) 12));
                return;
            case 5:
                gm.c3(new v15((a66) obj3, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (String) obj, (byte) 13));
                return;
            case 6:
                gm.c3(new dt5((pc6) obj3, (he[]) obj2, (TLRPC.TL_messageMediaVenue) obj, (byte) 16));
                return;
            case 7:
                gm.c3(new v15((ze6) obj3, tLObject, (Bundle) obj2, tL_error, (TLRPC.TL_auth_resendCode) obj, (byte) 15));
                return;
            case 8:
                gm.c3(new v15((cg6) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.verifyEmail) obj, (byte) 17));
                return;
            case 9:
                gm.c3(new v15((cg6) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.sendVerifyEmailCode) obj, (byte) 16));
                return;
            case 10:
                gm.c3(new v15((wg6) obj3, tLObject, (TLRPC.TL_inputInvoicePremiumAuthCode) obj2, (TLRPC.TL_inputStorePaymentAuthCode) obj, tL_error, (byte) 18));
                return;
            case 11:
                hs6 hs6Var = (hs6) obj3;
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
                if (tL_error != null && ad4.r(tL_error.text) && obj2 != null) {
                    hs6Var.getFileRefController().u(new Object[]{tL_messages_faveSticker}, obj2);
                    return;
                } else {
                    gm.c3(new vp6(hs6Var, (byte) 2));
                    return;
                }
            case 12:
                hs6 hs6Var2 = (hs6) obj3;
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
                if (tL_error != null && ad4.r(tL_error.text) && obj2 != null) {
                    hs6Var2.getFileRefController().u(new Object[]{tL_messages_saveRecentSticker}, obj2);
                    return;
                }
                return;
            case 13:
                gm.c3(new jy6(tL_error, (b61) obj3, (p71) obj2, (Runnable) obj, (byte) 4));
                return;
            case 14:
                t67 t67Var = (t67) obj3;
                String str6 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                t67Var.getClass();
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        nl1Var = xza.f0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    gm.c3(new lj6(t67Var, (TL_stats.TL_statsGraphError) tLObject, (byte) 22));
                }
                gm.c3(new v15((Object) t67Var, (Object) tL_error, (Object) nl1Var, str6, (Object) tL_loadAsyncGraph, (byte) 20));
                return;
            case 15:
                q67 q67Var = (q67) obj3;
                String str7 = (String) obj2;
                wza wzaVar = (wza) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        nl1Var = xza.f0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), q67Var.r.i, false);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(q67Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                gm.c3(new jy6(q67Var, nl1Var, str7, wzaVar, (byte) 5));
                return;
            case 16:
                gm.c3(new v15((oc7) obj3, tL_error, tLObject, (Long) obj2, (rz3) obj, (byte) 24));
                return;
            case 17:
                oc7 oc7Var = (oc7) obj3;
                d dVar = (d) obj2;
                TLRPC.TL_messages_createChat tL_messages_createChat = (TLRPC.TL_messages_createChat) obj;
                if (tL_error != null) {
                    gm.c3(new l97(oc7Var, tL_error, dVar, tL_messages_createChat, (byte) 2));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    oc7Var.T3(tL_messages_invitedUsers.updates, false);
                    gm.c3(new pf2(oc7Var, tL_messages_invitedUsers, (byte) 9));
                    return;
                } else {
                    return;
                }
            case 18:
                oc7 oc7Var2 = (oc7) obj3;
                d dVar2 = (d) obj2;
                TLRPC.TL_channels_createChannel tL_channels_createChannel = (TLRPC.TL_channels_createChannel) obj;
                if (tL_error != null) {
                    gm.c3(new l97(oc7Var2, tL_error, dVar2, tL_channels_createChannel, (byte) 1));
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                oc7Var2.T3(updates, false);
                gm.c3(new q87(oc7Var2, updates, (byte) 9));
                return;
            case 19:
                oc7 oc7Var3 = (oc7) obj3;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                if (tL_error != null && ad4.r(tL_error.text)) {
                    oc7Var3.getFileRefController().u(new Object[]{tL_messages_saveGif}, obj2);
                    return;
                }
                return;
            case 20:
                oc7 oc7Var4 = (oc7) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    boolean T = sd2.T(chat);
                    int i3 = tL_messages_affectedHistory.pts;
                    int i4 = tL_messages_affectedHistory.pts_count;
                    if (T) {
                        oc7Var4.Q3(i3, i4, chat.id);
                    } else {
                        oc7Var4.R3(i3, -1, i4);
                    }
                    cf7 messagesStorage = oc7Var4.getMessagesStorage();
                    if (chat != null) {
                        j = -chat.id;
                    } else {
                        j = user.id;
                    }
                    messagesStorage.Z1(j, null, false, 0, 0, false, null);
                    return;
                }
                return;
            case 21:
                oc7 oc7Var5 = (oc7) obj3;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj2;
                String str8 = (String) obj;
                if ((tLObject instanceof TLRPC.TL_boolTrue) && chatFull != null) {
                    gm.c3(new fp6(oc7Var5, chatFull, str8, (byte) 25));
                    return;
                }
                return;
            case 22:
                oc7 oc7Var6 = (oc7) obj3;
                np6 np6Var = (np6) obj2;
                ra2 ra2Var = (ra2) obj;
                oc7Var6.getClass();
                if (tLObject != null) {
                    oc7Var6.T3((TLRPC.Updates) tLObject, false);
                    gm.c3(new ba7(oc7Var6, (byte) 11));
                    if (np6Var != null) {
                        np6Var.run();
                        return;
                    }
                    return;
                } else if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                    if (ra2Var != null) {
                        ra2Var.run();
                        return;
                    }
                    return;
                } else if (np6Var != null) {
                    np6Var.run();
                    return;
                } else {
                    return;
                }
            case 23:
                gm.c3(new v15((ml7) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj, (byte) 28));
                return;
            case 24:
                gm.c3(new hz7((tz7) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj, (byte) 1));
                return;
            case 25:
                p pVar = (p) obj3;
                pVar.getClass();
                gm.c3(new hz7(pVar, tL_error, tLObject, (String) obj2, (TL_account.getPassword) obj, (byte) 2));
                return;
            case 26:
                p pVar2 = (p) obj3;
                bl7 bl7Var = (bl7) obj2;
                TLObject tLObject2 = (TLObject) obj;
                pVar2.getClass();
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    gm.c3(new ud7(pVar2, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, bl7Var, (byte) 18));
                    return;
                } else {
                    gm.c3(new z08(pVar2, tL_error, tLObject2, (byte) 2));
                    return;
                }
            case 27:
                gm.c3(new jy6((v48) obj3, tLObject, (TL_stories.StoryItem) obj2, (qac) obj, (byte) 16));
                return;
            case 28:
                gm.c3(new jy6((r98) obj3, tLObject, (z8c) obj2, (TLRPC.Photo) obj, (byte) 21));
                return;
            default:
                gm.c3(new hz7((Object) ((bm8) obj3), tLObject, (Object) ((TLRPC.UserFull) obj2), (Object) ((TL_account.TL_birthday) obj), tL_error, (byte) 8));
                return;
        }
    }
}
