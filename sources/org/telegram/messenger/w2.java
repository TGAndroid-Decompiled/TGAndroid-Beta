package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f19660a;
    public final FileLoader f19661b;
    public final String f19662c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f19660a = i10;
        this.f19661b = fileLoader;
        this.f19662c = str;
    }

    @Override
    public final void run() {
        switch (this.f19660a) {
            case 0:
                this.f19661b.lambda$cancelLoadFile$7(this.f19662c);
                return;
            case 1:
                this.f19661b.lambda$cancel$9(this.f19662c);
                return;
            default:
                this.f19661b.lambda$cancelLoadAllFiles$12(this.f19662c);
                return;
        }
    }
}
