package gf;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MessagesStorage;

public final class c implements Runnable {

    public final int f6945a = 0;

    public final int f6946b;

    public final ArrayList f6947c;
    public final int d;

    public final Object f6948e;

    public final Object f6949f;
    public final Cloneable h;

    public final Object f6950n;

    public final Object f6951r;

    public final Object f6952s;

    public c(h hVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, d0[] d0VarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f6948e = hVar;
        this.f6949f = atomicBoolean;
        this.h = bitmapArr;
        this.f6946b = i10;
        this.f6950n = d0VarArr;
        this.d = i11;
        this.f6951r = randomAccessFile;
        this.f6947c = arrayList;
        this.f6952s = countDownLatchArr;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f6945a) {
            case 0:
                h hVar = (h) this.f6948e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f6949f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f6946b;
                d0[] d0VarArr = (d0[]) this.f6950n;
                int i11 = this.d;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f6951r;
                ArrayList arrayList = this.f6947c;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f6952s;
                if (hVar.f6992o.get() || atomicBoolean.get()) {
                    return;
                }
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                if (Build.VERSION.SDK_INT <= 28) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                }
                bitmapArr[i10].compress(compressFormat, hVar.f6989l, d0VarArr[i10]);
                int i12 = d0VarArr[i10].f6962b;
                try {
                    synchronized (hVar.h) {
                        g gVar = new g(i11);
                        gVar.f6970c = (int) randomAccessFile.length();
                        arrayList.add(gVar);
                        randomAccessFile.write(d0VarArr[i10].f6961a, 0, i12);
                        gVar.f6969b = i12;
                        d0VarArr[i10].b();
                        break;
                    }
                } catch (IOException e9) {
                    e9.printStackTrace();
                    try {
                        randomAccessFile.close();
                        break;
                    } catch (Exception unused) {
                    } finally {
                        atomicBoolean.set(true);
                    }
                }
                countDownLatchArr[i10].countDown();
                return;
            default:
                ((MessagesStorage) this.f6948e).lambda$getWidgetDialogs$169(this.f6946b, this.f6947c, this.d, (a0.h) this.f6949f, (a0.h) this.h, (ArrayList) this.f6950n, (ArrayList) this.f6951r, (CountDownLatch) this.f6952s);
                return;
        }
    }

    public c(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f6948e = messagesStorage;
        this.f6946b = i10;
        this.f6947c = arrayList;
        this.d = i11;
        this.f6949f = hVar;
        this.h = hVar2;
        this.f6950n = arrayList2;
        this.f6951r = arrayList3;
        this.f6952s = countDownLatch;
    }
}
