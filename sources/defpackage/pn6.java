package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class pn6 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final long c;
    public final long d;
    public final Object e;

    public pn6(hq6 hq6Var, long j, long j2, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.a = (byte) 0;
        this.b = hq6Var;
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
                hq6 hq6Var = (hq6) obj2;
                TLRPC.TL_channels_getMessages tL_channels_getMessages = (TLRPC.TL_channels_getMessages) obj;
                long j = this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    hq6.N1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        hq6Var.getMessagesController().K0(Long.valueOf(this.c));
                        fl5.S(messages_messages.messages);
                        hq6Var.m(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        hq6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                        if (!arrayList.isEmpty()) {
                            hq6Var.getMessagesStorage().a.c(new go6(hq6Var, arrayList, j, (byte) 1));
                            return;
                        }
                        return;
                    }
                }
                hq6Var.getMessagesStorage().Z1(j, tL_channels_getMessages.id, false, -1, 0, false, null);
                return;
            case 1:
                hq6 hq6Var2 = (hq6) obj2;
                int[] iArr = (int[]) obj;
                hq6Var2.getClass();
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
                        hq6Var2.K1(i, i4, j4, j5);
                        j2 = j4;
                        j3 = j5;
                    }
                }
                gl.d3(new vn6(hq6Var2, j2, j3, iArr, (byte) 2));
                return;
            case 2:
                vqa vqaVar = (vqa) obj2;
                p8c p8cVar = (p8c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    na7.q1(vqaVar.a).Q3((TLRPC.Updates) tLObject, false);
                }
                gl.d3(new d15(vqaVar, p8cVar, tL_error, tLObject, this.c, this.d));
                return;
            default:
                gl.d3(new dt4((pub) obj2, tLObject, (TLRPC.TL_forumTopic) obj, this.c, this.d, (byte) 1));
                return;
        }
    }

    public pn6(Object obj, Object obj2, long j, long j2, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = j;
        this.d = j2;
    }
}
