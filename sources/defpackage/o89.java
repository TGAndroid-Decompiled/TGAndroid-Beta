package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
public abstract class o89 {
    public static final long[] a;

    static {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(a.b.getResources().getAssets().open("lottie_meta.bin"));
            try {
                int available = bufferedInputStream.available();
                if (available % 8 == 0) {
                    int i = available / 8;
                    long[] jArr = new long[i];
                    SerializedData serializedData = new SerializedData(bufferedInputStream);
                    for (int i2 = 0; i2 < i; i2++) {
                        jArr[i2] = serializedData.readInt64(true);
                    }
                    bufferedInputStream.close();
                    a = jArr;
                    return;
                }
                throw new IllegalStateException("lottie_meta.bin has invalid size: " + available);
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            fyb.j("Unable to load lottie_meta.bin", e);
        } catch (RuntimeException e2) {
            if (w01.a) {
                fa4.e("Unable to load lottie_meta.bin", e2);
            }
            throw e2;
        }
    }
}
