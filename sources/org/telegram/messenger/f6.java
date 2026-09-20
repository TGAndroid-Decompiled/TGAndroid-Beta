package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f16315a;
    public final Utilities.Callback f16316b;
    public final Uri f16317c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f16315a = i10;
        this.f16316b = callback;
        this.f16317c = uri;
    }

    @Override
    public final void run() {
        switch (this.f16315a) {
            case 0:
                this.f16316b.run(this.f16317c);
                return;
            default:
                this.f16316b.run(this.f16317c);
                return;
        }
    }
}
