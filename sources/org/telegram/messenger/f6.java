package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f16330a;
    public final Utilities.Callback f16331b;
    public final Uri f16332c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f16330a = i10;
        this.f16331b = callback;
        this.f16332c = uri;
    }

    @Override
    public final void run() {
        switch (this.f16330a) {
            case 0:
                this.f16331b.run(this.f16332c);
                return;
            default:
                this.f16331b.run(this.f16332c);
                return;
        }
    }
}
