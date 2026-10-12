package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f17483a;
    public final Utilities.Callback f17484b;
    public final Uri f17485c;

    public e6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17483a = i10;
        this.f17484b = callback;
        this.f17485c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17483a) {
            case 0:
                this.f17484b.run(this.f17485c);
                return;
            default:
                this.f17484b.run(this.f17485c);
                return;
        }
    }
}
