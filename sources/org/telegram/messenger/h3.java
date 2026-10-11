package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class h3 implements Runnable {
    public final int f18011a;
    public final FilePathDatabase f18012b;
    public final String f18013c;
    public final boolean[] d;
    public final CountDownLatch f18014e;

    public h3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18011a = i10;
        this.f18012b = filePathDatabase;
        this.f18013c = str;
        this.d = zArr;
        this.f18014e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18011a) {
            case 0:
                FilePathDatabase.g(this.f18012b, this.f18013c, this.d, this.f18014e);
                return;
            default:
                FilePathDatabase.e(this.f18012b, this.f18013c, this.d, this.f18014e);
                return;
        }
    }
}
