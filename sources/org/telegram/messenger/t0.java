package org.telegram.messenger;

public final class t0 implements Runnable {

    public final int f21593a;

    public final ChatObject.Call f21594b;

    public t0(ChatObject.Call call, int i10) {
        this.f21593a = i10;
        this.f21594b = call;
    }

    @Override
    public final void run() {
        switch (this.f21593a) {
            case 0:
                this.f21594b.lambda$new$0();
                break;
            case 1:
                this.f21594b.checkQueue();
                break;
            default:
                this.f21594b.lambda$createRtmpStreamParticipant$1();
                break;
        }
    }
}
