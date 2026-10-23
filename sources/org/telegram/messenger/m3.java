package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class m3 implements Runnable {
    public final int f18938a;
    public final FilePathDatabase f18939b;
    public final String f18940c;
    public final boolean[] d;
    public final CountDownLatch e;

    public m3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18938a = i10;
        this.f18939b = filePathDatabase;
        this.f18940c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18938a) {
            case 0:
                FilePathDatabase.g(this.f18939b, this.f18940c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f18939b, this.f18940c, this.d, this.e);
                return;
        }
    }
}
