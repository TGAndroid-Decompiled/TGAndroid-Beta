package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class wy implements Runnable {
    public final byte a;
    public final long b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;

    public wy(r7a r7aVar, r47 r47Var, TLRPC.Message message, long j, int i) {
        this.a = (byte) 11;
        this.d = r7aVar;
        this.e = r47Var;
        this.f = message;
        this.b = j;
        this.c = i;
    }

    private final void a() {
        SQLitePreparedStatement executeFast;
        boolean z;
        boolean z2;
        kf7 kf7Var = (kf7) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        int i = this.c;
        long j = this.b;
        zh6 zh6Var = kf7Var.K;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                kf7Var.b.beginTransaction();
                executeFast = kf7Var.b.executeFast("UPDATE dialogs SET folder_id = ?, pinned = ? WHERE did = ?");
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (arrayList != null) {
                int size = arrayList.size();
                z2 = false;
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.TL_folderPeer tL_folderPeer = (TLRPC.TL_folderPeer) arrayList.get(i2);
                    long n = wf3.n(tL_folderPeer.peer);
                    executeFast.requery();
                    executeFast.bindInteger(1, tL_folderPeer.folder_id);
                    if (tL_folderPeer.folder_id == 1) {
                        z2 = true;
                    }
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, n);
                    executeFast.step();
                    zh6Var.l(n);
                }
            } else if (arrayList2 != null) {
                int size2 = arrayList2.size();
                z2 = false;
                for (int i3 = 0; i3 < size2; i3++) {
                    TLRPC.TL_inputFolderPeer tL_inputFolderPeer = (TLRPC.TL_inputFolderPeer) arrayList2.get(i3);
                    long m = wf3.m(tL_inputFolderPeer.peer);
                    executeFast.requery();
                    executeFast.bindInteger(1, tL_inputFolderPeer.folder_id);
                    if (tL_inputFolderPeer.folder_id == 1) {
                        z2 = true;
                    }
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, m);
                    executeFast.step();
                    zh6Var.l(m);
                }
            } else {
                executeFast.requery();
                executeFast.bindInteger(1, i);
                if (i == 1) {
                    z = true;
                } else {
                    z = false;
                }
                executeFast.bindInteger(2, 0);
                executeFast.bindLong(3, j);
                executeFast.step();
                z2 = z;
            }
            executeFast.dispose();
            kf7Var.b.commitTransaction();
            if (!z2) {
                kf7Var.m(1);
            }
            kf7Var.u1(false);
            SQLiteDatabase sQLiteDatabase = kf7Var.b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = executeFast;
            kf7Var.p(e, true);
            SQLiteDatabase sQLiteDatabase2 = kf7Var.b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = executeFast;
            SQLiteDatabase sQLiteDatabase3 = kf7Var.b;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    private final void b() {
        c51 c51Var = (c51) this.d;
        c51Var.setLoading(true);
        TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
        tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) this.e).id;
        tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
        int i = this.c;
        ConnectionsManager.getInstance(i).sendRequest(tL_fulfillStarsSubscription, new gg(c51Var, (nx0[]) this.f, i, this.b, (byte) 6));
    }

    private final void c() {
        TL_stories.StoryItem storyItem;
        c6b c6bVar = (c6b) this.d;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.f;
        int i = c6bVar.a;
        HashSet hashSet = c6bVar.t;
        int i2 = this.c;
        if (tLObject != null) {
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            uc7.s1(i).j4(tL_stories_stories.users, false);
            uc7.s1(i).c4(tL_stories_stories.chats, false);
            for (int i3 = 0; i3 < tL_stories_stories.stories.size(); i3++) {
                if (tL_stories_stories.stories.get(i3).id == i2) {
                    storyItem = tL_stories_stories.stories.get(i3);
                    break;
                }
            }
        }
        storyItem = null;
        c6bVar.W.remove(str);
        long j = this.b;
        if (storyItem != null) {
            storyItem.dialogId = j;
            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
            tL_updateStory.peer = uc7.s1(i).y1(j);
            tL_updateStory.story = storyItem;
            c6bVar.b0(tL_updateStory);
            return;
        }
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (str2.endsWith(":" + j + ":" + i2)) {
                hashSet.remove(str2);
                break;
            }
        }
        hashSet.add(str);
        c6bVar.l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
    }

    private final void d() {
        String str;
        String str2;
        dkb dkbVar = (dkb) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        zh6 zh6Var = dkbVar.l;
        zh6 zh6Var2 = dkbVar.k;
        zh6 zh6Var3 = dkbVar.j;
        if (this.c == dkbVar.c) {
            long j = this.b;
            zh6Var3.k(j, arrayList);
            zh6Var2.k(j, arrayList2);
            ArrayList arrayList3 = (ArrayList) zh6Var.f(j);
            zh6Var.l(j);
            if (j == dkbVar.d) {
                rx6 rx6Var = dkbVar.b;
                if (j != 0) {
                    ArrayList arrayList4 = (ArrayList) zh6Var3.f(j);
                    ArrayList arrayList5 = (ArrayList) zh6Var2.f(j);
                    if (arrayList4 != null && !arrayList4.isEmpty() && arrayList5 != null) {
                        rx6Var.t0(arrayList5);
                        ex6 ex6Var = (ex6) rx6Var.b;
                        if (wf3.D(j)) {
                            TLRPC.User user = (TLRPC.User) dkbVar.h.f(j);
                            if (user != null) {
                                str2 = lv2.m(0, user.first_name, user.last_name);
                            } else {
                                str2 = "DELETED USER";
                            }
                            ex6Var.a.setQueueTitle(str2);
                        } else {
                            TLRPC.Chat chat = (TLRPC.Chat) dkbVar.i.f(-j);
                            if (chat != null) {
                                str = chat.title;
                            } else {
                                str = "DELETED CHAT";
                            }
                            ex6Var.a.setQueueTitle(str);
                        }
                        r47 r47Var = (r47) arrayList4.get(0);
                        v34 v34Var = new v34((byte) 16);
                        v34Var.R((long) (r47Var.L0() * 1000.0d));
                        v34Var.S("android.media.metadata.ARTIST", r47Var.w1(true));
                        v34Var.S("android.media.metadata.TITLE", r47Var.y1(true));
                        rx6Var.r0(new MediaMetadataCompat((Bundle) v34Var.b));
                    }
                }
            }
            if (arrayList3 != null) {
                for (int i = 0; i < arrayList3.size(); i++) {
                    ((Runnable) arrayList3.get(i)).run();
                }
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wy.run():void");
    }

    public wy(wp0 wp0Var, long[] jArr, long j, int i, Runnable runnable) {
        this.a = (byte) 1;
        this.d = wp0Var;
        this.e = jArr;
        this.b = j;
        this.c = i;
        this.f = runnable;
    }

    public wy(wra wraVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, String str, int i) {
        this.a = (byte) 9;
        this.d = wraVar;
        this.e = tL_starGiftUnique;
        this.b = j;
        this.f = str;
        this.c = i;
    }

    public wy(Context context, int i, kv4 kv4Var, long j, ex4 ex4Var) {
        this.a = (byte) 0;
        this.d = context;
        this.c = i;
        this.e = kv4Var;
        this.b = j;
        this.f = ex4Var;
    }

    public wy(Object obj, int i, long j, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.c = i;
        this.b = j;
        this.e = obj2;
        this.f = obj3;
    }

    public wy(Object obj, long j, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = i;
        this.e = obj2;
        this.f = obj3;
    }

    public wy(Object obj, Object obj2, int i, Object obj3, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = i;
        this.f = obj3;
        this.b = j;
    }

    public wy(Object obj, Object obj2, Serializable serializable, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = serializable;
        this.c = i;
        this.b = j;
    }
}
