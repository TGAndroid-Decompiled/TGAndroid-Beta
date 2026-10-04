package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f17822a;
    public final Utilities.Callback f17823b;
    public final Uri f17824c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17822a = i10;
        this.f17823b = callback;
        this.f17824c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17822a) {
            case 0:
                this.f17823b.run(this.f17824c);
                return;
            default:
                this.f17823b.run(this.f17824c);
                return;
        }
    }
}
