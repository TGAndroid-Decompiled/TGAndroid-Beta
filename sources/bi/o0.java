package bi;

import ai.v2;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.a8;
import org.telegram.messenger.cs;
import org.telegram.messenger.fj;
import org.telegram.messenger.g5;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class o0 implements cs {
    public static final LongSparseArray[] J = new LongSparseArray[4];
    public boolean E;
    public boolean F;
    public TLRPC.ShareTheme I;
    public final int f3806a;
    public final a1 f3807b;
    public final m0 f3808c;
    public boolean f3809e;
    public TLRPC.TL_exportedNoPaidMessagesToken f3810f;
    public long h;
    public int f3811n;
    public TLRPC.TL_exportedContactToken f3812r;
    public long f3813s;
    public TLRPC.ShareTheme f3814w;
    public int f3815x;
    public boolean f3816y;
    public int d = 0;
    public final k0 G = new Runnable(this) {
        public final o0 f3779b;

        {
            this.f3779b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f3779b.p();
                    return;
                default:
                    this.f3779b.o();
                    return;
            }
        }
    };
    public final k0 H = new Runnable(this) {
        public final o0 f3779b;

        {
            this.f3779b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f3779b.p();
                    return;
                default:
                    this.f3779b.o();
                    return;
            }
        }
    };

    public o0(int i3, a1 a1Var, m0 m0Var) {
        this.f3806a = i3;
        this.f3807b = a1Var;
        this.f3808c = m0Var;
    }

    public static LongSparseArray h(int i3) {
        LongSparseArray[] longSparseArrayArr = J;
        if (longSparseArrayArr[i3] == null) {
            longSparseArrayArr[i3] = new LongSparseArray();
        }
        return longSparseArrayArr[i3];
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
        a1 a1Var = this.f3807b;
        if (z10) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList2 = a1Var.f3612w1;
                int i3 = 0;
                while (true) {
                    if (i3 < arrayList2.size()) {
                        if (((TL_stars.TL_starGiftUnique) arrayList2.get(i3)).f27230id == tL_starGiftUnique.f27230id) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (i3 < 0) {
                    arrayList2.add(0, tL_starGiftUnique);
                    i3 = 0;
                }
                x0 x0Var = a1Var.G;
                if (x0Var.f3892a == 2 && x0Var.f3906q == i3) {
                    return;
                }
                a1Var.f3449f2 = true;
                a1Var.J.clear();
                Runnable runnable = a1Var.f3438e2;
                if (runnable != null) {
                    runnable.run();
                }
                a1Var.M7 = i3;
                if (a1Var.f3459g2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                a1Var.O7 = f10;
                a1Var.P7 = 1.0f;
                a1Var.I0(a1Var.getWidth() / 2.0f, (a1Var.l() / 2.0f) + a1Var.m(), i3);
                a1Var.f3449f2 = false;
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
            a1Var.e(i11, arrayList, z11);
            return;
        }
        a1Var.d(a1.H9);
    }

    public final void b() {
        this.f3814w = null;
        org.telegram.messenger.g0.r(this.H);
        int i3 = this.f3806a;
        LongSparseArray h = h(i3);
        long j10 = this.f3808c.f3796f;
        n0 n0Var = (n0) h.get(j10);
        if (n0Var != null && n0Var.f3802b == 0) {
            h(i3).remove(j10);
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
        m0 m0Var = this.f3808c;
        String str = m0Var.f3792a;
        if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) && str != null && !m0Var.d) {
            return str + "?free=" + tL_exportedNoPaidMessagesToken.token;
        } else if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url)) {
            return null;
        } else {
            return tL_exportedNoPaidMessagesToken.url;
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        long j10 = this.f3808c.f3796f;
        if (i3 == hs.f23254k0) {
            r();
        } else if (i3 == hs.E0) {
            if (((Long) objArr[0]).longValue() == j10) {
                i(((TLRPC.UserFull) objArr[1]).share_theme);
            }
        } else if (i3 == hs.T && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (-chatFull.f27002id) == j10) {
            i(chatFull.share_theme);
        }
    }

    public final TLRPC.InputPeer e() {
        m0 m0Var = this.f3808c;
        if (m0Var.f3795e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer j12 = hp.s1(this.f3806a).j1(m0Var.f3796f);
        if (j12 instanceof TLRPC.TL_inputPeerEmpty) {
            return null;
        }
        return j12;
    }

    public final SharedPreferences f() {
        return hp.s1(this.f3806a).f22999e7;
    }

    public final void g() {
        int i3 = this.f3806a;
        hp s12 = hp.s1(i3);
        long j10 = this.f3808c.f3796f;
        if (j10 > 0) {
            TLRPC.User a22 = s12.a2(Long.valueOf(j10));
            if (a22 != null) {
                hs.f(i3).c(this, hs.E0);
                s12.g3(a22, true, 0);
                return;
            }
            return;
        }
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j10));
        if (M0 == null) {
            return;
        }
        hs.f(i3).c(this, hs.T);
        qr.a0(i3).F0(M0.f27001id, t3.T(M0), null, true, false, 0);
    }

    public final void i(TLRPC.ShareTheme shareTheme) {
        long j10 = this.f3808c.f3796f;
        if (!this.F) {
            if (shareTheme == null) {
                shareTheme = new TLRPC.TL_shareThemeDefault();
            }
            int i3 = this.f3806a;
            n0 n0Var = (n0) h(i3).get(j10);
            if (n0Var != null) {
                TLRPC.ShareTheme shareTheme2 = n0Var.f3801a;
                byte[] q10 = q(shareTheme);
                byte[] q11 = q(shareTheme2);
                if (q10 != null && Arrays.equals(q10, q11)) {
                    h(i3).remove(j10);
                } else if (n0Var.f3802b != 0 && SystemClock.elapsedRealtime() - n0Var.f3802b >= 10000) {
                    h(i3).remove(j10);
                } else {
                    k(n0Var.f3801a);
                    return;
                }
            }
            if (!this.f3816y) {
                TLRPC.ShareTheme shareTheme3 = this.I;
                if (shareTheme3 == null) {
                    a1 a1Var = this.f3807b;
                    a1Var.setInstantTheme(true);
                    a(shareTheme);
                    a1Var.setInstantTheme(false);
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
        this.f3816y = true;
        boolean z10 = false;
        this.E = false;
        m0 m0Var = this.f3808c;
        if (!m0Var.f3797g) {
            return;
        }
        a1 a1Var = this.f3807b;
        TL_stars.TL_starGiftUnique themeGift = a1Var.getThemeGift();
        ArrayList<TLRPC.Reaction> pickedEmoji = a1Var.getPickedEmoji();
        TLRPC.TL_shareThemeGift tL_shareThemeGift2 = null;
        r6 = null;
        r6 = null;
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = null;
        tL_shareThemeGift2 = null;
        if (themeGift != null) {
            if (m0Var.f3795e) {
                if (!TextUtils.isEmpty(themeGift.slug)) {
                    ?? tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = themeGift.slug;
                    tL_inputSavedStarGiftChat = tL_inputSavedStarGiftSlug;
                }
            } else {
                long themeGiftSavedId = a1Var.getThemeGiftSavedId();
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
            int themeBackdropIndex = a1Var.getThemeBackdropIndex();
            if (themeBackdropIndex >= 0 && themeBackdropIndex != a1.H9) {
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
        obj.f3801a = tL_shareThemeGift2;
        h(this.f3806a).put(m0Var.f3796f, obj);
        k(this.I);
        this.f3814w = tL_shareThemeGift;
        k0 k0Var = this.H;
        org.telegram.messenger.g0.r(k0Var);
        org.telegram.messenger.g0.i3(k0Var, 700L);
    }

    public final void k(TLRPC.ShareTheme shareTheme) {
        int i3 = this.f3806a;
        hp s12 = hp.s1(i3);
        long j10 = this.f3808c.f3796f;
        if (j10 > 0) {
            TLRPC.UserFull b22 = s12.b2(j10);
            if (b22 != null) {
                b22.share_theme = shareTheme;
                qr.a0(i3).j2(b22, false);
                return;
            }
            return;
        }
        TLRPC.ChatFull N0 = s12.N0(-j10);
        if (N0 != null) {
            N0.share_theme = shareTheme;
            qr.a0(i3).N1(N0, false);
        }
    }

    public final void l() {
        this.F = true;
        int i3 = this.f3806a;
        hs.f(i3).n(this, hs.f23254k0);
        hs.f(i3).n(this, hs.E0);
        hs.f(i3).n(this, hs.T);
        org.telegram.messenger.g0.r(this.G);
        org.telegram.messenger.g0.r(this.H);
        o();
        if (this.f3811n != 0) {
            ConnectionsManager.getInstance(i3).cancelRequest(this.f3811n, true);
            this.f3811n = 0;
        }
    }

    public final void m() {
        this.f3813s = SystemClock.elapsedRealtime();
        hp s12 = hp.s1(this.f3806a);
        v2 v2Var = new v2(this, 6);
        if (s12.W7) {
            return;
        }
        TLRPC.TL_exportedContactToken tL_exportedContactToken = s12.X7;
        if (tL_exportedContactToken != null && tL_exportedContactToken.expires > System.currentTimeMillis() / 1000) {
            v2Var.a(s12.X7);
            return;
        }
        s12.W7 = true;
        s12.getConnectionsManager().sendRequest(new TLRPC.TL_contacts_exportContactToken(), new fj(s12, v2Var, System.currentTimeMillis(), 7));
    }

    public final void n(boolean z10, boolean z11) {
        int i3 = this.f3811n;
        int i10 = this.f3806a;
        if (i3 != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f3811n, true);
        }
        TLRPC.TL_contacts_exportNoPaidMessagesToken tL_contacts_exportNoPaidMessagesToken = new TLRPC.TL_contacts_exportNoPaidMessagesToken();
        tL_contacts_exportNoPaidMessagesToken.revoke = z10;
        tL_contacts_exportNoPaidMessagesToken.temporary = z11;
        int sendRequestTyped = ConnectionsManager.getInstance(i10).sendRequestTyped(tL_contacts_exportNoPaidMessagesToken, new c3.b(1), new l0(this, r6, z11, 0));
        this.f3811n = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void o() {
        if (this.f3814w != null) {
            TLRPC.TL_messages_setShareTheme tL_messages_setShareTheme = new TLRPC.TL_messages_setShareTheme();
            TLRPC.InputPeer e10 = e();
            tL_messages_setShareTheme.peer = e10;
            tL_messages_setShareTheme.theme = this.f3814w;
            this.f3814w = null;
            if (e10 == null) {
                return;
            }
            int i3 = this.f3815x;
            int i10 = this.f3806a;
            if (i3 != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f3815x, true);
            }
            LongSparseArray h = h(i10);
            m0 m0Var = this.f3808c;
            n0 n0Var = (n0) h.get(m0Var.f3796f);
            long j10 = m0Var.f3796f;
            int i11 = this.f3806a;
            int sendRequestTyped = ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_setShareTheme, new c3.b(1), new ai.f0(this, r7, n0Var, i11, j10));
            this.f3815x = sendRequestTyped;
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
        if (this.d == 1 && this.f3811n == 0 && (this.f3810f == null || SystemClock.elapsedRealtime() - this.h >= 30000 || ((tL_exportedNoPaidMessagesToken = this.f3810f) != null && tL_exportedNoPaidMessagesToken.expires != 0 && ConnectionsManager.getInstance(this.f3806a).getCurrentTime() >= this.f3810f.expires - 5))) {
            n(false, true);
        }
        if (this.f3808c.d && ((this.f3812r == null || System.currentTimeMillis() / 1000 >= this.f3812r.expires) && SystemClock.elapsedRealtime() - this.f3813s >= 5000)) {
            m();
        }
        org.telegram.messenger.g0.i3(k0Var, 1000L);
    }

    public final void r() {
        long j10;
        int i3 = this.f3806a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = g5.r(i3).Y;
        if (globalPrivacySettings == null) {
            g5.r(i3).B();
            j10 = 0;
        } else {
            j10 = globalPrivacySettings.noncontact_peers_paid_stars;
        }
        a1 a1Var = this.f3807b;
        a1Var.setFeeStars(j10);
        if (j10 > 0 && !this.f3809e) {
            this.f3809e = true;
            if (!this.f3808c.d && this.d == 0 && f().getBoolean("qrNoPaidPermanent", false)) {
                this.d = 2;
                a1Var.f3611w0 = true;
                a1Var.f3622x0 = false;
                a1Var.C0 = 1.0f;
                a1Var.E0 = 1.0f;
                a1Var.D0 = 1.0f;
                a1Var.G0 = true;
                a1Var.H0 = 1.0f;
                a1Var.A2 = null;
                a1Var.B2 = -1;
                a1Var.u1(false);
                a1Var.invalidate();
                TLRPC.TL_exportedNoPaidMessagesToken c2 = c();
                this.f3810f = c2;
                if (c2 != null) {
                    a1Var.setFreeLink(d(c2));
                }
                n(false, false);
            }
        }
    }
}
