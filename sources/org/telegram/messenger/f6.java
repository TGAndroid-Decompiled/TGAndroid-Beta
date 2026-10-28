package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f20051a;
    public final Utilities.Callback f20052b;
    public final Uri f20053c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f20051a = i10;
        this.f20052b = callback;
        this.f20053c = uri;
    }

    @Override
    public final void run() {
        switch (this.f20051a) {
            case 0:
                this.f20052b.run(this.f20053c);
                return;
            default:
                this.f20052b.run(this.f20053c);
                return;
        }
    }
}
