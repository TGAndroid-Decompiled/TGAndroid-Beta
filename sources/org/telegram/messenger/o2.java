package org.telegram.messenger;

public final class o2 implements Runnable {

    public final int f21121a;

    public final FileLoadOperation.RequestInfo f21122b;

    public o2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f21121a = i10;
        this.f21122b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f21121a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$25(this.f21122b);
                break;
            default:
                FileLoadOperation.lambda$cancelRequests$16(this.f21122b);
                break;
        }
    }
}
