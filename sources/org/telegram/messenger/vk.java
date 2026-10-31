package org.telegram.messenger;
public final class vk implements Runnable {
    public final int f18595a;
    public final boolean[] f18596b;

    public vk(int i10, boolean[] zArr) {
        this.f18595a = i10;
        this.f18596b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18595a) {
            case 0:
                this.f18596b[0] = true;
                return;
            default:
                this.f18596b[0] = true;
                return;
        }
    }
}
