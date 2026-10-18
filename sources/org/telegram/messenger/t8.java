package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class t8 implements Runnable {
    public final int f19561a = 1;
    public final MediaDataController f19562b;
    public final MessagesStorage.TopicKey f19563c;
    public final TLRPC.Message d;

    public t8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19562b = mediaDataController;
        this.f19563c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19561a) {
            case 0:
                this.f19562b.lambda$loadBotKeyboard$196(this.d, this.f19563c);
                return;
            default:
                this.f19562b.lambda$putBotKeyboard$201(this.f19563c, this.d);
                return;
        }
    }

    public t8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19562b = mediaDataController;
        this.d = message;
        this.f19563c = topicKey;
    }
}
