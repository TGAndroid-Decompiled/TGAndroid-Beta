package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f18333a;
    public final Utilities.Callback f18334b;
    public final Uri f18335c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f18333a = i10;
        this.f18334b = callback;
        this.f18335c = uri;
    }

    @Override
    public final void run() {
        switch (this.f18333a) {
            case 0:
                this.f18334b.run(this.f18335c);
                return;
            default:
                this.f18334b.run(this.f18335c);
                return;
        }
    }
}
