package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f17620a;
    public final Utilities.Callback f17621b;
    public final Uri f17622c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17620a = i10;
        this.f17621b = callback;
        this.f17622c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17620a) {
            case 0:
                this.f17621b.run(this.f17622c);
                return;
            default:
                this.f17621b.run(this.f17622c);
                return;
        }
    }
}
