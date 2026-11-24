package defpackage;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;
public final class ri7 extends vy5 implements pr4 {
    public final byte b;
    public final ui7 c;

    public ri7(ui7 ui7Var, byte b) {
        super(0);
        this.b = b;
        this.c = ui7Var;
    }

    @Override
    public final Object invoke() {
        ParcelFileDescriptor parcelFileDescriptor;
        byte b = this.b;
        ui7 ui7Var = this.c;
        switch (b) {
            case 0:
                System.loadLibrary("datastore_shared_counter");
                String str = ui7Var.e;
                File file = new File(ui7Var.b.getAbsolutePath() + str);
                ui7.f(file);
                try {
                    parcelFileDescriptor = ParcelFileDescriptor.open(file, 939524096);
                    try {
                        int fd = parcelFileDescriptor.getFd();
                        NativeSharedCounter nativeSharedCounter = hda.b;
                        if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                            long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                            if (nativeCreateSharedCounter >= 0) {
                                hda hdaVar = new hda(nativeCreateSharedCounter);
                                parcelFileDescriptor.close();
                                return hdaVar;
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
                String str2 = ui7Var.d;
                File file2 = new File(ui7Var.b.getAbsolutePath() + str2);
                ui7.f(file2);
                return file2;
        }
    }
}
