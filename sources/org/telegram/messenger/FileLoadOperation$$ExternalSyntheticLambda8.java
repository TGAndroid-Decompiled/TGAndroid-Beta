package org.telegram.messenger;

public final class FileLoadOperation$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final FileLoadOperation.RequestInfo f$0;

    public FileLoadOperation$$ExternalSyntheticLambda8(FileLoadOperation.RequestInfo requestInfo, int i) {
        this.$r8$classId = i;
        this.f$0 = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                FileLoadOperation.lambda$cancelRequests$16(this.f$0);
                break;
            default:
                FileLoadOperation.lambda$clearOperation$25(this.f$0);
                break;
        }
    }
}
