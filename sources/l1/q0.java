package l1;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;
public final class q0 extends kotlin.jvm.internal.k implements od.a {
    public final int f17609b;
    public final t0 f17610c;

    public q0(t0 t0Var, int i3) {
        super(0);
        this.f17609b = i3;
        this.f17610c = t0Var;
    }

    @Override
    public final Object invoke() {
        ParcelFileDescriptor parcelFileDescriptor;
        switch (this.f17609b) {
            case 0:
                System.loadLibrary("datastore_shared_counter");
                t0 t0Var = this.f17610c;
                String str = t0Var.f17637e;
                File file = new File(t0Var.f17635b.getAbsolutePath() + str);
                t0.f(t0Var, file);
                try {
                    parcelFileDescriptor = ParcelFileDescriptor.open(file, 939524096);
                    try {
                        int fd2 = parcelFileDescriptor.getFd();
                        NativeSharedCounter nativeSharedCounter = a1.f17488b;
                        if (nativeSharedCounter.nativeTruncateFile(fd2) == 0) {
                            long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd2);
                            if (nativeCreateSharedCounter >= 0) {
                                a1 a1Var = new a1(nativeCreateSharedCounter);
                                parcelFileDescriptor.close();
                                return a1Var;
                            }
                            throw new IOException("Failed to mmap counter file");
                        }
                        throw new IOException("Failed to truncate counter file");
                    } catch (Throwable th2) {
                        th = th2;
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptor = null;
                }
            default:
                t0 t0Var2 = this.f17610c;
                String str2 = t0Var2.d;
                File file2 = new File(t0Var2.f17635b.getAbsolutePath() + str2);
                t0.f(t0Var2, file2);
                return file2;
        }
    }
}
