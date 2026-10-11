package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f19130a = 1;
    public final MediaDataController f19131b;
    public final MessagesStorage.TopicKey f19132c;
    public final TLRPC.Message d;

    public s8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19131b = mediaDataController;
        this.f19132c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19130a) {
            case 0:
                this.f19131b.lambda$loadBotKeyboard$196(this.d, this.f19132c);
                return;
            default:
                this.f19131b.lambda$putBotKeyboard$201(this.f19132c, this.d);
                return;
        }
    }

    public s8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19131b = mediaDataController;
        this.d = message;
        this.f19132c = topicKey;
    }
}
