package bg;

import android.graphics.Bitmap;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.ur;
public final class c implements Runnable {
    public final int f3214a = 0;
    public final int f3215b;
    public final ArrayList f3216c;
    public final int d;
    public final Object f3217e;
    public final Object f3218f;
    public final Cloneable h;
    public final Object f3219n;
    public final Object f3220r;
    public final Object f3221s;

    public c(i iVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i7, e0[] e0VarArr, int i10, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f3217e = iVar;
        this.f3218f = atomicBoolean;
        this.h = bitmapArr;
        this.f3215b = i7;
        this.f3219n = e0VarArr;
        this.d = i10;
        this.f3220r = randomAccessFile;
        this.f3216c = arrayList;
        this.f3221s = countDownLatchArr;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bg.c.run():void");
    }

    public c(ur urVar, int i7, ArrayList arrayList, int i10, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f3217e = urVar;
        this.f3215b = i7;
        this.f3216c = arrayList;
        this.d = i10;
        this.f3218f = hVar;
        this.h = hVar2;
        this.f3219n = arrayList2;
        this.f3220r = arrayList3;
        this.f3221s = countDownLatch;
    }
}
