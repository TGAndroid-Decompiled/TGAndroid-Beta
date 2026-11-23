package ci;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.a8;
import org.telegram.messenger.gs;
import org.telegram.messenger.ho;
import org.telegram.messenger.i5;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class o0 implements gs {
    public static final LongSparseArray[] J = new LongSparseArray[4];
    public boolean E;
    public boolean F;
    public TLRPC.ShareTheme I;
    public final int f5760a;
    public final z0 f5761b;
    public final m0 f5762c;
    public boolean f5763e;
    public TLRPC.TL_exportedNoPaidMessagesToken f5764f;
    public long h;
    public int f5765n;
    public TLRPC.TL_exportedContactToken f5766r;
    public long f5767s;
    public TLRPC.ShareTheme f5768w;
    public int f5769x;
    public boolean f5770y;
    public int d = 0;
    public final k0 G = new Runnable(this) {
        public final o0 f5733b;

        {
            this.f5733b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f5733b.p();
                    return;
                default:
                    this.f5733b.o();
                    return;
            }
        }
    };
    public final k0 H = new Runnable(this) {
        public final o0 f5733b;

        {
            this.f5733b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f5733b.p();
                    return;
                default:
                    this.f5733b.o();
                    return;
            }
        }
    };

    public o0(int i7, z0 z0Var, m0 m0Var) {
        this.f5760a = i7;
        this.f5761b = z0Var;
        this.f5762c = m0Var;
    }

    public static LongSparseArray h(int i7) {
        LongSparseArray[] longSparseArrayArr = J;
        if (longSparseArrayArr[i7] == null) {
            longSparseArrayArr[i7] = new LongSparseArray();
        }
        return longSparseArrayArr[i7];
    }

    public static byte[] q(TLObject tLObject) {
        try {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            return byteArray;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public final void a(TLRPC.ShareTheme shareTheme) {
        ArrayList<TLRPC.Reaction> arrayList;
        float f10;
        this.I = shareTheme;
        boolean z10 = shareTheme instanceof TLRPC.TL_shareThemeGift;
        boolean z11 = false;
        z0 z0Var = this.f5761b;
        if (z10) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList2 = z0Var.f6098w1;
                int i7 = 0;
                while (true) {
                    if (i7 < arrayList2.size()) {
                        if (((TL_stars.TL_starGiftUnique) arrayList2.get(i7)).f28663id == tL_starGiftUnique.f28663id) {
                            break;
                        }
                        i7++;
                    } else {
                        i7 = -1;
                        break;
                    }
                }
                if (i7 < 0) {
                    arrayList2.add(0, tL_starGiftUnique);
                    i7 = 0;
                }
                w0 w0Var = z0Var.G;
                if (w0Var.f5840a == 2 && w0Var.f5854q == i7) {
                    return;
                }
                z0Var.f5935f2 = true;
                z0Var.J.clear();
                Runnable runnable = z0Var.f5924e2;
                if (runnable != null) {
                    runnable.run();
                }
                z0Var.M7 = i7;
                if (z0Var.f5945g2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                z0Var.O7 = f10;
                z0Var.P7 = 1.0f;
                z0Var.I0(z0Var.getWidth() / 2.0f, (z0Var.l() / 2.0f) + z0Var.m(), i7);
                z0Var.f5935f2 = false;
                return;
            }
        }
        if (shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop) {
            TLRPC.TL_shareThemeEmojiBackdrop tL_shareThemeEmojiBackdrop = (TLRPC.TL_shareThemeEmojiBackdrop) shareTheme;
            int i10 = tL_shareThemeEmojiBackdrop.flags;
            if ((i10 & 1) != 0) {
                z11 = true;
            }
            int i11 = tL_shareThemeEmojiBackdrop.backdrop_id;
            if ((i10 & 2) != 0) {
                arrayList = tL_shareThemeEmojiBackdrop.emojis;
            } else {
                arrayList = null;
            }
            z0Var.e(i11, arrayList, z11);
            return;
        }
        z0Var.d(z0.H9);
    }

    public final void b() {
        this.f5768w = null;
        org.telegram.messenger.g0.r(this.H);
        int i7 = this.f5760a;
        LongSparseArray h = h(i7);
        long j3 = this.f5762c.f5750f;
        n0 n0Var = (n0) h.get(j3);
        if (n0Var != null && n0Var.f5756b == 0) {
            h(i7).remove(j3);
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
        m0 m0Var = this.f5762c;
        String str = m0Var.f5746a;
        if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) && str != null && !m0Var.d) {
            return str + "?free=" + tL_exportedNoPaidMessagesToken.token;
        } else if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url)) {
            return null;
        } else {
            return tL_exportedNoPaidMessagesToken.url;
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        long j3 = this.f5762c.f5750f;
        if (i7 == ls.f25333k0) {
            r();
        } else if (i7 == ls.E0) {
            if (((Long) objArr[0]).longValue() == j3) {
                i(((TLRPC.UserFull) objArr[1]).share_theme);
            }
        } else if (i7 == ls.T && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (-chatFull.f28435id) == j3) {
            i(chatFull.share_theme);
        }
    }

    public final TLRPC.InputPeer e() {
        m0 m0Var = this.f5762c;
        if (m0Var.f5749e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer l1 = np.u1(this.f5760a).l1(m0Var.f5750f);
        if (l1 instanceof TLRPC.TL_inputPeerEmpty) {
            return null;
        }
        return l1;
    }

    public final SharedPreferences f() {
        return np.u1(this.f5760a).h7;
    }

    public final void g() {
        int i7 = this.f5760a;
        np u12 = np.u1(i7);
        long j3 = this.f5762c.f5750f;
        if (j3 > 0) {
            TLRPC.User c22 = u12.c2(Long.valueOf(j3));
            if (c22 != null) {
                ls.f(i7).c(this, ls.E0);
                u12.n3(c22, true, 0);
                return;
            }
            return;
        }
        TLRPC.Chat O0 = u12.O0(Long.valueOf(-j3));
        if (O0 == null) {
            return;
        }
        ls.f(i7).c(this, ls.T);
        ur.a0(i7).F0(O0.f28434id, v3.T(O0), null, true, false, 0);
    }

    public final void i(TLRPC.ShareTheme shareTheme) {
        long j3 = this.f5762c.f5750f;
        if (!this.F) {
            if (shareTheme == null) {
                shareTheme = new TLRPC.TL_shareThemeDefault();
            }
            int i7 = this.f5760a;
            n0 n0Var = (n0) h(i7).get(j3);
            if (n0Var != null) {
                TLRPC.ShareTheme shareTheme2 = n0Var.f5755a;
                byte[] q10 = q(shareTheme);
                byte[] q11 = q(shareTheme2);
                if (q10 != null && Arrays.equals(q10, q11)) {
                    h(i7).remove(j3);
                } else if (n0Var.f5756b != 0 && SystemClock.elapsedRealtime() - n0Var.f5756b >= 10000) {
                    h(i7).remove(j3);
                } else {
                    k(n0Var.f5755a);
                    return;
                }
            }
            if (!this.f5770y) {
                TLRPC.ShareTheme shareTheme3 = this.I;
                if (shareTheme3 == null) {
                    z0 z0Var = this.f5761b;
                    z0Var.setInstantTheme(true);
                    a(shareTheme);
                    z0Var.setInstantTheme(false);
                    return;
                }
                byte[] q12 = q(shareTheme);
                byte[] q13 = q(shareTheme3);
                if (q12 != null && Arrays.equals(q12, q13)) {
                    return;
                }
                a(shareTheme);
            }
        }
    }

    public final void j() {
        TLRPC.TL_shareThemeGift tL_shareThemeGift;
        this.f5770y = true;
        boolean z10 = false;
        this.E = false;
        m0 m0Var = this.f5762c;
        if (!m0Var.f5751g) {
            return;
        }
        z0 z0Var = this.f5761b;
        TL_stars.TL_starGiftUnique themeGift = z0Var.getThemeGift();
        ArrayList<TLRPC.Reaction> pickedEmoji = z0Var.getPickedEmoji();
        TLRPC.TL_shareThemeGift tL_shareThemeGift2 = null;
        r6 = null;
        r6 = null;
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = null;
        tL_shareThemeGift2 = null;
        if (themeGift != null) {
            if (m0Var.f5749e) {
                if (!TextUtils.isEmpty(themeGift.slug)) {
                    ?? tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = themeGift.slug;
                    tL_inputSavedStarGiftChat = tL_inputSavedStarGiftSlug;
                }
            } else {
                long themeGiftSavedId = z0Var.getThemeGiftSavedId();
                TLRPC.InputPeer e10 = e();
                if (themeGiftSavedId != 0 && e10 != null) {
                    TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                    tL_inputSavedStarGiftChat2.peer = e10;
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
            int themeBackdropIndex = z0Var.getThemeBackdropIndex();
            if (themeBackdropIndex >= 0 && themeBackdropIndex != z0.H9) {
                z10 = true;
            }
            if (z10 && a.h == null) {
                b();
                this.E = true;
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
        this.I = tL_shareThemeGift2;
        ?? obj = new Object();
        obj.f5755a = tL_shareThemeGift2;
        h(this.f5760a).put(m0Var.f5750f, obj);
        k(this.I);
        this.f5768w = tL_shareThemeGift;
        k0 k0Var = this.H;
        org.telegram.messenger.g0.r(k0Var);
        org.telegram.messenger.g0.h3(k0Var, 700L);
    }

    public final void k(TLRPC.ShareTheme shareTheme) {
        int i7 = this.f5760a;
        np u12 = np.u1(i7);
        long j3 = this.f5762c.f5750f;
        if (j3 > 0) {
            TLRPC.UserFull d2 = u12.d2(j3);
            if (d2 != null) {
                d2.share_theme = shareTheme;
                ur.a0(i7).j2(d2, false);
                return;
            }
            return;
        }
        TLRPC.ChatFull P0 = u12.P0(-j3);
        if (P0 != null) {
            P0.share_theme = shareTheme;
            ur.a0(i7).N1(P0, false);
        }
    }

    public final void l() {
        this.F = true;
        int i7 = this.f5760a;
        ls.f(i7).n(this, ls.f25333k0);
        ls.f(i7).n(this, ls.E0);
        ls.f(i7).n(this, ls.T);
        org.telegram.messenger.g0.r(this.G);
        org.telegram.messenger.g0.r(this.H);
        o();
        if (this.f5765n != 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(this.f5765n, true);
            this.f5765n = 0;
        }
    }

    public final void m() {
        this.f5767s = SystemClock.elapsedRealtime();
        np u12 = np.u1(this.f5760a);
        ai.h0 h0Var = new ai.h0(this, 8);
        if (u12.f25821c8) {
            return;
        }
        TLRPC.TL_exportedContactToken tL_exportedContactToken = u12.f25829d8;
        if (tL_exportedContactToken != null && tL_exportedContactToken.expires > System.currentTimeMillis() / 1000) {
            h0Var.a(u12.f25829d8);
            return;
        }
        u12.f25821c8 = true;
        u12.getConnectionsManager().sendRequest(new TLRPC.TL_contacts_exportContactToken(), new ho(u12, h0Var, System.currentTimeMillis(), 7));
    }

    public final void n(boolean z10, boolean z11) {
        int i7 = this.f5765n;
        int i10 = this.f5760a;
        if (i7 != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f5765n, true);
        }
        TLRPC.TL_contacts_exportNoPaidMessagesToken tL_contacts_exportNoPaidMessagesToken = new TLRPC.TL_contacts_exportNoPaidMessagesToken();
        tL_contacts_exportNoPaidMessagesToken.revoke = z10;
        tL_contacts_exportNoPaidMessagesToken.temporary = z11;
        int sendRequestTyped = ConnectionsManager.getInstance(i10).sendRequestTyped(tL_contacts_exportNoPaidMessagesToken, new d3.b(1), new l0(this, r6, z11, 0));
        this.f5765n = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void o() {
        if (this.f5768w != null) {
            TLRPC.TL_messages_setShareTheme tL_messages_setShareTheme = new TLRPC.TL_messages_setShareTheme();
            TLRPC.InputPeer e10 = e();
            tL_messages_setShareTheme.peer = e10;
            tL_messages_setShareTheme.theme = this.f5768w;
            this.f5768w = null;
            if (e10 == null) {
                return;
            }
            int i7 = this.f5769x;
            int i10 = this.f5760a;
            if (i7 != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f5769x, true);
            }
            LongSparseArray h = h(i10);
            m0 m0Var = this.f5762c;
            n0 n0Var = (n0) h.get(m0Var.f5750f);
            long j3 = m0Var.f5750f;
            int i11 = this.f5760a;
            int sendRequestTyped = ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_setShareTheme, new d3.b(1), new bi.z(this, r7, n0Var, i11, j3));
            this.f5769x = sendRequestTyped;
            int[] iArr = {sendRequestTyped};
        }
    }

    public final void p() {
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken;
        k0 k0Var = this.G;
        org.telegram.messenger.g0.r(k0Var);
        if (this.F) {
            return;
        }
        if (this.d == 1 && this.f5765n == 0 && (this.f5764f == null || SystemClock.elapsedRealtime() - this.h >= 30000 || ((tL_exportedNoPaidMessagesToken = this.f5764f) != null && tL_exportedNoPaidMessagesToken.expires != 0 && ConnectionsManager.getInstance(this.f5760a).getCurrentTime() >= this.f5764f.expires - 5))) {
            n(false, true);
        }
        if (this.f5762c.d && ((this.f5766r == null || System.currentTimeMillis() / 1000 >= this.f5766r.expires) && SystemClock.elapsedRealtime() - this.f5767s >= 5000)) {
            m();
        }
        org.telegram.messenger.g0.h3(k0Var, 1000L);
    }

    public final void r() {
        long j3;
        int i7 = this.f5760a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = i5.r(i7).Y;
        if (globalPrivacySettings == null) {
            i5.r(i7).B();
            j3 = 0;
        } else {
            j3 = globalPrivacySettings.noncontact_peers_paid_stars;
        }
        z0 z0Var = this.f5761b;
        z0Var.setFeeStars(j3);
        if (j3 > 0 && !this.f5763e) {
            this.f5763e = true;
            if (!this.f5762c.d && this.d == 0 && f().getBoolean("qrNoPaidPermanent", false)) {
                this.d = 2;
                z0Var.f6097w0 = true;
                z0Var.f6108x0 = false;
                z0Var.C0 = 1.0f;
                z0Var.E0 = 1.0f;
                z0Var.D0 = 1.0f;
                z0Var.G0 = true;
                z0Var.H0 = 1.0f;
                z0Var.A2 = null;
                z0Var.B2 = -1;
                z0Var.u1(false);
                z0Var.invalidate();
                TLRPC.TL_exportedNoPaidMessagesToken c10 = c();
                this.f5764f = c10;
                if (c10 != null) {
                    z0Var.setFreeLink(d(c10));
                }
                n(false, false);
            }
        }
    }
}
