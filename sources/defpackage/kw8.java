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
public final class kw8 implements gk7 {
    public static final LongSparseArray[] J = new LongSparseArray[4];
    public boolean E;
    public boolean F;
    public TLRPC.ShareTheme I;
    public final int a;
    public final vw8 b;
    public final iw8 c;
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
    public final hw8 G = new Runnable(this) {
        public final kw8 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            kw8 kw8Var = this.b;
            switch (b) {
                case 0:
                    kw8Var.p();
                    return;
                default:
                    kw8Var.o();
                    return;
            }
        }
    };
    public final hw8 H = new Runnable(this) {
        public final kw8 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            kw8 kw8Var = this.b;
            switch (b) {
                case 0:
                    kw8Var.p();
                    return;
                default:
                    kw8Var.o();
                    return;
            }
        }
    };

    public kw8(int i, vw8 vw8Var, iw8 iw8Var) {
        this.a = i;
        this.b = vw8Var;
        this.c = iw8Var;
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
            fa4.g(e, true);
            return null;
        }
    }

    public final void a(TLRPC.ShareTheme shareTheme) {
        ArrayList<TLRPC.Reaction> arrayList;
        float f;
        this.I = shareTheme;
        boolean z = shareTheme instanceof TLRPC.TL_shareThemeGift;
        boolean z2 = false;
        vw8 vw8Var = this.b;
        if (z) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList2 = vw8Var.w1;
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
                sw8 sw8Var = vw8Var.G;
                if (sw8Var.a == 2 && sw8Var.q == i) {
                    return;
                }
                vw8Var.f2 = true;
                vw8Var.J.clear();
                Runnable runnable = vw8Var.e2;
                if (runnable != null) {
                    runnable.run();
                }
                vw8Var.L7 = i;
                if (vw8Var.g2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                vw8Var.N7 = f;
                vw8Var.O7 = 1.0f;
                vw8Var.I0(vw8Var.getWidth() / 2.0f, (vw8Var.l() / 2.0f) + vw8Var.m(), i);
                vw8Var.f2 = false;
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
            vw8Var.e(i3, arrayList, z2);
            return;
        }
        vw8Var.d(vw8.F9);
    }

    public final void b() {
        this.w = null;
        gl.r(this.H);
        int i = this.a;
        LongSparseArray h = h(i);
        long j = this.c.f;
        jw8 jw8Var = (jw8) h.get(j);
        if (jw8Var != null && jw8Var.b == 0) {
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
        iw8 iw8Var = this.c;
        String str = iw8Var.a;
        if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) && str != null && !iw8Var.d) {
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
        if (i == kk7.j0) {
            r();
        } else if (i == kk7.D0) {
            if (((Long) objArr[0]).longValue() == j) {
                i(((TLRPC.UserFull) objArr[1]).share_theme);
            }
        } else if (i == kk7.S && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (-chatFull.id) == j) {
            i(chatFull.share_theme);
        }
    }

    public final TLRPC.InputPeer e() {
        iw8 iw8Var = this.c;
        if (iw8Var.e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer h1 = na7.q1(this.a).h1(iw8Var.f);
        if (h1 instanceof TLRPC.TL_inputPeerEmpty) {
            return null;
        }
        return h1;
    }

    public final SharedPreferences f() {
        return na7.q1(this.a).X3;
    }

    public final void g() {
        int i = this.a;
        na7 q1 = na7.q1(i);
        long j = this.c.f;
        if (j > 0) {
            TLRPC.User V1 = q1.V1(Long.valueOf(j));
            if (V1 != null) {
                kk7.f(i).b(this, kk7.D0);
                q1.i3(0, V1, true);
                return;
            }
            return;
        }
        TLRPC.Chat K0 = q1.K0(Long.valueOf(-j));
        if (K0 == null) {
            return;
        }
        kk7.f(i).b(this, kk7.S);
        ad7.Y(i).C0(K0.id, hc2.T(K0), null, true, false, 0);
    }

    public final void i(TLRPC.ShareTheme shareTheme) {
        long j = this.c.f;
        if (!this.F) {
            if (shareTheme == null) {
                shareTheme = new TLRPC.TL_shareThemeDefault();
            }
            int i = this.a;
            jw8 jw8Var = (jw8) h(i).get(j);
            if (jw8Var != null) {
                TLRPC.ShareTheme shareTheme2 = jw8Var.a;
                byte[] q = q(shareTheme);
                byte[] q2 = q(shareTheme2);
                if (q != null && Arrays.equals(q, q2)) {
                    h(i).remove(j);
                } else if (jw8Var.b != 0 && SystemClock.elapsedRealtime() - jw8Var.b >= 10000) {
                    h(i).remove(j);
                } else {
                    k(jw8Var.a);
                    return;
                }
            }
            if (!this.y) {
                TLRPC.ShareTheme shareTheme3 = this.I;
                if (shareTheme3 == null) {
                    vw8 vw8Var = this.b;
                    vw8Var.setInstantTheme(true);
                    a(shareTheme);
                    vw8Var.setInstantTheme(false);
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
        iw8 iw8Var = this.c;
        if (!iw8Var.g) {
            return;
        }
        vw8 vw8Var = this.b;
        TL_stars.TL_starGiftUnique themeGift = vw8Var.getThemeGift();
        ArrayList<TLRPC.Reaction> pickedEmoji = vw8Var.getPickedEmoji();
        TLRPC.TL_shareThemeGift tL_shareThemeGift2 = null;
        r6 = null;
        r6 = null;
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = null;
        tL_shareThemeGift2 = null;
        if (themeGift != null) {
            if (iw8Var.e) {
                if (!TextUtils.isEmpty(themeGift.slug)) {
                    ?? tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = themeGift.slug;
                    tL_inputSavedStarGiftChat = tL_inputSavedStarGiftSlug;
                }
            } else {
                long themeGiftSavedId = vw8Var.getThemeGiftSavedId();
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
            int themeBackdropIndex = vw8Var.getThemeBackdropIndex();
            if (themeBackdropIndex >= 0 && themeBackdropIndex != vw8.F9) {
                z = true;
            }
            if (z) {
                if (ld0.h == null) {
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
                tL_shareThemeEmojiBackdrop.backdrop_id = ld0.h[themeBackdropIndex];
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
        h(this.a).put(iw8Var.f, obj);
        k(this.I);
        this.w = tL_shareThemeGift;
        hw8 hw8Var = this.H;
        gl.r(hw8Var);
        gl.d3(hw8Var, 700L);
    }

    public final void k(TLRPC.ShareTheme shareTheme) {
        int i = this.a;
        na7 q1 = na7.q1(i);
        long j = this.c.f;
        if (j > 0) {
            TLRPC.UserFull W1 = q1.W1(j);
            if (W1 != null) {
                W1.share_theme = shareTheme;
                ad7.Y(i).g2(W1, false);
                return;
            }
            return;
        }
        TLRPC.ChatFull L0 = q1.L0(-j);
        if (L0 != null) {
            L0.share_theme = shareTheme;
            ad7.Y(i).K1(L0, false);
        }
    }

    public final void l() {
        this.F = true;
        int i = this.a;
        kk7.f(i).n(this, kk7.j0);
        kk7.f(i).n(this, kk7.D0);
        kk7.f(i).n(this, kk7.S);
        gl.r(this.G);
        gl.r(this.H);
        o();
        if (this.n != 0) {
            ConnectionsManager.getInstance(i).cancelRequest(this.n, true);
            this.n = 0;
        }
    }

    public final void m() {
        this.s = SystemClock.elapsedRealtime();
        na7 q1 = na7.q1(this.a);
        zf7 zf7Var = new zf7(this, (byte) 22);
        if (q1.K4) {
            return;
        }
        TLRPC.TL_exportedContactToken tL_exportedContactToken = q1.L4;
        if (tL_exportedContactToken != null && tL_exportedContactToken.expires > System.currentTimeMillis() / 1000) {
            zf7Var.a(q1.L4);
            return;
        }
        q1.K4 = true;
        q1.getConnectionsManager().sendRequest(new TLRPC.TL_contacts_exportContactToken(), new w47(q1, zf7Var, System.currentTimeMillis(), (byte) 9));
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
        int sendRequestTyped = ConnectionsManager.getInstance(i2).sendRequestTyped(tL_contacts_exportNoPaidMessagesToken, new hc((byte) 0), new yd2(this, r6, z2, (byte) 2));
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
            iw8 iw8Var = this.c;
            jw8 jw8Var = (jw8) h.get(iw8Var.f);
            long j = iw8Var.f;
            int i3 = this.a;
            int sendRequestTyped = ConnectionsManager.getInstance(i3).sendRequestTyped(tL_messages_setShareTheme, new hc((byte) 0), new yg(this, r7, jw8Var, i3, j));
            this.x = sendRequestTyped;
            int[] iArr = {sendRequestTyped};
        }
    }

    public final void p() {
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken;
        hw8 hw8Var = this.G;
        gl.r(hw8Var);
        if (this.F) {
            return;
        }
        if (this.d == 1 && this.n == 0 && (this.f == null || SystemClock.elapsedRealtime() - this.h >= 30000 || ((tL_exportedNoPaidMessagesToken = this.f) != null && tL_exportedNoPaidMessagesToken.expires != 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= this.f.expires - 5))) {
            n(false, true);
        }
        if (this.c.d && ((this.r == null || System.currentTimeMillis() / 1000 >= this.r.expires) && SystemClock.elapsedRealtime() - this.s >= 5000)) {
            m();
        }
        gl.d3(hw8Var, 1000L);
    }

    public final void r() {
        long j;
        int i = this.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = qu2.r(i).Y;
        if (globalPrivacySettings == null) {
            qu2.r(i).B();
            j = 0;
        } else {
            j = globalPrivacySettings.noncontact_peers_paid_stars;
        }
        vw8 vw8Var = this.b;
        vw8Var.setFeeStars(j);
        if (j > 0 && !this.e) {
            this.e = true;
            if (!this.c.d && this.d == 0 && f().getBoolean("qrNoPaidPermanent", false)) {
                this.d = (byte) 2;
                vw8Var.w0 = true;
                vw8Var.x0 = false;
                vw8Var.C0 = 1.0f;
                vw8Var.E0 = 1.0f;
                vw8Var.D0 = 1.0f;
                vw8Var.G0 = true;
                vw8Var.H0 = 1.0f;
                vw8Var.A2 = null;
                vw8Var.B2 = -1;
                vw8Var.t1(false);
                vw8Var.invalidate();
                TLRPC.TL_exportedNoPaidMessagesToken c = c();
                this.f = c;
                if (c != null) {
                    vw8Var.setFreeLink(d(c));
                }
                n(false, false);
            }
        }
    }
}
