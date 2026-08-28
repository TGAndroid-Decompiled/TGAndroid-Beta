package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ui implements Runnable {
    public final int f21692a;
    public final Object f21693b;
    public final Object f21694c;
    public final Object d;
    public final Object f21695e;

    public ui(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f21692a = i9;
        this.f21693b = obj;
        this.f21694c = obj2;
        this.d = obj3;
        this.f21695e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f21692a) {
            case 0:
                ((SendMessagesHelper) this.f21693b).lambda$performSendDelayedMessage$57((TLObject) this.f21694c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f21695e);
                return;
            case 1:
                ((SendMessagesHelper) this.f21693b).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f21694c, (ArrayList) this.d, (yi) this.f21695e);
                return;
            case 2:
                ((SendMessagesHelper) this.f21693b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.d, (File) this.f21694c, (MessageObject) this.f21695e);
                return;
            case 3:
                ((TelegramMediaSession) this.f21693b).lambda$loadBrowseChildren$4((MessagesStorage) this.f21694c, (TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.f21695e);
                return;
            case 4:
                ((UnconfirmedAuthController) this.f21693b).lambda$readCache$0((ArrayList) this.f21694c, (HashSet) this.d, (ArrayList) this.f21695e);
                return;
            default:
                ((UserNameResolver) this.f21693b).lambda$resolve$0((String) this.f21695e, (TLRPC.TL_error) this.d, (TLObject) this.f21694c);
                return;
        }
    }

    public ui(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21692a = 5;
        this.f21693b = userNameResolver;
        this.f21695e = str;
        this.d = tL_error;
        this.f21694c = tLObject;
    }

    public ui(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.DelayedMessage delayedMessage, File file, MessageObject messageObject) {
        this.f21692a = 2;
        this.f21693b = sendMessagesHelper;
        this.d = delayedMessage;
        this.f21694c = file;
        this.f21695e = messageObject;
    }
}
