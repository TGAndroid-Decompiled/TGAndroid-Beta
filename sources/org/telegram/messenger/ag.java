package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class ag implements RequestDelegate {
    public final int f21430a;
    public final c1 f21431b;
    public final long f21432c;
    public final long d;
    public final Object f21433e;

    public ag(c1 c1Var, Object obj, long j3, long j10, int i7) {
        this.f21430a = i7;
        this.f21431b = c1Var;
        this.f21433e = obj;
        this.f21432c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f21430a) {
            case 0:
                ui uiVar = (ui) this.f21431b;
                TLRPC.TL_channels_getMessages tL_channels_getMessages = (TLRPC.TL_channels_getMessages) this.f21433e;
                long j3 = this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ui.K1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        uiVar.getMessagesController().M0(Long.valueOf(this.f21432c));
                        gc.X(messages_messages.messages);
                        uiVar.k(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        uiVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                        if (!arrayList.isEmpty()) {
                            uiVar.getMessagesStorage().f26719a.c(new a4(uiVar, arrayList, j3, 14));
                            return;
                        }
                        return;
                    }
                }
                uiVar.getMessagesStorage().c2(j3, tL_channels_getMessages.f26994id, false, -1, 0, false, null);
                return;
            case 1:
                ui uiVar2 = (ui) this.f21431b;
                int[] iArr = (int[]) this.f21433e;
                uiVar2.getClass();
                for (int i10 = 0; i10 < 9; i10++) {
                    if (iArr[i10] < 0) {
                        iArr[i10] = 0;
                    }
                }
                boolean z9 = tLObject instanceof Vector;
                long j10 = this.f21432c;
                long j11 = this.d;
                if (z9) {
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
                        uiVar2.H1(j10, j11, i7, i12);
                    }
                }
                g0.h3(new hg(uiVar2, j10, j11, iArr, 2));
                return;
            default:
                g0.h3(new l9((k00) this.f21431b, tLObject, (TLRPC.TL_forumTopic) this.f21433e, this.f21432c, this.d));
                return;
        }
    }

    public ag(ui uiVar, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f21430a = 0;
        this.f21431b = uiVar;
        this.f21432c = j3;
        this.d = j10;
        this.f21433e = tL_channels_getMessages;
    }
}
