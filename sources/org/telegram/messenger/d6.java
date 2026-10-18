package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class d6 implements Runnable {
    public final int f18163a;
    public final Utilities.Callback f18164b;
    public final Uri f18165c;

    public d6(Utilities.Callback callback, Uri uri, int i10) {
        this.f18163a = i10;
        this.f18164b = callback;
        this.f18165c = uri;
    }

    @Override
    public final void run() {
        switch (this.f18163a) {
            case 0:
                this.f18164b.run(this.f18165c);
                return;
            default:
                this.f18164b.run(this.f18165c);
                return;
        }
    }
}
