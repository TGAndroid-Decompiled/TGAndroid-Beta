package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f16091a;
    public final Utilities.Callback f16092b;
    public final Uri f16093c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f16091a = i10;
        this.f16092b = callback;
        this.f16093c = uri;
    }

    @Override
    public final void run() {
        switch (this.f16091a) {
            case 0:
                this.f16092b.run(this.f16093c);
                return;
            default:
                this.f16092b.run(this.f16093c);
                return;
        }
    }
}
