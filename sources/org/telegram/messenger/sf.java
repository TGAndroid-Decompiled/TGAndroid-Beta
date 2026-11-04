package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class sf implements RequestDelegate {
    public final int f25332a;
    public final c1 f25333b;
    public final long f25334c;
    public final long d;
    public final Object f25335e;

    public sf(c1 c1Var, Object obj, long j10, long j11, int i3) {
        this.f25332a = i3;
        this.f25333b = c1Var;
        this.f25335e = obj;
        this.f25334c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3;
        switch (this.f25332a) {
            case 0:
                li liVar = (li) this.f25333b;
                TLRPC.TL_channels_getMessages tL_channels_getMessages = (TLRPC.TL_channels_getMessages) this.f25335e;
                long j10 = this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    li.K1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        liVar.getMessagesController().M0(Long.valueOf(this.f25334c));
                        zb.X(messages_messages.messages);
                        liVar.k(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        liVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                        if (!arrayList.isEmpty()) {
                            liVar.getMessagesStorage().f24934a.c(new a4(liVar, arrayList, j10, 14));
                            return;
                        }
                        return;
                    }
                }
                liVar.getMessagesStorage().c2(j10, tL_channels_getMessages.f27039id, false, -1, 0, false, null);
                return;
            case 1:
                li liVar2 = (li) this.f25333b;
                int[] iArr = (int[]) this.f25335e;
                liVar2.getClass();
                for (int i10 = 0; i10 < 9; i10++) {
                    if (iArr[i10] < 0) {
                        iArr[i10] = 0;
                    }
                }
                boolean z10 = tLObject instanceof Vector;
                long j11 = this.f25334c;
                long j12 = this.d;
                if (z10) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.TL_messages_searchCounter tL_messages_searchCounter = (TLRPC.TL_messages_searchCounter) vector.objects.get(i11);
                        TLRPC.MessagesFilter messagesFilter = tL_messages_searchCounter.filter;
                        if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotoVideo) {
                            i3 = 0;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterDocument) {
                            i3 = 1;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterRoundVoice) {
                            i3 = 2;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterUrl) {
                            i3 = 3;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterMusic) {
                            i3 = 4;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterGif) {
                            i3 = 5;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotos) {
                            i3 = 6;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterVideo) {
                            i3 = 7;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPoll) {
                            i3 = 8;
                        }
                        int i12 = tL_messages_searchCounter.count;
                        iArr[i3] = i12;
                        liVar2.H1(j11, j12, i3, i12);
                    }
                }
                g0.h3(new zf(liVar2, j11, j12, iArr, 2));
                return;
            default:
                g0.h3(new f9((c00) this.f25333b, tLObject, (TLRPC.TL_forumTopic) this.f25335e, this.f25334c, this.d));
                return;
        }
    }

    public sf(li liVar, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f25332a = 0;
        this.f25333b = liVar;
        this.f25334c = j10;
        this.d = j11;
        this.f25335e = tL_channels_getMessages;
    }
}
