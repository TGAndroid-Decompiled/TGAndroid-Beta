package org.telegram.messenger;

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
public final class f4 extends c1 {
    public static volatile q5 f23939s = new q5("chatThemeQueue");
    public static final f4[] f23940w = new f4[4];
    public final HashMap f23941a;
    public ArrayList f23942b;
    public volatile long f23943c;
    public volatile long d;
    public final HashMap f23944e;
    public final l2.r1 f23945f;
    public final LongSparseArray h;
    public final HashMap f23946n;
    public final HashMap f23947r;

    public f4(int i7) {
        super(i7);
        this.f23941a = new HashMap();
        this.f23944e = new HashMap();
        this.f23945f = new Object();
        this.h = new LongSparseArray();
        this.f23946n = new HashMap();
        this.f23947r = new HashMap();
        k();
    }

    public static f4 f(int i7) {
        f4 f4Var;
        f4[] f4VarArr = f23940w;
        f4 f4Var2 = f4VarArr[i7];
        if (f4Var2 == null) {
            synchronized (f4.class) {
                try {
                    f4Var = f4VarArr[i7];
                    if (f4Var == null) {
                        f4Var = new f4(i7);
                        f4VarArr[i7] = f4Var;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return f4Var;
        }
        return f4Var2;
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
        new ImageReceiver(null).r0(fc.b(ri.d0(i10.f24637t0).V(str)), "50_50", null, null, null, 0);
        j6.k(str);
    }

    public static boolean v(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        if (wallPaper == null && wallPaper2 == null) {
            return true;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaper) && (wallPaper2 instanceof TLRPC.TL_wallPaper)) {
            if (wallPaper.f28646id == wallPaper2.f28646id) {
                return true;
            }
            return false;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile)) {
            if (wallPaper.settings != null && wallPaper2.settings != null) {
                return TextUtils.equals(j(wallPaper), j(wallPaper2));
            }
            if (wallPaper.f28646id == wallPaper2.f28646id) {
                return true;
            }
        }
        return false;
    }

    public final void a(long j3, boolean z10, boolean z11) {
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        if (j3 >= 0) {
            tL_messages_setChatWallPaper.peer = mp.p1(mp.u1(this.currentAccount).c2(Long.valueOf(j3)));
            tL_messages_setChatWallPaper.revert = z11;
            if (!z11) {
                TLRPC.UserFull d2 = getMessagesController().d2(j3);
                if (d2 != null) {
                    d2.wallpaper = null;
                    d2.flags &= -16777217;
                    getMessagesStorage().j2(d2, false);
                }
                r(j3, null);
                if (z10) {
                    ks.f(this.currentAccount).k(ks.E0, Long.valueOf(j3), d2);
                }
            }
        } else {
            long j10 = -j3;
            tL_messages_setChatWallPaper.peer = mp.n1(mp.u1(this.currentAccount).O0(Long.valueOf(j10)));
            TLRPC.ChatFull P0 = getMessagesController().P0(j10);
            if (P0 != null) {
                P0.wallpaper = null;
                P0.flags2 &= -129;
                getMessagesStorage().N1(P0, false);
            }
            r(j3, null);
            if (z10) {
                ks f10 = ks.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f10.k(ks.T, P0, 0, bool, bool);
            }
        }
        getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new fi.l5(8));
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
                    arrayList.add(new org.telegram.ui.ActionBar.s3(this.currentAccount, TLdeserialize));
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return arrayList;
    }

    public final org.telegram.ui.ActionBar.s3 c(long j3) {
        ig.b bVar;
        LongSparseArray longSparseArray = this.h;
        ig.b bVar2 = (ig.b) longSparseArray.get(j3);
        if (bVar2 == null) {
            String string = t0.f27013b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatTheme_" + this.currentAccount + "_" + j3, null);
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
            TLRPC.UserFull d2 = getMessagesController().d2(j3);
            if (d2 != null) {
                return d2.wallpaper;
            }
        } else {
            TLRPC.ChatFull P0 = getMessagesController().P0(-j3);
            if (P0 != null) {
                return P0.wallpaper;
            }
        }
        SharedPreferences sharedPreferences = t0.f27013b.getSharedPreferences("chatthemeconfig_emoji", 0);
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
        if (hasFlag3 && (arrayList2 = (ArrayList) this.f23945f.d) != null) {
            arrayList3.addAll(arrayList2);
        }
        if (hasFlag2 && (arrayList = this.f23942b) != null) {
            arrayList3.addAll(arrayList);
        }
        int i10 = 0;
        if (hasFlag && (arrayList3.isEmpty() || !((org.telegram.ui.ActionBar.s3) arrayList3.get(0)).f30045a)) {
            org.telegram.ui.ActionBar.s3 s3Var = new org.telegram.ui.ActionBar.s3(this.currentAccount);
            s3Var.f30048e = "❌";
            s3Var.f30047c = ig.b.d("❌");
            s3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
            s3Var.f30045a = true;
            org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3();
            r3Var.f30020a = org.telegram.ui.ActionBar.s3.d(true);
            s3Var.f30049f.add(r3Var);
            org.telegram.ui.ActionBar.r3 r3Var2 = new org.telegram.ui.ActionBar.r3();
            r3Var2.f30020a = org.telegram.ui.ActionBar.s3.d(false);
            s3Var.f30049f.add(r3Var2);
            arrayList3.add(0, s3Var);
        }
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.s3) obj).k();
        }
        return arrayList3;
    }

    public final File g(long j3) {
        File h = t0.h();
        Locale locale = Locale.US;
        long j10 = this.f23943c;
        return new File(h, j3 + "_" + j10 + ".jpg");
    }

    public final SharedPreferences h() {
        return f3.e(new StringBuilder("chatthemeconfig_"), this.currentAccount, t0.f27013b, 0);
    }

    public final org.telegram.ui.ActionBar.s3 i(ig.b bVar) {
        if (bVar != null) {
            String str = bVar.f16338b;
            if (!TextUtils.isEmpty(str)) {
                return (org.telegram.ui.ActionBar.s3) this.f23944e.get(str);
            }
            ArrayList arrayList = this.f23942b;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) obj;
                if (bVar.equals(s3Var.f30047c)) {
                    return s3Var;
                }
            }
            return null;
        }
        return null;
    }

    public final void k() {
        SharedPreferences h = h();
        this.f23943c = 0L;
        this.d = 0L;
        try {
            this.f23943c = h.getLong("hash", 0L);
            this.d = h.getLong("lastReload", 0L);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        this.f23942b = b();
        tr messagesStorage = getMessagesStorage();
        a4 a4Var = new a4(this, 0);
        messagesStorage.getClass();
        messagesStorage.I(new rq(8, messagesStorage, a4Var));
        n("❌");
        if (!this.f23942b.isEmpty()) {
            ArrayList arrayList = this.f23942b;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                n(((org.telegram.ui.ActionBar.s3) obj).f30048e);
            }
        }
    }

    public final void l(boolean z10) {
        ArrayList arrayList = this.f23942b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) obj;
            long h = s3Var.h(z10 ? 1 : 0);
            if (h != 0 && !g(h).exists()) {
                s3Var.n(z10 ? 1 : 0, null);
            }
        }
    }

    public final void m(boolean z10) {
        ArrayList arrayList = this.f23942b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) obj;
            long h = s3Var.h(z10 ? 1 : 0);
            if (h != 0 && !this.f23941a.containsKey(Long.valueOf(h))) {
                s3Var.p(z10 ? 1 : 0, new j1(this, 1));
            }
        }
    }

    public final void o(TL_update.TL_updatePeerWallpaper tL_updatePeerWallpaper) {
        if (tL_updatePeerWallpaper.peer instanceof TLRPC.TL_peerUser) {
            TLRPC.UserFull d2 = getMessagesController().d2(tL_updatePeerWallpaper.peer.user_id);
            if (d2 != null && !v(d2.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
                long j3 = d2.f28642id;
                if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                    d2.wallpaper_overridden = tL_updatePeerWallpaper.wallpaper_overridden;
                    d2.wallpaper = tL_updatePeerWallpaper.wallpaper;
                    d2.flags |= 16777216;
                } else {
                    d2.wallpaper_overridden = false;
                    d2.wallpaper = null;
                    d2.flags &= -16777217;
                }
                getMessagesStorage().j2(d2, false);
                r(j3, d2.wallpaper);
                g0.g3(new d4(this, j3, d2, 0));
                return;
            }
            return;
        }
        TLRPC.ChatFull P0 = getMessagesController().P0(-n5.o(tL_updatePeerWallpaper.peer));
        if (P0 != null && !v(P0.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
            long j10 = -P0.f28493id;
            if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                P0.wallpaper = tL_updatePeerWallpaper.wallpaper;
                P0.flags2 |= 128;
            } else {
                P0.wallpaper = null;
                P0.flags2 &= -129;
            }
            getMessagesStorage().N1(P0, false);
            r(j10, P0.wallpaper);
            g0.g3(new w3(0, this, P0));
        }
    }

    public final void p(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
            String str = tL_chatThemeUniqueGift.gift.slug;
            HashMap hashMap = this.f23944e;
            if (!hashMap.containsKey(str)) {
                org.telegram.ui.ActionBar.s3 s3Var = new org.telegram.ui.ActionBar.s3(this.currentAccount, tL_chatThemeUniqueGift);
                s3Var.k();
                hashMap.put(tL_chatThemeUniqueGift.gift.slug, s3Var);
                tr messagesStorage = getMessagesStorage();
                messagesStorage.getClass();
                messagesStorage.I(new rq(7, messagesStorage, Collections.singletonList(chatTheme)));
            }
        }
    }

    public final void q(final ResultCallback resultCallback, final boolean z10) {
        boolean z11;
        if (this.f23943c == 0 || this.d == 0) {
            k();
        }
        if (System.currentTimeMillis() - this.d > 7200000) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = this.f23942b;
        if (arrayList == null || arrayList.isEmpty() || z11) {
            TL_account.getChatThemes getchatthemes = new TL_account.getChatThemes();
            getchatthemes.hash = this.f23943c;
            ConnectionsManager connectionsManager = getConnectionsManager();
            q5 q5Var = f23939s;
            Objects.requireNonNull(q5Var);
            connectionsManager.sendRequestTyped(getchatthemes, new x3(q5Var), new p10() {
                @Override
                public final void a(java.lang.Object r13, java.lang.Object r14) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.y3.a(java.lang.Object, java.lang.Object):void");
                }
            });
        }
        ArrayList arrayList2 = this.f23942b;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            resultCallback.onComplete(e((z10 ? 1 : 0) | 2));
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
            SharedPreferences.Editor edit = t0.f27013b.getSharedPreferences("chatthemeconfig_emoji", 0).edit();
            edit.putString("chatWallpaper_" + this.currentAccount + "_" + j3, f10).apply();
            return;
        }
        SharedPreferences.Editor edit2 = t0.f27013b.getSharedPreferences("chatthemeconfig_emoji", 0).edit();
        edit2.remove("chatWallpaper_" + this.currentAccount + "_" + j3).apply();
    }

    public final void s(long r6, ig.b r8, org.telegram.tgnet.TLRPC.ChatTheme r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.f4.s(long, ig.b, org.telegram.tgnet.TLRPC$ChatTheme, boolean):void");
    }

    public final void t(long j3, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.f23947r;
        HashMap hashMap2 = this.f23946n;
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

    public final int u(long j3, String str, org.telegram.ui.ActionBar.e6 e6Var, fj fjVar, j2 j2Var) {
        boolean z10;
        TLRPC.ChatFull P0;
        TLRPC.UserFull userFull;
        TLRPC.WallPaper wallPaper;
        String str2;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 >= 0) {
            tL_messages_setChatWallPaper.peer = mp.p1(mp.u1(this.currentAccount).c2(Long.valueOf(j3)));
        } else {
            tL_messages_setChatWallPaper.peer = mp.n1(mp.u1(this.currentAccount).O0(Long.valueOf(-j3)));
        }
        tL_messages_setChatWallPaper.for_both = e6Var.f28992o;
        if (fjVar != null && (fjVar.f24073k.action instanceof TLRPC.TL_messageActionSetChatWallPaper)) {
            tL_messages_setChatWallPaper.flags |= 2;
            tL_messages_setChatWallPaper.f28611id = fjVar.e1();
            if (i7 >= 0) {
                userFull = mp.u1(this.currentAccount).d2(j3);
                P0 = null;
            } else {
                P0 = mp.u1(this.currentAccount).P0(-j3);
                userFull = null;
            }
            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) fjVar.f24073k.action;
            TLRPC.TL_wallPaper tL_wallPaper = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper.f28646id = wallPaper2.f28646id;
            tL_wallPaper.document = wallPaper2.document;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            tL_wallPaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.intensity = (int) (e6Var.f28988k * 100.0f);
            tL_wallPaperSettings.motion = e6Var.f28987j;
            tL_wallPaperSettings.blur = e6Var.f28986i;
            tL_wallPaperSettings.background_color = e6Var.d;
            tL_wallPaperSettings.second_background_color = e6Var.f28983e;
            tL_wallPaperSettings.third_background_color = e6Var.f28984f;
            tL_wallPaperSettings.fourth_background_color = e6Var.f28985g;
            tL_wallPaperSettings.rotation = e6Var.h;
            tL_wallPaper.uploadingImage = str;
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            } else if (P0 != null) {
                wallPaper = P0.wallpaper;
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
            TLRPC.ChatFull chatFull = P0;
            tL_wallPaper2.f28646id = wallPaper3.f28646id;
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
            z10 = false;
            if (userFull != null) {
                userFull.wallpaper = tL_wallPaper2;
                userFull.flags |= 16777216;
                getMessagesStorage().j2(userFull, false);
                ks.f(this.currentAccount).k(ks.E0, Long.valueOf(j3), userFull);
            } else if (chatFull != null) {
                chatFull.wallpaper = tL_wallPaper2;
                chatFull.flags2 |= 128;
                getMessagesStorage().N1(chatFull, false);
                ks f10 = ks.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f10.k(ks.T, chatFull, 0, bool, bool);
            }
        } else {
            tL_messages_setChatWallPaper.flags |= 1;
            tL_messages_setChatWallPaper.wallpaper = mp.t1(e6Var);
            z10 = true;
        }
        tL_messages_setChatWallPaper.flags |= 4;
        tL_messages_setChatWallPaper.settings = mp.i2(e6Var);
        return ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setChatWallPaper, new b4(this, j3, z10, str, j2Var));
    }
}
