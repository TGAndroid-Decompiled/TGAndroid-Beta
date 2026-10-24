package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class m3 implements Runnable {
    public final int f19000a;
    public final FilePathDatabase f19001b;
    public final String f19002c;
    public final boolean[] d;
    public final CountDownLatch e;

    public m3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f19000a = i10;
        this.f19001b = filePathDatabase;
        this.f19002c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19000a) {
            case 0:
                FilePathDatabase.g(this.f19001b, this.f19002c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f19001b, this.f19002c, this.d, this.e);
                return;
        }
    }
}
