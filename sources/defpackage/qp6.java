package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class qp6 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final long c;
    public final long d;
    public final Object e;

    public qp6(hs6 hs6Var, long j, long j2, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.a = (byte) 0;
        this.b = hs6Var;
        this.c = j;
        this.d = j2;
        this.e = tL_channels_getMessages;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hs6 hs6Var = (hs6) obj2;
                TLRPC.TL_channels_getMessages tL_channels_getMessages = (TLRPC.TL_channels_getMessages) obj;
                long j = this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    hs6.N1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        hs6Var.getMessagesController().L0(Long.valueOf(this.c));
                        fn5.S(messages_messages.messages);
                        hs6Var.m(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        hs6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                        if (!arrayList.isEmpty()) {
                            hs6Var.getMessagesStorage().a.c(new hq6(hs6Var, arrayList, j, (byte) 1));
                            return;
                        }
                        return;
                    }
                }
                hs6Var.getMessagesStorage().Z1(j, tL_channels_getMessages.id, false, -1, 0, false, null);
                return;
            case 1:
                hs6 hs6Var2 = (hs6) obj2;
                int[] iArr = (int[]) obj;
                hs6Var2.getClass();
                for (int i2 = 0; i2 < 9; i2++) {
                    if (iArr[i2] < 0) {
                        iArr[i2] = 0;
                    }
                }
                boolean z = tLObject instanceof Vector;
                long j2 = this.c;
                long j3 = this.d;
                if (z) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        TLRPC.TL_messages_searchCounter tL_messages_searchCounter = (TLRPC.TL_messages_searchCounter) vector.objects.get(i3);
                        TLRPC.MessagesFilter messagesFilter = tL_messages_searchCounter.filter;
                        if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotoVideo) {
                            i = 0;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterDocument) {
                            i = 1;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterRoundVoice) {
                            i = 2;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterUrl) {
                            i = 3;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterMusic) {
                            i = 4;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterGif) {
                            i = 5;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotos) {
                            i = 6;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterVideo) {
                            i = 7;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPoll) {
                            i = 8;
                        }
                        int i4 = tL_messages_searchCounter.count;
                        iArr[i] = i4;
                        long j4 = j2;
                        long j5 = j3;
                        hs6Var2.K1(i, i4, j4, j5);
                        j2 = j4;
                        j3 = j5;
                    }
                }
                gm.c3(new wp6(hs6Var2, j2, j3, iArr, (byte) 2));
                return;
            case 2:
                wsa wsaVar = (wsa) obj2;
                qac qacVar = (qac) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    oc7.r1(wsaVar.a).T3((TLRPC.Updates) tLObject, false);
                }
                gm.c3(new d35(wsaVar, qacVar, tL_error, tLObject, this.c, this.d));
                return;
            default:
                gm.c3(new ev4((qwb) obj2, tLObject, (TLRPC.TL_forumTopic) obj, this.c, this.d, (byte) 1));
                return;
        }
    }

    public qp6(Object obj, Object obj2, long j, long j2, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = j;
        this.d = j2;
    }
}
