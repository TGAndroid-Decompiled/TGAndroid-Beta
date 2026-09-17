package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f17561a;
    public final Utilities.Callback f17562b;
    public final Uri f17563c;

    public e6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17561a = i10;
        this.f17562b = callback;
        this.f17563c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17561a) {
            case 0:
                this.f17562b.run(this.f17563c);
                return;
            default:
                this.f17562b.run(this.f17563c);
                return;
        }
    }
}
