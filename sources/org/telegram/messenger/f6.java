package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f16083a;
    public final Utilities.Callback f16084b;
    public final Uri f16085c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f16083a = i10;
        this.f16084b = callback;
        this.f16085c = uri;
    }

    @Override
    public final void run() {
        switch (this.f16083a) {
            case 0:
                this.f16084b.run(this.f16085c);
                return;
            default:
                this.f16084b.run(this.f16085c);
                return;
        }
    }
}
