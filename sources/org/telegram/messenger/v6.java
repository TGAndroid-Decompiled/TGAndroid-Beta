package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v6 implements Runnable {
    public final int f17514a = 0;
    public final MediaDataController f17515b;
    public final TLRPC.Message f17516c;
    public final MessagesStorage.TopicKey d;

    public v6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f17515b = mediaDataController;
        this.d = topicKey;
        this.f17516c = message;
    }

    @Override
    public final void run() {
        switch (this.f17514a) {
            case 0:
                this.f17515b.lambda$putBotKeyboard$200(this.d, this.f17516c);
                return;
            default:
                this.f17515b.lambda$loadBotKeyboard$195(this.f17516c, this.d);
                return;
        }
    }

    public v6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f17515b = mediaDataController;
        this.f17516c = message;
        this.d = topicKey;
    }
}
