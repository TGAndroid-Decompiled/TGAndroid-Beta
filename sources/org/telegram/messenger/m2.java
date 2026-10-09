package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f18477a;
    public final FileLoadOperation f18478b;
    public final int f18479c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f18477a = i11;
        this.f18478b = fileLoadOperation;
        this.f18479c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18477a) {
            case 0:
                FileLoadOperation.F(this.f18478b, this.f18479c);
                return;
            case 1:
                FileLoadOperation.j(this.f18478b, this.f18479c);
                return;
            case 2:
                FileLoadOperation.y(this.f18478b, this.f18479c);
                return;
            default:
                FileLoadOperation.o(this.f18478b, this.f18479c);
                return;
        }
    }
}
