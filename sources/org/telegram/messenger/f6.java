package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f16275a;
    public final Utilities.Callback f16276b;
    public final Uri f16277c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f16275a = i10;
        this.f16276b = callback;
        this.f16277c = uri;
    }

    @Override
    public final void run() {
        switch (this.f16275a) {
            case 0:
                this.f16276b.run(this.f16277c);
                return;
            default:
                this.f16276b.run(this.f16277c);
                return;
        }
    }
}
