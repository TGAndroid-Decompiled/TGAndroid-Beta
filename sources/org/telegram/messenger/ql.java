package org.telegram.messenger;

public final class ql implements Runnable {

    public final int f21390a;

    public final VideoEncodingService f21391b;

    public ql(VideoEncodingService videoEncodingService, int i10) {
        this.f21390a = i10;
        this.f21391b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f21390a) {
            case 0:
                this.f21391b.lambda$didReceivedNotification$0();
                break;
            default:
                this.f21391b.updateNotification();
                break;
        }
    }
}
