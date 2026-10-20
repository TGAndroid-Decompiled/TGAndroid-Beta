package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final int f19651a = 1;
    public final MediaDataController f19652b;
    public final MessagesStorage.TopicKey f19653c;
    public final TLRPC.Message d;

    public u8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19652b = mediaDataController;
        this.f19653c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19651a) {
            case 0:
                this.f19652b.lambda$loadBotKeyboard$196(this.d, this.f19653c);
                return;
            default:
                this.f19652b.lambda$putBotKeyboard$201(this.f19653c, this.d);
                return;
        }
    }

    public u8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19652b = mediaDataController;
        this.d = message;
        this.f19653c = topicKey;
    }
}
