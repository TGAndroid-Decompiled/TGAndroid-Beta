package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f20156a;
    public final Utilities.Callback f20157b;
    public final Uri f20158c;

    public e6(Utilities.Callback callback, Uri uri, int i9) {
        this.f20156a = i9;
        this.f20157b = callback;
        this.f20158c = uri;
    }

    @Override
    public final void run() {
        switch (this.f20156a) {
            case 0:
                this.f20157b.run(this.f20158c);
                return;
            default:
                this.f20157b.run(this.f20158c);
                return;
        }
    }
}
