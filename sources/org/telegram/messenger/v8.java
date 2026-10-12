package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v8 implements Runnable {
    public final int f19177a = 1;
    public final MediaDataController f19178b;
    public final MessagesStorage.TopicKey f19179c;
    public final TLRPC.Message d;

    public v8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19178b = mediaDataController;
        this.f19179c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19177a) {
            case 0:
                this.f19178b.lambda$loadBotKeyboard$196(this.d, this.f19179c);
                return;
            default:
                this.f19178b.lambda$putBotKeyboard$201(this.f19179c, this.d);
                return;
        }
    }

    public v8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19178b = mediaDataController;
        this.d = message;
        this.f19179c = topicKey;
    }
}
