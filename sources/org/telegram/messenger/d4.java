package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class d4 extends c1 {
    public static volatile p5 f21947s = new p5("chatThemeQueue");
    public static final d4[] f21948w = new d4[4];
    public final HashMap f21949a;
    public ArrayList f21950b;
    public volatile long f21951c;
    public volatile long d;
    public final HashMap f21952e;
    public final l2.u1 f21953f;
    public final LongSparseArray h;
    public final HashMap f21954n;
    public final HashMap f21955r;

    public d4(int i7) {
        super(i7);
        this.f21949a = new HashMap();
        this.f21952e = new HashMap();
        this.f21953f = new Object();
        this.h = new LongSparseArray();
        this.f21954n = new HashMap();
        this.f21955r = new HashMap();
        k();
    }

    public static d4 f(int i7) {
        d4 d4Var;
        d4[] d4VarArr = f21948w;
        d4 d4Var2 = d4VarArr[i7];
        if (d4Var2 == null) {
            synchronized (d4.class) {
                try {
                    d4Var = d4VarArr[i7];
                    if (d4Var == null) {
                        d4Var = new d4(i7);
                        d4VarArr[i7] = d4Var;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return d4Var;
        }
        return d4Var2;
    }

    public static String j(TLRPC.WallPaper wallPaper) {
        if (wallPaper != null) {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings != null && !TextUtils.isEmpty(wallPaperSettings.emoticon)) {
                return wallPaper.settings.emoticon;
            }
            return "";
        }
        return null;
    }

    public static void n(String str) {
        new ImageReceiver(null).q0(hc.b(ui.b0(p10.f24459s0).T(str)), "50_50", null, null, null, 0);
        i6.k(str);
    }

    public static boolean v(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        if (wallPaper == null && wallPaper2 == null) {
            return true;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaper) && (wallPaper2 instanceof TLRPC.TL_wallPaper)) {
            if (wallPaper.f27106id == wallPaper2.f27106id) {
                return true;
            }
            return false;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile)) {
            if (wallPaper.settings != null && wallPaper2.settings != null) {
                return TextUtils.equals(j(wallPaper), j(wallPaper2));
            }
            if (wallPaper.f27106id == wallPaper2.f27106id) {
                return true;
            }
        }
        return false;
    }

    public final void a(long j3, boolean z9, boolean z10) {
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        if (j3 >= 0) {
            tL_messages_setChatWallPaper.peer = qp.n1(qp.s1(this.currentAccount).a2(Long.valueOf(j3)));
            tL_messages_setChatWallPaper.revert = z10;
            if (!z10) {
                TLRPC.UserFull b22 = getMessagesController().b2(j3);
                if (b22 != null) {
                    b22.wallpaper = null;
                    b22.flags &= -16777217;
                    getMessagesStorage().j2(b22, false);
                }
                r(j3, null);
                if (z9) {
                    qs.f(this.currentAccount).k(qs.E0, Long.valueOf(j3), b22);
                }
            }
        } else {
            long j10 = -j3;
            tL_messages_setChatWallPaper.peer = qp.l1(qp.s1(this.currentAccount).M0(Long.valueOf(j10)));
            TLRPC.ChatFull N0 = getMessagesController().N0(j10);
            if (N0 != null) {
                N0.wallpaper = null;
                N0.flags2 &= -129;
                getMessagesStorage().N1(N0, false);
            }
            r(j3, null);
            if (z9) {
                qs f10 = qs.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f10.k(qs.T, N0, 0, bool, bool);
            }
        }
        getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new di.u5(8));
    }

    public final ArrayList b() {
        SharedPreferences h = h();
        int i7 = h.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i7);
        for (int i10 = 0; i10 < i7; i10++) {
            SerializedData serializedData = new SerializedData(Utilities.v(h.getString("theme_" + i10, "")));
            try {
                TLRPC.TL_theme TLdeserialize = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null) {
                    arrayList.add(new org.telegram.ui.ActionBar.r3(this.currentAccount, TLdeserialize));
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return arrayList;
    }

    public final org.telegram.ui.ActionBar.r3 c(long j3) {
        ig.b bVar;
        LongSparseArray longSparseArray = this.h;
        ig.b bVar2 = (ig.b) longSparseArray.get(j3);
        if (bVar2 == null) {
            String string = t0.f25555b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatTheme_" + this.currentAccount + "_" + j3, null);
            if (string != null) {
                if (string.startsWith("gift_")) {
                    bVar = new ig.b(null, string.substring(5));
                } else if (string.startsWith("emoticon_")) {
                    bVar = new ig.b(string.substring(9), null);
                } else if (!TextUtils.isEmpty(string)) {
                    bVar = new ig.b(string, null);
                }
                bVar2 = bVar;
                longSparseArray.put(j3, bVar2);
            }
            bVar2 = null;
            longSparseArray.put(j3, bVar2);
        }
        return i(bVar2);
    }

    public final TLRPC.WallPaper d(long j3) {
        if (j3 >= 0) {
            TLRPC.UserFull b22 = getMessagesController().b2(j3);
            if (b22 != null) {
                return b22.wallpaper;
            }
        } else {
            TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
            if (N0 != null) {
                return N0.wallpaper;
            }
        }
        SharedPreferences sharedPreferences = t0.f25555b.getSharedPreferences("chatthemeconfig_emoji", 0);
        String string = sharedPreferences.getString("chatWallpaper_" + this.currentAccount + "_" + j3, null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                return TLRPC.WallPaper.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return null;
    }

    public final ArrayList e(int i7) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean hasFlag = TLObject.hasFlag(i7, 1);
        boolean hasFlag2 = TLObject.hasFlag(i7, 2);
        boolean hasFlag3 = TLObject.hasFlag(i7, 4);
        ArrayList arrayList3 = new ArrayList();
        if (hasFlag3 && (arrayList2 = (ArrayList) this.f21953f.d) != null) {
            arrayList3.addAll(arrayList2);
        }
        if (hasFlag2 && (arrayList = this.f21950b) != null) {
            arrayList3.addAll(arrayList);
        }
        int i10 = 0;
        if (hasFlag && (arrayList3.isEmpty() || !((org.telegram.ui.ActionBar.r3) arrayList3.get(0)).f28455a)) {
            org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3(this.currentAccount);
            r3Var.f28458e = "❌";
            r3Var.f28457c = ig.b.d("❌");
            r3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
            r3Var.f28455a = true;
            org.telegram.ui.ActionBar.q3 q3Var = new org.telegram.ui.ActionBar.q3();
            q3Var.f28399a = org.telegram.ui.ActionBar.r3.d(true);
            r3Var.f28459f.add(q3Var);
            org.telegram.ui.ActionBar.q3 q3Var2 = new org.telegram.ui.ActionBar.q3();
            q3Var2.f28399a = org.telegram.ui.ActionBar.r3.d(false);
            r3Var.f28459f.add(q3Var2);
            arrayList3.add(0, r3Var);
        }
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.r3) obj).k();
        }
        return arrayList3;
    }

    public final File g(long j3) {
        File h = t0.h();
        Locale locale = Locale.US;
        long j10 = this.f21951c;
        return new File(h, j3 + "_" + j10 + ".jpg");
    }

    public final SharedPreferences h() {
        Context context = t0.f25555b;
        return context.getSharedPreferences("chatthemeconfig_" + this.currentAccount, 0);
    }

    public final org.telegram.ui.ActionBar.r3 i(ig.b bVar) {
        if (bVar != null) {
            String str = bVar.f15474b;
            if (!TextUtils.isEmpty(str)) {
                return (org.telegram.ui.ActionBar.r3) this.f21952e.get(str);
            }
            ArrayList arrayList = this.f21950b;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
                if (bVar.equals(r3Var.f28457c)) {
                    return r3Var;
                }
            }
            return null;
        }
        return null;
    }

    public final void k() {
        SharedPreferences h = h();
        this.f21951c = 0L;
        this.d = 0L;
        try {
            this.f21951c = h.getLong("hash", 0L);
            this.d = h.getLong("lastReload", 0L);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        this.f21950b = b();
        yr messagesStorage = getMessagesStorage();
        u3 u3Var = new u3(this, 0);
        messagesStorage.getClass();
        messagesStorage.I(new yq(4, messagesStorage, u3Var));
        n("❌");
        if (!this.f21950b.isEmpty()) {
            ArrayList arrayList = this.f21950b;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                n(((org.telegram.ui.ActionBar.r3) obj).f28458e);
            }
        }
    }

    public final void l(boolean z9) {
        ArrayList arrayList = this.f21950b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
            long h = r3Var.h(z9 ? 1 : 0);
            if (h != 0 && !g(h).exists()) {
                r3Var.n(z9 ? 1 : 0, null);
            }
        }
    }

    public final void m(boolean z9) {
        ArrayList arrayList = this.f21950b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
            long h = r3Var.h(z9 ? 1 : 0);
            if (h != 0 && !this.f21949a.containsKey(Long.valueOf(h))) {
                r3Var.p(z9 ? 1 : 0, new p1(this, 1));
            }
        }
    }

    public final void o(TL_update.TL_updatePeerWallpaper tL_updatePeerWallpaper) {
        if (tL_updatePeerWallpaper.peer instanceof TLRPC.TL_peerUser) {
            TLRPC.UserFull b22 = getMessagesController().b2(tL_updatePeerWallpaper.peer.user_id);
            if (b22 != null && !v(b22.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
                long j3 = b22.f27102id;
                if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                    b22.wallpaper_overridden = tL_updatePeerWallpaper.wallpaper_overridden;
                    b22.wallpaper = tL_updatePeerWallpaper.wallpaper;
                    b22.flags |= 16777216;
                } else {
                    b22.wallpaper_overridden = false;
                    b22.wallpaper = null;
                    b22.flags &= -16777217;
                }
                getMessagesStorage().j2(b22, false);
                r(j3, b22.wallpaper);
                g0.h3(new a4(this, j3, b22, 0));
                return;
            }
            return;
        }
        TLRPC.ChatFull N0 = getMessagesController().N0(-m5.o(tL_updatePeerWallpaper.peer));
        if (N0 != null && !v(N0.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
            long j10 = -N0.f26953id;
            if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                N0.wallpaper = tL_updatePeerWallpaper.wallpaper;
                N0.flags2 |= 128;
            } else {
                N0.wallpaper = null;
                N0.flags2 &= -129;
            }
            getMessagesStorage().N1(N0, false);
            r(j10, N0.wallpaper);
            g0.h3(new b4(0, this, N0));
        }
    }

    public final void p(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
            String str = tL_chatThemeUniqueGift.gift.slug;
            HashMap hashMap = this.f21952e;
            if (!hashMap.containsKey(str)) {
                org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3(this.currentAccount, tL_chatThemeUniqueGift);
                r3Var.k();
                hashMap.put(tL_chatThemeUniqueGift.gift.slug, r3Var);
                yr messagesStorage = getMessagesStorage();
                messagesStorage.getClass();
                messagesStorage.I(new yq(3, messagesStorage, Collections.singletonList(chatTheme)));
            }
        }
    }

    public final void q(final ResultCallback resultCallback, final boolean z9) {
        boolean z10;
        if (this.f21951c == 0 || this.d == 0) {
            k();
        }
        if (System.currentTimeMillis() - this.d > 7200000) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = this.f21950b;
        if (arrayList == null || arrayList.isEmpty() || z10) {
            TL_account.getChatThemes getchatthemes = new TL_account.getChatThemes();
            getchatthemes.hash = this.f21951c;
            ConnectionsManager connectionsManager = getConnectionsManager();
            p5 p5Var = f21947s;
            Objects.requireNonNull(p5Var);
            connectionsManager.sendRequestTyped(getchatthemes, new v3(p5Var), new v10() {
                @Override
                public final void a(java.lang.Object r13, java.lang.Object r14) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w3.a(java.lang.Object, java.lang.Object):void");
                }
            });
        }
        ArrayList arrayList2 = this.f21950b;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            resultCallback.onComplete(e((z9 ? 1 : 0) | 2));
        }
    }

    public final void r(long j3, TLRPC.WallPaper wallPaper) {
        if (wallPaper != null) {
            if (wallPaper.document == null) {
                return;
            }
            SerializedData serializedData = new SerializedData(wallPaper.getObjectSize());
            wallPaper.serializeToStream(serializedData);
            String f10 = Utilities.f(serializedData.toByteArray());
            SharedPreferences.Editor edit = t0.f25555b.getSharedPreferences("chatthemeconfig_emoji", 0).edit();
            edit.putString("chatWallpaper_" + this.currentAccount + "_" + j3, f10).apply();
            return;
        }
        SharedPreferences.Editor edit2 = t0.f25555b.getSharedPreferences("chatthemeconfig_emoji", 0).edit();
        edit2.remove("chatWallpaper_" + this.currentAccount + "_" + j3).apply();
    }

    public final void s(long r6, ig.b r8, org.telegram.tgnet.TLRPC.ChatTheme r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d4.s(long, ig.b, org.telegram.tgnet.TLRPC$ChatTheme, boolean):void");
    }

    public final void t(long j3, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.f21955r;
        HashMap hashMap2 = this.f21954n;
        if (isEmpty) {
            String str2 = (String) hashMap2.remove(Long.valueOf(j3));
            if (str2 != null) {
                hashMap.remove(str2);
            }
        } else if (j3 == 0) {
            Long l10 = (Long) hashMap.remove(str);
            if (l10 != null) {
                hashMap2.remove(l10);
            }
        } else {
            String str3 = (String) hashMap2.put(Long.valueOf(j3), str);
            Long l11 = (Long) hashMap.put(str, Long.valueOf(j3));
            if (str3 != null && !TextUtils.equals(str, str3)) {
                hashMap.remove(str3);
            }
            if (l11 != null && l11.longValue() != j3) {
                hashMap2.remove(l11);
            }
        }
    }

    public final int u(long j3, String str, org.telegram.ui.ActionBar.c6 c6Var, ij ijVar, ai.m0 m0Var) {
        boolean z9;
        TLRPC.ChatFull N0;
        TLRPC.UserFull userFull;
        TLRPC.WallPaper wallPaper;
        String str2;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 >= 0) {
            tL_messages_setChatWallPaper.peer = qp.n1(qp.s1(this.currentAccount).a2(Long.valueOf(j3)));
        } else {
            tL_messages_setChatWallPaper.peer = qp.l1(qp.s1(this.currentAccount).M0(Long.valueOf(-j3)));
        }
        tL_messages_setChatWallPaper.for_both = c6Var.f27410o;
        if (ijVar != null && (ijVar.f23237k.action instanceof TLRPC.TL_messageActionSetChatWallPaper)) {
            tL_messages_setChatWallPaper.flags |= 2;
            tL_messages_setChatWallPaper.f27071id = ijVar.f1();
            if (i7 >= 0) {
                userFull = qp.s1(this.currentAccount).b2(j3);
                N0 = null;
            } else {
                N0 = qp.s1(this.currentAccount).N0(-j3);
                userFull = null;
            }
            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) ijVar.f23237k.action;
            TLRPC.TL_wallPaper tL_wallPaper = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper.f27106id = wallPaper2.f27106id;
            tL_wallPaper.document = wallPaper2.document;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            tL_wallPaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.intensity = (int) (c6Var.f27406k * 100.0f);
            tL_wallPaperSettings.motion = c6Var.f27405j;
            tL_wallPaperSettings.blur = c6Var.f27404i;
            tL_wallPaperSettings.background_color = c6Var.d;
            tL_wallPaperSettings.second_background_color = c6Var.f27401e;
            tL_wallPaperSettings.third_background_color = c6Var.f27402f;
            tL_wallPaperSettings.fourth_background_color = c6Var.f27403g;
            tL_wallPaperSettings.rotation = c6Var.h;
            tL_wallPaper.uploadingImage = str;
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            } else if (N0 != null) {
                wallPaper = N0.wallpaper;
            } else {
                wallPaper = null;
            }
            if (wallPaper != null && (str2 = wallPaper.uploadingImage) != null && str2.equals(str)) {
                tL_wallPaper.stripedThumb = wallPaper.stripedThumb;
            }
            tL_wallPaper.settings.flags |= 121;
            TLRPC.TL_wallPaper tL_wallPaper2 = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper2.pattern = wallPaper3.pattern;
            TLRPC.ChatFull chatFull = N0;
            tL_wallPaper2.f27106id = wallPaper3.f27106id;
            tL_wallPaper2.document = wallPaper3.document;
            int i10 = wallPaper3.flags;
            tL_wallPaper2.creator = wallPaper3.creator;
            tL_wallPaper2.dark = wallPaper3.dark;
            tL_wallPaper2.isDefault = wallPaper3.isDefault;
            tL_wallPaper2.slug = wallPaper3.slug;
            tL_wallPaper2.access_hash = wallPaper3.access_hash;
            tL_wallPaper2.stripedThumb = wallPaper3.stripedThumb;
            tL_wallPaper2.settings = tL_wallPaper.settings;
            tL_wallPaper2.flags = i10 | 4;
            z9 = false;
            if (userFull != null) {
                userFull.wallpaper = tL_wallPaper2;
                userFull.flags |= 16777216;
                getMessagesStorage().j2(userFull, false);
                qs.f(this.currentAccount).k(qs.E0, Long.valueOf(j3), userFull);
            } else if (chatFull != null) {
                chatFull.wallpaper = tL_wallPaper2;
                chatFull.flags2 |= 128;
                getMessagesStorage().N1(chatFull, false);
                qs f10 = qs.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f10.k(qs.T, chatFull, 0, bool, bool);
            }
        } else {
            tL_messages_setChatWallPaper.flags |= 1;
            tL_messages_setChatWallPaper.wallpaper = qp.r1(c6Var);
            z9 = true;
        }
        tL_messages_setChatWallPaper.flags |= 4;
        tL_messages_setChatWallPaper.settings = qp.g2(c6Var);
        return ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setChatWallPaper, new y3(this, j3, z9, str, m0Var));
    }
}
