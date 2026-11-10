package ai;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.a8;
import org.telegram.messenger.g5;
import org.telegram.messenger.ls;
import org.telegram.messenger.oj;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t3;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y0 implements ls {
    public static final LongSparseArray[] I = new LongSparseArray[4];
    public boolean D;
    public boolean E;
    public TLRPC.ShareTheme H;
    public final int f1689a;
    public final l1 f1690b;
    public final w0 f1691c;
    public boolean f1692e;
    public TLRPC.TL_exportedNoPaidMessagesToken f1693f;
    public long h;
    public int f1694n;
    public TLRPC.TL_exportedContactToken f1695r;
    public long f1696s;
    public TLRPC.ShareTheme f1697w;
    public int f1698x;
    public boolean f1699y;
    public int d = 0;
    public final t0 F = new Runnable(this) {
        public final y0 f1645b;

        {
            this.f1645b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f1645b.p();
                    return;
                default:
                    this.f1645b.o();
                    return;
            }
        }
    };
    public final t0 G = new Runnable(this) {
        public final y0 f1645b;

        {
            this.f1645b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f1645b.p();
                    return;
                default:
                    this.f1645b.o();
                    return;
            }
        }
    };

    public y0(int i7, l1 l1Var, w0 w0Var) {
        this.f1689a = i7;
        this.f1690b = l1Var;
        this.f1691c = w0Var;
    }

    public static LongSparseArray h(int i7) {
        LongSparseArray[] longSparseArrayArr = I;
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
        this.H = shareTheme;
        boolean z9 = shareTheme instanceof TLRPC.TL_shareThemeGift;
        boolean z10 = false;
        l1 l1Var = this.f1690b;
        if (z9) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList2 = l1Var.f1525v1;
                int i7 = 0;
                while (true) {
                    if (i7 < arrayList2.size()) {
                        if (((TL_stars.TL_starGiftUnique) arrayList2.get(i7)).f27189id == tL_starGiftUnique.f27189id) {
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
                i1 i1Var = l1Var.F;
                if (i1Var.f1274a == 2 && i1Var.f1288q == i7) {
                    return;
                }
                l1Var.f1362e2 = true;
                l1Var.I.clear();
                Runnable runnable = l1Var.d2;
                if (runnable != null) {
                    runnable.run();
                }
                l1Var.L7 = i7;
                if (l1Var.f1373f2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                l1Var.N7 = f10;
                l1Var.O7 = 1.0f;
                l1Var.I0(l1Var.getWidth() / 2.0f, (l1Var.l() / 2.0f) + l1Var.m(), i7);
                l1Var.f1362e2 = false;
                return;
            }
        }
        if (shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop) {
            TLRPC.TL_shareThemeEmojiBackdrop tL_shareThemeEmojiBackdrop = (TLRPC.TL_shareThemeEmojiBackdrop) shareTheme;
            int i10 = tL_shareThemeEmojiBackdrop.flags;
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            int i11 = tL_shareThemeEmojiBackdrop.backdrop_id;
            if ((i10 & 2) != 0) {
                arrayList = tL_shareThemeEmojiBackdrop.emojis;
            } else {
                arrayList = null;
            }
            l1Var.e(i11, arrayList, z10);
            return;
        }
        l1Var.d(l1.G9);
    }

    public final void b() {
        this.f1697w = null;
        org.telegram.messenger.g0.r(this.G);
        int i7 = this.f1689a;
        LongSparseArray h = h(i7);
        long j3 = this.f1691c.f1669f;
        x0 x0Var = (x0) h.get(j3);
        if (x0Var != null && x0Var.f1683b == 0) {
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
        w0 w0Var = this.f1691c;
        String str = w0Var.f1665a;
        if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) && str != null && !w0Var.d) {
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
        long j3 = this.f1691c.f1669f;
        if (i7 == qs.f25029k0) {
            r();
        } else if (i7 == qs.E0) {
            if (((Long) objArr[0]).longValue() == j3) {
                i(((TLRPC.UserFull) objArr[1]).share_theme);
            }
        } else if (i7 == qs.T && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (-chatFull.f26961id) == j3) {
            i(chatFull.share_theme);
        }
    }

    public final TLRPC.InputPeer e() {
        w0 w0Var = this.f1691c;
        if (w0Var.f1668e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer j12 = qp.s1(this.f1689a).j1(w0Var.f1669f);
        if (j12 instanceof TLRPC.TL_inputPeerEmpty) {
            return null;
        }
        return j12;
    }

    public final SharedPreferences f() {
        return qp.s1(this.f1689a).f24778e7;
    }

    public final void g() {
        int i7 = this.f1689a;
        qp s12 = qp.s1(i7);
        long j3 = this.f1691c.f1669f;
        if (j3 > 0) {
            TLRPC.User a22 = s12.a2(Long.valueOf(j3));
            if (a22 != null) {
                qs.f(i7).c(this, qs.E0);
                s12.g3(a22, true, 0);
                return;
            }
            return;
        }
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
        if (M0 == null) {
            return;
        }
        qs.f(i7).c(this, qs.T);
        yr.a0(i7).F0(M0.f26960id, t3.T(M0), null, true, false, 0);
    }

    public final void i(TLRPC.ShareTheme shareTheme) {
        long j3 = this.f1691c.f1669f;
        if (!this.E) {
            if (shareTheme == null) {
                shareTheme = new TLRPC.TL_shareThemeDefault();
            }
            int i7 = this.f1689a;
            x0 x0Var = (x0) h(i7).get(j3);
            if (x0Var != null) {
                TLRPC.ShareTheme shareTheme2 = x0Var.f1682a;
                byte[] q10 = q(shareTheme);
                byte[] q11 = q(shareTheme2);
                if (q10 != null && Arrays.equals(q10, q11)) {
                    h(i7).remove(j3);
                } else if (x0Var.f1683b != 0 && SystemClock.elapsedRealtime() - x0Var.f1683b >= 10000) {
                    h(i7).remove(j3);
                } else {
                    k(x0Var.f1682a);
                    return;
                }
            }
            if (!this.f1699y) {
                TLRPC.ShareTheme shareTheme3 = this.H;
                if (shareTheme3 == null) {
                    l1 l1Var = this.f1690b;
                    l1Var.setInstantTheme(true);
                    a(shareTheme);
                    l1Var.setInstantTheme(false);
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
        this.f1699y = true;
        boolean z9 = false;
        this.D = false;
        w0 w0Var = this.f1691c;
        if (!w0Var.f1670g) {
            return;
        }
        l1 l1Var = this.f1690b;
        TL_stars.TL_starGiftUnique themeGift = l1Var.getThemeGift();
        ArrayList<TLRPC.Reaction> pickedEmoji = l1Var.getPickedEmoji();
        TLRPC.TL_shareThemeGift tL_shareThemeGift2 = null;
        r6 = null;
        r6 = null;
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = null;
        tL_shareThemeGift2 = null;
        if (themeGift != null) {
            if (w0Var.f1668e) {
                if (!TextUtils.isEmpty(themeGift.slug)) {
                    ?? tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = themeGift.slug;
                    tL_inputSavedStarGiftChat = tL_inputSavedStarGiftSlug;
                }
            } else {
                long themeGiftSavedId = l1Var.getThemeGiftSavedId();
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
            int themeBackdropIndex = l1Var.getThemeBackdropIndex();
            if (themeBackdropIndex >= 0 && themeBackdropIndex != l1.G9) {
                z9 = true;
            }
            if (z9 && a.h == null) {
                b();
                this.D = true;
                return;
            } else if (!z9 && pickedEmoji.isEmpty()) {
                tL_shareThemeGift = new TLRPC.TL_shareThemeDefault();
            } else {
                ?? tL_shareThemeEmojiBackdrop = new TLRPC.TL_shareThemeEmojiBackdrop();
                if (z9) {
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
        obj.f1682a = tL_shareThemeGift2;
        h(this.f1689a).put(w0Var.f1669f, obj);
        k(this.H);
        this.f1697w = tL_shareThemeGift;
        t0 t0Var = this.G;
        org.telegram.messenger.g0.r(t0Var);
        org.telegram.messenger.g0.i3(t0Var, 700L);
    }

    public final void k(TLRPC.ShareTheme shareTheme) {
        int i7 = this.f1689a;
        qp s12 = qp.s1(i7);
        long j3 = this.f1691c.f1669f;
        if (j3 > 0) {
            TLRPC.UserFull b22 = s12.b2(j3);
            if (b22 != null) {
                b22.share_theme = shareTheme;
                yr.a0(i7).j2(b22, false);
                return;
            }
            return;
        }
        TLRPC.ChatFull N0 = s12.N0(-j3);
        if (N0 != null) {
            N0.share_theme = shareTheme;
            yr.a0(i7).N1(N0, false);
        }
    }

    public final void l() {
        this.E = true;
        int i7 = this.f1689a;
        qs.f(i7).n(this, qs.f25029k0);
        qs.f(i7).n(this, qs.E0);
        qs.f(i7).n(this, qs.T);
        org.telegram.messenger.g0.r(this.F);
        org.telegram.messenger.g0.r(this.G);
        o();
        if (this.f1694n != 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(this.f1694n, true);
            this.f1694n = 0;
        }
    }

    public final void m() {
        this.f1696s = SystemClock.elapsedRealtime();
        qp s12 = qp.s1(this.f1689a);
        i iVar = new i(this, 2);
        if (s12.W7) {
            return;
        }
        TLRPC.TL_exportedContactToken tL_exportedContactToken = s12.X7;
        if (tL_exportedContactToken != null && tL_exportedContactToken.expires > System.currentTimeMillis() / 1000) {
            iVar.a(s12.X7);
            return;
        }
        s12.W7 = true;
        s12.getConnectionsManager().sendRequest(new TLRPC.TL_contacts_exportContactToken(), new oj(s12, iVar, System.currentTimeMillis(), 7));
    }

    public final void n(boolean z9, boolean z10) {
        int i7 = this.f1694n;
        int i10 = this.f1689a;
        if (i7 != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f1694n, true);
        }
        TLRPC.TL_contacts_exportNoPaidMessagesToken tL_contacts_exportNoPaidMessagesToken = new TLRPC.TL_contacts_exportNoPaidMessagesToken();
        tL_contacts_exportNoPaidMessagesToken.revoke = z9;
        tL_contacts_exportNoPaidMessagesToken.temporary = z10;
        int sendRequestTyped = ConnectionsManager.getInstance(i10).sendRequestTyped(tL_contacts_exportNoPaidMessagesToken, new d3.b(1), new u0(this, r6, z10, 0));
        this.f1694n = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void o() {
        if (this.f1697w != null) {
            TLRPC.TL_messages_setShareTheme tL_messages_setShareTheme = new TLRPC.TL_messages_setShareTheme();
            TLRPC.InputPeer e10 = e();
            tL_messages_setShareTheme.peer = e10;
            tL_messages_setShareTheme.theme = this.f1697w;
            this.f1697w = null;
            if (e10 == null) {
                return;
            }
            int i7 = this.f1698x;
            int i10 = this.f1689a;
            if (i7 != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f1698x, true);
            }
            LongSparseArray h = h(i10);
            w0 w0Var = this.f1691c;
            x0 x0Var = (x0) h.get(w0Var.f1669f);
            long j3 = w0Var.f1669f;
            int i11 = this.f1689a;
            int sendRequestTyped = ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_setShareTheme, new d3.b(1), new v0(this, r7, x0Var, i11, j3));
            this.f1698x = sendRequestTyped;
            int[] iArr = {sendRequestTyped};
        }
    }

    public final void p() {
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken;
        t0 t0Var = this.F;
        org.telegram.messenger.g0.r(t0Var);
        if (this.E) {
            return;
        }
        if (this.d == 1 && this.f1694n == 0 && (this.f1693f == null || SystemClock.elapsedRealtime() - this.h >= 30000 || ((tL_exportedNoPaidMessagesToken = this.f1693f) != null && tL_exportedNoPaidMessagesToken.expires != 0 && ConnectionsManager.getInstance(this.f1689a).getCurrentTime() >= this.f1693f.expires - 5))) {
            n(false, true);
        }
        if (this.f1691c.d && ((this.f1695r == null || System.currentTimeMillis() / 1000 >= this.f1695r.expires) && SystemClock.elapsedRealtime() - this.f1696s >= 5000)) {
            m();
        }
        org.telegram.messenger.g0.i3(t0Var, 1000L);
    }

    public final void r() {
        long j3;
        int i7 = this.f1689a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = g5.r(i7).X;
        if (globalPrivacySettings == null) {
            g5.r(i7).B();
            j3 = 0;
        } else {
            j3 = globalPrivacySettings.noncontact_peers_paid_stars;
        }
        l1 l1Var = this.f1690b;
        l1Var.setFeeStars(j3);
        if (j3 > 0 && !this.f1692e) {
            this.f1692e = true;
            if (!this.f1691c.d && this.d == 0 && f().getBoolean("qrNoPaidPermanent", false)) {
                this.d = 2;
                l1Var.f1524v0 = true;
                l1Var.f1535w0 = false;
                l1Var.B0 = 1.0f;
                l1Var.D0 = 1.0f;
                l1Var.C0 = 1.0f;
                l1Var.F0 = true;
                l1Var.G0 = 1.0f;
                l1Var.f1569z2 = null;
                l1Var.A2 = -1;
                l1Var.u1(false);
                l1Var.invalidate();
                TLRPC.TL_exportedNoPaidMessagesToken c10 = c();
                this.f1693f = c10;
                if (c10 != null) {
                    l1Var.setFreeLink(d(c10));
                }
                n(false, false);
            }
        }
    }
}
