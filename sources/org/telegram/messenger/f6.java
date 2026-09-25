package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f16341a;
    public final Utilities.Callback f16342b;
    public final Uri f16343c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f16341a = i10;
        this.f16342b = callback;
        this.f16343c = uri;
    }

    @Override
    public final void run() {
        switch (this.f16341a) {
            case 0:
                this.f16342b.run(this.f16343c);
                return;
            default:
                this.f16342b.run(this.f16343c);
                return;
        }
    }
}
