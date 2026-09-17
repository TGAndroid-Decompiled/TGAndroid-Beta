package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class u6 implements Runnable {
    public final int f19160a = 0;
    public final MediaDataController f19161b;
    public final TLRPC.Message f19162c;
    public final MessagesStorage.TopicKey d;

    public u6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19161b = mediaDataController;
        this.d = topicKey;
        this.f19162c = message;
    }

    @Override
    public final void run() {
        switch (this.f19160a) {
            case 0:
                this.f19161b.lambda$putBotKeyboard$200(this.d, this.f19162c);
                return;
            default:
                this.f19161b.lambda$loadBotKeyboard$195(this.f19162c, this.d);
                return;
        }
    }

    public u6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19161b = mediaDataController;
        this.f19162c = message;
        this.d = topicKey;
    }
}
