package org.telegram.messenger;

public final class FileLog$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final Throwable f$0;

    public FileLog$$ExternalSyntheticLambda4(int i, Throwable th) {
        this.$r8$classId = i;
        this.f$0 = th;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                FileLog.lambda$e$4(this.f$0);
                break;
            default:
                FileLog.lambda$fatal$5(this.f$0);
                break;
        }
    }
}
