package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f17647a;
    public final Utilities.Callback f17648b;
    public final Uri f17649c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17647a = i10;
        this.f17648b = callback;
        this.f17649c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17647a) {
            case 0:
                this.f17648b.run(this.f17649c);
                return;
            default:
                this.f17648b.run(this.f17649c);
                return;
        }
    }
}
