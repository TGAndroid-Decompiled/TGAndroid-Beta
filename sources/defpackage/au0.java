package defpackage;

import android.app.Activity;
import android.os.SystemClock;
import android.util.LongSparseArray;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class au0 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public au0(qh6 qh6Var, String str, String str2, String str3) {
        this.a = (byte) 8;
        this.b = qh6Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        kf7 messagesStorage;
        byte b = this.a;
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = null;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                hl.c3(new la7((rv0) obj4, tLObject, (pv0) obj3, (String) obj2, (String) obj, (byte) 6));
                return;
            case 1:
                rv0 rv0Var = (rv0) obj4;
                rv0Var.getClass();
                hl.c3(new z87((fn7) rv0Var, (Object) tLObject, (Object) ((TLRPC.TL_messages_requestUrlAuth) obj3), (String) obj2, (TLObject) tL_error, (Object) ((String) obj), (byte) 3));
                return;
            case 2:
                rf1 rf1Var = (rf1) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                boolean[] zArr = (boolean[]) obj2;
                id idVar = (id) obj;
                wf1 wf1Var = rf1Var.a.n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i = 0; i < tL_messages_exportedChatInvite.users.size(); i++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i);
                        if (wf1Var.A0 == null) {
                            wf1Var.A0 = new HashMap();
                        }
                        wf1Var.A0.put(Long.valueOf(user.id), user);
                    }
                }
                hl.c3(new la7(rf1Var, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, idVar, (byte) 14));
                return;
            case 3:
                hl.c3(new ao1((na2) obj4, (id[]) obj3, (TLRPC.Chat) obj2, (xc5) obj, (byte) 8));
                return;
            case 4:
                hl.c3(new la7((Object) ((pd2) obj4), tL_error, (Object) ((TLRPC.TL_inputCheckPasswordSRP) obj3), (Object) ((TwoStepVerificationActivity) obj2), (Object) ((TLRPC.TL_channels_editCreator) obj), (byte) 23));
                return;
            case 5:
                hl.c3(new la7((q84) obj4, tLObject, (TLRPC.TL_getFactCheck) obj3, (ArrayList) obj2, (HashMap) obj, (byte) 28));
                return;
            case 6:
                hl.c3(new z87((yx4) obj4, (id) obj3, tLObject, (l77) obj2, (pcc) obj, tL_error, (byte) 9));
                return;
            case 7:
                id6 id6Var = (id6) obj4;
                hd6 hd6Var = (hd6) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error != null) {
                    if (tL_error.text.equals("MESSAGE_ID_INVALID")) {
                        id6Var.b.remove(hd6Var);
                        id6Var.a.l(hd6Var.a);
                        id6Var.l(hd6Var, 1);
                        id6Var.G.delete(iArr[0]);
                        hl.c3(new dd6(id6Var, hd6Var, (byte) 1));
                        return;
                    }
                    return;
                }
                if ((tL_messages_editMessage.flags & 8) != 0) {
                    hd6Var.g = tL_messages_editMessage.media.proximity_notification_radius;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                boolean z = false;
                for (int i2 = 0; i2 < updates.updates.size(); i2++) {
                    TLRPC.Update update = updates.updates.get(i2);
                    if (update instanceof TL_update.TL_updateEditMessage) {
                        hd6Var.h.k = ((TL_update.TL_updateEditMessage) update).message;
                    } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                        hd6Var.h.k = ((TL_update.TL_updateEditChannelMessage) update).message;
                    }
                    z = true;
                }
                if (z) {
                    id6Var.l(hd6Var, 0);
                }
                id6Var.getMessagesController().Y3(updates, false);
                return;
            case 8:
                qh6 qh6Var = (qh6) obj4;
                qh6Var.getClass();
                hl.c3(new tw4((Object) qh6Var, tL_error, (Object) ((String) obj2), (Object) ((String) obj), (Object) ((String) obj3), (byte) 15));
                return;
            case 9:
                hl.c3(new z87((k17) obj4, (String) obj2, tL_error, tLObject, (uc7) obj3, (kf7) obj));
                return;
            case 10:
                uc7 uc7Var = (uc7) obj4;
                unb unbVar = (unb) obj3;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) obj;
                String str = (String) obj2;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                File e = gvc.e(unbVar.b);
                if (wallPaper != null) {
                    try {
                        xb4 fileLoader = uc7Var.getFileLoader();
                        TLRPC.Document document = wallPaper.document;
                        fileLoader.getClass();
                        hl.E(e, xb4.J(document, null, true, true));
                    } catch (Exception unused) {
                    }
                }
                hl.c3(new z87(uc7Var, wallPaper, tL_wallPaperSettings, unbVar, e, str, (byte) 0));
                return;
            case 11:
                uc7 uc7Var2 = (uc7) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i3 = tL_messages_affectedHistory.offset;
                    if (i3 > 0) {
                        uc7Var2.i0(chat, user2, chat2, i3);
                    }
                    uc7Var2.V3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.id);
                    return;
                }
                return;
            case 12:
                hl.c3(new z87((b18) obj4, tL_error, (String) obj2, (j08) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj));
                return;
            case 13:
                hl.c3(new cp7((m08) obj4, tL_error, (ge7) obj3, (um4) obj2, (TL_account.verifyEmail) obj, (byte) 1));
                return;
            case 14:
                hl.c3(new cp7((o68) obj4, (n3b) obj3, tL_error, (TL_stories.StoryItem) obj2, (u9b) obj, (byte) 4));
                return;
            case 15:
                hl.c3(new cp7((PrivacyControlActivity) obj4, tL_error, (boolean[]) obj3, (TLRPC.GlobalPrivacySettings) obj2, (TL_account.setGlobalPrivacySettings) obj, (byte) 8));
                return;
            case 16:
                hl.c3(new z87((nb9) obj4, tLObject, (CharSequence) obj3, tL_error, (byte[]) obj, (String) obj2, (byte) 21));
                return;
            case 17:
                wx9 wx9Var = (wx9) obj4;
                Activity activity = (Activity) obj3;
                id idVar2 = (id) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                if (tL_error == null) {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr = messages_dhconfig.p;
                        int i4 = messages_dhconfig.g;
                        Pattern pattern = Utilities.a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr, i4)) {
                            hl.c3(new gb7(activity, idVar2, (byte) 1));
                            return;
                        }
                        kf7 messagesStorage2 = wx9Var.getMessagesStorage();
                        byte[] bArr2 = messages_dhconfig.p;
                        messagesStorage2.I();
                        messagesStorage2.y = bArr2;
                        kf7 messagesStorage3 = wx9Var.getMessagesStorage();
                        int i5 = messages_dhconfig.g;
                        messagesStorage3.I();
                        messagesStorage3.E = i5;
                        kf7 messagesStorage4 = wx9Var.getMessagesStorage();
                        int i6 = messages_dhconfig.version;
                        messagesStorage4.I();
                        messagesStorage4.x = i6;
                        kf7 messagesStorage5 = wx9Var.getMessagesStorage();
                        kf7 messagesStorage6 = wx9Var.getMessagesStorage();
                        messagesStorage6.I();
                        int i7 = messagesStorage6.x;
                        kf7 messagesStorage7 = wx9Var.getMessagesStorage();
                        messagesStorage7.I();
                        int i8 = messagesStorage7.E;
                        kf7 messagesStorage8 = wx9Var.getMessagesStorage();
                        messagesStorage8.I();
                        messagesStorage5.a.c(new aq1(messagesStorage5, i7, i8, messagesStorage8.y, (byte) 10));
                    }
                    byte[] bArr3 = new byte[256];
                    for (int i9 = 0; i9 < 256; i9++) {
                        bArr3[i9] = (byte) (((byte) (Utilities.b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i9]);
                    }
                    wx9Var.getMessagesStorage().I();
                    BigInteger valueOf = BigInteger.valueOf(messagesStorage.E);
                    BigInteger bigInteger = new BigInteger(1, bArr3);
                    kf7 messagesStorage9 = wx9Var.getMessagesStorage();
                    messagesStorage9.I();
                    byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage9.y)).toByteArray();
                    if (byteArray.length > 256) {
                        byte[] bArr4 = new byte[256];
                        System.arraycopy(byteArray, 1, bArr4, 0, 256);
                        byteArray = bArr4;
                    }
                    TLRPC.TL_messages_requestEncryption tL_messages_requestEncryption = new TLRPC.TL_messages_requestEncryption();
                    tL_messages_requestEncryption.g_a = byteArray;
                    tL_messages_requestEncryption.user_id = wx9Var.getMessagesController().q1(user3);
                    tL_messages_requestEncryption.random_id = Utilities.b.nextInt();
                    wx9Var.getConnectionsManager().sendRequest(tL_messages_requestEncryption, new in0(wx9Var, activity, idVar2, bArr3, user3, (byte) 13), 2);
                    return;
                }
                wx9Var.f.clear();
                hl.c3(new sx9(wx9Var, activity, idVar2, (byte) 0));
                return;
            case 18:
                r7a r7aVar = (r7a) obj4;
                r47 r47Var = (r47) obj3;
                String str2 = (String) obj2;
                Runnable runnable = (Runnable) obj;
                zh6 zh6Var = r7aVar.x;
                if (tL_error == null) {
                    zh6Var.k(r47Var.D1(), 0L);
                    r7aVar.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    zh6Var.k(r47Var.D1(), Long.valueOf(SystemClock.elapsedRealtime()));
                }
                hl.c3(new jr9(r7aVar, str2, runnable, (byte) 7));
                return;
            case 19:
                hl.c3(new esa((wua) obj4, tLObject, (bx4[]) obj3, (Long) obj2, (jr9) obj, tL_error, (byte) 1));
                return;
            case 20:
                wua wuaVar = (wua) obj4;
                wuaVar.getClass();
                hl.c3(new esa(wuaVar, tLObject, (CharSequence) obj3, (TL_stars.TL_starGiftUnique) obj2, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj, tL_error, (byte) 0));
                return;
            case 21:
                hl.c3(new uwa((jxa) obj4, (id) obj3, tLObject, (TL_stars.InputSavedStarGift) obj2, (pcc) obj, (byte) 1));
                return;
            case 22:
                hl.c3(new esa((jxa) obj4, tLObject, (r47) obj3, (TLRPC.TL_inputInvoiceMessage) obj2, (go1) obj, tL_error, (byte) 5));
                return;
            case 23:
                zwa zwaVar = (zwa) obj4;
                zwaVar.getClass();
                hl.c3(new esa(zwaVar, tLObject, (TL_stars.TL_starGiftCollection) obj3, (axa) obj2, (pcc) obj, tL_error, (byte) 6));
                return;
            case 24:
                fb8 fb8Var = (fb8) obj4;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                isa isaVar = (isa) obj;
                if (tL_error != null && xc4.r(tL_error.text) && obj3 != null) {
                    xc4.n(fb8Var.a).u(new Object[]{tL_messages_getAttachedStickers, isaVar}, obj3);
                    return;
                } else {
                    isaVar.run(tLObject, tL_error);
                    return;
                }
            case 25:
                hl.c3(new uwa((y4b) obj4, (TLRPC.TL_messages_getStickers) obj3, tLObject, (ArrayList) obj2, (LongSparseArray) obj, (byte) 3));
                return;
            default:
                c8b c8bVar = (c8b) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers2 = (TLRPC.TL_messages_getAttachedStickers) obj2;
                yp9 yp9Var = (yp9) obj;
                if (tL_error != null && xc4.r(tL_error.text) && storyItem != null) {
                    xc4.n(c8bVar.a).u(new Object[]{tL_messages_getAttachedStickers2, yp9Var}, storyItem);
                    return;
                } else {
                    yp9Var.run(tLObject, tL_error);
                    return;
                }
        }
    }

    public au0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public au0(Object obj, Object obj2, Object obj3, String str, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.d = obj3;
        this.c = str;
    }

    public au0(Object obj, String str, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = str;
        this.e = obj2;
        this.d = obj3;
    }
}
