package org.telegram.messenger;

import java.io.BufferedInputStream;
import java.io.IOException;
import org.telegram.tgnet.SerializedData;
public abstract class mt {
    public static final long[] f24263a;

    static {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(t0.f25457b.getResources().getAssets().open("lottie_meta.bin"));
            try {
                int available = bufferedInputStream.available();
                if (available % 8 == 0) {
                    int i3 = available / 8;
                    long[] jArr = new long[i3];
                    SerializedData serializedData = new SerializedData(bufferedInputStream);
                    for (int i10 = 0; i10 < i3; i10++) {
                        jArr[i10] = serializedData.readInt64(true);
                    }
                    bufferedInputStream.close();
                    f24263a = jArr;
                    return;
                }
                throw new IllegalStateException("lottie_meta.bin has invalid size: " + available);
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new RuntimeException("Unable to load lottie_meta.bin", e10);
        } catch (RuntimeException e11) {
            if (r2.f25040a) {
                a8.e("Unable to load lottie_meta.bin", e11);
            }
            throw e11;
        }
    }
}
