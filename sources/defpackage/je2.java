package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class je2 extends pf0 {
    public static volatile co3 s = new co3("chatThemeQueue");
    public static final je2[] w = new je2[4];
    public final HashMap a;
    public ArrayList b;
    public volatile long c;
    public volatile long d;
    public final HashMap e;
    public final ie2 f;
    public final LongSparseArray h;
    public final HashMap n;
    public final HashMap r;

    public je2(int i) {
        super(i);
        this.a = new HashMap();
        this.e = new HashMap();
        this.f = new Object();
        this.h = new LongSparseArray();
        this.n = new HashMap();
        this.r = new HashMap();
        i();
    }

    public static je2 e(int i) {
        je2 je2Var;
        je2[] je2VarArr = w;
        je2 je2Var2 = je2VarArr[i];
        if (je2Var2 == null) {
            synchronized (je2.class) {
                je2Var = je2VarArr[i];
                if (je2Var == null) {
                    je2Var = new je2(i);
                    je2VarArr[i] = je2Var;
                }
            }
            return je2Var;
        }
        return je2Var2;
    }

    public static String h(TLRPC.WallPaper wallPaper) {
        if (wallPaper != null) {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings != null && !TextUtils.isEmpty(wallPaperSettings.emoticon)) {
                return wallPaper.settings.emoticon;
            }
            return "";
        }
        return null;
    }

    public static void l(String str) {
        new ImageReceiver(null).d0(gl5.b(hq6.d0(y6c.t0).V(str)), "50_50", null, null, null, 0);
        vu3.k(str);
    }

    public static boolean t(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        if (wallPaper == null && wallPaper2 == null) {
            return true;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaper) && (wallPaper2 instanceof TLRPC.TL_wallPaper)) {
            if (wallPaper.id == wallPaper2.id) {
                return true;
            }
            return false;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile)) {
            if (wallPaper.settings != null && wallPaper2.settings != null) {
                return TextUtils.equals(h(wallPaper), h(wallPaper2));
            }
            if (wallPaper.id == wallPaper2.id) {
                return true;
            }
        }
        return false;
    }

    public final void a(long j, boolean z, boolean z2) {
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.currentAccount;
        if (i >= 0) {
            tL_messages_setChatWallPaper.peer = na7.l1(na7.q1(i2).V1(Long.valueOf(j)));
            tL_messages_setChatWallPaper.revert = z2;
            if (!z2) {
                TLRPC.UserFull W1 = getMessagesController().W1(j);
                if (W1 != null) {
                    W1.wallpaper = null;
                    W1.flags &= -16777217;
                    getMessagesStorage().g2(W1, false);
                }
                p(j, null);
                if (z) {
                    kk7.f(this.currentAccount).k(kk7.D0, Long.valueOf(j), W1);
                }
            }
        } else {
            long j2 = -j;
            tL_messages_setChatWallPaper.peer = na7.j1(na7.q1(i2).K0(Long.valueOf(j2)));
            TLRPC.ChatFull L0 = getMessagesController().L0(j2);
            if (L0 != null) {
                L0.wallpaper = null;
                L0.flags2 &= -129;
                getMessagesStorage().K1(L0, false);
            }
            p(j, null);
            if (z) {
                kk7 f = kk7.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f.k(kk7.S, L0, 0, bool, bool);
            }
        }
        getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new ce2((byte) 0));
    }

    public final ArrayList b() {
        SharedPreferences f = f();
        int i = f.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            SerializedData serializedData = new SerializedData(Utilities.v(f.getString("theme_" + i2, "")));
            try {
                TLRPC.TL_theme TLdeserialize = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null) {
                    arrayList.add(new jy3(this.currentAccount, TLdeserialize));
                }
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
        return arrayList;
    }

    public final TLRPC.WallPaper c(long j) {
        if (j >= 0) {
            TLRPC.UserFull W1 = getMessagesController().W1(j);
            if (W1 != null) {
                return W1.wallpaper;
            }
        } else {
            TLRPC.ChatFull L0 = getMessagesController().L0(-j);
            if (L0 != null) {
                return L0.wallpaper;
            }
        }
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("chatthemeconfig_emoji", 0);
        String string = sharedPreferences.getString("chatWallpaper_" + this.currentAccount + "_" + j, null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                return TLRPC.WallPaper.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
        return null;
    }

    public final ArrayList d(int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean hasFlag = TLObject.hasFlag(i, 1);
        boolean hasFlag2 = TLObject.hasFlag(i, 2);
        boolean hasFlag3 = TLObject.hasFlag(i, 4);
        ArrayList arrayList3 = new ArrayList();
        if (hasFlag3 && (arrayList2 = (ArrayList) this.f.d) != null) {
            arrayList3.addAll(arrayList2);
        }
        if (hasFlag2 && (arrayList = this.b) != null) {
            arrayList3.addAll(arrayList);
        }
        int i2 = 0;
        if (hasFlag && (arrayList3.isEmpty() || !((jy3) arrayList3.get(0)).a)) {
            jy3 jy3Var = new jy3(this.currentAccount);
            jy3Var.e = "❌";
            jy3Var.c = elb.d("❌");
            jy3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
            jy3Var.a = true;
            iy3 iy3Var = new iy3();
            iy3Var.a = jy3.d(true);
            ArrayList arrayList4 = jy3Var.f;
            arrayList4.add(iy3Var);
            iy3 iy3Var2 = new iy3();
            iy3Var2.a = jy3.d(false);
            arrayList4.add(iy3Var2);
            arrayList3.add(0, jy3Var);
        }
        int size = arrayList3.size();
        while (i2 < size) {
            Object obj = arrayList3.get(i2);
            i2++;
            ((jy3) obj).k();
        }
        return arrayList3;
    }

    public final SharedPreferences f() {
        return oo1.k(new StringBuilder("chatthemeconfig_"), this.currentAccount, a.b, 0);
    }

    public final jy3 g(elb elbVar) {
        if (elbVar != null) {
            String str = elbVar.b;
            if (!TextUtils.isEmpty(str)) {
                return (jy3) this.e.get(str);
            }
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jy3 jy3Var = (jy3) obj;
                if (elbVar.equals(jy3Var.c)) {
                    return jy3Var;
                }
            }
            return null;
        }
        return null;
    }

    public final void i() {
        SharedPreferences f = f();
        this.c = 0L;
        this.d = 0L;
        try {
            this.c = f.getLong("hash", 0L);
            this.d = f.getLong("lastReload", 0L);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        this.b = b();
        ad7 messagesStorage = getMessagesStorage();
        int i = 0;
        be2 be2Var = new be2(this, (byte) 0);
        messagesStorage.getClass();
        messagesStorage.H(new t67(messagesStorage, be2Var, (byte) 26));
        l("❌");
        if (!this.b.isEmpty()) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l(((jy3) obj).e);
            }
        }
    }

    public final void j(boolean z) {
        boolean z2;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jy3 jy3Var = (jy3) obj;
            if (jy3Var.h(z ? 1 : 0) != 0) {
                TLRPC.WallPaper j = jy3Var.j(z ? 1 : 0);
                if (j != null && j.document != null) {
                    if (j.pattern) {
                        z2 = zqc.b(ng5.c(xqc.b(j))).exists();
                    } else {
                        z2 = dye.a(dye.c(j.id)).exists();
                    }
                } else {
                    z2 = true;
                }
                if (!z2) {
                    jy3Var.n(z ? 1 : 0, null);
                }
            }
        }
    }

    public final void k(boolean z) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jy3 jy3Var = (jy3) obj;
            long h = jy3Var.h(z ? 1 : 0);
            if (h != 0 && !this.a.containsKey(Long.valueOf(h))) {
                jy3Var.p(z ? 1 : 0, new rh1(this, (byte) 23));
            }
        }
    }

    public final void m(TL_update.TL_updatePeerWallpaper tL_updatePeerWallpaper) {
        if (tL_updatePeerWallpaper.peer instanceof TLRPC.TL_peerUser) {
            TLRPC.UserFull W1 = getMessagesController().W1(tL_updatePeerWallpaper.peer.user_id);
            if (W1 != null && !t(W1.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
                long j = W1.id;
                if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                    W1.wallpaper_overridden = tL_updatePeerWallpaper.wallpaper_overridden;
                    W1.wallpaper = tL_updatePeerWallpaper.wallpaper;
                    W1.flags |= 16777216;
                } else {
                    W1.wallpaper_overridden = false;
                    W1.wallpaper = null;
                    W1.flags &= -16777217;
                }
                getMessagesStorage().g2(W1, false);
                p(j, W1.wallpaper);
                gl.d3(new de2(this, j, W1, (byte) 0));
                return;
            }
            return;
        }
        TLRPC.ChatFull L0 = getMessagesController().L0(-cf3.n(tL_updatePeerWallpaper.peer));
        if (L0 != null && !t(L0.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
            long j2 = -L0.id;
            if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                L0.wallpaper = tL_updatePeerWallpaper.wallpaper;
                L0.flags2 |= 128;
            } else {
                L0.wallpaper = null;
                L0.flags2 &= -129;
            }
            getMessagesStorage().K1(L0, false);
            p(j2, L0.wallpaper);
            gl.d3(new ee2(this, L0, (byte) 0));
        }
    }

    public final void n(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
            String str = tL_chatThemeUniqueGift.gift.slug;
            HashMap hashMap = this.e;
            if (!hashMap.containsKey(str)) {
                jy3 jy3Var = new jy3(this.currentAccount, tL_chatThemeUniqueGift);
                jy3Var.k();
                hashMap.put(tL_chatThemeUniqueGift.gift.slug, jy3Var);
                ad7 messagesStorage = getMessagesStorage();
                messagesStorage.getClass();
                messagesStorage.H(new t67(messagesStorage, Collections.singletonList(chatTheme), (byte) 25));
            }
        }
    }

    public final void o(ResultCallback resultCallback, boolean z) {
        boolean z2;
        if (this.c == 0 || this.d == 0) {
            i();
        }
        if (System.currentTimeMillis() - this.d > 7200000) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList = this.b;
        if (arrayList == null || arrayList.isEmpty() || z2) {
            TL_account.getChatThemes getchatthemes = new TL_account.getChatThemes();
            getchatthemes.hash = this.c;
            ConnectionsManager connectionsManager = getConnectionsManager();
            co3 co3Var = s;
            Objects.requireNonNull(co3Var);
            connectionsManager.sendRequestTyped(getchatthemes, new ge2(co3Var, (byte) 0), new yd2(this, resultCallback, z, (byte) 0));
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            resultCallback.onComplete(d((z ? 1 : 0) | 2));
        }
    }

    public final void p(long j, TLRPC.WallPaper wallPaper) {
        if (wallPaper != null) {
            if (wallPaper.document == null) {
                return;
            }
            SerializedData serializedData = new SerializedData(wallPaper.getObjectSize());
            wallPaper.serializeToStream(serializedData);
            String f = Utilities.f(serializedData.toByteArray());
            SharedPreferences.Editor edit = a.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit();
            edit.putString("chatWallpaper_" + this.currentAccount + "_" + j, f).apply();
            return;
        }
        SharedPreferences.Editor edit2 = a.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit();
        edit2.remove("chatWallpaper_" + this.currentAccount + "_" + j).apply();
    }

    public final void q(long r6, defpackage.elb r8, org.telegram.tgnet.TLRPC.ChatTheme r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.je2.q(long, elb, org.telegram.tgnet.TLRPC$ChatTheme, boolean):void");
    }

    public final void r(long j, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.r;
        HashMap hashMap2 = this.n;
        if (isEmpty) {
            String str2 = (String) hashMap2.remove(Long.valueOf(j));
            if (str2 != null) {
                hashMap.remove(str2);
            }
        } else if (j == 0) {
            Long l = (Long) hashMap.remove(str);
            if (l != null) {
                hashMap2.remove(l);
            }
        } else {
            String str3 = (String) hashMap2.put(Long.valueOf(j), str);
            Long l2 = (Long) hashMap.put(str, Long.valueOf(j));
            if (str3 != null && !TextUtils.equals(str, str3)) {
                hashMap.remove(str3);
            }
            if (l2 != null && l2.longValue() != j) {
                hashMap2.remove(l2);
            }
        }
    }

    public final int s(long j, String str, vjb vjbVar, k27 k27Var, jc jcVar) {
        boolean z;
        TLRPC.ChatFull L0;
        TLRPC.UserFull userFull;
        String str2;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.currentAccount;
        if (i >= 0) {
            tL_messages_setChatWallPaper.peer = na7.l1(na7.q1(i2).V1(Long.valueOf(j)));
        } else {
            tL_messages_setChatWallPaper.peer = na7.j1(na7.q1(i2).K0(Long.valueOf(-j)));
        }
        tL_messages_setChatWallPaper.for_both = vjbVar.o;
        if (k27Var != null && (k27Var.k.action instanceof TLRPC.TL_messageActionSetChatWallPaper)) {
            tL_messages_setChatWallPaper.flags |= 2;
            tL_messages_setChatWallPaper.id = k27Var.e1();
            int i3 = this.currentAccount;
            TLRPC.WallPaper wallPaper = null;
            if (i >= 0) {
                userFull = na7.q1(i3).W1(j);
                L0 = null;
            } else {
                L0 = na7.q1(i3).L0(-j);
                userFull = null;
            }
            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) k27Var.k.action;
            TLRPC.TL_wallPaper tL_wallPaper = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper.id = wallPaper2.id;
            tL_wallPaper.document = wallPaper2.document;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            tL_wallPaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.intensity = (int) (vjbVar.k * 100.0f);
            tL_wallPaperSettings.motion = vjbVar.j;
            tL_wallPaperSettings.blur = vjbVar.i;
            tL_wallPaperSettings.background_color = vjbVar.d;
            tL_wallPaperSettings.second_background_color = vjbVar.e;
            tL_wallPaperSettings.third_background_color = vjbVar.f;
            tL_wallPaperSettings.fourth_background_color = vjbVar.g;
            tL_wallPaperSettings.rotation = vjbVar.h;
            tL_wallPaper.uploadingImage = str;
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            } else if (L0 != null) {
                wallPaper = L0.wallpaper;
            }
            if (wallPaper != null && (str2 = wallPaper.uploadingImage) != null && str2.equals(str)) {
                tL_wallPaper.stripedThumb = wallPaper.stripedThumb;
            }
            tL_wallPaper.settings.flags |= 121;
            TLRPC.TL_wallPaper tL_wallPaper2 = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper2.pattern = wallPaper3.pattern;
            tL_wallPaper2.id = wallPaper3.id;
            tL_wallPaper2.document = wallPaper3.document;
            int i4 = wallPaper3.flags;
            tL_wallPaper2.creator = wallPaper3.creator;
            tL_wallPaper2.dark = wallPaper3.dark;
            tL_wallPaper2.isDefault = wallPaper3.isDefault;
            tL_wallPaper2.slug = wallPaper3.slug;
            TLRPC.ChatFull chatFull = L0;
            tL_wallPaper2.access_hash = wallPaper3.access_hash;
            tL_wallPaper2.stripedThumb = wallPaper3.stripedThumb;
            tL_wallPaper2.settings = tL_wallPaper.settings;
            tL_wallPaper2.flags = i4 | 4;
            z = false;
            if (userFull != null) {
                userFull.wallpaper = tL_wallPaper2;
                userFull.flags |= 16777216;
                getMessagesStorage().g2(userFull, false);
                kk7.f(this.currentAccount).k(kk7.D0, Long.valueOf(j), userFull);
            } else if (chatFull != null) {
                chatFull.wallpaper = tL_wallPaper2;
                chatFull.flags2 |= 128;
                getMessagesStorage().K1(chatFull, false);
                kk7 f = kk7.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f.k(kk7.S, chatFull, 0, bool, bool);
            }
        } else {
            tL_messages_setChatWallPaper.flags |= 1;
            tL_messages_setChatWallPaper.wallpaper = na7.p1(vjbVar);
            z = true;
        }
        tL_messages_setChatWallPaper.flags |= 4;
        tL_messages_setChatWallPaper.settings = na7.b2(vjbVar);
        return ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setChatWallPaper, new js0(this, j, z, str, jcVar));
    }
}
