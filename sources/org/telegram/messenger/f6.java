package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f16349a;
    public final Utilities.Callback f16350b;
    public final Uri f16351c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f16349a = i10;
        this.f16350b = callback;
        this.f16351c = uri;
    }

    @Override
    public final void run() {
        switch (this.f16349a) {
            case 0:
                this.f16350b.run(this.f16351c);
                return;
            default:
                this.f16350b.run(this.f16351c);
                return;
        }
    }
}
