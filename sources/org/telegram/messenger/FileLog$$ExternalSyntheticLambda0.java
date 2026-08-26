package org.telegram.messenger;

public final class FileLog$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId = 1;
    public final long f$0;
    public final long f$1;
    public final int f$2;
    public final String f$3;

    public FileLog$$ExternalSyntheticLambda0(int i, String str, long j, long j2) {
        this.f$2 = i;
        this.f$3 = str;
        this.f$0 = j;
        this.f$1 = j2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                FileLog.lambda$dumpUnparsedMessage$1(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
            default:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.f$2, this.f$3, this.f$0, this.f$1);
                break;
        }
    }

    public FileLog$$ExternalSyntheticLambda0(long j, long j2, int i, String str) {
        this.f$0 = j;
        this.f$1 = j2;
        this.f$2 = i;
        this.f$3 = str;
    }
}
