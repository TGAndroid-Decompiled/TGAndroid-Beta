package org.telegram.messenger;

public final class FileLoadOperation$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final FileLoadOperation f$0;

    public FileLoadOperation$$ExternalSyntheticLambda4(FileLoadOperation fileLoadOperation, int i) {
        this.$r8$classId = i;
        this.f$0 = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$cancelOnStage$14();
                break;
            case 1:
                this.f$0.lambda$clearOperation$26();
                break;
            case 2:
                this.f$0.lambda$start$10();
                break;
            case 3:
                this.f$0.lambda$pause$7();
                break;
            case 4:
                this.f$0.lambda$onFinishLoadingFile$18();
                break;
            default:
                this.f$0.lambda$new$6();
                break;
        }
    }
}
