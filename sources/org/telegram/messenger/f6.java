package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f16326a;
    public final Utilities.Callback f16327b;
    public final Uri f16328c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f16326a = i10;
        this.f16327b = callback;
        this.f16328c = uri;
    }

    @Override
    public final void run() {
        switch (this.f16326a) {
            case 0:
                this.f16327b.run(this.f16328c);
                return;
            default:
                this.f16327b.run(this.f16328c);
                return;
        }
    }
}
