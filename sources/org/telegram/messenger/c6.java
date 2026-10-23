package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class c6 implements Runnable {
    public final int f18083a;
    public final Utilities.Callback f18084b;
    public final Uri f18085c;

    public c6(Utilities.Callback callback, Uri uri, int i10) {
        this.f18083a = i10;
        this.f18084b = callback;
        this.f18085c = uri;
    }

    @Override
    public final void run() {
        switch (this.f18083a) {
            case 0:
                this.f18084b.run(this.f18085c);
                return;
            default:
                this.f18084b.run(this.f18085c);
                return;
        }
    }
}
