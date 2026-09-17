package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f17534a;
    public final Utilities.Callback f17535b;
    public final Uri f17536c;

    public e6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17534a = i10;
        this.f17535b = callback;
        this.f17536c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17534a) {
            case 0:
                this.f17535b.run(this.f17536c);
                return;
            default:
                this.f17535b.run(this.f17536c);
                return;
        }
    }
}
