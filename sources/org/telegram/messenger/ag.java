package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class ag implements RequestDelegate {
    public final int f22983a;
    public final c1 f22984b;
    public final long f22985c;
    public final long d;
    public final Object f22986e;

    public ag(c1 c1Var, Object obj, long j3, long j10, int i7) {
        this.f22983a = i7;
        this.f22984b = c1Var;
        this.f22986e = obj;
        this.f22985c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f22983a) {
            case 0:
                ri riVar = (ri) this.f22984b;
                TLRPC.TL_channels_getMessages tL_channels_getMessages = (TLRPC.TL_channels_getMessages) this.f22986e;
                long j3 = this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ri.P1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        riVar.getMessagesController().O0(Long.valueOf(this.f22985c));
                        ec.X(messages_messages.messages);
                        riVar.m(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        riVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                        if (!arrayList.isEmpty()) {
                            riVar.getMessagesStorage().f27149a.c(new d4(riVar, arrayList, j3, 14));
                            return;
                        }
                        return;
                    }
                }
                riVar.getMessagesStorage().c2(j3, tL_channels_getMessages.f28530id, false, -1, 0, false, null);
                return;
            case 1:
                ri riVar2 = (ri) this.f22984b;
                int[] iArr = (int[]) this.f22986e;
                riVar2.getClass();
                for (int i10 = 0; i10 < 9; i10++) {
                    if (iArr[i10] < 0) {
                        iArr[i10] = 0;
                    }
                }
                boolean z10 = tLObject instanceof Vector;
                long j10 = this.f22985c;
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
                        riVar2.M1(j10, j11, i7, i12);
                    }
                }
                g0.g3(new gg(riVar2, j10, j11, iArr, 2));
                return;
            default:
                g0.g3(new j9((d00) this.f22984b, tLObject, (TLRPC.TL_forumTopic) this.f22986e, this.f22985c, this.d));
                return;
        }
    }

    public ag(ri riVar, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f22983a = 0;
        this.f22984b = riVar;
        this.f22985c = j3;
        this.d = j10;
        this.f22986e = tL_channels_getMessages;
    }
}
