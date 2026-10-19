package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f18241a;
    public final Utilities.Callback f18242b;
    public final Uri f18243c;

    public e6(Utilities.Callback callback, Uri uri, int i10) {
        this.f18241a = i10;
        this.f18242b = callback;
        this.f18243c = uri;
    }

    @Override
    public final void run() {
        switch (this.f18241a) {
            case 0:
                this.f18242b.run(this.f18243c);
                return;
            default:
                this.f18242b.run(this.f18243c);
                return;
        }
    }
}
