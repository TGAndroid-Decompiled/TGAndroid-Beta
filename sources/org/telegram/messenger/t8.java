package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class t8 implements Runnable {
    public final int f19564a = 1;
    public final MediaDataController f19565b;
    public final MessagesStorage.TopicKey f19566c;
    public final TLRPC.Message d;

    public t8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19565b = mediaDataController;
        this.f19566c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19564a) {
            case 0:
                this.f19565b.lambda$loadBotKeyboard$196(this.d, this.f19566c);
                return;
            default:
                this.f19565b.lambda$putBotKeyboard$201(this.f19566c, this.d);
                return;
        }
    }

    public t8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19565b = mediaDataController;
        this.d = message;
        this.f19566c = topicKey;
    }
}
