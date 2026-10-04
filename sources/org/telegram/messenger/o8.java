package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;
public final class o8 implements Runnable {
    public final int f18757a;
    public final Object f18758b;
    public final long f18759c;
    public final boolean d;
    public final Object f18760e;

    public o8(Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f18757a = i10;
        this.f18758b = obj;
        this.d = z10;
        this.f18759c = j3;
        this.f18760e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18757a) {
            case 0:
                ((MediaDataController) this.f18758b).lambda$loadFeaturedStickers$57((TLObject) this.f18760e, this.d, this.f18759c);
                return;
            case 1:
                ((MediaDataController) this.f18758b).lambda$processLoadedFeaturedStickers$60((ArrayList) this.f18760e, this.f18759c, this.d);
                return;
            case 2:
                ((MessagesController) this.f18758b).lambda$processUpdates$376(this.d, this.f18759c, (ArrayList) this.f18760e);
                return;
            case 3:
                ((MessagesController) this.f18758b).lambda$getChannelRecommendations$481((TLObject) this.f18760e, this.d, this.f18759c);
                return;
            case 4:
                boolean z10 = this.d;
                ((MessagesController) this.f18758b).lambda$processLoadedChannelAdmins$66(this.f18759c, (a0.i) this.f18760e, z10);
                return;
            case 5:
                ((MessagesStorage) this.f18758b).lambda$createTaskForMid$115(this.d, this.f18759c, (ArrayList) this.f18760e);
                return;
            case 6:
                ((MessagesStorage) this.f18758b).lambda$loadPendingTasks$24((org.telegram.ui.ActionBar.a6) this.f18760e, this.d, this.f18759c);
                return;
            case 7:
                ((VideoPlayerHolderBase) this.f18758b).lambda$seekTo$12(this.f18759c, this.d, (Runnable) this.f18760e);
                return;
            case 8:
                org.telegram.ui.a7.T((org.telegram.ui.a7) this.f18758b, this.d, this.f18759c, (org.telegram.ui.p6) this.f18760e);
                return;
            default:
                ((ProfileActivity) this.f18758b).getMessagesController().getStoriesController().o0(this.f18759c, (ArrayList) this.f18760e, this.d, null);
                return;
        }
    }

    public o8(BaseController baseController, Object obj, boolean z10, long j3, int i10) {
        this.f18757a = i10;
        this.f18758b = baseController;
        this.f18760e = obj;
        this.d = z10;
        this.f18759c = j3;
    }

    public o8(MediaDataController mediaDataController, ArrayList arrayList, long j3, boolean z10) {
        this.f18757a = 1;
        this.f18758b = mediaDataController;
        this.f18760e = arrayList;
        this.f18759c = j3;
        this.d = z10;
    }

    public o8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Cloneable cloneable, boolean z10, int i10) {
        this.f18757a = i10;
        this.f18758b = notificationCenterDelegate;
        this.f18759c = j3;
        this.f18760e = cloneable;
        this.d = z10;
    }

    public o8(VideoPlayerHolderBase videoPlayerHolderBase, long j3, boolean z10, Runnable runnable) {
        this.f18757a = 7;
        this.f18758b = videoPlayerHolderBase;
        this.f18759c = j3;
        this.d = z10;
        this.f18760e = runnable;
    }
}
