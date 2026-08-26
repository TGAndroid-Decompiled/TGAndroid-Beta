package org.telegram.messenger;

public final class FileLoader$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final FileLoader f$0;
    public final String f$1;

    public FileLoader$$ExternalSyntheticLambda8(FileLoader fileLoader, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = fileLoader;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$cancelLoadAllFiles$12(this.f$1);
                break;
            case 1:
                this.f$0.lambda$cancelLoadFile$7(this.f$1);
                break;
            default:
                this.f$0.lambda$cancel$9(this.f$1);
                break;
        }
    }
}
