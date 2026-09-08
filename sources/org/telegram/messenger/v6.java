package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v6 implements Runnable {
    public final int f19234a = 0;
    public final MediaDataController f19235b;
    public final TLRPC.Message f19236c;
    public final MessagesStorage.TopicKey d;

    public v6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19235b = mediaDataController;
        this.d = topicKey;
        this.f19236c = message;
    }

    @Override
    public final void run() {
        switch (this.f19234a) {
            case 0:
                this.f19235b.lambda$putBotKeyboard$200(this.d, this.f19236c);
                return;
            default:
                this.f19235b.lambda$loadBotKeyboard$195(this.f19236c, this.d);
                return;
        }
    }

    public v6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19235b = mediaDataController;
        this.f19236c = message;
        this.d = topicKey;
    }
}
