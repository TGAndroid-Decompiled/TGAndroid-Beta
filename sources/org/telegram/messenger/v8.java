package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v8 implements Runnable {
    public final int f19176a = 1;
    public final MediaDataController f19177b;
    public final MessagesStorage.TopicKey f19178c;
    public final TLRPC.Message d;

    public v8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19177b = mediaDataController;
        this.f19178c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19176a) {
            case 0:
                this.f19177b.lambda$loadBotKeyboard$196(this.d, this.f19178c);
                return;
            default:
                this.f19177b.lambda$putBotKeyboard$201(this.f19178c, this.d);
                return;
        }
    }

    public v8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19177b = mediaDataController;
        this.d = message;
        this.f19178c = topicKey;
    }
}
