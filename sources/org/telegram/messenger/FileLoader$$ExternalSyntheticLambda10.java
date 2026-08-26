package org.telegram.messenger;

public final class FileLoader$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final FileLoader f$0;

    public FileLoader$$ExternalSyntheticLambda10(FileLoader fileLoader, int i) {
        this.$r8$classId = i;
        this.f$0 = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$18();
                break;
            case 1:
                this.f$0.lambda$cancelLoadFile$8();
                break;
            default:
                this.f$0.lambda$cancel$10();
                break;
        }
    }
}
