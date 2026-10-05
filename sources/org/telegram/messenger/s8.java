package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f19146a = 1;
    public final MediaDataController f19147b;
    public final MessagesStorage.TopicKey f19148c;
    public final TLRPC.Message d;

    public s8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19147b = mediaDataController;
        this.f19148c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19146a) {
            case 0:
                this.f19147b.lambda$loadBotKeyboard$196(this.d, this.f19148c);
                return;
            default:
                this.f19147b.lambda$putBotKeyboard$201(this.f19148c, this.d);
                return;
        }
    }

    public s8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19147b = mediaDataController;
        this.d = message;
        this.f19148c = topicKey;
    }
}
