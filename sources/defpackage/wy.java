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

    public wy(z3a z3aVar, k27 k27Var, TLRPC.Message message, long j, int i) {
        this.a = (byte) 11;
        this.d = z3aVar;
        this.e = k27Var;
        this.f = message;
        this.b = j;
        this.c = i;
    }

    private final void a() {
        SQLitePreparedStatement executeFast;
        boolean z;
        boolean z2;
        ad7 ad7Var = (ad7) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        int i = this.c;
        long j = this.b;
        vf6 vf6Var = ad7Var.K;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                ad7Var.b.beginTransaction();
                executeFast = ad7Var.b.executeFast("UPDATE dialogs SET folder_id = ?, pinned = ? WHERE did = ?");
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
                    long n = cf3.n(tL_folderPeer.peer);
                    executeFast.requery();
                    executeFast.bindInteger(1, tL_folderPeer.folder_id);
                    if (tL_folderPeer.folder_id == 1) {
                        z2 = true;
                    }
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, n);
                    executeFast.step();
                    vf6Var.l(n);
                }
            } else if (arrayList2 != null) {
                int size2 = arrayList2.size();
                z2 = false;
                for (int i3 = 0; i3 < size2; i3++) {
                    TLRPC.TL_inputFolderPeer tL_inputFolderPeer = (TLRPC.TL_inputFolderPeer) arrayList2.get(i3);
                    long m = cf3.m(tL_inputFolderPeer.peer);
                    executeFast.requery();
                    executeFast.bindInteger(1, tL_inputFolderPeer.folder_id);
                    if (tL_inputFolderPeer.folder_id == 1) {
                        z2 = true;
                    }
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, m);
                    executeFast.step();
                    vf6Var.l(m);
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
            ad7Var.b.commitTransaction();
            if (!z2) {
                ad7Var.k(1);
            }
            ad7Var.q1(false);
            SQLiteDatabase sQLiteDatabase = ad7Var.b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = executeFast;
            ad7Var.n(e, true);
            SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = executeFast;
            SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
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
        u41 u41Var = (u41) this.d;
        u41Var.setLoading(true);
        TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
        tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) this.e).id;
        tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
        int i = this.c;
        ConnectionsManager.getInstance(i).sendRequest(tL_fulfillStarsSubscription, new tg(u41Var, (fx0[]) this.f, i, this.b, (byte) 6));
    }

    private final void c() {
        TL_stories.StoryItem storyItem;
        g2b g2bVar = (g2b) this.d;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.f;
        int i = g2bVar.a;
        HashSet hashSet = g2bVar.t;
        int i2 = this.c;
        if (tLObject != null) {
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            na7.q1(i).a4(tL_stories_stories.users, false);
            na7.q1(i).U3(tL_stories_stories.chats, false);
            for (int i3 = 0; i3 < tL_stories_stories.stories.size(); i3++) {
                if (tL_stories_stories.stories.get(i3).id == i2) {
                    storyItem = tL_stories_stories.stories.get(i3);
                    break;
                }
            }
        }
        storyItem = null;
        g2bVar.W.remove(str);
        long j = this.b;
        if (storyItem != null) {
            storyItem.dialogId = j;
            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
            tL_updateStory.peer = na7.q1(i).w1(j);
            tL_updateStory.story = storyItem;
            g2bVar.b0(tL_updateStory);
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
        g2bVar.l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
    }

    private final void d() {
        String str;
        String str2;
        hgb hgbVar = (hgb) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        vf6 vf6Var = hgbVar.l;
        vf6 vf6Var2 = hgbVar.k;
        vf6 vf6Var3 = hgbVar.j;
        if (this.c == hgbVar.c) {
            long j = this.b;
            vf6Var3.k(arrayList, j);
            vf6Var2.k(arrayList2, j);
            ArrayList arrayList3 = (ArrayList) vf6Var.f(j);
            vf6Var.l(j);
            if (j == hgbVar.d) {
                mv6 mv6Var = hgbVar.b;
                if (j != 0) {
                    ArrayList arrayList4 = (ArrayList) vf6Var3.f(j);
                    ArrayList arrayList5 = (ArrayList) vf6Var2.f(j);
                    if (arrayList4 != null && !arrayList4.isEmpty() && arrayList5 != null) {
                        mv6Var.o0(arrayList5);
                        zu6 zu6Var = (zu6) mv6Var.b;
                        if (cf3.D(j)) {
                            TLRPC.User user = (TLRPC.User) hgbVar.h.f(j);
                            if (user != null) {
                                str2 = qu2.m(0, user.first_name, user.last_name);
                            } else {
                                str2 = "DELETED USER";
                            }
                            zu6Var.a.setQueueTitle(str2);
                        } else {
                            TLRPC.Chat chat = (TLRPC.Chat) hgbVar.i.f(-j);
                            if (chat != null) {
                                str = chat.title;
                            } else {
                                str = "DELETED CHAT";
                            }
                            zu6Var.a.setQueueTitle(str);
                        }
                        k27 k27Var = (k27) arrayList4.get(0);
                        pj4 pj4Var = new pj4((byte) 15);
                        pj4Var.X((long) (k27Var.L0() * 1000.0d));
                        pj4Var.Y("android.media.metadata.ARTIST", k27Var.w1(true));
                        pj4Var.Y("android.media.metadata.TITLE", k27Var.y1(true));
                        mv6Var.m0(new MediaMetadataCompat((Bundle) pj4Var.b));
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

    public wy(t7a t7aVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, String str, int i) {
        this.a = (byte) 9;
        this.d = t7aVar;
        this.e = tL_starGiftUnique;
        this.b = j;
        this.f = str;
        this.c = i;
    }

    public wy(Context context, int i, gt4 gt4Var, long j, av4 av4Var) {
        this.a = (byte) 0;
        this.d = context;
        this.c = i;
        this.e = gt4Var;
        this.b = j;
        this.f = av4Var;
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
