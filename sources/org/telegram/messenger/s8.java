package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f19134a = 1;
    public final MediaDataController f19135b;
    public final MessagesStorage.TopicKey f19136c;
    public final TLRPC.Message d;

    public s8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19135b = mediaDataController;
        this.f19136c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19134a) {
            case 0:
                this.f19135b.lambda$loadBotKeyboard$196(this.d, this.f19136c);
                return;
            default:
                this.f19135b.lambda$putBotKeyboard$201(this.f19136c, this.d);
                return;
        }
    }

    public s8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19135b = mediaDataController;
        this.d = message;
        this.f19136c = topicKey;
    }
}
