package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f19124a = 1;
    public final MediaDataController f19125b;
    public final MessagesStorage.TopicKey f19126c;
    public final TLRPC.Message d;

    public s8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19125b = mediaDataController;
        this.f19126c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19124a) {
            case 0:
                this.f19125b.lambda$loadBotKeyboard$196(this.d, this.f19126c);
                return;
            default:
                this.f19125b.lambda$putBotKeyboard$201(this.f19126c, this.d);
                return;
        }
    }

    public s8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19125b = mediaDataController;
        this.d = message;
        this.f19126c = topicKey;
    }
}
