package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f17816a;
    public final Utilities.Callback f17817b;
    public final Uri f17818c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17816a = i10;
        this.f17817b = callback;
        this.f17818c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17816a) {
            case 0:
                this.f17817b.run(this.f17818c);
                return;
            default:
                this.f17817b.run(this.f17818c);
                return;
        }
    }
}
