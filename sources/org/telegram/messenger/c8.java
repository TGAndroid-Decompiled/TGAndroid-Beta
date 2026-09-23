package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f15807a;
    public final MediaDataController f15808b;
    public final boolean f15809c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f15807a = i10;
        this.f15808b = mediaDataController;
        this.f15809c = z10;
    }

    @Override
    public final void run() {
        switch (this.f15807a) {
            case 0:
                MediaDataController.S2(this.f15808b, this.f15809c);
                return;
            default:
                MediaDataController.N1(this.f15808b, this.f15809c);
                return;
        }
    }
}
