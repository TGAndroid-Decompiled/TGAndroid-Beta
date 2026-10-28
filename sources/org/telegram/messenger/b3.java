package org.telegram.messenger;
public final class b3 implements Runnable {
    public final int f19667a;
    public final FileLoader f19668b;
    public final String f19669c;

    public b3(FileLoader fileLoader, String str, int i10) {
        this.f19667a = i10;
        this.f19668b = fileLoader;
        this.f19669c = str;
    }

    @Override
    public final void run() {
        switch (this.f19667a) {
            case 0:
                FileLoader.w(this.f19668b, this.f19669c);
                return;
            case 1:
                FileLoader.a(this.f19668b, this.f19669c);
                return;
            default:
                FileLoader.u(this.f19668b, this.f19669c);
                return;
        }
    }
}
