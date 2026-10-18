package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f19542a;
    public final FileLoadOperation f19543b;
    public final FileLoadOperationStream f19544c;

    public t2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f19542a = i10;
        this.f19543b = fileLoadOperation;
        this.f19544c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f19542a) {
            case 0:
                this.f19543b.lambda$removeStreamListener$6(this.f19544c);
                return;
            default:
                this.f19543b.lambda$setStream$1(this.f19544c);
                return;
        }
    }
}
