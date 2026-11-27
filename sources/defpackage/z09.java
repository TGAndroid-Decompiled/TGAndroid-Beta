package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z09 implements Runnable {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;
    public final Object e;

    public z09(r9b r9bVar, TLRPC.Chat chat, kf7 kf7Var, long j) {
        this.a = (byte) 14;
        this.d = r9bVar;
        this.e = chat;
        this.b = kf7Var;
        this.c = j;
    }

    private final void a() {
        qyb qybVar = (qyb) this.d;
        TLObject tLObject = (TLObject) this.b;
        d0c d0cVar = (d0c) this.e;
        qybVar.getClass();
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        Object obj2 = null;
        int i = 0;
        if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
            zh6 zh6Var = new zh6();
            for (int i2 = 0; i2 < tL_messages_forumTopics.messages.size(); i2++) {
                zh6Var.k(tL_messages_forumTopics.messages.get(i2).id, tL_messages_forumTopics.messages.get(i2));
            }
            qybVar.getMessagesController().j4(tL_messages_forumTopics.users, false);
            qybVar.getMessagesController().c4(tL_messages_forumTopics.chats, false);
            ArrayList<TLRPC.TL_forumTopic> arrayList2 = tL_messages_forumTopics.topics;
            long j = this.c;
            qybVar.u(j, arrayList2, zh6Var, false, 2, -1);
            qybVar.getMessagesStorage().D1(qybVar.getConnectionsManager().getCurrentTime(), -j, (List) qybVar.a.f(j), true);
            qybVar.getMessagesStorage().k1(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
            ArrayList<TLRPC.TL_forumTopic> arrayList3 = tL_messages_forumTopics.topics;
            int size = arrayList3.size();
            int i3 = 0;
            while (i3 < size) {
                TLRPC.TL_forumTopic tL_forumTopic = arrayList3.get(i3);
                i3++;
                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                TLRPC.TL_forumTopic f = qybVar.f(j, tL_forumTopic2.id);
                if (f != null) {
                    tL_forumTopic2 = f;
                }
                arrayList.add(tL_forumTopic2);
            }
            int i4 = tL_messages_forumTopics.count;
            if (!tL_messages_forumTopics.topics.isEmpty()) {
                TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) c00.g(1, tL_messages_forumTopics.topics);
                TLRPC.Message message = (TLRPC.Message) zh6Var.f(tL_forumTopic3.top_message);
                ?? obj3 = new Object();
                if (tL_messages_forumTopics.order_by_create_date) {
                    i = tL_forumTopic3.date;
                } else if (message != null) {
                    i = message.date;
                }
                obj3.a = i;
                obj3.b = tL_forumTopic3.top_message;
                obj3.c = tL_forumTopic3.id;
                obj2 = obj3;
            }
            i = i4;
            obj = obj2;
        }
        d0cVar.a(arrayList, obj, Integer.valueOf(i));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z09.run():void");
    }

    public z09(Object obj, long j, TLObject tLObject, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.c = j;
        this.b = tLObject;
        this.e = obj2;
    }

    public z09(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = j;
        this.e = obj3;
    }

    public z09(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = j;
    }
}
