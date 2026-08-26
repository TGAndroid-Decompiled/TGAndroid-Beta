package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public abstract class MessagesController$DialogFilter$$ExternalSyntheticOutline0 {
    public static TLRPC.EncryptedChat m(MessagesController messagesController, long j) {
        return messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)));
    }
}
