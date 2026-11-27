package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class op6 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final long c;
    public final long d;
    public final Object e;

    public op6(ls6 ls6Var, long j, long j2, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.a = (byte) 1;
        this.b = ls6Var;
        this.c = j;
        this.d = j2;
        this.e = tL_channels_getMessages;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j;
        long j2;
        int i;
        int i2;
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ls6 ls6Var = (ls6) obj2;
                int[] iArr = (int[]) obj;
                ls6Var.getClass();
                for (int i3 = 0; i3 < 9; i3++) {
                    if (iArr[i3] < 0) {
                        iArr[i3] = 0;
                    }
                }
                boolean z = tLObject instanceof Vector;
                long j3 = this.c;
                long j4 = this.d;
                if (z) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    int i4 = 0;
                    while (i4 < size) {
                        TLRPC.TL_messages_searchCounter tL_messages_searchCounter = (TLRPC.TL_messages_searchCounter) vector.objects.get(i4);
                        TLRPC.MessagesFilter messagesFilter = tL_messages_searchCounter.filter;
                        if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotoVideo) {
                            i2 = 0;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterDocument) {
                            i2 = 1;
                        } else {
                            if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterRoundVoice) {
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
                            } else {
                                j = j3;
                                j2 = j4;
                                i4++;
                                j3 = j;
                                j4 = j2;
                            }
                            i2 = i;
                        }
                        int i5 = tL_messages_searchCounter.count;
                        iArr[i2] = i5;
                        long j5 = j3;
                        long j6 = j4;
                        ls6Var.K1(i2, i5, j5, j6);
                        j = j5;
                        j2 = j6;
                        i4++;
                        j3 = j;
                        j4 = j2;
                    }
                }
                hl.c3(new np6(ls6Var, j3, j4, iArr, (byte) 2));
                return;
            case 1:
                ls6 ls6Var2 = (ls6) obj2;
                TLRPC.TL_channels_getMessages tL_channels_getMessages = (TLRPC.TL_channels_getMessages) obj;
                long j7 = this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ls6.N1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        ls6Var2.getMessagesController().M0(Long.valueOf(this.c));
                        in5.S(messages_messages.messages);
                        ls6Var2.m(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        ls6Var2.getMessagesStorage().n1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                        if (!arrayList.isEmpty()) {
                            ls6Var2.getMessagesStorage().a.c(new cq6(ls6Var2, arrayList, j7, (byte) 1));
                            return;
                        }
                        return;
                    }
                }
                ls6Var2.getMessagesStorage().e2(j7, tL_channels_getMessages.id, false, -1, 0, false, null);
                return;
            case 2:
                wua wuaVar = (wua) obj2;
                pcc pccVar = (pcc) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    uc7.s1(wuaVar.a).Y3((TLRPC.Updates) tLObject, false);
                }
                hl.c3(new h35(wuaVar, pccVar, tL_error, tLObject, this.c, this.d));
                return;
            default:
                hl.c3(new hv4((qyb) obj2, tLObject, (TLRPC.TL_forumTopic) obj, this.c, this.d, (byte) 1));
                return;
        }
    }

    public op6(Object obj, Object obj2, long j, long j2, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = j;
        this.d = j2;
    }
}
