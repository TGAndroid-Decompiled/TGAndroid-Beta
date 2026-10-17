package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class d6 implements Runnable {
    public final int f18153a;
    public final Utilities.Callback f18154b;
    public final Uri f18155c;

    public d6(Utilities.Callback callback, Uri uri, int i10) {
        this.f18153a = i10;
        this.f18154b = callback;
        this.f18155c = uri;
    }

    @Override
    public final void run() {
        switch (this.f18153a) {
            case 0:
                this.f18154b.run(this.f18155c);
                return;
            default:
                this.f18154b.run(this.f18155c);
                return;
        }
    }
}
