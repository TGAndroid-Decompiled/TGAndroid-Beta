package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f17435a;
    public final Utilities.Callback f17436b;
    public final Uri f17437c;

    public i6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17435a = i10;
        this.f17436b = callback;
        this.f17437c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17435a) {
            case 0:
                this.f17436b.run(this.f17437c);
                return;
            default:
                this.f17436b.run(this.f17437c);
                return;
        }
    }
}
