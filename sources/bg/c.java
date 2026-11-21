package bg;

import android.graphics.Bitmap;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.tr;
public final class c implements Runnable {
    public final int f3207a = 0;
    public final int f3208b;
    public final ArrayList f3209c;
    public final int d;
    public final Object f3210e;
    public final Object f3211f;
    public final Cloneable h;
    public final Object f3212n;
    public final Object f3213r;
    public final Object f3214s;

    public c(i iVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i7, e0[] e0VarArr, int i10, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f3210e = iVar;
        this.f3211f = atomicBoolean;
        this.h = bitmapArr;
        this.f3208b = i7;
        this.f3212n = e0VarArr;
        this.d = i10;
        this.f3213r = randomAccessFile;
        this.f3209c = arrayList;
        this.f3214s = countDownLatchArr;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bg.c.run():void");
    }

    public c(tr trVar, int i7, ArrayList arrayList, int i10, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f3210e = trVar;
        this.f3208b = i7;
        this.f3209c = arrayList;
        this.d = i10;
        this.f3211f = hVar;
        this.h = hVar2;
        this.f3212n = arrayList2;
        this.f3213r = arrayList3;
        this.f3214s = countDownLatch;
    }
}
