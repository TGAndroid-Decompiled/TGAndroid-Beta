package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f16837a;
    public final Utilities.Callback f16838b;
    public final Uri f16839c;

    public e6(Utilities.Callback callback, Uri uri, int i10) {
        this.f16837a = i10;
        this.f16838b = callback;
        this.f16839c = uri;
    }

    @Override
    public final void run() {
        switch (this.f16837a) {
            case 0:
                this.f16838b.run(this.f16839c);
                return;
            default:
                this.f16838b.run(this.f16839c);
                return;
        }
    }
}
