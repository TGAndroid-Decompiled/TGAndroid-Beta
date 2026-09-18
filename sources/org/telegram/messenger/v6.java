package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v6 implements Runnable {
    public final int f17695a = 0;
    public final MediaDataController f17696b;
    public final TLRPC.Message f17697c;
    public final MessagesStorage.TopicKey d;

    public v6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f17696b = mediaDataController;
        this.d = topicKey;
        this.f17697c = message;
    }

    @Override
    public final void run() {
        switch (this.f17695a) {
            case 0:
                this.f17696b.lambda$putBotKeyboard$200(this.d, this.f17697c);
                return;
            default:
                this.f17696b.lambda$loadBotKeyboard$195(this.f17697c, this.d);
                return;
        }
    }

    public v6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f17696b = mediaDataController;
        this.f17697c = message;
        this.d = topicKey;
    }
}
