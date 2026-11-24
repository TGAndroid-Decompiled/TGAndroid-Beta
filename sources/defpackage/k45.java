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
public final class k45 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public k45(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j;
        byte b = this.a;
        fk1 fk1Var = null;
        int i = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                gl.d3(new e45(tLObject, (ArrayList) obj3, (ArrayList) obj2, (vz4) obj, (byte) 2));
                return;
            case 1:
                lb5 lb5Var = (lb5) obj3;
                String str = (String) obj;
                mb5 mb5Var = lb5Var.r;
                if (Objects.equals(lb5Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!mb5Var.O || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList t0 = hq6.d0(mb5.Z(mb5Var)).t0(mb5Var.d0());
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
                    gl.d3(new e45(lb5Var, arrayList, arrayList3, str, (byte) 5));
                    return;
                }
                return;
            case 2:
                String str3 = LaunchActivity.C1;
                gl.d3(new vz4((Object) ((LaunchActivity) obj3), (Object) tLObject, (Object) ((TLRPC.TL_messages_requestUrlAuth) obj2), (String) obj, (Object) tL_error, (byte) 11));
                return;
            case 3:
                String str4 = LaunchActivity.C1;
                gl.d3(new vz4((LaunchActivity) obj3, (kz5) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, (byte) 9));
                return;
            case 4:
                String str5 = LaunchActivity.C1;
                gl.d3(new vz4((LaunchActivity) obj3, tLObject, (hd) obj2, (kz5) obj, tL_error, (byte) 12));
                return;
            case 5:
                gl.d3(new vz4((a46) obj3, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (String) obj, (byte) 13));
                return;
            case 6:
                gl.d3(new sx5((qa6) obj3, (hd[]) obj2, (TLRPC.TL_messageMediaVenue) obj, (byte) 14));
                return;
            case 7:
                gl.d3(new vz4((ad6) obj3, tLObject, (Bundle) obj2, tL_error, (TLRPC.TL_auth_resendCode) obj, (byte) 15));
                return;
            case 8:
                gl.d3(new vz4((de6) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.verifyEmail) obj, (byte) 17));
                return;
            case 9:
                gl.d3(new vz4((de6) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.sendVerifyEmailCode) obj, (byte) 16));
                return;
            case 10:
                gl.d3(new vz4((ve6) obj3, tLObject, (TLRPC.TL_inputInvoicePremiumAuthCode) obj2, (TLRPC.TL_inputStorePaymentAuthCode) obj, tL_error, (byte) 18));
                return;
            case 11:
                hq6 hq6Var = (hq6) obj3;
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
                if (tL_error != null && ab4.r(tL_error.text) && obj2 != null) {
                    hq6Var.getFileRefController().u(new Object[]{tL_messages_faveSticker}, obj2);
                    return;
                } else {
                    gl.d3(new un6(hq6Var, (byte) 2));
                    return;
                }
            case 12:
                hq6 hq6Var2 = (hq6) obj3;
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
                if (tL_error != null && ab4.r(tL_error.text) && obj2 != null) {
                    hq6Var2.getFileRefController().u(new Object[]{tL_messages_saveRecentSticker}, obj2);
                    return;
                }
                return;
            case 13:
                gl.d3(new jw6(tL_error, (u41) obj3, (i61) obj2, (Runnable) obj, (byte) 4));
                return;
            case 14:
                s47 s47Var = (s47) obj3;
                String str6 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                s47Var.getClass();
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        fk1Var = uxa.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    gl.d3(new oh6(s47Var, (TL_stats.TL_statsGraphError) tLObject, (byte) 21));
                }
                gl.d3(new vz4((Object) s47Var, (Object) tL_error, (Object) fk1Var, str6, (Object) tL_loadAsyncGraph, (byte) 20));
                return;
            case 15:
                p47 p47Var = (p47) obj3;
                String str7 = (String) obj2;
                txa txaVar = (txa) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        fk1Var = uxa.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), p47Var.r.i, false);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(p47Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                gl.d3(new jw6(p47Var, fk1Var, str7, txaVar, (byte) 5));
                return;
            case 16:
                gl.d3(new vz4((na7) obj3, tL_error, tLObject, (Long) obj2, (hy3) obj, (byte) 24));
                return;
            case 17:
                na7 na7Var = (na7) obj3;
                d dVar = (d) obj2;
                TLRPC.TL_messages_createChat tL_messages_createChat = (TLRPC.TL_messages_createChat) obj;
                if (tL_error != null) {
                    gl.d3(new s67(na7Var, tL_error, dVar, tL_messages_createChat, (byte) 2));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    na7Var.Q3(tL_messages_invitedUsers.updates, false);
                    gl.d3(new ee2(na7Var, tL_messages_invitedUsers, (byte) 9));
                    return;
                } else {
                    return;
                }
            case 18:
                na7 na7Var2 = (na7) obj3;
                d dVar2 = (d) obj2;
                TLRPC.TL_channels_createChannel tL_channels_createChannel = (TLRPC.TL_channels_createChannel) obj;
                if (tL_error != null) {
                    gl.d3(new s67(na7Var2, tL_error, dVar2, tL_channels_createChannel, (byte) 1));
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                na7Var2.Q3(updates, false);
                gl.d3(new t67(na7Var2, updates, (byte) 8));
                return;
            case 19:
                na7 na7Var3 = (na7) obj3;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                if (tL_error != null && ab4.r(tL_error.text)) {
                    na7Var3.getFileRefController().u(new Object[]{tL_messages_saveGif}, obj2);
                    return;
                }
                return;
            case 20:
                na7 na7Var4 = (na7) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    boolean T = hc2.T(chat);
                    int i3 = tL_messages_affectedHistory.pts;
                    int i4 = tL_messages_affectedHistory.pts_count;
                    if (T) {
                        na7Var4.N3(i3, i4, chat.id);
                    } else {
                        na7Var4.O3(i3, -1, i4);
                    }
                    ad7 messagesStorage = na7Var4.getMessagesStorage();
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
                na7 na7Var5 = (na7) obj3;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj2;
                String str8 = (String) obj;
                if ((tLObject instanceof TLRPC.TL_boolTrue) && chatFull != null) {
                    gl.d3(new lo6(na7Var5, chatFull, str8, (byte) 22));
                    return;
                }
                return;
            case 22:
                na7 na7Var6 = (na7) obj3;
                mn6 mn6Var = (mn6) obj2;
                n92 n92Var = (n92) obj;
                na7Var6.getClass();
                if (tLObject != null) {
                    na7Var6.Q3((TLRPC.Updates) tLObject, false);
                    gl.d3(new c87(na7Var6, (byte) 10));
                    if (mn6Var != null) {
                        mn6Var.run();
                        return;
                    }
                    return;
                } else if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                    if (n92Var != null) {
                        n92Var.run();
                        return;
                    }
                    return;
                } else if (mn6Var != null) {
                    mn6Var.run();
                    return;
                } else {
                    return;
                }
            case 23:
                gl.d3(new vz4((jj7) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj, (byte) 28));
                return;
            case 24:
                gl.d3(new ex7((rx7) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj, (byte) 1));
                return;
            case 25:
                p pVar = (p) obj3;
                pVar.getClass();
                gl.d3(new ex7(pVar, tL_error, tLObject, (String) obj2, (TL_account.getPassword) obj, (byte) 2));
                return;
            case 26:
                p pVar2 = (p) obj3;
                bj7 bj7Var = (bj7) obj2;
                TLObject tLObject2 = (TLObject) obj;
                pVar2.getClass();
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    gl.d3(new pc7(pVar2, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, bj7Var, (byte) 15));
                    return;
                } else {
                    gl.d3(new xy7(pVar2, tL_error, tLObject2, (byte) 2));
                    return;
                }
            case 27:
                gl.d3(new jw6((s28) obj3, tLObject, (TL_stories.StoryItem) obj2, (p8c) obj, (byte) 16));
                return;
            case 28:
                gl.d3(new jw6((p78) obj3, tLObject, (y6c) obj2, (TLRPC.Photo) obj, (byte) 21));
                return;
            default:
                gl.d3(new ex7((Object) ((yj8) obj3), tLObject, (Object) ((TLRPC.UserFull) obj2), (Object) ((TL_account.TL_birthday) obj), tL_error, (byte) 8));
                return;
        }
    }
}
