package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class c6 implements Runnable {
    public final int f18020a;
    public final Utilities.Callback f18021b;
    public final Uri f18022c;

    public c6(Utilities.Callback callback, Uri uri, int i10) {
        this.f18020a = i10;
        this.f18021b = callback;
        this.f18022c = uri;
    }

    @Override
    public final void run() {
        switch (this.f18020a) {
            case 0:
                this.f18021b.run(this.f18022c);
                return;
            default:
                this.f18021b.run(this.f18022c);
                return;
        }
    }
}
