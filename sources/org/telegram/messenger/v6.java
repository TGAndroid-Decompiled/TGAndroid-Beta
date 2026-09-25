package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v6 implements Runnable {
    public final int f17738a = 0;
    public final MediaDataController f17739b;
    public final TLRPC.Message f17740c;
    public final MessagesStorage.TopicKey d;

    public v6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f17739b = mediaDataController;
        this.d = topicKey;
        this.f17740c = message;
    }

    @Override
    public final void run() {
        switch (this.f17738a) {
            case 0:
                this.f17739b.lambda$putBotKeyboard$200(this.d, this.f17740c);
                return;
            default:
                this.f17739b.lambda$loadBotKeyboard$195(this.f17740c, this.d);
                return;
        }
    }

    public v6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f17739b = mediaDataController;
        this.f17740c = message;
        this.d = topicKey;
    }
}
