package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class d6 implements Runnable {
    public final int f18142a;
    public final Utilities.Callback f18143b;
    public final Uri f18144c;

    public d6(Utilities.Callback callback, Uri uri, int i10) {
        this.f18142a = i10;
        this.f18143b = callback;
        this.f18144c = uri;
    }

    @Override
    public final void run() {
        switch (this.f18142a) {
            case 0:
                this.f18143b.run(this.f18144c);
                return;
            default:
                this.f18143b.run(this.f18144c);
                return;
        }
    }
}
