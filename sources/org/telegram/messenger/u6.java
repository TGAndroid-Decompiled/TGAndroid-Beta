package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class u6 implements Runnable {
    public final int f21628a = 0;
    public final MediaDataController f21629b;
    public final TLRPC.Message f21630c;
    public final MessagesStorage.TopicKey d;

    public u6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f21629b = mediaDataController;
        this.d = topicKey;
        this.f21630c = message;
    }

    @Override
    public final void run() {
        switch (this.f21628a) {
            case 0:
                this.f21629b.lambda$putBotKeyboard$200(this.d, this.f21630c);
                return;
            default:
                this.f21629b.lambda$loadBotKeyboard$195(this.f21630c, this.d);
                return;
        }
    }

    public u6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f21629b = mediaDataController;
        this.f21630c = message;
        this.d = topicKey;
    }
}
