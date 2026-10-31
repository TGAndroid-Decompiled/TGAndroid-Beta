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
public final class g4 extends f1 {
    public static volatile r5 f15668s = new r5("chatThemeQueue");
    public static final g4[] f15669w = new g4[4];
    public final HashMap f15670a;
    public ArrayList f15671b;
    public volatile long f15672c;
    public volatile long d;
    public final HashMap e;
    public final i2.w1 f15673f;
    public final LongSparseArray h;
    public final HashMap f15674n;
    public final HashMap f15675r;

    public g4(int i10) {
        super(i10);
        this.f15670a = new HashMap();
        this.e = new HashMap();
        this.f15673f = new Object();
        this.h = new LongSparseArray();
        this.f15674n = new HashMap();
        this.f15675r = new HashMap();
        k();
    }

    public static g4 f(int i10) {
        g4 g4Var;
        g4[] g4VarArr = f15669w;
        g4 g4Var2 = g4VarArr[i10];
        if (g4Var2 == null) {
            synchronized (g4.class) {
                try {
                    g4Var = g4VarArr[i10];
                    if (g4Var == null) {
                        g4Var = new g4(i10);
                        g4VarArr[i10] = g4Var;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return g4Var;
        }
        return g4Var2;
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
        new ImageReceiver(null).q0(ic.b(ui.b0(d20.f15147s0).T(str)), "50_50", null, null, null, 0);
        k6.k(str);
    }

    public static boolean v(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        if (wallPaper == null && wallPaper2 == null) {
            return true;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaper) && (wallPaper2 instanceof TLRPC.TL_wallPaper)) {
            if (wallPaper.f19947id == wallPaper2.f19947id) {
                return true;
            }
            return false;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile)) {
            if (wallPaper.settings != null && wallPaper2.settings != null) {
                return TextUtils.equals(j(wallPaper), j(wallPaper2));
            }
            if (wallPaper.f19947id == wallPaper2.f19947id) {
                return true;
            }
        }
        return false;
    }

    public final void a(long j10, boolean z10, boolean z11) {
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        if (j10 >= 0) {
            tL_messages_setChatWallPaper.peer = vp.m1(vp.r1(this.currentAccount).Z1(Long.valueOf(j10)));
            tL_messages_setChatWallPaper.revert = z11;
            if (!z11) {
                TLRPC.UserFull a2 = getMessagesController().a2(j10);
                if (a2 != null) {
                    a2.wallpaper = null;
                    a2.flags &= -16777217;
                    getMessagesStorage().j2(a2, false);
                }
                r(j10, null);
                if (z10) {
                    zs.f(this.currentAccount).k(zs.E0, Long.valueOf(j10), a2);
                }
            }
        } else {
            long j11 = -j10;
            tL_messages_setChatWallPaper.peer = vp.k1(vp.r1(this.currentAccount).L0(Long.valueOf(j11)));
            TLRPC.ChatFull M0 = getMessagesController().M0(j11);
            if (M0 != null) {
                M0.wallpaper = null;
                M0.flags2 &= -129;
                getMessagesStorage().N1(M0, false);
            }
            r(j10, null);
            if (z10) {
                zs f7 = zs.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f7.k(zs.T, M0, 0, bool, bool);
            }
        }
        getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new ag.c3(3));
    }

    public final ArrayList b() {
        SharedPreferences h = h();
        int i10 = h.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            SerializedData serializedData = new SerializedData(Utilities.v(h.getString("theme_" + i11, "")));
            try {
                TLRPC.TL_theme TLdeserialize = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null) {
                    arrayList.add(new org.telegram.ui.ActionBar.y3(this.currentAccount, TLdeserialize));
                }
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
        return arrayList;
    }

    public final org.telegram.ui.ActionBar.y3 c(long j10) {
        yf.b bVar;
        LongSparseArray longSparseArray = this.h;
        yf.b bVar2 = (yf.b) longSparseArray.get(j10);
        if (bVar2 == null) {
            String string = w0.f19025b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatTheme_" + this.currentAccount + "_" + j10, null);
            if (string != null) {
                if (string.startsWith("gift_")) {
                    bVar = new yf.b(null, string.substring(5));
                } else if (string.startsWith("emoticon_")) {
                    bVar = new yf.b(string.substring(9), null);
                } else if (!TextUtils.isEmpty(string)) {
                    bVar = new yf.b(string, null);
                }
                bVar2 = bVar;
                longSparseArray.put(j10, bVar2);
            }
            bVar2 = null;
            longSparseArray.put(j10, bVar2);
        }
        return i(bVar2);
    }

    public final TLRPC.WallPaper d(long j10) {
        if (j10 >= 0) {
            TLRPC.UserFull a2 = getMessagesController().a2(j10);
            if (a2 != null) {
                return a2.wallpaper;
            }
        } else {
            TLRPC.ChatFull M0 = getMessagesController().M0(-j10);
            if (M0 != null) {
                return M0.wallpaper;
            }
        }
        SharedPreferences sharedPreferences = w0.f19025b.getSharedPreferences("chatthemeconfig_emoji", 0);
        String string = sharedPreferences.getString("chatWallpaper_" + this.currentAccount + "_" + j10, null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                return TLRPC.WallPaper.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
        return null;
    }

    public final ArrayList e(int i10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean hasFlag = TLObject.hasFlag(i10, 1);
        boolean hasFlag2 = TLObject.hasFlag(i10, 2);
        boolean hasFlag3 = TLObject.hasFlag(i10, 4);
        ArrayList arrayList3 = new ArrayList();
        if (hasFlag3 && (arrayList2 = (ArrayList) this.f15673f.d) != null) {
            arrayList3.addAll(arrayList2);
        }
        if (hasFlag2 && (arrayList = this.f15671b) != null) {
            arrayList3.addAll(arrayList);
        }
        int i11 = 0;
        if (hasFlag && (arrayList3.isEmpty() || !((org.telegram.ui.ActionBar.y3) arrayList3.get(0)).f21558a)) {
            org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this.currentAccount);
            y3Var.e = "❌";
            y3Var.f21560c = yf.b.d("❌");
            y3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
            y3Var.f21558a = true;
            org.telegram.ui.ActionBar.x3 x3Var = new org.telegram.ui.ActionBar.x3();
            x3Var.f21515a = org.telegram.ui.ActionBar.y3.d(true);
            y3Var.f21561f.add(x3Var);
            org.telegram.ui.ActionBar.x3 x3Var2 = new org.telegram.ui.ActionBar.x3();
            x3Var2.f21515a = org.telegram.ui.ActionBar.y3.d(false);
            y3Var.f21561f.add(x3Var2);
            arrayList3.add(0, y3Var);
        }
        int size = arrayList3.size();
        while (i11 < size) {
            Object obj = arrayList3.get(i11);
            i11++;
            ((org.telegram.ui.ActionBar.y3) obj).k();
        }
        return arrayList3;
    }

    public final File g(long j10) {
        File h = w0.h();
        Locale locale = Locale.US;
        long j11 = this.f15672c;
        return new File(h, j10 + "_" + j11 + ".jpg");
    }

    public final SharedPreferences h() {
        Context context = w0.f19025b;
        return context.getSharedPreferences("chatthemeconfig_" + this.currentAccount, 0);
    }

    public final org.telegram.ui.ActionBar.y3 i(yf.b bVar) {
        if (bVar != null) {
            String str = bVar.f54429b;
            if (!TextUtils.isEmpty(str)) {
                return (org.telegram.ui.ActionBar.y3) this.e.get(str);
            }
            ArrayList arrayList = this.f15671b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.ui.ActionBar.y3 y3Var = (org.telegram.ui.ActionBar.y3) obj;
                if (bVar.equals(y3Var.f21560c)) {
                    return y3Var;
                }
            }
            return null;
        }
        return null;
    }

    public final void k() {
        SharedPreferences h = h();
        this.f15672c = 0L;
        this.d = 0L;
        try {
            this.f15672c = h.getLong("hash", 0L);
            this.d = h.getLong("lastReload", 0L);
        } catch (Exception e) {
            f8.g(e, true);
        }
        this.f15671b = b();
        hs messagesStorage = getMessagesStorage();
        x3 x3Var = new x3(this, 0);
        messagesStorage.getClass();
        messagesStorage.I(new hr(3, messagesStorage, x3Var));
        n("❌");
        if (!this.f15671b.isEmpty()) {
            ArrayList arrayList = this.f15671b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                n(((org.telegram.ui.ActionBar.y3) obj).e);
            }
        }
    }

    public final void l(boolean z10) {
        ArrayList arrayList = this.f15671b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.ui.ActionBar.y3 y3Var = (org.telegram.ui.ActionBar.y3) obj;
            long h = y3Var.h(z10 ? 1 : 0);
            if (h != 0 && !g(h).exists()) {
                y3Var.n(z10 ? 1 : 0, null);
            }
        }
    }

    public final void m(boolean z10) {
        ArrayList arrayList = this.f15671b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.ui.ActionBar.y3 y3Var = (org.telegram.ui.ActionBar.y3) obj;
            long h = y3Var.h(z10 ? 1 : 0);
            if (h != 0 && !this.f15670a.containsKey(Long.valueOf(h))) {
                y3Var.p(z10 ? 1 : 0, new s1(this, 1));
            }
        }
    }

    public final void o(TL_update.TL_updatePeerWallpaper tL_updatePeerWallpaper) {
        if (tL_updatePeerWallpaper.peer instanceof TLRPC.TL_peerUser) {
            TLRPC.UserFull a2 = getMessagesController().a2(tL_updatePeerWallpaper.peer.user_id);
            if (a2 != null && !v(a2.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
                long j10 = a2.f19943id;
                if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                    a2.wallpaper_overridden = tL_updatePeerWallpaper.wallpaper_overridden;
                    a2.wallpaper = tL_updatePeerWallpaper.wallpaper;
                    a2.flags |= 16777216;
                } else {
                    a2.wallpaper_overridden = false;
                    a2.wallpaper = null;
                    a2.flags &= -16777217;
                }
                getMessagesStorage().j2(a2, false);
                r(j10, a2.wallpaper);
                i0.g3(new d4(this, j10, a2, 0));
                return;
            }
            return;
        }
        TLRPC.ChatFull M0 = getMessagesController().M0(-o5.o(tL_updatePeerWallpaper.peer));
        if (M0 != null && !v(M0.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
            long j11 = -M0.f19794id;
            if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                M0.wallpaper = tL_updatePeerWallpaper.wallpaper;
                M0.flags2 |= 128;
            } else {
                M0.wallpaper = null;
                M0.flags2 &= -129;
            }
            getMessagesStorage().N1(M0, false);
            r(j11, M0.wallpaper);
            i0.g3(new e4(0, this, M0));
        }
    }

    public final void p(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
            String str = tL_chatThemeUniqueGift.gift.slug;
            HashMap hashMap = this.e;
            if (!hashMap.containsKey(str)) {
                org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this.currentAccount, tL_chatThemeUniqueGift);
                y3Var.k();
                hashMap.put(tL_chatThemeUniqueGift.gift.slug, y3Var);
                hs messagesStorage = getMessagesStorage();
                messagesStorage.getClass();
                messagesStorage.I(new hr(2, messagesStorage, Collections.singletonList(chatTheme)));
            }
        }
    }

    public final void q(final ResultCallback resultCallback, final boolean z10) {
        boolean z11;
        if (this.f15672c == 0 || this.d == 0) {
            k();
        }
        if (System.currentTimeMillis() - this.d > 7200000) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = this.f15671b;
        if (arrayList == null || arrayList.isEmpty() || z11) {
            TL_account.getChatThemes getchatthemes = new TL_account.getChatThemes();
            getchatthemes.hash = this.f15672c;
            ConnectionsManager connectionsManager = getConnectionsManager();
            r5 r5Var = f15668s;
            Objects.requireNonNull(r5Var);
            connectionsManager.sendRequestTyped(getchatthemes, new y3(r5Var), new j20() {
                @Override
                public final void a(java.lang.Object r13, java.lang.Object r14) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z3.a(java.lang.Object, java.lang.Object):void");
                }
            });
        }
        ArrayList arrayList2 = this.f15671b;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            resultCallback.onComplete(e((z10 ? 1 : 0) | 2));
        }
    }

    public final void r(long j10, TLRPC.WallPaper wallPaper) {
        if (wallPaper != null) {
            if (wallPaper.document == null) {
                return;
            }
            SerializedData serializedData = new SerializedData(wallPaper.getObjectSize());
            wallPaper.serializeToStream(serializedData);
            String f7 = Utilities.f(serializedData.toByteArray());
            SharedPreferences.Editor edit = w0.f19025b.getSharedPreferences("chatthemeconfig_emoji", 0).edit();
            edit.putString("chatWallpaper_" + this.currentAccount + "_" + j10, f7).apply();
            return;
        }
        SharedPreferences.Editor edit2 = w0.f19025b.getSharedPreferences("chatthemeconfig_emoji", 0).edit();
        edit2.remove("chatWallpaper_" + this.currentAccount + "_" + j10).apply();
    }

    public final void s(long r6, yf.b r8, org.telegram.tgnet.TLRPC.ChatTheme r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.g4.s(long, yf.b, org.telegram.tgnet.TLRPC$ChatTheme, boolean):void");
    }

    public final void t(long j10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.f15675r;
        HashMap hashMap2 = this.f15674n;
        if (isEmpty) {
            String str2 = (String) hashMap2.remove(Long.valueOf(j10));
            if (str2 != null) {
                hashMap.remove(str2);
            }
        } else if (j10 == 0) {
            Long l4 = (Long) hashMap.remove(str);
            if (l4 != null) {
                hashMap2.remove(l4);
            }
        } else {
            String str3 = (String) hashMap2.put(Long.valueOf(j10), str);
            Long l10 = (Long) hashMap.put(str, Long.valueOf(j10));
            if (str3 != null && !TextUtils.equals(str, str3)) {
                hashMap.remove(str3);
            }
            if (l10 != null && l10.longValue() != j10) {
                hashMap2.remove(l10);
            }
        }
    }

    public final int u(long j10, String str, org.telegram.ui.ActionBar.m6 m6Var, jj jjVar, ag.f3 f3Var) {
        boolean z10;
        TLRPC.ChatFull M0;
        TLRPC.UserFull userFull;
        TLRPC.WallPaper wallPaper;
        String str2;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            tL_messages_setChatWallPaper.peer = vp.m1(vp.r1(this.currentAccount).Z1(Long.valueOf(j10)));
        } else {
            tL_messages_setChatWallPaper.peer = vp.k1(vp.r1(this.currentAccount).L0(Long.valueOf(-j10)));
        }
        tL_messages_setChatWallPaper.for_both = m6Var.f20599o;
        if (jjVar != null && (jjVar.f16337k.action instanceof TLRPC.TL_messageActionSetChatWallPaper)) {
            tL_messages_setChatWallPaper.flags |= 2;
            tL_messages_setChatWallPaper.f19912id = jjVar.f1();
            if (i10 >= 0) {
                userFull = vp.r1(this.currentAccount).a2(j10);
                M0 = null;
            } else {
                M0 = vp.r1(this.currentAccount).M0(-j10);
                userFull = null;
            }
            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) jjVar.f16337k.action;
            TLRPC.TL_wallPaper tL_wallPaper = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper.f19947id = wallPaper2.f19947id;
            tL_wallPaper.document = wallPaper2.document;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            tL_wallPaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.intensity = (int) (m6Var.f20595k * 100.0f);
            tL_wallPaperSettings.motion = m6Var.f20594j;
            tL_wallPaperSettings.blur = m6Var.f20593i;
            tL_wallPaperSettings.background_color = m6Var.d;
            tL_wallPaperSettings.second_background_color = m6Var.e;
            tL_wallPaperSettings.third_background_color = m6Var.f20591f;
            tL_wallPaperSettings.fourth_background_color = m6Var.f20592g;
            tL_wallPaperSettings.rotation = m6Var.h;
            tL_wallPaper.uploadingImage = str;
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            } else if (M0 != null) {
                wallPaper = M0.wallpaper;
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
            TLRPC.ChatFull chatFull = M0;
            tL_wallPaper2.f19947id = wallPaper3.f19947id;
            tL_wallPaper2.document = wallPaper3.document;
            int i11 = wallPaper3.flags;
            tL_wallPaper2.creator = wallPaper3.creator;
            tL_wallPaper2.dark = wallPaper3.dark;
            tL_wallPaper2.isDefault = wallPaper3.isDefault;
            tL_wallPaper2.slug = wallPaper3.slug;
            tL_wallPaper2.access_hash = wallPaper3.access_hash;
            tL_wallPaper2.stripedThumb = wallPaper3.stripedThumb;
            tL_wallPaper2.settings = tL_wallPaper.settings;
            tL_wallPaper2.flags = i11 | 4;
            z10 = false;
            if (userFull != null) {
                userFull.wallpaper = tL_wallPaper2;
                userFull.flags |= 16777216;
                getMessagesStorage().j2(userFull, false);
                zs.f(this.currentAccount).k(zs.E0, Long.valueOf(j10), userFull);
            } else if (chatFull != null) {
                chatFull.wallpaper = tL_wallPaper2;
                chatFull.flags2 |= 128;
                getMessagesStorage().N1(chatFull, false);
                zs f7 = zs.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f7.k(zs.T, chatFull, 0, bool, bool);
            }
        } else {
            tL_messages_setChatWallPaper.flags |= 1;
            tL_messages_setChatWallPaper.wallpaper = vp.q1(m6Var);
            z10 = true;
        }
        tL_messages_setChatWallPaper.flags |= 4;
        tL_messages_setChatWallPaper.settings = vp.f2(m6Var);
        return ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setChatWallPaper, new b4(this, j10, z10, str, f3Var));
    }
}
