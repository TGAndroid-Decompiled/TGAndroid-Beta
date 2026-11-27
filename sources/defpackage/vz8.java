package defpackage;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class vz8 implements fn7 {
    public static final LongSparseArray[] J = new LongSparseArray[4];
    public boolean E;
    public boolean F;
    public TLRPC.ShareTheme I;
    public final int a;
    public final f09 b;
    public final tz8 c;
    public boolean e;
    public TLRPC.TL_exportedNoPaidMessagesToken f;
    public long h;
    public int n;
    public TLRPC.TL_exportedContactToken r;
    public long s;
    public TLRPC.ShareTheme w;
    public int x;
    public boolean y;
    public byte d = 0;
    public final sz8 G = new Runnable(this) {
        public final vz8 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            vz8 vz8Var = this.b;
            switch (b) {
                case 0:
                    vz8Var.p();
                    return;
                default:
                    vz8Var.o();
                    return;
            }
        }
    };
    public final sz8 H = new Runnable(this) {
        public final vz8 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            vz8 vz8Var = this.b;
            switch (b) {
                case 0:
                    vz8Var.p();
                    return;
                default:
                    vz8Var.o();
                    return;
            }
        }
    };

    public vz8(int i, f09 f09Var, tz8 tz8Var) {
        this.a = i;
        this.b = f09Var;
        this.c = tz8Var;
    }

    public static LongSparseArray h(int i) {
        LongSparseArray[] longSparseArrayArr = J;
        if (longSparseArrayArr[i] == null) {
            longSparseArrayArr[i] = new LongSparseArray();
        }
        return longSparseArrayArr[i];
    }

    public static byte[] q(TLObject tLObject) {
        try {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            return byteArray;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public final void a(TLRPC.ShareTheme shareTheme) {
        ArrayList<TLRPC.Reaction> arrayList;
        float f;
        this.I = shareTheme;
        boolean z = shareTheme instanceof TLRPC.TL_shareThemeGift;
        boolean z2 = false;
        f09 f09Var = this.b;
        if (z) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList2 = f09Var.w1;
                int i = 0;
                while (true) {
                    if (i < arrayList2.size()) {
                        if (((TL_stars.TL_starGiftUnique) arrayList2.get(i)).id == tL_starGiftUnique.id) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i < 0) {
                    arrayList2.add(0, tL_starGiftUnique);
                    i = 0;
                }
                c09 c09Var = f09Var.G;
                if (c09Var.a == 2 && c09Var.q == i) {
                    return;
                }
                f09Var.f2 = true;
                f09Var.J.clear();
                Runnable runnable = f09Var.e2;
                if (runnable != null) {
                    runnable.run();
                }
                f09Var.L7 = i;
                if (f09Var.g2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                f09Var.N7 = f;
                f09Var.O7 = 1.0f;
                f09Var.I0(f09Var.getWidth() / 2.0f, (f09Var.l() / 2.0f) + f09Var.m(), i);
                f09Var.f2 = false;
                return;
            }
        }
        if (shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop) {
            TLRPC.TL_shareThemeEmojiBackdrop tL_shareThemeEmojiBackdrop = (TLRPC.TL_shareThemeEmojiBackdrop) shareTheme;
            int i2 = tL_shareThemeEmojiBackdrop.flags;
            if ((i2 & 1) != 0) {
                z2 = true;
            }
            int i3 = tL_shareThemeEmojiBackdrop.backdrop_id;
            if ((i2 & 2) != 0) {
                arrayList = tL_shareThemeEmojiBackdrop.emojis;
            } else {
                arrayList = null;
            }
            f09Var.e(i3, arrayList, z2);
            return;
        }
        f09Var.d(f09.F9);
    }

    public final void b() {
        this.w = null;
        hl.r(this.H);
        int i = this.a;
        LongSparseArray h = h(i);
        long j = this.c.f;
        uz8 uz8Var = (uz8) h.get(j);
        if (uz8Var != null && uz8Var.b == 0) {
            h(i).remove(j);
        }
    }

    public final TLRPC.TL_exportedNoPaidMessagesToken c() {
        String string = f().getString("qrNoPaidToken", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = new TLRPC.TL_exportedNoPaidMessagesToken();
        tL_exportedNoPaidMessagesToken.token = string;
        tL_exportedNoPaidMessagesToken.url = f().getString("qrNoPaidUrl", null);
        return tL_exportedNoPaidMessagesToken;
    }

    public final String d(TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken) {
        tz8 tz8Var = this.c;
        String str = tz8Var.a;
        if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) && str != null && !tz8Var.d) {
            return str + "?free=" + tL_exportedNoPaidMessagesToken.token;
        } else if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url)) {
            return null;
        } else {
            return tL_exportedNoPaidMessagesToken.url;
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        long j = this.c.f;
        if (i == jn7.k0) {
            r();
        } else if (i == jn7.E0) {
            if (((Long) objArr[0]).longValue() == j) {
                i(((TLRPC.UserFull) objArr[1]).share_theme);
            }
        } else if (i == jn7.T && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (-chatFull.id) == j) {
            i(chatFull.share_theme);
        }
    }

    public final TLRPC.InputPeer e() {
        tz8 tz8Var = this.c;
        if (tz8Var.e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer j1 = uc7.s1(this.a).j1(tz8Var.f);
        if (j1 instanceof TLRPC.TL_inputPeerEmpty) {
            return null;
        }
        return j1;
    }

    public final SharedPreferences f() {
        return uc7.s1(this.a).X3;
    }

    public final void g() {
        int i = this.a;
        uc7 s1 = uc7.s1(i);
        long j = this.c.f;
        if (j > 0) {
            TLRPC.User X1 = s1.X1(Long.valueOf(j));
            if (X1 != null) {
                jn7.f(i).b(this, jn7.E0);
                s1.o3(0, X1, true);
                return;
            }
            return;
        }
        TLRPC.Chat M0 = s1.M0(Long.valueOf(-j));
        if (M0 == null) {
            return;
        }
        jn7.f(i).b(this, jn7.T);
        jf7.Y(i).C0(M0.id, xc2.T(M0), null, true, false, 0);
    }

    public final void i(TLRPC.ShareTheme shareTheme) {
        long j = this.c.f;
        if (!this.F) {
            if (shareTheme == null) {
                shareTheme = new TLRPC.TL_shareThemeDefault();
            }
            int i = this.a;
            uz8 uz8Var = (uz8) h(i).get(j);
            if (uz8Var != null) {
                TLRPC.ShareTheme shareTheme2 = uz8Var.a;
                byte[] q = q(shareTheme);
                byte[] q2 = q(shareTheme2);
                if (q != null && Arrays.equals(q, q2)) {
                    h(i).remove(j);
                } else if (uz8Var.b != 0 && SystemClock.elapsedRealtime() - uz8Var.b >= 10000) {
                    h(i).remove(j);
                } else {
                    k(uz8Var.a);
                    return;
                }
            }
            if (!this.y) {
                TLRPC.ShareTheme shareTheme3 = this.I;
                if (shareTheme3 == null) {
                    f09 f09Var = this.b;
                    f09Var.setInstantTheme(true);
                    a(shareTheme);
                    f09Var.setInstantTheme(false);
                    return;
                }
                byte[] q3 = q(shareTheme);
                byte[] q4 = q(shareTheme3);
                if (q3 != null && Arrays.equals(q3, q4)) {
                    return;
                }
                a(shareTheme);
            }
        }
    }

    public final void j() {
        TLRPC.TL_shareThemeGift tL_shareThemeGift;
        this.y = true;
        boolean z = false;
        this.E = false;
        tz8 tz8Var = this.c;
        if (!tz8Var.g) {
            return;
        }
        f09 f09Var = this.b;
        TL_stars.TL_starGiftUnique themeGift = f09Var.getThemeGift();
        ArrayList<TLRPC.Reaction> pickedEmoji = f09Var.getPickedEmoji();
        TLRPC.TL_shareThemeGift tL_shareThemeGift2 = null;
        r6 = null;
        r6 = null;
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = null;
        tL_shareThemeGift2 = null;
        if (themeGift != null) {
            if (tz8Var.e) {
                if (!TextUtils.isEmpty(themeGift.slug)) {
                    ?? tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = themeGift.slug;
                    tL_inputSavedStarGiftChat = tL_inputSavedStarGiftSlug;
                }
            } else {
                long themeGiftSavedId = f09Var.getThemeGiftSavedId();
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
            int themeBackdropIndex = f09Var.getThemeBackdropIndex();
            if (themeBackdropIndex >= 0 && themeBackdropIndex != f09.F9) {
                z = true;
            }
            if (z) {
                if (nd0.h == null) {
                    b();
                    this.E = true;
                    return;
                }
            } else if (pickedEmoji.isEmpty()) {
                tL_shareThemeGift = new TLRPC.TL_shareThemeDefault();
            }
            ?? tL_shareThemeEmojiBackdrop = new TLRPC.TL_shareThemeEmojiBackdrop();
            if (z) {
                tL_shareThemeEmojiBackdrop.flags |= 1;
                tL_shareThemeEmojiBackdrop.backdrop_id = nd0.h[themeBackdropIndex];
            }
            if (!pickedEmoji.isEmpty()) {
                tL_shareThemeEmojiBackdrop.flags |= 2;
                tL_shareThemeEmojiBackdrop.emojis = pickedEmoji;
            }
            tL_shareThemeGift = tL_shareThemeEmojiBackdrop;
        }
        if (tL_shareThemeGift2 == null) {
            tL_shareThemeGift2 = tL_shareThemeGift;
        }
        this.I = tL_shareThemeGift2;
        ?? obj = new Object();
        obj.a = tL_shareThemeGift2;
        h(this.a).put(tz8Var.f, obj);
        k(this.I);
        this.w = tL_shareThemeGift;
        sz8 sz8Var = this.H;
        hl.r(sz8Var);
        hl.d3(sz8Var, 700L);
    }

    public final void k(TLRPC.ShareTheme shareTheme) {
        int i = this.a;
        uc7 s1 = uc7.s1(i);
        long j = this.c.f;
        if (j > 0) {
            TLRPC.UserFull Y1 = s1.Y1(j);
            if (Y1 != null) {
                Y1.share_theme = shareTheme;
                jf7.Y(i).g2(Y1, false);
                return;
            }
            return;
        }
        TLRPC.ChatFull N0 = s1.N0(-j);
        if (N0 != null) {
            N0.share_theme = shareTheme;
            jf7.Y(i).K1(N0, false);
        }
    }

    public final void l() {
        this.F = true;
        int i = this.a;
        jn7.f(i).n(this, jn7.k0);
        jn7.f(i).n(this, jn7.E0);
        jn7.f(i).n(this, jn7.T);
        hl.r(this.G);
        hl.r(this.H);
        o();
        if (this.n != 0) {
            ConnectionsManager.getInstance(i).cancelRequest(this.n, true);
            this.n = 0;
        }
    }

    public final void m() {
        this.s = SystemClock.elapsedRealtime();
        uc7 s1 = uc7.s1(this.a);
        ii7 ii7Var = new ii7(this, (byte) 22);
        if (s1.L4) {
            return;
        }
        TLRPC.TL_exportedContactToken tL_exportedContactToken = s1.M4;
        if (tL_exportedContactToken != null && tL_exportedContactToken.expires > System.currentTimeMillis() / 1000) {
            ii7Var.a(s1.M4);
            return;
        }
        s1.L4 = true;
        s1.getConnectionsManager().sendRequest(new TLRPC.TL_contacts_exportContactToken(), new p87(s1, ii7Var, System.currentTimeMillis(), (byte) 8));
    }

    public final void n(boolean z, boolean z2) {
        int i = this.n;
        int i2 = this.a;
        if (i != 0) {
            ConnectionsManager.getInstance(i2).cancelRequest(this.n, true);
        }
        TLRPC.TL_contacts_exportNoPaidMessagesToken tL_contacts_exportNoPaidMessagesToken = new TLRPC.TL_contacts_exportNoPaidMessagesToken();
        tL_contacts_exportNoPaidMessagesToken.revoke = z;
        tL_contacts_exportNoPaidMessagesToken.temporary = z2;
        int sendRequestTyped = ConnectionsManager.getInstance(i2).sendRequestTyped(tL_contacts_exportNoPaidMessagesToken, new ic((byte) 0), new se2(this, r6, z2, (byte) 2));
        this.n = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void o() {
        if (this.w != null) {
            TLRPC.TL_messages_setShareTheme tL_messages_setShareTheme = new TLRPC.TL_messages_setShareTheme();
            TLRPC.InputPeer e = e();
            tL_messages_setShareTheme.peer = e;
            tL_messages_setShareTheme.theme = this.w;
            this.w = null;
            if (e == null) {
                return;
            }
            int i = this.x;
            int i2 = this.a;
            if (i != 0) {
                ConnectionsManager.getInstance(i2).cancelRequest(this.x, true);
            }
            LongSparseArray h = h(i2);
            tz8 tz8Var = this.c;
            uz8 uz8Var = (uz8) h.get(tz8Var.f);
            long j = tz8Var.f;
            int i3 = this.a;
            int sendRequestTyped = ConnectionsManager.getInstance(i3).sendRequestTyped(tL_messages_setShareTheme, new ic((byte) 0), new ng(this, r7, uz8Var, i3, j));
            this.x = sendRequestTyped;
            int[] iArr = {sendRequestTyped};
        }
    }

    public final void p() {
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken;
        sz8 sz8Var = this.G;
        hl.r(sz8Var);
        if (this.F) {
            return;
        }
        if (this.d == 1 && this.n == 0 && (this.f == null || SystemClock.elapsedRealtime() - this.h >= 30000 || ((tL_exportedNoPaidMessagesToken = this.f) != null && tL_exportedNoPaidMessagesToken.expires != 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= this.f.expires - 5))) {
            n(false, true);
        }
        if (this.c.d && ((this.r == null || System.currentTimeMillis() / 1000 >= this.r.expires) && SystemClock.elapsedRealtime() - this.s >= 5000)) {
            m();
        }
        hl.d3(sz8Var, 1000L);
    }

    public final void r() {
        long j;
        int i = this.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = lv2.r(i).Y;
        if (globalPrivacySettings == null) {
            lv2.r(i).B();
            j = 0;
        } else {
            j = globalPrivacySettings.noncontact_peers_paid_stars;
        }
        f09 f09Var = this.b;
        f09Var.setFeeStars(j);
        if (j > 0 && !this.e) {
            this.e = true;
            if (!this.c.d && this.d == 0 && f().getBoolean("qrNoPaidPermanent", false)) {
                this.d = (byte) 2;
                f09Var.w0 = true;
                f09Var.x0 = false;
                f09Var.C0 = 1.0f;
                f09Var.E0 = 1.0f;
                f09Var.D0 = 1.0f;
                f09Var.G0 = true;
                f09Var.H0 = 1.0f;
                f09Var.A2 = null;
                f09Var.B2 = -1;
                f09Var.t1(false);
                f09Var.invalidate();
                TLRPC.TL_exportedNoPaidMessagesToken c = c();
                this.f = c;
                if (c != null) {
                    f09Var.setFreeLink(d(c));
                }
                n(false, false);
            }
        }
    }
}
