package cg;

import android.graphics.Bitmap;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.qr;
public final class c implements Runnable {
    public final int f4626a = 0;
    public final int f4627b;
    public final ArrayList f4628c;
    public final int d;
    public final Object f4629e;
    public final Object f4630f;
    public final Cloneable h;
    public final Object f4631n;
    public final Object f4632r;
    public final Object f4633s;

    public c(h hVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i3, c0[] c0VarArr, int i10, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f4629e = hVar;
        this.f4630f = atomicBoolean;
        this.h = bitmapArr;
        this.f4627b = i3;
        this.f4631n = c0VarArr;
        this.d = i10;
        this.f4632r = randomAccessFile;
        this.f4628c = arrayList;
        this.f4633s = countDownLatchArr;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: cg.c.run():void");
    }

    public c(qr qrVar, int i3, ArrayList arrayList, int i10, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f4629e = qrVar;
        this.f4627b = i3;
        this.f4628c = arrayList;
        this.d = i10;
        this.f4630f = hVar;
        this.h = hVar2;
        this.f4631n = arrayList2;
        this.f4632r = arrayList3;
        this.f4633s = countDownLatch;
    }
}
