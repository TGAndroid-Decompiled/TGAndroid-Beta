package ai;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f1 implements NotificationCenter.NotificationCenterDelegate {
    public static final LongSparseArray[] I = new LongSparseArray[4];
    public boolean E;
    public TLRPC.ShareTheme H;
    public final int f1487a;
    public final t1 f1488b;
    public final d1 f1489c;
    public boolean e;
    public TLRPC.TL_exportedNoPaidMessagesToken f1490f;
    public long h;
    public int f1491n;
    public TLRPC.TL_exportedContactToken f1492r;
    public long f1493s;
    public TLRPC.ShareTheme v;
    public int f1494w;
    public boolean f1495x;
    public boolean f1496y;
    public int d = 0;
    public final a1 F = new Runnable(this) {
        public final f1 f1434b;

        {
            this.f1434b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f1434b.n();
                    return;
                default:
                    this.f1434b.m();
                    return;
            }
        }
    };
    public final a1 G = new Runnable(this) {
        public final f1 f1434b;

        {
            this.f1434b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f1434b.n();
                    return;
                default:
                    this.f1434b.m();
                    return;
            }
        }
    };

    public f1(int i10, t1 t1Var, d1 d1Var) {
        this.f1487a = i10;
        this.f1488b = t1Var;
        this.f1489c = d1Var;
    }

    public static LongSparseArray g(int i10) {
        LongSparseArray[] longSparseArrayArr = I;
        if (longSparseArrayArr[i10] == null) {
            longSparseArrayArr[i10] = new LongSparseArray();
        }
        return longSparseArrayArr[i10];
    }

    public static byte[] o(TLObject tLObject) {
        try {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            return byteArray;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void a(TLRPC.ShareTheme shareTheme) {
        ArrayList<TLRPC.Reaction> arrayList;
        float f7;
        this.H = shareTheme;
        boolean z10 = shareTheme instanceof TLRPC.TL_shareThemeGift;
        boolean z11 = false;
        t1 t1Var = this.f1488b;
        if (z10) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList2 = t1Var.f1889v1;
                int i10 = 0;
                while (true) {
                    if (i10 < arrayList2.size()) {
                        if (((TL_stars.TL_starGiftUnique) arrayList2.get(i10)).f22257id == tL_starGiftUnique.f22257id) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 < 0) {
                    arrayList2.add(0, tL_starGiftUnique);
                    i10 = 0;
                }
                q1 q1Var = t1Var.F;
                if (q1Var.f1637a == 2 && q1Var.f1650q == i10) {
                    return;
                }
                t1Var.f1724e2 = true;
                t1Var.I.clear();
                Runnable runnable = t1Var.f1714d2;
                if (runnable != null) {
                    runnable.run();
                }
                t1Var.M7 = i10;
                if (t1Var.f1735f2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                t1Var.O7 = f7;
                t1Var.P7 = 1.0f;
                t1Var.I0(t1Var.getWidth() / 2.0f, (t1Var.l() / 2.0f) + t1Var.m(), i10);
                t1Var.f1724e2 = false;
                return;
            }
        }
        if (shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop) {
            TLRPC.TL_shareThemeEmojiBackdrop tL_shareThemeEmojiBackdrop = (TLRPC.TL_shareThemeEmojiBackdrop) shareTheme;
            int i11 = tL_shareThemeEmojiBackdrop.flags;
            if ((i11 & 1) != 0) {
                z11 = true;
            }
            int i12 = tL_shareThemeEmojiBackdrop.backdrop_id;
            if ((i11 & 2) != 0) {
                arrayList = tL_shareThemeEmojiBackdrop.emojis;
            } else {
                arrayList = null;
            }
            t1Var.e(i12, arrayList, z11);
            return;
        }
        t1Var.d(t1.H9);
    }

    public final void b() {
        this.v = null;
        AndroidUtilities.cancelRunOnUIThread(this.G);
        int i10 = this.f1487a;
        LongSparseArray g7 = g(i10);
        long j10 = this.f1489c.f1471f;
        e1 e1Var = (e1) g7.get(j10);
        if (e1Var != null && e1Var.f1479b == 0) {
            g(i10).remove(j10);
        }
    }

    public final TLRPC.TL_exportedNoPaidMessagesToken c() {
        int i10 = this.f1487a;
        String string = MessagesController.getMainSettings(i10).getString("qrNoPaidToken", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = new TLRPC.TL_exportedNoPaidMessagesToken();
        tL_exportedNoPaidMessagesToken.token = string;
        tL_exportedNoPaidMessagesToken.url = MessagesController.getMainSettings(i10).getString("qrNoPaidUrl", null);
        return tL_exportedNoPaidMessagesToken;
    }

    public final String d(TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken) {
        d1 d1Var = this.f1489c;
        String str = d1Var.f1468a;
        if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) && str != null && !d1Var.d) {
            return str + "?free=" + tL_exportedNoPaidMessagesToken.token;
        } else if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url)) {
            return null;
        } else {
            return tL_exportedNoPaidMessagesToken.url;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            p();
            return;
        }
        int i12 = NotificationCenter.userInfoDidLoad;
        d1 d1Var = this.f1489c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == d1Var.f1471f) {
                h(((TLRPC.UserFull) objArr[1]).share_theme);
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (-chatFull.f22029id) == d1Var.f1471f) {
            h(chatFull.share_theme);
        }
    }

    public final TLRPC.InputPeer e() {
        d1 d1Var = this.f1489c;
        if (d1Var.e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.f1487a).getInputPeer(d1Var.f1471f);
        if (inputPeer instanceof TLRPC.TL_inputPeerEmpty) {
            return null;
        }
        return inputPeer;
    }

    public final void f() {
        int i10 = this.f1487a;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.f1489c.f1471f;
        if (j10 > 0) {
            TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
            if (user != null) {
                NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.userInfoDidLoad);
                messagesController.loadUserInfo(user, true, 0);
                return;
            }
            return;
        }
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat == null) {
            return;
        }
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.chatInfoDidLoad);
        MessagesStorage.getInstance(i10).loadChatInfo(chat.f22028id, ChatObject.isChannel(chat), null, true, false);
    }

    public final void h(TLRPC.ShareTheme shareTheme) {
        long j10 = this.f1489c.f1471f;
        if (!this.E) {
            if (shareTheme == null) {
                shareTheme = new TLRPC.TL_shareThemeDefault();
            }
            int i10 = this.f1487a;
            e1 e1Var = (e1) g(i10).get(j10);
            if (e1Var != null) {
                TLRPC.ShareTheme shareTheme2 = e1Var.f1478a;
                byte[] o10 = o(shareTheme);
                byte[] o11 = o(shareTheme2);
                if (o10 != null && Arrays.equals(o10, o11)) {
                    g(i10).remove(j10);
                } else if (e1Var.f1479b != 0 && SystemClock.elapsedRealtime() - e1Var.f1479b >= 10000) {
                    g(i10).remove(j10);
                } else {
                    j(e1Var.f1478a);
                    return;
                }
            }
            if (!this.f1495x) {
                TLRPC.ShareTheme shareTheme3 = this.H;
                if (shareTheme3 == null) {
                    t1 t1Var = this.f1488b;
                    t1Var.setInstantTheme(true);
                    a(shareTheme);
                    t1Var.setInstantTheme(false);
                    return;
                }
                byte[] o12 = o(shareTheme);
                byte[] o13 = o(shareTheme3);
                if (o12 != null && Arrays.equals(o12, o13)) {
                    return;
                }
                a(shareTheme);
            }
        }
    }

    public final void i() {
        TLRPC.TL_shareThemeGift tL_shareThemeGift;
        this.f1495x = true;
        boolean z10 = false;
        this.f1496y = false;
        d1 d1Var = this.f1489c;
        if (!d1Var.f1472g) {
            return;
        }
        t1 t1Var = this.f1488b;
        TL_stars.TL_starGiftUnique themeGift = t1Var.getThemeGift();
        ArrayList<TLRPC.Reaction> pickedEmoji = t1Var.getPickedEmoji();
        TLRPC.TL_shareThemeGift tL_shareThemeGift2 = null;
        r6 = null;
        r6 = null;
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = null;
        tL_shareThemeGift2 = null;
        if (themeGift != null) {
            if (d1Var.e) {
                if (!TextUtils.isEmpty(themeGift.slug)) {
                    ?? tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = themeGift.slug;
                    tL_inputSavedStarGiftChat = tL_inputSavedStarGiftSlug;
                }
            } else {
                long themeGiftSavedId = t1Var.getThemeGiftSavedId();
                TLRPC.InputPeer e = e();
                if (themeGiftSavedId != 0 && e != null) {
                    TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                    tL_inputSavedStarGiftChat2.peer = e;
                    tL_inputSavedStarGiftChat2.saved_id = themeGiftSavedId;
                    tL_inputSavedStarGiftChat = tL_inputSavedStarGiftChat2;
                }
            }
            if (tL_inputSavedStarGiftChat == null) {
                b();
                return;
            }
            ?? tL_inputShareThemeGift = new TLRPC.TL_inputShareThemeGift();
            tL_inputShareThemeGift.stargift = tL_inputSavedStarGiftChat;
            tL_shareThemeGift2 = new TLRPC.TL_shareThemeGift();
            tL_shareThemeGift2.stargift = themeGift;
            tL_shareThemeGift = tL_inputShareThemeGift;
        } else {
            int themeBackdropIndex = t1Var.getThemeBackdropIndex();
            if (themeBackdropIndex >= 0 && themeBackdropIndex != t1.H9) {
                z10 = true;
            }
            if (z10 && a.h == null) {
                b();
                this.f1496y = true;
                return;
            } else if (!z10 && pickedEmoji.isEmpty()) {
                tL_shareThemeGift = new TLRPC.TL_shareThemeDefault();
            } else {
                ?? tL_shareThemeEmojiBackdrop = new TLRPC.TL_shareThemeEmojiBackdrop();
                if (z10) {
                    tL_shareThemeEmojiBackdrop.flags = 1 | tL_shareThemeEmojiBackdrop.flags;
                    tL_shareThemeEmojiBackdrop.backdrop_id = a.h[themeBackdropIndex];
                }
                if (!pickedEmoji.isEmpty()) {
                    tL_shareThemeEmojiBackdrop.flags |= 2;
                    tL_shareThemeEmojiBackdrop.emojis = pickedEmoji;
                }
                tL_shareThemeGift = tL_shareThemeEmojiBackdrop;
            }
        }
        if (tL_shareThemeGift2 == null) {
            tL_shareThemeGift2 = tL_shareThemeGift;
        }
        this.H = tL_shareThemeGift2;
        ?? obj = new Object();
        obj.f1478a = tL_shareThemeGift2;
        g(this.f1487a).put(d1Var.f1471f, obj);
        j(this.H);
        this.v = tL_shareThemeGift;
        a1 a1Var = this.G;
        AndroidUtilities.cancelRunOnUIThread(a1Var);
        AndroidUtilities.runOnUIThread(a1Var, 700L);
    }

    public final void j(TLRPC.ShareTheme shareTheme) {
        int i10 = this.f1487a;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.f1489c.f1471f;
        if (j10 > 0) {
            TLRPC.UserFull userFull = messagesController.getUserFull(j10);
            if (userFull != null) {
                userFull.share_theme = shareTheme;
                MessagesStorage.getInstance(i10).updateUserInfo(userFull, false);
                return;
            }
            return;
        }
        TLRPC.ChatFull chatFull = messagesController.getChatFull(-j10);
        if (chatFull != null) {
            chatFull.share_theme = shareTheme;
            MessagesStorage.getInstance(i10).updateChatInfo(chatFull, false);
        }
    }

    public final void k() {
        this.E = true;
        int i10 = this.f1487a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        AndroidUtilities.cancelRunOnUIThread(this.F);
        AndroidUtilities.cancelRunOnUIThread(this.G);
        m();
        if (this.f1491n != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f1491n, true);
            this.f1491n = 0;
        }
    }

    public final void l(boolean z10, boolean z11) {
        int i10 = this.f1491n;
        int i11 = this.f1487a;
        if (i10 != 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f1491n, true);
        }
        TLRPC.TL_contacts_exportNoPaidMessagesToken tL_contacts_exportNoPaidMessagesToken = new TLRPC.TL_contacts_exportNoPaidMessagesToken();
        tL_contacts_exportNoPaidMessagesToken.revoke = z10;
        tL_contacts_exportNoPaidMessagesToken.temporary = z11;
        int sendRequestTyped = ConnectionsManager.getInstance(i11).sendRequestTyped(tL_contacts_exportNoPaidMessagesToken, new Object(), new b1(this, r6, z11, 0));
        this.f1491n = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void m() {
        if (this.v != null) {
            TLRPC.TL_messages_setShareTheme tL_messages_setShareTheme = new TLRPC.TL_messages_setShareTheme();
            TLRPC.InputPeer e = e();
            tL_messages_setShareTheme.peer = e;
            tL_messages_setShareTheme.theme = this.v;
            this.v = null;
            if (e == null) {
                return;
            }
            int i10 = this.f1494w;
            int i11 = this.f1487a;
            if (i10 != 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(this.f1494w, true);
            }
            LongSparseArray g7 = g(i11);
            d1 d1Var = this.f1489c;
            e1 e1Var = (e1) g7.get(d1Var.f1471f);
            long j10 = d1Var.f1471f;
            int i12 = this.f1487a;
            int sendRequestTyped = ConnectionsManager.getInstance(i12).sendRequestTyped(tL_messages_setShareTheme, new Object(), new c1(this, r7, e1Var, i12, j10));
            this.f1494w = sendRequestTyped;
            int[] iArr = {sendRequestTyped};
        }
    }

    public final void n() {
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken;
        a1 a1Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(a1Var);
        if (this.E) {
            return;
        }
        int i10 = this.d;
        int i11 = this.f1487a;
        if (i10 == 1 && this.f1491n == 0 && (this.f1490f == null || SystemClock.elapsedRealtime() - this.h >= 30000 || ((tL_exportedNoPaidMessagesToken = this.f1490f) != null && tL_exportedNoPaidMessagesToken.expires != 0 && ConnectionsManager.getInstance(i11).getCurrentTime() >= this.f1490f.expires - 5))) {
            l(false, true);
        }
        if (this.f1489c.d && ((this.f1492r == null || System.currentTimeMillis() / 1000 >= this.f1492r.expires) && SystemClock.elapsedRealtime() - this.f1493s >= 5000)) {
            this.f1493s = SystemClock.elapsedRealtime();
            MessagesController.getInstance(i11).requestContactToken(new i(this, 2));
        }
        AndroidUtilities.runOnUIThread(a1Var, 1000L);
    }

    public final void p() {
        long j10;
        int i10 = this.f1487a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(i10).getGlobalPrivacySettings();
        if (globalPrivacySettings == null) {
            ContactsController.getInstance(i10).loadGlobalPrivacySetting();
            j10 = 0;
        } else {
            j10 = globalPrivacySettings.noncontact_peers_paid_stars;
        }
        t1 t1Var = this.f1488b;
        t1Var.setFeeStars(j10);
        if (j10 > 0 && !this.e) {
            this.e = true;
            if (!this.f1489c.d && this.d == 0 && MessagesController.getMainSettings(i10).getBoolean("qrNoPaidPermanent", false)) {
                this.d = 2;
                t1Var.f1888v0 = true;
                t1Var.f1899w0 = false;
                t1Var.B0 = 1.0f;
                t1Var.D0 = 1.0f;
                t1Var.C0 = 1.0f;
                t1Var.F0 = true;
                t1Var.G0 = 1.0f;
                t1Var.f1931z2 = null;
                t1Var.A2 = -1;
                t1Var.u1(false);
                t1Var.invalidate();
                TLRPC.TL_exportedNoPaidMessagesToken c10 = c();
                this.f1490f = c10;
                if (c10 != null) {
                    t1Var.setFreeLink(d(c10));
                }
                l(false, false);
            }
        }
    }
}
