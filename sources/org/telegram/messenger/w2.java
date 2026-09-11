package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f19468a;
    public final FileLoader f19469b;
    public final String f19470c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f19468a = i10;
        this.f19469b = fileLoader;
        this.f19470c = str;
    }

    @Override
    public final void run() {
        switch (this.f19468a) {
            case 0:
                this.f19469b.lambda$cancelLoadFile$7(this.f19470c);
                return;
            case 1:
                this.f19469b.lambda$cancel$9(this.f19470c);
                return;
            default:
                this.f19469b.lambda$cancelLoadAllFiles$12(this.f19470c);
                return;
        }
    }
}
