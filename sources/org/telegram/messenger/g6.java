package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f17907a;
    public final Utilities.Callback f17908b;
    public final Uri f17909c;

    public g6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17907a = i10;
        this.f17908b = callback;
        this.f17909c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17907a) {
            case 0:
                this.f17908b.run(this.f17909c);
                return;
            default:
                this.f17908b.run(this.f17909c);
                return;
        }
    }
}
