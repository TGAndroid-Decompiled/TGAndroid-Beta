package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f16350a;
    public final Utilities.Callback f16351b;
    public final Uri f16352c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f16350a = i10;
        this.f16351b = callback;
        this.f16352c = uri;
    }

    @Override
    public final void run() {
        switch (this.f16350a) {
            case 0:
                this.f16351b.run(this.f16352c);
                return;
            default:
                this.f16351b.run(this.f16352c);
                return;
        }
    }
}
