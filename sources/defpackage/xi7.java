package defpackage;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;
public final class xi7 extends az5 implements sr4 {
    public final byte b;
    public final aj7 c;

    public xi7(aj7 aj7Var, byte b) {
        super(0);
        this.b = b;
        this.c = aj7Var;
    }

    @Override
    public final Object invoke() {
        ParcelFileDescriptor parcelFileDescriptor;
        byte b = this.b;
        aj7 aj7Var = this.c;
        switch (b) {
            case 0:
                System.loadLibrary("datastore_shared_counter");
                String str = aj7Var.e;
                File file = new File(aj7Var.b.getAbsolutePath() + str);
                aj7.f(file);
                try {
                    parcelFileDescriptor = ParcelFileDescriptor.open(file, 939524096);
                    try {
                        int fd = parcelFileDescriptor.getFd();
                        NativeSharedCounter nativeSharedCounter = yea.b;
                        if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                            long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                            if (nativeCreateSharedCounter >= 0) {
                                yea yeaVar = new yea(nativeCreateSharedCounter);
                                parcelFileDescriptor.close();
                                return yeaVar;
                            }
                            throw new IOException("Failed to mmap counter file");
                        }
                        throw new IOException("Failed to truncate counter file");
                    } catch (Throwable th) {
                        th = th;
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    parcelFileDescriptor = null;
                }
            default:
                String str2 = aj7Var.d;
                File file2 = new File(aj7Var.b.getAbsolutePath() + str2);
                aj7.f(file2);
                return file2;
        }
    }
}
