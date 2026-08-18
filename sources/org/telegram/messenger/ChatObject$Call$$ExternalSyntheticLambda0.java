package org.telegram.messenger;

public final class ChatObject$Call$$ExternalSyntheticLambda0 implements Runnable {
    public final ChatObject.Call f$0;

    public ChatObject$Call$$ExternalSyntheticLambda0(ChatObject.Call call) {
        this.f$0 = call;
    }

    @Override
    public final void run() {
        this.f$0.checkQueue();
    }
}
