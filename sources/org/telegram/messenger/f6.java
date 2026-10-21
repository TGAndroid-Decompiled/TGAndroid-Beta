package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f18330a;
    public final Utilities.Callback f18331b;
    public final Uri f18332c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f18330a = i10;
        this.f18331b = callback;
        this.f18332c = uri;
    }

    @Override
    public final void run() {
        switch (this.f18330a) {
            case 0:
                this.f18331b.run(this.f18332c);
                return;
            default:
                this.f18331b.run(this.f18332c);
                return;
        }
    }
}
