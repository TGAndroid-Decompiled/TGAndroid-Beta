package org.telegram.messenger.video;

import org.telegram.ui.Components.b70;

public final class a implements Runnable {

    public final int f21824a;

    public final Object f21825b;

    public a(Object obj, int i10) {
        this.f21824a = i10;
        this.f21825b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21824a) {
            case 0:
                ((OldVideoPlayerRewinder) this.f21825b).lambda$incrementRewindCount$0();
                break;
            case 1:
                ((b70) this.f21825b).u();
                break;
            default:
                ((VideoFramesRewinder) this.f21825b).lambda$new$2();
                break;
        }
    }
}
