package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p;
public final class m65 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public m65(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j;
        byte b = this.a;
        ok1 ok1Var = null;
        int i = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                hl.c3(new g65(tLObject, (ArrayList) obj3, (ArrayList) obj2, (tw4) obj, (byte) 2));
                return;
            case 1:
                md5 md5Var = (md5) obj3;
                String str = (String) obj;
                nd5 nd5Var = md5Var.r;
                if (Objects.equals(md5Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!nd5Var.O || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList t0 = ls6.d0(nd5.Z(nd5Var)).t0(nd5Var.d0());
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
                    hl.c3(new g65(md5Var, arrayList, arrayList3, str, (byte) 5));
                    return;
                }
                return;
            case 2:
                String str3 = LaunchActivity.C1;
                hl.c3(new tw4((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj2, (String) obj, tL_error, (byte) 12));
                return;
            case 3:
                String str4 = LaunchActivity.C1;
                hl.c3(new tw4((Object) ((LaunchActivity) obj3), (Object) ((tg5) obj2), tLObject, (TLObject) ((TLRPC.TL_wallPaper) obj), tL_error, (byte) 10));
                return;
            case 4:
                String str5 = LaunchActivity.C1;
                hl.c3(new tw4((LaunchActivity) obj3, tLObject, (id) obj2, (tg5) obj, tL_error, (byte) 13));
                return;
            case 5:
                hl.c3(new tw4((Object) ((e66) obj3), tL_error, (Object) tLObject, (Object) ((TLRPC.TL_inputInvoiceSlug) obj2), (Object) ((String) obj), (byte) 14));
                return;
            case 6:
                hl.c3(new ls5((uc6) obj3, (id[]) obj2, (TLRPC.TL_messageMediaVenue) obj, (byte) 19));
                return;
            case 7:
                hl.c3(new tw4((KeyEvent.Callback) ((df6) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TLRPC.TL_auth_resendCode) obj), (byte) 16));
                return;
            case 8:
                hl.c3(new tw4((KeyEvent.Callback) ((fg6) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.verifyEmail) obj), (byte) 18));
                return;
            case 9:
                hl.c3(new tw4((KeyEvent.Callback) ((fg6) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.sendVerifyEmailCode) obj), (byte) 17));
                return;
            case 10:
                hl.c3(new tw4((Object) ((zg6) obj3), (Object) tLObject, (Object) ((TLRPC.TL_inputInvoicePremiumAuthCode) obj2), (Object) ((TLRPC.TL_inputStorePaymentAuthCode) obj), (Object) tL_error, (byte) 19));
                return;
            case 11:
                ls6 ls6Var = (ls6) obj3;
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
                if (tL_error != null && xc4.r(tL_error.text) && obj2 != null) {
                    ls6Var.getFileRefController().u(new Object[]{tL_messages_faveSticker}, obj2);
                    return;
                } else {
                    hl.c3(new ip6(ls6Var, (byte) 7));
                    return;
                }
            case 12:
                ls6 ls6Var2 = (ls6) obj3;
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
                if (tL_error != null && xc4.r(tL_error.text) && obj2 != null) {
                    ls6Var2.getFileRefController().u(new Object[]{tL_messages_saveRecentSticker}, obj2);
                    return;
                }
                return;
            case 13:
                hl.c3(new oy6(tL_error, (c51) obj3, (q61) obj2, (Runnable) obj, (byte) 4));
                return;
            case 14:
                z67 z67Var = (z67) obj3;
                String str6 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                z67Var.getClass();
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        ok1Var = w1b.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    hl.c3(new mn6(z67Var, (TL_stats.TL_statsGraphError) tLObject, (byte) 18));
                }
                hl.c3(new tw4((Object) z67Var, tL_error, (Object) ok1Var, (Object) str6, (Object) tL_loadAsyncGraph, (byte) 21));
                return;
            case 15:
                w67 w67Var = (w67) obj3;
                String str7 = (String) obj2;
                v1b v1bVar = (v1b) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        ok1Var = w1b.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), w67Var.r.i, false);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(w67Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                hl.c3(new oy6(w67Var, ok1Var, str7, v1bVar, (byte) 5));
                return;
            case 16:
                uc7 uc7Var = (uc7) obj3;
                e eVar = (e) obj2;
                TLRPC.TL_messages_createChat tL_messages_createChat = (TLRPC.TL_messages_createChat) obj;
                if (tL_error != null) {
                    hl.c3(new o97(uc7Var, tL_error, eVar, tL_messages_createChat, (byte) 1));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    uc7Var.Y3(tL_messages_invitedUsers.updates, false);
                    hl.c3(new ve2(uc7Var, tL_messages_invitedUsers, (byte) 9));
                    return;
                } else {
                    return;
                }
            case 17:
                uc7 uc7Var2 = (uc7) obj3;
                e eVar2 = (e) obj2;
                TLRPC.TL_channels_createChannel tL_channels_createChannel = (TLRPC.TL_channels_createChannel) obj;
                if (tL_error != null) {
                    hl.c3(new o97(uc7Var2, tL_error, eVar2, tL_channels_createChannel, (byte) 2));
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                uc7Var2.Y3(updates, false);
                hl.c3(new t87(uc7Var2, updates, (byte) 5));
                return;
            case 18:
                uc7 uc7Var3 = (uc7) obj3;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                if (tL_error != null && xc4.r(tL_error.text)) {
                    uc7Var3.getFileRefController().u(new Object[]{tL_messages_saveGif}, obj2);
                    return;
                }
                return;
            case 19:
                hl.c3(new tw4((Object) ((uc7) obj3), tL_error, (Object) tLObject, (Object) ((Long) obj2), (Object) ((cz3) obj), (byte) 24));
                return;
            case 20:
                uc7 uc7Var4 = (uc7) obj3;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj2;
                String str8 = (String) obj;
                if ((tLObject instanceof TLRPC.TL_boolTrue) && chatFull != null) {
                    hl.c3(new yg6(uc7Var4, chatFull, str8, (byte) 28));
                    return;
                }
                return;
            case 21:
                uc7 uc7Var5 = (uc7) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    boolean T = xc2.T(chat);
                    int i3 = tL_messages_affectedHistory.pts;
                    int i4 = tL_messages_affectedHistory.pts_count;
                    if (T) {
                        uc7Var5.V3(i3, i4, chat.id);
                    } else {
                        uc7Var5.W3(i3, -1, i4);
                    }
                    kf7 messagesStorage = uc7Var5.getMessagesStorage();
                    if (chat != null) {
                        j = -chat.id;
                    } else {
                        j = user.id;
                    }
                    messagesStorage.e2(j, null, false, 0, 0, false, null);
                    return;
                }
                return;
            case 22:
                uc7 uc7Var6 = (uc7) obj3;
                ds6 ds6Var = (ds6) obj2;
                ea2 ea2Var = (ea2) obj;
                uc7Var6.getClass();
                if (tLObject != null) {
                    uc7Var6.Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new pa7(uc7Var6, (byte) 11));
                    if (ds6Var != null) {
                        ds6Var.run();
                        return;
                    }
                    return;
                } else if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                    if (ea2Var != null) {
                        ea2Var.run();
                        return;
                    }
                    return;
                } else if (ds6Var != null) {
                    ds6Var.run();
                    return;
                } else {
                    return;
                }
            case 23:
                hl.c3(new tw4((KeyEvent.Callback) ((sl7) obj3), (TLObject) ((TLRPC.TL_contacts_importedContacts) tLObject), (Object) ((TLRPC.TL_inputPhoneContact) obj2), tL_error, (TLObject) ((TLRPC.TL_contacts_importContacts) obj), (byte) 29));
                return;
            case 24:
                hl.c3(new cp7((x08) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj, (byte) 2));
                return;
            case 25:
                p pVar = (p) obj3;
                ql7 ql7Var = (ql7) obj2;
                TLObject tLObject2 = (TLObject) obj;
                pVar.getClass();
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    hl.c3(new gd7(pVar, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, ql7Var, (byte) 21));
                    return;
                } else {
                    hl.c3(new c28(pVar, tL_error, tLObject2, (byte) 2));
                    return;
                }
            case 26:
                p pVar2 = (p) obj3;
                pVar2.getClass();
                hl.c3(new cp7(pVar2, tL_error, tLObject, (String) obj2, (TL_account.getPassword) obj, (byte) 3));
                return;
            case 27:
                hl.c3(new oy6((j68) obj3, tLObject, (TL_stories.StoryItem) obj2, (pcc) obj, (byte) 18));
                return;
            case 28:
                hl.c3(new oy6((gb8) obj3, tLObject, (yac) obj2, (TLRPC.Photo) obj, (byte) 22));
                return;
            default:
                hl.c3(new cp7((mn8) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, (byte) 9));
                return;
        }
    }
}
