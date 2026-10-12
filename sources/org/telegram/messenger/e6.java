package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f17140a;
    public final Utilities.Callback f17141b;
    public final Uri f17142c;

    public e6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17140a = i10;
        this.f17141b = callback;
        this.f17142c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17140a) {
            case 0:
                this.f17141b.run(this.f17142c);
                return;
            default:
                this.f17141b.run(this.f17142c);
                return;
        }
    }
}
