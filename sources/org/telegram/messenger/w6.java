package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class w6 implements Runnable {

    public final int f22019a = 0;

    public final MediaDataController f22020b;

    public final TLRPC.Message f22021c;
    public final MessagesStorage.TopicKey d;

    public w6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f22020b = mediaDataController;
        this.d = topicKey;
        this.f22021c = message;
    }

    @Override
    public final void run() {
        switch (this.f22019a) {
            case 0:
                this.f22020b.lambda$putBotKeyboard$200(this.d, this.f22021c);
                break;
            default:
                this.f22020b.lambda$loadBotKeyboard$195(this.f22021c, this.d);
                break;
        }
    }

    public w6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f22020b = mediaDataController;
        this.f22021c = message;
        this.d = topicKey;
    }
}
