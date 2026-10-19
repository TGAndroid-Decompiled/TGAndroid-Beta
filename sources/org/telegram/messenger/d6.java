package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class d6 implements Runnable {
    public final int f18160a;
    public final Utilities.Callback f18161b;
    public final Uri f18162c;

    public d6(Utilities.Callback callback, Uri uri, int i10) {
        this.f18160a = i10;
        this.f18161b = callback;
        this.f18162c = uri;
    }

    @Override
    public final void run() {
        switch (this.f18160a) {
            case 0:
                this.f18161b.run(this.f18162c);
                return;
            default:
                this.f18161b.run(this.f18162c);
                return;
        }
    }
}
