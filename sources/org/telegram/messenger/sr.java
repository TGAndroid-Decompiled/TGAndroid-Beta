package org.telegram.messenger;

import android.graphics.Bitmap;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
public final class sr implements Runnable {
    public final int f18131a = 0;
    public final int f18132b;
    public final int f18133c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f18134f;
    public final Object h;
    public final Cloneable f18135n;
    public final Object f18136r;
    public final Object f18137s;

    public sr(is isVar, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = isVar;
        this.f18132b = i10;
        this.d = arrayList;
        this.f18133c = i11;
        this.f18135n = hVar;
        this.f18136r = hVar2;
        this.f18134f = arrayList2;
        this.h = arrayList3;
        this.f18137s = countDownLatch;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sr.run():void");
    }

    public sr(rf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, rf.x[] xVarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = eVar;
        this.f18134f = atomicBoolean;
        this.h = bitmapArr;
        this.f18132b = i10;
        this.f18135n = xVarArr;
        this.f18133c = i11;
        this.f18136r = randomAccessFile;
        this.d = arrayList;
        this.f18137s = countDownLatchArr;
    }
}
