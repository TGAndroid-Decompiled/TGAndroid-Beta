package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f19984a = 1;
    public final MediaDataController f19985b;
    public final MessagesStorage.TopicKey f19986c;
    public final TLRPC.Message d;

    public w8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19985b = mediaDataController;
        this.f19986c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19984a) {
            case 0:
                this.f19985b.lambda$loadBotKeyboard$196(this.d, this.f19986c);
                return;
            default:
                this.f19985b.lambda$putBotKeyboard$201(this.f19986c, this.d);
                return;
        }
    }

    public w8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19985b = mediaDataController;
        this.d = message;
        this.f19986c = topicKey;
    }
}
