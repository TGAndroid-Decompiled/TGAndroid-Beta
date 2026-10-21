package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final int f19648a = 1;
    public final MediaDataController f19649b;
    public final MessagesStorage.TopicKey f19650c;
    public final TLRPC.Message d;

    public u8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19649b = mediaDataController;
        this.f19650c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19648a) {
            case 0:
                this.f19649b.lambda$loadBotKeyboard$196(this.d, this.f19650c);
                return;
            default:
                this.f19649b.lambda$putBotKeyboard$201(this.f19650c, this.d);
                return;
        }
    }

    public u8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19649b = mediaDataController;
        this.d = message;
        this.f19650c = topicKey;
    }
}
