package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f17911a;
    public final Utilities.Callback f17912b;
    public final Uri f17913c;

    public g6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17911a = i10;
        this.f17912b = callback;
        this.f17913c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17911a) {
            case 0:
                this.f17912b.run(this.f17913c);
                return;
            default:
                this.f17912b.run(this.f17913c);
                return;
        }
    }
}
