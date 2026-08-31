package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class h3 implements Runnable {
    public final int f18819a;
    public final FilePathDatabase f18820b;
    public final String f18821c;
    public final boolean[] d;
    public final CountDownLatch f18822e;

    public h3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18819a = i10;
        this.f18820b = filePathDatabase;
        this.f18821c = str;
        this.d = zArr;
        this.f18822e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18819a) {
            case 0:
                FilePathDatabase.g(this.f18820b, this.f18821c, this.d, this.f18822e);
                return;
            default:
                FilePathDatabase.e(this.f18820b, this.f18821c, this.d, this.f18822e);
                return;
        }
    }
}
