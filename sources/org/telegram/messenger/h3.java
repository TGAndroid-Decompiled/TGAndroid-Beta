package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class h3 implements Runnable {
    public final int f18009a;
    public final FilePathDatabase f18010b;
    public final String f18011c;
    public final boolean[] d;
    public final CountDownLatch f18012e;

    public h3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18009a = i10;
        this.f18010b = filePathDatabase;
        this.f18011c = str;
        this.d = zArr;
        this.f18012e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18009a) {
            case 0:
                FilePathDatabase.g(this.f18010b, this.f18011c, this.d, this.f18012e);
                return;
            default:
                FilePathDatabase.e(this.f18010b, this.f18011c, this.d, this.f18012e);
                return;
        }
    }
}
