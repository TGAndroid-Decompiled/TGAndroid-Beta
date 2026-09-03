package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f18929a;
    public final Utilities.Callback f18930b;
    public final Uri f18931c;

    public i6(Utilities.Callback callback, Uri uri, int i10) {
        this.f18929a = i10;
        this.f18930b = callback;
        this.f18931c = uri;
    }

    @Override
    public final void run() {
        switch (this.f18929a) {
            case 0:
                this.f18930b.run(this.f18931c);
                return;
            default:
                this.f18930b.run(this.f18931c);
                return;
        }
    }
}
