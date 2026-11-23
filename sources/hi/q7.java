package hi;

import android.media.MediaDataSource;
import android.net.Uri;
public final class q7 extends MediaDataSource {
    public final Uri f15233a;
    public final long f15234b;
    public volatile org.telegram.messenger.r8 f15235c;
    public long d = -1;
    public volatile boolean f15236e;

    public q7(long j3, Uri uri) {
        this.f15233a = uri;
        this.f15234b = j3;
    }

    @Override
    public final void close() {
        this.f15236e = true;
        org.telegram.messenger.r8 r8Var = this.f15235c;
        if (r8Var != null) {
            try {
                r8Var.close();
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public final long getSize() {
        return this.f15234b;
    }

    @Override
    public final synchronized int readAt(long r6, byte[] r8, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: hi.q7.readAt(long, byte[], int, int):int");
    }
}
