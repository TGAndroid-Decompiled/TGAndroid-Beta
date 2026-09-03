package org.telegram.messenger;
public final class x2 implements Runnable {
    public final int f18927a;
    public final FileLoader f18928b;
    public final String f18929c;

    public x2(FileLoader fileLoader, String str, int i10) {
        this.f18927a = i10;
        this.f18928b = fileLoader;
        this.f18929c = str;
    }

    @Override
    public final void run() {
        switch (this.f18927a) {
            case 0:
                this.f18928b.lambda$cancelLoadFile$7(this.f18929c);
                return;
            case 1:
                this.f18928b.lambda$cancel$9(this.f18929c);
                return;
            default:
                this.f18928b.lambda$cancelLoadAllFiles$12(this.f18929c);
                return;
        }
    }
}
