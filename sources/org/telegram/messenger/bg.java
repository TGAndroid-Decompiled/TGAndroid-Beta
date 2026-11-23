package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class bg implements RequestDelegate {
    public final int f23087a;
    public final c1 f23088b;
    public final long f23089c;
    public final long d;
    public final Object f23090e;

    public bg(c1 c1Var, Object obj, long j3, long j10, int i7) {
        this.f23087a = i7;
        this.f23088b = c1Var;
        this.f23090e = obj;
        this.f23089c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f23087a) {
            case 0:
                si siVar = (si) this.f23088b;
                TLRPC.TL_channels_getMessages tL_channels_getMessages = (TLRPC.TL_channels_getMessages) this.f23090e;
                long j3 = this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    si.P1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        siVar.getMessagesController().O0(Long.valueOf(this.f23089c));
                        fc.X(messages_messages.messages);
                        siVar.m(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        siVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                        if (!arrayList.isEmpty()) {
                            siVar.getMessagesStorage().f27250a.c(new d4(siVar, arrayList, j3, 14));
                            return;
                        }
                        return;
                    }
                }
                siVar.getMessagesStorage().c2(j3, tL_channels_getMessages.f28472id, false, -1, 0, false, null);
                return;
            case 1:
                si siVar2 = (si) this.f23088b;
                int[] iArr = (int[]) this.f23090e;
                siVar2.getClass();
                for (int i10 = 0; i10 < 9; i10++) {
                    if (iArr[i10] < 0) {
                        iArr[i10] = 0;
                    }
                }
                boolean z10 = tLObject instanceof Vector;
                long j10 = this.f23089c;
                long j11 = this.d;
                if (z10) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.TL_messages_searchCounter tL_messages_searchCounter = (TLRPC.TL_messages_searchCounter) vector.objects.get(i11);
                        TLRPC.MessagesFilter messagesFilter = tL_messages_searchCounter.filter;
                        if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotoVideo) {
                            i7 = 0;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterDocument) {
                            i7 = 1;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterRoundVoice) {
                            i7 = 2;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterUrl) {
                            i7 = 3;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterMusic) {
                            i7 = 4;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterGif) {
                            i7 = 5;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotos) {
                            i7 = 6;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterVideo) {
                            i7 = 7;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPoll) {
                            i7 = 8;
                        }
                        int i12 = tL_messages_searchCounter.count;
                        iArr[i7] = i12;
                        siVar2.M1(j10, j11, i7, i12);
                    }
                }
                g0.g3(new hg(siVar2, j10, j11, iArr, 2));
                return;
            default:
                g0.g3(new k9((f00) this.f23088b, tLObject, (TLRPC.TL_forumTopic) this.f23090e, this.f23089c, this.d));
                return;
        }
    }

    public bg(si siVar, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f23087a = 0;
        this.f23088b = siVar;
        this.f23089c = j3;
        this.d = j10;
        this.f23090e = tL_channels_getMessages;
    }
}
