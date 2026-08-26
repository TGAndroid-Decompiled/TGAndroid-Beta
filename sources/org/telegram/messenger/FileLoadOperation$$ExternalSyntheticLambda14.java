package org.telegram.messenger;

public final class FileLoadOperation$$ExternalSyntheticLambda14 implements Runnable {
    public final int $r8$classId;
    public final FileLoadOperation f$0;
    public final FileLoadOperationStream f$1;

    public FileLoadOperation$$ExternalSyntheticLambda14(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i) {
        this.$r8$classId = i;
        this.f$0 = fileLoadOperation;
        this.f$1 = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$removeStreamListener$5(this.f$1);
                break;
            default:
                this.f$0.lambda$setStream$0(this.f$1);
                break;
        }
    }
}
