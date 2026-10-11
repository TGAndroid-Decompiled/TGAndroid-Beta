package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f17910a;
    public final Utilities.Callback f17911b;
    public final Uri f17912c;

    public g6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17910a = i10;
        this.f17911b = callback;
        this.f17912c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17910a) {
            case 0:
                this.f17911b.run(this.f17912c);
                return;
            default:
                this.f17911b.run(this.f17912c);
                return;
        }
    }
}
