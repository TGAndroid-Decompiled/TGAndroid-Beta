package bg;

import android.graphics.Bitmap;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.tr;
public final class c implements Runnable {
    public final int f3195a = 0;
    public final int f3196b;
    public final ArrayList f3197c;
    public final int d;
    public final Object f3198e;
    public final Object f3199f;
    public final Cloneable h;
    public final Object f3200n;
    public final Object f3201r;
    public final Object f3202s;

    public c(i iVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i7, e0[] e0VarArr, int i10, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f3198e = iVar;
        this.f3199f = atomicBoolean;
        this.h = bitmapArr;
        this.f3196b = i7;
        this.f3200n = e0VarArr;
        this.d = i10;
        this.f3201r = randomAccessFile;
        this.f3197c = arrayList;
        this.f3202s = countDownLatchArr;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bg.c.run():void");
    }

    public c(tr trVar, int i7, ArrayList arrayList, int i10, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f3198e = trVar;
        this.f3196b = i7;
        this.f3197c = arrayList;
        this.d = i10;
        this.f3199f = hVar;
        this.h = hVar2;
        this.f3200n = arrayList2;
        this.f3201r = arrayList3;
        this.f3202s = countDownLatch;
    }
}
