package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f19656a;
    public final FileLoader f19657b;
    public final String f19658c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f19656a = i10;
        this.f19657b = fileLoader;
        this.f19658c = str;
    }

    @Override
    public final void run() {
        switch (this.f19656a) {
            case 0:
                this.f19657b.lambda$cancelLoadFile$7(this.f19658c);
                return;
            case 1:
                this.f19657b.lambda$cancel$9(this.f19658c);
                return;
            default:
                this.f19657b.lambda$cancelLoadAllFiles$12(this.f19658c);
                return;
        }
    }
}
