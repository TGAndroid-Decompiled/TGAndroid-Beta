package org.telegram.messenger;

public final class FileUploadOperation$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final FileUploadOperation f$0;

    public FileUploadOperation$$ExternalSyntheticLambda1(FileUploadOperation fileUploadOperation, int i) {
        this.$r8$classId = i;
        this.f$0 = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$start$0();
                break;
            case 1:
                this.f$0.lambda$cancel$3();
                break;
            case 2:
                this.f$0.lambda$startUploadRequest$7();
                break;
            default:
                this.f$0.lambda$onNetworkChanged$2();
                break;
        }
    }
}
