package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class d6 implements Runnable {
    public final int f18205a;
    public final Utilities.Callback f18206b;
    public final Uri f18207c;

    public d6(Utilities.Callback callback, Uri uri, int i10) {
        this.f18205a = i10;
        this.f18206b = callback;
        this.f18207c = uri;
    }

    @Override
    public final void run() {
        switch (this.f18205a) {
            case 0:
                this.f18206b.run(this.f18207c);
                return;
            default:
                this.f18206b.run(this.f18207c);
                return;
        }
    }
}
