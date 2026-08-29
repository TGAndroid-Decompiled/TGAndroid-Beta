package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bj implements Runnable {
    public final int f19833a;
    public final Object f19834b;
    public final Object f19835c;
    public final Object d;
    public final Object f19836e;

    public bj(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19833a = i10;
        this.f19834b = obj;
        this.f19835c = obj2;
        this.d = obj3;
        this.f19836e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19833a) {
            case 0:
                ((SendMessagesHelper) this.f19834b).lambda$performSendDelayedMessage$57((TLObject) this.f19835c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19836e);
                return;
            case 1:
                ((SendMessagesHelper) this.f19834b).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f19835c, (ArrayList) this.d, (fj) this.f19836e);
                return;
            case 2:
                ((SendMessagesHelper) this.f19834b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.d, (File) this.f19835c, (MessageObject) this.f19836e);
                return;
            case 3:
                ((TelegramMediaSession) this.f19834b).lambda$loadBrowseChildren$4((MessagesStorage) this.f19835c, (TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.f19836e);
                return;
            case 4:
                ((UnconfirmedAuthController) this.f19834b).lambda$readCache$0((ArrayList) this.f19835c, (HashSet) this.d, (ArrayList) this.f19836e);
                return;
            default:
                ((UserNameResolver) this.f19834b).lambda$resolve$0((String) this.f19836e, (TLRPC.TL_error) this.d, (TLObject) this.f19835c);
                return;
        }
    }

    public bj(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19833a = 5;
        this.f19834b = userNameResolver;
        this.f19836e = str;
        this.d = tL_error;
        this.f19835c = tLObject;
    }

    public bj(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.DelayedMessage delayedMessage, File file, MessageObject messageObject) {
        this.f19833a = 2;
        this.f19834b = sendMessagesHelper;
        this.d = delayedMessage;
        this.f19835c = file;
        this.f19836e = messageObject;
    }
}
