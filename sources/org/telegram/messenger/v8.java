package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v8 implements Runnable {
    public final int f18656a = 1;
    public final MediaDataController f18657b;
    public final MessagesStorage.TopicKey f18658c;
    public final TLRPC.Message d;

    public v8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f18657b = mediaDataController;
        this.f18658c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f18656a) {
            case 0:
                this.f18657b.lambda$loadBotKeyboard$196(this.d, this.f18658c);
                return;
            default:
                this.f18657b.lambda$putBotKeyboard$201(this.f18658c, this.d);
                return;
        }
    }

    public v8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f18657b = mediaDataController;
        this.d = message;
        this.f18658c = topicKey;
    }
}
