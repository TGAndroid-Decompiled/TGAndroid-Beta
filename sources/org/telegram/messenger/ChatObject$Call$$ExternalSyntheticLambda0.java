package org.telegram.messenger;

public final class ChatObject$Call$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatObject.Call f$0;

    public ChatObject$Call$$ExternalSyntheticLambda0(ChatObject.Call call, int i) {
        this.$r8$classId = i;
        this.f$0 = call;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.checkQueue();
                break;
            case 1:
                this.f$0.lambda$createRtmpStreamParticipant$1();
                break;
            default:
                this.f$0.lambda$new$0();
                break;
        }
    }
}
