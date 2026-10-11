package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f19166a = 1;
    public final MediaDataController f19167b;
    public final MessagesStorage.TopicKey f19168c;
    public final TLRPC.Message d;

    public s8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19167b = mediaDataController;
        this.f19168c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19166a) {
            case 0:
                this.f19167b.lambda$loadBotKeyboard$196(this.d, this.f19168c);
                return;
            default:
                this.f19167b.lambda$putBotKeyboard$201(this.f19168c, this.d);
                return;
        }
    }

    public s8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19167b = mediaDataController;
        this.d = message;
        this.f19168c = topicKey;
    }
}
