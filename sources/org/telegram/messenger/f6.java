package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f16338a;
    public final Utilities.Callback f16339b;
    public final Uri f16340c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f16338a = i10;
        this.f16339b = callback;
        this.f16340c = uri;
    }

    @Override
    public final void run() {
        switch (this.f16338a) {
            case 0:
                this.f16339b.run(this.f16340c);
                return;
            default:
                this.f16339b.run(this.f16340c);
                return;
        }
    }
}
