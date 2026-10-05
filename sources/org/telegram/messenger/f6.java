package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f17821a;
    public final Utilities.Callback f17822b;
    public final Uri f17823c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17821a = i10;
        this.f17822b = callback;
        this.f17823c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17821a) {
            case 0:
                this.f17822b.run(this.f17823c);
                return;
            default:
                this.f17822b.run(this.f17823c);
                return;
        }
    }
}
