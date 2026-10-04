package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f19645a;
    public final FileLoader f19646b;
    public final String f19647c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f19645a = i10;
        this.f19646b = fileLoader;
        this.f19647c = str;
    }

    @Override
    public final void run() {
        switch (this.f19645a) {
            case 0:
                this.f19646b.lambda$cancelLoadFile$7(this.f19647c);
                return;
            case 1:
                this.f19646b.lambda$cancel$9(this.f19647c);
                return;
            default:
                this.f19646b.lambda$cancelLoadAllFiles$12(this.f19647c);
                return;
        }
    }
}
