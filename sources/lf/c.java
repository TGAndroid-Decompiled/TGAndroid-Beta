package lf;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MessagesStorage;
public final class c implements Runnable {
    public final int f12404a = 0;
    public final int f12405b;
    public final ArrayList f12406c;
    public final int d;
    public final Object f12407e;
    public final Object f12408f;
    public final Cloneable h;
    public final Object f12409n;
    public final Object f12410r;
    public final Object f12411s;

    public c(g gVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, c0[] c0VarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f12407e = gVar;
        this.f12408f = atomicBoolean;
        this.h = bitmapArr;
        this.f12405b = i10;
        this.f12409n = c0VarArr;
        this.d = i11;
        this.f12410r = randomAccessFile;
        this.f12406c = arrayList;
        this.f12411s = countDownLatchArr;
    }

    @Override
    public final void run() {
        switch (this.f12404a) {
            case 0:
                g gVar = (g) this.f12407e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f12408f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f12405b;
                c0[] c0VarArr = (c0[]) this.f12409n;
                int i11 = this.d;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f12410r;
                ArrayList arrayList = this.f12406c;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f12411s;
                if (!gVar.f12442o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, gVar.f12439l, c0VarArr[i10]);
                    int i12 = c0VarArr[i10].f12413b;
                    try {
                        synchronized (gVar.h) {
                            f fVar = new f(i11);
                            fVar.f12420c = (int) randomAccessFile.length();
                            arrayList.add(fVar);
                            randomAccessFile.write(c0VarArr[i10].f12412a, 0, i12);
                            fVar.f12419b = i12;
                            c0VarArr[i10].b();
                        }
                    } catch (IOException e6) {
                        e6.printStackTrace();
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
                ((MessagesStorage) this.f12407e).lambda$getWidgetDialogs$169(this.f12405b, this.f12406c, this.d, (a0.h) this.f12408f, (a0.h) this.h, (ArrayList) this.f12409n, (ArrayList) this.f12410r, (CountDownLatch) this.f12411s);
                return;
        }
    }

    public c(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f12407e = messagesStorage;
        this.f12405b = i10;
        this.f12406c = arrayList;
        this.d = i11;
        this.f12408f = hVar;
        this.h = hVar2;
        this.f12409n = arrayList2;
        this.f12410r = arrayList3;
        this.f12411s = countDownLatch;
    }
}
