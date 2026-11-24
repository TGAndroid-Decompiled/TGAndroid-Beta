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
public final class e4b implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;

    public e4b(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = obj2;
    }

    private final void a() {
        b3c b3cVar = (b3c) this.d;
        long j = this.b;
        w2c w2cVar = (w2c) this.c;
        synchronized (b3cVar) {
            ArrayList arrayList = (ArrayList) b3cVar.I.get(Long.valueOf(j));
            if (arrayList != null) {
                arrayList.remove(w2cVar);
                if (arrayList.isEmpty()) {
                    b3cVar.I.remove(Long.valueOf(j));
                }
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = b3cVar.getMessagesController().i1(j);
        tL_messages_translateRichMessage.id = w2cVar.b;
        tL_messages_translateRichMessage.to_lang = b3c.D(w2cVar.d);
        int sendRequest = b3cVar.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new jb7(b3cVar, w2cVar, j, (byte) 20));
        synchronized (b3cVar) {
            w2cVar.f = sendRequest;
        }
    }

    private final void b() {
        int size;
        b3c b3cVar = (b3c) this.d;
        long j = this.b;
        v2c v2cVar = (v2c) this.c;
        synchronized (b3cVar) {
            ArrayList arrayList = (ArrayList) b3cVar.E.get(Long.valueOf(j));
            if (arrayList != null) {
                arrayList.remove(v2cVar);
                if (arrayList.isEmpty()) {
                    b3cVar.E.remove(Long.valueOf(j));
                }
            }
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.flags |= 2;
        ArrayList arrayList2 = v2cVar.c;
        int size2 = arrayList2.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            Pair pair = (Pair) obj;
            y2c y2cVar = (y2c) pair.first;
            y2c y2cVar2 = (y2c) pair.second;
            TLRPC.TL_textWithEntities tL_textWithEntities = y2cVar.a;
            if (tL_textWithEntities != null && (y2cVar2 == null || y2cVar2.a == null)) {
                tL_messages_translateText.text.add(tL_textWithEntities);
            }
            int size3 = y2cVar.b.size();
            if (y2cVar2 == null) {
                size = 0;
            } else {
                size = y2cVar2.b.size();
            }
            if (size3 != size) {
                ArrayList arrayList3 = y2cVar.b;
                int size4 = arrayList3.size();
                int i2 = 0;
                while (i2 < size4) {
                    Object obj2 = arrayList3.get(i2);
                    i2++;
                    tL_messages_translateText.text.add(((TLRPC.PollAnswer) obj2).text);
                }
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = y2cVar.c;
            if (tL_textWithEntities2 != null && (y2cVar2 == null || y2cVar2.c == null)) {
                tL_messages_translateText.text.add(tL_textWithEntities2);
            }
        }
        tL_messages_translateText.to_lang = b3c.D(v2cVar.e);
        int sendRequest = b3cVar.getConnectionsManager().sendRequest(tL_messages_translateText, new jb7(b3cVar, v2cVar, j, (byte) 19));
        synchronized (b3cVar) {
            v2cVar.h = sendRequest;
        }
    }

    @Override
    public final void run() {
        long j;
        switch (this.a) {
            case 0:
                g4b g4bVar = (g4b) this.d;
                long j2 = this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                h4b h4bVar = g4bVar.N;
                tr3 tr3Var = h4bVar.w;
                g4bVar.d = true;
                g6b g6bVar = g4bVar.c;
                if (g6bVar.w) {
                    tr3Var.b(g6bVar);
                }
                g6bVar.w = false;
                g6bVar.x = null;
                if (!g6bVar.b0) {
                    ArrayList arrayList = tr3Var.b;
                    if (!g6bVar.u && storyItem.media != null) {
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            g6b g6bVar2 = (g6b) obj;
                            if (g6bVar2.g && g6bVar2.f == storyItem.id) {
                                arrayList2.add(g6bVar2);
                            }
                        }
                        tr3Var.c(arrayList2);
                        tr3Var.e(g6bVar);
                        g6bVar.b = Utilities.b.nextLong();
                        sr3 sr3Var = new sr3(g6bVar);
                        g6bVar.g = true;
                        sr3Var.G = true;
                        g6bVar.e = j2;
                        sr3Var.I = j2;
                        int i2 = storyItem.id;
                        g6bVar.f = i2;
                        sr3Var.H = i2;
                        long j3 = storyItem.expire_date * 1000;
                        g6bVar.J = j3;
                        sr3Var.L = j3;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j4 = document.id;
                            g6bVar.H = j4;
                            sr3Var.J = j4;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j5 = photo.id;
                                g6bVar.I = j5;
                                sr3Var.K = j5;
                            }
                        }
                        arrayList.remove(g6bVar);
                        arrayList.add(0, g6bVar);
                        tr3Var.a(sr3Var);
                    }
                }
                if (!g4bVar.b) {
                    h4bVar.R = false;
                    h4bVar.S = null;
                    return;
                }
                return;
            case 1:
                ((t4b) this.d).l(this.b, (TL_stories.StoryItem) this.c);
                return;
            case 2:
                ArrayList arrayList3 = (ArrayList) this.c;
                long j6 = this.b;
                cf7 cf7Var = ((t4b) this.d).b;
                SQLiteDatabase sQLiteDatabase = cf7Var.b;
                try {
                    String join = TextUtils.join(", ", arrayList3);
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j6 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    return;
                } catch (Throwable th) {
                    cf7Var.n(th, true);
                    return;
                }
            case 3:
                long j7 = this.b;
                ((View) this.c).invalidate();
                oc7.r1(((x4b) this.d).a).N1().g0(j7, false);
                return;
            case 4:
                ((v7b) this.d).e(this.b, ((TLRPC.ChatFull) this.c).participants);
                return;
            case 5:
                qwb qwbVar = (qwb) this.d;
                long j8 = this.b;
                TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified = (TLRPC.TL_messages_savedDialogsNotModified) this.c;
                qwbVar.c.put(j8, 0);
                ArrayList l = qwbVar.l(j8);
                if (l != null) {
                    j = l.size();
                } else {
                    j = 0;
                }
                if (j >= tL_messages_savedDialogsNotModified.count) {
                    qwbVar.d.put(j8, 1);
                    qwbVar.getUserConfig().j().edit().putBoolean("topics_end_reached_" + j8, true).apply();
                }
                qwbVar.getNotificationCenter().k(324, Long.valueOf(j8), Boolean.FALSE);
                return;
            case 6:
                qwb qwbVar2 = (qwb) this.d;
                long j9 = this.b;
                TLObject tLObject = (TLObject) this.c;
                qwbVar2.n.delete(j9);
                if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
                    ArrayList<Long> arrayList4 = ((TLRPC.TL_messages_forumTopics) tLObject).top_icons;
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    qwbVar2.f.k(arrayList4, j9);
                    qwbVar2.h.put(j9, System.currentTimeMillis());
                    qwbVar2.getNotificationCenter().k(324, Long.valueOf(j9), Boolean.FALSE);
                    return;
                }
                return;
            case 7:
                qwb qwbVar3 = (qwb) this.d;
                ArrayList arrayList5 = (ArrayList) this.c;
                long j10 = this.b;
                vh6 vh6Var = qwbVar3.e;
                ArrayList arrayList6 = null;
                boolean z = false;
                for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList5.get(i3);
                    vh6 vh6Var2 = (vh6) qwbVar3.b.f(j10);
                    if (vh6Var2 != null) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) vh6Var2.f(tL_forumTopic.id);
                        if (tL_forumTopic2 != null && tL_forumTopic.top_message != -1 && tL_forumTopic.topMessage != null) {
                            vh6Var.l(qwb.p(tL_forumTopic2.top_message, j10));
                            TLRPC.Message message = tL_forumTopic.topMessage;
                            int i4 = message.id;
                            tL_forumTopic2.top_message = i4;
                            tL_forumTopic2.topMessage = message;
                            tL_forumTopic2.groupedMessages = tL_forumTopic.groupedMessages;
                            vh6Var.k(tL_forumTopic2, qwb.p(i4, j10));
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
                    qwbVar3.y(j10, true);
                }
                if (arrayList6 != null) {
                    qwbVar3.v(j10, arrayList6, null);
                    return;
                }
                return;
            case 8:
                a();
                return;
            case 9:
                b();
                return;
            case 10:
                ((VideoCapturerDevice) this.d).lambda$init$5(this.b, (String) this.c);
                return;
            case 11:
                ((VideoCapturerDevice) this.d).lambda$init$2(this.b, (Point) this.c);
                return;
            case 12:
                ((VideoFramesRewinder) this.d).lambda$new$1((ArrayList) this.c, this.b);
                return;
            case 13:
                Object obj2 = this.c;
                long j11 = this.b;
                String str = hac.a;
                h74 h74Var = ((c74) ((ydc) ((xab) this.d).c)).a;
                xa3 xa3Var = h74Var.s;
                tk U = xa3Var.U();
                xa3Var.V(U, 26, new x92(U, obj2, j11));
                if (h74Var.T == obj2) {
                    h74Var.m.e(26, new h64((byte) 7));
                    return;
                }
                return;
            default:
                xvc xvcVar = (xvc) this.d;
                wvc wvcVar = (wvc) this.c;
                long j12 = this.b;
                if (((wvc) xvcVar.c) == wvcVar) {
                    uvc uvcVar = (uvc) xvcVar.e;
                    if (uvcVar != null) {
                        gm.r(uvcVar);
                        xvcVar.e = null;
                    }
                    synchronized (bwc.y) {
                        bwc bwcVar = bwc.A;
                        if (bwcVar != null) {
                            bwcVar.q();
                            bwc.A = null;
                        }
                    }
                    xvcVar.c = null;
                    wvcVar.c.run(j12);
                    xvcVar.I();
                    return;
                }
                return;
        }
    }

    public e4b(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.c = obj2;
        this.b = j;
    }
}
