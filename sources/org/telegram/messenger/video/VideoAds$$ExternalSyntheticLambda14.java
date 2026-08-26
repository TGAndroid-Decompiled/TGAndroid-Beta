package org.telegram.messenger.video;

import org.telegram.ui.Components.ItemOptions;

public final class VideoAds$$ExternalSyntheticLambda14 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public VideoAds$$ExternalSyntheticLambda14(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ItemOptions) this.f$0).dismiss();
                break;
            case 1:
                ((OldVideoPlayerRewinder) this.f$0).lambda$incrementRewindCount$0();
                break;
            default:
                ((VideoFramesRewinder) this.f$0).lambda$new$2();
                break;
        }
    }
}
