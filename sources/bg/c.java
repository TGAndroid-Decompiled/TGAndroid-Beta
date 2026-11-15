package bg;

import android.graphics.Bitmap;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.vr;
public final class c implements Runnable {
    public final int f3206a = 0;
    public final int f3207b;
    public final ArrayList f3208c;
    public final int d;
    public final Object f3209e;
    public final Object f3210f;
    public final Cloneable h;
    public final Object f3211n;
    public final Object f3212r;
    public final Object f3213s;

    public c(i iVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i7, d0[] d0VarArr, int i10, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f3209e = iVar;
        this.f3210f = atomicBoolean;
        this.h = bitmapArr;
        this.f3207b = i7;
        this.f3211n = d0VarArr;
        this.d = i10;
        this.f3212r = randomAccessFile;
        this.f3208c = arrayList;
        this.f3213s = countDownLatchArr;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bg.c.run():void");
    }

    public c(vr vrVar, int i7, ArrayList arrayList, int i10, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f3209e = vrVar;
        this.f3207b = i7;
        this.f3208c = arrayList;
        this.d = i10;
        this.f3210f = hVar;
        this.h = hVar2;
        this.f3211n = arrayList2;
        this.f3212r = arrayList3;
        this.f3213s = countDownLatch;
    }
}
