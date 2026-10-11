package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class h3 implements Runnable {
    public final int f18047a;
    public final FilePathDatabase f18048b;
    public final String f18049c;
    public final boolean[] d;
    public final CountDownLatch f18050e;

    public h3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18047a = i10;
        this.f18048b = filePathDatabase;
        this.f18049c = str;
        this.d = zArr;
        this.f18050e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18047a) {
            case 0:
                FilePathDatabase.g(this.f18048b, this.f18049c, this.d, this.f18050e);
                return;
            default:
                FilePathDatabase.e(this.f18048b, this.f18049c, this.d, this.f18050e);
                return;
        }
    }
}
