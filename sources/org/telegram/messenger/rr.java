package org.telegram.messenger;

import android.graphics.Bitmap;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
public final class rr implements Runnable {
    public final int f17767a = 0;
    public final int f17768b;
    public final int f17769c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f17770f;
    public final Object h;
    public final Cloneable f17771n;
    public final Object f17772r;
    public final Object f17773s;

    public rr(hs hsVar, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = hsVar;
        this.f17768b = i10;
        this.d = arrayList;
        this.f17769c = i11;
        this.f17771n = hVar;
        this.f17772r = hVar2;
        this.f17770f = arrayList2;
        this.h = arrayList3;
        this.f17773s = countDownLatch;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rr.run():void");
    }

    public rr(rf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, rf.x[] xVarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = eVar;
        this.f17770f = atomicBoolean;
        this.h = bitmapArr;
        this.f17768b = i10;
        this.f17771n = xVarArr;
        this.f17769c = i11;
        this.f17772r = randomAccessFile;
        this.d = arrayList;
        this.f17773s = countDownLatchArr;
    }
}
