package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f19141a = 1;
    public final MediaDataController f19142b;
    public final MessagesStorage.TopicKey f19143c;
    public final TLRPC.Message d;

    public s8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19142b = mediaDataController;
        this.f19143c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19141a) {
            case 0:
                this.f19142b.lambda$loadBotKeyboard$196(this.d, this.f19143c);
                return;
            default:
                this.f19142b.lambda$putBotKeyboard$201(this.f19143c, this.d);
                return;
        }
    }

    public s8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19142b = mediaDataController;
        this.d = message;
        this.f19143c = topicKey;
    }
}
