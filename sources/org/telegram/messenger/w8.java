package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f20049a = 1;
    public final MediaDataController f20050b;
    public final MessagesStorage.TopicKey f20051c;
    public final TLRPC.Message d;

    public w8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f20050b = mediaDataController;
        this.f20051c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f20049a) {
            case 0:
                this.f20050b.lambda$loadBotKeyboard$196(this.d, this.f20051c);
                return;
            default:
                this.f20050b.lambda$putBotKeyboard$201(this.f20051c, this.d);
                return;
        }
    }

    public w8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f20050b = mediaDataController;
        this.d = message;
        this.f20051c = topicKey;
    }
}
