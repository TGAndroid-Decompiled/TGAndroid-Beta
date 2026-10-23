package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class m3 implements Runnable {
    public final int f19002a;
    public final FilePathDatabase f19003b;
    public final String f19004c;
    public final boolean[] d;
    public final CountDownLatch e;

    public m3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f19002a = i10;
        this.f19003b = filePathDatabase;
        this.f19004c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19002a) {
            case 0:
                FilePathDatabase.g(this.f19003b, this.f19004c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f19003b, this.f19004c, this.d, this.e);
                return;
        }
    }
}
