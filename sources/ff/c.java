package ff;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MessagesStorage;
public final class c implements Runnable {
    public final int f6145a = 0;
    public final int f6146b;
    public final ArrayList f6147c;
    public final int d;
    public final Object f6148e;
    public final Object f6149f;
    public final Cloneable h;
    public final Object f6150n;
    public final Object f6151r;
    public final Object f6152s;

    public c(h hVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i9, d0[] d0VarArr, int i10, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f6148e = hVar;
        this.f6149f = atomicBoolean;
        this.h = bitmapArr;
        this.f6146b = i9;
        this.f6150n = d0VarArr;
        this.d = i10;
        this.f6151r = randomAccessFile;
        this.f6147c = arrayList;
        this.f6152s = countDownLatchArr;
    }

    @Override
    public final void run() {
        switch (this.f6145a) {
            case 0:
                h hVar = (h) this.f6148e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f6149f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i9 = this.f6146b;
                d0[] d0VarArr = (d0[]) this.f6150n;
                int i10 = this.d;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f6151r;
                ArrayList arrayList = this.f6147c;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f6152s;
                if (!hVar.f6192o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i9].compress(compressFormat, hVar.f6189l, d0VarArr[i9]);
                    int i11 = d0VarArr[i9].f6162b;
                    try {
                        synchronized (hVar.h) {
                            g gVar = new g(i10);
                            gVar.f6170c = (int) randomAccessFile.length();
                            arrayList.add(gVar);
                            randomAccessFile.write(d0VarArr[i9].f6161a, 0, i11);
                            gVar.f6169b = i11;
                            d0VarArr[i9].b();
                        }
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        try {
                            randomAccessFile.close();
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            atomicBoolean.set(true);
                            throw th;
                        }
                        atomicBoolean.set(true);
                    }
                    countDownLatchArr[i9].countDown();
                    return;
                }
                return;
            default:
                ((MessagesStorage) this.f6148e).lambda$getWidgetDialogs$169(this.f6146b, this.f6147c, this.d, (a0.h) this.f6149f, (a0.h) this.h, (ArrayList) this.f6150n, (ArrayList) this.f6151r, (CountDownLatch) this.f6152s);
                return;
        }
    }

    public c(MessagesStorage messagesStorage, int i9, ArrayList arrayList, int i10, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f6148e = messagesStorage;
        this.f6146b = i9;
        this.f6147c = arrayList;
        this.d = i10;
        this.f6149f = hVar;
        this.h = hVar2;
        this.f6150n = arrayList2;
        this.f6151r = arrayList3;
        this.f6152s = countDownLatch;
    }
}
