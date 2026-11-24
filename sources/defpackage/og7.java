package defpackage;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;
public final class og7 extends vw5 implements op4 {
    public final byte b;
    public final rg7 c;

    public og7(rg7 rg7Var, byte b) {
        super(0);
        this.b = b;
        this.c = rg7Var;
    }

    @Override
    public final Object invoke() {
        ParcelFileDescriptor parcelFileDescriptor;
        byte b = this.b;
        rg7 rg7Var = this.c;
        switch (b) {
            case 0:
                System.loadLibrary("datastore_shared_counter");
                String str = rg7Var.e;
                File file = new File(rg7Var.b.getAbsolutePath() + str);
                rg7.f(file);
                try {
                    parcelFileDescriptor = ParcelFileDescriptor.open(file, 939524096);
                    try {
                        int fd = parcelFileDescriptor.getFd();
                        NativeSharedCounter nativeSharedCounter = hba.b;
                        if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                            long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                            if (nativeCreateSharedCounter >= 0) {
                                hba hbaVar = new hba(nativeCreateSharedCounter);
                                parcelFileDescriptor.close();
                                return hbaVar;
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
                String str2 = rg7Var.d;
                File file2 = new File(rg7Var.b.getAbsolutePath() + str2);
                rg7.f(file2);
                return file2;
        }
    }
}
