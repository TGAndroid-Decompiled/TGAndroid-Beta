package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nz8 implements Runnable {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;
    public final Object e;

    public nz8(v7b v7bVar, TLRPC.Chat chat, cf7 cf7Var, long j) {
        this.a = (byte) 14;
        this.d = v7bVar;
        this.e = chat;
        this.b = cf7Var;
        this.c = j;
    }

    private final void a() {
        qwb qwbVar = (qwb) this.d;
        TLObject tLObject = (TLObject) this.b;
        dyb dybVar = (dyb) this.e;
        qwbVar.getClass();
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        Object obj2 = null;
        int i = 0;
        if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
            vh6 vh6Var = new vh6();
            for (int i2 = 0; i2 < tL_messages_forumTopics.messages.size(); i2++) {
                vh6Var.k(tL_messages_forumTopics.messages.get(i2), tL_messages_forumTopics.messages.get(i2).id);
            }
            qwbVar.getMessagesController().d4(tL_messages_forumTopics.users, false);
            qwbVar.getMessagesController().X3(tL_messages_forumTopics.chats, false);
            ArrayList<TLRPC.TL_forumTopic> arrayList2 = tL_messages_forumTopics.topics;
            long j = this.c;
            qwbVar.u(j, arrayList2, vh6Var, false, 2, -1);
            qwbVar.getMessagesStorage().z1(qwbVar.getConnectionsManager().getCurrentTime(), -j, (List) qwbVar.a.f(j), true);
            qwbVar.getMessagesStorage().g1(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
            ArrayList<TLRPC.TL_forumTopic> arrayList3 = tL_messages_forumTopics.topics;
            int size = arrayList3.size();
            int i3 = 0;
            while (i3 < size) {
                TLRPC.TL_forumTopic tL_forumTopic = arrayList3.get(i3);
                i3++;
                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                TLRPC.TL_forumTopic f = qwbVar.f(j, tL_forumTopic2.id);
                if (f != null) {
                    tL_forumTopic2 = f;
                }
                arrayList.add(tL_forumTopic2);
            }
            int i4 = tL_messages_forumTopics.count;
            if (!tL_messages_forumTopics.topics.isEmpty()) {
                TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) b10.f(1, tL_messages_forumTopics.topics);
                TLRPC.Message message = (TLRPC.Message) vh6Var.f(tL_forumTopic3.top_message);
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
        dybVar.a(arrayList, obj, Integer.valueOf(i));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz8.run():void");
    }

    public nz8(Object obj, long j, TLObject tLObject, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.c = j;
        this.b = tLObject;
        this.e = obj2;
    }

    public nz8(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = j;
        this.e = obj3;
    }

    public nz8(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = j;
    }
}
