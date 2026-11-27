package defpackage;

import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class j5b implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;

    public j5b(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    private final void a() {
        a5c a5cVar = (a5c) this.c;
        long j = this.b;
        v4c v4cVar = (v4c) this.d;
        synchronized (a5cVar) {
            ArrayList arrayList = (ArrayList) a5cVar.I.get(Long.valueOf(j));
            if (arrayList != null) {
                arrayList.remove(v4cVar);
                if (arrayList.isEmpty()) {
                    a5cVar.I.remove(Long.valueOf(j));
                }
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = a5cVar.getMessagesController().j1(j);
        tL_messages_translateRichMessage.id = v4cVar.b;
        tL_messages_translateRichMessage.to_lang = a5c.D(v4cVar.d);
        int sendRequest = a5cVar.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new p87(a5cVar, v4cVar, j, (byte) 21));
        synchronized (a5cVar) {
            v4cVar.f = sendRequest;
        }
    }

    private final void b() {
        int size;
        a5c a5cVar = (a5c) this.c;
        long j = this.b;
        u4c u4cVar = (u4c) this.d;
        synchronized (a5cVar) {
            ArrayList arrayList = (ArrayList) a5cVar.E.get(Long.valueOf(j));
            if (arrayList != null) {
                arrayList.remove(u4cVar);
                if (arrayList.isEmpty()) {
                    a5cVar.E.remove(Long.valueOf(j));
                }
            }
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.flags |= 2;
        ArrayList arrayList2 = u4cVar.c;
        int size2 = arrayList2.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            Pair pair = (Pair) obj;
            x4c x4cVar = (x4c) pair.first;
            x4c x4cVar2 = (x4c) pair.second;
            TLRPC.TL_textWithEntities tL_textWithEntities = x4cVar.a;
            if (tL_textWithEntities != null && (x4cVar2 == null || x4cVar2.a == null)) {
                tL_messages_translateText.text.add(tL_textWithEntities);
            }
            int size3 = x4cVar.b.size();
            if (x4cVar2 == null) {
                size = 0;
            } else {
                size = x4cVar2.b.size();
            }
            if (size3 != size) {
                ArrayList arrayList3 = x4cVar.b;
                int size4 = arrayList3.size();
                int i2 = 0;
                while (i2 < size4) {
                    Object obj2 = arrayList3.get(i2);
                    i2++;
                    tL_messages_translateText.text.add(((TLRPC.PollAnswer) obj2).text);
                }
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = x4cVar.c;
            if (tL_textWithEntities2 != null && (x4cVar2 == null || x4cVar2.c == null)) {
                tL_messages_translateText.text.add(tL_textWithEntities2);
            }
        }
        tL_messages_translateText.to_lang = a5c.D(u4cVar.e);
        int sendRequest = a5cVar.getConnectionsManager().sendRequest(tL_messages_translateText, new p87(a5cVar, u4cVar, j, (byte) 20));
        synchronized (a5cVar) {
            u4cVar.h = sendRequest;
        }
    }

    @Override
    public final void run() {
        long j;
        switch (this.a) {
            case 0:
                c6b c6bVar = (c6b) this.c;
                long j2 = this.b;
                TLObject tLObject = (TLObject) this.d;
                int i = c6bVar.a;
                c6bVar.C.remove(Long.valueOf(j2));
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    uc7.s1(i).j4(tL_stories_peerStories.users, false);
                    TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j2));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    c6bVar.i.k(wf3.n(peerStories.peer), peerStories);
                    if (X1 != null && (c6bVar.N(X1) || X1.self)) {
                        c6bVar.f(peerStories);
                        o6b o6bVar = c6bVar.k;
                        o6bVar.b.a.c(new n6b(o6bVar, peerStories, (byte) 1));
                    }
                    StringBuilder o = ik8.o(j2, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    o.append(tL_stories_peerStories.stories.stories.size());
                    cc4.b(o.toString());
                    jn7.f(i).k(328, new Object[0]);
                    return;
                }
                return;
            case 1:
                b6b b6bVar = (b6b) this.c;
                long j3 = this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                c6b c6bVar2 = b6bVar.N;
                ar3 ar3Var = c6bVar2.w;
                b6bVar.d = true;
                c8b c8bVar = b6bVar.c;
                if (c8bVar.w) {
                    ar3Var.b(c8bVar);
                }
                c8bVar.w = false;
                c8bVar.x = null;
                if (!c8bVar.b0) {
                    ArrayList arrayList = ar3Var.b;
                    if (!c8bVar.u && storyItem.media != null) {
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            c8b c8bVar2 = (c8b) obj;
                            if (c8bVar2.g && c8bVar2.f == storyItem.id) {
                                arrayList2.add(c8bVar2);
                            }
                        }
                        ar3Var.c(arrayList2);
                        ar3Var.e(c8bVar);
                        c8bVar.b = Utilities.b.nextLong();
                        zq3 zq3Var = new zq3(c8bVar);
                        c8bVar.g = true;
                        zq3Var.G = true;
                        c8bVar.e = j3;
                        zq3Var.I = j3;
                        int i3 = storyItem.id;
                        c8bVar.f = i3;
                        zq3Var.H = i3;
                        long j4 = storyItem.expire_date * 1000;
                        c8bVar.J = j4;
                        zq3Var.L = j4;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j5 = document.id;
                            c8bVar.H = j5;
                            zq3Var.J = j5;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j6 = photo.id;
                                c8bVar.I = j6;
                                zq3Var.K = j6;
                            }
                        }
                        arrayList.remove(c8bVar);
                        arrayList.add(0, c8bVar);
                        ar3Var.a(zq3Var);
                    }
                }
                if (!b6bVar.b) {
                    c6bVar2.R = false;
                    c6bVar2.S = null;
                    return;
                }
                return;
            case 2:
                ((o6b) this.c).l(this.b, (TL_stories.StoryItem) this.d);
                return;
            case 3:
                ArrayList arrayList3 = (ArrayList) this.d;
                long j7 = this.b;
                kf7 kf7Var = ((o6b) this.c).b;
                SQLiteDatabase sQLiteDatabase = kf7Var.b;
                try {
                    String join = TextUtils.join(", ", arrayList3);
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j7 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    return;
                } catch (Throwable th) {
                    kf7Var.p(th, true);
                    return;
                }
            case 4:
                long j8 = this.b;
                ((View) this.d).invalidate();
                uc7.s1(((s6b) this.c).a).O1().g0(j8, false);
                return;
            case 5:
                ((r9b) this.c).e(this.b, ((TLRPC.ChatFull) this.d).participants);
                return;
            case 6:
                qyb qybVar = (qyb) this.c;
                long j9 = this.b;
                TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified = (TLRPC.TL_messages_savedDialogsNotModified) this.d;
                qybVar.c.put(j9, 0);
                ArrayList l = qybVar.l(j9);
                if (l != null) {
                    j = l.size();
                } else {
                    j = 0;
                }
                if (j >= tL_messages_savedDialogsNotModified.count) {
                    qybVar.d.put(j9, 1);
                    qybVar.getUserConfig().j().edit().putBoolean("topics_end_reached_" + j9, true).apply();
                }
                qybVar.getNotificationCenter().k(323, Long.valueOf(j9), Boolean.FALSE);
                return;
            case 7:
                qyb qybVar2 = (qyb) this.c;
                long j10 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                qybVar2.n.delete(j10);
                if (tLObject2 instanceof TLRPC.TL_messages_forumTopics) {
                    ArrayList<Long> arrayList4 = ((TLRPC.TL_messages_forumTopics) tLObject2).top_icons;
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    qybVar2.f.k(j10, arrayList4);
                    qybVar2.h.put(j10, System.currentTimeMillis());
                    qybVar2.getNotificationCenter().k(323, Long.valueOf(j10), Boolean.FALSE);
                    return;
                }
                return;
            case 8:
                qyb qybVar3 = (qyb) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                long j11 = this.b;
                zh6 zh6Var = qybVar3.e;
                ArrayList arrayList6 = null;
                boolean z = false;
                for (int i4 = 0; i4 < arrayList5.size(); i4++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList5.get(i4);
                    zh6 zh6Var2 = (zh6) qybVar3.b.f(j11);
                    if (zh6Var2 != null) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) zh6Var2.f(tL_forumTopic.id);
                        if (tL_forumTopic2 != null && tL_forumTopic.top_message != -1 && tL_forumTopic.topMessage != null) {
                            zh6Var.l(qyb.p(tL_forumTopic2.top_message, j11));
                            TLRPC.Message message = tL_forumTopic.topMessage;
                            int i5 = message.id;
                            tL_forumTopic2.top_message = i5;
                            tL_forumTopic2.topMessage = message;
                            tL_forumTopic2.groupedMessages = tL_forumTopic.groupedMessages;
                            zh6Var.k(qyb.p(i5, j11), tL_forumTopic2);
                            z = true;
                        } else if (tL_forumTopic.top_message == -1 || tL_forumTopic.topMessage == null) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(tL_forumTopic);
                        }
                    }
                }
                if (z) {
                    qybVar3.y(j11, true);
                }
                if (arrayList6 != null) {
                    qybVar3.v(j11, arrayList6, null);
                    return;
                }
                return;
            case 9:
                a();
                return;
            case 10:
                b();
                return;
            case 11:
                ((VideoCapturerDevice) this.c).lambda$init$5(this.b, (String) this.d);
                return;
            case 12:
                ((VideoCapturerDevice) this.c).lambda$init$2(this.b, (Point) this.d);
                return;
            case 13:
                ((VideoFramesRewinder) this.c).lambda$new$1((ArrayList) this.d, this.b);
                return;
            case 14:
                Object obj2 = this.d;
                long j12 = this.b;
                String str = gcc.a;
                s64 s64Var = ((n64) ((vfc) ((k7b) this.c).c)).a;
                ea3 ea3Var = s64Var.s;
                uj U = ea3Var.U();
                ea3Var.V(U, 26, new q72(U, obj2, j12));
                if (s64Var.T == obj2) {
                    s64Var.m.e(26, new su3((byte) 17));
                    return;
                }
                return;
            default:
                lyc lycVar = (lyc) this.c;
                kyc kycVar = (kyc) this.d;
                long j13 = this.b;
                if (((kyc) lycVar.c) == kycVar) {
                    iyc iycVar = (iyc) lycVar.e;
                    if (iycVar != null) {
                        hl.r(iycVar);
                        lycVar.e = null;
                    }
                    synchronized (pyc.y) {
                        pyc pycVar = pyc.A;
                        if (pycVar != null) {
                            pycVar.q();
                            pyc.A = null;
                        }
                    }
                    lycVar.c = null;
                    kycVar.c.run(j13);
                    lycVar.L();
                    return;
                }
                return;
        }
    }

    public j5b(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
