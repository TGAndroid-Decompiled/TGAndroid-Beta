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
public final class wz implements Runnable {
    public final byte a;
    public final long b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;

    public wz(a6a a6aVar, k47 k47Var, TLRPC.Message message, long j, int i) {
        this.a = (byte) 11;
        this.d = a6aVar;
        this.e = k47Var;
        this.f = message;
        this.b = j;
        this.c = i;
    }

    private final void a() {
        SQLitePreparedStatement executeFast;
        boolean z;
        boolean z2;
        cf7 cf7Var = (cf7) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        int i = this.c;
        long j = this.b;
        vh6 vh6Var = cf7Var.K;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                cf7Var.b.beginTransaction();
                executeFast = cf7Var.b.executeFast("UPDATE dialogs SET folder_id = ?, pinned = ? WHERE did = ?");
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
                    long n = pg3.n(tL_folderPeer.peer);
                    executeFast.requery();
                    executeFast.bindInteger(1, tL_folderPeer.folder_id);
                    if (tL_folderPeer.folder_id == 1) {
                        z2 = true;
                    }
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, n);
                    executeFast.step();
                    vh6Var.l(n);
                }
            } else if (arrayList2 != null) {
                int size2 = arrayList2.size();
                z2 = false;
                for (int i3 = 0; i3 < size2; i3++) {
                    TLRPC.TL_inputFolderPeer tL_inputFolderPeer = (TLRPC.TL_inputFolderPeer) arrayList2.get(i3);
                    long m = pg3.m(tL_inputFolderPeer.peer);
                    executeFast.requery();
                    executeFast.bindInteger(1, tL_inputFolderPeer.folder_id);
                    if (tL_inputFolderPeer.folder_id == 1) {
                        z2 = true;
                    }
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, m);
                    executeFast.step();
                    vh6Var.l(m);
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
            cf7Var.b.commitTransaction();
            if (!z2) {
                cf7Var.k(1);
            }
            cf7Var.q1(false);
            SQLiteDatabase sQLiteDatabase = cf7Var.b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = executeFast;
            cf7Var.n(e, true);
            SQLiteDatabase sQLiteDatabase2 = cf7Var.b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = executeFast;
            SQLiteDatabase sQLiteDatabase3 = cf7Var.b;
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
        b61 b61Var = (b61) this.d;
        b61Var.setLoading(true);
        TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
        tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) this.e).id;
        tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
        int i = this.c;
        ConnectionsManager.getInstance(i).sendRequest(tL_fulfillStarsSubscription, new mh(b61Var, (my0[]) this.f, i, this.b, (byte) 6));
    }

    private final void c() {
        TL_stories.StoryItem storyItem;
        h4b h4bVar = (h4b) this.d;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.f;
        int i = h4bVar.a;
        HashSet hashSet = h4bVar.t;
        int i2 = this.c;
        if (tLObject != null) {
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            oc7.r1(i).d4(tL_stories_stories.users, false);
            oc7.r1(i).X3(tL_stories_stories.chats, false);
            for (int i3 = 0; i3 < tL_stories_stories.stories.size(); i3++) {
                if (tL_stories_stories.stories.get(i3).id == i2) {
                    storyItem = tL_stories_stories.stories.get(i3);
                    break;
                }
            }
        }
        storyItem = null;
        h4bVar.W.remove(str);
        long j = this.b;
        if (storyItem != null) {
            storyItem.dialogId = j;
            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
            tL_updateStory.peer = oc7.r1(i).x1(j);
            tL_updateStory.story = storyItem;
            h4bVar.b0(tL_updateStory);
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
        h4bVar.l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
    }

    private final void d() {
        String str;
        String str2;
        iib iibVar = (iib) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        vh6 vh6Var = iibVar.l;
        vh6 vh6Var2 = iibVar.k;
        vh6 vh6Var3 = iibVar.j;
        if (this.c == iibVar.c) {
            long j = this.b;
            vh6Var3.k(arrayList, j);
            vh6Var2.k(arrayList2, j);
            ArrayList arrayList3 = (ArrayList) vh6Var.f(j);
            vh6Var.l(j);
            if (j == iibVar.d) {
                mx6 mx6Var = iibVar.b;
                if (j != 0) {
                    ArrayList arrayList4 = (ArrayList) vh6Var3.f(j);
                    ArrayList arrayList5 = (ArrayList) vh6Var2.f(j);
                    if (arrayList4 != null && !arrayList4.isEmpty() && arrayList5 != null) {
                        mx6Var.s0(arrayList5);
                        zw6 zw6Var = (zw6) mx6Var.b;
                        if (pg3.D(j)) {
                            TLRPC.User user = (TLRPC.User) iibVar.h.f(j);
                            if (user != null) {
                                str2 = bw2.m(0, user.first_name, user.last_name);
                            } else {
                                str2 = "DELETED USER";
                            }
                            zw6Var.a.setQueueTitle(str2);
                        } else {
                            TLRPC.Chat chat = (TLRPC.Chat) iibVar.i.f(-j);
                            if (chat != null) {
                                str = chat.title;
                            } else {
                                str = "DELETED CHAT";
                            }
                            zw6Var.a.setQueueTitle(str);
                        }
                        k47 k47Var = (k47) arrayList4.get(0);
                        k44 k44Var = new k44((byte) 17);
                        k44Var.T((long) (k47Var.L0() * 1000.0d));
                        k44Var.U("android.media.metadata.ARTIST", k47Var.w1(true));
                        k44Var.U("android.media.metadata.TITLE", k47Var.y1(true));
                        mx6Var.q0(new MediaMetadataCompat((Bundle) k44Var.b));
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz.run():void");
    }

    public wz(wq0 wq0Var, long[] jArr, long j, int i, Runnable runnable) {
        this.a = (byte) 1;
        this.d = wq0Var;
        this.e = jArr;
        this.b = j;
        this.c = i;
        this.f = runnable;
    }

    public wz(e6a e6aVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, String str, int i) {
        this.a = (byte) 9;
        this.d = e6aVar;
        this.e = tL_starGiftUnique;
        this.b = j;
        this.f = str;
        this.c = i;
    }

    public wz(Context context, int i, hv4 hv4Var, long j, bx4 bx4Var) {
        this.a = (byte) 0;
        this.d = context;
        this.c = i;
        this.e = hv4Var;
        this.b = j;
        this.f = bx4Var;
    }

    public wz(Object obj, int i, long j, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.c = i;
        this.b = j;
        this.e = obj2;
        this.f = obj3;
    }

    public wz(Object obj, long j, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = i;
        this.e = obj2;
        this.f = obj3;
    }

    public wz(Object obj, Object obj2, int i, Object obj3, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = i;
        this.f = obj3;
        this.b = j;
    }

    public wz(Object obj, Object obj2, Serializable serializable, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = serializable;
        this.c = i;
        this.b = j;
    }
}
