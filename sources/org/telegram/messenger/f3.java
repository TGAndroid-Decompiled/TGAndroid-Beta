package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class f3 implements Runnable {
    public final int f20238a;
    public final FilePathDatabase f20239b;
    public final String f20240c;
    public final boolean[] d;
    public final CountDownLatch f20241e;

    public f3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i9) {
        this.f20238a = i9;
        this.f20239b = filePathDatabase;
        this.f20240c = str;
        this.d = zArr;
        this.f20241e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f20238a) {
            case 0:
                FilePathDatabase.g(this.f20239b, this.f20240c, this.d, this.f20241e);
                return;
            default:
                FilePathDatabase.e(this.f20239b, this.f20240c, this.d, this.f20241e);
                return;
        }
    }
}
