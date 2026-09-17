package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f16106a;
    public final Utilities.Callback f16107b;
    public final Uri f16108c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f16106a = i10;
        this.f16107b = callback;
        this.f16108c = uri;
    }

    @Override
    public final void run() {
        switch (this.f16106a) {
            case 0:
                this.f16107b.run(this.f16108c);
                return;
            default:
                this.f16107b.run(this.f16108c);
                return;
        }
    }
}
