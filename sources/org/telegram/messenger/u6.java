package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class u6 implements Runnable {
    public final int f19133a = 0;
    public final MediaDataController f19134b;
    public final TLRPC.Message f19135c;
    public final MessagesStorage.TopicKey d;

    public u6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19134b = mediaDataController;
        this.d = topicKey;
        this.f19135c = message;
    }

    @Override
    public final void run() {
        switch (this.f19133a) {
            case 0:
                this.f19134b.lambda$putBotKeyboard$200(this.d, this.f19135c);
                return;
            default:
                this.f19134b.lambda$loadBotKeyboard$195(this.f19135c, this.d);
                return;
        }
    }

    public u6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19134b = mediaDataController;
        this.f19135c = message;
        this.d = topicKey;
    }
}
