package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class h3 implements Runnable {
    public final int f18821a;
    public final FilePathDatabase f18822b;
    public final String f18823c;
    public final boolean[] d;
    public final CountDownLatch f18824e;

    public h3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18821a = i10;
        this.f18822b = filePathDatabase;
        this.f18823c = str;
        this.d = zArr;
        this.f18824e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18821a) {
            case 0:
                FilePathDatabase.g(this.f18822b, this.f18823c, this.d, this.f18824e);
                return;
            default:
                FilePathDatabase.e(this.f18822b, this.f18823c, this.d, this.f18824e);
                return;
        }
    }
}
