package jf;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MessagesStorage;
public final class c implements Runnable {
    public final int f11568a = 0;
    public final int f11569b;
    public final ArrayList f11570c;
    public final int d;
    public final Object f11571e;
    public final Object f11572f;
    public final Cloneable h;
    public final Object f11573n;
    public final Object f11574r;
    public final Object f11575s;

    public c(g gVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, c0[] c0VarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f11571e = gVar;
        this.f11572f = atomicBoolean;
        this.h = bitmapArr;
        this.f11569b = i10;
        this.f11573n = c0VarArr;
        this.d = i11;
        this.f11574r = randomAccessFile;
        this.f11570c = arrayList;
        this.f11575s = countDownLatchArr;
    }

    @Override
    public final void run() {
        switch (this.f11568a) {
            case 0:
                g gVar = (g) this.f11571e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f11572f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f11569b;
                c0[] c0VarArr = (c0[]) this.f11573n;
                int i11 = this.d;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f11574r;
                ArrayList arrayList = this.f11570c;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f11575s;
                if (!gVar.f11606o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, gVar.f11603l, c0VarArr[i10]);
                    int i12 = c0VarArr[i10].f11577b;
                    try {
                        synchronized (gVar.h) {
                            f fVar = new f(i11);
                            fVar.f11584c = (int) randomAccessFile.length();
                            arrayList.add(fVar);
                            randomAccessFile.write(c0VarArr[i10].f11576a, 0, i12);
                            fVar.f11583b = i12;
                            c0VarArr[i10].b();
                        }
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        try {
                            randomAccessFile.close();
                        } catch (Exception unused) {
                        } catch (Throwable th2) {
                            atomicBoolean.set(true);
                            throw th2;
                        }
                        atomicBoolean.set(true);
                    }
                    countDownLatchArr[i10].countDown();
                    return;
                }
                return;
            default:
                ((MessagesStorage) this.f11571e).lambda$getWidgetDialogs$169(this.f11569b, this.f11570c, this.d, (a0.h) this.f11572f, (a0.h) this.h, (ArrayList) this.f11573n, (ArrayList) this.f11574r, (CountDownLatch) this.f11575s);
                return;
        }
    }

    public c(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f11571e = messagesStorage;
        this.f11569b = i10;
        this.f11570c = arrayList;
        this.d = i11;
        this.f11572f = hVar;
        this.h = hVar2;
        this.f11573n = arrayList2;
        this.f11574r = arrayList3;
        this.f11575s = countDownLatch;
    }
}
