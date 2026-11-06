package bg;

import android.graphics.Bitmap;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.yr;
public final class c implements Runnable {
    public final int f3251a = 0;
    public final int f3252b;
    public final ArrayList f3253c;
    public final int d;
    public final Object f3254e;
    public final Object f3255f;
    public final Cloneable h;
    public final Object f3256n;
    public final Object f3257r;
    public final Object f3258s;

    public c(i iVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i7, d0[] d0VarArr, int i10, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f3254e = iVar;
        this.f3255f = atomicBoolean;
        this.h = bitmapArr;
        this.f3252b = i7;
        this.f3256n = d0VarArr;
        this.d = i10;
        this.f3257r = randomAccessFile;
        this.f3253c = arrayList;
        this.f3258s = countDownLatchArr;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bg.c.run():void");
    }

    public c(yr yrVar, int i7, ArrayList arrayList, int i10, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f3254e = yrVar;
        this.f3252b = i7;
        this.f3253c = arrayList;
        this.d = i10;
        this.f3255f = hVar;
        this.h = hVar2;
        this.f3256n = arrayList2;
        this.f3257r = arrayList3;
        this.f3258s = countDownLatch;
    }
}
