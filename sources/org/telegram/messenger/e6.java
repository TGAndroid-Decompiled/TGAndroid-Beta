package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f17482a;
    public final Utilities.Callback f17483b;
    public final Uri f17484c;

    public e6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17482a = i10;
        this.f17483b = callback;
        this.f17484c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17482a) {
            case 0:
                this.f17483b.run(this.f17484c);
                return;
            default:
                this.f17483b.run(this.f17484c);
                return;
        }
    }
}
