package org.telegram.messenger;

import android.net.Uri;

public final class MediaController$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final Utilities.Callback f$0;
    public final Uri f$1;

    public MediaController$$ExternalSyntheticLambda13(Utilities.Callback callback, Uri uri, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$1 = uri;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run(this.f$1);
                break;
            default:
                this.f$0.run(this.f$1);
                break;
        }
    }
}
