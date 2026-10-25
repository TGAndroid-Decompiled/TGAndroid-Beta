package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f19967a;
    public final Utilities.Callback f19968b;
    public final Uri f19969c;

    public e6(Utilities.Callback callback, Uri uri, int i10) {
        this.f19967a = i10;
        this.f19968b = callback;
        this.f19969c = uri;
    }

    @Override
    public final void run() {
        switch (this.f19967a) {
            case 0:
                this.f19968b.run(this.f19969c);
                return;
            default:
                this.f19968b.run(this.f19969c);
                return;
        }
    }
}
