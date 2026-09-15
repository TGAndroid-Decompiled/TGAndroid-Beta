package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f16181a;
    public final FilePathDatabase f16182b;
    public final String f16183c;
    public final boolean[] d;
    public final CountDownLatch e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f16181a = i10;
        this.f16182b = filePathDatabase;
        this.f16183c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f16181a) {
            case 0:
                FilePathDatabase.g(this.f16182b, this.f16183c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f16182b, this.f16183c, this.d, this.e);
                return;
        }
    }
}
