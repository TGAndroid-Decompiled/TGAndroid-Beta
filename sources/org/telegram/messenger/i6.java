package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f17454a;
    public final Utilities.Callback f17455b;
    public final Uri f17456c;

    public i6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17454a = i10;
        this.f17455b = callback;
        this.f17456c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17454a) {
            case 0:
                this.f17455b.run(this.f17456c);
                return;
            default:
                this.f17455b.run(this.f17456c);
                return;
        }
    }
}
