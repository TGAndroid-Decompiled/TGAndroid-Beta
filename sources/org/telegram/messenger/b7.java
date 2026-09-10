package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class b7 implements Runnable {
    public final int f14760a = 0;
    public final MediaDataController f14761b;
    public final TLRPC.Message f14762c;
    public final MessagesStorage.TopicKey d;

    public b7(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f14761b = mediaDataController;
        this.d = topicKey;
        this.f14762c = message;
    }

    @Override
    public final void run() {
        switch (this.f14760a) {
            case 0:
                this.f14761b.lambda$putBotKeyboard$200(this.d, this.f14762c);
                return;
            default:
                this.f14761b.lambda$loadBotKeyboard$195(this.f14762c, this.d);
                return;
        }
    }

    public b7(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f14761b = mediaDataController;
        this.f14762c = message;
        this.d = topicKey;
    }
}
