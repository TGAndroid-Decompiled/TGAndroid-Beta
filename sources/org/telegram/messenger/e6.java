package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f18238a;
    public final Utilities.Callback f18239b;
    public final Uri f18240c;

    public e6(Utilities.Callback callback, Uri uri, int i10) {
        this.f18238a = i10;
        this.f18239b = callback;
        this.f18240c = uri;
    }

    @Override
    public final void run() {
        switch (this.f18238a) {
            case 0:
                this.f18239b.run(this.f18240c);
                return;
            default:
                this.f18239b.run(this.f18240c);
                return;
        }
    }
}
