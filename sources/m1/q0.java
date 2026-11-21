package m1;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;
public final class q0 extends kotlin.jvm.internal.k implements rd.a {
    public final int f20435b;
    public final t0 f20436c;

    public q0(t0 t0Var, int i7) {
        super(0);
        this.f20435b = i7;
        this.f20436c = t0Var;
    }

    @Override
    public final Object invoke() {
        ParcelFileDescriptor parcelFileDescriptor;
        switch (this.f20435b) {
            case 0:
                System.loadLibrary("datastore_shared_counter");
                t0 t0Var = this.f20436c;
                String str = t0Var.f20463e;
                File file = new File(t0Var.f20461b.getAbsolutePath() + str);
                t0.f(t0Var, file);
                try {
                    parcelFileDescriptor = ParcelFileDescriptor.open(file, 939524096);
                    try {
                        int fd2 = parcelFileDescriptor.getFd();
                        NativeSharedCounter nativeSharedCounter = z0.f20502b;
                        if (nativeSharedCounter.nativeTruncateFile(fd2) == 0) {
                            long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd2);
                            if (nativeCreateSharedCounter >= 0) {
                                z0 z0Var = new z0(nativeCreateSharedCounter);
                                parcelFileDescriptor.close();
                                return z0Var;
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
                t0 t0Var2 = this.f20436c;
                String str2 = t0Var2.d;
                File file2 = new File(t0Var2.f20461b.getAbsolutePath() + str2);
                t0.f(t0Var2, file2);
                return file2;
        }
    }
}
