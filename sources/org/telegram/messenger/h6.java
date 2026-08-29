package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f20413a;
    public final Utilities.Callback f20414b;
    public final Uri f20415c;

    public h6(Utilities.Callback callback, Uri uri, int i10) {
        this.f20413a = i10;
        this.f20414b = callback;
        this.f20415c = uri;
    }

    @Override
    public final void run() {
        switch (this.f20413a) {
            case 0:
                this.f20414b.run(this.f20415c);
                return;
            default:
                this.f20414b.run(this.f20415c);
                return;
        }
    }
}
