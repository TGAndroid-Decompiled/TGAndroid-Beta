package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f18479a;
    public final FileLoadOperation f18480b;
    public final int f18481c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f18479a = i11;
        this.f18480b = fileLoadOperation;
        this.f18481c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18479a) {
            case 0:
                FileLoadOperation.F(this.f18480b, this.f18481c);
                return;
            case 1:
                FileLoadOperation.j(this.f18480b, this.f18481c);
                return;
            case 2:
                FileLoadOperation.y(this.f18480b, this.f18481c);
                return;
            default:
                FileLoadOperation.o(this.f18480b, this.f18481c);
                return;
        }
    }
}
