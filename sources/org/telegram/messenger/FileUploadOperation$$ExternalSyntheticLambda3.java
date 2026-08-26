package org.telegram.messenger;

public final class FileUploadOperation$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final FileUploadOperation f$0;
    public final int[] f$1;

    public FileUploadOperation$$ExternalSyntheticLambda3(FileUploadOperation fileUploadOperation, int[] iArr, int i) {
        this.$r8$classId = i;
        this.f$0 = fileUploadOperation;
        this.f$1 = iArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startUploadRequest$5(this.f$1);
                break;
            default:
                this.f$0.lambda$startUploadRequest$9(this.f$1);
                break;
        }
    }
}
