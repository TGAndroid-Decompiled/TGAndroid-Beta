package bg;

import android.graphics.Bitmap;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.vr;
public final class c implements Runnable {
    public final int f3209a = 0;
    public final int f3210b;
    public final ArrayList f3211c;
    public final int d;
    public final Object f3212e;
    public final Object f3213f;
    public final Cloneable h;
    public final Object f3214n;
    public final Object f3215r;
    public final Object f3216s;

    public c(i iVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i7, d0[] d0VarArr, int i10, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f3212e = iVar;
        this.f3213f = atomicBoolean;
        this.h = bitmapArr;
        this.f3210b = i7;
        this.f3214n = d0VarArr;
        this.d = i10;
        this.f3215r = randomAccessFile;
        this.f3211c = arrayList;
        this.f3216s = countDownLatchArr;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bg.c.run():void");
    }

    public c(vr vrVar, int i7, ArrayList arrayList, int i10, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f3212e = vrVar;
        this.f3210b = i7;
        this.f3211c = arrayList;
        this.d = i10;
        this.f3213f = hVar;
        this.h = hVar2;
        this.f3214n = arrayList2;
        this.f3215r = arrayList3;
        this.f3216s = countDownLatch;
    }
}
