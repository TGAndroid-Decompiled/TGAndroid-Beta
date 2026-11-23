package bg;

import android.graphics.Bitmap;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.ur;
public final class c implements Runnable {
    public final int f3165a = 0;
    public final int f3166b;
    public final ArrayList f3167c;
    public final int d;
    public final Object f3168e;
    public final Object f3169f;
    public final Cloneable h;
    public final Object f3170n;
    public final Object f3171r;
    public final Object f3172s;

    public c(i iVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i7, e0[] e0VarArr, int i10, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f3168e = iVar;
        this.f3169f = atomicBoolean;
        this.h = bitmapArr;
        this.f3166b = i7;
        this.f3170n = e0VarArr;
        this.d = i10;
        this.f3171r = randomAccessFile;
        this.f3167c = arrayList;
        this.f3172s = countDownLatchArr;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bg.c.run():void");
    }

    public c(ur urVar, int i7, ArrayList arrayList, int i10, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f3168e = urVar;
        this.f3166b = i7;
        this.f3167c = arrayList;
        this.d = i10;
        this.f3169f = hVar;
        this.h = hVar2;
        this.f3170n = arrayList2;
        this.f3171r = arrayList3;
        this.f3172s = countDownLatch;
    }
}
