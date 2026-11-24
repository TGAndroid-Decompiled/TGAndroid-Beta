package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mx8 implements Runnable {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;
    public final Object e;

    public mx8(t5b t5bVar, TLRPC.Chat chat, ad7 ad7Var, long j) {
        this.a = (byte) 14;
        this.d = t5bVar;
        this.e = chat;
        this.b = ad7Var;
        this.c = j;
    }

    private final void a() {
        pub pubVar = (pub) this.d;
        TLObject tLObject = (TLObject) this.b;
        awb awbVar = (awb) this.e;
        pubVar.getClass();
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        Object obj2 = null;
        int i = 0;
        if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
            vf6 vf6Var = new vf6();
            for (int i2 = 0; i2 < tL_messages_forumTopics.messages.size(); i2++) {
                vf6Var.k(tL_messages_forumTopics.messages.get(i2), tL_messages_forumTopics.messages.get(i2).id);
            }
            pubVar.getMessagesController().b4(tL_messages_forumTopics.users, false);
            pubVar.getMessagesController().V3(tL_messages_forumTopics.chats, false);
            ArrayList<TLRPC.TL_forumTopic> arrayList2 = tL_messages_forumTopics.topics;
            long j = this.c;
            pubVar.u(j, arrayList2, vf6Var, false, 2, -1);
            pubVar.getMessagesStorage().z1(pubVar.getConnectionsManager().getCurrentTime(), -j, (List) pubVar.a.f(j), true);
            pubVar.getMessagesStorage().g1(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
            ArrayList<TLRPC.TL_forumTopic> arrayList3 = tL_messages_forumTopics.topics;
            int size = arrayList3.size();
            int i3 = 0;
            while (i3 < size) {
                TLRPC.TL_forumTopic tL_forumTopic = arrayList3.get(i3);
                i3++;
                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                TLRPC.TL_forumTopic f = pubVar.f(j, tL_forumTopic2.id);
                if (f != null) {
                    tL_forumTopic2 = f;
                }
                arrayList.add(tL_forumTopic2);
            }
            int i4 = tL_messages_forumTopics.count;
            if (!tL_messages_forumTopics.topics.isEmpty()) {
                TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) b00.f(1, tL_messages_forumTopics.topics);
                TLRPC.Message message = (TLRPC.Message) vf6Var.f(tL_forumTopic3.top_message);
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
        awbVar.a(arrayList, obj, Integer.valueOf(i));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx8.run():void");
    }

    public mx8(Object obj, long j, TLObject tLObject, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.c = j;
        this.b = tLObject;
        this.e = obj2;
    }

    public mx8(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = j;
        this.e = obj3;
    }

    public mx8(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = j;
    }
}
