package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;

public final class FilePathDatabase$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final FilePathDatabase f$0;
    public final String f$1;
    public final boolean[] f$2;
    public final CountDownLatch f$3;

    public FilePathDatabase$$ExternalSyntheticLambda0(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i) {
        this.$r8$classId = i;
        this.f$0 = filePathDatabase;
        this.f$1 = str;
        this.f$2 = zArr;
        this.f$3 = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$isLocallyCreated$8(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$hasAnotherRefOnFile$4(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
